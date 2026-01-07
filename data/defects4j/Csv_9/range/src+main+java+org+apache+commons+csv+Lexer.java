{
  "filepath": "/tmp/Csv-9b/src/main/java/org/apache/commons/csv/Lexer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Lexer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 40,
      "end_line": 431,
      "comment": "\n *\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DISABLED"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n     * Constant char to use for disabling comments, escapes and encapsulation. The value -2 is used because it\n     * won\u0027t be confused with an EOF signal (-1), and because the Unicode value {@code FFFE} would be encoded as two\n     * chars (using surrogates) and thus there should never be a collision with a real text char.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "delimiter"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "escape"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "quoteChar"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "commentStart"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ignoreSurroundingSpaces"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ignoreEmptyLines"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reader"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " The input stream "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.Lexer.Lexer(org.apache.commons.csv.CSVFormat, org.apache.commons.csv.ExtendedBufferedReader)",
      "begin_line": 61,
      "end_line": 69,
      "comment": " INTERNAL API. but ctor needs to be called dynamically by PerformanceTest class ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 29)",
        "(line 63,col 9)-(line 63,col 47)",
        "(line 64,col 9)-(line 64,col 60)",
        "(line 65,col 9)-(line 65,col 66)",
        "(line 66,col 9)-(line 66,col 72)",
        "(line 67,col 9)-(line 67,col 75)",
        "(line 68,col 9)-(line 68,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.nextToken(org.apache.commons.csv.Token)",
      "begin_line": 82,
      "end_line": 164,
      "comment": "\n     * Returns the next token.\n     * \u003cp/\u003e\n     * A token corresponds to a term, a record change or an end-of-file indicator.\n     *\n     * @param token\n     *            an existing Token object to reuse. The caller is responsible to initialize the Token.\n     * @return the next token found\n     * @throws java.io.IOException\n     *             on stream access error\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 44)",
        "(line 88,col 9)-(line 88,col 30)",
        "(line 93,col 9)-(line 93,col 39)",
        "(line 96,col 9)-(line 109,col 9)",
        "(line 112,col 9)-(line 116,col 9)",
        "(line 118,col 9)-(line 129,col 9)",
        "(line 132,col 9)-(line 162,col 9)",
        "(line 163,col 9)-(line 163,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.parseSimpleToken(org.apache.commons.csv.Token, int)",
      "begin_line": 185,
      "end_line": 217,
      "comment": "\n     * Parses a simple token.\n     * \u003cp/\u003e\n     * Simple token are tokens which are not surrounded by encapsulators. A simple token might contain escaped\n     * delimiters (as \\, or \\;). The token is finished when one of the following conditions become true:\n     * \u003cul\u003e\n     * \u003cli\u003eend of line has been reached (EORECORD)\u003c/li\u003e\n     * \u003cli\u003eend of stream has been reached (EOF)\u003c/li\u003e\n     * \u003cli\u003ean unescaped delimiter has been reached (TOKEN)\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param token\n     *            the current token\n     * @param ch\n     *            the current character\n     * @return the filled token\n     * @throws IOException\n     *             on stream access error\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 210,col 9)",
        "(line 212,col 9)-(line 214,col 9)",
        "(line 216,col 9)-(line 216,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.parseEncapsulatedToken(org.apache.commons.csv.Token)",
      "begin_line": 239,
      "end_line": 288,
      "comment": "\n     * Parses an encapsulated token.\n     * \u003cp/\u003e\n     * Encapsulated tokens are surrounded by the given encapsulating-string. The encapsulator itself might be included\n     * in the token using a doubling syntax (as \"\", \u0027\u0027) or using escaping (as in \\\", \\\u0027). Whitespaces before and after\n     * an encapsulated token are ignored. The token is finished when one of the following conditions become true:\n     * \u003cul\u003e\n     * \u003cli\u003ean unescaped encapsulator has been reached, and is followed by optional whitespace then:\u003c/li\u003e\n     * \u003cul\u003e\n     * \u003cli\u003edelimiter (TOKEN)\u003c/li\u003e\n     * \u003cli\u003eend of line (EORECORD)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003cli\u003eend of stream has been reached (EOF)\u003c/li\u003e \u003c/ul\u003e\n     *\n     * @param token\n     *            the current token\n     * @return a valid token object\n     * @throws IOException\n     *             on invalid state: EOF before closing encapsulator or invalid character before delimiter or EOL\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 60)",
        "(line 242,col 9)-(line 242,col 14)",
        "(line 243,col 9)-(line 287,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.mapNullToDisabled(java.lang.Character)",
      "begin_line": 290,
      "end_line": 292,
      "comment": "",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.getCurrentLineNumber()",
      "begin_line": 299,
      "end_line": 301,
      "comment": "\n     * Returns the current line number\n     *\n     * @return the current line number\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.readEscape()",
      "begin_line": 315,
      "end_line": 345,
      "comment": "\n     * Handle an escape sequence.\n     * The current character must be the escape character.\n     * On return, the next character is available by calling {@link ExtendedBufferedReader#getLastChar()}\n     * on the input stream.\n     *\n     * @return the unescaped character (as an int) or {@link Constants#END_OF_STREAM} if char following the escape is\n     *      invalid.\n     * @throws IOException if there is a problem reading the stream or the end of stream is detected:\n     *      the escape character is not allowed at end of strem\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 37)",
        "(line 318,col 9)-(line 344,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.trimTrailingSpaces(java.lang.StringBuilder)",
      "begin_line": 347,
      "end_line": 355,
      "comment": "",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 37)",
        "(line 349,col 9)-(line 351,col 9)",
        "(line 352,col 9)-(line 354,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.readEndOfLine(int)",
      "begin_line": 362,
      "end_line": 369,
      "comment": "\n     * Greedily accepts \\n, \\r and \\r\\n This checker consumes silently the second control-character...\n     *\n     * @return true if the given or next character is a line-terminator\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 367,col 9)",
        "(line 368,col 9)-(line 368,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.isClosed()",
      "begin_line": 371,
      "end_line": 373,
      "comment": "",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.isWhitespace(int)",
      "begin_line": 378,
      "end_line": 380,
      "comment": "\n     * @return true if the given char is a whitespace character\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 379,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.isStartOfLine(int)",
      "begin_line": 388,
      "end_line": 390,
      "comment": "\n     * Checks if the current character represents the start of a line: a CR, LF or is at the start of the file.\n     *\n     * @param ch the character to check\n     * @return true if the character is at the start of a line.\n     ",
      "child_ranges": [
        "(line 389,col 9)-(line 389,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.isEndOfFile(int)",
      "begin_line": 395,
      "end_line": 397,
      "comment": "\n     * @return true if the given character indicates end of file\n     ",
      "child_ranges": [
        "(line 396,col 9)-(line 396,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.isDelimiter(int)",
      "begin_line": 399,
      "end_line": 401,
      "comment": "",
      "child_ranges": [
        "(line 400,col 9)-(line 400,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.isEscape(int)",
      "begin_line": 403,
      "end_line": 405,
      "comment": "",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.isQuoteChar(int)",
      "begin_line": 407,
      "end_line": 409,
      "comment": "",
      "child_ranges": [
        "(line 408,col 9)-(line 408,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.isCommentStart(int)",
      "begin_line": 411,
      "end_line": 413,
      "comment": "",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.isMetaChar(int)",
      "begin_line": 415,
      "end_line": 420,
      "comment": "",
      "child_ranges": [
        "(line 416,col 9)-(line 419,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.close()",
      "begin_line": 428,
      "end_line": 430,
      "comment": "\n     * Closes resources.\n     *\n     * @throws IOException\n     *             If an I/O error occurs\n     ",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 23)"
      ]
    }
  ]
}