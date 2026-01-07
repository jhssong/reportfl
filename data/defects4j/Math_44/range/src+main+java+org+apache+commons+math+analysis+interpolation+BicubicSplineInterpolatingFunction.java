{
  "filepath": "/tmp/Math-44b/src/main/java/org/apache/commons/math/analysis/interpolation/BicubicSplineInterpolatingFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BicubicSplineInterpolatingFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.BivariateRealFunction"
      ],
      "begin_line": 33,
      "end_line": 330,
      "comment": "\n * Function that implements the\n * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Bicubic_interpolation\"\u003e\n * bicubic spline interpolation\u003c/a\u003e.\n *\n * @version $Id$\n * @since 2.1\n "
    },
    {
      "type": "field",
      "varNames": [
        "AINV"
      ],
      "begin_line": 39,
      "end_line": 56,
      "comment": "\n     * Matrix to compute the spline coefficients from the function values\n     * and function derivatives values\n     "
    },
    {
      "type": "field",
      "varNames": [
        "xval"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Samples x-coordinates "
    },
    {
      "type": "field",
      "varNames": [
        "yval"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Samples y-coordinates "
    },
    {
      "type": "field",
      "varNames": [
        "splines"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Set of cubic splines patching the whole data grid "
    },
    {
      "type": "field",
      "varNames": [
        "partialDerivatives"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": "\n     * Partial derivatives\n     * The value of the first index determines the kind of derivatives:\n     * 0 \u003d first partial derivatives wrt x\n     * 1 \u003d first partial derivatives wrt y\n     * 2 \u003d second partial derivatives wrt x\n     * 3 \u003d second partial derivatives wrt y\n     * 4 \u003d cross partial derivatives\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineInterpolatingFunction.BicubicSplineInterpolatingFunction(double[], double[], double[][], double[][], double[][], double[][])",
      "begin_line": 91,
      "end_line": 153,
      "comment": "\n     * @param x Sample values of the x-coordinate, in increasing order.\n     * @param y Sample values of the y-coordinate, in increasing order.\n     * @param f Values of the function on every grid point.\n     * @param dFdX Values of the partial derivative of function with respect\n     * to x on every grid point.\n     * @param dFdY Values of the partial derivative of function with respect\n     * to y on every grid point.\n     * @param d2FdXdY Values of the cross partial derivative of function on\n     * every grid point.\n     * @throws DimensionMismatchException if the various arrays do not contain\n     * the expected number of elements.\n     * @throws org.apache.commons.math.exception.NonMonotonicSequenceException\n     * if {@code x} or {@code y} are not strictly increasing.\n     * @throws NoDataException if any of the arrays has zero length.\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 34)",
        "(line 99,col 9)-(line 99,col 34)",
        "(line 101,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 109,col 9)",
        "(line 110,col 9)-(line 112,col 9)",
        "(line 113,col 9)-(line 115,col 9)",
        "(line 117,col 9)-(line 117,col 33)",
        "(line 118,col 9)-(line 118,col 33)",
        "(line 120,col 9)-(line 120,col 25)",
        "(line 121,col 9)-(line 121,col 25)",
        "(line 123,col 9)-(line 123,col 35)",
        "(line 124,col 9)-(line 124,col 35)",
        "(line 125,col 9)-(line 125,col 58)",
        "(line 127,col 9)-(line 152,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineInterpolatingFunction.value(double, double)",
      "begin_line": 158,
      "end_line": 172,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 43)",
        "(line 160,col 9)-(line 162,col 9)",
        "(line 163,col 9)-(line 163,col 43)",
        "(line 164,col 9)-(line 166,col 9)",
        "(line 168,col 9)-(line 168,col 66)",
        "(line 169,col 9)-(line 169,col 66)",
        "(line 171,col 9)-(line 171,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineInterpolatingFunction.partialDerivativeX(double, double)",
      "begin_line": 180,
      "end_line": 182,
      "comment": "\n     * @param x x-coordinate.\n     * @param y y-coordinate.\n     * @return the value at point (x, y) of the first partial derivative with\n     * respect to x.\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineInterpolatingFunction.partialDerivativeY(double, double)",
      "begin_line": 189,
      "end_line": 191,
      "comment": "\n     * @param x x-coordinate.\n     * @param y y-coordinate.\n     * @return the value at point (x, y) of the first partial derivative with\n     * respect to y.\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineInterpolatingFunction.partialDerivativeXX(double, double)",
      "begin_line": 198,
      "end_line": 200,
      "comment": "\n     * @param x x-coordinate.\n     * @param y y-coordinate.\n     * @return the value at point (x, y) of the second partial derivative with\n     * respect to x.\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineInterpolatingFunction.partialDerivativeYY(double, double)",
      "begin_line": 207,
      "end_line": 209,
      "comment": "\n     * @param x x-coordinate.\n     * @param y y-coordinate.\n     * @return the value at point (x, y) of the second partial derivative with\n     * respect to y.\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineInterpolatingFunction.partialDerivativeXY(double, double)",
      "begin_line": 215,
      "end_line": 217,
      "comment": "\n     * @param x x-coordinate.\n     * @param y y-coordinate.\n     * @return the value at point (x, y) of the second partial cross-derivative.\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineInterpolatingFunction.partialDerivative(int, double, double)",
      "begin_line": 225,
      "end_line": 243,
      "comment": "\n     * @param which First index in {@link #partialDerivatives}.\n     * @param x x-coordinate.\n     * @param y y-coordinate.\n     * @return the value at point (x, y) of the selected partial derivative.\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 228,col 9)",
        "(line 230,col 9)-(line 230,col 43)",
        "(line 231,col 9)-(line 233,col 9)",
        "(line 234,col 9)-(line 234,col 43)",
        "(line 235,col 9)-(line 237,col 9)",
        "(line 239,col 9)-(line 239,col 66)",
        "(line 240,col 9)-(line 240,col 66)",
        "(line 242,col 9)-(line 242,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineInterpolatingFunction.computePartialDerivatives()",
      "begin_line": 248,
      "end_line": 263,
      "comment": "\n     * Compute all partial derivatives.\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 42)",
        "(line 250,col 9)-(line 250,col 42)",
        "(line 251,col 9)-(line 251,col 72)",
        "(line 253,col 9)-(line 262,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineInterpolatingFunction.searchIndex(double, double[])",
      "begin_line": 272,
      "end_line": 285,
      "comment": "\n     * @param c Coordinate.\n     * @param val Coordinate samples.\n     * @return the index in {@code val} corresponding to the interval\n     * containing {@code c}, or {@code -1} if {@code c} is out of the\n     * range defined by the end values of {@code val}.\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 275,col 9)",
        "(line 277,col 9)-(line 277,col 35)",
        "(line 278,col 9)-(line 282,col 9)",
        "(line 284,col 9)-(line 284,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineInterpolatingFunction.computeSplineCoefficients(double[])",
      "begin_line": 316,
      "end_line": 329,
      "comment": "\n     * Compute the spline coefficients from the list of function values and\n     * function partial derivatives values at the four corners of a grid\n     * element. They must be specified in the following order:\n     * \u003cul\u003e\n     *  \u003cli\u003ef(0,0)\u003c/li\u003e\n     *  \u003cli\u003ef(1,0)\u003c/li\u003e\n     *  \u003cli\u003ef(0,1)\u003c/li\u003e\n     *  \u003cli\u003ef(1,1)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ex\u003c/sub\u003e(0,0)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ex\u003c/sub\u003e(1,0)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ex\u003c/sub\u003e(0,1)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ex\u003c/sub\u003e(1,1)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ey\u003c/sub\u003e(0,0)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ey\u003c/sub\u003e(1,0)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ey\u003c/sub\u003e(0,1)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ey\u003c/sub\u003e(1,1)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003exy\u003c/sub\u003e(0,0)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003exy\u003c/sub\u003e(1,0)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003exy\u003c/sub\u003e(0,1)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003exy\u003c/sub\u003e(1,1)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * where the subscripts indicate the partial derivative with respect to\n     * the corresponding variable(s).\n     *\n     * @param beta List of function values and function partial derivatives\n     * values.\n     * @return the spline coefficients.\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 42)",
        "(line 319,col 9)-(line 326,col 9)",
        "(line 328,col 9)-(line 328,col 17)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BicubicSplineFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.BivariateRealFunction"
      ],
      "begin_line": 337,
      "end_line": 545,
      "comment": "\n * 2D-spline function.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "N"
      ],
      "begin_line": 341,
      "end_line": 341,
      "comment": " Number of points. "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 344,
      "end_line": 344,
      "comment": " Coefficients "
    },
    {
      "type": "field",
      "varNames": [
        "partialDerivativeX"
      ],
      "begin_line": 347,
      "end_line": 347,
      "comment": " First partial derivative along x. "
    },
    {
      "type": "field",
      "varNames": [
        "partialDerivativeY"
      ],
      "begin_line": 350,
      "end_line": 350,
      "comment": " First partial derivative along y. "
    },
    {
      "type": "field",
      "varNames": [
        "partialDerivativeXX"
      ],
      "begin_line": 353,
      "end_line": 353,
      "comment": " Second partial derivative along x. "
    },
    {
      "type": "field",
      "varNames": [
        "partialDerivativeYY"
      ],
      "begin_line": 356,
      "end_line": 356,
      "comment": " Second partial derivative along y. "
    },
    {
      "type": "field",
      "varNames": [
        "partialDerivativeXY"
      ],
      "begin_line": 359,
      "end_line": 359,
      "comment": " Second crossed partial derivative. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.BicubicSplineFunction(double[])",
      "begin_line": 365,
      "end_line": 372,
      "comment": "\n     * Simple constructor.\n     * @param a Spline coefficients\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 34)",
        "(line 367,col 9)-(line 371,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.value(double, double)",
      "begin_line": 377,
      "end_line": 394,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 380,col 9)",
        "(line 381,col 9)-(line 383,col 9)",
        "(line 385,col 9)-(line 385,col 32)",
        "(line 386,col 9)-(line 386,col 33)",
        "(line 387,col 9)-(line 387,col 43)",
        "(line 389,col 9)-(line 389,col 32)",
        "(line 390,col 9)-(line 390,col 33)",
        "(line 391,col 9)-(line 391,col 43)",
        "(line 393,col 9)-(line 393,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.apply(double[], double[], double[][])",
      "begin_line": 404,
      "end_line": 413,
      "comment": "\n     * Compute the value of the bicubic polynomial.\n     *\n     * @param pX Powers of the x-coordinate.\n     * @param pY Powers of the y-coordinate.\n     * @param coeff Spline coefficients.\n     * @return the interpolated value.\n     ",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 26)",
        "(line 406,col 9)-(line 410,col 9)",
        "(line 412,col 9)-(line 412,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.partialDerivativeX()",
      "begin_line": 418,
      "end_line": 424,
      "comment": "\n     * @return the partial derivative wrt {@code x}.\n     ",
      "child_ranges": [
        "(line 419,col 9)-(line 421,col 9)",
        "(line 423,col 9)-(line 423,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.partialDerivativeY()",
      "begin_line": 428,
      "end_line": 434,
      "comment": "\n     * @return the partial derivative wrt {@code y}.\n     ",
      "child_ranges": [
        "(line 429,col 9)-(line 431,col 9)",
        "(line 433,col 9)-(line 433,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.partialDerivativeXX()",
      "begin_line": 438,
      "end_line": 444,
      "comment": "\n     * @return the second partial derivative wrt {@code x}.\n     ",
      "child_ranges": [
        "(line 439,col 9)-(line 441,col 9)",
        "(line 443,col 9)-(line 443,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.partialDerivativeYY()",
      "begin_line": 448,
      "end_line": 454,
      "comment": "\n     * @return the second partial derivative wrt {@code y}.\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 451,col 9)",
        "(line 453,col 9)-(line 453,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.partialDerivativeXY()",
      "begin_line": 458,
      "end_line": 464,
      "comment": "\n     * @return the second partial cross-derivative.\n     ",
      "child_ranges": [
        "(line 459,col 9)-(line 461,col 9)",
        "(line 463,col 9)-(line 463,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.computePartialDerivatives()",
      "begin_line": 469,
      "end_line": 544,
      "comment": "\n     * Compute all partial derivatives functions.\n     ",
      "child_ranges": [
        "(line 470,col 9)-(line 470,col 47)",
        "(line 471,col 9)-(line 471,col 47)",
        "(line 472,col 9)-(line 472,col 48)",
        "(line 473,col 9)-(line 473,col 48)",
        "(line 474,col 9)-(line 474,col 48)",
        "(line 476,col 9)-(line 485,col 9)",
        "(line 487,col 9)-(line 498,col 14)",
        "(line 499,col 9)-(line 510,col 14)",
        "(line 511,col 9)-(line 521,col 14)",
        "(line 522,col 9)-(line 532,col 14)",
        "(line 533,col 9)-(line 543,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.Anonymous-280a365a-8611-4416-8fd3-69b68e4e8777.value(double, double)",
      "begin_line": 488,
      "end_line": 497,
      "comment": "",
      "child_ranges": [
        "(line 489,col 21)-(line 489,col 44)",
        "(line 490,col 21)-(line 490,col 54)",
        "(line 492,col 21)-(line 492,col 44)",
        "(line 493,col 21)-(line 493,col 45)",
        "(line 494,col 21)-(line 494,col 55)",
        "(line 496,col 21)-(line 496,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.Anonymous-67c570c1-309b-4689-9b0c-dcee46dd70ba.value(double, double)",
      "begin_line": 500,
      "end_line": 509,
      "comment": "",
      "child_ranges": [
        "(line 501,col 21)-(line 501,col 44)",
        "(line 502,col 21)-(line 502,col 45)",
        "(line 503,col 21)-(line 503,col 55)",
        "(line 505,col 21)-(line 505,col 44)",
        "(line 506,col 21)-(line 506,col 54)",
        "(line 508,col 21)-(line 508,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.Anonymous-62403a9d-1a6f-43cc-969e-5af363dd7153.value(double, double)",
      "begin_line": 512,
      "end_line": 520,
      "comment": "",
      "child_ranges": [
        "(line 513,col 21)-(line 513,col 53)",
        "(line 515,col 21)-(line 515,col 44)",
        "(line 516,col 21)-(line 516,col 45)",
        "(line 517,col 21)-(line 517,col 55)",
        "(line 519,col 21)-(line 519,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.Anonymous-ee926789-2872-4d53-920c-fcf29833a437.value(double, double)",
      "begin_line": 523,
      "end_line": 531,
      "comment": "",
      "child_ranges": [
        "(line 524,col 21)-(line 524,col 44)",
        "(line 525,col 21)-(line 525,col 45)",
        "(line 526,col 21)-(line 526,col 55)",
        "(line 528,col 21)-(line 528,col 53)",
        "(line 530,col 21)-(line 530,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.Anonymous-3c8a0335-4cab-442d-bf41-1b563b7d6843.value(double, double)",
      "begin_line": 534,
      "end_line": 542,
      "comment": "",
      "child_ranges": [
        "(line 535,col 21)-(line 535,col 44)",
        "(line 536,col 21)-(line 536,col 54)",
        "(line 538,col 21)-(line 538,col 44)",
        "(line 539,col 21)-(line 539,col 54)",
        "(line 541,col 21)-(line 541,col 46)"
      ]
    }
  ]
}