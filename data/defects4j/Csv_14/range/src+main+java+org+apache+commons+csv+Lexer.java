{
  "filepath": "/tmp/Csv-14b/src/main/java/org/apache/commons/csv/Lexer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Lexer",
      "is_interface": false,
      "parent_types": [
        "java.io.Closeable"
      ],
      "begin_line": 41,
      "end_line": 442,
      "comment": "\n * Lexical analyzer.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DISABLED"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n     * Constant char to use for disabling comments, escapes and encapsulation. The value -2 is used because it\n     * won\u0027t be confused with an EOF signal (-1), and because the Unicode value {@code FFFE} would be encoded as two\n     * chars (using surrogates) and thus there should never be a collision with a real text char.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "delimiter"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "escape"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "quoteChar"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "commentStart"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ignoreSurroundingSpaces"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ignoreEmptyLines"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reader"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " The input stream "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.Lexer.Lexer(org.apache.commons.csv.CSVFormat, org.apache.commons.csv.ExtendedBufferedReader)",
      "begin_line": 61,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 29)",
        "(line 63,col 9)-(line 63,col 47)",
        "(line 64,col 9)-(line 64,col 69)",
        "(line 65,col 9)-(line 65,col 71)",
        "(line 66,col 9)-(line 66,col 73)",
        "(line 67,col 9)-(line 67,col 75)",
        "(line 68,col 9)-(line 68,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.nextToken(org.apache.commons.csv.Token)",
      "begin_line": 83,
      "end_line": 165,
      "comment": "\n     * Returns the next token.\n     * \u003cp\u003e\n     * A token corresponds to a term, a record change or an end-of-file indicator.\n     * \u003c/p\u003e\n     *\n     * @param token\n     *            an existing Token object to reuse. The caller is responsible to initialize the Token.\n     * @return the next token found\n     * @throws java.io.IOException\n     *             on stream access error\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 44)",
        "(line 89,col 9)-(line 89,col 30)",
        "(line 94,col 9)-(line 94,col 39)",
        "(line 97,col 9)-(line 110,col 9)",
        "(line 113,col 9)-(line 117,col 9)",
        "(line 119,col 9)-(line 130,col 9)",
        "(line 133,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 164,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.parseSimpleToken(org.apache.commons.csv.Token, int)",
      "begin_line": 186,
      "end_line": 218,
      "comment": "\n     * Parses a simple token.\n     * \u003cp/\u003e\n     * Simple token are tokens which are not surrounded by encapsulators. A simple token might contain escaped\n     * delimiters (as \\, or \\;). The token is finished when one of the following conditions become true:\n     * \u003cul\u003e\n     * \u003cli\u003eend of line has been reached (EORECORD)\u003c/li\u003e\n     * \u003cli\u003eend of stream has been reached (EOF)\u003c/li\u003e\n     * \u003cli\u003ean unescaped delimiter has been reached (TOKEN)\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param token\n     *            the current token\n     * @param ch\n     *            the current character\n     * @return the filled token\n     * @throws IOException\n     *             on stream access error\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 211,col 9)",
        "(line 213,col 9)-(line 215,col 9)",
        "(line 217,col 9)-(line 217,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.parseEncapsulatedToken(org.apache.commons.csv.Token)",
      "begin_line": 240,
      "end_line": 289,
      "comment": "\n     * Parses an encapsulated token.\n     * \u003cp/\u003e\n     * Encapsulated tokens are surrounded by the given encapsulating-string. The encapsulator itself might be included\n     * in the token using a doubling syntax (as \"\", \u0027\u0027) or using escaping (as in \\\", \\\u0027). Whitespaces before and after\n     * an encapsulated token are ignored. The token is finished when one of the following conditions become true:\n     * \u003cul\u003e\n     * \u003cli\u003ean unescaped encapsulator has been reached, and is followed by optional whitespace then:\u003c/li\u003e\n     * \u003cul\u003e\n     * \u003cli\u003edelimiter (TOKEN)\u003c/li\u003e\n     * \u003cli\u003eend of line (EORECORD)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003cli\u003eend of stream has been reached (EOF)\u003c/li\u003e \u003c/ul\u003e\n     *\n     * @param token\n     *            the current token\n     * @return a valid token object\n     * @throws IOException\n     *             on invalid state: EOF before closing encapsulator or invalid character before delimiter or EOL\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 60)",
        "(line 243,col 9)-(line 243,col 14)",
        "(line 244,col 9)-(line 288,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.mapNullToDisabled(java.lang.Character)",
      "begin_line": 291,
      "end_line": 293,
      "comment": "",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.getCurrentLineNumber()",
      "begin_line": 300,
      "end_line": 302,
      "comment": "\n     * Returns the current line number\n     *\n     * @return the current line number\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.getCharacterPosition()",
      "begin_line": 309,
      "end_line": 311,
      "comment": "\n     * Returns the current character position\n     *\n     * @return the current character position\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.readEscape()",
      "begin_line": 325,
      "end_line": 355,
      "comment": "\n     * Handle an escape sequence.\n     * The current character must be the escape character.\n     * On return, the next character is available by calling {@link ExtendedBufferedReader#getLastChar()}\n     * on the input stream.\n     *\n     * @return the unescaped character (as an int) or {@link Constants#END_OF_STREAM} if char following the escape is\n     *      invalid.\n     * @throws IOException if there is a problem reading the stream or the end of stream is detected:\n     *      the escape character is not allowed at end of strem\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 37)",
        "(line 328,col 9)-(line 354,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.trimTrailingSpaces(java.lang.StringBuilder)",
      "begin_line": 357,
      "end_line": 365,
      "comment": "",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 37)",
        "(line 359,col 9)-(line 361,col 9)",
        "(line 362,col 9)-(line 364,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.readEndOfLine(int)",
      "begin_line": 372,
      "end_line": 379,
      "comment": "\n     * Greedily accepts \\n, \\r and \\r\\n This checker consumes silently the second control-character...\n     *\n     * @return true if the given or next character is a line-terminator\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 377,col 9)",
        "(line 378,col 9)-(line 378,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.isClosed()",
      "begin_line": 381,
      "end_line": 383,
      "comment": "",
      "child_ranges": [
        "(line 382,col 9)-(line 382,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.isWhitespace(int)",
      "begin_line": 388,
      "end_line": 390,
      "comment": "\n     * @return true if the given char is a whitespace character\n     ",
      "child_ranges": [
        "(line 389,col 9)-(line 389,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.isStartOfLine(int)",
      "begin_line": 398,
      "end_line": 400,
      "comment": "\n     * Checks if the current character represents the start of a line: a CR, LF or is at the start of the file.\n     *\n     * @param ch the character to check\n     * @return true if the character is at the start of a line.\n     ",
      "child_ranges": [
        "(line 399,col 9)-(line 399,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.isEndOfFile(int)",
      "begin_line": 405,
      "end_line": 407,
      "comment": "\n     * @return true if the given character indicates end of file\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.isDelimiter(int)",
      "begin_line": 409,
      "end_line": 411,
      "comment": "",
      "child_ranges": [
        "(line 410,col 9)-(line 410,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.isEscape(int)",
      "begin_line": 413,
      "end_line": 415,
      "comment": "",
      "child_ranges": [
        "(line 414,col 9)-(line 414,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.isQuoteChar(int)",
      "begin_line": 417,
      "end_line": 419,
      "comment": "",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.isCommentStart(int)",
      "begin_line": 421,
      "end_line": 423,
      "comment": "",
      "child_ranges": [
        "(line 422,col 9)-(line 422,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.isMetaChar(int)",
      "begin_line": 425,
      "end_line": 430,
      "comment": "",
      "child_ranges": [
        "(line 426,col 9)-(line 429,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.close()",
      "begin_line": 438,
      "end_line": 441,
      "comment": "\n     * Closes resources.\n     *\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 440,col 9)-(line 440,col 23)"
      ]
    }
  ]
}