{
  "filepath": "/tmp/Math-97b/src/java/org/apache/commons/math/stat/regression/OLSMultipleLinearRegression.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OLSMultipleLinearRegression",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression"
      ],
      "begin_line": 41,
      "end_line": 90,
      "comment": "\n * The OLS implementation of the multiple linear regression.\n * \n * OLS assumes the covariance matrix of the error to be diagonal and with equal variance.\n * \u003cpre\u003e\n * u ~ N(0, sigma^2*I)\n * \u003c/pre\u003e\n * \n * Estimated by OLS, \n * \u003cpre\u003e\n * b\u003d(X\u0027X)^-1X\u0027y\n * \u003c/pre\u003e\n * whose variance is\n * \u003cpre\u003e\n * Var(b)\u003dMSE*(X\u0027X)^-1, MSE\u003du\u0027u/(n-k)\n * \u003c/pre\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.OLSMultipleLinearRegression.addData(double[], double[][], double[][])",
      "begin_line": 46,
      "end_line": 50,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 33)",
        "(line 48,col 9)-(line 48,col 26)",
        "(line 49,col 9)-(line 49,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.OLSMultipleLinearRegression.calculateBeta()",
      "begin_line": 59,
      "end_line": 62,
      "comment": "\n     * Calculates beta by OLS.\n     * \u003cpre\u003e\n     * b\u003d(X\u0027X)^-1X\u0027y\n     * \u003c/pre\u003e \n     * @return beta\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 51)",
        "(line 61,col 9)-(line 61,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.OLSMultipleLinearRegression.calculateBetaVariance()",
      "begin_line": 71,
      "end_line": 74,
      "comment": "\n     * Calculates the variance on the beta by OLS.\n     * \u003cpre\u003e\n     *  Var(b)\u003d(X\u0027X)^-1\n     * \u003c/pre\u003e\n     * @return The beta variance\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 51)",
        "(line 73,col 9)-(line 73,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.OLSMultipleLinearRegression.calculateYVariance()",
      "begin_line": 84,
      "end_line": 88,
      "comment": "\n     * Calculates the variance on the Y by OLS.\n     * \u003cpre\u003e\n     *  Var(y)\u003dTr(u\u0027u)/(n-k)\n     * \u003c/pre\u003e\n     * @return The Y variance\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 44)",
        "(line 86,col 9)-(line 86,col 51)",
        "(line 87,col 9)-(line 87,col 75)"
      ]
    }
  ]
}