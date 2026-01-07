{
  "filepath": "/tmp/Math-26b/src/main/java/org/apache/commons/math3/analysis/interpolation/TricubicSplineInterpolatingFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TricubicSplineInterpolatingFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.TrivariateFunction"
      ],
      "begin_line": 38,
      "end_line": 416,
      "comment": "\n * Function that implements the\n * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Tricubic_interpolation\"\u003e\n * tricubic spline interpolation\u003c/a\u003e, as proposed in\n * \u003cquote\u003e\n *  Tricubic interpolation in three dimensions\u003cbr/\u003e\n *  F. Lekien and J. Marsden\u003cbr/\u003e\n *  \u003cem\u003eInt. J. Numer. Meth. Engng\u003c/em\u003e 2005; \u003cb\u003e63\u003c/b\u003e:455-471\n * \u003c/quote\u003e\n *\n * @since 2.2\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "AINV"
      ],
      "begin_line": 44,
      "end_line": 109,
      "comment": "\n     * Matrix to compute the spline coefficients from the function values\n     * and function derivatives values\n     "
    },
    {
      "type": "field",
      "varNames": [
        "xval"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " Samples x-coordinates "
    },
    {
      "type": "field",
      "varNames": [
        "yval"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": " Samples y-coordinates "
    },
    {
      "type": "field",
      "varNames": [
        "zval"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": " Samples z-coordinates "
    },
    {
      "type": "field",
      "varNames": [
        "splines"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": " Set of cubic splines pacthing the whole data grid "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.interpolation.TricubicSplineInterpolatingFunction.TricubicSplineInterpolatingFunction(double[], double[], double[], double[][][], double[][][], double[][][], double[][][], double[][][], double[][][], double[][][], double[][][])",
      "begin_line": 145,
      "end_line": 304,
      "comment": "\n     * @param x Sample values of the x-coordinate, in increasing order.\n     * @param y Sample values of the y-coordinate, in increasing order.\n     * @param z Sample values of the y-coordinate, in increasing order.\n     * @param f Values of the function on every grid point.\n     * @param dFdX Values of the partial derivative of function with respect\n     * to x on every grid point.\n     * @param dFdY Values of the partial derivative of function with respect\n     * to y on every grid point.\n     * @param dFdZ Values of the partial derivative of function with respect\n     * to z on every grid point.\n     * @param d2FdXdY Values of the cross partial derivative of function on\n     * every grid point.\n     * @param d2FdXdZ Values of the cross partial derivative of function on\n     * every grid point.\n     * @param d2FdYdZ Values of the cross partial derivative of function on\n     * every grid point.\n     * @param d3FdXdYdZ Values of the cross partial derivative of function on\n     * every grid point.\n     * @throws NoDataException if any of the arrays has zero length.\n     * @throws DimensionMismatchException if the various arrays do not contain\n     * the expected number of elements.\n     * @throws IllegalArgumentException if {@code x}, {@code y} or {@code z}\n     * are not strictly increasing.\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 34)",
        "(line 157,col 9)-(line 157,col 34)",
        "(line 158,col 9)-(line 158,col 34)",
        "(line 160,col 9)-(line 162,col 9)",
        "(line 163,col 9)-(line 165,col 9)",
        "(line 166,col 9)-(line 168,col 9)",
        "(line 169,col 9)-(line 171,col 9)",
        "(line 172,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 177,col 9)",
        "(line 178,col 9)-(line 180,col 9)",
        "(line 181,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 186,col 9)",
        "(line 188,col 9)-(line 188,col 33)",
        "(line 189,col 9)-(line 189,col 33)",
        "(line 190,col 9)-(line 190,col 33)",
        "(line 192,col 9)-(line 192,col 25)",
        "(line 193,col 9)-(line 193,col 25)",
        "(line 194,col 9)-(line 194,col 25)",
        "(line 196,col 9)-(line 196,col 35)",
        "(line 197,col 9)-(line 197,col 35)",
        "(line 198,col 9)-(line 198,col 35)",
        "(line 199,col 9)-(line 199,col 66)",
        "(line 201,col 9)-(line 303,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.TricubicSplineInterpolatingFunction.value(double, double, double)",
      "begin_line": 309,
      "end_line": 328,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 43)",
        "(line 311,col 9)-(line 313,col 9)",
        "(line 314,col 9)-(line 314,col 43)",
        "(line 315,col 9)-(line 317,col 9)",
        "(line 318,col 9)-(line 318,col 43)",
        "(line 319,col 9)-(line 321,col 9)",
        "(line 323,col 9)-(line 323,col 66)",
        "(line 324,col 9)-(line 324,col 66)",
        "(line 325,col 9)-(line 325,col 66)",
        "(line 327,col 9)-(line 327,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.TricubicSplineInterpolatingFunction.searchIndex(double, double[])",
      "begin_line": 337,
      "end_line": 350,
      "comment": "\n     * @param c Coordinate.\n     * @param val Coordinate samples.\n     * @return the index in {@code val} corresponding to the interval\n     * containing {@code c}, or {@code -1} if {@code c} is out of the\n     * range defined by the end values of {@code val}.\n     ",
      "child_ranges": [
        "(line 338,col 9)-(line 340,col 9)",
        "(line 342,col 9)-(line 342,col 35)",
        "(line 343,col 9)-(line 347,col 9)",
        "(line 349,col 9)-(line 349,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.TricubicSplineInterpolatingFunction.computeSplineCoefficients(double[])",
      "begin_line": 401,
      "end_line": 415,
      "comment": "\n     * Compute the spline coefficients from the list of function values and\n     * function partial derivatives values at the four corners of a grid\n     * element. They must be specified in the following order:\n     * \u003cul\u003e\n     *  \u003cli\u003ef(0,0,0)\u003c/li\u003e\n     *  \u003cli\u003ef(1,0,0)\u003c/li\u003e\n     *  \u003cli\u003ef(0,1,0)\u003c/li\u003e\n     *  \u003cli\u003ef(1,1,0)\u003c/li\u003e\n     *  \u003cli\u003ef(0,0,1)\u003c/li\u003e\n     *  \u003cli\u003ef(1,0,1)\u003c/li\u003e\n     *  \u003cli\u003ef(0,1,1)\u003c/li\u003e\n     *  \u003cli\u003ef(1,1,1)\u003c/li\u003e\n     *\n     *  \u003cli\u003ef\u003csub\u003ex\u003c/sub\u003e(0,0,0)\u003c/li\u003e\n     *  \u003cli\u003e... \u003cem\u003e(same order as above)\u003c/em\u003e\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ex\u003c/sub\u003e(1,1,1)\u003c/li\u003e\n     *\n     *  \u003cli\u003ef\u003csub\u003ey\u003c/sub\u003e(0,0,0)\u003c/li\u003e\n     *  \u003cli\u003e... \u003cem\u003e(same order as above)\u003c/em\u003e\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ey\u003c/sub\u003e(1,1,1)\u003c/li\u003e\n     *\n     *  \u003cli\u003ef\u003csub\u003ez\u003c/sub\u003e(0,0,0)\u003c/li\u003e\n     *  \u003cli\u003e... \u003cem\u003e(same order as above)\u003c/em\u003e\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ez\u003c/sub\u003e(1,1,1)\u003c/li\u003e\n     *\n     *  \u003cli\u003ef\u003csub\u003exy\u003c/sub\u003e(0,0,0)\u003c/li\u003e\n     *  \u003cli\u003e... \u003cem\u003e(same order as above)\u003c/em\u003e\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003exy\u003c/sub\u003e(1,1,1)\u003c/li\u003e\n     *\n     *  \u003cli\u003ef\u003csub\u003exz\u003c/sub\u003e(0,0,0)\u003c/li\u003e\n     *  \u003cli\u003e... \u003cem\u003e(same order as above)\u003c/em\u003e\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003exz\u003c/sub\u003e(1,1,1)\u003c/li\u003e\n     *\n     *  \u003cli\u003ef\u003csub\u003eyz\u003c/sub\u003e(0,0,0)\u003c/li\u003e\n     *  \u003cli\u003e... \u003cem\u003e(same order as above)\u003c/em\u003e\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003eyz\u003c/sub\u003e(1,1,1)\u003c/li\u003e\n     *\n     *  \u003cli\u003ef\u003csub\u003exyz\u003c/sub\u003e(0,0,0)\u003c/li\u003e\n     *  \u003cli\u003e... \u003cem\u003e(same order as above)\u003c/em\u003e\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003exyz\u003c/sub\u003e(1,1,1)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * where the subscripts indicate the partial derivative with respect to\n     * the corresponding variable(s).\n     *\n     * @param beta List of function values and function partial derivatives\n     * values.\n     * @return the spline coefficients.\n     ",
      "child_ranges": [
        "(line 402,col 9)-(line 402,col 26)",
        "(line 403,col 9)-(line 403,col 42)",
        "(line 405,col 9)-(line 412,col 9)",
        "(line 414,col 9)-(line 414,col 17)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TricubicSplineFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.TrivariateFunction"
      ],
      "begin_line": 423,
      "end_line": 483,
      "comment": "\n * 3D-spline function.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "N"
      ],
      "begin_line": 426,
      "end_line": 426,
      "comment": " Number of points. "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 428,
      "end_line": 428,
      "comment": " Coefficients "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.interpolation.TricubicSplineFunction.TricubicSplineFunction(double[])",
      "begin_line": 433,
      "end_line": 441,
      "comment": "\n     * @param aV List of spline coefficients.\n     ",
      "child_ranges": [
        "(line 434,col 9)-(line 440,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.TricubicSplineFunction.value(double, double, double)",
      "begin_line": 449,
      "end_line": 482,
      "comment": "\n     * @param x x-coordinate of the interpolation point.\n     * @param y y-coordinate of the interpolation point.\n     * @param z z-coordinate of the interpolation point.\n     * @return the interpolated value.\n     ",
      "child_ranges": [
        "(line 450,col 9)-(line 452,col 9)",
        "(line 453,col 9)-(line 455,col 9)",
        "(line 456,col 9)-(line 458,col 9)",
        "(line 460,col 9)-(line 460,col 32)",
        "(line 461,col 9)-(line 461,col 33)",
        "(line 462,col 9)-(line 462,col 45)",
        "(line 464,col 9)-(line 464,col 32)",
        "(line 465,col 9)-(line 465,col 33)",
        "(line 466,col 9)-(line 466,col 45)",
        "(line 468,col 9)-(line 468,col 32)",
        "(line 469,col 9)-(line 469,col 33)",
        "(line 470,col 9)-(line 470,col 45)",
        "(line 472,col 9)-(line 472,col 26)",
        "(line 473,col 9)-(line 479,col 9)",
        "(line 481,col 9)-(line 481,col 22)"
      ]
    }
  ]
}