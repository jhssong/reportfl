{
  "filepath": "/tmp/Csv-1b/src/test/java/org/apache/commons/csv/CSVParserTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CSVParserTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 42,
      "end_line": 517,
      "comment": "\n * CSVParserTest\n *\n * The test are organized in three different sections:\n * The \u0027setter/getter\u0027 section, the lexer section and finally the parser\n * section. In case a test fails, you should follow a top-down approach for\n * fixing a potential bug (its likely that the parser itself fails if the lexer\n * has problems...).\n "
    },
    {
      "type": "field",
      "varNames": [
        "code"
      ],
      "begin_line": 44,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "res"
      ],
      "begin_line": 49,
      "end_line": 54,
      "comment": " changed to use standard CSV escaping"
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetLine()",
      "begin_line": 56,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 119)",
        "(line 59,col 9)-(line 61,col 9)",
        "(line 63,col 9)-(line 63,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetRecords()",
      "begin_line": 66,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 119)",
        "(line 69,col 9)-(line 69,col 54)",
        "(line 70,col 9)-(line 70,col 49)",
        "(line 71,col 9)-(line 71,col 39)",
        "(line 72,col 9)-(line 74,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testExcelFormat1()",
      "begin_line": 77,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 79,col 9)-(line 81,col 92)",
        "(line 82,col 9)-(line 88,col 10)",
        "(line 89,col 9)-(line 89,col 64)",
        "(line 90,col 9)-(line 90,col 54)",
        "(line 91,col 9)-(line 91,col 49)",
        "(line 92,col 9)-(line 92,col 39)",
        "(line 93,col 9)-(line 95,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testExcelFormat2()",
      "begin_line": 98,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 65)",
        "(line 101,col 9)-(line 107,col 10)",
        "(line 108,col 9)-(line 108,col 64)",
        "(line 109,col 9)-(line 109,col 54)",
        "(line 110,col 9)-(line 110,col 49)",
        "(line 111,col 9)-(line 111,col 39)",
        "(line 112,col 9)-(line 114,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testEndOfFileBehaviourExcel()",
      "begin_line": 117,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 119,col 9)-(line 128,col 10)",
        "(line 129,col 9)-(line 133,col 10)",
        "(line 135,col 9)-(line 143,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testEndOfFileBehaviorCSV()",
      "begin_line": 146,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 148,col 9)-(line 157,col 10)",
        "(line 158,col 9)-(line 161,col 10)",
        "(line 162,col 9)-(line 170,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testEmptyLineBehaviourExcel()",
      "begin_line": 173,
      "end_line": 195,
      "comment": "",
      "child_ranges": [
        "(line 175,col 9)-(line 180,col 10)",
        "(line 181,col 9)-(line 185,col 10)",
        "(line 186,col 9)-(line 194,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testEmptyLineBehaviourCSV()",
      "begin_line": 197,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 199,col 9)-(line 204,col 10)",
        "(line 205,col 9)-(line 207,col 10)",
        "(line 208,col 9)-(line 216,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testEmptyFile()",
      "begin_line": 219,
      "end_line": 223,
      "comment": "",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 64)",
        "(line 222,col 9)-(line 222,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testBackslashEscapingOld()",
      "begin_line": 225,
      "end_line": 256,
      "comment": "",
      "child_ranges": [
        "(line 228,col 9)-(line 237,col 40)",
        "(line 238,col 9)-(line 248,col 10)",
        "(line 249,col 9)-(line 249,col 65)",
        "(line 250,col 9)-(line 250,col 54)",
        "(line 251,col 9)-(line 251,col 49)",
        "(line 252,col 9)-(line 252,col 39)",
        "(line 253,col 9)-(line 255,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testBackslashEscaping()",
      "begin_line": 258,
      "end_line": 299,
      "comment": "",
      "child_ranges": [
        "(line 265,col 9)-(line 276,col 29)",
        "(line 277,col 9)-(line 288,col 10)",
        "(line 291,col 9)-(line 291,col 104)",
        "(line 293,col 9)-(line 293,col 55)",
        "(line 294,col 9)-(line 294,col 54)",
        "(line 295,col 9)-(line 295,col 39)",
        "(line 296,col 9)-(line 298,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testBackslashEscaping2()",
      "begin_line": 301,
      "end_line": 327,
      "comment": "",
      "child_ranges": [
        "(line 308,col 9)-(line 312,col 21)",
        "(line 313,col 9)-(line 317,col 10)",
        "(line 320,col 9)-(line 320,col 120)",
        "(line 322,col 9)-(line 322,col 55)",
        "(line 323,col 9)-(line 323,col 54)",
        "(line 324,col 9)-(line 324,col 39)",
        "(line 326,col 9)-(line 326,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testDefaultFormat()",
      "begin_line": 329,
      "end_line": 362,
      "comment": "",
      "child_ranges": [
        "(line 331,col 9)-(line 335,col 17)",
        "(line 336,col 9)-(line 340,col 10)",
        "(line 342,col 9)-(line 342,col 45)",
        "(line 343,col 9)-(line 343,col 67)",
        "(line 345,col 9)-(line 345,col 55)",
        "(line 346,col 9)-(line 346,col 54)",
        "(line 347,col 9)-(line 347,col 39)",
        "(line 349,col 9)-(line 349,col 56)",
        "(line 351,col 9)-(line 355,col 10)",
        "(line 357,col 9)-(line 357,col 57)",
        "(line 358,col 9)-(line 358,col 45)",
        "(line 359,col 9)-(line 359,col 38)",
        "(line 361,col 9)-(line 361,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testCarriageReturnLineFeedEndings()",
      "begin_line": 364,
      "end_line": 370,
      "comment": "",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 61)",
        "(line 367,col 9)-(line 367,col 65)",
        "(line 368,col 9)-(line 368,col 54)",
        "(line 369,col 9)-(line 369,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testCarriageReturnEndings()",
      "begin_line": 372,
      "end_line": 378,
      "comment": "",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 55)",
        "(line 375,col 9)-(line 375,col 65)",
        "(line 376,col 9)-(line 376,col 54)",
        "(line 377,col 9)-(line 377,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testLineFeedEndings()",
      "begin_line": 380,
      "end_line": 386,
      "comment": "",
      "child_ranges": [
        "(line 382,col 9)-(line 382,col 55)",
        "(line 383,col 9)-(line 383,col 65)",
        "(line 384,col 9)-(line 384,col 54)",
        "(line 385,col 9)-(line 385,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testIgnoreEmptyLines()",
      "begin_line": 388,
      "end_line": 396,
      "comment": "",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 58)",
        "(line 393,col 9)-(line 393,col 65)",
        "(line 394,col 9)-(line 394,col 54)",
        "(line 395,col 9)-(line 395,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testForEach()",
      "begin_line": 398,
      "end_line": 412,
      "comment": "",
      "child_ranges": [
        "(line 400,col 9)-(line 400,col 61)",
        "(line 402,col 9)-(line 402,col 60)",
        "(line 404,col 9)-(line 406,col 9)",
        "(line 408,col 9)-(line 408,col 40)",
        "(line 409,col 9)-(line 409,col 80)",
        "(line 410,col 9)-(line 410,col 80)",
        "(line 411,col 9)-(line 411,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testIterator()",
      "begin_line": 414,
      "end_line": 440,
      "comment": "",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 60)",
        "(line 418,col 9)-(line 418,col 78)",
        "(line 420,col 9)-(line 420,col 39)",
        "(line 421,col 9)-(line 425,col 9)",
        "(line 426,col 9)-(line 426,col 81)",
        "(line 427,col 9)-(line 427,col 81)",
        "(line 428,col 9)-(line 428,col 39)",
        "(line 429,col 9)-(line 429,col 39)",
        "(line 430,col 9)-(line 430,col 39)",
        "(line 431,col 9)-(line 431,col 81)",
        "(line 432,col 9)-(line 432,col 40)",
        "(line 434,col 9)-(line 439,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testHeader()",
      "begin_line": 442,
      "end_line": 457,
      "comment": "",
      "child_ranges": [
        "(line 444,col 9)-(line 444,col 60)",
        "(line 446,col 9)-(line 446,col 90)",
        "(line 448,col 9)-(line 454,col 9)",
        "(line 456,col 9)-(line 456,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testProvidedHeader()",
      "begin_line": 459,
      "end_line": 474,
      "comment": "",
      "child_ranges": [
        "(line 461,col 9)-(line 461,col 60)",
        "(line 463,col 9)-(line 463,col 103)",
        "(line 465,col 9)-(line 471,col 9)",
        "(line 473,col 9)-(line 473,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetLineNumberWithLF()",
      "begin_line": 476,
      "end_line": 488,
      "comment": "",
      "child_ranges": [
        "(line 478,col 9)-(line 478,col 95)",
        "(line 480,col 9)-(line 480,col 48)",
        "(line 481,col 9)-(line 481,col 42)",
        "(line 482,col 9)-(line 482,col 48)",
        "(line 483,col 9)-(line 483,col 42)",
        "(line 484,col 9)-(line 484,col 48)",
        "(line 485,col 9)-(line 485,col 42)",
        "(line 486,col 9)-(line 486,col 48)",
        "(line 487,col 9)-(line 487,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetLineNumberWithCRLF()",
      "begin_line": 490,
      "end_line": 502,
      "comment": "",
      "child_ranges": [
        "(line 492,col 9)-(line 492,col 101)",
        "(line 494,col 9)-(line 494,col 48)",
        "(line 495,col 9)-(line 495,col 42)",
        "(line 496,col 9)-(line 496,col 48)",
        "(line 497,col 9)-(line 497,col 42)",
        "(line 498,col 9)-(line 498,col 48)",
        "(line 499,col 9)-(line 499,col 42)",
        "(line 500,col 9)-(line 500,col 48)",
        "(line 501,col 9)-(line 501,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetLineNumberWithCR()",
      "begin_line": 504,
      "end_line": 516,
      "comment": "",
      "child_ranges": [
        "(line 506,col 9)-(line 506,col 95)",
        "(line 508,col 9)-(line 508,col 48)",
        "(line 509,col 9)-(line 509,col 42)",
        "(line 510,col 9)-(line 510,col 48)",
        "(line 511,col 9)-(line 511,col 42)",
        "(line 512,col 9)-(line 512,col 48)",
        "(line 513,col 9)-(line 513,col 42)",
        "(line 514,col 9)-(line 514,col 48)",
        "(line 515,col 9)-(line 515,col 39)"
      ]
    }
  ]
}