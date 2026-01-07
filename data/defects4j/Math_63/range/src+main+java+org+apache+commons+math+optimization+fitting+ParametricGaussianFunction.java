{
  "filepath": "/tmp/Math-63b/src/main/java/org/apache/commons/math/optimization/fitting/ParametricGaussianFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ParametricGaussianFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.fitting.ParametricRealFunction",
        "java.io.Serializable"
      ],
      "begin_line": 57,
      "end_line": 166,
      "comment": "\n * A Gaussian function.  Specifically:\n * \u003cp\u003e\n * \u003ctt\u003ef(x) \u003d a + b*exp(-((x - c)^2 / (2*d^2)))\u003c/tt\u003e\n * \u003cp\u003e\n * The parameters have the following meaning:\n * \u003cul\u003e\n * \u003cli\u003e\u003ctt\u003ea\u003c/tt\u003e is a constant offset that shifts \u003ctt\u003ef(x)\u003c/tt\u003e up or down\n * \u003cli\u003e\u003ctt\u003eb\u003c/tt\u003e is the height of the peak\n * \u003cli\u003e\u003ctt\u003ec\u003c/tt\u003e is the position of the center of the peak\n * \u003cli\u003e\u003ctt\u003ed\u003c/tt\u003e is related to the FWHM by \u003ctt\u003eFWHM \u003d 2*sqrt(2*ln(2))*d\u003c/tt\u003e\n * \u003c/ul\u003e\n * Notation key:\n * \u003cul\u003e\n * \u003cli\u003e\u003ctt\u003ex^n\u003c/tt\u003e: \u003ctt\u003ex\u003c/tt\u003e raised to the power of \u003ctt\u003en\u003c/tt\u003e\n * \u003cli\u003e\u003ctt\u003eexp(x)\u003c/tt\u003e: \u003ci\u003ee\u003c/i\u003e\u003ctt\u003e^x\u003c/tt\u003e\n * \u003cli\u003e\u003ctt\u003esqrt(x)\u003c/tt\u003e: the square root of \u003ctt\u003ex\u003c/tt\u003e\n * \u003cli\u003e\u003ctt\u003eln(x)\u003c/tt\u003e: the natural logarithm of \u003ctt\u003ex\u003c/tt\u003e\n * \u003c/ul\u003e\n * References:\n * \u003cul\u003e\n * \u003cli\u003e\u003ca href\u003d\"http://en.wikipedia.org/wiki/Gaussian_function\"\u003eWikipedia:\n *   Gaussian function\u003c/a\u003e\n * \u003c/ul\u003e\n *\n * @since 2.2\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Serializable version Id. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.fitting.ParametricGaussianFunction.ParametricGaussianFunction()",
      "begin_line": 65,
      "end_line": 66,
      "comment": "\n     * Constructs an instance.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.ParametricGaussianFunction.value(double, double[])",
      "begin_line": 84,
      "end_line": 92,
      "comment": "\n     * Computes value of function \u003ctt\u003ef(x)\u003c/tt\u003e for the specified \u003ctt\u003ex\u003c/tt\u003e and\n     * parameters \u003ctt\u003ea\u003c/tt\u003e, \u003ctt\u003eb\u003c/tt\u003e, \u003ctt\u003ec\u003c/tt\u003e, and \u003ctt\u003ed\u003c/tt\u003e.\n     *\n     * @param x \u003ctt\u003ex\u003c/tt\u003e value\n     * @param parameters values of \u003ctt\u003ea\u003c/tt\u003e, \u003ctt\u003eb\u003c/tt\u003e, \u003ctt\u003ec\u003c/tt\u003e, and\n     *        \u003ctt\u003ed\u003c/tt\u003e\n     *\n     * @return value of \u003ctt\u003ef(x)\u003c/tt\u003e evaluated at \u003ctt\u003ex\u003c/tt\u003e with the specified\n     *         parameters\n     *\n     * @throws IllegalArgumentException if \u003ccode\u003eparameters\u003c/code\u003e is invalid as\n     *         determined by {@link #validateParameters(double[])}\n     * @throws FunctionEvaluationException if \u003ccode\u003eparameters\u003c/code\u003e values are\n     *         invalid as determined by {@link #validateParameters(double[])}\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 39)",
        "(line 86,col 9)-(line 86,col 39)",
        "(line 87,col 9)-(line 87,col 39)",
        "(line 88,col 9)-(line 88,col 39)",
        "(line 89,col 9)-(line 89,col 39)",
        "(line 90,col 9)-(line 90,col 33)",
        "(line 91,col 9)-(line 91,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.ParametricGaussianFunction.gradient(double, double[])",
      "begin_line": 125,
      "end_line": 139,
      "comment": "\n     * Computes the gradient vector for a four variable version of the function\n     * where the parameters, \u003ctt\u003ea\u003c/tt\u003e, \u003ctt\u003eb\u003c/tt\u003e, \u003ctt\u003ec\u003c/tt\u003e, and \u003ctt\u003ed\u003c/tt\u003e,\n     * are considered the variables, not \u003ctt\u003ex\u003c/tt\u003e.  That is, instead of\n     * computing the gradient vector for the function \u003ctt\u003ef(x)\u003c/tt\u003e (which would\n     * just be the derivative of \u003ctt\u003ef(x)\u003c/tt\u003e with respect to \u003ctt\u003ex\u003c/tt\u003e since\n     * it\u0027s a one-dimensional function), computes the gradient vector for the\n     * function \u003ctt\u003ef(a, b, c, d) \u003d a + b*exp(-((x - c)^2 / (2*d^2)))\u003c/tt\u003e\n     * treating the specified \u003ctt\u003ex\u003c/tt\u003e as a constant.\n     * \u003cp\u003e\n     * The components of the computed gradient vector are the partial\n     * derivatives of \u003ctt\u003ef(a, b, c, d)\u003c/tt\u003e with respect to each variable.\n     * That is, the partial derivative of \u003ctt\u003ef(a, b, c, d)\u003c/tt\u003e with respect to\n     * \u003ctt\u003ea\u003c/tt\u003e, the partial derivative of \u003ctt\u003ef(a, b, c, d)\u003c/tt\u003e with respect\n     * to \u003ctt\u003eb\u003c/tt\u003e, the partial derivative of \u003ctt\u003ef(a, b, c, d)\u003c/tt\u003e with\n     * respect to \u003ctt\u003ec\u003c/tt\u003e, and the partial derivative of \u003ctt\u003ef(a, b, c,\n     * d)\u003c/tt\u003e with respect to \u003ctt\u003ed\u003c/tt\u003e.\n     *\n     * @param x \u003ctt\u003ex\u003c/tt\u003e value to be used as constant in \u003ctt\u003ef(a, b, c,\n     *        d)\u003c/tt\u003e\n     * @param parameters values of \u003ctt\u003ea\u003c/tt\u003e, \u003ctt\u003eb\u003c/tt\u003e, \u003ctt\u003ec\u003c/tt\u003e, and\n     *        \u003ctt\u003ed\u003c/tt\u003e for computation of gradient vector of \u003ctt\u003ef(a, b, c,\n     *        d)\u003c/tt\u003e\n     *\n     * @return gradient vector of \u003ctt\u003ef(a, b, c, d)\u003c/tt\u003e\n     *\n     * @throws IllegalArgumentException if \u003ccode\u003eparameters\u003c/code\u003e is invalid as\n     *         determined by {@link #validateParameters(double[])}\n     * @throws FunctionEvaluationException if \u003ccode\u003eparameters\u003c/code\u003e values are\n     *         invalid as determined by {@link #validateParameters(double[])}\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 39)",
        "(line 128,col 9)-(line 128,col 39)",
        "(line 129,col 9)-(line 129,col 39)",
        "(line 130,col 9)-(line 130,col 39)",
        "(line 132,col 9)-(line 132,col 34)",
        "(line 133,col 9)-(line 133,col 34)",
        "(line 134,col 9)-(line 134,col 60)",
        "(line 135,col 9)-(line 135,col 47)",
        "(line 137,col 9)-(line 137,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.ParametricGaussianFunction.validateParameters(double[])",
      "begin_line": 154,
      "end_line": 164,
      "comment": "\n     * Validates parameters to ensure they are appropriate for the evaluation of\n     * the \u003ccode\u003evalue\u003c/code\u003e and \u003ccode\u003egradient\u003c/code\u003e methods.\n     *\n     * @param parameters values of \u003ctt\u003ea\u003c/tt\u003e, \u003ctt\u003eb\u003c/tt\u003e, \u003ctt\u003ec\u003c/tt\u003e, and\n     *        \u003ctt\u003ed\u003c/tt\u003e\n     *\n     * @throws IllegalArgumentException if \u003ccode\u003eparameters\u003c/code\u003e is\n     *         \u003ccode\u003enull\u003c/code\u003e or if \u003ccode\u003eparameters\u003c/code\u003e does not have\n     *         length \u003d\u003d 4\n     * @throws FunctionEvaluationException if \u003ccode\u003eparameters[3]\u003c/code\u003e\n     *         (\u003ctt\u003ed\u003c/tt\u003e) is 0\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 163,col 9)"
      ]
    }
  ]
}