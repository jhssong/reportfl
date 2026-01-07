{
  "filepath": "/tmp/Math-96b/src/test/org/apache/commons/math/linear/LUDecompositionImplTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LUDecompositionImplTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 24,
      "end_line": 422,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testData"
      ],
      "begin_line": 25,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testDataMinus"
      ],
      "begin_line": 30,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "luData"
      ],
      "begin_line": 35,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "singular"
      ],
      "begin_line": 42,
      "end_line": 45,
      "comment": " singular matrices"
    },
    {
      "type": "field",
      "varNames": [
        "bigSingular"
      ],
      "begin_line": 46,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entryTolerance"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "normTolerance"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.LUDecompositionImplTest.LUDecompositionImplTest(java.lang.String)",
      "begin_line": 57,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImplTest.suite()",
      "begin_line": 61,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 71)",
        "(line 63,col 9)-(line 63,col 51)",
        "(line 64,col 9)-(line 64,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImplTest.testDimensions()",
      "begin_line": 68,
      "end_line": 78,
      "comment": " test dimensions ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 68)",
        "(line 70,col 9)-(line 70,col 61)",
        "(line 71,col 9)-(line 71,col 67)",
        "(line 72,col 9)-(line 72,col 70)",
        "(line 73,col 9)-(line 73,col 67)",
        "(line 74,col 9)-(line 74,col 70)",
        "(line 75,col 9)-(line 75,col 67)",
        "(line 76,col 9)-(line 76,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImplTest.testNonSquare()",
      "begin_line": 81,
      "end_line": 89,
      "comment": " test non-square matrix ",
      "child_ranges": [
        "(line 82,col 9)-(line 88,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImplTest.testPAEqualLU()",
      "begin_line": 92,
      "end_line": 131,
      "comment": " test PA \u003d LU ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 64)",
        "(line 94,col 9)-(line 94,col 61)",
        "(line 95,col 9)-(line 95,col 33)",
        "(line 96,col 9)-(line 96,col 33)",
        "(line 97,col 9)-(line 97,col 33)",
        "(line 98,col 9)-(line 98,col 75)",
        "(line 99,col 9)-(line 99,col 45)",
        "(line 101,col 9)-(line 101,col 58)",
        "(line 102,col 9)-(line 102,col 45)",
        "(line 103,col 9)-(line 103,col 22)",
        "(line 104,col 9)-(line 104,col 22)",
        "(line 105,col 9)-(line 105,col 22)",
        "(line 106,col 9)-(line 106,col 68)",
        "(line 107,col 9)-(line 107,col 45)",
        "(line 109,col 9)-(line 109,col 58)",
        "(line 110,col 9)-(line 110,col 45)",
        "(line 111,col 9)-(line 111,col 22)",
        "(line 112,col 9)-(line 112,col 22)",
        "(line 113,col 9)-(line 113,col 22)",
        "(line 114,col 9)-(line 114,col 68)",
        "(line 115,col 9)-(line 115,col 45)",
        "(line 117,col 9)-(line 117,col 53)",
        "(line 118,col 9)-(line 118,col 45)",
        "(line 119,col 9)-(line 119,col 40)",
        "(line 120,col 9)-(line 120,col 30)",
        "(line 121,col 9)-(line 121,col 30)",
        "(line 122,col 9)-(line 122,col 30)",
        "(line 124,col 9)-(line 124,col 56)",
        "(line 125,col 9)-(line 125,col 45)",
        "(line 126,col 9)-(line 126,col 40)",
        "(line 127,col 9)-(line 127,col 30)",
        "(line 128,col 9)-(line 128,col 30)",
        "(line 129,col 9)-(line 129,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImplTest.testLLowerTriangular()",
      "begin_line": 134,
      "end_line": 143,
      "comment": " test that L is lower triangular with unit diagonal ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 68)",
        "(line 136,col 9)-(line 136,col 62)",
        "(line 137,col 9)-(line 142,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImplTest.testUUpperTriangular()",
      "begin_line": 146,
      "end_line": 154,
      "comment": " test that U is upper triangular ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 68)",
        "(line 148,col 9)-(line 148,col 62)",
        "(line 149,col 9)-(line 153,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImplTest.testPPermutation()",
      "begin_line": 157,
      "end_line": 203,
      "comment": " test that P is a permutation matrix ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 68)",
        "(line 159,col 9)-(line 159,col 64)",
        "(line 161,col 9)-(line 161,col 51)",
        "(line 162,col 9)-(line 162,col 83)",
        "(line 163,col 9)-(line 163,col 67)",
        "(line 165,col 9)-(line 182,col 9)",
        "(line 184,col 9)-(line 201,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImplTest.testSingular()",
      "begin_line": 207,
      "end_line": 215,
      "comment": " test singular ",
      "child_ranges": [
        "(line 208,col 9)-(line 209,col 73)",
        "(line 210,col 9)-(line 210,col 39)",
        "(line 211,col 9)-(line 211,col 74)",
        "(line 212,col 9)-(line 212,col 40)",
        "(line 213,col 9)-(line 213,col 77)",
        "(line 214,col 9)-(line 214,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImplTest.testSolveDimensionErrors()",
      "begin_line": 218,
      "end_line": 246,
      "comment": " test solve dimension errors ",
      "child_ranges": [
        "(line 219,col 9)-(line 220,col 73)",
        "(line 221,col 9)-(line 221,col 60)",
        "(line 222,col 9)-(line 229,col 9)",
        "(line 230,col 9)-(line 237,col 9)",
        "(line 238,col 9)-(line 245,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImplTest.testSolveSingularityErrors()",
      "begin_line": 249,
      "end_line": 285,
      "comment": " test solve singularity errors ",
      "child_ranges": [
        "(line 250,col 9)-(line 251,col 73)",
        "(line 252,col 9)-(line 252,col 60)",
        "(line 253,col 9)-(line 260,col 9)",
        "(line 261,col 9)-(line 268,col 9)",
        "(line 269,col 9)-(line 276,col 9)",
        "(line 277,col 9)-(line 284,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImplTest.testSolve()",
      "begin_line": 288,
      "end_line": 324,
      "comment": " test solve ",
      "child_ranges": [
        "(line 289,col 9)-(line 290,col 73)",
        "(line 291,col 9)-(line 293,col 11)",
        "(line 294,col 9)-(line 296,col 11)",
        "(line 299,col 9)-(line 299,col 71)",
        "(line 302,col 9)-(line 306,col 9)",
        "(line 309,col 9)-(line 313,col 9)",
        "(line 316,col 9)-(line 322,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImplTest.testMatricesValues1()",
      "begin_line": 327,
      "end_line": 364,
      "comment": " test matrices values ",
      "child_ranges": [
        "(line 328,col 8)-(line 329,col 73)",
        "(line 330,col 9)-(line 334,col 11)",
        "(line 335,col 9)-(line 339,col 11)",
        "(line 340,col 9)-(line 344,col 11)",
        "(line 345,col 9)-(line 345,col 37)",
        "(line 348,col 9)-(line 348,col 33)",
        "(line 349,col 9)-(line 349,col 61)",
        "(line 350,col 9)-(line 350,col 33)",
        "(line 351,col 9)-(line 351,col 61)",
        "(line 352,col 9)-(line 352,col 33)",
        "(line 353,col 9)-(line 353,col 61)",
        "(line 354,col 9)-(line 354,col 36)",
        "(line 355,col 9)-(line 357,col 9)",
        "(line 360,col 9)-(line 360,col 35)",
        "(line 361,col 9)-(line 361,col 35)",
        "(line 362,col 9)-(line 362,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImplTest.testMatricesValues2()",
      "begin_line": 367,
      "end_line": 404,
      "comment": " test matrices values ",
      "child_ranges": [
        "(line 368,col 8)-(line 369,col 71)",
        "(line 370,col 9)-(line 374,col 11)",
        "(line 375,col 9)-(line 379,col 11)",
        "(line 380,col 9)-(line 384,col 11)",
        "(line 385,col 9)-(line 385,col 37)",
        "(line 388,col 9)-(line 388,col 33)",
        "(line 389,col 9)-(line 389,col 61)",
        "(line 390,col 9)-(line 390,col 33)",
        "(line 391,col 9)-(line 391,col 61)",
        "(line 392,col 9)-(line 392,col 33)",
        "(line 393,col 9)-(line 393,col 61)",
        "(line 394,col 9)-(line 394,col 36)",
        "(line 395,col 9)-(line 397,col 9)",
        "(line 400,col 9)-(line 400,col 35)",
        "(line 401,col 9)-(line 401,col 35)",
        "(line 402,col 9)-(line 402,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImplTest.testDeterminant()",
      "begin_line": 407,
      "end_line": 420,
      "comment": " test determinant ",
      "child_ranges": [
        "(line 408,col 9)-(line 410,col 30)",
        "(line 411,col 9)-(line 413,col 30)",
        "(line 414,col 9)-(line 416,col 30)",
        "(line 417,col 9)-(line 419,col 30)"
      ]
    }
  ]
}