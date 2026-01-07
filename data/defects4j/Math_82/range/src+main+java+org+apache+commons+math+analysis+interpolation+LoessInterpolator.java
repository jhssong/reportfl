{
  "filepath": "/tmp/Math-82b/src/main/java/org/apache/commons/math/analysis/interpolation/LoessInterpolator.java",
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
      "end_line": 384,
      "comment": "\n * Implements the \u003ca href\u003d\"http://en.wikipedia.org/wiki/Local_regression\"\u003e\n * Local Regression Algorithm\u003c/a\u003e (also Loess, Lowess) for interpolation of\n * real univariate functions.\n * \u003cp/\u003e\n * For reference, see\n * \u003ca href\u003d\"http://www.math.tau.ac.il/~yekutiel/MA seminar/Cleveland 1979.pdf\"\u003e\n * William S. Cleveland - Robust Locally Weighted Regression and Smoothing\n * Scatterplots\u003c/a\u003e\n * \u003cp/\u003e\n * This class implements both the loess method and serves as an interpolation\n * adapter to it, allowing to build a spline on the obtained loess fit.\n *\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_BANDWIDTH"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * Default value of the bandwidth parameter.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ROBUSTNESS_ITERS"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n     * Default value of the number of robustness iterations.\n     "
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
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.interpolation.LoessInterpolator.LoessInterpolator()",
      "begin_line": 82,
      "end_line": 85,
      "comment": "\n     * Constructs a new {@link LoessInterpolator}\n     * with a bandwidth of {@link #DEFAULT_BANDWIDTH} and\n     * {@link #DEFAULT_ROBUSTNESS_ITERS} robustness iterations.\n     * See {@link #LoessInterpolator(double, int)} for an explanation of\n     * the parameters.\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 43)",
        "(line 84,col 9)-(line 84,col 56)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.interpolation.LoessInterpolator.LoessInterpolator(double, int)",
      "begin_line": 104,
      "end_line": 116,
      "comment": "\n     * Constructs a new {@link LoessInterpolator}\n     * with given bandwidth and number of robustness iterations.\n     *\n     * @param bandwidth  when computing the loess fit at\n     * a particular point, this fraction of source points closest\n     * to the current point is taken into account for computing\n     * a least-squares regression.\u003c/br\u003e\n     * A sensible value is usually 0.25 to 0.5, the default value is\n     * {@link #DEFAULT_BANDWIDTH}.\n     * @param robustnessIters This many robustness iterations are done.\u003c/br\u003e\n     * A sensible value is usually 0 (just the initial fit without any\n     * robustness iterations) to 4, the default value is\n     * {@link #DEFAULT_ROBUSTNESS_ITERS}.\n     * @throws MathException if bandwidth does not lie in the interval [0,1]\n     * or if robustnessIters is negative.\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 108,col 9)",
        "(line 109,col 9)-(line 109,col 35)",
        "(line 110,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 115,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.LoessInterpolator.interpolate(double[], double[])",
      "begin_line": 135,
      "end_line": 138,
      "comment": "\n     * Compute an interpolating function by performing a loess fit\n     * on the data at the original abscissae and then building a cubic spline\n     * with a\n     * {@link org.apache.commons.math.analysis.interpolation.SplineInterpolator}\n     * on the resulting fit.\n     *\n     * @param xval the arguments for the interpolation points\n     * @param yval the values for the interpolation points\n     * @return A cubic spline built upon a loess fit to the data at the original abscissae\n     * @throws MathException  if some of the following conditions are false:\n     * \u003cul\u003e\n     * \u003cli\u003e Arguments and values are of the same size that is greater than zero\u003c/li\u003e\n     * \u003cli\u003e The arguments are in a strictly increasing order\u003c/li\u003e\n     * \u003cli\u003e All arguments and values are finite real numbers\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.LoessInterpolator.smooth(double[], double[])",
      "begin_line": 153,
      "end_line": 301,
      "comment": "\n     * Compute a loess fit on the data at the original abscissae.\n     *\n     * @param xval the arguments for the interpolation points\n     * @param yval the values for the interpolation points\n     * @return values of the loess fit at corresponding original abscissae\n     * @throws MathException if some of the following conditions are false:\n     * \u003cul\u003e\n     * \u003cli\u003e Arguments and values are of the same size that is greater than zero\u003c/li\u003e\n     * \u003cli\u003e The arguments are in a strictly increasing order\u003c/li\u003e\n     * \u003cli\u003e All arguments and values are finite real numbers\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 161,col 9)",
        "(line 163,col 9)-(line 163,col 34)",
        "(line 165,col 9)-(line 167,col 9)",
        "(line 169,col 9)-(line 169,col 39)",
        "(line 170,col 9)-(line 170,col 40)",
        "(line 172,col 9)-(line 172,col 38)",
        "(line 174,col 9)-(line 176,col 9)",
        "(line 178,col 9)-(line 180,col 9)",
        "(line 182,col 9)-(line 182,col 54)",
        "(line 184,col 9)-(line 191,col 9)",
        "(line 193,col 9)-(line 193,col 43)",
        "(line 195,col 9)-(line 195,col 49)",
        "(line 196,col 9)-(line 196,col 55)",
        "(line 198,col 9)-(line 198,col 57)",
        "(line 203,col 9)-(line 203,col 42)",
        "(line 205,col 9)-(line 298,col 9)",
        "(line 300,col 9)-(line 300,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.LoessInterpolator.updateBandwidthInterval(double[], int, int[])",
      "begin_line": 316,
      "end_line": 328,
      "comment": "\n     * Given an index interval into xval that embraces a certain number of\n     * points closest to xval[i-1], update the interval so that it embraces\n     * the same number of points closest to xval[i]\n     *\n     * @param xval arguments array\n     * @param i the index around which the new interval should be computed\n     * @param bandwidthInterval a two-element array {left, right} such that: \u003cp/\u003e\n     * \u003ctt\u003e(left\u003d\u003d0 or xval[i] - xval[left-1] \u003e xval[right] - xval[i])\u003c/tt\u003e\n     * \u003cp/\u003e and also \u003cp/\u003e\n     * \u003ctt\u003e(right\u003d\u003dxval.length-1 or xval[right+1] - xval[i] \u003e xval[i] - xval[left])\u003c/tt\u003e.\n     * The array will be updated.\n     ",
      "child_ranges": [
        "(line 318,col 9)-(line 318,col 46)",
        "(line 319,col 9)-(line 319,col 47)",
        "(line 323,col 9)-(line 327,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.LoessInterpolator.tricube(double)",
      "begin_line": 338,
      "end_line": 341,
      "comment": "\n     * Compute the \n     * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Local_regression#Weight_function\"\u003etricube\u003c/a\u003e\n     * weight function\n     *\n     * @param x the argument\n     * @return (1-|x|^3)^3\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 41)",
        "(line 340,col 9)-(line 340,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.LoessInterpolator.checkAllFiniteReal(double[], boolean)",
      "begin_line": 351,
      "end_line": 362,
      "comment": "\n     * Check that all elements of an array are finite real numbers.\n     *\n     * @param values the values array\n     * @param isAbscissae if true, elements are abscissae otherwise they are ordinatae\n     * @throws MathException if one of the values is not\n     *         a finite real number\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 361,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.LoessInterpolator.checkStrictlyIncreasing(double[])",
      "begin_line": 372,
      "end_line": 383,
      "comment": "\n     * Check that elements of the abscissae array are in a strictly\n     * increasing order.\n     *\n     * @param xval the abscissae array\n     * @throws MathException if the abscissae array\n     * is not in a strictly increasing order\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 382,col 9)"
      ]
    }
  ]
}