{
  "filepath": "/tmp/Math-102b/src/java/org/apache/commons/math/stat/descriptive/SynchronizedSummaryStatistics.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SynchronizedSummaryStatistics",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.SummaryStatistics"
      ],
      "begin_line": 32,
      "end_line": 149,
      "comment": "\n * Implementation of\n * {@link org.apache.commons.math.stat.descriptive.SummaryStatistics} that\n * is safe to use in a multithreaded environment.  Multiple threads can safely\n * operate on a single instance without causing runtime exceptions due to race\n * conditions.  In effect, this implementation makes modification and access\n * methods atomic operations for a single instance.  That is to say, as one\n * thread is computing a statistic from the instance, no other thread can modify\n * the instance nor compute another statistic. \n *\n * @since 1.2\n * @version $Revision: 602304 $ $Date: 2007-12-08 03:48:39 +0100 (sam., 08 déc. 2007) $\n "
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
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.SynchronizedSummaryStatistics()",
      "begin_line": 40,
      "end_line": 42,
      "comment": "\n     * Construct a SynchronizedSummaryStatistics instance\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getSummary()",
      "begin_line": 47,
      "end_line": 49,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.SummaryStatistics#getSummary()\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.addValue(double)",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.SummaryStatistics#addValue(double)\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getN()",
      "begin_line": 61,
      "end_line": 63,
      "comment": " \n     * @see org.apache.commons.math.stat.descriptive.SummaryStatistics#getN()\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getSum()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.SummaryStatistics#getSum()\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getSumsq()",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.SummaryStatistics#getSumsq()\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getMean()",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.SummaryStatistics#getMean()\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getStandardDeviation()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.SummaryStatistics#getStandardDeviation()\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getVariance()",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.SummaryStatistics#getVariance()\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getMax()",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.SummaryStatistics#getMax()\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getMin()",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.SummaryStatistics#getMin()\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getGeometricMean()",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.SummaryStatistics#getGeometricMean()\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.toString()",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.SummaryStatistics#toString()\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.clear()",
      "begin_line": 131,
      "end_line": 133,
      "comment": " \n     * @see org.apache.commons.math.stat.descriptive.SummaryStatistics#clear()\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.equals(java.lang.Object)",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.SummaryStatistics#equals(Object)\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.hashCode()",
      "begin_line": 145,
      "end_line": 147,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.SummaryStatistics#hashCode()\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 32)"
      ]
    }
  ]
}