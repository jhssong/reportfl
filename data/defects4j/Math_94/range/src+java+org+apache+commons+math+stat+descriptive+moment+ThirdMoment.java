{
  "filepath": "/tmp/Math-94b/src/java/org/apache/commons/math/stat/descriptive/moment/ThirdMoment.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ThirdMoment",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.moment.SecondMoment",
        "java.io.Serializable"
      ],
      "begin_line": 47,
      "end_line": 135,
      "comment": "\n * Computes a statistic related to the Third Central Moment.  Specifically,\n * what is computed is the sum of cubed deviations from the sample mean.\n * \u003cp\u003e\n * The following recursive updating formula is used:\u003c/p\u003e\n * \u003cp\u003e\n * Let \u003cul\u003e\n * \u003cli\u003e dev \u003d (current obs - previous mean) \u003c/li\u003e\n * \u003cli\u003e m2 \u003d previous value of {@link SecondMoment} \u003c/li\u003e\n * \u003cli\u003e n \u003d number of observations (including current obs) \u003c/li\u003e\n * \u003c/ul\u003e\n * Then\u003c/p\u003e\n * \u003cp\u003e\n * new value \u003d old value - 3 * (dev/n) * m2 + (n-1) * (n -2) * (dev^3/n^2)\u003c/p\u003e\n * \u003cp\u003e\n * Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e if no data values have been added and\n * returns \u003ccode\u003e0\u003c/code\u003e if there is just one value in the data set.\u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eNote that this implementation is not synchronized.\u003c/strong\u003e If \n * multiple threads access an instance of this class concurrently, and at least\n * one of the threads invokes the \u003ccode\u003eincrement()\u003c/code\u003e or \n * \u003ccode\u003eclear()\u003c/code\u003e method, it must be synchronized externally.\u003c/p\u003e\n * \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "m3"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " third moment of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "nDevSq"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": "\n     * Square of deviation of most recently added value from previous first \n     * moment, normalized by previous sample size.  Retained to prevent \n     * repeated computation in higher order moments.  nDevSq \u003d nDev * nDev.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.ThirdMoment.ThirdMoment()",
      "begin_line": 65,
      "end_line": 69,
      "comment": "\n     * Create a FourthMoment instance\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 16)",
        "(line 67,col 9)-(line 67,col 24)",
        "(line 68,col 9)-(line 68,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.ThirdMoment.ThirdMoment(org.apache.commons.math.stat.descriptive.moment.ThirdMoment)",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * Copy constructor, creates a new {@code ThirdMoment} identical\n     * to the {@code original}\n     * \n     * @param original the {@code ThirdMoment} instance to copy\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.ThirdMoment.increment(double)",
      "begin_line": 84,
      "end_line": 94,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 87,col 9)",
        "(line 89,col 9)-(line 89,col 27)",
        "(line 90,col 9)-(line 90,col 27)",
        "(line 91,col 9)-(line 91,col 29)",
        "(line 92,col 9)-(line 92,col 31)",
        "(line 93,col 9)-(line 93,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.ThirdMoment.getResult()",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.ThirdMoment.clear()",
      "begin_line": 106,
      "end_line": 110,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 22)",
        "(line 108,col 9)-(line 108,col 24)",
        "(line 109,col 9)-(line 109,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.ThirdMoment.copy()",
      "begin_line": 115,
      "end_line": 119,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 47)",
        "(line 117,col 9)-(line 117,col 27)",
        "(line 118,col 9)-(line 118,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.ThirdMoment.copy(org.apache.commons.math.stat.descriptive.moment.ThirdMoment, org.apache.commons.math.stat.descriptive.moment.ThirdMoment)",
      "begin_line": 129,
      "end_line": 133,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     * \n     * @param source ThirdMoment to copy\n     * @param dest ThirdMoment to copy to\n     * @throws NullPointerException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 40)",
        "(line 131,col 9)-(line 131,col 28)",
        "(line 132,col 9)-(line 132,col 36)"
      ]
    }
  ]
}