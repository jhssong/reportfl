{
  "filepath": "/tmp/Math-56b/src/main/java/org/apache/commons/math/stat/descriptive/moment/Skewness.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Skewness",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic",
        "java.io.Serializable"
      ],
      "begin_line": 41,
      "end_line": 213,
      "comment": "\n * Computes the skewness of the available values.\n * \u003cp\u003e\n * We use the following (unbiased) formula to define skewness:\u003c/p\u003e\n * \u003cp\u003e\n * skewness \u003d [n / (n -1) (n - 2)] sum[(x_i - mean)^3] / std^3 \u003c/p\u003e\n * \u003cp\u003e\n * where n is the number of values, mean is the {@link Mean} and std is the\n * {@link StandardDeviation} \u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eNote that this implementation is not synchronized.\u003c/strong\u003e If\n * multiple threads access an instance of this class concurrently, and at least\n * one of the threads invokes the \u003ccode\u003eincrement()\u003c/code\u003e or\n * \u003ccode\u003eclear()\u003c/code\u003e method, it must be synchronized externally. \u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "moment"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Third moment on which this statistic is based "
    },
    {
      "type": "field",
      "varNames": [
        "incMoment"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": "\n     * Determines whether or not this statistic can be incremented or cleared.\n     * \u003cp\u003e\n     * Statistics based on (constructed from) external moments cannot\n     * be incremented or cleared.\u003c/p\u003e\n    "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Skewness.Skewness()",
      "begin_line": 60,
      "end_line": 63,
      "comment": "\n     * Constructs a Skewness\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 25)",
        "(line 62,col 9)-(line 62,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Skewness.Skewness(org.apache.commons.math.stat.descriptive.moment.ThirdMoment)",
      "begin_line": 69,
      "end_line": 72,
      "comment": "\n     * Constructs a Skewness with an external moment\n     * @param m3 external moment\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 26)",
        "(line 71,col 9)-(line 71,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Skewness.Skewness(org.apache.commons.math.stat.descriptive.moment.Skewness)",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * Copy constructor, creates a new {@code Skewness} identical\n     * to the {@code original}\n     *\n     * @param original the {@code Skewness} instance to copy\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Skewness.increment(double)",
      "begin_line": 87,
      "end_line": 92,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 91,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Skewness.getResult()",
      "begin_line": 101,
      "end_line": 115,
      "comment": "\n     * Returns the value of the statistic based on the values that have been added.\n     * \u003cp\u003e\n     * See {@link Skewness} for the definition used in the computation.\u003c/p\u003e\n     *\n     * @return the skewness of the available values.\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 107,col 53)",
        "(line 108,col 9)-(line 114,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Skewness.getN()",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Skewness.clear()",
      "begin_line": 127,
      "end_line": 132,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 131,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Skewness.evaluate(double[], int, int)",
      "begin_line": 150,
      "end_line": 188,
      "comment": "\n     * Returns the Skewness of the entries in the specifed portion of the\n     * input array.\n     * \u003cp\u003e\n     * See {@link Skewness} for the definition used in the computation.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin the index of the first array element to include\n     * @param length the number of elements to include\n     * @return the skewness of the values or Double.NaN if length is less than\n     * 3\n     * @throws IllegalArgumentException if the array is null or the array index\n     *  parameters are not valid\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 33)",
        "(line 157,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 187,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Skewness.copy()",
      "begin_line": 193,
      "end_line": 198,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 41)",
        "(line 196,col 9)-(line 196,col 27)",
        "(line 197,col 9)-(line 197,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.Skewness.copy(org.apache.commons.math.stat.descriptive.moment.Skewness, org.apache.commons.math.stat.descriptive.moment.Skewness)",
      "begin_line": 208,
      "end_line": 212,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     *\n     * @param source Skewness to copy\n     * @param dest Skewness to copy to\n     * @throws NullPointerException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 42)",
        "(line 210,col 9)-(line 210,col 60)",
        "(line 211,col 9)-(line 211,col 42)"
      ]
    }
  ]
}