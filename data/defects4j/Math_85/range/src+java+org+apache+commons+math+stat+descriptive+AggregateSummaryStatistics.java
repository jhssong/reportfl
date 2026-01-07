{
  "filepath": "/tmp/Math-85b/src/java/org/apache/commons/math/stat/descriptive/AggregateSummaryStatistics.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AggregateSummaryStatistics",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.StatisticalSummary",
        "java.io.Serializable"
      ],
      "begin_line": 43,
      "end_line": 331,
      "comment": "\n * \u003cp\u003e\n * A StatisticalSummary that aggregates statistics from several data sets or\n * data set partitions.  In its simplest usage mode, the client creates an\n * instance via the zero-argument constructor, then uses\n * {@link #createContributingStatistics()} to obtain a {@code SummaryStatistics}\n * for each individual data set / partition.  The per-set statistics objects\n * are used as normal, and at any time the aggregate statistics for all the\n * contributors can be obtained from this object.\n * \u003c/p\u003e\u003cp\u003e\n * Clients with specialized requirements can use alternative constructors to\n * control the statistics implementations and initial values used by the\n * contributing and the internal aggregate {@code SummaryStatistics} objects.\n * \u003c/p\u003e\n *\n * @since 2.0\n * @version $Revision:$ $Date:$\n * \n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "statisticsPrototype"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n     * A SummaryStatistics serving as a prototype for creating SummaryStatistics\n     * contributing to this aggregate \n     "
    },
    {
      "type": "field",
      "varNames": [
        "statistics"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * The SummaryStatistics in which aggregate statistics are accumulated \n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics.AggregateSummaryStatistics()",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * Initializes a new AggregateSummaryStatistics with default statistics\n     * implementations.\n     * \n     * @see SummaryStatistics#SummaryStatistics()\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics.AggregateSummaryStatistics(org.apache.commons.math.stat.descriptive.SummaryStatistics)",
      "begin_line": 87,
      "end_line": 90,
      "comment": "\n     * Initializes a new AggregateSummaryStatistics with the specified statistics\n     * object as a prototype for contributing statistics and for the internal\n     * aggregate statistics.  This provides for customized statistics implementations\n     * to be used by contributing and aggregate statistics.\n     *\n     * @param prototypeStatistics a {@code SummaryStatistics} serving as a\n     *      prototype both for the internal aggregate statistics and for\n     *      contributing statistics obtained via the\n     *      {@code createContributingStatistics()} method.  Being a prototype\n     *      means that other objects are initialized by copying this object\u0027s state. \n     *      If {@code null}, a new, default statistics object is used.  Any statistic\n     *      values in the prototype are propagated to contributing statistics\n     *      objects and (once) into these aggregate statistics.\n     * @see #createContributingStatistics()\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 89,col 61)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics.AggregateSummaryStatistics(org.apache.commons.math.stat.descriptive.SummaryStatistics, org.apache.commons.math.stat.descriptive.SummaryStatistics)",
      "begin_line": 112,
      "end_line": 118,
      "comment": "\n     * Initializes a new AggregateSummaryStatistics with the specified statistics\n     * object as a prototype for contributing statistics and for the internal\n     * aggregate statistics.  This provides for different statistics implementations\n     * to be used by contributing and aggregate statistics and for an initial\n     * state to be supplied for the aggregate statistics.\n     *\n     * @param prototypeStatistics a {@code SummaryStatistics} serving as a\n     *      prototype both for the internal aggregate statistics and for\n     *      contributing statistics obtained via the\n     *      {@code createContributingStatistics()} method.  Being a prototype\n     *      means that other objects are initialized by copying this object\u0027s state. \n     *      If {@code null}, a new, default statistics object is used.  Any statistic\n     *      values in the prototype are propagated to contributing statistics\n     *      objects, but not into these aggregate statistics.\n     * @param initialStatistics a {@code SummaryStatistics} to serve as the\n     *      internal aggregate statistics object.  If {@code null}, a new, default\n     *      statistics object is used.\n     * @see #createContributingStatistics()\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 115,col 63)",
        "(line 116,col 9)-(line 117,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics.getMax()",
      "begin_line": 126,
      "end_line": 128,
      "comment": "\n     * {@inheritDoc}.  This version returns the maximum over all the aggregated\n     * data.\n     *\n     * @see StatisticalSummary#getMax()\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics.getMean()",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\n     * {@inheritDoc}.  This version returns the mean of all the aggregated data.\n     *\n     * @see StatisticalSummary#getMean()\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics.getMin()",
      "begin_line": 145,
      "end_line": 147,
      "comment": "\n     * {@inheritDoc}.  This version returns the minimum over all the aggregated\n     * data.\n     *\n     * @see StatisticalSummary#getMin()\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics.getN()",
      "begin_line": 154,
      "end_line": 156,
      "comment": "\n     * {@inheritDoc}.  This version returns a count of all the aggregated data.\n     *\n     * @see StatisticalSummary#getN()\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics.getStandardDeviation()",
      "begin_line": 164,
      "end_line": 166,
      "comment": "\n     * {@inheritDoc}.  This version returns the standard deviation of all the\n     * aggregated data.\n     *\n     * @see StatisticalSummary#getStandardDeviation()\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics.getSum()",
      "begin_line": 173,
      "end_line": 175,
      "comment": "\n     * {@inheritDoc}.  This version returns a sum of all the aggregated data.\n     *\n     * @see StatisticalSummary#getSum()\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics.getVariance()",
      "begin_line": 183,
      "end_line": 185,
      "comment": "\n     * {@inheritDoc}.  This version returns the variance of all the aggregated\n     * data.\n     *\n     * @see StatisticalSummary#getVariance()\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics.createContributingStatistics()",
      "begin_line": 195,
      "end_line": 202,
      "comment": "\n     * Creates and returns a {@code SummaryStatistics} whose data will be\n     * aggregated with those of this {@code AggregateSummaryStatistics}. \n     *\n     * @return a {@code SummaryStatistics} whose data will be aggregated with\n     *      those of this {@code AggregateSummaryStatistics}.  The initial state\n     *      is a copy of the configured prototype statistics.\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 197,col 63)",
        "(line 199,col 9)-(line 199,col 76)",
        "(line 201,col 9)-(line 201,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics.aggregate(java.util.Collection\u003corg.apache.commons.math.stat.descriptive.SummaryStatistics\u003e)",
      "begin_line": 216,
      "end_line": 256,
      "comment": "\n     * Computes aggregate summary statistics. This method can be used to combine statistics\n     * computed over partitions or subsamples - i.e., the StatisticalSummaryValues returned\n     * should contain the same values that would have been obtained by computing a single\n     * StatisticalSummary over the combined dataset.\n     * \u003cp\u003e\n     * Returns null if the collection is empty or null.\n     * \u003c/p\u003e\n     * \n     * @param statistics collection of SummaryStatistics to aggregate\n     * @return summary statistics for the combined dataset\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 219,col 9)",
        "(line 220,col 9)-(line 220,col 69)",
        "(line 221,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 224,col 52)",
        "(line 225,col 9)-(line 225,col 32)",
        "(line 226,col 9)-(line 226,col 38)",
        "(line 227,col 9)-(line 227,col 38)",
        "(line 228,col 9)-(line 228,col 38)",
        "(line 229,col 9)-(line 229,col 46)",
        "(line 230,col 9)-(line 230,col 40)",
        "(line 231,col 9)-(line 246,col 9)",
        "(line 247,col 9)-(line 247,col 30)",
        "(line 248,col 9)-(line 254,col 9)",
        "(line 255,col 9)-(line 255,col 78)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AggregatingSummaryStatistics",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.SummaryStatistics"
      ],
      "begin_line": 264,
      "end_line": 330,
      "comment": "\n     * A SummaryStatistics that also forwards all values added to it to a second\n     * {@code SummaryStatistics} for aggregation.\n     *\n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 269,
      "end_line": 269,
      "comment": "\n         * The serialization version of this class\n         "
    },
    {
      "type": "field",
      "varNames": [
        "aggregateStatistics"
      ],
      "begin_line": 275,
      "end_line": 275,
      "comment": "\n         * An additional SummaryStatistics into which values added to these\n         * statistics (and possibly others) are aggregated\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics.AggregatingSummaryStatistics.AggregatingSummaryStatistics(org.apache.commons.math.stat.descriptive.SummaryStatistics)",
      "begin_line": 284,
      "end_line": 286,
      "comment": "\n         * Initializes a new AggregatingSummaryStatistics with the specified\n         * aggregate statistics object\n         *\n         * @param aggregateStatistics a {@code SummaryStatistics} into which\n         *      values added to this statistics object should be aggregated\n         ",
      "child_ranges": [
        "(line 285,col 13)-(line 285,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics.AggregatingSummaryStatistics.addValue(double)",
      "begin_line": 294,
      "end_line": 300,
      "comment": "\n         * {@inheritDoc}.  This version adds the provided value to the configured\n         * aggregate after adding it to these statistics.\n         *\n         * @see SummaryStatistics#addValue(double)\n         ",
      "child_ranges": [
        "(line 296,col 13)-(line 296,col 34)",
        "(line 297,col 13)-(line 299,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics.AggregatingSummaryStatistics.equals(java.lang.Object)",
      "begin_line": 309,
      "end_line": 320,
      "comment": "\n         * Returns true iff \u003ccode\u003eobject\u003c/code\u003e is a\n         * \u003ccode\u003eSummaryStatistics\u003c/code\u003e instance and all statistics have the\n         * same values as this.\n         * @param object the object to test equality against.\n         * @return true if object equals this\n         ",
      "child_ranges": [
        "(line 311,col 13)-(line 313,col 13)",
        "(line 314,col 13)-(line 316,col 13)",
        "(line 317,col 13)-(line 317,col 85)",
        "(line 318,col 13)-(line 319,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics.AggregatingSummaryStatistics.hashCode()",
      "begin_line": 326,
      "end_line": 329,
      "comment": "\n         * Returns hash code based on values of statistics\n         * @return hash code\n         ",
      "child_ranges": [
        "(line 328,col 13)-(line 328,col 75)"
      ]
    }
  ]
}