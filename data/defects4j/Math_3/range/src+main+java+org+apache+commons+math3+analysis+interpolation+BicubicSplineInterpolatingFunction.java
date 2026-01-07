{
  "filepath": "/tmp/Math-3b/src/main/java/org/apache/commons/math3/analysis/interpolation/BicubicSplineInterpolatingFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BicubicSplineInterpolatingFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.BivariateFunction"
      ],
      "begin_line": 35,
      "end_line": 377,
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
      "begin_line": 182,
      "end_line": 191,
      "comment": "\n     * Indicates whether a point is within the interpolation range.\n     *\n     * @param x First coordinate.\n     * @param y Second coordinate.\n     * @return {@code true} if (x, y) is a valid point.\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 190,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunction.partialDerivativeX(double, double)",
      "begin_line": 202,
      "end_line": 205,
      "comment": "\n     * @param x x-coordinate.\n     * @param y y-coordinate.\n     * @return the value at point (x, y) of the first partial derivative with\n     * respect to x.\n     * @throws OutOfRangeException if {@code x} (resp. {@code y}) is outside\n     * the range defined by the boundary values of {@code xval} (resp.\n     * {@code yval}).\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunction.partialDerivativeY(double, double)",
      "begin_line": 215,
      "end_line": 218,
      "comment": "\n     * @param x x-coordinate.\n     * @param y y-coordinate.\n     * @return the value at point (x, y) of the first partial derivative with\n     * respect to y.\n     * @throws OutOfRangeException if {@code x} (resp. {@code y}) is outside\n     * the range defined by the boundary values of {@code xval} (resp.\n     * {@code yval}).\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunction.partialDerivativeXX(double, double)",
      "begin_line": 228,
      "end_line": 231,
      "comment": "\n     * @param x x-coordinate.\n     * @param y y-coordinate.\n     * @return the value at point (x, y) of the second partial derivative with\n     * respect to x.\n     * @throws OutOfRangeException if {@code x} (resp. {@code y}) is outside\n     * the range defined by the boundary values of {@code xval} (resp.\n     * {@code yval}).\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunction.partialDerivativeYY(double, double)",
      "begin_line": 241,
      "end_line": 244,
      "comment": "\n     * @param x x-coordinate.\n     * @param y y-coordinate.\n     * @return the value at point (x, y) of the second partial derivative with\n     * respect to y.\n     * @throws OutOfRangeException if {@code x} (resp. {@code y}) is outside\n     * the range defined by the boundary values of {@code xval} (resp.\n     * {@code yval}).\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunction.partialDerivativeXY(double, double)",
      "begin_line": 253,
      "end_line": 256,
      "comment": "\n     * @param x x-coordinate.\n     * @param y y-coordinate.\n     * @return the value at point (x, y) of the second partial cross-derivative.\n     * @throws OutOfRangeException if {@code x} (resp. {@code y}) is outside\n     * the range defined by the boundary values of {@code xval} (resp.\n     * {@code yval}).\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunction.partialDerivative(int, double, double)",
      "begin_line": 267,
      "end_line": 280,
      "comment": "\n     * @param which First index in {@link #partialDerivatives}.\n     * @param x x-coordinate.\n     * @param y y-coordinate.\n     * @return the value at point (x, y) of the selected partial derivative.\n     * @throws OutOfRangeException if {@code x} (resp. {@code y}) is outside\n     * the range defined by the boundary values of {@code xval} (resp.\n     * {@code yval}).\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 271,col 9)",
        "(line 273,col 9)-(line 273,col 43)",
        "(line 274,col 9)-(line 274,col 43)",
        "(line 276,col 9)-(line 276,col 66)",
        "(line 277,col 9)-(line 277,col 66)",
        "(line 279,col 9)-(line 279,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunction.computePartialDerivatives()",
      "begin_line": 285,
      "end_line": 300,
      "comment": "\n     * Compute all partial derivatives.\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 42)",
        "(line 287,col 9)-(line 287,col 42)",
        "(line 288,col 9)-(line 288,col 68)",
        "(line 290,col 9)-(line 299,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunction.searchIndex(double, double[])",
      "begin_line": 310,
      "end_line": 332,
      "comment": "\n     * @param c Coordinate.\n     * @param val Coordinate samples.\n     * @return the index in {@code val} corresponding to the interval\n     * containing {@code c}.\n     * @throws OutOfRangeException if {@code c} is out of the\n     * range defined by the boundary values of {@code val}.\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 50)",
        "(line 313,col 9)-(line 316,col 9)",
        "(line 318,col 9)-(line 322,col 9)",
        "(line 323,col 9)-(line 323,col 40)",
        "(line 324,col 9)-(line 328,col 9)",
        "(line 331,col 9)-(line 331,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunction.computeSplineCoefficients(double[])",
      "begin_line": 363,
      "end_line": 376,
      "comment": "\n     * Compute the spline coefficients from the list of function values and\n     * function partial derivatives values at the four corners of a grid\n     * element. They must be specified in the following order:\n     * \u003cul\u003e\n     *  \u003cli\u003ef(0,0)\u003c/li\u003e\n     *  \u003cli\u003ef(1,0)\u003c/li\u003e\n     *  \u003cli\u003ef(0,1)\u003c/li\u003e\n     *  \u003cli\u003ef(1,1)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ex\u003c/sub\u003e(0,0)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ex\u003c/sub\u003e(1,0)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ex\u003c/sub\u003e(0,1)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ex\u003c/sub\u003e(1,1)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ey\u003c/sub\u003e(0,0)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ey\u003c/sub\u003e(1,0)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ey\u003c/sub\u003e(0,1)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ey\u003c/sub\u003e(1,1)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003exy\u003c/sub\u003e(0,0)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003exy\u003c/sub\u003e(1,0)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003exy\u003c/sub\u003e(0,1)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003exy\u003c/sub\u003e(1,1)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * where the subscripts indicate the partial derivative with respect to\n     * the corresponding variable(s).\n     *\n     * @param beta List of function values and function partial derivatives\n     * values.\n     * @return the spline coefficients.\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 49)",
        "(line 366,col 9)-(line 373,col 9)",
        "(line 375,col 9)-(line 375,col 17)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BicubicSplineFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.BivariateFunction"
      ],
      "begin_line": 384,
      "end_line": 592,
      "comment": "\n * 2D-spline function.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "N"
      ],
      "begin_line": 388,
      "end_line": 388,
      "comment": " Number of points. "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 391,
      "end_line": 391,
      "comment": " Coefficients "
    },
    {
      "type": "field",
      "varNames": [
        "partialDerivativeX"
      ],
      "begin_line": 394,
      "end_line": 394,
      "comment": " First partial derivative along x. "
    },
    {
      "type": "field",
      "varNames": [
        "partialDerivativeY"
      ],
      "begin_line": 397,
      "end_line": 397,
      "comment": " First partial derivative along y. "
    },
    {
      "type": "field",
      "varNames": [
        "partialDerivativeXX"
      ],
      "begin_line": 400,
      "end_line": 400,
      "comment": " Second partial derivative along x. "
    },
    {
      "type": "field",
      "varNames": [
        "partialDerivativeYY"
      ],
      "begin_line": 403,
      "end_line": 403,
      "comment": " Second partial derivative along y. "
    },
    {
      "type": "field",
      "varNames": [
        "partialDerivativeXY"
      ],
      "begin_line": 406,
      "end_line": 406,
      "comment": " Second crossed partial derivative. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineFunction.BicubicSplineFunction(double[])",
      "begin_line": 412,
      "end_line": 419,
      "comment": "\n     * Simple constructor.\n     * @param a Spline coefficients\n     ",
      "child_ranges": [
        "(line 413,col 9)-(line 413,col 34)",
        "(line 414,col 9)-(line 418,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineFunction.value(double, double)",
      "begin_line": 424,
      "end_line": 441,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 425,col 9)-(line 427,col 9)",
        "(line 428,col 9)-(line 430,col 9)",
        "(line 432,col 9)-(line 432,col 32)",
        "(line 433,col 9)-(line 433,col 33)",
        "(line 434,col 9)-(line 434,col 43)",
        "(line 436,col 9)-(line 436,col 32)",
        "(line 437,col 9)-(line 437,col 33)",
        "(line 438,col 9)-(line 438,col 43)",
        "(line 440,col 9)-(line 440,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineFunction.apply(double[], double[], double[][])",
      "begin_line": 451,
      "end_line": 460,
      "comment": "\n     * Compute the value of the bicubic polynomial.\n     *\n     * @param pX Powers of the x-coordinate.\n     * @param pY Powers of the y-coordinate.\n     * @param coeff Spline coefficients.\n     * @return the interpolated value.\n     ",
      "child_ranges": [
        "(line 452,col 9)-(line 452,col 26)",
        "(line 453,col 9)-(line 457,col 9)",
        "(line 459,col 9)-(line 459,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineFunction.partialDerivativeX()",
      "begin_line": 465,
      "end_line": 471,
      "comment": "\n     * @return the partial derivative wrt {@code x}.\n     ",
      "child_ranges": [
        "(line 466,col 9)-(line 468,col 9)",
        "(line 470,col 9)-(line 470,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineFunction.partialDerivativeY()",
      "begin_line": 475,
      "end_line": 481,
      "comment": "\n     * @return the partial derivative wrt {@code y}.\n     ",
      "child_ranges": [
        "(line 476,col 9)-(line 478,col 9)",
        "(line 480,col 9)-(line 480,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineFunction.partialDerivativeXX()",
      "begin_line": 485,
      "end_line": 491,
      "comment": "\n     * @return the second partial derivative wrt {@code x}.\n     ",
      "child_ranges": [
        "(line 486,col 9)-(line 488,col 9)",
        "(line 490,col 9)-(line 490,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineFunction.partialDerivativeYY()",
      "begin_line": 495,
      "end_line": 501,
      "comment": "\n     * @return the second partial derivative wrt {@code y}.\n     ",
      "child_ranges": [
        "(line 496,col 9)-(line 498,col 9)",
        "(line 500,col 9)-(line 500,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineFunction.partialDerivativeXY()",
      "begin_line": 505,
      "end_line": 511,
      "comment": "\n     * @return the second partial cross-derivative.\n     ",
      "child_ranges": [
        "(line 506,col 9)-(line 508,col 9)",
        "(line 510,col 9)-(line 510,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineFunction.computePartialDerivatives()",
      "begin_line": 516,
      "end_line": 591,
      "comment": "\n     * Compute all partial derivatives functions.\n     ",
      "child_ranges": [
        "(line 517,col 9)-(line 517,col 47)",
        "(line 518,col 9)-(line 518,col 47)",
        "(line 519,col 9)-(line 519,col 48)",
        "(line 520,col 9)-(line 520,col 48)",
        "(line 521,col 9)-(line 521,col 48)",
        "(line 523,col 9)-(line 532,col 9)",
        "(line 534,col 9)-(line 545,col 14)",
        "(line 546,col 9)-(line 557,col 14)",
        "(line 558,col 9)-(line 568,col 14)",
        "(line 569,col 9)-(line 579,col 14)",
        "(line 580,col 9)-(line 590,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineFunction.Anonymous-ac75b31c-baff-4e5c-b12c-083e6071fd59.value(double, double)",
      "begin_line": 535,
      "end_line": 544,
      "comment": "",
      "child_ranges": [
        "(line 536,col 21)-(line 536,col 44)",
        "(line 537,col 21)-(line 537,col 54)",
        "(line 539,col 21)-(line 539,col 44)",
        "(line 540,col 21)-(line 540,col 45)",
        "(line 541,col 21)-(line 541,col 55)",
        "(line 543,col 21)-(line 543,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineFunction.Anonymous-7b32253b-1120-450e-bd97-f63fb668c28d.value(double, double)",
      "begin_line": 547,
      "end_line": 556,
      "comment": "",
      "child_ranges": [
        "(line 548,col 21)-(line 548,col 44)",
        "(line 549,col 21)-(line 549,col 45)",
        "(line 550,col 21)-(line 550,col 55)",
        "(line 552,col 21)-(line 552,col 44)",
        "(line 553,col 21)-(line 553,col 54)",
        "(line 555,col 21)-(line 555,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineFunction.Anonymous-ab41278c-4687-4a79-bb4e-e488e95d12f4.value(double, double)",
      "begin_line": 559,
      "end_line": 567,
      "comment": "",
      "child_ranges": [
        "(line 560,col 21)-(line 560,col 53)",
        "(line 562,col 21)-(line 562,col 44)",
        "(line 563,col 21)-(line 563,col 45)",
        "(line 564,col 21)-(line 564,col 55)",
        "(line 566,col 21)-(line 566,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineFunction.Anonymous-722065cb-c652-43a2-84e8-a92afca401ce.value(double, double)",
      "begin_line": 570,
      "end_line": 578,
      "comment": "",
      "child_ranges": [
        "(line 571,col 21)-(line 571,col 44)",
        "(line 572,col 21)-(line 572,col 45)",
        "(line 573,col 21)-(line 573,col 55)",
        "(line 575,col 21)-(line 575,col 53)",
        "(line 577,col 21)-(line 577,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineFunction.Anonymous-a23675f1-183e-4dc8-a0e2-8f15c837fa37.value(double, double)",
      "begin_line": 581,
      "end_line": 589,
      "comment": "",
      "child_ranges": [
        "(line 582,col 21)-(line 582,col 44)",
        "(line 583,col 21)-(line 583,col 54)",
        "(line 585,col 21)-(line 585,col 44)",
        "(line 586,col 21)-(line 586,col 54)",
        "(line 588,col 21)-(line 588,col 46)"
      ]
    }
  ]
}