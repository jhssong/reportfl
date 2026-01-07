{
  "filepath": "/tmp/Math-62b/src/main/java/org/apache/commons/math/optimization/fitting/GaussianFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GaussianFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction",
        "java.io.Serializable"
      ],
      "begin_line": 51,
      "end_line": 160,
      "comment": "\n * A Gaussian function.  Specifically:\n * \u003cp\u003e\n * \u003ctt\u003ef(x) \u003d a + b*exp(-((x - c)^2 / (2*d^2)))\u003c/tt\u003e\n * \u003cp\u003e\n * Notation key:\n * \u003cul\u003e\n * \u003cli\u003e\u003ctt\u003ex^n\u003c/tt\u003e: \u003ctt\u003ex\u003c/tt\u003e raised to the power of \u003ctt\u003en\u003c/tt\u003e\n * \u003cli\u003e\u003ctt\u003eexp(x)\u003c/tt\u003e: \u003ci\u003ee\u003c/i\u003e\u003ctt\u003e^x\u003c/tt\u003e\n * \u003c/ul\u003e\n * References:\n * \u003cul\u003e\n * \u003cli\u003e\u003ca href\u003d\"http://en.wikipedia.org/wiki/Gaussian_function\"\u003eWikipedia:\n *   Gaussian function\u003c/a\u003e\n * \u003c/ul\u003e\n *\n * @see GaussianDerivativeFunction\n * @see ParametricGaussianFunction\n * @since 2.2\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Parameter a of this function. "
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Parameter b of this function. "
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Parameter c of this function. "
    },
    {
      "type": "field",
      "varNames": [
        "d"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Parameter d of this function. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFunction.GaussianFunction(double, double, double, double)",
      "begin_line": 78,
      "end_line": 86,
      "comment": "\n     * Constructs an instance with the specified parameters.\n     *\n     * @param a \u003ctt\u003ea\u003c/tt\u003e parameter value\n     * @param b \u003ctt\u003eb\u003c/tt\u003e parameter value\n     * @param c \u003ctt\u003ec\u003c/tt\u003e parameter value\n     * @param d \u003ctt\u003ed\u003c/tt\u003e parameter value\n     *\n     * @throws IllegalArgumentException if \u003ccode\u003ed\u003c/code\u003e is 0\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 81,col 9)",
        "(line 82,col 9)-(line 82,col 19)",
        "(line 83,col 9)-(line 83,col 19)",
        "(line 84,col 9)-(line 84,col 19)",
        "(line 85,col 9)-(line 85,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFunction.GaussianFunction(double[])",
      "begin_line": 98,
      "end_line": 112,
      "comment": "\n     * Constructs an instance with the specified parameters.\n     *\n     * @param parameters \u003ctt\u003ea\u003c/tt\u003e, \u003ctt\u003eb\u003c/tt\u003e, \u003ctt\u003ec\u003c/tt\u003e, and \u003ctt\u003ed\u003c/tt\u003e\n     *        parameter values\n     *\n     * @throws IllegalArgumentException if \u003ccode\u003eparameters\u003c/code\u003e is null,\n     *         \u003ccode\u003eparameters\u003c/code\u003e length is not 4, or if\n     *         \u003ccode\u003eparameters[3]\u003c/code\u003e is 0\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 101,col 9)",
        "(line 102,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 108,col 31)",
        "(line 109,col 9)-(line 109,col 31)",
        "(line 110,col 9)-(line 110,col 31)",
        "(line 111,col 9)-(line 111,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFunction.derivative()",
      "begin_line": 115,
      "end_line": 117,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFunction.value(double)",
      "begin_line": 120,
      "end_line": 123,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 33)",
        "(line 122,col 9)-(line 122,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFunction.getA()",
      "begin_line": 130,
      "end_line": 132,
      "comment": "\n     * Gets \u003ctt\u003ea\u003c/tt\u003e parameter value.\n     *\n     * @return \u003ctt\u003ea\u003c/tt\u003e parameter value\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFunction.getB()",
      "begin_line": 139,
      "end_line": 141,
      "comment": "\n     * Gets \u003ctt\u003eb\u003c/tt\u003e parameter value.\n     *\n     * @return \u003ctt\u003eb\u003c/tt\u003e parameter value\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFunction.getC()",
      "begin_line": 148,
      "end_line": 150,
      "comment": "\n     * Gets \u003ctt\u003ec\u003c/tt\u003e parameter value.\n     *\n     * @return \u003ctt\u003ec\u003c/tt\u003e parameter value\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianFunction.getD()",
      "begin_line": 157,
      "end_line": 159,
      "comment": "\n     * Gets \u003ctt\u003ed\u003c/tt\u003e parameter value.\n     *\n     * @return \u003ctt\u003ed\u003c/tt\u003e parameter value\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 17)"
      ]
    }
  ]
}