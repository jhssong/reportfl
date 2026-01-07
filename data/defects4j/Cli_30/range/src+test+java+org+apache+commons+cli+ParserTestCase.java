{
  "filepath": "/tmp/Cli-30b/src/test/java/org/apache/commons/cli/ParserTestCase.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ParserTestCase",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 32,
      "end_line": 1044,
      "comment": "\n * Abstract test case testing common parser features.\n *\n * @author Emmanuel Bourg\n * @version $Revision$, $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "parser"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "options"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.setUp()",
      "begin_line": 38,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 40,col 9)-(line 43,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testSimpleShort()",
      "begin_line": 46,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 48,col 9)-(line 50,col 54)",
        "(line 52,col 9)-(line 52,col 53)",
        "(line 54,col 9)-(line 54,col 59)",
        "(line 55,col 9)-(line 55,col 59)",
        "(line 56,col 9)-(line 56,col 80)",
        "(line 57,col 9)-(line 57,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testSimpleLong()",
      "begin_line": 60,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 62,col 9)-(line 64,col 54)",
        "(line 66,col 9)-(line 66,col 53)",
        "(line 68,col 9)-(line 68,col 61)",
        "(line 69,col 9)-(line 69,col 61)",
        "(line 70,col 9)-(line 70,col 82)",
        "(line 71,col 9)-(line 71,col 95)",
        "(line 72,col 9)-(line 72,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testMultiple()",
      "begin_line": 75,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 77,col 9)-(line 79,col 55)",
        "(line 81,col 9)-(line 81,col 59)",
        "(line 82,col 9)-(line 82,col 59)",
        "(line 83,col 9)-(line 83,col 100)",
        "(line 85,col 9)-(line 85,col 49)",
        "(line 87,col 9)-(line 87,col 64)",
        "(line 88,col 9)-(line 88,col 59)",
        "(line 89,col 9)-(line 89,col 80)",
        "(line 90,col 9)-(line 90,col 99)",
        "(line 91,col 9)-(line 91,col 118)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testMultipleWithLong()",
      "begin_line": 94,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 96,col 9)-(line 98,col 60)",
        "(line 100,col 9)-(line 100,col 59)",
        "(line 101,col 9)-(line 101,col 59)",
        "(line 102,col 9)-(line 102,col 100)",
        "(line 104,col 9)-(line 104,col 49)",
        "(line 106,col 9)-(line 106,col 64)",
        "(line 107,col 9)-(line 107,col 59)",
        "(line 108,col 9)-(line 108,col 80)",
        "(line 109,col 9)-(line 109,col 99)",
        "(line 110,col 9)-(line 110,col 118)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testUnrecognizedOption()",
      "begin_line": 113,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 81)",
        "(line 117,col 9)-(line 125,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testMissingArg()",
      "begin_line": 128,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 46)",
        "(line 132,col 9)-(line 132,col 31)",
        "(line 134,col 9)-(line 142,col 9)",
        "(line 144,col 9)-(line 144,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testDoubleDash1()",
      "begin_line": 147,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 149,col 9)-(line 151,col 55)",
        "(line 153,col 9)-(line 153,col 53)",
        "(line 155,col 9)-(line 155,col 59)",
        "(line 156,col 9)-(line 156,col 64)",
        "(line 157,col 9)-(line 157,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testDoubleDash2()",
      "begin_line": 160,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 40)",
        "(line 163,col 9)-(line 163,col 62)",
        "(line 164,col 9)-(line 164,col 53)",
        "(line 166,col 9)-(line 175,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testSingleDash()",
      "begin_line": 178,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 180,col 9)-(line 183,col 45)",
        "(line 185,col 9)-(line 185,col 53)",
        "(line 187,col 9)-(line 187,col 59)",
        "(line 188,col 9)-(line 188,col 59)",
        "(line 189,col 9)-(line 189,col 76)",
        "(line 190,col 9)-(line 190,col 98)",
        "(line 191,col 9)-(line 191,col 112)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testStopAtUnexpectedArg()",
      "begin_line": 194,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 196,col 9)-(line 199,col 49)",
        "(line 201,col 9)-(line 201,col 59)",
        "(line 202,col 9)-(line 202,col 59)",
        "(line 203,col 9)-(line 203,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testStopAtExpectedArg()",
      "begin_line": 206,
      "end_line": 215,
      "comment": "",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 50)",
        "(line 210,col 9)-(line 210,col 59)",
        "(line 212,col 9)-(line 212,col 59)",
        "(line 213,col 9)-(line 213,col 73)",
        "(line 214,col 9)-(line 214,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testStopAtNonOptionShort()",
      "begin_line": 217,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 219,col 9)-(line 221,col 48)",
        "(line 223,col 9)-(line 223,col 59)",
        "(line 224,col 9)-(line 224,col 64)",
        "(line 225,col 9)-(line 225,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testStopAtNonOptionLong()",
      "begin_line": 228,
      "end_line": 239,
      "comment": "",
      "child_ranges": [
        "(line 230,col 9)-(line 232,col 48)",
        "(line 234,col 9)-(line 234,col 59)",
        "(line 236,col 9)-(line 236,col 64)",
        "(line 237,col 9)-(line 237,col 64)",
        "(line 238,col 9)-(line 238,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testNegativeArgument()",
      "begin_line": 241,
      "end_line": 247,
      "comment": "",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 52)",
        "(line 245,col 9)-(line 245,col 53)",
        "(line 246,col 9)-(line 246,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testNegativeOption()",
      "begin_line": 249,
      "end_line": 257,
      "comment": "",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 52)",
        "(line 253,col 9)-(line 253,col 44)",
        "(line 255,col 9)-(line 255,col 53)",
        "(line 256,col 9)-(line 256,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testArgumentStartingWithHyphen()",
      "begin_line": 259,
      "end_line": 265,
      "comment": "",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 51)",
        "(line 263,col 9)-(line 263,col 53)",
        "(line 264,col 9)-(line 264,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testShortWithEqual()",
      "begin_line": 267,
      "end_line": 277,
      "comment": "",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 50)",
        "(line 271,col 9)-(line 271,col 40)",
        "(line 272,col 9)-(line 272,col 81)",
        "(line 274,col 9)-(line 274,col 53)",
        "(line 276,col 9)-(line 276,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testShortWithoutEqual()",
      "begin_line": 279,
      "end_line": 289,
      "comment": "",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 49)",
        "(line 283,col 9)-(line 283,col 40)",
        "(line 284,col 9)-(line 284,col 81)",
        "(line 286,col 9)-(line 286,col 53)",
        "(line 288,col 9)-(line 288,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testLongWithEqualDoubleDash()",
      "begin_line": 291,
      "end_line": 301,
      "comment": "",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 53)",
        "(line 295,col 9)-(line 295,col 40)",
        "(line 296,col 9)-(line 296,col 81)",
        "(line 298,col 9)-(line 298,col 53)",
        "(line 300,col 9)-(line 300,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testLongWithEqualSingleDash()",
      "begin_line": 303,
      "end_line": 313,
      "comment": "",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 52)",
        "(line 307,col 9)-(line 307,col 40)",
        "(line 308,col 9)-(line 308,col 81)",
        "(line 310,col 9)-(line 310,col 53)",
        "(line 312,col 9)-(line 312,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testLongWithoutEqualSingleDash()",
      "begin_line": 315,
      "end_line": 325,
      "comment": "",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 51)",
        "(line 319,col 9)-(line 319,col 40)",
        "(line 320,col 9)-(line 320,col 81)",
        "(line 322,col 9)-(line 322,col 53)",
        "(line 324,col 9)-(line 324,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testAmbiguousLongWithoutEqualSingleDash()",
      "begin_line": 327,
      "end_line": 340,
      "comment": "",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 57)",
        "(line 331,col 9)-(line 331,col 40)",
        "(line 332,col 9)-(line 332,col 89)",
        "(line 333,col 9)-(line 333,col 89)",
        "(line 335,col 9)-(line 335,col 53)",
        "(line 337,col 9)-(line 337,col 38)",
        "(line 338,col 9)-(line 338,col 38)",
        "(line 339,col 9)-(line 339,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testLongWithoutEqualDoubleDash()",
      "begin_line": 342,
      "end_line": 352,
      "comment": "",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 52)",
        "(line 346,col 9)-(line 346,col 40)",
        "(line 347,col 9)-(line 347,col 81)",
        "(line 349,col 9)-(line 349,col 59)",
        "(line 351,col 9)-(line 351,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testLongWithUnexpectedArgument1()",
      "begin_line": 354,
      "end_line": 372,
      "comment": "",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 53)",
        "(line 358,col 9)-(line 358,col 40)",
        "(line 359,col 9)-(line 359,col 72)",
        "(line 361,col 9)-(line 369,col 9)",
        "(line 371,col 9)-(line 371,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testLongWithUnexpectedArgument2()",
      "begin_line": 374,
      "end_line": 392,
      "comment": "",
      "child_ranges": [
        "(line 376,col 9)-(line 376,col 51)",
        "(line 378,col 9)-(line 378,col 40)",
        "(line 379,col 9)-(line 379,col 72)",
        "(line 381,col 9)-(line 389,col 9)",
        "(line 391,col 9)-(line 391,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testShortWithUnexpectedArgument()",
      "begin_line": 394,
      "end_line": 412,
      "comment": "",
      "child_ranges": [
        "(line 396,col 9)-(line 396,col 50)",
        "(line 398,col 9)-(line 398,col 40)",
        "(line 399,col 9)-(line 399,col 72)",
        "(line 401,col 9)-(line 409,col 9)",
        "(line 411,col 9)-(line 411,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testPropertiesOption1()",
      "begin_line": 414,
      "end_line": 434,
      "comment": "",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 86)",
        "(line 418,col 9)-(line 418,col 40)",
        "(line 419,col 9)-(line 419,col 85)",
        "(line 421,col 9)-(line 421,col 53)",
        "(line 423,col 9)-(line 423,col 61)",
        "(line 424,col 9)-(line 424,col 45)",
        "(line 425,col 9)-(line 425,col 59)",
        "(line 426,col 9)-(line 426,col 57)",
        "(line 427,col 9)-(line 427,col 54)",
        "(line 428,col 9)-(line 428,col 57)",
        "(line 429,col 9)-(line 429,col 54)",
        "(line 431,col 9)-(line 431,col 40)",
        "(line 432,col 9)-(line 432,col 65)",
        "(line 433,col 9)-(line 433,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testPropertiesOption2()",
      "begin_line": 436,
      "end_line": 453,
      "comment": "",
      "child_ranges": [
        "(line 438,col 9)-(line 438,col 76)",
        "(line 440,col 9)-(line 440,col 40)",
        "(line 441,col 9)-(line 441,col 93)",
        "(line 443,col 9)-(line 443,col 53)",
        "(line 445,col 9)-(line 445,col 55)",
        "(line 446,col 9)-(line 446,col 48)",
        "(line 447,col 9)-(line 447,col 74)",
        "(line 448,col 9)-(line 448,col 72)",
        "(line 449,col 9)-(line 449,col 74)",
        "(line 451,col 9)-(line 451,col 40)",
        "(line 452,col 9)-(line 452,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testUnambiguousPartialLongOption1()",
      "begin_line": 455,
      "end_line": 466,
      "comment": "",
      "child_ranges": [
        "(line 457,col 9)-(line 457,col 49)",
        "(line 459,col 9)-(line 459,col 40)",
        "(line 460,col 9)-(line 460,col 73)",
        "(line 461,col 9)-(line 461,col 70)",
        "(line 463,col 9)-(line 463,col 53)",
        "(line 465,col 9)-(line 465,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testUnambiguousPartialLongOption2()",
      "begin_line": 468,
      "end_line": 479,
      "comment": "",
      "child_ranges": [
        "(line 470,col 9)-(line 470,col 48)",
        "(line 472,col 9)-(line 472,col 40)",
        "(line 473,col 9)-(line 473,col 73)",
        "(line 474,col 9)-(line 474,col 70)",
        "(line 476,col 9)-(line 476,col 53)",
        "(line 478,col 9)-(line 478,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testUnambiguousPartialLongOption3()",
      "begin_line": 481,
      "end_line": 493,
      "comment": "",
      "child_ranges": [
        "(line 483,col 9)-(line 483,col 51)",
        "(line 485,col 9)-(line 485,col 40)",
        "(line 486,col 9)-(line 486,col 90)",
        "(line 487,col 9)-(line 487,col 70)",
        "(line 489,col 9)-(line 489,col 53)",
        "(line 491,col 9)-(line 491,col 72)",
        "(line 492,col 9)-(line 492,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testUnambiguousPartialLongOption4()",
      "begin_line": 495,
      "end_line": 507,
      "comment": "",
      "child_ranges": [
        "(line 497,col 9)-(line 497,col 50)",
        "(line 499,col 9)-(line 499,col 40)",
        "(line 500,col 9)-(line 500,col 90)",
        "(line 501,col 9)-(line 501,col 70)",
        "(line 503,col 9)-(line 503,col 53)",
        "(line 505,col 9)-(line 505,col 72)",
        "(line 506,col 9)-(line 506,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testAmbiguousPartialLongOption1()",
      "begin_line": 509,
      "end_line": 532,
      "comment": "",
      "child_ranges": [
        "(line 511,col 9)-(line 511,col 49)",
        "(line 513,col 9)-(line 513,col 40)",
        "(line 514,col 9)-(line 514,col 73)",
        "(line 515,col 9)-(line 515,col 73)",
        "(line 517,col 9)-(line 517,col 31)",
        "(line 519,col 9)-(line 529,col 9)",
        "(line 531,col 9)-(line 531,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testAmbiguousPartialLongOption2()",
      "begin_line": 534,
      "end_line": 557,
      "comment": "",
      "child_ranges": [
        "(line 536,col 9)-(line 536,col 48)",
        "(line 538,col 9)-(line 538,col 40)",
        "(line 539,col 9)-(line 539,col 73)",
        "(line 540,col 9)-(line 540,col 73)",
        "(line 542,col 9)-(line 542,col 31)",
        "(line 544,col 9)-(line 554,col 9)",
        "(line 556,col 9)-(line 556,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testAmbiguousPartialLongOption3()",
      "begin_line": 559,
      "end_line": 582,
      "comment": "",
      "child_ranges": [
        "(line 561,col 9)-(line 561,col 51)",
        "(line 563,col 9)-(line 563,col 40)",
        "(line 564,col 9)-(line 564,col 73)",
        "(line 565,col 9)-(line 565,col 90)",
        "(line 567,col 9)-(line 567,col 31)",
        "(line 569,col 9)-(line 579,col 9)",
        "(line 581,col 9)-(line 581,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testAmbiguousPartialLongOption4()",
      "begin_line": 584,
      "end_line": 607,
      "comment": "",
      "child_ranges": [
        "(line 586,col 9)-(line 586,col 50)",
        "(line 588,col 9)-(line 588,col 40)",
        "(line 589,col 9)-(line 589,col 73)",
        "(line 590,col 9)-(line 590,col 90)",
        "(line 592,col 9)-(line 592,col 31)",
        "(line 594,col 9)-(line 604,col 9)",
        "(line 606,col 9)-(line 606,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testPartialLongOptionSingleDash()",
      "begin_line": 609,
      "end_line": 621,
      "comment": "",
      "child_ranges": [
        "(line 611,col 9)-(line 611,col 48)",
        "(line 613,col 9)-(line 613,col 40)",
        "(line 614,col 9)-(line 614,col 73)",
        "(line 615,col 9)-(line 615,col 62)",
        "(line 617,col 9)-(line 617,col 53)",
        "(line 619,col 9)-(line 619,col 72)",
        "(line 620,col 9)-(line 620,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testWithRequiredOption()",
      "begin_line": 623,
      "end_line": 637,
      "comment": "",
      "child_ranges": [
        "(line 625,col 9)-(line 625,col 54)",
        "(line 627,col 9)-(line 627,col 40)",
        "(line 628,col 9)-(line 628,col 56)",
        "(line 629,col 9)-(line 629,col 96)",
        "(line 631,col 9)-(line 631,col 52)",
        "(line 633,col 9)-(line 633,col 64)",
        "(line 634,col 9)-(line 634,col 59)",
        "(line 635,col 9)-(line 635,col 79)",
        "(line 636,col 9)-(line 636,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testOptionAndRequiredOption()",
      "begin_line": 639,
      "end_line": 653,
      "comment": "",
      "child_ranges": [
        "(line 641,col 9)-(line 641,col 60)",
        "(line 643,col 9)-(line 643,col 40)",
        "(line 644,col 9)-(line 644,col 56)",
        "(line 645,col 9)-(line 645,col 96)",
        "(line 647,col 9)-(line 647,col 52)",
        "(line 649,col 9)-(line 649,col 59)",
        "(line 650,col 9)-(line 650,col 59)",
        "(line 651,col 9)-(line 651,col 79)",
        "(line 652,col 9)-(line 652,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testMissingRequiredOption()",
      "begin_line": 655,
      "end_line": 677,
      "comment": "",
      "child_ranges": [
        "(line 657,col 9)-(line 657,col 46)",
        "(line 659,col 9)-(line 659,col 40)",
        "(line 660,col 9)-(line 660,col 56)",
        "(line 661,col 9)-(line 661,col 96)",
        "(line 663,col 9)-(line 676,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testMissingRequiredOptions()",
      "begin_line": 679,
      "end_line": 703,
      "comment": "",
      "child_ranges": [
        "(line 681,col 9)-(line 681,col 46)",
        "(line 683,col 9)-(line 683,col 40)",
        "(line 684,col 9)-(line 684,col 56)",
        "(line 685,col 9)-(line 685,col 96)",
        "(line 686,col 9)-(line 686,col 96)",
        "(line 688,col 9)-(line 702,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testMissingRequiredGroup()",
      "begin_line": 705,
      "end_line": 730,
      "comment": "",
      "child_ranges": [
        "(line 707,col 9)-(line 707,col 46)",
        "(line 708,col 9)-(line 708,col 51)",
        "(line 709,col 9)-(line 709,col 51)",
        "(line 710,col 9)-(line 710,col 32)",
        "(line 712,col 9)-(line 712,col 40)",
        "(line 713,col 9)-(line 713,col 38)",
        "(line 714,col 9)-(line 714,col 66)",
        "(line 716,col 9)-(line 729,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testOptionGroup()",
      "begin_line": 732,
      "end_line": 744,
      "comment": "",
      "child_ranges": [
        "(line 734,col 9)-(line 734,col 46)",
        "(line 735,col 9)-(line 735,col 51)",
        "(line 736,col 9)-(line 736,col 51)",
        "(line 738,col 9)-(line 738,col 40)",
        "(line 739,col 9)-(line 739,col 38)",
        "(line 741,col 9)-(line 741,col 53)",
        "(line 743,col 9)-(line 743,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testOptionGroupLong()",
      "begin_line": 746,
      "end_line": 759,
      "comment": "",
      "child_ranges": [
        "(line 748,col 9)-(line 748,col 46)",
        "(line 749,col 9)-(line 749,col 67)",
        "(line 750,col 9)-(line 750,col 67)",
        "(line 752,col 9)-(line 752,col 40)",
        "(line 753,col 9)-(line 753,col 38)",
        "(line 755,col 9)-(line 755,col 73)",
        "(line 757,col 9)-(line 757,col 40)",
        "(line 758,col 9)-(line 758,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testReuseOptionsTwice()",
      "begin_line": 761,
      "end_line": 779,
      "comment": "",
      "child_ranges": [
        "(line 763,col 9)-(line 763,col 37)",
        "(line 764,col 3)-(line 764,col 57)",
        "(line 767,col 9)-(line 767,col 50)",
        "(line 769,col 9)-(line 778,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testBursting()",
      "begin_line": 781,
      "end_line": 792,
      "comment": "",
      "child_ranges": [
        "(line 783,col 9)-(line 783,col 67)",
        "(line 785,col 9)-(line 785,col 53)",
        "(line 787,col 9)-(line 787,col 61)",
        "(line 788,col 9)-(line 788,col 61)",
        "(line 789,col 9)-(line 789,col 61)",
        "(line 790,col 9)-(line 790,col 82)",
        "(line 791,col 9)-(line 791,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testUnrecognizedOptionWithBursting()",
      "begin_line": 794,
      "end_line": 807,
      "comment": "",
      "child_ranges": [
        "(line 796,col 9)-(line 796,col 67)",
        "(line 798,col 9)-(line 806,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testMissingArgWithBursting()",
      "begin_line": 809,
      "end_line": 826,
      "comment": "",
      "child_ranges": [
        "(line 811,col 9)-(line 811,col 48)",
        "(line 813,col 9)-(line 813,col 31)",
        "(line 815,col 9)-(line 823,col 9)",
        "(line 825,col 9)-(line 825,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testStopBursting()",
      "begin_line": 828,
      "end_line": 838,
      "comment": "",
      "child_ranges": [
        "(line 830,col 9)-(line 830,col 48)",
        "(line 832,col 9)-(line 832,col 59)",
        "(line 833,col 9)-(line 833,col 61)",
        "(line 834,col 9)-(line 834,col 66)",
        "(line 836,col 9)-(line 836,col 100)",
        "(line 837,col 9)-(line 837,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testStopBursting2()",
      "begin_line": 840,
      "end_line": 855,
      "comment": "",
      "child_ranges": [
        "(line 842,col 9)-(line 842,col 67)",
        "(line 844,col 9)-(line 844,col 59)",
        "(line 845,col 9)-(line 845,col 59)",
        "(line 846,col 9)-(line 846,col 100)",
        "(line 848,col 9)-(line 848,col 49)",
        "(line 850,col 9)-(line 850,col 64)",
        "(line 851,col 9)-(line 851,col 59)",
        "(line 852,col 9)-(line 852,col 80)",
        "(line 853,col 9)-(line 853,col 99)",
        "(line 854,col 9)-(line 854,col 118)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testUnlimitedArgs()",
      "begin_line": 857,
      "end_line": 871,
      "comment": "",
      "child_ranges": [
        "(line 859,col 9)-(line 859,col 72)",
        "(line 861,col 9)-(line 861,col 40)",
        "(line 862,col 9)-(line 862,col 63)",
        "(line 863,col 9)-(line 863,col 63)",
        "(line 865,col 9)-(line 865,col 53)",
        "(line 867,col 9)-(line 867,col 59)",
        "(line 868,col 9)-(line 868,col 80)",
        "(line 869,col 9)-(line 869,col 59)",
        "(line 870,col 9)-(line 870,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.parse(org.apache.commons.cli.CommandLineParser, org.apache.commons.cli.Options, java.lang.String[], java.util.Properties)",
      "begin_line": 873,
      "end_line": 881,
      "comment": "",
      "child_ranges": [
        "(line 874,col 9)-(line 880,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testPropertyOptionSingularValue()",
      "begin_line": 883,
      "end_line": 895,
      "comment": "",
      "child_ranges": [
        "(line 885,col 9)-(line 885,col 37)",
        "(line 886,col 9)-(line 886,col 86)",
        "(line 888,col 9)-(line 888,col 49)",
        "(line 889,col 9)-(line 889,col 49)",
        "(line 891,col 9)-(line 891,col 64)",
        "(line 892,col 9)-(line 892,col 44)",
        "(line 893,col 9)-(line 893,col 59)",
        "(line 894,col 9)-(line 894,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testPropertyOptionFlags()",
      "begin_line": 897,
      "end_line": 954,
      "comment": "",
      "child_ranges": [
        "(line 899,col 9)-(line 899,col 37)",
        "(line 900,col 9)-(line 900,col 48)",
        "(line 901,col 9)-(line 901,col 53)",
        "(line 902,col 9)-(line 902,col 67)",
        "(line 904,col 9)-(line 904,col 49)",
        "(line 905,col 9)-(line 905,col 44)",
        "(line 906,col 9)-(line 906,col 43)",
        "(line 907,col 9)-(line 907,col 41)",
        "(line 909,col 9)-(line 909,col 64)",
        "(line 910,col 9)-(line 910,col 39)",
        "(line 911,col 9)-(line 911,col 39)",
        "(line 912,col 9)-(line 912,col 39)",
        "(line 915,col 9)-(line 915,col 38)",
        "(line 916,col 9)-(line 916,col 45)",
        "(line 917,col 9)-(line 917,col 42)",
        "(line 918,col 9)-(line 918,col 41)",
        "(line 920,col 9)-(line 920,col 52)",
        "(line 921,col 9)-(line 921,col 40)",
        "(line 922,col 9)-(line 922,col 40)",
        "(line 923,col 9)-(line 923,col 39)",
        "(line 926,col 9)-(line 926,col 38)",
        "(line 927,col 9)-(line 927,col 44)",
        "(line 928,col 9)-(line 928,col 42)",
        "(line 929,col 9)-(line 929,col 44)",
        "(line 931,col 9)-(line 931,col 52)",
        "(line 932,col 9)-(line 932,col 39)",
        "(line 933,col 9)-(line 933,col 40)",
        "(line 934,col 9)-(line 934,col 39)",
        "(line 937,col 9)-(line 937,col 38)",
        "(line 938,col 9)-(line 938,col 53)",
        "(line 939,col 9)-(line 939,col 40)",
        "(line 941,col 9)-(line 941,col 52)",
        "(line 942,col 9)-(line 942,col 40)",
        "(line 943,col 9)-(line 943,col 40)",
        "(line 944,col 9)-(line 944,col 39)",
        "(line 947,col 9)-(line 947,col 38)",
        "(line 948,col 9)-(line 948,col 41)",
        "(line 949,col 9)-(line 949,col 41)",
        "(line 951,col 9)-(line 951,col 52)",
        "(line 952,col 9)-(line 952,col 40)",
        "(line 953,col 9)-(line 953,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testPropertyOptionMultipleValues()",
      "begin_line": 956,
      "end_line": 969,
      "comment": "",
      "child_ranges": [
        "(line 958,col 9)-(line 958,col 37)",
        "(line 959,col 9)-(line 959,col 84)",
        "(line 961,col 9)-(line 961,col 49)",
        "(line 962,col 9)-(line 962,col 49)",
        "(line 964,col 9)-(line 964,col 56)",
        "(line 966,col 9)-(line 966,col 64)",
        "(line 967,col 9)-(line 967,col 41)",
        "(line 968,col 9)-(line 968,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testPropertyOverrideValues()",
      "begin_line": 971,
      "end_line": 988,
      "comment": "",
      "child_ranges": [
        "(line 973,col 9)-(line 973,col 37)",
        "(line 974,col 9)-(line 974,col 69)",
        "(line 975,col 9)-(line 975,col 68)",
        "(line 977,col 9)-(line 977,col 68)",
        "(line 979,col 9)-(line 979,col 49)",
        "(line 980,col 9)-(line 980,col 46)",
        "(line 982,col 9)-(line 982,col 64)",
        "(line 983,col 9)-(line 983,col 41)",
        "(line 984,col 9)-(line 984,col 57)",
        "(line 985,col 9)-(line 985,col 41)",
        "(line 986,col 9)-(line 986,col 55)",
        "(line 987,col 9)-(line 987,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testPropertyOptionRequired()",
      "begin_line": 990,
      "end_line": 1000,
      "comment": "",
      "child_ranges": [
        "(line 992,col 9)-(line 992,col 37)",
        "(line 993,col 9)-(line 993,col 63)",
        "(line 995,col 9)-(line 995,col 49)",
        "(line 996,col 9)-(line 996,col 44)",
        "(line 998,col 9)-(line 998,col 64)",
        "(line 999,col 9)-(line 999,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testPropertyOptionUnexpected()",
      "begin_line": 1002,
      "end_line": 1015,
      "comment": "",
      "child_ranges": [
        "(line 1004,col 9)-(line 1004,col 37)",
        "(line 1006,col 9)-(line 1006,col 49)",
        "(line 1007,col 9)-(line 1007,col 44)",
        "(line 1009,col 9)-(line 1014,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testPropertyOptionGroup()",
      "begin_line": 1017,
      "end_line": 1043,
      "comment": "",
      "child_ranges": [
        "(line 1019,col 9)-(line 1019,col 37)",
        "(line 1021,col 9)-(line 1021,col 47)",
        "(line 1022,col 9)-(line 1022,col 48)",
        "(line 1023,col 9)-(line 1023,col 48)",
        "(line 1024,col 9)-(line 1024,col 36)",
        "(line 1026,col 9)-(line 1026,col 47)",
        "(line 1027,col 9)-(line 1027,col 48)",
        "(line 1028,col 9)-(line 1028,col 48)",
        "(line 1029,col 9)-(line 1029,col 36)",
        "(line 1031,col 9)-(line 1031,col 46)",
        "(line 1033,col 9)-(line 1033,col 49)",
        "(line 1034,col 9)-(line 1034,col 36)",
        "(line 1035,col 9)-(line 1035,col 36)",
        "(line 1037,col 9)-(line 1037,col 64)",
        "(line 1039,col 9)-(line 1039,col 39)",
        "(line 1040,col 9)-(line 1040,col 40)",
        "(line 1041,col 9)-(line 1041,col 39)",
        "(line 1042,col 9)-(line 1042,col 40)"
      ]
    }
  ]
}