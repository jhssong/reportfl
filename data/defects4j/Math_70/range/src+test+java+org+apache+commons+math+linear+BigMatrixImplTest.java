{
  "filepath": "/tmp/Math-70b/src/test/java/org/apache/commons/math/linear/BigMatrixImplTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BigMatrixImplTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 29,
      "end_line": 835,
      "comment": "\n * Test cases for the {@link BigMatrixImpl} class.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "testDataString"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Test data for String constructors"
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
      "begin_line": 39,
      "end_line": 39,
      "comment": " Test data for group operations"
    },
    {
      "type": "field",
      "varNames": [
        "testDataLU"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testDataPlus2"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testDataMinus"
      ],
      "begin_line": 42,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testDataRow1"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testDataCol3"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testDataInv"
      ],
      "begin_line": 46,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "preMultTest"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testData2"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testData2T"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testDataPlusInv"
      ],
      "begin_line": 51,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "luData"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " lu decomposition tests"
    },
    {
      "type": "field",
      "varNames": [
        "luDataLUDecomposition"
      ],
      "begin_line": 56,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "singular"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " singular matrices"
    },
    {
      "type": "field",
      "varNames": [
        "bigSingular"
      ],
      "begin_line": 61,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "detData"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "detData2"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testVector"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " vectors"
    },
    {
      "type": "field",
      "varNames": [
        "testVector2"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subTestData"
      ],
      "begin_line": 71,
      "end_line": 72,
      "comment": " submatrix accessor tests"
    },
    {
      "type": "field",
      "varNames": [
        "subRows02Cols13"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " array selections"
    },
    {
      "type": "field",
      "varNames": [
        "subRows03Cols12"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subRows03Cols123"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subRows20Cols123"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " effective permutations"
    },
    {
      "type": "field",
      "varNames": [
        "subRows31Cols31"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subRows01Cols23"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " contiguous ranges"
    },
    {
      "type": "field",
      "varNames": [
        "subRows23Cols00"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subRows00Cols33"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subRow0"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " row matrices"
    },
    {
      "type": "field",
      "varNames": [
        "subRow3"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subColumn1"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " column matrices"
    },
    {
      "type": "field",
      "varNames": [
        "subColumn3"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entryTolerance"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " tolerances"
    },
    {
      "type": "field",
      "varNames": [
        "normTolerance"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.BigMatrixImplTest(java.lang.String)",
      "begin_line": 95,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.asDouble(java.math.BigDecimal[])",
      "begin_line": 99,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 45)",
        "(line 101,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 104,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.asDouble(java.math.BigDecimal[][])",
      "begin_line": 107,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 63)",
        "(line 109,col 9)-(line 112,col 9)",
        "(line 113,col 9)-(line 113,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.asBigDecimal(double[])",
      "begin_line": 116,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 53)",
        "(line 118,col 9)-(line 120,col 9)",
        "(line 121,col 9)-(line 121,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.asBigDecimal(double[][])",
      "begin_line": 124,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 71)",
        "(line 126,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 131,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.testDimensions()",
      "begin_line": 135,
      "end_line": 144,
      "comment": " test dimensions ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 54)",
        "(line 137,col 9)-(line 137,col 56)",
        "(line 138,col 9)-(line 138,col 69)",
        "(line 139,col 9)-(line 139,col 75)",
        "(line 140,col 9)-(line 140,col 54)",
        "(line 141,col 9)-(line 141,col 71)",
        "(line 142,col 9)-(line 142,col 77)",
        "(line 143,col 9)-(line 143,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.testCopyFunctions()",
      "begin_line": 147,
      "end_line": 154,
      "comment": " test copy functions ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 55)",
        "(line 149,col 9)-(line 149,col 59)",
        "(line 150,col 9)-(line 150,col 28)",
        "(line 151,col 9)-(line 151,col 55)",
        "(line 152,col 9)-(line 152,col 66)",
        "(line 153,col 9)-(line 153,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.testConstructors()",
      "begin_line": 157,
      "end_line": 205,
      "comment": " test constructors ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 51)",
        "(line 159,col 9)-(line 159,col 57)",
        "(line 160,col 9)-(line 160,col 65)",
        "(line 161,col 9)-(line 161,col 71)",
        "(line 162,col 9)-(line 162,col 72)",
        "(line 163,col 9)-(line 163,col 64)",
        "(line 164,col 9)-(line 164,col 68)",
        "(line 165,col 9)-(line 165,col 68)",
        "(line 166,col 9)-(line 166,col 73)",
        "(line 167,col 9)-(line 167,col 74)",
        "(line 168,col 9)-(line 173,col 9)",
        "(line 174,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 185,col 9)",
        "(line 186,col 9)-(line 191,col 9)",
        "(line 193,col 9)-(line 198,col 9)",
        "(line 199,col 9)-(line 204,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.testAdd()",
      "begin_line": 208,
      "end_line": 220,
      "comment": " test add ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 54)",
        "(line 210,col 9)-(line 210,col 60)",
        "(line 211,col 9)-(line 211,col 42)",
        "(line 212,col 9)-(line 212,col 62)",
        "(line 213,col 9)-(line 219,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.testAddFail()",
      "begin_line": 223,
      "end_line": 232,
      "comment": " test add failure ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 54)",
        "(line 225,col 9)-(line 225,col 56)",
        "(line 226,col 9)-(line 231,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.testNorm()",
      "begin_line": 235,
      "end_line": 240,
      "comment": " test norm ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 54)",
        "(line 237,col 9)-(line 237,col 56)",
        "(line 238,col 9)-(line 238,col 83)",
        "(line 239,col 9)-(line 239,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.testPlusMinus()",
      "begin_line": 243,
      "end_line": 254,
      "comment": " test m-n \u003d m + -n ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 54)",
        "(line 245,col 9)-(line 245,col 58)",
        "(line 246,col 9)-(line 247,col 74)",
        "(line 248,col 9)-(line 253,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.testMultiply()",
      "begin_line": 257,
      "end_line": 278,
      "comment": " test multiply ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 54)",
        "(line 259,col 9)-(line 259,col 60)",
        "(line 260,col 9)-(line 260,col 55)",
        "(line 261,col 9)-(line 261,col 56)",
        "(line 262,col 9)-(line 263,col 37)",
        "(line 264,col 9)-(line 265,col 37)",
        "(line 266,col 9)-(line 267,col 30)",
        "(line 268,col 9)-(line 269,col 33)",
        "(line 270,col 9)-(line 271,col 31)",
        "(line 272,col 9)-(line 277,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "d3"
      ],
      "begin_line": 282,
      "end_line": 282,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "d4"
      ],
      "begin_line": 283,
      "end_line": 283,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "d5"
      ],
      "begin_line": 284,
      "end_line": 284,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.testMultiply2()",
      "begin_line": 286,
      "end_line": 291,
      "comment": "",
      "child_ranges": [
        "(line 287,col 8)-(line 287,col 44)",
        "(line 288,col 8)-(line 288,col 44)",
        "(line 289,col 8)-(line 289,col 44)",
        "(line 290,col 8)-(line 290,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.testIsSingular()",
      "begin_line": 294,
      "end_line": 303,
      "comment": " test isSingular ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 54)",
        "(line 296,col 9)-(line 296,col 46)",
        "(line 297,col 9)-(line 297,col 43)",
        "(line 298,col 9)-(line 298,col 50)",
        "(line 299,col 9)-(line 299,col 34)",
        "(line 300,col 9)-(line 300,col 59)",
        "(line 301,col 9)-(line 301,col 40)",
        "(line 302,col 9)-(line 302,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.testInverse()",
      "begin_line": 306,
      "end_line": 329,
      "comment": " test inverse ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 54)",
        "(line 308,col 9)-(line 308,col 56)",
        "(line 309,col 9)-(line 309,col 62)",
        "(line 310,col 9)-(line 310,col 64)",
        "(line 313,col 9)-(line 313,col 41)",
        "(line 314,col 9)-(line 319,col 9)",
        "(line 322,col 9)-(line 322,col 40)",
        "(line 323,col 9)-(line 328,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.testSolve()",
      "begin_line": 332,
      "end_line": 371,
      "comment": " test solve ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 54)",
        "(line 334,col 9)-(line 334,col 56)",
        "(line 336,col 9)-(line 339,col 35)",
        "(line 340,col 9)-(line 345,col 9)",
        "(line 346,col 9)-(line 346,col 54)",
        "(line 347,col 9)-(line 352,col 9)",
        "(line 353,col 9)-(line 358,col 9)",
        "(line 359,col 9)-(line 364,col 9)",
        "(line 365,col 9)-(line 370,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.testDeterminant()",
      "begin_line": 374,
      "end_line": 392,
      "comment": " test determinant ",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 53)",
        "(line 376,col 9)-(line 376,col 82)",
        "(line 377,col 9)-(line 377,col 39)",
        "(line 378,col 9)-(line 378,col 92)",
        "(line 381,col 9)-(line 381,col 40)",
        "(line 382,col 9)-(line 382,col 96)",
        "(line 383,col 9)-(line 383,col 40)",
        "(line 384,col 9)-(line 384,col 97)",
        "(line 386,col 9)-(line 391,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.testTrace()",
      "begin_line": 395,
      "end_line": 405,
      "comment": " test trace ",
      "child_ranges": [
        "(line 396,col 9)-(line 396,col 44)",
        "(line 397,col 9)-(line 397,col 84)",
        "(line 398,col 9)-(line 398,col 41)",
        "(line 399,col 9)-(line 404,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.testScalarAdd()",
      "begin_line": 408,
      "end_line": 412,
      "comment": " test sclarAdd ",
      "child_ranges": [
        "(line 409,col 9)-(line 409,col 50)",
        "(line 410,col 9)-(line 411,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.testOperate()",
      "begin_line": 415,
      "end_line": 426,
      "comment": " test operate ",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 44)",
        "(line 417,col 9)-(line 417,col 67)",
        "(line 418,col 9)-(line 418,col 68)",
        "(line 419,col 9)-(line 419,col 43)",
        "(line 420,col 9)-(line 425,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.testMath209()",
      "begin_line": 429,
      "end_line": 440,
      "comment": " test issue MATH-209 ",
      "child_ranges": [
        "(line 430,col 9)-(line 434,col 18)",
        "(line 435,col 9)-(line 435,col 94)",
        "(line 436,col 9)-(line 436,col 52)",
        "(line 437,col 9)-(line 437,col 56)",
        "(line 438,col 9)-(line 438,col 56)",
        "(line 439,col 9)-(line 439,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.testTranspose()",
      "begin_line": 443,
      "end_line": 450,
      "comment": " test transpose ",
      "child_ranges": [
        "(line 444,col 9)-(line 444,col 50)",
        "(line 445,col 9)-(line 446,col 51)",
        "(line 447,col 9)-(line 447,col 41)",
        "(line 448,col 9)-(line 448,col 53)",
        "(line 449,col 9)-(line 449,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.testPremultiplyVector()",
      "begin_line": 453,
      "end_line": 463,
      "comment": " test preMultiply by vector ",
      "child_ranges": [
        "(line 454,col 9)-(line 454,col 50)",
        "(line 455,col 9)-(line 455,col 111)",
        "(line 456,col 9)-(line 456,col 43)",
        "(line 457,col 9)-(line 462,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.testPremultiply()",
      "begin_line": 465,
      "end_line": 489,
      "comment": "",
      "child_ranges": [
        "(line 466,col 9)-(line 466,col 45)",
        "(line 467,col 9)-(line 467,col 45)",
        "(line 468,col 9)-(line 468,col 45)",
        "(line 469,col 9)-(line 469,col 72)",
        "(line 471,col 9)-(line 471,col 54)",
        "(line 472,col 9)-(line 472,col 60)",
        "(line 473,col 9)-(line 473,col 55)",
        "(line 474,col 9)-(line 474,col 37)",
        "(line 475,col 9)-(line 476,col 41)",
        "(line 477,col 9)-(line 478,col 41)",
        "(line 479,col 9)-(line 480,col 34)",
        "(line 481,col 9)-(line 482,col 37)",
        "(line 483,col 9)-(line 488,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.testGetVectors()",
      "begin_line": 491,
      "end_line": 507,
      "comment": "",
      "child_ranges": [
        "(line 492,col 9)-(line 492,col 50)",
        "(line 493,col 9)-(line 493,col 84)",
        "(line 494,col 9)-(line 494,col 87)",
        "(line 495,col 9)-(line 500,col 9)",
        "(line 501,col 9)-(line 506,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.testLUDecomposition()",
      "begin_line": 509,
      "end_line": 538,
      "comment": "",
      "child_ranges": [
        "(line 510,col 9)-(line 510,col 54)",
        "(line 511,col 9)-(line 511,col 39)",
        "(line 512,col 9)-(line 512,col 90)",
        "(line 513,col 9)-(line 513,col 35)",
        "(line 514,col 9)-(line 514,col 38)",
        "(line 515,col 9)-(line 515,col 29)",
        "(line 516,col 9)-(line 516,col 101)",
        "(line 517,col 9)-(line 517,col 35)",
        "(line 518,col 9)-(line 518,col 45)",
        "(line 519,col 9)-(line 519,col 29)",
        "(line 520,col 9)-(line 520,col 35)",
        "(line 521,col 9)-(line 521,col 34)",
        "(line 522,col 9)-(line 522,col 29)",
        "(line 523,col 9)-(line 523,col 35)",
        "(line 524,col 9)-(line 530,col 9)",
        "(line 531,col 9)-(line 537,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.testSubMatrix()",
      "begin_line": 543,
      "end_line": 608,
      "comment": "\n    * test submatrix accessors\n    ",
      "child_ranges": [
        "(line 544,col 9)-(line 544,col 53)",
        "(line 545,col 9)-(line 545,col 69)",
        "(line 546,col 9)-(line 546,col 69)",
        "(line 547,col 9)-(line 547,col 69)",
        "(line 548,col 9)-(line 548,col 69)",
        "(line 549,col 9)-(line 549,col 69)",
        "(line 550,col 9)-(line 550,col 71)",
        "(line 551,col 9)-(line 551,col 71)",
        "(line 552,col 9)-(line 552,col 69)",
        "(line 553,col 9)-(line 554,col 46)",
        "(line 555,col 9)-(line 556,col 46)",
        "(line 557,col 9)-(line 558,col 46)",
        "(line 559,col 9)-(line 560,col 66)",
        "(line 561,col 9)-(line 562,col 66)",
        "(line 563,col 9)-(line 564,col 68)",
        "(line 565,col 9)-(line 566,col 68)",
        "(line 567,col 9)-(line 568,col 66)",
        "(line 569,col 9)-(line 570,col 66)",
        "(line 572,col 9)-(line 577,col 9)",
        "(line 578,col 9)-(line 583,col 9)",
        "(line 584,col 9)-(line 589,col 9)",
        "(line 590,col 9)-(line 595,col 9)",
        "(line 596,col 9)-(line 601,col 9)",
        "(line 602,col 9)-(line 607,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.testGetColumnMatrix()",
      "begin_line": 610,
      "end_line": 630,
      "comment": "",
      "child_ranges": [
        "(line 611,col 9)-(line 611,col 53)",
        "(line 612,col 9)-(line 612,col 59)",
        "(line 613,col 9)-(line 613,col 59)",
        "(line 614,col 9)-(line 615,col 38)",
        "(line 616,col 9)-(line 617,col 38)",
        "(line 618,col 9)-(line 623,col 9)",
        "(line 624,col 9)-(line 629,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.testGetRowMatrix()",
      "begin_line": 632,
      "end_line": 652,
      "comment": "",
      "child_ranges": [
        "(line 633,col 9)-(line 633,col 53)",
        "(line 634,col 9)-(line 634,col 53)",
        "(line 635,col 9)-(line 635,col 53)",
        "(line 636,col 9)-(line 637,col 35)",
        "(line 638,col 9)-(line 639,col 35)",
        "(line 640,col 9)-(line 645,col 9)",
        "(line 646,col 9)-(line 651,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.testEqualsAndHashCode()",
      "begin_line": 654,
      "end_line": 670,
      "comment": "",
      "child_ranges": [
        "(line 655,col 9)-(line 655,col 54)",
        "(line 656,col 9)-(line 656,col 52)",
        "(line 657,col 9)-(line 657,col 57)",
        "(line 658,col 9)-(line 658,col 50)",
        "(line 659,col 9)-(line 659,col 50)",
        "(line 660,col 9)-(line 660,col 27)",
        "(line 661,col 9)-(line 661,col 28)",
        "(line 662,col 9)-(line 662,col 36)",
        "(line 663,col 9)-(line 663,col 34)",
        "(line 664,col 9)-(line 664,col 62)",
        "(line 666,col 9)-(line 666,col 56)",
        "(line 667,col 9)-(line 667,col 58)",
        "(line 668,col 9)-(line 668,col 50)",
        "(line 669,col 9)-(line 669,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.testToString()",
      "begin_line": 672,
      "end_line": 679,
      "comment": "",
      "child_ranges": [
        "(line 673,col 9)-(line 673,col 54)",
        "(line 674,col 9)-(line 675,col 30)",
        "(line 676,col 9)-(line 676,col 32)",
        "(line 677,col 9)-(line 678,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.testSetSubMatrix()",
      "begin_line": 681,
      "end_line": 748,
      "comment": "",
      "child_ranges": [
        "(line 682,col 9)-(line 683,col 60)",
        "(line 684,col 9)-(line 684,col 54)",
        "(line 685,col 9)-(line 685,col 37)",
        "(line 686,col 9)-(line 687,col 73)",
        "(line 688,col 9)-(line 688,col 34)",
        "(line 690,col 9)-(line 690,col 37)",
        "(line 691,col 9)-(line 692,col 73)",
        "(line 693,col 9)-(line 693,col 34)",
        "(line 695,col 9)-(line 696,col 65)",
        "(line 697,col 9)-(line 697,col 42)",
        "(line 698,col 9)-(line 699,col 70)",
        "(line 700,col 9)-(line 700,col 34)",
        "(line 703,col 9)-(line 704,col 73)",
        "(line 705,col 9)-(line 706,col 79)",
        "(line 707,col 9)-(line 712,col 35)",
        "(line 713,col 9)-(line 713,col 39)",
        "(line 716,col 9)-(line 721,col 9)",
        "(line 724,col 9)-(line 729,col 9)",
        "(line 732,col 9)-(line 738,col 9)",
        "(line 741,col 9)-(line 746,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.assertClose(java.lang.String, org.apache.commons.math.linear.BigMatrix, org.apache.commons.math.linear.BigMatrix, double)",
      "begin_line": 753,
      "end_line": 756,
      "comment": " verifies that two matrices are close (1-norm) ",
      "child_ranges": [
        "(line 755,col 9)-(line 755,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.assertClose(java.lang.String, double[], double[], double)",
      "begin_line": 759,
      "end_line": 768,
      "comment": " verifies that two vectors are close (sup norm) ",
      "child_ranges": [
        "(line 761,col 9)-(line 763,col 9)",
        "(line 764,col 9)-(line 767,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.splitLU(org.apache.commons.math.linear.BigMatrix, java.math.BigDecimal[][], java.math.BigDecimal[][])",
      "begin_line": 771,
      "end_line": 792,
      "comment": " extracts the l  and u matrices from compact lu representation ",
      "child_ranges": [
        "(line 772,col 9)-(line 776,col 9)",
        "(line 777,col 9)-(line 777,col 37)",
        "(line 778,col 9)-(line 791,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.permuteRows(org.apache.commons.math.linear.BigMatrix, int[])",
      "begin_line": 795,
      "end_line": 808,
      "comment": " Returns the result of applying the given row permutation to the matrix ",
      "child_ranges": [
        "(line 796,col 9)-(line 798,col 9)",
        "(line 799,col 9)-(line 799,col 41)",
        "(line 800,col 9)-(line 800,col 44)",
        "(line 801,col 9)-(line 801,col 50)",
        "(line 802,col 9)-(line 806,col 9)",
        "(line 807,col 9)-(line 807,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.verifyDecomposition(org.apache.commons.math.linear.BigMatrix, org.apache.commons.math.linear.BigMatrix)",
      "begin_line": 811,
      "end_line": 822,
      "comment": " Extracts l and u matrices from lu and verifies that matrix \u003d l times u modulo permutation ",
      "child_ranges": [
        "(line 812,col 9)-(line 812,col 41)",
        "(line 813,col 9)-(line 813,col 56)",
        "(line 814,col 9)-(line 814,col 56)",
        "(line 815,col 9)-(line 815,col 42)",
        "(line 816,col 9)-(line 816,col 54)",
        "(line 817,col 9)-(line 817,col 55)",
        "(line 818,col 9)-(line 818,col 70)",
        "(line 819,col 9)-(line 819,col 62)",
        "(line 820,col 9)-(line 821,col 54)"
      ]
    }
  ]
}