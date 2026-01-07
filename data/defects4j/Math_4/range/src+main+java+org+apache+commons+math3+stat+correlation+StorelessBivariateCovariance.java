{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/stat/correlation/StorelessBivariateCovariance.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StorelessBivariateCovariance",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 39,
      "end_line": 138,
      "comment": "\n * Bivariate Covariance implementation that does not require input data to be\n * stored in memory.\n *\n * \u003cp\u003eThis class is based on a paper written by Philippe P\u0026eacute;bay:\n * \u003ca href\u003d\"http://prod.sandia.gov/techlib/access-control.cgi/2008/086212.pdf\"\u003e\n * Formulas for Robust, One-Pass Parallel Computation of Covariances and\n * Arbitrary-Order Statistical Moments\u003c/a\u003e, 2008, Technical Report SAND2008-6212,\n * Sandia National Laboratories. It computes the covariance for a pair of variables.\n * Use {@link StorelessCovariance} to estimate an entire covariance matrix.\u003c/p\u003e\n *\n * \u003cp\u003eNote: This class is package private as it is only used internally in\n * the {@link StorelessCovariance} class.\u003c/p\u003e\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "meanX"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " the mean of variable x "
    },
    {
      "type": "field",
      "varNames": [
        "meanY"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " the mean of variable y "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " number of observations "
    },
    {
      "type": "field",
      "varNames": [
        "covarianceNumerator"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " the running covariance estimate "
    },
    {
      "type": "field",
      "varNames": [
        "biasCorrected"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " flag for bias correction "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.correlation.StorelessBivariateCovariance.StorelessBivariateCovariance()",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * Create an empty {@link StorelessBivariateCovariance} instance with\n     * bias correction.\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.correlation.StorelessBivariateCovariance.StorelessBivariateCovariance(boolean)",
      "begin_line": 71,
      "end_line": 76,
      "comment": "\n     * Create an empty {@link StorelessBivariateCovariance} instance.\n     *\n     * @param biasCorrection if \u003ccode\u003etrue\u003c/code\u003e the covariance estimate is corrected\n     * for bias, i.e. n-1 in the denominator, otherwise there is no bias correction,\n     * i.e. n in the denominator.\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 28)",
        "(line 73,col 9)-(line 73,col 14)",
        "(line 74,col 9)-(line 74,col 34)",
        "(line 75,col 9)-(line 75,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.StorelessBivariateCovariance.increment(double, double)",
      "begin_line": 84,
      "end_line": 91,
      "comment": "\n     * Update the covariance estimation with a pair of variables (x, y).\n     *\n     * @param x the x value\n     * @param y the y value\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 12)",
        "(line 86,col 9)-(line 86,col 40)",
        "(line 87,col 9)-(line 87,col 40)",
        "(line 88,col 9)-(line 88,col 28)",
        "(line 89,col 9)-(line 89,col 28)",
        "(line 90,col 9)-(line 90,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.StorelessBivariateCovariance.append(org.apache.commons.math3.stat.correlation.StorelessBivariateCovariance)",
      "begin_line": 101,
      "end_line": 109,
      "comment": "\n     * Appends another bivariate covariance calculation to this.\n     * After this operation, statistics returned should be close to what would\n     * have been obtained by by performing all of the {@link #increment(double, double)}\n     * operations in {@code cov} directly on this.\n     *\n     * @param cov StorelessBivariateCovariance instance to append.\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 24)",
        "(line 103,col 9)-(line 103,col 19)",
        "(line 104,col 9)-(line 104,col 48)",
        "(line 105,col 9)-(line 105,col 48)",
        "(line 106,col 9)-(line 106,col 36)",
        "(line 107,col 9)-(line 107,col 36)",
        "(line 108,col 9)-(line 108,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.StorelessBivariateCovariance.getN()",
      "begin_line": 116,
      "end_line": 118,
      "comment": "\n     * Returns the number of observations.\n     *\n     * @return number of observations\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.StorelessBivariateCovariance.getResult()",
      "begin_line": 127,
      "end_line": 137,
      "comment": "\n     * Return the current covariance estimate.\n     *\n     * @return the current covariance\n     * @throws NumberIsTooSmallException if the number of observations\n     * is \u0026lt; 2\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 131,col 9)",
        "(line 132,col 9)-(line 136,col 9)"
      ]
    }
  ]
}