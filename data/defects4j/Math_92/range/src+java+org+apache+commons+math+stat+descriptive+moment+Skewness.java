{
  "filepath": "/tmp/Math-92b/src/java/org/apache/commons/math/stat/descriptive/moment/Skewness.java",
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
      "end_line": 205,
      "comment": "\n * Computes the skewness of the available values.\n * \u003cp\u003e\n * We use the following (unbiased) formula to define skewness:\u003c/p\u003e\n * \u003cp\u003e\n * skewness \u003d [n / (n -1) (n - 2)] sum[(x_i - mean)^3] / std^3 \u003c/p\u003e\n * \u003cp\u003e\n * where n is the number of values, mean is the {@link Mean} and std is the \n * {@link StandardDeviation} \u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eNote that this implementation is not synchronized.\u003c/strong\u003e If \n * multiple threads access an instance of this class concurrently, and at least\n * one of the threads invokes the \u003ccode\u003eincrement()\u003c/code\u003e or \n * \u003ccode\u003eclear()\u003c/code\u003e method, it must be synchronized externally. \u003c/p\u003e\n * \n * @version $Revision$ $Date$\n "
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
      "comment": " \n     * Determines whether or not this statistic can be incremented or cleared.\n     * \u003cp\u003e\n     * Statistics based on (constructed from) external moments cannot\n     * be incremented or cleared.\u003c/p\u003e\n    "
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
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Skewness.Skewness(org.apache.commons.math.stat.descriptive.moment.Skewness)",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * Copy constructor, creates a new {@code Skewness} identical\n     * to the {@code original}\n     * \n     * @param original the {@code Skewness} instance to copy\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Skewness.increment(double)",
      "begin_line": 86,
      "end_line": 90,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 89,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Skewness.getResult()",
      "begin_line": 99,
      "end_line": 112,
      "comment": "\n     * Returns the value of the statistic based on the values that have been added.\n     * \u003cp\u003e\n     * See {@link Skewness} for the definition used in the computation.\u003c/p\u003e\n     * \n     * @return the skewness of the available values.\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 104,col 62)",
        "(line 105,col 9)-(line 111,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Skewness.getN()",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Skewness.clear()",
      "begin_line": 124,
      "end_line": 128,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 127,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Skewness.evaluate(double[], int, int)",
      "begin_line": 146,
      "end_line": 182,
      "comment": "\n     * Returns the Skewness of the entries in the specifed portion of the\n     * input array.\n     * \u003cp\u003e\n     * See {@link Skewness} for the definition used in the computation.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \n     * @param values the input array\n     * @param begin the index of the first array element to include\n     * @param length the number of elements to include\n     * @return the skewness of the values or Double.NaN if length is less than\n     * 3\n     * @throws IllegalArgumentException if the array is null or the array index\n     *  parameters are not valid\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 33)",
        "(line 152,col 9)-(line 180,col 9)",
        "(line 181,col 9)-(line 181,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Skewness.copy()",
      "begin_line": 187,
      "end_line": 191,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 41)",
        "(line 189,col 9)-(line 189,col 27)",
        "(line 190,col 9)-(line 190,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Skewness.copy(org.apache.commons.math.stat.descriptive.moment.Skewness, org.apache.commons.math.stat.descriptive.moment.Skewness)",
      "begin_line": 201,
      "end_line": 204,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     * \n     * @param source Skewness to copy\n     * @param dest Skewness to copy to\n     * @throws NullPointerException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 74)",
        "(line 203,col 9)-(line 203,col 42)"
      ]
    }
  ]
}