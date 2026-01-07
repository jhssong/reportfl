{
  "filepath": "/tmp/Csv-3b/src/test/java/org/apache/commons/csv/CSVParserTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CSVParserTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 57,
      "end_line": 692,
      "comment": "\n * CSVParserTest\n *\n * The test are organized in three different sections:\n * The \u0027setter/getter\u0027 section, the lexer section and finally the parser\n * section. In case a test fails, you should follow a top-down approach for\n * fixing a potential bug (its likely that the parser itself fails if the lexer\n * has problems...).\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "CSVINPUT"
      ],
      "begin_line": 59,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "RESULT"
      ],
      "begin_line": 65,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetLine()",
      "begin_line": 72,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 141)",
        "(line 75,col 9)-(line 77,col 9)",
        "(line 79,col 9)-(line 79,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetRecords()",
      "begin_line": 82,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 141)",
        "(line 85,col 9)-(line 85,col 60)",
        "(line 86,col 9)-(line 86,col 52)",
        "(line 87,col 9)-(line 87,col 39)",
        "(line 88,col 9)-(line 90,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testExcelFormat1()",
      "begin_line": 93,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 95,col 9)-(line 97,col 92)",
        "(line 98,col 9)-(line 104,col 10)",
        "(line 105,col 9)-(line 105,col 70)",
        "(line 106,col 9)-(line 106,col 60)",
        "(line 107,col 9)-(line 107,col 49)",
        "(line 108,col 9)-(line 108,col 39)",
        "(line 109,col 9)-(line 111,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testExcelFormat2()",
      "begin_line": 114,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 71)",
        "(line 117,col 9)-(line 123,col 10)",
        "(line 124,col 9)-(line 124,col 70)",
        "(line 125,col 9)-(line 125,col 60)",
        "(line 126,col 9)-(line 126,col 49)",
        "(line 127,col 9)-(line 127,col 39)",
        "(line 128,col 9)-(line 130,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testEndOfFileBehaviourExcel()",
      "begin_line": 133,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 135,col 9)-(line 144,col 10)",
        "(line 145,col 9)-(line 149,col 10)",
        "(line 151,col 9)-(line 159,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testEndOfFileBehaviorCSV()",
      "begin_line": 162,
      "end_line": 187,
      "comment": "",
      "child_ranges": [
        "(line 164,col 9)-(line 173,col 10)",
        "(line 174,col 9)-(line 177,col 10)",
        "(line 178,col 9)-(line 186,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testEmptyLineBehaviourExcel()",
      "begin_line": 189,
      "end_line": 211,
      "comment": "",
      "child_ranges": [
        "(line 191,col 9)-(line 196,col 10)",
        "(line 197,col 9)-(line 201,col 10)",
        "(line 202,col 9)-(line 210,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testEmptyLineBehaviourCSV()",
      "begin_line": 213,
      "end_line": 233,
      "comment": "",
      "child_ranges": [
        "(line 215,col 9)-(line 220,col 10)",
        "(line 221,col 9)-(line 223,col 10)",
        "(line 224,col 9)-(line 232,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testEmptyFile()",
      "begin_line": 235,
      "end_line": 239,
      "comment": "",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 70)",
        "(line 238,col 9)-(line 238,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testCSV57()",
      "begin_line": 241,
      "end_line": 247,
      "comment": "",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 70)",
        "(line 244,col 9)-(line 244,col 57)",
        "(line 245,col 9)-(line 245,col 28)",
        "(line 246,col 9)-(line 246,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testBackslashEscapingOld()",
      "begin_line": 249,
      "end_line": 280,
      "comment": "",
      "child_ranges": [
        "(line 252,col 9)-(line 261,col 40)",
        "(line 262,col 9)-(line 272,col 10)",
        "(line 273,col 9)-(line 273,col 71)",
        "(line 274,col 9)-(line 274,col 60)",
        "(line 275,col 9)-(line 275,col 49)",
        "(line 276,col 9)-(line 276,col 39)",
        "(line 277,col 9)-(line 279,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testBackslashEscaping()",
      "begin_line": 282,
      "end_line": 323,
      "comment": "",
      "child_ranges": [
        "(line 289,col 9)-(line 300,col 29)",
        "(line 301,col 9)-(line 312,col 10)",
        "(line 315,col 9)-(line 316,col 93)",
        "(line 318,col 9)-(line 318,col 61)",
        "(line 319,col 9)-(line 319,col 60)",
        "(line 320,col 9)-(line 320,col 39)",
        "(line 322,col 9)-(line 322,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testBackslashEscaping2()",
      "begin_line": 325,
      "end_line": 352,
      "comment": "",
      "child_ranges": [
        "(line 332,col 9)-(line 336,col 21)",
        "(line 337,col 9)-(line 341,col 10)",
        "(line 344,col 9)-(line 345,col 78)",
        "(line 347,col 9)-(line 347,col 61)",
        "(line 348,col 9)-(line 348,col 60)",
        "(line 349,col 9)-(line 349,col 39)",
        "(line 351,col 9)-(line 351,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testDefaultFormat()",
      "begin_line": 354,
      "end_line": 388,
      "comment": "",
      "child_ranges": [
        "(line 356,col 9)-(line 361,col 17)",
        "(line 362,col 9)-(line 367,col 10)",
        "(line 369,col 9)-(line 369,col 45)",
        "(line 370,col 9)-(line 370,col 50)",
        "(line 372,col 9)-(line 372,col 55)",
        "(line 373,col 9)-(line 373,col 54)",
        "(line 374,col 9)-(line 374,col 39)",
        "(line 376,col 9)-(line 376,col 72)",
        "(line 378,col 9)-(line 381,col 10)",
        "(line 383,col 9)-(line 383,col 70)",
        "(line 384,col 9)-(line 384,col 45)",
        "(line 385,col 9)-(line 385,col 38)",
        "(line 387,col 9)-(line 387,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testCarriageReturnLineFeedEndings()",
      "begin_line": 390,
      "end_line": 396,
      "comment": "",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 67)",
        "(line 393,col 9)-(line 393,col 71)",
        "(line 394,col 9)-(line 394,col 60)",
        "(line 395,col 9)-(line 395,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testCarriageReturnEndings()",
      "begin_line": 398,
      "end_line": 404,
      "comment": "",
      "child_ranges": [
        "(line 400,col 9)-(line 400,col 61)",
        "(line 401,col 9)-(line 401,col 71)",
        "(line 402,col 9)-(line 402,col 60)",
        "(line 403,col 9)-(line 403,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testLineFeedEndings()",
      "begin_line": 406,
      "end_line": 412,
      "comment": "",
      "child_ranges": [
        "(line 408,col 9)-(line 408,col 61)",
        "(line 409,col 9)-(line 409,col 71)",
        "(line 410,col 9)-(line 410,col 60)",
        "(line 411,col 9)-(line 411,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testIgnoreEmptyLines()",
      "begin_line": 414,
      "end_line": 422,
      "comment": "",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 64)",
        "(line 419,col 9)-(line 419,col 71)",
        "(line 420,col 9)-(line 420,col 60)",
        "(line 421,col 9)-(line 421,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testForEach()",
      "begin_line": 424,
      "end_line": 438,
      "comment": "",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 67)",
        "(line 428,col 9)-(line 428,col 66)",
        "(line 430,col 9)-(line 432,col 9)",
        "(line 434,col 9)-(line 434,col 40)",
        "(line 435,col 9)-(line 435,col 80)",
        "(line 436,col 9)-(line 436,col 80)",
        "(line 437,col 9)-(line 437,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testRoundtrip()",
      "begin_line": 440,
      "end_line": 450,
      "comment": "",
      "child_ranges": [
        "(line 442,col 9)-(line 442,col 52)",
        "(line 443,col 9)-(line 443,col 74)",
        "(line 444,col 9)-(line 444,col 59)",
        "(line 445,col 9)-(line 447,col 9)",
        "(line 448,col 9)-(line 448,col 44)",
        "(line 449,col 9)-(line 449,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testIterator()",
      "begin_line": 452,
      "end_line": 478,
      "comment": "",
      "child_ranges": [
        "(line 454,col 9)-(line 454,col 66)",
        "(line 456,col 9)-(line 456,col 84)",
        "(line 458,col 9)-(line 458,col 39)",
        "(line 459,col 9)-(line 463,col 9)",
        "(line 464,col 9)-(line 464,col 81)",
        "(line 465,col 9)-(line 465,col 81)",
        "(line 466,col 9)-(line 466,col 39)",
        "(line 467,col 9)-(line 467,col 39)",
        "(line 468,col 9)-(line 468,col 39)",
        "(line 469,col 9)-(line 469,col 81)",
        "(line 470,col 9)-(line 470,col 40)",
        "(line 472,col 9)-(line 477,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testHeader()",
      "begin_line": 480,
      "end_line": 495,
      "comment": "",
      "child_ranges": [
        "(line 482,col 9)-(line 482,col 66)",
        "(line 484,col 9)-(line 484,col 101)",
        "(line 486,col 9)-(line 492,col 9)",
        "(line 494,col 9)-(line 494,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testHeaderComment()",
      "begin_line": 497,
      "end_line": 512,
      "comment": "",
      "child_ranges": [
        "(line 499,col 9)-(line 499,col 77)",
        "(line 501,col 9)-(line 501,col 123)",
        "(line 503,col 9)-(line 509,col 9)",
        "(line 511,col 9)-(line 511,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testProvidedHeader()",
      "begin_line": 514,
      "end_line": 533,
      "comment": "",
      "child_ranges": [
        "(line 516,col 9)-(line 516,col 66)",
        "(line 518,col 9)-(line 518,col 114)",
        "(line 520,col 9)-(line 530,col 9)",
        "(line 532,col 9)-(line 532,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testMappedButNotSetAsOutlook2007ContactExport()",
      "begin_line": 535,
      "end_line": 581,
      "comment": "",
      "child_ranges": [
        "(line 537,col 9)-(line 537,col 64)",
        "(line 539,col 9)-(line 539,col 114)",
        "(line 542,col 9)-(line 542,col 38)",
        "(line 543,col 9)-(line 543,col 42)",
        "(line 544,col 9)-(line 544,col 41)",
        "(line 545,col 9)-(line 545,col 41)",
        "(line 546,col 9)-(line 546,col 41)",
        "(line 547,col 9)-(line 547,col 38)",
        "(line 548,col 9)-(line 548,col 38)",
        "(line 549,col 9)-(line 549,col 38)",
        "(line 550,col 9)-(line 550,col 43)",
        "(line 551,col 9)-(line 551,col 43)",
        "(line 552,col 9)-(line 552,col 43)",
        "(line 553,col 9)-(line 553,col 42)",
        "(line 556,col 9)-(line 556,col 32)",
        "(line 557,col 9)-(line 557,col 41)",
        "(line 558,col 9)-(line 558,col 41)",
        "(line 559,col 9)-(line 559,col 41)",
        "(line 560,col 9)-(line 560,col 38)",
        "(line 561,col 9)-(line 561,col 38)",
        "(line 562,col 9)-(line 562,col 39)",
        "(line 563,col 9)-(line 563,col 43)",
        "(line 564,col 9)-(line 564,col 43)",
        "(line 565,col 9)-(line 565,col 43)",
        "(line 568,col 9)-(line 568,col 32)",
        "(line 569,col 9)-(line 569,col 41)",
        "(line 570,col 9)-(line 570,col 41)",
        "(line 571,col 9)-(line 571,col 41)",
        "(line 572,col 9)-(line 572,col 38)",
        "(line 573,col 9)-(line 573,col 38)",
        "(line 574,col 9)-(line 574,col 38)",
        "(line 575,col 9)-(line 575,col 43)",
        "(line 576,col 9)-(line 576,col 43)",
        "(line 577,col 9)-(line 577,col 43)",
        "(line 578,col 9)-(line 578,col 42)",
        "(line 580,col 9)-(line 580,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetHeaderMap()",
      "begin_line": 583,
      "end_line": 604,
      "comment": "",
      "child_ranges": [
        "(line 585,col 9)-(line 585,col 128)",
        "(line 586,col 9)-(line 586,col 69)",
        "(line 587,col 9)-(line 587,col 75)",
        "(line 589,col 9)-(line 589,col 53)",
        "(line 590,col 9)-(line 590,col 53)",
        "(line 591,col 9)-(line 591,col 53)",
        "(line 592,col 9)-(line 592,col 62)",
        "(line 595,col 9)-(line 601,col 9)",
        "(line 603,col 9)-(line 603,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetLineNumberWithLF()",
      "begin_line": 606,
      "end_line": 609,
      "comment": "",
      "child_ranges": [
        "(line 608,col 9)-(line 608,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetLineNumberWithCRLF()",
      "begin_line": 611,
      "end_line": 614,
      "comment": "",
      "child_ranges": [
        "(line 613,col 9)-(line 613,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetLineNumberWithCR()",
      "begin_line": 616,
      "end_line": 619,
      "comment": "",
      "child_ranges": [
        "(line 618,col 9)-(line 618,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetRecordNumberWithLF()",
      "begin_line": 621,
      "end_line": 624,
      "comment": "",
      "child_ranges": [
        "(line 623,col 9)-(line 623,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetRecordWithMultiiLineValues()",
      "begin_line": 626,
      "end_line": 648,
      "comment": "",
      "child_ranges": [
        "(line 628,col 9)-(line 629,col 74)",
        "(line 630,col 9)-(line 630,col 25)",
        "(line 631,col 9)-(line 631,col 50)",
        "(line 632,col 9)-(line 632,col 48)",
        "(line 633,col 9)-(line 633,col 52)",
        "(line 634,col 9)-(line 634,col 48)",
        "(line 635,col 9)-(line 635,col 50)",
        "(line 636,col 9)-(line 636,col 50)",
        "(line 637,col 9)-(line 637,col 52)",
        "(line 638,col 9)-(line 638,col 48)",
        "(line 639,col 9)-(line 639,col 50)",
        "(line 640,col 9)-(line 640,col 50)",
        "(line 641,col 9)-(line 641,col 52)",
        "(line 642,col 9)-(line 642,col 48)",
        "(line 643,col 9)-(line 643,col 50)",
        "(line 644,col 9)-(line 644,col 50)",
        "(line 645,col 9)-(line 645,col 49)",
        "(line 646,col 9)-(line 646,col 48)",
        "(line 647,col 9)-(line 647,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetRecordNumberWithCRLF()",
      "begin_line": 650,
      "end_line": 653,
      "comment": "",
      "child_ranges": [
        "(line 652,col 9)-(line 652,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetRecordNumberWithCR()",
      "begin_line": 655,
      "end_line": 658,
      "comment": "",
      "child_ranges": [
        "(line 657,col 9)-(line 657,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.validateRecordNumbers(java.lang.String)",
      "begin_line": 660,
      "end_line": 675,
      "comment": "",
      "child_ranges": [
        "(line 661,col 9)-(line 661,col 163)",
        "(line 662,col 9)-(line 662,col 25)",
        "(line 663,col 9)-(line 663,col 50)",
        "(line 664,col 9)-(line 664,col 52)",
        "(line 665,col 9)-(line 665,col 50)",
        "(line 666,col 9)-(line 666,col 50)",
        "(line 667,col 9)-(line 667,col 52)",
        "(line 668,col 9)-(line 668,col 50)",
        "(line 669,col 9)-(line 669,col 50)",
        "(line 670,col 9)-(line 670,col 52)",
        "(line 671,col 9)-(line 671,col 50)",
        "(line 672,col 9)-(line 672,col 50)",
        "(line 673,col 9)-(line 673,col 49)",
        "(line 674,col 9)-(line 674,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.validateLineNumbers(java.lang.String)",
      "begin_line": 677,
      "end_line": 690,
      "comment": "",
      "child_ranges": [
        "(line 678,col 9)-(line 678,col 163)",
        "(line 679,col 9)-(line 679,col 48)",
        "(line 680,col 9)-(line 680,col 43)",
        "(line 681,col 9)-(line 681,col 48)",
        "(line 682,col 9)-(line 682,col 43)",
        "(line 683,col 9)-(line 683,col 48)",
        "(line 684,col 9)-(line 684,col 43)",
        "(line 686,col 9)-(line 686,col 48)",
        "(line 687,col 9)-(line 687,col 40)",
        "(line 689,col 9)-(line 689,col 48)"
      ]
    }
  ]
}