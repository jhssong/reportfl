{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/stat/descriptive/moment/SecondMoment.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SecondMoment",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.moment.FirstMoment",
        "java.io.Serializable"
      ],
      "begin_line": 45,
      "end_line": 124,
      "comment": "\n * Computes a statistic related to the Second Central Moment.  Specifically,\n * what is computed is the sum of squared deviations from the sample mean.\n * \u003cp\u003e\n * The following recursive updating formula is used:\u003c/p\u003e\n * \u003cp\u003e\n * Let \u003cul\u003e\n * \u003cli\u003e dev \u003d (current obs - previous mean) \u003c/li\u003e\n * \u003cli\u003e n \u003d number of observations (including current obs) \u003c/li\u003e\n * \u003c/ul\u003e\n * Then\u003c/p\u003e\n * \u003cp\u003e\n * new value \u003d old value + dev^2 * (n -1) / n.\u003c/p\u003e\n * \u003cp\u003e\n * Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e if no data values have been added and\n * returns \u003ccode\u003e0\u003c/code\u003e if there is just one value in the data set.\u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eNote that this implementation is not synchronized.\u003c/strong\u003e If\n * multiple threads access an instance of this class concurrently, and at least\n * one of the threads invokes the \u003ccode\u003eincrement()\u003c/code\u003e or\n * \u003ccode\u003eclear()\u003c/code\u003e method, it must be synchronized externally.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "m2"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " second moment of values that have been added "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SecondMoment.SecondMoment()",
      "begin_line": 56,
      "end_line": 59,
      "comment": "\n     * Create a SecondMoment instance\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 16)",
        "(line 58,col 9)-(line 58,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SecondMoment.SecondMoment(org.apache.commons.math.stat.descriptive.moment.SecondMoment)",
      "begin_line": 67,
      "end_line": 70,
      "comment": "\n     * Copy constructor, creates a new {@code SecondMoment} identical\n     * to the {@code original}\n     *\n     * @param original the {@code SecondMoment} instance to copy\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 24)",
        "(line 69,col 9)-(line 69,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SecondMoment.increment(double)",
      "begin_line": 75,
      "end_line": 82,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 79,col 9)",
        "(line 80,col 9)-(line 80,col 27)",
        "(line 81,col 9)-(line 81,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SecondMoment.clear()",
      "begin_line": 87,
      "end_line": 91,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 22)",
        "(line 90,col 9)-(line 90,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SecondMoment.getResult()",
      "begin_line": 96,
      "end_line": 99,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SecondMoment.copy()",
      "begin_line": 104,
      "end_line": 109,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 49)",
        "(line 107,col 9)-(line 107,col 27)",
        "(line 108,col 9)-(line 108,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SecondMoment.copy(org.apache.commons.math.stat.descriptive.moment.SecondMoment, org.apache.commons.math.stat.descriptive.moment.SecondMoment)",
      "begin_line": 119,
      "end_line": 122,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     *\n     * @param source SecondMoment to copy\n     * @param dest SecondMoment to copy to\n     * @throws NullPointerException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 39)",
        "(line 121,col 9)-(line 121,col 28)"
      ]
    }
  ]
}