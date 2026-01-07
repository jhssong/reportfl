{
  "filepath": "/tmp/Csv-3b/src/main/java/org/apache/commons/csv/Lexer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Lexer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 35,
      "end_line": 181,
      "comment": "\n * Abstract lexer class; contains common utility routines shared by lexers\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DISABLED"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * Constant char to use for disabling comments, escapes and encapsulation. The value -2 is used because it\n     * won\u0027t be confused with an EOF signal (-1), and because the Unicode value {@code FFFE} would be encoded as two\n     * chars (using surrogates) and thus there should never be a collision with a real text char.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "delimiter"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "escape"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "quoteChar"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "commmentStart"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ignoreSurroundingSpaces"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ignoreEmptyLines"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "format"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " The input stream "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.Lexer.Lexer(org.apache.commons.csv.CSVFormat, org.apache.commons.csv.ExtendedBufferedReader)",
      "begin_line": 57,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 29)",
        "(line 59,col 9)-(line 59,col 21)",
        "(line 60,col 9)-(line 60,col 47)",
        "(line 61,col 9)-(line 61,col 60)",
        "(line 62,col 9)-(line 62,col 66)",
        "(line 63,col 9)-(line 63,col 73)",
        "(line 64,col 9)-(line 64,col 75)",
        "(line 65,col 9)-(line 65,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.mapNullToDisabled(java.lang.Character)",
      "begin_line": 68,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.getLineNumber()",
      "begin_line": 72,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.readEscape()",
      "begin_line": 87,
      "end_line": 114,
      "comment": "\n     * Handle an escape sequence.\n     * The current character must be the escape character.\n     * On return, the next character is available by calling {@link ExtendedBufferedReader#getLastChar()}\n     * on the input stream.\n     * \n     * @return the unescaped character (as an int) or {@link END_OF_STREAM} if char following the escape is invalid. \n     * @throws IOException if there is a problem reading the stream or the end of stream is detected: \n     * the escape character is not allowed at end of strem\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 32)",
        "(line 90,col 9)-(line 113,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.trimTrailingSpaces(java.lang.StringBuilder)",
      "begin_line": 116,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 37)",
        "(line 118,col 9)-(line 120,col 9)",
        "(line 121,col 9)-(line 123,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.readEndOfLine(int)",
      "begin_line": 131,
      "end_line": 138,
      "comment": "\n     * Greedily accepts \\n, \\r and \\r\\n This checker consumes silently the second control-character...\n     *\n     * @return true if the given or next character is a line-terminator\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 137,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.nextToken(org.apache.commons.csv.Token)",
      "begin_line": 140,
      "end_line": 140,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.isWhitespace(int)",
      "begin_line": 145,
      "end_line": 147,
      "comment": "\n     * @return true if the given char is a whitespace character\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.isStartOfLine(int)",
      "begin_line": 155,
      "end_line": 157,
      "comment": "\n     * Checks if the current character represents the start of a line: a CR, LF or is at the start of the file.\n     *\n     * @param c the character to check\n     * @return true if the character is at the start of a line.\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.isEndOfFile(int)",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\n     * @return true if the given character indicates end of file\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.isDelimiter(int)",
      "begin_line": 166,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.isEscape(int)",
      "begin_line": 170,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.isQuoteChar(int)",
      "begin_line": 174,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.isCommentStart(int)",
      "begin_line": 178,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 34)"
      ]
    }
  ]
}