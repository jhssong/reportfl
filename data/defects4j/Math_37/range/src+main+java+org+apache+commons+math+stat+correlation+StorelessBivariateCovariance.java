{
  "filepath": "/tmp/Math-37b/src/main/java/org/apache/commons/math/stat/correlation/StorelessBivariateCovariance.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StorelessBivariateCovariance",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 77,
      "comment": "\n * Bivariate Covariance implementation that does not require input data to be\n * stored in memory.\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "deltaX"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "deltaY"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "meanX"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "meanY"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "covarianceNumerator"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "biasCorrected"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.correlation.StorelessBivariateCovariance.StorelessBivariateCovariance()",
      "begin_line": 45,
      "end_line": 46,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.correlation.StorelessBivariateCovariance.StorelessBivariateCovariance(boolean)",
      "begin_line": 48,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.StorelessBivariateCovariance.increment(double, double)",
      "begin_line": 52,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 12)",
        "(line 54,col 9)-(line 54,col 27)",
        "(line 55,col 9)-(line 55,col 27)",
        "(line 56,col 9)-(line 56,col 28)",
        "(line 57,col 9)-(line 57,col 28)",
        "(line 58,col 9)-(line 58,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.StorelessBivariateCovariance.getN()",
      "begin_line": 61,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.StorelessBivariateCovariance.getResult()",
      "begin_line": 65,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 66,col 9)-(line 69,col 9)",
        "(line 70,col 9)-(line 74,col 9)"
      ]
    }
  ]
}