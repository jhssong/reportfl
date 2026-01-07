{
  "filepath": "/tmp/Math-92b/src/test/org/apache/commons/math/linear/SparseRealMatrixTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SparseRealMatrixTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 29,
      "end_line": 672,
      "comment": "\n * Test cases for the {@link SparseRealMatrix} class.\n * \n * @version $Revision$ $Date: 2008-11-07 06:48:13 -0800 (Fri, 07 Nov\n *          2008) $\n "
    },
    {
      "type": "field",
      "varNames": [
        "id"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " 3 x 3 identity matrix"
    },
    {
      "type": "field",
      "varNames": [
        "testData"
      ],
      "begin_line": 34,
      "end_line": 35,
      "comment": " Test data for group operations"
    },
    {
      "type": "field",
      "varNames": [
        "testDataLU"
      ],
      "begin_line": 36,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testDataPlus2"
      ],
      "begin_line": 38,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testDataMinus"
      ],
      "begin_line": 40,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testDataRow1"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testDataCol3"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testDataInv"
      ],
      "begin_line": 44,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "preMultTest"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testData2"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testData2T"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testDataPlusInv"
      ],
      "begin_line": 49,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "luData"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " lu decomposition tests"
    },
    {
      "type": "field",
      "varNames": [
        "luDataLUDecomposition"
      ],
      "begin_line": 54,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "singular"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " singular matrices"
    },
    {
      "type": "field",
      "varNames": [
        "bigSingular"
      ],
      "begin_line": 59,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "detData"
      ],
      "begin_line": 67,
      "end_line": 68,
      "comment": " 2nd"
    },
    {
      "type": "field",
      "varNames": [
        "detData2"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testVector"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " vectors"
    },
    {
      "type": "field",
      "varNames": [
        "testVector2"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subTestData"
      ],
      "begin_line": 76,
      "end_line": 77,
      "comment": " submatrix accessor tests"
    },
    {
      "type": "field",
      "varNames": [
        "subRows02Cols13"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " array selections"
    },
    {
      "type": "field",
      "varNames": [
        "subRows03Cols12"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subRows03Cols123"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subRows20Cols123"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " effective permutations"
    },
    {
      "type": "field",
      "varNames": [
        "subRows31Cols31"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subRows01Cols23"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " contiguous ranges"
    },
    {
      "type": "field",
      "varNames": [
        "subRows23Cols00"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subRows00Cols33"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subRow0"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " row matrices"
    },
    {
      "type": "field",
      "varNames": [
        "subRow3"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subColumn1"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " column matrices"
    },
    {
      "type": "field",
      "varNames": [
        "subColumn3"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entryTolerance"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " tolerances"
    },
    {
      "type": "field",
      "varNames": [
        "normTolerance"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.SparseRealMatrixTest(java.lang.String)",
      "begin_line": 105,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.setUp()",
      "begin_line": 109,
      "end_line": 111,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.suite()",
      "begin_line": 113,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 68)",
        "(line 115,col 9)-(line 115,col 48)",
        "(line 116,col 9)-(line 116,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testDimensions()",
      "begin_line": 120,
      "end_line": 129,
      "comment": " test dimensions ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 58)",
        "(line 122,col 9)-(line 122,col 60)",
        "(line 123,col 9)-(line 123,col 71)",
        "(line 124,col 9)-(line 124,col 77)",
        "(line 125,col 9)-(line 125,col 55)",
        "(line 126,col 9)-(line 126,col 73)",
        "(line 127,col 9)-(line 127,col 79)",
        "(line 128,col 9)-(line 128,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testCopyFunctions()",
      "begin_line": 132,
      "end_line": 141,
      "comment": " test copy functions ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 59)",
        "(line 134,col 9)-(line 134,col 34)",
        "(line 135,col 9)-(line 135,col 51)",
        "(line 136,col 9)-(line 136,col 50)",
        "(line 137,col 9)-(line 137,col 59)",
        "(line 138,col 9)-(line 138,col 34)",
        "(line 139,col 9)-(line 139,col 51)",
        "(line 140,col 9)-(line 140,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testAdd()",
      "begin_line": 144,
      "end_line": 156,
      "comment": " test add ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 58)",
        "(line 146,col 9)-(line 146,col 64)",
        "(line 147,col 9)-(line 147,col 76)",
        "(line 148,col 9)-(line 148,col 43)",
        "(line 149,col 9)-(line 155,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testAddFail()",
      "begin_line": 159,
      "end_line": 168,
      "comment": " test add failure ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 58)",
        "(line 161,col 9)-(line 161,col 60)",
        "(line 162,col 9)-(line 167,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testNorm()",
      "begin_line": 171,
      "end_line": 176,
      "comment": " test norm ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 58)",
        "(line 173,col 9)-(line 173,col 60)",
        "(line 174,col 9)-(line 174,col 72)",
        "(line 175,col 9)-(line 175,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testPlusMinus()",
      "begin_line": 179,
      "end_line": 190,
      "comment": " test m-n \u003d m + -n ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 58)",
        "(line 181,col 9)-(line 181,col 61)",
        "(line 182,col 9)-(line 183,col 58)",
        "(line 184,col 9)-(line 189,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testMultiply()",
      "begin_line": 193,
      "end_line": 214,
      "comment": " test multiply ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 58)",
        "(line 195,col 9)-(line 195,col 64)",
        "(line 196,col 9)-(line 196,col 59)",
        "(line 197,col 9)-(line 197,col 60)",
        "(line 198,col 9)-(line 199,col 32)",
        "(line 200,col 9)-(line 201,col 32)",
        "(line 202,col 9)-(line 203,col 32)",
        "(line 204,col 9)-(line 205,col 32)",
        "(line 206,col 9)-(line 207,col 32)",
        "(line 208,col 9)-(line 213,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "d3"
      ],
      "begin_line": 218,
      "end_line": 218,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "d4"
      ],
      "begin_line": 219,
      "end_line": 219,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "d5"
      ],
      "begin_line": 220,
      "end_line": 220,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testMultiply2()",
      "begin_line": 222,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 47)",
        "(line 224,col 9)-(line 224,col 47)",
        "(line 225,col 9)-(line 225,col 47)",
        "(line 226,col 9)-(line 226,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testTrace()",
      "begin_line": 230,
      "end_line": 240,
      "comment": " test trace ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 46)",
        "(line 232,col 9)-(line 232,col 73)",
        "(line 233,col 9)-(line 233,col 42)",
        "(line 234,col 9)-(line 239,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testScalarAdd()",
      "begin_line": 243,
      "end_line": 247,
      "comment": " test sclarAdd ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 52)",
        "(line 245,col 9)-(line 246,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testOperate()",
      "begin_line": 250,
      "end_line": 263,
      "comment": " test operate ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 46)",
        "(line 252,col 9)-(line 253,col 32)",
        "(line 254,col 9)-(line 255,col 75)",
        "(line 256,col 9)-(line 256,col 44)",
        "(line 257,col 9)-(line 262,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testMath209()",
      "begin_line": 266,
      "end_line": 274,
      "comment": " test issue MATH-209 ",
      "child_ranges": [
        "(line 267,col 9)-(line 268,col 48)",
        "(line 269,col 9)-(line 269,col 54)",
        "(line 270,col 9)-(line 270,col 52)",
        "(line 271,col 9)-(line 271,col 41)",
        "(line 272,col 9)-(line 272,col 41)",
        "(line 273,col 9)-(line 273,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testTranspose()",
      "begin_line": 277,
      "end_line": 286,
      "comment": " test transpose ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 52)",
        "(line 280,col 9)-(line 280,col 89)",
        "(line 281,col 9)-(line 281,col 89)",
        "(line 282,col 9)-(line 282,col 66)",
        "(line 283,col 9)-(line 283,col 42)",
        "(line 284,col 9)-(line 284,col 55)",
        "(line 285,col 9)-(line 285,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testPremultiplyVector()",
      "begin_line": 289,
      "end_line": 302,
      "comment": " test preMultiply by vector ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 52)",
        "(line 291,col 9)-(line 292,col 27)",
        "(line 293,col 9)-(line 294,col 83)",
        "(line 295,col 9)-(line 295,col 44)",
        "(line 296,col 9)-(line 301,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testPremultiply()",
      "begin_line": 304,
      "end_line": 327,
      "comment": "",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 47)",
        "(line 306,col 9)-(line 306,col 47)",
        "(line 307,col 9)-(line 307,col 47)",
        "(line 308,col 9)-(line 308,col 72)",
        "(line 310,col 9)-(line 310,col 58)",
        "(line 311,col 9)-(line 311,col 64)",
        "(line 312,col 9)-(line 312,col 59)",
        "(line 313,col 9)-(line 314,col 32)",
        "(line 315,col 9)-(line 316,col 32)",
        "(line 317,col 9)-(line 318,col 32)",
        "(line 319,col 9)-(line 320,col 32)",
        "(line 321,col 9)-(line 326,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testGetVectors()",
      "begin_line": 329,
      "end_line": 345,
      "comment": "",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 52)",
        "(line 331,col 9)-(line 331,col 74)",
        "(line 332,col 9)-(line 332,col 77)",
        "(line 333,col 9)-(line 338,col 9)",
        "(line 339,col 9)-(line 344,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testGetEntry()",
      "begin_line": 347,
      "end_line": 356,
      "comment": "",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 52)",
        "(line 349,col 9)-(line 349,col 72)",
        "(line 350,col 9)-(line 355,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testExamples()",
      "begin_line": 359,
      "end_line": 388,
      "comment": " test examples in user guide ",
      "child_ranges": [
        "(line 361,col 9)-(line 361,col 67)",
        "(line 362,col 9)-(line 362,col 54)",
        "(line 364,col 9)-(line 364,col 72)",
        "(line 365,col 9)-(line 365,col 55)",
        "(line 367,col 9)-(line 367,col 37)",
        "(line 368,col 9)-(line 368,col 45)",
        "(line 369,col 9)-(line 369,col 48)",
        "(line 371,col 9)-(line 371,col 82)",
        "(line 372,col 9)-(line 372,col 52)",
        "(line 373,col 9)-(line 373,col 55)",
        "(line 376,col 9)-(line 377,col 32)",
        "(line 378,col 9)-(line 378,col 71)",
        "(line 379,col 9)-(line 379,col 42)",
        "(line 380,col 9)-(line 380,col 95)",
        "(line 381,col 9)-(line 382,col 37)",
        "(line 383,col 9)-(line 384,col 37)",
        "(line 385,col 9)-(line 386,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testSubMatrix()",
      "begin_line": 391,
      "end_line": 453,
      "comment": " test submatrix accessors",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 55)",
        "(line 393,col 9)-(line 393,col 71)",
        "(line 394,col 9)-(line 394,col 71)",
        "(line 395,col 9)-(line 395,col 71)",
        "(line 396,col 9)-(line 396,col 71)",
        "(line 397,col 9)-(line 397,col 71)",
        "(line 398,col 9)-(line 398,col 73)",
        "(line 399,col 9)-(line 399,col 73)",
        "(line 400,col 9)-(line 400,col 71)",
        "(line 401,col 9)-(line 401,col 80)",
        "(line 402,col 9)-(line 402,col 80)",
        "(line 403,col 9)-(line 403,col 80)",
        "(line 404,col 9)-(line 405,col 68)",
        "(line 406,col 9)-(line 407,col 68)",
        "(line 408,col 9)-(line 409,col 71)",
        "(line 410,col 9)-(line 411,col 71)",
        "(line 412,col 9)-(line 413,col 68)",
        "(line 414,col 9)-(line 415,col 68)",
        "(line 417,col 9)-(line 422,col 9)",
        "(line 423,col 9)-(line 428,col 9)",
        "(line 429,col 9)-(line 434,col 9)",
        "(line 435,col 9)-(line 440,col 9)",
        "(line 441,col 9)-(line 446,col 9)",
        "(line 447,col 9)-(line 452,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testGetRowMatrix()",
      "begin_line": 455,
      "end_line": 473,
      "comment": "",
      "child_ranges": [
        "(line 456,col 9)-(line 456,col 55)",
        "(line 457,col 9)-(line 457,col 55)",
        "(line 458,col 9)-(line 458,col 55)",
        "(line 459,col 9)-(line 459,col 55)",
        "(line 460,col 9)-(line 460,col 55)",
        "(line 461,col 9)-(line 466,col 9)",
        "(line 467,col 9)-(line 472,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testGetColumnMatrix()",
      "begin_line": 475,
      "end_line": 493,
      "comment": "",
      "child_ranges": [
        "(line 476,col 9)-(line 476,col 55)",
        "(line 477,col 9)-(line 477,col 61)",
        "(line 478,col 9)-(line 478,col 61)",
        "(line 479,col 9)-(line 479,col 64)",
        "(line 480,col 9)-(line 480,col 64)",
        "(line 481,col 9)-(line 486,col 9)",
        "(line 487,col 9)-(line 492,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testGetRowVector()",
      "begin_line": 495,
      "end_line": 513,
      "comment": "",
      "child_ranges": [
        "(line 496,col 9)-(line 496,col 55)",
        "(line 497,col 9)-(line 497,col 58)",
        "(line 498,col 9)-(line 498,col 58)",
        "(line 499,col 9)-(line 499,col 55)",
        "(line 500,col 9)-(line 500,col 55)",
        "(line 501,col 9)-(line 506,col 9)",
        "(line 507,col 9)-(line 512,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testGetColumnVector()",
      "begin_line": 515,
      "end_line": 533,
      "comment": "",
      "child_ranges": [
        "(line 516,col 9)-(line 516,col 55)",
        "(line 517,col 9)-(line 517,col 57)",
        "(line 518,col 9)-(line 518,col 57)",
        "(line 519,col 9)-(line 519,col 64)",
        "(line 520,col 9)-(line 520,col 64)",
        "(line 521,col 9)-(line 526,col 9)",
        "(line 527,col 9)-(line 532,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.columnToVector(double[][])",
      "begin_line": 535,
      "end_line": 541,
      "comment": "",
      "child_ranges": [
        "(line 536,col 9)-(line 536,col 50)",
        "(line 537,col 9)-(line 539,col 9)",
        "(line 540,col 9)-(line 540,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testEqualsAndHashCode()",
      "begin_line": 543,
      "end_line": 554,
      "comment": "",
      "child_ranges": [
        "(line 544,col 9)-(line 544,col 58)",
        "(line 545,col 9)-(line 545,col 58)",
        "(line 546,col 9)-(line 546,col 63)",
        "(line 547,col 9)-(line 547,col 50)",
        "(line 548,col 9)-(line 548,col 50)",
        "(line 549,col 9)-(line 549,col 27)",
        "(line 550,col 9)-(line 550,col 28)",
        "(line 551,col 9)-(line 551,col 36)",
        "(line 552,col 9)-(line 552,col 34)",
        "(line 553,col 9)-(line 553,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testToString()",
      "begin_line": 556,
      "end_line": 562,
      "comment": "",
      "child_ranges": [
        "(line 557,col 9)-(line 557,col 58)",
        "(line 558,col 9)-(line 559,col 26)",
        "(line 560,col 9)-(line 560,col 39)",
        "(line 561,col 9)-(line 561,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testSetSubMatrix()",
      "begin_line": 564,
      "end_line": 641,
      "comment": "",
      "child_ranges": [
        "(line 565,col 9)-(line 565,col 58)",
        "(line 566,col 9)-(line 566,col 39)",
        "(line 567,col 9)-(line 568,col 75)",
        "(line 569,col 9)-(line 569,col 34)",
        "(line 571,col 9)-(line 571,col 39)",
        "(line 572,col 9)-(line 573,col 75)",
        "(line 574,col 9)-(line 574,col 34)",
        "(line 576,col 9)-(line 576,col 44)",
        "(line 577,col 9)-(line 578,col 76)",
        "(line 579,col 9)-(line 579,col 34)",
        "(line 582,col 9)-(line 584,col 62)",
        "(line 585,col 9)-(line 585,col 73)",
        "(line 586,col 9)-(line 587,col 66)",
        "(line 588,col 9)-(line 588,col 39)",
        "(line 591,col 9)-(line 596,col 9)",
        "(line 598,col 9)-(line 603,col 9)",
        "(line 604,col 9)-(line 609,col 9)",
        "(line 612,col 9)-(line 617,col 9)",
        "(line 618,col 9)-(line 623,col 9)",
        "(line 626,col 9)-(line 631,col 9)",
        "(line 634,col 9)-(line 639,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.assertClose(java.lang.String, org.apache.commons.math.linear.RealMatrix, org.apache.commons.math.linear.RealMatrix, double)",
      "begin_line": 646,
      "end_line": 649,
      "comment": " verifies that two matrices are close (1-norm) ",
      "child_ranges": [
        "(line 648,col 9)-(line 648,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.assertClose(java.lang.String, double[], double[], double)",
      "begin_line": 652,
      "end_line": 661,
      "comment": " verifies that two vectors are close (sup norm) ",
      "child_ranges": [
        "(line 654,col 9)-(line 656,col 9)",
        "(line 657,col 9)-(line 660,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.createSparseMatrix(double[][])",
      "begin_line": 663,
      "end_line": 671,
      "comment": "",
      "child_ranges": [
        "(line 664,col 9)-(line 664,col 84)",
        "(line 665,col 9)-(line 669,col 9)",
        "(line 670,col 9)-(line 670,col 22)"
      ]
    }
  ]
}