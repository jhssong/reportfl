{
  "filepath": "/tmp/Csv-14b/src/test/java/org/apache/commons/csv/LexerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LexerTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 46,
      "end_line": 392,
      "comment": "\n *\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "formatWithEscaping"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.LexerTest.setUp()",
      "begin_line": 50,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.LexerTest.createLexer(java.lang.String, org.apache.commons.csv.CSVFormat)",
      "begin_line": 55,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.LexerTest.testSurroundingSpacesAreDeleted()",
      "begin_line": 59,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 99)",
        "(line 62,col 9)-(line 70,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.LexerTest.testSurroundingTabsAreDeleted()",
      "begin_line": 73,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 91)",
        "(line 76,col 9)-(line 84,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.LexerTest.testIgnoreEmptyLines()",
      "begin_line": 87,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 90,col 60)",
        "(line 91,col 9)-(line 91,col 74)",
        "(line 92,col 9)-(line 103,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.LexerTest.testComments()",
      "begin_line": 106,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 108,col 9)-(line 109,col 93)",
        "(line 110,col 9)-(line 110,col 74)",
        "(line 111,col 9)-(line 126,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.LexerTest.testCommentsAndEmptyLines()",
      "begin_line": 129,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 131,col 9)-(line 144,col 36)",
        "(line 145,col 9)-(line 145,col 102)",
        "(line 146,col 9)-(line 146,col 83)",
        "(line 148,col 9)-(line 172,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.LexerTest.testBackslashWithoutEscaping()",
      "begin_line": 176,
      "end_line": 195,
      "comment": " simple token with escaping not enabled",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 46)",
        "(line 182,col 9)-(line 182,col 51)",
        "(line 183,col 9)-(line 183,col 51)",
        "(line 184,col 9)-(line 194,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.LexerTest.testBackslashWithEscaping()",
      "begin_line": 198,
      "end_line": 215,
      "comment": " simple token with escaping enabled",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 62)",
        "(line 204,col 9)-(line 204,col 80)",
        "(line 205,col 9)-(line 205,col 50)",
        "(line 206,col 9)-(line 214,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.LexerTest.testNextToken4()",
      "begin_line": 218,
      "end_line": 239,
      "comment": " encapsulator tokenizer (single line)",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 94)",
        "(line 224,col 9)-(line 238,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.LexerTest.testNextToken5()",
      "begin_line": 242,
      "end_line": 252,
      "comment": " encapsulator tokenizer (multi line, delimiter in string)",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 78)",
        "(line 245,col 9)-(line 251,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.LexerTest.testNextToken6()",
      "begin_line": 255,
      "end_line": 266,
      "comment": " change delimiters, comment, encapsulater",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 68)",
        "(line 261,col 9)-(line 261,col 109)",
        "(line 262,col 9)-(line 265,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.LexerTest.testDelimiterIsWhitespace()",
      "begin_line": 269,
      "end_line": 280,
      "comment": " From CSV-1",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 61)",
        "(line 272,col 9)-(line 279,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.LexerTest.testEscapedCR()",
      "begin_line": 282,
      "end_line": 287,
      "comment": "",
      "child_ranges": [
        "(line 284,col 9)-(line 286,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.LexerTest.testCR()",
      "begin_line": 289,
      "end_line": 295,
      "comment": "",
      "child_ranges": [
        "(line 291,col 9)-(line 294,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.LexerTest.testEscapedLF()",
      "begin_line": 297,
      "end_line": 302,
      "comment": "",
      "child_ranges": [
        "(line 299,col 9)-(line 301,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.LexerTest.testLF()",
      "begin_line": 304,
      "end_line": 310,
      "comment": "",
      "child_ranges": [
        "(line 306,col 9)-(line 309,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.LexerTest.testEscapedTab()",
      "begin_line": 312,
      "end_line": 318,
      "comment": "",
      "child_ranges": [
        "(line 314,col 9)-(line 316,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.LexerTest.testTab()",
      "begin_line": 320,
      "end_line": 325,
      "comment": "",
      "child_ranges": [
        "(line 322,col 9)-(line 324,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.LexerTest.testEscapedBackspace()",
      "begin_line": 327,
      "end_line": 332,
      "comment": "",
      "child_ranges": [
        "(line 329,col 9)-(line 331,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.LexerTest.testBackspace()",
      "begin_line": 334,
      "end_line": 339,
      "comment": "",
      "child_ranges": [
        "(line 336,col 9)-(line 338,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.LexerTest.testEscapedFF()",
      "begin_line": 341,
      "end_line": 346,
      "comment": "",
      "child_ranges": [
        "(line 343,col 9)-(line 345,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.LexerTest.testFF()",
      "begin_line": 348,
      "end_line": 353,
      "comment": "",
      "child_ranges": [
        "(line 350,col 9)-(line 352,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.LexerTest.testEscapedMySqlNullValue()",
      "begin_line": 355,
      "end_line": 361,
      "comment": "",
      "child_ranges": [
        "(line 358,col 9)-(line 360,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.LexerTest.testEscapedCharacter()",
      "begin_line": 363,
      "end_line": 368,
      "comment": "",
      "child_ranges": [
        "(line 365,col 9)-(line 367,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.LexerTest.testEscapedControlCharacter()",
      "begin_line": 370,
      "end_line": 376,
      "comment": "",
      "child_ranges": [
        "(line 373,col 9)-(line 375,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.LexerTest.testEscapedControlCharacter2()",
      "begin_line": 378,
      "end_line": 383,
      "comment": "",
      "child_ranges": [
        "(line 380,col 9)-(line 382,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.LexerTest.testEscapingAtEOF()",
      "begin_line": 385,
      "end_line": 391,
      "comment": "",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 56)",
        "(line 388,col 9)-(line 390,col 9)"
      ]
    }
  ]
}