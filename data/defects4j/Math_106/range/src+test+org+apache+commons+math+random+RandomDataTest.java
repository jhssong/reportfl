{
  "filepath": "/tmp/Math-106b/src/test/org/apache/commons/math/random/RandomDataTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RandomDataTest",
      "is_interface": false,
      "parent_types": [
        "RetryTestCase"
      ],
      "begin_line": 35,
      "end_line": 592,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.RandomDataTest.RandomDataTest(java.lang.String)",
      "begin_line": 37,
      "end_line": 40,
      "comment": "",
      "child_ranges": [
        "(line 38,col 9)-(line 38,col 20)",
        "(line 39,col 9)-(line 39,col 42)"
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
        "tolerance"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hex"
      ],
      "begin_line": 46,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "randomData"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testStatistic"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.setUp()",
      "begin_line": 51,
      "end_line": 52,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.suite()",
      "begin_line": 54,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 62)",
        "(line 56,col 9)-(line 56,col 42)",
        "(line 57,col 9)-(line 57,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextInt()",
      "begin_line": 61,
      "end_line": 85,
      "comment": " test dispersion and failure modes for nextInt() ",
      "child_ranges": [
        "(line 62,col 9)-(line 67,col 9)",
        "(line 68,col 9)-(line 68,col 41)",
        "(line 69,col 9)-(line 69,col 22)",
        "(line 70,col 9)-(line 74,col 9)",
        "(line 75,col 9)-(line 75,col 38)",
        "(line 76,col 9)-(line 78,col 9)",
        "(line 83,col 9)-(line 84,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextLong()",
      "begin_line": 88,
      "end_line": 112,
      "comment": " test dispersion and failure modes for nextLong() ",
      "child_ranges": [
        "(line 89,col 8)-(line 94,col 9)",
        "(line 95,col 8)-(line 95,col 40)",
        "(line 96,col 8)-(line 96,col 22)",
        "(line 97,col 9)-(line 101,col 9)",
        "(line 102,col 9)-(line 102,col 38)",
        "(line 103,col 9)-(line 105,col 9)",
        "(line 110,col 9)-(line 111,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextSecureLong()",
      "begin_line": 115,
      "end_line": 139,
      "comment": " test dispersion and failure modes for nextSecureLong() ",
      "child_ranges": [
        "(line 116,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 122,col 41)",
        "(line 123,col 9)-(line 123,col 23)",
        "(line 124,col 9)-(line 128,col 9)",
        "(line 129,col 9)-(line 129,col 38)",
        "(line 130,col 9)-(line 132,col 9)",
        "(line 137,col 9)-(line 138,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextSecureInt()",
      "begin_line": 142,
      "end_line": 166,
      "comment": " test dispersion and failure modes for nextSecureInt() ",
      "child_ranges": [
        "(line 143,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 149,col 41)",
        "(line 150,col 9)-(line 150,col 22)",
        "(line 151,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 156,col 38)",
        "(line 157,col 9)-(line 159,col 9)",
        "(line 164,col 9)-(line 165,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextPoisson()",
      "begin_line": 174,
      "end_line": 209,
      "comment": " \n     * Make sure that empirical distribution of random Poisson(4)\u0027s \n     * has P(X \u003c\u003d 5) close to actual cumulative Poisson probablity\n     * and that nextPoisson fails when mean is non-positive\n     * TODO: replace with statistical test, adding test stat to TestStatistic\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 180,col 9)",
        "(line 181,col 9)-(line 181,col 38)",
        "(line 182,col 9)-(line 182,col 19)",
        "(line 183,col 9)-(line 189,col 9)",
        "(line 190,col 9)-(line 191,col 70)",
        "(line 192,col 9)-(line 192,col 38)",
        "(line 193,col 9)-(line 194,col 80)",
        "(line 195,col 9)-(line 195,col 57)",
        "(line 196,col 9)-(line 201,col 9)",
        "(line 202,col 9)-(line 207,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextHex()",
      "begin_line": 212,
      "end_line": 263,
      "comment": " test dispersion and failute modes for nextHex() ",
      "child_ranges": [
        "(line 213,col 9)-(line 218,col 9)",
        "(line 219,col 9)-(line 224,col 9)",
        "(line 225,col 9)-(line 225,col 55)",
        "(line 226,col 9)-(line 228,col 9)",
        "(line 229,col 9)-(line 229,col 48)",
        "(line 230,col 9)-(line 232,col 9)",
        "(line 233,col 9)-(line 238,col 9)",
        "(line 239,col 9)-(line 241,col 9)",
        "(line 242,col 9)-(line 242,col 38)",
        "(line 243,col 9)-(line 251,col 9)",
        "(line 252,col 9)-(line 252,col 43)",
        "(line 253,col 9)-(line 253,col 39)",
        "(line 254,col 9)-(line 257,col 9)",
        "(line 261,col 9)-(line 262,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextSecureHex()",
      "begin_line": 266,
      "end_line": 317,
      "comment": " test dispersion and failute modes for nextHex() ",
      "child_ranges": [
        "(line 267,col 9)-(line 272,col 9)",
        "(line 273,col 9)-(line 278,col 9)",
        "(line 279,col 9)-(line 279,col 61)",
        "(line 280,col 9)-(line 282,col 9)",
        "(line 283,col 9)-(line 283,col 54)",
        "(line 284,col 9)-(line 286,col 9)",
        "(line 287,col 9)-(line 292,col 9)",
        "(line 293,col 9)-(line 295,col 9)",
        "(line 296,col 9)-(line 296,col 38)",
        "(line 297,col 9)-(line 305,col 9)",
        "(line 306,col 9)-(line 306,col 43)",
        "(line 307,col 9)-(line 307,col 39)",
        "(line 308,col 9)-(line 311,col 9)",
        "(line 315,col 9)-(line 316,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextUniform()",
      "begin_line": 320,
      "end_line": 355,
      "comment": " test failure modes and dispersion of nextUniform() ",
      "child_ranges": [
        "(line 321,col 9)-(line 326,col 9)",
        "(line 327,col 9)-(line 332,col 9)",
        "(line 333,col 9)-(line 333,col 38)",
        "(line 334,col 9)-(line 334,col 32)",
        "(line 335,col 9)-(line 335,col 27)",
        "(line 336,col 9)-(line 336,col 27)",
        "(line 337,col 9)-(line 337,col 45)",
        "(line 338,col 9)-(line 338,col 26)",
        "(line 339,col 9)-(line 349,col 9)",
        "(line 353,col 9)-(line 354,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextGaussian()",
      "begin_line": 358,
      "end_line": 376,
      "comment": " test failure modes and distribution of nextGaussian() ",
      "child_ranges": [
        "(line 359,col 9)-(line 364,col 9)",
        "(line 365,col 9)-(line 365,col 62)",
        "(line 366,col 9)-(line 368,col 9)",
        "(line 369,col 9)-(line 369,col 34)",
        "(line 370,col 9)-(line 370,col 44)",
        "(line 371,col 9)-(line 371,col 37)",
        "(line 375,col 9)-(line 375,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextExponential()",
      "begin_line": 379,
      "end_line": 400,
      "comment": " test failure modes and distribution of nextExponential() ",
      "child_ranges": [
        "(line 380,col 9)-(line 385,col 9)",
        "(line 386,col 9)-(line 386,col 70)",
        "(line 387,col 9)-(line 387,col 25)",
        "(line 388,col 9)-(line 388,col 21)",
        "(line 389,col 9)-(line 393,col 9)",
        "(line 398,col 9)-(line 399,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testConfig()",
      "begin_line": 403,
      "end_line": 460,
      "comment": " test reseeding, algorithm/provider games ",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 32)",
        "(line 406,col 9)-(line 406,col 47)",
        "(line 407,col 9)-(line 407,col 28)",
        "(line 408,col 9)-(line 409,col 64)",
        "(line 410,col 9)-(line 410,col 32)",
        "(line 411,col 9)-(line 411,col 72)",
        "(line 412,col 9)-(line 412,col 38)",
        "(line 413,col 9)-(line 413,col 56)",
        "(line 414,col 9)-(line 414,col 34)",
        "(line 415,col 9)-(line 416,col 61)",
        "(line 417,col 9)-(line 417,col 38)",
        "(line 418,col 9)-(line 419,col 61)",
        "(line 424,col 9)-(line 428,col 9)",
        "(line 429,col 9)-(line 430,col 61)",
        "(line 431,col 9)-(line 438,col 9)",
        "(line 440,col 9)-(line 445,col 9)",
        "(line 448,col 9)-(line 448,col 49)",
        "(line 449,col 9)-(line 449,col 23)",
        "(line 450,col 9)-(line 450,col 38)",
        "(line 451,col 9)-(line 451,col 50)",
        "(line 452,col 9)-(line 452,col 31)",
        "(line 453,col 9)-(line 453,col 38)",
        "(line 454,col 9)-(line 454,col 34)",
        "(line 455,col 9)-(line 455,col 20)",
        "(line 456,col 9)-(line 456,col 31)",
        "(line 457,col 9)-(line 457,col 35)",
        "(line 458,col 9)-(line 458,col 27)",
        "(line 459,col 9)-(line 459,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextSample()",
      "begin_line": 463,
      "end_line": 518,
      "comment": " tests for nextSample() sampling from Collection ",
      "child_ranges": [
        "(line 464,col 8)-(line 465,col 75)",
        "(line 466,col 8)-(line 466,col 47)",
        "(line 467,col 8)-(line 467,col 69)",
        "(line 469,col 8)-(line 469,col 36)",
        "(line 470,col 8)-(line 472,col 8)",
        "(line 474,col 8)-(line 474,col 38)",
        "(line 475,col 8)-(line 480,col 8)",
        "(line 482,col 8)-(line 485,col 8)",
        "(line 490,col 9)-(line 491,col 64)",
        "(line 494,col 8)-(line 494,col 34)",
        "(line 495,col 8)-(line 495,col 21)",
        "(line 496,col 8)-(line 496,col 50)",
        "(line 497,col 8)-(line 497,col 42)",
        "(line 498,col 8)-(line 500,col 8)",
        "(line 503,col 8)-(line 508,col 8)",
        "(line 511,col 8)-(line 517,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.findSample(java.lang.Object[], java.lang.Object[])",
      "begin_line": 520,
      "end_line": 534,
      "comment": "",
      "child_ranges": [
        "(line 521,col 9)-(line 521,col 24)",
        "(line 522,col 9)-(line 531,col 9)",
        "(line 532,col 9)-(line 532,col 67)",
        "(line 533,col 9)-(line 533,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextPermutation()",
      "begin_line": 537,
      "end_line": 574,
      "comment": " tests for nextPermutation ",
      "child_ranges": [
        "(line 538,col 9)-(line 538,col 70)",
        "(line 539,col 9)-(line 539,col 40)",
        "(line 540,col 9)-(line 540,col 54)",
        "(line 542,col 9)-(line 545,col 9)",
        "(line 550,col 9)-(line 551,col 68)",
        "(line 554,col 9)-(line 554,col 53)",
        "(line 555,col 9)-(line 573,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.findPerm(int[][], int[])",
      "begin_line": 576,
      "end_line": 591,
      "comment": "",
      "child_ranges": [
        "(line 577,col 9)-(line 577,col 24)",
        "(line 578,col 9)-(line 588,col 9)",
        "(line 589,col 9)-(line 589,col 38)",
        "(line 590,col 9)-(line 590,col 18)"
      ]
    }
  ]
}