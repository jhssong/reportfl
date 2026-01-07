{
  "filepath": "/tmp/Math-7b/src/main/java/org/apache/commons/math3/analysis/interpolation/BicubicSplineInterpolatingFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BicubicSplineInterpolatingFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.BivariateFunction"
      ],
      "begin_line": 34,
      "end_line": 358,
      "comment": "\n * Function that implements the\n * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Bicubic_interpolation\"\u003e\n * bicubic spline interpolation\u003c/a\u003e.\n *\n * @since 2.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "AINV"
      ],
      "begin_line": 40,
      "end_line": 57,
      "comment": "\n     * Matrix to compute the spline coefficients from the function values\n     * and function derivatives values\n     "
    },
    {
      "type": "field",
      "varNames": [
        "xval"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Samples x-coordinates "
    },
    {
      "type": "field",
      "varNames": [
        "yval"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Samples y-coordinates "
    },
    {
      "type": "field",
      "varNames": [
        "splines"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Set of cubic splines patching the whole data grid "
    },
    {
      "type": "field",
      "varNames": [
        "partialDerivatives"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": "\n     * Partial derivatives\n     * The value of the first index determines the kind of derivatives:\n     * 0 \u003d first partial derivatives wrt x\n     * 1 \u003d first partial derivatives wrt y\n     * 2 \u003d second partial derivatives wrt x\n     * 3 \u003d second partial derivatives wrt y\n     * 4 \u003d cross partial derivatives\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunction.BicubicSplineInterpolatingFunction(double[], double[], double[][], double[][], double[][], double[][])",
      "begin_line": 92,
      "end_line": 156,
      "comment": "\n     * @param x Sample values of the x-coordinate, in increasing order.\n     * @param y Sample values of the y-coordinate, in increasing order.\n     * @param f Values of the function on every grid point.\n     * @param dFdX Values of the partial derivative of function with respect\n     * to x on every grid point.\n     * @param dFdY Values of the partial derivative of function with respect\n     * to y on every grid point.\n     * @param d2FdXdY Values of the cross partial derivative of function on\n     * every grid point.\n     * @throws DimensionMismatchException if the various arrays do not contain\n     * the expected number of elements.\n     * @throws NonMonotonicSequenceException if {@code x} or {@code y} are\n     * not strictly increasing.\n     * @throws NoDataException if any of the arrays has zero length.\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 34)",
        "(line 102,col 9)-(line 102,col 34)",
        "(line 104,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 109,col 9)",
        "(line 110,col 9)-(line 112,col 9)",
        "(line 113,col 9)-(line 115,col 9)",
        "(line 116,col 9)-(line 118,col 9)",
        "(line 120,col 9)-(line 120,col 33)",
        "(line 121,col 9)-(line 121,col 33)",
        "(line 123,col 9)-(line 123,col 25)",
        "(line 124,col 9)-(line 124,col 25)",
        "(line 126,col 9)-(line 126,col 35)",
        "(line 127,col 9)-(line 127,col 35)",
        "(line 128,col 9)-(line 128,col 58)",
        "(line 130,col 9)-(line 155,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunction.value(double, double)",
      "begin_line": 161,
      "end_line": 176,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 43)",
        "(line 164,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 167,col 43)",
        "(line 168,col 9)-(line 170,col 9)",
        "(line 172,col 9)-(line 172,col 66)",
        "(line 173,col 9)-(line 173,col 66)",
        "(line 175,col 9)-(line 175,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunction.partialDerivativeX(double, double)",
      "begin_line": 187,
      "end_line": 190,
      "comment": "\n     * @param x x-coordinate.\n     * @param y y-coordinate.\n     * @return the value at point (x, y) of the first partial derivative with\n     * respect to x.\n     * @throws OutOfRangeException if {@code x} (resp. {@code y}) is outside\n     * the range defined by the boundary values of {@code xval} (resp.\n     * {@code yval}).\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunction.partialDerivativeY(double, double)",
      "begin_line": 200,
      "end_line": 203,
      "comment": "\n     * @param x x-coordinate.\n     * @param y y-coordinate.\n     * @return the value at point (x, y) of the first partial derivative with\n     * respect to y.\n     * @throws OutOfRangeException if {@code x} (resp. {@code y}) is outside\n     * the range defined by the boundary values of {@code xval} (resp.\n     * {@code yval}).\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunction.partialDerivativeXX(double, double)",
      "begin_line": 213,
      "end_line": 216,
      "comment": "\n     * @param x x-coordinate.\n     * @param y y-coordinate.\n     * @return the value at point (x, y) of the second partial derivative with\n     * respect to x.\n     * @throws OutOfRangeException if {@code x} (resp. {@code y}) is outside\n     * the range defined by the boundary values of {@code xval} (resp.\n     * {@code yval}).\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunction.partialDerivativeYY(double, double)",
      "begin_line": 226,
      "end_line": 229,
      "comment": "\n     * @param x x-coordinate.\n     * @param y y-coordinate.\n     * @return the value at point (x, y) of the second partial derivative with\n     * respect to y.\n     * @throws OutOfRangeException if {@code x} (resp. {@code y}) is outside\n     * the range defined by the boundary values of {@code xval} (resp.\n     * {@code yval}).\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunction.partialDerivativeXY(double, double)",
      "begin_line": 238,
      "end_line": 241,
      "comment": "\n     * @param x x-coordinate.\n     * @param y y-coordinate.\n     * @return the value at point (x, y) of the second partial cross-derivative.\n     * @throws OutOfRangeException if {@code x} (resp. {@code y}) is outside\n     * the range defined by the boundary values of {@code xval} (resp.\n     * {@code yval}).\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunction.partialDerivative(int, double, double)",
      "begin_line": 252,
      "end_line": 271,
      "comment": "\n     * @param which First index in {@link #partialDerivatives}.\n     * @param x x-coordinate.\n     * @param y y-coordinate.\n     * @return the value at point (x, y) of the selected partial derivative.\n     * @throws OutOfRangeException if {@code x} (resp. {@code y}) is outside\n     * the range defined by the boundary values of {@code xval} (resp.\n     * {@code yval}).\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 256,col 9)",
        "(line 258,col 9)-(line 258,col 43)",
        "(line 259,col 9)-(line 261,col 9)",
        "(line 262,col 9)-(line 262,col 43)",
        "(line 263,col 9)-(line 265,col 9)",
        "(line 267,col 9)-(line 267,col 66)",
        "(line 268,col 9)-(line 268,col 66)",
        "(line 270,col 9)-(line 270,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunction.computePartialDerivatives()",
      "begin_line": 276,
      "end_line": 291,
      "comment": "\n     * Compute all partial derivatives.\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 42)",
        "(line 278,col 9)-(line 278,col 42)",
        "(line 279,col 9)-(line 279,col 68)",
        "(line 281,col 9)-(line 290,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunction.searchIndex(double, double[])",
      "begin_line": 300,
      "end_line": 313,
      "comment": "\n     * @param c Coordinate.\n     * @param val Coordinate samples.\n     * @return the index in {@code val} corresponding to the interval\n     * containing {@code c}, or {@code -1} if {@code c} is out of the\n     * range defined by the boundary values of {@code val}.\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 303,col 9)",
        "(line 305,col 9)-(line 305,col 35)",
        "(line 306,col 9)-(line 310,col 9)",
        "(line 312,col 9)-(line 312,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunction.computeSplineCoefficients(double[])",
      "begin_line": 344,
      "end_line": 357,
      "comment": "\n     * Compute the spline coefficients from the list of function values and\n     * function partial derivatives values at the four corners of a grid\n     * element. They must be specified in the following order:\n     * \u003cul\u003e\n     *  \u003cli\u003ef(0,0)\u003c/li\u003e\n     *  \u003cli\u003ef(1,0)\u003c/li\u003e\n     *  \u003cli\u003ef(0,1)\u003c/li\u003e\n     *  \u003cli\u003ef(1,1)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ex\u003c/sub\u003e(0,0)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ex\u003c/sub\u003e(1,0)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ex\u003c/sub\u003e(0,1)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ex\u003c/sub\u003e(1,1)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ey\u003c/sub\u003e(0,0)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ey\u003c/sub\u003e(1,0)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ey\u003c/sub\u003e(0,1)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ey\u003c/sub\u003e(1,1)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003exy\u003c/sub\u003e(0,0)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003exy\u003c/sub\u003e(1,0)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003exy\u003c/sub\u003e(0,1)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003exy\u003c/sub\u003e(1,1)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * where the subscripts indicate the partial derivative with respect to\n     * the corresponding variable(s).\n     *\n     * @param beta List of function values and function partial derivatives\n     * values.\n     * @return the spline coefficients.\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 42)",
        "(line 347,col 9)-(line 354,col 9)",
        "(line 356,col 9)-(line 356,col 17)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BicubicSplineFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.BivariateFunction"
      ],
      "begin_line": 365,
      "end_line": 573,
      "comment": "\n * 2D-spline function.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "N"
      ],
      "begin_line": 369,
      "end_line": 369,
      "comment": " Number of points. "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 372,
      "end_line": 372,
      "comment": " Coefficients "
    },
    {
      "type": "field",
      "varNames": [
        "partialDerivativeX"
      ],
      "begin_line": 375,
      "end_line": 375,
      "comment": " First partial derivative along x. "
    },
    {
      "type": "field",
      "varNames": [
        "partialDerivativeY"
      ],
      "begin_line": 378,
      "end_line": 378,
      "comment": " First partial derivative along y. "
    },
    {
      "type": "field",
      "varNames": [
        "partialDerivativeXX"
      ],
      "begin_line": 381,
      "end_line": 381,
      "comment": " Second partial derivative along x. "
    },
    {
      "type": "field",
      "varNames": [
        "partialDerivativeYY"
      ],
      "begin_line": 384,
      "end_line": 384,
      "comment": " Second partial derivative along y. "
    },
    {
      "type": "field",
      "varNames": [
        "partialDerivativeXY"
      ],
      "begin_line": 387,
      "end_line": 387,
      "comment": " Second crossed partial derivative. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineFunction.BicubicSplineFunction(double[])",
      "begin_line": 393,
      "end_line": 400,
      "comment": "\n     * Simple constructor.\n     * @param a Spline coefficients\n     ",
      "child_ranges": [
        "(line 394,col 9)-(line 394,col 34)",
        "(line 395,col 9)-(line 399,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineFunction.value(double, double)",
      "begin_line": 405,
      "end_line": 422,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 408,col 9)",
        "(line 409,col 9)-(line 411,col 9)",
        "(line 413,col 9)-(line 413,col 32)",
        "(line 414,col 9)-(line 414,col 33)",
        "(line 415,col 9)-(line 415,col 43)",
        "(line 417,col 9)-(line 417,col 32)",
        "(line 418,col 9)-(line 418,col 33)",
        "(line 419,col 9)-(line 419,col 43)",
        "(line 421,col 9)-(line 421,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineFunction.apply(double[], double[], double[][])",
      "begin_line": 432,
      "end_line": 441,
      "comment": "\n     * Compute the value of the bicubic polynomial.\n     *\n     * @param pX Powers of the x-coordinate.\n     * @param pY Powers of the y-coordinate.\n     * @param coeff Spline coefficients.\n     * @return the interpolated value.\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 26)",
        "(line 434,col 9)-(line 438,col 9)",
        "(line 440,col 9)-(line 440,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineFunction.partialDerivativeX()",
      "begin_line": 446,
      "end_line": 452,
      "comment": "\n     * @return the partial derivative wrt {@code x}.\n     ",
      "child_ranges": [
        "(line 447,col 9)-(line 449,col 9)",
        "(line 451,col 9)-(line 451,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineFunction.partialDerivativeY()",
      "begin_line": 456,
      "end_line": 462,
      "comment": "\n     * @return the partial derivative wrt {@code y}.\n     ",
      "child_ranges": [
        "(line 457,col 9)-(line 459,col 9)",
        "(line 461,col 9)-(line 461,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineFunction.partialDerivativeXX()",
      "begin_line": 466,
      "end_line": 472,
      "comment": "\n     * @return the second partial derivative wrt {@code x}.\n     ",
      "child_ranges": [
        "(line 467,col 9)-(line 469,col 9)",
        "(line 471,col 9)-(line 471,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineFunction.partialDerivativeYY()",
      "begin_line": 476,
      "end_line": 482,
      "comment": "\n     * @return the second partial derivative wrt {@code y}.\n     ",
      "child_ranges": [
        "(line 477,col 9)-(line 479,col 9)",
        "(line 481,col 9)-(line 481,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineFunction.partialDerivativeXY()",
      "begin_line": 486,
      "end_line": 492,
      "comment": "\n     * @return the second partial cross-derivative.\n     ",
      "child_ranges": [
        "(line 487,col 9)-(line 489,col 9)",
        "(line 491,col 9)-(line 491,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineFunction.computePartialDerivatives()",
      "begin_line": 497,
      "end_line": 572,
      "comment": "\n     * Compute all partial derivatives functions.\n     ",
      "child_ranges": [
        "(line 498,col 9)-(line 498,col 47)",
        "(line 499,col 9)-(line 499,col 47)",
        "(line 500,col 9)-(line 500,col 48)",
        "(line 501,col 9)-(line 501,col 48)",
        "(line 502,col 9)-(line 502,col 48)",
        "(line 504,col 9)-(line 513,col 9)",
        "(line 515,col 9)-(line 526,col 14)",
        "(line 527,col 9)-(line 538,col 14)",
        "(line 539,col 9)-(line 549,col 14)",
        "(line 550,col 9)-(line 560,col 14)",
        "(line 561,col 9)-(line 571,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineFunction.Anonymous-40eeac89-fa51-4b0b-9d3d-3cfc339f367b.value(double, double)",
      "begin_line": 516,
      "end_line": 525,
      "comment": "",
      "child_ranges": [
        "(line 517,col 21)-(line 517,col 44)",
        "(line 518,col 21)-(line 518,col 54)",
        "(line 520,col 21)-(line 520,col 44)",
        "(line 521,col 21)-(line 521,col 45)",
        "(line 522,col 21)-(line 522,col 55)",
        "(line 524,col 21)-(line 524,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineFunction.Anonymous-93c5cde2-e1e2-4e8f-a150-6f2a19265fa2.value(double, double)",
      "begin_line": 528,
      "end_line": 537,
      "comment": "",
      "child_ranges": [
        "(line 529,col 21)-(line 529,col 44)",
        "(line 530,col 21)-(line 530,col 45)",
        "(line 531,col 21)-(line 531,col 55)",
        "(line 533,col 21)-(line 533,col 44)",
        "(line 534,col 21)-(line 534,col 54)",
        "(line 536,col 21)-(line 536,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineFunction.Anonymous-7e8fafad-8efb-495a-9e3b-05a8234c4bbd.value(double, double)",
      "begin_line": 540,
      "end_line": 548,
      "comment": "",
      "child_ranges": [
        "(line 541,col 21)-(line 541,col 53)",
        "(line 543,col 21)-(line 543,col 44)",
        "(line 544,col 21)-(line 544,col 45)",
        "(line 545,col 21)-(line 545,col 55)",
        "(line 547,col 21)-(line 547,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineFunction.Anonymous-e75c1188-9a91-4907-b69e-9e75aa3a86b9.value(double, double)",
      "begin_line": 551,
      "end_line": 559,
      "comment": "",
      "child_ranges": [
        "(line 552,col 21)-(line 552,col 44)",
        "(line 553,col 21)-(line 553,col 45)",
        "(line 554,col 21)-(line 554,col 55)",
        "(line 556,col 21)-(line 556,col 53)",
        "(line 558,col 21)-(line 558,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineFunction.Anonymous-5e08e8f6-60dd-4bb1-b40f-f97978c48b77.value(double, double)",
      "begin_line": 562,
      "end_line": 570,
      "comment": "",
      "child_ranges": [
        "(line 563,col 21)-(line 563,col 44)",
        "(line 564,col 21)-(line 564,col 54)",
        "(line 566,col 21)-(line 566,col 44)",
        "(line 567,col 21)-(line 567,col 54)",
        "(line 569,col 21)-(line 569,col 46)"
      ]
    }
  ]
}