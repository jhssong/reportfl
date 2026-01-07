{
  "filepath": "/tmp/Math-1b/src/main/java/org/apache/commons/math3/analysis/interpolation/BicubicSplineInterpolatingFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BicubicSplineInterpolatingFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.BivariateFunction"
      ],
      "begin_line": 35,
      "end_line": 378,
      "comment": "\n * Function that implements the\n * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Bicubic_interpolation\"\u003e\n * bicubic spline interpolation\u003c/a\u003e.\n *\n * @since 2.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "NUM_COEFF"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Number of coefficients. "
    },
    {
      "type": "field",
      "varNames": [
        "AINV"
      ],
      "begin_line": 43,
      "end_line": 60,
      "comment": "\n     * Matrix to compute the spline coefficients from the function values\n     * and function derivatives values\n     "
    },
    {
      "type": "field",
      "varNames": [
        "xval"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Samples x-coordinates "
    },
    {
      "type": "field",
      "varNames": [
        "yval"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Samples y-coordinates "
    },
    {
      "type": "field",
      "varNames": [
        "splines"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Set of cubic splines patching the whole data grid "
    },
    {
      "type": "field",
      "varNames": [
        "partialDerivatives"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": "\n     * Partial derivatives\n     * The value of the first index determines the kind of derivatives:\n     * 0 \u003d first partial derivatives wrt x\n     * 1 \u003d first partial derivatives wrt y\n     * 2 \u003d second partial derivatives wrt x\n     * 3 \u003d second partial derivatives wrt y\n     * 4 \u003d cross partial derivatives\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunction.BicubicSplineInterpolatingFunction(double[], double[], double[][], double[][], double[][], double[][])",
      "begin_line": 95,
      "end_line": 159,
      "comment": "\n     * @param x Sample values of the x-coordinate, in increasing order.\n     * @param y Sample values of the y-coordinate, in increasing order.\n     * @param f Values of the function on every grid point.\n     * @param dFdX Values of the partial derivative of function with respect\n     * to x on every grid point.\n     * @param dFdY Values of the partial derivative of function with respect\n     * to y on every grid point.\n     * @param d2FdXdY Values of the cross partial derivative of function on\n     * every grid point.\n     * @throws DimensionMismatchException if the various arrays do not contain\n     * the expected number of elements.\n     * @throws NonMonotonicSequenceException if {@code x} or {@code y} are\n     * not strictly increasing.\n     * @throws NoDataException if any of the arrays has zero length.\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 34)",
        "(line 105,col 9)-(line 105,col 34)",
        "(line 107,col 9)-(line 109,col 9)",
        "(line 110,col 9)-(line 112,col 9)",
        "(line 113,col 9)-(line 115,col 9)",
        "(line 116,col 9)-(line 118,col 9)",
        "(line 119,col 9)-(line 121,col 9)",
        "(line 123,col 9)-(line 123,col 33)",
        "(line 124,col 9)-(line 124,col 33)",
        "(line 126,col 9)-(line 126,col 25)",
        "(line 127,col 9)-(line 127,col 25)",
        "(line 129,col 9)-(line 129,col 35)",
        "(line 130,col 9)-(line 130,col 35)",
        "(line 131,col 9)-(line 131,col 58)",
        "(line 133,col 9)-(line 158,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunction.value(double, double)",
      "begin_line": 164,
      "end_line": 173,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 43)",
        "(line 167,col 9)-(line 167,col 43)",
        "(line 169,col 9)-(line 169,col 66)",
        "(line 170,col 9)-(line 170,col 66)",
        "(line 172,col 9)-(line 172,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunction.isValidPoint(double, double)",
      "begin_line": 183,
      "end_line": 192,
      "comment": "\n     * Indicates whether a point is within the interpolation range.\n     *\n     * @param x First coordinate.\n     * @param y Second coordinate.\n     * @return {@code true} if (x, y) is a valid point.\n     * @since 3.3\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 191,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunction.partialDerivativeX(double, double)",
      "begin_line": 203,
      "end_line": 206,
      "comment": "\n     * @param x x-coordinate.\n     * @param y y-coordinate.\n     * @return the value at point (x, y) of the first partial derivative with\n     * respect to x.\n     * @throws OutOfRangeException if {@code x} (resp. {@code y}) is outside\n     * the range defined by the boundary values of {@code xval} (resp.\n     * {@code yval}).\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunction.partialDerivativeY(double, double)",
      "begin_line": 216,
      "end_line": 219,
      "comment": "\n     * @param x x-coordinate.\n     * @param y y-coordinate.\n     * @return the value at point (x, y) of the first partial derivative with\n     * respect to y.\n     * @throws OutOfRangeException if {@code x} (resp. {@code y}) is outside\n     * the range defined by the boundary values of {@code xval} (resp.\n     * {@code yval}).\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunction.partialDerivativeXX(double, double)",
      "begin_line": 229,
      "end_line": 232,
      "comment": "\n     * @param x x-coordinate.\n     * @param y y-coordinate.\n     * @return the value at point (x, y) of the second partial derivative with\n     * respect to x.\n     * @throws OutOfRangeException if {@code x} (resp. {@code y}) is outside\n     * the range defined by the boundary values of {@code xval} (resp.\n     * {@code yval}).\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunction.partialDerivativeYY(double, double)",
      "begin_line": 242,
      "end_line": 245,
      "comment": "\n     * @param x x-coordinate.\n     * @param y y-coordinate.\n     * @return the value at point (x, y) of the second partial derivative with\n     * respect to y.\n     * @throws OutOfRangeException if {@code x} (resp. {@code y}) is outside\n     * the range defined by the boundary values of {@code xval} (resp.\n     * {@code yval}).\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunction.partialDerivativeXY(double, double)",
      "begin_line": 254,
      "end_line": 257,
      "comment": "\n     * @param x x-coordinate.\n     * @param y y-coordinate.\n     * @return the value at point (x, y) of the second partial cross-derivative.\n     * @throws OutOfRangeException if {@code x} (resp. {@code y}) is outside\n     * the range defined by the boundary values of {@code xval} (resp.\n     * {@code yval}).\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunction.partialDerivative(int, double, double)",
      "begin_line": 268,
      "end_line": 281,
      "comment": "\n     * @param which First index in {@link #partialDerivatives}.\n     * @param x x-coordinate.\n     * @param y y-coordinate.\n     * @return the value at point (x, y) of the selected partial derivative.\n     * @throws OutOfRangeException if {@code x} (resp. {@code y}) is outside\n     * the range defined by the boundary values of {@code xval} (resp.\n     * {@code yval}).\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 272,col 9)",
        "(line 274,col 9)-(line 274,col 43)",
        "(line 275,col 9)-(line 275,col 43)",
        "(line 277,col 9)-(line 277,col 66)",
        "(line 278,col 9)-(line 278,col 66)",
        "(line 280,col 9)-(line 280,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunction.computePartialDerivatives()",
      "begin_line": 286,
      "end_line": 301,
      "comment": "\n     * Compute all partial derivatives.\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 42)",
        "(line 288,col 9)-(line 288,col 42)",
        "(line 289,col 9)-(line 289,col 68)",
        "(line 291,col 9)-(line 300,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunction.searchIndex(double, double[])",
      "begin_line": 311,
      "end_line": 333,
      "comment": "\n     * @param c Coordinate.\n     * @param val Coordinate samples.\n     * @return the index in {@code val} corresponding to the interval\n     * containing {@code c}.\n     * @throws OutOfRangeException if {@code c} is out of the\n     * range defined by the boundary values of {@code val}.\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 50)",
        "(line 314,col 9)-(line 317,col 9)",
        "(line 319,col 9)-(line 323,col 9)",
        "(line 324,col 9)-(line 324,col 40)",
        "(line 325,col 9)-(line 329,col 9)",
        "(line 332,col 9)-(line 332,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunction.computeSplineCoefficients(double[])",
      "begin_line": 364,
      "end_line": 377,
      "comment": "\n     * Compute the spline coefficients from the list of function values and\n     * function partial derivatives values at the four corners of a grid\n     * element. They must be specified in the following order:\n     * \u003cul\u003e\n     *  \u003cli\u003ef(0,0)\u003c/li\u003e\n     *  \u003cli\u003ef(1,0)\u003c/li\u003e\n     *  \u003cli\u003ef(0,1)\u003c/li\u003e\n     *  \u003cli\u003ef(1,1)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ex\u003c/sub\u003e(0,0)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ex\u003c/sub\u003e(1,0)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ex\u003c/sub\u003e(0,1)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ex\u003c/sub\u003e(1,1)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ey\u003c/sub\u003e(0,0)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ey\u003c/sub\u003e(1,0)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ey\u003c/sub\u003e(0,1)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ey\u003c/sub\u003e(1,1)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003exy\u003c/sub\u003e(0,0)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003exy\u003c/sub\u003e(1,0)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003exy\u003c/sub\u003e(0,1)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003exy\u003c/sub\u003e(1,1)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * where the subscripts indicate the partial derivative with respect to\n     * the corresponding variable(s).\n     *\n     * @param beta List of function values and function partial derivatives\n     * values.\n     * @return the spline coefficients.\n     ",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 49)",
        "(line 367,col 9)-(line 374,col 9)",
        "(line 376,col 9)-(line 376,col 17)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BicubicSplineFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.BivariateFunction"
      ],
      "begin_line": 385,
      "end_line": 593,
      "comment": "\n * 2D-spline function.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "N"
      ],
      "begin_line": 389,
      "end_line": 389,
      "comment": " Number of points. "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 392,
      "end_line": 392,
      "comment": " Coefficients "
    },
    {
      "type": "field",
      "varNames": [
        "partialDerivativeX"
      ],
      "begin_line": 395,
      "end_line": 395,
      "comment": " First partial derivative along x. "
    },
    {
      "type": "field",
      "varNames": [
        "partialDerivativeY"
      ],
      "begin_line": 398,
      "end_line": 398,
      "comment": " First partial derivative along y. "
    },
    {
      "type": "field",
      "varNames": [
        "partialDerivativeXX"
      ],
      "begin_line": 401,
      "end_line": 401,
      "comment": " Second partial derivative along x. "
    },
    {
      "type": "field",
      "varNames": [
        "partialDerivativeYY"
      ],
      "begin_line": 404,
      "end_line": 404,
      "comment": " Second partial derivative along y. "
    },
    {
      "type": "field",
      "varNames": [
        "partialDerivativeXY"
      ],
      "begin_line": 407,
      "end_line": 407,
      "comment": " Second crossed partial derivative. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineFunction.BicubicSplineFunction(double[])",
      "begin_line": 413,
      "end_line": 420,
      "comment": "\n     * Simple constructor.\n     * @param a Spline coefficients\n     ",
      "child_ranges": [
        "(line 414,col 9)-(line 414,col 34)",
        "(line 415,col 9)-(line 419,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineFunction.value(double, double)",
      "begin_line": 425,
      "end_line": 442,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 426,col 9)-(line 428,col 9)",
        "(line 429,col 9)-(line 431,col 9)",
        "(line 433,col 9)-(line 433,col 32)",
        "(line 434,col 9)-(line 434,col 33)",
        "(line 435,col 9)-(line 435,col 43)",
        "(line 437,col 9)-(line 437,col 32)",
        "(line 438,col 9)-(line 438,col 33)",
        "(line 439,col 9)-(line 439,col 43)",
        "(line 441,col 9)-(line 441,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineFunction.apply(double[], double[], double[][])",
      "begin_line": 452,
      "end_line": 461,
      "comment": "\n     * Compute the value of the bicubic polynomial.\n     *\n     * @param pX Powers of the x-coordinate.\n     * @param pY Powers of the y-coordinate.\n     * @param coeff Spline coefficients.\n     * @return the interpolated value.\n     ",
      "child_ranges": [
        "(line 453,col 9)-(line 453,col 26)",
        "(line 454,col 9)-(line 458,col 9)",
        "(line 460,col 9)-(line 460,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineFunction.partialDerivativeX()",
      "begin_line": 466,
      "end_line": 472,
      "comment": "\n     * @return the partial derivative wrt {@code x}.\n     ",
      "child_ranges": [
        "(line 467,col 9)-(line 469,col 9)",
        "(line 471,col 9)-(line 471,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineFunction.partialDerivativeY()",
      "begin_line": 476,
      "end_line": 482,
      "comment": "\n     * @return the partial derivative wrt {@code y}.\n     ",
      "child_ranges": [
        "(line 477,col 9)-(line 479,col 9)",
        "(line 481,col 9)-(line 481,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineFunction.partialDerivativeXX()",
      "begin_line": 486,
      "end_line": 492,
      "comment": "\n     * @return the second partial derivative wrt {@code x}.\n     ",
      "child_ranges": [
        "(line 487,col 9)-(line 489,col 9)",
        "(line 491,col 9)-(line 491,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineFunction.partialDerivativeYY()",
      "begin_line": 496,
      "end_line": 502,
      "comment": "\n     * @return the second partial derivative wrt {@code y}.\n     ",
      "child_ranges": [
        "(line 497,col 9)-(line 499,col 9)",
        "(line 501,col 9)-(line 501,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineFunction.partialDerivativeXY()",
      "begin_line": 506,
      "end_line": 512,
      "comment": "\n     * @return the second partial cross-derivative.\n     ",
      "child_ranges": [
        "(line 507,col 9)-(line 509,col 9)",
        "(line 511,col 9)-(line 511,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineFunction.computePartialDerivatives()",
      "begin_line": 517,
      "end_line": 592,
      "comment": "\n     * Compute all partial derivatives functions.\n     ",
      "child_ranges": [
        "(line 518,col 9)-(line 518,col 47)",
        "(line 519,col 9)-(line 519,col 47)",
        "(line 520,col 9)-(line 520,col 48)",
        "(line 521,col 9)-(line 521,col 48)",
        "(line 522,col 9)-(line 522,col 48)",
        "(line 524,col 9)-(line 533,col 9)",
        "(line 535,col 9)-(line 546,col 14)",
        "(line 547,col 9)-(line 558,col 14)",
        "(line 559,col 9)-(line 569,col 14)",
        "(line 570,col 9)-(line 580,col 14)",
        "(line 581,col 9)-(line 591,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineFunction.Anonymous-97c28e67-1e15-45b2-acef-2d0c0c9e5448.value(double, double)",
      "begin_line": 536,
      "end_line": 545,
      "comment": "",
      "child_ranges": [
        "(line 537,col 21)-(line 537,col 44)",
        "(line 538,col 21)-(line 538,col 54)",
        "(line 540,col 21)-(line 540,col 44)",
        "(line 541,col 21)-(line 541,col 45)",
        "(line 542,col 21)-(line 542,col 55)",
        "(line 544,col 21)-(line 544,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineFunction.Anonymous-c6c3f65c-381e-4aec-8467-4f7395f2167d.value(double, double)",
      "begin_line": 548,
      "end_line": 557,
      "comment": "",
      "child_ranges": [
        "(line 549,col 21)-(line 549,col 44)",
        "(line 550,col 21)-(line 550,col 45)",
        "(line 551,col 21)-(line 551,col 55)",
        "(line 553,col 21)-(line 553,col 44)",
        "(line 554,col 21)-(line 554,col 54)",
        "(line 556,col 21)-(line 556,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineFunction.Anonymous-b4340897-a769-433f-b216-05d4d7203b43.value(double, double)",
      "begin_line": 560,
      "end_line": 568,
      "comment": "",
      "child_ranges": [
        "(line 561,col 21)-(line 561,col 53)",
        "(line 563,col 21)-(line 563,col 44)",
        "(line 564,col 21)-(line 564,col 45)",
        "(line 565,col 21)-(line 565,col 55)",
        "(line 567,col 21)-(line 567,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineFunction.Anonymous-fcd4dd61-d1cb-44bd-a712-019374250bd4.value(double, double)",
      "begin_line": 571,
      "end_line": 579,
      "comment": "",
      "child_ranges": [
        "(line 572,col 21)-(line 572,col 44)",
        "(line 573,col 21)-(line 573,col 45)",
        "(line 574,col 21)-(line 574,col 55)",
        "(line 576,col 21)-(line 576,col 53)",
        "(line 578,col 21)-(line 578,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineFunction.Anonymous-5c173e5e-e02c-467d-90d9-171aefa26e78.value(double, double)",
      "begin_line": 582,
      "end_line": 590,
      "comment": "",
      "child_ranges": [
        "(line 583,col 21)-(line 583,col 44)",
        "(line 584,col 21)-(line 584,col 54)",
        "(line 586,col 21)-(line 586,col 44)",
        "(line 587,col 21)-(line 587,col 54)",
        "(line 589,col 21)-(line 589,col 46)"
      ]
    }
  ]
}