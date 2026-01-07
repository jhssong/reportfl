{
  "filepath": "/tmp/Math-33b/src/main/java/org/apache/commons/math3/stat/descriptive/moment/Skewness.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Skewness",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.stat.descriptive.AbstractStorelessUnivariateStatistic",
        "java.io.Serializable"
      ],
      "begin_line": 43,
      "end_line": 218,
      "comment": "\n * Computes the skewness of the available values.\n * \u003cp\u003e\n * We use the following (unbiased) formula to define skewness:\u003c/p\u003e\n * \u003cp\u003e\n * skewness \u003d [n / (n -1) (n - 2)] sum[(x_i - mean)^3] / std^3 \u003c/p\u003e\n * \u003cp\u003e\n * where n is the number of values, mean is the {@link Mean} and std is the\n * {@link StandardDeviation} \u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eNote that this implementation is not synchronized.\u003c/strong\u003e If\n * multiple threads access an instance of this class concurrently, and at least\n * one of the threads invokes the \u003ccode\u003eincrement()\u003c/code\u003e or\n * \u003ccode\u003eclear()\u003c/code\u003e method, it must be synchronized externally. \u003c/p\u003e\n *\n * @version $Id$\n "
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
      "comment": " Third moment on which this statistic is based "
    },
    {
      "type": "field",
      "varNames": [
        "incMoment"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n     * Determines whether or not this statistic can be incremented or cleared.\n     * \u003cp\u003e\n     * Statistics based on (constructed from) external moments cannot\n     * be incremented or cleared.\u003c/p\u003e\n    "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Skewness.Skewness()",
      "begin_line": 62,
      "end_line": 65,
      "comment": "\n     * Constructs a Skewness\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 25)",
        "(line 64,col 9)-(line 64,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Skewness.Skewness(org.apache.commons.math3.stat.descriptive.moment.ThirdMoment)",
      "begin_line": 71,
      "end_line": 74,
      "comment": "\n     * Constructs a Skewness with an external moment\n     * @param m3 external moment\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 26)",
        "(line 73,col 9)-(line 73,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Skewness.Skewness(org.apache.commons.math3.stat.descriptive.moment.Skewness)",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\n     * Copy constructor, creates a new {@code Skewness} identical\n     * to the {@code original}\n     *\n     * @param original the {@code Skewness} instance to copy\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Skewness.increment(double)",
      "begin_line": 89,
      "end_line": 94,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 93,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Skewness.getResult()",
      "begin_line": 103,
      "end_line": 117,
      "comment": "\n     * Returns the value of the statistic based on the values that have been added.\n     * \u003cp\u003e\n     * See {@link Skewness} for the definition used in the computation.\u003c/p\u003e\n     *\n     * @return the skewness of the available values.\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 108,col 9)",
        "(line 109,col 9)-(line 109,col 53)",
        "(line 110,col 9)-(line 116,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Skewness.getN()",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Skewness.clear()",
      "begin_line": 129,
      "end_line": 134,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 133,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Skewness.evaluate(double[], int, int)",
      "begin_line": 152,
      "end_line": 190,
      "comment": "\n     * Returns the Skewness of the entries in the specifed portion of the\n     * input array.\n     * \u003cp\u003e\n     * See {@link Skewness} for the definition used in the computation.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin the index of the first array element to include\n     * @param length the number of elements to include\n     * @return the skewness of the values or Double.NaN if length is less than\n     * 3\n     * @throws IllegalArgumentException if the array is null or the array index\n     *  parameters are not valid\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 33)",
        "(line 159,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 189,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Skewness.copy()",
      "begin_line": 195,
      "end_line": 200,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 41)",
        "(line 198,col 9)-(line 198,col 27)",
        "(line 199,col 9)-(line 199,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Skewness.copy(org.apache.commons.math3.stat.descriptive.moment.Skewness, org.apache.commons.math3.stat.descriptive.moment.Skewness)",
      "begin_line": 210,
      "end_line": 217,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     *\n     * @param source Skewness to copy\n     * @param dest Skewness to copy to\n     * @throws NullArgumentException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 39)",
        "(line 213,col 9)-(line 213,col 37)",
        "(line 214,col 9)-(line 214,col 42)",
        "(line 215,col 9)-(line 215,col 60)",
        "(line 216,col 9)-(line 216,col 42)"
      ]
    }
  ]
}