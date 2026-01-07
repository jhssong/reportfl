{
  "filepath": "/tmp/Math-60b/src/main/java/org/apache/commons/math/optimization/fitting/GaussianFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GaussianFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction",
        "java.io.Serializable"
      ],
      "begin_line": 50,
      "end_line": 159,
      "comment": "\n * A Gaussian function.  Specifically:\n * \u003cp\u003e\n * \u003ctt\u003ef(x) \u003d a + b*exp(-((x - c)^2 / (2*d^2)))\u003c/tt\u003e\n * \u003cp\u003e\n * Notation key:\n * \u003cul\u003e\n * \u003cli\u003e\u003ctt\u003ex^n\u003c/tt\u003e: \u003ctt\u003ex\u003c/tt\u003e raised to the power of \u003ctt\u003en\u003c/tt\u003e\n * \u003cli\u003e\u003ctt\u003eexp(x)\u003c/tt\u003e: \u003ci\u003ee\u003c/i\u003e\u003ctt\u003e^x\u003c/tt\u003e\n * \u003c/ul\u003e\n * References:\n * \u003cul\u003e\n * \u003cli\u003e\u003ca href\u003d\"http://en.wikipedia.org/wiki/Gaussian_function\"\u003eWikipedia:\n *   Gaussian function\u003c/a\u003e\n * \u003c/ul\u003e\n *\n * @see GaussianDerivativeFunction\n * @see ParametricGaussianFunction\n * @since 2.2\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Parameter a of this function. "
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Parameter b of this function. "
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Parameter c of this function. "
    },
    {
      "type": "field",
      "varNames": [
        "d"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Parameter d of this function. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFunction.GaussianFunction(double, double, double, double)",
      "begin_line": 77,
      "end_line": 85,
      "comment": "\n     * Constructs an instance with the specified parameters.\n     *\n     * @param a \u003ctt\u003ea\u003c/tt\u003e parameter value\n     * @param b \u003ctt\u003eb\u003c/tt\u003e parameter value\n     * @param c \u003ctt\u003ec\u003c/tt\u003e parameter value\n     * @param d \u003ctt\u003ed\u003c/tt\u003e parameter value\n     *\n     * @throws IllegalArgumentException if \u003ccode\u003ed\u003c/code\u003e is 0\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 80,col 9)",
        "(line 81,col 9)-(line 81,col 19)",
        "(line 82,col 9)-(line 82,col 19)",
        "(line 83,col 9)-(line 83,col 19)",
        "(line 84,col 9)-(line 84,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFunction.GaussianFunction(double[])",
      "begin_line": 97,
      "end_line": 111,
      "comment": "\n     * Constructs an instance with the specified parameters.\n     *\n     * @param parameters \u003ctt\u003ea\u003c/tt\u003e, \u003ctt\u003eb\u003c/tt\u003e, \u003ctt\u003ec\u003c/tt\u003e, and \u003ctt\u003ed\u003c/tt\u003e\n     *        parameter values\n     *\n     * @throws IllegalArgumentException if \u003ccode\u003eparameters\u003c/code\u003e is null,\n     *         \u003ccode\u003eparameters\u003c/code\u003e length is not 4, or if\n     *         \u003ccode\u003eparameters[3]\u003c/code\u003e is 0\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 100,col 9)",
        "(line 101,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 107,col 31)",
        "(line 108,col 9)-(line 108,col 31)",
        "(line 109,col 9)-(line 109,col 31)",
        "(line 110,col 9)-(line 110,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFunction.derivative()",
      "begin_line": 114,
      "end_line": 116,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFunction.value(double)",
      "begin_line": 119,
      "end_line": 122,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 33)",
        "(line 121,col 9)-(line 121,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFunction.getA()",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\n     * Gets \u003ctt\u003ea\u003c/tt\u003e parameter value.\n     *\n     * @return \u003ctt\u003ea\u003c/tt\u003e parameter value\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFunction.getB()",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\n     * Gets \u003ctt\u003eb\u003c/tt\u003e parameter value.\n     *\n     * @return \u003ctt\u003eb\u003c/tt\u003e parameter value\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFunction.getC()",
      "begin_line": 147,
      "end_line": 149,
      "comment": "\n     * Gets \u003ctt\u003ec\u003c/tt\u003e parameter value.\n     *\n     * @return \u003ctt\u003ec\u003c/tt\u003e parameter value\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFunction.getD()",
      "begin_line": 156,
      "end_line": 158,
      "comment": "\n     * Gets \u003ctt\u003ed\u003c/tt\u003e parameter value.\n     *\n     * @return \u003ctt\u003ed\u003c/tt\u003e parameter value\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 17)"
      ]
    }
  ]
}