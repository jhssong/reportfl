{
  "filepath": "/tmp/Math-102b/src/java/org/apache/commons/math/stat/descriptive/SynchronizedDescriptiveStatistics.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SynchronizedDescriptiveStatistics",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.DescriptiveStatistics"
      ],
      "begin_line": 32,
      "end_line": 130,
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
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedDescriptiveStatistics.addValue(double)",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.DescriptiveStatistics#addValue(double)\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedDescriptiveStatistics.apply(org.apache.commons.math.stat.descriptive.UnivariateStatistic)",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * Apply the given statistic to this univariate collection.\n     * @param stat the statistic to apply\n     * @return the computed value of the statistic.\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedDescriptiveStatistics.clear()",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.DescriptiveStatistics#clear()\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedDescriptiveStatistics.getElement(int)",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.DescriptiveStatistics#getElement(int)\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedDescriptiveStatistics.getN()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.DescriptiveStatistics#getN()\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedDescriptiveStatistics.getStandardDeviation()",
      "begin_line": 94,
      "end_line": 96,
      "comment": " \n     * Returns the standard deviation of the available values.\n     * @return The standard deviation, Double.NaN if no values have been added \n     * or 0.0 for a single value set. \n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedDescriptiveStatistics.getValues()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.DescriptiveStatistics#getValues()\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedDescriptiveStatistics.getWindowSize()",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n     * Access the window size.\n     * @return the current window size.\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedDescriptiveStatistics.setWindowSize(int)",
      "begin_line": 116,
      "end_line": 118,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.DescriptiveStatistics#setWindowSize(int)\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedDescriptiveStatistics.toString()",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\n     * Generates a text report displaying univariate statistics from values\n     * that have been added.  Each statistic is displayed on a separate\n     * line.\n     * \n     * @return String with line feeds displaying statistics\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 32)"
      ]
    }
  ]
}