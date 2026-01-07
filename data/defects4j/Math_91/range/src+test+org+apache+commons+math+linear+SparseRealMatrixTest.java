{
  "filepath": "/tmp/Math-91b/src/test/org/apache/commons/math/linear/SparseRealMatrixTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SparseRealMatrixTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 32,
      "end_line": 675,
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
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.setUp()",
      "begin_line": 112,
      "end_line": 114,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.suite()",
      "begin_line": 116,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 68)",
        "(line 118,col 9)-(line 118,col 48)",
        "(line 119,col 9)-(line 119,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testDimensions()",
      "begin_line": 123,
      "end_line": 132,
      "comment": " test dimensions ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 58)",
        "(line 125,col 9)-(line 125,col 60)",
        "(line 126,col 9)-(line 126,col 71)",
        "(line 127,col 9)-(line 127,col 77)",
        "(line 128,col 9)-(line 128,col 55)",
        "(line 129,col 9)-(line 129,col 73)",
        "(line 130,col 9)-(line 130,col 79)",
        "(line 131,col 9)-(line 131,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testCopyFunctions()",
      "begin_line": 135,
      "end_line": 144,
      "comment": " test copy functions ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 59)",
        "(line 137,col 9)-(line 137,col 34)",
        "(line 138,col 9)-(line 138,col 51)",
        "(line 139,col 9)-(line 139,col 50)",
        "(line 140,col 9)-(line 140,col 59)",
        "(line 141,col 9)-(line 141,col 34)",
        "(line 142,col 9)-(line 142,col 51)",
        "(line 143,col 9)-(line 143,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testAdd()",
      "begin_line": 147,
      "end_line": 159,
      "comment": " test add ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 58)",
        "(line 149,col 9)-(line 149,col 64)",
        "(line 150,col 9)-(line 150,col 76)",
        "(line 151,col 9)-(line 151,col 43)",
        "(line 152,col 9)-(line 158,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testAddFail()",
      "begin_line": 162,
      "end_line": 171,
      "comment": " test add failure ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 58)",
        "(line 164,col 9)-(line 164,col 60)",
        "(line 165,col 9)-(line 170,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testNorm()",
      "begin_line": 174,
      "end_line": 179,
      "comment": " test norm ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 58)",
        "(line 176,col 9)-(line 176,col 60)",
        "(line 177,col 9)-(line 177,col 72)",
        "(line 178,col 9)-(line 178,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testPlusMinus()",
      "begin_line": 182,
      "end_line": 193,
      "comment": " test m-n \u003d m + -n ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 58)",
        "(line 184,col 9)-(line 184,col 61)",
        "(line 185,col 9)-(line 186,col 58)",
        "(line 187,col 9)-(line 192,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testMultiply()",
      "begin_line": 196,
      "end_line": 217,
      "comment": " test multiply ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 58)",
        "(line 198,col 9)-(line 198,col 64)",
        "(line 199,col 9)-(line 199,col 59)",
        "(line 200,col 9)-(line 200,col 60)",
        "(line 201,col 9)-(line 202,col 32)",
        "(line 203,col 9)-(line 204,col 32)",
        "(line 205,col 9)-(line 206,col 32)",
        "(line 207,col 9)-(line 208,col 32)",
        "(line 209,col 9)-(line 210,col 32)",
        "(line 211,col 9)-(line 216,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "d3"
      ],
      "begin_line": 221,
      "end_line": 221,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "d4"
      ],
      "begin_line": 222,
      "end_line": 222,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "d5"
      ],
      "begin_line": 223,
      "end_line": 223,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testMultiply2()",
      "begin_line": 225,
      "end_line": 230,
      "comment": "",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 47)",
        "(line 227,col 9)-(line 227,col 47)",
        "(line 228,col 9)-(line 228,col 47)",
        "(line 229,col 9)-(line 229,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testTrace()",
      "begin_line": 233,
      "end_line": 243,
      "comment": " test trace ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 46)",
        "(line 235,col 9)-(line 235,col 73)",
        "(line 236,col 9)-(line 236,col 42)",
        "(line 237,col 9)-(line 242,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testScalarAdd()",
      "begin_line": 246,
      "end_line": 250,
      "comment": " test sclarAdd ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 52)",
        "(line 248,col 9)-(line 249,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testOperate()",
      "begin_line": 253,
      "end_line": 266,
      "comment": " test operate ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 46)",
        "(line 255,col 9)-(line 256,col 32)",
        "(line 257,col 9)-(line 258,col 75)",
        "(line 259,col 9)-(line 259,col 44)",
        "(line 260,col 9)-(line 265,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testMath209()",
      "begin_line": 269,
      "end_line": 277,
      "comment": " test issue MATH-209 ",
      "child_ranges": [
        "(line 270,col 9)-(line 271,col 48)",
        "(line 272,col 9)-(line 272,col 54)",
        "(line 273,col 9)-(line 273,col 52)",
        "(line 274,col 9)-(line 274,col 41)",
        "(line 275,col 9)-(line 275,col 41)",
        "(line 276,col 9)-(line 276,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testTranspose()",
      "begin_line": 280,
      "end_line": 289,
      "comment": " test transpose ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 52)",
        "(line 283,col 9)-(line 283,col 89)",
        "(line 284,col 9)-(line 284,col 89)",
        "(line 285,col 9)-(line 285,col 66)",
        "(line 286,col 9)-(line 286,col 42)",
        "(line 287,col 9)-(line 287,col 55)",
        "(line 288,col 9)-(line 288,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testPremultiplyVector()",
      "begin_line": 292,
      "end_line": 305,
      "comment": " test preMultiply by vector ",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 52)",
        "(line 294,col 9)-(line 295,col 27)",
        "(line 296,col 9)-(line 297,col 83)",
        "(line 298,col 9)-(line 298,col 44)",
        "(line 299,col 9)-(line 304,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testPremultiply()",
      "begin_line": 307,
      "end_line": 330,
      "comment": "",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 47)",
        "(line 309,col 9)-(line 309,col 47)",
        "(line 310,col 9)-(line 310,col 47)",
        "(line 311,col 9)-(line 311,col 72)",
        "(line 313,col 9)-(line 313,col 58)",
        "(line 314,col 9)-(line 314,col 64)",
        "(line 315,col 9)-(line 315,col 59)",
        "(line 316,col 9)-(line 317,col 32)",
        "(line 318,col 9)-(line 319,col 32)",
        "(line 320,col 9)-(line 321,col 32)",
        "(line 322,col 9)-(line 323,col 32)",
        "(line 324,col 9)-(line 329,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testGetVectors()",
      "begin_line": 332,
      "end_line": 348,
      "comment": "",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 52)",
        "(line 334,col 9)-(line 334,col 74)",
        "(line 335,col 9)-(line 335,col 77)",
        "(line 336,col 9)-(line 341,col 9)",
        "(line 342,col 9)-(line 347,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testGetEntry()",
      "begin_line": 350,
      "end_line": 359,
      "comment": "",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 52)",
        "(line 352,col 9)-(line 352,col 72)",
        "(line 353,col 9)-(line 358,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testExamples()",
      "begin_line": 362,
      "end_line": 391,
      "comment": " test examples in user guide ",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 67)",
        "(line 365,col 9)-(line 365,col 54)",
        "(line 367,col 9)-(line 367,col 72)",
        "(line 368,col 9)-(line 368,col 55)",
        "(line 370,col 9)-(line 370,col 37)",
        "(line 371,col 9)-(line 371,col 45)",
        "(line 372,col 9)-(line 372,col 48)",
        "(line 374,col 9)-(line 374,col 82)",
        "(line 375,col 9)-(line 375,col 52)",
        "(line 376,col 9)-(line 376,col 55)",
        "(line 379,col 9)-(line 380,col 32)",
        "(line 381,col 9)-(line 381,col 71)",
        "(line 382,col 9)-(line 382,col 42)",
        "(line 383,col 9)-(line 383,col 95)",
        "(line 384,col 9)-(line 385,col 37)",
        "(line 386,col 9)-(line 387,col 37)",
        "(line 388,col 9)-(line 389,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testSubMatrix()",
      "begin_line": 394,
      "end_line": 456,
      "comment": " test submatrix accessors",
      "child_ranges": [
        "(line 395,col 9)-(line 395,col 55)",
        "(line 396,col 9)-(line 396,col 71)",
        "(line 397,col 9)-(line 397,col 71)",
        "(line 398,col 9)-(line 398,col 71)",
        "(line 399,col 9)-(line 399,col 71)",
        "(line 400,col 9)-(line 400,col 71)",
        "(line 401,col 9)-(line 401,col 73)",
        "(line 402,col 9)-(line 402,col 73)",
        "(line 403,col 9)-(line 403,col 71)",
        "(line 404,col 9)-(line 404,col 80)",
        "(line 405,col 9)-(line 405,col 80)",
        "(line 406,col 9)-(line 406,col 80)",
        "(line 407,col 9)-(line 408,col 68)",
        "(line 409,col 9)-(line 410,col 68)",
        "(line 411,col 9)-(line 412,col 71)",
        "(line 413,col 9)-(line 414,col 71)",
        "(line 415,col 9)-(line 416,col 68)",
        "(line 417,col 9)-(line 418,col 68)",
        "(line 420,col 9)-(line 425,col 9)",
        "(line 426,col 9)-(line 431,col 9)",
        "(line 432,col 9)-(line 437,col 9)",
        "(line 438,col 9)-(line 443,col 9)",
        "(line 444,col 9)-(line 449,col 9)",
        "(line 450,col 9)-(line 455,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testGetRowMatrix()",
      "begin_line": 458,
      "end_line": 476,
      "comment": "",
      "child_ranges": [
        "(line 459,col 9)-(line 459,col 55)",
        "(line 460,col 9)-(line 460,col 55)",
        "(line 461,col 9)-(line 461,col 55)",
        "(line 462,col 9)-(line 462,col 55)",
        "(line 463,col 9)-(line 463,col 55)",
        "(line 464,col 9)-(line 469,col 9)",
        "(line 470,col 9)-(line 475,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testGetColumnMatrix()",
      "begin_line": 478,
      "end_line": 496,
      "comment": "",
      "child_ranges": [
        "(line 479,col 9)-(line 479,col 55)",
        "(line 480,col 9)-(line 480,col 61)",
        "(line 481,col 9)-(line 481,col 61)",
        "(line 482,col 9)-(line 482,col 64)",
        "(line 483,col 9)-(line 483,col 64)",
        "(line 484,col 9)-(line 489,col 9)",
        "(line 490,col 9)-(line 495,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testGetRowVector()",
      "begin_line": 498,
      "end_line": 516,
      "comment": "",
      "child_ranges": [
        "(line 499,col 9)-(line 499,col 55)",
        "(line 500,col 9)-(line 500,col 58)",
        "(line 501,col 9)-(line 501,col 58)",
        "(line 502,col 9)-(line 502,col 55)",
        "(line 503,col 9)-(line 503,col 55)",
        "(line 504,col 9)-(line 509,col 9)",
        "(line 510,col 9)-(line 515,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testGetColumnVector()",
      "begin_line": 518,
      "end_line": 536,
      "comment": "",
      "child_ranges": [
        "(line 519,col 9)-(line 519,col 55)",
        "(line 520,col 9)-(line 520,col 57)",
        "(line 521,col 9)-(line 521,col 57)",
        "(line 522,col 9)-(line 522,col 64)",
        "(line 523,col 9)-(line 523,col 64)",
        "(line 524,col 9)-(line 529,col 9)",
        "(line 530,col 9)-(line 535,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.columnToVector(double[][])",
      "begin_line": 538,
      "end_line": 544,
      "comment": "",
      "child_ranges": [
        "(line 539,col 9)-(line 539,col 50)",
        "(line 540,col 9)-(line 542,col 9)",
        "(line 543,col 9)-(line 543,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testEqualsAndHashCode()",
      "begin_line": 546,
      "end_line": 557,
      "comment": "",
      "child_ranges": [
        "(line 547,col 9)-(line 547,col 58)",
        "(line 548,col 9)-(line 548,col 58)",
        "(line 549,col 9)-(line 549,col 63)",
        "(line 550,col 9)-(line 550,col 50)",
        "(line 551,col 9)-(line 551,col 50)",
        "(line 552,col 9)-(line 552,col 27)",
        "(line 553,col 9)-(line 553,col 28)",
        "(line 554,col 9)-(line 554,col 36)",
        "(line 555,col 9)-(line 555,col 34)",
        "(line 556,col 9)-(line 556,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testToString()",
      "begin_line": 559,
      "end_line": 565,
      "comment": "",
      "child_ranges": [
        "(line 560,col 9)-(line 560,col 58)",
        "(line 561,col 9)-(line 562,col 26)",
        "(line 563,col 9)-(line 563,col 39)",
        "(line 564,col 9)-(line 564,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testSetSubMatrix()",
      "begin_line": 567,
      "end_line": 644,
      "comment": "",
      "child_ranges": [
        "(line 568,col 9)-(line 568,col 58)",
        "(line 569,col 9)-(line 569,col 39)",
        "(line 570,col 9)-(line 571,col 75)",
        "(line 572,col 9)-(line 572,col 34)",
        "(line 574,col 9)-(line 574,col 39)",
        "(line 575,col 9)-(line 576,col 75)",
        "(line 577,col 9)-(line 577,col 34)",
        "(line 579,col 9)-(line 579,col 44)",
        "(line 580,col 9)-(line 581,col 76)",
        "(line 582,col 9)-(line 582,col 34)",
        "(line 585,col 9)-(line 587,col 62)",
        "(line 588,col 9)-(line 588,col 73)",
        "(line 589,col 9)-(line 590,col 66)",
        "(line 591,col 9)-(line 591,col 39)",
        "(line 594,col 9)-(line 599,col 9)",
        "(line 601,col 9)-(line 606,col 9)",
        "(line 607,col 9)-(line 612,col 9)",
        "(line 615,col 9)-(line 620,col 9)",
        "(line 621,col 9)-(line 626,col 9)",
        "(line 629,col 9)-(line 634,col 9)",
        "(line 637,col 9)-(line 642,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.assertClose(java.lang.String, org.apache.commons.math.linear.RealMatrix, org.apache.commons.math.linear.RealMatrix, double)",
      "begin_line": 649,
      "end_line": 652,
      "comment": " verifies that two matrices are close (1-norm) ",
      "child_ranges": [
        "(line 651,col 9)-(line 651,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.assertClose(java.lang.String, double[], double[], double)",
      "begin_line": 655,
      "end_line": 664,
      "comment": " verifies that two vectors are close (sup norm) ",
      "child_ranges": [
        "(line 657,col 9)-(line 659,col 9)",
        "(line 660,col 9)-(line 663,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.createSparseMatrix(double[][])",
      "begin_line": 666,
      "end_line": 674,
      "comment": "",
      "child_ranges": [
        "(line 667,col 9)-(line 667,col 84)",
        "(line 668,col 9)-(line 672,col 9)",
        "(line 673,col 9)-(line 673,col 22)"
      ]
    }
  ]
}