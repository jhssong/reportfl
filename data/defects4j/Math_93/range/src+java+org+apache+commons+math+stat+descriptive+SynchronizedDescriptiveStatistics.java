{
  "filepath": "/tmp/Math-93b/src/java/org/apache/commons/math/stat/descriptive/SynchronizedDescriptiveStatistics.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SynchronizedDescriptiveStatistics",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.DescriptiveStatistics"
      ],
      "begin_line": 32,
      "end_line": 170,
      "comment": "\n * Implementation of\n * {@link org.apache.commons.math.stat.descriptive.DescriptiveStatistics} that\n * is safe to use in a multithreaded environment.  Multiple threads can safely\n * operate on a single instance without causing runtime exceptions due to race\n * conditions.  In effect, this implementation makes modification and access\n * methods atomic operations for a single instance.  That is to say, as one\n * thread is computing a statistic from the instance, no other thread can modify\n * the instance nor compute another statistic. \n *\n * @since 1.2\n * @version $Revision$ $Date$\n "
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
      "comment": "\n     * A copy constructor. Creates a deep-copy of the {@code original}.\n     * \n     * @param original the {@code SynchronizedDescriptiveStatistics} instance to copy\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedDescriptiveStatistics.addValue(double)",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedDescriptiveStatistics.apply(org.apache.commons.math.stat.descriptive.UnivariateStatistic)",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\n     * Apply the given statistic to this univariate collection.\n     * @param stat the statistic to apply\n     * @return the computed value of the statistic.\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedDescriptiveStatistics.clear()",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedDescriptiveStatistics.getElement(int)",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedDescriptiveStatistics.getN()",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedDescriptiveStatistics.getStandardDeviation()",
      "begin_line": 103,
      "end_line": 105,
      "comment": " \n     * Returns the standard deviation of the available values.\n     * @return The standard deviation, Double.NaN if no values have been added \n     * or 0.0 for a single value set. \n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedDescriptiveStatistics.getValues()",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedDescriptiveStatistics.getWindowSize()",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\n     * Access the window size.\n     * @return the current window size.\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedDescriptiveStatistics.setWindowSize(int)",
      "begin_line": 125,
      "end_line": 127,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedDescriptiveStatistics.toString()",
      "begin_line": 136,
      "end_line": 138,
      "comment": "\n     * Generates a text report displaying univariate statistics from values\n     * that have been added.  Each statistic is displayed on a separate\n     * line.\n     * \n     * @return String with line feeds displaying statistics\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedDescriptiveStatistics.copy()",
      "begin_line": 146,
      "end_line": 151,
      "comment": "\n     * Returns a copy of this SynchronizedDescriptiveStatistics instance with the\n     * same internal state.\n     * \n     * @return a copy of this\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 148,col 52)",
        "(line 149,col 9)-(line 149,col 27)",
        "(line 150,col 9)-(line 150,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedDescriptiveStatistics.copy(org.apache.commons.math.stat.descriptive.SynchronizedDescriptiveStatistics, org.apache.commons.math.stat.descriptive.SynchronizedDescriptiveStatistics)",
      "begin_line": 162,
      "end_line": 169,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     * \u003cp\u003eAcquires synchronization lock on source, then dest before copying.\u003c/p\u003e\n     * \n     * @param source SynchronizedDescriptiveStatistics to copy\n     * @param dest SynchronizedDescriptiveStatistics to copy to\n     * @throws NullPointerException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 168,col 9)"
      ]
    }
  ]
}