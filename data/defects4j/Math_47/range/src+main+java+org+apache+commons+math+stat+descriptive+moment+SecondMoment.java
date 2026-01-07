{
  "filepath": "/tmp/Math-47b/src/main/java/org/apache/commons/math/stat/descriptive/moment/SecondMoment.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SecondMoment",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.moment.FirstMoment",
        "java.io.Serializable"
      ],
      "begin_line": 48,
      "end_line": 130,
      "comment": "\n * Computes a statistic related to the Second Central Moment.  Specifically,\n * what is computed is the sum of squared deviations from the sample mean.\n * \u003cp\u003e\n * The following recursive updating formula is used:\u003c/p\u003e\n * \u003cp\u003e\n * Let \u003cul\u003e\n * \u003cli\u003e dev \u003d (current obs - previous mean) \u003c/li\u003e\n * \u003cli\u003e n \u003d number of observations (including current obs) \u003c/li\u003e\n * \u003c/ul\u003e\n * Then\u003c/p\u003e\n * \u003cp\u003e\n * new value \u003d old value + dev^2 * (n -1) / n.\u003c/p\u003e\n * \u003cp\u003e\n * Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e if no data values have been added and\n * returns \u003ccode\u003e0\u003c/code\u003e if there is just one value in the data set.\u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eNote that this implementation is not synchronized.\u003c/strong\u003e If\n * multiple threads access an instance of this class concurrently, and at least\n * one of the threads invokes the \u003ccode\u003eincrement()\u003c/code\u003e or\n * \u003ccode\u003eclear()\u003c/code\u003e method, it must be synchronized externally.\u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "m2"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " second moment of values that have been added "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SecondMoment.SecondMoment()",
      "begin_line": 59,
      "end_line": 62,
      "comment": "\n     * Create a SecondMoment instance\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 16)",
        "(line 61,col 9)-(line 61,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SecondMoment.SecondMoment(org.apache.commons.math.stat.descriptive.moment.SecondMoment)",
      "begin_line": 70,
      "end_line": 73,
      "comment": "\n     * Copy constructor, creates a new {@code SecondMoment} identical\n     * to the {@code original}\n     *\n     * @param original the {@code SecondMoment} instance to copy\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 24)",
        "(line 72,col 9)-(line 72,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SecondMoment.increment(double)",
      "begin_line": 78,
      "end_line": 85,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 82,col 9)",
        "(line 83,col 9)-(line 83,col 27)",
        "(line 84,col 9)-(line 84,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SecondMoment.clear()",
      "begin_line": 90,
      "end_line": 94,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 22)",
        "(line 93,col 9)-(line 93,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SecondMoment.getResult()",
      "begin_line": 99,
      "end_line": 102,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SecondMoment.copy()",
      "begin_line": 107,
      "end_line": 112,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 49)",
        "(line 110,col 9)-(line 110,col 27)",
        "(line 111,col 9)-(line 111,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SecondMoment.copy(org.apache.commons.math.stat.descriptive.moment.SecondMoment, org.apache.commons.math.stat.descriptive.moment.SecondMoment)",
      "begin_line": 122,
      "end_line": 128,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     *\n     * @param source SecondMoment to copy\n     * @param dest SecondMoment to copy to\n     * @throws NullArgumentException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 39)",
        "(line 125,col 9)-(line 125,col 37)",
        "(line 126,col 9)-(line 126,col 39)",
        "(line 127,col 9)-(line 127,col 28)"
      ]
    }
  ]
}