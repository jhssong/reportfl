{
  "filepath": "/tmp/Math-106b/src/java/org/apache/commons/math/stat/descriptive/moment/FirstMoment.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FirstMoment",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic",
        "java.io.Serializable"
      ],
      "begin_line": 47,
      "end_line": 119,
      "comment": "\n * Computes the first moment (arithmetic mean).  Uses the definitional formula:\n * \u003cp\u003e\n * mean \u003d sum(x_i) / n\n * \u003cp\u003e\n * where \u003ccode\u003en\u003c/code\u003e is the number of observations.\n * \u003cp\u003e\n * To limit numeric errors, the value of the statistic is computed using the\n * following recursive updating algorithm:\n * \u003cp\u003e\n * \u003col\u003e\n * \u003cli\u003eInitialize \u003ccode\u003em \u003d \u003c/code\u003e the first value\u003c/li\u003e\n * \u003cli\u003eFor each additional value, update using \u003cbr\u003e\n *   \u003ccode\u003em \u003d m + (new value - m) / (number of observations)\u003c/code\u003e\u003c/li\u003e\n * \u003c/ol\u003e\n * \u003cp\u003e\n *  Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e if the dataset is empty.\n * \u003cp\u003e\n * \u003cstrong\u003eNote that this implementation is not synchronized.\u003c/strong\u003e If \n * multiple threads access an instance of this class concurrently, and at least\n * one of the threads invokes the \u003ccode\u003eincrement()\u003c/code\u003e or \n * \u003ccode\u003eclear()\u003c/code\u003e method, it must be synchronized externally.\n *\n * @version $Revision$ $Date$\n "
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
        "n"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Count of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "m1"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " First moment of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "dev"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " \n     * Deviation of most recently added value from previous first moment.\n     * Retained to prevent repeated computation in higher order moments.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "nDev"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": "\n     * Deviation of most recently added value from previous first moment,\n     * normalized by previous sample size.  Retained to prevent repeated\n     * computation in higher order moments\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.FirstMoment.FirstMoment()",
      "begin_line": 75,
      "end_line": 80,
      "comment": "\n     * Create a FirstMoment instance\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 14)",
        "(line 77,col 9)-(line 77,col 24)",
        "(line 78,col 9)-(line 78,col 25)",
        "(line 79,col 9)-(line 79,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.FirstMoment.increment(double)",
      "begin_line": 85,
      "end_line": 94,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic#increment(double)\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 88,col 9)",
        "(line 89,col 9)-(line 89,col 12)",
        "(line 90,col 9)-(line 90,col 31)",
        "(line 91,col 9)-(line 91,col 21)",
        "(line 92,col 9)-(line 92,col 24)",
        "(line 93,col 9)-(line 93,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.FirstMoment.clear()",
      "begin_line": 99,
      "end_line": 104,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic#clear()\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 24)",
        "(line 101,col 9)-(line 101,col 14)",
        "(line 102,col 9)-(line 102,col 25)",
        "(line 103,col 9)-(line 103,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.FirstMoment.getResult()",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic#getResult()\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.FirstMoment.getN()",
      "begin_line": 116,
      "end_line": 118,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic#getN()\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 17)"
      ]
    }
  ]
}