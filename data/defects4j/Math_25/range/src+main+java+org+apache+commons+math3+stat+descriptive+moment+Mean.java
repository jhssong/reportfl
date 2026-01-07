{
  "filepath": "/tmp/Math-25b/src/main/java/org/apache/commons/math3/stat/descriptive/moment/Mean.java",
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
      "begin_line": 61,
      "end_line": 277,
      "comment": "\n * \u003cp\u003eComputes the arithmetic mean of a set of values. Uses the definitional\n * formula:\u003c/p\u003e\n * \u003cp\u003e\n * mean \u003d sum(x_i) / n\n * \u003c/p\u003e\n * \u003cp\u003ewhere \u003ccode\u003en\u003c/code\u003e is the number of observations.\n * \u003c/p\u003e\n * \u003cp\u003eWhen {@link #increment(double)} is used to add data incrementally from a\n * stream of (unstored) values, the value of the statistic that\n * {@link #getResult()} returns is computed using the following recursive\n * updating algorithm: \u003c/p\u003e\n * \u003col\u003e\n * \u003cli\u003eInitialize \u003ccode\u003em \u003d \u003c/code\u003e the first value\u003c/li\u003e\n * \u003cli\u003eFor each additional value, update using \u003cbr\u003e\n *   \u003ccode\u003em \u003d m + (new value - m) / (number of observations)\u003c/code\u003e\u003c/li\u003e\n * \u003c/ol\u003e\n * \u003cp\u003e If {@link #evaluate(double[])} is used to compute the mean of an array\n * of stored values, a two-pass, corrected algorithm is used, starting with\n * the definitional formula computed using the array of stored values and then\n * correcting this by adding the mean deviation of the data values from the\n * arithmetic mean. See, e.g. \"Comparison of Several Algorithms for Computing\n * Sample Means and Variances,\" Robert F. Ling, Journal of the American\n * Statistical Association, Vol. 69, No. 348 (Dec., 1974), pp. 859-866. \u003c/p\u003e\n * \u003cp\u003e\n *  Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e if the dataset is empty.\n * \u003c/p\u003e\n * \u003cstrong\u003eNote that this implementation is not synchronized.\u003c/strong\u003e If\n * multiple threads access an instance of this class concurrently, and at least\n * one of the threads invokes the \u003ccode\u003eincrement()\u003c/code\u003e or\n * \u003ccode\u003eclear()\u003c/code\u003e method, it must be synchronized externally.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "moment"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " First moment on which this statistic is based. "
    },
    {
      "type": "field",
      "varNames": [
        "incMoment"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": "\n     * Determines whether or not this statistic can be incremented or cleared.\n     * \u003cp\u003e\n     * Statistics based on (constructed from) external moments cannot\n     * be incremented or cleared.\u003c/p\u003e\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Mean.Mean()",
      "begin_line": 79,
      "end_line": 82,
      "comment": " Constructs a Mean. ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 25)",
        "(line 81,col 9)-(line 81,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Mean.Mean(org.apache.commons.math3.stat.descriptive.moment.FirstMoment)",
      "begin_line": 89,
      "end_line": 92,
      "comment": "\n     * Constructs a Mean with an External Moment.\n     *\n     * @param m1 the moment\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 25)",
        "(line 91,col 9)-(line 91,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Mean.Mean(org.apache.commons.math3.stat.descriptive.moment.Mean)",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * Copy constructor, creates a new {@code Mean} identical\n     * to the {@code original}\n     *\n     * @param original the {@code Mean} instance to copy\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Mean.increment(double)",
      "begin_line": 107,
      "end_line": 112,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 111,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Mean.clear()",
      "begin_line": 117,
      "end_line": 122,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 121,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Mean.getResult()",
      "begin_line": 127,
      "end_line": 130,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Mean.getN()",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Mean.evaluate(double[], int, int)",
      "begin_line": 155,
      "end_line": 172,
      "comment": "\n     * Returns the arithmetic mean of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link Mean} for details on the computing algorithm.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the mean of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     *  parameters are not valid\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 171,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Mean.evaluate(double[], double[], int, int)",
      "begin_line": 203,
      "end_line": 220,
      "comment": "\n     * Returns the weighted arithmetic mean of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if either array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link Mean} for details on the computing algorithm. The two-pass algorithm\n     * described above is used here, with weights applied in computing both the original\n     * estimate and the correction factor.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if any of the following are true:\n     * \u003cul\u003e\u003cli\u003ethe values array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array does not have the same length as the values array\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more infinite values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more NaN values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains negative values\u003c/li\u003e\n     *     \u003cli\u003ethe start and length arguments do not determine a valid array\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param weights the weights array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the mean of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the parameters are not valid\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 218,col 9)",
        "(line 219,col 9)-(line 219,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Mean.evaluate(double[], double[])",
      "begin_line": 246,
      "end_line": 248,
      "comment": "\n     * Returns the weighted arithmetic mean of the entries in the input array.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if either array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link Mean} for details on the computing algorithm. The two-pass algorithm\n     * described above is used here, with weights applied in computing both the original\n     * estimate and the correction factor.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if any of the following are true:\n     * \u003cul\u003e\u003cli\u003ethe values array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array does not have the same length as the values array\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more infinite values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more NaN values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains negative values\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param weights the weights array\n     * @return the mean of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the parameters are not valid\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Mean.copy()",
      "begin_line": 253,
      "end_line": 258,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 33)",
        "(line 256,col 9)-(line 256,col 27)",
        "(line 257,col 9)-(line 257,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Mean.copy(org.apache.commons.math3.stat.descriptive.moment.Mean, org.apache.commons.math3.stat.descriptive.moment.Mean)",
      "begin_line": 269,
      "end_line": 276,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     *\n     * @param source Mean to copy\n     * @param dest Mean to copy to\n     * @throws NullArgumentException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 39)",
        "(line 272,col 9)-(line 272,col 37)",
        "(line 273,col 9)-(line 273,col 42)",
        "(line 274,col 9)-(line 274,col 42)",
        "(line 275,col 9)-(line 275,col 43)"
      ]
    }
  ]
}