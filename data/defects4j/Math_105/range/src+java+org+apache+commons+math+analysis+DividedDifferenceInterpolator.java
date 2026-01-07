{
  "filepath": "/tmp/Math-105b/src/java/org/apache/commons/math/analysis/DividedDifferenceInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DividedDifferenceInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealInterpolator",
        "java.io.Serializable"
      ],
      "begin_line": 33,
      "end_line": 121,
      "comment": "\r\n * Implements the \u003ca href\u003d\"\r\n * \"http://mathworld.wolfram.com/NewtonsDividedDifferenceInterpolationFormula.html\"\u003e\r\n * Divided Difference Algorithm\u003c/a\u003e for interpolation of real univariate\r\n * functions. For reference, see \u003cb\u003eIntroduction to Numerical Analysis\u003c/b\u003e,\r\n * ISBN 038795452X, chapter 2.\r\n * \u003cp\u003e\r\n * The actual code of Neville\u0027s evalution is in PolynomialFunctionLagrangeForm,\r\n * this class provides an easy-to-use interface to it.\r\n *\r\n * @version $Revision$ $Date$\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " serializable version identifier "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.DividedDifferenceInterpolator.interpolate(double[], double[])",
      "begin_line": 47,
      "end_line": 76,
      "comment": "\r\n     * Computes an interpolating function for the data set.\r\n     *\r\n     * @param x the interpolating points array\r\n     * @param y the interpolating values array\r\n     * @return a function which interpolates the data set\r\n     * @throws MathException if arguments are invalid\r\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 24)",
        "(line 57,col 9)-(line 57,col 70)",
        "(line 67,col 9)-(line 67,col 35)",
        "(line 68,col 9)-(line 70,col 9)",
        "(line 71,col 9)-(line 71,col 43)",
        "(line 73,col 9)-(line 73,col 39)",
        "(line 74,col 9)-(line 74,col 51)",
        "(line 75,col 9)-(line 75,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.DividedDifferenceInterpolator.computeDividedDifference(double[], double[])",
      "begin_line": 90,
      "end_line": 120,
      "comment": "\r\n     * Returns a copy of the divided difference array.\r\n     * \u003cp\u003e \r\n     * The divided difference array is defined recursively by \u003cpre\u003e\r\n     * f[x0] \u003d f(x0)\r\n     * f[x0,x1,...,xk] \u003d (f(x1,...,xk) - f(x0,...,x[k-1])) / (xk - x0)\r\n     * \u003c/pre\u003e\u003cp\u003e\r\n     * The computational complexity is O(N^2).\r\n     *\r\n     * @return a fresh copy of the divided difference array\r\n     * @throws MathException if any abscissas coincide\r\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 20)",
        "(line 94,col 9)-(line 94,col 43)",
        "(line 96,col 9)-(line 96,col 70)",
        "(line 98,col 9)-(line 98,col 21)",
        "(line 99,col 9)-(line 99,col 32)",
        "(line 100,col 9)-(line 102,col 9)",
        "(line 104,col 9)-(line 104,col 27)",
        "(line 105,col 9)-(line 105,col 26)",
        "(line 106,col 9)-(line 117,col 9)",
        "(line 119,col 9)-(line 119,col 17)"
      ]
    }
  ]
}