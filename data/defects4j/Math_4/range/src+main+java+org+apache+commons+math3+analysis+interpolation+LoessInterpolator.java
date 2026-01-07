{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/interpolation/LoessInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LoessInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.interpolation.UnivariateInterpolator",
        "java.io.Serializable"
      ],
      "begin_line": 51,
      "end_line": 474,
      "comment": "\n * Implements the \u003ca href\u003d\"http://en.wikipedia.org/wiki/Local_regression\"\u003e\n * Local Regression Algorithm\u003c/a\u003e (also Loess, Lowess) for interpolation of\n * real univariate functions.\n * \u003cp/\u003e\n * For reference, see\n * \u003ca href\u003d\"http://www.math.tau.ac.il/~yekutiel/MA seminar/Cleveland 1979.pdf\"\u003e\n * William S. Cleveland - Robust Locally Weighted Regression and Smoothing\n * Scatterplots\u003c/a\u003e\n * \u003cp/\u003e\n * This class implements both the loess method and serves as an interpolation\n * adapter to it, allowing one to build a spline on the obtained loess fit.\n *\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_BANDWIDTH"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Default value of the bandwidth parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ROBUSTNESS_ITERS"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Default value of the number of robustness iterations. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ACCURACY"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n     * Default value for accuracy.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "bandwidth"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": "\n     * The bandwidth parameter: when computing the loess fit at\n     * a particular point, this fraction of source points closest\n     * to the current point is taken into account for computing\n     * a least-squares regression.\n     * \u003cp/\u003e\n     * A sensible value is usually 0.25 to 0.5.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "robustnessIters"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": "\n     * The number of robustness iterations parameter: this many\n     * robustness iterations are done.\n     * \u003cp/\u003e\n     * A sensible value is usually 0 (just the initial fit without any\n     * robustness iterations) to 4.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "accuracy"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": "\n     * If the median residual at a certain robustness iteration\n     * is less than this amount, no more iterations are done.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.interpolation.LoessInterpolator.LoessInterpolator()",
      "begin_line": 95,
      "end_line": 99,
      "comment": "\n     * Constructs a new {@link LoessInterpolator}\n     * with a bandwidth of {@link #DEFAULT_BANDWIDTH},\n     * {@link #DEFAULT_ROBUSTNESS_ITERS} robustness iterations\n     * and an accuracy of {#link #DEFAULT_ACCURACY}.\n     * See {@link #LoessInterpolator(double, int, double)} for an explanation of\n     * the parameters.\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 43)",
        "(line 97,col 9)-(line 97,col 56)",
        "(line 98,col 9)-(line 98,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.interpolation.LoessInterpolator.LoessInterpolator(double, int)",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\n     * Construct a new {@link LoessInterpolator}\n     * with given bandwidth and number of robustness iterations.\n     * \u003cp\u003e\n     * Calling this constructor is equivalent to calling {link {@link\n     * #LoessInterpolator(double, int, double) LoessInterpolator(bandwidth,\n     * robustnessIters, LoessInterpolator.DEFAULT_ACCURACY)}\n     * \u003c/p\u003e\n     *\n     * @param bandwidth  when computing the loess fit at\n     * a particular point, this fraction of source points closest\n     * to the current point is taken into account for computing\n     * a least-squares regression.\u003c/br\u003e\n     * A sensible value is usually 0.25 to 0.5, the default value is\n     * {@link #DEFAULT_BANDWIDTH}.\n     * @param robustnessIters This many robustness iterations are done.\u003c/br\u003e\n     * A sensible value is usually 0 (just the initial fit without any\n     * robustness iterations) to 4, the default value is\n     * {@link #DEFAULT_ROBUSTNESS_ITERS}.\n\n     * @see #LoessInterpolator(double, int, double)\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 59)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.interpolation.LoessInterpolator.LoessInterpolator(double, int, double)",
      "begin_line": 148,
      "end_line": 161,
      "comment": "\n     * Construct a new {@link LoessInterpolator}\n     * with given bandwidth, number of robustness iterations and accuracy.\n     *\n     * @param bandwidth  when computing the loess fit at\n     * a particular point, this fraction of source points closest\n     * to the current point is taken into account for computing\n     * a least-squares regression.\u003c/br\u003e\n     * A sensible value is usually 0.25 to 0.5, the default value is\n     * {@link #DEFAULT_BANDWIDTH}.\n     * @param robustnessIters This many robustness iterations are done.\u003c/br\u003e\n     * A sensible value is usually 0 (just the initial fit without any\n     * robustness iterations) to 4, the default value is\n     * {@link #DEFAULT_ROBUSTNESS_ITERS}.\n     * @param accuracy If the median residual at a certain robustness iteration\n     * is less than this amount, no more iterations are done.\n     * @throws OutOfRangeException if bandwidth does not lie in the interval [0,1].\n     * @throws NotPositiveException if {@code robustnessIters} is negative.\n     * @see #LoessInterpolator(double, int)\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 155,col 35)",
        "(line 156,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 159,col 47)",
        "(line 160,col 9)-(line 160,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.LoessInterpolator.interpolate(double[], double[])",
      "begin_line": 184,
      "end_line": 192,
      "comment": "\n     * Compute an interpolating function by performing a loess fit\n     * on the data at the original abscissae and then building a cubic spline\n     * with a\n     * {@link org.apache.commons.math3.analysis.interpolation.SplineInterpolator}\n     * on the resulting fit.\n     *\n     * @param xval the arguments for the interpolation points\n     * @param yval the values for the interpolation points\n     * @return A cubic spline built upon a loess fit to the data at the original abscissae\n     * @throws NonMonotonicSequenceException if {@code xval} not sorted in\n     * strictly increasing order.\n     * @throws DimensionMismatchException if {@code xval} and {@code yval} have\n     * different sizes.\n     * @throws NoDataException if {@code xval} or {@code yval} has zero size.\n     * @throws NotFiniteNumberException if any of the arguments and values are\n     * not finite real numbers.\n     * @throws NumberIsTooSmallException if the bandwidth is too small to\n     * accomodate the size of the input data (i.e. the bandwidth must be\n     * larger than 2/n).\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.LoessInterpolator.smooth(double[], double[], double[])",
      "begin_line": 214,
      "end_line": 363,
      "comment": "\n     * Compute a weighted loess fit on the data at the original abscissae.\n     *\n     * @param xval Arguments for the interpolation points.\n     * @param yval Values for the interpolation points.\n     * @param weights point weights: coefficients by which the robustness weight\n     * of a point is multiplied.\n     * @return the values of the loess fit at corresponding original abscissae.\n     * @throws NonMonotonicSequenceException if {@code xval} not sorted in\n     * strictly increasing order.\n     * @throws DimensionMismatchException if {@code xval} and {@code yval} have\n     * different sizes.\n     * @throws NoDataException if {@code xval} or {@code yval} has zero size.\n     * @throws NotFiniteNumberException if any of the arguments and values are\n     not finite real numbers.\n     * @throws NumberIsTooSmallException if the bandwidth is too small to\n     * accomodate the size of the input data (i.e. the bandwidth must be\n     * larger than 2/n).\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 223,col 9)",
        "(line 225,col 9)-(line 225,col 34)",
        "(line 227,col 9)-(line 229,col 9)",
        "(line 231,col 9)-(line 231,col 33)",
        "(line 232,col 9)-(line 232,col 33)",
        "(line 233,col 9)-(line 233,col 36)",
        "(line 235,col 9)-(line 235,col 36)",
        "(line 237,col 9)-(line 239,col 9)",
        "(line 241,col 9)-(line 243,col 9)",
        "(line 245,col 9)-(line 245,col 54)",
        "(line 247,col 9)-(line 250,col 9)",
        "(line 252,col 9)-(line 252,col 43)",
        "(line 254,col 9)-(line 254,col 49)",
        "(line 255,col 9)-(line 255,col 55)",
        "(line 257,col 9)-(line 257,col 57)",
        "(line 262,col 9)-(line 262,col 42)",
        "(line 264,col 9)-(line 360,col 9)",
        "(line 362,col 9)-(line 362,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.LoessInterpolator.smooth(double[], double[])",
      "begin_line": 382,
      "end_line": 396,
      "comment": "\n     * Compute a loess fit on the data at the original abscissae.\n     *\n     * @param xval the arguments for the interpolation points\n     * @param yval the values for the interpolation points\n     * @return values of the loess fit at corresponding original abscissae\n     * @throws NonMonotonicSequenceException if {@code xval} not sorted in\n     * strictly increasing order.\n     * @throws DimensionMismatchException if {@code xval} and {@code yval} have\n     * different sizes.\n     * @throws NoDataException if {@code xval} or {@code yval} has zero size.\n     * @throws NotFiniteNumberException if any of the arguments and values are\n     * not finite real numbers.\n     * @throws NumberIsTooSmallException if the bandwidth is too small to\n     * accomodate the size of the input data (i.e. the bandwidth must be\n     * larger than 2/n).\n     ",
      "child_ranges": [
        "(line 388,col 9)-(line 390,col 9)",
        "(line 392,col 9)-(line 392,col 61)",
        "(line 393,col 9)-(line 393,col 38)",
        "(line 395,col 9)-(line 395,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.LoessInterpolator.updateBandwidthInterval(double[], double[], int, int[])",
      "begin_line": 413,
      "end_line": 427,
      "comment": "\n     * Given an index interval into xval that embraces a certain number of\n     * points closest to {@code xval[i-1]}, update the interval so that it\n     * embraces the same number of points closest to {@code xval[i]},\n     * ignoring zero weights.\n     *\n     * @param xval Arguments array.\n     * @param weights Weights array.\n     * @param i Index around which the new interval should be computed.\n     * @param bandwidthInterval a two-element array {left, right} such that:\n     * {@code (left\u003d\u003d0 or xval[i] - xval[left-1] \u003e xval[right] - xval[i])}\n     * and\n     * {@code (right\u003d\u003dxval.length-1 or xval[right+1] - xval[i] \u003e xval[i] - xval[left])}.\n     * The array will be updated.\n     ",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 46)",
        "(line 417,col 9)-(line 417,col 47)",
        "(line 421,col 9)-(line 421,col 52)",
        "(line 422,col 9)-(line 426,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.LoessInterpolator.nextNonzero(double[], int)",
      "begin_line": 437,
      "end_line": 443,
      "comment": "\n     * Return the smallest index {@code j} such that\n     * {@code j \u003e i \u0026\u0026 (j \u003d\u003d weights.length || weights[j] !\u003d 0)}.\n     *\n     * @param weights Weights array.\n     * @param i Index from which to start search.\n     * @return the smallest compliant index.\n     ",
      "child_ranges": [
        "(line 438,col 9)-(line 438,col 22)",
        "(line 439,col 9)-(line 441,col 9)",
        "(line 442,col 9)-(line 442,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.LoessInterpolator.tricube(double)",
      "begin_line": 453,
      "end_line": 460,
      "comment": "\n     * Compute the\n     * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Local_regression#Weight_function\"\u003etricube\u003c/a\u003e\n     * weight function\n     *\n     * @param x Argument.\n     * @return \u003ccode\u003e(1 - |x|\u003csup\u003e3\u003c/sup\u003e)\u003csup\u003e3\u003c/sup\u003e\u003c/code\u003e for |x| \u0026lt; 1, 0 otherwise.\n     ",
      "child_ranges": [
        "(line 454,col 9)-(line 454,col 44)",
        "(line 455,col 9)-(line 457,col 9)",
        "(line 458,col 9)-(line 458,col 50)",
        "(line 459,col 9)-(line 459,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.LoessInterpolator.checkAllFiniteReal(double[])",
      "begin_line": 469,
      "end_line": 473,
      "comment": "\n     * Check that all elements of an array are finite real numbers.\n     *\n     * @param values Values array.\n     * @throws org.apache.commons.math3.exception.NotFiniteNumberException\n     * if one of the values is not a finite real number.\n     ",
      "child_ranges": [
        "(line 470,col 9)-(line 472,col 9)"
      ]
    }
  ]
}