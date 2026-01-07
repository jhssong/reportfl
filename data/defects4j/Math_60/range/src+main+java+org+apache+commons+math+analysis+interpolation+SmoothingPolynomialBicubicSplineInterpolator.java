{
  "filepath": "/tmp/Math-60b/src/main/java/org/apache/commons/math/analysis/interpolation/SmoothingPolynomialBicubicSplineInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SmoothingPolynomialBicubicSplineInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.interpolation.BicubicSplineInterpolator"
      ],
      "begin_line": 35,
      "end_line": 143,
      "comment": "\n * Generates a bicubic interpolation function.\n * Prior to generating the interpolating function, the input is smoothed using\n * polynomial fitting.\n *\n * @version $Revision$ $Date$\n * @since 2.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "xFitter"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Fitter for x. "
    },
    {
      "type": "field",
      "varNames": [
        "yFitter"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Fitter for y. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.interpolation.SmoothingPolynomialBicubicSplineInterpolator.SmoothingPolynomialBicubicSplineInterpolator()",
      "begin_line": 47,
      "end_line": 49,
      "comment": "\n     * Default constructor. The degree of the fitting polynomials is set to 3.\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.interpolation.SmoothingPolynomialBicubicSplineInterpolator.SmoothingPolynomialBicubicSplineInterpolator(int)",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * @param degree Degree of the polynomial fitting functions.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.interpolation.SmoothingPolynomialBicubicSplineInterpolator.SmoothingPolynomialBicubicSplineInterpolator(int, int)",
      "begin_line": 64,
      "end_line": 68,
      "comment": "\n     * @param xDegree Degree of the polynomial fitting functions along the\n     * x-dimension.\n     * @param yDegree Degree of the polynomial fitting functions along the\n     * y-dimension.\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 81)",
        "(line 67,col 9)-(line 67,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.SmoothingPolynomialBicubicSplineInterpolator.interpolate(double[], double[], double[][])",
      "begin_line": 73,
      "end_line": 142,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 80,col 9)",
        "(line 81,col 9)-(line 83,col 9)",
        "(line 85,col 9)-(line 85,col 37)",
        "(line 86,col 9)-(line 86,col 37)",
        "(line 88,col 9)-(line 92,col 9)",
        "(line 94,col 9)-(line 94,col 35)",
        "(line 95,col 9)-(line 95,col 35)",
        "(line 99,col 9)-(line 99,col 73)",
        "(line 100,col 9)-(line 107,col 9)",
        "(line 111,col 9)-(line 111,col 57)",
        "(line 112,col 9)-(line 117,col 9)",
        "(line 121,col 9)-(line 121,col 73)",
        "(line 122,col 9)-(line 129,col 9)",
        "(line 133,col 9)-(line 133,col 57)",
        "(line 134,col 9)-(line 139,col 9)",
        "(line 141,col 9)-(line 141,col 53)"
      ]
    }
  ]
}