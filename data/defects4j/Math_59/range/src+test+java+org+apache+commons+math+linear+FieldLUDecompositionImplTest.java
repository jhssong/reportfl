{
  "filepath": "/tmp/Math-59b/src/test/java/org/apache/commons/math/linear/FieldLUDecompositionImplTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FieldLUDecompositionImplTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 27,
      "end_line": 297,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testData"
      ],
      "begin_line": 28,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testDataMinus"
      ],
      "begin_line": 33,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "luData"
      ],
      "begin_line": 38,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "singular"
      ],
      "begin_line": 45,
      "end_line": 48,
      "comment": " singular matrices"
    },
    {
      "type": "field",
      "varNames": [
        "bigSingular"
      ],
      "begin_line": 49,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImplTest.FieldLUDecompositionImplTest(java.lang.String)",
      "begin_line": 56,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImplTest.testDimensions()",
      "begin_line": 61,
      "end_line": 71,
      "comment": " test dimensions ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 85)",
        "(line 63,col 9)-(line 63,col 91)",
        "(line 64,col 9)-(line 64,col 67)",
        "(line 65,col 9)-(line 65,col 70)",
        "(line 66,col 9)-(line 66,col 67)",
        "(line 67,col 9)-(line 67,col 70)",
        "(line 68,col 9)-(line 68,col 67)",
        "(line 69,col 9)-(line 69,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImplTest.testNonSquare()",
      "begin_line": 74,
      "end_line": 84,
      "comment": " test non-square matrix ",
      "child_ranges": [
        "(line 75,col 9)-(line 83,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImplTest.testPAEqualLU()",
      "begin_line": 87,
      "end_line": 126,
      "comment": " test PA \u003d LU ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 85)",
        "(line 89,col 9)-(line 89,col 91)",
        "(line 90,col 9)-(line 90,col 44)",
        "(line 91,col 9)-(line 91,col 44)",
        "(line 92,col 9)-(line 92,col 44)",
        "(line 93,col 9)-(line 93,col 66)",
        "(line 95,col 9)-(line 95,col 68)",
        "(line 96,col 9)-(line 96,col 60)",
        "(line 97,col 9)-(line 97,col 22)",
        "(line 98,col 9)-(line 98,col 22)",
        "(line 99,col 9)-(line 99,col 22)",
        "(line 100,col 9)-(line 100,col 66)",
        "(line 102,col 9)-(line 102,col 90)",
        "(line 103,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 106,col 60)",
        "(line 107,col 9)-(line 107,col 22)",
        "(line 108,col 9)-(line 108,col 22)",
        "(line 109,col 9)-(line 109,col 22)",
        "(line 110,col 9)-(line 110,col 66)",
        "(line 112,col 9)-(line 112,col 63)",
        "(line 113,col 9)-(line 113,col 60)",
        "(line 114,col 9)-(line 114,col 52)",
        "(line 115,col 9)-(line 115,col 30)",
        "(line 116,col 9)-(line 116,col 30)",
        "(line 117,col 9)-(line 117,col 30)",
        "(line 119,col 9)-(line 119,col 66)",
        "(line 120,col 9)-(line 120,col 60)",
        "(line 121,col 9)-(line 121,col 52)",
        "(line 122,col 9)-(line 122,col 30)",
        "(line 123,col 9)-(line 123,col 30)",
        "(line 124,col 9)-(line 124,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImplTest.testLLowerTriangular()",
      "begin_line": 129,
      "end_line": 138,
      "comment": " test that L is lower triangular with unit diagonal ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 85)",
        "(line 131,col 9)-(line 131,col 88)",
        "(line 132,col 9)-(line 137,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImplTest.testUUpperTriangular()",
      "begin_line": 141,
      "end_line": 149,
      "comment": " test that U is upper triangular ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 85)",
        "(line 143,col 9)-(line 143,col 88)",
        "(line 144,col 9)-(line 148,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImplTest.testPPermutation()",
      "begin_line": 152,
      "end_line": 203,
      "comment": " test that P is a permutation matrix ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 85)",
        "(line 154,col 9)-(line 154,col 90)",
        "(line 156,col 9)-(line 156,col 62)",
        "(line 157,col 9)-(line 159,col 84)",
        "(line 160,col 9)-(line 162,col 9)",
        "(line 163,col 9)-(line 163,col 40)",
        "(line 165,col 9)-(line 182,col 9)",
        "(line 184,col 9)-(line 201,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImplTest.testSingular()",
      "begin_line": 207,
      "end_line": 215,
      "comment": " test singular ",
      "child_ranges": [
        "(line 208,col 9)-(line 209,col 98)",
        "(line 210,col 9)-(line 210,col 51)",
        "(line 211,col 9)-(line 211,col 99)",
        "(line 212,col 9)-(line 212,col 52)",
        "(line 213,col 9)-(line 213,col 102)",
        "(line 214,col 9)-(line 214,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImplTest.testMatricesValues1()",
      "begin_line": 218,
      "end_line": 255,
      "comment": " test matrices values ",
      "child_ranges": [
        "(line 219,col 8)-(line 220,col 98)",
        "(line 221,col 9)-(line 225,col 11)",
        "(line 226,col 9)-(line 230,col 11)",
        "(line 231,col 9)-(line 235,col 11)",
        "(line 236,col 9)-(line 236,col 37)",
        "(line 239,col 9)-(line 239,col 44)",
        "(line 240,col 9)-(line 240,col 40)",
        "(line 241,col 9)-(line 241,col 44)",
        "(line 242,col 9)-(line 242,col 40)",
        "(line 243,col 9)-(line 243,col 44)",
        "(line 244,col 9)-(line 244,col 40)",
        "(line 245,col 9)-(line 245,col 36)",
        "(line 246,col 9)-(line 248,col 9)",
        "(line 251,col 9)-(line 251,col 35)",
        "(line 252,col 9)-(line 252,col 35)",
        "(line 253,col 9)-(line 253,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImplTest.testMatricesValues2()",
      "begin_line": 258,
      "end_line": 295,
      "comment": " test matrices values ",
      "child_ranges": [
        "(line 259,col 8)-(line 260,col 96)",
        "(line 261,col 9)-(line 265,col 11)",
        "(line 266,col 9)-(line 270,col 11)",
        "(line 271,col 9)-(line 275,col 11)",
        "(line 276,col 9)-(line 276,col 37)",
        "(line 279,col 9)-(line 279,col 44)",
        "(line 280,col 9)-(line 280,col 40)",
        "(line 281,col 9)-(line 281,col 44)",
        "(line 282,col 9)-(line 282,col 40)",
        "(line 283,col 9)-(line 283,col 44)",
        "(line 284,col 9)-(line 284,col 40)",
        "(line 285,col 9)-(line 285,col 36)",
        "(line 286,col 9)-(line 288,col 9)",
        "(line 291,col 9)-(line 291,col 35)",
        "(line 292,col 9)-(line 292,col 35)",
        "(line 293,col 9)-(line 293,col 35)"
      ]
    }
  ]
}