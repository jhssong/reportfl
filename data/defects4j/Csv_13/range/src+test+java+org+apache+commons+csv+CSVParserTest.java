{
  "filepath": "/tmp/Csv-13b/src/test/java/org/apache/commons/csv/CSVParserTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CSVParserTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 61,
      "end_line": 1012,
      "comment": "\n * CSVParserTest\n *\n * The test are organized in three different sections: The \u0027setter/getter\u0027 section, the lexer section and finally the\n * parser section. In case a test fails, you should follow a top-down approach for fixing a potential bug (its likely\n * that the parser itself fails if the lexer has problems...).\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "CSV_INPUT"
      ],
      "begin_line": 63,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CSV_INPUT_1"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CSV_INPUT_2"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "RESULT"
      ],
      "begin_line": 71,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testBackslashEscaping()",
      "begin_line": 74,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 91,col 21)",
        "(line 92,col 9)-(line 100,col 92)",
        "(line 102,col 9)-(line 103,col 40)",
        "(line 105,col 9)-(line 105,col 63)",
        "(line 106,col 9)-(line 106,col 60)",
        "(line 107,col 9)-(line 107,col 39)",
        "(line 109,col 9)-(line 109,col 76)",
        "(line 110,col 9)-(line 110,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testBackslashEscaping2()",
      "begin_line": 113,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 120,col 9)-(line 123,col 21)",
        "(line 124,col 9)-(line 127,col 10)",
        "(line 129,col 9)-(line 130,col 40)",
        "(line 132,col 9)-(line 132,col 63)",
        "(line 133,col 9)-(line 133,col 60)",
        "(line 134,col 9)-(line 134,col 39)",
        "(line 136,col 9)-(line 136,col 40)",
        "(line 137,col 9)-(line 137,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testBackslashEscapingOld()",
      "begin_line": 140,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 143,col 9)-(line 144,col 106)",
        "(line 145,col 9)-(line 150,col 10)",
        "(line 151,col 9)-(line 151,col 74)",
        "(line 152,col 9)-(line 152,col 60)",
        "(line 153,col 9)-(line 153,col 49)",
        "(line 154,col 9)-(line 154,col 39)",
        "(line 155,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 158,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testBOM()",
      "begin_line": 161,
      "end_line": 175,
      "comment": "",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 96)",
        "(line 165,col 9)-(line 165,col 110)",
        "(line 166,col 9)-(line 174,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testBOMInputStream()",
      "begin_line": 177,
      "end_line": 178,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testCarriageReturnEndings()",
      "begin_line": 197,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 61)",
        "(line 200,col 9)-(line 200,col 74)",
        "(line 201,col 9)-(line 201,col 60)",
        "(line 202,col 9)-(line 202,col 40)",
        "(line 203,col 9)-(line 203,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testCarriageReturnLineFeedEndings()",
      "begin_line": 206,
      "end_line": 213,
      "comment": "",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 67)",
        "(line 209,col 9)-(line 209,col 74)",
        "(line 210,col 9)-(line 210,col 60)",
        "(line 211,col 9)-(line 211,col 40)",
        "(line 212,col 9)-(line 212,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testClose()",
      "begin_line": 215,
      "end_line": 224,
      "comment": "",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 77)",
        "(line 218,col 9)-(line 218,col 97)",
        "(line 219,col 9)-(line 219,col 62)",
        "(line 220,col 9)-(line 220,col 38)",
        "(line 221,col 9)-(line 221,col 23)",
        "(line 222,col 9)-(line 222,col 39)",
        "(line 223,col 9)-(line 223,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testCSV57()",
      "begin_line": 226,
      "end_line": 233,
      "comment": "",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 72)",
        "(line 229,col 9)-(line 229,col 57)",
        "(line 230,col 9)-(line 230,col 28)",
        "(line 231,col 9)-(line 231,col 37)",
        "(line 232,col 9)-(line 232,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testDefaultFormat()",
      "begin_line": 235,
      "end_line": 262,
      "comment": "",
      "child_ranges": [
        "(line 237,col 9)-(line 241,col 9)",
        "(line 242,col 9)-(line 242,col 105)",
        "(line 244,col 9)-(line 244,col 45)",
        "(line 245,col 9)-(line 245,col 49)",
        "(line 247,col 9)-(line 247,col 57)",
        "(line 248,col 9)-(line 248,col 54)",
        "(line 249,col 9)-(line 249,col 39)",
        "(line 251,col 9)-(line 251,col 72)",
        "(line 253,col 9)-(line 253,col 79)",
        "(line 255,col 9)-(line 255,col 58)",
        "(line 256,col 9)-(line 256,col 23)",
        "(line 257,col 9)-(line 257,col 47)",
        "(line 258,col 9)-(line 258,col 38)",
        "(line 260,col 9)-(line 260,col 78)",
        "(line 261,col 9)-(line 261,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testEmptyFile()",
      "begin_line": 264,
      "end_line": 269,
      "comment": "",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 72)",
        "(line 267,col 9)-(line 267,col 40)",
        "(line 268,col 9)-(line 268,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testEmptyLineBehaviourCSV()",
      "begin_line": 271,
      "end_line": 286,
      "comment": "",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 118)",
        "(line 274,col 9)-(line 275,col 10)",
        "(line 276,col 9)-(line 285,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testEmptyLineBehaviourExcel()",
      "begin_line": 288,
      "end_line": 303,
      "comment": "",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 118)",
        "(line 291,col 9)-(line 292,col 25)",
        "(line 293,col 9)-(line 302,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testStartWithEmptyLinesThenHeaders()",
      "begin_line": 305,
      "end_line": 322,
      "comment": "",
      "child_ranges": [
        "(line 308,col 9)-(line 309,col 36)",
        "(line 310,col 9)-(line 311,col 22)",
        "(line 312,col 9)-(line 321,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testEndOfFileBehaviorCSV()",
      "begin_line": 324,
      "end_line": 341,
      "comment": "",
      "child_ranges": [
        "(line 326,col 9)-(line 328,col 75)",
        "(line 329,col 9)-(line 330,col 34)",
        "(line 331,col 9)-(line 340,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testEndOfFileBehaviourExcel()",
      "begin_line": 343,
      "end_line": 361,
      "comment": "",
      "child_ranges": [
        "(line 345,col 9)-(line 347,col 75)",
        "(line 348,col 9)-(line 349,col 34)",
        "(line 351,col 9)-(line 360,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testExcelFormat1()",
      "begin_line": 363,
      "end_line": 377,
      "comment": "",
      "child_ranges": [
        "(line 365,col 9)-(line 366,col 84)",
        "(line 367,col 9)-(line 368,col 96)",
        "(line 369,col 9)-(line 369,col 72)",
        "(line 370,col 9)-(line 370,col 60)",
        "(line 371,col 9)-(line 371,col 49)",
        "(line 372,col 9)-(line 372,col 39)",
        "(line 373,col 9)-(line 375,col 9)",
        "(line 376,col 9)-(line 376,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testExcelFormat2()",
      "begin_line": 379,
      "end_line": 391,
      "comment": "",
      "child_ranges": [
        "(line 381,col 9)-(line 381,col 71)",
        "(line 382,col 9)-(line 382,col 103)",
        "(line 383,col 9)-(line 383,col 72)",
        "(line 384,col 9)-(line 384,col 60)",
        "(line 385,col 9)-(line 385,col 49)",
        "(line 386,col 9)-(line 386,col 39)",
        "(line 387,col 9)-(line 389,col 9)",
        "(line 390,col 9)-(line 390,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testExcelHeaderCountLessThanData()",
      "begin_line": 396,
      "end_line": 409,
      "comment": "\n     * Tests an exported Excel worksheet with a header row and rows that have more columns than the headers\n     ",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 55)",
        "(line 399,col 9)-(line 399,col 85)",
        "(line 400,col 9)-(line 408,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testForEach()",
      "begin_line": 411,
      "end_line": 425,
      "comment": "",
      "child_ranges": [
        "(line 413,col 9)-(line 413,col 67)",
        "(line 415,col 9)-(line 415,col 66)",
        "(line 417,col 9)-(line 419,col 9)",
        "(line 421,col 9)-(line 421,col 40)",
        "(line 422,col 9)-(line 422,col 83)",
        "(line 423,col 9)-(line 423,col 83)",
        "(line 424,col 9)-(line 424,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetHeaderMap()",
      "begin_line": 427,
      "end_line": 449,
      "comment": "",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 117)",
        "(line 430,col 9)-(line 430,col 69)",
        "(line 431,col 9)-(line 431,col 75)",
        "(line 433,col 9)-(line 433,col 53)",
        "(line 434,col 9)-(line 434,col 53)",
        "(line 435,col 9)-(line 435,col 53)",
        "(line 436,col 9)-(line 436,col 62)",
        "(line 439,col 9)-(line 445,col 9)",
        "(line 447,col 9)-(line 447,col 39)",
        "(line 448,col 9)-(line 448,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testDuplicateHeaders()",
      "begin_line": 451,
      "end_line": 454,
      "comment": "",
      "child_ranges": [
        "(line 453,col 9)-(line 453,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetLine()",
      "begin_line": 456,
      "end_line": 465,
      "comment": "",
      "child_ranges": [
        "(line 458,col 9)-(line 458,col 109)",
        "(line 459,col 9)-(line 461,col 9)",
        "(line 463,col 9)-(line 463,col 40)",
        "(line 464,col 9)-(line 464,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetLineNumberWithCR()",
      "begin_line": 467,
      "end_line": 470,
      "comment": "",
      "child_ranges": [
        "(line 469,col 9)-(line 469,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetLineNumberWithCRLF()",
      "begin_line": 472,
      "end_line": 475,
      "comment": "",
      "child_ranges": [
        "(line 474,col 9)-(line 474,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetLineNumberWithLF()",
      "begin_line": 477,
      "end_line": 480,
      "comment": "",
      "child_ranges": [
        "(line 479,col 9)-(line 479,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetRecordPositionWithCRLF()",
      "begin_line": 482,
      "end_line": 485,
      "comment": "",
      "child_ranges": [
        "(line 484,col 9)-(line 484,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetRecordPositionWithLF()",
      "begin_line": 487,
      "end_line": 490,
      "comment": "",
      "child_ranges": [
        "(line 489,col 9)-(line 489,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetOneLine()",
      "begin_line": 492,
      "end_line": 498,
      "comment": "",
      "child_ranges": [
        "(line 494,col 9)-(line 494,col 81)",
        "(line 495,col 9)-(line 495,col 60)",
        "(line 496,col 9)-(line 496,col 54)",
        "(line 497,col 9)-(line 497,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetOneLineOneParser()",
      "begin_line": 505,
      "end_line": 523,
      "comment": "\n     * Tests reusing a parser to process new string records one at a time as they are being discovered. See [CSV-110].\n     *\n     * @throws IOException\n     ",
      "child_ranges": [
        "(line 507,col 9)-(line 507,col 53)",
        "(line 508,col 9)-(line 508,col 59)",
        "(line 509,col 9)-(line 509,col 51)",
        "(line 510,col 9)-(line 510,col 63)",
        "(line 511,col 9)-(line 522,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetRecordNumberWithCR()",
      "begin_line": 525,
      "end_line": 528,
      "comment": "",
      "child_ranges": [
        "(line 527,col 9)-(line 527,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetRecordNumberWithCRLF()",
      "begin_line": 530,
      "end_line": 533,
      "comment": "",
      "child_ranges": [
        "(line 532,col 9)-(line 532,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetRecordNumberWithLF()",
      "begin_line": 535,
      "end_line": 538,
      "comment": "",
      "child_ranges": [
        "(line 537,col 9)-(line 537,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetRecords()",
      "begin_line": 540,
      "end_line": 550,
      "comment": "",
      "child_ranges": [
        "(line 542,col 9)-(line 542,col 109)",
        "(line 543,col 9)-(line 543,col 60)",
        "(line 544,col 9)-(line 544,col 52)",
        "(line 545,col 9)-(line 545,col 39)",
        "(line 546,col 9)-(line 548,col 9)",
        "(line 549,col 9)-(line 549,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetRecordWithMultiLineValues()",
      "begin_line": 552,
      "end_line": 575,
      "comment": "",
      "child_ranges": [
        "(line 554,col 9)-(line 555,col 86)",
        "(line 556,col 9)-(line 556,col 25)",
        "(line 557,col 9)-(line 557,col 50)",
        "(line 558,col 9)-(line 558,col 55)",
        "(line 559,col 9)-(line 559,col 52)",
        "(line 560,col 9)-(line 560,col 55)",
        "(line 561,col 9)-(line 561,col 50)",
        "(line 562,col 9)-(line 562,col 50)",
        "(line 563,col 9)-(line 563,col 52)",
        "(line 564,col 9)-(line 564,col 55)",
        "(line 565,col 9)-(line 565,col 50)",
        "(line 566,col 9)-(line 566,col 50)",
        "(line 567,col 9)-(line 567,col 52)",
        "(line 568,col 9)-(line 568,col 55)",
        "(line 569,col 9)-(line 569,col 50)",
        "(line 570,col 9)-(line 570,col 50)",
        "(line 571,col 9)-(line 571,col 49)",
        "(line 572,col 9)-(line 572,col 55)",
        "(line 573,col 9)-(line 573,col 50)",
        "(line 574,col 9)-(line 574,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testHeader()",
      "begin_line": 577,
      "end_line": 592,
      "comment": "",
      "child_ranges": [
        "(line 579,col 9)-(line 579,col 66)",
        "(line 581,col 9)-(line 581,col 96)",
        "(line 583,col 9)-(line 589,col 9)",
        "(line 591,col 9)-(line 591,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testHeaderMissing()",
      "begin_line": 594,
      "end_line": 608,
      "comment": "",
      "child_ranges": [
        "(line 596,col 9)-(line 596,col 65)",
        "(line 598,col 9)-(line 598,col 96)",
        "(line 600,col 9)-(line 605,col 9)",
        "(line 607,col 9)-(line 607,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testHeadersMissingException()",
      "begin_line": 610,
      "end_line": 614,
      "comment": "",
      "child_ranges": [
        "(line 612,col 9)-(line 612,col 73)",
        "(line 613,col 9)-(line 613,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testHeadersMissing()",
      "begin_line": 616,
      "end_line": 620,
      "comment": "",
      "child_ranges": [
        "(line 618,col 9)-(line 618,col 73)",
        "(line 619,col 9)-(line 619,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testHeaderMissingWithNull()",
      "begin_line": 622,
      "end_line": 626,
      "comment": "",
      "child_ranges": [
        "(line 624,col 9)-(line 624,col 73)",
        "(line 625,col 9)-(line 625,col 109)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testHeaderComment()",
      "begin_line": 628,
      "end_line": 643,
      "comment": "",
      "child_ranges": [
        "(line 630,col 9)-(line 630,col 77)",
        "(line 632,col 9)-(line 632,col 119)",
        "(line 634,col 9)-(line 640,col 9)",
        "(line 642,col 9)-(line 642,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testIgnoreEmptyLines()",
      "begin_line": 645,
      "end_line": 654,
      "comment": "",
      "child_ranges": [
        "(line 647,col 9)-(line 647,col 64)",
        "(line 650,col 9)-(line 650,col 74)",
        "(line 651,col 9)-(line 651,col 60)",
        "(line 652,col 9)-(line 652,col 40)",
        "(line 653,col 9)-(line 653,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testInvalidFormat()",
      "begin_line": 656,
      "end_line": 660,
      "comment": "",
      "child_ranges": [
        "(line 658,col 9)-(line 658,col 76)",
        "(line 659,col 9)-(line 659,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testIterator()",
      "begin_line": 662,
      "end_line": 689,
      "comment": "",
      "child_ranges": [
        "(line 664,col 9)-(line 664,col 66)",
        "(line 666,col 9)-(line 666,col 84)",
        "(line 668,col 9)-(line 668,col 39)",
        "(line 669,col 9)-(line 674,col 9)",
        "(line 675,col 9)-(line 675,col 84)",
        "(line 676,col 9)-(line 676,col 84)",
        "(line 677,col 9)-(line 677,col 39)",
        "(line 678,col 9)-(line 678,col 39)",
        "(line 679,col 9)-(line 679,col 39)",
        "(line 680,col 9)-(line 680,col 84)",
        "(line 681,col 9)-(line 681,col 40)",
        "(line 683,col 9)-(line 688,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testLineFeedEndings()",
      "begin_line": 691,
      "end_line": 698,
      "comment": "",
      "child_ranges": [
        "(line 693,col 9)-(line 693,col 61)",
        "(line 694,col 9)-(line 694,col 74)",
        "(line 695,col 9)-(line 695,col 60)",
        "(line 696,col 9)-(line 696,col 40)",
        "(line 697,col 9)-(line 697,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testMappedButNotSetAsOutlook2007ContactExport()",
      "begin_line": 700,
      "end_line": 733,
      "comment": "",
      "child_ranges": [
        "(line 702,col 9)-(line 702,col 64)",
        "(line 703,col 9)-(line 704,col 38)",
        "(line 705,col 9)-(line 705,col 25)",
        "(line 708,col 9)-(line 708,col 32)",
        "(line 709,col 9)-(line 709,col 41)",
        "(line 710,col 9)-(line 710,col 41)",
        "(line 711,col 9)-(line 711,col 41)",
        "(line 712,col 9)-(line 712,col 38)",
        "(line 713,col 9)-(line 713,col 38)",
        "(line 714,col 9)-(line 714,col 39)",
        "(line 715,col 9)-(line 715,col 43)",
        "(line 716,col 9)-(line 716,col 43)",
        "(line 717,col 9)-(line 717,col 43)",
        "(line 720,col 9)-(line 720,col 32)",
        "(line 721,col 9)-(line 721,col 41)",
        "(line 722,col 9)-(line 722,col 41)",
        "(line 723,col 9)-(line 723,col 41)",
        "(line 724,col 9)-(line 724,col 38)",
        "(line 725,col 9)-(line 725,col 38)",
        "(line 726,col 9)-(line 726,col 38)",
        "(line 727,col 9)-(line 727,col 43)",
        "(line 728,col 9)-(line 728,col 43)",
        "(line 729,col 9)-(line 729,col 43)",
        "(line 730,col 9)-(line 730,col 42)",
        "(line 732,col 9)-(line 732,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testMultipleIterators()",
      "begin_line": 735,
      "end_line": 753,
      "comment": "",
      "child_ranges": [
        "(line 738,col 9)-(line 738,col 92)",
        "(line 740,col 9)-(line 740,col 59)",
        "(line 741,col 9)-(line 741,col 59)",
        "(line 743,col 9)-(line 743,col 44)",
        "(line 744,col 9)-(line 744,col 40)",
        "(line 745,col 9)-(line 745,col 40)",
        "(line 746,col 9)-(line 746,col 40)",
        "(line 748,col 9)-(line 748,col 45)",
        "(line 749,col 9)-(line 749,col 41)",
        "(line 750,col 9)-(line 750,col 41)",
        "(line 751,col 9)-(line 751,col 41)",
        "(line 752,col 9)-(line 752,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testNewCSVParserNullReaderFormat()",
      "begin_line": 755,
      "end_line": 758,
      "comment": "",
      "child_ranges": [
        "(line 757,col 9)-(line 757,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testNewCSVParserReaderNullFormat()",
      "begin_line": 760,
      "end_line": 763,
      "comment": "",
      "child_ranges": [
        "(line 762,col 9)-(line 762,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testNoHeaderMap()",
      "begin_line": 765,
      "end_line": 770,
      "comment": "",
      "child_ranges": [
        "(line 767,col 9)-(line 767,col 91)",
        "(line 768,col 9)-(line 768,col 49)",
        "(line 769,col 9)-(line 769,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testParseFileNullFormat()",
      "begin_line": 772,
      "end_line": 775,
      "comment": "",
      "child_ranges": [
        "(line 774,col 9)-(line 774,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testParseNullFileFormat()",
      "begin_line": 777,
      "end_line": 780,
      "comment": "",
      "child_ranges": [
        "(line 779,col 9)-(line 779,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testParseNullStringFormat()",
      "begin_line": 782,
      "end_line": 785,
      "comment": "",
      "child_ranges": [
        "(line 784,col 9)-(line 784,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testParseNullUrlCharsetFormat()",
      "begin_line": 787,
      "end_line": 790,
      "comment": "",
      "child_ranges": [
        "(line 789,col 9)-(line 789,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testParserUrlNullCharsetFormat()",
      "begin_line": 792,
      "end_line": 796,
      "comment": "",
      "child_ranges": [
        "(line 794,col 9)-(line 794,col 112)",
        "(line 795,col 9)-(line 795,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testParseStringNullFormat()",
      "begin_line": 798,
      "end_line": 801,
      "comment": "",
      "child_ranges": [
        "(line 800,col 9)-(line 800,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testParseUrlCharsetNullFormat()",
      "begin_line": 803,
      "end_line": 807,
      "comment": "",
      "child_ranges": [
        "(line 805,col 9)-(line 805,col 119)",
        "(line 806,col 9)-(line 806,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testProvidedHeader()",
      "begin_line": 809,
      "end_line": 828,
      "comment": "",
      "child_ranges": [
        "(line 811,col 9)-(line 811,col 66)",
        "(line 813,col 9)-(line 813,col 109)",
        "(line 815,col 9)-(line 825,col 9)",
        "(line 827,col 9)-(line 827,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testProvidedHeaderAuto()",
      "begin_line": 830,
      "end_line": 849,
      "comment": "",
      "child_ranges": [
        "(line 832,col 9)-(line 832,col 66)",
        "(line 834,col 9)-(line 834,col 96)",
        "(line 836,col 9)-(line 846,col 9)",
        "(line 848,col 9)-(line 848,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testRoundtrip()",
      "begin_line": 851,
      "end_line": 861,
      "comment": "",
      "child_ranges": [
        "(line 853,col 9)-(line 853,col 52)",
        "(line 854,col 9)-(line 854,col 74)",
        "(line 855,col 9)-(line 855,col 59)",
        "(line 856,col 9)-(line 858,col 9)",
        "(line 859,col 9)-(line 859,col 44)",
        "(line 860,col 9)-(line 860,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testSkipAutoHeader()",
      "begin_line": 863,
      "end_line": 871,
      "comment": "",
      "child_ranges": [
        "(line 865,col 9)-(line 865,col 66)",
        "(line 866,col 9)-(line 866,col 96)",
        "(line 867,col 9)-(line 867,col 48)",
        "(line 868,col 9)-(line 868,col 43)",
        "(line 869,col 9)-(line 869,col 43)",
        "(line 870,col 9)-(line 870,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testSkipSetHeader()",
      "begin_line": 873,
      "end_line": 882,
      "comment": "",
      "child_ranges": [
        "(line 875,col 9)-(line 875,col 66)",
        "(line 876,col 9)-(line 877,col 38)",
        "(line 878,col 9)-(line 878,col 48)",
        "(line 879,col 9)-(line 879,col 43)",
        "(line 880,col 9)-(line 880,col 43)",
        "(line 881,col 9)-(line 881,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testSkipSetAltHeaders()",
      "begin_line": 884,
      "end_line": 893,
      "comment": "",
      "child_ranges": [
        "(line 886,col 9)-(line 886,col 66)",
        "(line 887,col 9)-(line 888,col 38)",
        "(line 889,col 9)-(line 889,col 48)",
        "(line 890,col 9)-(line 890,col 43)",
        "(line 891,col 9)-(line 891,col 43)",
        "(line 892,col 9)-(line 892,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testSkipHeaderOverrideDuplicateHeaders()",
      "begin_line": 895,
      "end_line": 904,
      "comment": "",
      "child_ranges": [
        "(line 897,col 9)-(line 897,col 66)",
        "(line 898,col 9)-(line 899,col 38)",
        "(line 900,col 9)-(line 900,col 48)",
        "(line 901,col 9)-(line 901,col 43)",
        "(line 902,col 9)-(line 902,col 43)",
        "(line 903,col 9)-(line 903,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.validateLineNumbers(java.lang.String)",
      "begin_line": 906,
      "end_line": 921,
      "comment": "",
      "child_ranges": [
        "(line 907,col 9)-(line 908,col 70)",
        "(line 909,col 9)-(line 909,col 55)",
        "(line 910,col 9)-(line 910,col 43)",
        "(line 911,col 9)-(line 911,col 55)",
        "(line 912,col 9)-(line 912,col 43)",
        "(line 913,col 9)-(line 913,col 55)",
        "(line 914,col 9)-(line 914,col 43)",
        "(line 916,col 9)-(line 916,col 55)",
        "(line 917,col 9)-(line 917,col 40)",
        "(line 919,col 9)-(line 919,col 55)",
        "(line 920,col 9)-(line 920,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.validateRecordNumbers(java.lang.String)",
      "begin_line": 923,
      "end_line": 940,
      "comment": "",
      "child_ranges": [
        "(line 924,col 9)-(line 925,col 70)",
        "(line 926,col 9)-(line 926,col 25)",
        "(line 927,col 9)-(line 927,col 50)",
        "(line 928,col 9)-(line 928,col 52)",
        "(line 929,col 9)-(line 929,col 50)",
        "(line 930,col 9)-(line 930,col 50)",
        "(line 931,col 9)-(line 931,col 52)",
        "(line 932,col 9)-(line 932,col 50)",
        "(line 933,col 9)-(line 933,col 50)",
        "(line 934,col 9)-(line 934,col 52)",
        "(line 935,col 9)-(line 935,col 50)",
        "(line 936,col 9)-(line 936,col 50)",
        "(line 937,col 9)-(line 937,col 49)",
        "(line 938,col 9)-(line 938,col 50)",
        "(line 939,col 9)-(line 939,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.validateRecordPosition(java.lang.String)",
      "begin_line": 942,
      "end_line": 1000,
      "comment": "",
      "child_ranges": [
        "(line 943,col 9)-(line 943,col 40)",
        "(line 945,col 9)-(line 950,col 71)",
        "(line 952,col 9)-(line 952,col 109)",
        "(line 953,col 9)-(line 953,col 57)",
        "(line 955,col 9)-(line 955,col 25)",
        "(line 956,col 9)-(line 956,col 50)",
        "(line 958,col 9)-(line 958,col 52)",
        "(line 959,col 9)-(line 959,col 50)",
        "(line 960,col 9)-(line 960,col 71)",
        "(line 962,col 9)-(line 962,col 52)",
        "(line 963,col 9)-(line 963,col 50)",
        "(line 964,col 9)-(line 964,col 71)",
        "(line 966,col 9)-(line 966,col 52)",
        "(line 967,col 9)-(line 967,col 67)",
        "(line 968,col 9)-(line 968,col 50)",
        "(line 969,col 9)-(line 969,col 72)",
        "(line 970,col 9)-(line 970,col 63)",
        "(line 971,col 9)-(line 971,col 63)",
        "(line 972,col 9)-(line 972,col 42)",
        "(line 974,col 9)-(line 974,col 52)",
        "(line 975,col 9)-(line 975,col 50)",
        "(line 976,col 9)-(line 976,col 76)",
        "(line 978,col 9)-(line 978,col 52)",
        "(line 979,col 9)-(line 979,col 50)",
        "(line 980,col 9)-(line 980,col 73)",
        "(line 982,col 9)-(line 982,col 23)",
        "(line 985,col 9)-(line 985,col 116)",
        "(line 987,col 9)-(line 987,col 52)",
        "(line 988,col 9)-(line 988,col 50)",
        "(line 989,col 9)-(line 989,col 72)",
        "(line 990,col 9)-(line 990,col 63)",
        "(line 991,col 9)-(line 991,col 63)",
        "(line 992,col 9)-(line 992,col 42)",
        "(line 994,col 9)-(line 994,col 52)",
        "(line 995,col 9)-(line 995,col 50)",
        "(line 996,col 9)-(line 996,col 76)",
        "(line 997,col 9)-(line 997,col 46)",
        "(line 999,col 9)-(line 999,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testIgnoreCaseHeaderMapping()",
      "begin_line": 1002,
      "end_line": 1011,
      "comment": "",
      "child_ranges": [
        "(line 1004,col 9)-(line 1004,col 52)",
        "(line 1005,col 9)-(line 1006,col 38)",
        "(line 1007,col 9)-(line 1007,col 48)",
        "(line 1008,col 9)-(line 1008,col 45)",
        "(line 1009,col 9)-(line 1009,col 45)",
        "(line 1010,col 9)-(line 1010,col 47)"
      ]
    }
  ]
}