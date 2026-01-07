{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/stat/descriptive/AggregateSummaryStatistics.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AggregateSummaryStatistics",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.stat.descriptive.StatisticalSummary",
        "java.io.Serializable"
      ],
      "begin_line": 54,
      "end_line": 421,
      "comment": "\n * \u003cp\u003e\n * An aggregator for {@code SummaryStatistics} from several data sets or\n * data set partitions.  In its simplest usage mode, the client creates an\n * instance via the zero-argument constructor, then uses\n * {@link #createContributingStatistics()} to obtain a {@code SummaryStatistics}\n * for each individual data set / partition.  The per-set statistics objects\n * are used as normal, and at any time the aggregate statistics for all the\n * contributors can be obtained from this object.\n * \u003c/p\u003e\u003cp\u003e\n * Clients with specialized requirements can use alternative constructors to\n * control the statistics implementations and initial values used by the\n * contributing and the internal aggregate {@code SummaryStatistics} objects.\n * \u003c/p\u003e\u003cp\u003e\n * A static {@link #aggregate(Collection)} method is also included that computes\n * aggregate statistics directly from a Collection of SummaryStatistics instances.\n * \u003c/p\u003e\u003cp\u003e\n * When {@link #createContributingStatistics()} is used to create SummaryStatistics\n * instances to be aggregated concurrently, the created instances\u0027\n * {@link SummaryStatistics#addValue(double)} methods must synchronize on the aggregating\n * instance maintained by this class.  In multithreaded environments, if the functionality\n * provided by {@link #aggregate(Collection)} is adequate, that method should be used\n * to avoid unnecessary computation and synchronization delays.\u003c/p\u003e\n *\n * @since 2.0\n * @version $Id$\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "statisticsPrototype"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": "\n     * A SummaryStatistics serving as a prototype for creating SummaryStatistics\n     * contributing to this aggregate\n     "
    },
    {
      "type": "field",
      "varNames": [
        "statistics"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": "\n     * The SummaryStatistics in which aggregate statistics are accumulated.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.AggregateSummaryStatistics.AggregateSummaryStatistics()",
      "begin_line": 77,
      "end_line": 80,
      "comment": "\n     * Initializes a new AggregateSummaryStatistics with default statistics\n     * implementations.\n     *\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.AggregateSummaryStatistics.AggregateSummaryStatistics(org.apache.commons.math3.stat.descriptive.SummaryStatistics)",
      "begin_line": 99,
      "end_line": 102,
      "comment": "\n     * Initializes a new AggregateSummaryStatistics with the specified statistics\n     * object as a prototype for contributing statistics and for the internal\n     * aggregate statistics.  This provides for customized statistics implementations\n     * to be used by contributing and aggregate statistics.\n     *\n     * @param prototypeStatistics a {@code SummaryStatistics} serving as a\n     *      prototype both for the internal aggregate statistics and for\n     *      contributing statistics obtained via the\n     *      {@code createContributingStatistics()} method.  Being a prototype\n     *      means that other objects are initialized by copying this object\u0027s state.\n     *      If {@code null}, a new, default statistics object is used.  Any statistic\n     *      values in the prototype are propagated to contributing statistics\n     *      objects and (once) into these aggregate statistics.\n     * @throws NullArgumentException if prototypeStatistics is null\n     * @see #createContributingStatistics()\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 101,col 94)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.AggregateSummaryStatistics.AggregateSummaryStatistics(org.apache.commons.math3.stat.descriptive.SummaryStatistics, org.apache.commons.math3.stat.descriptive.SummaryStatistics)",
      "begin_line": 124,
      "end_line": 130,
      "comment": "\n     * Initializes a new AggregateSummaryStatistics with the specified statistics\n     * object as a prototype for contributing statistics and for the internal\n     * aggregate statistics.  This provides for different statistics implementations\n     * to be used by contributing and aggregate statistics and for an initial\n     * state to be supplied for the aggregate statistics.\n     *\n     * @param prototypeStatistics a {@code SummaryStatistics} serving as a\n     *      prototype both for the internal aggregate statistics and for\n     *      contributing statistics obtained via the\n     *      {@code createContributingStatistics()} method.  Being a prototype\n     *      means that other objects are initialized by copying this object\u0027s state.\n     *      If {@code null}, a new, default statistics object is used.  Any statistic\n     *      values in the prototype are propagated to contributing statistics\n     *      objects, but not into these aggregate statistics.\n     * @param initialStatistics a {@code SummaryStatistics} to serve as the\n     *      internal aggregate statistics object.  If {@code null}, a new, default\n     *      statistics object is used.\n     * @see #createContributingStatistics()\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 127,col 90)",
        "(line 128,col 9)-(line 129,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.AggregateSummaryStatistics.getMax()",
      "begin_line": 138,
      "end_line": 142,
      "comment": "\n     * {@inheritDoc}.  This version returns the maximum over all the aggregated\n     * data.\n     *\n     * @see StatisticalSummary#getMax()\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 141,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.AggregateSummaryStatistics.getMean()",
      "begin_line": 149,
      "end_line": 153,
      "comment": "\n     * {@inheritDoc}.  This version returns the mean of all the aggregated data.\n     *\n     * @see StatisticalSummary#getMean()\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 152,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.AggregateSummaryStatistics.getMin()",
      "begin_line": 161,
      "end_line": 165,
      "comment": "\n     * {@inheritDoc}.  This version returns the minimum over all the aggregated\n     * data.\n     *\n     * @see StatisticalSummary#getMin()\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 164,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.AggregateSummaryStatistics.getN()",
      "begin_line": 172,
      "end_line": 176,
      "comment": "\n     * {@inheritDoc}.  This version returns a count of all the aggregated data.\n     *\n     * @see StatisticalSummary#getN()\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 175,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.AggregateSummaryStatistics.getStandardDeviation()",
      "begin_line": 184,
      "end_line": 188,
      "comment": "\n     * {@inheritDoc}.  This version returns the standard deviation of all the\n     * aggregated data.\n     *\n     * @see StatisticalSummary#getStandardDeviation()\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 187,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.AggregateSummaryStatistics.getSum()",
      "begin_line": 195,
      "end_line": 199,
      "comment": "\n     * {@inheritDoc}.  This version returns a sum of all the aggregated data.\n     *\n     * @see StatisticalSummary#getSum()\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 198,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.AggregateSummaryStatistics.getVariance()",
      "begin_line": 207,
      "end_line": 211,
      "comment": "\n     * {@inheritDoc}.  This version returns the variance of all the aggregated\n     * data.\n     *\n     * @see StatisticalSummary#getVariance()\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 210,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.AggregateSummaryStatistics.getSumOfLogs()",
      "begin_line": 219,
      "end_line": 223,
      "comment": "\n     * Returns the sum of the logs of all the aggregated data.\n     *\n     * @return the sum of logs\n     * @see SummaryStatistics#getSumOfLogs()\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 222,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.AggregateSummaryStatistics.getGeometricMean()",
      "begin_line": 231,
      "end_line": 235,
      "comment": "\n     * Returns the geometric mean of all the aggregated data.\n     *\n     * @return the geometric mean\n     * @see SummaryStatistics#getGeometricMean()\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 234,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.AggregateSummaryStatistics.getSumsq()",
      "begin_line": 243,
      "end_line": 247,
      "comment": "\n     * Returns the sum of the squares of all the aggregated data.\n     *\n     * @return The sum of squares\n     * @see SummaryStatistics#getSumsq()\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 246,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.AggregateSummaryStatistics.getSecondMoment()",
      "begin_line": 257,
      "end_line": 261,
      "comment": "\n     * Returns a statistic related to the Second Central Moment.  Specifically,\n     * what is returned is the sum of squared deviations from the sample mean\n     * among the all of the aggregated data.\n     *\n     * @return second central moment statistic\n     * @see SummaryStatistics#getSecondMoment()\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 260,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.AggregateSummaryStatistics.getSummary()",
      "begin_line": 269,
      "end_line": 274,
      "comment": "\n     * Return a {@link StatisticalSummaryValues} instance reporting current\n     * aggregate statistics.\n     *\n     * @return Current values of aggregate statistics\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 273,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.AggregateSummaryStatistics.createContributingStatistics()",
      "begin_line": 284,
      "end_line": 292,
      "comment": "\n     * Creates and returns a {@code SummaryStatistics} whose data will be\n     * aggregated with those of this {@code AggregateSummaryStatistics}.\n     *\n     * @return a {@code SummaryStatistics} whose data will be aggregated with\n     *      those of this {@code AggregateSummaryStatistics}.  The initial state\n     *      is a copy of the configured prototype statistics.\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 286,col 63)",
        "(line 289,col 9)-(line 289,col 76)",
        "(line 291,col 9)-(line 291,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.AggregateSummaryStatistics.aggregate(java.util.Collection\u003corg.apache.commons.math3.stat.descriptive.SummaryStatistics\u003e)",
      "begin_line": 306,
      "end_line": 346,
      "comment": "\n     * Computes aggregate summary statistics. This method can be used to combine statistics\n     * computed over partitions or subsamples - i.e., the StatisticalSummaryValues returned\n     * should contain the same values that would have been obtained by computing a single\n     * StatisticalSummary over the combined dataset.\n     * \u003cp\u003e\n     * Returns null if the collection is empty or null.\n     * \u003c/p\u003e\n     *\n     * @param statistics collection of SummaryStatistics to aggregate\n     * @return summary statistics for the combined dataset\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 309,col 9)",
        "(line 310,col 9)-(line 310,col 69)",
        "(line 311,col 9)-(line 313,col 9)",
        "(line 314,col 9)-(line 314,col 52)",
        "(line 315,col 9)-(line 315,col 32)",
        "(line 316,col 9)-(line 316,col 38)",
        "(line 317,col 9)-(line 317,col 38)",
        "(line 318,col 9)-(line 318,col 38)",
        "(line 319,col 9)-(line 319,col 46)",
        "(line 320,col 9)-(line 320,col 40)",
        "(line 321,col 9)-(line 336,col 9)",
        "(line 337,col 9)-(line 337,col 30)",
        "(line 338,col 9)-(line 344,col 9)",
        "(line 345,col 9)-(line 345,col 78)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AggregatingSummaryStatistics",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.stat.descriptive.SummaryStatistics"
      ],
      "begin_line": 354,
      "end_line": 420,
      "comment": "\n     * A SummaryStatistics that also forwards all values added to it to a second\n     * {@code SummaryStatistics} for aggregation.\n     *\n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 359,
      "end_line": 359,
      "comment": "\n         * The serialization version of this class\n         "
    },
    {
      "type": "field",
      "varNames": [
        "aggregateStatistics"
      ],
      "begin_line": 365,
      "end_line": 365,
      "comment": "\n         * An additional SummaryStatistics into which values added to these\n         * statistics (and possibly others) are aggregated\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.AggregateSummaryStatistics.AggregatingSummaryStatistics.AggregatingSummaryStatistics(org.apache.commons.math3.stat.descriptive.SummaryStatistics)",
      "begin_line": 374,
      "end_line": 376,
      "comment": "\n         * Initializes a new AggregatingSummaryStatistics with the specified\n         * aggregate statistics object\n         *\n         * @param aggregateStatistics a {@code SummaryStatistics} into which\n         *      values added to this statistics object should be aggregated\n         ",
      "child_ranges": [
        "(line 375,col 13)-(line 375,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.AggregateSummaryStatistics.AggregatingSummaryStatistics.addValue(double)",
      "begin_line": 384,
      "end_line": 390,
      "comment": "\n         * {@inheritDoc}.  This version adds the provided value to the configured\n         * aggregate after adding it to these statistics.\n         *\n         * @see SummaryStatistics#addValue(double)\n         ",
      "child_ranges": [
        "(line 386,col 13)-(line 386,col 34)",
        "(line 387,col 13)-(line 389,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.AggregateSummaryStatistics.AggregatingSummaryStatistics.equals(java.lang.Object)",
      "begin_line": 399,
      "end_line": 410,
      "comment": "\n         * Returns true iff \u003ccode\u003eobject\u003c/code\u003e is a\n         * \u003ccode\u003eSummaryStatistics\u003c/code\u003e instance and all statistics have the\n         * same values as this.\n         * @param object the object to test equality against.\n         * @return true if object equals this\n         ",
      "child_ranges": [
        "(line 401,col 13)-(line 403,col 13)",
        "(line 404,col 13)-(line 406,col 13)",
        "(line 407,col 13)-(line 407,col 85)",
        "(line 408,col 13)-(line 409,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.AggregateSummaryStatistics.AggregatingSummaryStatistics.hashCode()",
      "begin_line": 416,
      "end_line": 419,
      "comment": "\n         * Returns hash code based on values of statistics\n         * @return hash code\n         ",
      "child_ranges": [
        "(line 418,col 13)-(line 418,col 75)"
      ]
    }
  ]
}