{
  "filepath": "/tmp/Math-15b/src/main/java/org/apache/commons/math3/analysis/interpolation/SmoothingPolynomialBicubicSplineInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SmoothingPolynomialBicubicSplineInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolator"
      ],
      "begin_line": 34,
      "end_line": 141,
      "comment": "\n * Generates a bicubic interpolation function.\n * Prior to generating the interpolating function, the input is smoothed using\n * polynomial fitting.\n *\n * @version $Id$\n * @since 2.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "xFitter"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Fitter for x. "
    },
    {
      "type": "field",
      "varNames": [
        "yFitter"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Fitter for y. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.interpolation.SmoothingPolynomialBicubicSplineInterpolator.SmoothingPolynomialBicubicSplineInterpolator()",
      "begin_line": 44,
      "end_line": 46,
      "comment": "\n     * Default constructor. The degree of the fitting polynomials is set to 3.\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.interpolation.SmoothingPolynomialBicubicSplineInterpolator.SmoothingPolynomialBicubicSplineInterpolator(int)",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n     * @param degree Degree of the polynomial fitting functions.\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.interpolation.SmoothingPolynomialBicubicSplineInterpolator.SmoothingPolynomialBicubicSplineInterpolator(int, int)",
      "begin_line": 61,
      "end_line": 65,
      "comment": "\n     * @param xDegree Degree of the polynomial fitting functions along the\n     * x-dimension.\n     * @param yDegree Degree of the polynomial fitting functions along the\n     * y-dimension.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 81)",
        "(line 64,col 9)-(line 64,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.SmoothingPolynomialBicubicSplineInterpolator.interpolate(double[], double[], double[][])",
      "begin_line": 70,
      "end_line": 140,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 78,col 9)",
        "(line 79,col 9)-(line 81,col 9)",
        "(line 83,col 9)-(line 83,col 37)",
        "(line 84,col 9)-(line 84,col 37)",
        "(line 86,col 9)-(line 90,col 9)",
        "(line 92,col 9)-(line 92,col 36)",
        "(line 93,col 9)-(line 93,col 36)",
        "(line 97,col 9)-(line 97,col 73)",
        "(line 98,col 9)-(line 105,col 9)",
        "(line 109,col 9)-(line 109,col 57)",
        "(line 110,col 9)-(line 115,col 9)",
        "(line 119,col 9)-(line 119,col 73)",
        "(line 120,col 9)-(line 127,col 9)",
        "(line 131,col 9)-(line 131,col 57)",
        "(line 132,col 9)-(line 137,col 9)",
        "(line 139,col 9)-(line 139,col 53)"
      ]
    }
  ]
}