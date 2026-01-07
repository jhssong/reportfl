{
  "filepath": "/tmp/Math-66b/src/main/java/org/apache/commons/math/analysis/interpolation/MicrosphereInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MicrosphereInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.interpolation.MultivariateRealInterpolator"
      ],
      "begin_line": 34,
      "end_line": 119,
      "comment": "\n * Interpolator that implements the algorithm described in\n * \u003cem\u003eWilliam Dudziak\u003c/em\u003e\u0027s\n * \u003ca href\u003d\"http://www.dudziak.com/microsphere.pdf\"\u003eMS thesis\u003c/a\u003e.\n * @since 2.1\n *\n * @version $Revision$ $Date$\n "
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
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * Default exponent used the weights calculation.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "microsphereElements"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * Number of surface elements of the microsphere.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "brightnessExponent"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n     * Exponent used in the power law that computes the weights of the\n     * sample data.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.interpolation.MicrosphereInterpolator.MicrosphereInterpolator()",
      "begin_line": 64,
      "end_line": 66,
      "comment": " Create a microsphere interpolator with default settings.\n     * \u003cp\u003eCalling this constructor is equivalent to call {@link\n     * #MicrosphereInterpolator(int, int)\n     * MicrosphereInterpolator(MicrosphereInterpolator.DEFAULT_MICROSPHERE_ELEMENTS,\n     * MicrosphereInterpolator.DEFAULT_BRIGHTNESS_EXPONENT)}.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 72)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.interpolation.MicrosphereInterpolator.MicrosphereInterpolator(int, int)",
      "begin_line": 75,
      "end_line": 79,
      "comment": " Create a microsphere interpolator.\n     * @param microsphereElements number of surface elements of the microsphere.\n     * @param brightnessExponent exponent used in the power law that computes the\n     * weights of the sample data.\n     * @throws NotPositiveException if {@code microsphereElements \u003c\u003d 0}\n     * or {@code brightnessExponent \u003c 0}.\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 52)",
        "(line 78,col 9)-(line 78,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.MicrosphereInterpolator.interpolate(double[][], double[])",
      "begin_line": 84,
      "end_line": 93,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 88,col 66)",
        "(line 89,col 9)-(line 92,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.MicrosphereInterpolator.setBrightnessExponent(int)",
      "begin_line": 101,
      "end_line": 106,
      "comment": "\n     * Set the brightness exponent.\n     * @param exponent Exponent for computing the distance dimming\n     * factor.\n     * @throws NotPositiveException if {@code exponent \u003c 0}.\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 105,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.MicrosphereInterpolator.setMicropshereElements(int)",
      "begin_line": 113,
      "end_line": 118,
      "comment": "\n     * Set the number of microsphere elements.\n     * @param elements Number of surface elements of the microsphere.\n     * @throws NotStrictlyPositiveException if {@code elements \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 117,col 39)"
      ]
    }
  ]
}