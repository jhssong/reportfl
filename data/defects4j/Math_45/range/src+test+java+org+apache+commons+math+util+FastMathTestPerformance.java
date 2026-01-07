{
  "filepath": "/tmp/Math-45b/src/test/java/org/apache/commons/math/util/FastMathTestPerformance.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastMathTestPerformance",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 538,
      "comment": "\n * Performance tests for FastMath.\n * Not enabled by default, as the class does not end in Test.\n * \n * Invoke by running\u003cbr/\u003e\n * {@code mvn test -Dtest\u003dFastMathTestPerformance}\u003cbr/\u003e\n * or by running\u003cbr/\u003e\n * {@code mvn test -Dtest\u003dFastMathTestPerformance -DargLine\u003d\"-DtestRuns\u003d1234 -server\"}\u003cbr/\u003e\n "
    },
    {
      "type": "field",
      "varNames": [
        "RUNS"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "F1"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FMT_HDR"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Header format"
    },
    {
      "type": "field",
      "varNames": [
        "FMT_DTL"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Detail format"
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.header()",
      "begin_line": 41,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 43,col 9)-(line 49,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.report(java.lang.String, long, long, long)",
      "begin_line": 52,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 39)",
        "(line 54,col 9)-(line 59,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testLog()",
      "begin_line": 62,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 21)",
        "(line 65,col 9)-(line 65,col 38)",
        "(line 66,col 9)-(line 67,col 62)",
        "(line 68,col 9)-(line 68,col 51)",
        "(line 70,col 9)-(line 70,col 14)",
        "(line 71,col 9)-(line 71,col 33)",
        "(line 72,col 9)-(line 73,col 60)",
        "(line 74,col 9)-(line 74,col 49)",
        "(line 76,col 9)-(line 76,col 14)",
        "(line 77,col 9)-(line 77,col 33)",
        "(line 78,col 9)-(line 79,col 56)",
        "(line 80,col 9)-(line 80,col 49)",
        "(line 82,col 9)-(line 82,col 51)",
        "(line 83,col 9)-(line 83,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testLog10()",
      "begin_line": 86,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 21)",
        "(line 89,col 9)-(line 89,col 38)",
        "(line 90,col 9)-(line 91,col 64)",
        "(line 92,col 9)-(line 92,col 51)",
        "(line 94,col 9)-(line 94,col 14)",
        "(line 95,col 9)-(line 95,col 33)",
        "(line 96,col 9)-(line 97,col 62)",
        "(line 98,col 9)-(line 98,col 49)",
        "(line 100,col 9)-(line 100,col 14)",
        "(line 101,col 9)-(line 101,col 33)",
        "(line 102,col 9)-(line 103,col 58)",
        "(line 104,col 9)-(line 104,col 49)",
        "(line 106,col 9)-(line 106,col 53)",
        "(line 107,col 9)-(line 107,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testLog1p()",
      "begin_line": 110,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 21)",
        "(line 113,col 9)-(line 113,col 38)",
        "(line 114,col 9)-(line 115,col 64)",
        "(line 116,col 9)-(line 116,col 51)",
        "(line 118,col 9)-(line 118,col 14)",
        "(line 119,col 9)-(line 119,col 33)",
        "(line 120,col 9)-(line 121,col 62)",
        "(line 122,col 9)-(line 122,col 49)",
        "(line 124,col 9)-(line 124,col 14)",
        "(line 125,col 9)-(line 125,col 33)",
        "(line 126,col 9)-(line 127,col 58)",
        "(line 128,col 9)-(line 128,col 49)",
        "(line 130,col 9)-(line 130,col 53)",
        "(line 131,col 9)-(line 131,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testPow()",
      "begin_line": 134,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 21)",
        "(line 137,col 9)-(line 137,col 38)",
        "(line 138,col 9)-(line 139,col 58)",
        "(line 140,col 9)-(line 140,col 51)",
        "(line 142,col 9)-(line 142,col 14)",
        "(line 143,col 9)-(line 143,col 33)",
        "(line 144,col 9)-(line 145,col 56)",
        "(line 146,col 9)-(line 146,col 49)",
        "(line 148,col 9)-(line 148,col 14)",
        "(line 149,col 9)-(line 149,col 33)",
        "(line 150,col 9)-(line 151,col 52)",
        "(line 152,col 9)-(line 152,col 49)",
        "(line 153,col 9)-(line 153,col 51)",
        "(line 154,col 9)-(line 154,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testExp()",
      "begin_line": 157,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 21)",
        "(line 160,col 9)-(line 160,col 38)",
        "(line 161,col 9)-(line 162,col 40)",
        "(line 163,col 9)-(line 163,col 51)",
        "(line 165,col 9)-(line 165,col 14)",
        "(line 166,col 9)-(line 166,col 33)",
        "(line 167,col 9)-(line 168,col 38)",
        "(line 169,col 9)-(line 169,col 49)",
        "(line 171,col 9)-(line 171,col 14)",
        "(line 172,col 9)-(line 172,col 33)",
        "(line 173,col 9)-(line 174,col 34)",
        "(line 175,col 9)-(line 175,col 49)",
        "(line 177,col 9)-(line 177,col 51)",
        "(line 178,col 9)-(line 178,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testSin()",
      "begin_line": 181,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 21)",
        "(line 184,col 9)-(line 184,col 38)",
        "(line 185,col 9)-(line 186,col 40)",
        "(line 187,col 9)-(line 187,col 51)",
        "(line 189,col 9)-(line 189,col 14)",
        "(line 190,col 9)-(line 190,col 33)",
        "(line 191,col 9)-(line 192,col 38)",
        "(line 193,col 9)-(line 193,col 49)",
        "(line 195,col 9)-(line 195,col 14)",
        "(line 196,col 9)-(line 196,col 33)",
        "(line 197,col 9)-(line 198,col 34)",
        "(line 199,col 9)-(line 199,col 49)",
        "(line 201,col 9)-(line 201,col 51)",
        "(line 202,col 9)-(line 202,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testAsin()",
      "begin_line": 205,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 21)",
        "(line 208,col 9)-(line 208,col 38)",
        "(line 209,col 9)-(line 210,col 49)",
        "(line 211,col 9)-(line 211,col 51)",
        "(line 213,col 9)-(line 213,col 14)",
        "(line 214,col 9)-(line 214,col 33)",
        "(line 215,col 9)-(line 216,col 47)",
        "(line 217,col 9)-(line 217,col 49)",
        "(line 219,col 9)-(line 219,col 14)",
        "(line 220,col 9)-(line 220,col 33)",
        "(line 221,col 9)-(line 222,col 43)",
        "(line 223,col 9)-(line 223,col 49)",
        "(line 225,col 9)-(line 225,col 52)",
        "(line 226,col 9)-(line 226,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testCos()",
      "begin_line": 229,
      "end_line": 251,
      "comment": "",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 21)",
        "(line 232,col 9)-(line 232,col 38)",
        "(line 233,col 9)-(line 234,col 40)",
        "(line 235,col 9)-(line 235,col 51)",
        "(line 237,col 9)-(line 237,col 14)",
        "(line 238,col 9)-(line 238,col 33)",
        "(line 239,col 9)-(line 240,col 38)",
        "(line 241,col 9)-(line 241,col 49)",
        "(line 243,col 9)-(line 243,col 14)",
        "(line 244,col 9)-(line 244,col 33)",
        "(line 245,col 9)-(line 246,col 34)",
        "(line 247,col 9)-(line 247,col 49)",
        "(line 249,col 9)-(line 249,col 51)",
        "(line 250,col 9)-(line 250,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testAcos()",
      "begin_line": 253,
      "end_line": 274,
      "comment": "",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 21)",
        "(line 256,col 9)-(line 256,col 38)",
        "(line 257,col 9)-(line 258,col 49)",
        "(line 259,col 9)-(line 259,col 51)",
        "(line 261,col 9)-(line 261,col 14)",
        "(line 262,col 9)-(line 262,col 33)",
        "(line 263,col 9)-(line 264,col 47)",
        "(line 265,col 9)-(line 265,col 49)",
        "(line 267,col 9)-(line 267,col 14)",
        "(line 268,col 9)-(line 268,col 33)",
        "(line 269,col 9)-(line 270,col 43)",
        "(line 271,col 9)-(line 271,col 49)",
        "(line 272,col 9)-(line 272,col 52)",
        "(line 273,col 9)-(line 273,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testTan()",
      "begin_line": 276,
      "end_line": 298,
      "comment": "",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 21)",
        "(line 279,col 9)-(line 279,col 38)",
        "(line 280,col 9)-(line 281,col 40)",
        "(line 282,col 9)-(line 282,col 51)",
        "(line 284,col 9)-(line 284,col 14)",
        "(line 285,col 9)-(line 285,col 33)",
        "(line 286,col 9)-(line 287,col 38)",
        "(line 288,col 9)-(line 288,col 49)",
        "(line 290,col 9)-(line 290,col 14)",
        "(line 291,col 9)-(line 291,col 33)",
        "(line 292,col 9)-(line 293,col 34)",
        "(line 294,col 9)-(line 294,col 49)",
        "(line 296,col 9)-(line 296,col 51)",
        "(line 297,col 9)-(line 297,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testAtan()",
      "begin_line": 300,
      "end_line": 322,
      "comment": "",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 21)",
        "(line 303,col 9)-(line 303,col 38)",
        "(line 304,col 9)-(line 305,col 41)",
        "(line 306,col 9)-(line 306,col 51)",
        "(line 308,col 9)-(line 308,col 14)",
        "(line 309,col 9)-(line 309,col 33)",
        "(line 310,col 9)-(line 311,col 39)",
        "(line 312,col 9)-(line 312,col 49)",
        "(line 314,col 9)-(line 314,col 14)",
        "(line 315,col 9)-(line 315,col 33)",
        "(line 316,col 9)-(line 317,col 35)",
        "(line 318,col 9)-(line 318,col 49)",
        "(line 320,col 9)-(line 320,col 52)",
        "(line 321,col 9)-(line 321,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testAtan2()",
      "begin_line": 324,
      "end_line": 346,
      "comment": "",
      "child_ranges": [
        "(line 326,col 9)-(line 326,col 21)",
        "(line 327,col 9)-(line 327,col 38)",
        "(line 328,col 9)-(line 329,col 50)",
        "(line 330,col 9)-(line 330,col 51)",
        "(line 332,col 9)-(line 332,col 14)",
        "(line 333,col 9)-(line 333,col 33)",
        "(line 334,col 9)-(line 335,col 48)",
        "(line 336,col 9)-(line 336,col 49)",
        "(line 338,col 9)-(line 338,col 14)",
        "(line 339,col 9)-(line 339,col 33)",
        "(line 340,col 9)-(line 341,col 44)",
        "(line 342,col 9)-(line 342,col 49)",
        "(line 344,col 9)-(line 344,col 53)",
        "(line 345,col 9)-(line 345,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testHypot()",
      "begin_line": 348,
      "end_line": 370,
      "comment": "",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 21)",
        "(line 351,col 9)-(line 351,col 38)",
        "(line 352,col 9)-(line 353,col 50)",
        "(line 354,col 9)-(line 354,col 51)",
        "(line 356,col 9)-(line 356,col 14)",
        "(line 357,col 9)-(line 357,col 33)",
        "(line 358,col 9)-(line 359,col 48)",
        "(line 360,col 9)-(line 360,col 49)",
        "(line 362,col 9)-(line 362,col 14)",
        "(line 363,col 9)-(line 363,col 33)",
        "(line 364,col 9)-(line 365,col 44)",
        "(line 366,col 9)-(line 366,col 49)",
        "(line 368,col 9)-(line 368,col 53)",
        "(line 369,col 9)-(line 369,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testCbrt()",
      "begin_line": 372,
      "end_line": 394,
      "comment": "",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 21)",
        "(line 375,col 9)-(line 375,col 38)",
        "(line 376,col 9)-(line 377,col 41)",
        "(line 378,col 9)-(line 378,col 51)",
        "(line 380,col 9)-(line 380,col 14)",
        "(line 381,col 9)-(line 381,col 33)",
        "(line 382,col 9)-(line 383,col 39)",
        "(line 384,col 9)-(line 384,col 49)",
        "(line 386,col 9)-(line 386,col 14)",
        "(line 387,col 9)-(line 387,col 33)",
        "(line 388,col 9)-(line 389,col 35)",
        "(line 390,col 9)-(line 390,col 49)",
        "(line 392,col 9)-(line 392,col 52)",
        "(line 393,col 9)-(line 393,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testSqrt()",
      "begin_line": 396,
      "end_line": 418,
      "comment": "",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 21)",
        "(line 399,col 9)-(line 399,col 38)",
        "(line 400,col 9)-(line 401,col 41)",
        "(line 402,col 9)-(line 402,col 51)",
        "(line 404,col 9)-(line 404,col 14)",
        "(line 405,col 9)-(line 405,col 33)",
        "(line 406,col 9)-(line 407,col 39)",
        "(line 408,col 9)-(line 408,col 49)",
        "(line 410,col 9)-(line 410,col 14)",
        "(line 411,col 9)-(line 411,col 33)",
        "(line 412,col 9)-(line 413,col 35)",
        "(line 414,col 9)-(line 414,col 49)",
        "(line 416,col 9)-(line 416,col 52)",
        "(line 417,col 9)-(line 417,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testCosh()",
      "begin_line": 420,
      "end_line": 442,
      "comment": "",
      "child_ranges": [
        "(line 422,col 9)-(line 422,col 21)",
        "(line 423,col 9)-(line 423,col 38)",
        "(line 424,col 9)-(line 425,col 41)",
        "(line 426,col 9)-(line 426,col 51)",
        "(line 428,col 9)-(line 428,col 14)",
        "(line 429,col 9)-(line 429,col 33)",
        "(line 430,col 9)-(line 431,col 39)",
        "(line 432,col 9)-(line 432,col 49)",
        "(line 434,col 9)-(line 434,col 14)",
        "(line 435,col 9)-(line 435,col 33)",
        "(line 436,col 9)-(line 437,col 35)",
        "(line 438,col 9)-(line 438,col 49)",
        "(line 440,col 9)-(line 440,col 52)",
        "(line 441,col 9)-(line 441,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testSinh()",
      "begin_line": 444,
      "end_line": 466,
      "comment": "",
      "child_ranges": [
        "(line 446,col 9)-(line 446,col 21)",
        "(line 447,col 9)-(line 447,col 38)",
        "(line 448,col 9)-(line 449,col 41)",
        "(line 450,col 9)-(line 450,col 51)",
        "(line 452,col 9)-(line 452,col 14)",
        "(line 453,col 9)-(line 453,col 33)",
        "(line 454,col 9)-(line 455,col 39)",
        "(line 456,col 9)-(line 456,col 49)",
        "(line 458,col 9)-(line 458,col 14)",
        "(line 459,col 9)-(line 459,col 33)",
        "(line 460,col 9)-(line 461,col 35)",
        "(line 462,col 9)-(line 462,col 49)",
        "(line 464,col 9)-(line 464,col 52)",
        "(line 465,col 9)-(line 465,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testTanh()",
      "begin_line": 468,
      "end_line": 490,
      "comment": "",
      "child_ranges": [
        "(line 470,col 9)-(line 470,col 21)",
        "(line 471,col 9)-(line 471,col 38)",
        "(line 472,col 9)-(line 473,col 41)",
        "(line 474,col 9)-(line 474,col 51)",
        "(line 476,col 9)-(line 476,col 14)",
        "(line 477,col 9)-(line 477,col 33)",
        "(line 478,col 9)-(line 479,col 39)",
        "(line 480,col 9)-(line 480,col 49)",
        "(line 482,col 9)-(line 482,col 14)",
        "(line 483,col 9)-(line 483,col 33)",
        "(line 484,col 9)-(line 485,col 35)",
        "(line 486,col 9)-(line 486,col 49)",
        "(line 488,col 9)-(line 488,col 52)",
        "(line 489,col 9)-(line 489,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testExpm1()",
      "begin_line": 492,
      "end_line": 513,
      "comment": "",
      "child_ranges": [
        "(line 494,col 9)-(line 494,col 21)",
        "(line 495,col 9)-(line 495,col 38)",
        "(line 496,col 9)-(line 497,col 43)",
        "(line 498,col 9)-(line 498,col 51)",
        "(line 500,col 9)-(line 500,col 14)",
        "(line 501,col 9)-(line 501,col 33)",
        "(line 502,col 9)-(line 503,col 41)",
        "(line 504,col 9)-(line 504,col 49)",
        "(line 506,col 9)-(line 506,col 14)",
        "(line 507,col 9)-(line 507,col 33)",
        "(line 508,col 9)-(line 509,col 37)",
        "(line 510,col 9)-(line 510,col 49)",
        "(line 511,col 9)-(line 511,col 53)",
        "(line 512,col 9)-(line 512,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testAbs()",
      "begin_line": 515,
      "end_line": 537,
      "comment": "",
      "child_ranges": [
        "(line 517,col 9)-(line 517,col 21)",
        "(line 518,col 9)-(line 518,col 38)",
        "(line 519,col 9)-(line 520,col 54)",
        "(line 521,col 9)-(line 521,col 51)",
        "(line 523,col 9)-(line 523,col 14)",
        "(line 524,col 9)-(line 524,col 33)",
        "(line 525,col 9)-(line 526,col 52)",
        "(line 527,col 9)-(line 527,col 49)",
        "(line 529,col 9)-(line 529,col 14)",
        "(line 530,col 9)-(line 530,col 33)",
        "(line 531,col 9)-(line 532,col 48)",
        "(line 533,col 9)-(line 533,col 49)",
        "(line 535,col 9)-(line 535,col 51)",
        "(line 536,col 9)-(line 536,col 44)"
      ]
    }
  ]
}