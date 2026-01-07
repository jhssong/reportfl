{
  "filepath": "/tmp/Math-79b/src/test/java/org/apache/commons/math/linear/LUDecompositionImplTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LUDecompositionImplTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 30,
      "end_line": 303,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testData"
      ],
      "begin_line": 31,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testDataMinus"
      ],
      "begin_line": 36,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "luData"
      ],
      "begin_line": 41,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "singular"
      ],
      "begin_line": 48,
      "end_line": 51,
      "comment": " singular matrices"
    },
    {
      "type": "field",
      "varNames": [
        "bigSingular"
      ],
      "begin_line": 52,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entryTolerance"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "normTolerance"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.LUDecompositionImplTest.LUDecompositionImplTest(java.lang.String)",
      "begin_line": 63,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImplTest.suite()",
      "begin_line": 67,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 71)",
        "(line 69,col 9)-(line 69,col 51)",
        "(line 70,col 9)-(line 70,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImplTest.testDimensions()",
      "begin_line": 74,
      "end_line": 84,
      "comment": " test dimensions ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 67)",
        "(line 76,col 9)-(line 76,col 61)",
        "(line 77,col 9)-(line 77,col 67)",
        "(line 78,col 9)-(line 78,col 70)",
        "(line 79,col 9)-(line 79,col 67)",
        "(line 80,col 9)-(line 80,col 70)",
        "(line 81,col 9)-(line 81,col 67)",
        "(line 82,col 9)-(line 82,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImplTest.testNonSquare()",
      "begin_line": 87,
      "end_line": 95,
      "comment": " test non-square matrix ",
      "child_ranges": [
        "(line 88,col 9)-(line 94,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImplTest.testPAEqualLU()",
      "begin_line": 98,
      "end_line": 137,
      "comment": " test PA \u003d LU ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 67)",
        "(line 100,col 9)-(line 100,col 61)",
        "(line 101,col 9)-(line 101,col 33)",
        "(line 102,col 9)-(line 102,col 33)",
        "(line 103,col 9)-(line 103,col 33)",
        "(line 104,col 9)-(line 104,col 75)",
        "(line 105,col 9)-(line 105,col 45)",
        "(line 107,col 9)-(line 107,col 61)",
        "(line 108,col 9)-(line 108,col 45)",
        "(line 109,col 9)-(line 109,col 22)",
        "(line 110,col 9)-(line 110,col 22)",
        "(line 111,col 9)-(line 111,col 22)",
        "(line 112,col 9)-(line 112,col 68)",
        "(line 113,col 9)-(line 113,col 45)",
        "(line 115,col 9)-(line 115,col 58)",
        "(line 116,col 9)-(line 116,col 45)",
        "(line 117,col 9)-(line 117,col 22)",
        "(line 118,col 9)-(line 118,col 22)",
        "(line 119,col 9)-(line 119,col 22)",
        "(line 120,col 9)-(line 120,col 68)",
        "(line 121,col 9)-(line 121,col 45)",
        "(line 123,col 9)-(line 123,col 56)",
        "(line 124,col 9)-(line 124,col 45)",
        "(line 125,col 9)-(line 125,col 52)",
        "(line 126,col 9)-(line 126,col 30)",
        "(line 127,col 9)-(line 127,col 30)",
        "(line 128,col 9)-(line 128,col 30)",
        "(line 130,col 9)-(line 130,col 59)",
        "(line 131,col 9)-(line 131,col 45)",
        "(line 132,col 9)-(line 132,col 52)",
        "(line 133,col 9)-(line 133,col 30)",
        "(line 134,col 9)-(line 134,col 30)",
        "(line 135,col 9)-(line 135,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImplTest.testLLowerTriangular()",
      "begin_line": 140,
      "end_line": 149,
      "comment": " test that L is lower triangular with unit diagonal ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 67)",
        "(line 142,col 9)-(line 142,col 62)",
        "(line 143,col 9)-(line 148,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImplTest.testUUpperTriangular()",
      "begin_line": 152,
      "end_line": 160,
      "comment": " test that U is upper triangular ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 67)",
        "(line 154,col 9)-(line 154,col 62)",
        "(line 155,col 9)-(line 159,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImplTest.testPPermutation()",
      "begin_line": 163,
      "end_line": 209,
      "comment": " test that P is a permutation matrix ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 67)",
        "(line 165,col 9)-(line 165,col 64)",
        "(line 167,col 9)-(line 167,col 51)",
        "(line 168,col 9)-(line 168,col 83)",
        "(line 169,col 9)-(line 169,col 67)",
        "(line 171,col 9)-(line 188,col 9)",
        "(line 190,col 9)-(line 207,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImplTest.testSingular()",
      "begin_line": 213,
      "end_line": 221,
      "comment": " test singular ",
      "child_ranges": [
        "(line 214,col 9)-(line 215,col 76)",
        "(line 216,col 9)-(line 216,col 51)",
        "(line 217,col 9)-(line 217,col 77)",
        "(line 218,col 9)-(line 218,col 52)",
        "(line 219,col 9)-(line 219,col 80)",
        "(line 220,col 9)-(line 220,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImplTest.testMatricesValues1()",
      "begin_line": 224,
      "end_line": 261,
      "comment": " test matrices values ",
      "child_ranges": [
        "(line 225,col 8)-(line 226,col 76)",
        "(line 227,col 9)-(line 231,col 11)",
        "(line 232,col 9)-(line 236,col 11)",
        "(line 237,col 9)-(line 241,col 11)",
        "(line 242,col 9)-(line 242,col 37)",
        "(line 245,col 9)-(line 245,col 33)",
        "(line 246,col 9)-(line 246,col 61)",
        "(line 247,col 9)-(line 247,col 33)",
        "(line 248,col 9)-(line 248,col 61)",
        "(line 249,col 9)-(line 249,col 33)",
        "(line 250,col 9)-(line 250,col 61)",
        "(line 251,col 9)-(line 251,col 36)",
        "(line 252,col 9)-(line 254,col 9)",
        "(line 257,col 9)-(line 257,col 35)",
        "(line 258,col 9)-(line 258,col 35)",
        "(line 259,col 9)-(line 259,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImplTest.testMatricesValues2()",
      "begin_line": 264,
      "end_line": 301,
      "comment": " test matrices values ",
      "child_ranges": [
        "(line 265,col 8)-(line 266,col 74)",
        "(line 267,col 9)-(line 271,col 11)",
        "(line 272,col 9)-(line 276,col 11)",
        "(line 277,col 9)-(line 281,col 11)",
        "(line 282,col 9)-(line 282,col 37)",
        "(line 285,col 9)-(line 285,col 33)",
        "(line 286,col 9)-(line 286,col 61)",
        "(line 287,col 9)-(line 287,col 33)",
        "(line 288,col 9)-(line 288,col 61)",
        "(line 289,col 9)-(line 289,col 33)",
        "(line 290,col 9)-(line 290,col 61)",
        "(line 291,col 9)-(line 291,col 36)",
        "(line 292,col 9)-(line 294,col 9)",
        "(line 297,col 9)-(line 297,col 35)",
        "(line 298,col 9)-(line 298,col 35)",
        "(line 299,col 9)-(line 299,col 35)"
      ]
    }
  ]
}