{
  "filepath": "/tmp/Math-92b/src/java/org/apache/commons/math/stat/regression/AbstractMultipleLinearRegression.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractMultipleLinearRegression",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.regression.MultipleLinearRegression"
      ],
      "begin_line": 27,
      "end_line": 201,
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
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.newSampleData(double[], int, int)",
      "begin_line": 44,
      "end_line": 57,
      "comment": "\n     * Loads model x and y sample data from a flat array of data, overriding any previous sample.\n     * Assumes that rows are concatenated with y values first in each row.\n     * \n     * @param data input data array\n     * @param nobs number of observations (rows)\n     * @param nvars number of independent variables (columnns, not counting y)\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 38)",
        "(line 46,col 9)-(line 46,col 51)",
        "(line 47,col 9)-(line 47,col 24)",
        "(line 48,col 9)-(line 54,col 9)",
        "(line 55,col 9)-(line 55,col 39)",
        "(line 56,col 9)-(line 56,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.newYSampleData(double[])",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * Loads new y sample data, overriding any previous sample\n     * \n     * @param y the [n,1] array representing the y sample\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.newXSampleData(double[][])",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\n     * Loads new x sample data, overriding any previous sample\n     * \n     * @param x the [n,k] array representing the x sample\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.validateSampleData(double[][], double[])",
      "begin_line": 85,
      "end_line": 96,
      "comment": "\n     * Validates sample data.\n     * \n     * @param x the [n,k] array representing the x sample\n     * @param y the [n,1] array representing the y sample\n     * @throws IllegalArgumentException if the x and y array data are not\n     *             compatible for the regression\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 88,col 9)",
        "(line 89,col 9)-(line 91,col 9)",
        "(line 92,col 9)-(line 95,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.validateCovarianceData(double[][], double[][])",
      "begin_line": 106,
      "end_line": 117,
      "comment": "\n     * Validates sample data.\n     * \n     * @param x the [n,k] array representing the x sample\n     * @param covariance the [n,n] array representing the covariance matrix\n     * @throws IllegalArgumentException if the x sample data or covariance\n     *             matrix are not compatible for the regression\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 109,col 9)",
        "(line 110,col 9)-(line 113,col 9)",
        "(line 114,col 9)-(line 116,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.estimateRegressionParameters()",
      "begin_line": 122,
      "end_line": 125,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 39)",
        "(line 124,col 9)-(line 124,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.estimateResiduals()",
      "begin_line": 130,
      "end_line": 134,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 39)",
        "(line 132,col 9)-(line 132,col 49)",
        "(line 133,col 9)-(line 133,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.estimateRegressionParametersVariance()",
      "begin_line": 139,
      "end_line": 141,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.estimateRegressionParametersStandardErrors()",
      "begin_line": 146,
      "end_line": 155,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 73)",
        "(line 148,col 9)-(line 148,col 44)",
        "(line 149,col 9)-(line 149,col 44)",
        "(line 150,col 9)-(line 150,col 45)",
        "(line 151,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 154,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.estimateRegressandVariance()",
      "begin_line": 160,
      "end_line": 162,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.calculateBeta()",
      "begin_line": 169,
      "end_line": 169,
      "comment": "\n     * Calculates the beta of multiple linear regression in matrix notation.\n     * \n     * @return beta\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.calculateBetaVariance()",
      "begin_line": 177,
      "end_line": 177,
      "comment": "\n     * Calculates the beta variance of multiple linear regression in matrix\n     * notation.\n     * \n     * @return beta variance\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.calculateYVariance()",
      "begin_line": 184,
      "end_line": 184,
      "comment": "\n     * Calculates the Y variance of multiple linear regression.\n     * \n     * @return Y variance\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.calculateResiduals()",
      "begin_line": 196,
      "end_line": 199,
      "comment": "\n     * Calculates the residuals of multiple linear regression in matrix\n     * notation.\n     * \n     * \u003cpre\u003e\n     * u \u003d y - X * b\n     * \u003c/pre\u003e\n     * \n     * @return The residuals [n,1] matrix\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 39)",
        "(line 198,col 9)-(line 198,col 41)"
      ]
    }
  ]
}