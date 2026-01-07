{
  "filepath": "/tmp/Math-69b/src/main/java/org/apache/commons/math/analysis/interpolation/BicubicSplineInterpolatingFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BicubicSplineInterpolatingFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.BivariateRealFunction"
      ],
      "begin_line": 33,
      "end_line": 341,
      "comment": "\n * Function that implements the\n * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Bicubic_interpolation\"\u003e\n * bicubic spline interpolation\u003c/a\u003e.\n *\n * @version $Revision$ $Date$\n * @since 2.1\n "
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
      "begin_line": 90,
      "end_line": 152,
      "comment": "\n     * @param x Sample values of the x-coordinate, in increasing order.\n     * @param y Sample values of the y-coordinate, in increasing order.\n     * @param f Values of the function on every grid point.\n     * @param dFdX Values of the partial derivative of function with respect\n     * to x on every grid point.\n     * @param dFdY Values of the partial derivative of function with respect\n     * to y on every grid point.\n     * @param d2FdXdY Values of the cross partial derivative of function on\n     * every grid point.\n     * @throws DimensionMismatchException if the various arrays do not contain\n     * the expected number of elements.\n     * @throws IllegalArgumentException if {@code x} or {@code y} are not strictly\n     * increasing.\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 34)",
        "(line 98,col 9)-(line 98,col 34)",
        "(line 100,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 108,col 9)",
        "(line 109,col 9)-(line 111,col 9)",
        "(line 112,col 9)-(line 114,col 9)",
        "(line 116,col 9)-(line 116,col 41)",
        "(line 117,col 9)-(line 117,col 41)",
        "(line 119,col 9)-(line 119,col 25)",
        "(line 120,col 9)-(line 120,col 25)",
        "(line 122,col 9)-(line 122,col 35)",
        "(line 123,col 9)-(line 123,col 35)",
        "(line 124,col 9)-(line 124,col 58)",
        "(line 126,col 9)-(line 151,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineInterpolatingFunction.value(double, double)",
      "begin_line": 157,
      "end_line": 173,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 43)",
        "(line 159,col 9)-(line 162,col 9)",
        "(line 163,col 9)-(line 163,col 43)",
        "(line 164,col 9)-(line 167,col 9)",
        "(line 169,col 9)-(line 169,col 66)",
        "(line 170,col 9)-(line 170,col 66)",
        "(line 172,col 9)-(line 172,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineInterpolatingFunction.partialDerivativeX(double, double)",
      "begin_line": 181,
      "end_line": 183,
      "comment": "\n     * @param x x-coordinate.\n     * @param y y-coordinate.\n     * @return the value at point (x, y) of the first partial derivative with\n     * respect to x.\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineInterpolatingFunction.partialDerivativeY(double, double)",
      "begin_line": 190,
      "end_line": 192,
      "comment": "\n     * @param x x-coordinate.\n     * @param y y-coordinate.\n     * @return the value at point (x, y) of the first partial derivative with\n     * respect to y.\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineInterpolatingFunction.partialDerivativeXX(double, double)",
      "begin_line": 199,
      "end_line": 201,
      "comment": "\n     * @param x x-coordinate.\n     * @param y y-coordinate.\n     * @return the value at point (x, y) of the second partial derivative with\n     * respect to x.\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineInterpolatingFunction.partialDerivativeYY(double, double)",
      "begin_line": 208,
      "end_line": 210,
      "comment": "\n     * @param x x-coordinate.\n     * @param y y-coordinate.\n     * @return the value at point (x, y) of the second partial derivative with\n     * respect to y.\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineInterpolatingFunction.partialDerivativeXY(double, double)",
      "begin_line": 216,
      "end_line": 218,
      "comment": "\n     * @param x x-coordinate.\n     * @param y y-coordinate.\n     * @return the value at point (x, y) of the second partial cross-derivative.\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineInterpolatingFunction.partialDerivative(int, double, double)",
      "begin_line": 226,
      "end_line": 254,
      "comment": "\n     * @param which First index in {@link #partialDerivatives}.\n     * @param x x-coordinate.\n     * @param y y-coordinate.\n     * @return the value at point (x, y) of the selected partial derivative.\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 229,col 9)",
        "(line 231,col 9)-(line 231,col 43)",
        "(line 232,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 236,col 43)",
        "(line 237,col 9)-(line 240,col 9)",
        "(line 242,col 9)-(line 242,col 66)",
        "(line 243,col 9)-(line 243,col 66)",
        "(line 245,col 9)-(line 245,col 35)",
        "(line 246,col 9)-(line 251,col 9)",
        "(line 253,col 9)-(line 253,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineInterpolatingFunction.computePartialDerivatives()",
      "begin_line": 259,
      "end_line": 274,
      "comment": "\n     * Compute all partial derivatives.\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 42)",
        "(line 261,col 9)-(line 261,col 42)",
        "(line 262,col 9)-(line 262,col 72)",
        "(line 264,col 9)-(line 273,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineInterpolatingFunction.searchIndex(double, double[])",
      "begin_line": 283,
      "end_line": 296,
      "comment": "\n     * @param c Coordinate.\n     * @param val Coordinate samples.\n     * @return the index in {@code val} corresponding to the interval\n     * containing {@code c}, or {@code -1} if {@code c} is out of the\n     * range defined by the end values of {@code val}.\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 286,col 9)",
        "(line 288,col 9)-(line 288,col 35)",
        "(line 289,col 9)-(line 293,col 9)",
        "(line 295,col 9)-(line 295,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineInterpolatingFunction.computeSplineCoefficients(double[])",
      "begin_line": 327,
      "end_line": 340,
      "comment": "\n     * Compute the spline coefficients from the list of function values and\n     * function partial derivatives values at the four corners of a grid\n     * element. They must be specified in the following order:\n     * \u003cul\u003e\n     *  \u003cli\u003ef(0,0)\u003c/li\u003e\n     *  \u003cli\u003ef(1,0)\u003c/li\u003e\n     *  \u003cli\u003ef(0,1)\u003c/li\u003e\n     *  \u003cli\u003ef(1,1)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ex\u003c/sub\u003e(0,0)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ex\u003c/sub\u003e(1,0)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ex\u003c/sub\u003e(0,1)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ex\u003c/sub\u003e(1,1)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ey\u003c/sub\u003e(0,0)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ey\u003c/sub\u003e(1,0)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ey\u003c/sub\u003e(0,1)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ey\u003c/sub\u003e(1,1)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003exy\u003c/sub\u003e(0,0)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003exy\u003c/sub\u003e(1,0)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003exy\u003c/sub\u003e(0,1)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003exy\u003c/sub\u003e(1,1)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * where the subscripts indicate the partial derivative with respect to\n     * the corresponding variable(s).\n     *\n     * @param beta List of function values and function partial derivatives\n     * values.\n     * @return the spline coefficients.\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 42)",
        "(line 330,col 9)-(line 337,col 9)",
        "(line 339,col 9)-(line 339,col 17)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BicubicSplineFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.BivariateRealFunction"
      ],
      "begin_line": 348,
      "end_line": 544,
      "comment": "\n * 2D-spline function.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "N"
      ],
      "begin_line": 350,
      "end_line": 350,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 352,
      "end_line": 352,
      "comment": " Coefficients "
    },
    {
      "type": "field",
      "varNames": [
        "partialDerivativeX"
      ],
      "begin_line": 354,
      "end_line": 354,
      "comment": " Partial derivatives "
    },
    {
      "type": "field",
      "varNames": [
        "partialDerivativeY"
      ],
      "begin_line": 355,
      "end_line": 355,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "partialDerivativeXX"
      ],
      "begin_line": 356,
      "end_line": 356,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "partialDerivativeYY"
      ],
      "begin_line": 357,
      "end_line": 357,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "partialDerivativeXY"
      ],
      "begin_line": 358,
      "end_line": 358,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.BicubicSplineFunction(double[])",
      "begin_line": 363,
      "end_line": 369,
      "comment": "\n     * @param a Spline coefficients\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 368,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.value(double, double)",
      "begin_line": 374,
      "end_line": 393,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 375,col 9)-(line 378,col 9)",
        "(line 379,col 9)-(line 382,col 9)",
        "(line 384,col 9)-(line 384,col 32)",
        "(line 385,col 9)-(line 385,col 33)",
        "(line 386,col 9)-(line 386,col 43)",
        "(line 388,col 9)-(line 388,col 32)",
        "(line 389,col 9)-(line 389,col 33)",
        "(line 390,col 9)-(line 390,col 43)",
        "(line 392,col 9)-(line 392,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.apply(double[], double[], double[][])",
      "begin_line": 403,
      "end_line": 412,
      "comment": "\n     * Compute the value of the bicubic polynomial.\n     *\n     * @param pX Powers of the x-coordinate.\n     * @param pY Powers of the y-coordinate.\n     * @param coeff Spline coefficients.\n     * @return the interpolated value.\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 26)",
        "(line 405,col 9)-(line 409,col 9)",
        "(line 411,col 9)-(line 411,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.partialDerivativeX()",
      "begin_line": 417,
      "end_line": 423,
      "comment": "\n     * @return the partial derivative wrt {@code x}.\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 420,col 9)",
        "(line 422,col 9)-(line 422,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.partialDerivativeY()",
      "begin_line": 427,
      "end_line": 433,
      "comment": "\n     * @return the partial derivative wrt {@code y}.\n     ",
      "child_ranges": [
        "(line 428,col 9)-(line 430,col 9)",
        "(line 432,col 9)-(line 432,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.partialDerivativeXX()",
      "begin_line": 437,
      "end_line": 443,
      "comment": "\n     * @return the second partial derivative wrt {@code x}.\n     ",
      "child_ranges": [
        "(line 438,col 9)-(line 440,col 9)",
        "(line 442,col 9)-(line 442,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.partialDerivativeYY()",
      "begin_line": 447,
      "end_line": 453,
      "comment": "\n     * @return the second partial derivative wrt {@code y}.\n     ",
      "child_ranges": [
        "(line 448,col 9)-(line 450,col 9)",
        "(line 452,col 9)-(line 452,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.partialDerivativeXY()",
      "begin_line": 457,
      "end_line": 463,
      "comment": "\n     * @return the second partial cross-derivative.\n     ",
      "child_ranges": [
        "(line 458,col 9)-(line 460,col 9)",
        "(line 462,col 9)-(line 462,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.computePartialDerivatives()",
      "begin_line": 468,
      "end_line": 543,
      "comment": "\n     * Compute all partial derivatives functions.\n     ",
      "child_ranges": [
        "(line 469,col 9)-(line 469,col 47)",
        "(line 470,col 9)-(line 470,col 47)",
        "(line 471,col 9)-(line 471,col 48)",
        "(line 472,col 9)-(line 472,col 48)",
        "(line 473,col 9)-(line 473,col 48)",
        "(line 475,col 9)-(line 484,col 9)",
        "(line 486,col 9)-(line 497,col 14)",
        "(line 498,col 9)-(line 509,col 14)",
        "(line 510,col 9)-(line 520,col 14)",
        "(line 521,col 9)-(line 531,col 14)",
        "(line 532,col 9)-(line 542,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.Anonymous-31d9f246-6793-4c42-bd59-49c9c833ffc5.value(double, double)",
      "begin_line": 487,
      "end_line": 496,
      "comment": "",
      "child_ranges": [
        "(line 488,col 21)-(line 488,col 44)",
        "(line 489,col 21)-(line 489,col 54)",
        "(line 491,col 21)-(line 491,col 44)",
        "(line 492,col 21)-(line 492,col 45)",
        "(line 493,col 21)-(line 493,col 55)",
        "(line 495,col 21)-(line 495,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.Anonymous-77c8494f-c4f9-45d3-8c01-422021eda9d7.value(double, double)",
      "begin_line": 499,
      "end_line": 508,
      "comment": "",
      "child_ranges": [
        "(line 500,col 21)-(line 500,col 44)",
        "(line 501,col 21)-(line 501,col 45)",
        "(line 502,col 21)-(line 502,col 55)",
        "(line 504,col 21)-(line 504,col 44)",
        "(line 505,col 21)-(line 505,col 54)",
        "(line 507,col 21)-(line 507,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.Anonymous-bfbd3ebe-5a37-49b9-a77c-cdaff25f3f9d.value(double, double)",
      "begin_line": 511,
      "end_line": 519,
      "comment": "",
      "child_ranges": [
        "(line 512,col 21)-(line 512,col 53)",
        "(line 514,col 21)-(line 514,col 44)",
        "(line 515,col 21)-(line 515,col 45)",
        "(line 516,col 21)-(line 516,col 55)",
        "(line 518,col 21)-(line 518,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.Anonymous-5dcffd64-2df1-4eba-af41-8631bd064571.value(double, double)",
      "begin_line": 522,
      "end_line": 530,
      "comment": "",
      "child_ranges": [
        "(line 523,col 21)-(line 523,col 44)",
        "(line 524,col 21)-(line 524,col 45)",
        "(line 525,col 21)-(line 525,col 55)",
        "(line 527,col 21)-(line 527,col 53)",
        "(line 529,col 21)-(line 529,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.Anonymous-5c7c42cb-e5ce-4924-b5a2-64a898cf8ada.value(double, double)",
      "begin_line": 533,
      "end_line": 541,
      "comment": "",
      "child_ranges": [
        "(line 534,col 21)-(line 534,col 44)",
        "(line 535,col 21)-(line 535,col 54)",
        "(line 537,col 21)-(line 537,col 44)",
        "(line 538,col 21)-(line 538,col 54)",
        "(line 540,col 21)-(line 540,col 46)"
      ]
    }
  ]
}