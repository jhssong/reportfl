{
  "filepath": "/tmp/Math-85b/src/java/org/apache/commons/math/analysis/interpolation/DividedDifferenceInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DividedDifferenceInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.interpolation.UnivariateRealInterpolator",
        "java.io.Serializable"
      ],
      "begin_line": 39,
      "end_line": 129,
      "comment": "\n * Implements the \u003ca href\u003d\"\n * \"http://mathworld.wolfram.com/NewtonsDividedDifferenceInterpolationFormula.html\"\u003e\n * Divided Difference Algorithm\u003c/a\u003e for interpolation of real univariate\n * functions. For reference, see \u003cb\u003eIntroduction to Numerical Analysis\u003c/b\u003e,\n * ISBN 038795452X, chapter 2.\n * \u003cp\u003e\n * The actual code of Neville\u0027s evaluation is in PolynomialFunctionLagrangeForm,\n * this class provides an easy-to-use interface to it.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " serializable version identifier "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.DividedDifferenceInterpolator.interpolate(double[], double[])",
      "begin_line": 53,
      "end_line": 82,
      "comment": "\n     * Computes an interpolating function for the data set.\n     *\n     * @param x the interpolating points array\n     * @param y the interpolating values array\n     * @return a function which interpolates the data set\n     * @throws DuplicateSampleAbscissaException if arguments are invalid\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 24)",
        "(line 63,col 9)-(line 63,col 70)",
        "(line 73,col 9)-(line 73,col 35)",
        "(line 74,col 9)-(line 76,col 9)",
        "(line 77,col 9)-(line 77,col 43)",
        "(line 79,col 9)-(line 79,col 39)",
        "(line 80,col 9)-(line 80,col 51)",
        "(line 81,col 9)-(line 81,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.DividedDifferenceInterpolator.computeDividedDifference(double[], double[])",
      "begin_line": 99,
      "end_line": 128,
      "comment": "\n     * Returns a copy of the divided difference array.\n     * \u003cp\u003e \n     * The divided difference array is defined recursively by \u003cpre\u003e\n     * f[x0] \u003d f(x0)\n     * f[x0,x1,...,xk] \u003d (f(x1,...,xk) - f(x0,...,x[k-1])) / (xk - x0)\n     * \u003c/pre\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * The computational complexity is O(N^2).\u003c/p\u003e\n     *\n     * @param x the interpolating points array\n     * @param y the interpolating values array\n     * @return a fresh copy of the divided difference array\n     * @throws DuplicateSampleAbscissaException if any abscissas coincide\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 20)",
        "(line 103,col 9)-(line 103,col 43)",
        "(line 105,col 9)-(line 105,col 70)",
        "(line 107,col 9)-(line 107,col 21)",
        "(line 108,col 9)-(line 108,col 32)",
        "(line 109,col 9)-(line 111,col 9)",
        "(line 113,col 9)-(line 113,col 27)",
        "(line 114,col 9)-(line 114,col 26)",
        "(line 115,col 9)-(line 125,col 9)",
        "(line 127,col 9)-(line 127,col 17)"
      ]
    }
  ]
}