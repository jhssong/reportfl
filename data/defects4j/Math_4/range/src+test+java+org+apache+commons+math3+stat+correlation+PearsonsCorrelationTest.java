{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/stat/correlation/PearsonsCorrelationTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PearsonsCorrelationTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 316,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "longleyData"
      ],
      "begin_line": 30,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "swissData"
      ],
      "begin_line": 49,
      "end_line": 97,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.PearsonsCorrelationTest.testLongly()",
      "begin_line": 103,
      "end_line": 137,
      "comment": "\n     * Test Longley dataset against R.\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 65)",
        "(line 106,col 9)-(line 106,col 75)",
        "(line 107,col 9)-(line 107,col 75)",
        "(line 108,col 9)-(line 123,col 10)",
        "(line 124,col 9)-(line 124,col 111)",
        "(line 126,col 9)-(line 133,col 10)",
        "(line 134,col 9)-(line 134,col 75)",
        "(line 135,col 9)-(line 135,col 32)",
        "(line 136,col 9)-(line 136,col 111)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.PearsonsCorrelationTest.testSwissFertility()",
      "begin_line": 142,
      "end_line": 165,
      "comment": "\n     * Test R Swiss fertility dataset against R.\n     ",
      "child_ranges": [
        "(line 144,col 10)-(line 144,col 64)",
        "(line 145,col 10)-(line 145,col 76)",
        "(line 146,col 10)-(line 146,col 76)",
        "(line 147,col 10)-(line 153,col 11)",
        "(line 154,col 10)-(line 154,col 112)",
        "(line 156,col 10)-(line 161,col 11)",
        "(line 162,col 10)-(line 162,col 76)",
        "(line 163,col 10)-(line 163,col 33)",
        "(line 164,col 10)-(line 164,col 112)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.PearsonsCorrelationTest.testPValueNearZero()",
      "begin_line": 170,
      "end_line": 186,
      "comment": "\n     * Test p-value near 0. JIRA: MATH-371\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 28)",
        "(line 179,col 9)-(line 179,col 51)",
        "(line 180,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 184,col 73)",
        "(line 185,col 9)-(line 185,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.PearsonsCorrelationTest.testConstant()",
      "begin_line": 192,
      "end_line": 197,
      "comment": "\n     * Constant column\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 56)",
        "(line 195,col 9)-(line 195,col 52)",
        "(line 196,col 9)-(line 196,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.PearsonsCorrelationTest.testInsufficientData()",
      "begin_line": 204,
      "end_line": 221,
      "comment": "",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 40)",
        "(line 207,col 9)-(line 207,col 40)",
        "(line 208,col 9)-(line 213,col 9)",
        "(line 214,col 9)-(line 214,col 74)",
        "(line 215,col 9)-(line 220,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.PearsonsCorrelationTest.testStdErrorConsistency()",
      "begin_line": 227,
      "end_line": 242,
      "comment": "\n     * Verify that direct t-tests using standard error estimates are consistent\n     * with reported p-values\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 60)",
        "(line 230,col 9)-(line 230,col 63)",
        "(line 231,col 9)-(line 231,col 75)",
        "(line 232,col 9)-(line 232,col 65)",
        "(line 233,col 9)-(line 233,col 66)",
        "(line 234,col 9)-(line 234,col 75)",
        "(line 235,col 9)-(line 241,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.PearsonsCorrelationTest.testCovarianceConsistency()",
      "begin_line": 248,
      "end_line": 269,
      "comment": "\n     * Verify that creating correlation from covariance gives same results as\n     * direct computation from the original matrix\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 65)",
        "(line 251,col 9)-(line 251,col 75)",
        "(line 252,col 9)-(line 252,col 56)",
        "(line 253,col 9)-(line 253,col 87)",
        "(line 254,col 9)-(line 255,col 68)",
        "(line 256,col 9)-(line 257,col 69)",
        "(line 258,col 9)-(line 259,col 76)",
        "(line 261,col 9)-(line 262,col 75)",
        "(line 263,col 9)-(line 264,col 69)",
        "(line 265,col 9)-(line 266,col 70)",
        "(line 267,col 9)-(line 268,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.PearsonsCorrelationTest.testConsistency()",
      "begin_line": 272,
      "end_line": 283,
      "comment": "",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 65)",
        "(line 275,col 9)-(line 275,col 75)",
        "(line 276,col 9)-(line 276,col 43)",
        "(line 277,col 9)-(line 277,col 41)",
        "(line 278,col 9)-(line 278,col 41)",
        "(line 279,col 9)-(line 280,col 86)",
        "(line 281,col 9)-(line 282,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.PearsonsCorrelationTest.createRealMatrix(double[], int, int)",
      "begin_line": 285,
      "end_line": 293,
      "comment": "",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 57)",
        "(line 287,col 9)-(line 287,col 20)",
        "(line 288,col 9)-(line 291,col 9)",
        "(line 292,col 9)-(line 292,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.PearsonsCorrelationTest.createLowerTriangularRealMatrix(double[], int)",
      "begin_line": 295,
      "end_line": 305,
      "comment": "",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 20)",
        "(line 297,col 9)-(line 297,col 70)",
        "(line 298,col 9)-(line 303,col 9)",
        "(line 304,col 9)-(line 304,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.PearsonsCorrelationTest.fillUpper(org.apache.commons.math3.linear.RealMatrix, double)",
      "begin_line": 307,
      "end_line": 315,
      "comment": "",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 52)",
        "(line 309,col 9)-(line 314,col 9)"
      ]
    }
  ]
}