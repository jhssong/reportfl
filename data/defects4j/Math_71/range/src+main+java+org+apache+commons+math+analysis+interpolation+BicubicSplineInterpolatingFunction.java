{
  "filepath": "/tmp/Math-71b/src/main/java/org/apache/commons/math/analysis/interpolation/BicubicSplineInterpolatingFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BicubicSplineInterpolatingFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.BivariateRealFunction"
      ],
      "begin_line": 32,
      "end_line": 225,
      "comment": "\n * Function that implements the\n * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Bicubic_interpolation\"\u003e\n * bicubic spline interpolation\u003c/a\u003e.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "aInv"
      ],
      "begin_line": 38,
      "end_line": 55,
      "comment": "\n     * Matrix to compute the spline coefficients from the function values\n     * and function derivatives values\n     "
    },
    {
      "type": "field",
      "varNames": [
        "xval"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Samples x-coordinates "
    },
    {
      "type": "field",
      "varNames": [
        "yval"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Samples y-coordinates "
    },
    {
      "type": "field",
      "varNames": [
        "splines"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Set of cubic splines pacthing the whole data grid "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineInterpolatingFunction.BicubicSplineInterpolatingFunction(double[], double[], double[][], double[][], double[][], double[][])",
      "begin_line": 79,
      "end_line": 141,
      "comment": "\n     * @param x Sample values of the x-coordinate, in increasing order\n     * @param y Sample values of the y-coordinate, in increasing order\n     * @param z Values of the function on every grid point\n     * @param dZdX Values of the partial derivative of function with respect\n     * to x on every grid point\n     * @param dZdY Values of the partial derivative of function with respect\n     * to y on every grid point\n     * @param dZdXdY Values of the cross partial derivative of function on\n     * every grid point\n     * @throws DimensionMismatchException if the various arrays do not contain\n     * the expected number of elements.\n     * @throws IllegalArgumentException if {@code x} or {@code y} are not strictly\n     * increasing.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 34)",
        "(line 87,col 9)-(line 87,col 34)",
        "(line 89,col 9)-(line 91,col 9)",
        "(line 92,col 9)-(line 94,col 9)",
        "(line 95,col 9)-(line 97,col 9)",
        "(line 98,col 9)-(line 100,col 9)",
        "(line 101,col 9)-(line 103,col 9)",
        "(line 105,col 9)-(line 105,col 41)",
        "(line 106,col 9)-(line 106,col 41)",
        "(line 108,col 9)-(line 108,col 25)",
        "(line 109,col 9)-(line 109,col 25)",
        "(line 111,col 9)-(line 111,col 35)",
        "(line 112,col 9)-(line 112,col 35)",
        "(line 113,col 9)-(line 113,col 58)",
        "(line 115,col 9)-(line 140,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineInterpolatingFunction.value(double, double)",
      "begin_line": 146,
      "end_line": 162,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 43)",
        "(line 148,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 152,col 43)",
        "(line 153,col 9)-(line 156,col 9)",
        "(line 158,col 9)-(line 158,col 66)",
        "(line 159,col 9)-(line 159,col 66)",
        "(line 161,col 9)-(line 161,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineInterpolatingFunction.searchIndex(double, double[])",
      "begin_line": 171,
      "end_line": 183,
      "comment": "\n     * @param c coordinate\n     * @param val coordinate samples\n     * @return the index in {@code val} corresponding to the interval\n     * containing {@code c}, or {@code -1} if {@code c} is out of the\n     * range defined by the end values of {@code val}\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 174,col 9)",
        "(line 176,col 9)-(line 180,col 9)",
        "(line 182,col 9)-(line 182,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineInterpolatingFunction.computeSplineCoefficients(double[])",
      "begin_line": 211,
      "end_line": 224,
      "comment": "\n     * Compute the spline coefficients from the list of function values and\n     * function partial derivatives values at the four corners of a grid\n     * element. They must be specified in the following order:\n     * \u003cul\u003e\n     *  \u003cli\u003ef(0,0)\u003c/li\u003e\n     *  \u003cli\u003ef(1,0)\u003c/li\u003e\n     *  \u003cli\u003ef(0,1)\u003c/li\u003e\n     *  \u003cli\u003ef(1,1)\u003c/li\u003e\n     *  \u003cli\u003efx(0,0)\u003c/li\u003e\n     *  \u003cli\u003efx(1,0)\u003c/li\u003e\n     *  \u003cli\u003efx(0,1)\u003c/li\u003e\n     *  \u003cli\u003efx(1,1)\u003c/li\u003e\n     *  \u003cli\u003efy(0,0)\u003c/li\u003e\n     *  \u003cli\u003efy(1,0)\u003c/li\u003e\n     *  \u003cli\u003efy(0,1)\u003c/li\u003e\n     *  \u003cli\u003efy(1,1)\u003c/li\u003e\n     *  \u003cli\u003efxy(0,0)\u003c/li\u003e\n     *  \u003cli\u003efxy(1,0)\u003c/li\u003e\n     *  \u003cli\u003efxy(0,1)\u003c/li\u003e\n     *  \u003cli\u003efxy(1,1)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @param beta List of function values and function partial derivatives\n     * values\n     * @return the spline coefficients\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 42)",
        "(line 214,col 9)-(line 221,col 9)",
        "(line 223,col 9)-(line 223,col 17)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BicubicSplineFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.BivariateRealFunction"
      ],
      "begin_line": 230,
      "end_line": 286,
      "comment": "\n * 2D-spline function.\n "
    },
    {
      "type": "field",
      "varNames": [
        "a00",
        "a01",
        "a02",
        "a03",
        "a10",
        "a11",
        "a12",
        "a13",
        "a20",
        "a21",
        "a22",
        "a23",
        "a30",
        "a31",
        "a32",
        "a33"
      ],
      "begin_line": 233,
      "end_line": 237,
      "comment": " Coefficients "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.BicubicSplineFunction(double[])",
      "begin_line": 242,
      "end_line": 259,
      "comment": "\n     * @param a Spline coefficients\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 24)",
        "(line 244,col 9)-(line 244,col 24)",
        "(line 245,col 9)-(line 245,col 24)",
        "(line 246,col 9)-(line 246,col 24)",
        "(line 247,col 9)-(line 247,col 24)",
        "(line 248,col 9)-(line 248,col 24)",
        "(line 249,col 9)-(line 249,col 24)",
        "(line 250,col 9)-(line 250,col 24)",
        "(line 251,col 9)-(line 251,col 24)",
        "(line 252,col 9)-(line 252,col 24)",
        "(line 253,col 9)-(line 253,col 25)",
        "(line 254,col 9)-(line 254,col 25)",
        "(line 255,col 9)-(line 255,col 25)",
        "(line 256,col 9)-(line 256,col 25)",
        "(line 257,col 9)-(line 257,col 25)",
        "(line 258,col 9)-(line 258,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.value(double, double)",
      "begin_line": 266,
      "end_line": 285,
      "comment": "\n     * @param x x-coordinate of the interpolation point\n     * @param y y-coordinate of the interpolation point\n     * @return the interpolated value.\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 270,col 9)",
        "(line 271,col 9)-(line 274,col 9)",
        "(line 276,col 9)-(line 276,col 32)",
        "(line 277,col 9)-(line 277,col 33)",
        "(line 278,col 9)-(line 278,col 32)",
        "(line 279,col 9)-(line 279,col 33)",
        "(line 281,col 9)-(line 284,col 70)"
      ]
    }
  ]
}