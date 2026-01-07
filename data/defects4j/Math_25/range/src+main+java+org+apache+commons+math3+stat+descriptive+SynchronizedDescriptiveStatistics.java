{
  "filepath": "/tmp/Math-25b/src/main/java/org/apache/commons/math3/stat/descriptive/SynchronizedDescriptiveStatistics.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SynchronizedDescriptiveStatistics",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.stat.descriptive.DescriptiveStatistics"
      ],
      "begin_line": 35,
      "end_line": 178,
      "comment": "\n * Implementation of\n * {@link org.apache.commons.math3.stat.descriptive.DescriptiveStatistics} that\n * is safe to use in a multithreaded environment.  Multiple threads can safely\n * operate on a single instance without causing runtime exceptions due to race\n * conditions.  In effect, this implementation makes modification and access\n * methods atomic operations for a single instance.  That is to say, as one\n * thread is computing a statistic from the instance, no other thread can modify\n * the instance nor compute another statistic.\n *\n * @since 1.2\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Serialization UID "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatistics.SynchronizedDescriptiveStatistics()",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * Construct an instance with infinite window\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatistics.SynchronizedDescriptiveStatistics(int)",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n     * Construct an instance with finite window\n     * @param window the finite window size.\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatistics.SynchronizedDescriptiveStatistics(org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatistics)",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * A copy constructor. Creates a deep-copy of the {@code original}.\n     *\n     * @param original the {@code SynchronizedDescriptiveStatistics} instance to copy\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatistics.addValue(double)",
      "begin_line": 67,
      "end_line": 70,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatistics.apply(org.apache.commons.math3.stat.descriptive.UnivariateStatistic)",
      "begin_line": 75,
      "end_line": 78,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatistics.clear()",
      "begin_line": 83,
      "end_line": 86,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatistics.getElement(int)",
      "begin_line": 91,
      "end_line": 94,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatistics.getN()",
      "begin_line": 99,
      "end_line": 102,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatistics.getStandardDeviation()",
      "begin_line": 107,
      "end_line": 110,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatistics.getValues()",
      "begin_line": 115,
      "end_line": 118,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatistics.getWindowSize()",
      "begin_line": 123,
      "end_line": 126,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatistics.setWindowSize(int)",
      "begin_line": 131,
      "end_line": 134,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatistics.toString()",
      "begin_line": 139,
      "end_line": 142,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatistics.copy()",
      "begin_line": 150,
      "end_line": 156,
      "comment": "\n     * Returns a copy of this SynchronizedDescriptiveStatistics instance with the\n     * same internal state.\n     *\n     * @return a copy of this\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 153,col 52)",
        "(line 154,col 9)-(line 154,col 27)",
        "(line 155,col 9)-(line 155,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatistics.copy(org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatistics, org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatistics)",
      "begin_line": 167,
      "end_line": 177,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     * \u003cp\u003eAcquires synchronization lock on source, then dest before copying.\u003c/p\u003e\n     *\n     * @param source SynchronizedDescriptiveStatistics to copy\n     * @param dest SynchronizedDescriptiveStatistics to copy to\n     * @throws NullArgumentException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 39)",
        "(line 171,col 9)-(line 171,col 37)",
        "(line 172,col 9)-(line 176,col 9)"
      ]
    }
  ]
}