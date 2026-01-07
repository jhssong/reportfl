{
  "filepath": "/tmp/Math-65b/src/main/java/org/apache/commons/math/stat/regression/AbstractMultipleLinearRegression.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractMultipleLinearRegression",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.regression.MultipleLinearRegression"
      ],
      "begin_line": 31,
      "end_line": 204,
      "comment": "\n * Abstract base class for implementations of MultipleLinearRegression.\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "X"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " X sample data. "
    },
    {
      "type": "field",
      "varNames": [
        "Y"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Y sample data. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.newSampleData(double[], int, int)",
      "begin_line": 48,
      "end_line": 61,
      "comment": "\n     * Loads model x and y sample data from a flat array of data, overriding any previous sample.\n     * Assumes that rows are concatenated with y values first in each row.\n     *\n     * @param data input data array\n     * @param nobs number of observations (rows)\n     * @param nvars number of independent variables (columns, not counting y)\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 38)",
        "(line 50,col 9)-(line 50,col 51)",
        "(line 51,col 9)-(line 51,col 24)",
        "(line 52,col 9)-(line 58,col 9)",
        "(line 59,col 9)-(line 59,col 45)",
        "(line 60,col 9)-(line 60,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.newYSampleData(double[])",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * Loads new y sample data, overriding any previous sample\n     *\n     * @param y the [n,1] array representing the y sample\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.newXSampleData(double[][])",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * Loads new x sample data, overriding any previous sample\n     *\n     * @param x the [n,k] array representing the x sample\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.validateSampleData(double[][], double[])",
      "begin_line": 89,
      "end_line": 100,
      "comment": "\n     * Validates sample data.\n     *\n     * @param x the [n,k] array representing the x sample\n     * @param y the [n,1] array representing the y sample\n     * @throws IllegalArgumentException if the x and y array data are not\n     *             compatible for the regression\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 99,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.validateCovarianceData(double[][], double[][])",
      "begin_line": 110,
      "end_line": 120,
      "comment": "\n     * Validates sample data.\n     *\n     * @param x the [n,k] array representing the x sample\n     * @param covariance the [n,n] array representing the covariance matrix\n     * @throws IllegalArgumentException if the x sample data or covariance\n     *             matrix are not compatible for the regression\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 119,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.estimateRegressionParameters()",
      "begin_line": 125,
      "end_line": 128,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 39)",
        "(line 127,col 9)-(line 127,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.estimateResiduals()",
      "begin_line": 133,
      "end_line": 137,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 39)",
        "(line 135,col 9)-(line 135,col 48)",
        "(line 136,col 9)-(line 136,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.estimateRegressionParametersVariance()",
      "begin_line": 142,
      "end_line": 144,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.estimateRegressionParametersStandardErrors()",
      "begin_line": 149,
      "end_line": 158,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 73)",
        "(line 151,col 9)-(line 151,col 44)",
        "(line 152,col 9)-(line 152,col 44)",
        "(line 153,col 9)-(line 153,col 45)",
        "(line 154,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 157,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.estimateRegressandVariance()",
      "begin_line": 163,
      "end_line": 165,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.calculateBeta()",
      "begin_line": 172,
      "end_line": 172,
      "comment": "\n     * Calculates the beta of multiple linear regression in matrix notation.\n     *\n     * @return beta\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.calculateBetaVariance()",
      "begin_line": 180,
      "end_line": 180,
      "comment": "\n     * Calculates the beta variance of multiple linear regression in matrix\n     * notation.\n     *\n     * @return beta variance\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.calculateYVariance()",
      "begin_line": 187,
      "end_line": 187,
      "comment": "\n     * Calculates the Y variance of multiple linear regression.\n     *\n     * @return Y variance\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.calculateResiduals()",
      "begin_line": 199,
      "end_line": 202,
      "comment": "\n     * Calculates the residuals of multiple linear regression in matrix\n     * notation.\n     *\n     * \u003cpre\u003e\n     * u \u003d y - X * b\n     * \u003c/pre\u003e\n     *\n     * @return The residuals [n,1] matrix\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 39)",
        "(line 201,col 9)-(line 201,col 40)"
      ]
    }
  ]
}