{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/stat/descriptive/moment/Kurtosis.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Kurtosis",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.stat.descriptive.AbstractStorelessUnivariateStatistic",
        "java.io.Serializable"
      ],
      "begin_line": 48,
      "end_line": 225,
      "comment": "\n * Computes the Kurtosis of the available values.\n * \u003cp\u003e\n * We use the following (unbiased) formula to define kurtosis:\u003c/p\u003e\n *  \u003cp\u003e\n *  kurtosis \u003d { [n(n+1) / (n -1)(n - 2)(n-3)] sum[(x_i - mean)^4] / std^4 } - [3(n-1)^2 / (n-2)(n-3)]\n *  \u003c/p\u003e\u003cp\u003e\n *  where n is the number of values, mean is the {@link Mean} and std is the\n * {@link StandardDeviation}\u003c/p\u003e\n * \u003cp\u003e\n *  Note that this statistic is undefined for n \u003c 4.  \u003ccode\u003eDouble.Nan\u003c/code\u003e\n *  is returned when there is not sufficient data to compute the statistic.\u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eNote that this implementation is not synchronized.\u003c/strong\u003e If\n * multiple threads access an instance of this class concurrently, and at least\n * one of the threads invokes the \u003ccode\u003eincrement()\u003c/code\u003e or\n * \u003ccode\u003eclear()\u003c/code\u003e method, it must be synchronized externally.\u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "moment"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": "Fourth Moment on which this statistic is based "
    },
    {
      "type": "field",
      "varNames": [
        "incMoment"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": "\n     * Determines whether or not this statistic can be incremented or cleared.\n     * \u003cp\u003e\n     * Statistics based on (constructed from) external moments cannot\n     * be incremented or cleared.\u003c/p\u003e\n    "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Kurtosis.Kurtosis()",
      "begin_line": 67,
      "end_line": 70,
      "comment": "\n     * Construct a Kurtosis\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 25)",
        "(line 69,col 9)-(line 69,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Kurtosis.Kurtosis(org.apache.commons.math3.stat.descriptive.moment.FourthMoment)",
      "begin_line": 77,
      "end_line": 80,
      "comment": "\n     * Construct a Kurtosis from an external moment\n     *\n     * @param m4 external Moment\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 26)",
        "(line 79,col 9)-(line 79,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Kurtosis.Kurtosis(org.apache.commons.math3.stat.descriptive.moment.Kurtosis)",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * Copy constructor, creates a new {@code Kurtosis} identical\n     * to the {@code original}\n     *\n     * @param original the {@code Kurtosis} instance to copy\n     * @throws NullArgumentException if original is null\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Kurtosis.increment(double)",
      "begin_line": 99,
      "end_line": 104,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003eNote that when {@link #Kurtosis(FourthMoment)} is used to\n     * create a Variance, this method does nothing. In that case, the\n     * FourthMoment should be incremented directly.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 103,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Kurtosis.getResult()",
      "begin_line": 109,
      "end_line": 125,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 37)",
        "(line 112,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 124,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Kurtosis.clear()",
      "begin_line": 130,
      "end_line": 135,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 134,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Kurtosis.getN()",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Kurtosis.evaluate(double[], int, int)",
      "begin_line": 161,
      "end_line": 195,
      "comment": "\n     * Returns the kurtosis of the entries in the specified portion of the\n     * input array.\n     * \u003cp\u003e\n     * See {@link Kurtosis} for details on the computing algorithm.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the kurtosis of the values or Double.NaN if length is less than 4\n     * @throws MathIllegalArgumentException if the input array is null or the array\n     * index parameters are not valid\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 33)",
        "(line 167,col 9)-(line 193,col 9)",
        "(line 194,col 9)-(line 194,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Kurtosis.copy()",
      "begin_line": 200,
      "end_line": 206,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 41)",
        "(line 204,col 9)-(line 204,col 27)",
        "(line 205,col 9)-(line 205,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Kurtosis.copy(org.apache.commons.math3.stat.descriptive.moment.Kurtosis, org.apache.commons.math3.stat.descriptive.moment.Kurtosis)",
      "begin_line": 216,
      "end_line": 223,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     *\n     * @param source Kurtosis to copy\n     * @param dest Kurtosis to copy to\n     * @throws NullArgumentException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 39)",
        "(line 219,col 9)-(line 219,col 37)",
        "(line 220,col 9)-(line 220,col 42)",
        "(line 221,col 9)-(line 221,col 43)",
        "(line 222,col 9)-(line 222,col 42)"
      ]
    }
  ]
}