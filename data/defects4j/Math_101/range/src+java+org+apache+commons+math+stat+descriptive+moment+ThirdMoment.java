{
  "filepath": "/tmp/Math-101b/src/java/org/apache/commons/math/stat/descriptive/moment/ThirdMoment.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ThirdMoment",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.moment.SecondMoment",
        "java.io.Serializable"
      ],
      "begin_line": 46,
      "end_line": 101,
      "comment": "\n * Computes a statistic related to the Third Central Moment.  Specifically,\n * what is computed is the sum of cubed deviations from the sample mean.\n * \u003cp\u003e\n * The following recursive updating formula is used:\u003c/p\u003e\n * \u003cp\u003e\n * Let \u003cul\u003e\n * \u003cli\u003e dev \u003d (current obs - previous mean) \u003c/li\u003e\n * \u003cli\u003e m2 \u003d previous value of {@link SecondMoment} \u003c/li\u003e\n * \u003cli\u003e n \u003d number of observations (including current obs) \u003c/li\u003e\n * \u003c/ul\u003e\n * Then\u003c/p\u003e\n * \u003cp\u003e\n * new value \u003d old value - 3 * (dev/n) * m2 + (n-1) * (n -2) * (dev^3/n^2)\u003c/p\u003e\n * \u003cp\u003e\n * Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e if no data values have been added and\n * returns \u003ccode\u003e0\u003c/code\u003e if there is just one value in the data set.\u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eNote that this implementation is not synchronized.\u003c/strong\u003e If \n * multiple threads access an instance of this class concurrently, and at least\n * one of the threads invokes the \u003ccode\u003eincrement()\u003c/code\u003e or \n * \u003ccode\u003eclear()\u003c/code\u003e method, it must be synchronized externally.\u003c/p\u003e\n * \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "m3"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " third moment of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "nDevSq"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * Square of deviation of most recently added value from previous first \n     * moment, normalized by previous sample size.  Retained to prevent \n     * repeated computation in higher order moments.  nDevSq \u003d nDev * nDev.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.ThirdMoment.ThirdMoment()",
      "begin_line": 64,
      "end_line": 68,
      "comment": "\n     * Create a FourthMoment instance\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 16)",
        "(line 66,col 9)-(line 66,col 24)",
        "(line 67,col 9)-(line 67,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.ThirdMoment.increment(double)",
      "begin_line": 73,
      "end_line": 83,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic#increment(double)\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 76,col 9)",
        "(line 78,col 9)-(line 78,col 27)",
        "(line 79,col 9)-(line 79,col 27)",
        "(line 80,col 9)-(line 80,col 29)",
        "(line 81,col 9)-(line 81,col 31)",
        "(line 82,col 9)-(line 82,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.ThirdMoment.getResult()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic#getResult()\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.ThirdMoment.clear()",
      "begin_line": 95,
      "end_line": 99,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic#clear()\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 22)",
        "(line 97,col 9)-(line 97,col 24)",
        "(line 98,col 9)-(line 98,col 28)"
      ]
    }
  ]
}