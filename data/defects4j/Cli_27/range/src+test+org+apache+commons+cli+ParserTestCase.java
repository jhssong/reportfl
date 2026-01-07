{
  "filepath": "/tmp/Cli-27b/src/test/org/apache/commons/cli/ParserTestCase.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ParserTestCase",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 32,
      "end_line": 729,
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
      "signature": "org.apache.commons.cli.ParserTestCase.testSingleDash()",
      "begin_line": 160,
      "end_line": 174,
      "comment": "",
      "child_ranges": [
        "(line 162,col 9)-(line 165,col 45)",
        "(line 167,col 9)-(line 167,col 53)",
        "(line 169,col 9)-(line 169,col 59)",
        "(line 170,col 9)-(line 170,col 59)",
        "(line 171,col 9)-(line 171,col 76)",
        "(line 172,col 9)-(line 172,col 98)",
        "(line 173,col 9)-(line 173,col 112)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testStopAtUnexpectedArg()",
      "begin_line": 176,
      "end_line": 186,
      "comment": "",
      "child_ranges": [
        "(line 178,col 9)-(line 181,col 49)",
        "(line 183,col 9)-(line 183,col 59)",
        "(line 184,col 9)-(line 184,col 59)",
        "(line 185,col 9)-(line 185,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testStopAtExpectedArg()",
      "begin_line": 188,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 50)",
        "(line 192,col 9)-(line 192,col 59)",
        "(line 194,col 9)-(line 194,col 59)",
        "(line 195,col 9)-(line 195,col 73)",
        "(line 196,col 9)-(line 196,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testStopAtNonOptionShort()",
      "begin_line": 199,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 201,col 9)-(line 203,col 48)",
        "(line 205,col 9)-(line 205,col 59)",
        "(line 206,col 9)-(line 206,col 64)",
        "(line 207,col 9)-(line 207,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testStopAtNonOptionLong()",
      "begin_line": 210,
      "end_line": 221,
      "comment": "",
      "child_ranges": [
        "(line 212,col 9)-(line 214,col 48)",
        "(line 216,col 9)-(line 216,col 59)",
        "(line 218,col 9)-(line 218,col 64)",
        "(line 219,col 9)-(line 219,col 64)",
        "(line 220,col 9)-(line 220,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testNegativeArgument()",
      "begin_line": 223,
      "end_line": 229,
      "comment": "",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 52)",
        "(line 227,col 9)-(line 227,col 53)",
        "(line 228,col 9)-(line 228,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testArgumentStartingWithHyphen()",
      "begin_line": 231,
      "end_line": 237,
      "comment": "",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 51)",
        "(line 235,col 9)-(line 235,col 53)",
        "(line 236,col 9)-(line 236,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testShortWithEqual()",
      "begin_line": 239,
      "end_line": 249,
      "comment": "",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 50)",
        "(line 243,col 9)-(line 243,col 40)",
        "(line 244,col 9)-(line 244,col 81)",
        "(line 246,col 9)-(line 246,col 53)",
        "(line 248,col 9)-(line 248,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testShortWithoutEqual()",
      "begin_line": 251,
      "end_line": 261,
      "comment": "",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 49)",
        "(line 255,col 9)-(line 255,col 40)",
        "(line 256,col 9)-(line 256,col 81)",
        "(line 258,col 9)-(line 258,col 53)",
        "(line 260,col 9)-(line 260,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testLongWithEqualDoubleDash()",
      "begin_line": 263,
      "end_line": 273,
      "comment": "",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 53)",
        "(line 267,col 9)-(line 267,col 40)",
        "(line 268,col 9)-(line 268,col 81)",
        "(line 270,col 9)-(line 270,col 53)",
        "(line 272,col 9)-(line 272,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testLongWithEqualSingleDash()",
      "begin_line": 275,
      "end_line": 285,
      "comment": "",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 52)",
        "(line 279,col 9)-(line 279,col 40)",
        "(line 280,col 9)-(line 280,col 81)",
        "(line 282,col 9)-(line 282,col 53)",
        "(line 284,col 9)-(line 284,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testPropertiesOption1()",
      "begin_line": 287,
      "end_line": 307,
      "comment": "",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 86)",
        "(line 291,col 9)-(line 291,col 40)",
        "(line 292,col 9)-(line 292,col 85)",
        "(line 294,col 9)-(line 294,col 53)",
        "(line 296,col 9)-(line 296,col 61)",
        "(line 297,col 9)-(line 297,col 45)",
        "(line 298,col 9)-(line 298,col 59)",
        "(line 299,col 9)-(line 299,col 57)",
        "(line 300,col 9)-(line 300,col 54)",
        "(line 301,col 9)-(line 301,col 57)",
        "(line 302,col 9)-(line 302,col 54)",
        "(line 304,col 9)-(line 304,col 40)",
        "(line 305,col 9)-(line 305,col 65)",
        "(line 306,col 9)-(line 306,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testPropertiesOption2()",
      "begin_line": 309,
      "end_line": 326,
      "comment": "",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 76)",
        "(line 313,col 9)-(line 313,col 40)",
        "(line 314,col 9)-(line 314,col 93)",
        "(line 316,col 9)-(line 316,col 53)",
        "(line 318,col 9)-(line 318,col 55)",
        "(line 319,col 9)-(line 319,col 48)",
        "(line 320,col 9)-(line 320,col 74)",
        "(line 321,col 9)-(line 321,col 72)",
        "(line 322,col 9)-(line 322,col 74)",
        "(line 324,col 9)-(line 324,col 40)",
        "(line 325,col 9)-(line 325,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testUnambiguousPartialLongOption1()",
      "begin_line": 328,
      "end_line": 339,
      "comment": "",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 49)",
        "(line 332,col 9)-(line 332,col 40)",
        "(line 333,col 9)-(line 333,col 73)",
        "(line 334,col 9)-(line 334,col 70)",
        "(line 336,col 9)-(line 336,col 53)",
        "(line 338,col 9)-(line 338,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testUnambiguousPartialLongOption2()",
      "begin_line": 341,
      "end_line": 352,
      "comment": "",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 48)",
        "(line 345,col 9)-(line 345,col 40)",
        "(line 346,col 9)-(line 346,col 73)",
        "(line 347,col 9)-(line 347,col 70)",
        "(line 349,col 9)-(line 349,col 53)",
        "(line 351,col 9)-(line 351,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testUnambiguousPartialLongOption3()",
      "begin_line": 354,
      "end_line": 366,
      "comment": "",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 51)",
        "(line 358,col 9)-(line 358,col 40)",
        "(line 359,col 9)-(line 359,col 90)",
        "(line 360,col 9)-(line 360,col 70)",
        "(line 362,col 9)-(line 362,col 53)",
        "(line 364,col 9)-(line 364,col 72)",
        "(line 365,col 9)-(line 365,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testUnambiguousPartialLongOption4()",
      "begin_line": 368,
      "end_line": 380,
      "comment": "",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 50)",
        "(line 372,col 9)-(line 372,col 40)",
        "(line 373,col 9)-(line 373,col 90)",
        "(line 374,col 9)-(line 374,col 70)",
        "(line 376,col 9)-(line 376,col 53)",
        "(line 378,col 9)-(line 378,col 72)",
        "(line 379,col 9)-(line 379,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testAmbiguousPartialLongOption1()",
      "begin_line": 382,
      "end_line": 405,
      "comment": "",
      "child_ranges": [
        "(line 384,col 9)-(line 384,col 49)",
        "(line 386,col 9)-(line 386,col 40)",
        "(line 387,col 9)-(line 387,col 73)",
        "(line 388,col 9)-(line 388,col 73)",
        "(line 390,col 9)-(line 390,col 31)",
        "(line 392,col 9)-(line 402,col 9)",
        "(line 404,col 9)-(line 404,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testAmbiguousPartialLongOption2()",
      "begin_line": 407,
      "end_line": 430,
      "comment": "",
      "child_ranges": [
        "(line 409,col 9)-(line 409,col 48)",
        "(line 411,col 9)-(line 411,col 40)",
        "(line 412,col 9)-(line 412,col 73)",
        "(line 413,col 9)-(line 413,col 73)",
        "(line 415,col 9)-(line 415,col 31)",
        "(line 417,col 9)-(line 427,col 9)",
        "(line 429,col 9)-(line 429,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testAmbiguousPartialLongOption3()",
      "begin_line": 432,
      "end_line": 455,
      "comment": "",
      "child_ranges": [
        "(line 434,col 9)-(line 434,col 51)",
        "(line 436,col 9)-(line 436,col 40)",
        "(line 437,col 9)-(line 437,col 73)",
        "(line 438,col 9)-(line 438,col 90)",
        "(line 440,col 9)-(line 440,col 31)",
        "(line 442,col 9)-(line 452,col 9)",
        "(line 454,col 9)-(line 454,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testAmbiguousPartialLongOption4()",
      "begin_line": 457,
      "end_line": 480,
      "comment": "",
      "child_ranges": [
        "(line 459,col 9)-(line 459,col 50)",
        "(line 461,col 9)-(line 461,col 40)",
        "(line 462,col 9)-(line 462,col 73)",
        "(line 463,col 9)-(line 463,col 90)",
        "(line 465,col 9)-(line 465,col 31)",
        "(line 467,col 9)-(line 477,col 9)",
        "(line 479,col 9)-(line 479,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testPartialLongOptionSingleDash()",
      "begin_line": 482,
      "end_line": 494,
      "comment": "",
      "child_ranges": [
        "(line 484,col 9)-(line 484,col 48)",
        "(line 486,col 9)-(line 486,col 40)",
        "(line 487,col 9)-(line 487,col 73)",
        "(line 488,col 9)-(line 488,col 62)",
        "(line 490,col 9)-(line 490,col 53)",
        "(line 492,col 9)-(line 492,col 72)",
        "(line 493,col 9)-(line 493,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testWithRequiredOption()",
      "begin_line": 496,
      "end_line": 510,
      "comment": "",
      "child_ranges": [
        "(line 498,col 9)-(line 498,col 54)",
        "(line 500,col 9)-(line 500,col 40)",
        "(line 501,col 9)-(line 501,col 56)",
        "(line 502,col 9)-(line 502,col 96)",
        "(line 504,col 9)-(line 504,col 52)",
        "(line 506,col 9)-(line 506,col 64)",
        "(line 507,col 9)-(line 507,col 59)",
        "(line 508,col 9)-(line 508,col 79)",
        "(line 509,col 9)-(line 509,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testOptionAndRequiredOption()",
      "begin_line": 512,
      "end_line": 526,
      "comment": "",
      "child_ranges": [
        "(line 514,col 9)-(line 514,col 60)",
        "(line 516,col 9)-(line 516,col 40)",
        "(line 517,col 9)-(line 517,col 56)",
        "(line 518,col 9)-(line 518,col 96)",
        "(line 520,col 9)-(line 520,col 52)",
        "(line 522,col 9)-(line 522,col 59)",
        "(line 523,col 9)-(line 523,col 59)",
        "(line 524,col 9)-(line 524,col 79)",
        "(line 525,col 9)-(line 525,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testMissingRequiredOption()",
      "begin_line": 528,
      "end_line": 550,
      "comment": "",
      "child_ranges": [
        "(line 530,col 9)-(line 530,col 46)",
        "(line 532,col 9)-(line 532,col 40)",
        "(line 533,col 9)-(line 533,col 56)",
        "(line 534,col 9)-(line 534,col 96)",
        "(line 536,col 9)-(line 549,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testMissingRequiredOptions()",
      "begin_line": 552,
      "end_line": 576,
      "comment": "",
      "child_ranges": [
        "(line 554,col 9)-(line 554,col 46)",
        "(line 556,col 9)-(line 556,col 40)",
        "(line 557,col 9)-(line 557,col 56)",
        "(line 558,col 9)-(line 558,col 96)",
        "(line 559,col 9)-(line 559,col 96)",
        "(line 561,col 9)-(line 575,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testMissingRequiredGroup()",
      "begin_line": 578,
      "end_line": 603,
      "comment": "",
      "child_ranges": [
        "(line 580,col 9)-(line 580,col 46)",
        "(line 581,col 9)-(line 581,col 51)",
        "(line 582,col 9)-(line 582,col 51)",
        "(line 583,col 9)-(line 583,col 32)",
        "(line 585,col 9)-(line 585,col 40)",
        "(line 586,col 9)-(line 586,col 38)",
        "(line 587,col 9)-(line 587,col 66)",
        "(line 589,col 9)-(line 602,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testOptionGroup()",
      "begin_line": 605,
      "end_line": 617,
      "comment": "",
      "child_ranges": [
        "(line 607,col 9)-(line 607,col 46)",
        "(line 608,col 9)-(line 608,col 51)",
        "(line 609,col 9)-(line 609,col 51)",
        "(line 611,col 9)-(line 611,col 40)",
        "(line 612,col 9)-(line 612,col 38)",
        "(line 614,col 9)-(line 614,col 53)",
        "(line 616,col 9)-(line 616,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testOptionGroupLong()",
      "begin_line": 619,
      "end_line": 632,
      "comment": "",
      "child_ranges": [
        "(line 621,col 9)-(line 621,col 46)",
        "(line 622,col 9)-(line 622,col 67)",
        "(line 623,col 9)-(line 623,col 67)",
        "(line 625,col 9)-(line 625,col 40)",
        "(line 626,col 9)-(line 626,col 38)",
        "(line 628,col 9)-(line 628,col 73)",
        "(line 630,col 9)-(line 630,col 40)",
        "(line 631,col 9)-(line 631,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testReuseOptionsTwice()",
      "begin_line": 634,
      "end_line": 652,
      "comment": "",
      "child_ranges": [
        "(line 636,col 9)-(line 636,col 37)",
        "(line 637,col 3)-(line 637,col 57)",
        "(line 640,col 9)-(line 640,col 50)",
        "(line 642,col 9)-(line 651,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testBursting()",
      "begin_line": 654,
      "end_line": 665,
      "comment": "",
      "child_ranges": [
        "(line 656,col 9)-(line 656,col 67)",
        "(line 658,col 9)-(line 658,col 53)",
        "(line 660,col 9)-(line 660,col 61)",
        "(line 661,col 9)-(line 661,col 61)",
        "(line 662,col 9)-(line 662,col 61)",
        "(line 663,col 9)-(line 663,col 82)",
        "(line 664,col 9)-(line 664,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testUnrecognizedOptionWithBursting()",
      "begin_line": 667,
      "end_line": 680,
      "comment": "",
      "child_ranges": [
        "(line 669,col 9)-(line 669,col 67)",
        "(line 671,col 9)-(line 679,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testMissingArgWithBursting()",
      "begin_line": 682,
      "end_line": 699,
      "comment": "",
      "child_ranges": [
        "(line 684,col 9)-(line 684,col 48)",
        "(line 686,col 9)-(line 686,col 31)",
        "(line 688,col 9)-(line 696,col 9)",
        "(line 698,col 9)-(line 698,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testStopBursting()",
      "begin_line": 701,
      "end_line": 711,
      "comment": "",
      "child_ranges": [
        "(line 703,col 9)-(line 703,col 48)",
        "(line 705,col 9)-(line 705,col 59)",
        "(line 706,col 9)-(line 706,col 61)",
        "(line 707,col 9)-(line 707,col 66)",
        "(line 709,col 9)-(line 709,col 100)",
        "(line 710,col 9)-(line 710,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.ParserTestCase.testStopBursting2()",
      "begin_line": 713,
      "end_line": 728,
      "comment": "",
      "child_ranges": [
        "(line 715,col 9)-(line 715,col 67)",
        "(line 717,col 9)-(line 717,col 59)",
        "(line 718,col 9)-(line 718,col 59)",
        "(line 719,col 9)-(line 719,col 100)",
        "(line 721,col 9)-(line 721,col 49)",
        "(line 723,col 9)-(line 723,col 64)",
        "(line 724,col 9)-(line 724,col 59)",
        "(line 725,col 9)-(line 725,col 80)",
        "(line 726,col 9)-(line 726,col 99)",
        "(line 727,col 9)-(line 727,col 118)"
      ]
    }
  ]
}