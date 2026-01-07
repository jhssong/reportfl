{
  "filepath": "/tmp/Math-54b/src/main/java/org/apache/commons/math/analysis/interpolation/UnivariateRealPeriodicInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnivariateRealPeriodicInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.interpolation.UnivariateRealInterpolator"
      ],
      "begin_line": 33,
      "end_line": 120,
      "comment": "\n * Adapter for class implementing the {@link UnivariateRealInterpolator}\n * interface.\n * The data to be interpolated is assumed to be periodic. Thus values that are\n * outside of the range can be passed to the interpolation function: They will\n * be wrapped into the initial range before being passed to the class that\n * actually computes the interpolation.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_EXTEND"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Default number of extension points of the samples array. "
    },
    {
      "type": "field",
      "varNames": [
        "interpolator"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Interpolator. "
    },
    {
      "type": "field",
      "varNames": [
        "period"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Period. "
    },
    {
      "type": "field",
      "varNames": [
        "extend"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Number of extension points. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.interpolation.UnivariateRealPeriodicInterpolator.UnivariateRealPeriodicInterpolator(org.apache.commons.math.analysis.interpolation.UnivariateRealInterpolator, double, int)",
      "begin_line": 55,
      "end_line": 61,
      "comment": "\n     * Builds an interpolator.\n     *\n     * @param interpolator Interpolator.\n     * @param period Period.\n     * @param extend Number of points to be appended at the beginning and\n     * end of the sample arrays in order to avoid interpolation failure at\n     * the (periodic) boundaries of the orginal interval. The value is the\n     * number of sample points which the original {@code interpolator} needs\n     * on each side of the interpolated point.\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 41)",
        "(line 59,col 9)-(line 59,col 29)",
        "(line 60,col 9)-(line 60,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.interpolation.UnivariateRealPeriodicInterpolator.UnivariateRealPeriodicInterpolator(org.apache.commons.math.analysis.interpolation.UnivariateRealInterpolator, double)",
      "begin_line": 71,
      "end_line": 74,
      "comment": "\n     * Builds an interpolator.\n     * Uses {@link #DEFAULT_EXTEND} as the number of extension points on each side\n     * of the original abscissae range.\n     *\n     * @param interpolator Interpolator.\n     * @param period Period.\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.UnivariateRealPeriodicInterpolator.interpolate(double[], double[])",
      "begin_line": 82,
      "end_line": 119,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @throws NumberIsTooSmallException if the number of extension points\n     * iss larger then the size of {@code xval}.\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 86,col 9)",
        "(line 88,col 9)-(line 88,col 35)",
        "(line 89,col 9)-(line 89,col 38)",
        "(line 91,col 9)-(line 91,col 49)",
        "(line 92,col 9)-(line 92,col 43)",
        "(line 93,col 9)-(line 93,col 43)",
        "(line 94,col 9)-(line 98,col 9)",
        "(line 101,col 9)-(line 109,col 9)",
        "(line 111,col 9)-(line 111,col 36)",
        "(line 113,col 9)-(line 113,col 72)",
        "(line 114,col 9)-(line 118,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.UnivariateRealPeriodicInterpolator.Anonymous-77565c28-e1d1-4b02-8926-8db00baec190.value(double)",
      "begin_line": 115,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 116,col 17)-(line 116,col 68)"
      ]
    }
  ]
}