{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/stat/descriptive/moment/Mean.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Mean",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.stat.descriptive.AbstractStorelessUnivariateStatistic",
        "java.io.Serializable",
        "org.apache.commons.math3.stat.descriptive.WeightedEvaluation"
      ],
      "begin_line": 62,
      "end_line": 285,
      "comment": "\n * \u003cp\u003eComputes the arithmetic mean of a set of values. Uses the definitional\n * formula:\u003c/p\u003e\n * \u003cp\u003e\n * mean \u003d sum(x_i) / n\n * \u003c/p\u003e\n * \u003cp\u003ewhere \u003ccode\u003en\u003c/code\u003e is the number of observations.\n * \u003c/p\u003e\n * \u003cp\u003eWhen {@link #increment(double)} is used to add data incrementally from a\n * stream of (unstored) values, the value of the statistic that\n * {@link #getResult()} returns is computed using the following recursive\n * updating algorithm: \u003c/p\u003e\n * \u003col\u003e\n * \u003cli\u003eInitialize \u003ccode\u003em \u003d \u003c/code\u003e the first value\u003c/li\u003e\n * \u003cli\u003eFor each additional value, update using \u003cbr\u003e\n *   \u003ccode\u003em \u003d m + (new value - m) / (number of observations)\u003c/code\u003e\u003c/li\u003e\n * \u003c/ol\u003e\n * \u003cp\u003e If {@link #evaluate(double[])} is used to compute the mean of an array\n * of stored values, a two-pass, corrected algorithm is used, starting with\n * the definitional formula computed using the array of stored values and then\n * correcting this by adding the mean deviation of the data values from the\n * arithmetic mean. See, e.g. \"Comparison of Several Algorithms for Computing\n * Sample Means and Variances,\" Robert F. Ling, Journal of the American\n * Statistical Association, Vol. 69, No. 348 (Dec., 1974), pp. 859-866. \u003c/p\u003e\n * \u003cp\u003e\n *  Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e if the dataset is empty.\n * \u003c/p\u003e\n * \u003cstrong\u003eNote that this implementation is not synchronized.\u003c/strong\u003e If\n * multiple threads access an instance of this class concurrently, and at least\n * one of the threads invokes the \u003ccode\u003eincrement()\u003c/code\u003e or\n * \u003ccode\u003eclear()\u003c/code\u003e method, it must be synchronized externally.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "moment"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " First moment on which this statistic is based. "
    },
    {
      "type": "field",
      "varNames": [
        "incMoment"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": "\n     * Determines whether or not this statistic can be incremented or cleared.\n     * \u003cp\u003e\n     * Statistics based on (constructed from) external moments cannot\n     * be incremented or cleared.\u003c/p\u003e\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Mean.Mean()",
      "begin_line": 80,
      "end_line": 83,
      "comment": " Constructs a Mean. ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 25)",
        "(line 82,col 9)-(line 82,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Mean.Mean(org.apache.commons.math3.stat.descriptive.moment.FirstMoment)",
      "begin_line": 90,
      "end_line": 93,
      "comment": "\n     * Constructs a Mean with an External Moment.\n     *\n     * @param m1 the moment\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 25)",
        "(line 92,col 9)-(line 92,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Mean.Mean(org.apache.commons.math3.stat.descriptive.moment.Mean)",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\n     * Copy constructor, creates a new {@code Mean} identical\n     * to the {@code original}\n     *\n     * @param original the {@code Mean} instance to copy\n     * @throws NullArgumentException if original is null\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Mean.increment(double)",
      "begin_line": 112,
      "end_line": 117,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003eNote that when {@link #Mean(FirstMoment)} is used to\n     * create a Mean, this method does nothing. In that case, the\n     * FirstMoment should be incremented directly.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 116,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Mean.clear()",
      "begin_line": 122,
      "end_line": 127,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 126,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Mean.getResult()",
      "begin_line": 132,
      "end_line": 135,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Mean.getN()",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Mean.evaluate(double[], int, int)",
      "begin_line": 160,
      "end_line": 178,
      "comment": "\n     * Returns the arithmetic mean of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link Mean} for details on the computing algorithm.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the mean of the values or Double.NaN if length \u003d 0\n     * @throws MathIllegalArgumentException if the array is null or the array index\n     *  parameters are not valid\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 176,col 9)",
        "(line 177,col 9)-(line 177,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Mean.evaluate(double[], double[], int, int)",
      "begin_line": 209,
      "end_line": 226,
      "comment": "\n     * Returns the weighted arithmetic mean of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if either array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link Mean} for details on the computing algorithm. The two-pass algorithm\n     * described above is used here, with weights applied in computing both the original\n     * estimate and the correction factor.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if any of the following are true:\n     * \u003cul\u003e\u003cli\u003ethe values array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array does not have the same length as the values array\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more infinite values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more NaN values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains negative values\u003c/li\u003e\n     *     \u003cli\u003ethe start and length arguments do not determine a valid array\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param weights the weights array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the mean of the values or Double.NaN if length \u003d 0\n     * @throws MathIllegalArgumentException if the parameters are not valid\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 224,col 9)",
        "(line 225,col 9)-(line 225,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Mean.evaluate(double[], double[])",
      "begin_line": 252,
      "end_line": 255,
      "comment": "\n     * Returns the weighted arithmetic mean of the entries in the input array.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eMathIllegalArgumentException\u003c/code\u003e if either array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link Mean} for details on the computing algorithm. The two-pass algorithm\n     * described above is used here, with weights applied in computing both the original\n     * estimate and the correction factor.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eMathIllegalArgumentException\u003c/code\u003e if any of the following are true:\n     * \u003cul\u003e\u003cli\u003ethe values array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array does not have the same length as the values array\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more infinite values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more NaN values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains negative values\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param weights the weights array\n     * @return the mean of the values or Double.NaN if length \u003d 0\n     * @throws MathIllegalArgumentException if the parameters are not valid\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Mean.copy()",
      "begin_line": 260,
      "end_line": 266,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 33)",
        "(line 264,col 9)-(line 264,col 27)",
        "(line 265,col 9)-(line 265,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Mean.copy(org.apache.commons.math3.stat.descriptive.moment.Mean, org.apache.commons.math3.stat.descriptive.moment.Mean)",
      "begin_line": 277,
      "end_line": 284,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     *\n     * @param source Mean to copy\n     * @param dest Mean to copy to\n     * @throws NullArgumentException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 39)",
        "(line 280,col 9)-(line 280,col 37)",
        "(line 281,col 9)-(line 281,col 42)",
        "(line 282,col 9)-(line 282,col 42)",
        "(line 283,col 9)-(line 283,col 43)"
      ]
    }
  ]
}