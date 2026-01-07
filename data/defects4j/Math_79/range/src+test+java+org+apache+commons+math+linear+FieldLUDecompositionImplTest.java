{
  "filepath": "/tmp/Math-79b/src/test/java/org/apache/commons/math/linear/FieldLUDecompositionImplTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FieldLUDecompositionImplTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 33,
      "end_line": 311,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testData"
      ],
      "begin_line": 34,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testDataMinus"
      ],
      "begin_line": 39,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "luData"
      ],
      "begin_line": 44,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "singular"
      ],
      "begin_line": 51,
      "end_line": 54,
      "comment": " singular matrices"
    },
    {
      "type": "field",
      "varNames": [
        "bigSingular"
      ],
      "begin_line": 55,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImplTest.FieldLUDecompositionImplTest(java.lang.String)",
      "begin_line": 62,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImplTest.suite()",
      "begin_line": 66,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 76)",
        "(line 68,col 9)-(line 68,col 56)",
        "(line 69,col 9)-(line 69,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImplTest.testDimensions()",
      "begin_line": 73,
      "end_line": 83,
      "comment": " test dimensions ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 85)",
        "(line 75,col 9)-(line 75,col 91)",
        "(line 76,col 9)-(line 76,col 67)",
        "(line 77,col 9)-(line 77,col 70)",
        "(line 78,col 9)-(line 78,col 67)",
        "(line 79,col 9)-(line 79,col 70)",
        "(line 80,col 9)-(line 80,col 67)",
        "(line 81,col 9)-(line 81,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImplTest.testNonSquare()",
      "begin_line": 86,
      "end_line": 98,
      "comment": " test non-square matrix ",
      "child_ranges": [
        "(line 87,col 9)-(line 97,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImplTest.testPAEqualLU()",
      "begin_line": 101,
      "end_line": 140,
      "comment": " test PA \u003d LU ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 85)",
        "(line 103,col 9)-(line 103,col 91)",
        "(line 104,col 9)-(line 104,col 44)",
        "(line 105,col 9)-(line 105,col 44)",
        "(line 106,col 9)-(line 106,col 44)",
        "(line 107,col 9)-(line 107,col 66)",
        "(line 109,col 9)-(line 109,col 68)",
        "(line 110,col 9)-(line 110,col 60)",
        "(line 111,col 9)-(line 111,col 22)",
        "(line 112,col 9)-(line 112,col 22)",
        "(line 113,col 9)-(line 113,col 22)",
        "(line 114,col 9)-(line 114,col 66)",
        "(line 116,col 9)-(line 116,col 90)",
        "(line 117,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 120,col 60)",
        "(line 121,col 9)-(line 121,col 22)",
        "(line 122,col 9)-(line 122,col 22)",
        "(line 123,col 9)-(line 123,col 22)",
        "(line 124,col 9)-(line 124,col 66)",
        "(line 126,col 9)-(line 126,col 63)",
        "(line 127,col 9)-(line 127,col 60)",
        "(line 128,col 9)-(line 128,col 52)",
        "(line 129,col 9)-(line 129,col 30)",
        "(line 130,col 9)-(line 130,col 30)",
        "(line 131,col 9)-(line 131,col 30)",
        "(line 133,col 9)-(line 133,col 66)",
        "(line 134,col 9)-(line 134,col 60)",
        "(line 135,col 9)-(line 135,col 52)",
        "(line 136,col 9)-(line 136,col 30)",
        "(line 137,col 9)-(line 137,col 30)",
        "(line 138,col 9)-(line 138,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImplTest.testLLowerTriangular()",
      "begin_line": 143,
      "end_line": 152,
      "comment": " test that L is lower triangular with unit diagonal ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 85)",
        "(line 145,col 9)-(line 145,col 88)",
        "(line 146,col 9)-(line 151,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImplTest.testUUpperTriangular()",
      "begin_line": 155,
      "end_line": 163,
      "comment": " test that U is upper triangular ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 85)",
        "(line 157,col 9)-(line 157,col 88)",
        "(line 158,col 9)-(line 162,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImplTest.testPPermutation()",
      "begin_line": 166,
      "end_line": 217,
      "comment": " test that P is a permutation matrix ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 85)",
        "(line 168,col 9)-(line 168,col 90)",
        "(line 170,col 9)-(line 170,col 62)",
        "(line 171,col 9)-(line 173,col 84)",
        "(line 174,col 9)-(line 176,col 9)",
        "(line 177,col 9)-(line 177,col 40)",
        "(line 179,col 9)-(line 196,col 9)",
        "(line 198,col 9)-(line 215,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImplTest.testSingular()",
      "begin_line": 221,
      "end_line": 229,
      "comment": " test singular ",
      "child_ranges": [
        "(line 222,col 9)-(line 223,col 98)",
        "(line 224,col 9)-(line 224,col 51)",
        "(line 225,col 9)-(line 225,col 99)",
        "(line 226,col 9)-(line 226,col 52)",
        "(line 227,col 9)-(line 227,col 102)",
        "(line 228,col 9)-(line 228,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImplTest.testMatricesValues1()",
      "begin_line": 232,
      "end_line": 269,
      "comment": " test matrices values ",
      "child_ranges": [
        "(line 233,col 8)-(line 234,col 98)",
        "(line 235,col 9)-(line 239,col 11)",
        "(line 240,col 9)-(line 244,col 11)",
        "(line 245,col 9)-(line 249,col 11)",
        "(line 250,col 9)-(line 250,col 37)",
        "(line 253,col 9)-(line 253,col 44)",
        "(line 254,col 9)-(line 254,col 40)",
        "(line 255,col 9)-(line 255,col 44)",
        "(line 256,col 9)-(line 256,col 40)",
        "(line 257,col 9)-(line 257,col 44)",
        "(line 258,col 9)-(line 258,col 40)",
        "(line 259,col 9)-(line 259,col 36)",
        "(line 260,col 9)-(line 262,col 9)",
        "(line 265,col 9)-(line 265,col 35)",
        "(line 266,col 9)-(line 266,col 35)",
        "(line 267,col 9)-(line 267,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImplTest.testMatricesValues2()",
      "begin_line": 272,
      "end_line": 309,
      "comment": " test matrices values ",
      "child_ranges": [
        "(line 273,col 8)-(line 274,col 96)",
        "(line 275,col 9)-(line 279,col 11)",
        "(line 280,col 9)-(line 284,col 11)",
        "(line 285,col 9)-(line 289,col 11)",
        "(line 290,col 9)-(line 290,col 37)",
        "(line 293,col 9)-(line 293,col 44)",
        "(line 294,col 9)-(line 294,col 40)",
        "(line 295,col 9)-(line 295,col 44)",
        "(line 296,col 9)-(line 296,col 40)",
        "(line 297,col 9)-(line 297,col 44)",
        "(line 298,col 9)-(line 298,col 40)",
        "(line 299,col 9)-(line 299,col 36)",
        "(line 300,col 9)-(line 302,col 9)",
        "(line 305,col 9)-(line 305,col 35)",
        "(line 306,col 9)-(line 306,col 35)",
        "(line 307,col 9)-(line 307,col 35)"
      ]
    }
  ]
}