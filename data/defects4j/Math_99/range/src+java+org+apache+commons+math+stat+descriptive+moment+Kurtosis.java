{
  "filepath": "/tmp/Math-99b/src/java/org/apache/commons/math/stat/descriptive/moment/Kurtosis.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Kurtosis",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic"
      ],
      "begin_line": 43,
      "end_line": 214,
      "comment": "\n * Computes the Kurtosis of the available values.\n * \u003cp\u003e\n * We use the following (unbiased) formula to define kurtosis:\u003c/p\u003e\n *  \u003cp\u003e\n *  kurtosis \u003d { [n(n+1) / (n -1)(n - 2)(n-3)] sum[(x_i - mean)^4] / std^4 } - [3(n-1)^2 / (n-2)(n-3)]\n *  \u003c/p\u003e\u003cp\u003e\n *  where n is the number of values, mean is the {@link Mean} and std is the\n * {@link StandardDeviation}\u003c/p\u003e\n * \u003cp\u003e\n *  Note that this statistic is undefined for n \u003c 4.  \u003ccode\u003eDouble.Nan\u003c/code\u003e\n *  is returned when there is not sufficient data to compute the statistic.\u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eNote that this implementation is not synchronized.\u003c/strong\u003e If \n * multiple threads access an instance of this class concurrently, and at least\n * one of the threads invokes the \u003ccode\u003eincrement()\u003c/code\u003e or \n * \u003ccode\u003eclear()\u003c/code\u003e method, it must be synchronized externally.\u003c/p\u003e\n * \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "moment"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": "Fourth Moment on which this statistic is based "
    },
    {
      "type": "field",
      "varNames": [
        "incMoment"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " \n     * Determines whether or not this statistic can be incremented or cleared.\n     * \u003cp\u003e\n     * Statistics based on (constructed from) external moments cannot\n     * be incremented or cleared.\u003c/p\u003e\n    "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Kurtosis.Kurtosis()",
      "begin_line": 62,
      "end_line": 65,
      "comment": "\n     * Construct a Kurtosis\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 25)",
        "(line 64,col 9)-(line 64,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Kurtosis.Kurtosis(org.apache.commons.math.stat.descriptive.moment.FourthMoment)",
      "begin_line": 72,
      "end_line": 75,
      "comment": "\n     * Construct a Kurtosis from an external moment\n     * \n     * @param m4 external Moment\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 26)",
        "(line 74,col 9)-(line 74,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Kurtosis.Kurtosis(org.apache.commons.math.stat.descriptive.moment.Kurtosis)",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * Copy constructor, creates a new {@code Kurtosis} identical\n     * to the {@code original}\n     * \n     * @param original the {@code Kurtosis} instance to copy\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Kurtosis.increment(double)",
      "begin_line": 90,
      "end_line": 98,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 97,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Kurtosis.getResult()",
      "begin_line": 103,
      "end_line": 118,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 37)",
        "(line 105,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 117,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Kurtosis.clear()",
      "begin_line": 123,
      "end_line": 131,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 130,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Kurtosis.getN()",
      "begin_line": 136,
      "end_line": 138,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Kurtosis.evaluate(double[], int, int)",
      "begin_line": 158,
      "end_line": 190,
      "comment": "\n     * Returns the kurtosis of the entries in the specified portion of the\n     * input array.  \n     * \u003cp\u003e\n     * See {@link Kurtosis} for details on the computing algorithm.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the kurtosis of the values or Double.NaN if length is less than\n     * 4\n     * @throws IllegalArgumentException if the input array is null or the array\n     * index parameters are not valid\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 33)",
        "(line 162,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 189,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Kurtosis.copy()",
      "begin_line": 195,
      "end_line": 199,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 41)",
        "(line 197,col 9)-(line 197,col 27)",
        "(line 198,col 9)-(line 198,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Kurtosis.copy(org.apache.commons.math.stat.descriptive.moment.Kurtosis, org.apache.commons.math.stat.descriptive.moment.Kurtosis)",
      "begin_line": 209,
      "end_line": 212,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     * \n     * @param source Kurtosis to copy\n     * @param dest Kurtosis to copy to\n     * @throws NullPointerException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 58)",
        "(line 211,col 9)-(line 211,col 42)"
      ]
    }
  ]
}