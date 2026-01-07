{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/stat/regression/GLSMultipleLinearRegression.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GLSMultipleLinearRegression",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.stat.regression.AbstractMultipleLinearRegression"
      ],
      "begin_line": 43,
      "end_line": 136,
      "comment": "\n * The GLS implementation of the multiple linear regression.\n *\n * GLS assumes a general covariance matrix Omega of the error\n * \u003cpre\u003e\n * u ~ N(0, Omega)\n * \u003c/pre\u003e\n *\n * Estimated by GLS,\n * \u003cpre\u003e\n * b\u003d(X\u0027 Omega^-1 X)^-1X\u0027Omega^-1 y\n * \u003c/pre\u003e\n * whose variance is\n * \u003cpre\u003e\n * Var(b)\u003d(X\u0027 Omega^-1 X)^-1\n * \u003c/pre\u003e\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "Omega"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Covariance matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "OmegaInverse"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Inverse of covariance matrix. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.GLSMultipleLinearRegression.newSampleData(double[], double[][], double[][])",
      "begin_line": 56,
      "end_line": 62,
      "comment": " Replace sample data, overriding any previous sample.\n     * @param y y values of the sample\n     * @param x x values of the sample\n     * @param covariance array representing the covariance matrix\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 33)",
        "(line 58,col 9)-(line 58,col 26)",
        "(line 59,col 9)-(line 59,col 26)",
        "(line 60,col 9)-(line 60,col 46)",
        "(line 61,col 9)-(line 61,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.GLSMultipleLinearRegression.newCovarianceData(double[][])",
      "begin_line": 69,
      "end_line": 72,
      "comment": "\n     * Add the covariance data.\n     *\n     * @param omega the [n,n] array representing the covariance\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 53)",
        "(line 71,col 9)-(line 71,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.GLSMultipleLinearRegression.getOmegaInverse()",
      "begin_line": 79,
      "end_line": 84,
      "comment": "\n     * Get the inverse of the covariance.\n     * \u003cp\u003eThe inverse of the covariance matrix is lazily evaluated and cached.\u003c/p\u003e\n     * @return inverse of the covariance\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 82,col 9)",
        "(line 83,col 9)-(line 83,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.GLSMultipleLinearRegression.calculateBeta()",
      "begin_line": 93,
      "end_line": 100,
      "comment": "\n     * Calculates beta by GLS.\n     * \u003cpre\u003e\n     *  b\u003d(X\u0027 Omega^-1 X)^-1X\u0027Omega^-1 y\n     * \u003c/pre\u003e\n     * @return beta\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 42)",
        "(line 96,col 9)-(line 96,col 43)",
        "(line 97,col 9)-(line 97,col 60)",
        "(line 98,col 9)-(line 98,col 81)",
        "(line 99,col 9)-(line 99,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.GLSMultipleLinearRegression.calculateBetaVariance()",
      "begin_line": 109,
      "end_line": 114,
      "comment": "\n     * Calculates the variance on the beta.\n     * \u003cpre\u003e\n     *  Var(b)\u003d(X\u0027 Omega^-1 X)^-1\n     * \u003c/pre\u003e\n     * @return The beta variance matrix\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 42)",
        "(line 112,col 9)-(line 112,col 76)",
        "(line 113,col 9)-(line 113,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.GLSMultipleLinearRegression.calculateErrorVariance()",
      "begin_line": 128,
      "end_line": 134,
      "comment": "\n     * Calculates the estimated variance of the error term using the formula\n     * \u003cpre\u003e\n     *  Var(u) \u003d Tr(u\u0027 Omega^-1 u)/(n-k)\n     * \u003c/pre\u003e\n     * where n and k are the row and column dimensions of the design\n     * matrix X.\n     *\n     * @return error variance\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 52)",
        "(line 131,col 9)-(line 131,col 78)",
        "(line 132,col 9)-(line 132,col 76)"
      ]
    }
  ]
}