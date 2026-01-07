{
  "filepath": "/tmp/Math-46b/src/test/java/org/apache/commons/math/linear/SparseFieldMatrixTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SparseFieldMatrixTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 37,
      "end_line": 705,
      "comment": "\n * Test cases for the {@link SparseFieldMatrix} class.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "id"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " 3 x 3 identity matrix"
    },
    {
      "type": "field",
      "varNames": [
        "testData"
      ],
      "begin_line": 41,
      "end_line": 42,
      "comment": " Test data for group operations"
    },
    {
      "type": "field",
      "varNames": [
        "testDataLU"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testDataPlus2"
      ],
      "begin_line": 44,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testDataMinus"
      ],
      "begin_line": 46,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testDataRow1"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testDataCol3"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testDataInv"
      ],
      "begin_line": 50,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "preMultTest"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testData2"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testData2T"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testDataPlusInv"
      ],
      "begin_line": 55,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "luData"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " lu decomposition tests"
    },
    {
      "type": "field",
      "varNames": [
        "luDataLUDecomposition"
      ],
      "begin_line": 60,
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
      "type": "field",
      "varNames": [
        "field"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrixTest.SparseFieldMatrixTest()",
      "begin_line": 110,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 111,col 9)-(line 124,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrixTest.testDimensions()",
      "begin_line": 128,
      "end_line": 138,
      "comment": " test dimensions ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 69)",
        "(line 131,col 9)-(line 131,col 71)",
        "(line 132,col 9)-(line 132,col 78)",
        "(line 133,col 9)-(line 133,col 84)",
        "(line 134,col 9)-(line 134,col 62)",
        "(line 135,col 9)-(line 135,col 80)",
        "(line 136,col 9)-(line 136,col 86)",
        "(line 137,col 9)-(line 137,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrixTest.testCopyFunctions()",
      "begin_line": 141,
      "end_line": 151,
      "comment": " test copy functions ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 70)",
        "(line 144,col 9)-(line 144,col 45)",
        "(line 145,col 9)-(line 145,col 58)",
        "(line 146,col 9)-(line 146,col 38)",
        "(line 147,col 9)-(line 147,col 70)",
        "(line 148,col 9)-(line 148,col 45)",
        "(line 149,col 9)-(line 149,col 58)",
        "(line 150,col 9)-(line 150,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrixTest.testAdd()",
      "begin_line": 154,
      "end_line": 167,
      "comment": " test add ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 69)",
        "(line 157,col 9)-(line 157,col 75)",
        "(line 158,col 9)-(line 158,col 87)",
        "(line 159,col 9)-(line 159,col 54)",
        "(line 160,col 9)-(line 166,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrixTest.testAddFail()",
      "begin_line": 170,
      "end_line": 180,
      "comment": " test add failure ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 69)",
        "(line 173,col 9)-(line 173,col 71)",
        "(line 174,col 9)-(line 179,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrixTest.testPlusMinus()",
      "begin_line": 184,
      "end_line": 196,
      "comment": " test m-n \u003d m + -n ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 69)",
        "(line 187,col 9)-(line 187,col 72)",
        "(line 188,col 9)-(line 189,col 71)",
        "(line 190,col 9)-(line 195,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrixTest.testMultiply()",
      "begin_line": 199,
      "end_line": 223,
      "comment": " test multiply ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 69)",
        "(line 202,col 9)-(line 202,col 75)",
        "(line 203,col 9)-(line 203,col 70)",
        "(line 204,col 9)-(line 204,col 71)",
        "(line 205,col 9)-(line 206,col 32)",
        "(line 207,col 9)-(line 208,col 36)",
        "(line 209,col 9)-(line 210,col 32)",
        "(line 211,col 9)-(line 212,col 32)",
        "(line 213,col 9)-(line 214,col 32)",
        "(line 215,col 9)-(line 216,col 32)",
        "(line 217,col 9)-(line 222,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "d3"
      ],
      "begin_line": 227,
      "end_line": 227,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "d4"
      ],
      "begin_line": 228,
      "end_line": 228,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "d5"
      ],
      "begin_line": 229,
      "end_line": 229,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrixTest.testMultiply2()",
      "begin_line": 231,
      "end_line": 237,
      "comment": "",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 58)",
        "(line 234,col 9)-(line 234,col 58)",
        "(line 235,col 9)-(line 235,col 58)",
        "(line 236,col 9)-(line 236,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrixTest.testTrace()",
      "begin_line": 240,
      "end_line": 251,
      "comment": " test trace ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 57)",
        "(line 243,col 9)-(line 243,col 94)",
        "(line 244,col 9)-(line 244,col 42)",
        "(line 245,col 9)-(line 250,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrixTest.testScalarAdd()",
      "begin_line": 254,
      "end_line": 259,
      "comment": " test sclarAdd ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 63)",
        "(line 257,col 9)-(line 258,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrixTest.testOperate()",
      "begin_line": 262,
      "end_line": 276,
      "comment": " test operate ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 57)",
        "(line 265,col 9)-(line 266,col 32)",
        "(line 267,col 9)-(line 268,col 87)",
        "(line 269,col 9)-(line 269,col 44)",
        "(line 270,col 9)-(line 275,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrixTest.testMath209()",
      "begin_line": 279,
      "end_line": 288,
      "comment": " test issue MATH-209 ",
      "child_ranges": [
        "(line 281,col 9)-(line 282,col 132)",
        "(line 283,col 9)-(line 283,col 86)",
        "(line 284,col 9)-(line 284,col 59)",
        "(line 285,col 9)-(line 285,col 62)",
        "(line 286,col 9)-(line 286,col 62)",
        "(line 287,col 9)-(line 287,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrixTest.testTranspose()",
      "begin_line": 291,
      "end_line": 300,
      "comment": " test transpose ",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 63)",
        "(line 294,col 9)-(line 294,col 115)",
        "(line 295,col 9)-(line 295,col 115)",
        "(line 296,col 9)-(line 296,col 66)",
        "(line 297,col 9)-(line 297,col 42)",
        "(line 298,col 9)-(line 298,col 66)",
        "(line 299,col 9)-(line 299,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrixTest.testPremultiplyVector()",
      "begin_line": 303,
      "end_line": 317,
      "comment": " test preMultiply by vector ",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 63)",
        "(line 306,col 9)-(line 307,col 27)",
        "(line 308,col 9)-(line 309,col 95)",
        "(line 310,col 9)-(line 310,col 44)",
        "(line 311,col 9)-(line 316,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrixTest.testPremultiply()",
      "begin_line": 319,
      "end_line": 343,
      "comment": "",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 58)",
        "(line 322,col 9)-(line 322,col 58)",
        "(line 323,col 9)-(line 323,col 58)",
        "(line 324,col 9)-(line 324,col 72)",
        "(line 326,col 9)-(line 326,col 69)",
        "(line 327,col 9)-(line 327,col 75)",
        "(line 328,col 9)-(line 328,col 70)",
        "(line 329,col 9)-(line 330,col 32)",
        "(line 331,col 9)-(line 332,col 32)",
        "(line 333,col 9)-(line 334,col 32)",
        "(line 335,col 9)-(line 336,col 32)",
        "(line 337,col 9)-(line 342,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrixTest.testGetVectors()",
      "begin_line": 345,
      "end_line": 362,
      "comment": "",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 63)",
        "(line 348,col 9)-(line 348,col 74)",
        "(line 349,col 9)-(line 349,col 77)",
        "(line 350,col 9)-(line 355,col 9)",
        "(line 356,col 9)-(line 361,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrixTest.testGetEntry()",
      "begin_line": 364,
      "end_line": 374,
      "comment": "",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 63)",
        "(line 367,col 9)-(line 367,col 93)",
        "(line 368,col 9)-(line 373,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrixTest.testExamples()",
      "begin_line": 377,
      "end_line": 407,
      "comment": " test examples in user guide ",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 147)",
        "(line 381,col 9)-(line 381,col 65)",
        "(line 383,col 9)-(line 383,col 152)",
        "(line 384,col 9)-(line 384,col 66)",
        "(line 386,col 9)-(line 386,col 48)",
        "(line 387,col 9)-(line 387,col 52)",
        "(line 388,col 9)-(line 388,col 55)",
        "(line 390,col 9)-(line 390,col 108)",
        "(line 391,col 9)-(line 391,col 59)",
        "(line 392,col 9)-(line 392,col 62)",
        "(line 395,col 9)-(line 396,col 74)",
        "(line 397,col 9)-(line 397,col 82)",
        "(line 398,col 9)-(line 398,col 86)",
        "(line 399,col 9)-(line 399,col 112)",
        "(line 400,col 9)-(line 401,col 51)",
        "(line 402,col 9)-(line 403,col 51)",
        "(line 404,col 9)-(line 405,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrixTest.testSubMatrix()",
      "begin_line": 410,
      "end_line": 473,
      "comment": " test submatrix accessors",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 66)",
        "(line 413,col 9)-(line 413,col 82)",
        "(line 414,col 9)-(line 414,col 82)",
        "(line 415,col 9)-(line 415,col 82)",
        "(line 416,col 9)-(line 416,col 82)",
        "(line 417,col 9)-(line 417,col 82)",
        "(line 418,col 9)-(line 418,col 84)",
        "(line 419,col 9)-(line 419,col 84)",
        "(line 420,col 9)-(line 420,col 82)",
        "(line 421,col 9)-(line 421,col 87)",
        "(line 422,col 9)-(line 422,col 87)",
        "(line 423,col 9)-(line 423,col 87)",
        "(line 424,col 9)-(line 425,col 68)",
        "(line 426,col 9)-(line 427,col 68)",
        "(line 428,col 9)-(line 429,col 71)",
        "(line 430,col 9)-(line 431,col 71)",
        "(line 432,col 9)-(line 433,col 68)",
        "(line 434,col 9)-(line 435,col 68)",
        "(line 437,col 9)-(line 442,col 9)",
        "(line 443,col 9)-(line 448,col 9)",
        "(line 449,col 9)-(line 454,col 9)",
        "(line 455,col 9)-(line 460,col 9)",
        "(line 461,col 9)-(line 466,col 9)",
        "(line 467,col 9)-(line 472,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrixTest.testGetRowMatrix()",
      "begin_line": 475,
      "end_line": 494,
      "comment": "",
      "child_ranges": [
        "(line 477,col 9)-(line 477,col 66)",
        "(line 478,col 9)-(line 478,col 66)",
        "(line 479,col 9)-(line 479,col 66)",
        "(line 480,col 9)-(line 480,col 62)",
        "(line 481,col 9)-(line 481,col 62)",
        "(line 482,col 9)-(line 487,col 9)",
        "(line 488,col 9)-(line 493,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrixTest.testGetColumnMatrix()",
      "begin_line": 496,
      "end_line": 515,
      "comment": "",
      "child_ranges": [
        "(line 498,col 9)-(line 498,col 66)",
        "(line 499,col 9)-(line 499,col 72)",
        "(line 500,col 9)-(line 500,col 72)",
        "(line 501,col 9)-(line 501,col 71)",
        "(line 502,col 9)-(line 502,col 71)",
        "(line 503,col 9)-(line 508,col 9)",
        "(line 509,col 9)-(line 514,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrixTest.testGetRowVector()",
      "begin_line": 517,
      "end_line": 536,
      "comment": "",
      "child_ranges": [
        "(line 519,col 9)-(line 519,col 66)",
        "(line 520,col 9)-(line 520,col 81)",
        "(line 521,col 9)-(line 521,col 81)",
        "(line 522,col 9)-(line 522,col 62)",
        "(line 523,col 9)-(line 523,col 62)",
        "(line 524,col 9)-(line 529,col 9)",
        "(line 530,col 9)-(line 535,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrixTest.testGetColumnVector()",
      "begin_line": 538,
      "end_line": 557,
      "comment": "",
      "child_ranges": [
        "(line 540,col 9)-(line 540,col 66)",
        "(line 541,col 9)-(line 541,col 68)",
        "(line 542,col 9)-(line 542,col 68)",
        "(line 543,col 9)-(line 543,col 71)",
        "(line 544,col 9)-(line 544,col 71)",
        "(line 545,col 9)-(line 550,col 9)",
        "(line 551,col 9)-(line 556,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrixTest.columnToVector(org.apache.commons.math.fraction.Fraction[][])",
      "begin_line": 559,
      "end_line": 565,
      "comment": "",
      "child_ranges": [
        "(line 560,col 9)-(line 560,col 54)",
        "(line 561,col 9)-(line 563,col 9)",
        "(line 564,col 9)-(line 564,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrixTest.testEqualsAndHashCode()",
      "begin_line": 567,
      "end_line": 579,
      "comment": "",
      "child_ranges": [
        "(line 569,col 9)-(line 569,col 69)",
        "(line 570,col 9)-(line 570,col 80)",
        "(line 571,col 9)-(line 571,col 85)",
        "(line 572,col 9)-(line 572,col 57)",
        "(line 573,col 9)-(line 573,col 57)",
        "(line 574,col 9)-(line 574,col 34)",
        "(line 575,col 9)-(line 575,col 35)",
        "(line 576,col 9)-(line 576,col 43)",
        "(line 577,col 9)-(line 577,col 41)",
        "(line 578,col 9)-(line 578,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrixTest.testSetSubMatrix()",
      "begin_line": 592,
      "end_line": 669,
      "comment": "",
      "child_ranges": [
        "(line 594,col 9)-(line 594,col 69)",
        "(line 595,col 9)-(line 595,col 39)",
        "(line 596,col 9)-(line 597,col 183)",
        "(line 598,col 9)-(line 598,col 41)",
        "(line 600,col 9)-(line 600,col 39)",
        "(line 601,col 9)-(line 602,col 183)",
        "(line 603,col 9)-(line 603,col 41)",
        "(line 605,col 9)-(line 605,col 44)",
        "(line 606,col 9)-(line 607,col 184)",
        "(line 608,col 9)-(line 608,col 41)",
        "(line 611,col 9)-(line 613,col 226)",
        "(line 614,col 9)-(line 614,col 131)",
        "(line 615,col 9)-(line 616,col 234)",
        "(line 617,col 9)-(line 617,col 46)",
        "(line 620,col 9)-(line 625,col 9)",
        "(line 627,col 9)-(line 632,col 9)",
        "(line 633,col 9)-(line 638,col 9)",
        "(line 641,col 9)-(line 646,col 9)",
        "(line 647,col 9)-(line 652,col 9)",
        "(line 655,col 9)-(line 660,col 9)",
        "(line 663,col 9)-(line 668,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrixTest.assertClose(java.lang.String, org.apache.commons.math.linear.FieldMatrix\u003corg.apache.commons.math.fraction.Fraction\u003e, org.apache.commons.math.linear.FieldMatrix\u003corg.apache.commons.math.fraction.Fraction\u003e, double)",
      "begin_line": 674,
      "end_line": 682,
      "comment": " verifies that two matrices are close (1-norm) ",
      "child_ranges": [
        "(line 676,col 9)-(line 681,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrixTest.assertClose(java.lang.String, org.apache.commons.math.fraction.Fraction[], org.apache.commons.math.fraction.Fraction[], double)",
      "begin_line": 685,
      "end_line": 694,
      "comment": " verifies that two vectors are close (sup norm) ",
      "child_ranges": [
        "(line 687,col 9)-(line 689,col 9)",
        "(line 690,col 9)-(line 693,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrixTest.createSparseMatrix(org.apache.commons.math.fraction.Fraction[][])",
      "begin_line": 696,
      "end_line": 704,
      "comment": "",
      "child_ranges": [
        "(line 697,col 9)-(line 697,col 113)",
        "(line 698,col 9)-(line 702,col 9)",
        "(line 703,col 9)-(line 703,col 22)"
      ]
    }
  ]
}