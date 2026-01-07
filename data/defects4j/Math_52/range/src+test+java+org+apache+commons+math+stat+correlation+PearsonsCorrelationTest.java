{
  "filepath": "/tmp/Math-52b/src/test/java/org/apache/commons/math/stat/correlation/PearsonsCorrelationTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PearsonsCorrelationTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 317,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "longleyData"
      ],
      "begin_line": 31,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "swissData"
      ],
      "begin_line": 50,
      "end_line": 98,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.PearsonsCorrelationTest.testLongly()",
      "begin_line": 104,
      "end_line": 138,
      "comment": "\n     * Test Longley dataset against R.\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 65)",
        "(line 107,col 9)-(line 107,col 75)",
        "(line 108,col 9)-(line 108,col 75)",
        "(line 109,col 9)-(line 124,col 10)",
        "(line 125,col 9)-(line 125,col 111)",
        "(line 127,col 9)-(line 134,col 10)",
        "(line 135,col 9)-(line 135,col 75)",
        "(line 136,col 9)-(line 136,col 32)",
        "(line 137,col 9)-(line 137,col 111)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.PearsonsCorrelationTest.testSwissFertility()",
      "begin_line": 143,
      "end_line": 166,
      "comment": "\n     * Test R Swiss fertility dataset against R.\n     ",
      "child_ranges": [
        "(line 145,col 10)-(line 145,col 64)",
        "(line 146,col 10)-(line 146,col 76)",
        "(line 147,col 10)-(line 147,col 76)",
        "(line 148,col 10)-(line 154,col 11)",
        "(line 155,col 10)-(line 155,col 112)",
        "(line 157,col 10)-(line 162,col 11)",
        "(line 163,col 10)-(line 163,col 76)",
        "(line 164,col 10)-(line 164,col 33)",
        "(line 165,col 10)-(line 165,col 112)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.PearsonsCorrelationTest.testPValueNearZero()",
      "begin_line": 171,
      "end_line": 187,
      "comment": "\n     * Test p-value near 0. JIRA: MATH-371\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 28)",
        "(line 180,col 9)-(line 180,col 51)",
        "(line 181,col 9)-(line 184,col 9)",
        "(line 185,col 9)-(line 185,col 73)",
        "(line 186,col 9)-(line 186,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.PearsonsCorrelationTest.testConstant()",
      "begin_line": 193,
      "end_line": 198,
      "comment": "\n     * Constant column\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 56)",
        "(line 196,col 9)-(line 196,col 52)",
        "(line 197,col 9)-(line 197,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.PearsonsCorrelationTest.testInsufficientData()",
      "begin_line": 205,
      "end_line": 222,
      "comment": "",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 40)",
        "(line 208,col 9)-(line 208,col 40)",
        "(line 209,col 9)-(line 214,col 9)",
        "(line 215,col 9)-(line 215,col 74)",
        "(line 216,col 9)-(line 221,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.PearsonsCorrelationTest.testStdErrorConsistency()",
      "begin_line": 228,
      "end_line": 243,
      "comment": "\n     * Verify that direct t-tests using standard error estimates are consistent\n     * with reported p-values\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 64)",
        "(line 231,col 9)-(line 231,col 63)",
        "(line 232,col 9)-(line 232,col 75)",
        "(line 233,col 9)-(line 233,col 65)",
        "(line 234,col 9)-(line 234,col 66)",
        "(line 235,col 9)-(line 235,col 75)",
        "(line 236,col 9)-(line 242,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.PearsonsCorrelationTest.testCovarianceConsistency()",
      "begin_line": 249,
      "end_line": 270,
      "comment": "\n     * Verify that creating correlation from covariance gives same results as\n     * direct computation from the original matrix\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 65)",
        "(line 252,col 9)-(line 252,col 75)",
        "(line 253,col 9)-(line 253,col 56)",
        "(line 254,col 9)-(line 254,col 87)",
        "(line 255,col 9)-(line 256,col 68)",
        "(line 257,col 9)-(line 258,col 69)",
        "(line 259,col 9)-(line 260,col 76)",
        "(line 262,col 9)-(line 263,col 75)",
        "(line 264,col 9)-(line 265,col 69)",
        "(line 266,col 9)-(line 267,col 70)",
        "(line 268,col 9)-(line 269,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.PearsonsCorrelationTest.testConsistency()",
      "begin_line": 273,
      "end_line": 284,
      "comment": "",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 65)",
        "(line 276,col 9)-(line 276,col 75)",
        "(line 277,col 9)-(line 277,col 43)",
        "(line 278,col 9)-(line 278,col 41)",
        "(line 279,col 9)-(line 279,col 41)",
        "(line 280,col 9)-(line 281,col 86)",
        "(line 282,col 9)-(line 283,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.PearsonsCorrelationTest.createRealMatrix(double[], int, int)",
      "begin_line": 286,
      "end_line": 294,
      "comment": "",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 57)",
        "(line 288,col 9)-(line 288,col 20)",
        "(line 289,col 9)-(line 292,col 9)",
        "(line 293,col 9)-(line 293,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.PearsonsCorrelationTest.createLowerTriangularRealMatrix(double[], int)",
      "begin_line": 296,
      "end_line": 306,
      "comment": "",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 20)",
        "(line 298,col 9)-(line 298,col 70)",
        "(line 299,col 9)-(line 304,col 9)",
        "(line 305,col 9)-(line 305,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.PearsonsCorrelationTest.fillUpper(org.apache.commons.math.linear.RealMatrix, double)",
      "begin_line": 308,
      "end_line": 316,
      "comment": "",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 52)",
        "(line 310,col 9)-(line 315,col 9)"
      ]
    }
  ]
}