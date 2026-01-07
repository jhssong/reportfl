{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/stat/descriptive/AggregateSummaryStatistics.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AggregateSummaryStatistics",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.StatisticalSummary",
        "java.io.Serializable"
      ],
      "begin_line": 52,
      "end_line": 416,
      "comment": "\n * \u003cp\u003e\n * An aggregator for {@code SummaryStatistics} from several data sets or\n * data set partitions.  In its simplest usage mode, the client creates an\n * instance via the zero-argument constructor, then uses\n * {@link #createContributingStatistics()} to obtain a {@code SummaryStatistics}\n * for each individual data set / partition.  The per-set statistics objects\n * are used as normal, and at any time the aggregate statistics for all the\n * contributors can be obtained from this object.\n * \u003c/p\u003e\u003cp\u003e\n * Clients with specialized requirements can use alternative constructors to\n * control the statistics implementations and initial values used by the\n * contributing and the internal aggregate {@code SummaryStatistics} objects.\n * \u003c/p\u003e\u003cp\u003e\n * A static {@link #aggregate(Collection)} method is also included that computes\n * aggregate statistics directly from a Collection of SummaryStatistics instances.\n * \u003c/p\u003e\u003cp\u003e\n * When {@link #createContributingStatistics()} is used to create SummaryStatistics\n * instances to be aggregated concurrently, the created instances\u0027\n * {@link SummaryStatistics#addValue(double)} methods must synchronize on the aggregating\n * instance maintained by this class.  In multithreaded environments, if the functionality\n * provided by {@link #aggregate(Collection)} is adequate, that method should be used\n * to avoid unecessary computation and synchronization delays.\u003c/p\u003e\n *\n * @since 2.0\n * @version $Revision$ $Date$\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "statisticsPrototype"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": "\n     * A SummaryStatistics serving as a prototype for creating SummaryStatistics\n     * contributing to this aggregate\n     "
    },
    {
      "type": "field",
      "varNames": [
        "statistics"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": "\n     * The SummaryStatistics in which aggregate statistics are accumulated.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics.AggregateSummaryStatistics()",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\n     * Initializes a new AggregateSummaryStatistics with default statistics\n     * implementations.\n     *\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics.AggregateSummaryStatistics(org.apache.commons.math.stat.descriptive.SummaryStatistics)",
      "begin_line": 95,
      "end_line": 98,
      "comment": "\n     * Initializes a new AggregateSummaryStatistics with the specified statistics\n     * object as a prototype for contributing statistics and for the internal\n     * aggregate statistics.  This provides for customized statistics implementations\n     * to be used by contributing and aggregate statistics.\n     *\n     * @param prototypeStatistics a {@code SummaryStatistics} serving as a\n     *      prototype both for the internal aggregate statistics and for\n     *      contributing statistics obtained via the\n     *      {@code createContributingStatistics()} method.  Being a prototype\n     *      means that other objects are initialized by copying this object\u0027s state.\n     *      If {@code null}, a new, default statistics object is used.  Any statistic\n     *      values in the prototype are propagated to contributing statistics\n     *      objects and (once) into these aggregate statistics.\n     * @see #createContributingStatistics()\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 97,col 94)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics.AggregateSummaryStatistics(org.apache.commons.math.stat.descriptive.SummaryStatistics, org.apache.commons.math.stat.descriptive.SummaryStatistics)",
      "begin_line": 120,
      "end_line": 126,
      "comment": "\n     * Initializes a new AggregateSummaryStatistics with the specified statistics\n     * object as a prototype for contributing statistics and for the internal\n     * aggregate statistics.  This provides for different statistics implementations\n     * to be used by contributing and aggregate statistics and for an initial\n     * state to be supplied for the aggregate statistics.\n     *\n     * @param prototypeStatistics a {@code SummaryStatistics} serving as a\n     *      prototype both for the internal aggregate statistics and for\n     *      contributing statistics obtained via the\n     *      {@code createContributingStatistics()} method.  Being a prototype\n     *      means that other objects are initialized by copying this object\u0027s state.\n     *      If {@code null}, a new, default statistics object is used.  Any statistic\n     *      values in the prototype are propagated to contributing statistics\n     *      objects, but not into these aggregate statistics.\n     * @param initialStatistics a {@code SummaryStatistics} to serve as the\n     *      internal aggregate statistics object.  If {@code null}, a new, default\n     *      statistics object is used.\n     * @see #createContributingStatistics()\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 123,col 90)",
        "(line 124,col 9)-(line 125,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics.getMax()",
      "begin_line": 134,
      "end_line": 138,
      "comment": "\n     * {@inheritDoc}.  This version returns the maximum over all the aggregated\n     * data.\n     *\n     * @see StatisticalSummary#getMax()\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 137,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics.getMean()",
      "begin_line": 145,
      "end_line": 149,
      "comment": "\n     * {@inheritDoc}.  This version returns the mean of all the aggregated data.\n     *\n     * @see StatisticalSummary#getMean()\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 148,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics.getMin()",
      "begin_line": 157,
      "end_line": 161,
      "comment": "\n     * {@inheritDoc}.  This version returns the minimum over all the aggregated\n     * data.\n     *\n     * @see StatisticalSummary#getMin()\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 160,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics.getN()",
      "begin_line": 168,
      "end_line": 172,
      "comment": "\n     * {@inheritDoc}.  This version returns a count of all the aggregated data.\n     *\n     * @see StatisticalSummary#getN()\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 171,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics.getStandardDeviation()",
      "begin_line": 180,
      "end_line": 184,
      "comment": "\n     * {@inheritDoc}.  This version returns the standard deviation of all the\n     * aggregated data.\n     *\n     * @see StatisticalSummary#getStandardDeviation()\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 183,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics.getSum()",
      "begin_line": 191,
      "end_line": 195,
      "comment": "\n     * {@inheritDoc}.  This version returns a sum of all the aggregated data.\n     *\n     * @see StatisticalSummary#getSum()\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 194,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics.getVariance()",
      "begin_line": 203,
      "end_line": 207,
      "comment": "\n     * {@inheritDoc}.  This version returns the variance of all the aggregated\n     * data.\n     *\n     * @see StatisticalSummary#getVariance()\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 206,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics.getSumOfLogs()",
      "begin_line": 215,
      "end_line": 219,
      "comment": "\n     * Returns the sum of the logs of all the aggregated data.\n     *\n     * @return the sum of logs\n     * @see SummaryStatistics#getSumOfLogs()\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 218,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics.getGeometricMean()",
      "begin_line": 227,
      "end_line": 231,
      "comment": "\n     * Returns the geometric mean of all the aggregated data.\n     *\n     * @return the geometric mean\n     * @see SummaryStatistics#getGeometricMean()\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 230,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics.getSumsq()",
      "begin_line": 239,
      "end_line": 243,
      "comment": "\n     * Returns the sum of the squares of all the aggregated data.\n     *\n     * @return The sum of squares\n     * @see SummaryStatistics#getSumsq()\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 242,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics.getSecondMoment()",
      "begin_line": 253,
      "end_line": 257,
      "comment": "\n     * Returns a statistic related to the Second Central Moment.  Specifically,\n     * what is returned is the sum of squared deviations from the sample mean\n     * among the all of the aggregated data.\n     *\n     * @return second central moment statistic\n     * @see SummaryStatistics#getSecondMoment()\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 256,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics.getSummary()",
      "begin_line": 265,
      "end_line": 270,
      "comment": "\n     * Return a {@link StatisticalSummaryValues} instance reporting current\n     * aggregate statistics.\n     *\n     * @return Current values of aggregate statistics\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 269,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics.createContributingStatistics()",
      "begin_line": 280,
      "end_line": 287,
      "comment": "\n     * Creates and returns a {@code SummaryStatistics} whose data will be\n     * aggregated with those of this {@code AggregateSummaryStatistics}.\n     *\n     * @return a {@code SummaryStatistics} whose data will be aggregated with\n     *      those of this {@code AggregateSummaryStatistics}.  The initial state\n     *      is a copy of the configured prototype statistics.\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 282,col 63)",
        "(line 284,col 9)-(line 284,col 76)",
        "(line 286,col 9)-(line 286,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics.aggregate(java.util.Collection\u003corg.apache.commons.math.stat.descriptive.SummaryStatistics\u003e)",
      "begin_line": 301,
      "end_line": 341,
      "comment": "\n     * Computes aggregate summary statistics. This method can be used to combine statistics\n     * computed over partitions or subsamples - i.e., the StatisticalSummaryValues returned\n     * should contain the same values that would have been obtained by computing a single\n     * StatisticalSummary over the combined dataset.\n     * \u003cp\u003e\n     * Returns null if the collection is empty or null.\n     * \u003c/p\u003e\n     *\n     * @param statistics collection of SummaryStatistics to aggregate\n     * @return summary statistics for the combined dataset\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 304,col 9)",
        "(line 305,col 9)-(line 305,col 69)",
        "(line 306,col 9)-(line 308,col 9)",
        "(line 309,col 9)-(line 309,col 52)",
        "(line 310,col 9)-(line 310,col 32)",
        "(line 311,col 9)-(line 311,col 38)",
        "(line 312,col 9)-(line 312,col 38)",
        "(line 313,col 9)-(line 313,col 38)",
        "(line 314,col 9)-(line 314,col 46)",
        "(line 315,col 9)-(line 315,col 40)",
        "(line 316,col 9)-(line 331,col 9)",
        "(line 332,col 9)-(line 332,col 30)",
        "(line 333,col 9)-(line 339,col 9)",
        "(line 340,col 9)-(line 340,col 78)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AggregatingSummaryStatistics",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.SummaryStatistics"
      ],
      "begin_line": 349,
      "end_line": 415,
      "comment": "\n     * A SummaryStatistics that also forwards all values added to it to a second\n     * {@code SummaryStatistics} for aggregation.\n     *\n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 354,
      "end_line": 354,
      "comment": "\n         * The serialization version of this class\n         "
    },
    {
      "type": "field",
      "varNames": [
        "aggregateStatistics"
      ],
      "begin_line": 360,
      "end_line": 360,
      "comment": "\n         * An additional SummaryStatistics into which values added to these\n         * statistics (and possibly others) are aggregated\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics.AggregatingSummaryStatistics.AggregatingSummaryStatistics(org.apache.commons.math.stat.descriptive.SummaryStatistics)",
      "begin_line": 369,
      "end_line": 371,
      "comment": "\n         * Initializes a new AggregatingSummaryStatistics with the specified\n         * aggregate statistics object\n         *\n         * @param aggregateStatistics a {@code SummaryStatistics} into which\n         *      values added to this statistics object should be aggregated\n         ",
      "child_ranges": [
        "(line 370,col 13)-(line 370,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics.AggregatingSummaryStatistics.addValue(double)",
      "begin_line": 379,
      "end_line": 385,
      "comment": "\n         * {@inheritDoc}.  This version adds the provided value to the configured\n         * aggregate after adding it to these statistics.\n         *\n         * @see SummaryStatistics#addValue(double)\n         ",
      "child_ranges": [
        "(line 381,col 13)-(line 381,col 34)",
        "(line 382,col 13)-(line 384,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics.AggregatingSummaryStatistics.equals(java.lang.Object)",
      "begin_line": 394,
      "end_line": 405,
      "comment": "\n         * Returns true iff \u003ccode\u003eobject\u003c/code\u003e is a\n         * \u003ccode\u003eSummaryStatistics\u003c/code\u003e instance and all statistics have the\n         * same values as this.\n         * @param object the object to test equality against.\n         * @return true if object equals this\n         ",
      "child_ranges": [
        "(line 396,col 13)-(line 398,col 13)",
        "(line 399,col 13)-(line 401,col 13)",
        "(line 402,col 13)-(line 402,col 85)",
        "(line 403,col 13)-(line 404,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics.AggregatingSummaryStatistics.hashCode()",
      "begin_line": 411,
      "end_line": 414,
      "comment": "\n         * Returns hash code based on values of statistics\n         * @return hash code\n         ",
      "child_ranges": [
        "(line 413,col 13)-(line 413,col 75)"
      ]
    }
  ]
}