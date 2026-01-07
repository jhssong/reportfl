{
  "filepath": "/tmp/Math-94b/src/test/org/apache/commons/math/linear/LUDecompositionImplTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LUDecompositionImplTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 24,
      "end_line": 297,
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
        "(line 69,col 9)-(line 69,col 67)",
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
        "(line 93,col 9)-(line 93,col 67)",
        "(line 94,col 9)-(line 94,col 61)",
        "(line 95,col 9)-(line 95,col 33)",
        "(line 96,col 9)-(line 96,col 33)",
        "(line 97,col 9)-(line 97,col 33)",
        "(line 98,col 9)-(line 98,col 75)",
        "(line 99,col 9)-(line 99,col 45)",
        "(line 101,col 9)-(line 101,col 61)",
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
        "(line 117,col 9)-(line 117,col 56)",
        "(line 118,col 9)-(line 118,col 45)",
        "(line 119,col 9)-(line 119,col 52)",
        "(line 120,col 9)-(line 120,col 30)",
        "(line 121,col 9)-(line 121,col 30)",
        "(line 122,col 9)-(line 122,col 30)",
        "(line 124,col 9)-(line 124,col 59)",
        "(line 125,col 9)-(line 125,col 45)",
        "(line 126,col 9)-(line 126,col 52)",
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
        "(line 135,col 9)-(line 135,col 67)",
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
        "(line 147,col 9)-(line 147,col 67)",
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
        "(line 158,col 9)-(line 158,col 67)",
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
        "(line 208,col 9)-(line 209,col 76)",
        "(line 210,col 9)-(line 210,col 51)",
        "(line 211,col 9)-(line 211,col 77)",
        "(line 212,col 9)-(line 212,col 52)",
        "(line 213,col 9)-(line 213,col 80)",
        "(line 214,col 9)-(line 214,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImplTest.testMatricesValues1()",
      "begin_line": 218,
      "end_line": 255,
      "comment": " test matrices values ",
      "child_ranges": [
        "(line 219,col 8)-(line 220,col 76)",
        "(line 221,col 9)-(line 225,col 11)",
        "(line 226,col 9)-(line 230,col 11)",
        "(line 231,col 9)-(line 235,col 11)",
        "(line 236,col 9)-(line 236,col 37)",
        "(line 239,col 9)-(line 239,col 33)",
        "(line 240,col 9)-(line 240,col 61)",
        "(line 241,col 9)-(line 241,col 33)",
        "(line 242,col 9)-(line 242,col 61)",
        "(line 243,col 9)-(line 243,col 33)",
        "(line 244,col 9)-(line 244,col 61)",
        "(line 245,col 9)-(line 245,col 36)",
        "(line 246,col 9)-(line 248,col 9)",
        "(line 251,col 9)-(line 251,col 35)",
        "(line 252,col 9)-(line 252,col 35)",
        "(line 253,col 9)-(line 253,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImplTest.testMatricesValues2()",
      "begin_line": 258,
      "end_line": 295,
      "comment": " test matrices values ",
      "child_ranges": [
        "(line 259,col 8)-(line 260,col 74)",
        "(line 261,col 9)-(line 265,col 11)",
        "(line 266,col 9)-(line 270,col 11)",
        "(line 271,col 9)-(line 275,col 11)",
        "(line 276,col 9)-(line 276,col 37)",
        "(line 279,col 9)-(line 279,col 33)",
        "(line 280,col 9)-(line 280,col 61)",
        "(line 281,col 9)-(line 281,col 33)",
        "(line 282,col 9)-(line 282,col 61)",
        "(line 283,col 9)-(line 283,col 33)",
        "(line 284,col 9)-(line 284,col 61)",
        "(line 285,col 9)-(line 285,col 36)",
        "(line 286,col 9)-(line 288,col 9)",
        "(line 291,col 9)-(line 291,col 35)",
        "(line 292,col 9)-(line 292,col 35)",
        "(line 293,col 9)-(line 293,col 35)"
      ]
    }
  ]
}