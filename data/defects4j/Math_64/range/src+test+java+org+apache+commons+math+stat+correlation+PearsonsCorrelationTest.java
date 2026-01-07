{
  "filepath": "/tmp/Math-64b/src/test/java/org/apache/commons/math/stat/correlation/PearsonsCorrelationTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PearsonsCorrelationTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 27,
      "end_line": 307,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "longleyData"
      ],
      "begin_line": 29,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "swissData"
      ],
      "begin_line": 48,
      "end_line": 96,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.PearsonsCorrelationTest.testLongly()",
      "begin_line": 102,
      "end_line": 135,
      "comment": "\n     * Test Longley dataset against R.\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 65)",
        "(line 104,col 9)-(line 104,col 75)",
        "(line 105,col 9)-(line 105,col 75)",
        "(line 106,col 9)-(line 121,col 10)",
        "(line 122,col 9)-(line 122,col 111)",
        "(line 124,col 9)-(line 131,col 10)",
        "(line 132,col 9)-(line 132,col 75)",
        "(line 133,col 9)-(line 133,col 32)",
        "(line 134,col 9)-(line 134,col 111)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.PearsonsCorrelationTest.testSwissFertility()",
      "begin_line": 140,
      "end_line": 162,
      "comment": "\n     * Test R Swiss fertility dataset against R.\n     ",
      "child_ranges": [
        "(line 141,col 10)-(line 141,col 64)",
        "(line 142,col 10)-(line 142,col 76)",
        "(line 143,col 10)-(line 143,col 76)",
        "(line 144,col 10)-(line 150,col 11)",
        "(line 151,col 10)-(line 151,col 112)",
        "(line 153,col 10)-(line 158,col 11)",
        "(line 159,col 10)-(line 159,col 76)",
        "(line 160,col 10)-(line 160,col 33)",
        "(line 161,col 10)-(line 161,col 112)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.PearsonsCorrelationTest.testPValueNearZero()",
      "begin_line": 167,
      "end_line": 182,
      "comment": "\n     * Test p-value near 0. JIRA: MATH-371\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 28)",
        "(line 175,col 9)-(line 175,col 51)",
        "(line 176,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 180,col 73)",
        "(line 181,col 9)-(line 181,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.PearsonsCorrelationTest.testConstant()",
      "begin_line": 188,
      "end_line": 192,
      "comment": "\n     * Constant column\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 56)",
        "(line 190,col 9)-(line 190,col 52)",
        "(line 191,col 9)-(line 191,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.PearsonsCorrelationTest.testInsufficientData()",
      "begin_line": 199,
      "end_line": 215,
      "comment": "",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 40)",
        "(line 201,col 9)-(line 201,col 40)",
        "(line 202,col 9)-(line 207,col 9)",
        "(line 208,col 9)-(line 208,col 74)",
        "(line 209,col 9)-(line 214,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.PearsonsCorrelationTest.testStdErrorConsistency()",
      "begin_line": 221,
      "end_line": 235,
      "comment": "\n     * Verify that direct t-tests using standard error estimates are consistent\n     * with reported p-values\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 64)",
        "(line 223,col 9)-(line 223,col 63)",
        "(line 224,col 9)-(line 224,col 75)",
        "(line 225,col 9)-(line 225,col 65)",
        "(line 226,col 9)-(line 226,col 66)",
        "(line 227,col 9)-(line 227,col 75)",
        "(line 228,col 9)-(line 234,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.PearsonsCorrelationTest.testCovarianceConsistency()",
      "begin_line": 241,
      "end_line": 261,
      "comment": "\n     * Verify that creating correlation from covariance gives same results as\n     * direct computation from the original matrix\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 65)",
        "(line 243,col 9)-(line 243,col 75)",
        "(line 244,col 9)-(line 244,col 56)",
        "(line 245,col 9)-(line 245,col 87)",
        "(line 246,col 9)-(line 247,col 68)",
        "(line 248,col 9)-(line 249,col 69)",
        "(line 250,col 9)-(line 251,col 76)",
        "(line 253,col 9)-(line 254,col 75)",
        "(line 255,col 9)-(line 256,col 69)",
        "(line 257,col 9)-(line 258,col 70)",
        "(line 259,col 9)-(line 260,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.PearsonsCorrelationTest.testConsistency()",
      "begin_line": 264,
      "end_line": 274,
      "comment": "",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 65)",
        "(line 266,col 9)-(line 266,col 75)",
        "(line 267,col 9)-(line 267,col 43)",
        "(line 268,col 9)-(line 268,col 41)",
        "(line 269,col 9)-(line 269,col 41)",
        "(line 270,col 9)-(line 271,col 86)",
        "(line 272,col 9)-(line 273,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.PearsonsCorrelationTest.createRealMatrix(double[], int, int)",
      "begin_line": 276,
      "end_line": 284,
      "comment": "",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 57)",
        "(line 278,col 9)-(line 278,col 20)",
        "(line 279,col 9)-(line 282,col 9)",
        "(line 283,col 9)-(line 283,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.PearsonsCorrelationTest.createLowerTriangularRealMatrix(double[], int)",
      "begin_line": 286,
      "end_line": 296,
      "comment": "",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 20)",
        "(line 288,col 9)-(line 288,col 70)",
        "(line 289,col 9)-(line 294,col 9)",
        "(line 295,col 9)-(line 295,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.PearsonsCorrelationTest.fillUpper(org.apache.commons.math.linear.RealMatrix, double)",
      "begin_line": 298,
      "end_line": 306,
      "comment": "",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 52)",
        "(line 300,col 9)-(line 305,col 9)"
      ]
    }
  ]
}