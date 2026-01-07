{
  "filepath": "/tmp/Math-95b/src/java/org/apache/commons/math/analysis/DividedDifferenceInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DividedDifferenceInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealInterpolator",
        "java.io.Serializable"
      ],
      "begin_line": 36,
      "end_line": 126,
      "comment": "\n * Implements the \u003ca href\u003d\"\n * \"http://mathworld.wolfram.com/NewtonsDividedDifferenceInterpolationFormula.html\"\u003e\n * Divided Difference Algorithm\u003c/a\u003e for interpolation of real univariate\n * functions. For reference, see \u003cb\u003eIntroduction to Numerical Analysis\u003c/b\u003e,\n * ISBN 038795452X, chapter 2.\n * \u003cp\u003e\n * The actual code of Neville\u0027s evaluation is in PolynomialFunctionLagrangeForm,\n * this class provides an easy-to-use interface to it.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " serializable version identifier "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.DividedDifferenceInterpolator.interpolate(double[], double[])",
      "begin_line": 50,
      "end_line": 79,
      "comment": "\n     * Computes an interpolating function for the data set.\n     *\n     * @param x the interpolating points array\n     * @param y the interpolating values array\n     * @return a function which interpolates the data set\n     * @throws DuplicateSampleAbscissaException if arguments are invalid\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 24)",
        "(line 60,col 9)-(line 60,col 70)",
        "(line 70,col 9)-(line 70,col 35)",
        "(line 71,col 9)-(line 73,col 9)",
        "(line 74,col 9)-(line 74,col 43)",
        "(line 76,col 9)-(line 76,col 39)",
        "(line 77,col 9)-(line 77,col 51)",
        "(line 78,col 9)-(line 78,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.DividedDifferenceInterpolator.computeDividedDifference(double[], double[])",
      "begin_line": 96,
      "end_line": 125,
      "comment": "\n     * Returns a copy of the divided difference array.\n     * \u003cp\u003e \n     * The divided difference array is defined recursively by \u003cpre\u003e\n     * f[x0] \u003d f(x0)\n     * f[x0,x1,...,xk] \u003d (f(x1,...,xk) - f(x0,...,x[k-1])) / (xk - x0)\n     * \u003c/pre\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * The computational complexity is O(N^2).\u003c/p\u003e\n     *\n     * @param x the interpolating points array\n     * @param y the interpolating values array\n     * @return a fresh copy of the divided difference array\n     * @throws DuplicateSampleAbscissaException if any abscissas coincide\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 20)",
        "(line 100,col 9)-(line 100,col 43)",
        "(line 102,col 9)-(line 102,col 70)",
        "(line 104,col 9)-(line 104,col 21)",
        "(line 105,col 9)-(line 105,col 32)",
        "(line 106,col 9)-(line 108,col 9)",
        "(line 110,col 9)-(line 110,col 27)",
        "(line 111,col 9)-(line 111,col 26)",
        "(line 112,col 9)-(line 122,col 9)",
        "(line 124,col 9)-(line 124,col 17)"
      ]
    }
  ]
}