{
  "filepath": "/tmp/Math-89b/src/java/org/apache/commons/math/stat/descriptive/moment/Variance.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Variance",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic",
        "java.io.Serializable"
      ],
      "begin_line": 65,
      "end_line": 379,
      "comment": "\n * Computes the variance of the available values.  By default, the unbiased\n * \"sample variance\" definitional formula is used: \n * \u003cp\u003e\n * variance \u003d sum((x_i - mean)^2) / (n - 1) \u003c/p\u003e\n * \u003cp\u003e\n * where mean is the {@link Mean} and \u003ccode\u003en\u003c/code\u003e is the number\n * of sample observations.\u003c/p\u003e\n * \u003cp\u003e\n * The definitional formula does not have good numerical properties, so\n * this implementation does not compute the statistic using the definitional\n * formula. \u003cul\u003e\n * \u003cli\u003e The \u003ccode\u003egetResult\u003c/code\u003e method computes the variance using \n * updating formulas based on West\u0027s algorithm, as described in\n * \u003ca href\u003d\"http://doi.acm.org/10.1145/359146.359152\"\u003e Chan, T. F. and\n * J. G. Lewis 1979, \u003ci\u003eCommunications of the ACM\u003c/i\u003e,\n * vol. 22 no. 9, pp. 526-531.\u003c/a\u003e\u003c/li\u003e\n * \u003cli\u003e The \u003ccode\u003eevaluate\u003c/code\u003e methods leverage the fact that they have the\n * full array of values in memory to execute a two-pass algorithm. \n * Specifically, these methods use the \"corrected two-pass algorithm\" from\n * Chan, Golub, Levesque, \u003ci\u003eAlgorithms for Computing the Sample Variance\u003c/i\u003e,\n * American Statistician, August 1983.\u003c/li\u003e\u003c/ul\u003e\n * Note that adding values using \u003ccode\u003eincrement\u003c/code\u003e or \n * \u003ccode\u003eincrementAll\u003c/code\u003e and then executing \u003ccode\u003egetResult\u003c/code\u003e will\n * sometimes give a different, less accurate, result than executing \n * \u003ccode\u003eevaluate\u003c/code\u003e with the full array of values. The former approach\n * should only be used when the full array of values is not available.\u003c/p\u003e\n * \u003cp\u003e\n * The \"population variance\"  ( sum((x_i - mean)^2) / n ) can also\n * be computed using this statistic.  The \u003ccode\u003eisBiasCorrected\u003c/code\u003e\n * property determines whether the \"population\" or \"sample\" value is\n * returned by the \u003ccode\u003eevaluate\u003c/code\u003e and \u003ccode\u003egetResult\u003c/code\u003e methods.\n * To compute population variances, set this property to \u003ccode\u003efalse.\u003c/code\u003e\n * \u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eNote that this implementation is not synchronized.\u003c/strong\u003e If \n * multiple threads access an instance of this class concurrently, and at least\n * one of the threads invokes the \u003ccode\u003eincrement()\u003c/code\u003e or \n * \u003ccode\u003eclear()\u003c/code\u003e method, it must be synchronized externally.\u003c/p\u003e\n * \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "moment"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " SecondMoment is used in incremental calculation of Variance"
    },
    {
      "type": "field",
      "varNames": [
        "incMoment"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": "\n     * Boolean test to determine if this Variance should also increment\n     * the second moment, this evaluates to false when this Variance is\n     * constructed with an external SecondMoment as a parameter.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "isBiasCorrected"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": "\n     * Determines whether or not bias correction is applied when computing the\n     * value of the statisic.  True means that bias is corrected.  See \n     * {@link Variance} for details on the formula.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Variance.Variance()",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * Constructs a Variance with default (true) \u003ccode\u003eisBiasCorrected\u003c/code\u003e\n     * property.\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Variance.Variance(org.apache.commons.math.stat.descriptive.moment.SecondMoment)",
      "begin_line": 101,
      "end_line": 104,
      "comment": "\n     * Constructs a Variance based on an external second moment.\n     * \n     * @param m2 the SecondMoment (Third or Fourth moments work\n     * here as well.)\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 26)",
        "(line 103,col 9)-(line 103,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Variance.Variance(boolean)",
      "begin_line": 114,
      "end_line": 117,
      "comment": "\n     * Constructs a Variance with the specified \u003ccode\u003eisBiasCorrected\u003c/code\u003e\n     * property\n     * \n     * @param isBiasCorrected  setting for bias correction - true means\n     * bias will be corrected and is equivalent to using the argumentless\n     * constructor\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 36)",
        "(line 116,col 9)-(line 116,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Variance.Variance(boolean, org.apache.commons.math.stat.descriptive.moment.SecondMoment)",
      "begin_line": 128,
      "end_line": 132,
      "comment": "\n     * Constructs a Variance with the specified \u003ccode\u003eisBiasCorrected\u003c/code\u003e\n     * property and the supplied external second moment.\n     * \n     * @param isBiasCorrected  setting for bias correction - true means\n     * bias will be corrected\n     * @param m2 the SecondMoment (Third or Fourth moments work\n     * here as well.)\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 26)",
        "(line 130,col 9)-(line 130,col 25)",
        "(line 131,col 9)-(line 131,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Variance.Variance(org.apache.commons.math.stat.descriptive.moment.Variance)",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\n     * Copy constructor, creates a new {@code Variance} identical\n     * to the {@code original}\n     * \n     * @param original the {@code Variance} instance to copy\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Variance.increment(double)",
      "begin_line": 153,
      "end_line": 158,
      "comment": "\n     * {@inheritDoc}  \n     * \u003cp\u003eIf all values are available, it is more accurate to use \n     * {@link #evaluate(double[])} rather than adding values one at a time\n     * using this method and then executing {@link #getResult}, since\n     * \u003ccode\u003eevaluate\u003c/code\u003e leverages the fact that is has the full \n     * list of values together to execute a two-pass algorithm.  \n     * See {@link Variance}.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 157,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Variance.getResult()",
      "begin_line": 163,
      "end_line": 176,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 165,col 13)-(line 175,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Variance.getN()",
      "begin_line": 181,
      "end_line": 183,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Variance.clear()",
      "begin_line": 188,
      "end_line": 193,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 192,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Variance.evaluate(double[])",
      "begin_line": 211,
      "end_line": 217,
      "comment": "\n     * Returns the variance of the entries in the input array, or \n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array is empty.\n     * \u003cp\u003e\n     * See {@link Variance} for details on the computing algorithm.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * Does not change the internal state of the statistic.\u003c/p\u003e\n     * \n     * @param values the input array\n     * @return the variance of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 215,col 9)",
        "(line 216,col 9)-(line 216,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Variance.evaluate(double[], int, int)",
      "begin_line": 239,
      "end_line": 255,
      "comment": "\n     * Returns the variance of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * See {@link Variance} for details on the computing algorithm.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\u003c/p\u003e\n     * \u003cp\u003e\n     * Does not change the internal state of the statistic.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the variance of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     *  parameters are not valid\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 32)",
        "(line 244,col 9)-(line 253,col 9)",
        "(line 254,col 9)-(line 254,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Variance.evaluate(double[], double, int, int)",
      "begin_line": 283,
      "end_line": 309,
      "comment": "\n     * Returns the variance of the entries in the specified portion of\n     * the input array, using the precomputed mean value.  Returns \n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray is empty.\n     * \u003cp\u003e\n     * See {@link Variance} for details on the computing algorithm.\u003c/p\u003e\n     * \u003cp\u003e\n     * The formula used assumes that the supplied mean value is the arithmetic\n     * mean of the sample data, not a known population parameter.  This method\n     * is supplied only to save computation when the mean has already been\n     * computed.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * Does not change the internal state of the statistic.\u003c/p\u003e\n     * \n     * @param values the input array\n     * @param mean the precomputed mean value\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the variance of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     *  parameters are not valid\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 32)",
        "(line 288,col 9)-(line 307,col 9)",
        "(line 308,col 9)-(line 308,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Variance.evaluate(double[], double)",
      "begin_line": 336,
      "end_line": 338,
      "comment": "\n     * Returns the variance of the entries in the input array, using the\n     * precomputed mean value.  Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e if the array\n     * is empty.\n     * \u003cp\u003e\n     * See {@link Variance} for details on the computing algorithm.\u003c/p\u003e\n     * \u003cp\u003e\n     * If \u003ccode\u003eisBiasCorrected\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e the formula used\n     * assumes that the supplied mean value is the arithmetic mean of the\n     * sample data, not a known population parameter.  If the mean is a known\n     * population parameter, or if the \"population\" version of the variance is\n     * desired, set \u003ccode\u003eisBiasCorrected\u003c/code\u003e to \u003ccode\u003efalse\u003c/code\u003e before\n     * invoking this method.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns 0 for a single-value (i.e. length \u003d 1) sample.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * Does not change the internal state of the statistic.\u003c/p\u003e\n     * \n     * @param values the input array\n     * @param mean the precomputed mean value\n     * @return the variance of the values or Double.NaN if the array is empty\n     * @throws IllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Variance.isBiasCorrected()",
      "begin_line": 343,
      "end_line": 345,
      "comment": "\n     * @return Returns the isBiasCorrected.\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Variance.setBiasCorrected(boolean)",
      "begin_line": 350,
      "end_line": 352,
      "comment": "\n     * @param isBiasCorrected The isBiasCorrected to set.\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Variance.copy()",
      "begin_line": 357,
      "end_line": 362,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 41)",
        "(line 360,col 9)-(line 360,col 27)",
        "(line 361,col 9)-(line 361,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Variance.copy(org.apache.commons.math.stat.descriptive.moment.Variance, org.apache.commons.math.stat.descriptive.moment.Variance)",
      "begin_line": 373,
      "end_line": 377,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     * \n     * @param source Variance to copy\n     * @param dest Variance to copy to\n     * @throws NullPointerException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 43)",
        "(line 375,col 9)-(line 375,col 54)",
        "(line 376,col 9)-(line 376,col 42)"
      ]
    }
  ]
}