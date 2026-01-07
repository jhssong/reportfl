{
  "filepath": "/tmp/Math-59b/src/main/java/org/apache/commons/math/optimization/fitting/ParametricGaussianFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ParametricGaussianFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.fitting.ParametricRealFunction",
        "java.io.Serializable"
      ],
      "begin_line": 56,
      "end_line": 143,
      "comment": "\n * A Gaussian function.  Specifically:\n * \u003cp\u003e\n * {@code f(x) \u003d a + b*exp(-((x - c)^2 / (2*d^2)))}\n * \u003cp\u003e\n * The parameters have the following meaning:\n * \u003cul\u003e\n * \u003cli\u003e{@code a} is a constant offset that shifts {@code f(x)} up or down\n * \u003cli\u003e{@code b} is the height of the peak\n * \u003cli\u003e{@code c} is the position of the center of the peak\n * \u003cli\u003e{@code d} is related to the FWHM by {@code FWHM \u003d 2*sqrt(2*ln(2))*d}\n * \u003c/ul\u003e\n * Notation key:\n * \u003cul\u003e\n * \u003cli\u003e{@code x^n}: {@code x} raised to the power of {@code n}\n * \u003cli\u003e{@code exp(x)}: e\u003csup\u003ex\u003c/sup\u003e\n * \u003cli\u003e{@code sqrt(x)}: square root of {@code x}\n * \u003cli\u003e{@code ln(x)}: natural logarithm of {@code x}\n * \u003c/ul\u003e\n * References:\n * \u003cul\u003e\n * \u003cli\u003e\u003ca href\u003d\"http://en.wikipedia.org/wiki/Gaussian_function\"\u003eWikipedia:\n *   Gaussian function\u003c/a\u003e\n * \u003c/ul\u003e\n *\n * @since 2.2\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Serializable version Id. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.ParametricGaussianFunction.value(double, double[])",
      "begin_line": 72,
      "end_line": 80,
      "comment": "\n     * Computes value of function {@code f(x)} for the specified {@code x} and\n     * parameters {@code a}, {@code b}, {@code c}, and {@code d}.\n     *\n     * @param x Value at which to compute the function.\n     * @return {@code f(x)}.\n     * @param parameters Values of {@code a}, {@code b}, {@code c}, and {@code d}.\n     * @throws NullArgumentException if {@code parameters} is {@code null}.\n     * @throws DimensionMismatchException if the size of {@code parameters} is\n     * not 4.\n     * @throws ZeroException if {@code parameters[3]} is 0.\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 39)",
        "(line 74,col 9)-(line 74,col 39)",
        "(line 75,col 9)-(line 75,col 39)",
        "(line 76,col 9)-(line 76,col 39)",
        "(line 77,col 9)-(line 77,col 39)",
        "(line 78,col 9)-(line 78,col 33)",
        "(line 79,col 9)-(line 79,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.ParametricGaussianFunction.gradient(double, double[])",
      "begin_line": 108,
      "end_line": 120,
      "comment": "\n     * Computes the gradient vector for a four variable version of the function\n     * where the parameters, {@code a}, {@code b}, {@code c}, and {@code d},\n     * are considered the variables, not {@code x}.  That is, instead of\n     * computing the gradient vector for the function {@code f(x)} (which would\n     * just be the derivative of {@code f(x)} with respect to {@code x} since\n     * it\u0027s a one-dimensional function), computes the gradient vector for the\n     * function {@code f(a, b, c, d) \u003d a + b*exp(-((x - c)^2 / (2*d^2)))}\n     * treating the specified {@code x} as a constant.\n     * \u003cp\u003e\n     * The components of the computed gradient vector are the partial\n     * derivatives of {@code f(a, b, c, d)} with respect to each variable.\n     * That is, the partial derivative of {@code f(a, b, c, d)} with respect to\n     * {@code a}, the partial derivative of {@code f(a, b, c, d)} with respect\n     * to {@code b}, the partial derivative of {@code f(a, b, c, d)} with\n     * respect to {@code c}, and the partial derivative of {@code f(a, b, c,\n     * d)} with respect to {@code d}.\n     *\n     * @param x Value to be used as constant in {@code f(x, a, b, c, d)}.\n     * @param parameters Values of {@code a}, {@code b}, {@code c}, and {@code d}.\n     * @return the gradient vector of {@code f(a, b, c, d)}.\n     * @throws NullArgumentException if {@code parameters} is {@code null}.\n     * @throws DimensionMismatchException if the size of {@code parameters} is\n     * not 4.\n     * @throws ZeroException if {@code parameters[3]} is 0.\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 39)",
        "(line 110,col 9)-(line 110,col 39)",
        "(line 111,col 9)-(line 111,col 39)",
        "(line 112,col 9)-(line 112,col 39)",
        "(line 114,col 9)-(line 114,col 34)",
        "(line 115,col 9)-(line 115,col 34)",
        "(line 116,col 9)-(line 116,col 60)",
        "(line 117,col 9)-(line 117,col 47)",
        "(line 119,col 9)-(line 119,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.ParametricGaussianFunction.validateParameters(double[])",
      "begin_line": 132,
      "end_line": 142,
      "comment": "\n     * Validates parameters to ensure they are appropriate for the evaluation of\n     * the {@code value} and {@code gradient} methods.\n     *\n     * @param parameters Values of {@code a}, {@code b}, {@code c}, and {@code d}.\n     * @throws NullArgumentException if {@code parameters} is {@code null}.\n     * @throws DimensionMismatchException if the size of {@code parameters} is\n     * not 4.\n     * @throws ZeroException if {@code parameters[3]} is 0.\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 141,col 9)"
      ]
    }
  ]
}