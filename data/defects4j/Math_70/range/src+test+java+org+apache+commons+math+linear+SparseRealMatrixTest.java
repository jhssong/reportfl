{
  "filepath": "/tmp/Math-70b/src/test/java/org/apache/commons/math/linear/SparseRealMatrixTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SparseRealMatrixTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 29,
      "end_line": 671,
      "comment": "\n * Test cases for the {@link OpenMapRealMatrix} class.\n *\n * @version $Revision$ $Date: 2008-11-07 06:48:13 -0800 (Fri, 07 Nov\n *          2008) $\n "
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
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testDimensions()",
      "begin_line": 110,
      "end_line": 119,
      "comment": " test dimensions ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 59)",
        "(line 112,col 9)-(line 112,col 61)",
        "(line 113,col 9)-(line 113,col 71)",
        "(line 114,col 9)-(line 114,col 77)",
        "(line 115,col 9)-(line 115,col 55)",
        "(line 116,col 9)-(line 116,col 73)",
        "(line 117,col 9)-(line 117,col 79)",
        "(line 118,col 9)-(line 118,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testCopyFunctions()",
      "begin_line": 122,
      "end_line": 131,
      "comment": " test copy functions ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 60)",
        "(line 124,col 9)-(line 124,col 34)",
        "(line 125,col 9)-(line 125,col 51)",
        "(line 126,col 9)-(line 126,col 31)",
        "(line 127,col 9)-(line 127,col 60)",
        "(line 128,col 9)-(line 128,col 34)",
        "(line 129,col 9)-(line 129,col 51)",
        "(line 130,col 9)-(line 130,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testAdd()",
      "begin_line": 134,
      "end_line": 146,
      "comment": " test add ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 59)",
        "(line 136,col 9)-(line 136,col 65)",
        "(line 137,col 9)-(line 137,col 77)",
        "(line 138,col 9)-(line 138,col 43)",
        "(line 139,col 9)-(line 145,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testAddFail()",
      "begin_line": 149,
      "end_line": 158,
      "comment": " test add failure ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 59)",
        "(line 151,col 9)-(line 151,col 61)",
        "(line 152,col 9)-(line 157,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testNorm()",
      "begin_line": 161,
      "end_line": 166,
      "comment": " test norm ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 59)",
        "(line 163,col 9)-(line 163,col 61)",
        "(line 164,col 9)-(line 164,col 72)",
        "(line 165,col 9)-(line 165,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testPlusMinus()",
      "begin_line": 169,
      "end_line": 180,
      "comment": " test m-n \u003d m + -n ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 59)",
        "(line 171,col 9)-(line 171,col 62)",
        "(line 172,col 9)-(line 173,col 58)",
        "(line 174,col 9)-(line 179,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testMultiply()",
      "begin_line": 183,
      "end_line": 206,
      "comment": " test multiply ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 59)",
        "(line 185,col 9)-(line 185,col 65)",
        "(line 186,col 9)-(line 186,col 60)",
        "(line 187,col 9)-(line 187,col 61)",
        "(line 188,col 9)-(line 189,col 32)",
        "(line 190,col 9)-(line 191,col 36)",
        "(line 192,col 9)-(line 193,col 32)",
        "(line 194,col 9)-(line 195,col 32)",
        "(line 196,col 9)-(line 197,col 32)",
        "(line 198,col 9)-(line 199,col 32)",
        "(line 200,col 9)-(line 205,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "d3"
      ],
      "begin_line": 210,
      "end_line": 210,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "d4"
      ],
      "begin_line": 211,
      "end_line": 211,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "d5"
      ],
      "begin_line": 212,
      "end_line": 212,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testMultiply2()",
      "begin_line": 214,
      "end_line": 219,
      "comment": "",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 47)",
        "(line 216,col 9)-(line 216,col 47)",
        "(line 217,col 9)-(line 217,col 47)",
        "(line 218,col 9)-(line 218,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testTrace()",
      "begin_line": 222,
      "end_line": 232,
      "comment": " test trace ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 46)",
        "(line 224,col 9)-(line 224,col 73)",
        "(line 225,col 9)-(line 225,col 42)",
        "(line 226,col 9)-(line 231,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testScalarAdd()",
      "begin_line": 235,
      "end_line": 239,
      "comment": " test sclarAdd ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 52)",
        "(line 237,col 9)-(line 238,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testOperate()",
      "begin_line": 242,
      "end_line": 255,
      "comment": " test operate ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 46)",
        "(line 244,col 9)-(line 245,col 32)",
        "(line 246,col 9)-(line 247,col 76)",
        "(line 248,col 9)-(line 248,col 44)",
        "(line 249,col 9)-(line 254,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testMath209()",
      "begin_line": 258,
      "end_line": 266,
      "comment": " test issue MATH-209 ",
      "child_ranges": [
        "(line 259,col 9)-(line 260,col 48)",
        "(line 261,col 9)-(line 261,col 54)",
        "(line 262,col 9)-(line 262,col 52)",
        "(line 263,col 9)-(line 263,col 41)",
        "(line 264,col 9)-(line 264,col 41)",
        "(line 265,col 9)-(line 265,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testTranspose()",
      "begin_line": 269,
      "end_line": 278,
      "comment": " test transpose ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 52)",
        "(line 272,col 9)-(line 272,col 89)",
        "(line 273,col 9)-(line 273,col 89)",
        "(line 274,col 9)-(line 274,col 66)",
        "(line 275,col 9)-(line 275,col 42)",
        "(line 276,col 9)-(line 276,col 55)",
        "(line 277,col 9)-(line 277,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testPremultiplyVector()",
      "begin_line": 281,
      "end_line": 294,
      "comment": " test preMultiply by vector ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 52)",
        "(line 283,col 9)-(line 284,col 27)",
        "(line 285,col 9)-(line 286,col 84)",
        "(line 287,col 9)-(line 287,col 44)",
        "(line 288,col 9)-(line 293,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testPremultiply()",
      "begin_line": 296,
      "end_line": 319,
      "comment": "",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 47)",
        "(line 298,col 9)-(line 298,col 47)",
        "(line 299,col 9)-(line 299,col 47)",
        "(line 300,col 9)-(line 300,col 72)",
        "(line 302,col 9)-(line 302,col 59)",
        "(line 303,col 9)-(line 303,col 65)",
        "(line 304,col 9)-(line 304,col 60)",
        "(line 305,col 9)-(line 306,col 32)",
        "(line 307,col 9)-(line 308,col 32)",
        "(line 309,col 9)-(line 310,col 32)",
        "(line 311,col 9)-(line 312,col 32)",
        "(line 313,col 9)-(line 318,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testGetVectors()",
      "begin_line": 321,
      "end_line": 337,
      "comment": "",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 52)",
        "(line 323,col 9)-(line 323,col 74)",
        "(line 324,col 9)-(line 324,col 77)",
        "(line 325,col 9)-(line 330,col 9)",
        "(line 331,col 9)-(line 336,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testGetEntry()",
      "begin_line": 339,
      "end_line": 348,
      "comment": "",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 52)",
        "(line 341,col 9)-(line 341,col 72)",
        "(line 342,col 9)-(line 347,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testExamples()",
      "begin_line": 351,
      "end_line": 380,
      "comment": " test examples in user guide ",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 67)",
        "(line 354,col 9)-(line 354,col 54)",
        "(line 356,col 9)-(line 356,col 72)",
        "(line 357,col 9)-(line 357,col 55)",
        "(line 359,col 9)-(line 359,col 37)",
        "(line 360,col 9)-(line 360,col 45)",
        "(line 361,col 9)-(line 361,col 48)",
        "(line 363,col 9)-(line 363,col 82)",
        "(line 364,col 9)-(line 364,col 52)",
        "(line 365,col 9)-(line 365,col 55)",
        "(line 368,col 9)-(line 369,col 32)",
        "(line 370,col 9)-(line 370,col 71)",
        "(line 371,col 9)-(line 371,col 42)",
        "(line 372,col 9)-(line 372,col 95)",
        "(line 373,col 9)-(line 374,col 37)",
        "(line 375,col 9)-(line 376,col 37)",
        "(line 377,col 9)-(line 378,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testSubMatrix()",
      "begin_line": 383,
      "end_line": 445,
      "comment": " test submatrix accessors",
      "child_ranges": [
        "(line 384,col 9)-(line 384,col 55)",
        "(line 385,col 9)-(line 385,col 71)",
        "(line 386,col 9)-(line 386,col 71)",
        "(line 387,col 9)-(line 387,col 71)",
        "(line 388,col 9)-(line 388,col 71)",
        "(line 389,col 9)-(line 389,col 71)",
        "(line 390,col 9)-(line 390,col 73)",
        "(line 391,col 9)-(line 391,col 73)",
        "(line 392,col 9)-(line 392,col 71)",
        "(line 393,col 9)-(line 393,col 80)",
        "(line 394,col 9)-(line 394,col 80)",
        "(line 395,col 9)-(line 395,col 80)",
        "(line 396,col 9)-(line 397,col 68)",
        "(line 398,col 9)-(line 399,col 68)",
        "(line 400,col 9)-(line 401,col 71)",
        "(line 402,col 9)-(line 403,col 71)",
        "(line 404,col 9)-(line 405,col 68)",
        "(line 406,col 9)-(line 407,col 68)",
        "(line 409,col 9)-(line 414,col 9)",
        "(line 415,col 9)-(line 420,col 9)",
        "(line 421,col 9)-(line 426,col 9)",
        "(line 427,col 9)-(line 432,col 9)",
        "(line 433,col 9)-(line 438,col 9)",
        "(line 439,col 9)-(line 444,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testGetRowMatrix()",
      "begin_line": 447,
      "end_line": 465,
      "comment": "",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 55)",
        "(line 449,col 9)-(line 449,col 55)",
        "(line 450,col 9)-(line 450,col 55)",
        "(line 451,col 9)-(line 451,col 55)",
        "(line 452,col 9)-(line 452,col 55)",
        "(line 453,col 9)-(line 458,col 9)",
        "(line 459,col 9)-(line 464,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testGetColumnMatrix()",
      "begin_line": 467,
      "end_line": 485,
      "comment": "",
      "child_ranges": [
        "(line 468,col 9)-(line 468,col 55)",
        "(line 469,col 9)-(line 469,col 61)",
        "(line 470,col 9)-(line 470,col 61)",
        "(line 471,col 9)-(line 471,col 64)",
        "(line 472,col 9)-(line 472,col 64)",
        "(line 473,col 9)-(line 478,col 9)",
        "(line 479,col 9)-(line 484,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testGetRowVector()",
      "begin_line": 487,
      "end_line": 505,
      "comment": "",
      "child_ranges": [
        "(line 488,col 9)-(line 488,col 55)",
        "(line 489,col 9)-(line 489,col 59)",
        "(line 490,col 9)-(line 490,col 59)",
        "(line 491,col 9)-(line 491,col 55)",
        "(line 492,col 9)-(line 492,col 55)",
        "(line 493,col 9)-(line 498,col 9)",
        "(line 499,col 9)-(line 504,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testGetColumnVector()",
      "begin_line": 507,
      "end_line": 525,
      "comment": "",
      "child_ranges": [
        "(line 508,col 9)-(line 508,col 55)",
        "(line 509,col 9)-(line 509,col 57)",
        "(line 510,col 9)-(line 510,col 57)",
        "(line 511,col 9)-(line 511,col 64)",
        "(line 512,col 9)-(line 512,col 64)",
        "(line 513,col 9)-(line 518,col 9)",
        "(line 519,col 9)-(line 524,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.columnToVector(double[][])",
      "begin_line": 527,
      "end_line": 533,
      "comment": "",
      "child_ranges": [
        "(line 528,col 9)-(line 528,col 50)",
        "(line 529,col 9)-(line 531,col 9)",
        "(line 532,col 9)-(line 532,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testEqualsAndHashCode()",
      "begin_line": 535,
      "end_line": 546,
      "comment": "",
      "child_ranges": [
        "(line 536,col 9)-(line 536,col 59)",
        "(line 537,col 9)-(line 537,col 40)",
        "(line 538,col 9)-(line 538,col 65)",
        "(line 539,col 9)-(line 539,col 50)",
        "(line 540,col 9)-(line 540,col 50)",
        "(line 541,col 9)-(line 541,col 27)",
        "(line 542,col 9)-(line 542,col 28)",
        "(line 543,col 9)-(line 543,col 36)",
        "(line 544,col 9)-(line 544,col 34)",
        "(line 545,col 9)-(line 545,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testToString()",
      "begin_line": 548,
      "end_line": 554,
      "comment": "",
      "child_ranges": [
        "(line 549,col 9)-(line 549,col 59)",
        "(line 550,col 9)-(line 551,col 26)",
        "(line 552,col 9)-(line 552,col 40)",
        "(line 553,col 9)-(line 553,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testSetSubMatrix()",
      "begin_line": 556,
      "end_line": 633,
      "comment": "",
      "child_ranges": [
        "(line 557,col 9)-(line 557,col 59)",
        "(line 558,col 9)-(line 558,col 39)",
        "(line 559,col 9)-(line 560,col 75)",
        "(line 561,col 9)-(line 561,col 34)",
        "(line 563,col 9)-(line 563,col 39)",
        "(line 564,col 9)-(line 565,col 75)",
        "(line 566,col 9)-(line 566,col 34)",
        "(line 568,col 9)-(line 568,col 44)",
        "(line 569,col 9)-(line 570,col 76)",
        "(line 571,col 9)-(line 571,col 34)",
        "(line 574,col 9)-(line 576,col 58)",
        "(line 577,col 9)-(line 577,col 73)",
        "(line 578,col 9)-(line 579,col 66)",
        "(line 580,col 9)-(line 580,col 39)",
        "(line 583,col 9)-(line 588,col 9)",
        "(line 590,col 9)-(line 595,col 9)",
        "(line 596,col 9)-(line 601,col 9)",
        "(line 604,col 9)-(line 609,col 9)",
        "(line 610,col 9)-(line 615,col 9)",
        "(line 618,col 9)-(line 623,col 9)",
        "(line 626,col 9)-(line 631,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.testSerial()",
      "begin_line": 635,
      "end_line": 638,
      "comment": "",
      "child_ranges": [
        "(line 636,col 9)-(line 636,col 59)",
        "(line 637,col 9)-(line 637,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.assertClose(java.lang.String, org.apache.commons.math.linear.RealMatrix, org.apache.commons.math.linear.RealMatrix, double)",
      "begin_line": 643,
      "end_line": 646,
      "comment": " verifies that two matrices are close (1-norm) ",
      "child_ranges": [
        "(line 645,col 9)-(line 645,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.assertClose(java.lang.String, double[], double[], double)",
      "begin_line": 649,
      "end_line": 658,
      "comment": " verifies that two vectors are close (sup norm) ",
      "child_ranges": [
        "(line 651,col 9)-(line 653,col 9)",
        "(line 654,col 9)-(line 657,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrixTest.createSparseMatrix(double[][])",
      "begin_line": 660,
      "end_line": 668,
      "comment": "",
      "child_ranges": [
        "(line 661,col 9)-(line 661,col 86)",
        "(line 662,col 9)-(line 666,col 9)",
        "(line 667,col 9)-(line 667,col 22)"
      ]
    }
  ]
}