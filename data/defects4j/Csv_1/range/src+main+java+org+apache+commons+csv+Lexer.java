{
  "filepath": "/tmp/Csv-1b/src/main/java/org/apache/commons/csv/Lexer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Lexer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 26,
      "end_line": 138,
      "comment": "\n * Abstract lexer class; contains common utility routines shared by lexers\n "
    },
    {
      "type": "field",
      "varNames": [
        "isEncapsulating"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isEscaping"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isCommentEnabled"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "delimiter"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "escape"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "encapsulator"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "commmentStart"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "surroundingSpacesIgnored"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "emptyLinesIgnored"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "format"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " The input stream "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.Lexer.Lexer(org.apache.commons.csv.CSVFormat, org.apache.commons.csv.ExtendedBufferedReader)",
      "begin_line": 45,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 29)",
        "(line 47,col 9)-(line 47,col 21)",
        "(line 48,col 9)-(line 48,col 56)",
        "(line 49,col 9)-(line 49,col 46)",
        "(line 50,col 9)-(line 50,col 61)",
        "(line 51,col 9)-(line 51,col 47)",
        "(line 52,col 9)-(line 52,col 41)",
        "(line 53,col 9)-(line 53,col 53)",
        "(line 54,col 9)-(line 54,col 54)",
        "(line 55,col 9)-(line 55,col 76)",
        "(line 56,col 9)-(line 56,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.getLineNumber()",
      "begin_line": 59,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.readEscape(int)",
      "begin_line": 63,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 22)",
        "(line 66,col 9)-(line 79,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.trimTrailingSpaces(java.lang.StringBuilder)",
      "begin_line": 82,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 37)",
        "(line 84,col 9)-(line 86,col 9)",
        "(line 87,col 9)-(line 89,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.isWhitespace(int)",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\n     * @return true if the given char is a whitespace character\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.isEndOfLine(int)",
      "begin_line": 105,
      "end_line": 112,
      "comment": "\n     * Greedy - accepts \\n, \\r and \\r\\n\n     * This checker consumes silently the second control-character...\n     *\n     * @return true if the given character is a line-terminator\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 111,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.isEndOfFile(int)",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\n     * @return true if the given character indicates end of file\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.nextToken(org.apache.commons.csv.Token)",
      "begin_line": 121,
      "end_line": 121,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.isDelimiter(int)",
      "begin_line": 123,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.isEscape(int)",
      "begin_line": 127,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.isEncapsulator(int)",
      "begin_line": 131,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Lexer.isCommentStart(int)",
      "begin_line": 135,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 54)"
      ]
    }
  ]
}