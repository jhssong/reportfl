{
  "filepath": "/tmp/Math-59b/src/main/java/org/apache/commons/math/analysis/interpolation/MicrosphereInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MicrosphereInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.interpolation.MultivariateRealInterpolator"
      ],
      "begin_line": 33,
      "end_line": 97,
      "comment": "\n * Interpolator that implements the algorithm described in\n * \u003cem\u003eWilliam Dudziak\u003c/em\u003e\u0027s\n * \u003ca href\u003d\"http://www.dudziak.com/microsphere.pdf\"\u003eMS thesis\u003c/a\u003e.\n * @since 2.1\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MICROSPHERE_ELEMENTS"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": "\n     * Default number of surface elements that composes the microsphere.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_BRIGHTNESS_EXPONENT"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * Default exponent used the weights calculation.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "microsphereElements"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": "\n     * Number of surface elements of the microsphere.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "brightnessExponent"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": "\n     * Exponent used in the power law that computes the weights of the\n     * sample data.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.interpolation.MicrosphereInterpolator.MicrosphereInterpolator()",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * Create a microsphere interpolator with default settings.\n     * Calling this constructor is equivalent to call {@link\n     * #MicrosphereInterpolator(int, int)\n     * MicrosphereInterpolator(MicrosphereInterpolator.DEFAULT_MICROSPHERE_ELEMENTS,\n     * MicrosphereInterpolator.DEFAULT_BRIGHTNESS_EXPONENT)}.\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 72)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.interpolation.MicrosphereInterpolator.MicrosphereInterpolator(int, int)",
      "begin_line": 71,
      "end_line": 82,
      "comment": " Create a microsphere interpolator.\n     * @param elements Number of surface elements of the microsphere.\n     * @param exponent Exponent used in the power law that computes the\n     * weights (distance dimming factor) of the sample data.\n     * @throws NotPositiveException if {@code exponent \u003c 0}.\n     * @throws NotStrictlyPositiveException if {@code elements \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 75,col 9)",
        "(line 76,col 9)-(line 78,col 9)",
        "(line 80,col 9)-(line 80,col 39)",
        "(line 81,col 9)-(line 81,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.MicrosphereInterpolator.interpolate(double[][], double[])",
      "begin_line": 87,
      "end_line": 96,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 91,col 66)",
        "(line 92,col 9)-(line 95,col 58)"
      ]
    }
  ]
}