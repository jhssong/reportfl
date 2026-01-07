{
  "filepath": "/tmp/Math-79b/src/test/java/org/apache/commons/math/stat/correlation/PearsonsCorrelationTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PearsonsCorrelationTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 27,
      "end_line": 286,
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
      "signature": "org.apache.commons.math.stat.correlation.PearsonsCorrelationTest.testConstant()",
      "begin_line": 167,
      "end_line": 171,
      "comment": "\n     * Constant column\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 56)",
        "(line 169,col 9)-(line 169,col 52)",
        "(line 170,col 9)-(line 170,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.PearsonsCorrelationTest.testInsufficientData()",
      "begin_line": 178,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 40)",
        "(line 180,col 9)-(line 180,col 40)",
        "(line 181,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 187,col 74)",
        "(line 188,col 9)-(line 193,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.PearsonsCorrelationTest.testStdErrorConsistency()",
      "begin_line": 200,
      "end_line": 214,
      "comment": "\n     * Verify that direct t-tests using standard error estimates are consistent\n     * with reported p-values\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 64)",
        "(line 202,col 9)-(line 202,col 63)",
        "(line 203,col 9)-(line 203,col 75)",
        "(line 204,col 9)-(line 204,col 65)",
        "(line 205,col 9)-(line 205,col 66)",
        "(line 206,col 9)-(line 206,col 75)",
        "(line 207,col 9)-(line 213,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.PearsonsCorrelationTest.testCovarianceConsistency()",
      "begin_line": 220,
      "end_line": 240,
      "comment": "\n     * Verify that creating correlation from covariance gives same results as\n     * direct computation from the original matrix\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 65)",
        "(line 222,col 9)-(line 222,col 75)",
        "(line 223,col 9)-(line 223,col 56)",
        "(line 224,col 9)-(line 224,col 87)",
        "(line 225,col 9)-(line 226,col 68)",
        "(line 227,col 9)-(line 228,col 69)",
        "(line 229,col 9)-(line 230,col 76)",
        "(line 232,col 9)-(line 233,col 75)",
        "(line 234,col 9)-(line 235,col 69)",
        "(line 236,col 9)-(line 237,col 70)",
        "(line 238,col 9)-(line 239,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.PearsonsCorrelationTest.testConsistency()",
      "begin_line": 243,
      "end_line": 253,
      "comment": "",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 65)",
        "(line 245,col 9)-(line 245,col 75)",
        "(line 246,col 9)-(line 246,col 43)",
        "(line 247,col 9)-(line 247,col 41)",
        "(line 248,col 9)-(line 248,col 41)",
        "(line 249,col 9)-(line 250,col 86)",
        "(line 251,col 9)-(line 252,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.PearsonsCorrelationTest.createRealMatrix(double[], int, int)",
      "begin_line": 255,
      "end_line": 263,
      "comment": "",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 57)",
        "(line 257,col 9)-(line 257,col 20)",
        "(line 258,col 9)-(line 261,col 9)",
        "(line 262,col 9)-(line 262,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.PearsonsCorrelationTest.createLowerTriangularRealMatrix(double[], int)",
      "begin_line": 265,
      "end_line": 275,
      "comment": "",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 20)",
        "(line 267,col 9)-(line 267,col 70)",
        "(line 268,col 9)-(line 273,col 9)",
        "(line 274,col 9)-(line 274,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.PearsonsCorrelationTest.fillUpper(org.apache.commons.math.linear.RealMatrix, double)",
      "begin_line": 277,
      "end_line": 285,
      "comment": "",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 52)",
        "(line 279,col 9)-(line 284,col 9)"
      ]
    }
  ]
}