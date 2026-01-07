{
  "filepath": "/tmp/Csv-16b/src/main/java/org/apache/commons/csv/Lexer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Lexer",
      "is_interface": false,
      "parent_types": [
        "java.io.Closeable"
      ],
      "begin_line": 39,
      "end_line": 461,
      "comment": "\n * Lexical analyzer.\n "
    },
    {
      "type": "field",
      "varNames": [
        "CR_STRING"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LF_STRING"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DISABLED"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * Constant char to use for disabling comments, escapes and encapsulation. The value -2 is used because it\n     * won\u0027t be confused with an EOF signal (-1), and because the Unicode value {@code FFFE} would be encoded as two\n     * chars (using surrogates) and thus there should never be a collision with a real text char.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "delimiter"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "escape"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "quoteChar"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "commentStart"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ignoreSurroundingSpaces"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ignoreEmptyLines"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reader"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " The input stream "
    },
    {
      "type": "field",
      "varNames": [
        "firstEol"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.getFirstEol()",
      "begin_line": 63,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.Lexer.Lexer(org.apache.commons.csv.CSVFormat, org.apache.commons.csv.ExtendedBufferedReader)",
      "begin_line": 67,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 29)",
        "(line 69,col 9)-(line 69,col 47)",
        "(line 70,col 9)-(line 70,col 69)",
        "(line 71,col 9)-(line 71,col 71)",
        "(line 72,col 9)-(line 72,col 73)",
        "(line 73,col 9)-(line 73,col 75)",
        "(line 74,col 9)-(line 74,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.nextToken(org.apache.commons.csv.Token)",
      "begin_line": 89,
      "end_line": 171,
      "comment": "\n     * Returns the next token.\n     * \u003cp\u003e\n     * A token corresponds to a term, a record change or an end-of-file indicator.\n     * \u003c/p\u003e\n     *\n     * @param token\n     *            an existing Token object to reuse. The caller is responsible to initialize the Token.\n     * @return the next token found\n     * @throws java.io.IOException\n     *             on stream access error\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 44)",
        "(line 95,col 9)-(line 95,col 30)",
        "(line 100,col 9)-(line 100,col 39)",
        "(line 103,col 9)-(line 116,col 9)",
        "(line 119,col 9)-(line 123,col 9)",
        "(line 125,col 9)-(line 136,col 9)",
        "(line 139,col 9)-(line 169,col 9)",
        "(line 170,col 9)-(line 170,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.parseSimpleToken(org.apache.commons.csv.Token, int)",
      "begin_line": 192,
      "end_line": 224,
      "comment": "\n     * Parses a simple token.\n     * \u003cp/\u003e\n     * Simple token are tokens which are not surrounded by encapsulators. A simple token might contain escaped\n     * delimiters (as \\, or \\;). The token is finished when one of the following conditions become true:\n     * \u003cul\u003e\n     * \u003cli\u003eend of line has been reached (EORECORD)\u003c/li\u003e\n     * \u003cli\u003eend of stream has been reached (EOF)\u003c/li\u003e\n     * \u003cli\u003ean unescaped delimiter has been reached (TOKEN)\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param token\n     *            the current token\n     * @param ch\n     *            the current character\n     * @return the filled token\n     * @throws IOException\n     *             on stream access error\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 217,col 9)",
        "(line 219,col 9)-(line 221,col 9)",
        "(line 223,col 9)-(line 223,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.parseEncapsulatedToken(org.apache.commons.csv.Token)",
      "begin_line": 246,
      "end_line": 295,
      "comment": "\n     * Parses an encapsulated token.\n     * \u003cp/\u003e\n     * Encapsulated tokens are surrounded by the given encapsulating-string. The encapsulator itself might be included\n     * in the token using a doubling syntax (as \"\", \u0027\u0027) or using escaping (as in \\\", \\\u0027). Whitespaces before and after\n     * an encapsulated token are ignored. The token is finished when one of the following conditions become true:\n     * \u003cul\u003e\n     * \u003cli\u003ean unescaped encapsulator has been reached, and is followed by optional whitespace then:\u003c/li\u003e\n     * \u003cul\u003e\n     * \u003cli\u003edelimiter (TOKEN)\u003c/li\u003e\n     * \u003cli\u003eend of line (EORECORD)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003cli\u003eend of stream has been reached (EOF)\u003c/li\u003e \u003c/ul\u003e\n     *\n     * @param token\n     *            the current token\n     * @return a valid token object\n     * @throws IOException\n     *             on invalid state: EOF before closing encapsulator or invalid character before delimiter or EOL\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 60)",
        "(line 249,col 9)-(line 249,col 14)",
        "(line 250,col 9)-(line 294,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.mapNullToDisabled(java.lang.Character)",
      "begin_line": 297,
      "end_line": 299,
      "comment": "",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.getCurrentLineNumber()",
      "begin_line": 306,
      "end_line": 308,
      "comment": "\n     * Returns the current line number\n     *\n     * @return the current line number\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.getCharacterPosition()",
      "begin_line": 315,
      "end_line": 317,
      "comment": "\n     * Returns the current character position\n     *\n     * @return the current character position\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.readEscape()",
      "begin_line": 331,
      "end_line": 361,
      "comment": "\n     * Handle an escape sequence.\n     * The current character must be the escape character.\n     * On return, the next character is available by calling {@link ExtendedBufferedReader#getLastChar()}\n     * on the input stream.\n     *\n     * @return the unescaped character (as an int) or {@link Constants#END_OF_STREAM} if char following the escape is\n     *      invalid.\n     * @throws IOException if there is a problem reading the stream or the end of stream is detected:\n     *      the escape character is not allowed at end of stream\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 37)",
        "(line 334,col 9)-(line 360,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.trimTrailingSpaces(java.lang.StringBuilder)",
      "begin_line": 363,
      "end_line": 371,
      "comment": "",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 37)",
        "(line 365,col 9)-(line 367,col 9)",
        "(line 368,col 9)-(line 370,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.readEndOfLine(int)",
      "begin_line": 378,
      "end_line": 398,
      "comment": "\n     * Greedily accepts \\n, \\r and \\r\\n This checker consumes silently the second control-character...\n     *\n     * @return true if the given or next character is a line-terminator\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 387,col 9)",
        "(line 389,col 9)-(line 395,col 9)",
        "(line 397,col 9)-(line 397,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.isClosed()",
      "begin_line": 400,
      "end_line": 402,
      "comment": "",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.isWhitespace(int)",
      "begin_line": 407,
      "end_line": 409,
      "comment": "\n     * @return true if the given char is a whitespace character\n     ",
      "child_ranges": [
        "(line 408,col 9)-(line 408,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.isStartOfLine(int)",
      "begin_line": 417,
      "end_line": 419,
      "comment": "\n     * Checks if the current character represents the start of a line: a CR, LF or is at the start of the file.\n     *\n     * @param ch the character to check\n     * @return true if the character is at the start of a line.\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.isEndOfFile(int)",
      "begin_line": 424,
      "end_line": 426,
      "comment": "\n     * @return true if the given character indicates end of file\n     ",
      "child_ranges": [
        "(line 425,col 9)-(line 425,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.isDelimiter(int)",
      "begin_line": 428,
      "end_line": 430,
      "comment": "",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.isEscape(int)",
      "begin_line": 432,
      "end_line": 434,
      "comment": "",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.isQuoteChar(int)",
      "begin_line": 436,
      "end_line": 438,
      "comment": "",
      "child_ranges": [
        "(line 437,col 9)-(line 437,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.isCommentStart(int)",
      "begin_line": 440,
      "end_line": 442,
      "comment": "",
      "child_ranges": [
        "(line 441,col 9)-(line 441,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.isMetaChar(int)",
      "begin_line": 444,
      "end_line": 449,
      "comment": "",
      "child_ranges": [
        "(line 445,col 9)-(line 448,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.close()",
      "begin_line": 457,
      "end_line": 460,
      "comment": "\n     * Closes resources.\n     *\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 459,col 9)-(line 459,col 23)"
      ]
    }
  ]
}