{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/stat/correlation/CovarianceTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CovarianceTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 252,
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
      "signature": "org.apache.commons.math3.stat.correlation.CovarianceTest.testLongly()",
      "begin_line": 110,
      "end_line": 133,
      "comment": "\n     * Test Longley dataset against R.\n     * Data Source: J. Longley (1967) \"An Appraisal of Least Squares\n     * Programs for the Electronic Computer from the Point of View of the User\"\n     * Journal of the American Statistical Association, vol. 62. September,\n     * pp. 819-841.\n     *\n     * Data are from NIST:\n     * http://www.itl.nist.gov/div898/strd/lls/data/LINKS/DATA/Longley.dat\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 65)",
        "(line 113,col 9)-(line 113,col 83)",
        "(line 114,col 9)-(line 129,col 10)",
        "(line 131,col 9)-(line 131,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.CovarianceTest.testSwissFertility()",
      "begin_line": 139,
      "end_line": 152,
      "comment": "\n     * Test R Swiss fertility dataset against R.\n     * Data Source: R datasets package\n     ",
      "child_ranges": [
        "(line 141,col 10)-(line 141,col 64)",
        "(line 142,col 10)-(line 142,col 84)",
        "(line 143,col 10)-(line 149,col 11)",
        "(line 151,col 10)-(line 151,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.CovarianceTest.testConstant()",
      "begin_line": 157,
      "end_line": 163,
      "comment": "\n     * Constant column\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 56)",
        "(line 160,col 9)-(line 160,col 52)",
        "(line 161,col 9)-(line 161,col 105)",
        "(line 162,col 9)-(line 162,col 109)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.CovarianceTest.testOneColumn()",
      "begin_line": 168,
      "end_line": 174,
      "comment": "\n     * One column\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 96)",
        "(line 171,col 9)-(line 171,col 54)",
        "(line 172,col 9)-(line 172,col 57)",
        "(line 173,col 9)-(line 173,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.CovarianceTest.testInsufficientData()",
      "begin_line": 179,
      "end_line": 195,
      "comment": "\n     * Insufficient data\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 40)",
        "(line 182,col 9)-(line 182,col 40)",
        "(line 183,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 194,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.CovarianceTest.testConsistency()",
      "begin_line": 201,
      "end_line": 241,
      "comment": "\n     * Verify that diagonal entries are consistent with Variance computation and matrix matches\n     * column-by-column covariances\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 69)",
        "(line 204,col 9)-(line 204,col 89)",
        "(line 207,col 9)-(line 207,col 43)",
        "(line 208,col 9)-(line 210,col 9)",
        "(line 213,col 9)-(line 214,col 101)",
        "(line 215,col 9)-(line 215,col 112)",
        "(line 218,col 9)-(line 218,col 69)",
        "(line 219,col 9)-(line 221,col 9)",
        "(line 222,col 9)-(line 222,col 100)",
        "(line 223,col 9)-(line 223,col 71)",
        "(line 224,col 9)-(line 228,col 9)",
        "(line 231,col 9)-(line 231,col 43)",
        "(line 232,col 9)-(line 233,col 99)",
        "(line 234,col 9)-(line 235,col 105)",
        "(line 237,col 9)-(line 237,col 29)",
        "(line 238,col 9)-(line 238,col 29)",
        "(line 239,col 9)-(line 240,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.CovarianceTest.createRealMatrix(double[], int, int)",
      "begin_line": 243,
      "end_line": 251,
      "comment": "",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 57)",
        "(line 245,col 9)-(line 245,col 20)",
        "(line 246,col 9)-(line 249,col 9)",
        "(line 250,col 9)-(line 250,col 52)"
      ]
    }
  ]
}