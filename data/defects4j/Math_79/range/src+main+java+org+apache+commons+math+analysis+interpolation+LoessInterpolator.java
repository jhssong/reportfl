{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/analysis/interpolation/LoessInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LoessInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.interpolation.UnivariateRealInterpolator",
        "java.io.Serializable"
      ],
      "begin_line": 41,
      "end_line": 450,
      "comment": "\n * Implements the \u003ca href\u003d\"http://en.wikipedia.org/wiki/Local_regression\"\u003e\n * Local Regression Algorithm\u003c/a\u003e (also Loess, Lowess) for interpolation of\n * real univariate functions.\n * \u003cp/\u003e\n * For reference, see\n * \u003ca href\u003d\"http://www.math.tau.ac.il/~yekutiel/MA seminar/Cleveland 1979.pdf\"\u003e\n * William S. Cleveland - Robust Locally Weighted Regression and Smoothing\n * Scatterplots\u003c/a\u003e\n * \u003cp/\u003e\n * This class implements both the loess method and serves as an interpolation\n * adapter to it, allowing to build a spline on the obtained loess fit.\n *\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_BANDWIDTH"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Default value of the bandwidth parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ROBUSTNESS_ITERS"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Default value of the number of robustness iterations. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ACCURACY"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Default value for accuracy. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "bandwidth"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": "\n     * The bandwidth parameter: when computing the loess fit at\n     * a particular point, this fraction of source points closest\n     * to the current point is taken into account for computing\n     * a least-squares regression.\n     * \u003cp/\u003e\n     * A sensible value is usually 0.25 to 0.5.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "robustnessIters"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": "\n     * The number of robustness iterations parameter: this many\n     * robustness iterations are done.\n     * \u003cp/\u003e\n     * A sensible value is usually 0 (just the initial fit without any\n     * robustness iterations) to 4.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "accuracy"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": "\n     * If the median residual at a certain robustness iteration\n     * is less than this amount, no more iterations are done.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.interpolation.LoessInterpolator.LoessInterpolator()",
      "begin_line": 89,
      "end_line": 93,
      "comment": "\n     * Constructs a new {@link LoessInterpolator}\n     * with a bandwidth of {@link #DEFAULT_BANDWIDTH},\n     * {@link #DEFAULT_ROBUSTNESS_ITERS} robustness iterations\n     * and an accuracy of {#link #DEFAULT_ACCURACY}.\n     * See {@link #LoessInterpolator(double, int, double)} for an explanation of\n     * the parameters.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 43)",
        "(line 91,col 9)-(line 91,col 56)",
        "(line 92,col 9)-(line 92,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.interpolation.LoessInterpolator.LoessInterpolator(double, int)",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\n     * Constructs a new {@link LoessInterpolator}\n     * with given bandwidth and number of robustness iterations.\n     * \u003cp\u003e\n     * Calling this constructor is equivalent to calling {link {@link\n     * #LoessInterpolator(double, int, double) LoessInterpolator(bandwidth,\n     * robustnessIters, LoessInterpolator.DEFAULT_ACCURACY)}\n     * \u003c/p\u003e\n     *\n     * @param bandwidth  when computing the loess fit at\n     * a particular point, this fraction of source points closest\n     * to the current point is taken into account for computing\n     * a least-squares regression.\u003c/br\u003e\n     * A sensible value is usually 0.25 to 0.5, the default value is\n     * {@link #DEFAULT_BANDWIDTH}.\n     * @param robustnessIters This many robustness iterations are done.\u003c/br\u003e\n     * A sensible value is usually 0 (just the initial fit without any\n     * robustness iterations) to 4, the default value is\n     * {@link #DEFAULT_ROBUSTNESS_ITERS}.\n     * @throws MathException if bandwidth does not lie in the interval [0,1]\n     * or if robustnessIters is negative.\n     * @see #LoessInterpolator(double, int, double)\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 59)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.interpolation.LoessInterpolator.LoessInterpolator(double, int, double)",
      "begin_line": 143,
      "end_line": 156,
      "comment": "\n     * Constructs a new {@link LoessInterpolator}\n     * with given bandwidth, number of robustness iterations and accuracy.\n     *\n     * @param bandwidth  when computing the loess fit at\n     * a particular point, this fraction of source points closest\n     * to the current point is taken into account for computing\n     * a least-squares regression.\u003c/br\u003e\n     * A sensible value is usually 0.25 to 0.5, the default value is\n     * {@link #DEFAULT_BANDWIDTH}.\n     * @param robustnessIters This many robustness iterations are done.\u003c/br\u003e\n     * A sensible value is usually 0 (just the initial fit without any\n     * robustness iterations) to 4, the default value is\n     * {@link #DEFAULT_ROBUSTNESS_ITERS}.\n     * @param accuracy If the median residual at a certain robustness iteration\n     * is less than this amount, no more iterations are done.\n     * @throws MathException if bandwidth does not lie in the interval [0,1]\n     * or if robustnessIters is negative.\n     * @see #LoessInterpolator(double, int)\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 148,col 35)",
        "(line 149,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 154,col 47)",
        "(line 155,col 9)-(line 155,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.LoessInterpolator.interpolate(double[], double[])",
      "begin_line": 175,
      "end_line": 178,
      "comment": "\n     * Compute an interpolating function by performing a loess fit\n     * on the data at the original abscissae and then building a cubic spline\n     * with a\n     * {@link org.apache.commons.math.analysis.interpolation.SplineInterpolator}\n     * on the resulting fit.\n     *\n     * @param xval the arguments for the interpolation points\n     * @param yval the values for the interpolation points\n     * @return A cubic spline built upon a loess fit to the data at the original abscissae\n     * @throws MathException  if some of the following conditions are false:\n     * \u003cul\u003e\n     * \u003cli\u003e Arguments and values are of the same size that is greater than zero\u003c/li\u003e\n     * \u003cli\u003e The arguments are in a strictly increasing order\u003c/li\u003e\n     * \u003cli\u003e All arguments and values are finite real numbers\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.LoessInterpolator.smooth(double[], double[], double[])",
      "begin_line": 195,
      "end_line": 347,
      "comment": "\n     * Compute a weighted loess fit on the data at the original abscissae.\n     *\n     * @param xval the arguments for the interpolation points\n     * @param yval the values for the interpolation points\n     * @param weights point weights: coefficients by which the robustness weight of a point is multiplied\n     * @return values of the loess fit at corresponding original abscissae\n     * @throws MathException if some of the following conditions are false:\n     * \u003cul\u003e\n     * \u003cli\u003e Arguments and values are of the same size that is greater than zero\u003c/li\u003e\n     * \u003cli\u003e The arguments are in a strictly increasing order\u003c/li\u003e\n     * \u003cli\u003e All arguments and values are finite real numbers\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 203,col 9)",
        "(line 205,col 9)-(line 205,col 34)",
        "(line 207,col 9)-(line 209,col 9)",
        "(line 211,col 9)-(line 211,col 97)",
        "(line 212,col 9)-(line 212,col 97)",
        "(line 213,col 9)-(line 213,col 98)",
        "(line 215,col 9)-(line 215,col 38)",
        "(line 217,col 9)-(line 219,col 9)",
        "(line 221,col 9)-(line 223,col 9)",
        "(line 225,col 9)-(line 225,col 54)",
        "(line 227,col 9)-(line 234,col 9)",
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
      "begin_line": 362,
      "end_line": 370,
      "comment": "\n     * Compute a loess fit on the data at the original abscissae.\n     *\n     * @param xval the arguments for the interpolation points\n     * @param yval the values for the interpolation points\n     * @return values of the loess fit at corresponding original abscissae\n     * @throws MathException if some of the following conditions are false:\n     * \u003cul\u003e\n     * \u003cli\u003e Arguments and values are of the same size that is greater than zero\u003c/li\u003e\n     * \u003cli\u003e The arguments are in a strictly increasing order\u003c/li\u003e\n     * \u003cli\u003e All arguments and values are finite real numbers\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 61)",
        "(line 366,col 9)-(line 366,col 38)",
        "(line 368,col 9)-(line 368,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.LoessInterpolator.updateBandwidthInterval(double[], int, int[])",
      "begin_line": 386,
      "end_line": 398,
      "comment": "\n     * Given an index interval into xval that embraces a certain number of\n     * points closest to xval[i-1], update the interval so that it embraces\n     * the same number of points closest to xval[i]\n     *\n     * @param xval arguments array\n     * @param i the index around which the new interval should be computed\n     * @param bandwidthInterval a two-element array {left, right} such that: \u003cp/\u003e\n     * \u003ctt\u003e(left\u003d\u003d0 or xval[i] - xval[left-1] \u003e xval[right] - xval[i])\u003c/tt\u003e\n     * \u003cp/\u003e and also \u003cp/\u003e\n     * \u003ctt\u003e(right\u003d\u003dxval.length-1 or xval[right+1] - xval[i] \u003e xval[i] - xval[left])\u003c/tt\u003e.\n     * The array will be updated.\n     ",
      "child_ranges": [
        "(line 388,col 9)-(line 388,col 46)",
        "(line 389,col 9)-(line 389,col 47)",
        "(line 393,col 9)-(line 397,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.LoessInterpolator.tricube(double)",
      "begin_line": 408,
      "end_line": 411,
      "comment": "\n     * Compute the\n     * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Local_regression#Weight_function\"\u003etricube\u003c/a\u003e\n     * weight function\n     *\n     * @param x the argument\n     * @return (1-|x|^3)^3\n     ",
      "child_ranges": [
        "(line 409,col 9)-(line 409,col 41)",
        "(line 410,col 9)-(line 410,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.LoessInterpolator.checkAllFiniteReal(double[], java.lang.String)",
      "begin_line": 420,
      "end_line": 428,
      "comment": "\n     * Check that all elements of an array are finite real numbers.\n     *\n     * @param values the values array\n     * @param pattern pattern of the error message\n     * @throws MathException if one of the values is not a finite real number\n     ",
      "child_ranges": [
        "(line 422,col 9)-(line 427,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.LoessInterpolator.checkStrictlyIncreasing(double[])",
      "begin_line": 438,
      "end_line": 449,
      "comment": "\n     * Check that elements of the abscissae array are in a strictly\n     * increasing order.\n     *\n     * @param xval the abscissae array\n     * @throws MathException if the abscissae array\n     * is not in a strictly increasing order\n     ",
      "child_ranges": [
        "(line 440,col 9)-(line 448,col 9)"
      ]
    }
  ]
}