{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/stat/descriptive/moment/Variance.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Variance",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic",
        "java.io.Serializable"
      ],
      "begin_line": 66,
      "end_line": 514,
      "comment": "\n * Computes the variance of the available values.  By default, the unbiased\n * \"sample variance\" definitional formula is used:\n * \u003cp\u003e\n * variance \u003d sum((x_i - mean)^2) / (n - 1) \u003c/p\u003e\n * \u003cp\u003e\n * where mean is the {@link Mean} and \u003ccode\u003en\u003c/code\u003e is the number\n * of sample observations.\u003c/p\u003e\n * \u003cp\u003e\n * The definitional formula does not have good numerical properties, so\n * this implementation does not compute the statistic using the definitional\n * formula. \u003cul\u003e\n * \u003cli\u003e The \u003ccode\u003egetResult\u003c/code\u003e method computes the variance using\n * updating formulas based on West\u0027s algorithm, as described in\n * \u003ca href\u003d\"http://doi.acm.org/10.1145/359146.359152\"\u003e Chan, T. F. and\n * J. G. Lewis 1979, \u003ci\u003eCommunications of the ACM\u003c/i\u003e,\n * vol. 22 no. 9, pp. 526-531.\u003c/a\u003e\u003c/li\u003e\n * \u003cli\u003e The \u003ccode\u003eevaluate\u003c/code\u003e methods leverage the fact that they have the\n * full array of values in memory to execute a two-pass algorithm.\n * Specifically, these methods use the \"corrected two-pass algorithm\" from\n * Chan, Golub, Levesque, \u003ci\u003eAlgorithms for Computing the Sample Variance\u003c/i\u003e,\n * American Statistician, vol. 37, no. 3 (1983) pp. 242-247.\u003c/li\u003e\u003c/ul\u003e\n * Note that adding values using \u003ccode\u003eincrement\u003c/code\u003e or\n * \u003ccode\u003eincrementAll\u003c/code\u003e and then executing \u003ccode\u003egetResult\u003c/code\u003e will\n * sometimes give a different, less accurate, result than executing\n * \u003ccode\u003eevaluate\u003c/code\u003e with the full array of values. The former approach\n * should only be used when the full array of values is not available.\u003c/p\u003e\n * \u003cp\u003e\n * The \"population variance\"  ( sum((x_i - mean)^2) / n ) can also\n * be computed using this statistic.  The \u003ccode\u003eisBiasCorrected\u003c/code\u003e\n * property determines whether the \"population\" or \"sample\" value is\n * returned by the \u003ccode\u003eevaluate\u003c/code\u003e and \u003ccode\u003egetResult\u003c/code\u003e methods.\n * To compute population variances, set this property to \u003ccode\u003efalse.\u003c/code\u003e\n * \u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eNote that this implementation is not synchronized.\u003c/strong\u003e If\n * multiple threads access an instance of this class concurrently, and at least\n * one of the threads invokes the \u003ccode\u003eincrement()\u003c/code\u003e or\n * \u003ccode\u003eclear()\u003c/code\u003e method, it must be synchronized externally.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "moment"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " SecondMoment is used in incremental calculation of Variance"
    },
    {
      "type": "field",
      "varNames": [
        "incMoment"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": "\n     * Boolean test to determine if this Variance should also increment\n     * the second moment, this evaluates to false when this Variance is\n     * constructed with an external SecondMoment as a parameter.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "isBiasCorrected"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": "\n     * Determines whether or not bias correction is applied when computing the\n     * value of the statisic.  True means that bias is corrected.  See\n     * {@link Variance} for details on the formula.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Variance.Variance()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n     * Constructs a Variance with default (true) \u003ccode\u003eisBiasCorrected\u003c/code\u003e\n     * property.\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Variance.Variance(org.apache.commons.math.stat.descriptive.moment.SecondMoment)",
      "begin_line": 102,
      "end_line": 105,
      "comment": "\n     * Constructs a Variance based on an external second moment.\n     *\n     * @param m2 the SecondMoment (Third or Fourth moments work\n     * here as well.)\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 26)",
        "(line 104,col 9)-(line 104,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Variance.Variance(boolean)",
      "begin_line": 115,
      "end_line": 118,
      "comment": "\n     * Constructs a Variance with the specified \u003ccode\u003eisBiasCorrected\u003c/code\u003e\n     * property\n     *\n     * @param isBiasCorrected  setting for bias correction - true means\n     * bias will be corrected and is equivalent to using the argumentless\n     * constructor\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 36)",
        "(line 117,col 9)-(line 117,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Variance.Variance(boolean, org.apache.commons.math.stat.descriptive.moment.SecondMoment)",
      "begin_line": 129,
      "end_line": 133,
      "comment": "\n     * Constructs a Variance with the specified \u003ccode\u003eisBiasCorrected\u003c/code\u003e\n     * property and the supplied external second moment.\n     *\n     * @param isBiasCorrected  setting for bias correction - true means\n     * bias will be corrected\n     * @param m2 the SecondMoment (Third or Fourth moments work\n     * here as well.)\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 26)",
        "(line 131,col 9)-(line 131,col 25)",
        "(line 132,col 9)-(line 132,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Variance.Variance(org.apache.commons.math.stat.descriptive.moment.Variance)",
      "begin_line": 141,
      "end_line": 143,
      "comment": "\n     * Copy constructor, creates a new {@code Variance} identical\n     * to the {@code original}\n     *\n     * @param original the {@code Variance} instance to copy\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Variance.increment(double)",
      "begin_line": 154,
      "end_line": 159,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003eIf all values are available, it is more accurate to use\n     * {@link #evaluate(double[])} rather than adding values one at a time\n     * using this method and then executing {@link #getResult}, since\n     * \u003ccode\u003eevaluate\u003c/code\u003e leverages the fact that is has the full\n     * list of values together to execute a two-pass algorithm.\n     * See {@link Variance}.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 158,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Variance.getResult()",
      "begin_line": 164,
      "end_line": 177,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 166,col 13)-(line 176,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Variance.getN()",
      "begin_line": 182,
      "end_line": 184,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Variance.clear()",
      "begin_line": 189,
      "end_line": 194,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 193,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Variance.evaluate(double[])",
      "begin_line": 212,
      "end_line": 218,
      "comment": "\n     * Returns the variance of the entries in the input array, or\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array is empty.\n     * \u003cp\u003e\n     * See {@link Variance} for details on the computing algorithm.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * Does not change the internal state of the statistic.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @return the variance of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 216,col 9)",
        "(line 217,col 9)-(line 217,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Variance.evaluate(double[], int, int)",
      "begin_line": 240,
      "end_line": 256,
      "comment": "\n     * Returns the variance of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * See {@link Variance} for details on the computing algorithm.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\u003c/p\u003e\n     * \u003cp\u003e\n     * Does not change the internal state of the statistic.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the variance of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     *  parameters are not valid\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 32)",
        "(line 245,col 9)-(line 254,col 9)",
        "(line 255,col 9)-(line 255,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Variance.evaluate(double[], double[], int, int)",
      "begin_line": 299,
      "end_line": 315,
      "comment": "\n     * \u003cp\u003eReturns the weighted variance of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\u003c/p\u003e\n     * \u003cp\u003e\n     * Uses the formula \u003cpre\u003e\n     *   \u0026Sigma;(weights[i]*(values[i] - weightedMean)\u003csup\u003e2\u003c/sup\u003e)/(\u0026Sigma;(weights[i]) - 1)\n     * \u003c/pre\u003e\n     * where weightedMean is the weighted mean\u003c/p\u003e\n     * \u003cp\u003e\n     * This formula will not return the same result as the unweighted variance when all\n     * weights are equal, unless all weights are equal to 1. The formula assumes that\n     * weights are to be treated as \"expansion values,\" as will be the case if for example\n     * the weights represent frequency counts. To normalize weights so that the denominator\n     * in the variance computation equals the length of the input vector minus one, use \u003cpre\u003e\n     *   \u003ccode\u003eevaluate(values, MathUtils.normalizeArray(weights, values.length)); \u003c/code\u003e\n     * \u003c/pre\u003e\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if any of the following are true:\n     * \u003cul\u003e\u003cli\u003ethe values array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array does not have the same length as the values array\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more infinite values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more NaN values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains negative values\u003c/li\u003e\n     *     \u003cli\u003ethe start and length arguments do not determine a valid array\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * Does not change the internal state of the statistic.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if either array is null.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param weights the weights array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the variance of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the parameters are not valid\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 32)",
        "(line 304,col 9)-(line 313,col 9)",
        "(line 314,col 9)-(line 314,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Variance.evaluate(double[], double, int, int)",
      "begin_line": 343,
      "end_line": 369,
      "comment": "\n     * Returns the variance of the entries in the specified portion of\n     * the input array, using the precomputed mean value.  Returns\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray is empty.\n     * \u003cp\u003e\n     * See {@link Variance} for details on the computing algorithm.\u003c/p\u003e\n     * \u003cp\u003e\n     * The formula used assumes that the supplied mean value is the arithmetic\n     * mean of the sample data, not a known population parameter.  This method\n     * is supplied only to save computation when the mean has already been\n     * computed.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * Does not change the internal state of the statistic.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param mean the precomputed mean value\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the variance of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     *  parameters are not valid\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 32)",
        "(line 348,col 9)-(line 367,col 9)",
        "(line 368,col 9)-(line 368,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Variance.evaluate(double[], double[], double, int, int)",
      "begin_line": 415,
      "end_line": 444,
      "comment": "\n     * Returns the weighted variance of the entries in the specified portion of\n     * the input array, using the precomputed weighted mean value.  Returns\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray is empty.\n     * \u003cp\u003e\n     * Uses the formula \u003cpre\u003e\n     *   \u0026Sigma;(weights[i]*(values[i] - mean)\u003csup\u003e2\u003c/sup\u003e)/(\u0026Sigma;(weights[i]) - 1)\n     * \u003c/pre\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * The formula used assumes that the supplied mean value is the weighted arithmetic\n     * mean of the sample data, not a known population parameter. This method\n     * is supplied only to save computation when the mean has already been\n     * computed.\u003c/p\u003e\n     * \u003cp\u003e\n     * This formula will not return the same result as the unweighted variance when all\n     * weights are equal, unless all weights are equal to 1. The formula assumes that\n     * weights are to be treated as \"expansion values,\" as will be the case if for example\n     * the weights represent frequency counts. To normalize weights so that the denominator\n     * in the variance computation equals the length of the input vector minus one, use \u003cpre\u003e\n     *   \u003ccode\u003eevaluate(values, MathUtils.normalizeArray(weights, values.length)); \u003c/code\u003e\n     * \u003c/pre\u003e\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if any of the following are true:\n     * \u003cul\u003e\u003cli\u003ethe values array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array does not have the same length as the values array\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more infinite values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more NaN values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains negative values\u003c/li\u003e\n     *     \u003cli\u003ethe start and length arguments do not determine a valid array\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * Does not change the internal state of the statistic.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param weights the weights array\n     * @param mean the precomputed weighted mean value\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the variance of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the parameters are not valid\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 32)",
        "(line 420,col 9)-(line 442,col 9)",
        "(line 443,col 9)-(line 443,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Variance.evaluate(double[], double)",
      "begin_line": 471,
      "end_line": 473,
      "comment": "\n     * Returns the variance of the entries in the input array, using the\n     * precomputed mean value.  Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array\n     * is empty.\n     * \u003cp\u003e\n     * See {@link Variance} for details on the computing algorithm.\u003c/p\u003e\n     * \u003cp\u003e\n     * If \u003ccode\u003eisBiasCorrected\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e the formula used\n     * assumes that the supplied mean value is the arithmetic mean of the\n     * sample data, not a known population parameter.  If the mean is a known\n     * population parameter, or if the \"population\" version of the variance is\n     * desired, set \u003ccode\u003eisBiasCorrected\u003c/code\u003e to \u003ccode\u003efalse\u003c/code\u003e before\n     * invoking this method.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * Does not change the internal state of the statistic.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param mean the precomputed mean value\n     * @return the variance of the values or Double.NaN if the array is empty\n     * @throws IllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Variance.isBiasCorrected()",
      "begin_line": 478,
      "end_line": 480,
      "comment": "\n     * @return Returns the isBiasCorrected.\n     ",
      "child_ranges": [
        "(line 479,col 9)-(line 479,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Variance.setBiasCorrected(boolean)",
      "begin_line": 485,
      "end_line": 487,
      "comment": "\n     * @param biasCorrected The isBiasCorrected to set.\n     ",
      "child_ranges": [
        "(line 486,col 9)-(line 486,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Variance.copy()",
      "begin_line": 492,
      "end_line": 497,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 494,col 9)-(line 494,col 41)",
        "(line 495,col 9)-(line 495,col 27)",
        "(line 496,col 9)-(line 496,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Variance.copy(org.apache.commons.math.stat.descriptive.moment.Variance, org.apache.commons.math.stat.descriptive.moment.Variance)",
      "begin_line": 508,
      "end_line": 512,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     *\n     * @param source Variance to copy\n     * @param dest Variance to copy to\n     * @throws NullPointerException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 509,col 9)-(line 509,col 43)",
        "(line 510,col 9)-(line 510,col 54)",
        "(line 511,col 9)-(line 511,col 42)"
      ]
    }
  ]
}