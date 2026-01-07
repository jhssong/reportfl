{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/stat/descriptive/SynchronizedDescriptiveStatistics.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SynchronizedDescriptiveStatistics",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.stat.descriptive.DescriptiveStatistics"
      ],
      "begin_line": 36,
      "end_line": 185,
      "comment": "\n * Implementation of\n * {@link org.apache.commons.math3.stat.descriptive.DescriptiveStatistics} that\n * is safe to use in a multithreaded environment.  Multiple threads can safely\n * operate on a single instance without causing runtime exceptions due to race\n * conditions.  In effect, this implementation makes modification and access\n * methods atomic operations for a single instance.  That is to say, as one\n * thread is computing a statistic from the instance, no other thread can modify\n * the instance nor compute another statistic.\n *\n * @since 1.2\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Serialization UID "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatistics.SynchronizedDescriptiveStatistics()",
      "begin_line": 44,
      "end_line": 47,
      "comment": "\n     * Construct an instance with infinite window\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatistics.SynchronizedDescriptiveStatistics(int)",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n     * Construct an instance with finite window\n     * @param window the finite window size.\n     * @throws MathIllegalArgumentException if window size is less than 1 but\n     * not equal to {@link #INFINITE_WINDOW}\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatistics.SynchronizedDescriptiveStatistics(org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatistics)",
      "begin_line": 65,
      "end_line": 68,
      "comment": "\n     * A copy constructor. Creates a deep-copy of the {@code original}.\n     *\n     * @param original the {@code SynchronizedDescriptiveStatistics} instance to copy\n     * @throws NullArgumentException if original is null\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatistics.addValue(double)",
      "begin_line": 73,
      "end_line": 76,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatistics.apply(org.apache.commons.math3.stat.descriptive.UnivariateStatistic)",
      "begin_line": 81,
      "end_line": 84,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatistics.clear()",
      "begin_line": 89,
      "end_line": 92,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatistics.getElement(int)",
      "begin_line": 97,
      "end_line": 100,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatistics.getN()",
      "begin_line": 105,
      "end_line": 108,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatistics.getStandardDeviation()",
      "begin_line": 113,
      "end_line": 116,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatistics.getValues()",
      "begin_line": 121,
      "end_line": 124,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatistics.getWindowSize()",
      "begin_line": 129,
      "end_line": 132,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatistics.setWindowSize(int)",
      "begin_line": 137,
      "end_line": 140,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatistics.toString()",
      "begin_line": 145,
      "end_line": 148,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatistics.copy()",
      "begin_line": 156,
      "end_line": 163,
      "comment": "\n     * Returns a copy of this SynchronizedDescriptiveStatistics instance with the\n     * same internal state.\n     *\n     * @return a copy of this\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 159,col 52)",
        "(line 161,col 9)-(line 161,col 27)",
        "(line 162,col 9)-(line 162,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatistics.copy(org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatistics, org.apache.commons.math3.stat.descriptive.SynchronizedDescriptiveStatistics)",
      "begin_line": 174,
      "end_line": 184,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     * \u003cp\u003eAcquires synchronization lock on source, then dest before copying.\u003c/p\u003e\n     *\n     * @param source SynchronizedDescriptiveStatistics to copy\n     * @param dest SynchronizedDescriptiveStatistics to copy to\n     * @throws NullArgumentException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 39)",
        "(line 178,col 9)-(line 178,col 37)",
        "(line 179,col 9)-(line 183,col 9)"
      ]
    }
  ]
}