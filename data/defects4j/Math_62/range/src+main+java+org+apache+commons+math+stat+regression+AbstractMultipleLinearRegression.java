{
  "filepath": "/tmp/Math-62b/src/main/java/org/apache/commons/math/stat/regression/AbstractMultipleLinearRegression.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractMultipleLinearRegression",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.regression.MultipleLinearRegression"
      ],
      "begin_line": 33,
      "end_line": 361,
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
      "type": "field",
      "varNames": [
        "noIntercept"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Whether or not the regression model includes an intercept.  True means no intercept. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.isNoIntercept()",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * @return true if the model has no intercept term; false otherwise\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.setNoIntercept(boolean)",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n     * @param noIntercept true means the model is to be estimated without an intercept term\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.newSampleData(double[], int, int)",
      "begin_line": 90,
      "end_line": 118,
      "comment": "\n     * \u003cp\u003eLoads model x and y sample data from a flat input array, overriding any previous sample.\n     * \u003c/p\u003e\n     * \u003cp\u003eAssumes that rows are concatenated with y values first in each row.  For example, an input\n     * \u003ccode\u003edata\u003c/code\u003e array containing the sequence of values (1, 2, 3, 4, 5, 6, 7, 8, 9) with\n     * \u003ccode\u003enobs \u003d 3\u003c/code\u003e and \u003ccode\u003envars \u003d 2\u003c/code\u003e creates a regression dataset with two\n     * independent variables, as below:\n     * \u003cpre\u003e\n     *   y   x[0]  x[1]\n     *   --------------\n     *   1     2     3\n     *   4     5     6\n     *   7     8     9\n     * \u003c/pre\u003e\n     * \u003c/p\u003e\n     * \u003cp\u003eNote that there is no need to add an initial unitary column (column of 1\u0027s) when\n     * specifying a model including an intercept term.  If {@link #isNoIntercept()} is \u003ccode\u003etrue\u003c/code\u003e,\n     * the X matrix will be created without an initial column of \"1\"s; otherwise this column will\n     * be added.\n     * \u003c/p\u003e\n     * \u003cp\u003eThrows IllegalArgumentException if any of the following preconditions fail:\n     * \u003cul\u003e\u003cli\u003e\u003ccode\u003edata\u003c/code\u003e cannot be null\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003edata.length \u003d nobs * (nvars + 1)\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003enobs \u003e nvars\u003c/code\u003e\u003c/li\u003e\u003c/ul\u003e\n     * \u003c/p\u003e\n     *\n     * @param data input data array\n     * @param nobs number of observations (rows)\n     * @param nvars number of independent variables (columns, not counting y)\n     * @throws IllegalArgumentException if the preconditions are not met\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 94,col 9)",
        "(line 95,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 103,col 38)",
        "(line 104,col 9)-(line 104,col 56)",
        "(line 105,col 9)-(line 105,col 46)",
        "(line 106,col 9)-(line 106,col 24)",
        "(line 107,col 9)-(line 115,col 9)",
        "(line 116,col 9)-(line 116,col 45)",
        "(line 117,col 9)-(line 117,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.newYSampleData(double[])",
      "begin_line": 126,
      "end_line": 136,
      "comment": "\n     * Loads new y sample data, overriding any previous data.\n     *\n     * @param y the array representing the y sample\n     * @throws IllegalArgumentException if y is null or empty\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 134,col 9)",
        "(line 135,col 9)-(line 135,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.newXSampleData(double[][])",
      "begin_line": 161,
      "end_line": 186,
      "comment": "\n     * \u003cp\u003eLoads new x sample data, overriding any previous data.\n     * \u003c/p\u003e\n     * The input \u003ccode\u003ex\u003c/code\u003e array should have one row for each sample\n     * observation, with columns corresponding to independent variables.\n     * For example, if \u003cpre\u003e\n     * \u003ccode\u003e x \u003d new double[][] {{1, 2}, {3, 4}, {5, 6}} \u003c/code\u003e\u003c/pre\u003e\n     * then \u003ccode\u003esetXSampleData(x) \u003c/code\u003e results in a model with two independent\n     * variables and 3 observations:\n     * \u003cpre\u003e\n     *   x[0]  x[1]\n     *   ----------\n     *     1    2\n     *     3    4\n     *     5    6\n     * \u003c/pre\u003e\n     * \u003c/p\u003e\n     * \u003cp\u003eNote that there is no need to add an initial unitary column (column of 1\u0027s) when\n     * specifying a model including an intercept term.\n     * \u003c/p\u003e\n     * @param x the rectangular array representing the x sample\n     * @throws IllegalArgumentException if x is null, empty or not rectangular\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 165,col 9)",
        "(line 166,col 9)-(line 169,col 9)",
        "(line 170,col 9)-(line 185,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.validateSampleData(double[][], double[])",
      "begin_line": 202,
      "end_line": 218,
      "comment": "\n     * Validates sample data.  Checks that\n     * \u003cul\u003e\u003cli\u003eNeither x nor y is null or empty;\u003c/li\u003e\n     * \u003cli\u003eThe length (i.e. number of rows) of x equals the length of y\u003c/li\u003e\n     * \u003cli\u003ex has at least one more row than it has columns (i.e. there is\n     * sufficient data to estimate regression coefficients for each of the\n     * columns in x plus an intercept.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param x the [n,k] array representing the x data\n     * @param y the [n,1] array representing the y data\n     * @throws IllegalArgumentException if any of the checks fail\n     *\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 208,col 9)",
        "(line 209,col 9)-(line 212,col 9)",
        "(line 213,col 9)-(line 217,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.validateCovarianceData(double[][], double[][])",
      "begin_line": 229,
      "end_line": 239,
      "comment": "\n     * Validates that the x data and covariance matrix have the same\n     * number of rows and that the covariance matrix is square.\n     *\n     * @param x the [n,k] array representing the x sample\n     * @param covariance the [n,n] array representing the covariance matrix\n     * @throws IllegalArgumentException if the number of rows in x is not equal\n     * to the number of rows in covariance or covariance is not square.\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 233,col 9)",
        "(line 234,col 9)-(line 238,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.estimateRegressionParameters()",
      "begin_line": 244,
      "end_line": 247,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 39)",
        "(line 246,col 9)-(line 246,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.estimateResiduals()",
      "begin_line": 252,
      "end_line": 256,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 39)",
        "(line 254,col 9)-(line 254,col 48)",
        "(line 255,col 9)-(line 255,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.estimateRegressionParametersVariance()",
      "begin_line": 261,
      "end_line": 263,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.estimateRegressionParametersStandardErrors()",
      "begin_line": 268,
      "end_line": 277,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 73)",
        "(line 270,col 9)-(line 270,col 48)",
        "(line 271,col 9)-(line 271,col 44)",
        "(line 272,col 9)-(line 272,col 45)",
        "(line 273,col 9)-(line 275,col 9)",
        "(line 276,col 9)-(line 276,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.estimateRegressandVariance()",
      "begin_line": 282,
      "end_line": 284,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.estimateErrorVariance()",
      "begin_line": 291,
      "end_line": 294,
      "comment": "\n     * Estimates the variance of the error.\n     *\n     * @return estimate of the error variance\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.estimateRegressionStandardError()",
      "begin_line": 301,
      "end_line": 303,
      "comment": "\n     * Estimates the standard error of the regression.\n     *\n     * @return regression standard error\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.calculateBeta()",
      "begin_line": 310,
      "end_line": 310,
      "comment": "\n     * Calculates the beta of multiple linear regression in matrix notation.\n     *\n     * @return beta\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.calculateBetaVariance()",
      "begin_line": 318,
      "end_line": 318,
      "comment": "\n     * Calculates the beta variance of multiple linear regression in matrix\n     * notation.\n     *\n     * @return beta variance\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.calculateYVariance()",
      "begin_line": 326,
      "end_line": 328,
      "comment": "\n     * Calculates the variance of the y values.\n     *\n     * @return Y variance\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.calculateErrorVariance()",
      "begin_line": 340,
      "end_line": 344,
      "comment": "\n     * \u003cp\u003eCalculates the variance of the error term.\u003c/p\u003e\n     * Uses the formula \u003cpre\u003e\n     * var(u) \u003d u \u0026middot; u / (n - k)\n     * \u003c/pre\u003e\n     * where n and k are the row and column dimensions of the design\n     * matrix X.\n     *\n     * @return error variance estimate\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 52)",
        "(line 342,col 9)-(line 343,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.calculateResiduals()",
      "begin_line": 356,
      "end_line": 359,
      "comment": "\n     * Calculates the residuals of multiple linear regression in matrix\n     * notation.\n     *\n     * \u003cpre\u003e\n     * u \u003d y - X * b\n     * \u003c/pre\u003e\n     *\n     * @return The residuals [n,1] matrix\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 39)",
        "(line 358,col 9)-(line 358,col 40)"
      ]
    }
  ]
}