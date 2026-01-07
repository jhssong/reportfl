{
  "filepath": "/tmp/Math-61b/src/test/java/org/apache/commons/math/stat/correlation/PearsonsCorrelationTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PearsonsCorrelationTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 28,
      "end_line": 308,
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
      "signature": "org.apache.commons.math.stat.correlation.PearsonsCorrelationTest.testLongly()",
      "begin_line": 103,
      "end_line": 136,
      "comment": "\n     * Test Longley dataset against R.\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 65)",
        "(line 105,col 9)-(line 105,col 75)",
        "(line 106,col 9)-(line 106,col 75)",
        "(line 107,col 9)-(line 122,col 10)",
        "(line 123,col 9)-(line 123,col 111)",
        "(line 125,col 9)-(line 132,col 10)",
        "(line 133,col 9)-(line 133,col 75)",
        "(line 134,col 9)-(line 134,col 32)",
        "(line 135,col 9)-(line 135,col 111)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.PearsonsCorrelationTest.testSwissFertility()",
      "begin_line": 141,
      "end_line": 163,
      "comment": "\n     * Test R Swiss fertility dataset against R.\n     ",
      "child_ranges": [
        "(line 142,col 10)-(line 142,col 64)",
        "(line 143,col 10)-(line 143,col 76)",
        "(line 144,col 10)-(line 144,col 76)",
        "(line 145,col 10)-(line 151,col 11)",
        "(line 152,col 10)-(line 152,col 112)",
        "(line 154,col 10)-(line 159,col 11)",
        "(line 160,col 10)-(line 160,col 76)",
        "(line 161,col 10)-(line 161,col 33)",
        "(line 162,col 10)-(line 162,col 112)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.PearsonsCorrelationTest.testPValueNearZero()",
      "begin_line": 168,
      "end_line": 183,
      "comment": "\n     * Test p-value near 0. JIRA: MATH-371\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 28)",
        "(line 176,col 9)-(line 176,col 51)",
        "(line 177,col 9)-(line 180,col 9)",
        "(line 181,col 9)-(line 181,col 73)",
        "(line 182,col 9)-(line 182,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.PearsonsCorrelationTest.testConstant()",
      "begin_line": 189,
      "end_line": 193,
      "comment": "\n     * Constant column\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 56)",
        "(line 191,col 9)-(line 191,col 52)",
        "(line 192,col 9)-(line 192,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.PearsonsCorrelationTest.testInsufficientData()",
      "begin_line": 200,
      "end_line": 216,
      "comment": "",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 40)",
        "(line 202,col 9)-(line 202,col 40)",
        "(line 203,col 9)-(line 208,col 9)",
        "(line 209,col 9)-(line 209,col 74)",
        "(line 210,col 9)-(line 215,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.PearsonsCorrelationTest.testStdErrorConsistency()",
      "begin_line": 222,
      "end_line": 236,
      "comment": "\n     * Verify that direct t-tests using standard error estimates are consistent\n     * with reported p-values\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 64)",
        "(line 224,col 9)-(line 224,col 63)",
        "(line 225,col 9)-(line 225,col 75)",
        "(line 226,col 9)-(line 226,col 65)",
        "(line 227,col 9)-(line 227,col 66)",
        "(line 228,col 9)-(line 228,col 75)",
        "(line 229,col 9)-(line 235,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.PearsonsCorrelationTest.testCovarianceConsistency()",
      "begin_line": 242,
      "end_line": 262,
      "comment": "\n     * Verify that creating correlation from covariance gives same results as\n     * direct computation from the original matrix\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 65)",
        "(line 244,col 9)-(line 244,col 75)",
        "(line 245,col 9)-(line 245,col 56)",
        "(line 246,col 9)-(line 246,col 87)",
        "(line 247,col 9)-(line 248,col 68)",
        "(line 249,col 9)-(line 250,col 69)",
        "(line 251,col 9)-(line 252,col 76)",
        "(line 254,col 9)-(line 255,col 75)",
        "(line 256,col 9)-(line 257,col 69)",
        "(line 258,col 9)-(line 259,col 70)",
        "(line 260,col 9)-(line 261,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.PearsonsCorrelationTest.testConsistency()",
      "begin_line": 265,
      "end_line": 275,
      "comment": "",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 65)",
        "(line 267,col 9)-(line 267,col 75)",
        "(line 268,col 9)-(line 268,col 43)",
        "(line 269,col 9)-(line 269,col 41)",
        "(line 270,col 9)-(line 270,col 41)",
        "(line 271,col 9)-(line 272,col 86)",
        "(line 273,col 9)-(line 274,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.PearsonsCorrelationTest.createRealMatrix(double[], int, int)",
      "begin_line": 277,
      "end_line": 285,
      "comment": "",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 57)",
        "(line 279,col 9)-(line 279,col 20)",
        "(line 280,col 9)-(line 283,col 9)",
        "(line 284,col 9)-(line 284,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.PearsonsCorrelationTest.createLowerTriangularRealMatrix(double[], int)",
      "begin_line": 287,
      "end_line": 297,
      "comment": "",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 20)",
        "(line 289,col 9)-(line 289,col 70)",
        "(line 290,col 9)-(line 295,col 9)",
        "(line 296,col 9)-(line 296,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.PearsonsCorrelationTest.fillUpper(org.apache.commons.math.linear.RealMatrix, double)",
      "begin_line": 299,
      "end_line": 307,
      "comment": "",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 52)",
        "(line 301,col 9)-(line 306,col 9)"
      ]
    }
  ]
}