{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/stat/descriptive/moment/Mean.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Mean",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic",
        "java.io.Serializable",
        "org.apache.commons.math.stat.descriptive.WeightedEvaluation"
      ],
      "begin_line": 59,
      "end_line": 271,
      "comment": "\n * \u003cp\u003eComputes the arithmetic mean of a set of values. Uses the definitional\n * formula:\u003c/p\u003e\n * \u003cp\u003e\n * mean \u003d sum(x_i) / n\n * \u003c/p\u003e\n * \u003cp\u003ewhere \u003ccode\u003en\u003c/code\u003e is the number of observations.\n * \u003c/p\u003e\n * \u003cp\u003eWhen {@link #increment(double)} is used to add data incrementally from a\n * stream of (unstored) values, the value of the statistic that\n * {@link #getResult()} returns is computed using the following recursive\n * updating algorithm: \u003c/p\u003e\n * \u003col\u003e\n * \u003cli\u003eInitialize \u003ccode\u003em \u003d \u003c/code\u003e the first value\u003c/li\u003e\n * \u003cli\u003eFor each additional value, update using \u003cbr\u003e\n *   \u003ccode\u003em \u003d m + (new value - m) / (number of observations)\u003c/code\u003e\u003c/li\u003e\n * \u003c/ol\u003e\n * \u003cp\u003e If {@link #evaluate(double[])} is used to compute the mean of an array\n * of stored values, a two-pass, corrected algorithm is used, starting with\n * the definitional formula computed using the array of stored values and then\n * correcting this by adding the mean deviation of the data values from the\n * arithmetic mean. See, e.g. \"Comparison of Several Algorithms for Computing\n * Sample Means and Variances,\" Robert F. Ling, Journal of the American\n * Statistical Association, Vol. 69, No. 348 (Dec., 1974), pp. 859-866. \u003c/p\u003e\n * \u003cp\u003e\n *  Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e if the dataset is empty.\n * \u003c/p\u003e\n * \u003cstrong\u003eNote that this implementation is not synchronized.\u003c/strong\u003e If\n * multiple threads access an instance of this class concurrently, and at least\n * one of the threads invokes the \u003ccode\u003eincrement()\u003c/code\u003e or\n * \u003ccode\u003eclear()\u003c/code\u003e method, it must be synchronized externally.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "moment"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " First moment on which this statistic is based. "
    },
    {
      "type": "field",
      "varNames": [
        "incMoment"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": "\n     * Determines whether or not this statistic can be incremented or cleared.\n     * \u003cp\u003e\n     * Statistics based on (constructed from) external moments cannot\n     * be incremented or cleared.\u003c/p\u003e\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Mean.Mean()",
      "begin_line": 77,
      "end_line": 80,
      "comment": " Constructs a Mean. ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 25)",
        "(line 79,col 9)-(line 79,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Mean.Mean(org.apache.commons.math.stat.descriptive.moment.FirstMoment)",
      "begin_line": 87,
      "end_line": 90,
      "comment": "\n     * Constructs a Mean with an External Moment.\n     *\n     * @param m1 the moment\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 25)",
        "(line 89,col 9)-(line 89,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Mean.Mean(org.apache.commons.math.stat.descriptive.moment.Mean)",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * Copy constructor, creates a new {@code Mean} identical\n     * to the {@code original}\n     *\n     * @param original the {@code Mean} instance to copy\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Mean.increment(double)",
      "begin_line": 105,
      "end_line": 110,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 109,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Mean.clear()",
      "begin_line": 115,
      "end_line": 120,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 119,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Mean.getResult()",
      "begin_line": 125,
      "end_line": 128,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Mean.getN()",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Mean.evaluate(double[], int, int)",
      "begin_line": 153,
      "end_line": 170,
      "comment": "\n     * Returns the arithmetic mean of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link Mean} for details on the computing algorithm.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the mean of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     *  parameters are not valid\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 168,col 9)",
        "(line 169,col 9)-(line 169,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Mean.evaluate(double[], double[], int, int)",
      "begin_line": 201,
      "end_line": 218,
      "comment": "\n     * Returns the weighted arithmetic mean of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if either array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link Mean} for details on the computing algorithm. The two-pass algorithm\n     * described above is used here, with weights applied in computing both the original\n     * estimate and the correction factor.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if any of the following are true:\n     * \u003cul\u003e\u003cli\u003ethe values array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array does not have the same length as the values array\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more infinite values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more NaN values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains negative values\u003c/li\u003e\n     *     \u003cli\u003ethe start and length arguments do not determine a valid array\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param weights the weights array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the mean of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the parameters are not valid\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 216,col 9)",
        "(line 217,col 9)-(line 217,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Mean.evaluate(double[], double[])",
      "begin_line": 244,
      "end_line": 246,
      "comment": "\n     * Returns the weighted arithmetic mean of the entries in the input array.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if either array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link Mean} for details on the computing algorithm. The two-pass algorithm\n     * described above is used here, with weights applied in computing both the original\n     * estimate and the correction factor.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if any of the following are true:\n     * \u003cul\u003e\u003cli\u003ethe values array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array does not have the same length as the values array\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more infinite values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more NaN values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains negative values\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param weights the weights array\n     * @return the mean of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the parameters are not valid\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Mean.copy()",
      "begin_line": 251,
      "end_line": 256,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 33)",
        "(line 254,col 9)-(line 254,col 27)",
        "(line 255,col 9)-(line 255,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Mean.copy(org.apache.commons.math.stat.descriptive.moment.Mean, org.apache.commons.math.stat.descriptive.moment.Mean)",
      "begin_line": 267,
      "end_line": 270,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     *\n     * @param source Mean to copy\n     * @param dest Mean to copy to\n     * @throws NullPointerException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 42)",
        "(line 269,col 9)-(line 269,col 43)"
      ]
    }
  ]
}