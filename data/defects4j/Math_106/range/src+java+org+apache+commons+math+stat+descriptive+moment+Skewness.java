{
  "filepath": "/tmp/Math-106b/src/java/org/apache/commons/math/stat/descriptive/moment/Skewness.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Skewness",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic",
        "java.io.Serializable"
      ],
      "begin_line": 39,
      "end_line": 172,
      "comment": "\n * Computes the skewness of the available values.\n * \u003cp\u003e\n * We use the following (unbiased) formula to define skewness:\n * \u003cp\u003e\n * skewness \u003d [n / (n -1) (n - 2)] sum[(x_i - mean)^3] / std^3\n * \u003cp\u003e\n * where n is the number of values, mean is the {@link Mean} and std is the \n * {@link StandardDeviation}\n * \u003cp\u003e\n * \u003cstrong\u003eNote that this implementation is not synchronized.\u003c/strong\u003e If \n * multiple threads access an instance of this class concurrently, and at least\n * one of the threads invokes the \u003ccode\u003eincrement()\u003c/code\u003e or \n * \u003ccode\u003eclear()\u003c/code\u003e method, it must be synchronized externally.\n * \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "moment"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Third moment on which this statistic is based "
    },
    {
      "type": "field",
      "varNames": [
        "incMoment"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " \n     * Determines whether or not this statistic can be incremented or cleared.\n     * \u003cp\u003e\n     * Statistics based on (constructed from) external moments cannot\n     * be incremented or cleared.\n    "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Skewness.Skewness()",
      "begin_line": 58,
      "end_line": 61,
      "comment": "\n     * Constructs a Skewness\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 25)",
        "(line 60,col 9)-(line 60,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Skewness.Skewness(org.apache.commons.math.stat.descriptive.moment.ThirdMoment)",
      "begin_line": 67,
      "end_line": 70,
      "comment": "\n     * Constructs a Skewness with an external moment\n     * @param m3 external moment\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 26)",
        "(line 69,col 9)-(line 69,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Skewness.increment(double)",
      "begin_line": 75,
      "end_line": 79,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic#increment(double)\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 78,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Skewness.getResult()",
      "begin_line": 88,
      "end_line": 101,
      "comment": "\n     * Returns the value of the statistic based on the values that have been added.\n     * \u003cp\u003e\n     * See {@link Skewness} for the definition used in the computation.\n     * \n     * @return the skewness of the available values.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 92,col 9)",
        "(line 93,col 9)-(line 93,col 62)",
        "(line 94,col 9)-(line 100,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Skewness.getN()",
      "begin_line": 106,
      "end_line": 108,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic#getN()\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Skewness.clear()",
      "begin_line": 113,
      "end_line": 117,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic#clear()\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 116,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Skewness.evaluate(double[], int, int)",
      "begin_line": 135,
      "end_line": 171,
      "comment": "\n     * Returns the Skewness of the entries in the specifed portion of the\n     * input array.\n     * \u003cp\u003e\n     * See {@link Skewness} for the definition used in the computation.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\n     * \n     * @param values the input array\n     * @param begin the index of the first array element to include\n     * @param length the number of elements to include\n     * @return the skewness of the values or Double.NaN if length is less than\n     * 3\n     * @throws IllegalArgumentException if the array is null or the array index\n     *  parameters are not valid\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 33)",
        "(line 141,col 9)-(line 169,col 9)",
        "(line 170,col 9)-(line 170,col 20)"
      ]
    }
  ]
}