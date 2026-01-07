{
  "filepath": "/tmp/Math-98b/src/java/org/apache/commons/math/stat/regression/GLSMultipleLinearRegression.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GLSMultipleLinearRegression",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression"
      ],
      "begin_line": 42,
      "end_line": 106,
      "comment": "\n * The GLS implementation of the multiple linear regression.\n * \n * GLS assumes a general covariance matrix Omega of the error\n * \u003cpre\u003e\n * u ~ N(0, Omega)\n * \u003c/pre\u003e\n * \n * Estimated by GLS, \n * \u003cpre\u003e\n * b\u003d(X\u0027 Omega^-1 X)^-1X\u0027Omega^-1 y\n * \u003c/pre\u003e\n * whose variance is\n * \u003cpre\u003e\n * Var(b)\u003d(X\u0027 Omega^-1 X)^-1\n * \u003c/pre\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "Omega"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Covariance matrix. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.GLSMultipleLinearRegression.addData(double[], double[][], double[][])",
      "begin_line": 50,
      "end_line": 56,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 33)",
        "(line 52,col 9)-(line 52,col 26)",
        "(line 53,col 9)-(line 53,col 26)",
        "(line 54,col 9)-(line 54,col 46)",
        "(line 55,col 9)-(line 55,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.GLSMultipleLinearRegression.addCovarianceData(double[][])",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * Add the covariance data.\n     * \n     * @param omega the [n,n] array representing the covariance\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.GLSMultipleLinearRegression.calculateBeta()",
      "begin_line": 74,
      "end_line": 79,
      "comment": "\n     * Calculates beta by GLS.\n     * \u003cpre\u003e\n     *  b\u003d(X\u0027 Omega^-1 X)^-1X\u0027Omega^-1 y\n     * \u003c/pre\u003e\n     * @return beta\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 40)",
        "(line 76,col 9)-(line 76,col 38)",
        "(line 77,col 9)-(line 77,col 55)",
        "(line 78,col 9)-(line 78,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.GLSMultipleLinearRegression.calculateBetaVariance()",
      "begin_line": 88,
      "end_line": 91,
      "comment": "\n     * Calculates the variance on the beta by GLS.\n     * \u003cpre\u003e\n     *  Var(b)\u003d(X\u0027 Omega^-1 X)^-1\n     * \u003c/pre\u003e\n     * @return The beta variance matrix\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 79)",
        "(line 90,col 9)-(line 90,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.GLSMultipleLinearRegression.calculateYVariance()",
      "begin_line": 100,
      "end_line": 104,
      "comment": "\n     * Calculates the variance on the y by GLS.\n     * \u003cpre\u003e\n     *  Var(y)\u003dTr(u\u0027 Omega^-1 u)/(n-k)\n     * \u003c/pre\u003e\n     * @return The Y variance\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 44)",
        "(line 102,col 9)-(line 102,col 78)",
        "(line 103,col 9)-(line 103,col 75)"
      ]
    }
  ]
}