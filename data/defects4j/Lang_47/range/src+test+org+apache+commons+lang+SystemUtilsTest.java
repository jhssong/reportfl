{
  "filepath": "/tmp/Lang-47b/src/test/org/apache/commons/lang/SystemUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SystemUtilsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 42,
      "end_line": 548,
      "comment": "\n * Unit tests {@link org.apache.commons.lang.SystemUtils}.\n * \n * Only limited testing can be performed.\n * \n * @author Stephen Colebourne\n * @author Tetsuya Kaneuchi\n * @author Gary D. Gregory\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtilsTest.main(java.lang.String[])",
      "begin_line": 43,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtilsTest.suite()",
      "begin_line": 47,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 63)",
        "(line 49,col 9)-(line 49,col 43)",
        "(line 50,col 9)-(line 50,col 21)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VERSION"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": "-----------------------------------------------------------------------"
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VERSION_TRIMMED"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "OS_NAME"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "OS_VERSION"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.SystemUtilsTest.SystemUtilsTest(java.lang.String)",
      "begin_line": 64,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtilsTest.getJavaVersionAsFloat()",
      "begin_line": 82,
      "end_line": 95,
      "comment": "\n     * \u003cp\u003eGets the Java version number as a \u003ccode\u003efloat\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eExample return values:\u003c/p\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003e\u003ccode\u003e1.2f\u003c/code\u003e for JDK 1.2\n     *  \u003cli\u003e\u003ccode\u003e1.31f\u003c/code\u003e for JDK 1.3.1\n     * \u003c/ul\u003e\n     * \n     * \u003cp\u003ePatch releases are not reported.\n     * Zero is returned if {@link #JAVA_VERSION_TRIMMED} is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @return the version, for example 1.31f for JDK 1.3.1\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 85,col 9)",
        "(line 86,col 9)-(line 86,col 58)",
        "(line 87,col 9)-(line 89,col 9)",
        "(line 90,col 9)-(line 94,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtilsTest.getJavaVersionAsInt()",
      "begin_line": 111,
      "end_line": 127,
      "comment": "\n     * \u003cp\u003eGets the Java version number as an \u003ccode\u003eint\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eExample return values:\u003c/p\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003e\u003ccode\u003e120\u003c/code\u003e for JDK 1.2\n     *  \u003cli\u003e\u003ccode\u003e131\u003c/code\u003e for JDK 1.3.1\n     * \u003c/ul\u003e\n     * \n     * \u003cp\u003ePatch releases are not reported.\n     * Zero is returned if {@link #JAVA_VERSION_TRIMMED} is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @return the version, for example 131 for JDK 1.3.1\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 115,col 58)",
        "(line 116,col 9)-(line 116,col 57)",
        "(line 117,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 126,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtilsTest.getJavaVersionTrimmed()",
      "begin_line": 134,
      "end_line": 144,
      "comment": "\n     * Trims the text of the java version to start with numbers.\n     * \n     * @return the trimmed java version\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 143,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtilsTest.getJavaVersionMatches(java.lang.String)",
      "begin_line": 153,
      "end_line": 158,
      "comment": "\n     * Decides if the java version matches.\n     * \n     * @param versionPrefix\n     *                  the prefix for the java version\n     * @return true if matches, or false if not or can\u0027t determine\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 157,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtilsTest.getOSMatches(java.lang.String)",
      "begin_line": 167,
      "end_line": 172,
      "comment": "\n     * Decides if the operating system matches.\n     * \n     * @param osNamePrefix\n     *                  the prefix for the os name\n     * @return true if matches, or false if not or can\u0027t determine\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 171,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtilsTest.getOSMatches(java.lang.String, java.lang.String)",
      "begin_line": 183,
      "end_line": 188,
      "comment": "\n     * Decides if the operating system matches.\n     * \n     * @param osNamePrefix\n     *                  the prefix for the os name\n     * @param osVersionPrefix\n     *                  the prefix for the version\n     * @return true if matches, or false if not or can\u0027t determine\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 187,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtilsTest.setUp()",
      "begin_line": 190,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtilsTest.tearDown()",
      "begin_line": 194,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtilsTest.testConstructor()",
      "begin_line": 199,
      "end_line": 206,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 41)",
        "(line 201,col 9)-(line 201,col 73)",
        "(line 202,col 9)-(line 202,col 37)",
        "(line 203,col 9)-(line 203,col 70)",
        "(line 204,col 9)-(line 204,col 80)",
        "(line 205,col 9)-(line 205,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtilsTest.testGetJavaHome()",
      "begin_line": 211,
      "end_line": 215,
      "comment": "\n     * Assums no security manager exists.\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 45)",
        "(line 213,col 9)-(line 213,col 34)",
        "(line 214,col 9)-(line 214,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtilsTest.testGetJavaIoTmpDir()",
      "begin_line": 220,
      "end_line": 224,
      "comment": "\n     * Assums no security manager exists.\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 49)",
        "(line 222,col 9)-(line 222,col 34)",
        "(line 223,col 9)-(line 223,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtilsTest.testGetUserDir()",
      "begin_line": 229,
      "end_line": 233,
      "comment": "\n     * Assums no security manager exists.\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 44)",
        "(line 231,col 9)-(line 231,col 34)",
        "(line 232,col 9)-(line 232,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtilsTest.testGetUserHome()",
      "begin_line": 238,
      "end_line": 242,
      "comment": "\n     * Assums no security manager exists.\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 45)",
        "(line 240,col 9)-(line 240,col 34)",
        "(line 241,col 9)-(line 241,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtilsTest.testIS_JAVA()",
      "begin_line": 244,
      "end_line": 298,
      "comment": "",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 64)",
        "(line 246,col 9)-(line 297,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtilsTest.testIS_OS()",
      "begin_line": 300,
      "end_line": 334,
      "comment": "",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 54)",
        "(line 302,col 9)-(line 333,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtilsTest.testDeprecatedJavaVersion()",
      "begin_line": 337,
      "end_line": 339,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtilsTest.testJavaVersionAsFloat()",
      "begin_line": 341,
      "end_line": 375,
      "comment": "",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 28)",
        "(line 343,col 9)-(line 343,col 55)",
        "(line 344,col 9)-(line 344,col 61)",
        "(line 345,col 9)-(line 345,col 29)",
        "(line 346,col 9)-(line 346,col 55)",
        "(line 347,col 9)-(line 347,col 63)",
        "(line 348,col 9)-(line 348,col 29)",
        "(line 349,col 9)-(line 349,col 55)",
        "(line 350,col 9)-(line 350,col 63)",
        "(line 351,col 9)-(line 351,col 31)",
        "(line 352,col 9)-(line 352,col 55)",
        "(line 353,col 9)-(line 353,col 63)",
        "(line 354,col 9)-(line 354,col 31)",
        "(line 355,col 9)-(line 355,col 55)",
        "(line 356,col 9)-(line 356,col 64)",
        "(line 357,col 9)-(line 357,col 31)",
        "(line 358,col 9)-(line 358,col 55)",
        "(line 359,col 9)-(line 359,col 63)",
        "(line 360,col 9)-(line 360,col 31)",
        "(line 361,col 9)-(line 361,col 55)",
        "(line 362,col 9)-(line 362,col 64)",
        "(line 363,col 9)-(line 363,col 31)",
        "(line 364,col 9)-(line 364,col 55)",
        "(line 365,col 9)-(line 365,col 63)",
        "(line 366,col 9)-(line 366,col 31)",
        "(line 367,col 9)-(line 367,col 55)",
        "(line 368,col 9)-(line 368,col 63)",
        "(line 369,col 9)-(line 369,col 38)",
        "(line 370,col 9)-(line 370,col 55)",
        "(line 371,col 9)-(line 371,col 64)",
        "(line 372,col 9)-(line 372,col 35)",
        "(line 373,col 9)-(line 373,col 55)",
        "(line 374,col 9)-(line 374,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtilsTest.testJavaVersionAsInt()",
      "begin_line": 377,
      "end_line": 411,
      "comment": "",
      "child_ranges": [
        "(line 378,col 9)-(line 378,col 28)",
        "(line 379,col 9)-(line 379,col 55)",
        "(line 380,col 9)-(line 380,col 47)",
        "(line 381,col 9)-(line 381,col 29)",
        "(line 382,col 9)-(line 382,col 55)",
        "(line 383,col 9)-(line 383,col 49)",
        "(line 384,col 9)-(line 384,col 29)",
        "(line 385,col 9)-(line 385,col 55)",
        "(line 386,col 9)-(line 386,col 49)",
        "(line 387,col 9)-(line 387,col 31)",
        "(line 388,col 9)-(line 388,col 55)",
        "(line 389,col 9)-(line 389,col 49)",
        "(line 390,col 9)-(line 390,col 31)",
        "(line 391,col 9)-(line 391,col 55)",
        "(line 392,col 9)-(line 392,col 49)",
        "(line 393,col 9)-(line 393,col 31)",
        "(line 394,col 9)-(line 394,col 55)",
        "(line 395,col 9)-(line 395,col 49)",
        "(line 396,col 9)-(line 396,col 31)",
        "(line 397,col 9)-(line 397,col 55)",
        "(line 398,col 9)-(line 398,col 49)",
        "(line 399,col 9)-(line 399,col 31)",
        "(line 400,col 9)-(line 400,col 55)",
        "(line 401,col 9)-(line 401,col 49)",
        "(line 402,col 9)-(line 402,col 31)",
        "(line 403,col 9)-(line 403,col 55)",
        "(line 404,col 9)-(line 404,col 49)",
        "(line 405,col 9)-(line 405,col 38)",
        "(line 406,col 9)-(line 406,col 55)",
        "(line 407,col 9)-(line 407,col 49)",
        "(line 408,col 9)-(line 408,col 35)",
        "(line 409,col 9)-(line 409,col 55)",
        "(line 410,col 9)-(line 410,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtilsTest.testJavaVersionAtLeastFloat()",
      "begin_line": 413,
      "end_line": 420,
      "comment": "",
      "child_ranges": [
        "(line 414,col 9)-(line 414,col 55)",
        "(line 415,col 9)-(line 415,col 70)",
        "(line 416,col 9)-(line 416,col 24)",
        "(line 417,col 9)-(line 417,col 70)",
        "(line 418,col 9)-(line 418,col 24)",
        "(line 419,col 9)-(line 419,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtilsTest.testJavaVersionAtLeastInt()",
      "begin_line": 422,
      "end_line": 429,
      "comment": "",
      "child_ranges": [
        "(line 423,col 9)-(line 423,col 51)",
        "(line 424,col 9)-(line 424,col 70)",
        "(line 425,col 9)-(line 425,col 22)",
        "(line 426,col 9)-(line 426,col 70)",
        "(line 427,col 9)-(line 427,col 22)",
        "(line 428,col 9)-(line 428,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtilsTest.testJavaVersionMatches()",
      "begin_line": 432,
      "end_line": 496,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 28)",
        "(line 434,col 9)-(line 434,col 55)",
        "(line 435,col 9)-(line 435,col 58)",
        "(line 436,col 9)-(line 436,col 58)",
        "(line 437,col 9)-(line 437,col 58)",
        "(line 438,col 9)-(line 438,col 58)",
        "(line 439,col 9)-(line 439,col 58)",
        "(line 440,col 9)-(line 440,col 29)",
        "(line 441,col 9)-(line 441,col 55)",
        "(line 442,col 9)-(line 442,col 57)",
        "(line 443,col 9)-(line 443,col 58)",
        "(line 444,col 9)-(line 444,col 58)",
        "(line 445,col 9)-(line 445,col 58)",
        "(line 446,col 9)-(line 446,col 58)",
        "(line 447,col 9)-(line 447,col 29)",
        "(line 448,col 9)-(line 448,col 55)",
        "(line 449,col 9)-(line 449,col 58)",
        "(line 450,col 9)-(line 450,col 57)",
        "(line 451,col 9)-(line 451,col 58)",
        "(line 452,col 9)-(line 452,col 58)",
        "(line 453,col 9)-(line 453,col 58)",
        "(line 454,col 9)-(line 454,col 31)",
        "(line 455,col 9)-(line 455,col 55)",
        "(line 456,col 9)-(line 456,col 58)",
        "(line 457,col 9)-(line 457,col 58)",
        "(line 458,col 9)-(line 458,col 57)",
        "(line 459,col 9)-(line 459,col 58)",
        "(line 460,col 9)-(line 460,col 58)",
        "(line 461,col 9)-(line 461,col 31)",
        "(line 462,col 9)-(line 462,col 55)",
        "(line 463,col 9)-(line 463,col 58)",
        "(line 464,col 9)-(line 464,col 58)",
        "(line 465,col 9)-(line 465,col 57)",
        "(line 466,col 9)-(line 466,col 58)",
        "(line 467,col 9)-(line 467,col 58)",
        "(line 468,col 9)-(line 468,col 31)",
        "(line 469,col 9)-(line 469,col 55)",
        "(line 470,col 9)-(line 470,col 58)",
        "(line 471,col 9)-(line 471,col 58)",
        "(line 472,col 9)-(line 472,col 58)",
        "(line 473,col 9)-(line 473,col 57)",
        "(line 474,col 9)-(line 474,col 58)",
        "(line 475,col 9)-(line 475,col 31)",
        "(line 476,col 9)-(line 476,col 55)",
        "(line 477,col 9)-(line 477,col 58)",
        "(line 478,col 9)-(line 478,col 58)",
        "(line 479,col 9)-(line 479,col 58)",
        "(line 480,col 9)-(line 480,col 57)",
        "(line 481,col 9)-(line 481,col 58)",
        "(line 482,col 9)-(line 482,col 31)",
        "(line 483,col 9)-(line 483,col 55)",
        "(line 484,col 9)-(line 484,col 58)",
        "(line 485,col 9)-(line 485,col 58)",
        "(line 486,col 9)-(line 486,col 58)",
        "(line 487,col 9)-(line 487,col 58)",
        "(line 488,col 9)-(line 488,col 57)",
        "(line 489,col 9)-(line 489,col 31)",
        "(line 490,col 9)-(line 490,col 55)",
        "(line 491,col 9)-(line 491,col 58)",
        "(line 492,col 9)-(line 492,col 58)",
        "(line 493,col 9)-(line 493,col 58)",
        "(line 494,col 9)-(line 494,col 58)",
        "(line 495,col 9)-(line 495,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtilsTest.testOSMatches()",
      "begin_line": 498,
      "end_line": 507,
      "comment": "",
      "child_ranges": [
        "(line 499,col 9)-(line 499,col 23)",
        "(line 500,col 9)-(line 500,col 53)",
        "(line 501,col 9)-(line 501,col 31)",
        "(line 502,col 9)-(line 502,col 52)",
        "(line 503,col 9)-(line 503,col 31)",
        "(line 504,col 9)-(line 504,col 52)",
        "(line 505,col 9)-(line 505,col 25)",
        "(line 506,col 9)-(line 506,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtilsTest.testOSMatches2()",
      "begin_line": 509,
      "end_line": 528,
      "comment": "",
      "child_ranges": [
        "(line 510,col 9)-(line 510,col 23)",
        "(line 511,col 9)-(line 511,col 26)",
        "(line 512,col 9)-(line 512,col 62)",
        "(line 513,col 9)-(line 513,col 31)",
        "(line 514,col 9)-(line 514,col 27)",
        "(line 515,col 9)-(line 515,col 62)",
        "(line 516,col 9)-(line 516,col 31)",
        "(line 517,col 9)-(line 517,col 27)",
        "(line 518,col 9)-(line 518,col 61)",
        "(line 519,col 9)-(line 519,col 31)",
        "(line 520,col 9)-(line 520,col 27)",
        "(line 521,col 9)-(line 521,col 61)",
        "(line 522,col 9)-(line 522,col 31)",
        "(line 523,col 9)-(line 523,col 27)",
        "(line 524,col 9)-(line 524,col 62)",
        "(line 525,col 9)-(line 525,col 25)",
        "(line 526,col 9)-(line 526,col 27)",
        "(line 527,col 9)-(line 527,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtilsTest.testJavaAwtHeadless()",
      "begin_line": 530,
      "end_line": 547,
      "comment": "",
      "child_ranges": [
        "(line 531,col 9)-(line 531,col 70)",
        "(line 532,col 9)-(line 532,col 77)",
        "(line 533,col 9)-(line 533,col 97)",
        "(line 534,col 9)-(line 534,col 54)",
        "(line 535,col 9)-(line 545,col 9)",
        "(line 546,col 9)-(line 546,col 91)"
      ]
    }
  ]
}