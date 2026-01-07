{
  "filepath": "/tmp/Math-41b/src/main/java/org/apache/commons/math/stat/correlation/StorelessCovariance.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StorelessCovariance",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.correlation.Covariance"
      ],
      "begin_line": 32,
      "end_line": 121,
      "comment": "\n * Covariance implementation that does not require input data to be\n * stored in memory.\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "covMatrix"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "rowDimension"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "colDimension"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "biasCorrected"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.correlation.StorelessCovariance.StorelessCovariance(int, int)",
      "begin_line": 42,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.correlation.StorelessCovariance.StorelessCovariance(int, int, boolean)",
      "begin_line": 46,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 41)",
        "(line 48,col 9)-(line 48,col 41)",
        "(line 49,col 9)-(line 49,col 43)",
        "(line 50,col 9)-(line 50,col 81)",
        "(line 51,col 9)-(line 51,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.StorelessCovariance.initializeMatrix()",
      "begin_line": 54,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 55,col 9)-(line 59,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.StorelessCovariance.getCovariance(int, int)",
      "begin_line": 62,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.StorelessCovariance.setCovariance(int, int, org.apache.commons.math.stat.correlation.StorelessBivariateCovariance)",
      "begin_line": 66,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.StorelessCovariance.incrementCovariance(int, int, double, double)",
      "begin_line": 70,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.StorelessCovariance.incrementRow(double[])",
      "begin_line": 74,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 36)",
        "(line 76,col 9)-(line 79,col 9)",
        "(line 80,col 9)-(line 84,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.StorelessCovariance.getCovarianceMatrix()",
      "begin_line": 87,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 81)",
        "(line 90,col 9)-(line 94,col 9)",
        "(line 95,col 9)-(line 95,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.StorelessCovariance.getData()",
      "begin_line": 98,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 65)",
        "(line 100,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 105,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.correlation.StorelessCovariance.getN()",
      "begin_line": 115,
      "end_line": 119,
      "comment": "\n     * This {@link Covariance} method is not supported by StorelessCovariance, since\n     * the number of bivariate observations does not have to be the same for different\n     * pairs of covariates - i.e., N as defined in {@link Covariance#getN()} is undefined.\n     * @return nothing as this implementation always throws a {@link MathUnsupportedOperationException}\n     * @throws MathUnsupportedOperationException in all cases\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 54)"
      ]
    }
  ]
}