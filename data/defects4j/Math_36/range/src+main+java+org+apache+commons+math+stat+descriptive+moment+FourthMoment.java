{
  "filepath": "/tmp/Math-36b/src/main/java/org/apache/commons/math/stat/descriptive/moment/FourthMoment.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FourthMoment",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.moment.ThirdMoment",
        "java.io.Serializable"
      ],
      "begin_line": 56,
      "end_line": 148,
      "comment": "\n * Computes a statistic related to the Fourth Central Moment.  Specifically,\n * what is computed is the sum of\n * \u003cp\u003e\n * (x_i - xbar) ^ 4, \u003c/p\u003e\n * \u003cp\u003e\n * where the x_i are the\n * sample observations and xbar is the sample mean. \u003c/p\u003e\n * \u003cp\u003e\n * The following recursive updating formula is used: \u003c/p\u003e\n * \u003cp\u003e\n * Let \u003cul\u003e\n * \u003cli\u003e dev \u003d (current obs - previous mean) \u003c/li\u003e\n * \u003cli\u003e m2 \u003d previous value of {@link SecondMoment} \u003c/li\u003e\n * \u003cli\u003e m2 \u003d previous value of {@link ThirdMoment} \u003c/li\u003e\n * \u003cli\u003e n \u003d number of observations (including current obs) \u003c/li\u003e\n * \u003c/ul\u003e\n * Then \u003c/p\u003e\n * \u003cp\u003e\n * new value \u003d old value - 4 * (dev/n) * m3 + 6 * (dev/n)^2 * m2 + \u003cbr\u003e\n * [n^2 - 3 * (n-1)] * dev^4 * (n-1) / n^3 \u003c/p\u003e\n * \u003cp\u003e\n * Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e if no data values have been added and\n * returns \u003ccode\u003e0\u003c/code\u003e if there is just one value in the data set. \u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eNote that this implementation is not synchronized.\u003c/strong\u003e If\n * multiple threads access an instance of this class concurrently, and at least\n * one of the threads invokes the \u003ccode\u003eincrement()\u003c/code\u003e or\n * \u003ccode\u003eclear()\u003c/code\u003e method, it must be synchronized externally. \u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "m4"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " fourth moment of values that have been added "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.FourthMoment.FourthMoment()",
      "begin_line": 67,
      "end_line": 70,
      "comment": "\n     * Create a FourthMoment instance\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 16)",
        "(line 69,col 9)-(line 69,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.FourthMoment.FourthMoment(org.apache.commons.math.stat.descriptive.moment.FourthMoment)",
      "begin_line": 78,
      "end_line": 81,
      "comment": "\n     * Copy constructor, creates a new {@code FourthMoment} identical\n     * to the {@code original}\n     *\n     * @param original the {@code FourthMoment} instance to copy\n     ",
      "child_ranges": [
        "(line 79,col 10)-(line 79,col 17)",
        "(line 80,col 10)-(line 80,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.FourthMoment.increment(double)",
      "begin_line": 86,
      "end_line": 104,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 93,col 9)",
        "(line 95,col 9)-(line 95,col 27)",
        "(line 96,col 9)-(line 96,col 27)",
        "(line 98,col 9)-(line 98,col 27)",
        "(line 100,col 9)-(line 100,col 22)",
        "(line 102,col 9)-(line 103,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.FourthMoment.getResult()",
      "begin_line": 109,
      "end_line": 112,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.FourthMoment.clear()",
      "begin_line": 117,
      "end_line": 121,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 22)",
        "(line 120,col 9)-(line 120,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.FourthMoment.copy()",
      "begin_line": 126,
      "end_line": 131,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 49)",
        "(line 129,col 9)-(line 129,col 27)",
        "(line 130,col 9)-(line 130,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.FourthMoment.copy(org.apache.commons.math.stat.descriptive.moment.FourthMoment, org.apache.commons.math.stat.descriptive.moment.FourthMoment)",
      "begin_line": 141,
      "end_line": 147,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     *\n     * @param source FourthMoment to copy\n     * @param dest FourthMoment to copy to\n     * @throws NullArgumentException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 39)",
        "(line 144,col 9)-(line 144,col 37)",
        "(line 145,col 9)-(line 145,col 39)",
        "(line 146,col 9)-(line 146,col 28)"
      ]
    }
  ]
}