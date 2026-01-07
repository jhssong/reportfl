{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/stat/descriptive/moment/Variance.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Variance",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.stat.descriptive.AbstractStorelessUnivariateStatistic",
        "java.io.Serializable",
        "org.apache.commons.math3.stat.descriptive.WeightedEvaluation"
      ],
      "begin_line": 70,
      "end_line": 627,
      "comment": "\n * Computes the variance of the available values.  By default, the unbiased\n * \"sample variance\" definitional formula is used:\n * \u003cp\u003e\n * variance \u003d sum((x_i - mean)^2) / (n - 1) \u003c/p\u003e\n * \u003cp\u003e\n * where mean is the {@link Mean} and \u003ccode\u003en\u003c/code\u003e is the number\n * of sample observations.\u003c/p\u003e\n * \u003cp\u003e\n * The definitional formula does not have good numerical properties, so\n * this implementation does not compute the statistic using the definitional\n * formula. \u003cul\u003e\n * \u003cli\u003e The \u003ccode\u003egetResult\u003c/code\u003e method computes the variance using\n * updating formulas based on West\u0027s algorithm, as described in\n * \u003ca href\u003d\"http://doi.acm.org/10.1145/359146.359152\"\u003e Chan, T. F. and\n * J. G. Lewis 1979, \u003ci\u003eCommunications of the ACM\u003c/i\u003e,\n * vol. 22 no. 9, pp. 526-531.\u003c/a\u003e\u003c/li\u003e\n * \u003cli\u003e The \u003ccode\u003eevaluate\u003c/code\u003e methods leverage the fact that they have the\n * full array of values in memory to execute a two-pass algorithm.\n * Specifically, these methods use the \"corrected two-pass algorithm\" from\n * Chan, Golub, Levesque, \u003ci\u003eAlgorithms for Computing the Sample Variance\u003c/i\u003e,\n * American Statistician, vol. 37, no. 3 (1983) pp. 242-247.\u003c/li\u003e\u003c/ul\u003e\n * Note that adding values using \u003ccode\u003eincrement\u003c/code\u003e or\n * \u003ccode\u003eincrementAll\u003c/code\u003e and then executing \u003ccode\u003egetResult\u003c/code\u003e will\n * sometimes give a different, less accurate, result than executing\n * \u003ccode\u003eevaluate\u003c/code\u003e with the full array of values. The former approach\n * should only be used when the full array of values is not available.\u003c/p\u003e\n * \u003cp\u003e\n * The \"population variance\"  ( sum((x_i - mean)^2) / n ) can also\n * be computed using this statistic.  The \u003ccode\u003eisBiasCorrected\u003c/code\u003e\n * property determines whether the \"population\" or \"sample\" value is\n * returned by the \u003ccode\u003eevaluate\u003c/code\u003e and \u003ccode\u003egetResult\u003c/code\u003e methods.\n * To compute population variances, set this property to \u003ccode\u003efalse.\u003c/code\u003e\n * \u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eNote that this implementation is not synchronized.\u003c/strong\u003e If\n * multiple threads access an instance of this class concurrently, and at least\n * one of the threads invokes the \u003ccode\u003eincrement()\u003c/code\u003e or\n * \u003ccode\u003eclear()\u003c/code\u003e method, it must be synchronized externally.\u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "moment"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " SecondMoment is used in incremental calculation of Variance"
    },
    {
      "type": "field",
      "varNames": [
        "incMoment"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": "\n     * Whether or not {@link #increment(double)} should increment\n     * the internal second moment. When a Variance is constructed with an\n     * external SecondMoment as a constructor parameter, this property is\n     * set to false and increments must be applied to the second moment\n     * directly.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "isBiasCorrected"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": "\n     * Whether or not bias correction is applied when computing the\n     * value of the statistic. True means that bias is corrected.  See\n     * {@link Variance} for details on the formula.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Variance.Variance()",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * Constructs a Variance with default (true) \u003ccode\u003eisBiasCorrected\u003c/code\u003e\n     * property.\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Variance.Variance(org.apache.commons.math3.stat.descriptive.moment.SecondMoment)",
      "begin_line": 112,
      "end_line": 115,
      "comment": "\n     * Constructs a Variance based on an external second moment.\n     * When this constructor is used, the statistic may only be\n     * incremented via the moment, i.e., {@link #increment(double)}\n     * does nothing; whereas {@code m2.increment(value)} increments\n     * both {@code m2} and the Variance instance constructed from it.\n     *\n     * @param m2 the SecondMoment (Third or Fourth moments work\n     * here as well.)\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 26)",
        "(line 114,col 9)-(line 114,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Variance.Variance(boolean)",
      "begin_line": 125,
      "end_line": 128,
      "comment": "\n     * Constructs a Variance with the specified \u003ccode\u003eisBiasCorrected\u003c/code\u003e\n     * property\n     *\n     * @param isBiasCorrected  setting for bias correction - true means\n     * bias will be corrected and is equivalent to using the argumentless\n     * constructor\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 36)",
        "(line 127,col 9)-(line 127,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Variance.Variance(boolean, org.apache.commons.math3.stat.descriptive.moment.SecondMoment)",
      "begin_line": 139,
      "end_line": 143,
      "comment": "\n     * Constructs a Variance with the specified \u003ccode\u003eisBiasCorrected\u003c/code\u003e\n     * property and the supplied external second moment.\n     *\n     * @param isBiasCorrected  setting for bias correction - true means\n     * bias will be corrected\n     * @param m2 the SecondMoment (Third or Fourth moments work\n     * here as well.)\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 26)",
        "(line 141,col 9)-(line 141,col 25)",
        "(line 142,col 9)-(line 142,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Variance.Variance(org.apache.commons.math3.stat.descriptive.moment.Variance)",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\n     * Copy constructor, creates a new {@code Variance} identical\n     * to the {@code original}\n     *\n     * @param original the {@code Variance} instance to copy\n     * @throws NullArgumentException if original is null\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Variance.increment(double)",
      "begin_line": 169,
      "end_line": 174,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003eIf all values are available, it is more accurate to use\n     * {@link #evaluate(double[])} rather than adding values one at a time\n     * using this method and then executing {@link #getResult}, since\n     * \u003ccode\u003eevaluate\u003c/code\u003e leverages the fact that is has the full\n     * list of values together to execute a two-pass algorithm.\n     * See {@link Variance}.\u003c/p\u003e\n     *\n     * \u003cp\u003eNote also that when {@link #Variance(SecondMoment)} is used to\n     * create a Variance, this method does nothing. In that case, the\n     * SecondMoment should be incremented directly.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 173,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Variance.getResult()",
      "begin_line": 179,
      "end_line": 192,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 181,col 13)-(line 191,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Variance.getN()",
      "begin_line": 197,
      "end_line": 199,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Variance.clear()",
      "begin_line": 204,
      "end_line": 209,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 208,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Variance.evaluate(double[])",
      "begin_line": 227,
      "end_line": 233,
      "comment": "\n     * Returns the variance of the entries in the input array, or\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array is empty.\n     * \u003cp\u003e\n     * See {@link Variance} for details on the computing algorithm.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eMathIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * Does not change the internal state of the statistic.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @return the variance of the values or Double.NaN if length \u003d 0\n     * @throws MathIllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 231,col 9)",
        "(line 232,col 9)-(line 232,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Variance.evaluate(double[], int, int)",
      "begin_line": 255,
      "end_line": 272,
      "comment": "\n     * Returns the variance of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * See {@link Variance} for details on the computing algorithm.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\u003c/p\u003e\n     * \u003cp\u003e\n     * Does not change the internal state of the statistic.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eMathIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the variance of the values or Double.NaN if length \u003d 0\n     * @throws MathIllegalArgumentException if the array is null or the array index\n     *  parameters are not valid\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 32)",
        "(line 261,col 9)-(line 270,col 9)",
        "(line 271,col 9)-(line 271,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Variance.evaluate(double[], double[], int, int)",
      "begin_line": 316,
      "end_line": 332,
      "comment": "\n     * \u003cp\u003eReturns the weighted variance of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\u003c/p\u003e\n     * \u003cp\u003e\n     * Uses the formula \u003cpre\u003e\n     *   \u0026Sigma;(weights[i]*(values[i] - weightedMean)\u003csup\u003e2\u003c/sup\u003e)/(\u0026Sigma;(weights[i]) - 1)\n     * \u003c/pre\u003e\n     * where weightedMean is the weighted mean\u003c/p\u003e\n     * \u003cp\u003e\n     * This formula will not return the same result as the unweighted variance when all\n     * weights are equal, unless all weights are equal to 1. The formula assumes that\n     * weights are to be treated as \"expansion values,\" as will be the case if for example\n     * the weights represent frequency counts. To normalize weights so that the denominator\n     * in the variance computation equals the length of the input vector minus one, use \u003cpre\u003e\n     *   \u003ccode\u003eevaluate(values, MathArrays.normalizeArray(weights, values.length)); \u003c/code\u003e\n     * \u003c/pre\u003e\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if any of the following are true:\n     * \u003cul\u003e\u003cli\u003ethe values array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array does not have the same length as the values array\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more infinite values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more NaN values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains negative values\u003c/li\u003e\n     *     \u003cli\u003ethe start and length arguments do not determine a valid array\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * Does not change the internal state of the statistic.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eMathIllegalArgumentException\u003c/code\u003e if either array is null.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param weights the weights array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the weighted variance of the values or Double.NaN if length \u003d 0\n     * @throws MathIllegalArgumentException if the parameters are not valid\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 32)",
        "(line 321,col 9)-(line 330,col 9)",
        "(line 331,col 9)-(line 331,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Variance.evaluate(double[], double[])",
      "begin_line": 372,
      "end_line": 375,
      "comment": "\n     * \u003cp\u003e\n     * Returns the weighted variance of the entries in the the input array.\u003c/p\u003e\n     * \u003cp\u003e\n     * Uses the formula \u003cpre\u003e\n     *   \u0026Sigma;(weights[i]*(values[i] - weightedMean)\u003csup\u003e2\u003c/sup\u003e)/(\u0026Sigma;(weights[i]) - 1)\n     * \u003c/pre\u003e\n     * where weightedMean is the weighted mean\u003c/p\u003e\n     * \u003cp\u003e\n     * This formula will not return the same result as the unweighted variance when all\n     * weights are equal, unless all weights are equal to 1. The formula assumes that\n     * weights are to be treated as \"expansion values,\" as will be the case if for example\n     * the weights represent frequency counts. To normalize weights so that the denominator\n     * in the variance computation equals the length of the input vector minus one, use \u003cpre\u003e\n     *   \u003ccode\u003eevaluate(values, MathArrays.normalizeArray(weights, values.length)); \u003c/code\u003e\n     * \u003c/pre\u003e\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eMathIllegalArgumentException\u003c/code\u003e if any of the following are true:\n     * \u003cul\u003e\u003cli\u003ethe values array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array does not have the same length as the values array\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more infinite values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more NaN values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains negative values\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * Does not change the internal state of the statistic.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eMathIllegalArgumentException\u003c/code\u003e if either array is null.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param weights the weights array\n     * @return the weighted variance of the values\n     * @throws MathIllegalArgumentException if the parameters are not valid\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Variance.evaluate(double[], double, int, int)",
      "begin_line": 403,
      "end_line": 429,
      "comment": "\n     * Returns the variance of the entries in the specified portion of\n     * the input array, using the precomputed mean value.  Returns\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray is empty.\n     * \u003cp\u003e\n     * See {@link Variance} for details on the computing algorithm.\u003c/p\u003e\n     * \u003cp\u003e\n     * The formula used assumes that the supplied mean value is the arithmetic\n     * mean of the sample data, not a known population parameter.  This method\n     * is supplied only to save computation when the mean has already been\n     * computed.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eMathIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * Does not change the internal state of the statistic.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param mean the precomputed mean value\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the variance of the values or Double.NaN if length \u003d 0\n     * @throws MathIllegalArgumentException if the array is null or the array index\n     *  parameters are not valid\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 32)",
        "(line 408,col 9)-(line 427,col 9)",
        "(line 428,col 9)-(line 428,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Variance.evaluate(double[], double)",
      "begin_line": 456,
      "end_line": 458,
      "comment": "\n     * Returns the variance of the entries in the input array, using the\n     * precomputed mean value.  Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array\n     * is empty.\n     * \u003cp\u003e\n     * See {@link Variance} for details on the computing algorithm.\u003c/p\u003e\n     * \u003cp\u003e\n     * If \u003ccode\u003eisBiasCorrected\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e the formula used\n     * assumes that the supplied mean value is the arithmetic mean of the\n     * sample data, not a known population parameter.  If the mean is a known\n     * population parameter, or if the \"population\" version of the variance is\n     * desired, set \u003ccode\u003eisBiasCorrected\u003c/code\u003e to \u003ccode\u003efalse\u003c/code\u003e before\n     * invoking this method.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eMathIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * Does not change the internal state of the statistic.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param mean the precomputed mean value\n     * @return the variance of the values or Double.NaN if the array is empty\n     * @throws MathIllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 457,col 9)-(line 457,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Variance.evaluate(double[], double[], double, int, int)",
      "begin_line": 505,
      "end_line": 537,
      "comment": "\n     * Returns the weighted variance of the entries in the specified portion of\n     * the input array, using the precomputed weighted mean value.  Returns\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray is empty.\n     * \u003cp\u003e\n     * Uses the formula \u003cpre\u003e\n     *   \u0026Sigma;(weights[i]*(values[i] - mean)\u003csup\u003e2\u003c/sup\u003e)/(\u0026Sigma;(weights[i]) - 1)\n     * \u003c/pre\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * The formula used assumes that the supplied mean value is the weighted arithmetic\n     * mean of the sample data, not a known population parameter. This method\n     * is supplied only to save computation when the mean has already been\n     * computed.\u003c/p\u003e\n     * \u003cp\u003e\n     * This formula will not return the same result as the unweighted variance when all\n     * weights are equal, unless all weights are equal to 1. The formula assumes that\n     * weights are to be treated as \"expansion values,\" as will be the case if for example\n     * the weights represent frequency counts. To normalize weights so that the denominator\n     * in the variance computation equals the length of the input vector minus one, use \u003cpre\u003e\n     *   \u003ccode\u003eevaluate(values, MathArrays.normalizeArray(weights, values.length), mean); \u003c/code\u003e\n     * \u003c/pre\u003e\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eMathIllegalArgumentException\u003c/code\u003e if any of the following are true:\n     * \u003cul\u003e\u003cli\u003ethe values array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array does not have the same length as the values array\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more infinite values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more NaN values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains negative values\u003c/li\u003e\n     *     \u003cli\u003ethe start and length arguments do not determine a valid array\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * Does not change the internal state of the statistic.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param weights the weights array\n     * @param mean the precomputed weighted mean value\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the variance of the values or Double.NaN if length \u003d 0\n     * @throws MathIllegalArgumentException if the parameters are not valid\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 509,col 9)-(line 509,col 32)",
        "(line 511,col 9)-(line 535,col 9)",
        "(line 536,col 9)-(line 536,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Variance.evaluate(double[], double[], double)",
      "begin_line": 580,
      "end_line": 583,
      "comment": "\n     * \u003cp\u003eReturns the weighted variance of the values in the input array, using\n     * the precomputed weighted mean value.\u003c/p\u003e\n     * \u003cp\u003e\n     * Uses the formula \u003cpre\u003e\n     *   \u0026Sigma;(weights[i]*(values[i] - mean)\u003csup\u003e2\u003c/sup\u003e)/(\u0026Sigma;(weights[i]) - 1)\n     * \u003c/pre\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * The formula used assumes that the supplied mean value is the weighted arithmetic\n     * mean of the sample data, not a known population parameter. This method\n     * is supplied only to save computation when the mean has already been\n     * computed.\u003c/p\u003e\n     * \u003cp\u003e\n     * This formula will not return the same result as the unweighted variance when all\n     * weights are equal, unless all weights are equal to 1. The formula assumes that\n     * weights are to be treated as \"expansion values,\" as will be the case if for example\n     * the weights represent frequency counts. To normalize weights so that the denominator\n     * in the variance computation equals the length of the input vector minus one, use \u003cpre\u003e\n     *   \u003ccode\u003eevaluate(values, MathArrays.normalizeArray(weights, values.length), mean); \u003c/code\u003e\n     * \u003c/pre\u003e\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eMathIllegalArgumentException\u003c/code\u003e if any of the following are true:\n     * \u003cul\u003e\u003cli\u003ethe values array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array does not have the same length as the values array\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more infinite values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more NaN values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains negative values\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * Does not change the internal state of the statistic.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param weights the weights array\n     * @param mean the precomputed weighted mean value\n     * @return the variance of the values or Double.NaN if length \u003d 0\n     * @throws MathIllegalArgumentException if the parameters are not valid\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 582,col 9)-(line 582,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Variance.isBiasCorrected()",
      "begin_line": 588,
      "end_line": 590,
      "comment": "\n     * @return Returns the isBiasCorrected.\n     ",
      "child_ranges": [
        "(line 589,col 9)-(line 589,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Variance.setBiasCorrected(boolean)",
      "begin_line": 595,
      "end_line": 597,
      "comment": "\n     * @param biasCorrected The isBiasCorrected to set.\n     ",
      "child_ranges": [
        "(line 596,col 9)-(line 596,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Variance.copy()",
      "begin_line": 602,
      "end_line": 608,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 604,col 9)-(line 604,col 41)",
        "(line 606,col 9)-(line 606,col 27)",
        "(line 607,col 9)-(line 607,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Variance.copy(org.apache.commons.math3.stat.descriptive.moment.Variance, org.apache.commons.math3.stat.descriptive.moment.Variance)",
      "begin_line": 618,
      "end_line": 626,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     *\n     * @param source Variance to copy\n     * @param dest Variance to copy to\n     * @throws NullArgumentException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 620,col 9)-(line 620,col 39)",
        "(line 621,col 9)-(line 621,col 37)",
        "(line 622,col 9)-(line 622,col 42)",
        "(line 623,col 9)-(line 623,col 43)",
        "(line 624,col 9)-(line 624,col 54)",
        "(line 625,col 9)-(line 625,col 42)"
      ]
    }
  ]
}