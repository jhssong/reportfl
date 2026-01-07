{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/interpolation/MicrosphereInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MicrosphereInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.interpolation.MultivariateInterpolator"
      ],
      "begin_line": 35,
      "end_line": 103,
      "comment": "\n * Interpolator that implements the algorithm described in\n * \u003cem\u003eWilliam Dudziak\u003c/em\u003e\u0027s\n * \u003ca href\u003d\"http://www.dudziak.com/microsphere.pdf\"\u003eMS thesis\u003c/a\u003e.\n *\n * @since 2.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MICROSPHERE_ELEMENTS"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": "\n     * Default number of surface elements that composes the microsphere.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_BRIGHTNESS_EXPONENT"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * Default exponent used the weights calculation.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "microsphereElements"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n     * Number of surface elements of the microsphere.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "brightnessExponent"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * Exponent used in the power law that computes the weights of the\n     * sample data.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.interpolation.MicrosphereInterpolator.MicrosphereInterpolator()",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * Create a microsphere interpolator with default settings.\n     * Calling this constructor is equivalent to call {@link\n     * #MicrosphereInterpolator(int, int)\n     * MicrosphereInterpolator(MicrosphereInterpolator.DEFAULT_MICROSPHERE_ELEMENTS,\n     * MicrosphereInterpolator.DEFAULT_BRIGHTNESS_EXPONENT)}.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 72)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.interpolation.MicrosphereInterpolator.MicrosphereInterpolator(int, int)",
      "begin_line": 73,
      "end_line": 86,
      "comment": " Create a microsphere interpolator.\n     * @param elements Number of surface elements of the microsphere.\n     * @param exponent Exponent used in the power law that computes the\n     * weights (distance dimming factor) of the sample data.\n     * @throws NotPositiveException if {@code exponent \u003c 0}.\n     * @throws NotStrictlyPositiveException if {@code elements \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 79,col 9)",
        "(line 80,col 9)-(line 82,col 9)",
        "(line 84,col 9)-(line 84,col 39)",
        "(line 85,col 9)-(line 85,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.MicrosphereInterpolator.interpolate(double[][], double[])",
      "begin_line": 91,
      "end_line": 102,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 97,col 66)",
        "(line 98,col 9)-(line 101,col 58)"
      ]
    }
  ]
}