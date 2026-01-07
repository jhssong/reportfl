{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/linear/FieldLUDecompositionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FieldLUDecompositionTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 303,
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
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldLUDecompositionTest.testDimensions()",
      "begin_line": 57,
      "end_line": 69,
      "comment": " test dimensions ",
      "child_ranges": [
        "(line 59,col 9)-(line 60,col 87)",
        "(line 61,col 9)-(line 61,col 87)",
        "(line 62,col 9)-(line 62,col 74)",
        "(line 63,col 9)-(line 63,col 77)",
        "(line 64,col 9)-(line 64,col 74)",
        "(line 65,col 9)-(line 65,col 77)",
        "(line 66,col 9)-(line 66,col 74)",
        "(line 67,col 9)-(line 67,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldLUDecompositionTest.testNonSquare()",
      "begin_line": 72,
      "end_line": 85,
      "comment": " test non-square matrix ",
      "child_ranges": [
        "(line 74,col 9)-(line 84,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldLUDecompositionTest.testPAEqualLU()",
      "begin_line": 88,
      "end_line": 128,
      "comment": " test PA \u003d LU ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 114)",
        "(line 91,col 9)-(line 91,col 87)",
        "(line 92,col 9)-(line 92,col 44)",
        "(line 93,col 9)-(line 93,col 44)",
        "(line 94,col 9)-(line 94,col 44)",
        "(line 95,col 9)-(line 95,col 66)",
        "(line 97,col 9)-(line 97,col 97)",
        "(line 98,col 9)-(line 98,col 56)",
        "(line 99,col 9)-(line 99,col 22)",
        "(line 100,col 9)-(line 100,col 22)",
        "(line 101,col 9)-(line 101,col 22)",
        "(line 102,col 9)-(line 102,col 66)",
        "(line 104,col 9)-(line 104,col 90)",
        "(line 105,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 108,col 56)",
        "(line 109,col 9)-(line 109,col 22)",
        "(line 110,col 9)-(line 110,col 22)",
        "(line 111,col 9)-(line 111,col 22)",
        "(line 112,col 9)-(line 112,col 66)",
        "(line 114,col 9)-(line 114,col 92)",
        "(line 115,col 9)-(line 115,col 56)",
        "(line 116,col 9)-(line 116,col 59)",
        "(line 117,col 9)-(line 117,col 37)",
        "(line 118,col 9)-(line 118,col 37)",
        "(line 119,col 9)-(line 119,col 37)",
        "(line 121,col 9)-(line 121,col 95)",
        "(line 122,col 9)-(line 122,col 56)",
        "(line 123,col 9)-(line 123,col 59)",
        "(line 124,col 9)-(line 124,col 37)",
        "(line 125,col 9)-(line 125,col 37)",
        "(line 126,col 9)-(line 126,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldLUDecompositionTest.testLLowerTriangular()",
      "begin_line": 131,
      "end_line": 141,
      "comment": " test that L is lower triangular with unit diagonal ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 114)",
        "(line 134,col 9)-(line 134,col 84)",
        "(line 135,col 9)-(line 140,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldLUDecompositionTest.testUUpperTriangular()",
      "begin_line": 144,
      "end_line": 153,
      "comment": " test that U is upper triangular ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 114)",
        "(line 147,col 9)-(line 147,col 84)",
        "(line 148,col 9)-(line 152,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldLUDecompositionTest.testPPermutation()",
      "begin_line": 156,
      "end_line": 208,
      "comment": " test that P is a permutation matrix ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 114)",
        "(line 159,col 9)-(line 159,col 86)",
        "(line 161,col 9)-(line 161,col 62)",
        "(line 162,col 9)-(line 164,col 84)",
        "(line 165,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 168,col 40)",
        "(line 170,col 9)-(line 187,col 9)",
        "(line 189,col 9)-(line 206,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldLUDecompositionTest.testSingular()",
      "begin_line": 212,
      "end_line": 221,
      "comment": " test singular ",
      "child_ranges": [
        "(line 214,col 9)-(line 215,col 123)",
        "(line 216,col 9)-(line 216,col 58)",
        "(line 217,col 9)-(line 217,col 124)",
        "(line 218,col 9)-(line 218,col 59)",
        "(line 219,col 9)-(line 219,col 127)",
        "(line 220,col 9)-(line 220,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldLUDecompositionTest.testMatricesValues1()",
      "begin_line": 224,
      "end_line": 262,
      "comment": " test matrices values ",
      "child_ranges": [
        "(line 226,col 8)-(line 227,col 123)",
        "(line 228,col 9)-(line 232,col 11)",
        "(line 233,col 9)-(line 237,col 11)",
        "(line 238,col 9)-(line 242,col 11)",
        "(line 243,col 9)-(line 243,col 37)",
        "(line 246,col 9)-(line 246,col 44)",
        "(line 247,col 9)-(line 247,col 40)",
        "(line 248,col 9)-(line 248,col 44)",
        "(line 249,col 9)-(line 249,col 40)",
        "(line 250,col 9)-(line 250,col 44)",
        "(line 251,col 9)-(line 251,col 40)",
        "(line 252,col 9)-(line 252,col 36)",
        "(line 253,col 9)-(line 255,col 9)",
        "(line 258,col 9)-(line 258,col 42)",
        "(line 259,col 9)-(line 259,col 42)",
        "(line 260,col 9)-(line 260,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldLUDecompositionTest.testMatricesValues2()",
      "begin_line": 265,
      "end_line": 302,
      "comment": " test matrices values ",
      "child_ranges": [
        "(line 267,col 8)-(line 268,col 121)",
        "(line 269,col 9)-(line 273,col 11)",
        "(line 274,col 9)-(line 278,col 11)",
        "(line 279,col 9)-(line 283,col 11)",
        "(line 284,col 9)-(line 284,col 37)",
        "(line 287,col 9)-(line 287,col 44)",
        "(line 288,col 9)-(line 288,col 40)",
        "(line 289,col 9)-(line 289,col 44)",
        "(line 290,col 9)-(line 290,col 40)",
        "(line 291,col 9)-(line 291,col 44)",
        "(line 292,col 9)-(line 292,col 40)",
        "(line 293,col 9)-(line 293,col 36)",
        "(line 294,col 9)-(line 296,col 9)",
        "(line 299,col 9)-(line 299,col 42)",
        "(line 300,col 9)-(line 300,col 42)",
        "(line 301,col 9)-(line 301,col 42)"
      ]
    }
  ]
}