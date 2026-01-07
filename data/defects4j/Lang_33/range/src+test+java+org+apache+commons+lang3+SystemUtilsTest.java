{
  "filepath": "/tmp/Lang-33b/src/test/java/org/apache/commons/lang3/SystemUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SystemUtilsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 40,
      "end_line": 525,
      "comment": "\n * Unit tests {@link org.apache.commons.lang3.SystemUtils}.\n * \n * Only limited testing can be performed.\n * \n * @author Apache Software Foundation\n * @author Tetsuya Kaneuchi\n * @author Gary D. Gregory\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VERSION"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": "-----------------------------------------------------------------------"
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VERSION_TRIMMED"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "OS_NAME"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "OS_VERSION"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.SystemUtilsTest.SystemUtilsTest(java.lang.String)",
      "begin_line": 53,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtilsTest.getJavaVersionAsFloat()",
      "begin_line": 71,
      "end_line": 84,
      "comment": "\n     * \u003cp\u003eGets the Java version number as a \u003ccode\u003efloat\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eExample return values:\u003c/p\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003e\u003ccode\u003e1.2f\u003c/code\u003e for JDK 1.2\n     *  \u003cli\u003e\u003ccode\u003e1.31f\u003c/code\u003e for JDK 1.3.1\n     * \u003c/ul\u003e\n     * \n     * \u003cp\u003ePatch releases are not reported.\n     * Zero is returned if {@link #JAVA_VERSION_TRIMMED} is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @return the version, for example 1.31f for JDK 1.3.1\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 74,col 9)",
        "(line 75,col 9)-(line 75,col 58)",
        "(line 76,col 9)-(line 78,col 9)",
        "(line 79,col 9)-(line 83,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtilsTest.getJavaVersionAsInt()",
      "begin_line": 100,
      "end_line": 116,
      "comment": "\n     * \u003cp\u003eGets the Java version number as an \u003ccode\u003eint\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eExample return values:\u003c/p\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003e\u003ccode\u003e120\u003c/code\u003e for JDK 1.2\n     *  \u003cli\u003e\u003ccode\u003e131\u003c/code\u003e for JDK 1.3.1\n     * \u003c/ul\u003e\n     * \n     * \u003cp\u003ePatch releases are not reported.\n     * Zero is returned if {@link #JAVA_VERSION_TRIMMED} is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @return the version, for example 131 for JDK 1.3.1\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 104,col 58)",
        "(line 105,col 9)-(line 105,col 57)",
        "(line 106,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 115,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtilsTest.getJavaVersionTrimmed()",
      "begin_line": 123,
      "end_line": 133,
      "comment": "\n     * Trims the text of the java version to start with numbers.\n     * \n     * @return the trimmed java version\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 131,col 9)",
        "(line 132,col 9)-(line 132,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtilsTest.getJavaVersionMatches(java.lang.String)",
      "begin_line": 142,
      "end_line": 147,
      "comment": "\n     * Decides if the java version matches.\n     * \n     * @param versionPrefix\n     *                  the prefix for the java version\n     * @return true if matches, or false if not or can\u0027t determine\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 145,col 9)",
        "(line 146,col 9)-(line 146,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtilsTest.getOSMatches(java.lang.String)",
      "begin_line": 156,
      "end_line": 161,
      "comment": "\n     * Decides if the operating system matches.\n     * \n     * @param osNamePrefix\n     *                  the prefix for the os name\n     * @return true if matches, or false if not or can\u0027t determine\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 160,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtilsTest.getOSMatches(java.lang.String, java.lang.String)",
      "begin_line": 172,
      "end_line": 177,
      "comment": "\n     * Decides if the operating system matches.\n     * \n     * @param osNamePrefix\n     *                  the prefix for the os name\n     * @param osVersionPrefix\n     *                  the prefix for the version\n     * @return true if matches, or false if not or can\u0027t determine\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 176,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtilsTest.testConstructor()",
      "begin_line": 180,
      "end_line": 187,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 41)",
        "(line 182,col 9)-(line 182,col 76)",
        "(line 183,col 9)-(line 183,col 37)",
        "(line 184,col 9)-(line 184,col 70)",
        "(line 185,col 9)-(line 185,col 80)",
        "(line 186,col 9)-(line 186,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtilsTest.testGetJavaHome()",
      "begin_line": 192,
      "end_line": 196,
      "comment": "\n     * Assums no security manager exists.\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 45)",
        "(line 194,col 9)-(line 194,col 34)",
        "(line 195,col 9)-(line 195,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtilsTest.testGetJavaIoTmpDir()",
      "begin_line": 201,
      "end_line": 205,
      "comment": "\n     * Assums no security manager exists.\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 49)",
        "(line 203,col 9)-(line 203,col 34)",
        "(line 204,col 9)-(line 204,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtilsTest.testGetUserDir()",
      "begin_line": 210,
      "end_line": 214,
      "comment": "\n     * Assums no security manager exists.\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 44)",
        "(line 212,col 9)-(line 212,col 34)",
        "(line 213,col 9)-(line 213,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtilsTest.testGetUserHome()",
      "begin_line": 219,
      "end_line": 223,
      "comment": "\n     * Assums no security manager exists.\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 45)",
        "(line 221,col 9)-(line 221,col 34)",
        "(line 222,col 9)-(line 222,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtilsTest.testIS_JAVA()",
      "begin_line": 225,
      "end_line": 279,
      "comment": "",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 64)",
        "(line 227,col 9)-(line 278,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtilsTest.testIS_OS()",
      "begin_line": 281,
      "end_line": 315,
      "comment": "",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 54)",
        "(line 283,col 9)-(line 314,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtilsTest.testJavaVersionAsFloat()",
      "begin_line": 318,
      "end_line": 352,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 28)",
        "(line 320,col 9)-(line 320,col 55)",
        "(line 321,col 9)-(line 321,col 61)",
        "(line 322,col 9)-(line 322,col 29)",
        "(line 323,col 9)-(line 323,col 55)",
        "(line 324,col 9)-(line 324,col 63)",
        "(line 325,col 9)-(line 325,col 29)",
        "(line 326,col 9)-(line 326,col 55)",
        "(line 327,col 9)-(line 327,col 63)",
        "(line 328,col 9)-(line 328,col 31)",
        "(line 329,col 9)-(line 329,col 55)",
        "(line 330,col 9)-(line 330,col 63)",
        "(line 331,col 9)-(line 331,col 31)",
        "(line 332,col 9)-(line 332,col 55)",
        "(line 333,col 9)-(line 333,col 64)",
        "(line 334,col 9)-(line 334,col 31)",
        "(line 335,col 9)-(line 335,col 55)",
        "(line 336,col 9)-(line 336,col 63)",
        "(line 337,col 9)-(line 337,col 31)",
        "(line 338,col 9)-(line 338,col 55)",
        "(line 339,col 9)-(line 339,col 64)",
        "(line 340,col 9)-(line 340,col 31)",
        "(line 341,col 9)-(line 341,col 55)",
        "(line 342,col 9)-(line 342,col 63)",
        "(line 343,col 9)-(line 343,col 31)",
        "(line 344,col 9)-(line 344,col 55)",
        "(line 345,col 9)-(line 345,col 63)",
        "(line 346,col 9)-(line 346,col 38)",
        "(line 347,col 9)-(line 347,col 55)",
        "(line 348,col 9)-(line 348,col 64)",
        "(line 349,col 9)-(line 349,col 35)",
        "(line 350,col 9)-(line 350,col 55)",
        "(line 351,col 9)-(line 351,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtilsTest.testJavaVersionAsInt()",
      "begin_line": 354,
      "end_line": 388,
      "comment": "",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 28)",
        "(line 356,col 9)-(line 356,col 55)",
        "(line 357,col 9)-(line 357,col 47)",
        "(line 358,col 9)-(line 358,col 29)",
        "(line 359,col 9)-(line 359,col 55)",
        "(line 360,col 9)-(line 360,col 49)",
        "(line 361,col 9)-(line 361,col 29)",
        "(line 362,col 9)-(line 362,col 55)",
        "(line 363,col 9)-(line 363,col 49)",
        "(line 364,col 9)-(line 364,col 31)",
        "(line 365,col 9)-(line 365,col 55)",
        "(line 366,col 9)-(line 366,col 49)",
        "(line 367,col 9)-(line 367,col 31)",
        "(line 368,col 9)-(line 368,col 55)",
        "(line 369,col 9)-(line 369,col 49)",
        "(line 370,col 9)-(line 370,col 31)",
        "(line 371,col 9)-(line 371,col 55)",
        "(line 372,col 9)-(line 372,col 49)",
        "(line 373,col 9)-(line 373,col 31)",
        "(line 374,col 9)-(line 374,col 55)",
        "(line 375,col 9)-(line 375,col 49)",
        "(line 376,col 9)-(line 376,col 31)",
        "(line 377,col 9)-(line 377,col 55)",
        "(line 378,col 9)-(line 378,col 49)",
        "(line 379,col 9)-(line 379,col 31)",
        "(line 380,col 9)-(line 380,col 55)",
        "(line 381,col 9)-(line 381,col 49)",
        "(line 382,col 9)-(line 382,col 38)",
        "(line 383,col 9)-(line 383,col 55)",
        "(line 384,col 9)-(line 384,col 49)",
        "(line 385,col 9)-(line 385,col 35)",
        "(line 386,col 9)-(line 386,col 55)",
        "(line 387,col 9)-(line 387,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtilsTest.testJavaVersionAtLeastFloat()",
      "begin_line": 390,
      "end_line": 397,
      "comment": "",
      "child_ranges": [
        "(line 391,col 9)-(line 391,col 55)",
        "(line 392,col 9)-(line 392,col 70)",
        "(line 393,col 9)-(line 393,col 24)",
        "(line 394,col 9)-(line 394,col 70)",
        "(line 395,col 9)-(line 395,col 24)",
        "(line 396,col 9)-(line 396,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtilsTest.testJavaVersionAtLeastInt()",
      "begin_line": 399,
      "end_line": 406,
      "comment": "",
      "child_ranges": [
        "(line 400,col 9)-(line 400,col 51)",
        "(line 401,col 9)-(line 401,col 70)",
        "(line 402,col 9)-(line 402,col 22)",
        "(line 403,col 9)-(line 403,col 70)",
        "(line 404,col 9)-(line 404,col 22)",
        "(line 405,col 9)-(line 405,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtilsTest.testJavaVersionMatches()",
      "begin_line": 409,
      "end_line": 473,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 410,col 9)-(line 410,col 28)",
        "(line 411,col 9)-(line 411,col 55)",
        "(line 412,col 9)-(line 412,col 58)",
        "(line 413,col 9)-(line 413,col 58)",
        "(line 414,col 9)-(line 414,col 58)",
        "(line 415,col 9)-(line 415,col 58)",
        "(line 416,col 9)-(line 416,col 58)",
        "(line 417,col 9)-(line 417,col 29)",
        "(line 418,col 9)-(line 418,col 55)",
        "(line 419,col 9)-(line 419,col 57)",
        "(line 420,col 9)-(line 420,col 58)",
        "(line 421,col 9)-(line 421,col 58)",
        "(line 422,col 9)-(line 422,col 58)",
        "(line 423,col 9)-(line 423,col 58)",
        "(line 424,col 9)-(line 424,col 29)",
        "(line 425,col 9)-(line 425,col 55)",
        "(line 426,col 9)-(line 426,col 58)",
        "(line 427,col 9)-(line 427,col 57)",
        "(line 428,col 9)-(line 428,col 58)",
        "(line 429,col 9)-(line 429,col 58)",
        "(line 430,col 9)-(line 430,col 58)",
        "(line 431,col 9)-(line 431,col 31)",
        "(line 432,col 9)-(line 432,col 55)",
        "(line 433,col 9)-(line 433,col 58)",
        "(line 434,col 9)-(line 434,col 58)",
        "(line 435,col 9)-(line 435,col 57)",
        "(line 436,col 9)-(line 436,col 58)",
        "(line 437,col 9)-(line 437,col 58)",
        "(line 438,col 9)-(line 438,col 31)",
        "(line 439,col 9)-(line 439,col 55)",
        "(line 440,col 9)-(line 440,col 58)",
        "(line 441,col 9)-(line 441,col 58)",
        "(line 442,col 9)-(line 442,col 57)",
        "(line 443,col 9)-(line 443,col 58)",
        "(line 444,col 9)-(line 444,col 58)",
        "(line 445,col 9)-(line 445,col 31)",
        "(line 446,col 9)-(line 446,col 55)",
        "(line 447,col 9)-(line 447,col 58)",
        "(line 448,col 9)-(line 448,col 58)",
        "(line 449,col 9)-(line 449,col 58)",
        "(line 450,col 9)-(line 450,col 57)",
        "(line 451,col 9)-(line 451,col 58)",
        "(line 452,col 9)-(line 452,col 31)",
        "(line 453,col 9)-(line 453,col 55)",
        "(line 454,col 9)-(line 454,col 58)",
        "(line 455,col 9)-(line 455,col 58)",
        "(line 456,col 9)-(line 456,col 58)",
        "(line 457,col 9)-(line 457,col 57)",
        "(line 458,col 9)-(line 458,col 58)",
        "(line 459,col 9)-(line 459,col 31)",
        "(line 460,col 9)-(line 460,col 55)",
        "(line 461,col 9)-(line 461,col 58)",
        "(line 462,col 9)-(line 462,col 58)",
        "(line 463,col 9)-(line 463,col 58)",
        "(line 464,col 9)-(line 464,col 58)",
        "(line 465,col 9)-(line 465,col 57)",
        "(line 466,col 9)-(line 466,col 31)",
        "(line 467,col 9)-(line 467,col 55)",
        "(line 468,col 9)-(line 468,col 58)",
        "(line 469,col 9)-(line 469,col 58)",
        "(line 470,col 9)-(line 470,col 58)",
        "(line 471,col 9)-(line 471,col 58)",
        "(line 472,col 9)-(line 472,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtilsTest.testOSMatches()",
      "begin_line": 475,
      "end_line": 484,
      "comment": "",
      "child_ranges": [
        "(line 476,col 9)-(line 476,col 23)",
        "(line 477,col 9)-(line 477,col 53)",
        "(line 478,col 9)-(line 478,col 31)",
        "(line 479,col 9)-(line 479,col 52)",
        "(line 480,col 9)-(line 480,col 31)",
        "(line 481,col 9)-(line 481,col 52)",
        "(line 482,col 9)-(line 482,col 25)",
        "(line 483,col 9)-(line 483,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtilsTest.testOSMatches2()",
      "begin_line": 486,
      "end_line": 505,
      "comment": "",
      "child_ranges": [
        "(line 487,col 9)-(line 487,col 23)",
        "(line 488,col 9)-(line 488,col 26)",
        "(line 489,col 9)-(line 489,col 62)",
        "(line 490,col 9)-(line 490,col 31)",
        "(line 491,col 9)-(line 491,col 27)",
        "(line 492,col 9)-(line 492,col 62)",
        "(line 493,col 9)-(line 493,col 31)",
        "(line 494,col 9)-(line 494,col 27)",
        "(line 495,col 9)-(line 495,col 61)",
        "(line 496,col 9)-(line 496,col 31)",
        "(line 497,col 9)-(line 497,col 27)",
        "(line 498,col 9)-(line 498,col 61)",
        "(line 499,col 9)-(line 499,col 31)",
        "(line 500,col 9)-(line 500,col 27)",
        "(line 501,col 9)-(line 501,col 62)",
        "(line 502,col 9)-(line 502,col 25)",
        "(line 503,col 9)-(line 503,col 27)",
        "(line 504,col 9)-(line 504,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtilsTest.testJavaAwtHeadless()",
      "begin_line": 507,
      "end_line": 524,
      "comment": "",
      "child_ranges": [
        "(line 508,col 9)-(line 508,col 70)",
        "(line 509,col 9)-(line 509,col 77)",
        "(line 510,col 9)-(line 510,col 97)",
        "(line 511,col 9)-(line 511,col 54)",
        "(line 512,col 9)-(line 522,col 9)",
        "(line 523,col 9)-(line 523,col 91)"
      ]
    }
  ]
}