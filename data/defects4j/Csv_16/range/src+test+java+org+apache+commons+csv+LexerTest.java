{
  "filepath": "/tmp/Csv-16b/src/test/java/org/apache/commons/csv/LexerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LexerTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 44,
      "end_line": 390,
      "comment": "\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "formatWithEscaping"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.LexerTest.setUp()",
      "begin_line": 48,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.LexerTest.createLexer(java.lang.String, org.apache.commons.csv.CSVFormat)",
      "begin_line": 53,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.LexerTest.testSurroundingSpacesAreDeleted()",
      "begin_line": 57,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 99)",
        "(line 60,col 9)-(line 68,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.LexerTest.testSurroundingTabsAreDeleted()",
      "begin_line": 71,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 91)",
        "(line 74,col 9)-(line 82,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.LexerTest.testIgnoreEmptyLines()",
      "begin_line": 85,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 87,col 9)-(line 88,col 60)",
        "(line 89,col 9)-(line 89,col 74)",
        "(line 90,col 9)-(line 101,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.LexerTest.testComments()",
      "begin_line": 104,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 107,col 93)",
        "(line 108,col 9)-(line 108,col 74)",
        "(line 109,col 9)-(line 124,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.LexerTest.testCommentsAndEmptyLines()",
      "begin_line": 127,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 129,col 9)-(line 142,col 36)",
        "(line 143,col 9)-(line 143,col 102)",
        "(line 144,col 9)-(line 144,col 83)",
        "(line 146,col 9)-(line 170,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.LexerTest.testBackslashWithoutEscaping()",
      "begin_line": 174,
      "end_line": 193,
      "comment": " simple token with escaping not enabled",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 46)",
        "(line 180,col 9)-(line 180,col 51)",
        "(line 181,col 9)-(line 181,col 51)",
        "(line 182,col 9)-(line 192,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.LexerTest.testBackslashWithEscaping()",
      "begin_line": 196,
      "end_line": 213,
      "comment": " simple token with escaping enabled",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 62)",
        "(line 202,col 9)-(line 202,col 80)",
        "(line 203,col 9)-(line 203,col 50)",
        "(line 204,col 9)-(line 212,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.LexerTest.testNextToken4()",
      "begin_line": 216,
      "end_line": 237,
      "comment": " encapsulator tokenizer (single line)",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 94)",
        "(line 222,col 9)-(line 236,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.LexerTest.testNextToken5()",
      "begin_line": 240,
      "end_line": 250,
      "comment": " encapsulator tokenizer (multi line, delimiter in string)",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 78)",
        "(line 243,col 9)-(line 249,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.LexerTest.testNextToken6()",
      "begin_line": 253,
      "end_line": 264,
      "comment": " change delimiters, comment, encapsulater",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 68)",
        "(line 259,col 9)-(line 259,col 109)",
        "(line 260,col 9)-(line 263,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.LexerTest.testDelimiterIsWhitespace()",
      "begin_line": 267,
      "end_line": 278,
      "comment": " From CSV-1",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 61)",
        "(line 270,col 9)-(line 277,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.LexerTest.testEscapedCR()",
      "begin_line": 280,
      "end_line": 285,
      "comment": "",
      "child_ranges": [
        "(line 282,col 9)-(line 284,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.LexerTest.testCR()",
      "begin_line": 287,
      "end_line": 293,
      "comment": "",
      "child_ranges": [
        "(line 289,col 9)-(line 292,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.LexerTest.testEscapedLF()",
      "begin_line": 295,
      "end_line": 300,
      "comment": "",
      "child_ranges": [
        "(line 297,col 9)-(line 299,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.LexerTest.testLF()",
      "begin_line": 302,
      "end_line": 308,
      "comment": "",
      "child_ranges": [
        "(line 304,col 9)-(line 307,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.LexerTest.testEscapedTab()",
      "begin_line": 310,
      "end_line": 316,
      "comment": "",
      "child_ranges": [
        "(line 312,col 9)-(line 314,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.LexerTest.testTab()",
      "begin_line": 318,
      "end_line": 323,
      "comment": "",
      "child_ranges": [
        "(line 320,col 9)-(line 322,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.LexerTest.testEscapedBackspace()",
      "begin_line": 325,
      "end_line": 330,
      "comment": "",
      "child_ranges": [
        "(line 327,col 9)-(line 329,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.LexerTest.testBackspace()",
      "begin_line": 332,
      "end_line": 337,
      "comment": "",
      "child_ranges": [
        "(line 334,col 9)-(line 336,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.LexerTest.testEscapedFF()",
      "begin_line": 339,
      "end_line": 344,
      "comment": "",
      "child_ranges": [
        "(line 341,col 9)-(line 343,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.LexerTest.testFF()",
      "begin_line": 346,
      "end_line": 351,
      "comment": "",
      "child_ranges": [
        "(line 348,col 9)-(line 350,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.LexerTest.testEscapedMySqlNullValue()",
      "begin_line": 353,
      "end_line": 359,
      "comment": "",
      "child_ranges": [
        "(line 356,col 9)-(line 358,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.LexerTest.testEscapedCharacter()",
      "begin_line": 361,
      "end_line": 366,
      "comment": "",
      "child_ranges": [
        "(line 363,col 9)-(line 365,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.LexerTest.testEscapedControlCharacter()",
      "begin_line": 368,
      "end_line": 374,
      "comment": "",
      "child_ranges": [
        "(line 371,col 9)-(line 373,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.LexerTest.testEscapedControlCharacter2()",
      "begin_line": 376,
      "end_line": 381,
      "comment": "",
      "child_ranges": [
        "(line 378,col 9)-(line 380,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.LexerTest.testEscapingAtEOF()",
      "begin_line": 383,
      "end_line": 389,
      "comment": "",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 56)",
        "(line 386,col 9)-(line 388,col 9)"
      ]
    }
  ]
}