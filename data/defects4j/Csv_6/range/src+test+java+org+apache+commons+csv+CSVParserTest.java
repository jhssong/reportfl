{
  "filepath": "/tmp/Csv-6b/src/test/java/org/apache/commons/csv/CSVParserTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CSVParserTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 64,
      "end_line": 923,
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
        "(line 194,col 9)-(line 194,col 90)",
        "(line 195,col 9)-(line 195,col 90)",
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
      "signature": "org.apache.commons.csv.CSVParserTest.testGetLine()",
      "begin_line": 498,
      "end_line": 507,
      "comment": "",
      "child_ranges": [
        "(line 500,col 9)-(line 500,col 113)",
        "(line 501,col 9)-(line 503,col 9)",
        "(line 505,col 9)-(line 505,col 40)",
        "(line 506,col 9)-(line 506,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetLineNumberWithCR()",
      "begin_line": 509,
      "end_line": 512,
      "comment": "",
      "child_ranges": [
        "(line 511,col 9)-(line 511,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetLineNumberWithCRLF()",
      "begin_line": 514,
      "end_line": 517,
      "comment": "",
      "child_ranges": [
        "(line 516,col 9)-(line 516,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetLineNumberWithLF()",
      "begin_line": 519,
      "end_line": 522,
      "comment": "",
      "child_ranges": [
        "(line 521,col 9)-(line 521,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetOneLine()",
      "begin_line": 524,
      "end_line": 530,
      "comment": "",
      "child_ranges": [
        "(line 526,col 9)-(line 526,col 81)",
        "(line 527,col 9)-(line 527,col 60)",
        "(line 528,col 9)-(line 528,col 54)",
        "(line 529,col 9)-(line 529,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetOneLineCustomCollection()",
      "begin_line": 532,
      "end_line": 538,
      "comment": "",
      "child_ranges": [
        "(line 534,col 9)-(line 534,col 81)",
        "(line 535,col 9)-(line 535,col 91)",
        "(line 536,col 9)-(line 536,col 54)",
        "(line 537,col 9)-(line 537,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetOneLineOneParser()",
      "begin_line": 545,
      "end_line": 563,
      "comment": "\n     * Tests reusing a parser to process new string records one at a time as they are being discovered. See [CSV-110].\n     * \n     * @throws IOException\n     ",
      "child_ranges": [
        "(line 547,col 9)-(line 547,col 47)",
        "(line 548,col 9)-(line 548,col 53)",
        "(line 549,col 9)-(line 549,col 51)",
        "(line 550,col 9)-(line 550,col 63)",
        "(line 551,col 9)-(line 562,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetRecordNumberWithCR()",
      "begin_line": 565,
      "end_line": 568,
      "comment": "",
      "child_ranges": [
        "(line 567,col 9)-(line 567,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetRecordNumberWithCRLF()",
      "begin_line": 570,
      "end_line": 573,
      "comment": "",
      "child_ranges": [
        "(line 572,col 9)-(line 572,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetRecordNumberWithLF()",
      "begin_line": 575,
      "end_line": 578,
      "comment": "",
      "child_ranges": [
        "(line 577,col 9)-(line 577,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetRecords()",
      "begin_line": 580,
      "end_line": 590,
      "comment": "",
      "child_ranges": [
        "(line 582,col 9)-(line 582,col 113)",
        "(line 583,col 9)-(line 583,col 60)",
        "(line 584,col 9)-(line 584,col 52)",
        "(line 585,col 9)-(line 585,col 39)",
        "(line 586,col 9)-(line 588,col 9)",
        "(line 589,col 9)-(line 589,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetRecordWithMultiLineValues()",
      "begin_line": 592,
      "end_line": 615,
      "comment": "",
      "child_ranges": [
        "(line 594,col 9)-(line 595,col 61)",
        "(line 596,col 9)-(line 596,col 25)",
        "(line 597,col 9)-(line 597,col 50)",
        "(line 598,col 9)-(line 598,col 55)",
        "(line 599,col 9)-(line 599,col 52)",
        "(line 600,col 9)-(line 600,col 55)",
        "(line 601,col 9)-(line 601,col 50)",
        "(line 602,col 9)-(line 602,col 50)",
        "(line 603,col 9)-(line 603,col 52)",
        "(line 604,col 9)-(line 604,col 55)",
        "(line 605,col 9)-(line 605,col 50)",
        "(line 606,col 9)-(line 606,col 50)",
        "(line 607,col 9)-(line 607,col 52)",
        "(line 608,col 9)-(line 608,col 55)",
        "(line 609,col 9)-(line 609,col 50)",
        "(line 610,col 9)-(line 610,col 50)",
        "(line 611,col 9)-(line 611,col 49)",
        "(line 612,col 9)-(line 612,col 55)",
        "(line 613,col 9)-(line 613,col 50)",
        "(line 614,col 9)-(line 614,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testHeader()",
      "begin_line": 617,
      "end_line": 632,
      "comment": "",
      "child_ranges": [
        "(line 619,col 9)-(line 619,col 66)",
        "(line 621,col 9)-(line 621,col 96)",
        "(line 623,col 9)-(line 629,col 9)",
        "(line 631,col 9)-(line 631,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testHeaderComment()",
      "begin_line": 634,
      "end_line": 649,
      "comment": "",
      "child_ranges": [
        "(line 636,col 9)-(line 636,col 77)",
        "(line 638,col 9)-(line 638,col 118)",
        "(line 640,col 9)-(line 646,col 9)",
        "(line 648,col 9)-(line 648,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testIgnoreEmptyLines()",
      "begin_line": 651,
      "end_line": 660,
      "comment": "",
      "child_ranges": [
        "(line 653,col 9)-(line 653,col 64)",
        "(line 656,col 9)-(line 656,col 74)",
        "(line 657,col 9)-(line 657,col 60)",
        "(line 658,col 9)-(line 658,col 40)",
        "(line 659,col 9)-(line 659,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testInvalidFormat()",
      "begin_line": 662,
      "end_line": 666,
      "comment": "",
      "child_ranges": [
        "(line 664,col 9)-(line 664,col 76)",
        "(line 665,col 9)-(line 665,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testIterator()",
      "begin_line": 668,
      "end_line": 695,
      "comment": "",
      "child_ranges": [
        "(line 670,col 9)-(line 670,col 66)",
        "(line 672,col 9)-(line 672,col 84)",
        "(line 674,col 9)-(line 674,col 39)",
        "(line 675,col 9)-(line 680,col 9)",
        "(line 681,col 9)-(line 681,col 81)",
        "(line 682,col 9)-(line 682,col 81)",
        "(line 683,col 9)-(line 683,col 39)",
        "(line 684,col 9)-(line 684,col 39)",
        "(line 685,col 9)-(line 685,col 39)",
        "(line 686,col 9)-(line 686,col 81)",
        "(line 687,col 9)-(line 687,col 40)",
        "(line 689,col 9)-(line 694,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testLineFeedEndings()",
      "begin_line": 697,
      "end_line": 704,
      "comment": "",
      "child_ranges": [
        "(line 699,col 9)-(line 699,col 61)",
        "(line 700,col 9)-(line 700,col 74)",
        "(line 701,col 9)-(line 701,col 60)",
        "(line 702,col 9)-(line 702,col 40)",
        "(line 703,col 9)-(line 703,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testMappedButNotSetAsOutlook2007ContactExport()",
      "begin_line": 706,
      "end_line": 739,
      "comment": "",
      "child_ranges": [
        "(line 708,col 9)-(line 708,col 64)",
        "(line 709,col 9)-(line 710,col 38)",
        "(line 711,col 9)-(line 711,col 25)",
        "(line 714,col 9)-(line 714,col 32)",
        "(line 715,col 9)-(line 715,col 41)",
        "(line 716,col 9)-(line 716,col 41)",
        "(line 717,col 9)-(line 717,col 41)",
        "(line 718,col 9)-(line 718,col 38)",
        "(line 719,col 9)-(line 719,col 38)",
        "(line 720,col 9)-(line 720,col 39)",
        "(line 721,col 9)-(line 721,col 43)",
        "(line 722,col 9)-(line 722,col 43)",
        "(line 723,col 9)-(line 723,col 43)",
        "(line 726,col 9)-(line 726,col 32)",
        "(line 727,col 9)-(line 727,col 41)",
        "(line 728,col 9)-(line 728,col 41)",
        "(line 729,col 9)-(line 729,col 41)",
        "(line 730,col 9)-(line 730,col 38)",
        "(line 731,col 9)-(line 731,col 38)",
        "(line 732,col 9)-(line 732,col 38)",
        "(line 733,col 9)-(line 733,col 43)",
        "(line 734,col 9)-(line 734,col 43)",
        "(line 735,col 9)-(line 735,col 43)",
        "(line 736,col 9)-(line 736,col 42)",
        "(line 738,col 9)-(line 738,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testMultipleIterators()",
      "begin_line": 741,
      "end_line": 758,
      "comment": "",
      "child_ranges": [
        "(line 743,col 9)-(line 743,col 92)",
        "(line 745,col 9)-(line 745,col 59)",
        "(line 746,col 9)-(line 746,col 59)",
        "(line 748,col 9)-(line 748,col 44)",
        "(line 749,col 9)-(line 749,col 40)",
        "(line 750,col 9)-(line 750,col 40)",
        "(line 751,col 9)-(line 751,col 40)",
        "(line 753,col 9)-(line 753,col 45)",
        "(line 754,col 9)-(line 754,col 41)",
        "(line 755,col 9)-(line 755,col 41)",
        "(line 756,col 9)-(line 756,col 41)",
        "(line 757,col 9)-(line 757,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testNewCSVParserNullReaderFormat()",
      "begin_line": 760,
      "end_line": 763,
      "comment": "",
      "child_ranges": [
        "(line 762,col 9)-(line 762,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testNewCSVParserReaderNullFormat()",
      "begin_line": 765,
      "end_line": 768,
      "comment": "",
      "child_ranges": [
        "(line 767,col 9)-(line 767,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testNoHeaderMap()",
      "begin_line": 770,
      "end_line": 775,
      "comment": "",
      "child_ranges": [
        "(line 772,col 9)-(line 772,col 91)",
        "(line 773,col 9)-(line 773,col 49)",
        "(line 774,col 9)-(line 774,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testParseFileNullFormat()",
      "begin_line": 777,
      "end_line": 780,
      "comment": "",
      "child_ranges": [
        "(line 779,col 9)-(line 779,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testParseNullFileFormat()",
      "begin_line": 782,
      "end_line": 785,
      "comment": "",
      "child_ranges": [
        "(line 784,col 9)-(line 784,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testParseNullStringFormat()",
      "begin_line": 787,
      "end_line": 790,
      "comment": "",
      "child_ranges": [
        "(line 789,col 9)-(line 789,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testParseNullUrlCharsetFormat()",
      "begin_line": 792,
      "end_line": 795,
      "comment": "",
      "child_ranges": [
        "(line 794,col 9)-(line 794,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testParserUrlNullCharsetFormat()",
      "begin_line": 797,
      "end_line": 801,
      "comment": "",
      "child_ranges": [
        "(line 799,col 9)-(line 799,col 112)",
        "(line 800,col 9)-(line 800,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testParseStringNullFormat()",
      "begin_line": 803,
      "end_line": 806,
      "comment": "",
      "child_ranges": [
        "(line 805,col 9)-(line 805,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testParseUrlCharsetNullFormat()",
      "begin_line": 808,
      "end_line": 812,
      "comment": "",
      "child_ranges": [
        "(line 810,col 9)-(line 810,col 119)",
        "(line 811,col 9)-(line 811,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testProvidedHeader()",
      "begin_line": 814,
      "end_line": 833,
      "comment": "",
      "child_ranges": [
        "(line 816,col 9)-(line 816,col 66)",
        "(line 818,col 9)-(line 818,col 109)",
        "(line 820,col 9)-(line 830,col 9)",
        "(line 832,col 9)-(line 832,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testProvidedHeaderAuto()",
      "begin_line": 835,
      "end_line": 854,
      "comment": "",
      "child_ranges": [
        "(line 837,col 9)-(line 837,col 66)",
        "(line 839,col 9)-(line 839,col 96)",
        "(line 841,col 9)-(line 851,col 9)",
        "(line 853,col 9)-(line 853,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testRoundtrip()",
      "begin_line": 856,
      "end_line": 866,
      "comment": "",
      "child_ranges": [
        "(line 858,col 9)-(line 858,col 52)",
        "(line 859,col 9)-(line 859,col 74)",
        "(line 860,col 9)-(line 860,col 59)",
        "(line 861,col 9)-(line 863,col 9)",
        "(line 864,col 9)-(line 864,col 44)",
        "(line 865,col 9)-(line 865,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testSkipAutoHeader()",
      "begin_line": 868,
      "end_line": 876,
      "comment": "",
      "child_ranges": [
        "(line 870,col 9)-(line 870,col 66)",
        "(line 871,col 9)-(line 871,col 96)",
        "(line 872,col 9)-(line 872,col 48)",
        "(line 873,col 9)-(line 873,col 43)",
        "(line 874,col 9)-(line 874,col 43)",
        "(line 875,col 9)-(line 875,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testSkipSetHeader()",
      "begin_line": 878,
      "end_line": 887,
      "comment": "",
      "child_ranges": [
        "(line 880,col 9)-(line 880,col 66)",
        "(line 881,col 9)-(line 882,col 38)",
        "(line 883,col 9)-(line 883,col 48)",
        "(line 884,col 9)-(line 884,col 43)",
        "(line 885,col 9)-(line 885,col 43)",
        "(line 886,col 9)-(line 886,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.validateLineNumbers(java.lang.String)",
      "begin_line": 889,
      "end_line": 903,
      "comment": "",
      "child_ranges": [
        "(line 890,col 9)-(line 890,col 152)",
        "(line 891,col 9)-(line 891,col 55)",
        "(line 892,col 9)-(line 892,col 43)",
        "(line 893,col 9)-(line 893,col 55)",
        "(line 894,col 9)-(line 894,col 43)",
        "(line 895,col 9)-(line 895,col 55)",
        "(line 896,col 9)-(line 896,col 43)",
        "(line 898,col 9)-(line 898,col 55)",
        "(line 899,col 9)-(line 899,col 40)",
        "(line 901,col 9)-(line 901,col 55)",
        "(line 902,col 9)-(line 902,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.validateRecordNumbers(java.lang.String)",
      "begin_line": 905,
      "end_line": 921,
      "comment": "",
      "child_ranges": [
        "(line 906,col 9)-(line 906,col 152)",
        "(line 907,col 9)-(line 907,col 25)",
        "(line 908,col 9)-(line 908,col 50)",
        "(line 909,col 9)-(line 909,col 52)",
        "(line 910,col 9)-(line 910,col 50)",
        "(line 911,col 9)-(line 911,col 50)",
        "(line 912,col 9)-(line 912,col 52)",
        "(line 913,col 9)-(line 913,col 50)",
        "(line 914,col 9)-(line 914,col 50)",
        "(line 915,col 9)-(line 915,col 52)",
        "(line 916,col 9)-(line 916,col 50)",
        "(line 917,col 9)-(line 917,col 50)",
        "(line 918,col 9)-(line 918,col 49)",
        "(line 919,col 9)-(line 919,col 50)",
        "(line 920,col 9)-(line 920,col 23)"
      ]
    }
  ]
}