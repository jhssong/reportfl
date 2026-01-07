{
  "filepath": "/tmp/Math-105b/src/java/org/apache/commons/math/analysis/NevilleInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NevilleInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealInterpolator",
        "java.io.Serializable"
      ],
      "begin_line": 32,
      "end_line": 53,
      "comment": "\r\n * Implements the \u003ca href\u003d\"http://mathworld.wolfram.com/NevillesAlgorithm.html\"\u003e\r\n * Neville\u0027s Algorithm\u003c/a\u003e for interpolation of real univariate functions. For\r\n * reference, see \u003cb\u003eIntroduction to Numerical Analysis\u003c/b\u003e, ISBN 038795452X,\r\n * chapter 2.\r\n * \u003cp\u003e\r\n * The actual code of Neville\u0027s evalution is in PolynomialFunctionLagrangeForm,\r\n * this class provides an easy-to-use interface to it.\r\n *\r\n * @version $Revision$ $Date$\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " serializable version identifier "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.NevilleInterpolator.interpolate(double[], double[])",
      "begin_line": 46,
      "end_line": 52,
      "comment": "\r\n     * Computes an interpolating function for the data set.\r\n     *\r\n     * @param x the interpolating points array\r\n     * @param y the interpolating values array\r\n     * @return a function which interpolates the data set\r\n     * @throws MathException if arguments are invalid\r\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 41)",
        "(line 50,col 9)-(line 50,col 53)",
        "(line 51,col 9)-(line 51,col 17)"
      ]
    }
  ]
}