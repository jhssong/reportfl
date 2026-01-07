{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/linear/LUDecompositionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LUDecompositionTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 23,
      "end_line": 291,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testData"
      ],
      "begin_line": 24,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testDataMinus"
      ],
      "begin_line": 29,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "luData"
      ],
      "begin_line": 34,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "singular"
      ],
      "begin_line": 41,
      "end_line": 44,
      "comment": " singular matrices"
    },
    {
      "type": "field",
      "varNames": [
        "bigSingular"
      ],
      "begin_line": 45,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entryTolerance"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "normTolerance"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.LUDecompositionTest.testDimensions()",
      "begin_line": 57,
      "end_line": 68,
      "comment": " test dimensions ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 67)",
        "(line 60,col 9)-(line 60,col 57)",
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
      "signature": "org.apache.commons.math3.linear.LUDecompositionTest.testNonSquare()",
      "begin_line": 71,
      "end_line": 79,
      "comment": " test non-square matrix ",
      "child_ranges": [
        "(line 73,col 9)-(line 78,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.LUDecompositionTest.testPAEqualLU()",
      "begin_line": 82,
      "end_line": 122,
      "comment": " test PA \u003d LU ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 67)",
        "(line 85,col 9)-(line 85,col 57)",
        "(line 86,col 9)-(line 86,col 33)",
        "(line 87,col 9)-(line 87,col 33)",
        "(line 88,col 9)-(line 88,col 33)",
        "(line 89,col 9)-(line 89,col 75)",
        "(line 90,col 9)-(line 90,col 52)",
        "(line 92,col 9)-(line 92,col 61)",
        "(line 93,col 9)-(line 93,col 41)",
        "(line 94,col 9)-(line 94,col 22)",
        "(line 95,col 9)-(line 95,col 22)",
        "(line 96,col 9)-(line 96,col 22)",
        "(line 97,col 9)-(line 97,col 68)",
        "(line 98,col 9)-(line 98,col 52)",
        "(line 100,col 9)-(line 100,col 58)",
        "(line 101,col 9)-(line 101,col 41)",
        "(line 102,col 9)-(line 102,col 22)",
        "(line 103,col 9)-(line 103,col 22)",
        "(line 104,col 9)-(line 104,col 22)",
        "(line 105,col 9)-(line 105,col 68)",
        "(line 106,col 9)-(line 106,col 52)",
        "(line 108,col 9)-(line 108,col 56)",
        "(line 109,col 9)-(line 109,col 41)",
        "(line 110,col 9)-(line 110,col 59)",
        "(line 111,col 9)-(line 111,col 37)",
        "(line 112,col 9)-(line 112,col 37)",
        "(line 113,col 9)-(line 113,col 37)",
        "(line 115,col 9)-(line 115,col 59)",
        "(line 116,col 9)-(line 116,col 41)",
        "(line 117,col 9)-(line 117,col 59)",
        "(line 118,col 9)-(line 118,col 37)",
        "(line 119,col 9)-(line 119,col 37)",
        "(line 120,col 9)-(line 120,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.LUDecompositionTest.testLLowerTriangular()",
      "begin_line": 125,
      "end_line": 135,
      "comment": " test that L is lower triangular with unit diagonal ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 67)",
        "(line 128,col 9)-(line 128,col 58)",
        "(line 129,col 9)-(line 134,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.LUDecompositionTest.testUUpperTriangular()",
      "begin_line": 138,
      "end_line": 147,
      "comment": " test that U is upper triangular ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 67)",
        "(line 141,col 9)-(line 141,col 58)",
        "(line 142,col 9)-(line 146,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.LUDecompositionTest.testPPermutation()",
      "begin_line": 150,
      "end_line": 197,
      "comment": " test that P is a permutation matrix ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 67)",
        "(line 153,col 9)-(line 153,col 60)",
        "(line 155,col 9)-(line 155,col 51)",
        "(line 156,col 9)-(line 156,col 83)",
        "(line 157,col 9)-(line 157,col 74)",
        "(line 159,col 9)-(line 176,col 9)",
        "(line 178,col 9)-(line 195,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.LUDecompositionTest.testSingular()",
      "begin_line": 200,
      "end_line": 209,
      "comment": " test singular ",
      "child_ranges": [
        "(line 202,col 9)-(line 203,col 72)",
        "(line 204,col 9)-(line 204,col 58)",
        "(line 205,col 9)-(line 205,col 73)",
        "(line 206,col 9)-(line 206,col 59)",
        "(line 207,col 9)-(line 207,col 76)",
        "(line 208,col 9)-(line 208,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.LUDecompositionTest.testMatricesValues1()",
      "begin_line": 212,
      "end_line": 250,
      "comment": " test matrices values ",
      "child_ranges": [
        "(line 214,col 8)-(line 215,col 72)",
        "(line 216,col 9)-(line 220,col 11)",
        "(line 221,col 9)-(line 225,col 11)",
        "(line 226,col 9)-(line 230,col 11)",
        "(line 231,col 9)-(line 231,col 37)",
        "(line 234,col 9)-(line 234,col 33)",
        "(line 235,col 9)-(line 235,col 68)",
        "(line 236,col 9)-(line 236,col 33)",
        "(line 237,col 9)-(line 237,col 68)",
        "(line 238,col 9)-(line 238,col 33)",
        "(line 239,col 9)-(line 239,col 68)",
        "(line 240,col 9)-(line 240,col 36)",
        "(line 241,col 9)-(line 243,col 9)",
        "(line 246,col 9)-(line 246,col 42)",
        "(line 247,col 9)-(line 247,col 42)",
        "(line 248,col 9)-(line 248,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.LUDecompositionTest.testMatricesValues2()",
      "begin_line": 253,
      "end_line": 290,
      "comment": " test matrices values ",
      "child_ranges": [
        "(line 255,col 8)-(line 256,col 70)",
        "(line 257,col 9)-(line 261,col 11)",
        "(line 262,col 9)-(line 266,col 11)",
        "(line 267,col 9)-(line 271,col 11)",
        "(line 272,col 9)-(line 272,col 37)",
        "(line 275,col 9)-(line 275,col 33)",
        "(line 276,col 9)-(line 276,col 68)",
        "(line 277,col 9)-(line 277,col 33)",
        "(line 278,col 9)-(line 278,col 68)",
        "(line 279,col 9)-(line 279,col 33)",
        "(line 280,col 9)-(line 280,col 68)",
        "(line 281,col 9)-(line 281,col 36)",
        "(line 282,col 9)-(line 284,col 9)",
        "(line 287,col 9)-(line 287,col 42)",
        "(line 288,col 9)-(line 288,col 42)",
        "(line 289,col 9)-(line 289,col 42)"
      ]
    }
  ]
}