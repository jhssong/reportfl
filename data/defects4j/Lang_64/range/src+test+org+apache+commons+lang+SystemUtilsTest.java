{
  "filepath": "/tmp/Lang-64b/src/test/org/apache/commons/lang/SystemUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SystemUtilsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 38,
      "end_line": 544,
      "comment": "\n * Unit tests {@link org.apache.commons.lang.SystemUtils}.\n * \n * Only limited testing can be performed.\n * \n * @author Stephen Colebourne\n * @author Tetsuya Kaneuchi\n * @author Gary D. Gregory\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtilsTest.main(java.lang.String[])",
      "begin_line": 39,
      "end_line": 41,
      "comment": "",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtilsTest.suite()",
      "begin_line": 43,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 63)",
        "(line 45,col 9)-(line 45,col 43)",
        "(line 46,col 9)-(line 46,col 21)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VERSION"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": "-----------------------------------------------------------------------"
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VERSION_TRIMMED"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "OS_NAME"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "OS_VERSION"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.SystemUtilsTest.SystemUtilsTest(java.lang.String)",
      "begin_line": 60,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtilsTest.getJavaVersionAsFloat()",
      "begin_line": 78,
      "end_line": 91,
      "comment": "\n     * \u003cp\u003eGets the Java version number as a \u003ccode\u003efloat\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eExample return values:\u003c/p\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003e\u003ccode\u003e1.2f\u003c/code\u003e for JDK 1.2\n     *  \u003cli\u003e\u003ccode\u003e1.31f\u003c/code\u003e for JDK 1.3.1\n     * \u003c/ul\u003e\n     * \n     * \u003cp\u003ePatch releases are not reported.\n     * Zero is returned if {@link #JAVA_VERSION_TRIMMED} is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @return the version, for example 1.31f for JDK 1.3.1\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 81,col 9)",
        "(line 82,col 9)-(line 82,col 58)",
        "(line 83,col 9)-(line 85,col 9)",
        "(line 86,col 9)-(line 90,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtilsTest.getJavaVersionAsInt()",
      "begin_line": 107,
      "end_line": 123,
      "comment": "\n     * \u003cp\u003eGets the Java version number as an \u003ccode\u003eint\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eExample return values:\u003c/p\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003e\u003ccode\u003e120\u003c/code\u003e for JDK 1.2\n     *  \u003cli\u003e\u003ccode\u003e131\u003c/code\u003e for JDK 1.3.1\n     * \u003c/ul\u003e\n     * \n     * \u003cp\u003ePatch releases are not reported.\n     * Zero is returned if {@link #JAVA_VERSION_TRIMMED} is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @return the version, for example 131 for JDK 1.3.1\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 111,col 58)",
        "(line 112,col 9)-(line 112,col 57)",
        "(line 113,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 122,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtilsTest.getJavaVersionTrimmed()",
      "begin_line": 130,
      "end_line": 140,
      "comment": "\n     * Trims the text of the java version to start with numbers.\n     * \n     * @return the trimmed java version\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 139,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtilsTest.getJavaVersionMatches(java.lang.String)",
      "begin_line": 149,
      "end_line": 154,
      "comment": "\n     * Decides if the java version matches.\n     * \n     * @param versionPrefix\n     *                  the prefix for the java version\n     * @return true if matches, or false if not or can\u0027t determine\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 152,col 9)",
        "(line 153,col 9)-(line 153,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtilsTest.getOSMatches(java.lang.String)",
      "begin_line": 163,
      "end_line": 168,
      "comment": "\n     * Decides if the operating system matches.\n     * \n     * @param osNamePrefix\n     *                  the prefix for the os name\n     * @return true if matches, or false if not or can\u0027t determine\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 167,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtilsTest.getOSMatches(java.lang.String, java.lang.String)",
      "begin_line": 179,
      "end_line": 184,
      "comment": "\n     * Decides if the operating system matches.\n     * \n     * @param osNamePrefix\n     *                  the prefix for the os name\n     * @param osVersionPrefix\n     *                  the prefix for the version\n     * @return true if matches, or false if not or can\u0027t determine\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 183,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtilsTest.setUp()",
      "begin_line": 186,
      "end_line": 188,
      "comment": "",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtilsTest.tearDown()",
      "begin_line": 190,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtilsTest.testConstructor()",
      "begin_line": 195,
      "end_line": 202,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 41)",
        "(line 197,col 9)-(line 197,col 73)",
        "(line 198,col 9)-(line 198,col 37)",
        "(line 199,col 9)-(line 199,col 70)",
        "(line 200,col 9)-(line 200,col 80)",
        "(line 201,col 9)-(line 201,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtilsTest.testGetJavaHome()",
      "begin_line": 207,
      "end_line": 211,
      "comment": "\n     * Assums no security manager exists.\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 45)",
        "(line 209,col 9)-(line 209,col 34)",
        "(line 210,col 9)-(line 210,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtilsTest.testGetJavaIoTmpDir()",
      "begin_line": 216,
      "end_line": 220,
      "comment": "\n     * Assums no security manager exists.\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 49)",
        "(line 218,col 9)-(line 218,col 34)",
        "(line 219,col 9)-(line 219,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtilsTest.testGetUserDir()",
      "begin_line": 225,
      "end_line": 229,
      "comment": "\n     * Assums no security manager exists.\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 44)",
        "(line 227,col 9)-(line 227,col 34)",
        "(line 228,col 9)-(line 228,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtilsTest.testGetUserHome()",
      "begin_line": 234,
      "end_line": 238,
      "comment": "\n     * Assums no security manager exists.\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 45)",
        "(line 236,col 9)-(line 236,col 34)",
        "(line 237,col 9)-(line 237,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtilsTest.testIS_JAVA()",
      "begin_line": 240,
      "end_line": 294,
      "comment": "",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 64)",
        "(line 242,col 9)-(line 293,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtilsTest.testIS_OS()",
      "begin_line": 296,
      "end_line": 330,
      "comment": "",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 54)",
        "(line 298,col 9)-(line 329,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtilsTest.testJavaVersion()",
      "begin_line": 333,
      "end_line": 335,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtilsTest.testJavaVersionAsFloat()",
      "begin_line": 337,
      "end_line": 371,
      "comment": "",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 28)",
        "(line 339,col 9)-(line 339,col 55)",
        "(line 340,col 9)-(line 340,col 61)",
        "(line 341,col 9)-(line 341,col 29)",
        "(line 342,col 9)-(line 342,col 55)",
        "(line 343,col 9)-(line 343,col 63)",
        "(line 344,col 9)-(line 344,col 29)",
        "(line 345,col 9)-(line 345,col 55)",
        "(line 346,col 9)-(line 346,col 63)",
        "(line 347,col 9)-(line 347,col 31)",
        "(line 348,col 9)-(line 348,col 55)",
        "(line 349,col 9)-(line 349,col 63)",
        "(line 350,col 9)-(line 350,col 31)",
        "(line 351,col 9)-(line 351,col 55)",
        "(line 352,col 9)-(line 352,col 64)",
        "(line 353,col 9)-(line 353,col 31)",
        "(line 354,col 9)-(line 354,col 55)",
        "(line 355,col 9)-(line 355,col 63)",
        "(line 356,col 9)-(line 356,col 31)",
        "(line 357,col 9)-(line 357,col 55)",
        "(line 358,col 9)-(line 358,col 64)",
        "(line 359,col 9)-(line 359,col 31)",
        "(line 360,col 9)-(line 360,col 55)",
        "(line 361,col 9)-(line 361,col 63)",
        "(line 362,col 9)-(line 362,col 31)",
        "(line 363,col 9)-(line 363,col 55)",
        "(line 364,col 9)-(line 364,col 63)",
        "(line 365,col 9)-(line 365,col 38)",
        "(line 366,col 9)-(line 366,col 55)",
        "(line 367,col 9)-(line 367,col 64)",
        "(line 368,col 9)-(line 368,col 35)",
        "(line 369,col 9)-(line 369,col 55)",
        "(line 370,col 9)-(line 370,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtilsTest.testJavaVersionAsInt()",
      "begin_line": 373,
      "end_line": 407,
      "comment": "",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 28)",
        "(line 375,col 9)-(line 375,col 55)",
        "(line 376,col 9)-(line 376,col 47)",
        "(line 377,col 9)-(line 377,col 29)",
        "(line 378,col 9)-(line 378,col 55)",
        "(line 379,col 9)-(line 379,col 49)",
        "(line 380,col 9)-(line 380,col 29)",
        "(line 381,col 9)-(line 381,col 55)",
        "(line 382,col 9)-(line 382,col 49)",
        "(line 383,col 9)-(line 383,col 31)",
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
        "(line 401,col 9)-(line 401,col 38)",
        "(line 402,col 9)-(line 402,col 55)",
        "(line 403,col 9)-(line 403,col 49)",
        "(line 404,col 9)-(line 404,col 35)",
        "(line 405,col 9)-(line 405,col 55)",
        "(line 406,col 9)-(line 406,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtilsTest.testJavaVersionAtLeastFloat()",
      "begin_line": 409,
      "end_line": 416,
      "comment": "",
      "child_ranges": [
        "(line 410,col 9)-(line 410,col 55)",
        "(line 411,col 9)-(line 411,col 70)",
        "(line 412,col 9)-(line 412,col 24)",
        "(line 413,col 9)-(line 413,col 70)",
        "(line 414,col 9)-(line 414,col 24)",
        "(line 415,col 9)-(line 415,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtilsTest.testJavaVersionAtLeastInt()",
      "begin_line": 418,
      "end_line": 425,
      "comment": "",
      "child_ranges": [
        "(line 419,col 9)-(line 419,col 51)",
        "(line 420,col 9)-(line 420,col 70)",
        "(line 421,col 9)-(line 421,col 22)",
        "(line 422,col 9)-(line 422,col 70)",
        "(line 423,col 9)-(line 423,col 22)",
        "(line 424,col 9)-(line 424,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtilsTest.testJavaVersionMatches()",
      "begin_line": 428,
      "end_line": 492,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 28)",
        "(line 430,col 9)-(line 430,col 55)",
        "(line 431,col 9)-(line 431,col 58)",
        "(line 432,col 9)-(line 432,col 58)",
        "(line 433,col 9)-(line 433,col 58)",
        "(line 434,col 9)-(line 434,col 58)",
        "(line 435,col 9)-(line 435,col 58)",
        "(line 436,col 9)-(line 436,col 29)",
        "(line 437,col 9)-(line 437,col 55)",
        "(line 438,col 9)-(line 438,col 57)",
        "(line 439,col 9)-(line 439,col 58)",
        "(line 440,col 9)-(line 440,col 58)",
        "(line 441,col 9)-(line 441,col 58)",
        "(line 442,col 9)-(line 442,col 58)",
        "(line 443,col 9)-(line 443,col 29)",
        "(line 444,col 9)-(line 444,col 55)",
        "(line 445,col 9)-(line 445,col 58)",
        "(line 446,col 9)-(line 446,col 57)",
        "(line 447,col 9)-(line 447,col 58)",
        "(line 448,col 9)-(line 448,col 58)",
        "(line 449,col 9)-(line 449,col 58)",
        "(line 450,col 9)-(line 450,col 31)",
        "(line 451,col 9)-(line 451,col 55)",
        "(line 452,col 9)-(line 452,col 58)",
        "(line 453,col 9)-(line 453,col 58)",
        "(line 454,col 9)-(line 454,col 57)",
        "(line 455,col 9)-(line 455,col 58)",
        "(line 456,col 9)-(line 456,col 58)",
        "(line 457,col 9)-(line 457,col 31)",
        "(line 458,col 9)-(line 458,col 55)",
        "(line 459,col 9)-(line 459,col 58)",
        "(line 460,col 9)-(line 460,col 58)",
        "(line 461,col 9)-(line 461,col 57)",
        "(line 462,col 9)-(line 462,col 58)",
        "(line 463,col 9)-(line 463,col 58)",
        "(line 464,col 9)-(line 464,col 31)",
        "(line 465,col 9)-(line 465,col 55)",
        "(line 466,col 9)-(line 466,col 58)",
        "(line 467,col 9)-(line 467,col 58)",
        "(line 468,col 9)-(line 468,col 58)",
        "(line 469,col 9)-(line 469,col 57)",
        "(line 470,col 9)-(line 470,col 58)",
        "(line 471,col 9)-(line 471,col 31)",
        "(line 472,col 9)-(line 472,col 55)",
        "(line 473,col 9)-(line 473,col 58)",
        "(line 474,col 9)-(line 474,col 58)",
        "(line 475,col 9)-(line 475,col 58)",
        "(line 476,col 9)-(line 476,col 57)",
        "(line 477,col 9)-(line 477,col 58)",
        "(line 478,col 9)-(line 478,col 31)",
        "(line 479,col 9)-(line 479,col 55)",
        "(line 480,col 9)-(line 480,col 58)",
        "(line 481,col 9)-(line 481,col 58)",
        "(line 482,col 9)-(line 482,col 58)",
        "(line 483,col 9)-(line 483,col 58)",
        "(line 484,col 9)-(line 484,col 57)",
        "(line 485,col 9)-(line 485,col 31)",
        "(line 486,col 9)-(line 486,col 55)",
        "(line 487,col 9)-(line 487,col 58)",
        "(line 488,col 9)-(line 488,col 58)",
        "(line 489,col 9)-(line 489,col 58)",
        "(line 490,col 9)-(line 490,col 58)",
        "(line 491,col 9)-(line 491,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtilsTest.testOSMatches()",
      "begin_line": 494,
      "end_line": 503,
      "comment": "",
      "child_ranges": [
        "(line 495,col 9)-(line 495,col 23)",
        "(line 496,col 9)-(line 496,col 53)",
        "(line 497,col 9)-(line 497,col 31)",
        "(line 498,col 9)-(line 498,col 52)",
        "(line 499,col 9)-(line 499,col 31)",
        "(line 500,col 9)-(line 500,col 52)",
        "(line 501,col 9)-(line 501,col 25)",
        "(line 502,col 9)-(line 502,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtilsTest.testOSMatches2()",
      "begin_line": 505,
      "end_line": 524,
      "comment": "",
      "child_ranges": [
        "(line 506,col 9)-(line 506,col 23)",
        "(line 507,col 9)-(line 507,col 26)",
        "(line 508,col 9)-(line 508,col 62)",
        "(line 509,col 9)-(line 509,col 31)",
        "(line 510,col 9)-(line 510,col 27)",
        "(line 511,col 9)-(line 511,col 62)",
        "(line 512,col 9)-(line 512,col 31)",
        "(line 513,col 9)-(line 513,col 27)",
        "(line 514,col 9)-(line 514,col 61)",
        "(line 515,col 9)-(line 515,col 31)",
        "(line 516,col 9)-(line 516,col 27)",
        "(line 517,col 9)-(line 517,col 61)",
        "(line 518,col 9)-(line 518,col 31)",
        "(line 519,col 9)-(line 519,col 27)",
        "(line 520,col 9)-(line 520,col 62)",
        "(line 521,col 9)-(line 521,col 25)",
        "(line 522,col 9)-(line 522,col 27)",
        "(line 523,col 9)-(line 523,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtilsTest.testJavaAwtHeadless()",
      "begin_line": 526,
      "end_line": 543,
      "comment": "",
      "child_ranges": [
        "(line 527,col 9)-(line 527,col 70)",
        "(line 528,col 9)-(line 528,col 77)",
        "(line 529,col 9)-(line 529,col 97)",
        "(line 530,col 9)-(line 530,col 54)",
        "(line 531,col 9)-(line 541,col 9)",
        "(line 542,col 9)-(line 542,col 91)"
      ]
    }
  ]
}