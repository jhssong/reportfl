{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/stat/descriptive/moment/Skewness.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Skewness",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.stat.descriptive.AbstractStorelessUnivariateStatistic",
        "java.io.Serializable"
      ],
      "begin_line": 44,
      "end_line": 224,
      "comment": "\n * Computes the skewness of the available values.\n * \u003cp\u003e\n * We use the following (unbiased) formula to define skewness:\u003c/p\u003e\n * \u003cp\u003e\n * skewness \u003d [n / (n -1) (n - 2)] sum[(x_i - mean)^3] / std^3 \u003c/p\u003e\n * \u003cp\u003e\n * where n is the number of values, mean is the {@link Mean} and std is the\n * {@link StandardDeviation} \u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eNote that this implementation is not synchronized.\u003c/strong\u003e If\n * multiple threads access an instance of this class concurrently, and at least\n * one of the threads invokes the \u003ccode\u003eincrement()\u003c/code\u003e or\n * \u003ccode\u003eclear()\u003c/code\u003e method, it must be synchronized externally. \u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "moment"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Third moment on which this statistic is based "
    },
    {
      "type": "field",
      "varNames": [
        "incMoment"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     * Determines whether or not this statistic can be incremented or cleared.\n     * \u003cp\u003e\n     * Statistics based on (constructed from) external moments cannot\n     * be incremented or cleared.\u003c/p\u003e\n    "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Skewness.Skewness()",
      "begin_line": 63,
      "end_line": 66,
      "comment": "\n     * Constructs a Skewness\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 25)",
        "(line 65,col 9)-(line 65,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Skewness.Skewness(org.apache.commons.math3.stat.descriptive.moment.ThirdMoment)",
      "begin_line": 72,
      "end_line": 75,
      "comment": "\n     * Constructs a Skewness with an external moment\n     * @param m3 external moment\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 26)",
        "(line 74,col 9)-(line 74,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Skewness.Skewness(org.apache.commons.math3.stat.descriptive.moment.Skewness)",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * Copy constructor, creates a new {@code Skewness} identical\n     * to the {@code original}\n     *\n     * @param original the {@code Skewness} instance to copy\n     * @throws NullArgumentException if original is null\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Skewness.increment(double)",
      "begin_line": 94,
      "end_line": 99,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003eNote that when {@link #Skewness(ThirdMoment)} is used to\n     * create a Skewness, this method does nothing. In that case, the\n     * ThirdMoment should be incremented directly.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 98,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Skewness.getResult()",
      "begin_line": 108,
      "end_line": 122,
      "comment": "\n     * Returns the value of the statistic based on the values that have been added.\n     * \u003cp\u003e\n     * See {@link Skewness} for the definition used in the computation.\u003c/p\u003e\n     *\n     * @return the skewness of the available values.\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 113,col 9)",
        "(line 114,col 9)-(line 114,col 53)",
        "(line 115,col 9)-(line 121,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Skewness.getN()",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Skewness.clear()",
      "begin_line": 134,
      "end_line": 139,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 138,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Skewness.evaluate(double[], int, int)",
      "begin_line": 157,
      "end_line": 195,
      "comment": "\n     * Returns the Skewness of the entries in the specifed portion of the\n     * input array.\n     * \u003cp\u003e\n     * See {@link Skewness} for the definition used in the computation.\u003c/p\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin the index of the first array element to include\n     * @param length the number of elements to include\n     * @return the skewness of the values or Double.NaN if length is less than\n     * 3\n     * @throws MathIllegalArgumentException if the array is null or the array index\n     *  parameters are not valid\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 33)",
        "(line 164,col 9)-(line 193,col 9)",
        "(line 194,col 9)-(line 194,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Skewness.copy()",
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
      "signature": "org.apache.commons.math3.stat.descriptive.moment.Skewness.copy(org.apache.commons.math3.stat.descriptive.moment.Skewness, org.apache.commons.math3.stat.descriptive.moment.Skewness)",
      "begin_line": 216,
      "end_line": 223,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     *\n     * @param source Skewness to copy\n     * @param dest Skewness to copy to\n     * @throws NullArgumentException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 39)",
        "(line 219,col 9)-(line 219,col 37)",
        "(line 220,col 9)-(line 220,col 42)",
        "(line 221,col 9)-(line 221,col 60)",
        "(line 222,col 9)-(line 222,col 42)"
      ]
    }
  ]
}