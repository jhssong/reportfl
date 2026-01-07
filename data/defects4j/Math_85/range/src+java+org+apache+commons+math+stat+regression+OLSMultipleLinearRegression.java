{
  "filepath": "/tmp/Math-85b/src/java/org/apache/commons/math/stat/regression/OLSMultipleLinearRegression.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OLSMultipleLinearRegression",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression"
      ],
      "begin_line": 59,
      "end_line": 242,
      "comment": "\n * \u003cp\u003eImplements ordinary least squares (OLS) to estimate the parameters of a \n * multiple linear regression model.\u003c/p\u003e\n * \n * \u003cp\u003eOLS assumes the covariance matrix of the error to be diagonal and with\n * equal variance.\u003c/p\u003e\n * \u003cp\u003e\n * u ~ N(0, \u0026sigma;\u003csup\u003e2\u003c/sup\u003eI)\n * \u003c/p\u003e\n * \n * \u003cp\u003eThe regression coefficients, b, satisfy the normal equations:\n * \u003cp\u003e\n * X\u003csup\u003eT\u003c/sup\u003e X b \u003d X\u003csup\u003eT\u003c/sup\u003e y\n * \u003c/p\u003e\n * \n * \u003cp\u003eTo solve the normal equations, this implementation uses QR decomposition\n * of the X matrix. (See {@link QRDecompositionImpl} for details on the\n * decomposition algorithm.)\n * \u003c/p\u003e\n * \u003cp\u003eX\u003csup\u003eT\u003c/sup\u003eX b \u003d X\u003csup\u003eT\u003c/sup\u003e y \u003cbr/\u003e\n * (QR)\u003csup\u003eT\u003c/sup\u003e (QR) b \u003d (QR)\u003csup\u003eT\u003c/sup\u003ey \u003cbr/\u003e\n * R\u003csup\u003eT\u003c/sup\u003e (Q\u003csup\u003eT\u003c/sup\u003eQ) R b \u003d R\u003csup\u003eT\u003c/sup\u003e Q\u003csup\u003eT\u003c/sup\u003e y \u003cbr/\u003e\n * R\u003csup\u003eT\u003c/sup\u003e R b \u003d R\u003csup\u003eT\u003c/sup\u003e Q\u003csup\u003eT\u003c/sup\u003e y \u003cbr/\u003e\n * (R\u003csup\u003eT\u003c/sup\u003e)\u003csup\u003e-1\u003c/sup\u003e R\u003csup\u003eT\u003c/sup\u003e R b \u003d (R\u003csup\u003eT\u003c/sup\u003e)\u003csup\u003e-1\u003c/sup\u003e R\u003csup\u003eT\u003c/sup\u003e Q\u003csup\u003eT\u003c/sup\u003e y \u003cbr/\u003e\n * R b \u003d Q\u003csup\u003eT\u003c/sup\u003e y\n * \u003c/p\u003e\n * Given Q and R, the last equation is solved by back-subsitution.\u003c/p\u003e\n * \n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "qr"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Cached QR decomposition of X matrix "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.OLSMultipleLinearRegression.newSampleData(double[], double[][])",
      "begin_line": 73,
      "end_line": 77,
      "comment": "\n     * Loads model x and y sample data, overriding any previous sample.\n     * \n     * Computes and caches QR decomposition of the X matrix.\n     * @param y the [n,1] array representing the y sample\n     * @param x the [n,k] array representing the x sample\n     * @throws IllegalArgumentException if the x and y array data are not\n     *             compatible for the regression\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 33)",
        "(line 75,col 9)-(line 75,col 26)",
        "(line 76,col 9)-(line 76,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.OLSMultipleLinearRegression.newSampleData(double[], int, int)",
      "begin_line": 84,
      "end_line": 88,
      "comment": "\n     * {@inheritDoc}\n     * \n     * Computes and caches QR decomposition of the X matrix\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 47)",
        "(line 87,col 9)-(line 87,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.OLSMultipleLinearRegression.calculateHat()",
      "begin_line": 105,
      "end_line": 124,
      "comment": "\n     * \u003cp\u003eCompute the \"hat\" matrix.\n     * \u003c/p\u003e\n     * \u003cp\u003eThe hat matrix is defined in terms of the design matrix X\n     *  by X(X\u003csup\u003eT\u003c/sup\u003eX)\u003csup\u003e-1\u003c/sup\u003eX\u003csup\u003eT\u003c/sup\u003e\n     * \u003c/p\u003e\n     * \u003cp\u003eThe implementation here uses the QR decomposition to compute the\n     * hat matrix as Q I\u003csub\u003ep\u003c/sub\u003eQ\u003csup\u003eT\u003c/sup\u003e where I\u003csub\u003ep\u003c/sub\u003e is the\n     * p-dimensional identity matrix augmented by 0\u0027s.  This computational\n     * formula is from \"The Hat Matrix in Regression and ANOVA\",\n     * David C. Hoaglin and Roy E. Welsch, \n     * \u003ci\u003eThe American Statistician\u003c/i\u003e, Vol. 32, No. 1 (Feb., 1978), pp. 17-22.\n     * \n     * @return the hat matrix\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 33)",
        "(line 108,col 9)-(line 108,col 53)",
        "(line 109,col 9)-(line 109,col 45)",
        "(line 110,col 9)-(line 110,col 67)",
        "(line 111,col 9)-(line 111,col 48)",
        "(line 112,col 9)-(line 120,col 9)",
        "(line 123,col 9)-(line 123,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.OLSMultipleLinearRegression.newXSampleData(double[][])",
      "begin_line": 131,
      "end_line": 135,
      "comment": "\n     * Loads new x sample data, overriding any previous sample\n     * \n     * @param x the [n,k] array representing the x sample\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 45)",
        "(line 134,col 9)-(line 134,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.OLSMultipleLinearRegression.calculateBeta()",
      "begin_line": 142,
      "end_line": 145,
      "comment": "\n     * Calculates regression coefficients using OLS.\n     * \n     * @return beta\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.OLSMultipleLinearRegression.calculateBetaVariance()",
      "begin_line": 158,
      "end_line": 164,
      "comment": "\n     * \u003cp\u003eCalculates the variance on the beta by OLS.\n     * \u003c/p\u003e\n     * \u003cp\u003eVar(b) \u003d (X\u003csup\u003eT\u003c/sup\u003eX)\u003csup\u003e-1\u003c/sup\u003e\n     * \u003c/p\u003e\n     * \u003cp\u003eUses QR decomposition to reduce (X\u003csup\u003eT\u003c/sup\u003eX)\u003csup\u003e-1\u003c/sup\u003e\n     * to (R\u003csup\u003eT\u003c/sup\u003eR)\u003csup\u003e-1\u003c/sup\u003e, with only the top p rows of\n     * R included, where p \u003d the length of the beta vector.\u003c/p\u003e \n     * \n     * @return The beta variance\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 39)",
        "(line 161,col 9)-(line 161,col 70)",
        "(line 162,col 9)-(line 162,col 81)",
        "(line 163,col 9)-(line 163,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.OLSMultipleLinearRegression.calculateYVariance()",
      "begin_line": 174,
      "end_line": 179,
      "comment": "\n     * \u003cp\u003eCalculates the variance on the Y by OLS.\n     * \u003c/p\u003e\n     * \u003cp\u003e Var(y) \u003d Tr(u\u003csup\u003eT\u003c/sup\u003eu)/(n - k)\n     * \u003c/p\u003e\n     * @return The Y variance\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 52)",
        "(line 177,col 9)-(line 178,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.OLSMultipleLinearRegression.solveUpperTriangular(org.apache.commons.math.linear.RealMatrix, org.apache.commons.math.linear.RealVector)",
      "begin_line": 201,
      "end_line": 215,
      "comment": "\n     * \u003cp\u003eUses back substitution to solve the system\u003c/p\u003e\n     * \n     * \u003cp\u003ecoefficients X \u003d constants\u003c/p\u003e\n     * \n     * \u003cp\u003ecoefficients must upper-triangular and constants must be a column \n     * matrix.  The solution is returned as a column matrix.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe number of columns in coefficients determines the length\n     * of the returned solution vector (column matrix).  If constants\n     * has more rows than coefficients has columns, excess rows are ignored.\n     * Similarly, extra (zero) rows in coefficients are ignored\u003c/p\u003e\n     * \n     * @param coefficients upper-triangular coefficients matrix\n     * @param constants column RHS constants vector\n     * @return solution matrix as a column vector\n     * \n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 50)",
        "(line 204,col 9)-(line 204,col 55)",
        "(line 205,col 9)-(line 205,col 40)",
        "(line 206,col 9)-(line 213,col 9)",
        "(line 214,col 9)-(line 214,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.OLSMultipleLinearRegression.checkUpperTriangular(org.apache.commons.math.linear.RealMatrix, double)",
      "begin_line": 228,
      "end_line": 241,
      "comment": "\n     * \u003cp\u003eCheck if a matrix is upper-triangular.\u003c/p\u003e\n     * \n     * \u003cp\u003eMakes sure all below-diagonal elements are within epsilon of 0.\u003c/p\u003e\n     * \n     * @param m matrix to check\n     * @param epsilon maximum allowable absolute value for elements below\n     * the main diagonal\n     * \n     * @throws IllegalArgumentException if m is not upper-triangular\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 43)",
        "(line 230,col 9)-(line 230,col 40)",
        "(line 231,col 9)-(line 240,col 9)"
      ]
    }
  ]
}