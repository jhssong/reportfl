{
  "filepath": "/tmp/Math-49b/src/main/java/org/apache/commons/math/stat/descriptive/moment/Variance.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Variance",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic",
        "java.io.Serializable",
        "org.apache.commons.math.stat.descriptive.WeightedEvaluation"
      ],
      "begin_line": 69,
      "end_line": 610,
      "comment": "\n * Computes the variance of the available values.  By default, the unbiased\n * \"sample variance\" definitional formula is used:\n * \u003cp\u003e\n * variance \u003d sum((x_i - mean)^2) / (n - 1) \u003c/p\u003e\n * \u003cp\u003e\n * where mean is the {@link Mean} and \u003ccode\u003en\u003c/code\u003e is the number\n * of sample observations.\u003c/p\u003e\n * \u003cp\u003e\n * The definitional formula does not have good numerical properties, so\n * this implementation does not compute the statistic using the definitional\n * formula. \u003cul\u003e\n * \u003cli\u003e The \u003ccode\u003egetResult\u003c/code\u003e method computes the variance using\n * updating formulas based on West\u0027s algorithm, as described in\n * \u003ca href\u003d\"http://doi.acm.org/10.1145/359146.359152\"\u003e Chan, T. F. and\n * J. G. Lewis 1979, \u003ci\u003eCommunications of the ACM\u003c/i\u003e,\n * vol. 22 no. 9, pp. 526-531.\u003c/a\u003e\u003c/li\u003e\n * \u003cli\u003e The \u003ccode\u003eevaluate\u003c/code\u003e methods leverage the fact that they have the\n * full array of values in memory to execute a two-pass algorithm.\n * Specifically, these methods use the \"corrected two-pass algorithm\" from\n * Chan, Golub, Levesque, \u003ci\u003eAlgorithms for Computing the Sample Variance\u003c/i\u003e,\n * American Statistician, vol. 37, no. 3 (1983) pp. 242-247.\u003c/li\u003e\u003c/ul\u003e\n * Note that adding values using \u003ccode\u003eincrement\u003c/code\u003e or\n * \u003ccode\u003eincrementAll\u003c/code\u003e and then executing \u003ccode\u003egetResult\u003c/code\u003e will\n * sometimes give a different, less accurate, result than executing\n * \u003ccode\u003eevaluate\u003c/code\u003e with the full array of values. The former approach\n * should only be used when the full array of values is not available.\u003c/p\u003e\n * \u003cp\u003e\n * The \"population variance\"  ( sum((x_i - mean)^2) / n ) can also\n * be computed using this statistic.  The \u003ccode\u003eisBiasCorrected\u003c/code\u003e\n * property determines whether the \"population\" or \"sample\" value is\n * returned by the \u003ccode\u003eevaluate\u003c/code\u003e and \u003ccode\u003egetResult\u003c/code\u003e methods.\n * To compute population variances, set this property to \u003ccode\u003efalse.\u003c/code\u003e\n * \u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eNote that this implementation is not synchronized.\u003c/strong\u003e If\n * multiple threads access an instance of this class concurrently, and at least\n * one of the threads invokes the \u003ccode\u003eincrement()\u003c/code\u003e or\n * \u003ccode\u003eclear()\u003c/code\u003e method, it must be synchronized externally.\u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "moment"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " SecondMoment is used in incremental calculation of Variance"
    },
    {
      "type": "field",
      "varNames": [
        "incMoment"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": "\n     * Boolean test to determine if this Variance should also increment\n     * the second moment, this evaluates to false when this Variance is\n     * constructed with an external SecondMoment as a parameter.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "isBiasCorrected"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": "\n     * Determines whether or not bias correction is applied when computing the\n     * value of the statisic.  True means that bias is corrected.  See\n     * {@link Variance} for details on the formula.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Variance.Variance()",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\n     * Constructs a Variance with default (true) \u003ccode\u003eisBiasCorrected\u003c/code\u003e\n     * property.\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Variance.Variance(org.apache.commons.math.stat.descriptive.moment.SecondMoment)",
      "begin_line": 105,
      "end_line": 108,
      "comment": "\n     * Constructs a Variance based on an external second moment.\n     *\n     * @param m2 the SecondMoment (Third or Fourth moments work\n     * here as well.)\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 26)",
        "(line 107,col 9)-(line 107,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Variance.Variance(boolean)",
      "begin_line": 118,
      "end_line": 121,
      "comment": "\n     * Constructs a Variance with the specified \u003ccode\u003eisBiasCorrected\u003c/code\u003e\n     * property\n     *\n     * @param isBiasCorrected  setting for bias correction - true means\n     * bias will be corrected and is equivalent to using the argumentless\n     * constructor\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 36)",
        "(line 120,col 9)-(line 120,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Variance.Variance(boolean, org.apache.commons.math.stat.descriptive.moment.SecondMoment)",
      "begin_line": 132,
      "end_line": 136,
      "comment": "\n     * Constructs a Variance with the specified \u003ccode\u003eisBiasCorrected\u003c/code\u003e\n     * property and the supplied external second moment.\n     *\n     * @param isBiasCorrected  setting for bias correction - true means\n     * bias will be corrected\n     * @param m2 the SecondMoment (Third or Fourth moments work\n     * here as well.)\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 26)",
        "(line 134,col 9)-(line 134,col 25)",
        "(line 135,col 9)-(line 135,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Variance.Variance(org.apache.commons.math.stat.descriptive.moment.Variance)",
      "begin_line": 144,
      "end_line": 146,
      "comment": "\n     * Copy constructor, creates a new {@code Variance} identical\n     * to the {@code original}\n     *\n     * @param original the {@code Variance} instance to copy\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Variance.increment(double)",
      "begin_line": 157,
      "end_line": 162,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003eIf all values are available, it is more accurate to use\n     * {@link #evaluate(double[])} rather than adding values one at a time\n     * using this method and then executing {@link #getResult}, since\n     * \u003ccode\u003eevaluate\u003c/code\u003e leverages the fact that is has the full\n     * list of values together to execute a two-pass algorithm.\n     * See {@link Variance}.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 161,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Variance.getResult()",
      "begin_line": 167,
      "end_line": 180,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 169,col 13)-(line 179,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Variance.getN()",
      "begin_line": 185,
      "end_line": 187,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Variance.clear()",
      "begin_line": 192,
      "end_line": 197,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 196,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Variance.evaluate(double[])",
      "begin_line": 215,
      "end_line": 221,
      "comment": "\n     * Returns the variance of the entries in the input array, or\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array is empty.\n     * \u003cp\u003e\n     * See {@link Variance} for details on the computing algorithm.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * Does not change the internal state of the statistic.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @return the variance of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 219,col 9)",
        "(line 220,col 9)-(line 220,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Variance.evaluate(double[], int, int)",
      "begin_line": 243,
      "end_line": 259,
      "comment": "\n     * Returns the variance of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * See {@link Variance} for details on the computing algorithm.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\u003c/p\u003e\n     * \u003cp\u003e\n     * Does not change the internal state of the statistic.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the variance of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     *  parameters are not valid\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 32)",
        "(line 248,col 9)-(line 257,col 9)",
        "(line 258,col 9)-(line 258,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Variance.evaluate(double[], double[], int, int)",
      "begin_line": 303,
      "end_line": 319,
      "comment": "\n     * \u003cp\u003eReturns the weighted variance of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\u003c/p\u003e\n     * \u003cp\u003e\n     * Uses the formula \u003cpre\u003e\n     *   \u0026Sigma;(weights[i]*(values[i] - weightedMean)\u003csup\u003e2\u003c/sup\u003e)/(\u0026Sigma;(weights[i]) - 1)\n     * \u003c/pre\u003e\n     * where weightedMean is the weighted mean\u003c/p\u003e\n     * \u003cp\u003e\n     * This formula will not return the same result as the unweighted variance when all\n     * weights are equal, unless all weights are equal to 1. The formula assumes that\n     * weights are to be treated as \"expansion values,\" as will be the case if for example\n     * the weights represent frequency counts. To normalize weights so that the denominator\n     * in the variance computation equals the length of the input vector minus one, use \u003cpre\u003e\n     *   \u003ccode\u003eevaluate(values, MathUtils.normalizeArray(weights, values.length)); \u003c/code\u003e\n     * \u003c/pre\u003e\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if any of the following are true:\n     * \u003cul\u003e\u003cli\u003ethe values array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array does not have the same length as the values array\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more infinite values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more NaN values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains negative values\u003c/li\u003e\n     *     \u003cli\u003ethe start and length arguments do not determine a valid array\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * Does not change the internal state of the statistic.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if either array is null.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param weights the weights array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the weighted variance of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the parameters are not valid\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 32)",
        "(line 308,col 9)-(line 317,col 9)",
        "(line 318,col 9)-(line 318,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Variance.evaluate(double[], double[])",
      "begin_line": 359,
      "end_line": 361,
      "comment": "\n     * \u003cp\u003e\n     * Returns the weighted variance of the entries in the the input array.\u003c/p\u003e\n     * \u003cp\u003e\n     * Uses the formula \u003cpre\u003e\n     *   \u0026Sigma;(weights[i]*(values[i] - weightedMean)\u003csup\u003e2\u003c/sup\u003e)/(\u0026Sigma;(weights[i]) - 1)\n     * \u003c/pre\u003e\n     * where weightedMean is the weighted mean\u003c/p\u003e\n     * \u003cp\u003e\n     * This formula will not return the same result as the unweighted variance when all\n     * weights are equal, unless all weights are equal to 1. The formula assumes that\n     * weights are to be treated as \"expansion values,\" as will be the case if for example\n     * the weights represent frequency counts. To normalize weights so that the denominator\n     * in the variance computation equals the length of the input vector minus one, use \u003cpre\u003e\n     *   \u003ccode\u003eevaluate(values, MathUtils.normalizeArray(weights, values.length)); \u003c/code\u003e\n     * \u003c/pre\u003e\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if any of the following are true:\n     * \u003cul\u003e\u003cli\u003ethe values array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array does not have the same length as the values array\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more infinite values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more NaN values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains negative values\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * Does not change the internal state of the statistic.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if either array is null.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param weights the weights array\n     * @return the weighted variance of the values\n     * @throws IllegalArgumentException if the parameters are not valid\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Variance.evaluate(double[], double, int, int)",
      "begin_line": 389,
      "end_line": 415,
      "comment": "\n     * Returns the variance of the entries in the specified portion of\n     * the input array, using the precomputed mean value.  Returns\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray is empty.\n     * \u003cp\u003e\n     * See {@link Variance} for details on the computing algorithm.\u003c/p\u003e\n     * \u003cp\u003e\n     * The formula used assumes that the supplied mean value is the arithmetic\n     * mean of the sample data, not a known population parameter.  This method\n     * is supplied only to save computation when the mean has already been\n     * computed.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * Does not change the internal state of the statistic.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param mean the precomputed mean value\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the variance of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     *  parameters are not valid\n     ",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 32)",
        "(line 394,col 9)-(line 413,col 9)",
        "(line 414,col 9)-(line 414,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Variance.evaluate(double[], double)",
      "begin_line": 442,
      "end_line": 444,
      "comment": "\n     * Returns the variance of the entries in the input array, using the\n     * precomputed mean value.  Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array\n     * is empty.\n     * \u003cp\u003e\n     * See {@link Variance} for details on the computing algorithm.\u003c/p\u003e\n     * \u003cp\u003e\n     * If \u003ccode\u003eisBiasCorrected\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e the formula used\n     * assumes that the supplied mean value is the arithmetic mean of the\n     * sample data, not a known population parameter.  If the mean is a known\n     * population parameter, or if the \"population\" version of the variance is\n     * desired, set \u003ccode\u003eisBiasCorrected\u003c/code\u003e to \u003ccode\u003efalse\u003c/code\u003e before\n     * invoking this method.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * Does not change the internal state of the statistic.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param mean the precomputed mean value\n     * @return the variance of the values or Double.NaN if the array is empty\n     * @throws IllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 443,col 9)-(line 443,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Variance.evaluate(double[], double[], double, int, int)",
      "begin_line": 491,
      "end_line": 522,
      "comment": "\n     * Returns the weighted variance of the entries in the specified portion of\n     * the input array, using the precomputed weighted mean value.  Returns\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray is empty.\n     * \u003cp\u003e\n     * Uses the formula \u003cpre\u003e\n     *   \u0026Sigma;(weights[i]*(values[i] - mean)\u003csup\u003e2\u003c/sup\u003e)/(\u0026Sigma;(weights[i]) - 1)\n     * \u003c/pre\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * The formula used assumes that the supplied mean value is the weighted arithmetic\n     * mean of the sample data, not a known population parameter. This method\n     * is supplied only to save computation when the mean has already been\n     * computed.\u003c/p\u003e\n     * \u003cp\u003e\n     * This formula will not return the same result as the unweighted variance when all\n     * weights are equal, unless all weights are equal to 1. The formula assumes that\n     * weights are to be treated as \"expansion values,\" as will be the case if for example\n     * the weights represent frequency counts. To normalize weights so that the denominator\n     * in the variance computation equals the length of the input vector minus one, use \u003cpre\u003e\n     *   \u003ccode\u003eevaluate(values, MathUtils.normalizeArray(weights, values.length), mean); \u003c/code\u003e\n     * \u003c/pre\u003e\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if any of the following are true:\n     * \u003cul\u003e\u003cli\u003ethe values array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array does not have the same length as the values array\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more infinite values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more NaN values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains negative values\u003c/li\u003e\n     *     \u003cli\u003ethe start and length arguments do not determine a valid array\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * Does not change the internal state of the statistic.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param weights the weights array\n     * @param mean the precomputed weighted mean value\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the variance of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the parameters are not valid\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 494,col 9)-(line 494,col 32)",
        "(line 496,col 9)-(line 520,col 9)",
        "(line 521,col 9)-(line 521,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Variance.evaluate(double[], double[], double)",
      "begin_line": 565,
      "end_line": 567,
      "comment": "\n     * \u003cp\u003eReturns the weighted variance of the values in the input array, using\n     * the precomputed weighted mean value.\u003c/p\u003e\n     * \u003cp\u003e\n     * Uses the formula \u003cpre\u003e\n     *   \u0026Sigma;(weights[i]*(values[i] - mean)\u003csup\u003e2\u003c/sup\u003e)/(\u0026Sigma;(weights[i]) - 1)\n     * \u003c/pre\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * The formula used assumes that the supplied mean value is the weighted arithmetic\n     * mean of the sample data, not a known population parameter. This method\n     * is supplied only to save computation when the mean has already been\n     * computed.\u003c/p\u003e\n     * \u003cp\u003e\n     * This formula will not return the same result as the unweighted variance when all\n     * weights are equal, unless all weights are equal to 1. The formula assumes that\n     * weights are to be treated as \"expansion values,\" as will be the case if for example\n     * the weights represent frequency counts. To normalize weights so that the denominator\n     * in the variance computation equals the length of the input vector minus one, use \u003cpre\u003e\n     *   \u003ccode\u003eevaluate(values, MathUtils.normalizeArray(weights, values.length), mean); \u003c/code\u003e\n     * \u003c/pre\u003e\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if any of the following are true:\n     * \u003cul\u003e\u003cli\u003ethe values array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array does not have the same length as the values array\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more infinite values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more NaN values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains negative values\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * Does not change the internal state of the statistic.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param weights the weights array\n     * @param mean the precomputed weighted mean value\n     * @return the variance of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the parameters are not valid\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 566,col 9)-(line 566,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Variance.isBiasCorrected()",
      "begin_line": 572,
      "end_line": 574,
      "comment": "\n     * @return Returns the isBiasCorrected.\n     ",
      "child_ranges": [
        "(line 573,col 9)-(line 573,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Variance.setBiasCorrected(boolean)",
      "begin_line": 579,
      "end_line": 581,
      "comment": "\n     * @param biasCorrected The isBiasCorrected to set.\n     ",
      "child_ranges": [
        "(line 580,col 9)-(line 580,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Variance.copy()",
      "begin_line": 586,
      "end_line": 591,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 588,col 9)-(line 588,col 41)",
        "(line 589,col 9)-(line 589,col 27)",
        "(line 590,col 9)-(line 590,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Variance.copy(org.apache.commons.math.stat.descriptive.moment.Variance, org.apache.commons.math.stat.descriptive.moment.Variance)",
      "begin_line": 601,
      "end_line": 609,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     *\n     * @param source Variance to copy\n     * @param dest Variance to copy to\n     * @throws NullArgumentException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 603,col 9)-(line 603,col 39)",
        "(line 604,col 9)-(line 604,col 37)",
        "(line 605,col 9)-(line 605,col 42)",
        "(line 606,col 9)-(line 606,col 43)",
        "(line 607,col 9)-(line 607,col 54)",
        "(line 608,col 9)-(line 608,col 42)"
      ]
    }
  ]
}