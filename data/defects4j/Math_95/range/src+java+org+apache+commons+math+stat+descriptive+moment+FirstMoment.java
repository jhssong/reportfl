{
  "filepath": "/tmp/Math-95b/src/java/org/apache/commons/math/stat/descriptive/moment/FirstMoment.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FirstMoment",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic",
        "java.io.Serializable"
      ],
      "begin_line": 48,
      "end_line": 120,
      "comment": "\n * Computes the first moment (arithmetic mean).  Uses the definitional formula:\n * \u003cp\u003e\n * mean \u003d sum(x_i) / n \u003c/p\u003e\n * \u003cp\u003e\n * where \u003ccode\u003en\u003c/code\u003e is the number of observations. \u003c/p\u003e\n * \u003cp\u003e\n * To limit numeric errors, the value of the statistic is computed using the\n * following recursive updating algorithm: \u003c/p\u003e\n * \u003cp\u003e\n * \u003col\u003e\n * \u003cli\u003eInitialize \u003ccode\u003em \u003d \u003c/code\u003e the first value\u003c/li\u003e\n * \u003cli\u003eFor each additional value, update using \u003cbr\u003e\n *   \u003ccode\u003em \u003d m + (new value - m) / (number of observations)\u003c/code\u003e\u003c/li\u003e\n * \u003c/ol\u003e\u003c/p\u003e\n * \u003cp\u003e\n *  Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e if the dataset is empty.\u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eNote that this implementation is not synchronized.\u003c/strong\u003e If \n * multiple threads access an instance of this class concurrently, and at least\n * one of the threads invokes the \u003ccode\u003eincrement()\u003c/code\u003e or \n * \u003ccode\u003eclear()\u003c/code\u003e method, it must be synchronized externally.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Count of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "m1"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " First moment of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "dev"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " \n     * Deviation of most recently added value from previous first moment.\n     * Retained to prevent repeated computation in higher order moments.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "nDev"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": "\n     * Deviation of most recently added value from previous first moment,\n     * normalized by previous sample size.  Retained to prevent repeated\n     * computation in higher order moments\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.FirstMoment.FirstMoment()",
      "begin_line": 76,
      "end_line": 81,
      "comment": "\n     * Create a FirstMoment instance\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 14)",
        "(line 78,col 9)-(line 78,col 24)",
        "(line 79,col 9)-(line 79,col 25)",
        "(line 80,col 9)-(line 80,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.FirstMoment.increment(double)",
      "begin_line": 86,
      "end_line": 95,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 89,col 9)",
        "(line 90,col 9)-(line 90,col 12)",
        "(line 91,col 9)-(line 91,col 31)",
        "(line 92,col 9)-(line 92,col 21)",
        "(line 93,col 9)-(line 93,col 24)",
        "(line 94,col 9)-(line 94,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.FirstMoment.clear()",
      "begin_line": 100,
      "end_line": 105,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 24)",
        "(line 102,col 9)-(line 102,col 14)",
        "(line 103,col 9)-(line 103,col 25)",
        "(line 104,col 9)-(line 104,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.FirstMoment.getResult()",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.FirstMoment.getN()",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 17)"
      ]
    }
  ]
}