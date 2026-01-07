{
  "filepath": "/tmp/Math-91b/src/java/org/apache/commons/math/stat/descriptive/moment/FirstMoment.java",
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
      "end_line": 154,
      "comment": "\n * Computes the first moment (arithmetic mean).  Uses the definitional formula:\n * \u003cp\u003e\n * mean \u003d sum(x_i) / n \u003c/p\u003e\n * \u003cp\u003e\n * where \u003ccode\u003en\u003c/code\u003e is the number of observations. \u003c/p\u003e\n * \u003cp\u003e\n * To limit numeric errors, the value of the statistic is computed using the\n * following recursive updating algorithm: \u003c/p\u003e\n * \u003cp\u003e\n * \u003col\u003e\n * \u003cli\u003eInitialize \u003ccode\u003em \u003d \u003c/code\u003e the first value\u003c/li\u003e\n * \u003cli\u003eFor each additional value, update using \u003cbr\u003e\n *   \u003ccode\u003em \u003d m + (new value - m) / (number of observations)\u003c/code\u003e\u003c/li\u003e\n * \u003c/ol\u003e\u003c/p\u003e\n * \u003cp\u003e\n *  Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e if the dataset is empty.\u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eNote that this implementation is not synchronized.\u003c/strong\u003e If \n * multiple threads access an instance of this class concurrently, and at least\n * one of the threads invokes the \u003ccode\u003eincrement()\u003c/code\u003e or \n * \u003ccode\u003eclear()\u003c/code\u003e method, it must be synchronized externally.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
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
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.FirstMoment.FirstMoment(org.apache.commons.math.stat.descriptive.moment.FirstMoment)",
      "begin_line": 88,
      "end_line": 91,
      "comment": "\n     * Copy constructor, creates a new {@code FirstMoment} identical\n     * to the {@code original}\n     * \n     * @param original the {@code FirstMoment} instance to copy\n     ",
      "child_ranges": [
        "(line 89,col 10)-(line 89,col 17)",
        "(line 90,col 10)-(line 90,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.FirstMoment.increment(double)",
      "begin_line": 96,
      "end_line": 105,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 99,col 9)",
        "(line 100,col 9)-(line 100,col 12)",
        "(line 101,col 9)-(line 101,col 31)",
        "(line 102,col 9)-(line 102,col 21)",
        "(line 103,col 9)-(line 103,col 24)",
        "(line 104,col 9)-(line 104,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.FirstMoment.clear()",
      "begin_line": 110,
      "end_line": 115,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 24)",
        "(line 112,col 9)-(line 112,col 14)",
        "(line 113,col 9)-(line 113,col 25)",
        "(line 114,col 9)-(line 114,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.FirstMoment.getResult()",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.FirstMoment.getN()",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.FirstMoment.copy()",
      "begin_line": 134,
      "end_line": 138,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 47)",
        "(line 136,col 9)-(line 136,col 27)",
        "(line 137,col 9)-(line 137,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.FirstMoment.copy(org.apache.commons.math.stat.descriptive.moment.FirstMoment, org.apache.commons.math.stat.descriptive.moment.FirstMoment)",
      "begin_line": 148,
      "end_line": 153,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     * \n     * @param source FirstMoment to copy\n     * @param dest FirstMoment to copy to\n     * @throws NullPointerException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 26)",
        "(line 150,col 9)-(line 150,col 28)",
        "(line 151,col 9)-(line 151,col 30)",
        "(line 152,col 9)-(line 152,col 30)"
      ]
    }
  ]
}