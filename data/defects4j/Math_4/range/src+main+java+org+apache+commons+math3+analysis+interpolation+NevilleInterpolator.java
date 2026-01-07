{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/interpolation/NevilleInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NevilleInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.interpolation.UnivariateInterpolator",
        "java.io.Serializable"
      ],
      "begin_line": 38,
      "end_line": 61,
      "comment": "\n * Implements the \u003ca href\u003d\"http://mathworld.wolfram.com/NevillesAlgorithm.html\"\u003e\n * Neville\u0027s Algorithm\u003c/a\u003e for interpolation of real univariate functions. For\n * reference, see \u003cb\u003eIntroduction to Numerical Analysis\u003c/b\u003e, ISBN 038795452X,\n * chapter 2.\n * \u003cp\u003e\n * The actual code of Neville\u0027s algorithm is in PolynomialFunctionLagrangeForm,\n * this class provides an easy-to-use interface to it.\u003c/p\u003e\n *\n * @version $Id$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " serializable version identifier "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.NevilleInterpolator.interpolate(double[], double[])",
      "begin_line": 55,
      "end_line": 60,
      "comment": "\n     * Computes an interpolating function for the data set.\n     *\n     * @param x Interpolating points.\n     * @param y Interpolating values.\n     * @return a function which interpolates the data set\n     * @throws DimensionMismatchException if the array lengths are different.\n     * @throws NumberIsTooSmallException if the number of points is less than 2.\n     * @throws NonMonotonicSequenceException if two abscissae have the same\n     * value.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 56)"
      ]
    }
  ]
}