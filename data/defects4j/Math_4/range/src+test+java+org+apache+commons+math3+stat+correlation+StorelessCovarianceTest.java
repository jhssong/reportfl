{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/stat/correlation/StorelessCovarianceTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StorelessCovarianceTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 26,
      "end_line": 262,
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
      "type": "field",
      "varNames": [
        "longleyDataSimple"
      ],
      "begin_line": 97,
      "end_line": 114,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.StorelessCovarianceTest.testLonglySimpleVar()",
      "begin_line": 116,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 43)",
        "(line 119,col 9)-(line 119,col 78)",
        "(line 120,col 9)-(line 122,col 9)",
        "(line 123,col 9)-(line 123,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.StorelessCovarianceTest.testLonglySimpleCov()",
      "begin_line": 126,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 35)",
        "(line 129,col 9)-(line 129,col 78)",
        "(line 130,col 9)-(line 132,col 9)",
        "(line 133,col 9)-(line 133,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.StorelessCovarianceTest.testLonglyByRow()",
      "begin_line": 146,
      "end_line": 176,
      "comment": "\n     * Test Longley dataset against R.\n     * Data Source: J. Longley (1967) \"An Appraisal of Least Squares\n     * Programs for the Electronic Computer from the Point of View of the User\"\n     * Journal of the American Statistical Association, vol. 62. September,\n     * pp. 819-841.\n     *\n     * Data are from NIST:\n     * http://www.itl.nist.gov/div898/strd/lls/data/LINKS/DATA/Longley.dat\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 65)",
        "(line 150,col 9)-(line 165,col 10)",
        "(line 167,col 9)-(line 167,col 67)",
        "(line 168,col 9)-(line 170,col 9)",
        "(line 172,col 9)-(line 172,col 70)",
        "(line 174,col 9)-(line 174,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.StorelessCovarianceTest.testSwissFertilityByRow()",
      "begin_line": 182,
      "end_line": 202,
      "comment": "\n     * Test R Swiss fertility dataset against R.\n     * Data Source: R datasets package\n     ",
      "child_ranges": [
        "(line 184,col 10)-(line 184,col 64)",
        "(line 186,col 10)-(line 192,col 11)",
        "(line 194,col 9)-(line 194,col 67)",
        "(line 195,col 9)-(line 197,col 9)",
        "(line 199,col 9)-(line 199,col 70)",
        "(line 201,col 9)-(line 201,col 109)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.StorelessCovarianceTest.testSymmetry()",
      "begin_line": 207,
      "end_line": 223,
      "comment": "\n     * Test symmetry of the covariance matrix\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 63)",
        "(line 211,col 9)-(line 211,col 32)",
        "(line 212,col 9)-(line 212,col 78)",
        "(line 213,col 9)-(line 215,col 9)",
        "(line 217,col 9)-(line 217,col 54)",
        "(line 218,col 9)-(line 222,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.StorelessCovarianceTest.testEquivalence()",
      "begin_line": 230,
      "end_line": 249,
      "comment": "\n     * Test equality of covariance. chk: covariance of two\n     * samples separately and adds them together. cov: computes\n     * covariance of the combined sample showing both are equal.\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 25)",
        "(line 233,col 9)-(line 233,col 78)",
        "(line 234,col 9)-(line 234,col 78)",
        "(line 236,col 9)-(line 236,col 48)",
        "(line 237,col 9)-(line 246,col 9)",
        "(line 248,col 9)-(line 248,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.StorelessCovarianceTest.createRealMatrix(double[], int, int)",
      "begin_line": 251,
      "end_line": 259,
      "comment": "",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 57)",
        "(line 253,col 9)-(line 253,col 20)",
        "(line 254,col 9)-(line 257,col 9)",
        "(line 258,col 9)-(line 258,col 52)"
      ]
    }
  ]
}