{
  "filepath": "/tmp/Math-63b/src/main/java/org/apache/commons/math/stat/regression/OLSMultipleLinearRegression.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OLSMultipleLinearRegression",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression"
      ],
      "begin_line": 58,
      "end_line": 214,
      "comment": "\n * \u003cp\u003eImplements ordinary least squares (OLS) to estimate the parameters of a\n * multiple linear regression model.\u003c/p\u003e\n *\n * \u003cp\u003eOLS assumes the covariance matrix of the error to be diagonal and with\n * equal variance.\u003c/p\u003e\n * \u003cp\u003e\n * u ~ N(0, \u0026sigma;\u003csup\u003e2\u003c/sup\u003eI)\n * \u003c/p\u003e\n *\n * \u003cp\u003eThe regression coefficients, b, satisfy the normal equations:\n * \u003cp\u003e\n * X\u003csup\u003eT\u003c/sup\u003e X b \u003d X\u003csup\u003eT\u003c/sup\u003e y\n * \u003c/p\u003e\n *\n * \u003cp\u003eTo solve the normal equations, this implementation uses QR decomposition\n * of the X matrix. (See {@link QRDecompositionImpl} for details on the\n * decomposition algorithm.)\n * \u003c/p\u003e\n * \u003cp\u003eX\u003csup\u003eT\u003c/sup\u003eX b \u003d X\u003csup\u003eT\u003c/sup\u003e y \u003cbr/\u003e\n * (QR)\u003csup\u003eT\u003c/sup\u003e (QR) b \u003d (QR)\u003csup\u003eT\u003c/sup\u003ey \u003cbr/\u003e\n * R\u003csup\u003eT\u003c/sup\u003e (Q\u003csup\u003eT\u003c/sup\u003eQ) R b \u003d R\u003csup\u003eT\u003c/sup\u003e Q\u003csup\u003eT\u003c/sup\u003e y \u003cbr/\u003e\n * R\u003csup\u003eT\u003c/sup\u003e R b \u003d R\u003csup\u003eT\u003c/sup\u003e Q\u003csup\u003eT\u003c/sup\u003e y \u003cbr/\u003e\n * (R\u003csup\u003eT\u003c/sup\u003e)\u003csup\u003e-1\u003c/sup\u003e R\u003csup\u003eT\u003c/sup\u003e R b \u003d (R\u003csup\u003eT\u003c/sup\u003e)\u003csup\u003e-1\u003c/sup\u003e R\u003csup\u003eT\u003c/sup\u003e Q\u003csup\u003eT\u003c/sup\u003e y \u003cbr/\u003e\n * R b \u003d Q\u003csup\u003eT\u003c/sup\u003e y\n * \u003c/p\u003e\n * Given Q and R, the last equation is solved by back-substitution.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "qr"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Cached QR decomposition of X matrix "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.OLSMultipleLinearRegression.newSampleData(double[], double[][])",
      "begin_line": 72,
      "end_line": 76,
      "comment": "\n     * Loads model x and y sample data, overriding any previous sample.\n     *\n     * Computes and caches QR decomposition of the X matrix.\n     * @param y the [n,1] array representing the y sample\n     * @param x the [n,k] array representing the x sample\n     * @throws IllegalArgumentException if the x and y array data are not\n     *             compatible for the regression\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 33)",
        "(line 74,col 9)-(line 74,col 26)",
        "(line 75,col 9)-(line 75,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.OLSMultipleLinearRegression.newSampleData(double[], int, int)",
      "begin_line": 83,
      "end_line": 87,
      "comment": "\n     * {@inheritDoc}\n     *\n     * Computes and caches QR decomposition of the X matrix\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 47)",
        "(line 86,col 9)-(line 86,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.OLSMultipleLinearRegression.calculateHat()",
      "begin_line": 104,
      "end_line": 123,
      "comment": "\n     * \u003cp\u003eCompute the \"hat\" matrix.\n     * \u003c/p\u003e\n     * \u003cp\u003eThe hat matrix is defined in terms of the design matrix X\n     *  by X(X\u003csup\u003eT\u003c/sup\u003eX)\u003csup\u003e-1\u003c/sup\u003eX\u003csup\u003eT\u003c/sup\u003e\n     * \u003c/p\u003e\n     * \u003cp\u003eThe implementation here uses the QR decomposition to compute the\n     * hat matrix as Q I\u003csub\u003ep\u003c/sub\u003eQ\u003csup\u003eT\u003c/sup\u003e where I\u003csub\u003ep\u003c/sub\u003e is the\n     * p-dimensional identity matrix augmented by 0\u0027s.  This computational\n     * formula is from \"The Hat Matrix in Regression and ANOVA\",\n     * David C. Hoaglin and Roy E. Welsch,\n     * \u003ci\u003eThe American Statistician\u003c/i\u003e, Vol. 32, No. 1 (Feb., 1978), pp. 17-22.\n     *\n     * @return the hat matrix\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 33)",
        "(line 107,col 9)-(line 107,col 53)",
        "(line 108,col 9)-(line 108,col 45)",
        "(line 109,col 9)-(line 109,col 67)",
        "(line 110,col 9)-(line 110,col 48)",
        "(line 111,col 9)-(line 119,col 9)",
        "(line 122,col 9)-(line 122,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.OLSMultipleLinearRegression.calculateTotalSumOfSquares()",
      "begin_line": 130,
      "end_line": 132,
      "comment": "\n     * Returns the sum of squared deviations of Y from its mean.\n     *\n     * @return total sum of squares\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.OLSMultipleLinearRegression.calculateResidualSumOfSquares()",
      "begin_line": 139,
      "end_line": 142,
      "comment": "\n     * Returns the sum of square residuals.\n     *\n     * @return residual sum of squares\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 58)",
        "(line 141,col 9)-(line 141,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.OLSMultipleLinearRegression.calculateRSquared()",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\n     * Returns the R-Squared statistic, defined by the formula \u003cpre\u003e\n     * R\u003csup\u003e2\u003c/sup\u003e \u003d 1 - SSR / SSTO\n     * \u003c/pre\u003e\n     * where SSR is the {@link #calculateResidualSumOfSquares() sum of squared residuals}\n     * and SSTO is the {@link #calculateTotalSumOfSquares() total sum of squares}\n     *\n     * @return R-square statistic\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.OLSMultipleLinearRegression.calculateAdjustedRSquared()",
      "begin_line": 167,
      "end_line": 172,
      "comment": "\n     * Returns the adjusted R-squared statistic, defined by the formula \u003cpre\u003e\n     * R\u003csup\u003e2\u003c/sup\u003e\u003csub\u003eadj\u003c/sub\u003e \u003d 1 - [SSR (n - 1)] / [SSTO (n - p)]\n     * \u003c/pre\u003e\n     * where SSR is the {@link #calculateResidualSumOfSquares() sum of squared residuals},\n     * SSTO is the {@link #calculateTotalSumOfSquares() total sum of squares}, n is the number\n     * of observations and p is the number of parameters estimated (including the intercept).\n     *\n     * @return adjusted R-Squared statistic\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 45)",
        "(line 169,col 9)-(line 170,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.OLSMultipleLinearRegression.newXSampleData(double[][])",
      "begin_line": 179,
      "end_line": 183,
      "comment": "\n     * Loads new x sample data, overriding any previous sample\n     *\n     * @param x the [n,k] array representing the x sample\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 45)",
        "(line 182,col 9)-(line 182,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.OLSMultipleLinearRegression.calculateBeta()",
      "begin_line": 190,
      "end_line": 193,
      "comment": "\n     * Calculates regression coefficients using OLS.\n     *\n     * @return beta\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.OLSMultipleLinearRegression.calculateBetaVariance()",
      "begin_line": 206,
      "end_line": 212,
      "comment": "\n     * \u003cp\u003eCalculates the variance on the beta by OLS.\n     * \u003c/p\u003e\n     * \u003cp\u003eVar(b) \u003d (X\u003csup\u003eT\u003c/sup\u003eX)\u003csup\u003e-1\u003c/sup\u003e\n     * \u003c/p\u003e\n     * \u003cp\u003eUses QR decomposition to reduce (X\u003csup\u003eT\u003c/sup\u003eX)\u003csup\u003e-1\u003c/sup\u003e\n     * to (R\u003csup\u003eT\u003c/sup\u003eR)\u003csup\u003e-1\u003c/sup\u003e, with only the top p rows of\n     * R included, where p \u003d the length of the beta vector.\u003c/p\u003e\n     *\n     * @return The beta variance\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 39)",
        "(line 209,col 9)-(line 209,col 70)",
        "(line 210,col 9)-(line 210,col 81)",
        "(line 211,col 9)-(line 211,col 47)"
      ]
    }
  ]
}