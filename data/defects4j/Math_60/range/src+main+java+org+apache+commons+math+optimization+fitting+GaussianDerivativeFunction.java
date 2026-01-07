{
  "filepath": "/tmp/Math-60b/src/main/java/org/apache/commons/math/optimization/fitting/GaussianDerivativeFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GaussianDerivativeFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealFunction",
        "java.io.Serializable"
      ],
      "begin_line": 42,
      "end_line": 99,
      "comment": "\n * The derivative of {@link GaussianFunction}.  Specifically:\n * \u003cp\u003e\n * {@code f\u0027(x) \u003d (-b / (d^2)) * (x - c) * exp(-((x - c)^2) / (2*(d^2)))}\n * \u003cp\u003e\n * Notation key:\n * \u003cul\u003e\n * \u003cli\u003e{@code x^n}: {@code x} raised to the power of {@code n}\n * \u003cli\u003e{@code exp(x)}: \u003ci\u003ee\u003c/i\u003e\u003csup\u003ex\u003c/sup\u003e\n * \u003c/ul\u003e\n *\n * @since 2.2\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Parameter b of this function. "
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Parameter c of this function. "
    },
    {
      "type": "field",
      "varNames": [
        "d2"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Square of the parameter d of this function. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianDerivativeFunction.GaussianDerivativeFunction(double, double, double)",
      "begin_line": 61,
      "end_line": 68,
      "comment": "\n     * Constructs an instance with the specified parameters.\n     *\n     * @param b {@code b} parameter value.\n     * @param c {@code c} parameter value.\n     * @param d {@code d} parameter value.\n     *\n     * @throws IllegalArgumentException if \u003ccode\u003ed\u003c/code\u003e is 0\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 64,col 9)",
        "(line 65,col 9)-(line 65,col 19)",
        "(line 66,col 9)-(line 66,col 19)",
        "(line 67,col 9)-(line 67,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianDerivativeFunction.GaussianDerivativeFunction(double[])",
      "begin_line": 79,
      "end_line": 92,
      "comment": "\n     * Constructs an instance with the specified parameters.\n     *\n     * @param parameters {@code b}, {@code c} and {@code d} parameter values.\n     * @throws NullArgumentException if {@code parameters} is {@code null}.\n     * @throws DimensionMismatchException if the size of {@code parameters} is\n     * not 3.\n     * @throws ZeroException if {@code parameters[2]} is 0.\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 82,col 9)",
        "(line 83,col 9)-(line 85,col 9)",
        "(line 86,col 9)-(line 88,col 9)",
        "(line 89,col 9)-(line 89,col 31)",
        "(line 90,col 9)-(line 90,col 31)",
        "(line 91,col 9)-(line 91,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.GaussianDerivativeFunction.value(double)",
      "begin_line": 95,
      "end_line": 98,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 33)",
        "(line 97,col 9)-(line 97,col 69)"
      ]
    }
  ]
}