{
  "filepath": "/tmp/Math-60b/src/test/java/org/apache/commons/math/linear/SparseRealMatrixTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SparseRealMatrixTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 33,
      "end_line": 675,
      "comment": "\n * Test cases for the {@link OpenMapRealMatrix} class.\n *\n * @version $Revision$ $Date: 2008-11-07 06:48:13 -0800 (Fri, 07 Nov\n *          2008) $\n "
    },
    {
      "type": "field",
      "varNames": [
        "id"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " 3 x 3 identity matrix"
    },
    {
      "type": "field",
      "varNames": [
        "testData"
      ],
      "begin_line": 38,
      "end_line": 39,
      "comment": " Test data for group operations"
    },
    {
      "type": "field",
      "varNames": [
        "testDataLU"
      ],
      "begin_line": 40,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testDataPlus2"
      ],
      "begin_line": 42,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testDataMinus"
      ],
      "begin_line": 44,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testDataRow1"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testDataCol3"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testDataInv"
      ],
      "begin_line": 48,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "preMultTest"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testData2"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testData2T"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testDataPlusInv"
      ],
      "begin_line": 53,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "luData"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " lu decomposition tests"
    },
    {
      "type": "field",
      "varNames": [
        "luDataLUDecomposition"
      ],
      "begin_line": 58,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "singular"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " singular matrices"
    },
    {
      "type": "field",
      "varNames": [
        "bigSingular"
      ],
      "begin_line": 63,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "detData"
      ],
      "begin_line": 71,
      "end_line": 72,
      "comment": " 2nd"
    },
    {
      "type": "field",
      "varNames": [
        "detData2"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testVector"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " vectors"
    },
    {
      "type": "field",
      "varNames": [
        "testVector2"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subTestData"
      ],
      "begin_line": 80,
      "end_line": 81,
      "comment": " submatrix accessor tests"
    },
    {
      "type": "field",
      "varNames": [
        "subRows02Cols13"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " array selections"
    },
    {
      "type": "field",
      "varNames": [
        "subRows03Cols12"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subRows03Cols123"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subRows20Cols123"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " effective permutations"
    },
    {
      "type": "field",
      "varNames": [
        "subRows31Cols31"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subRows01Cols23"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " contiguous ranges"
    },
    {
      "type": "field",
      "varNames": [
        "subRows23Cols00"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subRows00Cols33"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subRow0"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " row matrices"
    },
    {
      "type": "field",
      "varNames": [
        "subRow3"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subColumn1"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " column matrices"
    },
    {
      "type": "field",
      "varNames": [
        "subColumn3"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entryTolerance"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " tolerances"
    },
    {
      "type": "field",
      "varNames": [
        "normTolerance"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.SparseRealMatrixTest(java.lang.String)",
      "begin_line": 109,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testDimensions()",
      "begin_line": 114,
      "end_line": 123,
      "comment": " test dimensions ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 59)",
        "(line 116,col 9)-(line 116,col 61)",
        "(line 117,col 9)-(line 117,col 71)",
        "(line 118,col 9)-(line 118,col 77)",
        "(line 119,col 9)-(line 119,col 55)",
        "(line 120,col 9)-(line 120,col 73)",
        "(line 121,col 9)-(line 121,col 79)",
        "(line 122,col 9)-(line 122,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testCopyFunctions()",
      "begin_line": 126,
      "end_line": 135,
      "comment": " test copy functions ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 60)",
        "(line 128,col 9)-(line 128,col 34)",
        "(line 129,col 9)-(line 129,col 51)",
        "(line 130,col 9)-(line 130,col 31)",
        "(line 131,col 9)-(line 131,col 60)",
        "(line 132,col 9)-(line 132,col 34)",
        "(line 133,col 9)-(line 133,col 51)",
        "(line 134,col 9)-(line 134,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testAdd()",
      "begin_line": 138,
      "end_line": 150,
      "comment": " test add ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 59)",
        "(line 140,col 9)-(line 140,col 65)",
        "(line 141,col 9)-(line 141,col 77)",
        "(line 142,col 9)-(line 142,col 43)",
        "(line 143,col 9)-(line 149,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testAddFail()",
      "begin_line": 153,
      "end_line": 162,
      "comment": " test add failure ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 59)",
        "(line 155,col 9)-(line 155,col 61)",
        "(line 156,col 9)-(line 161,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testNorm()",
      "begin_line": 165,
      "end_line": 170,
      "comment": " test norm ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 59)",
        "(line 167,col 9)-(line 167,col 61)",
        "(line 168,col 9)-(line 168,col 72)",
        "(line 169,col 9)-(line 169,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testPlusMinus()",
      "begin_line": 173,
      "end_line": 184,
      "comment": " test m-n \u003d m + -n ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 59)",
        "(line 175,col 9)-(line 175,col 62)",
        "(line 176,col 9)-(line 177,col 58)",
        "(line 178,col 9)-(line 183,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testMultiply()",
      "begin_line": 187,
      "end_line": 210,
      "comment": " test multiply ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 59)",
        "(line 189,col 9)-(line 189,col 65)",
        "(line 190,col 9)-(line 190,col 60)",
        "(line 191,col 9)-(line 191,col 61)",
        "(line 192,col 9)-(line 193,col 32)",
        "(line 194,col 9)-(line 195,col 36)",
        "(line 196,col 9)-(line 197,col 32)",
        "(line 198,col 9)-(line 199,col 32)",
        "(line 200,col 9)-(line 201,col 32)",
        "(line 202,col 9)-(line 203,col 32)",
        "(line 204,col 9)-(line 209,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "d3"
      ],
      "begin_line": 214,
      "end_line": 214,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "d4"
      ],
      "begin_line": 215,
      "end_line": 215,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "d5"
      ],
      "begin_line": 216,
      "end_line": 216,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testMultiply2()",
      "begin_line": 218,
      "end_line": 223,
      "comment": "",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 47)",
        "(line 220,col 9)-(line 220,col 47)",
        "(line 221,col 9)-(line 221,col 47)",
        "(line 222,col 9)-(line 222,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testTrace()",
      "begin_line": 226,
      "end_line": 236,
      "comment": " test trace ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 46)",
        "(line 228,col 9)-(line 228,col 73)",
        "(line 229,col 9)-(line 229,col 42)",
        "(line 230,col 9)-(line 235,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testScalarAdd()",
      "begin_line": 239,
      "end_line": 243,
      "comment": " test sclarAdd ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 52)",
        "(line 241,col 9)-(line 242,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testOperate()",
      "begin_line": 246,
      "end_line": 259,
      "comment": " test operate ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 46)",
        "(line 248,col 9)-(line 249,col 32)",
        "(line 250,col 9)-(line 251,col 76)",
        "(line 252,col 9)-(line 252,col 44)",
        "(line 253,col 9)-(line 258,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testMath209()",
      "begin_line": 262,
      "end_line": 270,
      "comment": " test issue MATH-209 ",
      "child_ranges": [
        "(line 263,col 9)-(line 264,col 48)",
        "(line 265,col 9)-(line 265,col 54)",
        "(line 266,col 9)-(line 266,col 52)",
        "(line 267,col 9)-(line 267,col 41)",
        "(line 268,col 9)-(line 268,col 41)",
        "(line 269,col 9)-(line 269,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testTranspose()",
      "begin_line": 273,
      "end_line": 282,
      "comment": " test transpose ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 52)",
        "(line 276,col 9)-(line 276,col 89)",
        "(line 277,col 9)-(line 277,col 89)",
        "(line 278,col 9)-(line 278,col 66)",
        "(line 279,col 9)-(line 279,col 42)",
        "(line 280,col 9)-(line 280,col 55)",
        "(line 281,col 9)-(line 281,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testPremultiplyVector()",
      "begin_line": 285,
      "end_line": 298,
      "comment": " test preMultiply by vector ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 52)",
        "(line 287,col 9)-(line 288,col 27)",
        "(line 289,col 9)-(line 290,col 84)",
        "(line 291,col 9)-(line 291,col 44)",
        "(line 292,col 9)-(line 297,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testPremultiply()",
      "begin_line": 300,
      "end_line": 323,
      "comment": "",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 47)",
        "(line 302,col 9)-(line 302,col 47)",
        "(line 303,col 9)-(line 303,col 47)",
        "(line 304,col 9)-(line 304,col 72)",
        "(line 306,col 9)-(line 306,col 59)",
        "(line 307,col 9)-(line 307,col 65)",
        "(line 308,col 9)-(line 308,col 60)",
        "(line 309,col 9)-(line 310,col 32)",
        "(line 311,col 9)-(line 312,col 32)",
        "(line 313,col 9)-(line 314,col 32)",
        "(line 315,col 9)-(line 316,col 32)",
        "(line 317,col 9)-(line 322,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testGetVectors()",
      "begin_line": 325,
      "end_line": 341,
      "comment": "",
      "child_ranges": [
        "(line 326,col 9)-(line 326,col 52)",
        "(line 327,col 9)-(line 327,col 74)",
        "(line 328,col 9)-(line 328,col 77)",
        "(line 329,col 9)-(line 334,col 9)",
        "(line 335,col 9)-(line 340,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testGetEntry()",
      "begin_line": 343,
      "end_line": 352,
      "comment": "",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 52)",
        "(line 345,col 9)-(line 345,col 72)",
        "(line 346,col 9)-(line 351,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testExamples()",
      "begin_line": 355,
      "end_line": 384,
      "comment": " test examples in user guide ",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 67)",
        "(line 358,col 9)-(line 358,col 54)",
        "(line 360,col 9)-(line 360,col 72)",
        "(line 361,col 9)-(line 361,col 55)",
        "(line 363,col 9)-(line 363,col 37)",
        "(line 364,col 9)-(line 364,col 45)",
        "(line 365,col 9)-(line 365,col 48)",
        "(line 367,col 9)-(line 367,col 82)",
        "(line 368,col 9)-(line 368,col 52)",
        "(line 369,col 9)-(line 369,col 55)",
        "(line 372,col 9)-(line 373,col 32)",
        "(line 374,col 9)-(line 374,col 71)",
        "(line 375,col 9)-(line 375,col 42)",
        "(line 376,col 9)-(line 376,col 95)",
        "(line 377,col 9)-(line 378,col 37)",
        "(line 379,col 9)-(line 380,col 37)",
        "(line 381,col 9)-(line 382,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testSubMatrix()",
      "begin_line": 387,
      "end_line": 449,
      "comment": " test submatrix accessors",
      "child_ranges": [
        "(line 388,col 9)-(line 388,col 55)",
        "(line 389,col 9)-(line 389,col 71)",
        "(line 390,col 9)-(line 390,col 71)",
        "(line 391,col 9)-(line 391,col 71)",
        "(line 392,col 9)-(line 392,col 71)",
        "(line 393,col 9)-(line 393,col 71)",
        "(line 394,col 9)-(line 394,col 73)",
        "(line 395,col 9)-(line 395,col 73)",
        "(line 396,col 9)-(line 396,col 71)",
        "(line 397,col 9)-(line 397,col 80)",
        "(line 398,col 9)-(line 398,col 80)",
        "(line 399,col 9)-(line 399,col 80)",
        "(line 400,col 9)-(line 401,col 68)",
        "(line 402,col 9)-(line 403,col 68)",
        "(line 404,col 9)-(line 405,col 71)",
        "(line 406,col 9)-(line 407,col 71)",
        "(line 408,col 9)-(line 409,col 68)",
        "(line 410,col 9)-(line 411,col 68)",
        "(line 413,col 9)-(line 418,col 9)",
        "(line 419,col 9)-(line 424,col 9)",
        "(line 425,col 9)-(line 430,col 9)",
        "(line 431,col 9)-(line 436,col 9)",
        "(line 437,col 9)-(line 442,col 9)",
        "(line 443,col 9)-(line 448,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testGetRowMatrix()",
      "begin_line": 451,
      "end_line": 469,
      "comment": "",
      "child_ranges": [
        "(line 452,col 9)-(line 452,col 55)",
        "(line 453,col 9)-(line 453,col 55)",
        "(line 454,col 9)-(line 454,col 55)",
        "(line 455,col 9)-(line 455,col 55)",
        "(line 456,col 9)-(line 456,col 55)",
        "(line 457,col 9)-(line 462,col 9)",
        "(line 463,col 9)-(line 468,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testGetColumnMatrix()",
      "begin_line": 471,
      "end_line": 489,
      "comment": "",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 55)",
        "(line 473,col 9)-(line 473,col 61)",
        "(line 474,col 9)-(line 474,col 61)",
        "(line 475,col 9)-(line 475,col 64)",
        "(line 476,col 9)-(line 476,col 64)",
        "(line 477,col 9)-(line 482,col 9)",
        "(line 483,col 9)-(line 488,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testGetRowVector()",
      "begin_line": 491,
      "end_line": 509,
      "comment": "",
      "child_ranges": [
        "(line 492,col 9)-(line 492,col 55)",
        "(line 493,col 9)-(line 493,col 59)",
        "(line 494,col 9)-(line 494,col 59)",
        "(line 495,col 9)-(line 495,col 55)",
        "(line 496,col 9)-(line 496,col 55)",
        "(line 497,col 9)-(line 502,col 9)",
        "(line 503,col 9)-(line 508,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testGetColumnVector()",
      "begin_line": 511,
      "end_line": 529,
      "comment": "",
      "child_ranges": [
        "(line 512,col 9)-(line 512,col 55)",
        "(line 513,col 9)-(line 513,col 57)",
        "(line 514,col 9)-(line 514,col 57)",
        "(line 515,col 9)-(line 515,col 64)",
        "(line 516,col 9)-(line 516,col 64)",
        "(line 517,col 9)-(line 522,col 9)",
        "(line 523,col 9)-(line 528,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.columnToVector(double[][])",
      "begin_line": 531,
      "end_line": 537,
      "comment": "",
      "child_ranges": [
        "(line 532,col 9)-(line 532,col 50)",
        "(line 533,col 9)-(line 535,col 9)",
        "(line 536,col 9)-(line 536,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testEqualsAndHashCode()",
      "begin_line": 539,
      "end_line": 550,
      "comment": "",
      "child_ranges": [
        "(line 540,col 9)-(line 540,col 59)",
        "(line 541,col 9)-(line 541,col 40)",
        "(line 542,col 9)-(line 542,col 65)",
        "(line 543,col 9)-(line 543,col 50)",
        "(line 544,col 9)-(line 544,col 50)",
        "(line 545,col 9)-(line 545,col 27)",
        "(line 546,col 9)-(line 546,col 28)",
        "(line 547,col 9)-(line 547,col 36)",
        "(line 548,col 9)-(line 548,col 34)",
        "(line 549,col 9)-(line 549,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testToString()",
      "begin_line": 552,
      "end_line": 558,
      "comment": "",
      "child_ranges": [
        "(line 553,col 9)-(line 553,col 59)",
        "(line 554,col 9)-(line 555,col 26)",
        "(line 556,col 9)-(line 556,col 40)",
        "(line 557,col 9)-(line 557,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testSetSubMatrix()",
      "begin_line": 560,
      "end_line": 637,
      "comment": "",
      "child_ranges": [
        "(line 561,col 9)-(line 561,col 59)",
        "(line 562,col 9)-(line 562,col 39)",
        "(line 563,col 9)-(line 564,col 75)",
        "(line 565,col 9)-(line 565,col 34)",
        "(line 567,col 9)-(line 567,col 39)",
        "(line 568,col 9)-(line 569,col 75)",
        "(line 570,col 9)-(line 570,col 34)",
        "(line 572,col 9)-(line 572,col 44)",
        "(line 573,col 9)-(line 574,col 76)",
        "(line 575,col 9)-(line 575,col 34)",
        "(line 578,col 9)-(line 580,col 58)",
        "(line 581,col 9)-(line 581,col 73)",
        "(line 582,col 9)-(line 583,col 66)",
        "(line 584,col 9)-(line 584,col 39)",
        "(line 587,col 9)-(line 592,col 9)",
        "(line 594,col 9)-(line 599,col 9)",
        "(line 600,col 9)-(line 605,col 9)",
        "(line 608,col 9)-(line 613,col 9)",
        "(line 614,col 9)-(line 619,col 9)",
        "(line 622,col 9)-(line 627,col 9)",
        "(line 630,col 9)-(line 635,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testSerial()",
      "begin_line": 639,
      "end_line": 642,
      "comment": "",
      "child_ranges": [
        "(line 640,col 9)-(line 640,col 59)",
        "(line 641,col 9)-(line 641,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.assertClose(java.lang.String, org.apache.commons.math.linear.RealMatrix, org.apache.commons.math.linear.RealMatrix, double)",
      "begin_line": 647,
      "end_line": 650,
      "comment": " verifies that two matrices are close (1-norm) ",
      "child_ranges": [
        "(line 649,col 9)-(line 649,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.assertClose(java.lang.String, double[], double[], double)",
      "begin_line": 653,
      "end_line": 662,
      "comment": " verifies that two vectors are close (sup norm) ",
      "child_ranges": [
        "(line 655,col 9)-(line 657,col 9)",
        "(line 658,col 9)-(line 661,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.createSparseMatrix(double[][])",
      "begin_line": 664,
      "end_line": 672,
      "comment": "",
      "child_ranges": [
        "(line 665,col 9)-(line 665,col 86)",
        "(line 666,col 9)-(line 670,col 9)",
        "(line 671,col 9)-(line 671,col 22)"
      ]
    }
  ]
}