{
  "filepath": "/tmp/Csv-4b/src/test/java/org/apache/commons/csv/CSVParserTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CSVParserTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 59,
      "end_line": 810,
      "comment": "\n * CSVParserTest\n *\n * The test are organized in three different sections:\n * The \u0027setter/getter\u0027 section, the lexer section and finally the parser\n * section. In case a test fails, you should follow a top-down approach for\n * fixing a potential bug (its likely that the parser itself fails if the lexer\n * has problems...).\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "CSVINPUT"
      ],
      "begin_line": 61,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "RESULT"
      ],
      "begin_line": 67,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetLine()",
      "begin_line": 74,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 112)",
        "(line 77,col 9)-(line 79,col 9)",
        "(line 81,col 9)-(line 81,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetRecords()",
      "begin_line": 84,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 112)",
        "(line 87,col 9)-(line 87,col 60)",
        "(line 88,col 9)-(line 88,col 52)",
        "(line 89,col 9)-(line 89,col 39)",
        "(line 90,col 9)-(line 92,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testExcelFormat1()",
      "begin_line": 95,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 97,col 9)-(line 99,col 92)",
        "(line 100,col 9)-(line 106,col 10)",
        "(line 107,col 9)-(line 107,col 72)",
        "(line 108,col 9)-(line 108,col 60)",
        "(line 109,col 9)-(line 109,col 49)",
        "(line 110,col 9)-(line 110,col 39)",
        "(line 111,col 9)-(line 113,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testExcelFormat2()",
      "begin_line": 116,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 71)",
        "(line 119,col 9)-(line 125,col 10)",
        "(line 126,col 9)-(line 126,col 72)",
        "(line 127,col 9)-(line 127,col 60)",
        "(line 128,col 9)-(line 128,col 49)",
        "(line 129,col 9)-(line 129,col 39)",
        "(line 130,col 9)-(line 132,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testEndOfFileBehaviourExcel()",
      "begin_line": 135,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 137,col 9)-(line 146,col 10)",
        "(line 147,col 9)-(line 151,col 10)",
        "(line 153,col 9)-(line 161,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testEndOfFileBehaviorCSV()",
      "begin_line": 164,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 166,col 9)-(line 175,col 10)",
        "(line 176,col 9)-(line 179,col 10)",
        "(line 180,col 9)-(line 188,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testEmptyLineBehaviourExcel()",
      "begin_line": 191,
      "end_line": 213,
      "comment": "",
      "child_ranges": [
        "(line 193,col 9)-(line 198,col 10)",
        "(line 199,col 9)-(line 203,col 10)",
        "(line 204,col 9)-(line 212,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testEmptyLineBehaviourCSV()",
      "begin_line": 215,
      "end_line": 235,
      "comment": "",
      "child_ranges": [
        "(line 217,col 9)-(line 222,col 10)",
        "(line 223,col 9)-(line 225,col 10)",
        "(line 226,col 9)-(line 234,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testEmptyFile()",
      "begin_line": 237,
      "end_line": 241,
      "comment": "",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 72)",
        "(line 240,col 9)-(line 240,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testCSV57()",
      "begin_line": 243,
      "end_line": 249,
      "comment": "",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 72)",
        "(line 246,col 9)-(line 246,col 57)",
        "(line 247,col 9)-(line 247,col 28)",
        "(line 248,col 9)-(line 248,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testBackslashEscapingOld()",
      "begin_line": 251,
      "end_line": 282,
      "comment": "",
      "child_ranges": [
        "(line 254,col 9)-(line 263,col 40)",
        "(line 264,col 9)-(line 274,col 10)",
        "(line 275,col 9)-(line 275,col 74)",
        "(line 276,col 9)-(line 276,col 60)",
        "(line 277,col 9)-(line 277,col 49)",
        "(line 278,col 9)-(line 278,col 39)",
        "(line 279,col 9)-(line 281,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testBackslashEscaping()",
      "begin_line": 284,
      "end_line": 325,
      "comment": "",
      "child_ranges": [
        "(line 291,col 9)-(line 302,col 29)",
        "(line 303,col 9)-(line 314,col 10)",
        "(line 317,col 9)-(line 318,col 101)",
        "(line 320,col 9)-(line 320,col 63)",
        "(line 321,col 9)-(line 321,col 60)",
        "(line 322,col 9)-(line 322,col 39)",
        "(line 324,col 9)-(line 324,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testBackslashEscaping2()",
      "begin_line": 327,
      "end_line": 354,
      "comment": "",
      "child_ranges": [
        "(line 334,col 9)-(line 338,col 21)",
        "(line 339,col 9)-(line 343,col 10)",
        "(line 346,col 9)-(line 347,col 86)",
        "(line 349,col 9)-(line 349,col 63)",
        "(line 350,col 9)-(line 350,col 60)",
        "(line 351,col 9)-(line 351,col 39)",
        "(line 353,col 9)-(line 353,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testDefaultFormat()",
      "begin_line": 356,
      "end_line": 390,
      "comment": "",
      "child_ranges": [
        "(line 358,col 9)-(line 363,col 17)",
        "(line 364,col 9)-(line 369,col 10)",
        "(line 371,col 9)-(line 371,col 45)",
        "(line 372,col 9)-(line 372,col 50)",
        "(line 374,col 9)-(line 374,col 57)",
        "(line 375,col 9)-(line 375,col 54)",
        "(line 376,col 9)-(line 376,col 39)",
        "(line 378,col 9)-(line 378,col 72)",
        "(line 380,col 9)-(line 383,col 10)",
        "(line 385,col 9)-(line 385,col 57)",
        "(line 386,col 9)-(line 386,col 47)",
        "(line 387,col 9)-(line 387,col 38)",
        "(line 389,col 9)-(line 389,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testCarriageReturnLineFeedEndings()",
      "begin_line": 392,
      "end_line": 398,
      "comment": "",
      "child_ranges": [
        "(line 394,col 9)-(line 394,col 67)",
        "(line 395,col 9)-(line 395,col 74)",
        "(line 396,col 9)-(line 396,col 60)",
        "(line 397,col 9)-(line 397,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testClose()",
      "begin_line": 400,
      "end_line": 409,
      "comment": "",
      "child_ranges": [
        "(line 402,col 9)-(line 402,col 77)",
        "(line 403,col 9)-(line 403,col 96)",
        "(line 404,col 9)-(line 404,col 62)",
        "(line 405,col 9)-(line 405,col 38)",
        "(line 406,col 9)-(line 406,col 23)",
        "(line 407,col 9)-(line 407,col 39)",
        "(line 408,col 9)-(line 408,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testCarriageReturnEndings()",
      "begin_line": 411,
      "end_line": 417,
      "comment": "",
      "child_ranges": [
        "(line 413,col 9)-(line 413,col 61)",
        "(line 414,col 9)-(line 414,col 74)",
        "(line 415,col 9)-(line 415,col 60)",
        "(line 416,col 9)-(line 416,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testLineFeedEndings()",
      "begin_line": 419,
      "end_line": 425,
      "comment": "",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 61)",
        "(line 422,col 9)-(line 422,col 74)",
        "(line 423,col 9)-(line 423,col 60)",
        "(line 424,col 9)-(line 424,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testIgnoreEmptyLines()",
      "begin_line": 427,
      "end_line": 435,
      "comment": "",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 64)",
        "(line 432,col 9)-(line 432,col 74)",
        "(line 433,col 9)-(line 433,col 60)",
        "(line 434,col 9)-(line 434,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testForEach()",
      "begin_line": 437,
      "end_line": 451,
      "comment": "",
      "child_ranges": [
        "(line 439,col 9)-(line 439,col 67)",
        "(line 441,col 9)-(line 441,col 66)",
        "(line 443,col 9)-(line 445,col 9)",
        "(line 447,col 9)-(line 447,col 40)",
        "(line 448,col 9)-(line 448,col 80)",
        "(line 449,col 9)-(line 449,col 80)",
        "(line 450,col 9)-(line 450,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testRoundtrip()",
      "begin_line": 453,
      "end_line": 463,
      "comment": "",
      "child_ranges": [
        "(line 455,col 9)-(line 455,col 52)",
        "(line 456,col 9)-(line 456,col 74)",
        "(line 457,col 9)-(line 457,col 59)",
        "(line 458,col 9)-(line 460,col 9)",
        "(line 461,col 9)-(line 461,col 44)",
        "(line 462,col 9)-(line 462,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testIterator()",
      "begin_line": 465,
      "end_line": 492,
      "comment": "",
      "child_ranges": [
        "(line 467,col 9)-(line 467,col 66)",
        "(line 469,col 9)-(line 469,col 84)",
        "(line 471,col 9)-(line 471,col 39)",
        "(line 472,col 9)-(line 477,col 9)",
        "(line 478,col 9)-(line 478,col 81)",
        "(line 479,col 9)-(line 479,col 81)",
        "(line 480,col 9)-(line 480,col 39)",
        "(line 481,col 9)-(line 481,col 39)",
        "(line 482,col 9)-(line 482,col 39)",
        "(line 483,col 9)-(line 483,col 81)",
        "(line 484,col 9)-(line 484,col 40)",
        "(line 486,col 9)-(line 491,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testMultipleIterators()",
      "begin_line": 494,
      "end_line": 510,
      "comment": "",
      "child_ranges": [
        "(line 496,col 9)-(line 496,col 86)",
        "(line 498,col 9)-(line 498,col 53)",
        "(line 499,col 9)-(line 499,col 53)",
        "(line 501,col 9)-(line 501,col 38)",
        "(line 502,col 9)-(line 502,col 40)",
        "(line 503,col 9)-(line 503,col 40)",
        "(line 504,col 9)-(line 504,col 40)",
        "(line 506,col 9)-(line 506,col 39)",
        "(line 507,col 9)-(line 507,col 41)",
        "(line 508,col 9)-(line 508,col 41)",
        "(line 509,col 9)-(line 509,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testHeader()",
      "begin_line": 512,
      "end_line": 527,
      "comment": "",
      "child_ranges": [
        "(line 514,col 9)-(line 514,col 66)",
        "(line 516,col 9)-(line 516,col 96)",
        "(line 518,col 9)-(line 524,col 9)",
        "(line 526,col 9)-(line 526,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testSkipSetHeader()",
      "begin_line": 529,
      "end_line": 538,
      "comment": "",
      "child_ranges": [
        "(line 531,col 9)-(line 531,col 66)",
        "(line 532,col 9)-(line 533,col 38)",
        "(line 534,col 9)-(line 534,col 48)",
        "(line 535,col 9)-(line 535,col 43)",
        "(line 536,col 9)-(line 536,col 43)",
        "(line 537,col 9)-(line 537,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testSkipAutoHeader()",
      "begin_line": 540,
      "end_line": 548,
      "comment": "",
      "child_ranges": [
        "(line 542,col 9)-(line 542,col 66)",
        "(line 543,col 9)-(line 543,col 96)",
        "(line 544,col 9)-(line 544,col 48)",
        "(line 545,col 9)-(line 545,col 43)",
        "(line 546,col 9)-(line 546,col 43)",
        "(line 547,col 9)-(line 547,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testHeaderComment()",
      "begin_line": 550,
      "end_line": 565,
      "comment": "",
      "child_ranges": [
        "(line 552,col 9)-(line 552,col 77)",
        "(line 554,col 9)-(line 554,col 118)",
        "(line 556,col 9)-(line 562,col 9)",
        "(line 564,col 9)-(line 564,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testProvidedHeader()",
      "begin_line": 567,
      "end_line": 586,
      "comment": "",
      "child_ranges": [
        "(line 569,col 9)-(line 569,col 66)",
        "(line 571,col 9)-(line 571,col 109)",
        "(line 573,col 9)-(line 583,col 9)",
        "(line 585,col 9)-(line 585,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testProvidedHeaderAuto()",
      "begin_line": 588,
      "end_line": 607,
      "comment": "",
      "child_ranges": [
        "(line 590,col 9)-(line 590,col 66)",
        "(line 592,col 9)-(line 592,col 96)",
        "(line 594,col 9)-(line 604,col 9)",
        "(line 606,col 9)-(line 606,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testMappedButNotSetAsOutlook2007ContactExport()",
      "begin_line": 609,
      "end_line": 642,
      "comment": "",
      "child_ranges": [
        "(line 611,col 9)-(line 611,col 64)",
        "(line 612,col 9)-(line 613,col 38)",
        "(line 614,col 9)-(line 614,col 25)",
        "(line 617,col 9)-(line 617,col 32)",
        "(line 618,col 9)-(line 618,col 41)",
        "(line 619,col 9)-(line 619,col 41)",
        "(line 620,col 9)-(line 620,col 41)",
        "(line 621,col 9)-(line 621,col 38)",
        "(line 622,col 9)-(line 622,col 38)",
        "(line 623,col 9)-(line 623,col 39)",
        "(line 624,col 9)-(line 624,col 43)",
        "(line 625,col 9)-(line 625,col 43)",
        "(line 626,col 9)-(line 626,col 43)",
        "(line 629,col 9)-(line 629,col 32)",
        "(line 630,col 9)-(line 630,col 41)",
        "(line 631,col 9)-(line 631,col 41)",
        "(line 632,col 9)-(line 632,col 41)",
        "(line 633,col 9)-(line 633,col 38)",
        "(line 634,col 9)-(line 634,col 38)",
        "(line 635,col 9)-(line 635,col 38)",
        "(line 636,col 9)-(line 636,col 43)",
        "(line 637,col 9)-(line 637,col 43)",
        "(line 638,col 9)-(line 638,col 43)",
        "(line 639,col 9)-(line 639,col 42)",
        "(line 641,col 9)-(line 641,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetHeaderMap()",
      "begin_line": 644,
      "end_line": 665,
      "comment": "",
      "child_ranges": [
        "(line 646,col 9)-(line 646,col 117)",
        "(line 647,col 9)-(line 647,col 69)",
        "(line 648,col 9)-(line 648,col 75)",
        "(line 650,col 9)-(line 650,col 53)",
        "(line 651,col 9)-(line 651,col 53)",
        "(line 652,col 9)-(line 652,col 53)",
        "(line 653,col 9)-(line 653,col 62)",
        "(line 656,col 9)-(line 662,col 9)",
        "(line 664,col 9)-(line 664,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testNoHeaderMap()",
      "begin_line": 667,
      "end_line": 671,
      "comment": "",
      "child_ranges": [
        "(line 669,col 9)-(line 669,col 91)",
        "(line 670,col 9)-(line 670,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetLineNumberWithLF()",
      "begin_line": 673,
      "end_line": 676,
      "comment": "",
      "child_ranges": [
        "(line 675,col 9)-(line 675,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetLineNumberWithCRLF()",
      "begin_line": 678,
      "end_line": 681,
      "comment": "",
      "child_ranges": [
        "(line 680,col 9)-(line 680,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetLineNumberWithCR()",
      "begin_line": 683,
      "end_line": 686,
      "comment": "",
      "child_ranges": [
        "(line 685,col 9)-(line 685,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetRecordNumberWithLF()",
      "begin_line": 688,
      "end_line": 691,
      "comment": "",
      "child_ranges": [
        "(line 690,col 9)-(line 690,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetRecordWithMultiLineValues()",
      "begin_line": 693,
      "end_line": 715,
      "comment": "",
      "child_ranges": [
        "(line 695,col 9)-(line 696,col 61)",
        "(line 697,col 9)-(line 697,col 25)",
        "(line 698,col 9)-(line 698,col 50)",
        "(line 699,col 9)-(line 699,col 55)",
        "(line 700,col 9)-(line 700,col 52)",
        "(line 701,col 9)-(line 701,col 55)",
        "(line 702,col 9)-(line 702,col 50)",
        "(line 703,col 9)-(line 703,col 50)",
        "(line 704,col 9)-(line 704,col 52)",
        "(line 705,col 9)-(line 705,col 55)",
        "(line 706,col 9)-(line 706,col 50)",
        "(line 707,col 9)-(line 707,col 50)",
        "(line 708,col 9)-(line 708,col 52)",
        "(line 709,col 9)-(line 709,col 55)",
        "(line 710,col 9)-(line 710,col 50)",
        "(line 711,col 9)-(line 711,col 50)",
        "(line 712,col 9)-(line 712,col 49)",
        "(line 713,col 9)-(line 713,col 55)",
        "(line 714,col 9)-(line 714,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetRecordNumberWithCRLF()",
      "begin_line": 717,
      "end_line": 720,
      "comment": "",
      "child_ranges": [
        "(line 719,col 9)-(line 719,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetRecordNumberWithCR()",
      "begin_line": 722,
      "end_line": 725,
      "comment": "",
      "child_ranges": [
        "(line 724,col 9)-(line 724,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testInvalidFormat()",
      "begin_line": 727,
      "end_line": 731,
      "comment": "",
      "child_ranges": [
        "(line 729,col 9)-(line 729,col 76)",
        "(line 730,col 9)-(line 730,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testParseNullFileFormat()",
      "begin_line": 733,
      "end_line": 736,
      "comment": "",
      "child_ranges": [
        "(line 735,col 9)-(line 735,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testParseFileNullFormat()",
      "begin_line": 738,
      "end_line": 741,
      "comment": "",
      "child_ranges": [
        "(line 740,col 9)-(line 740,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testParseNullStringFormat()",
      "begin_line": 743,
      "end_line": 746,
      "comment": "",
      "child_ranges": [
        "(line 745,col 9)-(line 745,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testParseStringNullFormat()",
      "begin_line": 748,
      "end_line": 751,
      "comment": "",
      "child_ranges": [
        "(line 750,col 9)-(line 750,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testParseNullUrlCharsetFormat()",
      "begin_line": 753,
      "end_line": 756,
      "comment": "",
      "child_ranges": [
        "(line 755,col 9)-(line 755,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testParserUrlNullCharsetFormat()",
      "begin_line": 758,
      "end_line": 761,
      "comment": "",
      "child_ranges": [
        "(line 760,col 9)-(line 760,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testParseUrlCharsetNullFormat()",
      "begin_line": 763,
      "end_line": 766,
      "comment": "",
      "child_ranges": [
        "(line 765,col 9)-(line 765,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testNewCSVParserNullReaderFormat()",
      "begin_line": 768,
      "end_line": 771,
      "comment": "",
      "child_ranges": [
        "(line 770,col 9)-(line 770,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testNewCSVParserReaderNullFormat()",
      "begin_line": 773,
      "end_line": 776,
      "comment": "",
      "child_ranges": [
        "(line 775,col 9)-(line 775,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.validateRecordNumbers(java.lang.String)",
      "begin_line": 778,
      "end_line": 793,
      "comment": "",
      "child_ranges": [
        "(line 779,col 9)-(line 779,col 152)",
        "(line 780,col 9)-(line 780,col 25)",
        "(line 781,col 9)-(line 781,col 50)",
        "(line 782,col 9)-(line 782,col 52)",
        "(line 783,col 9)-(line 783,col 50)",
        "(line 784,col 9)-(line 784,col 50)",
        "(line 785,col 9)-(line 785,col 52)",
        "(line 786,col 9)-(line 786,col 50)",
        "(line 787,col 9)-(line 787,col 50)",
        "(line 788,col 9)-(line 788,col 52)",
        "(line 789,col 9)-(line 789,col 50)",
        "(line 790,col 9)-(line 790,col 50)",
        "(line 791,col 9)-(line 791,col 49)",
        "(line 792,col 9)-(line 792,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.validateLineNumbers(java.lang.String)",
      "begin_line": 795,
      "end_line": 808,
      "comment": "",
      "child_ranges": [
        "(line 796,col 9)-(line 796,col 152)",
        "(line 797,col 9)-(line 797,col 55)",
        "(line 798,col 9)-(line 798,col 43)",
        "(line 799,col 9)-(line 799,col 55)",
        "(line 800,col 9)-(line 800,col 43)",
        "(line 801,col 9)-(line 801,col 55)",
        "(line 802,col 9)-(line 802,col 43)",
        "(line 804,col 9)-(line 804,col 55)",
        "(line 805,col 9)-(line 805,col 40)",
        "(line 807,col 9)-(line 807,col 55)"
      ]
    }
  ]
}