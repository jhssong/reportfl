{
  "filepath": "/tmp/Math-53b/src/main/java/org/apache/commons/math/analysis/interpolation/DividedDifferenceInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DividedDifferenceInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.interpolation.UnivariateRealInterpolator",
        "java.io.Serializable"
      ],
      "begin_line": 36,
      "end_line": 115,
      "comment": "\n * Implements the \u003ca href\u003d\"\n * \"http://mathworld.wolfram.com/NewtonsDividedDifferenceInterpolationFormula.html\"\u003e\n * Divided Difference Algorithm\u003c/a\u003e for interpolation of real univariate\n * functions. For reference, see \u003cb\u003eIntroduction to Numerical Analysis\u003c/b\u003e,\n * ISBN 038795452X, chapter 2.\n * \u003cp\u003e\n * The actual code of Neville\u0027s evaluation is in PolynomialFunctionLagrangeForm,\n * this class provides an easy-to-use interface to it.\u003c/p\u003e\n *\n * @version $Id$\n * @since 1.2\n "
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
      "signature": "org.apache.commons.math.analysis.interpolation.DividedDifferenceInterpolator.interpolate(double[], double[])",
      "begin_line": 54,
      "end_line": 75,
      "comment": "\n     * Compute an interpolating function for the dataset.\n     *\n     * @param x Interpolating points array.\n     * @param y Interpolating values array.\n     * @return a function which interpolates the dataset.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if the array lengths are different.\n     * @throws org.apache.commons.math.exception.NumberIsTooSmallException\n     * if the number of points is less than 2.\n     * @throws org.apache.commons.math.exception.NonMonotonousSequenceException\n     * if {@code x} is not sorted in strictly increasing order.\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 76)",
        "(line 70,col 9)-(line 70,col 50)",
        "(line 71,col 9)-(line 71,col 47)",
        "(line 73,col 9)-(line 73,col 58)",
        "(line 74,col 9)-(line 74,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.DividedDifferenceInterpolator.computeDividedDifference(double[], double[])",
      "begin_line": 97,
      "end_line": 114,
      "comment": "\n     * Return a copy of the divided difference array.\n     * \u003cp\u003e\n     * The divided difference array is defined recursively by \u003cpre\u003e\n     * f[x0] \u003d f(x0)\n     * f[x0,x1,...,xk] \u003d (f(x1,...,xk) - f(x0,...,x[k-1])) / (xk - x0)\n     * \u003c/pre\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * The computational complexity is O(N^2).\u003c/p\u003e\n     *\n     * @param x Interpolating points array.\n     * @param y Interpolating values array.\n     * @return a fresh copy of the divided difference array.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if the array lengths are different.\n     * @throws org.apache.commons.math.exception.NumberIsTooSmallException\n     * if the number of points is less than 2.\n     * @throws org.apache.commons.math.exception.NonMonotonousSequenceException\n     * if {@code x} is not sorted in strictly increasing order.\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 76)",
        "(line 100,col 9)-(line 100,col 43)",
        "(line 102,col 9)-(line 102,col 31)",
        "(line 103,col 9)-(line 103,col 42)",
        "(line 104,col 9)-(line 104,col 26)",
        "(line 105,col 9)-(line 111,col 9)",
        "(line 113,col 9)-(line 113,col 17)"
      ]
    }
  ]
}