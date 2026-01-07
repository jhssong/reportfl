{
  "filepath": "/tmp/Math-31b/src/test/java/org/apache/commons/math3/stat/correlation/CovarianceTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CovarianceTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 242,
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
      "signature": "org.apache.commons.math3.stat.correlation.CovarianceTest.testLongly()",
      "begin_line": 109,
      "end_line": 132,
      "comment": "\n     * Test Longley dataset against R.\n     * Data Source: J. Longley (1967) \"An Appraisal of Least Squares\n     * Programs for the Electronic Computer from the Point of View of the User\"\n     * Journal of the American Statistical Association, vol. 62. September,\n     * pp. 819-841.\n     *\n     * Data are from NIST:\n     * http://www.itl.nist.gov/div898/strd/lls/data/LINKS/DATA/Longley.dat\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 65)",
        "(line 112,col 9)-(line 112,col 83)",
        "(line 113,col 9)-(line 128,col 10)",
        "(line 130,col 9)-(line 130,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.CovarianceTest.testSwissFertility()",
      "begin_line": 138,
      "end_line": 151,
      "comment": "\n     * Test R Swiss fertility dataset against R.\n     * Data Source: R datasets package\n     ",
      "child_ranges": [
        "(line 140,col 10)-(line 140,col 64)",
        "(line 141,col 10)-(line 141,col 84)",
        "(line 142,col 10)-(line 148,col 11)",
        "(line 150,col 10)-(line 150,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.CovarianceTest.testConstant()",
      "begin_line": 156,
      "end_line": 162,
      "comment": "\n     * Constant column\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 56)",
        "(line 159,col 9)-(line 159,col 52)",
        "(line 160,col 9)-(line 160,col 105)",
        "(line 161,col 9)-(line 161,col 109)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.CovarianceTest.testInsufficientData()",
      "begin_line": 168,
      "end_line": 185,
      "comment": "\n     * Insufficient data\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 40)",
        "(line 171,col 9)-(line 171,col 40)",
        "(line 172,col 9)-(line 177,col 9)",
        "(line 178,col 9)-(line 178,col 79)",
        "(line 179,col 9)-(line 184,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.CovarianceTest.testConsistency()",
      "begin_line": 191,
      "end_line": 231,
      "comment": "\n     * Verify that diagonal entries are consistent with Variance computation and matrix matches\n     * column-by-column covariances\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 69)",
        "(line 194,col 9)-(line 194,col 89)",
        "(line 197,col 9)-(line 197,col 43)",
        "(line 198,col 9)-(line 200,col 9)",
        "(line 203,col 9)-(line 204,col 101)",
        "(line 205,col 9)-(line 205,col 112)",
        "(line 208,col 9)-(line 208,col 69)",
        "(line 209,col 9)-(line 211,col 9)",
        "(line 212,col 9)-(line 212,col 100)",
        "(line 213,col 9)-(line 213,col 71)",
        "(line 214,col 9)-(line 218,col 9)",
        "(line 221,col 9)-(line 221,col 43)",
        "(line 222,col 9)-(line 223,col 99)",
        "(line 224,col 9)-(line 225,col 105)",
        "(line 227,col 9)-(line 227,col 29)",
        "(line 228,col 9)-(line 228,col 29)",
        "(line 229,col 9)-(line 230,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.CovarianceTest.createRealMatrix(double[], int, int)",
      "begin_line": 233,
      "end_line": 241,
      "comment": "",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 57)",
        "(line 235,col 9)-(line 235,col 20)",
        "(line 236,col 9)-(line 239,col 9)",
        "(line 240,col 9)-(line 240,col 52)"
      ]
    }
  ]
}