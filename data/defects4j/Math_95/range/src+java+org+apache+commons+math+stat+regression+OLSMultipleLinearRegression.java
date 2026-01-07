{
  "filepath": "/tmp/Math-95b/src/java/org/apache/commons/math/stat/regression/OLSMultipleLinearRegression.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OLSMultipleLinearRegression",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression"
      ],
      "begin_line": 55,
      "end_line": 198,
      "comment": "\n * \u003cp\u003eImplements ordinary least squares (OLS) to estimate the parameters of a \n * multiple linear regression model.\u003c/p\u003e\n * \n * \u003cp\u003eOLS assumes the covariance matrix of the error to be diagonal and with\n * equal variance.\n * \u003cpre\u003e\n * u ~ N(0, sigma^2*I)\n * \u003c/pre\u003e\u003c/p\u003e\n * \n * \u003cp\u003eThe regression coefficients, b, satisfy the normal equations:\n * \u003cpre\u003e\n * X^T X b \u003d X^T y\n * \u003c/pre\u003e\u003c/p\u003e\n * \n * \u003cp\u003eTo solve the normal equations, this implementation uses QR decomposition\n * of the X matrix. (See {@link QRDecompositionImpl} for details on the\n * decomposition algorithm.)\n * \u003cpre\u003e\n * X^T X b \u003d X^T y\n * (QR)^T (QR) b \u003d (QR)^T y\n * R^T (Q^T Q) R b \u003d R^T Q^T y\n * R^T R b \u003d R^T Q^T y\n * (R^T)^{-1} R^T R b \u003d (R^T)^{-1} R^T Q^T y\n * R b \u003d Q^T y\n * \u003c/pre\u003e\n * Given Q and R, the last equation is solved by back-subsitution.\u003c/p\u003e\n * \n * @version $Revision$ $Date$\n * @since 2.0\n "
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
      "signature": "org.apache.commons.math.stat.regression.OLSMultipleLinearRegression.newSampleData(double[], double[][])",
      "begin_line": 65,
      "end_line": 69,
      "comment": "\n     * {@inheritDoc}\n     * \n     * Computes and caches QR decomposition of the X matrix.\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 33)",
        "(line 67,col 9)-(line 67,col 26)",
        "(line 68,col 9)-(line 68,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.OLSMultipleLinearRegression.newSampleData(double[], int, int)",
      "begin_line": 76,
      "end_line": 79,
      "comment": "\n     * {@inheritDoc}\n     * \n     * Computes and caches QR decomposition of the X matrix\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 47)",
        "(line 78,col 9)-(line 78,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.OLSMultipleLinearRegression.newXSampleData(double[][])",
      "begin_line": 86,
      "end_line": 89,
      "comment": "\n     * Loads new x sample data, overriding any previous sample\n     * \n     * @param x the [n,k] array representing the x sample\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 39)",
        "(line 88,col 9)-(line 88,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.OLSMultipleLinearRegression.calculateBeta()",
      "begin_line": 96,
      "end_line": 99,
      "comment": "\n     * Calculates regression coefficients using OLS.\n     * \n     * @return beta\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 98,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.OLSMultipleLinearRegression.calculateBetaVariance()",
      "begin_line": 108,
      "end_line": 111,
      "comment": "\n     * Calculates the variance on the beta by OLS.\n     * \u003cpre\u003e\n     *  Var(b)\u003d(X\u0027X)^-1\n     * \u003c/pre\u003e\n     * @return The beta variance\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 51)",
        "(line 110,col 9)-(line 110,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.OLSMultipleLinearRegression.calculateYVariance()",
      "begin_line": 121,
      "end_line": 125,
      "comment": "\n     * Calculates the variance on the Y by OLS.\n     * \u003cpre\u003e\n     *  Var(y)\u003dTr(u\u0027u)/(n-k)\n     * \u003c/pre\u003e\n     * @return The Y variance\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 44)",
        "(line 123,col 9)-(line 123,col 51)",
        "(line 124,col 9)-(line 124,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.OLSMultipleLinearRegression.solveUpperTriangular(org.apache.commons.math.linear.RealMatrixImpl, org.apache.commons.math.linear.RealMatrixImpl)",
      "begin_line": 147,
      "end_line": 170,
      "comment": "\n     * \u003cp\u003eUses back substitution to solve the system\u003c/p\u003e\n     * \n     * \u003cp\u003ecoefficients X \u003d constants\u003c/p\u003e\n     * \n     * \u003cp\u003ecoefficients must upper-triangular and constants must be a column \n     * matrix.  The solution is returned as a column matrix.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe number of columns in coefficients determines the length\n     * of the returned solution vector (column matrix).  If constants\n     * has more rows than coefficients has columns, excess rows are ignored.\n     * Similarly, extra (zero) rows in coefficients are ignored\u003c/p\u003e\n     * \n     * @param coefficients upper-triangular coefficients matrix\n     * @param constants column RHS constants matrix\n     * @return solution matrix as a column matrix\n     * \n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 152,col 9)",
        "(line 153,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 157,col 55)",
        "(line 158,col 9)-(line 158,col 49)",
        "(line 159,col 9)-(line 159,col 52)",
        "(line 160,col 9)-(line 160,col 40)",
        "(line 161,col 9)-(line 168,col 9)",
        "(line 169,col 9)-(line 169,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.OLSMultipleLinearRegression.isUpperTriangular(org.apache.commons.math.linear.RealMatrixImpl, double)",
      "begin_line": 184,
      "end_line": 197,
      "comment": "\n     * \u003cp\u003eReturns true iff m is an upper-triangular matrix.\u003c/p\u003e\n     * \n     * \u003cp\u003eMakes sure all below-diagonal elements are within epsilon of 0.\u003c/p\u003e\n     * \n     * @param m matrix to check\n     * @param epsilon maximum allowable absolute value for elements below\n     * the main diagonal\n     * \n     * @return true if m is upper-triangular; false otherwise\n     * @throws NullPointerException if m is null\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 41)",
        "(line 186,col 9)-(line 186,col 43)",
        "(line 187,col 9)-(line 187,col 40)",
        "(line 188,col 9)-(line 195,col 9)",
        "(line 196,col 9)-(line 196,col 20)"
      ]
    }
  ]
}