{
  "filepath": "/tmp/Csv-16b/src/test/java/org/apache/commons/csv/CSVParserTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CSVParserTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 60,
      "end_line": 1152,
      "comment": "\n * CSVParserTest\n *\n * The test are organized in three different sections: The \u0027setter/getter\u0027 section, the lexer section and finally the\n * parser section. In case a test fails, you should follow a top-down approach for fixing a potential bug (its likely\n * that the parser itself fails if the lexer has problems...).\n "
    },
    {
      "type": "field",
      "varNames": [
        "UTF_8"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UTF_8_NAME"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CSV_INPUT"
      ],
      "begin_line": 66,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CSV_INPUT_1"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CSV_INPUT_2"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "RESULT"
      ],
      "begin_line": 74,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.createBOMInputStream(java.lang.String)",
      "begin_line": 77,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 81)",
        "(line 79,col 9)-(line 79,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testBackslashEscaping()",
      "begin_line": 82,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 99,col 21)",
        "(line 100,col 9)-(line 108,col 92)",
        "(line 110,col 9)-(line 111,col 40)",
        "(line 113,col 9)-(line 118,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testBackslashEscaping2()",
      "begin_line": 121,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 128,col 9)-(line 131,col 21)",
        "(line 132,col 9)-(line 135,col 10)",
        "(line 137,col 9)-(line 138,col 40)",
        "(line 140,col 9)-(line 145,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testBackslashEscapingOld()",
      "begin_line": 148,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 151,col 9)-(line 152,col 104)",
        "(line 153,col 9)-(line 158,col 10)",
        "(line 159,col 9)-(line 166,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testBOM()",
      "begin_line": 169,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 96)",
        "(line 173,col 9)-(line 179,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testBOMInputStream_ParserWithReader()",
      "begin_line": 182,
      "end_line": 183,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testBOMInputStream_parseWithReader()",
      "begin_line": 197,
      "end_line": 198,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testBOMInputStream_ParserWithInputStream()",
      "begin_line": 212,
      "end_line": 213,
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
        "(line 230,col 9)-(line 233,col 9)"
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
        "(line 239,col 9)-(line 242,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testFirstEndOfLineCrLf()",
      "begin_line": 245,
      "end_line": 253,
      "comment": "",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 67)",
        "(line 248,col 9)-(line 252,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testFirstEndOfLineLf()",
      "begin_line": 255,
      "end_line": 263,
      "comment": "",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 61)",
        "(line 258,col 9)-(line 262,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testFirstEndOfLineCr()",
      "begin_line": 265,
      "end_line": 273,
      "comment": "",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 61)",
        "(line 268,col 9)-(line 272,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testClose()",
      "begin_line": 275,
      "end_line": 285,
      "comment": "",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 77)",
        "(line 278,col 9)-(line 278,col 42)",
        "(line 279,col 9)-(line 282,col 9)",
        "(line 283,col 9)-(line 283,col 39)",
        "(line 284,col 9)-(line 284,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testCSV57()",
      "begin_line": 287,
      "end_line": 294,
      "comment": "",
      "child_ranges": [
        "(line 289,col 9)-(line 293,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testDefaultFormat()",
      "begin_line": 296,
      "end_line": 322,
      "comment": "",
      "child_ranges": [
        "(line 298,col 9)-(line 302,col 17)",
        "(line 303,col 9)-(line 303,col 105)",
        "(line 305,col 9)-(line 305,col 45)",
        "(line 306,col 9)-(line 306,col 49)",
        "(line 307,col 9)-(line 307,col 79)",
        "(line 309,col 9)-(line 316,col 9)",
        "(line 317,col 9)-(line 321,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testDuplicateHeaders()",
      "begin_line": 324,
      "end_line": 327,
      "comment": "",
      "child_ranges": [
        "(line 326,col 9)-(line 326,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testEmptyFile()",
      "begin_line": 329,
      "end_line": 334,
      "comment": "",
      "child_ranges": [
        "(line 331,col 9)-(line 333,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testEmptyLineBehaviourCSV()",
      "begin_line": 336,
      "end_line": 351,
      "comment": "",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 118)",
        "(line 339,col 9)-(line 340,col 10)",
        "(line 341,col 9)-(line 350,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testEmptyLineBehaviourExcel()",
      "begin_line": 353,
      "end_line": 368,
      "comment": "",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 118)",
        "(line 356,col 9)-(line 357,col 25)",
        "(line 358,col 9)-(line 367,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testEndOfFileBehaviorCSV()",
      "begin_line": 370,
      "end_line": 387,
      "comment": "",
      "child_ranges": [
        "(line 372,col 9)-(line 374,col 75)",
        "(line 375,col 9)-(line 376,col 34)",
        "(line 377,col 9)-(line 386,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testEndOfFileBehaviourExcel()",
      "begin_line": 389,
      "end_line": 407,
      "comment": "",
      "child_ranges": [
        "(line 391,col 9)-(line 393,col 75)",
        "(line 394,col 9)-(line 395,col 34)",
        "(line 397,col 9)-(line 406,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testExcelFormat1()",
      "begin_line": 409,
      "end_line": 423,
      "comment": "",
      "child_ranges": [
        "(line 411,col 9)-(line 412,col 82)",
        "(line 413,col 9)-(line 414,col 96)",
        "(line 415,col 9)-(line 422,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testExcelFormat2()",
      "begin_line": 425,
      "end_line": 437,
      "comment": "",
      "child_ranges": [
        "(line 427,col 9)-(line 427,col 71)",
        "(line 428,col 9)-(line 428,col 103)",
        "(line 429,col 9)-(line 436,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testExcelHeaderCountLessThanData()",
      "begin_line": 442,
      "end_line": 452,
      "comment": "\n     * Tests an exported Excel worksheet with a header row and rows that have more columns than the headers\n     ",
      "child_ranges": [
        "(line 444,col 9)-(line 444,col 55)",
        "(line 445,col 9)-(line 451,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testForEach()",
      "begin_line": 454,
      "end_line": 466,
      "comment": "",
      "child_ranges": [
        "(line 456,col 9)-(line 456,col 58)",
        "(line 457,col 9)-(line 465,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetHeaderMap()",
      "begin_line": 468,
      "end_line": 491,
      "comment": "",
      "child_ranges": [
        "(line 470,col 9)-(line 490,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetLine()",
      "begin_line": 493,
      "end_line": 502,
      "comment": "",
      "child_ranges": [
        "(line 495,col 9)-(line 501,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetLineNumberWithCR()",
      "begin_line": 504,
      "end_line": 507,
      "comment": "",
      "child_ranges": [
        "(line 506,col 9)-(line 506,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetLineNumberWithCRLF()",
      "begin_line": 509,
      "end_line": 512,
      "comment": "",
      "child_ranges": [
        "(line 511,col 9)-(line 511,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetLineNumberWithLF()",
      "begin_line": 514,
      "end_line": 517,
      "comment": "",
      "child_ranges": [
        "(line 516,col 9)-(line 516,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetOneLine()",
      "begin_line": 519,
      "end_line": 525,
      "comment": "",
      "child_ranges": [
        "(line 521,col 9)-(line 524,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetOneLineOneParser()",
      "begin_line": 532,
      "end_line": 546,
      "comment": "\n     * Tests reusing a parser to process new string records one at a time as they are being discovered. See [CSV-110].\n     *\n     * @throws IOException\n     ",
      "child_ranges": [
        "(line 534,col 9)-(line 534,col 51)",
        "(line 535,col 9)-(line 545,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetRecordNumberWithCR()",
      "begin_line": 548,
      "end_line": 551,
      "comment": "",
      "child_ranges": [
        "(line 550,col 9)-(line 550,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetRecordNumberWithCRLF()",
      "begin_line": 553,
      "end_line": 556,
      "comment": "",
      "child_ranges": [
        "(line 555,col 9)-(line 555,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetRecordNumberWithLF()",
      "begin_line": 558,
      "end_line": 561,
      "comment": "",
      "child_ranges": [
        "(line 560,col 9)-(line 560,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetRecordPositionWithCRLF()",
      "begin_line": 563,
      "end_line": 566,
      "comment": "",
      "child_ranges": [
        "(line 565,col 9)-(line 565,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetRecordPositionWithLF()",
      "begin_line": 568,
      "end_line": 571,
      "comment": "",
      "child_ranges": [
        "(line 570,col 9)-(line 570,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetRecords()",
      "begin_line": 573,
      "end_line": 583,
      "comment": "",
      "child_ranges": [
        "(line 575,col 9)-(line 582,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetRecordWithMultiLineValues()",
      "begin_line": 585,
      "end_line": 609,
      "comment": "",
      "child_ranges": [
        "(line 587,col 9)-(line 608,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testHeader()",
      "begin_line": 611,
      "end_line": 626,
      "comment": "",
      "child_ranges": [
        "(line 613,col 9)-(line 613,col 66)",
        "(line 615,col 9)-(line 615,col 96)",
        "(line 617,col 9)-(line 623,col 9)",
        "(line 625,col 9)-(line 625,col 39)"
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
      "signature": "org.apache.commons.csv.CSVParserTest.testHeaderMissing()",
      "begin_line": 645,
      "end_line": 659,
      "comment": "",
      "child_ranges": [
        "(line 647,col 9)-(line 647,col 65)",
        "(line 649,col 9)-(line 649,col 96)",
        "(line 651,col 9)-(line 656,col 9)",
        "(line 658,col 9)-(line 658,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testHeaderMissingWithNull()",
      "begin_line": 661,
      "end_line": 665,
      "comment": "",
      "child_ranges": [
        "(line 663,col 9)-(line 663,col 73)",
        "(line 664,col 9)-(line 664,col 109)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testHeadersMissing()",
      "begin_line": 667,
      "end_line": 671,
      "comment": "",
      "child_ranges": [
        "(line 669,col 9)-(line 669,col 73)",
        "(line 670,col 9)-(line 670,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testHeadersMissingException()",
      "begin_line": 673,
      "end_line": 677,
      "comment": "",
      "child_ranges": [
        "(line 675,col 9)-(line 675,col 73)",
        "(line 676,col 9)-(line 676,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testIgnoreCaseHeaderMapping()",
      "begin_line": 679,
      "end_line": 688,
      "comment": "",
      "child_ranges": [
        "(line 681,col 9)-(line 681,col 52)",
        "(line 682,col 9)-(line 683,col 38)",
        "(line 684,col 9)-(line 684,col 48)",
        "(line 685,col 9)-(line 685,col 45)",
        "(line 686,col 9)-(line 686,col 45)",
        "(line 687,col 9)-(line 687,col 47)"
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
        "(line 695,col 9)-(line 698,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testInvalidFormat()",
      "begin_line": 701,
      "end_line": 707,
      "comment": "",
      "child_ranges": [
        "(line 703,col 9)-(line 703,col 76)",
        "(line 704,col 9)-(line 706,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testIterator()",
      "begin_line": 709,
      "end_line": 736,
      "comment": "",
      "child_ranges": [
        "(line 711,col 9)-(line 711,col 66)",
        "(line 713,col 9)-(line 713,col 84)",
        "(line 715,col 9)-(line 715,col 39)",
        "(line 716,col 9)-(line 721,col 9)",
        "(line 722,col 9)-(line 722,col 84)",
        "(line 723,col 9)-(line 723,col 84)",
        "(line 724,col 9)-(line 724,col 39)",
        "(line 725,col 9)-(line 725,col 39)",
        "(line 726,col 9)-(line 726,col 39)",
        "(line 727,col 9)-(line 727,col 84)",
        "(line 728,col 9)-(line 728,col 40)",
        "(line 730,col 9)-(line 735,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testLineFeedEndings()",
      "begin_line": 738,
      "end_line": 745,
      "comment": "",
      "child_ranges": [
        "(line 740,col 9)-(line 740,col 61)",
        "(line 741,col 9)-(line 744,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testMappedButNotSetAsOutlook2007ContactExport()",
      "begin_line": 747,
      "end_line": 780,
      "comment": "",
      "child_ranges": [
        "(line 749,col 9)-(line 749,col 64)",
        "(line 750,col 9)-(line 751,col 28)",
        "(line 752,col 9)-(line 752,col 25)",
        "(line 755,col 9)-(line 755,col 32)",
        "(line 756,col 9)-(line 756,col 41)",
        "(line 757,col 9)-(line 757,col 41)",
        "(line 758,col 9)-(line 758,col 41)",
        "(line 759,col 9)-(line 759,col 38)",
        "(line 760,col 9)-(line 760,col 38)",
        "(line 761,col 9)-(line 761,col 39)",
        "(line 762,col 9)-(line 762,col 43)",
        "(line 763,col 9)-(line 763,col 43)",
        "(line 764,col 9)-(line 764,col 43)",
        "(line 767,col 9)-(line 767,col 32)",
        "(line 768,col 9)-(line 768,col 41)",
        "(line 769,col 9)-(line 769,col 41)",
        "(line 770,col 9)-(line 770,col 41)",
        "(line 771,col 9)-(line 771,col 38)",
        "(line 772,col 9)-(line 772,col 38)",
        "(line 773,col 9)-(line 773,col 38)",
        "(line 774,col 9)-(line 774,col 43)",
        "(line 775,col 9)-(line 775,col 43)",
        "(line 776,col 9)-(line 776,col 43)",
        "(line 777,col 9)-(line 777,col 42)",
        "(line 779,col 9)-(line 779,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testMultipleIterators()",
      "begin_line": 782,
      "end_line": 799,
      "comment": "",
      "child_ranges": [
        "(line 785,col 9)-(line 798,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testNewCSVParserNullReaderFormat()",
      "begin_line": 801,
      "end_line": 806,
      "comment": "",
      "child_ranges": [
        "(line 803,col 9)-(line 805,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testNewCSVParserReaderNullFormat()",
      "begin_line": 808,
      "end_line": 813,
      "comment": "",
      "child_ranges": [
        "(line 810,col 9)-(line 812,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testNoHeaderMap()",
      "begin_line": 815,
      "end_line": 820,
      "comment": "",
      "child_ranges": [
        "(line 817,col 9)-(line 819,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testParseFileNullFormat()",
      "begin_line": 822,
      "end_line": 825,
      "comment": "",
      "child_ranges": [
        "(line 824,col 9)-(line 824,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testParseNullFileFormat()",
      "begin_line": 827,
      "end_line": 830,
      "comment": "",
      "child_ranges": [
        "(line 829,col 9)-(line 829,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testParseNullStringFormat()",
      "begin_line": 832,
      "end_line": 835,
      "comment": "",
      "child_ranges": [
        "(line 834,col 9)-(line 834,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testParseNullUrlCharsetFormat()",
      "begin_line": 837,
      "end_line": 840,
      "comment": "",
      "child_ranges": [
        "(line 839,col 9)-(line 839,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testParserUrlNullCharsetFormat()",
      "begin_line": 842,
      "end_line": 847,
      "comment": "",
      "child_ranges": [
        "(line 844,col 9)-(line 846,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testParseStringNullFormat()",
      "begin_line": 849,
      "end_line": 852,
      "comment": "",
      "child_ranges": [
        "(line 851,col 9)-(line 851,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testParseUrlCharsetNullFormat()",
      "begin_line": 854,
      "end_line": 859,
      "comment": "",
      "child_ranges": [
        "(line 856,col 9)-(line 858,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testProvidedHeader()",
      "begin_line": 861,
      "end_line": 880,
      "comment": "",
      "child_ranges": [
        "(line 863,col 9)-(line 863,col 66)",
        "(line 865,col 9)-(line 865,col 109)",
        "(line 867,col 9)-(line 877,col 9)",
        "(line 879,col 9)-(line 879,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testProvidedHeaderAuto()",
      "begin_line": 882,
      "end_line": 901,
      "comment": "",
      "child_ranges": [
        "(line 884,col 9)-(line 884,col 66)",
        "(line 886,col 9)-(line 886,col 96)",
        "(line 888,col 9)-(line 898,col 9)",
        "(line 900,col 9)-(line 900,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testRoundtrip()",
      "begin_line": 903,
      "end_line": 913,
      "comment": "",
      "child_ranges": [
        "(line 905,col 9)-(line 905,col 52)",
        "(line 906,col 9)-(line 912,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testSkipAutoHeader()",
      "begin_line": 915,
      "end_line": 923,
      "comment": "",
      "child_ranges": [
        "(line 917,col 9)-(line 917,col 66)",
        "(line 918,col 9)-(line 918,col 96)",
        "(line 919,col 9)-(line 919,col 48)",
        "(line 920,col 9)-(line 920,col 43)",
        "(line 921,col 9)-(line 921,col 43)",
        "(line 922,col 9)-(line 922,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testSkipHeaderOverrideDuplicateHeaders()",
      "begin_line": 925,
      "end_line": 934,
      "comment": "",
      "child_ranges": [
        "(line 927,col 9)-(line 927,col 66)",
        "(line 928,col 9)-(line 929,col 28)",
        "(line 930,col 9)-(line 930,col 48)",
        "(line 931,col 9)-(line 931,col 43)",
        "(line 932,col 9)-(line 932,col 43)",
        "(line 933,col 9)-(line 933,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testSkipSetAltHeaders()",
      "begin_line": 936,
      "end_line": 945,
      "comment": "",
      "child_ranges": [
        "(line 938,col 9)-(line 938,col 66)",
        "(line 939,col 9)-(line 940,col 28)",
        "(line 941,col 9)-(line 941,col 48)",
        "(line 942,col 9)-(line 942,col 43)",
        "(line 943,col 9)-(line 943,col 43)",
        "(line 944,col 9)-(line 944,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testSkipSetHeader()",
      "begin_line": 947,
      "end_line": 956,
      "comment": "",
      "child_ranges": [
        "(line 949,col 9)-(line 949,col 66)",
        "(line 950,col 9)-(line 951,col 28)",
        "(line 952,col 9)-(line 952,col 48)",
        "(line 953,col 9)-(line 953,col 43)",
        "(line 954,col 9)-(line 954,col 43)",
        "(line 955,col 9)-(line 955,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testStartWithEmptyLinesThenHeaders()",
      "begin_line": 958,
      "end_line": 975,
      "comment": "",
      "child_ranges": [
        "(line 961,col 9)-(line 962,col 37)",
        "(line 963,col 9)-(line 964,col 25)",
        "(line 965,col 9)-(line 974,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testTrailingDelimiter()",
      "begin_line": 977,
      "end_line": 987,
      "comment": "",
      "child_ranges": [
        "(line 979,col 9)-(line 979,col 81)",
        "(line 980,col 9)-(line 981,col 62)",
        "(line 982,col 9)-(line 982,col 48)",
        "(line 983,col 9)-(line 983,col 43)",
        "(line 984,col 9)-(line 984,col 43)",
        "(line 985,col 9)-(line 985,col 43)",
        "(line 986,col 9)-(line 986,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testTrim()",
      "begin_line": 989,
      "end_line": 999,
      "comment": "",
      "child_ranges": [
        "(line 991,col 9)-(line 991,col 84)",
        "(line 992,col 9)-(line 993,col 49)",
        "(line 994,col 9)-(line 994,col 48)",
        "(line 995,col 9)-(line 995,col 43)",
        "(line 996,col 9)-(line 996,col 43)",
        "(line 997,col 9)-(line 997,col 43)",
        "(line 998,col 9)-(line 998,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testIteratorSequenceBreaking()",
      "begin_line": 1001,
      "end_line": 1055,
      "comment": "",
      "child_ranges": [
        "(line 1003,col 9)-(line 1003,col 50)",
        "(line 1006,col 9)-(line 1006,col 79)",
        "(line 1007,col 9)-(line 1007,col 29)",
        "(line 1008,col 9)-(line 1008,col 53)",
        "(line 1009,col 9)-(line 1009,col 25)",
        "(line 1010,col 9)-(line 1017,col 9)",
        "(line 1018,col 9)-(line 1018,col 23)",
        "(line 1019,col 9)-(line 1023,col 9)",
        "(line 1026,col 9)-(line 1026,col 69)",
        "(line 1027,col 9)-(line 1027,col 25)",
        "(line 1028,col 9)-(line 1034,col 9)",
        "(line 1035,col 9)-(line 1038,col 9)",
        "(line 1041,col 9)-(line 1041,col 69)",
        "(line 1042,col 9)-(line 1042,col 25)",
        "(line 1043,col 9)-(line 1049,col 9)",
        "(line 1050,col 9)-(line 1050,col 36)",
        "(line 1051,col 9)-(line 1054,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.validateLineNumbers(java.lang.String)",
      "begin_line": 1057,
      "end_line": 1072,
      "comment": "",
      "child_ranges": [
        "(line 1058,col 9)-(line 1071,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.validateRecordNumbers(java.lang.String)",
      "begin_line": 1074,
      "end_line": 1091,
      "comment": "",
      "child_ranges": [
        "(line 1075,col 9)-(line 1090,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.validateRecordPosition(java.lang.String)",
      "begin_line": 1093,
      "end_line": 1151,
      "comment": "",
      "child_ranges": [
        "(line 1094,col 9)-(line 1094,col 40)",
        "(line 1096,col 9)-(line 1101,col 71)",
        "(line 1103,col 9)-(line 1103,col 109)",
        "(line 1104,col 9)-(line 1104,col 57)",
        "(line 1106,col 9)-(line 1106,col 25)",
        "(line 1107,col 9)-(line 1107,col 50)",
        "(line 1109,col 9)-(line 1109,col 52)",
        "(line 1110,col 9)-(line 1110,col 50)",
        "(line 1111,col 9)-(line 1111,col 71)",
        "(line 1113,col 9)-(line 1113,col 52)",
        "(line 1114,col 9)-(line 1114,col 50)",
        "(line 1115,col 9)-(line 1115,col 71)",
        "(line 1117,col 9)-(line 1117,col 52)",
        "(line 1118,col 9)-(line 1118,col 67)",
        "(line 1119,col 9)-(line 1119,col 50)",
        "(line 1120,col 9)-(line 1120,col 72)",
        "(line 1121,col 9)-(line 1121,col 63)",
        "(line 1122,col 9)-(line 1122,col 63)",
        "(line 1123,col 9)-(line 1123,col 42)",
        "(line 1125,col 9)-(line 1125,col 52)",
        "(line 1126,col 9)-(line 1126,col 50)",
        "(line 1127,col 9)-(line 1127,col 76)",
        "(line 1129,col 9)-(line 1129,col 52)",
        "(line 1130,col 9)-(line 1130,col 50)",
        "(line 1131,col 9)-(line 1131,col 73)",
        "(line 1133,col 9)-(line 1133,col 23)",
        "(line 1136,col 9)-(line 1136,col 116)",
        "(line 1138,col 9)-(line 1138,col 52)",
        "(line 1139,col 9)-(line 1139,col 50)",
        "(line 1140,col 9)-(line 1140,col 72)",
        "(line 1141,col 9)-(line 1141,col 63)",
        "(line 1142,col 9)-(line 1142,col 63)",
        "(line 1143,col 9)-(line 1143,col 42)",
        "(line 1145,col 9)-(line 1145,col 52)",
        "(line 1146,col 9)-(line 1146,col 50)",
        "(line 1147,col 9)-(line 1147,col 76)",
        "(line 1148,col 9)-(line 1148,col 46)",
        "(line 1150,col 9)-(line 1150,col 23)"
      ]
    }
  ]
}