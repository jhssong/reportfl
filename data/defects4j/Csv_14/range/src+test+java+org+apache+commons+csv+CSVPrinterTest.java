{
  "filepath": "/tmp/Csv-14b/src/test/java/org/apache/commons/csv/CSVPrinterTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CSVPrinterTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 54,
      "end_line": 1034,
      "comment": "\n *\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DQUOTE_CHAR"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BACKSLASH_CH"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "QUOTE_CH"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ITERATIONS_FOR_RANDOM_TEST"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.printable(java.lang.String)",
      "begin_line": 61,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 53)",
        "(line 63,col 9)-(line 70,col 9)",
        "(line 71,col 9)-(line 71,col 29)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "recordSeparator"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.doOneRandom(org.apache.commons.csv.CSVFormat)",
      "begin_line": 76,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 38)",
        "(line 79,col 9)-(line 79,col 44)",
        "(line 80,col 9)-(line 80,col 42)",
        "(line 82,col 9)-(line 82,col 61)",
        "(line 84,col 9)-(line 84,col 51)",
        "(line 85,col 9)-(line 93,col 9)",
        "(line 94,col 9)-(line 94,col 44)",
        "(line 97,col 9)-(line 105,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.doRandom(org.apache.commons.csv.CSVFormat, int)",
      "begin_line": 108,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 111,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.expectNulls(T[], org.apache.commons.csv.CSVFormat)",
      "begin_line": 118,
      "end_line": 126,
      "comment": "\n     * Converts an input CSV array into expected output values WRT NULLs. NULL strings are converted to null values\n     * because the parser will convert these strings to null.\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 43)",
        "(line 120,col 9)-(line 124,col 9)",
        "(line 125,col 9)-(line 125,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.geH2Connection()",
      "begin_line": 128,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 39)",
        "(line 130,col 9)-(line 130,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.generateLines(int, int)",
      "begin_line": 133,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 54)",
        "(line 135,col 9)-(line 141,col 9)",
        "(line 142,col 9)-(line 142,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.printWithHeaderComments(java.io.StringWriter, java.util.Date, org.apache.commons.csv.CSVFormat)",
      "begin_line": 145,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 38)",
        "(line 149,col 9)-(line 149,col 87)",
        "(line 150,col 9)-(line 150,col 47)",
        "(line 151,col 9)-(line 151,col 51)",
        "(line 152,col 9)-(line 152,col 55)",
        "(line 153,col 9)-(line 153,col 41)",
        "(line 154,col 9)-(line 154,col 41)",
        "(line 155,col 9)-(line 155,col 27)",
        "(line 156,col 9)-(line 156,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.randStr()",
      "begin_line": 159,
      "end_line": 205,
      "comment": "",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 38)",
        "(line 162,col 9)-(line 162,col 37)",
        "(line 164,col 9)-(line 164,col 40)",
        "(line 165,col 9)-(line 203,col 9)",
        "(line 204,col 9)-(line 204,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.setUpTable(java.sql.Connection)",
      "begin_line": 207,
      "end_line": 213,
      "comment": "",
      "child_ranges": [
        "(line 208,col 9)-(line 212,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testDelimeterQuoted()",
      "begin_line": 215,
      "end_line": 223,
      "comment": "",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 51)",
        "(line 218,col 9)-(line 222,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testDelimeterQuoteNONE()",
      "begin_line": 225,
      "end_line": 234,
      "comment": "",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 51)",
        "(line 228,col 9)-(line 228,col 97)",
        "(line 229,col 9)-(line 233,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testDelimiterEscaped()",
      "begin_line": 236,
      "end_line": 244,
      "comment": "",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 51)",
        "(line 239,col 9)-(line 243,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testDelimiterPlain()",
      "begin_line": 246,
      "end_line": 254,
      "comment": "",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 51)",
        "(line 249,col 9)-(line 253,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testDisabledComment()",
      "begin_line": 256,
      "end_line": 263,
      "comment": "",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 51)",
        "(line 259,col 9)-(line 262,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testEOLEscaped()",
      "begin_line": 265,
      "end_line": 273,
      "comment": "",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 51)",
        "(line 268,col 9)-(line 272,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testEOLPlain()",
      "begin_line": 275,
      "end_line": 283,
      "comment": "",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 51)",
        "(line 278,col 9)-(line 282,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testEOLQuoted()",
      "begin_line": 285,
      "end_line": 293,
      "comment": "",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 51)",
        "(line 288,col 9)-(line 292,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testEscapeBackslash1()",
      "begin_line": 295,
      "end_line": 302,
      "comment": "",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 45)",
        "(line 298,col 9)-(line 300,col 9)",
        "(line 301,col 9)-(line 301,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testEscapeBackslash2()",
      "begin_line": 304,
      "end_line": 311,
      "comment": "",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 45)",
        "(line 307,col 9)-(line 309,col 9)",
        "(line 310,col 9)-(line 310,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testEscapeBackslash3()",
      "begin_line": 313,
      "end_line": 320,
      "comment": "",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 45)",
        "(line 316,col 9)-(line 318,col 9)",
        "(line 319,col 9)-(line 319,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testEscapeBackslash4()",
      "begin_line": 322,
      "end_line": 329,
      "comment": "",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 45)",
        "(line 325,col 9)-(line 327,col 9)",
        "(line 328,col 9)-(line 328,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testEscapeBackslash5()",
      "begin_line": 331,
      "end_line": 338,
      "comment": "",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 45)",
        "(line 334,col 9)-(line 336,col 9)",
        "(line 337,col 9)-(line 337,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testEscapeNull1()",
      "begin_line": 340,
      "end_line": 347,
      "comment": "",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 45)",
        "(line 343,col 9)-(line 345,col 9)",
        "(line 346,col 9)-(line 346,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testEscapeNull2()",
      "begin_line": 349,
      "end_line": 356,
      "comment": "",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 45)",
        "(line 352,col 9)-(line 354,col 9)",
        "(line 355,col 9)-(line 355,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testEscapeNull3()",
      "begin_line": 358,
      "end_line": 365,
      "comment": "",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 45)",
        "(line 361,col 9)-(line 363,col 9)",
        "(line 364,col 9)-(line 364,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testEscapeNull4()",
      "begin_line": 367,
      "end_line": 374,
      "comment": "",
      "child_ranges": [
        "(line 369,col 9)-(line 369,col 45)",
        "(line 370,col 9)-(line 372,col 9)",
        "(line 373,col 9)-(line 373,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testEscapeNull5()",
      "begin_line": 376,
      "end_line": 383,
      "comment": "",
      "child_ranges": [
        "(line 378,col 9)-(line 378,col 45)",
        "(line 379,col 9)-(line 381,col 9)",
        "(line 382,col 9)-(line 382,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testExcelPrintAllArrayOfArrays()",
      "begin_line": 385,
      "end_line": 392,
      "comment": "",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 51)",
        "(line 388,col 9)-(line 391,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testExcelPrintAllArrayOfLists()",
      "begin_line": 394,
      "end_line": 402,
      "comment": "",
      "child_ranges": [
        "(line 396,col 9)-(line 396,col 51)",
        "(line 397,col 9)-(line 401,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testExcelPrintAllIterableOfArrays()",
      "begin_line": 404,
      "end_line": 411,
      "comment": "",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 51)",
        "(line 407,col 9)-(line 410,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testExcelPrintAllIterableOfLists()",
      "begin_line": 413,
      "end_line": 421,
      "comment": "",
      "child_ranges": [
        "(line 415,col 9)-(line 415,col 51)",
        "(line 416,col 9)-(line 420,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testExcelPrinter1()",
      "begin_line": 423,
      "end_line": 430,
      "comment": "",
      "child_ranges": [
        "(line 425,col 9)-(line 425,col 51)",
        "(line 426,col 9)-(line 429,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testExcelPrinter2()",
      "begin_line": 432,
      "end_line": 439,
      "comment": "",
      "child_ranges": [
        "(line 434,col 9)-(line 434,col 51)",
        "(line 435,col 9)-(line 438,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testHeader()",
      "begin_line": 441,
      "end_line": 450,
      "comment": "",
      "child_ranges": [
        "(line 443,col 9)-(line 443,col 51)",
        "(line 444,col 9)-(line 449,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testHeaderCommentExcel()",
      "begin_line": 452,
      "end_line": 461,
      "comment": "",
      "child_ranges": [
        "(line 454,col 9)-(line 454,col 51)",
        "(line 455,col 9)-(line 455,col 36)",
        "(line 456,col 9)-(line 456,col 49)",
        "(line 457,col 9)-(line 460,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testHeaderCommentTdf()",
      "begin_line": 463,
      "end_line": 472,
      "comment": "",
      "child_ranges": [
        "(line 465,col 9)-(line 465,col 51)",
        "(line 466,col 9)-(line 466,col 36)",
        "(line 467,col 9)-(line 467,col 47)",
        "(line 468,col 9)-(line 471,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testHeaderNotSet()",
      "begin_line": 474,
      "end_line": 482,
      "comment": "",
      "child_ranges": [
        "(line 476,col 9)-(line 476,col 51)",
        "(line 477,col 9)-(line 481,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testInvalidFormat()",
      "begin_line": 484,
      "end_line": 490,
      "comment": "",
      "child_ranges": [
        "(line 486,col 9)-(line 486,col 76)",
        "(line 487,col 9)-(line 489,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testJdbcPrinter()",
      "begin_line": 492,
      "end_line": 503,
      "comment": "",
      "child_ranges": [
        "(line 494,col 9)-(line 494,col 51)",
        "(line 495,col 9)-(line 501,col 9)",
        "(line 502,col 9)-(line 502,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testJdbcPrinterWithResultSet()",
      "begin_line": 505,
      "end_line": 518,
      "comment": "",
      "child_ranges": [
        "(line 507,col 9)-(line 507,col 51)",
        "(line 508,col 9)-(line 508,col 39)",
        "(line 509,col 9)-(line 516,col 9)",
        "(line 517,col 9)-(line 517,col 119)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testJdbcPrinterWithResultSetMetaData()",
      "begin_line": 520,
      "end_line": 534,
      "comment": "",
      "child_ranges": [
        "(line 522,col 9)-(line 522,col 51)",
        "(line 523,col 9)-(line 523,col 39)",
        "(line 524,col 9)-(line 533,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testJira135_part1()",
      "begin_line": 536,
      "end_line": 550,
      "comment": "",
      "child_ranges": [
        "(line 539,col 9)-(line 539,col 125)",
        "(line 540,col 9)-(line 540,col 51)",
        "(line 541,col 9)-(line 541,col 53)",
        "(line 542,col 9)-(line 545,col 9)",
        "(line 546,col 9)-(line 546,col 73)",
        "(line 547,col 9)-(line 547,col 46)",
        "(line 548,col 9)-(line 548,col 71)",
        "(line 549,col 9)-(line 549,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testJira135_part2()",
      "begin_line": 552,
      "end_line": 566,
      "comment": "",
      "child_ranges": [
        "(line 555,col 9)-(line 555,col 125)",
        "(line 556,col 9)-(line 556,col 51)",
        "(line 557,col 9)-(line 557,col 53)",
        "(line 558,col 9)-(line 561,col 9)",
        "(line 562,col 9)-(line 562,col 72)",
        "(line 563,col 9)-(line 563,col 46)",
        "(line 564,col 9)-(line 564,col 71)",
        "(line 565,col 9)-(line 565,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testJira135_part3()",
      "begin_line": 568,
      "end_line": 582,
      "comment": "",
      "child_ranges": [
        "(line 571,col 9)-(line 571,col 125)",
        "(line 572,col 9)-(line 572,col 51)",
        "(line 573,col 9)-(line 573,col 53)",
        "(line 574,col 9)-(line 577,col 9)",
        "(line 578,col 9)-(line 578,col 73)",
        "(line 579,col 9)-(line 579,col 46)",
        "(line 580,col 9)-(line 580,col 71)",
        "(line 581,col 9)-(line 581,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testJira135All()",
      "begin_line": 584,
      "end_line": 600,
      "comment": "",
      "child_ranges": [
        "(line 587,col 9)-(line 587,col 125)",
        "(line 588,col 9)-(line 588,col 51)",
        "(line 589,col 9)-(line 589,col 53)",
        "(line 590,col 9)-(line 595,col 9)",
        "(line 596,col 9)-(line 596,col 88)",
        "(line 597,col 9)-(line 597,col 46)",
        "(line 598,col 9)-(line 598,col 71)",
        "(line 599,col 9)-(line 599,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testMultiLineComment()",
      "begin_line": 602,
      "end_line": 611,
      "comment": "",
      "child_ranges": [
        "(line 604,col 9)-(line 604,col 51)",
        "(line 605,col 9)-(line 610,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testMySqlNullOutput()",
      "begin_line": 613,
      "end_line": 713,
      "comment": "",
      "child_ranges": [
        "(line 615,col 9)-(line 615,col 51)",
        "(line 616,col 9)-(line 616,col 126)",
        "(line 617,col 9)-(line 617,col 49)",
        "(line 618,col 9)-(line 620,col 9)",
        "(line 621,col 9)-(line 621,col 45)",
        "(line 622,col 9)-(line 622,col 50)",
        "(line 623,col 9)-(line 623,col 65)",
        "(line 624,col 9)-(line 624,col 50)",
        "(line 626,col 9)-(line 626,col 41)",
        "(line 627,col 9)-(line 627,col 55)",
        "(line 628,col 9)-(line 628,col 36)",
        "(line 629,col 9)-(line 631,col 9)",
        "(line 632,col 9)-(line 632,col 34)",
        "(line 633,col 9)-(line 633,col 50)",
        "(line 634,col 9)-(line 634,col 56)",
        "(line 635,col 9)-(line 635,col 59)",
        "(line 637,col 9)-(line 637,col 40)",
        "(line 638,col 9)-(line 638,col 55)",
        "(line 639,col 9)-(line 639,col 36)",
        "(line 640,col 9)-(line 642,col 9)",
        "(line 643,col 9)-(line 643,col 32)",
        "(line 644,col 9)-(line 644,col 50)",
        "(line 645,col 9)-(line 645,col 56)",
        "(line 646,col 9)-(line 646,col 59)",
        "(line 648,col 9)-(line 648,col 39)",
        "(line 649,col 9)-(line 649,col 55)",
        "(line 650,col 9)-(line 650,col 36)",
        "(line 651,col 9)-(line 653,col 9)",
        "(line 654,col 9)-(line 654,col 30)",
        "(line 655,col 9)-(line 655,col 50)",
        "(line 656,col 9)-(line 656,col 56)",
        "(line 657,col 9)-(line 657,col 59)",
        "(line 659,col 9)-(line 659,col 38)",
        "(line 660,col 9)-(line 660,col 56)",
        "(line 661,col 9)-(line 661,col 36)",
        "(line 662,col 9)-(line 664,col 9)",
        "(line 665,col 9)-(line 665,col 30)",
        "(line 666,col 9)-(line 666,col 50)",
        "(line 667,col 9)-(line 667,col 56)",
        "(line 668,col 9)-(line 668,col 59)",
        "(line 670,col 9)-(line 670,col 38)",
        "(line 671,col 9)-(line 671,col 33)",
        "(line 672,col 9)-(line 672,col 36)",
        "(line 673,col 9)-(line 675,col 9)",
        "(line 676,col 9)-(line 676,col 29)",
        "(line 677,col 9)-(line 677,col 50)",
        "(line 678,col 9)-(line 678,col 56)",
        "(line 679,col 9)-(line 679,col 59)",
        "(line 681,col 9)-(line 681,col 54)",
        "(line 682,col 9)-(line 682,col 33)",
        "(line 683,col 9)-(line 683,col 36)",
        "(line 684,col 9)-(line 686,col 9)",
        "(line 687,col 9)-(line 687,col 47)",
        "(line 688,col 9)-(line 688,col 50)",
        "(line 689,col 9)-(line 689,col 56)",
        "(line 690,col 9)-(line 690,col 59)",
        "(line 692,col 9)-(line 692,col 44)",
        "(line 693,col 9)-(line 693,col 33)",
        "(line 694,col 9)-(line 694,col 36)",
        "(line 695,col 9)-(line 697,col 9)",
        "(line 698,col 9)-(line 698,col 37)",
        "(line 699,col 9)-(line 699,col 50)",
        "(line 700,col 9)-(line 700,col 56)",
        "(line 701,col 9)-(line 701,col 59)",
        "(line 703,col 9)-(line 703,col 36)",
        "(line 704,col 9)-(line 704,col 33)",
        "(line 705,col 9)-(line 705,col 36)",
        "(line 706,col 9)-(line 708,col 9)",
        "(line 709,col 9)-(line 709,col 31)",
        "(line 710,col 9)-(line 710,col 50)",
        "(line 711,col 9)-(line 711,col 56)",
        "(line 712,col 9)-(line 712,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testMySqlNullStringDefault()",
      "begin_line": 715,
      "end_line": 718,
      "comment": "",
      "child_ranges": [
        "(line 717,col 9)-(line 717,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testNewCsvPrinterAppendableNullFormat()",
      "begin_line": 720,
      "end_line": 725,
      "comment": "",
      "child_ranges": [
        "(line 722,col 9)-(line 724,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testNewCSVPrinterNullAppendableFormat()",
      "begin_line": 727,
      "end_line": 732,
      "comment": "",
      "child_ranges": [
        "(line 729,col 9)-(line 731,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testParseCustomNullValues()",
      "begin_line": 734,
      "end_line": 751,
      "comment": "",
      "child_ranges": [
        "(line 736,col 9)-(line 736,col 51)",
        "(line 737,col 9)-(line 737,col 74)",
        "(line 738,col 9)-(line 740,col 9)",
        "(line 741,col 9)-(line 741,col 47)",
        "(line 742,col 9)-(line 742,col 62)",
        "(line 743,col 9)-(line 750,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testPlainEscaped()",
      "begin_line": 753,
      "end_line": 761,
      "comment": "",
      "child_ranges": [
        "(line 755,col 9)-(line 755,col 51)",
        "(line 756,col 9)-(line 760,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testPlainPlain()",
      "begin_line": 763,
      "end_line": 771,
      "comment": "",
      "child_ranges": [
        "(line 765,col 9)-(line 765,col 51)",
        "(line 766,col 9)-(line 770,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testPlainQuoted()",
      "begin_line": 773,
      "end_line": 780,
      "comment": "",
      "child_ranges": [
        "(line 775,col 9)-(line 775,col 51)",
        "(line 776,col 9)-(line 779,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testPrint()",
      "begin_line": 782,
      "end_line": 789,
      "comment": "",
      "child_ranges": [
        "(line 784,col 9)-(line 784,col 51)",
        "(line 785,col 9)-(line 788,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testPrintCustomNullValues()",
      "begin_line": 791,
      "end_line": 798,
      "comment": "",
      "child_ranges": [
        "(line 793,col 9)-(line 793,col 51)",
        "(line 794,col 9)-(line 797,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testPrinter1()",
      "begin_line": 800,
      "end_line": 807,
      "comment": "",
      "child_ranges": [
        "(line 802,col 9)-(line 802,col 51)",
        "(line 803,col 9)-(line 806,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testPrinter2()",
      "begin_line": 809,
      "end_line": 816,
      "comment": "",
      "child_ranges": [
        "(line 811,col 9)-(line 811,col 51)",
        "(line 812,col 9)-(line 815,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testPrinter3()",
      "begin_line": 818,
      "end_line": 825,
      "comment": "",
      "child_ranges": [
        "(line 820,col 9)-(line 820,col 51)",
        "(line 821,col 9)-(line 824,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testPrinter4()",
      "begin_line": 827,
      "end_line": 834,
      "comment": "",
      "child_ranges": [
        "(line 829,col 9)-(line 829,col 51)",
        "(line 830,col 9)-(line 833,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testPrinter5()",
      "begin_line": 836,
      "end_line": 843,
      "comment": "",
      "child_ranges": [
        "(line 838,col 9)-(line 838,col 51)",
        "(line 839,col 9)-(line 842,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testPrinter6()",
      "begin_line": 845,
      "end_line": 852,
      "comment": "",
      "child_ranges": [
        "(line 847,col 9)-(line 847,col 51)",
        "(line 848,col 9)-(line 851,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testPrinter7()",
      "begin_line": 854,
      "end_line": 861,
      "comment": "",
      "child_ranges": [
        "(line 856,col 9)-(line 856,col 51)",
        "(line 857,col 9)-(line 860,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testPrintNullValues()",
      "begin_line": 863,
      "end_line": 870,
      "comment": "",
      "child_ranges": [
        "(line 865,col 9)-(line 865,col 51)",
        "(line 866,col 9)-(line 869,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testPrintOnePositiveInteger()",
      "begin_line": 872,
      "end_line": 879,
      "comment": "",
      "child_ranges": [
        "(line 874,col 9)-(line 874,col 51)",
        "(line 875,col 9)-(line 878,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testPrintToFileWithCharsetUtf16Be()",
      "begin_line": 881,
      "end_line": 888,
      "comment": "",
      "child_ranges": [
        "(line 883,col 9)-(line 883,col 70)",
        "(line 884,col 9)-(line 886,col 9)",
        "(line 887,col 9)-(line 887,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testPrintToFileWithDefaultCharset()",
      "begin_line": 890,
      "end_line": 897,
      "comment": "",
      "child_ranges": [
        "(line 892,col 9)-(line 892,col 70)",
        "(line 893,col 9)-(line 895,col 9)",
        "(line 896,col 9)-(line 896,col 109)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testPrintToPathWithDefaultCharset()",
      "begin_line": 899,
      "end_line": 906,
      "comment": "",
      "child_ranges": [
        "(line 901,col 9)-(line 901,col 70)",
        "(line 902,col 9)-(line 904,col 9)",
        "(line 905,col 9)-(line 905,col 109)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testQuoteAll()",
      "begin_line": 908,
      "end_line": 915,
      "comment": "",
      "child_ranges": [
        "(line 910,col 9)-(line 910,col 51)",
        "(line 911,col 9)-(line 914,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testQuoteNonNumeric()",
      "begin_line": 917,
      "end_line": 924,
      "comment": "",
      "child_ranges": [
        "(line 919,col 9)-(line 919,col 51)",
        "(line 920,col 9)-(line 923,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testRandomDefault()",
      "begin_line": 926,
      "end_line": 929,
      "comment": "",
      "child_ranges": [
        "(line 928,col 9)-(line 928,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testRandomExcel()",
      "begin_line": 931,
      "end_line": 934,
      "comment": "",
      "child_ranges": [
        "(line 933,col 9)-(line 933,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testRandomMySql()",
      "begin_line": 936,
      "end_line": 939,
      "comment": "",
      "child_ranges": [
        "(line 938,col 9)-(line 938,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testRandomRfc4180()",
      "begin_line": 941,
      "end_line": 944,
      "comment": "",
      "child_ranges": [
        "(line 943,col 9)-(line 943,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testRandomTdf()",
      "begin_line": 946,
      "end_line": 949,
      "comment": "",
      "child_ranges": [
        "(line 948,col 9)-(line 948,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testSingleLineComment()",
      "begin_line": 951,
      "end_line": 958,
      "comment": "",
      "child_ranges": [
        "(line 953,col 9)-(line 953,col 51)",
        "(line 954,col 9)-(line 957,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testSingleQuoteQuoted()",
      "begin_line": 960,
      "end_line": 968,
      "comment": "",
      "child_ranges": [
        "(line 962,col 9)-(line 962,col 51)",
        "(line 963,col 9)-(line 967,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testSkipHeaderRecordFalse()",
      "begin_line": 970,
      "end_line": 980,
      "comment": "",
      "child_ranges": [
        "(line 973,col 9)-(line 973,col 51)",
        "(line 974,col 9)-(line 979,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testSkipHeaderRecordTrue()",
      "begin_line": 982,
      "end_line": 992,
      "comment": "",
      "child_ranges": [
        "(line 985,col 9)-(line 985,col 51)",
        "(line 986,col 9)-(line 991,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testTrailingDelimiterOnTwoColumns()",
      "begin_line": 994,
      "end_line": 1001,
      "comment": "",
      "child_ranges": [
        "(line 996,col 9)-(line 996,col 51)",
        "(line 997,col 9)-(line 1000,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testTrimOffOneColumn()",
      "begin_line": 1003,
      "end_line": 1010,
      "comment": "",
      "child_ranges": [
        "(line 1005,col 9)-(line 1005,col 51)",
        "(line 1006,col 9)-(line 1009,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testTrimOnOneColumn()",
      "begin_line": 1012,
      "end_line": 1019,
      "comment": "",
      "child_ranges": [
        "(line 1014,col 9)-(line 1014,col 51)",
        "(line 1015,col 9)-(line 1018,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testTrimOnTwoColumns()",
      "begin_line": 1021,
      "end_line": 1029,
      "comment": "",
      "child_ranges": [
        "(line 1023,col 9)-(line 1023,col 51)",
        "(line 1024,col 9)-(line 1028,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.toFirstRecordValues(java.lang.String, org.apache.commons.csv.CSVFormat)",
      "begin_line": 1031,
      "end_line": 1033,
      "comment": "",
      "child_ranges": [
        "(line 1032,col 9)-(line 1032,col 78)"
      ]
    }
  ]
}