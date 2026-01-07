{
  "filepath": "/tmp/Math-103b/src/java/org/apache/commons/math/stat/descriptive/moment/Skewness.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Skewness",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic",
        "java.io.Serializable"
      ],
      "begin_line": 40,
      "end_line": 173,
      "comment": "\n * Computes the skewness of the available values.\n * \u003cp\u003e\n * We use the following (unbiased) formula to define skewness:\n * \u003cp\u003e\n * skewness \u003d [n / (n -1) (n - 2)] sum[(x_i - mean)^3] / std^3\n * \u003cp\u003e\n * where n is the number of values, mean is the {@link Mean} and std is the \n * {@link StandardDeviation}\n * \u003cp\u003e\n * \u003cstrong\u003eNote that this implementation is not synchronized.\u003c/strong\u003e If \n * multiple threads access an instance of this class concurrently, and at least\n * one of the threads invokes the \u003ccode\u003eincrement()\u003c/code\u003e or \n * \u003ccode\u003eclear()\u003c/code\u003e method, it must be synchronized externally.\n * \n * @version $Revision$ $Date$\n "
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
      "comment": " Third moment on which this statistic is based "
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
      "signature": "org.apache.commons.math.stat.descriptive.moment.Skewness.Skewness()",
      "begin_line": 59,
      "end_line": 62,
      "comment": "\n     * Constructs a Skewness\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 25)",
        "(line 61,col 9)-(line 61,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Skewness.Skewness(org.apache.commons.math.stat.descriptive.moment.ThirdMoment)",
      "begin_line": 68,
      "end_line": 71,
      "comment": "\n     * Constructs a Skewness with an external moment\n     * @param m3 external moment\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 26)",
        "(line 70,col 9)-(line 70,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Skewness.increment(double)",
      "begin_line": 76,
      "end_line": 80,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic#increment(double)\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 79,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Skewness.getResult()",
      "begin_line": 89,
      "end_line": 102,
      "comment": "\n     * Returns the value of the statistic based on the values that have been added.\n     * \u003cp\u003e\n     * See {@link Skewness} for the definition used in the computation.\n     * \n     * @return the skewness of the available values.\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 93,col 9)",
        "(line 94,col 9)-(line 94,col 62)",
        "(line 95,col 9)-(line 101,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Skewness.getN()",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic#getN()\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Skewness.clear()",
      "begin_line": 114,
      "end_line": 118,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic#clear()\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 117,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Skewness.evaluate(double[], int, int)",
      "begin_line": 136,
      "end_line": 172,
      "comment": "\n     * Returns the Skewness of the entries in the specifed portion of the\n     * input array.\n     * \u003cp\u003e\n     * See {@link Skewness} for the definition used in the computation.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\n     * \n     * @param values the input array\n     * @param begin the index of the first array element to include\n     * @param length the number of elements to include\n     * @return the skewness of the values or Double.NaN if length is less than\n     * 3\n     * @throws IllegalArgumentException if the array is null or the array index\n     *  parameters are not valid\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 33)",
        "(line 142,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 171,col 20)"
      ]
    }
  ]
}