{
  "filepath": "/tmp/Math-61b/src/main/java/org/apache/commons/math/optimization/fitting/GaussianDerivativeFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GaussianDerivativeFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealFunction",
        "java.io.Serializable"
      ],
      "begin_line": 43,
      "end_line": 105,
      "comment": "\n * The derivative of {@link GaussianFunction}.  Specifically:\n * \u003cp\u003e\n * \u003ctt\u003ef\u0027(x) \u003d (-b / (d^2)) * (x - c) * exp(-((x - c)^2) / (2*(d^2)))\u003c/tt\u003e\n * \u003cp\u003e\n * Notation key:\n * \u003cul\u003e\n * \u003cli\u003e\u003ctt\u003ex^n\u003c/tt\u003e: \u003ctt\u003ex\u003c/tt\u003e raised to the power of \u003ctt\u003en\u003c/tt\u003e\n * \u003cli\u003e\u003ctt\u003eexp(x)\u003c/tt\u003e: \u003ci\u003ee\u003c/i\u003e\u003ctt\u003e^x\u003c/tt\u003e\n * \u003c/ul\u003e\n *\n * @since 2.2\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Parameter b of this function. "
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Parameter c of this function. "
    },
    {
      "type": "field",
      "varNames": [
        "d2"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Square of the parameter d of this function. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianDerivativeFunction.GaussianDerivativeFunction(double, double, double)",
      "begin_line": 66,
      "end_line": 73,
      "comment": "\n     * Constructs an instance with the specified parameters.\n     *\n     * @param b \u003ctt\u003eb\u003c/tt\u003e parameter value\n     * @param c \u003ctt\u003ec\u003c/tt\u003e parameter value\n     * @param d \u003ctt\u003ed\u003c/tt\u003e parameter value\n     *\n     * @throws IllegalArgumentException if \u003ccode\u003ed\u003c/code\u003e is 0\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 69,col 9)",
        "(line 70,col 9)-(line 70,col 19)",
        "(line 71,col 9)-(line 71,col 19)",
        "(line 72,col 9)-(line 72,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianDerivativeFunction.GaussianDerivativeFunction(double[])",
      "begin_line": 84,
      "end_line": 97,
      "comment": "\n     * Constructs an instance with the specified parameters.\n     *\n     * @param parameters \u003ctt\u003eb\u003c/tt\u003e, \u003ctt\u003ec\u003c/tt\u003e, and \u003ctt\u003ed\u003c/tt\u003e parameter values\n     *\n     * @throws IllegalArgumentException if \u003ccode\u003eparameters\u003c/code\u003e is null,\n     *         \u003ccode\u003eparameters\u003c/code\u003e length is not 3, or if\n     *         \u003ccode\u003eparameters[2]\u003c/code\u003e is 0\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 87,col 9)",
        "(line 88,col 9)-(line 90,col 9)",
        "(line 91,col 9)-(line 93,col 9)",
        "(line 94,col 9)-(line 94,col 31)",
        "(line 95,col 9)-(line 95,col 31)",
        "(line 96,col 9)-(line 96,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianDerivativeFunction.value(double)",
      "begin_line": 100,
      "end_line": 103,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 33)",
        "(line 102,col 9)-(line 102,col 69)"
      ]
    }
  ]
}