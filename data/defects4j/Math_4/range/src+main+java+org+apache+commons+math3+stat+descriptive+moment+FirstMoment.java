{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/stat/descriptive/moment/FirstMoment.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FirstMoment",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.stat.descriptive.AbstractStorelessUnivariateStatistic",
        "java.io.Serializable"
      ],
      "begin_line": 50,
      "end_line": 168,
      "comment": "\n * Computes the first moment (arithmetic mean).  Uses the definitional formula:\n * \u003cp\u003e\n * mean \u003d sum(x_i) / n \u003c/p\u003e\n * \u003cp\u003e\n * where \u003ccode\u003en\u003c/code\u003e is the number of observations. \u003c/p\u003e\n * \u003cp\u003e\n * To limit numeric errors, the value of the statistic is computed using the\n * following recursive updating algorithm: \u003c/p\u003e\n * \u003cp\u003e\n * \u003col\u003e\n * \u003cli\u003eInitialize \u003ccode\u003em \u003d \u003c/code\u003e the first value\u003c/li\u003e\n * \u003cli\u003eFor each additional value, update using \u003cbr\u003e\n *   \u003ccode\u003em \u003d m + (new value - m) / (number of observations)\u003c/code\u003e\u003c/li\u003e\n * \u003c/ol\u003e\u003c/p\u003e\n * \u003cp\u003e\n *  Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e if the dataset is empty.\u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eNote that this implementation is not synchronized.\u003c/strong\u003e If\n * multiple threads access an instance of this class concurrently, and at least\n * one of the threads invokes the \u003ccode\u003eincrement()\u003c/code\u003e or\n * \u003ccode\u003eclear()\u003c/code\u003e method, it must be synchronized externally.\u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Count of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "m1"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " First moment of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "dev"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n     * Deviation of most recently added value from previous first moment.\n     * Retained to prevent repeated computation in higher order moments.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "nDev"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": "\n     * Deviation of most recently added value from previous first moment,\n     * normalized by previous sample size.  Retained to prevent repeated\n     * computation in higher order moments\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.FirstMoment.FirstMoment()",
      "begin_line": 79,
      "end_line": 84,
      "comment": "\n     * Create a FirstMoment instance\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 14)",
        "(line 81,col 9)-(line 81,col 24)",
        "(line 82,col 9)-(line 82,col 25)",
        "(line 83,col 9)-(line 83,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.FirstMoment.FirstMoment(org.apache.commons.math3.stat.descriptive.moment.FirstMoment)",
      "begin_line": 93,
      "end_line": 96,
      "comment": "\n     * Copy constructor, creates a new {@code FirstMoment} identical\n     * to the {@code original}\n     *\n     * @param original the {@code FirstMoment} instance to copy\n     * @throws NullArgumentException if original is null\n     ",
      "child_ranges": [
        "(line 94,col 10)-(line 94,col 17)",
        "(line 95,col 10)-(line 95,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.FirstMoment.increment(double)",
      "begin_line": 101,
      "end_line": 111,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 106,col 12)",
        "(line 107,col 9)-(line 107,col 22)",
        "(line 108,col 9)-(line 108,col 21)",
        "(line 109,col 9)-(line 109,col 24)",
        "(line 110,col 9)-(line 110,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.FirstMoment.clear()",
      "begin_line": 116,
      "end_line": 122,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 24)",
        "(line 119,col 9)-(line 119,col 14)",
        "(line 120,col 9)-(line 120,col 25)",
        "(line 121,col 9)-(line 121,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.FirstMoment.getResult()",
      "begin_line": 127,
      "end_line": 130,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.FirstMoment.getN()",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.FirstMoment.copy()",
      "begin_line": 142,
      "end_line": 148,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 47)",
        "(line 146,col 9)-(line 146,col 27)",
        "(line 147,col 9)-(line 147,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.FirstMoment.copy(org.apache.commons.math3.stat.descriptive.moment.FirstMoment, org.apache.commons.math3.stat.descriptive.moment.FirstMoment)",
      "begin_line": 158,
      "end_line": 167,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     *\n     * @param source FirstMoment to copy\n     * @param dest FirstMoment to copy to\n     * @throws NullArgumentException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 39)",
        "(line 161,col 9)-(line 161,col 37)",
        "(line 162,col 9)-(line 162,col 42)",
        "(line 163,col 9)-(line 163,col 26)",
        "(line 164,col 9)-(line 164,col 28)",
        "(line 165,col 9)-(line 165,col 30)",
        "(line 166,col 9)-(line 166,col 32)"
      ]
    }
  ]
}