{
  "filepath": "/tmp/Csv-12b/src/test/java/org/apache/commons/csv/CSVParserTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CSVParserTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 61,
      "end_line": 891,
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
        "(line 102,col 9)-(line 103,col 44)",
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
        "(line 129,col 9)-(line 130,col 44)",
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
      "signature": "org.apache.commons.csv.CSVParserTest.testEndOfFileBehaviorCSV()",
      "begin_line": 305,
      "end_line": 322,
      "comment": "",
      "child_ranges": [
        "(line 307,col 9)-(line 309,col 75)",
        "(line 310,col 9)-(line 311,col 34)",
        "(line 312,col 9)-(line 321,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testEndOfFileBehaviourExcel()",
      "begin_line": 324,
      "end_line": 342,
      "comment": "",
      "child_ranges": [
        "(line 326,col 9)-(line 328,col 75)",
        "(line 329,col 9)-(line 330,col 34)",
        "(line 332,col 9)-(line 341,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testExcelFormat1()",
      "begin_line": 344,
      "end_line": 358,
      "comment": "",
      "child_ranges": [
        "(line 346,col 9)-(line 347,col 84)",
        "(line 348,col 9)-(line 349,col 96)",
        "(line 350,col 9)-(line 350,col 72)",
        "(line 351,col 9)-(line 351,col 60)",
        "(line 352,col 9)-(line 352,col 49)",
        "(line 353,col 9)-(line 353,col 39)",
        "(line 354,col 9)-(line 356,col 9)",
        "(line 357,col 9)-(line 357,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testExcelFormat2()",
      "begin_line": 360,
      "end_line": 372,
      "comment": "",
      "child_ranges": [
        "(line 362,col 9)-(line 362,col 71)",
        "(line 363,col 9)-(line 363,col 103)",
        "(line 364,col 9)-(line 364,col 72)",
        "(line 365,col 9)-(line 365,col 60)",
        "(line 366,col 9)-(line 366,col 49)",
        "(line 367,col 9)-(line 367,col 39)",
        "(line 368,col 9)-(line 370,col 9)",
        "(line 371,col 9)-(line 371,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testExcelHeaderCountLessThanData()",
      "begin_line": 377,
      "end_line": 390,
      "comment": "\n     * Tests an exported Excel worksheet with a header row and rows that have more columns than the headers\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 379,col 55)",
        "(line 380,col 9)-(line 380,col 85)",
        "(line 381,col 9)-(line 389,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testForEach()",
      "begin_line": 392,
      "end_line": 406,
      "comment": "",
      "child_ranges": [
        "(line 394,col 9)-(line 394,col 67)",
        "(line 396,col 9)-(line 396,col 66)",
        "(line 398,col 9)-(line 400,col 9)",
        "(line 402,col 9)-(line 402,col 40)",
        "(line 403,col 9)-(line 403,col 83)",
        "(line 404,col 9)-(line 404,col 83)",
        "(line 405,col 9)-(line 405,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetHeaderMap()",
      "begin_line": 408,
      "end_line": 430,
      "comment": "",
      "child_ranges": [
        "(line 410,col 9)-(line 410,col 117)",
        "(line 411,col 9)-(line 411,col 69)",
        "(line 412,col 9)-(line 412,col 75)",
        "(line 414,col 9)-(line 414,col 53)",
        "(line 415,col 9)-(line 415,col 53)",
        "(line 416,col 9)-(line 416,col 53)",
        "(line 417,col 9)-(line 417,col 62)",
        "(line 420,col 9)-(line 426,col 9)",
        "(line 428,col 9)-(line 428,col 39)",
        "(line 429,col 9)-(line 429,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testDuplicateHeaders()",
      "begin_line": 432,
      "end_line": 435,
      "comment": "",
      "child_ranges": [
        "(line 434,col 9)-(line 434,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetLine()",
      "begin_line": 437,
      "end_line": 446,
      "comment": "",
      "child_ranges": [
        "(line 439,col 9)-(line 439,col 113)",
        "(line 440,col 9)-(line 442,col 9)",
        "(line 444,col 9)-(line 444,col 40)",
        "(line 445,col 9)-(line 445,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetLineNumberWithCR()",
      "begin_line": 448,
      "end_line": 451,
      "comment": "",
      "child_ranges": [
        "(line 450,col 9)-(line 450,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetLineNumberWithCRLF()",
      "begin_line": 453,
      "end_line": 456,
      "comment": "",
      "child_ranges": [
        "(line 455,col 9)-(line 455,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetLineNumberWithLF()",
      "begin_line": 458,
      "end_line": 461,
      "comment": "",
      "child_ranges": [
        "(line 460,col 9)-(line 460,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetOneLine()",
      "begin_line": 463,
      "end_line": 469,
      "comment": "",
      "child_ranges": [
        "(line 465,col 9)-(line 465,col 81)",
        "(line 466,col 9)-(line 466,col 60)",
        "(line 467,col 9)-(line 467,col 54)",
        "(line 468,col 9)-(line 468,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetOneLineOneParser()",
      "begin_line": 476,
      "end_line": 494,
      "comment": "\n     * Tests reusing a parser to process new string records one at a time as they are being discovered. See [CSV-110].\n     *\n     * @throws IOException\n     ",
      "child_ranges": [
        "(line 478,col 9)-(line 478,col 53)",
        "(line 479,col 9)-(line 479,col 59)",
        "(line 480,col 9)-(line 480,col 51)",
        "(line 481,col 9)-(line 481,col 63)",
        "(line 482,col 9)-(line 493,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetRecordNumberWithCR()",
      "begin_line": 496,
      "end_line": 499,
      "comment": "",
      "child_ranges": [
        "(line 498,col 9)-(line 498,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetRecordNumberWithCRLF()",
      "begin_line": 501,
      "end_line": 504,
      "comment": "",
      "child_ranges": [
        "(line 503,col 9)-(line 503,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetRecordNumberWithLF()",
      "begin_line": 506,
      "end_line": 509,
      "comment": "",
      "child_ranges": [
        "(line 508,col 9)-(line 508,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetRecords()",
      "begin_line": 511,
      "end_line": 521,
      "comment": "",
      "child_ranges": [
        "(line 513,col 9)-(line 513,col 113)",
        "(line 514,col 9)-(line 514,col 60)",
        "(line 515,col 9)-(line 515,col 52)",
        "(line 516,col 9)-(line 516,col 39)",
        "(line 517,col 9)-(line 519,col 9)",
        "(line 520,col 9)-(line 520,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testGetRecordWithMultiLineValues()",
      "begin_line": 523,
      "end_line": 546,
      "comment": "",
      "child_ranges": [
        "(line 525,col 9)-(line 526,col 86)",
        "(line 527,col 9)-(line 527,col 25)",
        "(line 528,col 9)-(line 528,col 50)",
        "(line 529,col 9)-(line 529,col 55)",
        "(line 530,col 9)-(line 530,col 52)",
        "(line 531,col 9)-(line 531,col 55)",
        "(line 532,col 9)-(line 532,col 50)",
        "(line 533,col 9)-(line 533,col 50)",
        "(line 534,col 9)-(line 534,col 52)",
        "(line 535,col 9)-(line 535,col 55)",
        "(line 536,col 9)-(line 536,col 50)",
        "(line 537,col 9)-(line 537,col 50)",
        "(line 538,col 9)-(line 538,col 52)",
        "(line 539,col 9)-(line 539,col 55)",
        "(line 540,col 9)-(line 540,col 50)",
        "(line 541,col 9)-(line 541,col 50)",
        "(line 542,col 9)-(line 542,col 49)",
        "(line 543,col 9)-(line 543,col 55)",
        "(line 544,col 9)-(line 544,col 50)",
        "(line 545,col 9)-(line 545,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testHeader()",
      "begin_line": 548,
      "end_line": 563,
      "comment": "",
      "child_ranges": [
        "(line 550,col 9)-(line 550,col 66)",
        "(line 552,col 9)-(line 552,col 96)",
        "(line 554,col 9)-(line 560,col 9)",
        "(line 562,col 9)-(line 562,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testHeaderMissing()",
      "begin_line": 565,
      "end_line": 579,
      "comment": "",
      "child_ranges": [
        "(line 567,col 9)-(line 567,col 65)",
        "(line 569,col 9)-(line 569,col 96)",
        "(line 571,col 9)-(line 576,col 9)",
        "(line 578,col 9)-(line 578,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testHeadersMissingException()",
      "begin_line": 581,
      "end_line": 585,
      "comment": "",
      "child_ranges": [
        "(line 583,col 9)-(line 583,col 73)",
        "(line 584,col 9)-(line 584,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testHeadersMissing()",
      "begin_line": 587,
      "end_line": 591,
      "comment": "",
      "child_ranges": [
        "(line 589,col 9)-(line 589,col 73)",
        "(line 590,col 9)-(line 590,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testHeaderMissingWithNull()",
      "begin_line": 593,
      "end_line": 597,
      "comment": "",
      "child_ranges": [
        "(line 595,col 9)-(line 595,col 73)",
        "(line 596,col 9)-(line 596,col 113)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testHeaderComment()",
      "begin_line": 599,
      "end_line": 614,
      "comment": "",
      "child_ranges": [
        "(line 601,col 9)-(line 601,col 77)",
        "(line 603,col 9)-(line 603,col 119)",
        "(line 605,col 9)-(line 611,col 9)",
        "(line 613,col 9)-(line 613,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testIgnoreEmptyLines()",
      "begin_line": 616,
      "end_line": 625,
      "comment": "",
      "child_ranges": [
        "(line 618,col 9)-(line 618,col 64)",
        "(line 621,col 9)-(line 621,col 74)",
        "(line 622,col 9)-(line 622,col 60)",
        "(line 623,col 9)-(line 623,col 40)",
        "(line 624,col 9)-(line 624,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testInvalidFormat()",
      "begin_line": 627,
      "end_line": 631,
      "comment": "",
      "child_ranges": [
        "(line 629,col 9)-(line 629,col 76)",
        "(line 630,col 9)-(line 630,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testIterator()",
      "begin_line": 633,
      "end_line": 660,
      "comment": "",
      "child_ranges": [
        "(line 635,col 9)-(line 635,col 66)",
        "(line 637,col 9)-(line 637,col 84)",
        "(line 639,col 9)-(line 639,col 39)",
        "(line 640,col 9)-(line 645,col 9)",
        "(line 646,col 9)-(line 646,col 84)",
        "(line 647,col 9)-(line 647,col 84)",
        "(line 648,col 9)-(line 648,col 39)",
        "(line 649,col 9)-(line 649,col 39)",
        "(line 650,col 9)-(line 650,col 39)",
        "(line 651,col 9)-(line 651,col 84)",
        "(line 652,col 9)-(line 652,col 40)",
        "(line 654,col 9)-(line 659,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testLineFeedEndings()",
      "begin_line": 662,
      "end_line": 669,
      "comment": "",
      "child_ranges": [
        "(line 664,col 9)-(line 664,col 61)",
        "(line 665,col 9)-(line 665,col 74)",
        "(line 666,col 9)-(line 666,col 60)",
        "(line 667,col 9)-(line 667,col 40)",
        "(line 668,col 9)-(line 668,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testMappedButNotSetAsOutlook2007ContactExport()",
      "begin_line": 671,
      "end_line": 704,
      "comment": "",
      "child_ranges": [
        "(line 673,col 9)-(line 673,col 64)",
        "(line 674,col 9)-(line 675,col 38)",
        "(line 676,col 9)-(line 676,col 25)",
        "(line 679,col 9)-(line 679,col 32)",
        "(line 680,col 9)-(line 680,col 41)",
        "(line 681,col 9)-(line 681,col 41)",
        "(line 682,col 9)-(line 682,col 41)",
        "(line 683,col 9)-(line 683,col 38)",
        "(line 684,col 9)-(line 684,col 38)",
        "(line 685,col 9)-(line 685,col 39)",
        "(line 686,col 9)-(line 686,col 43)",
        "(line 687,col 9)-(line 687,col 43)",
        "(line 688,col 9)-(line 688,col 43)",
        "(line 691,col 9)-(line 691,col 32)",
        "(line 692,col 9)-(line 692,col 41)",
        "(line 693,col 9)-(line 693,col 41)",
        "(line 694,col 9)-(line 694,col 41)",
        "(line 695,col 9)-(line 695,col 38)",
        "(line 696,col 9)-(line 696,col 38)",
        "(line 697,col 9)-(line 697,col 38)",
        "(line 698,col 9)-(line 698,col 43)",
        "(line 699,col 9)-(line 699,col 43)",
        "(line 700,col 9)-(line 700,col 43)",
        "(line 701,col 9)-(line 701,col 42)",
        "(line 703,col 9)-(line 703,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testMultipleIterators()",
      "begin_line": 706,
      "end_line": 724,
      "comment": "",
      "child_ranges": [
        "(line 709,col 9)-(line 709,col 92)",
        "(line 711,col 9)-(line 711,col 59)",
        "(line 712,col 9)-(line 712,col 59)",
        "(line 714,col 9)-(line 714,col 44)",
        "(line 715,col 9)-(line 715,col 40)",
        "(line 716,col 9)-(line 716,col 40)",
        "(line 717,col 9)-(line 717,col 40)",
        "(line 719,col 9)-(line 719,col 45)",
        "(line 720,col 9)-(line 720,col 41)",
        "(line 721,col 9)-(line 721,col 41)",
        "(line 722,col 9)-(line 722,col 41)",
        "(line 723,col 9)-(line 723,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testNewCSVParserNullReaderFormat()",
      "begin_line": 726,
      "end_line": 729,
      "comment": "",
      "child_ranges": [
        "(line 728,col 9)-(line 728,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testNewCSVParserReaderNullFormat()",
      "begin_line": 731,
      "end_line": 734,
      "comment": "",
      "child_ranges": [
        "(line 733,col 9)-(line 733,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testNoHeaderMap()",
      "begin_line": 736,
      "end_line": 741,
      "comment": "",
      "child_ranges": [
        "(line 738,col 9)-(line 738,col 91)",
        "(line 739,col 9)-(line 739,col 49)",
        "(line 740,col 9)-(line 740,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testParseFileNullFormat()",
      "begin_line": 743,
      "end_line": 746,
      "comment": "",
      "child_ranges": [
        "(line 745,col 9)-(line 745,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testParseNullFileFormat()",
      "begin_line": 748,
      "end_line": 751,
      "comment": "",
      "child_ranges": [
        "(line 750,col 9)-(line 750,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testParseNullStringFormat()",
      "begin_line": 753,
      "end_line": 756,
      "comment": "",
      "child_ranges": [
        "(line 755,col 9)-(line 755,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testParseNullUrlCharsetFormat()",
      "begin_line": 758,
      "end_line": 761,
      "comment": "",
      "child_ranges": [
        "(line 760,col 9)-(line 760,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testParserUrlNullCharsetFormat()",
      "begin_line": 763,
      "end_line": 767,
      "comment": "",
      "child_ranges": [
        "(line 765,col 9)-(line 765,col 112)",
        "(line 766,col 9)-(line 766,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testParseStringNullFormat()",
      "begin_line": 769,
      "end_line": 772,
      "comment": "",
      "child_ranges": [
        "(line 771,col 9)-(line 771,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testParseUrlCharsetNullFormat()",
      "begin_line": 774,
      "end_line": 778,
      "comment": "",
      "child_ranges": [
        "(line 776,col 9)-(line 776,col 119)",
        "(line 777,col 9)-(line 777,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testProvidedHeader()",
      "begin_line": 780,
      "end_line": 799,
      "comment": "",
      "child_ranges": [
        "(line 782,col 9)-(line 782,col 66)",
        "(line 784,col 9)-(line 784,col 109)",
        "(line 786,col 9)-(line 796,col 9)",
        "(line 798,col 9)-(line 798,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testProvidedHeaderAuto()",
      "begin_line": 801,
      "end_line": 820,
      "comment": "",
      "child_ranges": [
        "(line 803,col 9)-(line 803,col 66)",
        "(line 805,col 9)-(line 805,col 96)",
        "(line 807,col 9)-(line 817,col 9)",
        "(line 819,col 9)-(line 819,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testRoundtrip()",
      "begin_line": 822,
      "end_line": 832,
      "comment": "",
      "child_ranges": [
        "(line 824,col 9)-(line 824,col 52)",
        "(line 825,col 9)-(line 825,col 74)",
        "(line 826,col 9)-(line 826,col 59)",
        "(line 827,col 9)-(line 829,col 9)",
        "(line 830,col 9)-(line 830,col 44)",
        "(line 831,col 9)-(line 831,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testSkipAutoHeader()",
      "begin_line": 834,
      "end_line": 842,
      "comment": "",
      "child_ranges": [
        "(line 836,col 9)-(line 836,col 66)",
        "(line 837,col 9)-(line 837,col 96)",
        "(line 838,col 9)-(line 838,col 48)",
        "(line 839,col 9)-(line 839,col 43)",
        "(line 840,col 9)-(line 840,col 43)",
        "(line 841,col 9)-(line 841,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.testSkipSetHeader()",
      "begin_line": 844,
      "end_line": 853,
      "comment": "",
      "child_ranges": [
        "(line 846,col 9)-(line 846,col 66)",
        "(line 847,col 9)-(line 848,col 38)",
        "(line 849,col 9)-(line 849,col 48)",
        "(line 850,col 9)-(line 850,col 43)",
        "(line 851,col 9)-(line 851,col 43)",
        "(line 852,col 9)-(line 852,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.validateLineNumbers(java.lang.String)",
      "begin_line": 855,
      "end_line": 870,
      "comment": "",
      "child_ranges": [
        "(line 856,col 9)-(line 857,col 70)",
        "(line 858,col 9)-(line 858,col 55)",
        "(line 859,col 9)-(line 859,col 43)",
        "(line 860,col 9)-(line 860,col 55)",
        "(line 861,col 9)-(line 861,col 43)",
        "(line 862,col 9)-(line 862,col 55)",
        "(line 863,col 9)-(line 863,col 43)",
        "(line 865,col 9)-(line 865,col 55)",
        "(line 866,col 9)-(line 866,col 40)",
        "(line 868,col 9)-(line 868,col 55)",
        "(line 869,col 9)-(line 869,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVParserTest.validateRecordNumbers(java.lang.String)",
      "begin_line": 872,
      "end_line": 889,
      "comment": "",
      "child_ranges": [
        "(line 873,col 9)-(line 874,col 70)",
        "(line 875,col 9)-(line 875,col 25)",
        "(line 876,col 9)-(line 876,col 50)",
        "(line 877,col 9)-(line 877,col 52)",
        "(line 878,col 9)-(line 878,col 50)",
        "(line 879,col 9)-(line 879,col 50)",
        "(line 880,col 9)-(line 880,col 52)",
        "(line 881,col 9)-(line 881,col 50)",
        "(line 882,col 9)-(line 882,col 50)",
        "(line 883,col 9)-(line 883,col 52)",
        "(line 884,col 9)-(line 884,col 50)",
        "(line 885,col 9)-(line 885,col 50)",
        "(line 886,col 9)-(line 886,col 49)",
        "(line 887,col 9)-(line 887,col 50)",
        "(line 888,col 9)-(line 888,col 23)"
      ]
    }
  ]
}