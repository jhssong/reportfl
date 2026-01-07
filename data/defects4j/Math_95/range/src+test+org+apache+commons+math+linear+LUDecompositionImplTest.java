{
  "filepath": "/tmp/Math-95b/src/test/org/apache/commons/math/linear/LUDecompositionImplTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LUDecompositionImplTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 24,
      "end_line": 445,
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
      "signature": "org.apache.commons.math.linear.LUDecompositionImplTest.testNoDecompose()",
      "begin_line": 92,
      "end_line": 101,
      "comment": " test no call to decompose ",
      "child_ranges": [
        "(line 93,col 9)-(line 100,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImplTest.testThreshold()",
      "begin_line": 104,
      "end_line": 112,
      "comment": " test threshold impact ",
      "child_ranges": [
        "(line 105,col 9)-(line 109,col 63)",
        "(line 110,col 9)-(line 110,col 77)",
        "(line 111,col 9)-(line 111,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImplTest.testPAEqualLU()",
      "begin_line": 115,
      "end_line": 154,
      "comment": " test PA \u003d LU ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 64)",
        "(line 117,col 9)-(line 117,col 61)",
        "(line 118,col 9)-(line 118,col 33)",
        "(line 119,col 9)-(line 119,col 33)",
        "(line 120,col 9)-(line 120,col 33)",
        "(line 121,col 9)-(line 121,col 75)",
        "(line 122,col 9)-(line 122,col 45)",
        "(line 124,col 9)-(line 124,col 58)",
        "(line 125,col 9)-(line 125,col 45)",
        "(line 126,col 9)-(line 126,col 22)",
        "(line 127,col 9)-(line 127,col 22)",
        "(line 128,col 9)-(line 128,col 22)",
        "(line 129,col 9)-(line 129,col 68)",
        "(line 130,col 9)-(line 130,col 45)",
        "(line 132,col 9)-(line 132,col 58)",
        "(line 133,col 9)-(line 133,col 45)",
        "(line 134,col 9)-(line 134,col 22)",
        "(line 135,col 9)-(line 135,col 22)",
        "(line 136,col 9)-(line 136,col 22)",
        "(line 137,col 9)-(line 137,col 68)",
        "(line 138,col 9)-(line 138,col 45)",
        "(line 140,col 9)-(line 140,col 53)",
        "(line 141,col 9)-(line 141,col 45)",
        "(line 142,col 9)-(line 142,col 40)",
        "(line 143,col 9)-(line 143,col 30)",
        "(line 144,col 9)-(line 144,col 30)",
        "(line 145,col 9)-(line 145,col 30)",
        "(line 147,col 9)-(line 147,col 56)",
        "(line 148,col 9)-(line 148,col 45)",
        "(line 149,col 9)-(line 149,col 40)",
        "(line 150,col 9)-(line 150,col 30)",
        "(line 151,col 9)-(line 151,col 30)",
        "(line 152,col 9)-(line 152,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImplTest.testLLowerTriangular()",
      "begin_line": 157,
      "end_line": 166,
      "comment": " test that L is lower triangular with unit diagonal ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 68)",
        "(line 159,col 9)-(line 159,col 62)",
        "(line 160,col 9)-(line 165,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImplTest.testUUpperTriangular()",
      "begin_line": 169,
      "end_line": 177,
      "comment": " test that U is upper triangular ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 68)",
        "(line 171,col 9)-(line 171,col 62)",
        "(line 172,col 9)-(line 176,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImplTest.testPPermutation()",
      "begin_line": 180,
      "end_line": 226,
      "comment": " test that P is a permutation matrix ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 68)",
        "(line 182,col 9)-(line 182,col 64)",
        "(line 184,col 9)-(line 184,col 51)",
        "(line 185,col 9)-(line 185,col 83)",
        "(line 186,col 9)-(line 186,col 67)",
        "(line 188,col 9)-(line 205,col 9)",
        "(line 207,col 9)-(line 224,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImplTest.testSingular()",
      "begin_line": 230,
      "end_line": 238,
      "comment": " test singular ",
      "child_ranges": [
        "(line 231,col 9)-(line 232,col 73)",
        "(line 233,col 9)-(line 233,col 39)",
        "(line 234,col 9)-(line 234,col 74)",
        "(line 235,col 9)-(line 235,col 40)",
        "(line 236,col 9)-(line 236,col 77)",
        "(line 237,col 9)-(line 237,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImplTest.testSolveDimensionErrors()",
      "begin_line": 241,
      "end_line": 269,
      "comment": " test solve dimension errors ",
      "child_ranges": [
        "(line 242,col 9)-(line 243,col 73)",
        "(line 244,col 9)-(line 244,col 60)",
        "(line 245,col 9)-(line 252,col 9)",
        "(line 253,col 9)-(line 260,col 9)",
        "(line 261,col 9)-(line 268,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImplTest.testSolveSingularityErrors()",
      "begin_line": 272,
      "end_line": 308,
      "comment": " test solve singularity errors ",
      "child_ranges": [
        "(line 273,col 9)-(line 274,col 73)",
        "(line 275,col 9)-(line 275,col 60)",
        "(line 276,col 9)-(line 283,col 9)",
        "(line 284,col 9)-(line 291,col 9)",
        "(line 292,col 9)-(line 299,col 9)",
        "(line 300,col 9)-(line 307,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImplTest.testSolve()",
      "begin_line": 311,
      "end_line": 347,
      "comment": " test solve ",
      "child_ranges": [
        "(line 312,col 9)-(line 313,col 73)",
        "(line 314,col 9)-(line 316,col 11)",
        "(line 317,col 9)-(line 319,col 11)",
        "(line 322,col 9)-(line 322,col 71)",
        "(line 325,col 9)-(line 329,col 9)",
        "(line 332,col 9)-(line 336,col 9)",
        "(line 339,col 9)-(line 345,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImplTest.testMatricesValues1()",
      "begin_line": 350,
      "end_line": 387,
      "comment": " test matrices values ",
      "child_ranges": [
        "(line 351,col 8)-(line 352,col 73)",
        "(line 353,col 9)-(line 357,col 11)",
        "(line 358,col 9)-(line 362,col 11)",
        "(line 363,col 9)-(line 367,col 11)",
        "(line 368,col 9)-(line 368,col 37)",
        "(line 371,col 9)-(line 371,col 33)",
        "(line 372,col 9)-(line 372,col 61)",
        "(line 373,col 9)-(line 373,col 33)",
        "(line 374,col 9)-(line 374,col 61)",
        "(line 375,col 9)-(line 375,col 33)",
        "(line 376,col 9)-(line 376,col 61)",
        "(line 377,col 9)-(line 377,col 36)",
        "(line 378,col 9)-(line 380,col 9)",
        "(line 383,col 9)-(line 383,col 35)",
        "(line 384,col 9)-(line 384,col 35)",
        "(line 385,col 9)-(line 385,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImplTest.testMatricesValues2()",
      "begin_line": 390,
      "end_line": 427,
      "comment": " test matrices values ",
      "child_ranges": [
        "(line 391,col 8)-(line 392,col 71)",
        "(line 393,col 9)-(line 397,col 11)",
        "(line 398,col 9)-(line 402,col 11)",
        "(line 403,col 9)-(line 407,col 11)",
        "(line 408,col 9)-(line 408,col 37)",
        "(line 411,col 9)-(line 411,col 33)",
        "(line 412,col 9)-(line 412,col 61)",
        "(line 413,col 9)-(line 413,col 33)",
        "(line 414,col 9)-(line 414,col 61)",
        "(line 415,col 9)-(line 415,col 33)",
        "(line 416,col 9)-(line 416,col 61)",
        "(line 417,col 9)-(line 417,col 36)",
        "(line 418,col 9)-(line 420,col 9)",
        "(line 423,col 9)-(line 423,col 35)",
        "(line 424,col 9)-(line 424,col 35)",
        "(line 425,col 9)-(line 425,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImplTest.testDeterminant()",
      "begin_line": 430,
      "end_line": 443,
      "comment": " test determinant ",
      "child_ranges": [
        "(line 431,col 9)-(line 433,col 30)",
        "(line 434,col 9)-(line 436,col 30)",
        "(line 437,col 9)-(line 439,col 30)",
        "(line 440,col 9)-(line 442,col 30)"
      ]
    }
  ]
}