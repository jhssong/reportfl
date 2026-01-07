{
  "filepath": "/tmp/Csv-16b/src/test/java/org/apache/commons/csv/CSVPrinterTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CSVPrinterTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 63,
      "end_line": 1385,
      "comment": "\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "EURO_CH"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DQUOTE_CHAR"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BACKSLASH_CH"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "QUOTE_CH"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ITERATIONS_FOR_RANDOM_TEST"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.printable(java.lang.String)",
      "begin_line": 71,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 53)",
        "(line 73,col 9)-(line 80,col 9)",
        "(line 81,col 9)-(line 81,col 29)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "recordSeparator"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.doOneRandom(org.apache.commons.csv.CSVFormat)",
      "begin_line": 86,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 38)",
        "(line 89,col 9)-(line 89,col 44)",
        "(line 90,col 9)-(line 90,col 42)",
        "(line 92,col 9)-(line 92,col 61)",
        "(line 94,col 9)-(line 94,col 51)",
        "(line 95,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 104,col 44)",
        "(line 107,col 9)-(line 115,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.doRandom(org.apache.commons.csv.CSVFormat, int)",
      "begin_line": 118,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 119,col 9)-(line 121,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.expectNulls(T[], org.apache.commons.csv.CSVFormat)",
      "begin_line": 128,
      "end_line": 136,
      "comment": "\n     * Converts an input CSV array into expected output values WRT NULLs. NULL strings are converted to null values\n     * because the parser will convert these strings to null.\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 43)",
        "(line 130,col 9)-(line 134,col 9)",
        "(line 135,col 9)-(line 135,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.geH2Connection()",
      "begin_line": 138,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 39)",
        "(line 140,col 9)-(line 140,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.generateLines(int, int)",
      "begin_line": 143,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 54)",
        "(line 145,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 152,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.printWithHeaderComments(java.io.StringWriter, java.util.Date, org.apache.commons.csv.CSVFormat)",
      "begin_line": 155,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 38)",
        "(line 159,col 9)-(line 159,col 87)",
        "(line 160,col 9)-(line 160,col 47)",
        "(line 161,col 9)-(line 161,col 51)",
        "(line 162,col 9)-(line 162,col 55)",
        "(line 163,col 9)-(line 163,col 41)",
        "(line 164,col 9)-(line 164,col 41)",
        "(line 165,col 9)-(line 165,col 27)",
        "(line 166,col 9)-(line 166,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.randStr()",
      "begin_line": 169,
      "end_line": 215,
      "comment": "",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 38)",
        "(line 172,col 9)-(line 172,col 37)",
        "(line 174,col 9)-(line 174,col 40)",
        "(line 175,col 9)-(line 213,col 9)",
        "(line 214,col 9)-(line 214,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.setUpTable(java.sql.Connection)",
      "begin_line": 217,
      "end_line": 223,
      "comment": "",
      "child_ranges": [
        "(line 218,col 9)-(line 222,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testDelimeterQuoted()",
      "begin_line": 225,
      "end_line": 233,
      "comment": "",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 51)",
        "(line 228,col 9)-(line 232,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testDelimeterQuoteNONE()",
      "begin_line": 235,
      "end_line": 244,
      "comment": "",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 51)",
        "(line 238,col 9)-(line 238,col 97)",
        "(line 239,col 9)-(line 243,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testDelimiterEscaped()",
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
      "signature": "org.apache.commons.csv.CSVPrinterTest.testDelimiterPlain()",
      "begin_line": 256,
      "end_line": 264,
      "comment": "",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 51)",
        "(line 259,col 9)-(line 263,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testDisabledComment()",
      "begin_line": 266,
      "end_line": 273,
      "comment": "",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 51)",
        "(line 269,col 9)-(line 272,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testEOLEscaped()",
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
      "signature": "org.apache.commons.csv.CSVPrinterTest.testEOLPlain()",
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
      "signature": "org.apache.commons.csv.CSVPrinterTest.testEOLQuoted()",
      "begin_line": 295,
      "end_line": 303,
      "comment": "",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 51)",
        "(line 298,col 9)-(line 302,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testEscapeBackslash1()",
      "begin_line": 305,
      "end_line": 312,
      "comment": "",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 51)",
        "(line 308,col 9)-(line 310,col 9)",
        "(line 311,col 9)-(line 311,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testEscapeBackslash2()",
      "begin_line": 314,
      "end_line": 321,
      "comment": "",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 51)",
        "(line 317,col 9)-(line 319,col 9)",
        "(line 320,col 9)-(line 320,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testEscapeBackslash3()",
      "begin_line": 323,
      "end_line": 330,
      "comment": "",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 51)",
        "(line 326,col 9)-(line 328,col 9)",
        "(line 329,col 9)-(line 329,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testEscapeBackslash4()",
      "begin_line": 332,
      "end_line": 339,
      "comment": "",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 51)",
        "(line 335,col 9)-(line 337,col 9)",
        "(line 338,col 9)-(line 338,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testEscapeBackslash5()",
      "begin_line": 341,
      "end_line": 348,
      "comment": "",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 51)",
        "(line 344,col 9)-(line 346,col 9)",
        "(line 347,col 9)-(line 347,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testEscapeNull1()",
      "begin_line": 350,
      "end_line": 357,
      "comment": "",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 51)",
        "(line 353,col 9)-(line 355,col 9)",
        "(line 356,col 9)-(line 356,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testEscapeNull2()",
      "begin_line": 359,
      "end_line": 366,
      "comment": "",
      "child_ranges": [
        "(line 361,col 9)-(line 361,col 51)",
        "(line 362,col 9)-(line 364,col 9)",
        "(line 365,col 9)-(line 365,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testEscapeNull3()",
      "begin_line": 368,
      "end_line": 375,
      "comment": "",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 51)",
        "(line 371,col 9)-(line 373,col 9)",
        "(line 374,col 9)-(line 374,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testEscapeNull4()",
      "begin_line": 377,
      "end_line": 384,
      "comment": "",
      "child_ranges": [
        "(line 379,col 9)-(line 379,col 51)",
        "(line 380,col 9)-(line 382,col 9)",
        "(line 383,col 9)-(line 383,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testEscapeNull5()",
      "begin_line": 386,
      "end_line": 393,
      "comment": "",
      "child_ranges": [
        "(line 388,col 9)-(line 388,col 51)",
        "(line 389,col 9)-(line 391,col 9)",
        "(line 392,col 9)-(line 392,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testExcelPrintAllArrayOfArrays()",
      "begin_line": 395,
      "end_line": 402,
      "comment": "",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 51)",
        "(line 398,col 9)-(line 401,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testExcelPrintAllArrayOfLists()",
      "begin_line": 404,
      "end_line": 412,
      "comment": "",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 51)",
        "(line 407,col 9)-(line 411,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testExcelPrintAllIterableOfArrays()",
      "begin_line": 414,
      "end_line": 421,
      "comment": "",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 51)",
        "(line 417,col 9)-(line 420,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testExcelPrintAllIterableOfLists()",
      "begin_line": 423,
      "end_line": 431,
      "comment": "",
      "child_ranges": [
        "(line 425,col 9)-(line 425,col 51)",
        "(line 426,col 9)-(line 430,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testExcelPrinter1()",
      "begin_line": 433,
      "end_line": 440,
      "comment": "",
      "child_ranges": [
        "(line 435,col 9)-(line 435,col 51)",
        "(line 436,col 9)-(line 439,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testExcelPrinter2()",
      "begin_line": 442,
      "end_line": 449,
      "comment": "",
      "child_ranges": [
        "(line 444,col 9)-(line 444,col 51)",
        "(line 445,col 9)-(line 448,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testHeader()",
      "begin_line": 451,
      "end_line": 460,
      "comment": "",
      "child_ranges": [
        "(line 453,col 9)-(line 453,col 51)",
        "(line 454,col 9)-(line 459,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testHeaderCommentExcel()",
      "begin_line": 462,
      "end_line": 471,
      "comment": "",
      "child_ranges": [
        "(line 464,col 9)-(line 464,col 51)",
        "(line 465,col 9)-(line 465,col 36)",
        "(line 466,col 9)-(line 466,col 49)",
        "(line 467,col 9)-(line 470,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testHeaderCommentTdf()",
      "begin_line": 473,
      "end_line": 482,
      "comment": "",
      "child_ranges": [
        "(line 475,col 9)-(line 475,col 51)",
        "(line 476,col 9)-(line 476,col 36)",
        "(line 477,col 9)-(line 477,col 47)",
        "(line 478,col 9)-(line 481,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testHeaderNotSet()",
      "begin_line": 484,
      "end_line": 492,
      "comment": "",
      "child_ranges": [
        "(line 486,col 9)-(line 486,col 51)",
        "(line 487,col 9)-(line 491,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testInvalidFormat()",
      "begin_line": 494,
      "end_line": 500,
      "comment": "",
      "child_ranges": [
        "(line 496,col 9)-(line 496,col 76)",
        "(line 497,col 9)-(line 499,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testJdbcPrinter()",
      "begin_line": 502,
      "end_line": 513,
      "comment": "",
      "child_ranges": [
        "(line 504,col 9)-(line 504,col 51)",
        "(line 505,col 9)-(line 511,col 9)",
        "(line 512,col 9)-(line 512,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testJdbcPrinterWithResultSet()",
      "begin_line": 515,
      "end_line": 528,
      "comment": "",
      "child_ranges": [
        "(line 517,col 9)-(line 517,col 51)",
        "(line 518,col 9)-(line 518,col 39)",
        "(line 519,col 9)-(line 526,col 9)",
        "(line 527,col 9)-(line 527,col 119)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testJdbcPrinterWithResultSetMetaData()",
      "begin_line": 530,
      "end_line": 544,
      "comment": "",
      "child_ranges": [
        "(line 532,col 9)-(line 532,col 51)",
        "(line 533,col 9)-(line 533,col 39)",
        "(line 534,col 9)-(line 543,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testJira135_part1()",
      "begin_line": 546,
      "end_line": 560,
      "comment": "",
      "child_ranges": [
        "(line 549,col 9)-(line 549,col 125)",
        "(line 550,col 9)-(line 550,col 51)",
        "(line 551,col 9)-(line 551,col 53)",
        "(line 552,col 9)-(line 555,col 9)",
        "(line 556,col 9)-(line 556,col 73)",
        "(line 557,col 9)-(line 557,col 46)",
        "(line 558,col 9)-(line 558,col 71)",
        "(line 559,col 9)-(line 559,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testJira135_part2()",
      "begin_line": 562,
      "end_line": 576,
      "comment": "",
      "child_ranges": [
        "(line 565,col 9)-(line 565,col 125)",
        "(line 566,col 9)-(line 566,col 51)",
        "(line 567,col 9)-(line 567,col 53)",
        "(line 568,col 9)-(line 571,col 9)",
        "(line 572,col 9)-(line 572,col 72)",
        "(line 573,col 9)-(line 573,col 46)",
        "(line 574,col 9)-(line 574,col 71)",
        "(line 575,col 9)-(line 575,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testJira135_part3()",
      "begin_line": 578,
      "end_line": 592,
      "comment": "",
      "child_ranges": [
        "(line 581,col 9)-(line 581,col 125)",
        "(line 582,col 9)-(line 582,col 51)",
        "(line 583,col 9)-(line 583,col 53)",
        "(line 584,col 9)-(line 587,col 9)",
        "(line 588,col 9)-(line 588,col 73)",
        "(line 589,col 9)-(line 589,col 46)",
        "(line 590,col 9)-(line 590,col 71)",
        "(line 591,col 9)-(line 591,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testJira135All()",
      "begin_line": 594,
      "end_line": 610,
      "comment": "",
      "child_ranges": [
        "(line 597,col 9)-(line 597,col 125)",
        "(line 598,col 9)-(line 598,col 51)",
        "(line 599,col 9)-(line 599,col 53)",
        "(line 600,col 9)-(line 605,col 9)",
        "(line 606,col 9)-(line 606,col 88)",
        "(line 607,col 9)-(line 607,col 46)",
        "(line 608,col 9)-(line 608,col 71)",
        "(line 609,col 9)-(line 609,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testMultiLineComment()",
      "begin_line": 612,
      "end_line": 621,
      "comment": "",
      "child_ranges": [
        "(line 614,col 9)-(line 614,col 51)",
        "(line 615,col 9)-(line 620,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testMySqlNullOutput()",
      "begin_line": 623,
      "end_line": 723,
      "comment": "",
      "child_ranges": [
        "(line 625,col 9)-(line 625,col 51)",
        "(line 626,col 9)-(line 626,col 126)",
        "(line 627,col 9)-(line 627,col 49)",
        "(line 628,col 9)-(line 630,col 9)",
        "(line 631,col 9)-(line 631,col 45)",
        "(line 632,col 9)-(line 632,col 50)",
        "(line 633,col 9)-(line 633,col 65)",
        "(line 634,col 9)-(line 634,col 50)",
        "(line 636,col 9)-(line 636,col 41)",
        "(line 637,col 9)-(line 637,col 55)",
        "(line 638,col 9)-(line 638,col 36)",
        "(line 639,col 9)-(line 641,col 9)",
        "(line 642,col 9)-(line 642,col 34)",
        "(line 643,col 9)-(line 643,col 50)",
        "(line 644,col 9)-(line 644,col 56)",
        "(line 645,col 9)-(line 645,col 59)",
        "(line 647,col 9)-(line 647,col 40)",
        "(line 648,col 9)-(line 648,col 55)",
        "(line 649,col 9)-(line 649,col 36)",
        "(line 650,col 9)-(line 652,col 9)",
        "(line 653,col 9)-(line 653,col 32)",
        "(line 654,col 9)-(line 654,col 50)",
        "(line 655,col 9)-(line 655,col 56)",
        "(line 656,col 9)-(line 656,col 59)",
        "(line 658,col 9)-(line 658,col 39)",
        "(line 659,col 9)-(line 659,col 55)",
        "(line 660,col 9)-(line 660,col 36)",
        "(line 661,col 9)-(line 663,col 9)",
        "(line 664,col 9)-(line 664,col 30)",
        "(line 665,col 9)-(line 665,col 50)",
        "(line 666,col 9)-(line 666,col 56)",
        "(line 667,col 9)-(line 667,col 59)",
        "(line 669,col 9)-(line 669,col 38)",
        "(line 670,col 9)-(line 670,col 56)",
        "(line 671,col 9)-(line 671,col 36)",
        "(line 672,col 9)-(line 674,col 9)",
        "(line 675,col 9)-(line 675,col 30)",
        "(line 676,col 9)-(line 676,col 50)",
        "(line 677,col 9)-(line 677,col 56)",
        "(line 678,col 9)-(line 678,col 59)",
        "(line 680,col 9)-(line 680,col 38)",
        "(line 681,col 9)-(line 681,col 33)",
        "(line 682,col 9)-(line 682,col 36)",
        "(line 683,col 9)-(line 685,col 9)",
        "(line 686,col 9)-(line 686,col 29)",
        "(line 687,col 9)-(line 687,col 50)",
        "(line 688,col 9)-(line 688,col 56)",
        "(line 689,col 9)-(line 689,col 59)",
        "(line 691,col 9)-(line 691,col 54)",
        "(line 692,col 9)-(line 692,col 33)",
        "(line 693,col 9)-(line 693,col 36)",
        "(line 694,col 9)-(line 696,col 9)",
        "(line 697,col 9)-(line 697,col 47)",
        "(line 698,col 9)-(line 698,col 50)",
        "(line 699,col 9)-(line 699,col 56)",
        "(line 700,col 9)-(line 700,col 59)",
        "(line 702,col 9)-(line 702,col 44)",
        "(line 703,col 9)-(line 703,col 33)",
        "(line 704,col 9)-(line 704,col 36)",
        "(line 705,col 9)-(line 707,col 9)",
        "(line 708,col 9)-(line 708,col 37)",
        "(line 709,col 9)-(line 709,col 50)",
        "(line 710,col 9)-(line 710,col 56)",
        "(line 711,col 9)-(line 711,col 59)",
        "(line 713,col 9)-(line 713,col 36)",
        "(line 714,col 9)-(line 714,col 33)",
        "(line 715,col 9)-(line 715,col 36)",
        "(line 716,col 9)-(line 718,col 9)",
        "(line 719,col 9)-(line 719,col 31)",
        "(line 720,col 9)-(line 720,col 50)",
        "(line 721,col 9)-(line 721,col 56)",
        "(line 722,col 9)-(line 722,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testPostgreSqlCsvNullOutput()",
      "begin_line": 725,
      "end_line": 826,
      "comment": "",
      "child_ranges": [
        "(line 728,col 9)-(line 728,col 51)",
        "(line 729,col 9)-(line 729,col 136)",
        "(line 730,col 9)-(line 730,col 49)",
        "(line 731,col 9)-(line 733,col 9)",
        "(line 734,col 9)-(line 734,col 44)",
        "(line 735,col 9)-(line 735,col 50)",
        "(line 736,col 9)-(line 736,col 65)",
        "(line 737,col 9)-(line 737,col 50)",
        "(line 739,col 9)-(line 739,col 41)",
        "(line 740,col 9)-(line 740,col 64)",
        "(line 741,col 9)-(line 741,col 36)",
        "(line 742,col 9)-(line 744,col 9)",
        "(line 745,col 9)-(line 745,col 34)",
        "(line 746,col 9)-(line 746,col 50)",
        "(line 747,col 9)-(line 747,col 56)",
        "(line 748,col 9)-(line 748,col 59)",
        "(line 750,col 9)-(line 750,col 40)",
        "(line 751,col 9)-(line 751,col 64)",
        "(line 752,col 9)-(line 752,col 36)",
        "(line 753,col 9)-(line 755,col 9)",
        "(line 756,col 9)-(line 756,col 32)",
        "(line 757,col 9)-(line 757,col 50)",
        "(line 758,col 9)-(line 758,col 56)",
        "(line 759,col 9)-(line 759,col 59)",
        "(line 761,col 9)-(line 761,col 39)",
        "(line 762,col 9)-(line 762,col 64)",
        "(line 763,col 9)-(line 763,col 36)",
        "(line 764,col 9)-(line 766,col 9)",
        "(line 767,col 9)-(line 767,col 30)",
        "(line 768,col 9)-(line 768,col 50)",
        "(line 769,col 9)-(line 769,col 56)",
        "(line 770,col 9)-(line 770,col 59)",
        "(line 772,col 9)-(line 772,col 38)",
        "(line 773,col 9)-(line 773,col 65)",
        "(line 774,col 9)-(line 774,col 36)",
        "(line 775,col 9)-(line 777,col 9)",
        "(line 778,col 9)-(line 778,col 30)",
        "(line 779,col 9)-(line 779,col 50)",
        "(line 780,col 9)-(line 780,col 56)",
        "(line 781,col 9)-(line 781,col 59)",
        "(line 783,col 9)-(line 783,col 38)",
        "(line 784,col 9)-(line 784,col 42)",
        "(line 785,col 9)-(line 785,col 36)",
        "(line 786,col 9)-(line 788,col 9)",
        "(line 789,col 9)-(line 789,col 29)",
        "(line 790,col 9)-(line 790,col 50)",
        "(line 791,col 9)-(line 791,col 56)",
        "(line 792,col 9)-(line 792,col 59)",
        "(line 794,col 9)-(line 794,col 54)",
        "(line 795,col 9)-(line 795,col 42)",
        "(line 796,col 9)-(line 796,col 36)",
        "(line 797,col 9)-(line 799,col 9)",
        "(line 800,col 9)-(line 800,col 47)",
        "(line 801,col 9)-(line 801,col 50)",
        "(line 802,col 9)-(line 802,col 56)",
        "(line 803,col 9)-(line 803,col 59)",
        "(line 805,col 9)-(line 805,col 44)",
        "(line 806,col 9)-(line 806,col 42)",
        "(line 807,col 9)-(line 807,col 36)",
        "(line 808,col 9)-(line 810,col 9)",
        "(line 811,col 9)-(line 811,col 37)",
        "(line 812,col 9)-(line 812,col 50)",
        "(line 813,col 9)-(line 813,col 56)",
        "(line 814,col 9)-(line 814,col 59)",
        "(line 816,col 9)-(line 816,col 36)",
        "(line 817,col 9)-(line 817,col 42)",
        "(line 818,col 9)-(line 818,col 36)",
        "(line 819,col 9)-(line 821,col 9)",
        "(line 822,col 9)-(line 822,col 31)",
        "(line 823,col 9)-(line 823,col 50)",
        "(line 824,col 9)-(line 824,col 56)",
        "(line 825,col 9)-(line 825,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testPostgreSqlCsvTextOutput()",
      "begin_line": 828,
      "end_line": 929,
      "comment": "",
      "child_ranges": [
        "(line 831,col 9)-(line 831,col 51)",
        "(line 832,col 9)-(line 832,col 137)",
        "(line 833,col 9)-(line 833,col 49)",
        "(line 834,col 9)-(line 836,col 9)",
        "(line 837,col 9)-(line 837,col 45)",
        "(line 838,col 9)-(line 838,col 50)",
        "(line 839,col 9)-(line 839,col 65)",
        "(line 840,col 9)-(line 840,col 50)",
        "(line 842,col 9)-(line 842,col 41)",
        "(line 843,col 9)-(line 843,col 65)",
        "(line 844,col 9)-(line 844,col 36)",
        "(line 845,col 9)-(line 847,col 9)",
        "(line 848,col 9)-(line 848,col 34)",
        "(line 849,col 9)-(line 849,col 50)",
        "(line 850,col 9)-(line 850,col 56)",
        "(line 851,col 9)-(line 851,col 59)",
        "(line 853,col 9)-(line 853,col 40)",
        "(line 854,col 9)-(line 854,col 65)",
        "(line 855,col 9)-(line 855,col 36)",
        "(line 856,col 9)-(line 858,col 9)",
        "(line 859,col 9)-(line 859,col 32)",
        "(line 860,col 9)-(line 860,col 50)",
        "(line 861,col 9)-(line 861,col 56)",
        "(line 862,col 9)-(line 862,col 59)",
        "(line 864,col 9)-(line 864,col 39)",
        "(line 865,col 9)-(line 865,col 65)",
        "(line 866,col 9)-(line 866,col 36)",
        "(line 867,col 9)-(line 869,col 9)",
        "(line 870,col 9)-(line 870,col 30)",
        "(line 871,col 9)-(line 871,col 50)",
        "(line 872,col 9)-(line 872,col 56)",
        "(line 873,col 9)-(line 873,col 59)",
        "(line 875,col 9)-(line 875,col 38)",
        "(line 876,col 9)-(line 876,col 66)",
        "(line 877,col 9)-(line 877,col 36)",
        "(line 878,col 9)-(line 880,col 9)",
        "(line 881,col 9)-(line 881,col 30)",
        "(line 882,col 9)-(line 882,col 50)",
        "(line 883,col 9)-(line 883,col 56)",
        "(line 884,col 9)-(line 884,col 59)",
        "(line 886,col 9)-(line 886,col 38)",
        "(line 887,col 9)-(line 887,col 43)",
        "(line 888,col 9)-(line 888,col 36)",
        "(line 889,col 9)-(line 891,col 9)",
        "(line 892,col 9)-(line 892,col 29)",
        "(line 893,col 9)-(line 893,col 50)",
        "(line 894,col 9)-(line 894,col 56)",
        "(line 895,col 9)-(line 895,col 59)",
        "(line 897,col 9)-(line 897,col 54)",
        "(line 898,col 9)-(line 898,col 43)",
        "(line 899,col 9)-(line 899,col 36)",
        "(line 900,col 9)-(line 902,col 9)",
        "(line 903,col 9)-(line 903,col 47)",
        "(line 904,col 9)-(line 904,col 50)",
        "(line 905,col 9)-(line 905,col 56)",
        "(line 906,col 9)-(line 906,col 59)",
        "(line 908,col 9)-(line 908,col 44)",
        "(line 909,col 9)-(line 909,col 43)",
        "(line 910,col 9)-(line 910,col 36)",
        "(line 911,col 9)-(line 913,col 9)",
        "(line 914,col 9)-(line 914,col 37)",
        "(line 915,col 9)-(line 915,col 50)",
        "(line 916,col 9)-(line 916,col 56)",
        "(line 917,col 9)-(line 917,col 59)",
        "(line 919,col 9)-(line 919,col 36)",
        "(line 920,col 9)-(line 920,col 43)",
        "(line 921,col 9)-(line 921,col 36)",
        "(line 922,col 9)-(line 924,col 9)",
        "(line 925,col 9)-(line 925,col 31)",
        "(line 926,col 9)-(line 926,col 50)",
        "(line 927,col 9)-(line 927,col 56)",
        "(line 928,col 9)-(line 928,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testMySqlNullStringDefault()",
      "begin_line": 931,
      "end_line": 934,
      "comment": "",
      "child_ranges": [
        "(line 933,col 9)-(line 933,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testPostgreSQLNullStringDefaultCsv()",
      "begin_line": 936,
      "end_line": 939,
      "comment": "",
      "child_ranges": [
        "(line 938,col 9)-(line 938,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testPostgreSQLNullStringDefaultText()",
      "begin_line": 941,
      "end_line": 944,
      "comment": "",
      "child_ranges": [
        "(line 943,col 9)-(line 943,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testNewCsvPrinterAppendableNullFormat()",
      "begin_line": 946,
      "end_line": 951,
      "comment": "",
      "child_ranges": [
        "(line 948,col 9)-(line 950,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testNewCSVPrinterNullAppendableFormat()",
      "begin_line": 953,
      "end_line": 958,
      "comment": "",
      "child_ranges": [
        "(line 955,col 9)-(line 957,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testParseCustomNullValues()",
      "begin_line": 960,
      "end_line": 977,
      "comment": "",
      "child_ranges": [
        "(line 962,col 9)-(line 962,col 51)",
        "(line 963,col 9)-(line 963,col 74)",
        "(line 964,col 9)-(line 966,col 9)",
        "(line 967,col 9)-(line 967,col 47)",
        "(line 968,col 9)-(line 968,col 62)",
        "(line 969,col 9)-(line 976,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testPlainEscaped()",
      "begin_line": 979,
      "end_line": 987,
      "comment": "",
      "child_ranges": [
        "(line 981,col 9)-(line 981,col 51)",
        "(line 982,col 9)-(line 986,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testPlainPlain()",
      "begin_line": 989,
      "end_line": 997,
      "comment": "",
      "child_ranges": [
        "(line 991,col 9)-(line 991,col 51)",
        "(line 992,col 9)-(line 996,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testPlainQuoted()",
      "begin_line": 999,
      "end_line": 1006,
      "comment": "",
      "child_ranges": [
        "(line 1001,col 9)-(line 1001,col 51)",
        "(line 1002,col 9)-(line 1005,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testPrint()",
      "begin_line": 1008,
      "end_line": 1015,
      "comment": "",
      "child_ranges": [
        "(line 1010,col 9)-(line 1010,col 51)",
        "(line 1011,col 9)-(line 1014,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testPrintCustomNullValues()",
      "begin_line": 1017,
      "end_line": 1024,
      "comment": "",
      "child_ranges": [
        "(line 1019,col 9)-(line 1019,col 51)",
        "(line 1020,col 9)-(line 1023,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testPrinter1()",
      "begin_line": 1026,
      "end_line": 1033,
      "comment": "",
      "child_ranges": [
        "(line 1028,col 9)-(line 1028,col 51)",
        "(line 1029,col 9)-(line 1032,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testDontQuoteEuroFirstChar()",
      "begin_line": 1035,
      "end_line": 1042,
      "comment": "",
      "child_ranges": [
        "(line 1037,col 9)-(line 1037,col 51)",
        "(line 1038,col 9)-(line 1041,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testQuoteCommaFirstChar()",
      "begin_line": 1044,
      "end_line": 1051,
      "comment": "",
      "child_ranges": [
        "(line 1046,col 9)-(line 1046,col 51)",
        "(line 1047,col 9)-(line 1050,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testPrinter2()",
      "begin_line": 1053,
      "end_line": 1060,
      "comment": "",
      "child_ranges": [
        "(line 1055,col 9)-(line 1055,col 51)",
        "(line 1056,col 9)-(line 1059,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testPrinter3()",
      "begin_line": 1062,
      "end_line": 1069,
      "comment": "",
      "child_ranges": [
        "(line 1064,col 9)-(line 1064,col 51)",
        "(line 1065,col 9)-(line 1068,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testPrinter4()",
      "begin_line": 1071,
      "end_line": 1078,
      "comment": "",
      "child_ranges": [
        "(line 1073,col 9)-(line 1073,col 51)",
        "(line 1074,col 9)-(line 1077,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testPrinter5()",
      "begin_line": 1080,
      "end_line": 1087,
      "comment": "",
      "child_ranges": [
        "(line 1082,col 9)-(line 1082,col 51)",
        "(line 1083,col 9)-(line 1086,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testPrinter6()",
      "begin_line": 1089,
      "end_line": 1096,
      "comment": "",
      "child_ranges": [
        "(line 1091,col 9)-(line 1091,col 51)",
        "(line 1092,col 9)-(line 1095,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testPrinter7()",
      "begin_line": 1098,
      "end_line": 1105,
      "comment": "",
      "child_ranges": [
        "(line 1100,col 9)-(line 1100,col 51)",
        "(line 1101,col 9)-(line 1104,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testPrintNullValues()",
      "begin_line": 1107,
      "end_line": 1114,
      "comment": "",
      "child_ranges": [
        "(line 1109,col 9)-(line 1109,col 51)",
        "(line 1110,col 9)-(line 1113,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testPrintOnePositiveInteger()",
      "begin_line": 1116,
      "end_line": 1123,
      "comment": "",
      "child_ranges": [
        "(line 1118,col 9)-(line 1118,col 51)",
        "(line 1119,col 9)-(line 1122,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testPrintToFileWithCharsetUtf16Be()",
      "begin_line": 1125,
      "end_line": 1132,
      "comment": "",
      "child_ranges": [
        "(line 1127,col 9)-(line 1127,col 76)",
        "(line 1128,col 9)-(line 1130,col 9)",
        "(line 1131,col 9)-(line 1131,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testPrintToFileWithDefaultCharset()",
      "begin_line": 1134,
      "end_line": 1141,
      "comment": "",
      "child_ranges": [
        "(line 1136,col 9)-(line 1136,col 76)",
        "(line 1137,col 9)-(line 1139,col 9)",
        "(line 1140,col 9)-(line 1140,col 109)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testPrintToPathWithDefaultCharset()",
      "begin_line": 1143,
      "end_line": 1150,
      "comment": "",
      "child_ranges": [
        "(line 1145,col 9)-(line 1145,col 76)",
        "(line 1146,col 9)-(line 1148,col 9)",
        "(line 1149,col 9)-(line 1149,col 109)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testQuoteAll()",
      "begin_line": 1152,
      "end_line": 1159,
      "comment": "",
      "child_ranges": [
        "(line 1154,col 9)-(line 1154,col 51)",
        "(line 1155,col 9)-(line 1158,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testQuoteNonNumeric()",
      "begin_line": 1161,
      "end_line": 1168,
      "comment": "",
      "child_ranges": [
        "(line 1163,col 9)-(line 1163,col 51)",
        "(line 1164,col 9)-(line 1167,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testRandomDefault()",
      "begin_line": 1170,
      "end_line": 1173,
      "comment": "",
      "child_ranges": [
        "(line 1172,col 9)-(line 1172,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testRandomExcel()",
      "begin_line": 1175,
      "end_line": 1178,
      "comment": "",
      "child_ranges": [
        "(line 1177,col 9)-(line 1177,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testRandomMySql()",
      "begin_line": 1180,
      "end_line": 1183,
      "comment": "",
      "child_ranges": [
        "(line 1182,col 9)-(line 1182,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testRandomOracle()",
      "begin_line": 1185,
      "end_line": 1189,
      "comment": "",
      "child_ranges": [
        "(line 1188,col 9)-(line 1188,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testRandomPostgreSqlCsv()",
      "begin_line": 1191,
      "end_line": 1195,
      "comment": "",
      "child_ranges": [
        "(line 1194,col 9)-(line 1194,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testRandomPostgreSqlText()",
      "begin_line": 1197,
      "end_line": 1201,
      "comment": "",
      "child_ranges": [
        "(line 1200,col 9)-(line 1200,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testRandomRfc4180()",
      "begin_line": 1203,
      "end_line": 1206,
      "comment": "",
      "child_ranges": [
        "(line 1205,col 9)-(line 1205,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testRandomTdf()",
      "begin_line": 1208,
      "end_line": 1211,
      "comment": "",
      "child_ranges": [
        "(line 1210,col 9)-(line 1210,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testSingleLineComment()",
      "begin_line": 1213,
      "end_line": 1220,
      "comment": "",
      "child_ranges": [
        "(line 1215,col 9)-(line 1215,col 51)",
        "(line 1216,col 9)-(line 1219,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testSingleQuoteQuoted()",
      "begin_line": 1222,
      "end_line": 1230,
      "comment": "",
      "child_ranges": [
        "(line 1224,col 9)-(line 1224,col 51)",
        "(line 1225,col 9)-(line 1229,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testSkipHeaderRecordFalse()",
      "begin_line": 1232,
      "end_line": 1242,
      "comment": "",
      "child_ranges": [
        "(line 1235,col 9)-(line 1235,col 51)",
        "(line 1236,col 9)-(line 1241,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testSkipHeaderRecordTrue()",
      "begin_line": 1244,
      "end_line": 1254,
      "comment": "",
      "child_ranges": [
        "(line 1247,col 9)-(line 1247,col 51)",
        "(line 1248,col 9)-(line 1253,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testTrailingDelimiterOnTwoColumns()",
      "begin_line": 1256,
      "end_line": 1263,
      "comment": "",
      "child_ranges": [
        "(line 1258,col 9)-(line 1258,col 51)",
        "(line 1259,col 9)-(line 1262,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testTrimOffOneColumn()",
      "begin_line": 1265,
      "end_line": 1272,
      "comment": "",
      "child_ranges": [
        "(line 1267,col 9)-(line 1267,col 51)",
        "(line 1268,col 9)-(line 1271,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testTrimOnOneColumn()",
      "begin_line": 1274,
      "end_line": 1281,
      "comment": "",
      "child_ranges": [
        "(line 1276,col 9)-(line 1276,col 51)",
        "(line 1277,col 9)-(line 1280,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testTrimOnTwoColumns()",
      "begin_line": 1283,
      "end_line": 1291,
      "comment": "",
      "child_ranges": [
        "(line 1285,col 9)-(line 1285,col 51)",
        "(line 1286,col 9)-(line 1290,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.toFirstRecordValues(java.lang.String, org.apache.commons.csv.CSVFormat)",
      "begin_line": 1293,
      "end_line": 1295,
      "comment": "",
      "child_ranges": [
        "(line 1294,col 9)-(line 1294,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testPrintRecordsWithResultSetOneRow()",
      "begin_line": 1297,
      "end_line": 1307,
      "comment": "",
      "child_ranges": [
        "(line 1299,col 9)-(line 1306,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testPrintRecordsWithObjectArray()",
      "begin_line": 1309,
      "end_line": 1320,
      "comment": "",
      "child_ranges": [
        "(line 1311,col 9)-(line 1311,col 71)",
        "(line 1312,col 9)-(line 1317,col 9)",
        "(line 1318,col 9)-(line 1318,col 48)",
        "(line 1319,col 9)-(line 1319,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testPrintRecordsWithEmptyVector()",
      "begin_line": 1323,
      "end_line": 1332,
      "comment": "",
      "child_ranges": [
        "(line 1325,col 9)-(line 1331,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testCloseWithFlushOn()",
      "begin_line": 1334,
      "end_line": 1341,
      "comment": "",
      "child_ranges": [
        "(line 1336,col 9)-(line 1336,col 49)",
        "(line 1337,col 9)-(line 1337,col 54)",
        "(line 1338,col 9)-(line 1338,col 72)",
        "(line 1339,col 9)-(line 1339,col 31)",
        "(line 1340,col 9)-(line 1340,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testCloseWithFlushOff()",
      "begin_line": 1343,
      "end_line": 1351,
      "comment": "",
      "child_ranges": [
        "(line 1345,col 9)-(line 1345,col 49)",
        "(line 1346,col 9)-(line 1346,col 54)",
        "(line 1347,col 9)-(line 1347,col 72)",
        "(line 1348,col 9)-(line 1348,col 32)",
        "(line 1349,col 9)-(line 1349,col 40)",
        "(line 1350,col 9)-(line 1350,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testCloseBackwardCompatibility()",
      "begin_line": 1353,
      "end_line": 1361,
      "comment": "",
      "child_ranges": [
        "(line 1355,col 9)-(line 1361,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testCloseWithCsvFormatAutoFlushOn()",
      "begin_line": 1363,
      "end_line": 1372,
      "comment": "",
      "child_ranges": [
        "(line 1366,col 9)-(line 1372,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVPrinterTest.testCloseWithCsvFormatAutoFlushOff()",
      "begin_line": 1374,
      "end_line": 1383,
      "comment": "",
      "child_ranges": [
        "(line 1376,col 9)-(line 1382,col 9)"
      ]
    }
  ]
}