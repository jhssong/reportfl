{
  "filepath": "/tmp/Math-36b/src/main/java/org/apache/commons/math/stat/regression/AbstractMultipleLinearRegression.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractMultipleLinearRegression",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.regression.MultipleLinearRegression"
      ],
      "begin_line": 38,
      "end_line": 370,
      "comment": "\n * Abstract base class for implementations of MultipleLinearRegression.\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "X"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " X sample data. "
    },
    {
      "type": "field",
      "varNames": [
        "Y"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Y sample data. "
    },
    {
      "type": "field",
      "varNames": [
        "noIntercept"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Whether or not the regression model includes an intercept.  True means no intercept. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.isNoIntercept()",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * @return true if the model has no intercept term; false otherwise\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.setNoIntercept(boolean)",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * @param noIntercept true means the model is to be estimated without an intercept term\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.newSampleData(double[], int, int)",
      "begin_line": 101,
      "end_line": 126,
      "comment": "\n     * \u003cp\u003eLoads model x and y sample data from a flat input array, overriding any previous sample.\n     * \u003c/p\u003e\n     * \u003cp\u003eAssumes that rows are concatenated with y values first in each row.  For example, an input\n     * \u003ccode\u003edata\u003c/code\u003e array containing the sequence of values (1, 2, 3, 4, 5, 6, 7, 8, 9) with\n     * \u003ccode\u003enobs \u003d 3\u003c/code\u003e and \u003ccode\u003envars \u003d 2\u003c/code\u003e creates a regression dataset with two\n     * independent variables, as below:\n     * \u003cpre\u003e\n     *   y   x[0]  x[1]\n     *   --------------\n     *   1     2     3\n     *   4     5     6\n     *   7     8     9\n     * \u003c/pre\u003e\n     * \u003c/p\u003e\n     * \u003cp\u003eNote that there is no need to add an initial unitary column (column of 1\u0027s) when\n     * specifying a model including an intercept term.  If {@link #isNoIntercept()} is \u003ccode\u003etrue\u003c/code\u003e,\n     * the X matrix will be created without an initial column of \"1\"s; otherwise this column will\n     * be added.\n     * \u003c/p\u003e\n     * \u003cp\u003eThrows IllegalArgumentException if any of the following preconditions fail:\n     * \u003cul\u003e\u003cli\u003e\u003ccode\u003edata\u003c/code\u003e cannot be null\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003edata.length \u003d nobs * (nvars + 1)\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003enobs \u003e nvars\u003c/code\u003e\u003c/li\u003e\u003c/ul\u003e\n     * \u003c/p\u003e\n     *\n     * @param data input data array\n     * @param nobs number of observations (rows)\n     * @param nvars number of independent variables (columns, not counting y)\n     * @throws NullArgumentException if the data array is null\n     * @throws DimensionMismatchException if the length of the data array is not equal\n     * to \u003ccode\u003enobs * (nvars + 1)\u003c/code\u003e\n     * @throws NumberIsTooSmallException if \u003ccode\u003enobs\u003c/code\u003e is smaller than\n     * \u003ccode\u003envars\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 111,col 38)",
        "(line 112,col 9)-(line 112,col 56)",
        "(line 113,col 9)-(line 113,col 46)",
        "(line 114,col 9)-(line 114,col 24)",
        "(line 115,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 124,col 45)",
        "(line 125,col 9)-(line 125,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.newYSampleData(double[])",
      "begin_line": 135,
      "end_line": 143,
      "comment": "\n     * Loads new y sample data, overriding any previous data.\n     *\n     * @param y the array representing the y sample\n     * @throws NullArgumentException if y is null\n     * @throws NoDataException if y is empty\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 141,col 9)",
        "(line 142,col 9)-(line 142,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.newXSampleData(double[][])",
      "begin_line": 170,
      "end_line": 191,
      "comment": "\n     * \u003cp\u003eLoads new x sample data, overriding any previous data.\n     * \u003c/p\u003e\n     * The input \u003ccode\u003ex\u003c/code\u003e array should have one row for each sample\n     * observation, with columns corresponding to independent variables.\n     * For example, if \u003cpre\u003e\n     * \u003ccode\u003e x \u003d new double[][] {{1, 2}, {3, 4}, {5, 6}} \u003c/code\u003e\u003c/pre\u003e\n     * then \u003ccode\u003esetXSampleData(x) \u003c/code\u003e results in a model with two independent\n     * variables and 3 observations:\n     * \u003cpre\u003e\n     *   x[0]  x[1]\n     *   ----------\n     *     1    2\n     *     3    4\n     *     5    6\n     * \u003c/pre\u003e\n     * \u003c/p\u003e\n     * \u003cp\u003eNote that there is no need to add an initial unitary column (column of 1\u0027s) when\n     * specifying a model including an intercept term.\n     * \u003c/p\u003e\n     * @param x the rectangular array representing the x sample\n     * @throws NullArgumentException if x is null\n     * @throws NoDataException if x is empty\n     * @throws DimensionMismatchException if x is not rectangular\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 173,col 9)",
        "(line 174,col 9)-(line 176,col 9)",
        "(line 177,col 9)-(line 190,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.validateSampleData(double[][], double[])",
      "begin_line": 211,
      "end_line": 226,
      "comment": "\n     * Validates sample data.  Checks that\n     * \u003cul\u003e\u003cli\u003eNeither x nor y is null or empty;\u003c/li\u003e\n     * \u003cli\u003eThe length (i.e. number of rows) of x equals the length of y\u003c/li\u003e\n     * \u003cli\u003ex has at least one more row than it has columns (i.e. there is\n     * sufficient data to estimate regression coefficients for each of the\n     * columns in x plus an intercept.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param x the [n,k] array representing the x data\n     * @param y the [n,1] array representing the y data\n     * @throws NullArgumentException if {@code x} or {@code y} is null\n     * @throws DimensionMismatchException if {@code x} and {@code y} do not\n     * have the same length\n     * @throws NoDataException if {@code x} or {@code y} are zero-length\n     * @throws MathIllegalArgumentException if the number of rows of {@code x}\n     * is not larger than the number of columns + 1\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 214,col 9)",
        "(line 215,col 9)-(line 217,col 9)",
        "(line 218,col 9)-(line 220,col 9)",
        "(line 221,col 9)-(line 225,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.validateCovarianceData(double[][], double[][])",
      "begin_line": 238,
      "end_line": 245,
      "comment": "\n     * Validates that the x data and covariance matrix have the same\n     * number of rows and that the covariance matrix is square.\n     *\n     * @param x the [n,k] array representing the x sample\n     * @param covariance the [n,n] array representing the covariance matrix\n     * @throws DimensionMismatchException if the number of rows in x is not equal\n     * to the number of rows in covariance\n     * @throws NonSquareMatrixException if the covariance matrix is not square\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 241,col 9)",
        "(line 242,col 9)-(line 244,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.estimateRegressionParameters()",
      "begin_line": 250,
      "end_line": 253,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 39)",
        "(line 252,col 9)-(line 252,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.estimateResiduals()",
      "begin_line": 258,
      "end_line": 262,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 39)",
        "(line 260,col 9)-(line 260,col 48)",
        "(line 261,col 9)-(line 261,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.estimateRegressionParametersVariance()",
      "begin_line": 267,
      "end_line": 269,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.estimateRegressionParametersStandardErrors()",
      "begin_line": 274,
      "end_line": 283,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 73)",
        "(line 276,col 9)-(line 276,col 48)",
        "(line 277,col 9)-(line 277,col 44)",
        "(line 278,col 9)-(line 278,col 45)",
        "(line 279,col 9)-(line 281,col 9)",
        "(line 282,col 9)-(line 282,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.estimateRegressandVariance()",
      "begin_line": 288,
      "end_line": 290,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.estimateErrorVariance()",
      "begin_line": 298,
      "end_line": 301,
      "comment": "\n     * Estimates the variance of the error.\n     *\n     * @return estimate of the error variance\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.estimateRegressionStandardError()",
      "begin_line": 309,
      "end_line": 311,
      "comment": "\n     * Estimates the standard error of the regression.\n     *\n     * @return regression standard error\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.calculateBeta()",
      "begin_line": 318,
      "end_line": 318,
      "comment": "\n     * Calculates the beta of multiple linear regression in matrix notation.\n     *\n     * @return beta\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.calculateBetaVariance()",
      "begin_line": 326,
      "end_line": 326,
      "comment": "\n     * Calculates the beta variance of multiple linear regression in matrix\n     * notation.\n     *\n     * @return beta variance\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.calculateYVariance()",
      "begin_line": 334,
      "end_line": 336,
      "comment": "\n     * Calculates the variance of the y values.\n     *\n     * @return Y variance\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.calculateErrorVariance()",
      "begin_line": 349,
      "end_line": 353,
      "comment": "\n     * \u003cp\u003eCalculates the variance of the error term.\u003c/p\u003e\n     * Uses the formula \u003cpre\u003e\n     * var(u) \u003d u \u0026middot; u / (n - k)\n     * \u003c/pre\u003e\n     * where n and k are the row and column dimensions of the design\n     * matrix X.\n     *\n     * @return error variance estimate\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 52)",
        "(line 351,col 9)-(line 352,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression.calculateResiduals()",
      "begin_line": 365,
      "end_line": 368,
      "comment": "\n     * Calculates the residuals of multiple linear regression in matrix\n     * notation.\n     *\n     * \u003cpre\u003e\n     * u \u003d y - X * b\n     * \u003c/pre\u003e\n     *\n     * @return The residuals [n,1] matrix\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 39)",
        "(line 367,col 9)-(line 367,col 40)"
      ]
    }
  ]
}