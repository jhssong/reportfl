{
  "filepath": "/tmp/Math-44b/src/main/java/org/apache/commons/math/analysis/interpolation/LoessInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LoessInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.interpolation.UnivariateRealInterpolator",
        "java.io.Serializable"
      ],
      "begin_line": 49,
      "end_line": 454,
      "comment": "\n * Implements the \u003ca href\u003d\"http://en.wikipedia.org/wiki/Local_regression\"\u003e\n * Local Regression Algorithm\u003c/a\u003e (also Loess, Lowess) for interpolation of\n * real univariate functions.\n * \u003cp/\u003e\n * For reference, see\n * \u003ca href\u003d\"http://www.math.tau.ac.il/~yekutiel/MA seminar/Cleveland 1979.pdf\"\u003e\n * William S. Cleveland - Robust Locally Weighted Regression and Smoothing\n * Scatterplots\u003c/a\u003e\n * \u003cp/\u003e\n * This class implements both the loess method and serves as an interpolation\n * adapter to it, allowing one to build a spline on the obtained loess fit.\n *\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_BANDWIDTH"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Default value of the bandwidth parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ROBUSTNESS_ITERS"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Default value of the number of robustness iterations. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ACCURACY"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * Default value for accuracy.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "bandwidth"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": "\n     * The bandwidth parameter: when computing the loess fit at\n     * a particular point, this fraction of source points closest\n     * to the current point is taken into account for computing\n     * a least-squares regression.\n     * \u003cp/\u003e\n     * A sensible value is usually 0.25 to 0.5.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "robustnessIters"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": "\n     * The number of robustness iterations parameter: this many\n     * robustness iterations are done.\n     * \u003cp/\u003e\n     * A sensible value is usually 0 (just the initial fit without any\n     * robustness iterations) to 4.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "accuracy"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": "\n     * If the median residual at a certain robustness iteration\n     * is less than this amount, no more iterations are done.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.interpolation.LoessInterpolator.LoessInterpolator()",
      "begin_line": 93,
      "end_line": 97,
      "comment": "\n     * Constructs a new {@link LoessInterpolator}\n     * with a bandwidth of {@link #DEFAULT_BANDWIDTH},\n     * {@link #DEFAULT_ROBUSTNESS_ITERS} robustness iterations\n     * and an accuracy of {#link #DEFAULT_ACCURACY}.\n     * See {@link #LoessInterpolator(double, int, double)} for an explanation of\n     * the parameters.\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 43)",
        "(line 95,col 9)-(line 95,col 56)",
        "(line 96,col 9)-(line 96,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.interpolation.LoessInterpolator.LoessInterpolator(double, int)",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\n     * Construct a new {@link LoessInterpolator}\n     * with given bandwidth and number of robustness iterations.\n     * \u003cp\u003e\n     * Calling this constructor is equivalent to calling {link {@link\n     * #LoessInterpolator(double, int, double) LoessInterpolator(bandwidth,\n     * robustnessIters, LoessInterpolator.DEFAULT_ACCURACY)}\n     * \u003c/p\u003e\n     *\n     * @param bandwidth  when computing the loess fit at\n     * a particular point, this fraction of source points closest\n     * to the current point is taken into account for computing\n     * a least-squares regression.\u003c/br\u003e\n     * A sensible value is usually 0.25 to 0.5, the default value is\n     * {@link #DEFAULT_BANDWIDTH}.\n     * @param robustnessIters This many robustness iterations are done.\u003c/br\u003e\n     * A sensible value is usually 0 (just the initial fit without any\n     * robustness iterations) to 4, the default value is\n     * {@link #DEFAULT_ROBUSTNESS_ITERS}.\n\n     * @see #LoessInterpolator(double, int, double)\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 59)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.interpolation.LoessInterpolator.LoessInterpolator(double, int, double)",
      "begin_line": 146,
      "end_line": 157,
      "comment": "\n     * Construct a new {@link LoessInterpolator}\n     * with given bandwidth, number of robustness iterations and accuracy.\n     *\n     * @param bandwidth  when computing the loess fit at\n     * a particular point, this fraction of source points closest\n     * to the current point is taken into account for computing\n     * a least-squares regression.\u003c/br\u003e\n     * A sensible value is usually 0.25 to 0.5, the default value is\n     * {@link #DEFAULT_BANDWIDTH}.\n     * @param robustnessIters This many robustness iterations are done.\u003c/br\u003e\n     * A sensible value is usually 0 (just the initial fit without any\n     * robustness iterations) to 4, the default value is\n     * {@link #DEFAULT_ROBUSTNESS_ITERS}.\n     * @param accuracy If the median residual at a certain robustness iteration\n     * is less than this amount, no more iterations are done.\n     * @throws OutOfRangeException if bandwidth does not lie in the interval [0,1].\n     * @throws NotPositiveException if {@code robustnessIters} is negative.\n     * @see #LoessInterpolator(double, int)\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 151,col 35)",
        "(line 152,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 155,col 47)",
        "(line 156,col 9)-(line 156,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.LoessInterpolator.interpolate(double[], double[])",
      "begin_line": 180,
      "end_line": 182,
      "comment": "\n     * Compute an interpolating function by performing a loess fit\n     * on the data at the original abscissae and then building a cubic spline\n     * with a\n     * {@link org.apache.commons.math.analysis.interpolation.SplineInterpolator}\n     * on the resulting fit.\n     *\n     * @param xval the arguments for the interpolation points\n     * @param yval the values for the interpolation points\n     * @return A cubic spline built upon a loess fit to the data at the original abscissae\n     * @throws org.apache.commons.math.exception.NonMonotonicSequenceException\n     * if {@code xval} not sorted in strictly increasing order.\n     * @throws DimensionMismatchException if {@code xval} and {@code yval} have\n     * different sizes.\n     * @throws NoDataException if {@code xval} or {@code yval} has zero size.\n     * @throws org.apache.commons.math.exception.NotFiniteNumberException if\n     * any of the arguments and values are not finite real numbers.\n     * @throws NumberIsTooSmallException if the bandwidth is too small to\n     * accomodate the size of the input data (i.e. the bandwidth must be\n     * larger than 2/n).\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.LoessInterpolator.smooth(double[], double[], double[])",
      "begin_line": 204,
      "end_line": 348,
      "comment": "\n     * Compute a weighted loess fit on the data at the original abscissae.\n     *\n     * @param xval Arguments for the interpolation points.\n     * @param yval Values for the interpolation points.\n     * @param weights point weights: coefficients by which the robustness weight\n     * of a point is multiplied.\n     * @return the values of the loess fit at corresponding original abscissae.\n     * @throws org.apache.commons.math.exception.NonMonotonicSequenceException\n     * if {@code xval} not sorted in strictly increasing order.\n     * @throws DimensionMismatchException if {@code xval} and {@code yval} have\n     * different sizes.\n     * @throws NoDataException if {@code xval} or {@code yval} has zero size.\n     * @throws org.apache.commons.math.exception.NotFiniteNumberException if\n     * any of the arguments and values are not finite real numbers.\n     * @throws NumberIsTooSmallException if the bandwidth is too small to\n     * accomodate the size of the input data (i.e. the bandwidth must be\n     * larger than 2/n).\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 208,col 9)",
        "(line 210,col 9)-(line 210,col 34)",
        "(line 212,col 9)-(line 214,col 9)",
        "(line 216,col 9)-(line 216,col 33)",
        "(line 217,col 9)-(line 217,col 33)",
        "(line 218,col 9)-(line 218,col 36)",
        "(line 220,col 9)-(line 220,col 36)",
        "(line 222,col 9)-(line 224,col 9)",
        "(line 226,col 9)-(line 228,col 9)",
        "(line 230,col 9)-(line 230,col 54)",
        "(line 232,col 9)-(line 235,col 9)",
        "(line 237,col 9)-(line 237,col 43)",
        "(line 239,col 9)-(line 239,col 49)",
        "(line 240,col 9)-(line 240,col 55)",
        "(line 242,col 9)-(line 242,col 57)",
        "(line 247,col 9)-(line 247,col 42)",
        "(line 249,col 9)-(line 345,col 9)",
        "(line 347,col 9)-(line 347,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.LoessInterpolator.smooth(double[], double[])",
      "begin_line": 367,
      "end_line": 376,
      "comment": "\n     * Compute a loess fit on the data at the original abscissae.\n     *\n     * @param xval the arguments for the interpolation points\n     * @param yval the values for the interpolation points\n     * @return values of the loess fit at corresponding original abscissae\n     * @throws org.apache.commons.math.exception.NonMonotonicSequenceException\n     * if {@code xval} not sorted in strictly increasing order.\n     * @throws DimensionMismatchException if {@code xval} and {@code yval} have\n     * different sizes.\n     * @throws NoDataException if {@code xval} or {@code yval} has zero size.\n     * @throws org.apache.commons.math.exception.NotFiniteNumberException if\n     * any of the arguments and values are not finite real numbers.\n     * @throws NumberIsTooSmallException if the bandwidth is too small to\n     * accomodate the size of the input data (i.e. the bandwidth must be\n     * larger than 2/n).\n     ",
      "child_ranges": [
        "(line 368,col 9)-(line 370,col 9)",
        "(line 372,col 9)-(line 372,col 61)",
        "(line 373,col 9)-(line 373,col 38)",
        "(line 375,col 9)-(line 375,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.LoessInterpolator.updateBandwidthInterval(double[], double[], int, int[])",
      "begin_line": 393,
      "end_line": 407,
      "comment": "\n     * Given an index interval into xval that embraces a certain number of\n     * points closest to {@code xval[i-1]}, update the interval so that it\n     * embraces the same number of points closest to {@code xval[i]},\n     * ignoring zero weights.\n     *\n     * @param xval Arguments array.\n     * @param weights Weights array.\n     * @param i Index around which the new interval should be computed.\n     * @param bandwidthInterval a two-element array {left, right} such that:\n     * {@code (left\u003d\u003d0 or xval[i] - xval[left-1] \u003e xval[right] - xval[i])}\n     * and\n     * {@code (right\u003d\u003dxval.length-1 or xval[right+1] - xval[i] \u003e xval[i] - xval[left])}.\n     * The array will be updated.\n     ",
      "child_ranges": [
        "(line 396,col 9)-(line 396,col 46)",
        "(line 397,col 9)-(line 397,col 47)",
        "(line 401,col 9)-(line 401,col 52)",
        "(line 402,col 9)-(line 406,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.LoessInterpolator.nextNonzero(double[], int)",
      "begin_line": 417,
      "end_line": 423,
      "comment": "\n     * Return the smallest index {@code j} such that\n     * {@code j \u003e i \u0026\u0026 (j \u003d\u003d weights.length || weights[j] !\u003d 0)}.\n     *\n     * @param weights Weights array.\n     * @param i Index from which to start search.\n     * @return the smallest compliant index.\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 22)",
        "(line 419,col 9)-(line 421,col 9)",
        "(line 422,col 9)-(line 422,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.LoessInterpolator.tricube(double)",
      "begin_line": 433,
      "end_line": 440,
      "comment": "\n     * Compute the\n     * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Local_regression#Weight_function\"\u003etricube\u003c/a\u003e\n     * weight function\n     *\n     * @param x Argument.\n     * @return \u003ccode\u003e(1 - |x|\u003csup\u003e3\u003c/sup\u003e)\u003csup\u003e3\u003c/sup\u003e\u003c/code\u003e for |x| \u0026lt; 1, 0 otherwise.\n     ",
      "child_ranges": [
        "(line 434,col 9)-(line 434,col 44)",
        "(line 435,col 9)-(line 437,col 9)",
        "(line 438,col 9)-(line 438,col 50)",
        "(line 439,col 9)-(line 439,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.LoessInterpolator.checkAllFiniteReal(double[])",
      "begin_line": 449,
      "end_line": 453,
      "comment": "\n     * Check that all elements of an array are finite real numbers.\n     *\n     * @param values Values array.\n     * @throws org.apache.commons.math.exception.NotFiniteNumberException\n     * if one of the values is not a finite real number.\n     ",
      "child_ranges": [
        "(line 450,col 9)-(line 452,col 9)"
      ]
    }
  ]
}