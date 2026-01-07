{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/interpolation/TricubicSplineInterpolatingFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TricubicSplineInterpolatingFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.TrivariateFunction"
      ],
      "begin_line": 39,
      "end_line": 412,
      "comment": "\n * Function that implements the\n * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Tricubic_interpolation\"\u003e\n * tricubic spline interpolation\u003c/a\u003e, as proposed in\n * \u003cquote\u003e\n *  Tricubic interpolation in three dimensions\u003cbr/\u003e\n *  F. Lekien and J. Marsden\u003cbr/\u003e\n *  \u003cem\u003eInt. J. Numer. Meth. Engng\u003c/em\u003e 2005; \u003cb\u003e63\u003c/b\u003e:455-471\n * \u003c/quote\u003e\n *\n * @since 2.2\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "AINV"
      ],
      "begin_line": 45,
      "end_line": 110,
      "comment": "\n     * Matrix to compute the spline coefficients from the function values\n     * and function derivatives values\n     "
    },
    {
      "type": "field",
      "varNames": [
        "xval"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": " Samples x-coordinates "
    },
    {
      "type": "field",
      "varNames": [
        "yval"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": " Samples y-coordinates "
    },
    {
      "type": "field",
      "varNames": [
        "zval"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": " Samples z-coordinates "
    },
    {
      "type": "field",
      "varNames": [
        "splines"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": " Set of cubic splines pacthing the whole data grid "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.interpolation.TricubicSplineInterpolatingFunction.TricubicSplineInterpolatingFunction(double[], double[], double[], double[][][], double[][][], double[][][], double[][][], double[][][], double[][][], double[][][], double[][][])",
      "begin_line": 137,
      "end_line": 299,
      "comment": "\n     * @param x Sample values of the x-coordinate, in increasing order.\n     * @param y Sample values of the y-coordinate, in increasing order.\n     * @param z Sample values of the y-coordinate, in increasing order.\n     * @param f Values of the function on every grid point.\n     * @param dFdX Values of the partial derivative of function with respect to x on every grid point.\n     * @param dFdY Values of the partial derivative of function with respect to y on every grid point.\n     * @param dFdZ Values of the partial derivative of function with respect to z on every grid point.\n     * @param d2FdXdY Values of the cross partial derivative of function on every grid point.\n     * @param d2FdXdZ Values of the cross partial derivative of function on every grid point.\n     * @param d2FdYdZ Values of the cross partial derivative of function on every grid point.\n     * @param d3FdXdYdZ Values of the cross partial derivative of function on every grid point.\n     * @throws NoDataException if any of the arrays has zero length.\n     * @throws DimensionMismatchException if the various arrays do not contain the expected number of elements.\n     * @throws NonMonotonicSequenceException if {@code x}, {@code y} or {@code z} are not strictly increasing.\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 34)",
        "(line 152,col 9)-(line 152,col 34)",
        "(line 153,col 9)-(line 153,col 34)",
        "(line 155,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 169,col 9)",
        "(line 170,col 9)-(line 172,col 9)",
        "(line 173,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 178,col 9)",
        "(line 179,col 9)-(line 181,col 9)",
        "(line 183,col 9)-(line 183,col 33)",
        "(line 184,col 9)-(line 184,col 33)",
        "(line 185,col 9)-(line 185,col 33)",
        "(line 187,col 9)-(line 187,col 25)",
        "(line 188,col 9)-(line 188,col 25)",
        "(line 189,col 9)-(line 189,col 25)",
        "(line 191,col 9)-(line 191,col 35)",
        "(line 192,col 9)-(line 192,col 35)",
        "(line 193,col 9)-(line 193,col 35)",
        "(line 194,col 9)-(line 194,col 66)",
        "(line 196,col 9)-(line 298,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.TricubicSplineInterpolatingFunction.value(double, double, double)",
      "begin_line": 306,
      "end_line": 326,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @throws OutOfRangeException if any of the variables is outside its interpolation range.\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 43)",
        "(line 309,col 9)-(line 311,col 9)",
        "(line 312,col 9)-(line 312,col 43)",
        "(line 313,col 9)-(line 315,col 9)",
        "(line 316,col 9)-(line 316,col 43)",
        "(line 317,col 9)-(line 319,col 9)",
        "(line 321,col 9)-(line 321,col 66)",
        "(line 322,col 9)-(line 322,col 66)",
        "(line 323,col 9)-(line 323,col 66)",
        "(line 325,col 9)-(line 325,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.TricubicSplineInterpolatingFunction.searchIndex(double, double[])",
      "begin_line": 334,
      "end_line": 347,
      "comment": "\n     * @param c Coordinate.\n     * @param val Coordinate samples.\n     * @return the index in {@code val} corresponding to the interval containing {@code c}, or {@code -1}\n     *   if {@code c} is out of the range defined by the end values of {@code val}.\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 337,col 9)",
        "(line 339,col 9)-(line 339,col 35)",
        "(line 340,col 9)-(line 344,col 9)",
        "(line 346,col 9)-(line 346,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.TricubicSplineInterpolatingFunction.computeSplineCoefficients(double[])",
      "begin_line": 397,
      "end_line": 411,
      "comment": "\n     * Compute the spline coefficients from the list of function values and\n     * function partial derivatives values at the four corners of a grid\n     * element. They must be specified in the following order:\n     * \u003cul\u003e\n     *  \u003cli\u003ef(0,0,0)\u003c/li\u003e\n     *  \u003cli\u003ef(1,0,0)\u003c/li\u003e\n     *  \u003cli\u003ef(0,1,0)\u003c/li\u003e\n     *  \u003cli\u003ef(1,1,0)\u003c/li\u003e\n     *  \u003cli\u003ef(0,0,1)\u003c/li\u003e\n     *  \u003cli\u003ef(1,0,1)\u003c/li\u003e\n     *  \u003cli\u003ef(0,1,1)\u003c/li\u003e\n     *  \u003cli\u003ef(1,1,1)\u003c/li\u003e\n     *\n     *  \u003cli\u003ef\u003csub\u003ex\u003c/sub\u003e(0,0,0)\u003c/li\u003e\n     *  \u003cli\u003e... \u003cem\u003e(same order as above)\u003c/em\u003e\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ex\u003c/sub\u003e(1,1,1)\u003c/li\u003e\n     *\n     *  \u003cli\u003ef\u003csub\u003ey\u003c/sub\u003e(0,0,0)\u003c/li\u003e\n     *  \u003cli\u003e... \u003cem\u003e(same order as above)\u003c/em\u003e\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ey\u003c/sub\u003e(1,1,1)\u003c/li\u003e\n     *\n     *  \u003cli\u003ef\u003csub\u003ez\u003c/sub\u003e(0,0,0)\u003c/li\u003e\n     *  \u003cli\u003e... \u003cem\u003e(same order as above)\u003c/em\u003e\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ez\u003c/sub\u003e(1,1,1)\u003c/li\u003e\n     *\n     *  \u003cli\u003ef\u003csub\u003exy\u003c/sub\u003e(0,0,0)\u003c/li\u003e\n     *  \u003cli\u003e... \u003cem\u003e(same order as above)\u003c/em\u003e\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003exy\u003c/sub\u003e(1,1,1)\u003c/li\u003e\n     *\n     *  \u003cli\u003ef\u003csub\u003exz\u003c/sub\u003e(0,0,0)\u003c/li\u003e\n     *  \u003cli\u003e... \u003cem\u003e(same order as above)\u003c/em\u003e\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003exz\u003c/sub\u003e(1,1,1)\u003c/li\u003e\n     *\n     *  \u003cli\u003ef\u003csub\u003eyz\u003c/sub\u003e(0,0,0)\u003c/li\u003e\n     *  \u003cli\u003e... \u003cem\u003e(same order as above)\u003c/em\u003e\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003eyz\u003c/sub\u003e(1,1,1)\u003c/li\u003e\n     *\n     *  \u003cli\u003ef\u003csub\u003exyz\u003c/sub\u003e(0,0,0)\u003c/li\u003e\n     *  \u003cli\u003e... \u003cem\u003e(same order as above)\u003c/em\u003e\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003exyz\u003c/sub\u003e(1,1,1)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * where the subscripts indicate the partial derivative with respect to\n     * the corresponding variable(s).\n     *\n     * @param beta List of function values and function partial derivatives values.\n     * @return the spline coefficients.\n     ",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 26)",
        "(line 399,col 9)-(line 399,col 42)",
        "(line 401,col 9)-(line 408,col 9)",
        "(line 410,col 9)-(line 410,col 17)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TricubicSplineFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.TrivariateFunction"
      ],
      "begin_line": 419,
      "end_line": 482,
      "comment": "\n * 3D-spline function.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "N"
      ],
      "begin_line": 422,
      "end_line": 422,
      "comment": " Number of points. "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 424,
      "end_line": 424,
      "comment": " Coefficients "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.interpolation.TricubicSplineFunction.TricubicSplineFunction(double[])",
      "begin_line": 429,
      "end_line": 437,
      "comment": "\n     * @param aV List of spline coefficients.\n     ",
      "child_ranges": [
        "(line 430,col 9)-(line 436,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.TricubicSplineFunction.value(double, double, double)",
      "begin_line": 447,
      "end_line": 481,
      "comment": "\n     * @param x x-coordinate of the interpolation point.\n     * @param y y-coordinate of the interpolation point.\n     * @param z z-coordinate of the interpolation point.\n     * @return the interpolated value.\n     * @throws OutOfRangeException if {@code x}, {@code y} or\n     * {@code z} are not in the interval {@code [0, 1]}.\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 451,col 9)",
        "(line 452,col 9)-(line 454,col 9)",
        "(line 455,col 9)-(line 457,col 9)",
        "(line 459,col 9)-(line 459,col 32)",
        "(line 460,col 9)-(line 460,col 33)",
        "(line 461,col 9)-(line 461,col 45)",
        "(line 463,col 9)-(line 463,col 32)",
        "(line 464,col 9)-(line 464,col 33)",
        "(line 465,col 9)-(line 465,col 45)",
        "(line 467,col 9)-(line 467,col 32)",
        "(line 468,col 9)-(line 468,col 33)",
        "(line 469,col 9)-(line 469,col 45)",
        "(line 471,col 9)-(line 471,col 26)",
        "(line 472,col 9)-(line 478,col 9)",
        "(line 480,col 9)-(line 480,col 22)"
      ]
    }
  ]
}