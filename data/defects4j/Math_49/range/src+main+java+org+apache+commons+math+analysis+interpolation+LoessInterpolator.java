{
  "filepath": "/tmp/Math-49b/src/main/java/org/apache/commons/math/analysis/interpolation/LoessInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LoessInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.interpolation.UnivariateRealInterpolator",
        "java.io.Serializable"
      ],
      "begin_line": 48,
      "end_line": 453,
      "comment": "\n * Implements the \u003ca href\u003d\"http://en.wikipedia.org/wiki/Local_regression\"\u003e\n * Local Regression Algorithm\u003c/a\u003e (also Loess, Lowess) for interpolation of\n * real univariate functions.\n * \u003cp/\u003e\n * For reference, see\n * \u003ca href\u003d\"http://www.math.tau.ac.il/~yekutiel/MA seminar/Cleveland 1979.pdf\"\u003e\n * William S. Cleveland - Robust Locally Weighted Regression and Smoothing\n * Scatterplots\u003c/a\u003e\n * \u003cp/\u003e\n * This class implements both the loess method and serves as an interpolation\n * adapter to it, allowing to build a spline on the obtained loess fit.\n *\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_BANDWIDTH"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Default value of the bandwidth parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ROBUSTNESS_ITERS"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Default value of the number of robustness iterations. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ACCURACY"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     * Default value for accuracy.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "bandwidth"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": "\n     * The bandwidth parameter: when computing the loess fit at\n     * a particular point, this fraction of source points closest\n     * to the current point is taken into account for computing\n     * a least-squares regression.\n     * \u003cp/\u003e\n     * A sensible value is usually 0.25 to 0.5.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "robustnessIters"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": "\n     * The number of robustness iterations parameter: this many\n     * robustness iterations are done.\n     * \u003cp/\u003e\n     * A sensible value is usually 0 (just the initial fit without any\n     * robustness iterations) to 4.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "accuracy"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": "\n     * If the median residual at a certain robustness iteration\n     * is less than this amount, no more iterations are done.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.interpolation.LoessInterpolator.LoessInterpolator()",
      "begin_line": 92,
      "end_line": 96,
      "comment": "\n     * Constructs a new {@link LoessInterpolator}\n     * with a bandwidth of {@link #DEFAULT_BANDWIDTH},\n     * {@link #DEFAULT_ROBUSTNESS_ITERS} robustness iterations\n     * and an accuracy of {#link #DEFAULT_ACCURACY}.\n     * See {@link #LoessInterpolator(double, int, double)} for an explanation of\n     * the parameters.\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 43)",
        "(line 94,col 9)-(line 94,col 56)",
        "(line 95,col 9)-(line 95,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.interpolation.LoessInterpolator.LoessInterpolator(double, int)",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\n     * Construct a new {@link LoessInterpolator}\n     * with given bandwidth and number of robustness iterations.\n     * \u003cp\u003e\n     * Calling this constructor is equivalent to calling {link {@link\n     * #LoessInterpolator(double, int, double) LoessInterpolator(bandwidth,\n     * robustnessIters, LoessInterpolator.DEFAULT_ACCURACY)}\n     * \u003c/p\u003e\n     *\n     * @param bandwidth  when computing the loess fit at\n     * a particular point, this fraction of source points closest\n     * to the current point is taken into account for computing\n     * a least-squares regression.\u003c/br\u003e\n     * A sensible value is usually 0.25 to 0.5, the default value is\n     * {@link #DEFAULT_BANDWIDTH}.\n     * @param robustnessIters This many robustness iterations are done.\u003c/br\u003e\n     * A sensible value is usually 0 (just the initial fit without any\n     * robustness iterations) to 4, the default value is\n     * {@link #DEFAULT_ROBUSTNESS_ITERS}.\n\n     * @see #LoessInterpolator(double, int, double)\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 59)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.interpolation.LoessInterpolator.LoessInterpolator(double, int, double)",
      "begin_line": 145,
      "end_line": 156,
      "comment": "\n     * Construct a new {@link LoessInterpolator}\n     * with given bandwidth, number of robustness iterations and accuracy.\n     *\n     * @param bandwidth  when computing the loess fit at\n     * a particular point, this fraction of source points closest\n     * to the current point is taken into account for computing\n     * a least-squares regression.\u003c/br\u003e\n     * A sensible value is usually 0.25 to 0.5, the default value is\n     * {@link #DEFAULT_BANDWIDTH}.\n     * @param robustnessIters This many robustness iterations are done.\u003c/br\u003e\n     * A sensible value is usually 0 (just the initial fit without any\n     * robustness iterations) to 4, the default value is\n     * {@link #DEFAULT_ROBUSTNESS_ITERS}.\n     * @param accuracy If the median residual at a certain robustness iteration\n     * is less than this amount, no more iterations are done.\n     * @throws OutOfRangeException if bandwidth does not lie in the interval [0,1].\n     * @throws NotPositiveException if {@code robustnessIters} is negative.\n     * @see #LoessInterpolator(double, int)\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 150,col 35)",
        "(line 151,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 154,col 47)",
        "(line 155,col 9)-(line 155,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.LoessInterpolator.interpolate(double[], double[])",
      "begin_line": 179,
      "end_line": 181,
      "comment": "\n     * Compute an interpolating function by performing a loess fit\n     * on the data at the original abscissae and then building a cubic spline\n     * with a\n     * {@link org.apache.commons.math.analysis.interpolation.SplineInterpolator}\n     * on the resulting fit.\n     *\n     * @param xval the arguments for the interpolation points\n     * @param yval the values for the interpolation points\n     * @return A cubic spline built upon a loess fit to the data at the original abscissae\n     * @throws org.apache.commons.math.exception.NonMonotonousSequenceException\n     * if {@code xval} not sorted in strictly increasing order.\n     * @throws DimensionMismatchException if {@code xval} and {@code yval} have\n     * different sizes.\n     * @throws NoDataException if {@code xval} or {@code yval} has zero size.\n     * @throws org.apache.commons.math.exception.NotFiniteNumberException if\n     * any of the arguments and values are not finite real numbers.\n     * @throws NumberIsTooSmallException if the bandwidth is too small to\n     * accomodate the size of the input data (i.e. the bandwidth must be\n     * larger than 2/n).\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.LoessInterpolator.smooth(double[], double[], double[])",
      "begin_line": 203,
      "end_line": 347,
      "comment": "\n     * Compute a weighted loess fit on the data at the original abscissae.\n     *\n     * @param xval Arguments for the interpolation points.\n     * @param yval Values for the interpolation points.\n     * @param weights point weights: coefficients by which the robustness weight\n     * of a point is multiplied.\n     * @return the values of the loess fit at corresponding original abscissae.\n     * @throws org.apache.commons.math.exception.NonMonotonousSequenceException\n     * if {@code xval} not sorted in strictly increasing order.\n     * @throws DimensionMismatchException if {@code xval} and {@code yval} have\n     * different sizes.\n     * @throws NoDataException if {@code xval} or {@code yval} has zero size.\n     * @throws org.apache.commons.math.exception.NotFiniteNumberException if\n     * any of the arguments and values are not finite real numbers.\n     * @throws NumberIsTooSmallException if the bandwidth is too small to\n     * accomodate the size of the input data (i.e. the bandwidth must be\n     * larger than 2/n).\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 207,col 9)",
        "(line 209,col 9)-(line 209,col 34)",
        "(line 211,col 9)-(line 213,col 9)",
        "(line 215,col 9)-(line 215,col 33)",
        "(line 216,col 9)-(line 216,col 33)",
        "(line 217,col 9)-(line 217,col 36)",
        "(line 219,col 9)-(line 219,col 35)",
        "(line 221,col 9)-(line 223,col 9)",
        "(line 225,col 9)-(line 227,col 9)",
        "(line 229,col 9)-(line 229,col 54)",
        "(line 231,col 9)-(line 234,col 9)",
        "(line 236,col 9)-(line 236,col 43)",
        "(line 238,col 9)-(line 238,col 49)",
        "(line 239,col 9)-(line 239,col 55)",
        "(line 241,col 9)-(line 241,col 57)",
        "(line 246,col 9)-(line 246,col 42)",
        "(line 248,col 9)-(line 344,col 9)",
        "(line 346,col 9)-(line 346,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.LoessInterpolator.smooth(double[], double[])",
      "begin_line": 366,
      "end_line": 375,
      "comment": "\n     * Compute a loess fit on the data at the original abscissae.\n     *\n     * @param xval the arguments for the interpolation points\n     * @param yval the values for the interpolation points\n     * @return values of the loess fit at corresponding original abscissae\n     * @throws org.apache.commons.math.exception.NonMonotonousSequenceException\n     * if {@code xval} not sorted in strictly increasing order.\n     * @throws DimensionMismatchException if {@code xval} and {@code yval} have\n     * different sizes.\n     * @throws NoDataException if {@code xval} or {@code yval} has zero size.\n     * @throws org.apache.commons.math.exception.NotFiniteNumberException if\n     * any of the arguments and values are not finite real numbers.\n     * @throws NumberIsTooSmallException if the bandwidth is too small to\n     * accomodate the size of the input data (i.e. the bandwidth must be\n     * larger than 2/n).\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 369,col 9)",
        "(line 371,col 9)-(line 371,col 61)",
        "(line 372,col 9)-(line 372,col 38)",
        "(line 374,col 9)-(line 374,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.LoessInterpolator.updateBandwidthInterval(double[], double[], int, int[])",
      "begin_line": 392,
      "end_line": 406,
      "comment": "\n     * Given an index interval into xval that embraces a certain number of\n     * points closest to {@code xval[i-1]}, update the interval so that it\n     * embraces the same number of points closest to {@code xval[i]},\n     * ignoring zero weights.\n     *\n     * @param xval Arguments array.\n     * @param weights Weights array.\n     * @param i Index around which the new interval should be computed.\n     * @param bandwidthInterval a two-element array {left, right} such that:\n     * {@code (left\u003d\u003d0 or xval[i] - xval[left-1] \u003e xval[right] - xval[i])}\n     * and\n     * {@code (right\u003d\u003dxval.length-1 or xval[right+1] - xval[i] \u003e xval[i] - xval[left])}.\n     * The array will be updated.\n     ",
      "child_ranges": [
        "(line 395,col 9)-(line 395,col 46)",
        "(line 396,col 9)-(line 396,col 47)",
        "(line 400,col 9)-(line 400,col 52)",
        "(line 401,col 9)-(line 405,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.LoessInterpolator.nextNonzero(double[], int)",
      "begin_line": 416,
      "end_line": 422,
      "comment": "\n     * Return the smallest index {@code j} such that\n     * {@code j \u003e i \u0026\u0026 (j \u003d\u003d weights.length || weights[j] !\u003d 0)}.\n     *\n     * @param weights Weights array.\n     * @param i Index from which to start search.\n     * @return the smallest compliant index.\n     ",
      "child_ranges": [
        "(line 417,col 9)-(line 417,col 22)",
        "(line 418,col 9)-(line 420,col 9)",
        "(line 421,col 9)-(line 421,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.LoessInterpolator.tricube(double)",
      "begin_line": 432,
      "end_line": 439,
      "comment": "\n     * Compute the\n     * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Local_regression#Weight_function\"\u003etricube\u003c/a\u003e\n     * weight function\n     *\n     * @param x Argument.\n     * @return \u003ccode\u003e(1 - |x|\u003csup\u003e3\u003c/sup\u003e)\u003csup\u003e3\u003c/sup\u003e\u003c/code\u003e for |x| \u0026lt; 1, 0 otherwise.\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 44)",
        "(line 434,col 9)-(line 436,col 9)",
        "(line 437,col 9)-(line 437,col 50)",
        "(line 438,col 9)-(line 438,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.LoessInterpolator.checkAllFiniteReal(double[])",
      "begin_line": 448,
      "end_line": 452,
      "comment": "\n     * Check that all elements of an array are finite real numbers.\n     *\n     * @param values Values array.\n     * @throws org.apache.commons.math.exception.NotFiniteNumberException\n     * if one of the values is not a finite real number.\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 451,col 9)"
      ]
    }
  ]
}