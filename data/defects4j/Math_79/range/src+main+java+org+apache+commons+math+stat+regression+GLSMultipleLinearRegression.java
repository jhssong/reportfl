{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/stat/regression/GLSMultipleLinearRegression.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GLSMultipleLinearRegression",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.regression.AbstractMultipleLinearRegression"
      ],
      "begin_line": 44,
      "end_line": 131,
      "comment": "\n * The GLS implementation of the multiple linear regression.\n *\n * GLS assumes a general covariance matrix Omega of the error\n * \u003cpre\u003e\n * u ~ N(0, Omega)\n * \u003c/pre\u003e\n *\n * Estimated by GLS,\n * \u003cpre\u003e\n * b\u003d(X\u0027 Omega^-1 X)^-1X\u0027Omega^-1 y\n * \u003c/pre\u003e\n * whose variance is\n * \u003cpre\u003e\n * Var(b)\u003d(X\u0027 Omega^-1 X)^-1\n * \u003c/pre\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "Omega"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Covariance matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "OmegaInverse"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Inverse of covariance matrix. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.GLSMultipleLinearRegression.newSampleData(double[], double[][], double[][])",
      "begin_line": 57,
      "end_line": 63,
      "comment": " Replace sample data, overriding any previous sample.\n     * @param y y values of the sample\n     * @param x x values of the sample\n     * @param covariance array representing the covariance matrix\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 33)",
        "(line 59,col 9)-(line 59,col 26)",
        "(line 60,col 9)-(line 60,col 26)",
        "(line 61,col 9)-(line 61,col 46)",
        "(line 62,col 9)-(line 62,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.GLSMultipleLinearRegression.newCovarianceData(double[][])",
      "begin_line": 70,
      "end_line": 73,
      "comment": "\n     * Add the covariance data.\n     *\n     * @param omega the [n,n] array representing the covariance\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 53)",
        "(line 72,col 9)-(line 72,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.GLSMultipleLinearRegression.getOmegaInverse()",
      "begin_line": 80,
      "end_line": 85,
      "comment": "\n     * Get the inverse of the covariance.\n     * \u003cp\u003eThe inverse of the covariance matrix is lazily evaluated and cached.\u003c/p\u003e\n     * @return inverse of the covariance\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 84,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.GLSMultipleLinearRegression.calculateBeta()",
      "begin_line": 94,
      "end_line": 101,
      "comment": "\n     * Calculates beta by GLS.\n     * \u003cpre\u003e\n     *  b\u003d(X\u0027 Omega^-1 X)^-1X\u0027Omega^-1 y\n     * \u003c/pre\u003e\n     * @return beta\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 42)",
        "(line 97,col 9)-(line 97,col 38)",
        "(line 98,col 9)-(line 98,col 55)",
        "(line 99,col 9)-(line 99,col 85)",
        "(line 100,col 9)-(line 100,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.GLSMultipleLinearRegression.calculateBetaVariance()",
      "begin_line": 110,
      "end_line": 115,
      "comment": "\n     * Calculates the variance on the beta by GLS.\n     * \u003cpre\u003e\n     *  Var(b)\u003d(X\u0027 Omega^-1 X)^-1\n     * \u003c/pre\u003e\n     * @return The beta variance matrix\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 42)",
        "(line 113,col 9)-(line 113,col 66)",
        "(line 114,col 9)-(line 114,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.GLSMultipleLinearRegression.calculateYVariance()",
      "begin_line": 124,
      "end_line": 129,
      "comment": "\n     * Calculates the variance on the y by GLS.\n     * \u003cpre\u003e\n     *  Var(y)\u003dTr(u\u0027 Omega^-1 u)/(n-k)\n     * \u003c/pre\u003e\n     * @return The Y variance\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 52)",
        "(line 127,col 9)-(line 127,col 78)",
        "(line 128,col 9)-(line 128,col 66)"
      ]
    }
  ]
}