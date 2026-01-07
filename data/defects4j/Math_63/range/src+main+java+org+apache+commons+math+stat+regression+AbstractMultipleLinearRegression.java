{
  "filepath": "/tmp/Math-63b/src/main/java/org/apache/commons/math/stat/regression/AbstractMultipleLinearRegression.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractMultipleLinearRegression",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.regression.MultipleLinearRegression"
      ],
      "begin_line": 33,
      "end_line": 244,
      "comment": "\n * Abstract base class for implementations of MultipleLinearRegression.\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "X"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " X sample data. "
    },
    {
      "type": "field",
      "varNames": [
        "Y"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Y sample data. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.newSampleData(double[], int, int)",
      "begin_line": 50,
      "end_line": 63,
      "comment": "\n     * Loads model x and y sample data from a flat array of data, overriding any previous sample.\n     * Assumes that rows are concatenated with y values first in each row.\n     *\n     * @param data input data array\n     * @param nobs number of observations (rows)\n     * @param nvars number of independent variables (columns, not counting y)\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 38)",
        "(line 52,col 9)-(line 52,col 51)",
        "(line 53,col 9)-(line 53,col 24)",
        "(line 54,col 9)-(line 60,col 9)",
        "(line 61,col 9)-(line 61,col 45)",
        "(line 62,col 9)-(line 62,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.newYSampleData(double[])",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * Loads new y sample data, overriding any previous sample\n     *\n     * @param y the [n,1] array representing the y sample\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.newXSampleData(double[][])",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * Loads new x sample data, overriding any previous sample\n     *\n     * @param x the [n,k] array representing the x sample\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.validateSampleData(double[][], double[])",
      "begin_line": 91,
      "end_line": 102,
      "comment": "\n     * Validates sample data.\n     *\n     * @param x the [n,k] array representing the x sample\n     * @param y the [n,1] array representing the y sample\n     * @throws IllegalArgumentException if the x and y array data are not\n     *             compatible for the regression\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 101,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.validateCovarianceData(double[][], double[][])",
      "begin_line": 112,
      "end_line": 122,
      "comment": "\n     * Validates sample data.\n     *\n     * @param x the [n,k] array representing the x sample\n     * @param covariance the [n,n] array representing the covariance matrix\n     * @throws IllegalArgumentException if the x sample data or covariance\n     *             matrix are not compatible for the regression\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 121,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.estimateRegressionParameters()",
      "begin_line": 127,
      "end_line": 130,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 39)",
        "(line 129,col 9)-(line 129,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.estimateResiduals()",
      "begin_line": 135,
      "end_line": 139,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 39)",
        "(line 137,col 9)-(line 137,col 48)",
        "(line 138,col 9)-(line 138,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.estimateRegressionParametersVariance()",
      "begin_line": 144,
      "end_line": 146,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.estimateRegressionParametersStandardErrors()",
      "begin_line": 151,
      "end_line": 160,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 73)",
        "(line 153,col 9)-(line 153,col 48)",
        "(line 154,col 9)-(line 154,col 44)",
        "(line 155,col 9)-(line 155,col 45)",
        "(line 156,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 159,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.estimateRegressandVariance()",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.estimateErrorVariance()",
      "begin_line": 174,
      "end_line": 177,
      "comment": "\n     * Estimates the variance of the error.\n     *\n     * @return estimate of the error variance\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.estimateRegressionStandardError()",
      "begin_line": 184,
      "end_line": 186,
      "comment": "\n     * Estimates the standard error of the regression.\n     *\n     * @return regression standard error\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.calculateBeta()",
      "begin_line": 193,
      "end_line": 193,
      "comment": "\n     * Calculates the beta of multiple linear regression in matrix notation.\n     *\n     * @return beta\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.calculateBetaVariance()",
      "begin_line": 201,
      "end_line": 201,
      "comment": "\n     * Calculates the beta variance of multiple linear regression in matrix\n     * notation.\n     *\n     * @return beta variance\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.calculateYVariance()",
      "begin_line": 209,
      "end_line": 211,
      "comment": "\n     * Calculates the variance of the y values.\n     *\n     * @return Y variance\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.calculateErrorVariance()",
      "begin_line": 223,
      "end_line": 227,
      "comment": "\n     * \u003cp\u003eCalculates the variance of the error term.\u003c/p\u003e\n     * Uses the formula \u003cpre\u003e\n     * var(u) \u003d u \u0026middot; u / (n - k)\n     * \u003c/pre\u003e\n     * where n and k are the row and column dimensions of the design\n     * matrix X.\n     *\n     * @return error variance estimate\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 52)",
        "(line 225,col 9)-(line 226,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.calculateResiduals()",
      "begin_line": 239,
      "end_line": 242,
      "comment": "\n     * Calculates the residuals of multiple linear regression in matrix\n     * notation.\n     *\n     * \u003cpre\u003e\n     * u \u003d y - X * b\n     * \u003c/pre\u003e\n     *\n     * @return The residuals [n,1] matrix\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 39)",
        "(line 241,col 9)-(line 241,col 40)"
      ]
    }
  ]
}