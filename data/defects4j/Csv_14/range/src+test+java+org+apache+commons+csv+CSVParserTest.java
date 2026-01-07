{
  "filepath": "/tmp/Csv-14b/src/test/java/org/apache/commons/csv/CSVParserTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CSVParserTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 62,
      "end_line": 1068,
      "comment": "\n * CSVParserTest\n *\n * The test are organized in three different sections: The \u0027setter/getter\u0027 section, the lexer section and finally the\n * parser section. In case a test fails, you should follow a top-down approach for fixing a potential bug (its likely\n * that the parser itself fails if the lexer has problems...).\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "UTF_8"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UTF_8_NAME"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CSV_INPUT"
      ],
      "begin_line": 68,
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
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.createBOMInputStream(java.lang.String)",
      "begin_line": 79,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 81)",
        "(line 81,col 9)-(line 81,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testBackslashEscaping()",
      "begin_line": 84,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 91,col 9)-(line 101,col 21)",
        "(line 102,col 9)-(line 110,col 92)",
        "(line 112,col 9)-(line 113,col 40)",
        "(line 115,col 9)-(line 120,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testBackslashEscaping2()",
      "begin_line": 123,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 130,col 9)-(line 133,col 21)",
        "(line 134,col 9)-(line 137,col 10)",
        "(line 139,col 9)-(line 140,col 40)",
        "(line 142,col 9)-(line 147,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testBackslashEscapingOld()",
      "begin_line": 150,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 153,col 9)-(line 154,col 104)",
        "(line 155,col 9)-(line 160,col 10)",
        "(line 161,col 9)-(line 168,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testBOM()",
      "begin_line": 171,
      "end_line": 182,
      "comment": "",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 96)",
        "(line 175,col 9)-(line 181,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testBOMInputStream_ParserWithReader()",
      "begin_line": 184,
      "end_line": 185,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testBOMInputStream_parseWithReader()",
      "begin_line": 199,
      "end_line": 200,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testBOMInputStream_ParserWithInputStream()",
      "begin_line": 214,
      "end_line": 215,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testCarriageReturnEndings()",
      "begin_line": 229,
      "end_line": 236,
      "comment": "",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 61)",
        "(line 232,col 9)-(line 235,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testCarriageReturnLineFeedEndings()",
      "begin_line": 238,
      "end_line": 245,
      "comment": "",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 67)",
        "(line 241,col 9)-(line 244,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testClose()",
      "begin_line": 247,
      "end_line": 257,
      "comment": "",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 77)",
        "(line 250,col 9)-(line 250,col 42)",
        "(line 251,col 9)-(line 254,col 9)",
        "(line 255,col 9)-(line 255,col 39)",
        "(line 256,col 9)-(line 256,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testCSV57()",
      "begin_line": 259,
      "end_line": 266,
      "comment": "",
      "child_ranges": [
        "(line 261,col 9)-(line 265,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testDefaultFormat()",
      "begin_line": 268,
      "end_line": 294,
      "comment": "",
      "child_ranges": [
        "(line 270,col 9)-(line 274,col 17)",
        "(line 275,col 9)-(line 275,col 105)",
        "(line 277,col 9)-(line 277,col 45)",
        "(line 278,col 9)-(line 278,col 49)",
        "(line 279,col 9)-(line 279,col 79)",
        "(line 281,col 9)-(line 288,col 9)",
        "(line 289,col 9)-(line 293,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testDuplicateHeaders()",
      "begin_line": 296,
      "end_line": 299,
      "comment": "",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testEmptyFile()",
      "begin_line": 301,
      "end_line": 306,
      "comment": "",
      "child_ranges": [
        "(line 303,col 9)-(line 305,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testEmptyLineBehaviourCSV()",
      "begin_line": 308,
      "end_line": 323,
      "comment": "",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 118)",
        "(line 311,col 9)-(line 312,col 10)",
        "(line 313,col 9)-(line 322,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testEmptyLineBehaviourExcel()",
      "begin_line": 325,
      "end_line": 340,
      "comment": "",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 118)",
        "(line 328,col 9)-(line 329,col 25)",
        "(line 330,col 9)-(line 339,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testEndOfFileBehaviorCSV()",
      "begin_line": 342,
      "end_line": 359,
      "comment": "",
      "child_ranges": [
        "(line 344,col 9)-(line 346,col 75)",
        "(line 347,col 9)-(line 348,col 34)",
        "(line 349,col 9)-(line 358,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testEndOfFileBehaviourExcel()",
      "begin_line": 361,
      "end_line": 379,
      "comment": "",
      "child_ranges": [
        "(line 363,col 9)-(line 365,col 75)",
        "(line 366,col 9)-(line 367,col 34)",
        "(line 369,col 9)-(line 378,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testExcelFormat1()",
      "begin_line": 381,
      "end_line": 395,
      "comment": "",
      "child_ranges": [
        "(line 383,col 9)-(line 384,col 82)",
        "(line 385,col 9)-(line 386,col 96)",
        "(line 387,col 9)-(line 394,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testExcelFormat2()",
      "begin_line": 397,
      "end_line": 409,
      "comment": "",
      "child_ranges": [
        "(line 399,col 9)-(line 399,col 71)",
        "(line 400,col 9)-(line 400,col 103)",
        "(line 401,col 9)-(line 408,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testExcelHeaderCountLessThanData()",
      "begin_line": 414,
      "end_line": 424,
      "comment": "\n     * Tests an exported Excel worksheet with a header row and rows that have more columns than the headers\n     ",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 55)",
        "(line 417,col 9)-(line 423,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testForEach()",
      "begin_line": 426,
      "end_line": 438,
      "comment": "",
      "child_ranges": [
        "(line 428,col 9)-(line 428,col 58)",
        "(line 429,col 9)-(line 437,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetHeaderMap()",
      "begin_line": 440,
      "end_line": 463,
      "comment": "",
      "child_ranges": [
        "(line 442,col 9)-(line 462,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetLine()",
      "begin_line": 465,
      "end_line": 474,
      "comment": "",
      "child_ranges": [
        "(line 467,col 9)-(line 473,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetLineNumberWithCR()",
      "begin_line": 476,
      "end_line": 479,
      "comment": "",
      "child_ranges": [
        "(line 478,col 9)-(line 478,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetLineNumberWithCRLF()",
      "begin_line": 481,
      "end_line": 484,
      "comment": "",
      "child_ranges": [
        "(line 483,col 9)-(line 483,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetLineNumberWithLF()",
      "begin_line": 486,
      "end_line": 489,
      "comment": "",
      "child_ranges": [
        "(line 488,col 9)-(line 488,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetOneLine()",
      "begin_line": 491,
      "end_line": 497,
      "comment": "",
      "child_ranges": [
        "(line 493,col 9)-(line 496,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetOneLineOneParser()",
      "begin_line": 504,
      "end_line": 518,
      "comment": "\n     * Tests reusing a parser to process new string records one at a time as they are being discovered. See [CSV-110].\n     *\n     * @throws IOException\n     ",
      "child_ranges": [
        "(line 506,col 9)-(line 506,col 51)",
        "(line 507,col 9)-(line 517,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetRecordNumberWithCR()",
      "begin_line": 520,
      "end_line": 523,
      "comment": "",
      "child_ranges": [
        "(line 522,col 9)-(line 522,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetRecordNumberWithCRLF()",
      "begin_line": 525,
      "end_line": 528,
      "comment": "",
      "child_ranges": [
        "(line 527,col 9)-(line 527,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetRecordNumberWithLF()",
      "begin_line": 530,
      "end_line": 533,
      "comment": "",
      "child_ranges": [
        "(line 532,col 9)-(line 532,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetRecordPositionWithCRLF()",
      "begin_line": 535,
      "end_line": 538,
      "comment": "",
      "child_ranges": [
        "(line 537,col 9)-(line 537,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetRecordPositionWithLF()",
      "begin_line": 540,
      "end_line": 543,
      "comment": "",
      "child_ranges": [
        "(line 542,col 9)-(line 542,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetRecords()",
      "begin_line": 545,
      "end_line": 555,
      "comment": "",
      "child_ranges": [
        "(line 547,col 9)-(line 554,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetRecordWithMultiLineValues()",
      "begin_line": 557,
      "end_line": 581,
      "comment": "",
      "child_ranges": [
        "(line 559,col 9)-(line 580,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testHeader()",
      "begin_line": 583,
      "end_line": 598,
      "comment": "",
      "child_ranges": [
        "(line 585,col 9)-(line 585,col 66)",
        "(line 587,col 9)-(line 587,col 96)",
        "(line 589,col 9)-(line 595,col 9)",
        "(line 597,col 9)-(line 597,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testHeaderComment()",
      "begin_line": 600,
      "end_line": 615,
      "comment": "",
      "child_ranges": [
        "(line 602,col 9)-(line 602,col 77)",
        "(line 604,col 9)-(line 604,col 119)",
        "(line 606,col 9)-(line 612,col 9)",
        "(line 614,col 9)-(line 614,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testHeaderMissing()",
      "begin_line": 617,
      "end_line": 631,
      "comment": "",
      "child_ranges": [
        "(line 619,col 9)-(line 619,col 65)",
        "(line 621,col 9)-(line 621,col 96)",
        "(line 623,col 9)-(line 628,col 9)",
        "(line 630,col 9)-(line 630,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testHeaderMissingWithNull()",
      "begin_line": 633,
      "end_line": 637,
      "comment": "",
      "child_ranges": [
        "(line 635,col 9)-(line 635,col 73)",
        "(line 636,col 9)-(line 636,col 109)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testHeadersMissing()",
      "begin_line": 639,
      "end_line": 643,
      "comment": "",
      "child_ranges": [
        "(line 641,col 9)-(line 641,col 73)",
        "(line 642,col 9)-(line 642,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testHeadersMissingException()",
      "begin_line": 645,
      "end_line": 649,
      "comment": "",
      "child_ranges": [
        "(line 647,col 9)-(line 647,col 73)",
        "(line 648,col 9)-(line 648,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testIgnoreCaseHeaderMapping()",
      "begin_line": 651,
      "end_line": 660,
      "comment": "",
      "child_ranges": [
        "(line 653,col 9)-(line 653,col 52)",
        "(line 654,col 9)-(line 655,col 38)",
        "(line 656,col 9)-(line 656,col 48)",
        "(line 657,col 9)-(line 657,col 45)",
        "(line 658,col 9)-(line 658,col 45)",
        "(line 659,col 9)-(line 659,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testIgnoreEmptyLines()",
      "begin_line": 662,
      "end_line": 671,
      "comment": "",
      "child_ranges": [
        "(line 664,col 9)-(line 664,col 64)",
        "(line 667,col 9)-(line 670,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testInvalidFormat()",
      "begin_line": 673,
      "end_line": 679,
      "comment": "",
      "child_ranges": [
        "(line 675,col 9)-(line 675,col 76)",
        "(line 676,col 9)-(line 678,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testIterator()",
      "begin_line": 681,
      "end_line": 708,
      "comment": "",
      "child_ranges": [
        "(line 683,col 9)-(line 683,col 66)",
        "(line 685,col 9)-(line 685,col 84)",
        "(line 687,col 9)-(line 687,col 39)",
        "(line 688,col 9)-(line 693,col 9)",
        "(line 694,col 9)-(line 694,col 84)",
        "(line 695,col 9)-(line 695,col 84)",
        "(line 696,col 9)-(line 696,col 39)",
        "(line 697,col 9)-(line 697,col 39)",
        "(line 698,col 9)-(line 698,col 39)",
        "(line 699,col 9)-(line 699,col 84)",
        "(line 700,col 9)-(line 700,col 40)",
        "(line 702,col 9)-(line 707,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testLineFeedEndings()",
      "begin_line": 710,
      "end_line": 717,
      "comment": "",
      "child_ranges": [
        "(line 712,col 9)-(line 712,col 61)",
        "(line 713,col 9)-(line 716,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testMappedButNotSetAsOutlook2007ContactExport()",
      "begin_line": 719,
      "end_line": 752,
      "comment": "",
      "child_ranges": [
        "(line 721,col 9)-(line 721,col 64)",
        "(line 722,col 9)-(line 723,col 28)",
        "(line 724,col 9)-(line 724,col 25)",
        "(line 727,col 9)-(line 727,col 32)",
        "(line 728,col 9)-(line 728,col 41)",
        "(line 729,col 9)-(line 729,col 41)",
        "(line 730,col 9)-(line 730,col 41)",
        "(line 731,col 9)-(line 731,col 38)",
        "(line 732,col 9)-(line 732,col 38)",
        "(line 733,col 9)-(line 733,col 39)",
        "(line 734,col 9)-(line 734,col 43)",
        "(line 735,col 9)-(line 735,col 43)",
        "(line 736,col 9)-(line 736,col 43)",
        "(line 739,col 9)-(line 739,col 32)",
        "(line 740,col 9)-(line 740,col 41)",
        "(line 741,col 9)-(line 741,col 41)",
        "(line 742,col 9)-(line 742,col 41)",
        "(line 743,col 9)-(line 743,col 38)",
        "(line 744,col 9)-(line 744,col 38)",
        "(line 745,col 9)-(line 745,col 38)",
        "(line 746,col 9)-(line 746,col 43)",
        "(line 747,col 9)-(line 747,col 43)",
        "(line 748,col 9)-(line 748,col 43)",
        "(line 749,col 9)-(line 749,col 42)",
        "(line 751,col 9)-(line 751,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testMultipleIterators()",
      "begin_line": 754,
      "end_line": 771,
      "comment": "",
      "child_ranges": [
        "(line 757,col 9)-(line 770,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testNewCSVParserNullReaderFormat()",
      "begin_line": 773,
      "end_line": 778,
      "comment": "",
      "child_ranges": [
        "(line 775,col 9)-(line 777,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testNewCSVParserReaderNullFormat()",
      "begin_line": 780,
      "end_line": 785,
      "comment": "",
      "child_ranges": [
        "(line 782,col 9)-(line 784,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testNoHeaderMap()",
      "begin_line": 787,
      "end_line": 792,
      "comment": "",
      "child_ranges": [
        "(line 789,col 9)-(line 791,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testParseFileNullFormat()",
      "begin_line": 794,
      "end_line": 797,
      "comment": "",
      "child_ranges": [
        "(line 796,col 9)-(line 796,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testParseNullFileFormat()",
      "begin_line": 799,
      "end_line": 802,
      "comment": "",
      "child_ranges": [
        "(line 801,col 9)-(line 801,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testParseNullStringFormat()",
      "begin_line": 804,
      "end_line": 807,
      "comment": "",
      "child_ranges": [
        "(line 806,col 9)-(line 806,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testParseNullUrlCharsetFormat()",
      "begin_line": 809,
      "end_line": 812,
      "comment": "",
      "child_ranges": [
        "(line 811,col 9)-(line 811,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testParserUrlNullCharsetFormat()",
      "begin_line": 814,
      "end_line": 819,
      "comment": "",
      "child_ranges": [
        "(line 816,col 9)-(line 818,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testParseStringNullFormat()",
      "begin_line": 821,
      "end_line": 824,
      "comment": "",
      "child_ranges": [
        "(line 823,col 9)-(line 823,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testParseUrlCharsetNullFormat()",
      "begin_line": 826,
      "end_line": 831,
      "comment": "",
      "child_ranges": [
        "(line 828,col 9)-(line 830,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testProvidedHeader()",
      "begin_line": 833,
      "end_line": 852,
      "comment": "",
      "child_ranges": [
        "(line 835,col 9)-(line 835,col 66)",
        "(line 837,col 9)-(line 837,col 109)",
        "(line 839,col 9)-(line 849,col 9)",
        "(line 851,col 9)-(line 851,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testProvidedHeaderAuto()",
      "begin_line": 854,
      "end_line": 873,
      "comment": "",
      "child_ranges": [
        "(line 856,col 9)-(line 856,col 66)",
        "(line 858,col 9)-(line 858,col 96)",
        "(line 860,col 9)-(line 870,col 9)",
        "(line 872,col 9)-(line 872,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testRoundtrip()",
      "begin_line": 875,
      "end_line": 885,
      "comment": "",
      "child_ranges": [
        "(line 877,col 9)-(line 877,col 52)",
        "(line 878,col 9)-(line 884,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testSkipAutoHeader()",
      "begin_line": 887,
      "end_line": 895,
      "comment": "",
      "child_ranges": [
        "(line 889,col 9)-(line 889,col 66)",
        "(line 890,col 9)-(line 890,col 96)",
        "(line 891,col 9)-(line 891,col 48)",
        "(line 892,col 9)-(line 892,col 43)",
        "(line 893,col 9)-(line 893,col 43)",
        "(line 894,col 9)-(line 894,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testSkipHeaderOverrideDuplicateHeaders()",
      "begin_line": 897,
      "end_line": 906,
      "comment": "",
      "child_ranges": [
        "(line 899,col 9)-(line 899,col 66)",
        "(line 900,col 9)-(line 901,col 28)",
        "(line 902,col 9)-(line 902,col 48)",
        "(line 903,col 9)-(line 903,col 43)",
        "(line 904,col 9)-(line 904,col 43)",
        "(line 905,col 9)-(line 905,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testSkipSetAltHeaders()",
      "begin_line": 908,
      "end_line": 917,
      "comment": "",
      "child_ranges": [
        "(line 910,col 9)-(line 910,col 66)",
        "(line 911,col 9)-(line 912,col 28)",
        "(line 913,col 9)-(line 913,col 48)",
        "(line 914,col 9)-(line 914,col 43)",
        "(line 915,col 9)-(line 915,col 43)",
        "(line 916,col 9)-(line 916,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testSkipSetHeader()",
      "begin_line": 919,
      "end_line": 928,
      "comment": "",
      "child_ranges": [
        "(line 921,col 9)-(line 921,col 66)",
        "(line 922,col 9)-(line 923,col 28)",
        "(line 924,col 9)-(line 924,col 48)",
        "(line 925,col 9)-(line 925,col 43)",
        "(line 926,col 9)-(line 926,col 43)",
        "(line 927,col 9)-(line 927,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testStartWithEmptyLinesThenHeaders()",
      "begin_line": 930,
      "end_line": 947,
      "comment": "",
      "child_ranges": [
        "(line 933,col 9)-(line 934,col 37)",
        "(line 935,col 9)-(line 936,col 25)",
        "(line 937,col 9)-(line 946,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testTrailingDelimiter()",
      "begin_line": 949,
      "end_line": 959,
      "comment": "",
      "child_ranges": [
        "(line 951,col 9)-(line 951,col 81)",
        "(line 952,col 9)-(line 953,col 62)",
        "(line 954,col 9)-(line 954,col 48)",
        "(line 955,col 9)-(line 955,col 43)",
        "(line 956,col 9)-(line 956,col 43)",
        "(line 957,col 9)-(line 957,col 43)",
        "(line 958,col 9)-(line 958,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testTrim()",
      "begin_line": 961,
      "end_line": 971,
      "comment": "",
      "child_ranges": [
        "(line 963,col 9)-(line 963,col 84)",
        "(line 964,col 9)-(line 965,col 49)",
        "(line 966,col 9)-(line 966,col 48)",
        "(line 967,col 9)-(line 967,col 43)",
        "(line 968,col 9)-(line 968,col 43)",
        "(line 969,col 9)-(line 969,col 43)",
        "(line 970,col 9)-(line 970,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.validateLineNumbers(java.lang.String)",
      "begin_line": 973,
      "end_line": 988,
      "comment": "",
      "child_ranges": [
        "(line 974,col 9)-(line 987,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.validateRecordNumbers(java.lang.String)",
      "begin_line": 990,
      "end_line": 1007,
      "comment": "",
      "child_ranges": [
        "(line 991,col 9)-(line 1006,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.validateRecordPosition(java.lang.String)",
      "begin_line": 1009,
      "end_line": 1067,
      "comment": "",
      "child_ranges": [
        "(line 1010,col 9)-(line 1010,col 40)",
        "(line 1012,col 9)-(line 1017,col 71)",
        "(line 1019,col 9)-(line 1019,col 109)",
        "(line 1020,col 9)-(line 1020,col 57)",
        "(line 1022,col 9)-(line 1022,col 25)",
        "(line 1023,col 9)-(line 1023,col 50)",
        "(line 1025,col 9)-(line 1025,col 52)",
        "(line 1026,col 9)-(line 1026,col 50)",
        "(line 1027,col 9)-(line 1027,col 71)",
        "(line 1029,col 9)-(line 1029,col 52)",
        "(line 1030,col 9)-(line 1030,col 50)",
        "(line 1031,col 9)-(line 1031,col 71)",
        "(line 1033,col 9)-(line 1033,col 52)",
        "(line 1034,col 9)-(line 1034,col 67)",
        "(line 1035,col 9)-(line 1035,col 50)",
        "(line 1036,col 9)-(line 1036,col 72)",
        "(line 1037,col 9)-(line 1037,col 63)",
        "(line 1038,col 9)-(line 1038,col 63)",
        "(line 1039,col 9)-(line 1039,col 42)",
        "(line 1041,col 9)-(line 1041,col 52)",
        "(line 1042,col 9)-(line 1042,col 50)",
        "(line 1043,col 9)-(line 1043,col 76)",
        "(line 1045,col 9)-(line 1045,col 52)",
        "(line 1046,col 9)-(line 1046,col 50)",
        "(line 1047,col 9)-(line 1047,col 73)",
        "(line 1049,col 9)-(line 1049,col 23)",
        "(line 1052,col 9)-(line 1052,col 116)",
        "(line 1054,col 9)-(line 1054,col 52)",
        "(line 1055,col 9)-(line 1055,col 50)",
        "(line 1056,col 9)-(line 1056,col 72)",
        "(line 1057,col 9)-(line 1057,col 63)",
        "(line 1058,col 9)-(line 1058,col 63)",
        "(line 1059,col 9)-(line 1059,col 42)",
        "(line 1061,col 9)-(line 1061,col 52)",
        "(line 1062,col 9)-(line 1062,col 50)",
        "(line 1063,col 9)-(line 1063,col 76)",
        "(line 1064,col 9)-(line 1064,col 46)",
        "(line 1066,col 9)-(line 1066,col 23)"
      ]
    }
  ]
}