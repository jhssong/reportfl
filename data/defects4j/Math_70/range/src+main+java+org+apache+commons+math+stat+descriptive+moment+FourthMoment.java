{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/stat/descriptive/moment/FourthMoment.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FourthMoment",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.moment.ThirdMoment",
        "java.io.Serializable"
      ],
      "begin_line": 53,
      "end_line": 142,
      "comment": "\n * Computes a statistic related to the Fourth Central Moment.  Specifically,\n * what is computed is the sum of\n * \u003cp\u003e\n * (x_i - xbar) ^ 4, \u003c/p\u003e\n * \u003cp\u003e\n * where the x_i are the\n * sample observations and xbar is the sample mean. \u003c/p\u003e\n * \u003cp\u003e\n * The following recursive updating formula is used: \u003c/p\u003e\n * \u003cp\u003e\n * Let \u003cul\u003e\n * \u003cli\u003e dev \u003d (current obs - previous mean) \u003c/li\u003e\n * \u003cli\u003e m2 \u003d previous value of {@link SecondMoment} \u003c/li\u003e\n * \u003cli\u003e m2 \u003d previous value of {@link ThirdMoment} \u003c/li\u003e\n * \u003cli\u003e n \u003d number of observations (including current obs) \u003c/li\u003e\n * \u003c/ul\u003e\n * Then \u003c/p\u003e\n * \u003cp\u003e\n * new value \u003d old value - 4 * (dev/n) * m3 + 6 * (dev/n)^2 * m2 + \u003cbr\u003e\n * [n^2 - 3 * (n-1)] * dev^4 * (n-1) / n^3 \u003c/p\u003e\n * \u003cp\u003e\n * Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e if no data values have been added and\n * returns \u003ccode\u003e0\u003c/code\u003e if there is just one value in the data set. \u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eNote that this implementation is not synchronized.\u003c/strong\u003e If\n * multiple threads access an instance of this class concurrently, and at least\n * one of the threads invokes the \u003ccode\u003eincrement()\u003c/code\u003e or\n * \u003ccode\u003eclear()\u003c/code\u003e method, it must be synchronized externally. \u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "m4"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " fourth moment of values that have been added "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.FourthMoment.FourthMoment()",
      "begin_line": 64,
      "end_line": 67,
      "comment": "\n     * Create a FourthMoment instance\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 16)",
        "(line 66,col 9)-(line 66,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.FourthMoment.FourthMoment(org.apache.commons.math.stat.descriptive.moment.FourthMoment)",
      "begin_line": 75,
      "end_line": 78,
      "comment": "\n     * Copy constructor, creates a new {@code FourthMoment} identical\n     * to the {@code original}\n     *\n     * @param original the {@code FourthMoment} instance to copy\n     ",
      "child_ranges": [
        "(line 76,col 10)-(line 76,col 17)",
        "(line 77,col 10)-(line 77,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.FourthMoment.increment(double)",
      "begin_line": 83,
      "end_line": 101,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 90,col 9)",
        "(line 92,col 9)-(line 92,col 27)",
        "(line 93,col 9)-(line 93,col 27)",
        "(line 95,col 9)-(line 95,col 27)",
        "(line 97,col 9)-(line 97,col 22)",
        "(line 99,col 9)-(line 100,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.FourthMoment.getResult()",
      "begin_line": 106,
      "end_line": 109,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.FourthMoment.clear()",
      "begin_line": 114,
      "end_line": 118,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 22)",
        "(line 117,col 9)-(line 117,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.FourthMoment.copy()",
      "begin_line": 123,
      "end_line": 128,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 49)",
        "(line 126,col 9)-(line 126,col 27)",
        "(line 127,col 9)-(line 127,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.FourthMoment.copy(org.apache.commons.math.stat.descriptive.moment.FourthMoment, org.apache.commons.math.stat.descriptive.moment.FourthMoment)",
      "begin_line": 138,
      "end_line": 141,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     *\n     * @param source FourthMoment to copy\n     * @param dest FourthMoment to copy to\n     * @throws NullPointerException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 39)",
        "(line 140,col 9)-(line 140,col 28)"
      ]
    }
  ]
}