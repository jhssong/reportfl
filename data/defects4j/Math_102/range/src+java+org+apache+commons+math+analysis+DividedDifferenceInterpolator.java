{
  "filepath": "/tmp/Math-102b/src/java/org/apache/commons/math/analysis/DividedDifferenceInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DividedDifferenceInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealInterpolator",
        "java.io.Serializable"
      ],
      "begin_line": 35,
      "end_line": 122,
      "comment": "\n * Implements the \u003ca href\u003d\"\n * \"http://mathworld.wolfram.com/NewtonsDividedDifferenceInterpolationFormula.html\"\u003e\n * Divided Difference Algorithm\u003c/a\u003e for interpolation of real univariate\n * functions. For reference, see \u003cb\u003eIntroduction to Numerical Analysis\u003c/b\u003e,\n * ISBN 038795452X, chapter 2.\n * \u003cp\u003e\n * The actual code of Neville\u0027s evalution is in PolynomialFunctionLagrangeForm,\n * this class provides an easy-to-use interface to it.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " serializable version identifier "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.DividedDifferenceInterpolator.interpolate(double[], double[])",
      "begin_line": 49,
      "end_line": 78,
      "comment": "\n     * Computes an interpolating function for the data set.\n     *\n     * @param x the interpolating points array\n     * @param y the interpolating values array\n     * @return a function which interpolates the data set\n     * @throws DuplicateSampleAbscissaException if arguments are invalid\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 24)",
        "(line 59,col 9)-(line 59,col 70)",
        "(line 69,col 9)-(line 69,col 35)",
        "(line 70,col 9)-(line 72,col 9)",
        "(line 73,col 9)-(line 73,col 43)",
        "(line 75,col 9)-(line 75,col 39)",
        "(line 76,col 9)-(line 76,col 51)",
        "(line 77,col 9)-(line 77,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.DividedDifferenceInterpolator.computeDividedDifference(double[], double[])",
      "begin_line": 92,
      "end_line": 121,
      "comment": "\n     * Returns a copy of the divided difference array.\n     * \u003cp\u003e \n     * The divided difference array is defined recursively by \u003cpre\u003e\n     * f[x0] \u003d f(x0)\n     * f[x0,x1,...,xk] \u003d (f(x1,...,xk) - f(x0,...,x[k-1])) / (xk - x0)\n     * \u003c/pre\u003e\u003cp\u003e\n     * The computational complexity is O(N^2).\n     *\n     * @return a fresh copy of the divided difference array\n     * @throws DuplicateSampleAbscissaException if any abscissas coincide\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 20)",
        "(line 96,col 9)-(line 96,col 43)",
        "(line 98,col 9)-(line 98,col 70)",
        "(line 100,col 9)-(line 100,col 21)",
        "(line 101,col 9)-(line 101,col 32)",
        "(line 102,col 9)-(line 104,col 9)",
        "(line 106,col 9)-(line 106,col 27)",
        "(line 107,col 9)-(line 107,col 26)",
        "(line 108,col 9)-(line 118,col 9)",
        "(line 120,col 9)-(line 120,col 17)"
      ]
    }
  ]
}