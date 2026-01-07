{
  "filepath": "/tmp/Math-87b/src/java/org/apache/commons/math/stat/descriptive/AggregateSummaryStatistics.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AggregateSummaryStatistics",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.StatisticalSummary",
        "java.io.Serializable"
      ],
      "begin_line": 41,
      "end_line": 244,
      "comment": "\n * \u003cp\u003e\n * A StatisticalSummary that aggregates statistics from several data sets or\n * data set partitions.  In its simplest usage mode, the client creates an\n * instance via the zero-argument constructor, then uses\n * {@link #createContributingStatistics()} to obtain a {@code SummaryStatistics}\n * for each individual data set / partition.  The per-set statistics objects\n * are used as normal, and at any time the aggregate statistics for all the\n * contributors can be obtained from this object.\n * \u003c/p\u003e\u003cp\u003e\n * Clients with specialized requirements can use alternative constructors to\n * control the statistics implementations and initial values used by the\n * contributing and the internal aggregate {@code SummaryStatistics} objects.\n * \u003c/p\u003e\n *\n * @since 2.0\n * @version $Revision:$ $Date:$\n * \n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "statisticsPrototype"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * A SummaryStatistics serving as a prototype for creating SummaryStatistics\n     * contributing to this aggregate \n     "
    },
    {
      "type": "field",
      "varNames": [
        "statistics"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n     * The SummaryStatistics in which aggregate statistics are accumulated \n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics.AggregateSummaryStatistics()",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * Initializes a new AggregateSummaryStatistics with default statistics\n     * implementations.\n     * \n     * @see SummaryStatistics#SummaryStatistics()\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics.AggregateSummaryStatistics(org.apache.commons.math.stat.descriptive.SummaryStatistics)",
      "begin_line": 85,
      "end_line": 88,
      "comment": "\n     * Initializes a new AggregateSummaryStatistics with the specified statistics\n     * object as a prototype for contributing statistics and for the internal\n     * aggregate statistics.  This provides for customized statistics implementations\n     * to be used by contributing and aggregate statistics.\n     *\n     * @param prototypeStatistics a {@code SummaryStatistics} serving as a\n     *      prototype both for the internal aggregate statistics and for\n     *      contributing statistics obtained via the\n     *      {@code createContributingStatistics()} method.  Being a prototype\n     *      means that other objects are initialized by copying this object\u0027s state. \n     *      If {@code null}, a new, default statistics object is used.  Any statistic\n     *      values in the prototype are propagated to contributing statistics\n     *      objects and (once) into these aggregate statistics.\n     * @see #createContributingStatistics()\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 87,col 61)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics.AggregateSummaryStatistics(org.apache.commons.math.stat.descriptive.SummaryStatistics, org.apache.commons.math.stat.descriptive.SummaryStatistics)",
      "begin_line": 110,
      "end_line": 116,
      "comment": "\n     * Initializes a new AggregateSummaryStatistics with the specified statistics\n     * object as a prototype for contributing statistics and for the internal\n     * aggregate statistics.  This provides for different statistics implementations\n     * to be used by contributing and aggregate statistics and for an initial\n     * state to be supplied for the aggregate statistics.\n     *\n     * @param prototypeStatistics a {@code SummaryStatistics} serving as a\n     *      prototype both for the internal aggregate statistics and for\n     *      contributing statistics obtained via the\n     *      {@code createContributingStatistics()} method.  Being a prototype\n     *      means that other objects are initialized by copying this object\u0027s state. \n     *      If {@code null}, a new, default statistics object is used.  Any statistic\n     *      values in the prototype are propagated to contributing statistics\n     *      objects, but not into these aggregate statistics.\n     * @param initialStatistics a {@code SummaryStatistics} to serve as the\n     *      internal aggregate statistics object.  If {@code null}, a new, default\n     *      statistics object is used.\n     * @see #createContributingStatistics()\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 113,col 63)",
        "(line 114,col 9)-(line 115,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics.getMax()",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\n     * {@inheritDoc}.  This version returns the maximum over all the aggregated\n     * data.\n     *\n     * @see StatisticalSummary#getMax()\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics.getMean()",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\n     * {@inheritDoc}.  This version returns the mean of all the aggregated data.\n     *\n     * @see StatisticalSummary#getMean()\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics.getMin()",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\n     * {@inheritDoc}.  This version returns the minimum over all the aggregated\n     * data.\n     *\n     * @see StatisticalSummary#getMin()\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics.getN()",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\n     * {@inheritDoc}.  This version returns a count of all the aggregated data.\n     *\n     * @see StatisticalSummary#getN()\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics.getStandardDeviation()",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\n     * {@inheritDoc}.  This version returns the standard deviation of all the\n     * aggregated data.\n     *\n     * @see StatisticalSummary#getStandardDeviation()\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics.getSum()",
      "begin_line": 171,
      "end_line": 173,
      "comment": "\n     * {@inheritDoc}.  This version returns a sum of all the aggregated data.\n     *\n     * @see StatisticalSummary#getSum()\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics.getVariance()",
      "begin_line": 181,
      "end_line": 183,
      "comment": "\n     * {@inheritDoc}.  This version returns the variance of all the aggregated\n     * data.\n     *\n     * @see StatisticalSummary#getVariance()\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics.createContributingStatistics()",
      "begin_line": 193,
      "end_line": 200,
      "comment": "\n     * Creates and returns a {@code SummaryStatistics} whose data will be\n     * aggregated with those of this {@code AggregateSummaryStatistics}. \n     *\n     * @return a {@code SummaryStatistics} whose data will be aggregated with\n     *      those of this {@code AggregateSummaryStatistics}.  The initial state\n     *      is a copy of the configured prototype statistics.\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 195,col 63)",
        "(line 197,col 9)-(line 197,col 76)",
        "(line 199,col 9)-(line 199,col 38)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AggregatingSummaryStatistics",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.SummaryStatistics"
      ],
      "begin_line": 208,
      "end_line": 243,
      "comment": "\n     * A SummaryStatistics that also forwards all values added to it to a second\n     * {@code SummaryStatistics} for aggregation.\n     *\n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 213,
      "end_line": 213,
      "comment": "\n         * The serialization version of this class\n         "
    },
    {
      "type": "field",
      "varNames": [
        "aggregateStatistics"
      ],
      "begin_line": 219,
      "end_line": 219,
      "comment": "\n         * An additional SummaryStatistics into which values added to these\n         * statistics (and possibly others) are aggregated\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics.AggregatingSummaryStatistics.AggregatingSummaryStatistics(org.apache.commons.math.stat.descriptive.SummaryStatistics)",
      "begin_line": 228,
      "end_line": 230,
      "comment": "\n         * Initializes a new AggregatingSummaryStatistics with the specified\n         * aggregate statistics object\n         *\n         * @param aggregateStatistics a {@code SummaryStatistics} into which\n         *      values added to this statistics object should be aggregated\n         ",
      "child_ranges": [
        "(line 229,col 13)-(line 229,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics.AggregatingSummaryStatistics.addValue(double)",
      "begin_line": 238,
      "end_line": 242,
      "comment": "\n         * {@inheritDoc}.  This version adds the provided value to the configured\n         * aggregate after adding it to these statistics.\n         *\n         * @see SummaryStatistics#addValue(double)\n         ",
      "child_ranges": [
        "(line 240,col 13)-(line 240,col 34)",
        "(line 241,col 13)-(line 241,col 48)"
      ]
    }
  ]
}