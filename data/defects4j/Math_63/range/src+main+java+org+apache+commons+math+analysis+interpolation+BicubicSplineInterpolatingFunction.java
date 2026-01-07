{
  "filepath": "/tmp/Math-63b/src/main/java/org/apache/commons/math/analysis/interpolation/BicubicSplineInterpolatingFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BicubicSplineInterpolatingFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.BivariateRealFunction"
      ],
      "begin_line": 34,
      "end_line": 339,
      "comment": "\n * Function that implements the\n * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Bicubic_interpolation\"\u003e\n * bicubic spline interpolation\u003c/a\u003e.\n *\n * @version $Revision$ $Date$\n * @since 2.1\n "
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
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineInterpolatingFunction.BicubicSplineInterpolatingFunction(double[], double[], double[][], double[][], double[][], double[][])",
      "begin_line": 92,
      "end_line": 154,
      "comment": "\n     * @param x Sample values of the x-coordinate, in increasing order.\n     * @param y Sample values of the y-coordinate, in increasing order.\n     * @param f Values of the function on every grid point.\n     * @param dFdX Values of the partial derivative of function with respect\n     * to x on every grid point.\n     * @param dFdY Values of the partial derivative of function with respect\n     * to y on every grid point.\n     * @param d2FdXdY Values of the cross partial derivative of function on\n     * every grid point.\n     * @throws DimensionMismatchException if the various arrays do not contain\n     * the expected number of elements.\n     * @throws org.apache.commons.math.exception.NonMonotonousSequenceException\n     * if {@code x} or {@code y} are not strictly increasing.\n     * @throws NoDataException if any of the arrays has zero length.\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 34)",
        "(line 100,col 9)-(line 100,col 34)",
        "(line 102,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 113,col 9)",
        "(line 114,col 9)-(line 116,col 9)",
        "(line 118,col 9)-(line 118,col 32)",
        "(line 119,col 9)-(line 119,col 32)",
        "(line 121,col 9)-(line 121,col 25)",
        "(line 122,col 9)-(line 122,col 25)",
        "(line 124,col 9)-(line 124,col 35)",
        "(line 125,col 9)-(line 125,col 35)",
        "(line 126,col 9)-(line 126,col 58)",
        "(line 128,col 9)-(line 153,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineInterpolatingFunction.value(double, double)",
      "begin_line": 159,
      "end_line": 173,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 43)",
        "(line 161,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 164,col 43)",
        "(line 165,col 9)-(line 167,col 9)",
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
      "end_line": 252,
      "comment": "\n     * @param which First index in {@link #partialDerivatives}.\n     * @param x x-coordinate.\n     * @param y y-coordinate.\n     * @return the value at point (x, y) of the selected partial derivative.\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 229,col 9)",
        "(line 231,col 9)-(line 231,col 43)",
        "(line 232,col 9)-(line 234,col 9)",
        "(line 235,col 9)-(line 235,col 43)",
        "(line 236,col 9)-(line 238,col 9)",
        "(line 240,col 9)-(line 240,col 66)",
        "(line 241,col 9)-(line 241,col 66)",
        "(line 243,col 9)-(line 243,col 35)",
        "(line 244,col 9)-(line 249,col 9)",
        "(line 251,col 9)-(line 251,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineInterpolatingFunction.computePartialDerivatives()",
      "begin_line": 257,
      "end_line": 272,
      "comment": "\n     * Compute all partial derivatives.\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 42)",
        "(line 259,col 9)-(line 259,col 42)",
        "(line 260,col 9)-(line 260,col 72)",
        "(line 262,col 9)-(line 271,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineInterpolatingFunction.searchIndex(double, double[])",
      "begin_line": 281,
      "end_line": 294,
      "comment": "\n     * @param c Coordinate.\n     * @param val Coordinate samples.\n     * @return the index in {@code val} corresponding to the interval\n     * containing {@code c}, or {@code -1} if {@code c} is out of the\n     * range defined by the end values of {@code val}.\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 284,col 9)",
        "(line 286,col 9)-(line 286,col 35)",
        "(line 287,col 9)-(line 291,col 9)",
        "(line 293,col 9)-(line 293,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineInterpolatingFunction.computeSplineCoefficients(double[])",
      "begin_line": 325,
      "end_line": 338,
      "comment": "\n     * Compute the spline coefficients from the list of function values and\n     * function partial derivatives values at the four corners of a grid\n     * element. They must be specified in the following order:\n     * \u003cul\u003e\n     *  \u003cli\u003ef(0,0)\u003c/li\u003e\n     *  \u003cli\u003ef(1,0)\u003c/li\u003e\n     *  \u003cli\u003ef(0,1)\u003c/li\u003e\n     *  \u003cli\u003ef(1,1)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ex\u003c/sub\u003e(0,0)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ex\u003c/sub\u003e(1,0)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ex\u003c/sub\u003e(0,1)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ex\u003c/sub\u003e(1,1)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ey\u003c/sub\u003e(0,0)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ey\u003c/sub\u003e(1,0)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ey\u003c/sub\u003e(0,1)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003ey\u003c/sub\u003e(1,1)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003exy\u003c/sub\u003e(0,0)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003exy\u003c/sub\u003e(1,0)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003exy\u003c/sub\u003e(0,1)\u003c/li\u003e\n     *  \u003cli\u003ef\u003csub\u003exy\u003c/sub\u003e(1,1)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * where the subscripts indicate the partial derivative with respect to\n     * the corresponding variable(s).\n     *\n     * @param beta List of function values and function partial derivatives\n     * values.\n     * @return the spline coefficients.\n     ",
      "child_ranges": [
        "(line 326,col 9)-(line 326,col 42)",
        "(line 328,col 9)-(line 335,col 9)",
        "(line 337,col 9)-(line 337,col 17)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BicubicSplineFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.BivariateRealFunction"
      ],
      "begin_line": 346,
      "end_line": 554,
      "comment": "\n * 2D-spline function.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "N"
      ],
      "begin_line": 350,
      "end_line": 350,
      "comment": " Number of points. "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 353,
      "end_line": 353,
      "comment": " Coefficients "
    },
    {
      "type": "field",
      "varNames": [
        "partialDerivativeX"
      ],
      "begin_line": 356,
      "end_line": 356,
      "comment": " First partial derivative along x. "
    },
    {
      "type": "field",
      "varNames": [
        "partialDerivativeY"
      ],
      "begin_line": 359,
      "end_line": 359,
      "comment": " First partial derivative along y. "
    },
    {
      "type": "field",
      "varNames": [
        "partialDerivativeXX"
      ],
      "begin_line": 362,
      "end_line": 362,
      "comment": " Second partial derivative along x. "
    },
    {
      "type": "field",
      "varNames": [
        "partialDerivativeYY"
      ],
      "begin_line": 365,
      "end_line": 365,
      "comment": " Second partial derivative along y. "
    },
    {
      "type": "field",
      "varNames": [
        "partialDerivativeXY"
      ],
      "begin_line": 368,
      "end_line": 368,
      "comment": " Second crossed partial derivative. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.BicubicSplineFunction(double[])",
      "begin_line": 374,
      "end_line": 381,
      "comment": "\n     * Simple constructor.\n     * @param a Spline coefficients\n     ",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 34)",
        "(line 376,col 9)-(line 380,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.value(double, double)",
      "begin_line": 386,
      "end_line": 403,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 387,col 9)-(line 389,col 9)",
        "(line 390,col 9)-(line 392,col 9)",
        "(line 394,col 9)-(line 394,col 32)",
        "(line 395,col 9)-(line 395,col 33)",
        "(line 396,col 9)-(line 396,col 43)",
        "(line 398,col 9)-(line 398,col 32)",
        "(line 399,col 9)-(line 399,col 33)",
        "(line 400,col 9)-(line 400,col 43)",
        "(line 402,col 9)-(line 402,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.apply(double[], double[], double[][])",
      "begin_line": 413,
      "end_line": 422,
      "comment": "\n     * Compute the value of the bicubic polynomial.\n     *\n     * @param pX Powers of the x-coordinate.\n     * @param pY Powers of the y-coordinate.\n     * @param coeff Spline coefficients.\n     * @return the interpolated value.\n     ",
      "child_ranges": [
        "(line 414,col 9)-(line 414,col 26)",
        "(line 415,col 9)-(line 419,col 9)",
        "(line 421,col 9)-(line 421,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.partialDerivativeX()",
      "begin_line": 427,
      "end_line": 433,
      "comment": "\n     * @return the partial derivative wrt {@code x}.\n     ",
      "child_ranges": [
        "(line 428,col 9)-(line 430,col 9)",
        "(line 432,col 9)-(line 432,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.partialDerivativeY()",
      "begin_line": 437,
      "end_line": 443,
      "comment": "\n     * @return the partial derivative wrt {@code y}.\n     ",
      "child_ranges": [
        "(line 438,col 9)-(line 440,col 9)",
        "(line 442,col 9)-(line 442,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.partialDerivativeXX()",
      "begin_line": 447,
      "end_line": 453,
      "comment": "\n     * @return the second partial derivative wrt {@code x}.\n     ",
      "child_ranges": [
        "(line 448,col 9)-(line 450,col 9)",
        "(line 452,col 9)-(line 452,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.partialDerivativeYY()",
      "begin_line": 457,
      "end_line": 463,
      "comment": "\n     * @return the second partial derivative wrt {@code y}.\n     ",
      "child_ranges": [
        "(line 458,col 9)-(line 460,col 9)",
        "(line 462,col 9)-(line 462,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.partialDerivativeXY()",
      "begin_line": 467,
      "end_line": 473,
      "comment": "\n     * @return the second partial cross-derivative.\n     ",
      "child_ranges": [
        "(line 468,col 9)-(line 470,col 9)",
        "(line 472,col 9)-(line 472,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.computePartialDerivatives()",
      "begin_line": 478,
      "end_line": 553,
      "comment": "\n     * Compute all partial derivatives functions.\n     ",
      "child_ranges": [
        "(line 479,col 9)-(line 479,col 47)",
        "(line 480,col 9)-(line 480,col 47)",
        "(line 481,col 9)-(line 481,col 48)",
        "(line 482,col 9)-(line 482,col 48)",
        "(line 483,col 9)-(line 483,col 48)",
        "(line 485,col 9)-(line 494,col 9)",
        "(line 496,col 9)-(line 507,col 14)",
        "(line 508,col 9)-(line 519,col 14)",
        "(line 520,col 9)-(line 530,col 14)",
        "(line 531,col 9)-(line 541,col 14)",
        "(line 542,col 9)-(line 552,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.Anonymous-70ee7028-4721-48d8-a76c-1be3b9e9d61c.value(double, double)",
      "begin_line": 497,
      "end_line": 506,
      "comment": "",
      "child_ranges": [
        "(line 498,col 21)-(line 498,col 44)",
        "(line 499,col 21)-(line 499,col 54)",
        "(line 501,col 21)-(line 501,col 44)",
        "(line 502,col 21)-(line 502,col 45)",
        "(line 503,col 21)-(line 503,col 55)",
        "(line 505,col 21)-(line 505,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.Anonymous-f44dc580-f281-4ede-a023-18d4552b4b86.value(double, double)",
      "begin_line": 509,
      "end_line": 518,
      "comment": "",
      "child_ranges": [
        "(line 510,col 21)-(line 510,col 44)",
        "(line 511,col 21)-(line 511,col 45)",
        "(line 512,col 21)-(line 512,col 55)",
        "(line 514,col 21)-(line 514,col 44)",
        "(line 515,col 21)-(line 515,col 54)",
        "(line 517,col 21)-(line 517,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.Anonymous-307842b7-4db2-4c6d-9272-136157290e9e.value(double, double)",
      "begin_line": 521,
      "end_line": 529,
      "comment": "",
      "child_ranges": [
        "(line 522,col 21)-(line 522,col 53)",
        "(line 524,col 21)-(line 524,col 44)",
        "(line 525,col 21)-(line 525,col 45)",
        "(line 526,col 21)-(line 526,col 55)",
        "(line 528,col 21)-(line 528,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.Anonymous-a8068374-aa99-4e5f-a9a9-2021ec747f4f.value(double, double)",
      "begin_line": 532,
      "end_line": 540,
      "comment": "",
      "child_ranges": [
        "(line 533,col 21)-(line 533,col 44)",
        "(line 534,col 21)-(line 534,col 45)",
        "(line 535,col 21)-(line 535,col 55)",
        "(line 537,col 21)-(line 537,col 53)",
        "(line 539,col 21)-(line 539,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineFunction.Anonymous-b45ca340-a24d-45f1-99be-dc0bedb61346.value(double, double)",
      "begin_line": 543,
      "end_line": 551,
      "comment": "",
      "child_ranges": [
        "(line 544,col 21)-(line 544,col 44)",
        "(line 545,col 21)-(line 545,col 54)",
        "(line 547,col 21)-(line 547,col 44)",
        "(line 548,col 21)-(line 548,col 54)",
        "(line 550,col 21)-(line 550,col 46)"
      ]
    }
  ]
}