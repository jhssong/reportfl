{
  "filepath": "/tmp/Math-85b/src/test/org/apache/commons/math/random/RandomDataTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RandomDataTest",
      "is_interface": false,
      "parent_types": [
        "RetryTestCase"
      ],
      "begin_line": 35,
      "end_line": 630,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.RandomDataTest.RandomDataTest(java.lang.String)",
      "begin_line": 37,
      "end_line": 40,
      "comment": "",
      "child_ranges": [
        "(line 38,col 3)-(line 38,col 14)",
        "(line 39,col 3)-(line 39,col 36)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "smallSampleSize"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "expected"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "largeSampleSize"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hex"
      ],
      "begin_line": 45,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "randomData"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testStatistic"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.suite()",
      "begin_line": 50,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 51,col 3)-(line 51,col 56)",
        "(line 52,col 3)-(line 52,col 36)",
        "(line 53,col 3)-(line 53,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextIntExtremeValues()",
      "begin_line": 56,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 57,col 3)-(line 57,col 67)",
        "(line 58,col 3)-(line 58,col 67)",
        "(line 59,col 3)-(line 59,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextLongExtremeValues()",
      "begin_line": 62,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 63,col 3)-(line 63,col 63)",
        "(line 64,col 3)-(line 64,col 63)",
        "(line 65,col 3)-(line 65,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextInt()",
      "begin_line": 69,
      "end_line": 94,
      "comment": " test dispersion and failure modes for nextInt() ",
      "child_ranges": [
        "(line 70,col 3)-(line 75,col 3)",
        "(line 76,col 3)-(line 76,col 35)",
        "(line 77,col 3)-(line 77,col 16)",
        "(line 78,col 3)-(line 82,col 3)",
        "(line 83,col 3)-(line 83,col 32)",
        "(line 84,col 3)-(line 86,col 3)",
        "(line 92,col 3)-(line 93,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextLong()",
      "begin_line": 97,
      "end_line": 122,
      "comment": " test dispersion and failure modes for nextLong() ",
      "child_ranges": [
        "(line 98,col 3)-(line 103,col 3)",
        "(line 104,col 3)-(line 104,col 35)",
        "(line 105,col 3)-(line 105,col 17)",
        "(line 106,col 3)-(line 110,col 3)",
        "(line 111,col 3)-(line 111,col 32)",
        "(line 112,col 3)-(line 114,col 3)",
        "(line 120,col 3)-(line 121,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextSecureLong()",
      "begin_line": 125,
      "end_line": 150,
      "comment": " test dispersion and failure modes for nextSecureLong() ",
      "child_ranges": [
        "(line 126,col 3)-(line 131,col 3)",
        "(line 132,col 3)-(line 132,col 35)",
        "(line 133,col 3)-(line 133,col 17)",
        "(line 134,col 3)-(line 138,col 3)",
        "(line 139,col 3)-(line 139,col 32)",
        "(line 140,col 3)-(line 142,col 3)",
        "(line 148,col 3)-(line 149,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextSecureInt()",
      "begin_line": 153,
      "end_line": 178,
      "comment": " test dispersion and failure modes for nextSecureInt() ",
      "child_ranges": [
        "(line 154,col 3)-(line 159,col 3)",
        "(line 160,col 3)-(line 160,col 35)",
        "(line 161,col 3)-(line 161,col 16)",
        "(line 162,col 3)-(line 166,col 3)",
        "(line 167,col 3)-(line 167,col 32)",
        "(line 168,col 3)-(line 170,col 3)",
        "(line 176,col 3)-(line 177,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextPoisson()",
      "begin_line": 186,
      "end_line": 220,
      "comment": "\n\t * Make sure that empirical distribution of random Poisson(4)\u0027s has P(X \u003c\u003d\n\t * 5) close to actual cumulative Poisson probablity and that nextPoisson\n\t * fails when mean is non-positive TODO: replace with statistical test,\n\t * adding test stat to TestStatistic\n\t ",
      "child_ranges": [
        "(line 187,col 3)-(line 192,col 3)",
        "(line 193,col 3)-(line 193,col 32)",
        "(line 194,col 3)-(line 200,col 3)",
        "(line 201,col 3)-(line 202,col 52)",
        "(line 203,col 3)-(line 203,col 32)",
        "(line 204,col 3)-(line 205,col 44)",
        "(line 206,col 3)-(line 206,col 54)",
        "(line 207,col 3)-(line 212,col 3)",
        "(line 213,col 3)-(line 218,col 3)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextPoissonLargeMean()",
      "begin_line": 222,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 223,col 3)-(line 226,col 3)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextHex()",
      "begin_line": 230,
      "end_line": 282,
      "comment": " test dispersion and failute modes for nextHex() ",
      "child_ranges": [
        "(line 231,col 3)-(line 236,col 3)",
        "(line 237,col 3)-(line 242,col 3)",
        "(line 243,col 3)-(line 243,col 49)",
        "(line 244,col 3)-(line 246,col 3)",
        "(line 247,col 3)-(line 247,col 42)",
        "(line 248,col 3)-(line 250,col 3)",
        "(line 251,col 3)-(line 256,col 3)",
        "(line 257,col 3)-(line 259,col 3)",
        "(line 260,col 3)-(line 260,col 32)",
        "(line 261,col 3)-(line 269,col 3)",
        "(line 270,col 3)-(line 270,col 37)",
        "(line 271,col 3)-(line 271,col 33)",
        "(line 272,col 3)-(line 275,col 3)",
        "(line 280,col 3)-(line 281,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextSecureHex()",
      "begin_line": 285,
      "end_line": 337,
      "comment": " test dispersion and failute modes for nextHex() ",
      "child_ranges": [
        "(line 286,col 3)-(line 291,col 3)",
        "(line 292,col 3)-(line 297,col 3)",
        "(line 298,col 3)-(line 298,col 55)",
        "(line 299,col 3)-(line 301,col 3)",
        "(line 302,col 3)-(line 302,col 48)",
        "(line 303,col 3)-(line 305,col 3)",
        "(line 306,col 3)-(line 311,col 3)",
        "(line 312,col 3)-(line 314,col 3)",
        "(line 315,col 3)-(line 315,col 32)",
        "(line 316,col 3)-(line 324,col 3)",
        "(line 325,col 3)-(line 325,col 37)",
        "(line 326,col 3)-(line 326,col 33)",
        "(line 327,col 3)-(line 330,col 3)",
        "(line 335,col 3)-(line 336,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextUniform()",
      "begin_line": 340,
      "end_line": 376,
      "comment": " test failure modes and dispersion of nextUniform() ",
      "child_ranges": [
        "(line 341,col 3)-(line 346,col 3)",
        "(line 347,col 3)-(line 352,col 3)",
        "(line 353,col 3)-(line 353,col 35)",
        "(line 354,col 3)-(line 354,col 29)",
        "(line 355,col 3)-(line 355,col 21)",
        "(line 356,col 3)-(line 356,col 21)",
        "(line 357,col 3)-(line 357,col 41)",
        "(line 358,col 3)-(line 358,col 20)",
        "(line 359,col 3)-(line 369,col 3)",
        "(line 374,col 3)-(line 375,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextUniformExclusiveEndpoints()",
      "begin_line": 379,
      "end_line": 384,
      "comment": " test exclusive endpoints of nextUniform *",
      "child_ranges": [
        "(line 380,col 3)-(line 383,col 3)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextGaussian()",
      "begin_line": 387,
      "end_line": 406,
      "comment": " test failure modes and distribution of nextGaussian() ",
      "child_ranges": [
        "(line 388,col 3)-(line 393,col 3)",
        "(line 394,col 3)-(line 394,col 48)",
        "(line 395,col 3)-(line 397,col 3)",
        "(line 398,col 3)-(line 398,col 28)",
        "(line 399,col 3)-(line 399,col 38)",
        "(line 400,col 3)-(line 400,col 22)",
        "(line 405,col 3)-(line 405,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextExponential()",
      "begin_line": 409,
      "end_line": 432,
      "comment": " test failure modes and distribution of nextExponential() ",
      "child_ranges": [
        "(line 410,col 3)-(line 415,col 3)",
        "(line 416,col 3)-(line 416,col 66)",
        "(line 417,col 3)-(line 417,col 19)",
        "(line 418,col 3)-(line 418,col 15)",
        "(line 419,col 3)-(line 424,col 3)",
        "(line 430,col 3)-(line 431,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testConfig()",
      "begin_line": 435,
      "end_line": 481,
      "comment": " test reseeding, algorithm/provider games ",
      "child_ranges": [
        "(line 436,col 3)-(line 436,col 26)",
        "(line 437,col 3)-(line 437,col 42)",
        "(line 438,col 3)-(line 438,col 22)",
        "(line 439,col 3)-(line 440,col 53)",
        "(line 441,col 3)-(line 441,col 26)",
        "(line 442,col 3)-(line 442,col 70)",
        "(line 443,col 3)-(line 443,col 32)",
        "(line 444,col 3)-(line 444,col 50)",
        "(line 445,col 3)-(line 445,col 28)",
        "(line 446,col 3)-(line 447,col 31)",
        "(line 448,col 3)-(line 448,col 32)",
        "(line 449,col 3)-(line 450,col 49)",
        "(line 469,col 3)-(line 469,col 43)",
        "(line 470,col 3)-(line 470,col 17)",
        "(line 471,col 3)-(line 471,col 20)",
        "(line 472,col 3)-(line 472,col 44)",
        "(line 473,col 3)-(line 473,col 25)",
        "(line 474,col 3)-(line 474,col 27)",
        "(line 475,col 3)-(line 475,col 28)",
        "(line 476,col 3)-(line 476,col 14)",
        "(line 477,col 3)-(line 477,col 20)",
        "(line 478,col 3)-(line 478,col 29)",
        "(line 479,col 3)-(line 479,col 21)",
        "(line 480,col 3)-(line 480,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextSample()",
      "begin_line": 484,
      "end_line": 541,
      "comment": " tests for nextSample() sampling from Collection ",
      "child_ranges": [
        "(line 485,col 3)-(line 487,col 47)",
        "(line 488,col 3)-(line 488,col 53)",
        "(line 489,col 3)-(line 489,col 75)",
        "(line 491,col 3)-(line 491,col 47)",
        "(line 492,col 3)-(line 494,col 3)",
        "(line 496,col 3)-(line 496,col 33)",
        "(line 497,col 3)-(line 502,col 3)",
        "(line 504,col 3)-(line 507,col 3)",
        "(line 513,col 3)-(line 514,col 57)",
        "(line 517,col 3)-(line 517,col 45)",
        "(line 518,col 3)-(line 518,col 16)",
        "(line 519,col 3)-(line 519,col 46)",
        "(line 520,col 3)-(line 520,col 37)",
        "(line 521,col 3)-(line 523,col 3)",
        "(line 526,col 3)-(line 531,col 3)",
        "(line 534,col 3)-(line 540,col 3)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.findSample(java.lang.Object[], java.lang.Object[])",
      "begin_line": 543,
      "end_line": 557,
      "comment": "",
      "child_ranges": [
        "(line 545,col 3)-(line 554,col 3)",
        "(line 555,col 3)-(line 555,col 61)",
        "(line 556,col 3)-(line 556,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextPermutation()",
      "begin_line": 560,
      "end_line": 608,
      "comment": " tests for nextPermutation ",
      "child_ranges": [
        "(line 561,col 3)-(line 562,col 31)",
        "(line 563,col 3)-(line 563,col 41)",
        "(line 564,col 3)-(line 564,col 55)",
        "(line 566,col 3)-(line 569,col 3)",
        "(line 575,col 3)-(line 576,col 57)",
        "(line 579,col 3)-(line 579,col 48)",
        "(line 580,col 3)-(line 607,col 3)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.findPerm(int[][], int[])",
      "begin_line": 615,
      "end_line": 629,
      "comment": "",
      "child_ranges": [
        "(line 616,col 3)-(line 626,col 3)",
        "(line 627,col 3)-(line 627,col 32)",
        "(line 628,col 3)-(line 628,col 12)"
      ]
    }
  ]
}