{
  "filepath": "/tmp/Math-89b/src/test/org/apache/commons/math/linear/SparseRealMatrixTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SparseRealMatrixTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 32,
      "end_line": 673,
      "comment": "\n * Test cases for the {@link SparseRealMatrix} class.\n * \n * @version $Revision$ $Date: 2008-11-07 06:48:13 -0800 (Fri, 07 Nov\n *          2008) $\n "
    },
    {
      "type": "field",
      "varNames": [
        "id"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " 3 x 3 identity matrix"
    },
    {
      "type": "field",
      "varNames": [
        "testData"
      ],
      "begin_line": 37,
      "end_line": 38,
      "comment": " Test data for group operations"
    },
    {
      "type": "field",
      "varNames": [
        "testDataLU"
      ],
      "begin_line": 39,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testDataPlus2"
      ],
      "begin_line": 41,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testDataMinus"
      ],
      "begin_line": 43,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testDataRow1"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testDataCol3"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testDataInv"
      ],
      "begin_line": 47,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "preMultTest"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testData2"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testData2T"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testDataPlusInv"
      ],
      "begin_line": 52,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "luData"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " lu decomposition tests"
    },
    {
      "type": "field",
      "varNames": [
        "luDataLUDecomposition"
      ],
      "begin_line": 57,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "singular"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " singular matrices"
    },
    {
      "type": "field",
      "varNames": [
        "bigSingular"
      ],
      "begin_line": 62,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "detData"
      ],
      "begin_line": 70,
      "end_line": 71,
      "comment": " 2nd"
    },
    {
      "type": "field",
      "varNames": [
        "detData2"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testVector"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " vectors"
    },
    {
      "type": "field",
      "varNames": [
        "testVector2"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subTestData"
      ],
      "begin_line": 79,
      "end_line": 80,
      "comment": " submatrix accessor tests"
    },
    {
      "type": "field",
      "varNames": [
        "subRows02Cols13"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " array selections"
    },
    {
      "type": "field",
      "varNames": [
        "subRows03Cols12"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subRows03Cols123"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subRows20Cols123"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " effective permutations"
    },
    {
      "type": "field",
      "varNames": [
        "subRows31Cols31"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subRows01Cols23"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " contiguous ranges"
    },
    {
      "type": "field",
      "varNames": [
        "subRows23Cols00"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subRows00Cols33"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subRow0"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " row matrices"
    },
    {
      "type": "field",
      "varNames": [
        "subRow3"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subColumn1"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": " column matrices"
    },
    {
      "type": "field",
      "varNames": [
        "subColumn3"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entryTolerance"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": " tolerances"
    },
    {
      "type": "field",
      "varNames": [
        "normTolerance"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.SparseRealMatrixTest(java.lang.String)",
      "begin_line": 108,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.suite()",
      "begin_line": 112,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 68)",
        "(line 114,col 9)-(line 114,col 48)",
        "(line 115,col 9)-(line 115,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testDimensions()",
      "begin_line": 119,
      "end_line": 128,
      "comment": " test dimensions ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 58)",
        "(line 121,col 9)-(line 121,col 60)",
        "(line 122,col 9)-(line 122,col 71)",
        "(line 123,col 9)-(line 123,col 77)",
        "(line 124,col 9)-(line 124,col 55)",
        "(line 125,col 9)-(line 125,col 73)",
        "(line 126,col 9)-(line 126,col 79)",
        "(line 127,col 9)-(line 127,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testCopyFunctions()",
      "begin_line": 131,
      "end_line": 140,
      "comment": " test copy functions ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 59)",
        "(line 133,col 9)-(line 133,col 34)",
        "(line 134,col 9)-(line 134,col 51)",
        "(line 135,col 9)-(line 135,col 31)",
        "(line 136,col 9)-(line 136,col 59)",
        "(line 137,col 9)-(line 137,col 34)",
        "(line 138,col 9)-(line 138,col 51)",
        "(line 139,col 9)-(line 139,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testAdd()",
      "begin_line": 143,
      "end_line": 155,
      "comment": " test add ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 58)",
        "(line 145,col 9)-(line 145,col 64)",
        "(line 146,col 9)-(line 146,col 76)",
        "(line 147,col 9)-(line 147,col 43)",
        "(line 148,col 9)-(line 154,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testAddFail()",
      "begin_line": 158,
      "end_line": 167,
      "comment": " test add failure ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 58)",
        "(line 160,col 9)-(line 160,col 60)",
        "(line 161,col 9)-(line 166,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testNorm()",
      "begin_line": 170,
      "end_line": 175,
      "comment": " test norm ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 58)",
        "(line 172,col 9)-(line 172,col 60)",
        "(line 173,col 9)-(line 173,col 72)",
        "(line 174,col 9)-(line 174,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testPlusMinus()",
      "begin_line": 178,
      "end_line": 189,
      "comment": " test m-n \u003d m + -n ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 58)",
        "(line 180,col 9)-(line 180,col 61)",
        "(line 181,col 9)-(line 182,col 58)",
        "(line 183,col 9)-(line 188,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testMultiply()",
      "begin_line": 192,
      "end_line": 215,
      "comment": " test multiply ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 58)",
        "(line 194,col 9)-(line 194,col 64)",
        "(line 195,col 9)-(line 195,col 59)",
        "(line 196,col 9)-(line 196,col 60)",
        "(line 197,col 9)-(line 198,col 32)",
        "(line 199,col 9)-(line 200,col 36)",
        "(line 201,col 9)-(line 202,col 32)",
        "(line 203,col 9)-(line 204,col 32)",
        "(line 205,col 9)-(line 206,col 32)",
        "(line 207,col 9)-(line 208,col 32)",
        "(line 209,col 9)-(line 214,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "d3"
      ],
      "begin_line": 219,
      "end_line": 219,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "d4"
      ],
      "begin_line": 220,
      "end_line": 220,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "d5"
      ],
      "begin_line": 221,
      "end_line": 221,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testMultiply2()",
      "begin_line": 223,
      "end_line": 228,
      "comment": "",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 47)",
        "(line 225,col 9)-(line 225,col 47)",
        "(line 226,col 9)-(line 226,col 47)",
        "(line 227,col 9)-(line 227,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testTrace()",
      "begin_line": 231,
      "end_line": 241,
      "comment": " test trace ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 46)",
        "(line 233,col 9)-(line 233,col 73)",
        "(line 234,col 9)-(line 234,col 42)",
        "(line 235,col 9)-(line 240,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testScalarAdd()",
      "begin_line": 244,
      "end_line": 248,
      "comment": " test sclarAdd ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 52)",
        "(line 246,col 9)-(line 247,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testOperate()",
      "begin_line": 251,
      "end_line": 264,
      "comment": " test operate ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 46)",
        "(line 253,col 9)-(line 254,col 32)",
        "(line 255,col 9)-(line 256,col 75)",
        "(line 257,col 9)-(line 257,col 44)",
        "(line 258,col 9)-(line 263,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testMath209()",
      "begin_line": 267,
      "end_line": 275,
      "comment": " test issue MATH-209 ",
      "child_ranges": [
        "(line 268,col 9)-(line 269,col 48)",
        "(line 270,col 9)-(line 270,col 54)",
        "(line 271,col 9)-(line 271,col 52)",
        "(line 272,col 9)-(line 272,col 41)",
        "(line 273,col 9)-(line 273,col 41)",
        "(line 274,col 9)-(line 274,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testTranspose()",
      "begin_line": 278,
      "end_line": 287,
      "comment": " test transpose ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 52)",
        "(line 281,col 9)-(line 281,col 89)",
        "(line 282,col 9)-(line 282,col 89)",
        "(line 283,col 9)-(line 283,col 66)",
        "(line 284,col 9)-(line 284,col 42)",
        "(line 285,col 9)-(line 285,col 55)",
        "(line 286,col 9)-(line 286,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testPremultiplyVector()",
      "begin_line": 290,
      "end_line": 303,
      "comment": " test preMultiply by vector ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 52)",
        "(line 292,col 9)-(line 293,col 27)",
        "(line 294,col 9)-(line 295,col 83)",
        "(line 296,col 9)-(line 296,col 44)",
        "(line 297,col 9)-(line 302,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testPremultiply()",
      "begin_line": 305,
      "end_line": 328,
      "comment": "",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 47)",
        "(line 307,col 9)-(line 307,col 47)",
        "(line 308,col 9)-(line 308,col 47)",
        "(line 309,col 9)-(line 309,col 72)",
        "(line 311,col 9)-(line 311,col 58)",
        "(line 312,col 9)-(line 312,col 64)",
        "(line 313,col 9)-(line 313,col 59)",
        "(line 314,col 9)-(line 315,col 32)",
        "(line 316,col 9)-(line 317,col 32)",
        "(line 318,col 9)-(line 319,col 32)",
        "(line 320,col 9)-(line 321,col 32)",
        "(line 322,col 9)-(line 327,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testGetVectors()",
      "begin_line": 330,
      "end_line": 346,
      "comment": "",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 52)",
        "(line 332,col 9)-(line 332,col 74)",
        "(line 333,col 9)-(line 333,col 77)",
        "(line 334,col 9)-(line 339,col 9)",
        "(line 340,col 9)-(line 345,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testGetEntry()",
      "begin_line": 348,
      "end_line": 357,
      "comment": "",
      "child_ranges": [
        "(line 349,col 9)-(line 349,col 52)",
        "(line 350,col 9)-(line 350,col 72)",
        "(line 351,col 9)-(line 356,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testExamples()",
      "begin_line": 360,
      "end_line": 389,
      "comment": " test examples in user guide ",
      "child_ranges": [
        "(line 362,col 9)-(line 362,col 67)",
        "(line 363,col 9)-(line 363,col 54)",
        "(line 365,col 9)-(line 365,col 72)",
        "(line 366,col 9)-(line 366,col 55)",
        "(line 368,col 9)-(line 368,col 37)",
        "(line 369,col 9)-(line 369,col 45)",
        "(line 370,col 9)-(line 370,col 48)",
        "(line 372,col 9)-(line 372,col 82)",
        "(line 373,col 9)-(line 373,col 52)",
        "(line 374,col 9)-(line 374,col 55)",
        "(line 377,col 9)-(line 378,col 32)",
        "(line 379,col 9)-(line 379,col 71)",
        "(line 380,col 9)-(line 380,col 42)",
        "(line 381,col 9)-(line 381,col 95)",
        "(line 382,col 9)-(line 383,col 37)",
        "(line 384,col 9)-(line 385,col 37)",
        "(line 386,col 9)-(line 387,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testSubMatrix()",
      "begin_line": 392,
      "end_line": 454,
      "comment": " test submatrix accessors",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 55)",
        "(line 394,col 9)-(line 394,col 71)",
        "(line 395,col 9)-(line 395,col 71)",
        "(line 396,col 9)-(line 396,col 71)",
        "(line 397,col 9)-(line 397,col 71)",
        "(line 398,col 9)-(line 398,col 71)",
        "(line 399,col 9)-(line 399,col 73)",
        "(line 400,col 9)-(line 400,col 73)",
        "(line 401,col 9)-(line 401,col 71)",
        "(line 402,col 9)-(line 402,col 80)",
        "(line 403,col 9)-(line 403,col 80)",
        "(line 404,col 9)-(line 404,col 80)",
        "(line 405,col 9)-(line 406,col 68)",
        "(line 407,col 9)-(line 408,col 68)",
        "(line 409,col 9)-(line 410,col 71)",
        "(line 411,col 9)-(line 412,col 71)",
        "(line 413,col 9)-(line 414,col 68)",
        "(line 415,col 9)-(line 416,col 68)",
        "(line 418,col 9)-(line 423,col 9)",
        "(line 424,col 9)-(line 429,col 9)",
        "(line 430,col 9)-(line 435,col 9)",
        "(line 436,col 9)-(line 441,col 9)",
        "(line 442,col 9)-(line 447,col 9)",
        "(line 448,col 9)-(line 453,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testGetRowMatrix()",
      "begin_line": 456,
      "end_line": 474,
      "comment": "",
      "child_ranges": [
        "(line 457,col 9)-(line 457,col 55)",
        "(line 458,col 9)-(line 458,col 55)",
        "(line 459,col 9)-(line 459,col 55)",
        "(line 460,col 9)-(line 460,col 55)",
        "(line 461,col 9)-(line 461,col 55)",
        "(line 462,col 9)-(line 467,col 9)",
        "(line 468,col 9)-(line 473,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testGetColumnMatrix()",
      "begin_line": 476,
      "end_line": 494,
      "comment": "",
      "child_ranges": [
        "(line 477,col 9)-(line 477,col 55)",
        "(line 478,col 9)-(line 478,col 61)",
        "(line 479,col 9)-(line 479,col 61)",
        "(line 480,col 9)-(line 480,col 64)",
        "(line 481,col 9)-(line 481,col 64)",
        "(line 482,col 9)-(line 487,col 9)",
        "(line 488,col 9)-(line 493,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testGetRowVector()",
      "begin_line": 496,
      "end_line": 514,
      "comment": "",
      "child_ranges": [
        "(line 497,col 9)-(line 497,col 55)",
        "(line 498,col 9)-(line 498,col 58)",
        "(line 499,col 9)-(line 499,col 58)",
        "(line 500,col 9)-(line 500,col 55)",
        "(line 501,col 9)-(line 501,col 55)",
        "(line 502,col 9)-(line 507,col 9)",
        "(line 508,col 9)-(line 513,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testGetColumnVector()",
      "begin_line": 516,
      "end_line": 534,
      "comment": "",
      "child_ranges": [
        "(line 517,col 9)-(line 517,col 55)",
        "(line 518,col 9)-(line 518,col 57)",
        "(line 519,col 9)-(line 519,col 57)",
        "(line 520,col 9)-(line 520,col 64)",
        "(line 521,col 9)-(line 521,col 64)",
        "(line 522,col 9)-(line 527,col 9)",
        "(line 528,col 9)-(line 533,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.columnToVector(double[][])",
      "begin_line": 536,
      "end_line": 542,
      "comment": "",
      "child_ranges": [
        "(line 537,col 9)-(line 537,col 50)",
        "(line 538,col 9)-(line 540,col 9)",
        "(line 541,col 9)-(line 541,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testEqualsAndHashCode()",
      "begin_line": 544,
      "end_line": 555,
      "comment": "",
      "child_ranges": [
        "(line 545,col 9)-(line 545,col 58)",
        "(line 546,col 9)-(line 546,col 58)",
        "(line 547,col 9)-(line 547,col 63)",
        "(line 548,col 9)-(line 548,col 50)",
        "(line 549,col 9)-(line 549,col 50)",
        "(line 550,col 9)-(line 550,col 27)",
        "(line 551,col 9)-(line 551,col 28)",
        "(line 552,col 9)-(line 552,col 36)",
        "(line 553,col 9)-(line 553,col 34)",
        "(line 554,col 9)-(line 554,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testToString()",
      "begin_line": 557,
      "end_line": 563,
      "comment": "",
      "child_ranges": [
        "(line 558,col 9)-(line 558,col 58)",
        "(line 559,col 9)-(line 560,col 26)",
        "(line 561,col 9)-(line 561,col 39)",
        "(line 562,col 9)-(line 562,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testSetSubMatrix()",
      "begin_line": 565,
      "end_line": 642,
      "comment": "",
      "child_ranges": [
        "(line 566,col 9)-(line 566,col 58)",
        "(line 567,col 9)-(line 567,col 39)",
        "(line 568,col 9)-(line 569,col 75)",
        "(line 570,col 9)-(line 570,col 34)",
        "(line 572,col 9)-(line 572,col 39)",
        "(line 573,col 9)-(line 574,col 75)",
        "(line 575,col 9)-(line 575,col 34)",
        "(line 577,col 9)-(line 577,col 44)",
        "(line 578,col 9)-(line 579,col 76)",
        "(line 580,col 9)-(line 580,col 34)",
        "(line 583,col 9)-(line 585,col 58)",
        "(line 586,col 9)-(line 586,col 73)",
        "(line 587,col 9)-(line 588,col 66)",
        "(line 589,col 9)-(line 589,col 39)",
        "(line 592,col 9)-(line 597,col 9)",
        "(line 599,col 9)-(line 604,col 9)",
        "(line 605,col 9)-(line 610,col 9)",
        "(line 613,col 9)-(line 618,col 9)",
        "(line 619,col 9)-(line 624,col 9)",
        "(line 627,col 9)-(line 632,col 9)",
        "(line 635,col 9)-(line 640,col 9)"
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
        "(line 665,col 9)-(line 665,col 84)",
        "(line 666,col 9)-(line 670,col 9)",
        "(line 671,col 9)-(line 671,col 22)"
      ]
    }
  ]
}