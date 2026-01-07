{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/stat/descriptive/SynchronizedDescriptiveStatistics.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SynchronizedDescriptiveStatistics",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.DescriptiveStatistics"
      ],
      "begin_line": 32,
      "end_line": 172,
      "comment": "\n * Implementation of\n * {@link org.apache.commons.math.stat.descriptive.DescriptiveStatistics} that\n * is safe to use in a multithreaded environment.  Multiple threads can safely\n * operate on a single instance without causing runtime exceptions due to race\n * conditions.  In effect, this implementation makes modification and access\n * methods atomic operations for a single instance.  That is to say, as one\n * thread is computing a statistic from the instance, no other thread can modify\n * the instance nor compute another statistic.\n *\n * @since 1.2\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Serialization UID "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedDescriptiveStatistics.SynchronizedDescriptiveStatistics()",
      "begin_line": 40,
      "end_line": 42,
      "comment": "\n     * Construct an instance with infinite window\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedDescriptiveStatistics.SynchronizedDescriptiveStatistics(int)",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * Construct an instance with finite window\n     * @param window the finite window size.\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedDescriptiveStatistics.SynchronizedDescriptiveStatistics(org.apache.commons.math.stat.descriptive.SynchronizedDescriptiveStatistics)",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * A copy constructor. Creates a deep-copy of the {@code original}.\n     *\n     * @param original the {@code SynchronizedDescriptiveStatistics} instance to copy\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedDescriptiveStatistics.addValue(double)",
      "begin_line": 64,
      "end_line": 67,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedDescriptiveStatistics.apply(org.apache.commons.math.stat.descriptive.UnivariateStatistic)",
      "begin_line": 72,
      "end_line": 75,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedDescriptiveStatistics.clear()",
      "begin_line": 80,
      "end_line": 83,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedDescriptiveStatistics.getElement(int)",
      "begin_line": 88,
      "end_line": 91,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedDescriptiveStatistics.getN()",
      "begin_line": 96,
      "end_line": 99,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedDescriptiveStatistics.getStandardDeviation()",
      "begin_line": 104,
      "end_line": 107,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedDescriptiveStatistics.getValues()",
      "begin_line": 112,
      "end_line": 115,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedDescriptiveStatistics.getWindowSize()",
      "begin_line": 120,
      "end_line": 123,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedDescriptiveStatistics.setWindowSize(int)",
      "begin_line": 128,
      "end_line": 131,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedDescriptiveStatistics.toString()",
      "begin_line": 136,
      "end_line": 139,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedDescriptiveStatistics.copy()",
      "begin_line": 147,
      "end_line": 153,
      "comment": "\n     * Returns a copy of this SynchronizedDescriptiveStatistics instance with the\n     * same internal state.\n     *\n     * @return a copy of this\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 150,col 52)",
        "(line 151,col 9)-(line 151,col 27)",
        "(line 152,col 9)-(line 152,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedDescriptiveStatistics.copy(org.apache.commons.math.stat.descriptive.SynchronizedDescriptiveStatistics, org.apache.commons.math.stat.descriptive.SynchronizedDescriptiveStatistics)",
      "begin_line": 164,
      "end_line": 171,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     * \u003cp\u003eAcquires synchronization lock on source, then dest before copying.\u003c/p\u003e\n     *\n     * @param source SynchronizedDescriptiveStatistics to copy\n     * @param dest SynchronizedDescriptiveStatistics to copy to\n     * @throws NullPointerException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 170,col 9)"
      ]
    }
  ]
}