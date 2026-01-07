{
  "filepath": "/tmp/Math-70b/src/test/java/org/apache/commons/math/linear/FieldLUDecompositionImplTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FieldLUDecompositionImplTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 26,
      "end_line": 298,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testData"
      ],
      "begin_line": 27,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testDataMinus"
      ],
      "begin_line": 32,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "luData"
      ],
      "begin_line": 37,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "singular"
      ],
      "begin_line": 44,
      "end_line": 47,
      "comment": " singular matrices"
    },
    {
      "type": "field",
      "varNames": [
        "bigSingular"
      ],
      "begin_line": 48,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImplTest.FieldLUDecompositionImplTest(java.lang.String)",
      "begin_line": 55,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImplTest.testDimensions()",
      "begin_line": 60,
      "end_line": 70,
      "comment": " test dimensions ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 85)",
        "(line 62,col 9)-(line 62,col 91)",
        "(line 63,col 9)-(line 63,col 67)",
        "(line 64,col 9)-(line 64,col 70)",
        "(line 65,col 9)-(line 65,col 67)",
        "(line 66,col 9)-(line 66,col 70)",
        "(line 67,col 9)-(line 67,col 67)",
        "(line 68,col 9)-(line 68,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImplTest.testNonSquare()",
      "begin_line": 73,
      "end_line": 85,
      "comment": " test non-square matrix ",
      "child_ranges": [
        "(line 74,col 9)-(line 84,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImplTest.testPAEqualLU()",
      "begin_line": 88,
      "end_line": 127,
      "comment": " test PA \u003d LU ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 85)",
        "(line 90,col 9)-(line 90,col 91)",
        "(line 91,col 9)-(line 91,col 44)",
        "(line 92,col 9)-(line 92,col 44)",
        "(line 93,col 9)-(line 93,col 44)",
        "(line 94,col 9)-(line 94,col 66)",
        "(line 96,col 9)-(line 96,col 68)",
        "(line 97,col 9)-(line 97,col 60)",
        "(line 98,col 9)-(line 98,col 22)",
        "(line 99,col 9)-(line 99,col 22)",
        "(line 100,col 9)-(line 100,col 22)",
        "(line 101,col 9)-(line 101,col 66)",
        "(line 103,col 9)-(line 103,col 90)",
        "(line 104,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 107,col 60)",
        "(line 108,col 9)-(line 108,col 22)",
        "(line 109,col 9)-(line 109,col 22)",
        "(line 110,col 9)-(line 110,col 22)",
        "(line 111,col 9)-(line 111,col 66)",
        "(line 113,col 9)-(line 113,col 63)",
        "(line 114,col 9)-(line 114,col 60)",
        "(line 115,col 9)-(line 115,col 52)",
        "(line 116,col 9)-(line 116,col 30)",
        "(line 117,col 9)-(line 117,col 30)",
        "(line 118,col 9)-(line 118,col 30)",
        "(line 120,col 9)-(line 120,col 66)",
        "(line 121,col 9)-(line 121,col 60)",
        "(line 122,col 9)-(line 122,col 52)",
        "(line 123,col 9)-(line 123,col 30)",
        "(line 124,col 9)-(line 124,col 30)",
        "(line 125,col 9)-(line 125,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImplTest.testLLowerTriangular()",
      "begin_line": 130,
      "end_line": 139,
      "comment": " test that L is lower triangular with unit diagonal ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 85)",
        "(line 132,col 9)-(line 132,col 88)",
        "(line 133,col 9)-(line 138,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImplTest.testUUpperTriangular()",
      "begin_line": 142,
      "end_line": 150,
      "comment": " test that U is upper triangular ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 85)",
        "(line 144,col 9)-(line 144,col 88)",
        "(line 145,col 9)-(line 149,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImplTest.testPPermutation()",
      "begin_line": 153,
      "end_line": 204,
      "comment": " test that P is a permutation matrix ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 85)",
        "(line 155,col 9)-(line 155,col 90)",
        "(line 157,col 9)-(line 157,col 62)",
        "(line 158,col 9)-(line 160,col 84)",
        "(line 161,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 164,col 40)",
        "(line 166,col 9)-(line 183,col 9)",
        "(line 185,col 9)-(line 202,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImplTest.testSingular()",
      "begin_line": 208,
      "end_line": 216,
      "comment": " test singular ",
      "child_ranges": [
        "(line 209,col 9)-(line 210,col 98)",
        "(line 211,col 9)-(line 211,col 51)",
        "(line 212,col 9)-(line 212,col 99)",
        "(line 213,col 9)-(line 213,col 52)",
        "(line 214,col 9)-(line 214,col 102)",
        "(line 215,col 9)-(line 215,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImplTest.testMatricesValues1()",
      "begin_line": 219,
      "end_line": 256,
      "comment": " test matrices values ",
      "child_ranges": [
        "(line 220,col 8)-(line 221,col 98)",
        "(line 222,col 9)-(line 226,col 11)",
        "(line 227,col 9)-(line 231,col 11)",
        "(line 232,col 9)-(line 236,col 11)",
        "(line 237,col 9)-(line 237,col 37)",
        "(line 240,col 9)-(line 240,col 44)",
        "(line 241,col 9)-(line 241,col 40)",
        "(line 242,col 9)-(line 242,col 44)",
        "(line 243,col 9)-(line 243,col 40)",
        "(line 244,col 9)-(line 244,col 44)",
        "(line 245,col 9)-(line 245,col 40)",
        "(line 246,col 9)-(line 246,col 36)",
        "(line 247,col 9)-(line 249,col 9)",
        "(line 252,col 9)-(line 252,col 35)",
        "(line 253,col 9)-(line 253,col 35)",
        "(line 254,col 9)-(line 254,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImplTest.testMatricesValues2()",
      "begin_line": 259,
      "end_line": 296,
      "comment": " test matrices values ",
      "child_ranges": [
        "(line 260,col 8)-(line 261,col 96)",
        "(line 262,col 9)-(line 266,col 11)",
        "(line 267,col 9)-(line 271,col 11)",
        "(line 272,col 9)-(line 276,col 11)",
        "(line 277,col 9)-(line 277,col 37)",
        "(line 280,col 9)-(line 280,col 44)",
        "(line 281,col 9)-(line 281,col 40)",
        "(line 282,col 9)-(line 282,col 44)",
        "(line 283,col 9)-(line 283,col 40)",
        "(line 284,col 9)-(line 284,col 44)",
        "(line 285,col 9)-(line 285,col 40)",
        "(line 286,col 9)-(line 286,col 36)",
        "(line 287,col 9)-(line 289,col 9)",
        "(line 292,col 9)-(line 292,col 35)",
        "(line 293,col 9)-(line 293,col 35)",
        "(line 294,col 9)-(line 294,col 35)"
      ]
    }
  ]
}