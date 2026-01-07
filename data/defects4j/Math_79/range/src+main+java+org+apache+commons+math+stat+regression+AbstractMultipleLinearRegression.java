{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/stat/regression/AbstractMultipleLinearRegression.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractMultipleLinearRegression",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.regression.MultipleLinearRegression"
      ],
      "begin_line": 30,
      "end_line": 203,
      "comment": "\n * Abstract base class for implementations of MultipleLinearRegression.\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "X"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " X sample data. "
    },
    {
      "type": "field",
      "varNames": [
        "Y"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Y sample data. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.newSampleData(double[], int, int)",
      "begin_line": 47,
      "end_line": 60,
      "comment": "\n     * Loads model x and y sample data from a flat array of data, overriding any previous sample.\n     * Assumes that rows are concatenated with y values first in each row.\n     *\n     * @param data input data array\n     * @param nobs number of observations (rows)\n     * @param nvars number of independent variables (columns, not counting y)\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 38)",
        "(line 49,col 9)-(line 49,col 51)",
        "(line 50,col 9)-(line 50,col 24)",
        "(line 51,col 9)-(line 57,col 9)",
        "(line 58,col 9)-(line 58,col 45)",
        "(line 59,col 9)-(line 59,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.newYSampleData(double[])",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * Loads new y sample data, overriding any previous sample\n     *\n     * @param y the [n,1] array representing the y sample\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.newXSampleData(double[][])",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Loads new x sample data, overriding any previous sample\n     *\n     * @param x the [n,k] array representing the x sample\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.validateSampleData(double[][], double[])",
      "begin_line": 88,
      "end_line": 99,
      "comment": "\n     * Validates sample data.\n     *\n     * @param x the [n,k] array representing the x sample\n     * @param y the [n,1] array representing the y sample\n     * @throws IllegalArgumentException if the x and y array data are not\n     *             compatible for the regression\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 98,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.validateCovarianceData(double[][], double[][])",
      "begin_line": 109,
      "end_line": 119,
      "comment": "\n     * Validates sample data.\n     *\n     * @param x the [n,k] array representing the x sample\n     * @param covariance the [n,n] array representing the covariance matrix\n     * @throws IllegalArgumentException if the x sample data or covariance\n     *             matrix are not compatible for the regression\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 113,col 9)",
        "(line 114,col 9)-(line 118,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.estimateRegressionParameters()",
      "begin_line": 124,
      "end_line": 127,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 39)",
        "(line 126,col 9)-(line 126,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.estimateResiduals()",
      "begin_line": 132,
      "end_line": 136,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 39)",
        "(line 134,col 9)-(line 134,col 48)",
        "(line 135,col 9)-(line 135,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.estimateRegressionParametersVariance()",
      "begin_line": 141,
      "end_line": 143,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.estimateRegressionParametersStandardErrors()",
      "begin_line": 148,
      "end_line": 157,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 73)",
        "(line 150,col 9)-(line 150,col 44)",
        "(line 151,col 9)-(line 151,col 44)",
        "(line 152,col 9)-(line 152,col 45)",
        "(line 153,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 156,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.estimateRegressandVariance()",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.calculateBeta()",
      "begin_line": 171,
      "end_line": 171,
      "comment": "\n     * Calculates the beta of multiple linear regression in matrix notation.\n     *\n     * @return beta\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.calculateBetaVariance()",
      "begin_line": 179,
      "end_line": 179,
      "comment": "\n     * Calculates the beta variance of multiple linear regression in matrix\n     * notation.\n     *\n     * @return beta variance\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.calculateYVariance()",
      "begin_line": 186,
      "end_line": 186,
      "comment": "\n     * Calculates the Y variance of multiple linear regression.\n     *\n     * @return Y variance\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.calculateResiduals()",
      "begin_line": 198,
      "end_line": 201,
      "comment": "\n     * Calculates the residuals of multiple linear regression in matrix\n     * notation.\n     *\n     * \u003cpre\u003e\n     * u \u003d y - X * b\n     * \u003c/pre\u003e\n     *\n     * @return The residuals [n,1] matrix\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 39)",
        "(line 200,col 9)-(line 200,col 40)"
      ]
    }
  ]
}