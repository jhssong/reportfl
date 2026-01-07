{
  "filepath": "/tmp/Math-64b/src/main/java/org/apache/commons/math/optimization/fitting/GaussianDerivativeFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GaussianDerivativeFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealFunction",
        "java.io.Serializable"
      ],
      "begin_line": 44,
      "end_line": 106,
      "comment": "\n * The derivative of {@link GaussianFunction}.  Specifically:\n * \u003cp\u003e\n * \u003ctt\u003ef\u0027(x) \u003d (-b / (d^2)) * (x - c) * exp(-((x - c)^2) / (2*(d^2)))\u003c/tt\u003e\n * \u003cp\u003e\n * Notation key:\n * \u003cul\u003e\n * \u003cli\u003e\u003ctt\u003ex^n\u003c/tt\u003e: \u003ctt\u003ex\u003c/tt\u003e raised to the power of \u003ctt\u003en\u003c/tt\u003e\n * \u003cli\u003e\u003ctt\u003eexp(x)\u003c/tt\u003e: \u003ci\u003ee\u003c/i\u003e\u003ctt\u003e^x\u003c/tt\u003e\n * \u003c/ul\u003e\n *\n * @since 2.2\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Parameter b of this function. "
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Parameter c of this function. "
    },
    {
      "type": "field",
      "varNames": [
        "d2"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Square of the parameter d of this function. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianDerivativeFunction.GaussianDerivativeFunction(double, double, double)",
      "begin_line": 67,
      "end_line": 74,
      "comment": "\n     * Constructs an instance with the specified parameters.\n     *\n     * @param b \u003ctt\u003eb\u003c/tt\u003e parameter value\n     * @param c \u003ctt\u003ec\u003c/tt\u003e parameter value\n     * @param d \u003ctt\u003ed\u003c/tt\u003e parameter value\n     *\n     * @throws IllegalArgumentException if \u003ccode\u003ed\u003c/code\u003e is 0\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 70,col 9)",
        "(line 71,col 9)-(line 71,col 19)",
        "(line 72,col 9)-(line 72,col 19)",
        "(line 73,col 9)-(line 73,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianDerivativeFunction.GaussianDerivativeFunction(double[])",
      "begin_line": 85,
      "end_line": 98,
      "comment": "\n     * Constructs an instance with the specified parameters.\n     *\n     * @param parameters \u003ctt\u003eb\u003c/tt\u003e, \u003ctt\u003ec\u003c/tt\u003e, and \u003ctt\u003ed\u003c/tt\u003e parameter values\n     *\n     * @throws IllegalArgumentException if \u003ccode\u003eparameters\u003c/code\u003e is null,\n     *         \u003ccode\u003eparameters\u003c/code\u003e length is not 3, or if\n     *         \u003ccode\u003eparameters[2]\u003c/code\u003e is 0\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 88,col 9)",
        "(line 89,col 9)-(line 91,col 9)",
        "(line 92,col 9)-(line 94,col 9)",
        "(line 95,col 9)-(line 95,col 31)",
        "(line 96,col 9)-(line 96,col 31)",
        "(line 97,col 9)-(line 97,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianDerivativeFunction.value(double)",
      "begin_line": 101,
      "end_line": 104,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 33)",
        "(line 103,col 9)-(line 103,col 69)"
      ]
    }
  ]
}