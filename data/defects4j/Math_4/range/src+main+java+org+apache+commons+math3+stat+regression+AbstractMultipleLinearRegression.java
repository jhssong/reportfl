{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/stat/regression/AbstractMultipleLinearRegression.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractMultipleLinearRegression",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.stat.regression.MultipleLinearRegression"
      ],
      "begin_line": 38,
      "end_line": 384,
      "comment": "\n * Abstract base class for implementations of MultipleLinearRegression.\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "xMatrix"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " X sample data. "
    },
    {
      "type": "field",
      "varNames": [
        "yVector"
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
      "signature": "org.apache.commons.math3.stat.regression.AbstractMultipleLinearRegression.getX()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * @return the X sample data.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.AbstractMultipleLinearRegression.getY()",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * @return the Y sample data.\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.AbstractMultipleLinearRegression.isNoIntercept()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * @return true if the model has no intercept term; false otherwise\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.AbstractMultipleLinearRegression.setNoIntercept(boolean)",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * @param noIntercept true means the model is to be estimated without an intercept term\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.AbstractMultipleLinearRegression.newSampleData(double[], int, int)",
      "begin_line": 115,
      "end_line": 140,
      "comment": "\n     * \u003cp\u003eLoads model x and y sample data from a flat input array, overriding any previous sample.\n     * \u003c/p\u003e\n     * \u003cp\u003eAssumes that rows are concatenated with y values first in each row.  For example, an input\n     * \u003ccode\u003edata\u003c/code\u003e array containing the sequence of values (1, 2, 3, 4, 5, 6, 7, 8, 9) with\n     * \u003ccode\u003enobs \u003d 3\u003c/code\u003e and \u003ccode\u003envars \u003d 2\u003c/code\u003e creates a regression dataset with two\n     * independent variables, as below:\n     * \u003cpre\u003e\n     *   y   x[0]  x[1]\n     *   --------------\n     *   1     2     3\n     *   4     5     6\n     *   7     8     9\n     * \u003c/pre\u003e\n     * \u003c/p\u003e\n     * \u003cp\u003eNote that there is no need to add an initial unitary column (column of 1\u0027s) when\n     * specifying a model including an intercept term.  If {@link #isNoIntercept()} is \u003ccode\u003etrue\u003c/code\u003e,\n     * the X matrix will be created without an initial column of \"1\"s; otherwise this column will\n     * be added.\n     * \u003c/p\u003e\n     * \u003cp\u003eThrows IllegalArgumentException if any of the following preconditions fail:\n     * \u003cul\u003e\u003cli\u003e\u003ccode\u003edata\u003c/code\u003e cannot be null\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003edata.length \u003d nobs * (nvars + 1)\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003enobs \u003e nvars\u003c/code\u003e\u003c/li\u003e\u003c/ul\u003e\n     * \u003c/p\u003e\n     *\n     * @param data input data array\n     * @param nobs number of observations (rows)\n     * @param nvars number of independent variables (columns, not counting y)\n     * @throws NullArgumentException if the data array is null\n     * @throws DimensionMismatchException if the length of the data array is not equal\n     * to \u003ccode\u003enobs * (nvars + 1)\u003c/code\u003e\n     * @throws NumberIsTooSmallException if \u003ccode\u003enobs\u003c/code\u003e is smaller than\n     * \u003ccode\u003envars\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 118,col 9)",
        "(line 119,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 124,col 9)",
        "(line 125,col 9)-(line 125,col 38)",
        "(line 126,col 9)-(line 126,col 56)",
        "(line 127,col 9)-(line 127,col 46)",
        "(line 128,col 9)-(line 128,col 24)",
        "(line 129,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 51)",
        "(line 139,col 9)-(line 139,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.AbstractMultipleLinearRegression.newYSampleData(double[])",
      "begin_line": 149,
      "end_line": 157,
      "comment": "\n     * Loads new y sample data, overriding any previous data.\n     *\n     * @param y the array representing the y sample\n     * @throws NullArgumentException if y is null\n     * @throws NoDataException if y is empty\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 152,col 9)",
        "(line 153,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 156,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.AbstractMultipleLinearRegression.newXSampleData(double[][])",
      "begin_line": 184,
      "end_line": 205,
      "comment": "\n     * \u003cp\u003eLoads new x sample data, overriding any previous data.\n     * \u003c/p\u003e\n     * The input \u003ccode\u003ex\u003c/code\u003e array should have one row for each sample\n     * observation, with columns corresponding to independent variables.\n     * For example, if \u003cpre\u003e\n     * \u003ccode\u003e x \u003d new double[][] {{1, 2}, {3, 4}, {5, 6}} \u003c/code\u003e\u003c/pre\u003e\n     * then \u003ccode\u003esetXSampleData(x) \u003c/code\u003e results in a model with two independent\n     * variables and 3 observations:\n     * \u003cpre\u003e\n     *   x[0]  x[1]\n     *   ----------\n     *     1    2\n     *     3    4\n     *     5    6\n     * \u003c/pre\u003e\n     * \u003c/p\u003e\n     * \u003cp\u003eNote that there is no need to add an initial unitary column (column of 1\u0027s) when\n     * specifying a model including an intercept term.\n     * \u003c/p\u003e\n     * @param x the rectangular array representing the x sample\n     * @throws NullArgumentException if x is null\n     * @throws NoDataException if x is empty\n     * @throws DimensionMismatchException if x is not rectangular\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 187,col 9)",
        "(line 188,col 9)-(line 190,col 9)",
        "(line 191,col 9)-(line 204,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.AbstractMultipleLinearRegression.validateSampleData(double[][], double[])",
      "begin_line": 225,
      "end_line": 240,
      "comment": "\n     * Validates sample data.  Checks that\n     * \u003cul\u003e\u003cli\u003eNeither x nor y is null or empty;\u003c/li\u003e\n     * \u003cli\u003eThe length (i.e. number of rows) of x equals the length of y\u003c/li\u003e\n     * \u003cli\u003ex has at least one more row than it has columns (i.e. there is\n     * sufficient data to estimate regression coefficients for each of the\n     * columns in x plus an intercept.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param x the [n,k] array representing the x data\n     * @param y the [n,1] array representing the y data\n     * @throws NullArgumentException if {@code x} or {@code y} is null\n     * @throws DimensionMismatchException if {@code x} and {@code y} do not\n     * have the same length\n     * @throws NoDataException if {@code x} or {@code y} are zero-length\n     * @throws MathIllegalArgumentException if the number of rows of {@code x}\n     * is not larger than the number of columns + 1\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 228,col 9)",
        "(line 229,col 9)-(line 231,col 9)",
        "(line 232,col 9)-(line 234,col 9)",
        "(line 235,col 9)-(line 239,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.AbstractMultipleLinearRegression.validateCovarianceData(double[][], double[][])",
      "begin_line": 252,
      "end_line": 259,
      "comment": "\n     * Validates that the x data and covariance matrix have the same\n     * number of rows and that the covariance matrix is square.\n     *\n     * @param x the [n,k] array representing the x sample\n     * @param covariance the [n,n] array representing the covariance matrix\n     * @throws DimensionMismatchException if the number of rows in x is not equal\n     * to the number of rows in covariance\n     * @throws NonSquareMatrixException if the covariance matrix is not square\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 255,col 9)",
        "(line 256,col 9)-(line 258,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.AbstractMultipleLinearRegression.estimateRegressionParameters()",
      "begin_line": 264,
      "end_line": 267,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 39)",
        "(line 266,col 9)-(line 266,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.AbstractMultipleLinearRegression.estimateResiduals()",
      "begin_line": 272,
      "end_line": 276,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 39)",
        "(line 274,col 9)-(line 274,col 60)",
        "(line 275,col 9)-(line 275,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.AbstractMultipleLinearRegression.estimateRegressionParametersVariance()",
      "begin_line": 281,
      "end_line": 283,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.AbstractMultipleLinearRegression.estimateRegressionParametersStandardErrors()",
      "begin_line": 288,
      "end_line": 297,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 73)",
        "(line 290,col 9)-(line 290,col 48)",
        "(line 291,col 9)-(line 291,col 44)",
        "(line 292,col 9)-(line 292,col 45)",
        "(line 293,col 9)-(line 295,col 9)",
        "(line 296,col 9)-(line 296,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.AbstractMultipleLinearRegression.estimateRegressandVariance()",
      "begin_line": 302,
      "end_line": 304,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.AbstractMultipleLinearRegression.estimateErrorVariance()",
      "begin_line": 312,
      "end_line": 315,
      "comment": "\n     * Estimates the variance of the error.\n     *\n     * @return estimate of the error variance\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.AbstractMultipleLinearRegression.estimateRegressionStandardError()",
      "begin_line": 323,
      "end_line": 325,
      "comment": "\n     * Estimates the standard error of the regression.\n     *\n     * @return regression standard error\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.AbstractMultipleLinearRegression.calculateBeta()",
      "begin_line": 332,
      "end_line": 332,
      "comment": "\n     * Calculates the beta of multiple linear regression in matrix notation.\n     *\n     * @return beta\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.AbstractMultipleLinearRegression.calculateBetaVariance()",
      "begin_line": 340,
      "end_line": 340,
      "comment": "\n     * Calculates the beta variance of multiple linear regression in matrix\n     * notation.\n     *\n     * @return beta variance\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.AbstractMultipleLinearRegression.calculateYVariance()",
      "begin_line": 348,
      "end_line": 350,
      "comment": "\n     * Calculates the variance of the y values.\n     *\n     * @return Y variance\n     ",
      "child_ranges": [
        "(line 349,col 9)-(line 349,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.AbstractMultipleLinearRegression.calculateErrorVariance()",
      "begin_line": 363,
      "end_line": 367,
      "comment": "\n     * \u003cp\u003eCalculates the variance of the error term.\u003c/p\u003e\n     * Uses the formula \u003cpre\u003e\n     * var(u) \u003d u \u0026middot; u / (n - k)\n     * \u003c/pre\u003e\n     * where n and k are the row and column dimensions of the design\n     * matrix X.\n     *\n     * @return error variance estimate\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 52)",
        "(line 365,col 9)-(line 366,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.AbstractMultipleLinearRegression.calculateResiduals()",
      "begin_line": 379,
      "end_line": 382,
      "comment": "\n     * Calculates the residuals of multiple linear regression in matrix\n     * notation.\n     *\n     * \u003cpre\u003e\n     * u \u003d y - X * b\n     * \u003c/pre\u003e\n     *\n     * @return The residuals [n,1] matrix\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 39)",
        "(line 381,col 9)-(line 381,col 52)"
      ]
    }
  ]
}