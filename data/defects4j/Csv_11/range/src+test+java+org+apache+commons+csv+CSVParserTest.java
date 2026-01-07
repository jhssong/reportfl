{
  "filepath": "/tmp/Csv-11b/src/test/java/org/apache/commons/csv/CSVParserTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CSVParserTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 64,
      "end_line": 962,
      "comment": "\n * CSVParserTest\n *\n * The test are organized in three different sections:\n * The \u0027setter/getter\u0027 section, the lexer section and finally the parser\n * section. In case a test fails, you should follow a top-down approach for\n * fixing a potential bug (its likely that the parser itself fails if the lexer\n * has problems...).\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "CSV_INPUT"
      ],
      "begin_line": 66,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CSV_INPUT_1"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CSV_INPUT_2"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "RESULT"
      ],
      "begin_line": 76,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testBackslashEscaping()",
      "begin_line": 83,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 90,col 9)-(line 101,col 29)",
        "(line 102,col 9)-(line 113,col 10)",
        "(line 116,col 9)-(line 117,col 101)",
        "(line 119,col 9)-(line 119,col 63)",
        "(line 120,col 9)-(line 120,col 60)",
        "(line 121,col 9)-(line 121,col 39)",
        "(line 123,col 9)-(line 123,col 76)",
        "(line 124,col 9)-(line 124,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testBackslashEscaping2()",
      "begin_line": 127,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 134,col 9)-(line 138,col 21)",
        "(line 139,col 9)-(line 143,col 10)",
        "(line 146,col 9)-(line 147,col 86)",
        "(line 149,col 9)-(line 149,col 63)",
        "(line 150,col 9)-(line 150,col 60)",
        "(line 151,col 9)-(line 151,col 39)",
        "(line 153,col 9)-(line 153,col 40)",
        "(line 154,col 9)-(line 154,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testBackslashEscapingOld()",
      "begin_line": 157,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 160,col 9)-(line 169,col 40)",
        "(line 170,col 9)-(line 180,col 10)",
        "(line 181,col 9)-(line 181,col 74)",
        "(line 182,col 9)-(line 182,col 60)",
        "(line 183,col 9)-(line 183,col 49)",
        "(line 184,col 9)-(line 184,col 39)",
        "(line 185,col 9)-(line 187,col 9)",
        "(line 188,col 9)-(line 188,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testBOM()",
      "begin_line": 191,
      "end_line": 205,
      "comment": "",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 96)",
        "(line 195,col 9)-(line 195,col 110)",
        "(line 196,col 9)-(line 204,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testBOMInputStream()",
      "begin_line": 207,
      "end_line": 208,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testCarriageReturnEndings()",
      "begin_line": 227,
      "end_line": 234,
      "comment": "",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 61)",
        "(line 230,col 9)-(line 230,col 74)",
        "(line 231,col 9)-(line 231,col 60)",
        "(line 232,col 9)-(line 232,col 40)",
        "(line 233,col 9)-(line 233,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testCarriageReturnLineFeedEndings()",
      "begin_line": 236,
      "end_line": 243,
      "comment": "",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 67)",
        "(line 239,col 9)-(line 239,col 74)",
        "(line 240,col 9)-(line 240,col 60)",
        "(line 241,col 9)-(line 241,col 40)",
        "(line 242,col 9)-(line 242,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testClose()",
      "begin_line": 245,
      "end_line": 254,
      "comment": "",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 77)",
        "(line 248,col 9)-(line 248,col 96)",
        "(line 249,col 9)-(line 249,col 62)",
        "(line 250,col 9)-(line 250,col 38)",
        "(line 251,col 9)-(line 251,col 23)",
        "(line 252,col 9)-(line 252,col 39)",
        "(line 253,col 9)-(line 253,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testCSV57()",
      "begin_line": 256,
      "end_line": 263,
      "comment": "",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 72)",
        "(line 259,col 9)-(line 259,col 57)",
        "(line 260,col 9)-(line 260,col 28)",
        "(line 261,col 9)-(line 261,col 37)",
        "(line 262,col 9)-(line 262,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testDefaultFormat()",
      "begin_line": 265,
      "end_line": 301,
      "comment": "",
      "child_ranges": [
        "(line 267,col 9)-(line 272,col 17)",
        "(line 273,col 9)-(line 278,col 10)",
        "(line 280,col 9)-(line 280,col 45)",
        "(line 281,col 9)-(line 281,col 50)",
        "(line 283,col 9)-(line 283,col 57)",
        "(line 284,col 9)-(line 284,col 54)",
        "(line 285,col 9)-(line 285,col 39)",
        "(line 287,col 9)-(line 287,col 72)",
        "(line 289,col 9)-(line 292,col 10)",
        "(line 294,col 9)-(line 294,col 57)",
        "(line 295,col 9)-(line 295,col 23)",
        "(line 296,col 9)-(line 296,col 47)",
        "(line 297,col 9)-(line 297,col 38)",
        "(line 299,col 9)-(line 299,col 78)",
        "(line 300,col 9)-(line 300,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testEmptyFile()",
      "begin_line": 303,
      "end_line": 308,
      "comment": "",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 72)",
        "(line 306,col 9)-(line 306,col 40)",
        "(line 307,col 9)-(line 307,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testEmptyLineBehaviourCSV()",
      "begin_line": 310,
      "end_line": 331,
      "comment": "",
      "child_ranges": [
        "(line 312,col 9)-(line 317,col 10)",
        "(line 318,col 9)-(line 320,col 10)",
        "(line 321,col 9)-(line 330,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testEmptyLineBehaviourExcel()",
      "begin_line": 333,
      "end_line": 356,
      "comment": "",
      "child_ranges": [
        "(line 335,col 9)-(line 340,col 10)",
        "(line 341,col 9)-(line 345,col 10)",
        "(line 346,col 9)-(line 355,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testEndOfFileBehaviorCSV()",
      "begin_line": 358,
      "end_line": 384,
      "comment": "",
      "child_ranges": [
        "(line 360,col 9)-(line 369,col 10)",
        "(line 370,col 9)-(line 373,col 10)",
        "(line 374,col 9)-(line 383,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testEndOfFileBehaviourExcel()",
      "begin_line": 386,
      "end_line": 414,
      "comment": "",
      "child_ranges": [
        "(line 388,col 9)-(line 397,col 10)",
        "(line 398,col 9)-(line 402,col 10)",
        "(line 404,col 9)-(line 413,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testExcelFormat1()",
      "begin_line": 416,
      "end_line": 436,
      "comment": "",
      "child_ranges": [
        "(line 418,col 9)-(line 420,col 92)",
        "(line 421,col 9)-(line 427,col 10)",
        "(line 428,col 9)-(line 428,col 72)",
        "(line 429,col 9)-(line 429,col 60)",
        "(line 430,col 9)-(line 430,col 49)",
        "(line 431,col 9)-(line 431,col 39)",
        "(line 432,col 9)-(line 434,col 9)",
        "(line 435,col 9)-(line 435,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testExcelFormat2()",
      "begin_line": 438,
      "end_line": 456,
      "comment": "",
      "child_ranges": [
        "(line 440,col 9)-(line 440,col 71)",
        "(line 441,col 9)-(line 447,col 10)",
        "(line 448,col 9)-(line 448,col 72)",
        "(line 449,col 9)-(line 449,col 60)",
        "(line 450,col 9)-(line 450,col 49)",
        "(line 451,col 9)-(line 451,col 39)",
        "(line 452,col 9)-(line 454,col 9)",
        "(line 455,col 9)-(line 455,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testForEach()",
      "begin_line": 458,
      "end_line": 472,
      "comment": "",
      "child_ranges": [
        "(line 460,col 9)-(line 460,col 67)",
        "(line 462,col 9)-(line 462,col 66)",
        "(line 464,col 9)-(line 466,col 9)",
        "(line 468,col 9)-(line 468,col 40)",
        "(line 469,col 9)-(line 469,col 80)",
        "(line 470,col 9)-(line 470,col 80)",
        "(line 471,col 9)-(line 471,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetHeaderMap()",
      "begin_line": 474,
      "end_line": 496,
      "comment": "",
      "child_ranges": [
        "(line 476,col 9)-(line 476,col 117)",
        "(line 477,col 9)-(line 477,col 69)",
        "(line 478,col 9)-(line 478,col 75)",
        "(line 480,col 9)-(line 480,col 53)",
        "(line 481,col 9)-(line 481,col 53)",
        "(line 482,col 9)-(line 482,col 53)",
        "(line 483,col 9)-(line 483,col 62)",
        "(line 486,col 9)-(line 492,col 9)",
        "(line 494,col 9)-(line 494,col 39)",
        "(line 495,col 9)-(line 495,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testDuplicateHeaders()",
      "begin_line": 498,
      "end_line": 501,
      "comment": "",
      "child_ranges": [
        "(line 500,col 9)-(line 500,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetLine()",
      "begin_line": 503,
      "end_line": 512,
      "comment": "",
      "child_ranges": [
        "(line 505,col 9)-(line 505,col 113)",
        "(line 506,col 9)-(line 508,col 9)",
        "(line 510,col 9)-(line 510,col 40)",
        "(line 511,col 9)-(line 511,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetLineNumberWithCR()",
      "begin_line": 514,
      "end_line": 517,
      "comment": "",
      "child_ranges": [
        "(line 516,col 9)-(line 516,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetLineNumberWithCRLF()",
      "begin_line": 519,
      "end_line": 522,
      "comment": "",
      "child_ranges": [
        "(line 521,col 9)-(line 521,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetLineNumberWithLF()",
      "begin_line": 524,
      "end_line": 527,
      "comment": "",
      "child_ranges": [
        "(line 526,col 9)-(line 526,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetOneLine()",
      "begin_line": 529,
      "end_line": 535,
      "comment": "",
      "child_ranges": [
        "(line 531,col 9)-(line 531,col 81)",
        "(line 532,col 9)-(line 532,col 60)",
        "(line 533,col 9)-(line 533,col 54)",
        "(line 534,col 9)-(line 534,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetOneLineCustomCollection()",
      "begin_line": 537,
      "end_line": 543,
      "comment": "",
      "child_ranges": [
        "(line 539,col 9)-(line 539,col 81)",
        "(line 540,col 9)-(line 540,col 91)",
        "(line 541,col 9)-(line 541,col 54)",
        "(line 542,col 9)-(line 542,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetOneLineOneParser()",
      "begin_line": 550,
      "end_line": 568,
      "comment": "\n     * Tests reusing a parser to process new string records one at a time as they are being discovered. See [CSV-110].\n     *\n     * @throws IOException\n     ",
      "child_ranges": [
        "(line 552,col 9)-(line 552,col 53)",
        "(line 553,col 9)-(line 553,col 59)",
        "(line 554,col 9)-(line 554,col 51)",
        "(line 555,col 9)-(line 555,col 63)",
        "(line 556,col 9)-(line 567,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetRecordNumberWithCR()",
      "begin_line": 570,
      "end_line": 573,
      "comment": "",
      "child_ranges": [
        "(line 572,col 9)-(line 572,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetRecordNumberWithCRLF()",
      "begin_line": 575,
      "end_line": 578,
      "comment": "",
      "child_ranges": [
        "(line 577,col 9)-(line 577,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetRecordNumberWithLF()",
      "begin_line": 580,
      "end_line": 583,
      "comment": "",
      "child_ranges": [
        "(line 582,col 9)-(line 582,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetRecords()",
      "begin_line": 585,
      "end_line": 595,
      "comment": "",
      "child_ranges": [
        "(line 587,col 9)-(line 587,col 113)",
        "(line 588,col 9)-(line 588,col 60)",
        "(line 589,col 9)-(line 589,col 52)",
        "(line 590,col 9)-(line 590,col 39)",
        "(line 591,col 9)-(line 593,col 9)",
        "(line 594,col 9)-(line 594,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetRecordWithMultiLineValues()",
      "begin_line": 597,
      "end_line": 620,
      "comment": "",
      "child_ranges": [
        "(line 599,col 9)-(line 600,col 61)",
        "(line 601,col 9)-(line 601,col 25)",
        "(line 602,col 9)-(line 602,col 50)",
        "(line 603,col 9)-(line 603,col 55)",
        "(line 604,col 9)-(line 604,col 52)",
        "(line 605,col 9)-(line 605,col 55)",
        "(line 606,col 9)-(line 606,col 50)",
        "(line 607,col 9)-(line 607,col 50)",
        "(line 608,col 9)-(line 608,col 52)",
        "(line 609,col 9)-(line 609,col 55)",
        "(line 610,col 9)-(line 610,col 50)",
        "(line 611,col 9)-(line 611,col 50)",
        "(line 612,col 9)-(line 612,col 52)",
        "(line 613,col 9)-(line 613,col 55)",
        "(line 614,col 9)-(line 614,col 50)",
        "(line 615,col 9)-(line 615,col 50)",
        "(line 616,col 9)-(line 616,col 49)",
        "(line 617,col 9)-(line 617,col 55)",
        "(line 618,col 9)-(line 618,col 50)",
        "(line 619,col 9)-(line 619,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testHeader()",
      "begin_line": 622,
      "end_line": 637,
      "comment": "",
      "child_ranges": [
        "(line 624,col 9)-(line 624,col 66)",
        "(line 626,col 9)-(line 626,col 96)",
        "(line 628,col 9)-(line 634,col 9)",
        "(line 636,col 9)-(line 636,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testHeaderMissing()",
      "begin_line": 639,
      "end_line": 653,
      "comment": "",
      "child_ranges": [
        "(line 641,col 9)-(line 641,col 65)",
        "(line 643,col 9)-(line 643,col 96)",
        "(line 645,col 9)-(line 650,col 9)",
        "(line 652,col 9)-(line 652,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testHeadersMissingException()",
      "begin_line": 655,
      "end_line": 659,
      "comment": "",
      "child_ranges": [
        "(line 657,col 9)-(line 657,col 73)",
        "(line 658,col 9)-(line 658,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testHeadersMissing()",
      "begin_line": 661,
      "end_line": 665,
      "comment": "",
      "child_ranges": [
        "(line 663,col 9)-(line 663,col 73)",
        "(line 664,col 9)-(line 664,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testHeaderMissingWithNull()",
      "begin_line": 667,
      "end_line": 671,
      "comment": "",
      "child_ranges": [
        "(line 669,col 9)-(line 669,col 73)",
        "(line 670,col 9)-(line 670,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testHeaderComment()",
      "begin_line": 673,
      "end_line": 688,
      "comment": "",
      "child_ranges": [
        "(line 675,col 9)-(line 675,col 77)",
        "(line 677,col 9)-(line 677,col 118)",
        "(line 679,col 9)-(line 685,col 9)",
        "(line 687,col 9)-(line 687,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testIgnoreEmptyLines()",
      "begin_line": 690,
      "end_line": 699,
      "comment": "",
      "child_ranges": [
        "(line 692,col 9)-(line 692,col 64)",
        "(line 695,col 9)-(line 695,col 74)",
        "(line 696,col 9)-(line 696,col 60)",
        "(line 697,col 9)-(line 697,col 40)",
        "(line 698,col 9)-(line 698,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testInvalidFormat()",
      "begin_line": 701,
      "end_line": 705,
      "comment": "",
      "child_ranges": [
        "(line 703,col 9)-(line 703,col 76)",
        "(line 704,col 9)-(line 704,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testIterator()",
      "begin_line": 707,
      "end_line": 734,
      "comment": "",
      "child_ranges": [
        "(line 709,col 9)-(line 709,col 66)",
        "(line 711,col 9)-(line 711,col 84)",
        "(line 713,col 9)-(line 713,col 39)",
        "(line 714,col 9)-(line 719,col 9)",
        "(line 720,col 9)-(line 720,col 81)",
        "(line 721,col 9)-(line 721,col 81)",
        "(line 722,col 9)-(line 722,col 39)",
        "(line 723,col 9)-(line 723,col 39)",
        "(line 724,col 9)-(line 724,col 39)",
        "(line 725,col 9)-(line 725,col 81)",
        "(line 726,col 9)-(line 726,col 40)",
        "(line 728,col 9)-(line 733,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testLineFeedEndings()",
      "begin_line": 736,
      "end_line": 743,
      "comment": "",
      "child_ranges": [
        "(line 738,col 9)-(line 738,col 61)",
        "(line 739,col 9)-(line 739,col 74)",
        "(line 740,col 9)-(line 740,col 60)",
        "(line 741,col 9)-(line 741,col 40)",
        "(line 742,col 9)-(line 742,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testMappedButNotSetAsOutlook2007ContactExport()",
      "begin_line": 745,
      "end_line": 778,
      "comment": "",
      "child_ranges": [
        "(line 747,col 9)-(line 747,col 64)",
        "(line 748,col 9)-(line 749,col 38)",
        "(line 750,col 9)-(line 750,col 25)",
        "(line 753,col 9)-(line 753,col 32)",
        "(line 754,col 9)-(line 754,col 41)",
        "(line 755,col 9)-(line 755,col 41)",
        "(line 756,col 9)-(line 756,col 41)",
        "(line 757,col 9)-(line 757,col 38)",
        "(line 758,col 9)-(line 758,col 38)",
        "(line 759,col 9)-(line 759,col 39)",
        "(line 760,col 9)-(line 760,col 43)",
        "(line 761,col 9)-(line 761,col 43)",
        "(line 762,col 9)-(line 762,col 43)",
        "(line 765,col 9)-(line 765,col 32)",
        "(line 766,col 9)-(line 766,col 41)",
        "(line 767,col 9)-(line 767,col 41)",
        "(line 768,col 9)-(line 768,col 41)",
        "(line 769,col 9)-(line 769,col 38)",
        "(line 770,col 9)-(line 770,col 38)",
        "(line 771,col 9)-(line 771,col 38)",
        "(line 772,col 9)-(line 772,col 43)",
        "(line 773,col 9)-(line 773,col 43)",
        "(line 774,col 9)-(line 774,col 43)",
        "(line 775,col 9)-(line 775,col 42)",
        "(line 777,col 9)-(line 777,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testMultipleIterators()",
      "begin_line": 780,
      "end_line": 797,
      "comment": "",
      "child_ranges": [
        "(line 782,col 9)-(line 782,col 92)",
        "(line 784,col 9)-(line 784,col 59)",
        "(line 785,col 9)-(line 785,col 59)",
        "(line 787,col 9)-(line 787,col 44)",
        "(line 788,col 9)-(line 788,col 40)",
        "(line 789,col 9)-(line 789,col 40)",
        "(line 790,col 9)-(line 790,col 40)",
        "(line 792,col 9)-(line 792,col 45)",
        "(line 793,col 9)-(line 793,col 41)",
        "(line 794,col 9)-(line 794,col 41)",
        "(line 795,col 9)-(line 795,col 41)",
        "(line 796,col 9)-(line 796,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testNewCSVParserNullReaderFormat()",
      "begin_line": 799,
      "end_line": 802,
      "comment": "",
      "child_ranges": [
        "(line 801,col 9)-(line 801,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testNewCSVParserReaderNullFormat()",
      "begin_line": 804,
      "end_line": 807,
      "comment": "",
      "child_ranges": [
        "(line 806,col 9)-(line 806,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testNoHeaderMap()",
      "begin_line": 809,
      "end_line": 814,
      "comment": "",
      "child_ranges": [
        "(line 811,col 9)-(line 811,col 91)",
        "(line 812,col 9)-(line 812,col 49)",
        "(line 813,col 9)-(line 813,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testParseFileNullFormat()",
      "begin_line": 816,
      "end_line": 819,
      "comment": "",
      "child_ranges": [
        "(line 818,col 9)-(line 818,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testParseNullFileFormat()",
      "begin_line": 821,
      "end_line": 824,
      "comment": "",
      "child_ranges": [
        "(line 823,col 9)-(line 823,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testParseNullStringFormat()",
      "begin_line": 826,
      "end_line": 829,
      "comment": "",
      "child_ranges": [
        "(line 828,col 9)-(line 828,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testParseNullUrlCharsetFormat()",
      "begin_line": 831,
      "end_line": 834,
      "comment": "",
      "child_ranges": [
        "(line 833,col 9)-(line 833,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testParserUrlNullCharsetFormat()",
      "begin_line": 836,
      "end_line": 840,
      "comment": "",
      "child_ranges": [
        "(line 838,col 9)-(line 838,col 112)",
        "(line 839,col 9)-(line 839,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testParseStringNullFormat()",
      "begin_line": 842,
      "end_line": 845,
      "comment": "",
      "child_ranges": [
        "(line 844,col 9)-(line 844,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testParseUrlCharsetNullFormat()",
      "begin_line": 847,
      "end_line": 851,
      "comment": "",
      "child_ranges": [
        "(line 849,col 9)-(line 849,col 119)",
        "(line 850,col 9)-(line 850,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testProvidedHeader()",
      "begin_line": 853,
      "end_line": 872,
      "comment": "",
      "child_ranges": [
        "(line 855,col 9)-(line 855,col 66)",
        "(line 857,col 9)-(line 857,col 109)",
        "(line 859,col 9)-(line 869,col 9)",
        "(line 871,col 9)-(line 871,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testProvidedHeaderAuto()",
      "begin_line": 874,
      "end_line": 893,
      "comment": "",
      "child_ranges": [
        "(line 876,col 9)-(line 876,col 66)",
        "(line 878,col 9)-(line 878,col 96)",
        "(line 880,col 9)-(line 890,col 9)",
        "(line 892,col 9)-(line 892,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testRoundtrip()",
      "begin_line": 895,
      "end_line": 905,
      "comment": "",
      "child_ranges": [
        "(line 897,col 9)-(line 897,col 52)",
        "(line 898,col 9)-(line 898,col 74)",
        "(line 899,col 9)-(line 899,col 59)",
        "(line 900,col 9)-(line 902,col 9)",
        "(line 903,col 9)-(line 903,col 44)",
        "(line 904,col 9)-(line 904,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testSkipAutoHeader()",
      "begin_line": 907,
      "end_line": 915,
      "comment": "",
      "child_ranges": [
        "(line 909,col 9)-(line 909,col 66)",
        "(line 910,col 9)-(line 910,col 96)",
        "(line 911,col 9)-(line 911,col 48)",
        "(line 912,col 9)-(line 912,col 43)",
        "(line 913,col 9)-(line 913,col 43)",
        "(line 914,col 9)-(line 914,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testSkipSetHeader()",
      "begin_line": 917,
      "end_line": 926,
      "comment": "",
      "child_ranges": [
        "(line 919,col 9)-(line 919,col 66)",
        "(line 920,col 9)-(line 921,col 38)",
        "(line 922,col 9)-(line 922,col 48)",
        "(line 923,col 9)-(line 923,col 43)",
        "(line 924,col 9)-(line 924,col 43)",
        "(line 925,col 9)-(line 925,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.validateLineNumbers(java.lang.String)",
      "begin_line": 928,
      "end_line": 942,
      "comment": "",
      "child_ranges": [
        "(line 929,col 9)-(line 929,col 152)",
        "(line 930,col 9)-(line 930,col 55)",
        "(line 931,col 9)-(line 931,col 43)",
        "(line 932,col 9)-(line 932,col 55)",
        "(line 933,col 9)-(line 933,col 43)",
        "(line 934,col 9)-(line 934,col 55)",
        "(line 935,col 9)-(line 935,col 43)",
        "(line 937,col 9)-(line 937,col 55)",
        "(line 938,col 9)-(line 938,col 40)",
        "(line 940,col 9)-(line 940,col 55)",
        "(line 941,col 9)-(line 941,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.validateRecordNumbers(java.lang.String)",
      "begin_line": 944,
      "end_line": 960,
      "comment": "",
      "child_ranges": [
        "(line 945,col 9)-(line 945,col 152)",
        "(line 946,col 9)-(line 946,col 25)",
        "(line 947,col 9)-(line 947,col 50)",
        "(line 948,col 9)-(line 948,col 52)",
        "(line 949,col 9)-(line 949,col 50)",
        "(line 950,col 9)-(line 950,col 50)",
        "(line 951,col 9)-(line 951,col 52)",
        "(line 952,col 9)-(line 952,col 50)",
        "(line 953,col 9)-(line 953,col 50)",
        "(line 954,col 9)-(line 954,col 52)",
        "(line 955,col 9)-(line 955,col 50)",
        "(line 956,col 9)-(line 956,col 50)",
        "(line 957,col 9)-(line 957,col 49)",
        "(line 958,col 9)-(line 958,col 50)",
        "(line 959,col 9)-(line 959,col 23)"
      ]
    }
  ]
}