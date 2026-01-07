{
  "filepath": "/tmp/Math-56b/src/test/java/org/apache/commons/math/linear/SparseRealMatrixTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SparseRealMatrixTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 34,
      "end_line": 696,
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
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testDimensions()",
      "begin_line": 111,
      "end_line": 121,
      "comment": " test dimensions ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 59)",
        "(line 114,col 9)-(line 114,col 61)",
        "(line 115,col 9)-(line 115,col 78)",
        "(line 116,col 9)-(line 116,col 84)",
        "(line 117,col 9)-(line 117,col 62)",
        "(line 118,col 9)-(line 118,col 80)",
        "(line 119,col 9)-(line 119,col 86)",
        "(line 120,col 9)-(line 120,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testCopyFunctions()",
      "begin_line": 124,
      "end_line": 134,
      "comment": " test copy functions ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 60)",
        "(line 127,col 9)-(line 127,col 34)",
        "(line 128,col 9)-(line 128,col 58)",
        "(line 129,col 9)-(line 129,col 38)",
        "(line 130,col 9)-(line 130,col 60)",
        "(line 131,col 9)-(line 131,col 34)",
        "(line 132,col 9)-(line 132,col 58)",
        "(line 133,col 9)-(line 133,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testAdd()",
      "begin_line": 137,
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
      "end_line": 172,
      "comment": " test norm ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 59)",
        "(line 169,col 9)-(line 169,col 61)",
        "(line 170,col 9)-(line 170,col 79)",
        "(line 171,col 9)-(line 171,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testPlusMinus()",
      "begin_line": 175,
      "end_line": 187,
      "comment": " test m-n \u003d m + -n ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 59)",
        "(line 178,col 9)-(line 178,col 62)",
        "(line 179,col 9)-(line 180,col 58)",
        "(line 181,col 9)-(line 186,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testMultiply()",
      "begin_line": 190,
      "end_line": 214,
      "comment": " test multiply ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 59)",
        "(line 193,col 9)-(line 193,col 65)",
        "(line 194,col 9)-(line 194,col 60)",
        "(line 195,col 9)-(line 195,col 61)",
        "(line 196,col 9)-(line 197,col 32)",
        "(line 198,col 9)-(line 199,col 36)",
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
      "end_line": 242,
      "comment": " test trace ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 46)",
        "(line 234,col 9)-(line 234,col 80)",
        "(line 235,col 9)-(line 235,col 42)",
        "(line 236,col 9)-(line 241,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testScalarAdd()",
      "begin_line": 245,
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
      "end_line": 267,
      "comment": " test operate ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 46)",
        "(line 256,col 9)-(line 257,col 32)",
        "(line 258,col 9)-(line 259,col 76)",
        "(line 260,col 9)-(line 260,col 44)",
        "(line 261,col 9)-(line 266,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testMath209()",
      "begin_line": 270,
      "end_line": 279,
      "comment": " test issue MATH-209 ",
      "child_ranges": [
        "(line 272,col 9)-(line 273,col 48)",
        "(line 274,col 9)-(line 274,col 54)",
        "(line 275,col 9)-(line 275,col 59)",
        "(line 276,col 9)-(line 276,col 48)",
        "(line 277,col 9)-(line 277,col 48)",
        "(line 278,col 9)-(line 278,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testTranspose()",
      "begin_line": 282,
      "end_line": 291,
      "comment": " test transpose ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 52)",
        "(line 285,col 9)-(line 285,col 89)",
        "(line 286,col 9)-(line 286,col 89)",
        "(line 287,col 9)-(line 287,col 66)",
        "(line 288,col 9)-(line 288,col 42)",
        "(line 289,col 9)-(line 289,col 55)",
        "(line 290,col 9)-(line 290,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testPremultiplyVector()",
      "begin_line": 294,
      "end_line": 308,
      "comment": " test preMultiply by vector ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 52)",
        "(line 297,col 9)-(line 298,col 27)",
        "(line 299,col 9)-(line 300,col 84)",
        "(line 301,col 9)-(line 301,col 44)",
        "(line 302,col 9)-(line 307,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testPremultiply()",
      "begin_line": 310,
      "end_line": 334,
      "comment": "",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 47)",
        "(line 313,col 9)-(line 313,col 47)",
        "(line 314,col 9)-(line 314,col 47)",
        "(line 315,col 9)-(line 315,col 72)",
        "(line 317,col 9)-(line 317,col 59)",
        "(line 318,col 9)-(line 318,col 65)",
        "(line 319,col 9)-(line 319,col 60)",
        "(line 320,col 9)-(line 321,col 32)",
        "(line 322,col 9)-(line 323,col 32)",
        "(line 324,col 9)-(line 325,col 32)",
        "(line 326,col 9)-(line 327,col 32)",
        "(line 328,col 9)-(line 333,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testGetVectors()",
      "begin_line": 336,
      "end_line": 353,
      "comment": "",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 52)",
        "(line 339,col 9)-(line 339,col 74)",
        "(line 340,col 9)-(line 340,col 77)",
        "(line 341,col 9)-(line 346,col 9)",
        "(line 347,col 9)-(line 352,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testGetEntry()",
      "begin_line": 355,
      "end_line": 365,
      "comment": "",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 52)",
        "(line 358,col 9)-(line 358,col 79)",
        "(line 359,col 9)-(line 364,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testExamples()",
      "begin_line": 368,
      "end_line": 398,
      "comment": " test examples in user guide ",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 67)",
        "(line 372,col 9)-(line 372,col 54)",
        "(line 374,col 9)-(line 374,col 72)",
        "(line 375,col 9)-(line 375,col 55)",
        "(line 377,col 9)-(line 377,col 37)",
        "(line 378,col 9)-(line 378,col 52)",
        "(line 379,col 9)-(line 379,col 55)",
        "(line 381,col 9)-(line 381,col 82)",
        "(line 382,col 9)-(line 382,col 59)",
        "(line 383,col 9)-(line 383,col 62)",
        "(line 386,col 9)-(line 387,col 32)",
        "(line 388,col 9)-(line 388,col 71)",
        "(line 389,col 9)-(line 389,col 42)",
        "(line 390,col 9)-(line 390,col 95)",
        "(line 391,col 9)-(line 392,col 37)",
        "(line 393,col 9)-(line 394,col 37)",
        "(line 395,col 9)-(line 396,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testSubMatrix()",
      "begin_line": 401,
      "end_line": 464,
      "comment": " test submatrix accessors",
      "child_ranges": [
        "(line 403,col 9)-(line 403,col 55)",
        "(line 404,col 9)-(line 404,col 71)",
        "(line 405,col 9)-(line 405,col 71)",
        "(line 406,col 9)-(line 406,col 71)",
        "(line 407,col 9)-(line 407,col 71)",
        "(line 408,col 9)-(line 408,col 71)",
        "(line 409,col 9)-(line 409,col 73)",
        "(line 410,col 9)-(line 410,col 73)",
        "(line 411,col 9)-(line 411,col 71)",
        "(line 412,col 9)-(line 412,col 87)",
        "(line 413,col 9)-(line 413,col 87)",
        "(line 414,col 9)-(line 414,col 87)",
        "(line 415,col 9)-(line 416,col 68)",
        "(line 417,col 9)-(line 418,col 68)",
        "(line 419,col 9)-(line 420,col 71)",
        "(line 421,col 9)-(line 422,col 71)",
        "(line 423,col 9)-(line 424,col 68)",
        "(line 425,col 9)-(line 426,col 68)",
        "(line 428,col 9)-(line 433,col 9)",
        "(line 434,col 9)-(line 439,col 9)",
        "(line 440,col 9)-(line 445,col 9)",
        "(line 446,col 9)-(line 451,col 9)",
        "(line 452,col 9)-(line 457,col 9)",
        "(line 458,col 9)-(line 463,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testGetRowMatrix()",
      "begin_line": 466,
      "end_line": 485,
      "comment": "",
      "child_ranges": [
        "(line 468,col 9)-(line 468,col 55)",
        "(line 469,col 9)-(line 469,col 55)",
        "(line 470,col 9)-(line 470,col 55)",
        "(line 471,col 9)-(line 471,col 62)",
        "(line 472,col 9)-(line 472,col 62)",
        "(line 473,col 9)-(line 478,col 9)",
        "(line 479,col 9)-(line 484,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testGetColumnMatrix()",
      "begin_line": 487,
      "end_line": 506,
      "comment": "",
      "child_ranges": [
        "(line 489,col 9)-(line 489,col 55)",
        "(line 490,col 9)-(line 490,col 61)",
        "(line 491,col 9)-(line 491,col 61)",
        "(line 492,col 9)-(line 492,col 71)",
        "(line 493,col 9)-(line 493,col 71)",
        "(line 494,col 9)-(line 499,col 9)",
        "(line 500,col 9)-(line 505,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testGetRowVector()",
      "begin_line": 508,
      "end_line": 527,
      "comment": "",
      "child_ranges": [
        "(line 510,col 9)-(line 510,col 55)",
        "(line 511,col 9)-(line 511,col 59)",
        "(line 512,col 9)-(line 512,col 59)",
        "(line 513,col 9)-(line 513,col 62)",
        "(line 514,col 9)-(line 514,col 62)",
        "(line 515,col 9)-(line 520,col 9)",
        "(line 521,col 9)-(line 526,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testGetColumnVector()",
      "begin_line": 529,
      "end_line": 548,
      "comment": "",
      "child_ranges": [
        "(line 531,col 9)-(line 531,col 55)",
        "(line 532,col 9)-(line 532,col 57)",
        "(line 533,col 9)-(line 533,col 57)",
        "(line 534,col 9)-(line 534,col 71)",
        "(line 535,col 9)-(line 535,col 71)",
        "(line 536,col 9)-(line 541,col 9)",
        "(line 542,col 9)-(line 547,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.columnToVector(double[][])",
      "begin_line": 550,
      "end_line": 556,
      "comment": "",
      "child_ranges": [
        "(line 551,col 9)-(line 551,col 50)",
        "(line 552,col 9)-(line 554,col 9)",
        "(line 555,col 9)-(line 555,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testEqualsAndHashCode()",
      "begin_line": 558,
      "end_line": 570,
      "comment": "",
      "child_ranges": [
        "(line 560,col 9)-(line 560,col 59)",
        "(line 561,col 9)-(line 561,col 40)",
        "(line 562,col 9)-(line 562,col 65)",
        "(line 563,col 9)-(line 563,col 57)",
        "(line 564,col 9)-(line 564,col 57)",
        "(line 565,col 9)-(line 565,col 34)",
        "(line 566,col 9)-(line 566,col 35)",
        "(line 567,col 9)-(line 567,col 43)",
        "(line 568,col 9)-(line 568,col 41)",
        "(line 569,col 9)-(line 569,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testToString()",
      "begin_line": 572,
      "end_line": 579,
      "comment": "",
      "child_ranges": [
        "(line 574,col 9)-(line 574,col 59)",
        "(line 575,col 9)-(line 576,col 26)",
        "(line 577,col 9)-(line 577,col 40)",
        "(line 578,col 9)-(line 578,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testSetSubMatrix()",
      "begin_line": 581,
      "end_line": 659,
      "comment": "",
      "child_ranges": [
        "(line 583,col 9)-(line 583,col 59)",
        "(line 584,col 9)-(line 584,col 39)",
        "(line 585,col 9)-(line 586,col 75)",
        "(line 587,col 9)-(line 587,col 41)",
        "(line 589,col 9)-(line 589,col 39)",
        "(line 590,col 9)-(line 591,col 75)",
        "(line 592,col 9)-(line 592,col 41)",
        "(line 594,col 9)-(line 594,col 44)",
        "(line 595,col 9)-(line 596,col 76)",
        "(line 597,col 9)-(line 597,col 41)",
        "(line 600,col 9)-(line 602,col 58)",
        "(line 603,col 9)-(line 603,col 73)",
        "(line 604,col 9)-(line 605,col 66)",
        "(line 606,col 9)-(line 606,col 46)",
        "(line 609,col 9)-(line 614,col 9)",
        "(line 616,col 9)-(line 621,col 9)",
        "(line 622,col 9)-(line 627,col 9)",
        "(line 630,col 9)-(line 635,col 9)",
        "(line 636,col 9)-(line 641,col 9)",
        "(line 644,col 9)-(line 649,col 9)",
        "(line 652,col 9)-(line 657,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testSerial()",
      "begin_line": 661,
      "end_line": 665,
      "comment": "",
      "child_ranges": [
        "(line 663,col 9)-(line 663,col 59)",
        "(line 664,col 9)-(line 664,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.assertClose(java.lang.String, org.apache.commons.math.linear.RealMatrix, org.apache.commons.math.linear.RealMatrix, double)",
      "begin_line": 670,
      "end_line": 673,
      "comment": " verifies that two matrices are close (1-norm) ",
      "child_ranges": [
        "(line 672,col 9)-(line 672,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.assertClose(java.lang.String, double[], double[], double)",
      "begin_line": 676,
      "end_line": 685,
      "comment": " verifies that two vectors are close (sup norm) ",
      "child_ranges": [
        "(line 678,col 9)-(line 680,col 9)",
        "(line 681,col 9)-(line 684,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.createSparseMatrix(double[][])",
      "begin_line": 687,
      "end_line": 695,
      "comment": "",
      "child_ranges": [
        "(line 688,col 9)-(line 688,col 86)",
        "(line 689,col 9)-(line 693,col 9)",
        "(line 694,col 9)-(line 694,col 22)"
      ]
    }
  ]
}