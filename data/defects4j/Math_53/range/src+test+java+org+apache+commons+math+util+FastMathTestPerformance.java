{
  "filepath": "/tmp/Math-53b/src/test/java/org/apache/commons/math/util/FastMathTestPerformance.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastMathTestPerformance",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 33,
      "end_line": 539,
      "comment": "\n * Performance tests for FastMath.\n * Not enabled by default, as the class does not end in Test.\n * \n * Invoke by running\u003cbr/\u003e\n * {@code mvn test -Dtest\u003dFastMathTestPerformance}\u003cbr/\u003e\n * or by running\u003cbr/\u003e\n * {@code mvn test -Dtest\u003dFastMathTestPerformance -DargLine\u003d\"-DtestRuns\u003d1234 -server\"}\u003cbr/\u003e\n "
    },
    {
      "type": "field",
      "varNames": [
        "RUNS"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "F1"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FMT_HDR"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Header format"
    },
    {
      "type": "field",
      "varNames": [
        "FMT_DTL"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Detail format"
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.header()",
      "begin_line": 42,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 44,col 9)-(line 50,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.report(java.lang.String, long, long, long)",
      "begin_line": 53,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 39)",
        "(line 55,col 9)-(line 60,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testLog()",
      "begin_line": 63,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 21)",
        "(line 66,col 9)-(line 66,col 38)",
        "(line 67,col 9)-(line 68,col 62)",
        "(line 69,col 9)-(line 69,col 51)",
        "(line 71,col 9)-(line 71,col 14)",
        "(line 72,col 9)-(line 72,col 33)",
        "(line 73,col 9)-(line 74,col 60)",
        "(line 75,col 9)-(line 75,col 49)",
        "(line 77,col 9)-(line 77,col 14)",
        "(line 78,col 9)-(line 78,col 33)",
        "(line 79,col 9)-(line 80,col 56)",
        "(line 81,col 9)-(line 81,col 49)",
        "(line 83,col 9)-(line 83,col 51)",
        "(line 84,col 9)-(line 84,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testLog10()",
      "begin_line": 87,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 21)",
        "(line 90,col 9)-(line 90,col 38)",
        "(line 91,col 9)-(line 92,col 64)",
        "(line 93,col 9)-(line 93,col 51)",
        "(line 95,col 9)-(line 95,col 14)",
        "(line 96,col 9)-(line 96,col 33)",
        "(line 97,col 9)-(line 98,col 62)",
        "(line 99,col 9)-(line 99,col 49)",
        "(line 101,col 9)-(line 101,col 14)",
        "(line 102,col 9)-(line 102,col 33)",
        "(line 103,col 9)-(line 104,col 58)",
        "(line 105,col 9)-(line 105,col 49)",
        "(line 107,col 9)-(line 107,col 53)",
        "(line 108,col 9)-(line 108,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testLog1p()",
      "begin_line": 111,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 21)",
        "(line 114,col 9)-(line 114,col 38)",
        "(line 115,col 9)-(line 116,col 64)",
        "(line 117,col 9)-(line 117,col 51)",
        "(line 119,col 9)-(line 119,col 14)",
        "(line 120,col 9)-(line 120,col 33)",
        "(line 121,col 9)-(line 122,col 62)",
        "(line 123,col 9)-(line 123,col 49)",
        "(line 125,col 9)-(line 125,col 14)",
        "(line 126,col 9)-(line 126,col 33)",
        "(line 127,col 9)-(line 128,col 58)",
        "(line 129,col 9)-(line 129,col 49)",
        "(line 131,col 9)-(line 131,col 53)",
        "(line 132,col 9)-(line 132,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testPow()",
      "begin_line": 135,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 21)",
        "(line 138,col 9)-(line 138,col 38)",
        "(line 139,col 9)-(line 140,col 58)",
        "(line 141,col 9)-(line 141,col 51)",
        "(line 143,col 9)-(line 143,col 14)",
        "(line 144,col 9)-(line 144,col 33)",
        "(line 145,col 9)-(line 146,col 56)",
        "(line 147,col 9)-(line 147,col 49)",
        "(line 149,col 9)-(line 149,col 14)",
        "(line 150,col 9)-(line 150,col 33)",
        "(line 151,col 9)-(line 152,col 52)",
        "(line 153,col 9)-(line 153,col 49)",
        "(line 154,col 9)-(line 154,col 51)",
        "(line 155,col 9)-(line 155,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testExp()",
      "begin_line": 158,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 21)",
        "(line 161,col 9)-(line 161,col 38)",
        "(line 162,col 9)-(line 163,col 40)",
        "(line 164,col 9)-(line 164,col 51)",
        "(line 166,col 9)-(line 166,col 14)",
        "(line 167,col 9)-(line 167,col 33)",
        "(line 168,col 9)-(line 169,col 38)",
        "(line 170,col 9)-(line 170,col 49)",
        "(line 172,col 9)-(line 172,col 14)",
        "(line 173,col 9)-(line 173,col 33)",
        "(line 174,col 9)-(line 175,col 34)",
        "(line 176,col 9)-(line 176,col 49)",
        "(line 178,col 9)-(line 178,col 51)",
        "(line 179,col 9)-(line 179,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testSin()",
      "begin_line": 182,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 21)",
        "(line 185,col 9)-(line 185,col 38)",
        "(line 186,col 9)-(line 187,col 40)",
        "(line 188,col 9)-(line 188,col 51)",
        "(line 190,col 9)-(line 190,col 14)",
        "(line 191,col 9)-(line 191,col 33)",
        "(line 192,col 9)-(line 193,col 38)",
        "(line 194,col 9)-(line 194,col 49)",
        "(line 196,col 9)-(line 196,col 14)",
        "(line 197,col 9)-(line 197,col 33)",
        "(line 198,col 9)-(line 199,col 34)",
        "(line 200,col 9)-(line 200,col 49)",
        "(line 202,col 9)-(line 202,col 51)",
        "(line 203,col 9)-(line 203,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testAsin()",
      "begin_line": 206,
      "end_line": 228,
      "comment": "",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 21)",
        "(line 209,col 9)-(line 209,col 38)",
        "(line 210,col 9)-(line 211,col 49)",
        "(line 212,col 9)-(line 212,col 51)",
        "(line 214,col 9)-(line 214,col 14)",
        "(line 215,col 9)-(line 215,col 33)",
        "(line 216,col 9)-(line 217,col 47)",
        "(line 218,col 9)-(line 218,col 49)",
        "(line 220,col 9)-(line 220,col 14)",
        "(line 221,col 9)-(line 221,col 33)",
        "(line 222,col 9)-(line 223,col 43)",
        "(line 224,col 9)-(line 224,col 49)",
        "(line 226,col 9)-(line 226,col 52)",
        "(line 227,col 9)-(line 227,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testCos()",
      "begin_line": 230,
      "end_line": 252,
      "comment": "",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 21)",
        "(line 233,col 9)-(line 233,col 38)",
        "(line 234,col 9)-(line 235,col 40)",
        "(line 236,col 9)-(line 236,col 51)",
        "(line 238,col 9)-(line 238,col 14)",
        "(line 239,col 9)-(line 239,col 33)",
        "(line 240,col 9)-(line 241,col 38)",
        "(line 242,col 9)-(line 242,col 49)",
        "(line 244,col 9)-(line 244,col 14)",
        "(line 245,col 9)-(line 245,col 33)",
        "(line 246,col 9)-(line 247,col 34)",
        "(line 248,col 9)-(line 248,col 49)",
        "(line 250,col 9)-(line 250,col 51)",
        "(line 251,col 9)-(line 251,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testAcos()",
      "begin_line": 254,
      "end_line": 275,
      "comment": "",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 21)",
        "(line 257,col 9)-(line 257,col 38)",
        "(line 258,col 9)-(line 259,col 49)",
        "(line 260,col 9)-(line 260,col 51)",
        "(line 262,col 9)-(line 262,col 14)",
        "(line 263,col 9)-(line 263,col 33)",
        "(line 264,col 9)-(line 265,col 47)",
        "(line 266,col 9)-(line 266,col 49)",
        "(line 268,col 9)-(line 268,col 14)",
        "(line 269,col 9)-(line 269,col 33)",
        "(line 270,col 9)-(line 271,col 43)",
        "(line 272,col 9)-(line 272,col 49)",
        "(line 273,col 9)-(line 273,col 52)",
        "(line 274,col 9)-(line 274,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testTan()",
      "begin_line": 277,
      "end_line": 299,
      "comment": "",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 21)",
        "(line 280,col 9)-(line 280,col 38)",
        "(line 281,col 9)-(line 282,col 40)",
        "(line 283,col 9)-(line 283,col 51)",
        "(line 285,col 9)-(line 285,col 14)",
        "(line 286,col 9)-(line 286,col 33)",
        "(line 287,col 9)-(line 288,col 38)",
        "(line 289,col 9)-(line 289,col 49)",
        "(line 291,col 9)-(line 291,col 14)",
        "(line 292,col 9)-(line 292,col 33)",
        "(line 293,col 9)-(line 294,col 34)",
        "(line 295,col 9)-(line 295,col 49)",
        "(line 297,col 9)-(line 297,col 51)",
        "(line 298,col 9)-(line 298,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testAtan()",
      "begin_line": 301,
      "end_line": 323,
      "comment": "",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 21)",
        "(line 304,col 9)-(line 304,col 38)",
        "(line 305,col 9)-(line 306,col 41)",
        "(line 307,col 9)-(line 307,col 51)",
        "(line 309,col 9)-(line 309,col 14)",
        "(line 310,col 9)-(line 310,col 33)",
        "(line 311,col 9)-(line 312,col 39)",
        "(line 313,col 9)-(line 313,col 49)",
        "(line 315,col 9)-(line 315,col 14)",
        "(line 316,col 9)-(line 316,col 33)",
        "(line 317,col 9)-(line 318,col 35)",
        "(line 319,col 9)-(line 319,col 49)",
        "(line 321,col 9)-(line 321,col 52)",
        "(line 322,col 9)-(line 322,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testAtan2()",
      "begin_line": 325,
      "end_line": 347,
      "comment": "",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 21)",
        "(line 328,col 9)-(line 328,col 38)",
        "(line 329,col 9)-(line 330,col 50)",
        "(line 331,col 9)-(line 331,col 51)",
        "(line 333,col 9)-(line 333,col 14)",
        "(line 334,col 9)-(line 334,col 33)",
        "(line 335,col 9)-(line 336,col 48)",
        "(line 337,col 9)-(line 337,col 49)",
        "(line 339,col 9)-(line 339,col 14)",
        "(line 340,col 9)-(line 340,col 33)",
        "(line 341,col 9)-(line 342,col 44)",
        "(line 343,col 9)-(line 343,col 49)",
        "(line 345,col 9)-(line 345,col 53)",
        "(line 346,col 9)-(line 346,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testHypot()",
      "begin_line": 349,
      "end_line": 371,
      "comment": "",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 21)",
        "(line 352,col 9)-(line 352,col 38)",
        "(line 353,col 9)-(line 354,col 50)",
        "(line 355,col 9)-(line 355,col 51)",
        "(line 357,col 9)-(line 357,col 14)",
        "(line 358,col 9)-(line 358,col 33)",
        "(line 359,col 9)-(line 360,col 48)",
        "(line 361,col 9)-(line 361,col 49)",
        "(line 363,col 9)-(line 363,col 14)",
        "(line 364,col 9)-(line 364,col 33)",
        "(line 365,col 9)-(line 366,col 44)",
        "(line 367,col 9)-(line 367,col 49)",
        "(line 369,col 9)-(line 369,col 53)",
        "(line 370,col 9)-(line 370,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testCbrt()",
      "begin_line": 373,
      "end_line": 395,
      "comment": "",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 21)",
        "(line 376,col 9)-(line 376,col 38)",
        "(line 377,col 9)-(line 378,col 41)",
        "(line 379,col 9)-(line 379,col 51)",
        "(line 381,col 9)-(line 381,col 14)",
        "(line 382,col 9)-(line 382,col 33)",
        "(line 383,col 9)-(line 384,col 39)",
        "(line 385,col 9)-(line 385,col 49)",
        "(line 387,col 9)-(line 387,col 14)",
        "(line 388,col 9)-(line 388,col 33)",
        "(line 389,col 9)-(line 390,col 35)",
        "(line 391,col 9)-(line 391,col 49)",
        "(line 393,col 9)-(line 393,col 52)",
        "(line 394,col 9)-(line 394,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testSqrt()",
      "begin_line": 397,
      "end_line": 419,
      "comment": "",
      "child_ranges": [
        "(line 399,col 9)-(line 399,col 21)",
        "(line 400,col 9)-(line 400,col 38)",
        "(line 401,col 9)-(line 402,col 41)",
        "(line 403,col 9)-(line 403,col 51)",
        "(line 405,col 9)-(line 405,col 14)",
        "(line 406,col 9)-(line 406,col 33)",
        "(line 407,col 9)-(line 408,col 39)",
        "(line 409,col 9)-(line 409,col 49)",
        "(line 411,col 9)-(line 411,col 14)",
        "(line 412,col 9)-(line 412,col 33)",
        "(line 413,col 9)-(line 414,col 35)",
        "(line 415,col 9)-(line 415,col 49)",
        "(line 417,col 9)-(line 417,col 52)",
        "(line 418,col 9)-(line 418,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testCosh()",
      "begin_line": 421,
      "end_line": 443,
      "comment": "",
      "child_ranges": [
        "(line 423,col 9)-(line 423,col 21)",
        "(line 424,col 9)-(line 424,col 38)",
        "(line 425,col 9)-(line 426,col 41)",
        "(line 427,col 9)-(line 427,col 51)",
        "(line 429,col 9)-(line 429,col 14)",
        "(line 430,col 9)-(line 430,col 33)",
        "(line 431,col 9)-(line 432,col 39)",
        "(line 433,col 9)-(line 433,col 49)",
        "(line 435,col 9)-(line 435,col 14)",
        "(line 436,col 9)-(line 436,col 33)",
        "(line 437,col 9)-(line 438,col 35)",
        "(line 439,col 9)-(line 439,col 49)",
        "(line 441,col 9)-(line 441,col 52)",
        "(line 442,col 9)-(line 442,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testSinh()",
      "begin_line": 445,
      "end_line": 467,
      "comment": "",
      "child_ranges": [
        "(line 447,col 9)-(line 447,col 21)",
        "(line 448,col 9)-(line 448,col 38)",
        "(line 449,col 9)-(line 450,col 41)",
        "(line 451,col 9)-(line 451,col 51)",
        "(line 453,col 9)-(line 453,col 14)",
        "(line 454,col 9)-(line 454,col 33)",
        "(line 455,col 9)-(line 456,col 39)",
        "(line 457,col 9)-(line 457,col 49)",
        "(line 459,col 9)-(line 459,col 14)",
        "(line 460,col 9)-(line 460,col 33)",
        "(line 461,col 9)-(line 462,col 35)",
        "(line 463,col 9)-(line 463,col 49)",
        "(line 465,col 9)-(line 465,col 52)",
        "(line 466,col 9)-(line 466,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testTanh()",
      "begin_line": 469,
      "end_line": 491,
      "comment": "",
      "child_ranges": [
        "(line 471,col 9)-(line 471,col 21)",
        "(line 472,col 9)-(line 472,col 38)",
        "(line 473,col 9)-(line 474,col 41)",
        "(line 475,col 9)-(line 475,col 51)",
        "(line 477,col 9)-(line 477,col 14)",
        "(line 478,col 9)-(line 478,col 33)",
        "(line 479,col 9)-(line 480,col 39)",
        "(line 481,col 9)-(line 481,col 49)",
        "(line 483,col 9)-(line 483,col 14)",
        "(line 484,col 9)-(line 484,col 33)",
        "(line 485,col 9)-(line 486,col 35)",
        "(line 487,col 9)-(line 487,col 49)",
        "(line 489,col 9)-(line 489,col 52)",
        "(line 490,col 9)-(line 490,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testExpm1()",
      "begin_line": 493,
      "end_line": 514,
      "comment": "",
      "child_ranges": [
        "(line 495,col 9)-(line 495,col 21)",
        "(line 496,col 9)-(line 496,col 38)",
        "(line 497,col 9)-(line 498,col 43)",
        "(line 499,col 9)-(line 499,col 51)",
        "(line 501,col 9)-(line 501,col 14)",
        "(line 502,col 9)-(line 502,col 33)",
        "(line 503,col 9)-(line 504,col 41)",
        "(line 505,col 9)-(line 505,col 49)",
        "(line 507,col 9)-(line 507,col 14)",
        "(line 508,col 9)-(line 508,col 33)",
        "(line 509,col 9)-(line 510,col 37)",
        "(line 511,col 9)-(line 511,col 49)",
        "(line 512,col 9)-(line 512,col 53)",
        "(line 513,col 9)-(line 513,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testAbs()",
      "begin_line": 516,
      "end_line": 538,
      "comment": "",
      "child_ranges": [
        "(line 518,col 9)-(line 518,col 21)",
        "(line 519,col 9)-(line 519,col 38)",
        "(line 520,col 9)-(line 521,col 54)",
        "(line 522,col 9)-(line 522,col 51)",
        "(line 524,col 9)-(line 524,col 14)",
        "(line 525,col 9)-(line 525,col 33)",
        "(line 526,col 9)-(line 527,col 52)",
        "(line 528,col 9)-(line 528,col 49)",
        "(line 530,col 9)-(line 530,col 14)",
        "(line 531,col 9)-(line 531,col 33)",
        "(line 532,col 9)-(line 533,col 48)",
        "(line 534,col 9)-(line 534,col 49)",
        "(line 536,col 9)-(line 536,col 51)",
        "(line 537,col 9)-(line 537,col 44)"
      ]
    }
  ]
}