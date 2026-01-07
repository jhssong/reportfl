{
  "filepath": "/tmp/Math-99b/src/test/org/apache/commons/math/stat/correlation/CovarianceTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CovarianceTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 26,
      "end_line": 225,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "longleyData"
      ],
      "begin_line": 28,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "swissData"
      ],
      "begin_line": 47,
      "end_line": 95,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.CovarianceTest.testLongly()",
      "begin_line": 108,
      "end_line": 130,
      "comment": "\n     * Test Longley dataset against R.\n     * Data Source: J. Longley (1967) \"An Appraisal of Least Squares\n     * Programs for the Electronic Computer from the Point of View of the User\"\n     * Journal of the American Statistical Association, vol. 62. September,\n     * pp. 819-841.\n     * \n     * Data are from NIST:\n     * http://www.itl.nist.gov/div898/strd/lls/data/LINKS/DATA/Longley.dat\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 65)",
        "(line 110,col 9)-(line 110,col 83)",
        "(line 111,col 9)-(line 126,col 10)",
        "(line 128,col 9)-(line 128,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.CovarianceTest.testSwissFertility()",
      "begin_line": 136,
      "end_line": 148,
      "comment": "\n     * Test R Swiss fertility dataset against R.\n     * Data Source: R datasets package\n     ",
      "child_ranges": [
        "(line 137,col 10)-(line 137,col 64)",
        "(line 138,col 10)-(line 138,col 84)",
        "(line 139,col 10)-(line 145,col 11)",
        "(line 147,col 10)-(line 147,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.CovarianceTest.testConstant()",
      "begin_line": 153,
      "end_line": 158,
      "comment": "\n     * Constant column\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 56)",
        "(line 155,col 9)-(line 155,col 52)",
        "(line 156,col 9)-(line 156,col 98)",
        "(line 157,col 9)-(line 157,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.CovarianceTest.testInsufficientData()",
      "begin_line": 164,
      "end_line": 180,
      "comment": "\n     * Insufficient data\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 40)",
        "(line 166,col 9)-(line 166,col 40)",
        "(line 167,col 9)-(line 172,col 9)",
        "(line 173,col 9)-(line 173,col 73)",
        "(line 174,col 9)-(line 179,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.CovarianceTest.testConsistency()",
      "begin_line": 186,
      "end_line": 214,
      "comment": "\n     * Verify that diagonal entries are consistent with Variance computation and matrix matches\n     * column-by-column covariances\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 63)",
        "(line 188,col 9)-(line 188,col 83)",
        "(line 191,col 9)-(line 191,col 43)",
        "(line 192,col 9)-(line 194,col 9)",
        "(line 197,col 9)-(line 198,col 101)",
        "(line 199,col 9)-(line 199,col 105)",
        "(line 202,col 9)-(line 202,col 63)",
        "(line 203,col 9)-(line 205,col 9)",
        "(line 206,col 9)-(line 206,col 81)",
        "(line 207,col 9)-(line 207,col 71)",
        "(line 208,col 9)-(line 212,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.CovarianceTest.createRealMatrix(double[], int, int)",
      "begin_line": 216,
      "end_line": 224,
      "comment": "",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 57)",
        "(line 218,col 9)-(line 218,col 20)",
        "(line 219,col 9)-(line 222,col 9)",
        "(line 223,col 9)-(line 223,col 46)"
      ]
    }
  ]
}