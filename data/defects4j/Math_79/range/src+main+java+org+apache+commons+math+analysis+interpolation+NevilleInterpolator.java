{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/analysis/interpolation/NevilleInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NevilleInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.interpolation.UnivariateRealInterpolator",
        "java.io.Serializable"
      ],
      "begin_line": 36,
      "end_line": 54,
      "comment": "\n * Implements the \u003ca href\u003d\"http://mathworld.wolfram.com/NevillesAlgorithm.html\"\u003e\n * Neville\u0027s Algorithm\u003c/a\u003e for interpolation of real univariate functions. For\n * reference, see \u003cb\u003eIntroduction to Numerical Analysis\u003c/b\u003e, ISBN 038795452X,\n * chapter 2.\n * \u003cp\u003e\n * The actual code of Neville\u0027s evalution is in PolynomialFunctionLagrangeForm,\n * this class provides an easy-to-use interface to it.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 1.2\n "
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
      "signature": "org.apache.commons.math.analysis.interpolation.NevilleInterpolator.interpolate(double[], double[])",
      "begin_line": 50,
      "end_line": 53,
      "comment": "\n     * Computes an interpolating function for the data set.\n     *\n     * @param x the interpolating points array\n     * @param y the interpolating values array\n     * @return a function which interpolates the data set\n     * @throws MathException if arguments are invalid\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 56)"
      ]
    }
  ]
}