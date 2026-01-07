{
  "filepath": "/tmp/Math-95b/src/java/org/apache/commons/math/stat/regression/GLSMultipleLinearRegression.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GLSMultipleLinearRegression",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression"
      ],
      "begin_line": 42,
      "end_line": 103,
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
      "signature": "org.apache.commons.math.stat.regression.GLSMultipleLinearRegression.newSampleData(double[], double[][], double[][])",
      "begin_line": 47,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 33)",
        "(line 49,col 9)-(line 49,col 26)",
        "(line 50,col 9)-(line 50,col 26)",
        "(line 51,col 9)-(line 51,col 46)",
        "(line 52,col 9)-(line 52,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.GLSMultipleLinearRegression.newCovarianceData(double[][])",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * Add the covariance data.\n     * \n     * @param omega the [n,n] array representing the covariance\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.GLSMultipleLinearRegression.calculateBeta()",
      "begin_line": 71,
      "end_line": 76,
      "comment": "\n     * Calculates beta by GLS.\n     * \u003cpre\u003e\n     *  b\u003d(X\u0027 Omega^-1 X)^-1X\u0027Omega^-1 y\n     * \u003c/pre\u003e\n     * @return beta\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 40)",
        "(line 73,col 9)-(line 73,col 38)",
        "(line 74,col 9)-(line 74,col 55)",
        "(line 75,col 9)-(line 75,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.GLSMultipleLinearRegression.calculateBetaVariance()",
      "begin_line": 85,
      "end_line": 88,
      "comment": "\n     * Calculates the variance on the beta by GLS.\n     * \u003cpre\u003e\n     *  Var(b)\u003d(X\u0027 Omega^-1 X)^-1\n     * \u003c/pre\u003e\n     * @return The beta variance matrix\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 79)",
        "(line 87,col 9)-(line 87,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.GLSMultipleLinearRegression.calculateYVariance()",
      "begin_line": 97,
      "end_line": 101,
      "comment": "\n     * Calculates the variance on the y by GLS.\n     * \u003cpre\u003e\n     *  Var(y)\u003dTr(u\u0027 Omega^-1 u)/(n-k)\n     * \u003c/pre\u003e\n     * @return The Y variance\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 44)",
        "(line 99,col 9)-(line 99,col 78)",
        "(line 100,col 9)-(line 100,col 75)"
      ]
    }
  ]
}