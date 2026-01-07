{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/stat/regression/OLSMultipleLinearRegression.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OLSMultipleLinearRegression",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.stat.regression.AbstractMultipleLinearRegression"
      ],
      "begin_line": 55,
      "end_line": 254,
      "comment": "\n * \u003cp\u003eImplements ordinary least squares (OLS) to estimate the parameters of a\n * multiple linear regression model.\u003c/p\u003e\n *\n * \u003cp\u003eThe regression coefficients, \u003ccode\u003eb\u003c/code\u003e, satisfy the normal equations:\n * \u003cpre\u003e\u003ccode\u003e X\u003csup\u003eT\u003c/sup\u003e X b \u003d X\u003csup\u003eT\u003c/sup\u003e y \u003c/code\u003e\u003c/pre\u003e\u003c/p\u003e\n *\n * \u003cp\u003eTo solve the normal equations, this implementation uses QR decomposition\n * of the \u003ccode\u003eX\u003c/code\u003e matrix. (See {@link QRDecomposition} for details on the\n * decomposition algorithm.) The \u003ccode\u003eX\u003c/code\u003e matrix, also known as the \u003ci\u003edesign matrix,\u003c/i\u003e\n * has rows corresponding to sample observations and columns corresponding to independent\n * variables.  When the model is estimated using an intercept term (i.e. when\n * {@link #isNoIntercept() isNoIntercept} is false as it is by default), the \u003ccode\u003eX\u003c/code\u003e\n * matrix includes an initial column identically equal to 1.  We solve the normal equations\n * as follows:\n * \u003cpre\u003e\u003ccode\u003e X\u003csup\u003eT\u003c/sup\u003eX b \u003d X\u003csup\u003eT\u003c/sup\u003e y\n * (QR)\u003csup\u003eT\u003c/sup\u003e (QR) b \u003d (QR)\u003csup\u003eT\u003c/sup\u003ey\n * R\u003csup\u003eT\u003c/sup\u003e (Q\u003csup\u003eT\u003c/sup\u003eQ) R b \u003d R\u003csup\u003eT\u003c/sup\u003e Q\u003csup\u003eT\u003c/sup\u003e y\n * R\u003csup\u003eT\u003c/sup\u003e R b \u003d R\u003csup\u003eT\u003c/sup\u003e Q\u003csup\u003eT\u003c/sup\u003e y\n * (R\u003csup\u003eT\u003c/sup\u003e)\u003csup\u003e-1\u003c/sup\u003e R\u003csup\u003eT\u003c/sup\u003e R b \u003d (R\u003csup\u003eT\u003c/sup\u003e)\u003csup\u003e-1\u003c/sup\u003e R\u003csup\u003eT\u003c/sup\u003e Q\u003csup\u003eT\u003c/sup\u003e y\n * R b \u003d Q\u003csup\u003eT\u003c/sup\u003e y \u003c/code\u003e\u003c/pre\u003e\u003c/p\u003e\n *\n * \u003cp\u003eGiven \u003ccode\u003eQ\u003c/code\u003e and \u003ccode\u003eR\u003c/code\u003e, the last equation is solved by back-substitution.\u003c/p\u003e\n *\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "qr"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Cached QR decomposition of X matrix "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.OLSMultipleLinearRegression.newSampleData(double[], double[][])",
      "begin_line": 69,
      "end_line": 73,
      "comment": "\n     * Loads model x and y sample data, overriding any previous sample.\n     *\n     * Computes and caches QR decomposition of the X matrix.\n     * @param y the [n,1] array representing the y sample\n     * @param x the [n,k] array representing the x sample\n     * @throws MathIllegalArgumentException if the x and y array data are not\n     *             compatible for the regression\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 33)",
        "(line 71,col 9)-(line 71,col 26)",
        "(line 72,col 9)-(line 72,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.OLSMultipleLinearRegression.newSampleData(double[], int, int)",
      "begin_line": 79,
      "end_line": 83,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003eThis implementation computes and caches the QR decomposition of the X matrix.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 47)",
        "(line 82,col 9)-(line 82,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.OLSMultipleLinearRegression.calculateHat()",
      "begin_line": 104,
      "end_line": 125,
      "comment": "\n     * \u003cp\u003eCompute the \"hat\" matrix.\n     * \u003c/p\u003e\n     * \u003cp\u003eThe hat matrix is defined in terms of the design matrix X\n     *  by X(X\u003csup\u003eT\u003c/sup\u003eX)\u003csup\u003e-1\u003c/sup\u003eX\u003csup\u003eT\u003c/sup\u003e\n     * \u003c/p\u003e\n     * \u003cp\u003eThe implementation here uses the QR decomposition to compute the\n     * hat matrix as Q I\u003csub\u003ep\u003c/sub\u003eQ\u003csup\u003eT\u003c/sup\u003e where I\u003csub\u003ep\u003c/sub\u003e is the\n     * p-dimensional identity matrix augmented by 0\u0027s.  This computational\n     * formula is from \"The Hat Matrix in Regression and ANOVA\",\n     * David C. Hoaglin and Roy E. Welsch,\n     * \u003ci\u003eThe American Statistician\u003c/i\u003e, Vol. 32, No. 1 (Feb., 1978), pp. 17-22.\n     * \u003c/p\u003e\n     * \u003cp\u003eData for the model must have been successfully loaded using one of\n     * the {@code newSampleData} methods before invoking this method; otherwise\n     * a {@code NullPointerException} will be thrown.\u003c/p\u003e\n     *\n     * @return the hat matrix\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 33)",
        "(line 107,col 9)-(line 107,col 53)",
        "(line 108,col 9)-(line 108,col 45)",
        "(line 110,col 9)-(line 110,col 67)",
        "(line 111,col 9)-(line 111,col 48)",
        "(line 112,col 9)-(line 120,col 9)",
        "(line 124,col 9)-(line 124,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.OLSMultipleLinearRegression.calculateTotalSumOfSquares()",
      "begin_line": 142,
      "end_line": 148,
      "comment": "\n     * \u003cp\u003eReturns the sum of squared deviations of Y from its mean.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the model has no intercept term, \u003ccode\u003e0\u003c/code\u003e is used for the\n     * mean of Y - i.e., what is returned is the sum of the squared Y values.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe value returned by this method is the SSTO value used in\n     * the {@link #calculateRSquared() R-squared} computation.\u003c/p\u003e\n     *\n     * @return SSTO - the total sum of squares\n     * @throws MathIllegalArgumentException if the sample has not been set or does\n     * not contain at least 3 observations\n     * @see #isNoIntercept()\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 147,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.OLSMultipleLinearRegression.calculateResidualSumOfSquares()",
      "begin_line": 156,
      "end_line": 160,
      "comment": "\n     * Returns the sum of squared residuals.\n     *\n     * @return residual sum of squares\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 58)",
        "(line 159,col 9)-(line 159,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.OLSMultipleLinearRegression.calculateRSquared()",
      "begin_line": 174,
      "end_line": 176,
      "comment": "\n     * Returns the R-Squared statistic, defined by the formula \u003cpre\u003e\n     * R\u003csup\u003e2\u003c/sup\u003e \u003d 1 - SSR / SSTO\n     * \u003c/pre\u003e\n     * where SSR is the {@link #calculateResidualSumOfSquares() sum of squared residuals}\n     * and SSTO is the {@link #calculateTotalSumOfSquares() total sum of squares}\n     *\n     * @return R-square statistic\n     * @throws MathIllegalArgumentException if the sample has not been set or does\n     * not contain at least 3 observations\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.OLSMultipleLinearRegression.calculateAdjustedRSquared()",
      "begin_line": 196,
      "end_line": 204,
      "comment": "\n     * \u003cp\u003eReturns the adjusted R-squared statistic, defined by the formula \u003cpre\u003e\n     * R\u003csup\u003e2\u003c/sup\u003e\u003csub\u003eadj\u003c/sub\u003e \u003d 1 - [SSR (n - 1)] / [SSTO (n - p)]\n     * \u003c/pre\u003e\n     * where SSR is the {@link #calculateResidualSumOfSquares() sum of squared residuals},\n     * SSTO is the {@link #calculateTotalSumOfSquares() total sum of squares}, n is the number\n     * of observations and p is the number of parameters estimated (including the intercept).\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the regression is estimated without an intercept term, what is returned is \u003cpre\u003e\n     * \u003ccode\u003e 1 - (1 - {@link #calculateRSquared()}) * (n / (n - p)) \u003c/code\u003e\n     * \u003c/pre\u003e\u003c/p\u003e\n     *\n     * @return adjusted R-Squared statistic\n     * @throws MathIllegalArgumentException if the sample has not been set or does\n     * not contain at least 3 observations\n     * @see #isNoIntercept()\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 50)",
        "(line 198,col 9)-(line 203,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.OLSMultipleLinearRegression.newXSampleData(double[][])",
      "begin_line": 211,
      "end_line": 215,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003eThis implementation computes and caches the QR decomposition of the X matrix\n     * once it is successfully loaded.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 32)",
        "(line 214,col 9)-(line 214,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.OLSMultipleLinearRegression.calculateBeta()",
      "begin_line": 226,
      "end_line": 229,
      "comment": "\n     * Calculates the regression coefficients using OLS.\n     *\n     * \u003cp\u003eData for the model must have been successfully loaded using one of\n     * the {@code newSampleData} methods before invoking this method; otherwise\n     * a {@code NullPointerException} will be thrown.\u003c/p\u003e\n     *\n     * @return beta\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.OLSMultipleLinearRegression.calculateBetaVariance()",
      "begin_line": 246,
      "end_line": 252,
      "comment": "\n     * \u003cp\u003eCalculates the variance-covariance matrix of the regression parameters.\n     * \u003c/p\u003e\n     * \u003cp\u003eVar(b) \u003d (X\u003csup\u003eT\u003c/sup\u003eX)\u003csup\u003e-1\u003c/sup\u003e\n     * \u003c/p\u003e\n     * \u003cp\u003eUses QR decomposition to reduce (X\u003csup\u003eT\u003c/sup\u003eX)\u003csup\u003e-1\u003c/sup\u003e\n     * to (R\u003csup\u003eT\u003c/sup\u003eR)\u003csup\u003e-1\u003c/sup\u003e, with only the top p rows of\n     * R included, where p \u003d the length of the beta vector.\u003c/p\u003e\n     *\n     * \u003cp\u003eData for the model must have been successfully loaded using one of\n     * the {@code newSampleData} methods before invoking this method; otherwise\n     * a {@code NullPointerException} will be thrown.\u003c/p\u003e\n     *\n     * @return The beta variance-covariance matrix\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 44)",
        "(line 249,col 9)-(line 249,col 70)",
        "(line 250,col 9)-(line 250,col 77)",
        "(line 251,col 9)-(line 251,col 47)"
      ]
    }
  ]
}