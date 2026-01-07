{
  "filepath": "/tmp/Math-79b/src/test/java/org/apache/commons/math/linear/BigMatrixImplTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BigMatrixImplTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 31,
      "end_line": 843,
      "comment": "\n * Test cases for the {@link BigMatrixImpl} class.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "testDataString"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Test data for String constructors"
    },
    {
      "type": "field",
      "varNames": [
        "id"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " 3 x 3 identity matrix"
    },
    {
      "type": "field",
      "varNames": [
        "testData"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Test data for group operations"
    },
    {
      "type": "field",
      "varNames": [
        "testDataLU"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testDataPlus2"
      ],
      "begin_line": 43,
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
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "detData2"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testVector"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " vectors"
    },
    {
      "type": "field",
      "varNames": [
        "testVector2"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subTestData"
      ],
      "begin_line": 73,
      "end_line": 74,
      "comment": " submatrix accessor tests"
    },
    {
      "type": "field",
      "varNames": [
        "subRows02Cols13"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " array selections"
    },
    {
      "type": "field",
      "varNames": [
        "subRows03Cols12"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subRows03Cols123"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subRows20Cols123"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " effective permutations"
    },
    {
      "type": "field",
      "varNames": [
        "subRows31Cols31"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subRows01Cols23"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " contiguous ranges"
    },
    {
      "type": "field",
      "varNames": [
        "subRows23Cols00"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subRows00Cols33"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subRow0"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " row matrices"
    },
    {
      "type": "field",
      "varNames": [
        "subRow3"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subColumn1"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " column matrices"
    },
    {
      "type": "field",
      "varNames": [
        "subColumn3"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entryTolerance"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " tolerances"
    },
    {
      "type": "field",
      "varNames": [
        "normTolerance"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.BigMatrixImplTest(java.lang.String)",
      "begin_line": 97,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.suite()",
      "begin_line": 101,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 65)",
        "(line 103,col 9)-(line 103,col 45)",
        "(line 104,col 9)-(line 104,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.asDouble(java.math.BigDecimal[])",
      "begin_line": 107,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 45)",
        "(line 109,col 9)-(line 111,col 9)",
        "(line 112,col 9)-(line 112,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.asDouble(java.math.BigDecimal[][])",
      "begin_line": 115,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 63)",
        "(line 117,col 9)-(line 120,col 9)",
        "(line 121,col 9)-(line 121,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.asBigDecimal(double[])",
      "begin_line": 124,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 53)",
        "(line 126,col 9)-(line 128,col 9)",
        "(line 129,col 9)-(line 129,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.asBigDecimal(double[][])",
      "begin_line": 132,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 71)",
        "(line 134,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 139,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.testDimensions()",
      "begin_line": 143,
      "end_line": 152,
      "comment": " test dimensions ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 54)",
        "(line 145,col 9)-(line 145,col 56)",
        "(line 146,col 9)-(line 146,col 69)",
        "(line 147,col 9)-(line 147,col 75)",
        "(line 148,col 9)-(line 148,col 54)",
        "(line 149,col 9)-(line 149,col 71)",
        "(line 150,col 9)-(line 150,col 77)",
        "(line 151,col 9)-(line 151,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.testCopyFunctions()",
      "begin_line": 155,
      "end_line": 162,
      "comment": " test copy functions ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 55)",
        "(line 157,col 9)-(line 157,col 59)",
        "(line 158,col 9)-(line 158,col 28)",
        "(line 159,col 9)-(line 159,col 55)",
        "(line 160,col 9)-(line 160,col 66)",
        "(line 161,col 9)-(line 161,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.testConstructors()",
      "begin_line": 165,
      "end_line": 213,
      "comment": " test constructors ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 51)",
        "(line 167,col 9)-(line 167,col 57)",
        "(line 168,col 9)-(line 168,col 65)",
        "(line 169,col 9)-(line 169,col 71)",
        "(line 170,col 9)-(line 170,col 72)",
        "(line 171,col 9)-(line 171,col 64)",
        "(line 172,col 9)-(line 172,col 68)",
        "(line 173,col 9)-(line 173,col 68)",
        "(line 174,col 9)-(line 174,col 73)",
        "(line 175,col 9)-(line 175,col 74)",
        "(line 176,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 187,col 9)",
        "(line 188,col 9)-(line 193,col 9)",
        "(line 194,col 9)-(line 199,col 9)",
        "(line 201,col 9)-(line 206,col 9)",
        "(line 207,col 9)-(line 212,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.testAdd()",
      "begin_line": 216,
      "end_line": 228,
      "comment": " test add ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 54)",
        "(line 218,col 9)-(line 218,col 60)",
        "(line 219,col 9)-(line 219,col 42)",
        "(line 220,col 9)-(line 220,col 62)",
        "(line 221,col 9)-(line 227,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.testAddFail()",
      "begin_line": 231,
      "end_line": 240,
      "comment": " test add failure ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 54)",
        "(line 233,col 9)-(line 233,col 56)",
        "(line 234,col 9)-(line 239,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.testNorm()",
      "begin_line": 243,
      "end_line": 248,
      "comment": " test norm ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 54)",
        "(line 245,col 9)-(line 245,col 56)",
        "(line 246,col 9)-(line 246,col 83)",
        "(line 247,col 9)-(line 247,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.testPlusMinus()",
      "begin_line": 251,
      "end_line": 262,
      "comment": " test m-n \u003d m + -n ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 54)",
        "(line 253,col 9)-(line 253,col 58)",
        "(line 254,col 9)-(line 255,col 74)",
        "(line 256,col 9)-(line 261,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.testMultiply()",
      "begin_line": 265,
      "end_line": 286,
      "comment": " test multiply ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 54)",
        "(line 267,col 9)-(line 267,col 60)",
        "(line 268,col 9)-(line 268,col 55)",
        "(line 269,col 9)-(line 269,col 56)",
        "(line 270,col 9)-(line 271,col 37)",
        "(line 272,col 9)-(line 273,col 37)",
        "(line 274,col 9)-(line 275,col 30)",
        "(line 276,col 9)-(line 277,col 33)",
        "(line 278,col 9)-(line 279,col 31)",
        "(line 280,col 9)-(line 285,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "d3"
      ],
      "begin_line": 290,
      "end_line": 290,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "d4"
      ],
      "begin_line": 291,
      "end_line": 291,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "d5"
      ],
      "begin_line": 292,
      "end_line": 292,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.testMultiply2()",
      "begin_line": 294,
      "end_line": 299,
      "comment": "",
      "child_ranges": [
        "(line 295,col 8)-(line 295,col 44)",
        "(line 296,col 8)-(line 296,col 44)",
        "(line 297,col 8)-(line 297,col 44)",
        "(line 298,col 8)-(line 298,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.testIsSingular()",
      "begin_line": 302,
      "end_line": 311,
      "comment": " test isSingular ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 54)",
        "(line 304,col 9)-(line 304,col 46)",
        "(line 305,col 9)-(line 305,col 43)",
        "(line 306,col 9)-(line 306,col 50)",
        "(line 307,col 9)-(line 307,col 34)",
        "(line 308,col 9)-(line 308,col 59)",
        "(line 309,col 9)-(line 309,col 40)",
        "(line 310,col 9)-(line 310,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.testInverse()",
      "begin_line": 314,
      "end_line": 337,
      "comment": " test inverse ",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 54)",
        "(line 316,col 9)-(line 316,col 56)",
        "(line 317,col 9)-(line 317,col 62)",
        "(line 318,col 9)-(line 318,col 64)",
        "(line 321,col 9)-(line 321,col 41)",
        "(line 322,col 9)-(line 327,col 9)",
        "(line 330,col 9)-(line 330,col 40)",
        "(line 331,col 9)-(line 336,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.testSolve()",
      "begin_line": 340,
      "end_line": 379,
      "comment": " test solve ",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 54)",
        "(line 342,col 9)-(line 342,col 56)",
        "(line 344,col 9)-(line 347,col 35)",
        "(line 348,col 9)-(line 353,col 9)",
        "(line 354,col 9)-(line 354,col 54)",
        "(line 355,col 9)-(line 360,col 9)",
        "(line 361,col 9)-(line 366,col 9)",
        "(line 367,col 9)-(line 372,col 9)",
        "(line 373,col 9)-(line 378,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.testDeterminant()",
      "begin_line": 382,
      "end_line": 400,
      "comment": " test determinant ",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 53)",
        "(line 384,col 9)-(line 384,col 82)",
        "(line 385,col 9)-(line 385,col 39)",
        "(line 386,col 9)-(line 386,col 92)",
        "(line 389,col 9)-(line 389,col 40)",
        "(line 390,col 9)-(line 390,col 96)",
        "(line 391,col 9)-(line 391,col 40)",
        "(line 392,col 9)-(line 392,col 97)",
        "(line 394,col 9)-(line 399,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.testTrace()",
      "begin_line": 403,
      "end_line": 413,
      "comment": " test trace ",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 44)",
        "(line 405,col 9)-(line 405,col 84)",
        "(line 406,col 9)-(line 406,col 41)",
        "(line 407,col 9)-(line 412,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.testScalarAdd()",
      "begin_line": 416,
      "end_line": 420,
      "comment": " test sclarAdd ",
      "child_ranges": [
        "(line 417,col 9)-(line 417,col 50)",
        "(line 418,col 9)-(line 419,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.testOperate()",
      "begin_line": 423,
      "end_line": 434,
      "comment": " test operate ",
      "child_ranges": [
        "(line 424,col 9)-(line 424,col 44)",
        "(line 425,col 9)-(line 425,col 67)",
        "(line 426,col 9)-(line 426,col 68)",
        "(line 427,col 9)-(line 427,col 43)",
        "(line 428,col 9)-(line 433,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.testMath209()",
      "begin_line": 437,
      "end_line": 448,
      "comment": " test issue MATH-209 ",
      "child_ranges": [
        "(line 438,col 9)-(line 442,col 18)",
        "(line 443,col 9)-(line 443,col 94)",
        "(line 444,col 9)-(line 444,col 52)",
        "(line 445,col 9)-(line 445,col 56)",
        "(line 446,col 9)-(line 446,col 56)",
        "(line 447,col 9)-(line 447,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.testTranspose()",
      "begin_line": 451,
      "end_line": 458,
      "comment": " test transpose ",
      "child_ranges": [
        "(line 452,col 9)-(line 452,col 50)",
        "(line 453,col 9)-(line 454,col 51)",
        "(line 455,col 9)-(line 455,col 41)",
        "(line 456,col 9)-(line 456,col 53)",
        "(line 457,col 9)-(line 457,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.testPremultiplyVector()",
      "begin_line": 461,
      "end_line": 471,
      "comment": " test preMultiply by vector ",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 50)",
        "(line 463,col 9)-(line 463,col 111)",
        "(line 464,col 9)-(line 464,col 43)",
        "(line 465,col 9)-(line 470,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.testPremultiply()",
      "begin_line": 473,
      "end_line": 497,
      "comment": "",
      "child_ranges": [
        "(line 474,col 9)-(line 474,col 45)",
        "(line 475,col 9)-(line 475,col 45)",
        "(line 476,col 9)-(line 476,col 45)",
        "(line 477,col 9)-(line 477,col 72)",
        "(line 479,col 9)-(line 479,col 54)",
        "(line 480,col 9)-(line 480,col 60)",
        "(line 481,col 9)-(line 481,col 55)",
        "(line 482,col 9)-(line 482,col 37)",
        "(line 483,col 9)-(line 484,col 41)",
        "(line 485,col 9)-(line 486,col 41)",
        "(line 487,col 9)-(line 488,col 34)",
        "(line 489,col 9)-(line 490,col 37)",
        "(line 491,col 9)-(line 496,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.testGetVectors()",
      "begin_line": 499,
      "end_line": 515,
      "comment": "",
      "child_ranges": [
        "(line 500,col 9)-(line 500,col 50)",
        "(line 501,col 9)-(line 501,col 84)",
        "(line 502,col 9)-(line 502,col 87)",
        "(line 503,col 9)-(line 508,col 9)",
        "(line 509,col 9)-(line 514,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.testLUDecomposition()",
      "begin_line": 517,
      "end_line": 546,
      "comment": "",
      "child_ranges": [
        "(line 518,col 9)-(line 518,col 54)",
        "(line 519,col 9)-(line 519,col 39)",
        "(line 520,col 9)-(line 520,col 90)",
        "(line 521,col 9)-(line 521,col 35)",
        "(line 522,col 9)-(line 522,col 38)",
        "(line 523,col 9)-(line 523,col 29)",
        "(line 524,col 9)-(line 524,col 101)",
        "(line 525,col 9)-(line 525,col 35)",
        "(line 526,col 9)-(line 526,col 45)",
        "(line 527,col 9)-(line 527,col 29)",
        "(line 528,col 9)-(line 528,col 35)",
        "(line 529,col 9)-(line 529,col 34)",
        "(line 530,col 9)-(line 530,col 29)",
        "(line 531,col 9)-(line 531,col 35)",
        "(line 532,col 9)-(line 538,col 9)",
        "(line 539,col 9)-(line 545,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.testSubMatrix()",
      "begin_line": 551,
      "end_line": 616,
      "comment": "\n    * test submatrix accessors\n    ",
      "child_ranges": [
        "(line 552,col 9)-(line 552,col 53)",
        "(line 553,col 9)-(line 553,col 69)",
        "(line 554,col 9)-(line 554,col 69)",
        "(line 555,col 9)-(line 555,col 69)",
        "(line 556,col 9)-(line 556,col 69)",
        "(line 557,col 9)-(line 557,col 69)",
        "(line 558,col 9)-(line 558,col 71)",
        "(line 559,col 9)-(line 559,col 71)",
        "(line 560,col 9)-(line 560,col 69)",
        "(line 561,col 9)-(line 562,col 46)",
        "(line 563,col 9)-(line 564,col 46)",
        "(line 565,col 9)-(line 566,col 46)",
        "(line 567,col 9)-(line 568,col 66)",
        "(line 569,col 9)-(line 570,col 66)",
        "(line 571,col 9)-(line 572,col 68)",
        "(line 573,col 9)-(line 574,col 68)",
        "(line 575,col 9)-(line 576,col 66)",
        "(line 577,col 9)-(line 578,col 66)",
        "(line 580,col 9)-(line 585,col 9)",
        "(line 586,col 9)-(line 591,col 9)",
        "(line 592,col 9)-(line 597,col 9)",
        "(line 598,col 9)-(line 603,col 9)",
        "(line 604,col 9)-(line 609,col 9)",
        "(line 610,col 9)-(line 615,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.testGetColumnMatrix()",
      "begin_line": 618,
      "end_line": 638,
      "comment": "",
      "child_ranges": [
        "(line 619,col 9)-(line 619,col 53)",
        "(line 620,col 9)-(line 620,col 59)",
        "(line 621,col 9)-(line 621,col 59)",
        "(line 622,col 9)-(line 623,col 38)",
        "(line 624,col 9)-(line 625,col 38)",
        "(line 626,col 9)-(line 631,col 9)",
        "(line 632,col 9)-(line 637,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.testGetRowMatrix()",
      "begin_line": 640,
      "end_line": 660,
      "comment": "",
      "child_ranges": [
        "(line 641,col 9)-(line 641,col 53)",
        "(line 642,col 9)-(line 642,col 53)",
        "(line 643,col 9)-(line 643,col 53)",
        "(line 644,col 9)-(line 645,col 35)",
        "(line 646,col 9)-(line 647,col 35)",
        "(line 648,col 9)-(line 653,col 9)",
        "(line 654,col 9)-(line 659,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.testEqualsAndHashCode()",
      "begin_line": 662,
      "end_line": 678,
      "comment": "",
      "child_ranges": [
        "(line 663,col 9)-(line 663,col 54)",
        "(line 664,col 9)-(line 664,col 52)",
        "(line 665,col 9)-(line 665,col 57)",
        "(line 666,col 9)-(line 666,col 50)",
        "(line 667,col 9)-(line 667,col 50)",
        "(line 668,col 9)-(line 668,col 27)",
        "(line 669,col 9)-(line 669,col 28)",
        "(line 670,col 9)-(line 670,col 36)",
        "(line 671,col 9)-(line 671,col 34)",
        "(line 672,col 9)-(line 672,col 62)",
        "(line 674,col 9)-(line 674,col 56)",
        "(line 675,col 9)-(line 675,col 58)",
        "(line 676,col 9)-(line 676,col 50)",
        "(line 677,col 9)-(line 677,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.testToString()",
      "begin_line": 680,
      "end_line": 687,
      "comment": "",
      "child_ranges": [
        "(line 681,col 9)-(line 681,col 54)",
        "(line 682,col 9)-(line 683,col 30)",
        "(line 684,col 9)-(line 684,col 32)",
        "(line 685,col 9)-(line 686,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.testSetSubMatrix()",
      "begin_line": 689,
      "end_line": 756,
      "comment": "",
      "child_ranges": [
        "(line 690,col 9)-(line 691,col 60)",
        "(line 692,col 9)-(line 692,col 54)",
        "(line 693,col 9)-(line 693,col 37)",
        "(line 694,col 9)-(line 695,col 73)",
        "(line 696,col 9)-(line 696,col 34)",
        "(line 698,col 9)-(line 698,col 37)",
        "(line 699,col 9)-(line 700,col 73)",
        "(line 701,col 9)-(line 701,col 34)",
        "(line 703,col 9)-(line 704,col 65)",
        "(line 705,col 9)-(line 705,col 42)",
        "(line 706,col 9)-(line 707,col 70)",
        "(line 708,col 9)-(line 708,col 34)",
        "(line 711,col 9)-(line 712,col 73)",
        "(line 713,col 9)-(line 714,col 79)",
        "(line 715,col 9)-(line 720,col 35)",
        "(line 721,col 9)-(line 721,col 39)",
        "(line 724,col 9)-(line 729,col 9)",
        "(line 732,col 9)-(line 737,col 9)",
        "(line 740,col 9)-(line 746,col 9)",
        "(line 749,col 9)-(line 754,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.assertClose(java.lang.String, org.apache.commons.math.linear.BigMatrix, org.apache.commons.math.linear.BigMatrix, double)",
      "begin_line": 761,
      "end_line": 764,
      "comment": " verifies that two matrices are close (1-norm) ",
      "child_ranges": [
        "(line 763,col 9)-(line 763,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.assertClose(java.lang.String, double[], double[], double)",
      "begin_line": 767,
      "end_line": 776,
      "comment": " verifies that two vectors are close (sup norm) ",
      "child_ranges": [
        "(line 769,col 9)-(line 771,col 9)",
        "(line 772,col 9)-(line 775,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.splitLU(org.apache.commons.math.linear.BigMatrix, java.math.BigDecimal[][], java.math.BigDecimal[][])",
      "begin_line": 779,
      "end_line": 800,
      "comment": " extracts the l  and u matrices from compact lu representation ",
      "child_ranges": [
        "(line 780,col 9)-(line 784,col 9)",
        "(line 785,col 9)-(line 785,col 37)",
        "(line 786,col 9)-(line 799,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.permuteRows(org.apache.commons.math.linear.BigMatrix, int[])",
      "begin_line": 803,
      "end_line": 816,
      "comment": " Returns the result of applying the given row permutation to the matrix ",
      "child_ranges": [
        "(line 804,col 9)-(line 806,col 9)",
        "(line 807,col 9)-(line 807,col 41)",
        "(line 808,col 9)-(line 808,col 44)",
        "(line 809,col 9)-(line 809,col 50)",
        "(line 810,col 9)-(line 814,col 9)",
        "(line 815,col 9)-(line 815,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImplTest.verifyDecomposition(org.apache.commons.math.linear.BigMatrix, org.apache.commons.math.linear.BigMatrix)",
      "begin_line": 819,
      "end_line": 830,
      "comment": " Extracts l and u matrices from lu and verifies that matrix \u003d l times u modulo permutation ",
      "child_ranges": [
        "(line 820,col 9)-(line 820,col 41)",
        "(line 821,col 9)-(line 821,col 56)",
        "(line 822,col 9)-(line 822,col 56)",
        "(line 823,col 9)-(line 823,col 42)",
        "(line 824,col 9)-(line 824,col 54)",
        "(line 825,col 9)-(line 825,col 55)",
        "(line 826,col 9)-(line 826,col 70)",
        "(line 827,col 9)-(line 827,col 62)",
        "(line 828,col 9)-(line 829,col 54)"
      ]
    }
  ]
}