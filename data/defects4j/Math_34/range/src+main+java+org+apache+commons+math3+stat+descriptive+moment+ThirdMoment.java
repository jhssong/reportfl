{
  "filepath": "/tmp/Math-34b/src/main/java/org/apache/commons/math3/stat/descriptive/moment/ThirdMoment.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ThirdMoment",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.stat.descriptive.moment.SecondMoment",
        "java.io.Serializable"
      ],
      "begin_line": 50,
      "end_line": 145,
      "comment": "\n * Computes a statistic related to the Third Central Moment.  Specifically,\n * what is computed is the sum of cubed deviations from the sample mean.\n * \u003cp\u003e\n * The following recursive updating formula is used:\u003c/p\u003e\n * \u003cp\u003e\n * Let \u003cul\u003e\n * \u003cli\u003e dev \u003d (current obs - previous mean) \u003c/li\u003e\n * \u003cli\u003e m2 \u003d previous value of {@link SecondMoment} \u003c/li\u003e\n * \u003cli\u003e n \u003d number of observations (including current obs) \u003c/li\u003e\n * \u003c/ul\u003e\n * Then\u003c/p\u003e\n * \u003cp\u003e\n * new value \u003d old value - 3 * (dev/n) * m2 + (n-1) * (n -2) * (dev^3/n^2)\u003c/p\u003e\n * \u003cp\u003e\n * Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e if no data values have been added and\n * returns \u003ccode\u003e0\u003c/code\u003e if there is just one value in the data set.\u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eNote that this implementation is not synchronized.\u003c/strong\u003e If\n * multiple threads access an instance of this class concurrently, and at least\n * one of the threads invokes the \u003ccode\u003eincrement()\u003c/code\u003e or\n * \u003ccode\u003eclear()\u003c/code\u003e method, it must be synchronized externally.\u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "m3"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " third moment of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "nDevSq"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": "\n     * Square of deviation of most recently added value from previous first\n     * moment, normalized by previous sample size.  Retained to prevent\n     * repeated computation in higher order moments.  nDevSq \u003d nDev * nDev.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.ThirdMoment.ThirdMoment()",
      "begin_line": 68,
      "end_line": 72,
      "comment": "\n     * Create a FourthMoment instance\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 16)",
        "(line 70,col 9)-(line 70,col 24)",
        "(line 71,col 9)-(line 71,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.ThirdMoment.ThirdMoment(org.apache.commons.math3.stat.descriptive.moment.ThirdMoment)",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * Copy constructor, creates a new {@code ThirdMoment} identical\n     * to the {@code original}\n     *\n     * @param original the {@code ThirdMoment} instance to copy\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.ThirdMoment.increment(double)",
      "begin_line": 87,
      "end_line": 98,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 91,col 9)",
        "(line 93,col 9)-(line 93,col 27)",
        "(line 94,col 9)-(line 94,col 27)",
        "(line 95,col 9)-(line 95,col 29)",
        "(line 96,col 9)-(line 96,col 22)",
        "(line 97,col 9)-(line 97,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.ThirdMoment.getResult()",
      "begin_line": 103,
      "end_line": 106,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.ThirdMoment.clear()",
      "begin_line": 111,
      "end_line": 116,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 22)",
        "(line 114,col 9)-(line 114,col 24)",
        "(line 115,col 9)-(line 115,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.ThirdMoment.copy()",
      "begin_line": 121,
      "end_line": 126,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 47)",
        "(line 124,col 9)-(line 124,col 27)",
        "(line 125,col 9)-(line 125,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.ThirdMoment.copy(org.apache.commons.math3.stat.descriptive.moment.ThirdMoment, org.apache.commons.math3.stat.descriptive.moment.ThirdMoment)",
      "begin_line": 136,
      "end_line": 143,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     *\n     * @param source ThirdMoment to copy\n     * @param dest ThirdMoment to copy to\n     * @throws NullArgumentException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 39)",
        "(line 139,col 9)-(line 139,col 37)",
        "(line 140,col 9)-(line 140,col 40)",
        "(line 141,col 9)-(line 141,col 28)",
        "(line 142,col 9)-(line 142,col 36)"
      ]
    }
  ]
}