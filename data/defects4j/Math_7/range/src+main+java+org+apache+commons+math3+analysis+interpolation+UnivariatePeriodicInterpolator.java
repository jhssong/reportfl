{
  "filepath": "/tmp/Math-7b/src/main/java/org/apache/commons/math3/analysis/interpolation/UnivariatePeriodicInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnivariatePeriodicInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.interpolation.UnivariateInterpolator"
      ],
      "begin_line": 36,
      "end_line": 124,
      "comment": "\n * Adapter for classes implementing the {@link UnivariateInterpolator}\n * interface.\n * The data to be interpolated is assumed to be periodic. Thus values that are\n * outside of the range can be passed to the interpolation function: They will\n * be wrapped into the initial range before being passed to the class that\n * actually computes the interpolation.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_EXTEND"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Default number of extension points of the samples array. "
    },
    {
      "type": "field",
      "varNames": [
        "interpolator"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Interpolator. "
    },
    {
      "type": "field",
      "varNames": [
        "period"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Period. "
    },
    {
      "type": "field",
      "varNames": [
        "extend"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Number of extension points. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.interpolation.UnivariatePeriodicInterpolator.UnivariatePeriodicInterpolator(org.apache.commons.math3.analysis.interpolation.UnivariateInterpolator, double, int)",
      "begin_line": 58,
      "end_line": 64,
      "comment": "\n     * Builds an interpolator.\n     *\n     * @param interpolator Interpolator.\n     * @param period Period.\n     * @param extend Number of points to be appended at the beginning and\n     * end of the sample arrays in order to avoid interpolation failure at\n     * the (periodic) boundaries of the orginal interval. The value is the\n     * number of sample points which the original {@code interpolator} needs\n     * on each side of the interpolated point.\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 41)",
        "(line 62,col 9)-(line 62,col 29)",
        "(line 63,col 9)-(line 63,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.interpolation.UnivariatePeriodicInterpolator.UnivariatePeriodicInterpolator(org.apache.commons.math3.analysis.interpolation.UnivariateInterpolator, double)",
      "begin_line": 74,
      "end_line": 77,
      "comment": "\n     * Builds an interpolator.\n     * Uses {@link #DEFAULT_EXTEND} as the number of extension points on each side\n     * of the original abscissae range.\n     *\n     * @param interpolator Interpolator.\n     * @param period Period.\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.UnivariatePeriodicInterpolator.interpolate(double[], double[])",
      "begin_line": 85,
      "end_line": 123,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @throws NumberIsTooSmallException if the number of extension points\n     * iss larger then the size of {@code xval}.\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 90,col 9)",
        "(line 92,col 9)-(line 92,col 36)",
        "(line 93,col 9)-(line 93,col 38)",
        "(line 95,col 9)-(line 95,col 49)",
        "(line 96,col 9)-(line 96,col 43)",
        "(line 97,col 9)-(line 97,col 43)",
        "(line 98,col 9)-(line 102,col 9)",
        "(line 105,col 9)-(line 113,col 9)",
        "(line 115,col 9)-(line 115,col 37)",
        "(line 117,col 9)-(line 117,col 68)",
        "(line 118,col 9)-(line 122,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.UnivariatePeriodicInterpolator.Anonymous-f062092b-a379-40c7-8c36-a928c3f3477f.value(double)",
      "begin_line": 119,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 120,col 17)-(line 120,col 68)"
      ]
    }
  ]
}