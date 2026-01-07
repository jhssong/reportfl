{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/stat/descriptive/moment/Mean.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Mean",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic",
        "java.io.Serializable"
      ],
      "begin_line": 58,
      "end_line": 241,
      "comment": "\n * \u003cp\u003eComputes the arithmetic mean of a set of values. Uses the definitional\n * formula:\u003c/p\u003e\n * \u003cp\u003e\n * mean \u003d sum(x_i) / n\n * \u003c/p\u003e\n * \u003cp\u003ewhere \u003ccode\u003en\u003c/code\u003e is the number of observations.\n * \u003c/p\u003e\n * \u003cp\u003eWhen {@link #increment(double)} is used to add data incrementally from a\n * stream of (unstored) values, the value of the statistic that\n * {@link #getResult()} returns is computed using the following recursive\n * updating algorithm: \u003c/p\u003e\n * \u003col\u003e\n * \u003cli\u003eInitialize \u003ccode\u003em \u003d \u003c/code\u003e the first value\u003c/li\u003e\n * \u003cli\u003eFor each additional value, update using \u003cbr\u003e\n *   \u003ccode\u003em \u003d m + (new value - m) / (number of observations)\u003c/code\u003e\u003c/li\u003e\n * \u003c/ol\u003e\n * \u003cp\u003e If {@link #evaluate(double[])} is used to compute the mean of an array\n * of stored values, a two-pass, corrected algorithm is used, starting with\n * the definitional formula computed using the array of stored values and then\n * correcting this by adding the mean deviation of the data values from the\n * arithmetic mean. See, e.g. \"Comparison of Several Algorithms for Computing\n * Sample Means and Variances,\" Robert F. Ling, Journal of the American\n * Statistical Association, Vol. 69, No. 348 (Dec., 1974), pp. 859-866. \u003c/p\u003e\n * \u003cp\u003e\n *  Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e if the dataset is empty.\n * \u003c/p\u003e\n * \u003cstrong\u003eNote that this implementation is not synchronized.\u003c/strong\u003e If\n * multiple threads access an instance of this class concurrently, and at least\n * one of the threads invokes the \u003ccode\u003eincrement()\u003c/code\u003e or\n * \u003ccode\u003eclear()\u003c/code\u003e method, it must be synchronized externally.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "moment"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " First moment on which this statistic is based. "
    },
    {
      "type": "field",
      "varNames": [
        "incMoment"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": "\n     * Determines whether or not this statistic can be incremented or cleared.\n     * \u003cp\u003e\n     * Statistics based on (constructed from) external moments cannot\n     * be incremented or cleared.\u003c/p\u003e\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Mean.Mean()",
      "begin_line": 76,
      "end_line": 79,
      "comment": " Constructs a Mean. ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 25)",
        "(line 78,col 9)-(line 78,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Mean.Mean(org.apache.commons.math.stat.descriptive.moment.FirstMoment)",
      "begin_line": 86,
      "end_line": 89,
      "comment": "\n     * Constructs a Mean with an External Moment.\n     *\n     * @param m1 the moment\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 25)",
        "(line 88,col 9)-(line 88,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Mean.Mean(org.apache.commons.math.stat.descriptive.moment.Mean)",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * Copy constructor, creates a new {@code Mean} identical\n     * to the {@code original}\n     *\n     * @param original the {@code Mean} instance to copy\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Mean.increment(double)",
      "begin_line": 104,
      "end_line": 109,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 108,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Mean.clear()",
      "begin_line": 114,
      "end_line": 119,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 118,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Mean.getResult()",
      "begin_line": 124,
      "end_line": 127,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Mean.getN()",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Mean.evaluate(double[], int, int)",
      "begin_line": 152,
      "end_line": 169,
      "comment": "\n     * Returns the arithmetic mean of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link Mean} for details on the computing algorithm.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the mean of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     *  parameters are not valid\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 168,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Mean.evaluate(double[], double[], int, int)",
      "begin_line": 199,
      "end_line": 216,
      "comment": "\n     * Returns the weighted arithmetic mean of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if either array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link Mean} for details on the computing algorithm. The two-pass algorithm\n     * described above is used here, with weights applied in computing both the original\n     * estimate and the correction factor.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if any of the following are true:\n     * \u003cul\u003e\u003cli\u003ethe values array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array does not have the same length as the values array\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more infinite values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more NaN values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains negative values\u003c/li\u003e\n     *     \u003cli\u003ethe start and length arguments do not determine a valid array\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param weights the weights array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the mean of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the parameters are not valid\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 214,col 9)",
        "(line 215,col 9)-(line 215,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Mean.copy()",
      "begin_line": 221,
      "end_line": 226,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 33)",
        "(line 224,col 9)-(line 224,col 27)",
        "(line 225,col 9)-(line 225,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Mean.copy(org.apache.commons.math.stat.descriptive.moment.Mean, org.apache.commons.math.stat.descriptive.moment.Mean)",
      "begin_line": 237,
      "end_line": 240,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     *\n     * @param source Mean to copy\n     * @param dest Mean to copy to\n     * @throws NullPointerException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 42)",
        "(line 239,col 9)-(line 239,col 43)"
      ]
    }
  ]
}