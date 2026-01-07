{
  "filepath": "/tmp/Math-97b/src/java/org/apache/commons/math/stat/regression/AbstractMultipleLinearRegression.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractMultipleLinearRegression",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.regression.MultipleLinearRegression"
      ],
      "begin_line": 27,
      "end_line": 164,
      "comment": "\n * Abstract base class for implementations of MultipleLinearRegression.\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "X"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " X sample data. "
    },
    {
      "type": "field",
      "varNames": [
        "Y"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Y sample data. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.addYSampleData(double[])",
      "begin_line": 41,
      "end_line": 43,
      "comment": "\n     * Adds y sample data.\n     * \n     * @param y the [n,1] array representing the y sample\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.addXSampleData(double[][])",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n     * Adds x sample data.\n     * \n     * @param x the [n,k] array representing the x sample\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.validateSampleData(double[][], double[])",
      "begin_line": 62,
      "end_line": 73,
      "comment": "\n     * Validates sample data.\n     * \n     * @param x the [n,k] array representing the x sample\n     * @param y the [n,1] array representing the y sample\n     * @throws IllegalArgumentException if the x and y array data are not\n     *             compatible for the regression\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 65,col 9)",
        "(line 66,col 9)-(line 68,col 9)",
        "(line 69,col 9)-(line 72,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.validateCovarianceData(double[][], double[][])",
      "begin_line": 83,
      "end_line": 94,
      "comment": "\n     * Validates sample data.\n     * \n     * @param x the [n,k] array representing the x sample\n     * @param covariance the [n,n] array representing the covariance matrix\n     * @throws IllegalArgumentException if the x sample data or covariance\n     *             matrix are not compatible for the regression\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 86,col 9)",
        "(line 87,col 9)-(line 90,col 9)",
        "(line 91,col 9)-(line 93,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.estimateRegressionParameters()",
      "begin_line": 99,
      "end_line": 102,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 39)",
        "(line 101,col 9)-(line 101,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.estimateResiduals()",
      "begin_line": 107,
      "end_line": 111,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 39)",
        "(line 109,col 9)-(line 109,col 49)",
        "(line 110,col 9)-(line 110,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.estimateRegressionParametersVariance()",
      "begin_line": 116,
      "end_line": 118,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.estimateRegressandVariance()",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.calculateBeta()",
      "begin_line": 132,
      "end_line": 132,
      "comment": "\n     * Calculates the beta of multiple linear regression in matrix notation.\n     * \n     * @return beta\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.calculateBetaVariance()",
      "begin_line": 140,
      "end_line": 140,
      "comment": "\n     * Calculates the beta variance of multiple linear regression in matrix\n     * notation.\n     * \n     * @return beta variance\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.calculateYVariance()",
      "begin_line": 147,
      "end_line": 147,
      "comment": "\n     * Calculates the Y variance of multiple linear regression.\n     * \n     * @return Y variance\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.calculateResiduals()",
      "begin_line": 159,
      "end_line": 162,
      "comment": "\n     * Calculates the residuals of multiple linear regression in matrix\n     * notation.\n     * \n     * \u003cpre\u003e\n     * u \u003d y - X * b\n     * \u003c/pre\u003e\n     * \n     * @return The residuals [n,1] matrix\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 39)",
        "(line 161,col 9)-(line 161,col 41)"
      ]
    }
  ]
}