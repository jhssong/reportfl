{
  "filepath": "/tmp/Math-40b/src/main/java/org/apache/commons/math/analysis/interpolation/UnivariateRealPeriodicInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnivariateRealPeriodicInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.interpolation.UnivariateRealInterpolator"
      ],
      "begin_line": 34,
      "end_line": 121,
      "comment": "\n * Adapter for classes implementing the {@link UnivariateRealInterpolator}\n * interface.\n * The data to be interpolated is assumed to be periodic. Thus values that are\n * outside of the range can be passed to the interpolation function: They will\n * be wrapped into the initial range before being passed to the class that\n * actually computes the interpolation.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_EXTEND"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Default number of extension points of the samples array. "
    },
    {
      "type": "field",
      "varNames": [
        "interpolator"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Interpolator. "
    },
    {
      "type": "field",
      "varNames": [
        "period"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Period. "
    },
    {
      "type": "field",
      "varNames": [
        "extend"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Number of extension points. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.interpolation.UnivariateRealPeriodicInterpolator.UnivariateRealPeriodicInterpolator(org.apache.commons.math.analysis.interpolation.UnivariateRealInterpolator, double, int)",
      "begin_line": 56,
      "end_line": 62,
      "comment": "\n     * Builds an interpolator.\n     *\n     * @param interpolator Interpolator.\n     * @param period Period.\n     * @param extend Number of points to be appended at the beginning and\n     * end of the sample arrays in order to avoid interpolation failure at\n     * the (periodic) boundaries of the orginal interval. The value is the\n     * number of sample points which the original {@code interpolator} needs\n     * on each side of the interpolated point.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 41)",
        "(line 60,col 9)-(line 60,col 29)",
        "(line 61,col 9)-(line 61,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.interpolation.UnivariateRealPeriodicInterpolator.UnivariateRealPeriodicInterpolator(org.apache.commons.math.analysis.interpolation.UnivariateRealInterpolator, double)",
      "begin_line": 72,
      "end_line": 75,
      "comment": "\n     * Builds an interpolator.\n     * Uses {@link #DEFAULT_EXTEND} as the number of extension points on each side\n     * of the original abscissae range.\n     *\n     * @param interpolator Interpolator.\n     * @param period Period.\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.UnivariateRealPeriodicInterpolator.interpolate(double[], double[])",
      "begin_line": 83,
      "end_line": 120,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @throws NumberIsTooSmallException if the number of extension points\n     * iss larger then the size of {@code xval}.\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 87,col 9)",
        "(line 89,col 9)-(line 89,col 36)",
        "(line 90,col 9)-(line 90,col 38)",
        "(line 92,col 9)-(line 92,col 49)",
        "(line 93,col 9)-(line 93,col 43)",
        "(line 94,col 9)-(line 94,col 43)",
        "(line 95,col 9)-(line 99,col 9)",
        "(line 102,col 9)-(line 110,col 9)",
        "(line 112,col 9)-(line 112,col 37)",
        "(line 114,col 9)-(line 114,col 68)",
        "(line 115,col 9)-(line 119,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.UnivariateRealPeriodicInterpolator.Anonymous-6ef992d7-6636-45f4-b1f9-c3b93f8f1c74.value(double)",
      "begin_line": 116,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 117,col 17)-(line 117,col 68)"
      ]
    }
  ]
}