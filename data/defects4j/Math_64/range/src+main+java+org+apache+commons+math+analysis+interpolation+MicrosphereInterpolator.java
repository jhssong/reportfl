{
  "filepath": "/tmp/Math-64b/src/main/java/org/apache/commons/math/analysis/interpolation/MicrosphereInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MicrosphereInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.interpolation.MultivariateRealInterpolator"
      ],
      "begin_line": 33,
      "end_line": 118,
      "comment": "\n * Interpolator that implements the algorithm described in\n * \u003cem\u003eWilliam Dudziak\u003c/em\u003e\u0027s\n * \u003ca href\u003d\"http://www.dudziak.com/microsphere.pdf\"\u003eMS thesis\u003c/a\u003e.\n * @since 2.1\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MICROSPHERE_ELEMENTS"
      ],
      "begin_line": 39,
      "end_line": 39,
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
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * Number of surface elements of the microsphere.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "brightnessExponent"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": "\n     * Exponent used in the power law that computes the weights of the\n     * sample data.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.interpolation.MicrosphereInterpolator.MicrosphereInterpolator()",
      "begin_line": 63,
      "end_line": 65,
      "comment": " Create a microsphere interpolator with default settings.\n     * \u003cp\u003eCalling this constructor is equivalent to call {@link\n     * #MicrosphereInterpolator(int, int)\n     * MicrosphereInterpolator(MicrosphereInterpolator.DEFAULT_MICROSPHERE_ELEMENTS,\n     * MicrosphereInterpolator.DEFAULT_BRIGHTNESS_EXPONENT)}.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 72)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.interpolation.MicrosphereInterpolator.MicrosphereInterpolator(int, int)",
      "begin_line": 74,
      "end_line": 78,
      "comment": " Create a microsphere interpolator.\n     * @param microsphereElements number of surface elements of the microsphere.\n     * @param brightnessExponent exponent used in the power law that computes the\n     * weights of the sample data.\n     * @throws NotPositiveException if {@code microsphereElements \u003c\u003d 0}\n     * or {@code brightnessExponent \u003c 0}.\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 52)",
        "(line 77,col 9)-(line 77,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.MicrosphereInterpolator.interpolate(double[][], double[])",
      "begin_line": 83,
      "end_line": 92,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 87,col 66)",
        "(line 88,col 9)-(line 91,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.MicrosphereInterpolator.setBrightnessExponent(int)",
      "begin_line": 100,
      "end_line": 105,
      "comment": "\n     * Set the brightness exponent.\n     * @param exponent Exponent for computing the distance dimming\n     * factor.\n     * @throws NotPositiveException if {@code exponent \u003c 0}.\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 104,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.MicrosphereInterpolator.setMicropshereElements(int)",
      "begin_line": 112,
      "end_line": 117,
      "comment": "\n     * Set the number of microsphere elements.\n     * @param elements Number of surface elements of the microsphere.\n     * @throws NotStrictlyPositiveException if {@code elements \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 115,col 9)",
        "(line 116,col 9)-(line 116,col 39)"
      ]
    }
  ]
}