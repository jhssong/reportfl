{
  "filepath": "/tmp/Math-66b/src/main/java/org/apache/commons/math/analysis/interpolation/BicubicSplineInterpolatingFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BicubicSplineInterpolatingFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.BivariateRealFunction"
      ],
      "begin_line": 35,
      "end_line": 340,
      "comment": "\n * Function that implements the\n * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Bicubic_interpolation\"\u003e\n * bicubic spline interpolation\u003c/a\u003e.\n *\n * @version $Revision$ $Date$\n * @since 2.1\n "
    },
    {
      "type": "field",
      "varNames": [
        "AINV"
      ],
      "begin_line": 41,
      "end_line": 58,
      "comment": "\n     * Matrix to compute the spline coefficients from the function values\n     * and function derivatives values\n     "
    },
    {
      "type": "field",
      "varNames": [
        "xval"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Samples x-coordinates "
    },
    {
      "type": "field",
      "varNames": [
        "yval"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Samples y-coordinates "
    },
    {
      "type": "field",
      "varNames": [
        "splines"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Set of cubic splines patching the whole data grid "
    },
    {
      "type": "field",
      "varNames": [
        "partialDerivatives"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": "\n     * Partial derivatives\n     * The value of the first index determines the kind of derivatives:\n     * 0 \u003d first partial derivatives wrt x\n     * 1 \u003d first partial derivatives wrt y\n     * 2 \u003d second partial derivatives wrt x\n     * 3 \u003d second partial derivatives wrt y\n     * 4 \u003d cross partial derivatives\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineInterpolatingFunction.BicubicSplineInterpolatingFunction(double[], double[], double[][], double[][], double[][], double[][])",
      "begin_line": 93,
      "end_line": 155,
      "comment": "\n     * @param x Sample values of the x-coordinate, in increasing order.\n     * @param y Sample values of the y-coordinate, in increasing order.\n     * @param f Values of the function on every grid point.\n     * @param dFdX Values of the partial derivative of function with respect\n     * to x on every grid point.\n     * @param dFdY Values of the partial derivative of function with respect\n     * to y on every grid point.\n     * @param d2FdXdY Values of the cross partial derivative of function on\n     * every grid point.\n     * @throws DimensionMismatchException if the various arrays do not contain\n     * the expected number of elements.\n     * @throws NonMonotonousSequenceException if {@code x} or {@code y} are not strictly\n     * increasing.\n     * @throws NoDataException if any of the arrays has zero length.\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 34)",
        "(line 101,col 9)-(line 101,col 34)",
        "(line 103,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 108,col 9)",
        "(line 109,col 9)-(line 111,col 9)",
        "(line 112,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 117,col 9)",
        "(line 119,col 9)-(line 119,col 32)",
        "(line 120,col 9)-(line 120,col 32)",
        "(line 122,col 9)-(line 122,col 25)",
        "(line 123,col 9)-(line 123,col 25)",
        "(line 125,col 9)-(line 125,col 35)",
        "(line 126,col 9)-(line 126,col 35)",
        "(line 127,col 9)-(line 127,col 58)",
        "(line 129,col 9)-(line 154,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineInterpolatingFunction.value(double, double)",
      "begin_line": 160,
      "end_line": 174,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 43)",
        "(line 162,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 165,col 43)",
        "(line 166,col 9)-(line 168,col 9)",
        "(line 170,col 9)-(line 170,col 66)",
        "(line 171,col 9)-(line 171,col 66)",
        "(line 173,col 9)-(line 173,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineInterpolatingFunction.partialDerivativeX(double, double)",
      "begin_line": 182,
      "end_line": 184,
      "comment": "\n     * @param x x-coordinate.\n     * @param y y-coordinate.\n     * @return the value at point (x, y) of the first partial derivative with\n     * respect to x.\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineInterpolatingFunction.partialDerivativeY(double, double)",
      "begin_line": 191,
      "end_line": 193,
      "comment": "\n     * @param x x-coordinate.\n     * @param y y-coordinate.\n     * @return the value at point (x, y) of the first partial derivative with\n     * respect to y.\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineInterpolatingFunction.partialDerivativeXX(double, double)",
      "begin_line": 200,
      "end_line": 202,
      "comment": "\n     * @param x x-coordinate.\n     * @param y y-coordinate.\n     * @return the value at point (x, y) of the second partial derivative with\n     * respect to x.\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineInterpolatingFunction.partialDerivativeYY(double, double)",
      "begin_line": 209,
      "end_line": 211,
      "comment": "\n     * @param x x-coordinate.\n     * @param y y-coordinate.\n     * @return the value at point (x, y) of the second partial derivative with\n     * respect to y.\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineInterpolatingFunction.partialDerivativeXY(double, double)",
      "begin_line": 217,
      "end_line": 219,
      "comment": "\n     * @param x x-coordinate.\n     * @param y y-coordinate.\n     * @return the value at point (x, y) of the second partial cross-derivative.\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineInterpolatingFunction.partialDerivative(int, double, double)",
      "begin_line": 227,
      "end_line": 253,
      "comment": "\n     * @param which First index in {@link #partialDerivatives}.\n     * @param x x-coordinate.\n     * @param y y-coordinate.\n     * @return the value at point (x, y) of the selected partial derivative.\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 230,col 9)",
        "(line 232,col 9)-(line 232,col 43)",
        "(line 233,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 236,col 43)",
        "(line 237,col 9)-(line 239,col 9)",
        "(line 241,col 9)-(line 241,col 66)",
        "(line 242,col 9)-(line 242,col 66)",
        "(line 244,col 9)-(line 244,col 35)",
        "(line 245,col 9)-(line 250,col 9)",
        "(line 252,col 9)-(line 252,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineInterpolatingFunction.computePartialDerivatives()",
      "begin_line": 258,
      "end_line": 273,
      "comment": "\n     * Compute all partial derivatives.\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 42)",
        "(line 260,col 9)-(line 260,col 42)",
        "(line 261,col 9)-(line 261,col 72)",
        "(line 263,col 9)-(line 272,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineInterpolatingFunction.searchIndex(double, double[])",
      "begin_line": 282,
      "end_line": 295,
      "comment": "\n     * @param c Coordinate.\n     * @param val Coordinate samples.\n     * @return the index in {@code val} corresponding to the interval\n     * containing {@code c}, or {@code -1} if {@code c} is out of the\n     * range defined by the end values of {@code val}.\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 285,col 9)",
        "(line 287,col 9)-(line 287,col 35)",
        "(line 288,col 9)-(line 292,col 9)",
        "(line 294,col 9)-(line 294,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineInterpolatingFunction.computeSplineCoefficients(double[])",
      "begin_line": 326,
      "end_line": 339,
      "comment": "\n     * Compute the spline coefficients from the list of function values and\n     * function partial derivatives values at the four corners of a grid\n     * element. They must be specified in the following order:\n     * \u003cul\u003e\n     *  \u003cli\u003ef(0,0)\u003c/li\u003e\n     *  \u003cli\u003ef(1,0)\u003c/li\u003e\n     *  \u003cli\u003ef(0,1)\u003c/li\u003e\n     *  \u003cli\u003ef(1,1)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ex\u003c/sub\u003e(0,0)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ex\u003c/sub\u003e(1,0)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ex\u003c/sub\u003e(0,1)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ex\u003c/sub\u003e(1,1)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ey\u003c/sub\u003e(0,0)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ey\u003c/sub\u003e(1,0)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ey\u003c/sub\u003e(0,1)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ey\u003c/sub\u003e(1,1)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003exy\u003c/sub\u003e(0,0)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003exy\u003c/sub\u003e(1,0)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003exy\u003c/sub\u003e(0,1)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003exy\u003c/sub\u003e(1,1)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * where the subscripts indicate the partial derivative with respect to\n     * the corresponding variable(s).\n     *\n     * @param beta List of function values and function partial derivatives\n     * values.\n     * @return the spline coefficients.\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 42)",
        "(line 329,col 9)-(line 336,col 9)",
        "(line 338,col 9)-(line 338,col 17)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BicubicSplineFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.BivariateRealFunction"
      ],
      "begin_line": 347,
      "end_line": 541,
      "comment": "\n * 2D-spline function.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "N"
      ],
      "begin_line": 349,
      "end_line": 349,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 351,
      "end_line": 351,
      "comment": " Coefficients "
    },
    {
      "type": "field",
      "varNames": [
        "partialDerivativeX"
      ],
      "begin_line": 353,
      "end_line": 353,
      "comment": " Partial derivatives "
    },
    {
      "type": "field",
      "varNames": [
        "partialDerivativeY"
      ],
      "begin_line": 354,
      "end_line": 354,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "partialDerivativeXX"
      ],
      "begin_line": 355,
      "end_line": 355,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "partialDerivativeYY"
      ],
      "begin_line": 356,
      "end_line": 356,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "partialDerivativeXY"
      ],
      "begin_line": 357,
      "end_line": 357,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.BicubicSplineFunction(double[])",
      "begin_line": 362,
      "end_line": 368,
      "comment": "\n     * @param a Spline coefficients\n     ",
      "child_ranges": [
        "(line 363,col 9)-(line 367,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.value(double, double)",
      "begin_line": 373,
      "end_line": 390,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 376,col 9)",
        "(line 377,col 9)-(line 379,col 9)",
        "(line 381,col 9)-(line 381,col 32)",
        "(line 382,col 9)-(line 382,col 33)",
        "(line 383,col 9)-(line 383,col 43)",
        "(line 385,col 9)-(line 385,col 32)",
        "(line 386,col 9)-(line 386,col 33)",
        "(line 387,col 9)-(line 387,col 43)",
        "(line 389,col 9)-(line 389,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.apply(double[], double[], double[][])",
      "begin_line": 400,
      "end_line": 409,
      "comment": "\n     * Compute the value of the bicubic polynomial.\n     *\n     * @param pX Powers of the x-coordinate.\n     * @param pY Powers of the y-coordinate.\n     * @param coeff Spline coefficients.\n     * @return the interpolated value.\n     ",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 26)",
        "(line 402,col 9)-(line 406,col 9)",
        "(line 408,col 9)-(line 408,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.partialDerivativeX()",
      "begin_line": 414,
      "end_line": 420,
      "comment": "\n     * @return the partial derivative wrt {@code x}.\n     ",
      "child_ranges": [
        "(line 415,col 9)-(line 417,col 9)",
        "(line 419,col 9)-(line 419,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.partialDerivativeY()",
      "begin_line": 424,
      "end_line": 430,
      "comment": "\n     * @return the partial derivative wrt {@code y}.\n     ",
      "child_ranges": [
        "(line 425,col 9)-(line 427,col 9)",
        "(line 429,col 9)-(line 429,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.partialDerivativeXX()",
      "begin_line": 434,
      "end_line": 440,
      "comment": "\n     * @return the second partial derivative wrt {@code x}.\n     ",
      "child_ranges": [
        "(line 435,col 9)-(line 437,col 9)",
        "(line 439,col 9)-(line 439,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.partialDerivativeYY()",
      "begin_line": 444,
      "end_line": 450,
      "comment": "\n     * @return the second partial derivative wrt {@code y}.\n     ",
      "child_ranges": [
        "(line 445,col 9)-(line 447,col 9)",
        "(line 449,col 9)-(line 449,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.partialDerivativeXY()",
      "begin_line": 454,
      "end_line": 460,
      "comment": "\n     * @return the second partial cross-derivative.\n     ",
      "child_ranges": [
        "(line 455,col 9)-(line 457,col 9)",
        "(line 459,col 9)-(line 459,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.computePartialDerivatives()",
      "begin_line": 465,
      "end_line": 540,
      "comment": "\n     * Compute all partial derivatives functions.\n     ",
      "child_ranges": [
        "(line 466,col 9)-(line 466,col 47)",
        "(line 467,col 9)-(line 467,col 47)",
        "(line 468,col 9)-(line 468,col 48)",
        "(line 469,col 9)-(line 469,col 48)",
        "(line 470,col 9)-(line 470,col 48)",
        "(line 472,col 9)-(line 481,col 9)",
        "(line 483,col 9)-(line 494,col 14)",
        "(line 495,col 9)-(line 506,col 14)",
        "(line 507,col 9)-(line 517,col 14)",
        "(line 518,col 9)-(line 528,col 14)",
        "(line 529,col 9)-(line 539,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.Anonymous-2f18bb53-598e-4253-a45b-5fb2530a8e04.value(double, double)",
      "begin_line": 484,
      "end_line": 493,
      "comment": "",
      "child_ranges": [
        "(line 485,col 21)-(line 485,col 44)",
        "(line 486,col 21)-(line 486,col 54)",
        "(line 488,col 21)-(line 488,col 44)",
        "(line 489,col 21)-(line 489,col 45)",
        "(line 490,col 21)-(line 490,col 55)",
        "(line 492,col 21)-(line 492,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.Anonymous-0a44d468-c954-4a26-86f9-2a9ad6d74d76.value(double, double)",
      "begin_line": 496,
      "end_line": 505,
      "comment": "",
      "child_ranges": [
        "(line 497,col 21)-(line 497,col 44)",
        "(line 498,col 21)-(line 498,col 45)",
        "(line 499,col 21)-(line 499,col 55)",
        "(line 501,col 21)-(line 501,col 44)",
        "(line 502,col 21)-(line 502,col 54)",
        "(line 504,col 21)-(line 504,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.Anonymous-5f3951d2-e0dc-4dd9-bc37-7fbce42a5a93.value(double, double)",
      "begin_line": 508,
      "end_line": 516,
      "comment": "",
      "child_ranges": [
        "(line 509,col 21)-(line 509,col 53)",
        "(line 511,col 21)-(line 511,col 44)",
        "(line 512,col 21)-(line 512,col 45)",
        "(line 513,col 21)-(line 513,col 55)",
        "(line 515,col 21)-(line 515,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.Anonymous-db6a1896-4e9a-42e8-b642-9d12662e761d.value(double, double)",
      "begin_line": 519,
      "end_line": 527,
      "comment": "",
      "child_ranges": [
        "(line 520,col 21)-(line 520,col 44)",
        "(line 521,col 21)-(line 521,col 45)",
        "(line 522,col 21)-(line 522,col 55)",
        "(line 524,col 21)-(line 524,col 53)",
        "(line 526,col 21)-(line 526,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.Anonymous-a155d594-714d-4142-b39b-f48cf4a3b5b0.value(double, double)",
      "begin_line": 530,
      "end_line": 538,
      "comment": "",
      "child_ranges": [
        "(line 531,col 21)-(line 531,col 44)",
        "(line 532,col 21)-(line 532,col 54)",
        "(line 534,col 21)-(line 534,col 44)",
        "(line 535,col 21)-(line 535,col 54)",
        "(line 537,col 21)-(line 537,col 46)"
      ]
    }
  ]
}