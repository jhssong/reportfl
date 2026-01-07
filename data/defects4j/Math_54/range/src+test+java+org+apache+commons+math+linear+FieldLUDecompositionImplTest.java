{
  "filepath": "/tmp/Math-54b/src/test/java/org/apache/commons/math/linear/FieldLUDecompositionImplTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FieldLUDecompositionImplTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 301,
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
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImplTest.testDimensions()",
      "begin_line": 57,
      "end_line": 68,
      "comment": " test dimensions ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 85)",
        "(line 60,col 9)-(line 60,col 91)",
        "(line 61,col 9)-(line 61,col 74)",
        "(line 62,col 9)-(line 62,col 77)",
        "(line 63,col 9)-(line 63,col 74)",
        "(line 64,col 9)-(line 64,col 77)",
        "(line 65,col 9)-(line 65,col 74)",
        "(line 66,col 9)-(line 66,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImplTest.testNonSquare()",
      "begin_line": 71,
      "end_line": 83,
      "comment": " test non-square matrix ",
      "child_ranges": [
        "(line 73,col 9)-(line 82,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImplTest.testPAEqualLU()",
      "begin_line": 86,
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
        "(line 114,col 9)-(line 114,col 59)",
        "(line 115,col 9)-(line 115,col 37)",
        "(line 116,col 9)-(line 116,col 37)",
        "(line 117,col 9)-(line 117,col 37)",
        "(line 119,col 9)-(line 119,col 66)",
        "(line 120,col 9)-(line 120,col 60)",
        "(line 121,col 9)-(line 121,col 59)",
        "(line 122,col 9)-(line 122,col 37)",
        "(line 123,col 9)-(line 123,col 37)",
        "(line 124,col 9)-(line 124,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImplTest.testLLowerTriangular()",
      "begin_line": 129,
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
      "end_line": 151,
      "comment": " test that U is upper triangular ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 85)",
        "(line 145,col 9)-(line 145,col 88)",
        "(line 146,col 9)-(line 150,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImplTest.testPPermutation()",
      "begin_line": 154,
      "end_line": 206,
      "comment": " test that P is a permutation matrix ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 85)",
        "(line 157,col 9)-(line 157,col 90)",
        "(line 159,col 9)-(line 159,col 62)",
        "(line 160,col 9)-(line 162,col 84)",
        "(line 163,col 9)-(line 165,col 9)",
        "(line 166,col 9)-(line 166,col 40)",
        "(line 168,col 9)-(line 185,col 9)",
        "(line 187,col 9)-(line 204,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImplTest.testSingular()",
      "begin_line": 210,
      "end_line": 219,
      "comment": " test singular ",
      "child_ranges": [
        "(line 212,col 9)-(line 213,col 98)",
        "(line 214,col 9)-(line 214,col 58)",
        "(line 215,col 9)-(line 215,col 99)",
        "(line 216,col 9)-(line 216,col 59)",
        "(line 217,col 9)-(line 217,col 102)",
        "(line 218,col 9)-(line 218,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImplTest.testMatricesValues1()",
      "begin_line": 222,
      "end_line": 260,
      "comment": " test matrices values ",
      "child_ranges": [
        "(line 224,col 8)-(line 225,col 98)",
        "(line 226,col 9)-(line 230,col 11)",
        "(line 231,col 9)-(line 235,col 11)",
        "(line 236,col 9)-(line 240,col 11)",
        "(line 241,col 9)-(line 241,col 37)",
        "(line 244,col 9)-(line 244,col 44)",
        "(line 245,col 9)-(line 245,col 40)",
        "(line 246,col 9)-(line 246,col 44)",
        "(line 247,col 9)-(line 247,col 40)",
        "(line 248,col 9)-(line 248,col 44)",
        "(line 249,col 9)-(line 249,col 40)",
        "(line 250,col 9)-(line 250,col 36)",
        "(line 251,col 9)-(line 253,col 9)",
        "(line 256,col 9)-(line 256,col 42)",
        "(line 257,col 9)-(line 257,col 42)",
        "(line 258,col 9)-(line 258,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImplTest.testMatricesValues2()",
      "begin_line": 263,
      "end_line": 300,
      "comment": " test matrices values ",
      "child_ranges": [
        "(line 265,col 8)-(line 266,col 96)",
        "(line 267,col 9)-(line 271,col 11)",
        "(line 272,col 9)-(line 276,col 11)",
        "(line 277,col 9)-(line 281,col 11)",
        "(line 282,col 9)-(line 282,col 37)",
        "(line 285,col 9)-(line 285,col 44)",
        "(line 286,col 9)-(line 286,col 40)",
        "(line 287,col 9)-(line 287,col 44)",
        "(line 288,col 9)-(line 288,col 40)",
        "(line 289,col 9)-(line 289,col 44)",
        "(line 290,col 9)-(line 290,col 40)",
        "(line 291,col 9)-(line 291,col 36)",
        "(line 292,col 9)-(line 294,col 9)",
        "(line 297,col 9)-(line 297,col 42)",
        "(line 298,col 9)-(line 298,col 42)",
        "(line 299,col 9)-(line 299,col 42)"
      ]
    }
  ]
}