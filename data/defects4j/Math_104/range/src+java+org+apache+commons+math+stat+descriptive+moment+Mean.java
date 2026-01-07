{
  "filepath": "/tmp/Math-104b/src/java/org/apache/commons/math/stat/descriptive/moment/Mean.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Mean",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic",
        "java.io.Serializable"
      ],
      "begin_line": 50,
      "end_line": 138,
      "comment": "\n * Returns the arithmetic mean of the available values. Uses the definitional \n * formula:\n * \u003cp\u003e\n * mean \u003d sum(x_i) / n\n * \u003cp\u003e\n * where \u003ccode\u003en\u003c/code\u003e is the number of observations.\n * \u003cp\u003e\n * The value of the statistic is computed using the following recursive\n * updating algorithm:\n * \u003cp\u003e\n * \u003col\u003e\n * \u003cli\u003eInitialize \u003ccode\u003em \u003d \u003c/code\u003e the first value\u003c/li\u003e\n * \u003cli\u003eFor each additional value, update using \u003cbr\u003e\n *   \u003ccode\u003em \u003d m + (new value - m) / (number of observations)\u003c/code\u003e\u003c/li\u003e\n * \u003c/ol\u003e\n * \u003cp\u003e\n *  Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e if the dataset is empty.\n * \u003cp\u003e\n * \u003cstrong\u003eNote that this implementation is not synchronized.\u003c/strong\u003e If \n * multiple threads access an instance of this class concurrently, and at least\n * one of the threads invokes the \u003ccode\u003eincrement()\u003c/code\u003e or \n * \u003ccode\u003eclear()\u003c/code\u003e method, it must be synchronized externally.\n * \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "moment"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " First moment on which this statistic is based. "
    },
    {
      "type": "field",
      "varNames": [
        "incMoment"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " \n     * Determines whether or not this statistic can be incremented or cleared.\n     * \u003cp\u003e\n     * Statistics based on (constructed from) external moments cannot\n     * be incremented or cleared.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Mean.Mean()",
      "begin_line": 68,
      "end_line": 71,
      "comment": " Constructs a Mean. ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 25)",
        "(line 70,col 9)-(line 70,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Mean.Mean(org.apache.commons.math.stat.descriptive.moment.FirstMoment)",
      "begin_line": 78,
      "end_line": 81,
      "comment": "\n     * Constructs a Mean with an External Moment.\n     * \n     * @param m1 the moment\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 25)",
        "(line 80,col 9)-(line 80,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Mean.increment(double)",
      "begin_line": 86,
      "end_line": 90,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic#increment(double)\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 89,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Mean.clear()",
      "begin_line": 95,
      "end_line": 99,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic#clear()\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 98,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Mean.getResult()",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic#getResult()\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Mean.getN()",
      "begin_line": 111,
      "end_line": 113,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic#getN()\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Mean.evaluate(double[], int, int)",
      "begin_line": 131,
      "end_line": 137,
      "comment": "\n     * Returns the arithmetic mean of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\n     * \u003cp\u003e\n     * See {@link Mean} for details on the computing algorithm.\n     * \n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the mean of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     *  parameters are not valid\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 136,col 26)"
      ]
    }
  ]
}