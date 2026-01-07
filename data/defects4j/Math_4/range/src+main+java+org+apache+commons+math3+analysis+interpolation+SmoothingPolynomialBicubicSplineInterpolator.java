{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/interpolation/SmoothingPolynomialBicubicSplineInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SmoothingPolynomialBicubicSplineInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolator"
      ],
      "begin_line": 39,
      "end_line": 170,
      "comment": "\n * Generates a bicubic interpolation function.\n * Prior to generating the interpolating function, the input is smoothed using\n * polynomial fitting.\n *\n * @version $Id$\n * @since 2.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "xFitter"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Fitter for x. "
    },
    {
      "type": "field",
      "varNames": [
        "xDegree"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Degree of the fitting polynomial. "
    },
    {
      "type": "field",
      "varNames": [
        "yFitter"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Fitter for y. "
    },
    {
      "type": "field",
      "varNames": [
        "yDegree"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Degree of the fitting polynomial. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.interpolation.SmoothingPolynomialBicubicSplineInterpolator.SmoothingPolynomialBicubicSplineInterpolator()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * Default constructor. The degree of the fitting polynomials is set to 3.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.interpolation.SmoothingPolynomialBicubicSplineInterpolator.SmoothingPolynomialBicubicSplineInterpolator(int)",
      "begin_line": 61,
      "end_line": 64,
      "comment": "\n     * @param degree Degree of the polynomial fitting functions.\n     * @exception NotPositiveException if degree is not positive\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.interpolation.SmoothingPolynomialBicubicSplineInterpolator.SmoothingPolynomialBicubicSplineInterpolator(int, int)",
      "begin_line": 73,
      "end_line": 90,
      "comment": "\n     * @param xDegree Degree of the polynomial fitting functions along the\n     * x-dimension.\n     * @param yDegree Degree of the polynomial fitting functions along the\n     * y-dimension.\n     * @exception NotPositiveException if degrees are not positive\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 77,col 9)",
        "(line 78,col 9)-(line 80,col 9)",
        "(line 81,col 9)-(line 81,col 31)",
        "(line 82,col 9)-(line 82,col 31)",
        "(line 84,col 9)-(line 84,col 38)",
        "(line 85,col 9)-(line 87,col 76)",
        "(line 88,col 9)-(line 88,col 81)",
        "(line 89,col 9)-(line 89,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.SmoothingPolynomialBicubicSplineInterpolator.interpolate(double[], double[], double[][])",
      "begin_line": 95,
      "end_line": 169,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 106,col 9)",
        "(line 108,col 9)-(line 108,col 37)",
        "(line 109,col 9)-(line 109,col 37)",
        "(line 111,col 9)-(line 115,col 9)",
        "(line 117,col 9)-(line 117,col 36)",
        "(line 118,col 9)-(line 118,col 36)",
        "(line 122,col 9)-(line 122,col 73)",
        "(line 123,col 9)-(line 132,col 9)",
        "(line 136,col 9)-(line 136,col 57)",
        "(line 137,col 9)-(line 142,col 9)",
        "(line 146,col 9)-(line 146,col 73)",
        "(line 147,col 9)-(line 156,col 9)",
        "(line 160,col 9)-(line 160,col 57)",
        "(line 161,col 9)-(line 166,col 9)",
        "(line 168,col 9)-(line 168,col 53)"
      ]
    }
  ]
}