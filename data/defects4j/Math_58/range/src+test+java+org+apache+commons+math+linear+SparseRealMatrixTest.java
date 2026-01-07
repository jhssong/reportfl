{
  "filepath": "/tmp/Math-58b/src/test/java/org/apache/commons/math/linear/SparseRealMatrixTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SparseRealMatrixTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 34,
      "end_line": 676,
      "comment": "\n * Test cases for the {@link OpenMapRealMatrix} class.\n *\n * @version $Revision$ $Date: 2008-11-07 06:48:13 -0800 (Fri, 07 Nov\n *          2008) $\n "
    },
    {
      "type": "field",
      "varNames": [
        "id"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " 3 x 3 identity matrix"
    },
    {
      "type": "field",
      "varNames": [
        "testData"
      ],
      "begin_line": 39,
      "end_line": 40,
      "comment": " Test data for group operations"
    },
    {
      "type": "field",
      "varNames": [
        "testDataLU"
      ],
      "begin_line": 41,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testDataPlus2"
      ],
      "begin_line": 43,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testDataMinus"
      ],
      "begin_line": 45,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testDataRow1"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testDataCol3"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testDataInv"
      ],
      "begin_line": 49,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "preMultTest"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testData2"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testData2T"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testDataPlusInv"
      ],
      "begin_line": 54,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "luData"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " lu decomposition tests"
    },
    {
      "type": "field",
      "varNames": [
        "luDataLUDecomposition"
      ],
      "begin_line": 59,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "singular"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " singular matrices"
    },
    {
      "type": "field",
      "varNames": [
        "bigSingular"
      ],
      "begin_line": 64,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "detData"
      ],
      "begin_line": 72,
      "end_line": 73,
      "comment": " 2nd"
    },
    {
      "type": "field",
      "varNames": [
        "detData2"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testVector"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " vectors"
    },
    {
      "type": "field",
      "varNames": [
        "testVector2"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subTestData"
      ],
      "begin_line": 81,
      "end_line": 82,
      "comment": " submatrix accessor tests"
    },
    {
      "type": "field",
      "varNames": [
        "subRows02Cols13"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " array selections"
    },
    {
      "type": "field",
      "varNames": [
        "subRows03Cols12"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subRows03Cols123"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subRows20Cols123"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " effective permutations"
    },
    {
      "type": "field",
      "varNames": [
        "subRows31Cols31"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subRows01Cols23"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " contiguous ranges"
    },
    {
      "type": "field",
      "varNames": [
        "subRows23Cols00"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subRows00Cols33"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subRow0"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " row matrices"
    },
    {
      "type": "field",
      "varNames": [
        "subRow3"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subColumn1"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " column matrices"
    },
    {
      "type": "field",
      "varNames": [
        "subColumn3"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entryTolerance"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": " tolerances"
    },
    {
      "type": "field",
      "varNames": [
        "normTolerance"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.SparseRealMatrixTest(java.lang.String)",
      "begin_line": 110,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testDimensions()",
      "begin_line": 115,
      "end_line": 124,
      "comment": " test dimensions ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 59)",
        "(line 117,col 9)-(line 117,col 61)",
        "(line 118,col 9)-(line 118,col 71)",
        "(line 119,col 9)-(line 119,col 77)",
        "(line 120,col 9)-(line 120,col 55)",
        "(line 121,col 9)-(line 121,col 73)",
        "(line 122,col 9)-(line 122,col 79)",
        "(line 123,col 9)-(line 123,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testCopyFunctions()",
      "begin_line": 127,
      "end_line": 136,
      "comment": " test copy functions ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 60)",
        "(line 129,col 9)-(line 129,col 34)",
        "(line 130,col 9)-(line 130,col 51)",
        "(line 131,col 9)-(line 131,col 31)",
        "(line 132,col 9)-(line 132,col 60)",
        "(line 133,col 9)-(line 133,col 34)",
        "(line 134,col 9)-(line 134,col 51)",
        "(line 135,col 9)-(line 135,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testAdd()",
      "begin_line": 139,
      "end_line": 151,
      "comment": " test add ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 59)",
        "(line 141,col 9)-(line 141,col 65)",
        "(line 142,col 9)-(line 142,col 77)",
        "(line 143,col 9)-(line 143,col 43)",
        "(line 144,col 9)-(line 150,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testAddFail()",
      "begin_line": 154,
      "end_line": 163,
      "comment": " test add failure ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 59)",
        "(line 156,col 9)-(line 156,col 61)",
        "(line 157,col 9)-(line 162,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testNorm()",
      "begin_line": 166,
      "end_line": 171,
      "comment": " test norm ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 59)",
        "(line 168,col 9)-(line 168,col 61)",
        "(line 169,col 9)-(line 169,col 72)",
        "(line 170,col 9)-(line 170,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testPlusMinus()",
      "begin_line": 174,
      "end_line": 185,
      "comment": " test m-n \u003d m + -n ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 59)",
        "(line 176,col 9)-(line 176,col 62)",
        "(line 177,col 9)-(line 178,col 58)",
        "(line 179,col 9)-(line 184,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testMultiply()",
      "begin_line": 188,
      "end_line": 211,
      "comment": " test multiply ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 59)",
        "(line 190,col 9)-(line 190,col 65)",
        "(line 191,col 9)-(line 191,col 60)",
        "(line 192,col 9)-(line 192,col 61)",
        "(line 193,col 9)-(line 194,col 32)",
        "(line 195,col 9)-(line 196,col 36)",
        "(line 197,col 9)-(line 198,col 32)",
        "(line 199,col 9)-(line 200,col 32)",
        "(line 201,col 9)-(line 202,col 32)",
        "(line 203,col 9)-(line 204,col 32)",
        "(line 205,col 9)-(line 210,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "d3"
      ],
      "begin_line": 215,
      "end_line": 215,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "d4"
      ],
      "begin_line": 216,
      "end_line": 216,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "d5"
      ],
      "begin_line": 217,
      "end_line": 217,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testMultiply2()",
      "begin_line": 219,
      "end_line": 224,
      "comment": "",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 47)",
        "(line 221,col 9)-(line 221,col 47)",
        "(line 222,col 9)-(line 222,col 47)",
        "(line 223,col 9)-(line 223,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testTrace()",
      "begin_line": 227,
      "end_line": 237,
      "comment": " test trace ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 46)",
        "(line 229,col 9)-(line 229,col 73)",
        "(line 230,col 9)-(line 230,col 42)",
        "(line 231,col 9)-(line 236,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testScalarAdd()",
      "begin_line": 240,
      "end_line": 244,
      "comment": " test sclarAdd ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 52)",
        "(line 242,col 9)-(line 243,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testOperate()",
      "begin_line": 247,
      "end_line": 260,
      "comment": " test operate ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 46)",
        "(line 249,col 9)-(line 250,col 32)",
        "(line 251,col 9)-(line 252,col 76)",
        "(line 253,col 9)-(line 253,col 44)",
        "(line 254,col 9)-(line 259,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testMath209()",
      "begin_line": 263,
      "end_line": 271,
      "comment": " test issue MATH-209 ",
      "child_ranges": [
        "(line 264,col 9)-(line 265,col 48)",
        "(line 266,col 9)-(line 266,col 54)",
        "(line 267,col 9)-(line 267,col 52)",
        "(line 268,col 9)-(line 268,col 41)",
        "(line 269,col 9)-(line 269,col 41)",
        "(line 270,col 9)-(line 270,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testTranspose()",
      "begin_line": 274,
      "end_line": 283,
      "comment": " test transpose ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 52)",
        "(line 277,col 9)-(line 277,col 89)",
        "(line 278,col 9)-(line 278,col 89)",
        "(line 279,col 9)-(line 279,col 66)",
        "(line 280,col 9)-(line 280,col 42)",
        "(line 281,col 9)-(line 281,col 55)",
        "(line 282,col 9)-(line 282,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testPremultiplyVector()",
      "begin_line": 286,
      "end_line": 299,
      "comment": " test preMultiply by vector ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 52)",
        "(line 288,col 9)-(line 289,col 27)",
        "(line 290,col 9)-(line 291,col 84)",
        "(line 292,col 9)-(line 292,col 44)",
        "(line 293,col 9)-(line 298,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testPremultiply()",
      "begin_line": 301,
      "end_line": 324,
      "comment": "",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 47)",
        "(line 303,col 9)-(line 303,col 47)",
        "(line 304,col 9)-(line 304,col 47)",
        "(line 305,col 9)-(line 305,col 72)",
        "(line 307,col 9)-(line 307,col 59)",
        "(line 308,col 9)-(line 308,col 65)",
        "(line 309,col 9)-(line 309,col 60)",
        "(line 310,col 9)-(line 311,col 32)",
        "(line 312,col 9)-(line 313,col 32)",
        "(line 314,col 9)-(line 315,col 32)",
        "(line 316,col 9)-(line 317,col 32)",
        "(line 318,col 9)-(line 323,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testGetVectors()",
      "begin_line": 326,
      "end_line": 342,
      "comment": "",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 52)",
        "(line 328,col 9)-(line 328,col 74)",
        "(line 329,col 9)-(line 329,col 77)",
        "(line 330,col 9)-(line 335,col 9)",
        "(line 336,col 9)-(line 341,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testGetEntry()",
      "begin_line": 344,
      "end_line": 353,
      "comment": "",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 52)",
        "(line 346,col 9)-(line 346,col 72)",
        "(line 347,col 9)-(line 352,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testExamples()",
      "begin_line": 356,
      "end_line": 385,
      "comment": " test examples in user guide ",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 67)",
        "(line 359,col 9)-(line 359,col 54)",
        "(line 361,col 9)-(line 361,col 72)",
        "(line 362,col 9)-(line 362,col 55)",
        "(line 364,col 9)-(line 364,col 37)",
        "(line 365,col 9)-(line 365,col 45)",
        "(line 366,col 9)-(line 366,col 48)",
        "(line 368,col 9)-(line 368,col 82)",
        "(line 369,col 9)-(line 369,col 52)",
        "(line 370,col 9)-(line 370,col 55)",
        "(line 373,col 9)-(line 374,col 32)",
        "(line 375,col 9)-(line 375,col 71)",
        "(line 376,col 9)-(line 376,col 42)",
        "(line 377,col 9)-(line 377,col 95)",
        "(line 378,col 9)-(line 379,col 37)",
        "(line 380,col 9)-(line 381,col 37)",
        "(line 382,col 9)-(line 383,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testSubMatrix()",
      "begin_line": 388,
      "end_line": 450,
      "comment": " test submatrix accessors",
      "child_ranges": [
        "(line 389,col 9)-(line 389,col 55)",
        "(line 390,col 9)-(line 390,col 71)",
        "(line 391,col 9)-(line 391,col 71)",
        "(line 392,col 9)-(line 392,col 71)",
        "(line 393,col 9)-(line 393,col 71)",
        "(line 394,col 9)-(line 394,col 71)",
        "(line 395,col 9)-(line 395,col 73)",
        "(line 396,col 9)-(line 396,col 73)",
        "(line 397,col 9)-(line 397,col 71)",
        "(line 398,col 9)-(line 398,col 80)",
        "(line 399,col 9)-(line 399,col 80)",
        "(line 400,col 9)-(line 400,col 80)",
        "(line 401,col 9)-(line 402,col 68)",
        "(line 403,col 9)-(line 404,col 68)",
        "(line 405,col 9)-(line 406,col 71)",
        "(line 407,col 9)-(line 408,col 71)",
        "(line 409,col 9)-(line 410,col 68)",
        "(line 411,col 9)-(line 412,col 68)",
        "(line 414,col 9)-(line 419,col 9)",
        "(line 420,col 9)-(line 425,col 9)",
        "(line 426,col 9)-(line 431,col 9)",
        "(line 432,col 9)-(line 437,col 9)",
        "(line 438,col 9)-(line 443,col 9)",
        "(line 444,col 9)-(line 449,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testGetRowMatrix()",
      "begin_line": 452,
      "end_line": 470,
      "comment": "",
      "child_ranges": [
        "(line 453,col 9)-(line 453,col 55)",
        "(line 454,col 9)-(line 454,col 55)",
        "(line 455,col 9)-(line 455,col 55)",
        "(line 456,col 9)-(line 456,col 55)",
        "(line 457,col 9)-(line 457,col 55)",
        "(line 458,col 9)-(line 463,col 9)",
        "(line 464,col 9)-(line 469,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testGetColumnMatrix()",
      "begin_line": 472,
      "end_line": 490,
      "comment": "",
      "child_ranges": [
        "(line 473,col 9)-(line 473,col 55)",
        "(line 474,col 9)-(line 474,col 61)",
        "(line 475,col 9)-(line 475,col 61)",
        "(line 476,col 9)-(line 476,col 64)",
        "(line 477,col 9)-(line 477,col 64)",
        "(line 478,col 9)-(line 483,col 9)",
        "(line 484,col 9)-(line 489,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testGetRowVector()",
      "begin_line": 492,
      "end_line": 510,
      "comment": "",
      "child_ranges": [
        "(line 493,col 9)-(line 493,col 55)",
        "(line 494,col 9)-(line 494,col 59)",
        "(line 495,col 9)-(line 495,col 59)",
        "(line 496,col 9)-(line 496,col 55)",
        "(line 497,col 9)-(line 497,col 55)",
        "(line 498,col 9)-(line 503,col 9)",
        "(line 504,col 9)-(line 509,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testGetColumnVector()",
      "begin_line": 512,
      "end_line": 530,
      "comment": "",
      "child_ranges": [
        "(line 513,col 9)-(line 513,col 55)",
        "(line 514,col 9)-(line 514,col 57)",
        "(line 515,col 9)-(line 515,col 57)",
        "(line 516,col 9)-(line 516,col 64)",
        "(line 517,col 9)-(line 517,col 64)",
        "(line 518,col 9)-(line 523,col 9)",
        "(line 524,col 9)-(line 529,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.columnToVector(double[][])",
      "begin_line": 532,
      "end_line": 538,
      "comment": "",
      "child_ranges": [
        "(line 533,col 9)-(line 533,col 50)",
        "(line 534,col 9)-(line 536,col 9)",
        "(line 537,col 9)-(line 537,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testEqualsAndHashCode()",
      "begin_line": 540,
      "end_line": 551,
      "comment": "",
      "child_ranges": [
        "(line 541,col 9)-(line 541,col 59)",
        "(line 542,col 9)-(line 542,col 40)",
        "(line 543,col 9)-(line 543,col 65)",
        "(line 544,col 9)-(line 544,col 50)",
        "(line 545,col 9)-(line 545,col 50)",
        "(line 546,col 9)-(line 546,col 27)",
        "(line 547,col 9)-(line 547,col 28)",
        "(line 548,col 9)-(line 548,col 36)",
        "(line 549,col 9)-(line 549,col 34)",
        "(line 550,col 9)-(line 550,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testToString()",
      "begin_line": 553,
      "end_line": 559,
      "comment": "",
      "child_ranges": [
        "(line 554,col 9)-(line 554,col 59)",
        "(line 555,col 9)-(line 556,col 26)",
        "(line 557,col 9)-(line 557,col 40)",
        "(line 558,col 9)-(line 558,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testSetSubMatrix()",
      "begin_line": 561,
      "end_line": 638,
      "comment": "",
      "child_ranges": [
        "(line 562,col 9)-(line 562,col 59)",
        "(line 563,col 9)-(line 563,col 39)",
        "(line 564,col 9)-(line 565,col 75)",
        "(line 566,col 9)-(line 566,col 34)",
        "(line 568,col 9)-(line 568,col 39)",
        "(line 569,col 9)-(line 570,col 75)",
        "(line 571,col 9)-(line 571,col 34)",
        "(line 573,col 9)-(line 573,col 44)",
        "(line 574,col 9)-(line 575,col 76)",
        "(line 576,col 9)-(line 576,col 34)",
        "(line 579,col 9)-(line 581,col 58)",
        "(line 582,col 9)-(line 582,col 73)",
        "(line 583,col 9)-(line 584,col 66)",
        "(line 585,col 9)-(line 585,col 39)",
        "(line 588,col 9)-(line 593,col 9)",
        "(line 595,col 9)-(line 600,col 9)",
        "(line 601,col 9)-(line 606,col 9)",
        "(line 609,col 9)-(line 614,col 9)",
        "(line 615,col 9)-(line 620,col 9)",
        "(line 623,col 9)-(line 628,col 9)",
        "(line 631,col 9)-(line 636,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testSerial()",
      "begin_line": 640,
      "end_line": 643,
      "comment": "",
      "child_ranges": [
        "(line 641,col 9)-(line 641,col 59)",
        "(line 642,col 9)-(line 642,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.assertClose(java.lang.String, org.apache.commons.math.linear.RealMatrix, org.apache.commons.math.linear.RealMatrix, double)",
      "begin_line": 648,
      "end_line": 651,
      "comment": " verifies that two matrices are close (1-norm) ",
      "child_ranges": [
        "(line 650,col 9)-(line 650,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.assertClose(java.lang.String, double[], double[], double)",
      "begin_line": 654,
      "end_line": 663,
      "comment": " verifies that two vectors are close (sup norm) ",
      "child_ranges": [
        "(line 656,col 9)-(line 658,col 9)",
        "(line 659,col 9)-(line 662,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.createSparseMatrix(double[][])",
      "begin_line": 665,
      "end_line": 673,
      "comment": "",
      "child_ranges": [
        "(line 666,col 9)-(line 666,col 86)",
        "(line 667,col 9)-(line 671,col 9)",
        "(line 672,col 9)-(line 672,col 22)"
      ]
    }
  ]
}