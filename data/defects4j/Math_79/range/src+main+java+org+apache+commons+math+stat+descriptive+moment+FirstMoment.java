{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/stat/descriptive/moment/FirstMoment.java",
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
      "end_line": 159,
      "comment": "\n * Computes the first moment (arithmetic mean).  Uses the definitional formula:\n * \u003cp\u003e\n * mean \u003d sum(x_i) / n \u003c/p\u003e\n * \u003cp\u003e\n * where \u003ccode\u003en\u003c/code\u003e is the number of observations. \u003c/p\u003e\n * \u003cp\u003e\n * To limit numeric errors, the value of the statistic is computed using the\n * following recursive updating algorithm: \u003c/p\u003e\n * \u003cp\u003e\n * \u003col\u003e\n * \u003cli\u003eInitialize \u003ccode\u003em \u003d \u003c/code\u003e the first value\u003c/li\u003e\n * \u003cli\u003eFor each additional value, update using \u003cbr\u003e\n *   \u003ccode\u003em \u003d m + (new value - m) / (number of observations)\u003c/code\u003e\u003c/li\u003e\n * \u003c/ol\u003e\u003c/p\u003e\n * \u003cp\u003e\n *  Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e if the dataset is empty.\u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eNote that this implementation is not synchronized.\u003c/strong\u003e If\n * multiple threads access an instance of this class concurrently, and at least\n * one of the threads invokes the \u003ccode\u003eincrement()\u003c/code\u003e or\n * \u003ccode\u003eclear()\u003c/code\u003e method, it must be synchronized externally.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
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
      "comment": "\n     * Deviation of most recently added value from previous first moment.\n     * Retained to prevent repeated computation in higher order moments.\n     "
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
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.FirstMoment.FirstMoment(org.apache.commons.math.stat.descriptive.moment.FirstMoment)",
      "begin_line": 89,
      "end_line": 92,
      "comment": "\n     * Copy constructor, creates a new {@code FirstMoment} identical\n     * to the {@code original}\n     *\n     * @param original the {@code FirstMoment} instance to copy\n     ",
      "child_ranges": [
        "(line 90,col 10)-(line 90,col 17)",
        "(line 91,col 10)-(line 91,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.FirstMoment.increment(double)",
      "begin_line": 97,
      "end_line": 107,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 101,col 9)",
        "(line 102,col 9)-(line 102,col 12)",
        "(line 103,col 9)-(line 103,col 22)",
        "(line 104,col 9)-(line 104,col 21)",
        "(line 105,col 9)-(line 105,col 24)",
        "(line 106,col 9)-(line 106,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.FirstMoment.clear()",
      "begin_line": 112,
      "end_line": 118,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 24)",
        "(line 115,col 9)-(line 115,col 14)",
        "(line 116,col 9)-(line 116,col 25)",
        "(line 117,col 9)-(line 117,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.FirstMoment.getResult()",
      "begin_line": 123,
      "end_line": 126,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.FirstMoment.getN()",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.FirstMoment.copy()",
      "begin_line": 138,
      "end_line": 143,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 47)",
        "(line 141,col 9)-(line 141,col 27)",
        "(line 142,col 9)-(line 142,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.FirstMoment.copy(org.apache.commons.math.stat.descriptive.moment.FirstMoment, org.apache.commons.math.stat.descriptive.moment.FirstMoment)",
      "begin_line": 153,
      "end_line": 158,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     *\n     * @param source FirstMoment to copy\n     * @param dest FirstMoment to copy to\n     * @throws NullPointerException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 26)",
        "(line 155,col 9)-(line 155,col 28)",
        "(line 156,col 9)-(line 156,col 30)",
        "(line 157,col 9)-(line 157,col 30)"
      ]
    }
  ]
}