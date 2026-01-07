{
  "filepath": "/tmp/Lang-39b/src/test/org/apache/commons/lang3/SystemUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SystemUtilsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 43,
      "end_line": 547,
      "comment": "\n * Unit tests {@link org.apache.commons.lang3.SystemUtils}.\n * \n * Only limited testing can be performed.\n * \n * @author Apache Software Foundation\n * @author Tetsuya Kaneuchi\n * @author Gary D. Gregory\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtilsTest.main(java.lang.String[])",
      "begin_line": 44,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtilsTest.suite()",
      "begin_line": 48,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 63)",
        "(line 50,col 9)-(line 50,col 43)",
        "(line 51,col 9)-(line 51,col 21)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VERSION"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": "-----------------------------------------------------------------------"
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VERSION_TRIMMED"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "OS_NAME"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "OS_VERSION"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.SystemUtilsTest.SystemUtilsTest(java.lang.String)",
      "begin_line": 65,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtilsTest.getJavaVersionAsFloat()",
      "begin_line": 83,
      "end_line": 96,
      "comment": "\n     * \u003cp\u003eGets the Java version number as a \u003ccode\u003efloat\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eExample return values:\u003c/p\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003e\u003ccode\u003e1.2f\u003c/code\u003e for JDK 1.2\n     *  \u003cli\u003e\u003ccode\u003e1.31f\u003c/code\u003e for JDK 1.3.1\n     * \u003c/ul\u003e\n     * \n     * \u003cp\u003ePatch releases are not reported.\n     * Zero is returned if {@link #JAVA_VERSION_TRIMMED} is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @return the version, for example 1.31f for JDK 1.3.1\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 86,col 9)",
        "(line 87,col 9)-(line 87,col 58)",
        "(line 88,col 9)-(line 90,col 9)",
        "(line 91,col 9)-(line 95,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtilsTest.getJavaVersionAsInt()",
      "begin_line": 112,
      "end_line": 128,
      "comment": "\n     * \u003cp\u003eGets the Java version number as an \u003ccode\u003eint\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eExample return values:\u003c/p\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003e\u003ccode\u003e120\u003c/code\u003e for JDK 1.2\n     *  \u003cli\u003e\u003ccode\u003e131\u003c/code\u003e for JDK 1.3.1\n     * \u003c/ul\u003e\n     * \n     * \u003cp\u003ePatch releases are not reported.\n     * Zero is returned if {@link #JAVA_VERSION_TRIMMED} is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @return the version, for example 131 for JDK 1.3.1\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 115,col 9)",
        "(line 116,col 9)-(line 116,col 58)",
        "(line 117,col 9)-(line 117,col 57)",
        "(line 118,col 9)-(line 122,col 9)",
        "(line 123,col 9)-(line 127,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtilsTest.getJavaVersionTrimmed()",
      "begin_line": 135,
      "end_line": 145,
      "comment": "\n     * Trims the text of the java version to start with numbers.\n     * \n     * @return the trimmed java version\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 144,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtilsTest.getJavaVersionMatches(java.lang.String)",
      "begin_line": 154,
      "end_line": 159,
      "comment": "\n     * Decides if the java version matches.\n     * \n     * @param versionPrefix\n     *                  the prefix for the java version\n     * @return true if matches, or false if not or can\u0027t determine\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 158,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtilsTest.getOSMatches(java.lang.String)",
      "begin_line": 168,
      "end_line": 173,
      "comment": "\n     * Decides if the operating system matches.\n     * \n     * @param osNamePrefix\n     *                  the prefix for the os name\n     * @return true if matches, or false if not or can\u0027t determine\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 171,col 9)",
        "(line 172,col 9)-(line 172,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtilsTest.getOSMatches(java.lang.String, java.lang.String)",
      "begin_line": 184,
      "end_line": 189,
      "comment": "\n     * Decides if the operating system matches.\n     * \n     * @param osNamePrefix\n     *                  the prefix for the os name\n     * @param osVersionPrefix\n     *                  the prefix for the version\n     * @return true if matches, or false if not or can\u0027t determine\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 187,col 9)",
        "(line 188,col 9)-(line 188,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtilsTest.setUp()",
      "begin_line": 191,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtilsTest.tearDown()",
      "begin_line": 196,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtilsTest.testConstructor()",
      "begin_line": 202,
      "end_line": 209,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 41)",
        "(line 204,col 9)-(line 204,col 76)",
        "(line 205,col 9)-(line 205,col 37)",
        "(line 206,col 9)-(line 206,col 70)",
        "(line 207,col 9)-(line 207,col 80)",
        "(line 208,col 9)-(line 208,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtilsTest.testGetJavaHome()",
      "begin_line": 214,
      "end_line": 218,
      "comment": "\n     * Assums no security manager exists.\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 45)",
        "(line 216,col 9)-(line 216,col 34)",
        "(line 217,col 9)-(line 217,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtilsTest.testGetJavaIoTmpDir()",
      "begin_line": 223,
      "end_line": 227,
      "comment": "\n     * Assums no security manager exists.\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 49)",
        "(line 225,col 9)-(line 225,col 34)",
        "(line 226,col 9)-(line 226,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtilsTest.testGetUserDir()",
      "begin_line": 232,
      "end_line": 236,
      "comment": "\n     * Assums no security manager exists.\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 44)",
        "(line 234,col 9)-(line 234,col 34)",
        "(line 235,col 9)-(line 235,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtilsTest.testGetUserHome()",
      "begin_line": 241,
      "end_line": 245,
      "comment": "\n     * Assums no security manager exists.\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 45)",
        "(line 243,col 9)-(line 243,col 34)",
        "(line 244,col 9)-(line 244,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtilsTest.testIS_JAVA()",
      "begin_line": 247,
      "end_line": 301,
      "comment": "",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 64)",
        "(line 249,col 9)-(line 300,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtilsTest.testIS_OS()",
      "begin_line": 303,
      "end_line": 337,
      "comment": "",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 54)",
        "(line 305,col 9)-(line 336,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtilsTest.testJavaVersionAsFloat()",
      "begin_line": 340,
      "end_line": 374,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 28)",
        "(line 342,col 9)-(line 342,col 55)",
        "(line 343,col 9)-(line 343,col 61)",
        "(line 344,col 9)-(line 344,col 29)",
        "(line 345,col 9)-(line 345,col 55)",
        "(line 346,col 9)-(line 346,col 63)",
        "(line 347,col 9)-(line 347,col 29)",
        "(line 348,col 9)-(line 348,col 55)",
        "(line 349,col 9)-(line 349,col 63)",
        "(line 350,col 9)-(line 350,col 31)",
        "(line 351,col 9)-(line 351,col 55)",
        "(line 352,col 9)-(line 352,col 63)",
        "(line 353,col 9)-(line 353,col 31)",
        "(line 354,col 9)-(line 354,col 55)",
        "(line 355,col 9)-(line 355,col 64)",
        "(line 356,col 9)-(line 356,col 31)",
        "(line 357,col 9)-(line 357,col 55)",
        "(line 358,col 9)-(line 358,col 63)",
        "(line 359,col 9)-(line 359,col 31)",
        "(line 360,col 9)-(line 360,col 55)",
        "(line 361,col 9)-(line 361,col 64)",
        "(line 362,col 9)-(line 362,col 31)",
        "(line 363,col 9)-(line 363,col 55)",
        "(line 364,col 9)-(line 364,col 63)",
        "(line 365,col 9)-(line 365,col 31)",
        "(line 366,col 9)-(line 366,col 55)",
        "(line 367,col 9)-(line 367,col 63)",
        "(line 368,col 9)-(line 368,col 38)",
        "(line 369,col 9)-(line 369,col 55)",
        "(line 370,col 9)-(line 370,col 64)",
        "(line 371,col 9)-(line 371,col 35)",
        "(line 372,col 9)-(line 372,col 55)",
        "(line 373,col 9)-(line 373,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtilsTest.testJavaVersionAsInt()",
      "begin_line": 376,
      "end_line": 410,
      "comment": "",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 28)",
        "(line 378,col 9)-(line 378,col 55)",
        "(line 379,col 9)-(line 379,col 47)",
        "(line 380,col 9)-(line 380,col 29)",
        "(line 381,col 9)-(line 381,col 55)",
        "(line 382,col 9)-(line 382,col 49)",
        "(line 383,col 9)-(line 383,col 29)",
        "(line 384,col 9)-(line 384,col 55)",
        "(line 385,col 9)-(line 385,col 49)",
        "(line 386,col 9)-(line 386,col 31)",
        "(line 387,col 9)-(line 387,col 55)",
        "(line 388,col 9)-(line 388,col 49)",
        "(line 389,col 9)-(line 389,col 31)",
        "(line 390,col 9)-(line 390,col 55)",
        "(line 391,col 9)-(line 391,col 49)",
        "(line 392,col 9)-(line 392,col 31)",
        "(line 393,col 9)-(line 393,col 55)",
        "(line 394,col 9)-(line 394,col 49)",
        "(line 395,col 9)-(line 395,col 31)",
        "(line 396,col 9)-(line 396,col 55)",
        "(line 397,col 9)-(line 397,col 49)",
        "(line 398,col 9)-(line 398,col 31)",
        "(line 399,col 9)-(line 399,col 55)",
        "(line 400,col 9)-(line 400,col 49)",
        "(line 401,col 9)-(line 401,col 31)",
        "(line 402,col 9)-(line 402,col 55)",
        "(line 403,col 9)-(line 403,col 49)",
        "(line 404,col 9)-(line 404,col 38)",
        "(line 405,col 9)-(line 405,col 55)",
        "(line 406,col 9)-(line 406,col 49)",
        "(line 407,col 9)-(line 407,col 35)",
        "(line 408,col 9)-(line 408,col 55)",
        "(line 409,col 9)-(line 409,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtilsTest.testJavaVersionAtLeastFloat()",
      "begin_line": 412,
      "end_line": 419,
      "comment": "",
      "child_ranges": [
        "(line 413,col 9)-(line 413,col 55)",
        "(line 414,col 9)-(line 414,col 70)",
        "(line 415,col 9)-(line 415,col 24)",
        "(line 416,col 9)-(line 416,col 70)",
        "(line 417,col 9)-(line 417,col 24)",
        "(line 418,col 9)-(line 418,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtilsTest.testJavaVersionAtLeastInt()",
      "begin_line": 421,
      "end_line": 428,
      "comment": "",
      "child_ranges": [
        "(line 422,col 9)-(line 422,col 51)",
        "(line 423,col 9)-(line 423,col 70)",
        "(line 424,col 9)-(line 424,col 22)",
        "(line 425,col 9)-(line 425,col 70)",
        "(line 426,col 9)-(line 426,col 22)",
        "(line 427,col 9)-(line 427,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtilsTest.testJavaVersionMatches()",
      "begin_line": 431,
      "end_line": 495,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 432,col 9)-(line 432,col 28)",
        "(line 433,col 9)-(line 433,col 55)",
        "(line 434,col 9)-(line 434,col 58)",
        "(line 435,col 9)-(line 435,col 58)",
        "(line 436,col 9)-(line 436,col 58)",
        "(line 437,col 9)-(line 437,col 58)",
        "(line 438,col 9)-(line 438,col 58)",
        "(line 439,col 9)-(line 439,col 29)",
        "(line 440,col 9)-(line 440,col 55)",
        "(line 441,col 9)-(line 441,col 57)",
        "(line 442,col 9)-(line 442,col 58)",
        "(line 443,col 9)-(line 443,col 58)",
        "(line 444,col 9)-(line 444,col 58)",
        "(line 445,col 9)-(line 445,col 58)",
        "(line 446,col 9)-(line 446,col 29)",
        "(line 447,col 9)-(line 447,col 55)",
        "(line 448,col 9)-(line 448,col 58)",
        "(line 449,col 9)-(line 449,col 57)",
        "(line 450,col 9)-(line 450,col 58)",
        "(line 451,col 9)-(line 451,col 58)",
        "(line 452,col 9)-(line 452,col 58)",
        "(line 453,col 9)-(line 453,col 31)",
        "(line 454,col 9)-(line 454,col 55)",
        "(line 455,col 9)-(line 455,col 58)",
        "(line 456,col 9)-(line 456,col 58)",
        "(line 457,col 9)-(line 457,col 57)",
        "(line 458,col 9)-(line 458,col 58)",
        "(line 459,col 9)-(line 459,col 58)",
        "(line 460,col 9)-(line 460,col 31)",
        "(line 461,col 9)-(line 461,col 55)",
        "(line 462,col 9)-(line 462,col 58)",
        "(line 463,col 9)-(line 463,col 58)",
        "(line 464,col 9)-(line 464,col 57)",
        "(line 465,col 9)-(line 465,col 58)",
        "(line 466,col 9)-(line 466,col 58)",
        "(line 467,col 9)-(line 467,col 31)",
        "(line 468,col 9)-(line 468,col 55)",
        "(line 469,col 9)-(line 469,col 58)",
        "(line 470,col 9)-(line 470,col 58)",
        "(line 471,col 9)-(line 471,col 58)",
        "(line 472,col 9)-(line 472,col 57)",
        "(line 473,col 9)-(line 473,col 58)",
        "(line 474,col 9)-(line 474,col 31)",
        "(line 475,col 9)-(line 475,col 55)",
        "(line 476,col 9)-(line 476,col 58)",
        "(line 477,col 9)-(line 477,col 58)",
        "(line 478,col 9)-(line 478,col 58)",
        "(line 479,col 9)-(line 479,col 57)",
        "(line 480,col 9)-(line 480,col 58)",
        "(line 481,col 9)-(line 481,col 31)",
        "(line 482,col 9)-(line 482,col 55)",
        "(line 483,col 9)-(line 483,col 58)",
        "(line 484,col 9)-(line 484,col 58)",
        "(line 485,col 9)-(line 485,col 58)",
        "(line 486,col 9)-(line 486,col 58)",
        "(line 487,col 9)-(line 487,col 57)",
        "(line 488,col 9)-(line 488,col 31)",
        "(line 489,col 9)-(line 489,col 55)",
        "(line 490,col 9)-(line 490,col 58)",
        "(line 491,col 9)-(line 491,col 58)",
        "(line 492,col 9)-(line 492,col 58)",
        "(line 493,col 9)-(line 493,col 58)",
        "(line 494,col 9)-(line 494,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtilsTest.testOSMatches()",
      "begin_line": 497,
      "end_line": 506,
      "comment": "",
      "child_ranges": [
        "(line 498,col 9)-(line 498,col 23)",
        "(line 499,col 9)-(line 499,col 53)",
        "(line 500,col 9)-(line 500,col 31)",
        "(line 501,col 9)-(line 501,col 52)",
        "(line 502,col 9)-(line 502,col 31)",
        "(line 503,col 9)-(line 503,col 52)",
        "(line 504,col 9)-(line 504,col 25)",
        "(line 505,col 9)-(line 505,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtilsTest.testOSMatches2()",
      "begin_line": 508,
      "end_line": 527,
      "comment": "",
      "child_ranges": [
        "(line 509,col 9)-(line 509,col 23)",
        "(line 510,col 9)-(line 510,col 26)",
        "(line 511,col 9)-(line 511,col 62)",
        "(line 512,col 9)-(line 512,col 31)",
        "(line 513,col 9)-(line 513,col 27)",
        "(line 514,col 9)-(line 514,col 62)",
        "(line 515,col 9)-(line 515,col 31)",
        "(line 516,col 9)-(line 516,col 27)",
        "(line 517,col 9)-(line 517,col 61)",
        "(line 518,col 9)-(line 518,col 31)",
        "(line 519,col 9)-(line 519,col 27)",
        "(line 520,col 9)-(line 520,col 61)",
        "(line 521,col 9)-(line 521,col 31)",
        "(line 522,col 9)-(line 522,col 27)",
        "(line 523,col 9)-(line 523,col 62)",
        "(line 524,col 9)-(line 524,col 25)",
        "(line 525,col 9)-(line 525,col 27)",
        "(line 526,col 9)-(line 526,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtilsTest.testJavaAwtHeadless()",
      "begin_line": 529,
      "end_line": 546,
      "comment": "",
      "child_ranges": [
        "(line 530,col 9)-(line 530,col 70)",
        "(line 531,col 9)-(line 531,col 77)",
        "(line 532,col 9)-(line 532,col 97)",
        "(line 533,col 9)-(line 533,col 54)",
        "(line 534,col 9)-(line 544,col 9)",
        "(line 545,col 9)-(line 545,col 91)"
      ]
    }
  ]
}