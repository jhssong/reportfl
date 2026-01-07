{
  "filepath": "/tmp/Math-67b/src/main/java/org/apache/commons/math/analysis/interpolation/SmoothingPolynomialBicubicSplineInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SmoothingPolynomialBicubicSplineInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.interpolation.BicubicSplineInterpolator"
      ],
      "begin_line": 35,
      "end_line": 138,
      "comment": "\n * Generates a bicubic interpolation function.\n * Prior to generating the interpolating function, the input is smoothed using\n * polynomial fitting.\n *\n * @version $Revision$ $Date$\n * @since 2.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "xFitter"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "yFitter"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.interpolation.SmoothingPolynomialBicubicSplineInterpolator.SmoothingPolynomialBicubicSplineInterpolator()",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * Default constructor. The degree of the fitting polynomials is set to 3.\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.interpolation.SmoothingPolynomialBicubicSplineInterpolator.SmoothingPolynomialBicubicSplineInterpolator(int)",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n     * @param degree Degree of the polynomial fitting functions.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.interpolation.SmoothingPolynomialBicubicSplineInterpolator.SmoothingPolynomialBicubicSplineInterpolator(int, int)",
      "begin_line": 60,
      "end_line": 64,
      "comment": "\n     * @param xDegree Degree of the polynomial fitting functions along the\n     * x-dimension.\n     * @param yDegree Degree of the polynomial fitting functions along the\n     * y-dimension.\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 81)",
        "(line 63,col 9)-(line 63,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.SmoothingPolynomialBicubicSplineInterpolator.interpolate(double[], double[], double[][])",
      "begin_line": 69,
      "end_line": 137,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 75,col 9)",
        "(line 76,col 9)-(line 78,col 9)",
        "(line 80,col 9)-(line 80,col 37)",
        "(line 81,col 9)-(line 81,col 37)",
        "(line 83,col 9)-(line 87,col 9)",
        "(line 89,col 9)-(line 89,col 35)",
        "(line 90,col 9)-(line 90,col 35)",
        "(line 94,col 9)-(line 94,col 73)",
        "(line 95,col 9)-(line 102,col 9)",
        "(line 106,col 9)-(line 106,col 57)",
        "(line 107,col 9)-(line 112,col 9)",
        "(line 116,col 9)-(line 116,col 73)",
        "(line 117,col 9)-(line 124,col 9)",
        "(line 128,col 9)-(line 128,col 57)",
        "(line 129,col 9)-(line 134,col 9)",
        "(line 136,col 9)-(line 136,col 53)"
      ]
    }
  ]
}