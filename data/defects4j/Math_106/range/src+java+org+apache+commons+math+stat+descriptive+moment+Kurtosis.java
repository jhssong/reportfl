{
  "filepath": "/tmp/Math-106b/src/java/org/apache/commons/math/stat/descriptive/moment/Kurtosis.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Kurtosis",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic"
      ],
      "begin_line": 40,
      "end_line": 177,
      "comment": "\n * Computes the Kurtosis of the available values.\n * \u003cp\u003e\n * We use the following (unbiased) formula to define kurtosis:\n *  \u003cp\u003e\n *  kurtosis \u003d { [n(n+1) / (n -1)(n - 2)(n-3)] sum[(x_i - mean)^4] / std^4 } - [3(n-1)^2 / (n-2)(n-3)]\n *  \u003cp\u003e\n *  where n is the number of values, mean is the {@link Mean} and std is the\n * {@link StandardDeviation}\n * \u003cp\u003e\n *  Note that this statistic is undefined for n \u003c 4.  \u003ccode\u003eDouble.Nan\u003c/code\u003e\n *  is returned when there is not sufficient data to compute the statistic.\n * \u003cp\u003e\n * \u003cstrong\u003eNote that this implementation is not synchronized.\u003c/strong\u003e If \n * multiple threads access an instance of this class concurrently, and at least\n * one of the threads invokes the \u003ccode\u003eincrement()\u003c/code\u003e or \n * \u003ccode\u003eclear()\u003c/code\u003e method, it must be synchronized externally.\n * \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "moment"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": "Fourth Moment on which this statistic is based "
    },
    {
      "type": "field",
      "varNames": [
        "incMoment"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " \n     * Determines whether or not this statistic can be incremented or cleared.\n     * \u003cp\u003e\n     * Statistics based on (constructed from) external moments cannot\n     * be incremented or cleared.\n    "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Kurtosis.Kurtosis()",
      "begin_line": 59,
      "end_line": 62,
      "comment": "\n     * Construct a Kurtosis\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 25)",
        "(line 61,col 9)-(line 61,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Kurtosis.Kurtosis(org.apache.commons.math.stat.descriptive.moment.FourthMoment)",
      "begin_line": 69,
      "end_line": 72,
      "comment": "\n     * Construct a Kurtosis from an external moment\n     * \n     * @param m4 external Moment\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 26)",
        "(line 71,col 9)-(line 71,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Kurtosis.increment(double)",
      "begin_line": 77,
      "end_line": 84,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic#increment(double)\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 83,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Kurtosis.getResult()",
      "begin_line": 89,
      "end_line": 104,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic#getResult()\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 37)",
        "(line 91,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 103,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Kurtosis.clear()",
      "begin_line": 109,
      "end_line": 116,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic#clear()\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 115,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Kurtosis.getN()",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic#getN()\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Kurtosis.evaluate(double[], int, int)",
      "begin_line": 143,
      "end_line": 175,
      "comment": "\n     * Returns the kurtosis of the entries in the specified portion of the\n     * input array.  \n     * \u003cp\u003e\n     * See {@link Kurtosis} for details on the computing algorithm.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\n     * \n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the kurtosis of the values or Double.NaN if length is less than\n     * 4\n     * @throws IllegalArgumentException if the input array is null or the array\n     * index parameters are not valid\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 33)",
        "(line 147,col 9)-(line 173,col 9)",
        "(line 174,col 9)-(line 174,col 20)"
      ]
    }
  ]
}