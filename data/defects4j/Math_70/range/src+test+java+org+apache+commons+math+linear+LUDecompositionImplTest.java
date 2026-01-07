{
  "filepath": "/tmp/Math-70b/src/test/java/org/apache/commons/math/linear/LUDecompositionImplTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LUDecompositionImplTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 22,
      "end_line": 289,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testData"
      ],
      "begin_line": 23,
      "end_line": 27,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testDataMinus"
      ],
      "begin_line": 28,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "luData"
      ],
      "begin_line": 33,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "singular"
      ],
      "begin_line": 40,
      "end_line": 43,
      "comment": " singular matrices"
    },
    {
      "type": "field",
      "varNames": [
        "bigSingular"
      ],
      "begin_line": 44,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entryTolerance"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "normTolerance"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.LUDecompositionImplTest.LUDecompositionImplTest(java.lang.String)",
      "begin_line": 55,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImplTest.testDimensions()",
      "begin_line": 60,
      "end_line": 70,
      "comment": " test dimensions ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 67)",
        "(line 62,col 9)-(line 62,col 61)",
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
      "signature": "org.apache.commons.math.linear.LUDecompositionImplTest.testNonSquare()",
      "begin_line": 73,
      "end_line": 81,
      "comment": " test non-square matrix ",
      "child_ranges": [
        "(line 74,col 9)-(line 80,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImplTest.testPAEqualLU()",
      "begin_line": 84,
      "end_line": 123,
      "comment": " test PA \u003d LU ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 67)",
        "(line 86,col 9)-(line 86,col 61)",
        "(line 87,col 9)-(line 87,col 33)",
        "(line 88,col 9)-(line 88,col 33)",
        "(line 89,col 9)-(line 89,col 33)",
        "(line 90,col 9)-(line 90,col 75)",
        "(line 91,col 9)-(line 91,col 45)",
        "(line 93,col 9)-(line 93,col 61)",
        "(line 94,col 9)-(line 94,col 45)",
        "(line 95,col 9)-(line 95,col 22)",
        "(line 96,col 9)-(line 96,col 22)",
        "(line 97,col 9)-(line 97,col 22)",
        "(line 98,col 9)-(line 98,col 68)",
        "(line 99,col 9)-(line 99,col 45)",
        "(line 101,col 9)-(line 101,col 58)",
        "(line 102,col 9)-(line 102,col 45)",
        "(line 103,col 9)-(line 103,col 22)",
        "(line 104,col 9)-(line 104,col 22)",
        "(line 105,col 9)-(line 105,col 22)",
        "(line 106,col 9)-(line 106,col 68)",
        "(line 107,col 9)-(line 107,col 45)",
        "(line 109,col 9)-(line 109,col 56)",
        "(line 110,col 9)-(line 110,col 45)",
        "(line 111,col 9)-(line 111,col 52)",
        "(line 112,col 9)-(line 112,col 30)",
        "(line 113,col 9)-(line 113,col 30)",
        "(line 114,col 9)-(line 114,col 30)",
        "(line 116,col 9)-(line 116,col 59)",
        "(line 117,col 9)-(line 117,col 45)",
        "(line 118,col 9)-(line 118,col 52)",
        "(line 119,col 9)-(line 119,col 30)",
        "(line 120,col 9)-(line 120,col 30)",
        "(line 121,col 9)-(line 121,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImplTest.testLLowerTriangular()",
      "begin_line": 126,
      "end_line": 135,
      "comment": " test that L is lower triangular with unit diagonal ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 67)",
        "(line 128,col 9)-(line 128,col 62)",
        "(line 129,col 9)-(line 134,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImplTest.testUUpperTriangular()",
      "begin_line": 138,
      "end_line": 146,
      "comment": " test that U is upper triangular ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 67)",
        "(line 140,col 9)-(line 140,col 62)",
        "(line 141,col 9)-(line 145,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImplTest.testPPermutation()",
      "begin_line": 149,
      "end_line": 195,
      "comment": " test that P is a permutation matrix ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 67)",
        "(line 151,col 9)-(line 151,col 64)",
        "(line 153,col 9)-(line 153,col 51)",
        "(line 154,col 9)-(line 154,col 83)",
        "(line 155,col 9)-(line 155,col 67)",
        "(line 157,col 9)-(line 174,col 9)",
        "(line 176,col 9)-(line 193,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImplTest.testSingular()",
      "begin_line": 199,
      "end_line": 207,
      "comment": " test singular ",
      "child_ranges": [
        "(line 200,col 9)-(line 201,col 76)",
        "(line 202,col 9)-(line 202,col 51)",
        "(line 203,col 9)-(line 203,col 77)",
        "(line 204,col 9)-(line 204,col 52)",
        "(line 205,col 9)-(line 205,col 80)",
        "(line 206,col 9)-(line 206,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImplTest.testMatricesValues1()",
      "begin_line": 210,
      "end_line": 247,
      "comment": " test matrices values ",
      "child_ranges": [
        "(line 211,col 8)-(line 212,col 76)",
        "(line 213,col 9)-(line 217,col 11)",
        "(line 218,col 9)-(line 222,col 11)",
        "(line 223,col 9)-(line 227,col 11)",
        "(line 228,col 9)-(line 228,col 37)",
        "(line 231,col 9)-(line 231,col 33)",
        "(line 232,col 9)-(line 232,col 61)",
        "(line 233,col 9)-(line 233,col 33)",
        "(line 234,col 9)-(line 234,col 61)",
        "(line 235,col 9)-(line 235,col 33)",
        "(line 236,col 9)-(line 236,col 61)",
        "(line 237,col 9)-(line 237,col 36)",
        "(line 238,col 9)-(line 240,col 9)",
        "(line 243,col 9)-(line 243,col 35)",
        "(line 244,col 9)-(line 244,col 35)",
        "(line 245,col 9)-(line 245,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImplTest.testMatricesValues2()",
      "begin_line": 250,
      "end_line": 287,
      "comment": " test matrices values ",
      "child_ranges": [
        "(line 251,col 8)-(line 252,col 74)",
        "(line 253,col 9)-(line 257,col 11)",
        "(line 258,col 9)-(line 262,col 11)",
        "(line 263,col 9)-(line 267,col 11)",
        "(line 268,col 9)-(line 268,col 37)",
        "(line 271,col 9)-(line 271,col 33)",
        "(line 272,col 9)-(line 272,col 61)",
        "(line 273,col 9)-(line 273,col 33)",
        "(line 274,col 9)-(line 274,col 61)",
        "(line 275,col 9)-(line 275,col 33)",
        "(line 276,col 9)-(line 276,col 61)",
        "(line 277,col 9)-(line 277,col 36)",
        "(line 278,col 9)-(line 280,col 9)",
        "(line 283,col 9)-(line 283,col 35)",
        "(line 284,col 9)-(line 284,col 35)",
        "(line 285,col 9)-(line 285,col 35)"
      ]
    }
  ]
}