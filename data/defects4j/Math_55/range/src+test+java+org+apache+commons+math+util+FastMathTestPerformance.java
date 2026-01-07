{
  "filepath": "/tmp/Math-55b/src/test/java/org/apache/commons/math/util/FastMathTestPerformance.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastMathTestPerformance",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 517,
      "comment": "\n * Performance tests for FastMath.\n * Not enabled by default, as the class does not end in Test.\n * \n * Invoke by running\u003cbr/\u003e\n * {@code mvn test -Dtest\u003dFastMathTestPerformance}\u003cbr/\u003e\n * or by running\u003cbr/\u003e\n * {@code mvn test -Dtest\u003dFastMathTestPerformance -DargLine\u003d\"-DtestRuns\u003d1234 -server\"}\u003cbr/\u003e\n "
    },
    {
      "type": "field",
      "varNames": [
        "RUNS"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "F1"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FMT_HDR"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Header format"
    },
    {
      "type": "field",
      "varNames": [
        "FMT_DTL"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Detail format"
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.header()",
      "begin_line": 40,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 42,col 9)-(line 48,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.report(java.lang.String, long, long, long)",
      "begin_line": 51,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 39)",
        "(line 53,col 9)-(line 58,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testLog()",
      "begin_line": 61,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 21)",
        "(line 64,col 9)-(line 64,col 38)",
        "(line 65,col 9)-(line 66,col 62)",
        "(line 67,col 9)-(line 67,col 51)",
        "(line 69,col 9)-(line 69,col 14)",
        "(line 70,col 9)-(line 70,col 33)",
        "(line 71,col 9)-(line 72,col 60)",
        "(line 73,col 9)-(line 73,col 49)",
        "(line 75,col 9)-(line 75,col 14)",
        "(line 76,col 9)-(line 76,col 33)",
        "(line 77,col 9)-(line 78,col 56)",
        "(line 79,col 9)-(line 79,col 49)",
        "(line 81,col 9)-(line 81,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testLog10()",
      "begin_line": 84,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 21)",
        "(line 87,col 9)-(line 87,col 38)",
        "(line 88,col 9)-(line 89,col 64)",
        "(line 90,col 9)-(line 90,col 51)",
        "(line 92,col 9)-(line 92,col 14)",
        "(line 93,col 9)-(line 93,col 33)",
        "(line 94,col 9)-(line 95,col 62)",
        "(line 96,col 9)-(line 96,col 49)",
        "(line 98,col 9)-(line 98,col 14)",
        "(line 99,col 9)-(line 99,col 33)",
        "(line 100,col 9)-(line 101,col 58)",
        "(line 102,col 9)-(line 102,col 49)",
        "(line 104,col 9)-(line 104,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testLog1p()",
      "begin_line": 107,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 21)",
        "(line 110,col 9)-(line 110,col 38)",
        "(line 111,col 9)-(line 112,col 64)",
        "(line 113,col 9)-(line 113,col 51)",
        "(line 115,col 9)-(line 115,col 14)",
        "(line 116,col 9)-(line 116,col 33)",
        "(line 117,col 9)-(line 118,col 62)",
        "(line 119,col 9)-(line 119,col 49)",
        "(line 121,col 9)-(line 121,col 14)",
        "(line 122,col 9)-(line 122,col 33)",
        "(line 123,col 9)-(line 124,col 58)",
        "(line 125,col 9)-(line 125,col 49)",
        "(line 127,col 9)-(line 127,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testPow()",
      "begin_line": 130,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 21)",
        "(line 133,col 9)-(line 133,col 38)",
        "(line 134,col 9)-(line 135,col 58)",
        "(line 136,col 9)-(line 136,col 51)",
        "(line 138,col 9)-(line 138,col 14)",
        "(line 139,col 9)-(line 139,col 33)",
        "(line 140,col 9)-(line 141,col 56)",
        "(line 142,col 9)-(line 142,col 49)",
        "(line 144,col 9)-(line 144,col 14)",
        "(line 145,col 9)-(line 145,col 33)",
        "(line 146,col 9)-(line 147,col 52)",
        "(line 148,col 9)-(line 148,col 49)",
        "(line 149,col 9)-(line 149,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testExp()",
      "begin_line": 152,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 21)",
        "(line 155,col 9)-(line 155,col 38)",
        "(line 156,col 9)-(line 157,col 40)",
        "(line 158,col 9)-(line 158,col 51)",
        "(line 160,col 9)-(line 160,col 14)",
        "(line 161,col 9)-(line 161,col 33)",
        "(line 162,col 9)-(line 163,col 38)",
        "(line 164,col 9)-(line 164,col 49)",
        "(line 166,col 9)-(line 166,col 14)",
        "(line 167,col 9)-(line 167,col 33)",
        "(line 168,col 9)-(line 169,col 34)",
        "(line 170,col 9)-(line 170,col 49)",
        "(line 172,col 9)-(line 172,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testSin()",
      "begin_line": 175,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 21)",
        "(line 178,col 9)-(line 178,col 38)",
        "(line 179,col 9)-(line 180,col 40)",
        "(line 181,col 9)-(line 181,col 51)",
        "(line 183,col 9)-(line 183,col 14)",
        "(line 184,col 9)-(line 184,col 33)",
        "(line 185,col 9)-(line 186,col 38)",
        "(line 187,col 9)-(line 187,col 49)",
        "(line 189,col 9)-(line 189,col 14)",
        "(line 190,col 9)-(line 190,col 33)",
        "(line 191,col 9)-(line 192,col 34)",
        "(line 193,col 9)-(line 193,col 49)",
        "(line 195,col 9)-(line 195,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testAsin()",
      "begin_line": 198,
      "end_line": 219,
      "comment": "",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 21)",
        "(line 201,col 9)-(line 201,col 38)",
        "(line 202,col 9)-(line 203,col 49)",
        "(line 204,col 9)-(line 204,col 51)",
        "(line 206,col 9)-(line 206,col 14)",
        "(line 207,col 9)-(line 207,col 33)",
        "(line 208,col 9)-(line 209,col 47)",
        "(line 210,col 9)-(line 210,col 49)",
        "(line 212,col 9)-(line 212,col 14)",
        "(line 213,col 9)-(line 213,col 33)",
        "(line 214,col 9)-(line 215,col 43)",
        "(line 216,col 9)-(line 216,col 49)",
        "(line 218,col 9)-(line 218,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testCos()",
      "begin_line": 221,
      "end_line": 242,
      "comment": "",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 21)",
        "(line 224,col 9)-(line 224,col 38)",
        "(line 225,col 9)-(line 226,col 40)",
        "(line 227,col 9)-(line 227,col 51)",
        "(line 229,col 9)-(line 229,col 14)",
        "(line 230,col 9)-(line 230,col 33)",
        "(line 231,col 9)-(line 232,col 38)",
        "(line 233,col 9)-(line 233,col 49)",
        "(line 235,col 9)-(line 235,col 14)",
        "(line 236,col 9)-(line 236,col 33)",
        "(line 237,col 9)-(line 238,col 34)",
        "(line 239,col 9)-(line 239,col 49)",
        "(line 241,col 9)-(line 241,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testAcos()",
      "begin_line": 244,
      "end_line": 264,
      "comment": "",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 21)",
        "(line 247,col 9)-(line 247,col 38)",
        "(line 248,col 9)-(line 249,col 49)",
        "(line 250,col 9)-(line 250,col 51)",
        "(line 252,col 9)-(line 252,col 14)",
        "(line 253,col 9)-(line 253,col 33)",
        "(line 254,col 9)-(line 255,col 47)",
        "(line 256,col 9)-(line 256,col 49)",
        "(line 258,col 9)-(line 258,col 14)",
        "(line 259,col 9)-(line 259,col 33)",
        "(line 260,col 9)-(line 261,col 43)",
        "(line 262,col 9)-(line 262,col 49)",
        "(line 263,col 9)-(line 263,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testTan()",
      "begin_line": 266,
      "end_line": 287,
      "comment": "",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 21)",
        "(line 269,col 9)-(line 269,col 38)",
        "(line 270,col 9)-(line 271,col 40)",
        "(line 272,col 9)-(line 272,col 51)",
        "(line 274,col 9)-(line 274,col 14)",
        "(line 275,col 9)-(line 275,col 33)",
        "(line 276,col 9)-(line 277,col 38)",
        "(line 278,col 9)-(line 278,col 49)",
        "(line 280,col 9)-(line 280,col 14)",
        "(line 281,col 9)-(line 281,col 33)",
        "(line 282,col 9)-(line 283,col 34)",
        "(line 284,col 9)-(line 284,col 49)",
        "(line 286,col 9)-(line 286,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testAtan()",
      "begin_line": 289,
      "end_line": 310,
      "comment": "",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 21)",
        "(line 292,col 9)-(line 292,col 38)",
        "(line 293,col 9)-(line 294,col 41)",
        "(line 295,col 9)-(line 295,col 51)",
        "(line 297,col 9)-(line 297,col 14)",
        "(line 298,col 9)-(line 298,col 33)",
        "(line 299,col 9)-(line 300,col 39)",
        "(line 301,col 9)-(line 301,col 49)",
        "(line 303,col 9)-(line 303,col 14)",
        "(line 304,col 9)-(line 304,col 33)",
        "(line 305,col 9)-(line 306,col 35)",
        "(line 307,col 9)-(line 307,col 49)",
        "(line 309,col 9)-(line 309,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testAtan2()",
      "begin_line": 312,
      "end_line": 333,
      "comment": "",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 21)",
        "(line 315,col 9)-(line 315,col 38)",
        "(line 316,col 9)-(line 317,col 50)",
        "(line 318,col 9)-(line 318,col 51)",
        "(line 320,col 9)-(line 320,col 14)",
        "(line 321,col 9)-(line 321,col 33)",
        "(line 322,col 9)-(line 323,col 48)",
        "(line 324,col 9)-(line 324,col 49)",
        "(line 326,col 9)-(line 326,col 14)",
        "(line 327,col 9)-(line 327,col 33)",
        "(line 328,col 9)-(line 329,col 44)",
        "(line 330,col 9)-(line 330,col 49)",
        "(line 332,col 9)-(line 332,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testHypot()",
      "begin_line": 335,
      "end_line": 356,
      "comment": "",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 21)",
        "(line 338,col 9)-(line 338,col 38)",
        "(line 339,col 9)-(line 340,col 50)",
        "(line 341,col 9)-(line 341,col 51)",
        "(line 343,col 9)-(line 343,col 14)",
        "(line 344,col 9)-(line 344,col 33)",
        "(line 345,col 9)-(line 346,col 48)",
        "(line 347,col 9)-(line 347,col 49)",
        "(line 349,col 9)-(line 349,col 14)",
        "(line 350,col 9)-(line 350,col 33)",
        "(line 351,col 9)-(line 352,col 44)",
        "(line 353,col 9)-(line 353,col 49)",
        "(line 355,col 9)-(line 355,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testCbrt()",
      "begin_line": 358,
      "end_line": 379,
      "comment": "",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 21)",
        "(line 361,col 9)-(line 361,col 38)",
        "(line 362,col 9)-(line 363,col 41)",
        "(line 364,col 9)-(line 364,col 51)",
        "(line 366,col 9)-(line 366,col 14)",
        "(line 367,col 9)-(line 367,col 33)",
        "(line 368,col 9)-(line 369,col 39)",
        "(line 370,col 9)-(line 370,col 49)",
        "(line 372,col 9)-(line 372,col 14)",
        "(line 373,col 9)-(line 373,col 33)",
        "(line 374,col 9)-(line 375,col 35)",
        "(line 376,col 9)-(line 376,col 49)",
        "(line 378,col 9)-(line 378,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testSqrt()",
      "begin_line": 381,
      "end_line": 402,
      "comment": "",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 21)",
        "(line 384,col 9)-(line 384,col 38)",
        "(line 385,col 9)-(line 386,col 41)",
        "(line 387,col 9)-(line 387,col 51)",
        "(line 389,col 9)-(line 389,col 14)",
        "(line 390,col 9)-(line 390,col 33)",
        "(line 391,col 9)-(line 392,col 39)",
        "(line 393,col 9)-(line 393,col 49)",
        "(line 395,col 9)-(line 395,col 14)",
        "(line 396,col 9)-(line 396,col 33)",
        "(line 397,col 9)-(line 398,col 35)",
        "(line 399,col 9)-(line 399,col 49)",
        "(line 401,col 9)-(line 401,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testCosh()",
      "begin_line": 404,
      "end_line": 425,
      "comment": "",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 21)",
        "(line 407,col 9)-(line 407,col 38)",
        "(line 408,col 9)-(line 409,col 41)",
        "(line 410,col 9)-(line 410,col 51)",
        "(line 412,col 9)-(line 412,col 14)",
        "(line 413,col 9)-(line 413,col 33)",
        "(line 414,col 9)-(line 415,col 39)",
        "(line 416,col 9)-(line 416,col 49)",
        "(line 418,col 9)-(line 418,col 14)",
        "(line 419,col 9)-(line 419,col 33)",
        "(line 420,col 9)-(line 421,col 35)",
        "(line 422,col 9)-(line 422,col 49)",
        "(line 424,col 9)-(line 424,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testSinh()",
      "begin_line": 427,
      "end_line": 448,
      "comment": "",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 21)",
        "(line 430,col 9)-(line 430,col 38)",
        "(line 431,col 9)-(line 432,col 41)",
        "(line 433,col 9)-(line 433,col 51)",
        "(line 435,col 9)-(line 435,col 14)",
        "(line 436,col 9)-(line 436,col 33)",
        "(line 437,col 9)-(line 438,col 39)",
        "(line 439,col 9)-(line 439,col 49)",
        "(line 441,col 9)-(line 441,col 14)",
        "(line 442,col 9)-(line 442,col 33)",
        "(line 443,col 9)-(line 444,col 35)",
        "(line 445,col 9)-(line 445,col 49)",
        "(line 447,col 9)-(line 447,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testTanh()",
      "begin_line": 450,
      "end_line": 471,
      "comment": "",
      "child_ranges": [
        "(line 452,col 9)-(line 452,col 21)",
        "(line 453,col 9)-(line 453,col 38)",
        "(line 454,col 9)-(line 455,col 41)",
        "(line 456,col 9)-(line 456,col 51)",
        "(line 458,col 9)-(line 458,col 14)",
        "(line 459,col 9)-(line 459,col 33)",
        "(line 460,col 9)-(line 461,col 39)",
        "(line 462,col 9)-(line 462,col 49)",
        "(line 464,col 9)-(line 464,col 14)",
        "(line 465,col 9)-(line 465,col 33)",
        "(line 466,col 9)-(line 467,col 35)",
        "(line 468,col 9)-(line 468,col 49)",
        "(line 470,col 9)-(line 470,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testExpm1()",
      "begin_line": 473,
      "end_line": 493,
      "comment": "",
      "child_ranges": [
        "(line 475,col 9)-(line 475,col 21)",
        "(line 476,col 9)-(line 476,col 38)",
        "(line 477,col 9)-(line 478,col 43)",
        "(line 479,col 9)-(line 479,col 51)",
        "(line 481,col 9)-(line 481,col 14)",
        "(line 482,col 9)-(line 482,col 33)",
        "(line 483,col 9)-(line 484,col 41)",
        "(line 485,col 9)-(line 485,col 49)",
        "(line 487,col 9)-(line 487,col 14)",
        "(line 488,col 9)-(line 488,col 33)",
        "(line 489,col 9)-(line 490,col 37)",
        "(line 491,col 9)-(line 491,col 49)",
        "(line 492,col 9)-(line 492,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.FastMathTestPerformance.testAbs()",
      "begin_line": 495,
      "end_line": 516,
      "comment": "",
      "child_ranges": [
        "(line 497,col 9)-(line 497,col 21)",
        "(line 498,col 9)-(line 498,col 38)",
        "(line 499,col 9)-(line 500,col 54)",
        "(line 501,col 9)-(line 501,col 51)",
        "(line 503,col 9)-(line 503,col 14)",
        "(line 504,col 9)-(line 504,col 33)",
        "(line 505,col 9)-(line 506,col 52)",
        "(line 507,col 9)-(line 507,col 49)",
        "(line 509,col 9)-(line 509,col 14)",
        "(line 510,col 9)-(line 510,col 33)",
        "(line 511,col 9)-(line 512,col 48)",
        "(line 513,col 9)-(line 513,col 49)",
        "(line 515,col 9)-(line 515,col 51)"
      ]
    }
  ]
}