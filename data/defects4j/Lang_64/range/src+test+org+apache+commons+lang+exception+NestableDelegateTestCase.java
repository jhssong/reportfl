{
  "filepath": "/tmp/Lang-64b/src/test/org/apache/commons/lang/exception/NestableDelegateTestCase.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NestableDelegateTestCase",
      "is_interface": false,
      "parent_types": [
        "junit.framework.TestCase"
      ],
      "begin_line": 35,
      "end_line": 581,
      "comment": "\n * Tests the org.apache.commons.lang.exception.NestableDelegate class.\n *\n * @author \u003ca href\u003d\"mailto:steven@caswell.name\"\u003eSteven Caswell\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:dlr@finemaltcoding.com\"\u003eDaniel Rall\u003c/a\u003e\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "CONSTRUCTOR_FAILED_MSG"
      ],
      "begin_line": 36,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PARTIAL_STACK_TRACE"
      ],
      "begin_line": 39,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lineSeparator"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.exception.NestableDelegateTestCase.NestableDelegateTestCase(java.lang.String)",
      "begin_line": 47,
      "end_line": 50,
      "comment": "\n     * Construct a new instance of NestableDelegateTestCase with the specified name\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegateTestCase.setUp()",
      "begin_line": 55,
      "end_line": 58,
      "comment": "\n     * Set up instance variables required by this test case.\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegateTestCase.suite()",
      "begin_line": 60,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegateTestCase.tearDown()",
      "begin_line": 68,
      "end_line": 71,
      "comment": "\n     * Tear down instance variables required by this test case.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegateTestCase.testNestableDelegateConstructor()",
      "begin_line": 76,
      "end_line": 103,
      "comment": "\n     * Test the implementation\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 26)",
        "(line 79,col 9)-(line 79,col 42)",
        "(line 80,col 9)-(line 88,col 9)",
        "(line 89,col 9)-(line 89,col 111)",
        "(line 90,col 9)-(line 91,col 48)",
        "(line 93,col 9)-(line 93,col 34)",
        "(line 94,col 9)-(line 101,col 9)",
        "(line 102,col 9)-(line 102,col 109)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegateTestCase.testNestableDelegateGetMessage()",
      "begin_line": 105,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 47)",
        "(line 108,col 9)-(line 109,col 68)",
        "(line 110,col 9)-(line 110,col 57)",
        "(line 111,col 9)-(line 112,col 83)",
        "(line 114,col 9)-(line 114,col 88)",
        "(line 115,col 9)-(line 115,col 57)",
        "(line 116,col 9)-(line 117,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegateTestCase.testNestableDelegateGetThrowableCount()",
      "begin_line": 120,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 26)",
        "(line 123,col 9)-(line 123,col 34)",
        "(line 125,col 9)-(line 125,col 42)",
        "(line 126,col 9)-(line 126,col 36)",
        "(line 127,col 9)-(line 127,col 50)",
        "(line 129,col 9)-(line 129,col 51)",
        "(line 130,col 9)-(line 130,col 36)",
        "(line 131,col 9)-(line 131,col 50)",
        "(line 133,col 9)-(line 133,col 57)",
        "(line 134,col 9)-(line 134,col 36)",
        "(line 135,col 9)-(line 135,col 50)",
        "(line 137,col 9)-(line 137,col 66)",
        "(line 138,col 9)-(line 138,col 36)",
        "(line 139,col 9)-(line 139,col 50)",
        "(line 141,col 9)-(line 149,col 14)",
        "(line 150,col 9)-(line 150,col 36)",
        "(line 151,col 9)-(line 151,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegateTestCase.doNestableDelegateGetThrowableCount(org.apache.commons.lang.exception.NestableDelegate, int)",
      "begin_line": 154,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegateTestCase.testNestableDelegateGetMessages()",
      "begin_line": 160,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 26)",
        "(line 163,col 9)-(line 163,col 34)",
        "(line 164,col 9)-(line 164,col 29)",
        "(line 166,col 9)-(line 166,col 29)",
        "(line 167,col 9)-(line 167,col 42)",
        "(line 168,col 9)-(line 168,col 36)",
        "(line 169,col 9)-(line 169,col 47)",
        "(line 171,col 9)-(line 171,col 29)",
        "(line 172,col 9)-(line 172,col 28)",
        "(line 173,col 9)-(line 173,col 49)",
        "(line 174,col 9)-(line 174,col 36)",
        "(line 175,col 9)-(line 175,col 47)",
        "(line 177,col 9)-(line 177,col 29)",
        "(line 178,col 9)-(line 178,col 57)",
        "(line 179,col 9)-(line 179,col 36)",
        "(line 180,col 9)-(line 180,col 47)",
        "(line 182,col 9)-(line 182,col 29)",
        "(line 183,col 9)-(line 183,col 23)",
        "(line 184,col 9)-(line 184,col 28)",
        "(line 185,col 9)-(line 185,col 64)",
        "(line 186,col 9)-(line 186,col 36)",
        "(line 187,col 9)-(line 187,col 47)",
        "(line 189,col 9)-(line 189,col 29)",
        "(line 190,col 9)-(line 190,col 28)",
        "(line 191,col 9)-(line 191,col 28)",
        "(line 192,col 9)-(line 192,col 23)",
        "(line 193,col 9)-(line 193,col 28)",
        "(line 194,col 9)-(line 194,col 28)",
        "(line 195,col 9)-(line 203,col 14)",
        "(line 204,col 9)-(line 204,col 36)",
        "(line 205,col 9)-(line 205,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegateTestCase.doNestableDelegateGetMessages(org.apache.commons.lang.exception.NestableDelegate, java.lang.String[])",
      "begin_line": 208,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 41)",
        "(line 212,col 9)-(line 212,col 68)",
        "(line 213,col 9)-(line 216,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegateTestCase.testGetMessageString()",
      "begin_line": 219,
      "end_line": 236,
      "comment": "",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 97)",
        "(line 222,col 9)-(line 222,col 58)",
        "(line 223,col 9)-(line 223,col 49)",
        "(line 225,col 9)-(line 225,col 87)",
        "(line 226,col 9)-(line 226,col 41)",
        "(line 227,col 9)-(line 227,col 51)",
        "(line 229,col 9)-(line 229,col 46)",
        "(line 230,col 9)-(line 230,col 41)",
        "(line 231,col 9)-(line 231,col 48)",
        "(line 233,col 9)-(line 233,col 52)",
        "(line 234,col 9)-(line 234,col 41)",
        "(line 235,col 9)-(line 235,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegateTestCase.testNestableDelegateGetMessageN()",
      "begin_line": 238,
      "end_line": 280,
      "comment": "",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 26)",
        "(line 241,col 9)-(line 241,col 34)",
        "(line 242,col 9)-(line 242,col 38)",
        "(line 243,col 9)-(line 243,col 28)",
        "(line 244,col 9)-(line 244,col 28)",
        "(line 245,col 9)-(line 245,col 23)",
        "(line 246,col 9)-(line 246,col 28)",
        "(line 247,col 9)-(line 247,col 28)",
        "(line 248,col 9)-(line 256,col 14)",
        "(line 257,col 9)-(line 257,col 36)",
        "(line 258,col 9)-(line 261,col 9)",
        "(line 264,col 9)-(line 271,col 9)",
        "(line 272,col 9)-(line 279,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegateTestCase.testNestableDelegateGetThrowableN()",
      "begin_line": 282,
      "end_line": 322,
      "comment": "",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 26)",
        "(line 285,col 9)-(line 285,col 34)",
        "(line 286,col 9)-(line 286,col 29)",
        "(line 287,col 9)-(line 287,col 34)",
        "(line 289,col 9)-(line 289,col 29)",
        "(line 290,col 9)-(line 290,col 23)",
        "(line 291,col 9)-(line 291,col 28)",
        "(line 292,col 9)-(line 292,col 34)",
        "(line 293,col 9)-(line 293,col 54)",
        "(line 294,col 9)-(line 294,col 40)",
        "(line 295,col 9)-(line 295,col 64)",
        "(line 296,col 9)-(line 296,col 36)",
        "(line 297,col 9)-(line 297,col 61)",
        "(line 299,col 9)-(line 299,col 29)",
        "(line 300,col 9)-(line 300,col 28)",
        "(line 301,col 9)-(line 301,col 28)",
        "(line 302,col 9)-(line 302,col 23)",
        "(line 303,col 9)-(line 303,col 28)",
        "(line 304,col 9)-(line 304,col 28)",
        "(line 305,col 9)-(line 305,col 34)",
        "(line 306,col 9)-(line 306,col 54)",
        "(line 307,col 9)-(line 307,col 54)",
        "(line 308,col 9)-(line 308,col 54)",
        "(line 309,col 9)-(line 309,col 54)",
        "(line 310,col 9)-(line 310,col 40)",
        "(line 311,col 9)-(line 319,col 18)",
        "(line 320,col 9)-(line 320,col 36)",
        "(line 321,col 9)-(line 321,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegateTestCase.doNestableDelegateGetThrowableN(org.apache.commons.lang.exception.NestableDelegate, java.lang.Class[], java.lang.String[])",
      "begin_line": 324,
      "end_line": 361,
      "comment": "",
      "child_ranges": [
        "(line 326,col 9)-(line 326,col 27)",
        "(line 327,col 9)-(line 327,col 26)",
        "(line 329,col 9)-(line 342,col 9)",
        "(line 345,col 9)-(line 352,col 9)",
        "(line 353,col 9)-(line 360,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegateTestCase.testNestableDelegateGetThrowables()",
      "begin_line": 363,
      "end_line": 403,
      "comment": "",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 26)",
        "(line 366,col 9)-(line 366,col 34)",
        "(line 367,col 9)-(line 367,col 29)",
        "(line 368,col 9)-(line 368,col 34)",
        "(line 370,col 9)-(line 370,col 29)",
        "(line 371,col 9)-(line 371,col 23)",
        "(line 372,col 9)-(line 372,col 28)",
        "(line 373,col 9)-(line 373,col 34)",
        "(line 374,col 9)-(line 374,col 54)",
        "(line 375,col 9)-(line 375,col 40)",
        "(line 376,col 9)-(line 376,col 64)",
        "(line 377,col 9)-(line 377,col 36)",
        "(line 378,col 9)-(line 378,col 61)",
        "(line 380,col 9)-(line 380,col 29)",
        "(line 381,col 9)-(line 381,col 28)",
        "(line 382,col 9)-(line 382,col 28)",
        "(line 383,col 9)-(line 383,col 23)",
        "(line 384,col 9)-(line 384,col 28)",
        "(line 385,col 9)-(line 385,col 28)",
        "(line 386,col 9)-(line 386,col 34)",
        "(line 387,col 9)-(line 387,col 54)",
        "(line 388,col 9)-(line 388,col 54)",
        "(line 389,col 9)-(line 389,col 54)",
        "(line 390,col 9)-(line 390,col 54)",
        "(line 391,col 9)-(line 391,col 40)",
        "(line 392,col 9)-(line 400,col 14)",
        "(line 401,col 9)-(line 401,col 36)",
        "(line 402,col 9)-(line 402,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegateTestCase.doNestableDelegateGetThrowables(org.apache.commons.lang.exception.NestableDelegate, java.lang.Class[], java.lang.String[])",
      "begin_line": 405,
      "end_line": 426,
      "comment": "",
      "child_ranges": [
        "(line 407,col 9)-(line 407,col 38)",
        "(line 408,col 9)-(line 408,col 26)",
        "(line 410,col 9)-(line 410,col 39)",
        "(line 411,col 9)-(line 411,col 77)",
        "(line 412,col 9)-(line 425,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegateTestCase.testIndexOfThrowable()",
      "begin_line": 428,
      "end_line": 490,
      "comment": "",
      "child_ranges": [
        "(line 430,col 9)-(line 430,col 26)",
        "(line 431,col 9)-(line 431,col 34)",
        "(line 432,col 9)-(line 432,col 29)",
        "(line 433,col 9)-(line 433,col 34)",
        "(line 435,col 9)-(line 435,col 29)",
        "(line 436,col 9)-(line 436,col 28)",
        "(line 437,col 9)-(line 437,col 28)",
        "(line 438,col 9)-(line 438,col 23)",
        "(line 439,col 9)-(line 439,col 28)",
        "(line 440,col 9)-(line 440,col 28)",
        "(line 441,col 9)-(line 441,col 34)",
        "(line 442,col 9)-(line 442,col 54)",
        "(line 443,col 9)-(line 443,col 54)",
        "(line 444,col 9)-(line 444,col 54)",
        "(line 445,col 9)-(line 445,col 54)",
        "(line 446,col 9)-(line 446,col 43)",
        "(line 447,col 9)-(line 447,col 40)",
        "(line 448,col 9)-(line 456,col 14)",
        "(line 457,col 9)-(line 457,col 36)",
        "(line 458,col 9)-(line 461,col 9)",
        "(line 462,col 9)-(line 462,col 92)",
        "(line 463,col 9)-(line 463,col 92)",
        "(line 464,col 9)-(line 464,col 90)",
        "(line 465,col 9)-(line 465,col 90)",
        "(line 466,col 9)-(line 466,col 81)",
        "(line 467,col 9)-(line 467,col 80)",
        "(line 468,col 9)-(line 468,col 78)",
        "(line 469,col 9)-(line 469,col 78)",
        "(line 470,col 9)-(line 470,col 81)",
        "(line 471,col 9)-(line 471,col 65)",
        "(line 474,col 9)-(line 481,col 9)",
        "(line 482,col 9)-(line 489,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegateTestCase.doNestableDelegateIndexOfThrowable(org.apache.commons.lang.exception.NestableDelegate, java.lang.Class, int, int, java.lang.String)",
      "begin_line": 492,
      "end_line": 515,
      "comment": "",
      "child_ranges": [
        "(line 494,col 9)-(line 494,col 27)",
        "(line 496,col 9)-(line 496,col 56)",
        "(line 497,col 9)-(line 497,col 109)",
        "(line 498,col 9)-(line 514,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegateTestCase.testNestableDelegetePrintStackTrace()",
      "begin_line": 517,
      "end_line": 553,
      "comment": "",
      "child_ranges": [
        "(line 519,col 9)-(line 519,col 48)",
        "(line 520,col 9)-(line 520,col 64)",
        "(line 521,col 9)-(line 521,col 88)",
        "(line 522,col 9)-(line 522,col 57)",
        "(line 524,col 9)-(line 524,col 66)",
        "(line 525,col 9)-(line 525,col 49)",
        "(line 526,col 9)-(line 526,col 33)",
        "(line 527,col 9)-(line 527,col 41)",
        "(line 528,col 9)-(line 528,col 85)",
        "(line 530,col 9)-(line 538,col 14)",
        "(line 539,col 9)-(line 539,col 53)",
        "(line 542,col 9)-(line 552,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegateTestCase.checkStackTrace(org.apache.commons.lang.exception.NestableDelegate, boolean, boolean, java.lang.String, int)",
      "begin_line": 554,
      "end_line": 566,
      "comment": "",
      "child_ranges": [
        "(line 556,col 9)-(line 556,col 66)",
        "(line 557,col 9)-(line 557,col 49)",
        "(line 558,col 9)-(line 558,col 31)",
        "(line 559,col 9)-(line 559,col 41)",
        "(line 560,col 9)-(line 560,col 42)",
        "(line 561,col 9)-(line 562,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegateTestCase.countLines(java.lang.String)",
      "begin_line": 567,
      "end_line": 575,
      "comment": "",
      "child_ranges": [
        "(line 568,col 9)-(line 568,col 32)",
        "(line 570,col 9)-(line 570,col 28)",
        "(line 571,col 9)-(line 573,col 9)",
        "(line 574,col 9)-(line 574,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegateTestCase.main(java.lang.String[])",
      "begin_line": 577,
      "end_line": 580,
      "comment": "",
      "child_ranges": [
        "(line 579,col 9)-(line 579,col 32)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NestableDelegateTester1",
      "is_interface": false,
      "parent_types": [
        "java.lang.Exception",
        "org.apache.commons.lang.exception.Nestable"
      ],
      "begin_line": 588,
      "end_line": 702,
      "comment": "\n * Nestable and Throwable class which can be passed to the NestableDelegate\n * constructor. Used for testing various methods which iterate through the\n * nested causes.\n "
    },
    {
      "type": "field",
      "varNames": [
        "cause"
      ],
      "begin_line": 590,
      "end_line": 590,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.exception.NestableDelegateTester1.NestableDelegateTester1()",
      "begin_line": 592,
      "end_line": 595,
      "comment": "",
      "child_ranges": [
        "(line 594,col 9)-(line 594,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.exception.NestableDelegateTester1.NestableDelegateTester1(java.lang.String, java.lang.Throwable)",
      "begin_line": 597,
      "end_line": 601,
      "comment": "",
      "child_ranges": [
        "(line 599,col 9)-(line 599,col 22)",
        "(line 600,col 9)-(line 600,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.exception.NestableDelegateTester1.NestableDelegateTester1(java.lang.String)",
      "begin_line": 603,
      "end_line": 606,
      "comment": "",
      "child_ranges": [
        "(line 605,col 9)-(line 605,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.exception.NestableDelegateTester1.NestableDelegateTester1(java.lang.Throwable)",
      "begin_line": 608,
      "end_line": 612,
      "comment": "",
      "child_ranges": [
        "(line 610,col 9)-(line 610,col 16)",
        "(line 611,col 9)-(line 611,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegateTester1.getThrowables()",
      "begin_line": 618,
      "end_line": 621,
      "comment": "\n     * @see Nestable#getThrowables()\n     * Returns zero-length \u003ccode\u003eThrowable\u003c/code\u003e array for this test.\n     ",
      "child_ranges": [
        "(line 620,col 9)-(line 620,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegateTester1.getMessages()",
      "begin_line": 627,
      "end_line": 630,
      "comment": "\n     * @see Nestable#getMessages()\n     * Returns zero-length String array for this test.\n     ",
      "child_ranges": [
        "(line 629,col 9)-(line 629,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegateTester1.indexOfThrowable(java.lang.Class)",
      "begin_line": 636,
      "end_line": 639,
      "comment": "\n     * @see Nestable#indexOfThrowable(Class)\n     * Returns -1 for this test.\n     ",
      "child_ranges": [
        "(line 638,col 9)-(line 638,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegateTester1.getThrowable(int)",
      "begin_line": 645,
      "end_line": 648,
      "comment": "\n     * @see Nestable#getThrowable(int)\n     * Returns \u003ccode\u003enull\u003c/code\u003e for this test.\n     ",
      "child_ranges": [
        "(line 647,col 9)-(line 647,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegateTester1.getThrowableCount()",
      "begin_line": 654,
      "end_line": 657,
      "comment": "\n     * @see Nestable#getThrowableCount()\n     * Returns 1 for this test.\n     ",
      "child_ranges": [
        "(line 656,col 9)-(line 656,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegateTester1.getCause()",
      "begin_line": 662,
      "end_line": 665,
      "comment": "\n     * @see Nestable#getCause()\n     ",
      "child_ranges": [
        "(line 664,col 9)-(line 664,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegateTester1.printPartialStackTrace(java.io.PrintWriter)",
      "begin_line": 673,
      "end_line": 676,
      "comment": "\n     * Empty method to satisfy the implemented interface. Does nothing\n     * in this test.\n     *\n     * @param out The writer to use.\n     ",
      "child_ranges": [
        "(line 675,col 9)-(line 675,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegateTester1.getMessage(int)",
      "begin_line": 681,
      "end_line": 691,
      "comment": "\n     * @see Nestable#getMessage(int)\n     ",
      "child_ranges": [
        "(line 683,col 9)-(line 690,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegateTester1.indexOfThrowable(java.lang.Class, int)",
      "begin_line": 697,
      "end_line": 700,
      "comment": "\n     * @see Nestable#indexOfThrowable(Class, int)\n     * Returns -1 for this test.\n     ",
      "child_ranges": [
        "(line 699,col 9)-(line 699,col 18)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NestableDelegateTester2",
      "is_interface": false,
      "parent_types": [
        "java.lang.Throwable",
        "org.apache.commons.lang.exception.Nestable"
      ],
      "begin_line": 709,
      "end_line": 825,
      "comment": "\n * Nestable and Throwable class which can be passed to the NestableDelegate\n * constructor. Used for testing various methods which iterate through the\n * nested causes.\n "
    },
    {
      "type": "field",
      "varNames": [
        "cause"
      ],
      "begin_line": 711,
      "end_line": 711,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.exception.NestableDelegateTester2.NestableDelegateTester2()",
      "begin_line": 713,
      "end_line": 716,
      "comment": "",
      "child_ranges": [
        "(line 715,col 9)-(line 715,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.exception.NestableDelegateTester2.NestableDelegateTester2(java.lang.String, java.lang.Throwable)",
      "begin_line": 718,
      "end_line": 722,
      "comment": "",
      "child_ranges": [
        "(line 720,col 9)-(line 720,col 22)",
        "(line 721,col 9)-(line 721,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.exception.NestableDelegateTester2.NestableDelegateTester2(java.lang.String)",
      "begin_line": 724,
      "end_line": 727,
      "comment": "",
      "child_ranges": [
        "(line 726,col 9)-(line 726,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.exception.NestableDelegateTester2.NestableDelegateTester2(java.lang.Throwable)",
      "begin_line": 729,
      "end_line": 733,
      "comment": "",
      "child_ranges": [
        "(line 731,col 9)-(line 731,col 16)",
        "(line 732,col 9)-(line 732,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegateTester2.getThrowables()",
      "begin_line": 739,
      "end_line": 742,
      "comment": "\n     * @see Nestable#getThrowables()\n     * Returns zero-length \u003ccode\u003eThrowable\u003c/code\u003e array for this test.\n     ",
      "child_ranges": [
        "(line 741,col 9)-(line 741,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegateTester2.getMessages()",
      "begin_line": 748,
      "end_line": 751,
      "comment": "\n     * @see Nestable#getMessages()\n     * Returns zero-length String array for this test.\n     ",
      "child_ranges": [
        "(line 750,col 9)-(line 750,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegateTester2.indexOfThrowable(java.lang.Class)",
      "begin_line": 757,
      "end_line": 760,
      "comment": "\n     * @see Nestable#indexOfThrowable(Class)\n     * Returns -1 for this test.\n     ",
      "child_ranges": [
        "(line 759,col 9)-(line 759,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegateTester2.getThrowable(int)",
      "begin_line": 766,
      "end_line": 769,
      "comment": "\n     * @see Nestable#getThrowable(int)\n     * Returns \u003ccode\u003enull\u003c/code\u003e for this test.\n     ",
      "child_ranges": [
        "(line 768,col 9)-(line 768,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegateTester2.getThrowableCount()",
      "begin_line": 777,
      "end_line": 780,
      "comment": "\n     * @see Nestable#getThrowableCount()\n     * Returns 1 for this test.\n     *\n     * @return 1\n     ",
      "child_ranges": [
        "(line 779,col 9)-(line 779,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegateTester2.getCause()",
      "begin_line": 785,
      "end_line": 788,
      "comment": "\n     * @see Nestable#getCause()\n     ",
      "child_ranges": [
        "(line 787,col 9)-(line 787,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegateTester2.printPartialStackTrace(java.io.PrintWriter)",
      "begin_line": 796,
      "end_line": 799,
      "comment": "\n     * Empty method to satisfy the implemented interface. Does nothing\n     * in this test.\n     *\n     * @param out The writer to use.\n     ",
      "child_ranges": [
        "(line 798,col 9)-(line 798,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegateTester2.getMessage(int)",
      "begin_line": 804,
      "end_line": 814,
      "comment": "\n     * @see Nestable#getMessage(int)\n     ",
      "child_ranges": [
        "(line 806,col 9)-(line 813,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegateTester2.indexOfThrowable(java.lang.Class, int)",
      "begin_line": 820,
      "end_line": 823,
      "comment": "\n     * @see Nestable#indexOfThrowable(Class, int)     \n     * Returns -1 for this test.\n     ",
      "child_ranges": [
        "(line 822,col 9)-(line 822,col 18)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ThrowableNestable",
      "is_interface": false,
      "parent_types": [
        "java.lang.Throwable",
        "org.apache.commons.lang.exception.Nestable"
      ],
      "begin_line": 832,
      "end_line": 940,
      "comment": "\n * Used to test that the constructor passes when passed a throwable cause\n * And, the NestableDelegate.getMessage() returns the message from underlying \n * nestable (which also has to be a Throwable).\n "
    },
    {
      "type": "field",
      "varNames": [
        "cause"
      ],
      "begin_line": 834,
      "end_line": 834,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ThrowableNestable.getThrowableCount()",
      "begin_line": 840,
      "end_line": 843,
      "comment": "\n     * @see Nestable#getThrowableCount()\n     * Returns 1 for this test.\n     ",
      "child_ranges": [
        "(line 842,col 9)-(line 842,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ThrowableNestable.getMessage()",
      "begin_line": 850,
      "end_line": 853,
      "comment": "\n     * @see Nestable#getMessage()\n     * Returns the hard-coded string \"ThrowableNestable exception\" for this\n     * test.\n     ",
      "child_ranges": [
        "(line 852,col 9)-(line 852,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ThrowableNestable.getMessage(int)",
      "begin_line": 860,
      "end_line": 863,
      "comment": "\n     * @see Nestable#getMessage(int)\n     * Returns the hard-coded string \"ThrowableNestable exception\" for this\n     * test.\n     ",
      "child_ranges": [
        "(line 862,col 9)-(line 862,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ThrowableNestable.getMessages()",
      "begin_line": 869,
      "end_line": 874,
      "comment": "\n     * @see Nestable#getMessages()\n     * Returns single-element string array with \"ThrowableNestable exception\".\n     ",
      "child_ranges": [
        "(line 871,col 9)-(line 871,col 38)",
        "(line 872,col 9)-(line 872,col 31)",
        "(line 873,col 9)-(line 873,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ThrowableNestable.getCause()",
      "begin_line": 879,
      "end_line": 882,
      "comment": "\n     * @see Nestable#getCause()\n     ",
      "child_ranges": [
        "(line 881,col 9)-(line 881,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ThrowableNestable.printStackTrace(java.io.PrintWriter)",
      "begin_line": 889,
      "end_line": 891,
      "comment": "\n     * @see Nestable#printStackTrace(PrintWriter)\n     * Empty method to satisfy the implemented interface. Does nothing\n     * in this test.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ThrowableNestable.printPartialStackTrace(java.io.PrintWriter)",
      "begin_line": 898,
      "end_line": 900,
      "comment": "\n     * @see Nestable#printPartialStackTrace(PrintWriter)\n     * Empty method to satisfy the implemented interface. Does nothing\n     * in this test.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ThrowableNestable.getThrowable(int)",
      "begin_line": 905,
      "end_line": 908,
      "comment": "\n     * @see Nestable#getThrowable(int)\n     ",
      "child_ranges": [
        "(line 907,col 9)-(line 907,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ThrowableNestable.getThrowables()",
      "begin_line": 913,
      "end_line": 918,
      "comment": "\n     * @see Nestable#getThrowables()\n     ",
      "child_ranges": [
        "(line 915,col 9)-(line 915,col 50)",
        "(line 916,col 9)-(line 916,col 30)",
        "(line 917,col 9)-(line 917,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ThrowableNestable.indexOfThrowable(java.lang.Class)",
      "begin_line": 923,
      "end_line": 930,
      "comment": "\n     * @see Nestable#indexOfThrowable(Class)\n     ",
      "child_ranges": [
        "(line 925,col 9)-(line 928,col 9)",
        "(line 929,col 9)-(line 929,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ThrowableNestable.indexOfThrowable(java.lang.Class, int)",
      "begin_line": 935,
      "end_line": 938,
      "comment": "\n     * @see Nestable#indexOfThrowable(Class,int)\n     ",
      "child_ranges": [
        "(line 937,col 9)-(line 937,col 38)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ThrowableNestedNestable",
      "is_interface": false,
      "parent_types": [
        "java.lang.Throwable",
        "org.apache.commons.lang.exception.Nestable"
      ],
      "begin_line": 947,
      "end_line": 1065,
      "comment": "\n * Nestable and Throwable class which takes in a \u0027cause\u0027 object.\n * Returns a message wrapping the \u0027cause\u0027 message\n * Prints a fixed stack trace and partial stack trace.\n "
    },
    {
      "type": "field",
      "varNames": [
        "cause"
      ],
      "begin_line": 949,
      "end_line": 949,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.exception.ThrowableNestedNestable.ThrowableNestedNestable(java.lang.Throwable)",
      "begin_line": 951,
      "end_line": 954,
      "comment": "",
      "child_ranges": [
        "(line 953,col 9)-(line 953,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ThrowableNestedNestable.getThrowableCount()",
      "begin_line": 960,
      "end_line": 963,
      "comment": "\n     * @see Nestable#getThrowableCount()\n     * Returns 1 for this test.\n     ",
      "child_ranges": [
        "(line 962,col 9)-(line 962,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ThrowableNestedNestable.getMessage()",
      "begin_line": 970,
      "end_line": 973,
      "comment": "\n     * @see Nestable#getMessage()\n     * For this test, returns \"ThrowableNestable exception (\" appended to the\n     * message of the cause specified in the constructor.\n     ",
      "child_ranges": [
        "(line 972,col 9)-(line 972,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ThrowableNestedNestable.getMessage(int)",
      "begin_line": 980,
      "end_line": 983,
      "comment": "\n     * @see Nestable#getMessage(int)\n     * For this test, returns \"ThrowableNestable exception (\" appended to the\n     * message of the cause specified in the constructor.\n     ",
      "child_ranges": [
        "(line 982,col 9)-(line 982,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ThrowableNestedNestable.getMessages()",
      "begin_line": 991,
      "end_line": 996,
      "comment": "\n     * @see Nestable#getMessages()\n     * For this test, returns a single-element string array containing\n     * \"ThrowableNestable exception (\" appended to the\n     * message of the cause specified in the constructor.\n     ",
      "child_ranges": [
        "(line 993,col 9)-(line 993,col 38)",
        "(line 994,col 9)-(line 994,col 83)",
        "(line 995,col 9)-(line 995,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ThrowableNestedNestable.getCause()",
      "begin_line": 1001,
      "end_line": 1004,
      "comment": "\n     * @see Nestable#getCause()\n     ",
      "child_ranges": [
        "(line 1003,col 9)-(line 1003,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ThrowableNestedNestable.printStackTrace(java.io.PrintWriter)",
      "begin_line": 1011,
      "end_line": 1014,
      "comment": "\n     * @see Nestable#printStackTrace(PrintWriter)\n     * For this test, writes the string\n     * \"ThrowableNestedNestable stack trace place-holder\" to the print writer.\n     ",
      "child_ranges": [
        "(line 1013,col 9)-(line 1013,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ThrowableNestedNestable.printPartialStackTrace(java.io.PrintWriter)",
      "begin_line": 1022,
      "end_line": 1025,
      "comment": "\n     * @see Nestable#printPartialStackTrace(PrintWriter)\n     * For this test, writes the string\n     * \"ThrowableNestedNestable partial stack trace place-holder\" to the print\n     * writer.\n     ",
      "child_ranges": [
        "(line 1024,col 9)-(line 1024,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ThrowableNestedNestable.getThrowable(int)",
      "begin_line": 1030,
      "end_line": 1033,
      "comment": "\n     * @see Nestable#getThrowable(int)\n     ",
      "child_ranges": [
        "(line 1032,col 9)-(line 1032,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ThrowableNestedNestable.getThrowables()",
      "begin_line": 1038,
      "end_line": 1043,
      "comment": "\n     * @see Nestable#getThrowableS()\n     ",
      "child_ranges": [
        "(line 1040,col 9)-(line 1040,col 50)",
        "(line 1041,col 9)-(line 1041,col 30)",
        "(line 1042,col 9)-(line 1042,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ThrowableNestedNestable.indexOfThrowable(java.lang.Class)",
      "begin_line": 1048,
      "end_line": 1055,
      "comment": "\n     * @see Nestable#indexOfThrowable(Class)\n     ",
      "child_ranges": [
        "(line 1050,col 9)-(line 1053,col 9)",
        "(line 1054,col 9)-(line 1054,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ThrowableNestedNestable.indexOfThrowable(java.lang.Class, int)",
      "begin_line": 1060,
      "end_line": 1063,
      "comment": "\n     * @see Nestable#indexOfThrowable(Class, int)\n     ",
      "child_ranges": [
        "(line 1062,col 9)-(line 1062,col 38)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NonThrowableNestable",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.exception.Nestable"
      ],
      "begin_line": 1070,
      "end_line": 1184,
      "comment": "\n * Used to test that the constructor fails when passed a non-throwable cause\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NonThrowableNestable.getThrowableCount()",
      "begin_line": 1076,
      "end_line": 1079,
      "comment": "\n     * @see Nestable#getThrowableCount()\n     * Returns 1 for this test.\n     ",
      "child_ranges": [
        "(line 1078,col 9)-(line 1078,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NonThrowableNestable.getMessage()",
      "begin_line": 1085,
      "end_line": 1088,
      "comment": "\n     * @see Nestable#getMessage()\n     * Returns the string \"non-throwable\" for this test.\n     ",
      "child_ranges": [
        "(line 1087,col 9)-(line 1087,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NonThrowableNestable.getMessage(int)",
      "begin_line": 1094,
      "end_line": 1097,
      "comment": "\n     * @see Nestable#getMessage(int)\n     * Returns the string \"non-throwable\" for this test.\n     ",
      "child_ranges": [
        "(line 1096,col 9)-(line 1096,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NonThrowableNestable.getMessages()",
      "begin_line": 1104,
      "end_line": 1109,
      "comment": "\n     * @see Nestable#getMessage()\n     * Returns a single-element array containing the string \"non-throwable\" for\n     * this test.\n     ",
      "child_ranges": [
        "(line 1106,col 9)-(line 1106,col 38)",
        "(line 1107,col 9)-(line 1107,col 34)",
        "(line 1108,col 9)-(line 1108,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NonThrowableNestable.getCause()",
      "begin_line": 1115,
      "end_line": 1118,
      "comment": "\n     * @see Nestable#getCause()\n     * Returns \u003ccode\u003enull\u003c/code\u003e for this test.\n     ",
      "child_ranges": [
        "(line 1117,col 9)-(line 1117,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NonThrowableNestable.printStackTrace(java.io.PrintWriter)",
      "begin_line": 1125,
      "end_line": 1127,
      "comment": "\n     * @see Nestable#printStackTrace(PrintWriter)\n     * Empty method to satisfy the implemented interface. Does nothing\n     * in this test.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NonThrowableNestable.printStackTrace(java.io.PrintStream)",
      "begin_line": 1134,
      "end_line": 1136,
      "comment": "\n     * @see Nestable#printStackTrace(PrintStream)\n     * Empty method to satisfy the implemented interface. Does nothing\n     * in this test.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NonThrowableNestable.printPartialStackTrace(java.io.PrintWriter)",
      "begin_line": 1143,
      "end_line": 1145,
      "comment": "\n     * @see Nestable#printPartialStackTrace(PrintWriter)\n     * Empty method to satisfy the implemented interface. Does nothing\n     * in this test.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NonThrowableNestable.getThrowable(int)",
      "begin_line": 1152,
      "end_line": 1155,
      "comment": "\n     * @see Nestable#getThrowable(int)\n     * Returns \u003ccode\u003enull\u003c/code\u003e for this test.\n     ",
      "child_ranges": [
        "(line 1154,col 9)-(line 1154,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NonThrowableNestable.getThrowables()",
      "begin_line": 1161,
      "end_line": 1164,
      "comment": "\n     * @see Nestable#getThrowables()\n     * Returns zero-length \u003ccode\u003eThrowable\u003c/code\u003e array.\n     ",
      "child_ranges": [
        "(line 1163,col 9)-(line 1163,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NonThrowableNestable.indexOfThrowable(java.lang.Class)",
      "begin_line": 1170,
      "end_line": 1173,
      "comment": "\n     * @see Nestable#indexOfThrowable(Class)\n     * Returns -1 for this test.\n     ",
      "child_ranges": [
        "(line 1172,col 9)-(line 1172,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NonThrowableNestable.indexOfThrowable(java.lang.Class, int)",
      "begin_line": 1179,
      "end_line": 1182,
      "comment": "\n     * @see Nestable#indexOfThrowable(Class, int)\n     * Returns -1 for this test.\n     ",
      "child_ranges": [
        "(line 1181,col 9)-(line 1181,col 18)"
      ]
    }
  ]
}