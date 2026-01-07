{
  "filepath": "/tmp/Math-14b/src/main/java/org/apache/commons/math3/analysis/interpolation/SmoothingPolynomialBicubicSplineInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SmoothingPolynomialBicubicSplineInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolator"
      ],
      "begin_line": 37,
      "end_line": 165,
      "comment": "\n * Generates a bicubic interpolation function.\n * Prior to generating the interpolating function, the input is smoothed using\n * polynomial fitting.\n *\n * @version $Id$\n * @since 2.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "xFitter"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Fitter for x. "
    },
    {
      "type": "field",
      "varNames": [
        "xDegree"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Degree of the fitting polynomial. "
    },
    {
      "type": "field",
      "varNames": [
        "yFitter"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Fitter for y. "
    },
    {
      "type": "field",
      "varNames": [
        "yDegree"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Degree of the fitting polynomial. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.interpolation.SmoothingPolynomialBicubicSplineInterpolator.SmoothingPolynomialBicubicSplineInterpolator()",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n     * Default constructor. The degree of the fitting polynomials is set to 3.\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.interpolation.SmoothingPolynomialBicubicSplineInterpolator.SmoothingPolynomialBicubicSplineInterpolator(int)",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * @param degree Degree of the polynomial fitting functions.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.interpolation.SmoothingPolynomialBicubicSplineInterpolator.SmoothingPolynomialBicubicSplineInterpolator(int, int)",
      "begin_line": 68,
      "end_line": 85,
      "comment": "\n     * @param xDegree Degree of the polynomial fitting functions along the\n     * x-dimension.\n     * @param yDegree Degree of the polynomial fitting functions along the\n     * y-dimension.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 72,col 9)",
        "(line 73,col 9)-(line 75,col 9)",
        "(line 76,col 9)-(line 76,col 31)",
        "(line 77,col 9)-(line 77,col 31)",
        "(line 79,col 9)-(line 79,col 38)",
        "(line 80,col 9)-(line 82,col 76)",
        "(line 83,col 9)-(line 83,col 81)",
        "(line 84,col 9)-(line 84,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.SmoothingPolynomialBicubicSplineInterpolator.interpolate(double[], double[], double[][])",
      "begin_line": 90,
      "end_line": 164,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 101,col 9)",
        "(line 103,col 9)-(line 103,col 37)",
        "(line 104,col 9)-(line 104,col 37)",
        "(line 106,col 9)-(line 110,col 9)",
        "(line 112,col 9)-(line 112,col 36)",
        "(line 113,col 9)-(line 113,col 36)",
        "(line 117,col 9)-(line 117,col 73)",
        "(line 118,col 9)-(line 127,col 9)",
        "(line 131,col 9)-(line 131,col 57)",
        "(line 132,col 9)-(line 137,col 9)",
        "(line 141,col 9)-(line 141,col 73)",
        "(line 142,col 9)-(line 151,col 9)",
        "(line 155,col 9)-(line 155,col 57)",
        "(line 156,col 9)-(line 161,col 9)",
        "(line 163,col 9)-(line 163,col 53)"
      ]
    }
  ]
}