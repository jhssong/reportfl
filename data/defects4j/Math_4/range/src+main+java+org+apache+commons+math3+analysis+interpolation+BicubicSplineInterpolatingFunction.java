{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/interpolation/BicubicSplineInterpolatingFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BicubicSplineInterpolatingFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.BivariateFunction"
      ],
      "begin_line": 35,
      "end_line": 359,
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
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunction.partialDerivativeX(double, double)",
      "begin_line": 184,
      "end_line": 187,
      "comment": "\n     * @param x x-coordinate.\n     * @param y y-coordinate.\n     * @return the value at point (x, y) of the first partial derivative with\n     * respect to x.\n     * @throws OutOfRangeException if {@code x} (resp. {@code y}) is outside\n     * the range defined by the boundary values of {@code xval} (resp.\n     * {@code yval}).\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunction.partialDerivativeY(double, double)",
      "begin_line": 197,
      "end_line": 200,
      "comment": "\n     * @param x x-coordinate.\n     * @param y y-coordinate.\n     * @return the value at point (x, y) of the first partial derivative with\n     * respect to y.\n     * @throws OutOfRangeException if {@code x} (resp. {@code y}) is outside\n     * the range defined by the boundary values of {@code xval} (resp.\n     * {@code yval}).\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunction.partialDerivativeXX(double, double)",
      "begin_line": 210,
      "end_line": 213,
      "comment": "\n     * @param x x-coordinate.\n     * @param y y-coordinate.\n     * @return the value at point (x, y) of the second partial derivative with\n     * respect to x.\n     * @throws OutOfRangeException if {@code x} (resp. {@code y}) is outside\n     * the range defined by the boundary values of {@code xval} (resp.\n     * {@code yval}).\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunction.partialDerivativeYY(double, double)",
      "begin_line": 223,
      "end_line": 226,
      "comment": "\n     * @param x x-coordinate.\n     * @param y y-coordinate.\n     * @return the value at point (x, y) of the second partial derivative with\n     * respect to y.\n     * @throws OutOfRangeException if {@code x} (resp. {@code y}) is outside\n     * the range defined by the boundary values of {@code xval} (resp.\n     * {@code yval}).\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunction.partialDerivativeXY(double, double)",
      "begin_line": 235,
      "end_line": 238,
      "comment": "\n     * @param x x-coordinate.\n     * @param y y-coordinate.\n     * @return the value at point (x, y) of the second partial cross-derivative.\n     * @throws OutOfRangeException if {@code x} (resp. {@code y}) is outside\n     * the range defined by the boundary values of {@code xval} (resp.\n     * {@code yval}).\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunction.partialDerivative(int, double, double)",
      "begin_line": 249,
      "end_line": 262,
      "comment": "\n     * @param which First index in {@link #partialDerivatives}.\n     * @param x x-coordinate.\n     * @param y y-coordinate.\n     * @return the value at point (x, y) of the selected partial derivative.\n     * @throws OutOfRangeException if {@code x} (resp. {@code y}) is outside\n     * the range defined by the boundary values of {@code xval} (resp.\n     * {@code yval}).\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 253,col 9)",
        "(line 255,col 9)-(line 255,col 43)",
        "(line 256,col 9)-(line 256,col 43)",
        "(line 258,col 9)-(line 258,col 66)",
        "(line 259,col 9)-(line 259,col 66)",
        "(line 261,col 9)-(line 261,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunction.computePartialDerivatives()",
      "begin_line": 267,
      "end_line": 282,
      "comment": "\n     * Compute all partial derivatives.\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 42)",
        "(line 269,col 9)-(line 269,col 42)",
        "(line 270,col 9)-(line 270,col 68)",
        "(line 272,col 9)-(line 281,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunction.searchIndex(double, double[])",
      "begin_line": 292,
      "end_line": 314,
      "comment": "\n     * @param c Coordinate.\n     * @param val Coordinate samples.\n     * @return the index in {@code val} corresponding to the interval\n     * containing {@code c}.\n     * @throws OutOfRangeException if {@code c} is out of the\n     * range defined by the boundary values of {@code val}.\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 50)",
        "(line 295,col 9)-(line 298,col 9)",
        "(line 300,col 9)-(line 304,col 9)",
        "(line 305,col 9)-(line 305,col 40)",
        "(line 306,col 9)-(line 310,col 9)",
        "(line 313,col 9)-(line 313,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunction.computeSplineCoefficients(double[])",
      "begin_line": 345,
      "end_line": 358,
      "comment": "\n     * Compute the spline coefficients from the list of function values and\n     * function partial derivatives values at the four corners of a grid\n     * element. They must be specified in the following order:\n     * \u003cul\u003e\n     *  \u003cli\u003ef(0,0)\u003c/li\u003e\n     *  \u003cli\u003ef(1,0)\u003c/li\u003e\n     *  \u003cli\u003ef(0,1)\u003c/li\u003e\n     *  \u003cli\u003ef(1,1)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ex\u003c/sub\u003e(0,0)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ex\u003c/sub\u003e(1,0)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ex\u003c/sub\u003e(0,1)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ex\u003c/sub\u003e(1,1)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ey\u003c/sub\u003e(0,0)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ey\u003c/sub\u003e(1,0)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ey\u003c/sub\u003e(0,1)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ey\u003c/sub\u003e(1,1)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003exy\u003c/sub\u003e(0,0)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003exy\u003c/sub\u003e(1,0)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003exy\u003c/sub\u003e(0,1)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003exy\u003c/sub\u003e(1,1)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * where the subscripts indicate the partial derivative with respect to\n     * the corresponding variable(s).\n     *\n     * @param beta List of function values and function partial derivatives\n     * values.\n     * @return the spline coefficients.\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 49)",
        "(line 348,col 9)-(line 355,col 9)",
        "(line 357,col 9)-(line 357,col 17)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BicubicSplineFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.BivariateFunction"
      ],
      "begin_line": 366,
      "end_line": 574,
      "comment": "\n * 2D-spline function.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "N"
      ],
      "begin_line": 370,
      "end_line": 370,
      "comment": " Number of points. "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 373,
      "end_line": 373,
      "comment": " Coefficients "
    },
    {
      "type": "field",
      "varNames": [
        "partialDerivativeX"
      ],
      "begin_line": 376,
      "end_line": 376,
      "comment": " First partial derivative along x. "
    },
    {
      "type": "field",
      "varNames": [
        "partialDerivativeY"
      ],
      "begin_line": 379,
      "end_line": 379,
      "comment": " First partial derivative along y. "
    },
    {
      "type": "field",
      "varNames": [
        "partialDerivativeXX"
      ],
      "begin_line": 382,
      "end_line": 382,
      "comment": " Second partial derivative along x. "
    },
    {
      "type": "field",
      "varNames": [
        "partialDerivativeYY"
      ],
      "begin_line": 385,
      "end_line": 385,
      "comment": " Second partial derivative along y. "
    },
    {
      "type": "field",
      "varNames": [
        "partialDerivativeXY"
      ],
      "begin_line": 388,
      "end_line": 388,
      "comment": " Second crossed partial derivative. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineFunction.BicubicSplineFunction(double[])",
      "begin_line": 394,
      "end_line": 401,
      "comment": "\n     * Simple constructor.\n     * @param a Spline coefficients\n     ",
      "child_ranges": [
        "(line 395,col 9)-(line 395,col 34)",
        "(line 396,col 9)-(line 400,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineFunction.value(double, double)",
      "begin_line": 406,
      "end_line": 423,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 409,col 9)",
        "(line 410,col 9)-(line 412,col 9)",
        "(line 414,col 9)-(line 414,col 32)",
        "(line 415,col 9)-(line 415,col 33)",
        "(line 416,col 9)-(line 416,col 43)",
        "(line 418,col 9)-(line 418,col 32)",
        "(line 419,col 9)-(line 419,col 33)",
        "(line 420,col 9)-(line 420,col 43)",
        "(line 422,col 9)-(line 422,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineFunction.apply(double[], double[], double[][])",
      "begin_line": 433,
      "end_line": 442,
      "comment": "\n     * Compute the value of the bicubic polynomial.\n     *\n     * @param pX Powers of the x-coordinate.\n     * @param pY Powers of the y-coordinate.\n     * @param coeff Spline coefficients.\n     * @return the interpolated value.\n     ",
      "child_ranges": [
        "(line 434,col 9)-(line 434,col 26)",
        "(line 435,col 9)-(line 439,col 9)",
        "(line 441,col 9)-(line 441,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineFunction.partialDerivativeX()",
      "begin_line": 447,
      "end_line": 453,
      "comment": "\n     * @return the partial derivative wrt {@code x}.\n     ",
      "child_ranges": [
        "(line 448,col 9)-(line 450,col 9)",
        "(line 452,col 9)-(line 452,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineFunction.partialDerivativeY()",
      "begin_line": 457,
      "end_line": 463,
      "comment": "\n     * @return the partial derivative wrt {@code y}.\n     ",
      "child_ranges": [
        "(line 458,col 9)-(line 460,col 9)",
        "(line 462,col 9)-(line 462,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineFunction.partialDerivativeXX()",
      "begin_line": 467,
      "end_line": 473,
      "comment": "\n     * @return the second partial derivative wrt {@code x}.\n     ",
      "child_ranges": [
        "(line 468,col 9)-(line 470,col 9)",
        "(line 472,col 9)-(line 472,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineFunction.partialDerivativeYY()",
      "begin_line": 477,
      "end_line": 483,
      "comment": "\n     * @return the second partial derivative wrt {@code y}.\n     ",
      "child_ranges": [
        "(line 478,col 9)-(line 480,col 9)",
        "(line 482,col 9)-(line 482,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineFunction.partialDerivativeXY()",
      "begin_line": 487,
      "end_line": 493,
      "comment": "\n     * @return the second partial cross-derivative.\n     ",
      "child_ranges": [
        "(line 488,col 9)-(line 490,col 9)",
        "(line 492,col 9)-(line 492,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineFunction.computePartialDerivatives()",
      "begin_line": 498,
      "end_line": 573,
      "comment": "\n     * Compute all partial derivatives functions.\n     ",
      "child_ranges": [
        "(line 499,col 9)-(line 499,col 47)",
        "(line 500,col 9)-(line 500,col 47)",
        "(line 501,col 9)-(line 501,col 48)",
        "(line 502,col 9)-(line 502,col 48)",
        "(line 503,col 9)-(line 503,col 48)",
        "(line 505,col 9)-(line 514,col 9)",
        "(line 516,col 9)-(line 527,col 14)",
        "(line 528,col 9)-(line 539,col 14)",
        "(line 540,col 9)-(line 550,col 14)",
        "(line 551,col 9)-(line 561,col 14)",
        "(line 562,col 9)-(line 572,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineFunction.Anonymous-37eea5b4-ab07-4e2a-bbf5-7bdf38537490.value(double, double)",
      "begin_line": 517,
      "end_line": 526,
      "comment": "",
      "child_ranges": [
        "(line 518,col 21)-(line 518,col 44)",
        "(line 519,col 21)-(line 519,col 54)",
        "(line 521,col 21)-(line 521,col 44)",
        "(line 522,col 21)-(line 522,col 45)",
        "(line 523,col 21)-(line 523,col 55)",
        "(line 525,col 21)-(line 525,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineFunction.Anonymous-a1126b61-4a3b-4324-a70b-bf8bbc8058d6.value(double, double)",
      "begin_line": 529,
      "end_line": 538,
      "comment": "",
      "child_ranges": [
        "(line 530,col 21)-(line 530,col 44)",
        "(line 531,col 21)-(line 531,col 45)",
        "(line 532,col 21)-(line 532,col 55)",
        "(line 534,col 21)-(line 534,col 44)",
        "(line 535,col 21)-(line 535,col 54)",
        "(line 537,col 21)-(line 537,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineFunction.Anonymous-6d20b963-40e9-4553-b6d5-2bda84ec2b64.value(double, double)",
      "begin_line": 541,
      "end_line": 549,
      "comment": "",
      "child_ranges": [
        "(line 542,col 21)-(line 542,col 53)",
        "(line 544,col 21)-(line 544,col 44)",
        "(line 545,col 21)-(line 545,col 45)",
        "(line 546,col 21)-(line 546,col 55)",
        "(line 548,col 21)-(line 548,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineFunction.Anonymous-c68d8ceb-fce4-425d-9244-0162a1aa41fc.value(double, double)",
      "begin_line": 552,
      "end_line": 560,
      "comment": "",
      "child_ranges": [
        "(line 553,col 21)-(line 553,col 44)",
        "(line 554,col 21)-(line 554,col 45)",
        "(line 555,col 21)-(line 555,col 55)",
        "(line 557,col 21)-(line 557,col 53)",
        "(line 559,col 21)-(line 559,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineFunction.Anonymous-7aa22ebf-52d4-49ba-9d67-accc567b31af.value(double, double)",
      "begin_line": 563,
      "end_line": 571,
      "comment": "",
      "child_ranges": [
        "(line 564,col 21)-(line 564,col 44)",
        "(line 565,col 21)-(line 565,col 54)",
        "(line 567,col 21)-(line 567,col 44)",
        "(line 568,col 21)-(line 568,col 54)",
        "(line 570,col 21)-(line 570,col 46)"
      ]
    }
  ]
}