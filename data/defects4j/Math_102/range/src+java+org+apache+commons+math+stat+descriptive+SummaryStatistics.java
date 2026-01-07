{
  "filepath": "/tmp/Math-102b/src/java/org/apache/commons/math/stat/descriptive/SummaryStatistics.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SummaryStatistics",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.StatisticalSummary",
        "java.io.Serializable"
      ],
      "begin_line": 54,
      "end_line": 584,
      "comment": "\n * \u003cp\u003eComputes summary statistics for a stream of data values added using the \n * {@link #addValue(double) addValue} method. The data values are not stored in\n * memory, so this class can be used to compute statistics for very large\n * data streams.\u003c/p\u003e\n * \n * \u003cp\u003eThe {@link StorelessUnivariateStatistic} instances used to maintain\n * summary state and compute statistics are configurable via setters.\n * For example, the default implementation for the variance can be overridden by\n * calling {@link #setVarianceImpl(StorelessUnivariateStatistic)}. Actual\n * parameters to these methods must implement the \n * {@link StorelessUnivariateStatistic} interface and configuration must be\n * completed before \u003ccode\u003eaddValue\u003c/code\u003e is called. No configuration is\n * necessary to use the default, commons-math provided implementations.\u003c/p\u003e\n * \n * \u003cp\u003eNote: This class is not thread-safe. Use \n * {@link SynchronizedSummaryStatistics} if concurrent access from multiple\n * threads is required.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Serialization UID "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance(java.lang.Class)",
      "begin_line": 71,
      "end_line": 74,
      "comment": "\n     * Create an instance of a \u003ccode\u003eSummaryStatistics\u003c/code\u003e\n     * \n     * @param cls the type of \u003ccode\u003eSummaryStatistics\u003c/code\u003e object to\n     *        create. \n     * @return a new instance. \n     * @deprecated to be removed in commons-math 2.0\n     * @throws InstantiationException is thrown if the object can not be\n     *            created.\n     * @throws IllegalAccessException is thrown if the type\u0027s default\n     *            constructor is not accessible.\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance()",
      "begin_line": 82,
      "end_line": 93,
      "comment": "\n     * Create an instance of a \u003ccode\u003eSummaryStatistics\u003c/code\u003e\n     * \n     * @return a new SummaryStatistics instance.\n     * @deprecated to be removed in commons-math 2.0 \n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 42)",
        "(line 84,col 9)-(line 91,col 9)",
        "(line 92,col 9)-(line 92,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.SummaryStatistics()",
      "begin_line": 98,
      "end_line": 99,
      "comment": "\n     * Construct a SummaryStatistics instance\n     ",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " count of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "secondMoment"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": " SecondMoment is used to compute the mean and variance "
    },
    {
      "type": "field",
      "varNames": [
        "sum"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": " sum of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "sumsq"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": " sum of the square of each value that has been added "
    },
    {
      "type": "field",
      "varNames": [
        "min"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": " min of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "max"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": " max of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "sumLog"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": " sumLog of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "geoMean"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": " geoMean of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "mean"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": " mean of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "variance"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": " variance of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "sumImpl"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": "  Statistics implementations - can be reset by setters "
    },
    {
      "type": "field",
      "varNames": [
        "sumsqImpl"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "minImpl"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxImpl"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sumLogImpl"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "geoMeanImpl"
      ],
      "begin_line": 137,
      "end_line": 137,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "meanImpl"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "varianceImpl"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getSummary()",
      "begin_line": 147,
      "end_line": 150,
      "comment": "\n     * Return a {@link StatisticalSummaryValues} instance reporting current\n     * statistics.\n     * \n     * @return Current values of statistics \n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 149,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue(double)",
      "begin_line": 157,
      "end_line": 174,
      "comment": "\n     * Add a value to the data\n     * \n     * @param value  the value to add\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 33)",
        "(line 159,col 9)-(line 159,col 35)",
        "(line 160,col 9)-(line 160,col 33)",
        "(line 161,col 9)-(line 161,col 33)",
        "(line 162,col 9)-(line 162,col 36)",
        "(line 163,col 9)-(line 163,col 33)",
        "(line 164,col 9)-(line 164,col 38)",
        "(line 167,col 9)-(line 169,col 9)",
        "(line 170,col 9)-(line 172,col 9)",
        "(line 173,col 9)-(line 173,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getN()",
      "begin_line": 180,
      "end_line": 182,
      "comment": " \n     * Returns the number of available values\n     * @return The number of available values\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getSum()",
      "begin_line": 188,
      "end_line": 190,
      "comment": "\n     * Returns the sum of the values that have been added\n     * @return The sum or \u003ccode\u003eDouble.NaN\u003c/code\u003e if no values have been added\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getSumsq()",
      "begin_line": 199,
      "end_line": 201,
      "comment": "\n     * Returns the sum of the squares of the values that have been added.\n     * \u003cp\u003e\n     *  Double.NaN is returned if no values have been added.\u003c/p\u003e\n     * \n     * @return The sum of squares\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getMean()",
      "begin_line": 210,
      "end_line": 216,
      "comment": "\n     * Returns the mean of the values that have been added.\n     * \u003cp\u003e\n     *  Double.NaN is returned if no values have been added.\u003c/p\u003e\n     * \n     * @return the mean\n     ",
      "child_ranges": [
        "(line 211,col 7)-(line 215,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getStandardDeviation()",
      "begin_line": 225,
      "end_line": 235,
      "comment": "\n     * Returns the standard deviation of the values that have been added.\n     * \u003cp\u003e\n     *  Double.NaN is returned if no values have been added.\u003c/p\u003e\n     * \n     * @return the standard deviation\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 35)",
        "(line 227,col 9)-(line 233,col 9)",
        "(line 234,col 9)-(line 234,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getVariance()",
      "begin_line": 244,
      "end_line": 250,
      "comment": "\n     * Returns the variance of the values that have been added.\n     * \u003cp\u003e\n     *  Double.NaN is returned if no values have been added.\u003c/p\u003e\n     *\n     * @return the variance \n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 249,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getMax()",
      "begin_line": 259,
      "end_line": 261,
      "comment": "\n     * Returns the maximum of the values that have been added.\n     * \u003cp\u003e\n     *  Double.NaN is returned if no values have been added.\u003c/p\u003e\n     *\n     * @return the maximum  \n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getMin()",
      "begin_line": 270,
      "end_line": 272,
      "comment": "\n     * Returns the minimum of the values that have been added.\n     * \u003cp\u003e\n     *  Double.NaN is returned if no values have been added.\u003c/p\u003e\n     *\n     * @return the minimum  \n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getGeometricMean()",
      "begin_line": 281,
      "end_line": 283,
      "comment": "\n     * Returns the geometric mean of the values that have been added.\n     * \u003cp\u003e\n     *  Double.NaN is returned if no values have been added.\u003c/p\u003e\n     *\n     * @return the geometric mean  \n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.toString()",
      "begin_line": 291,
      "end_line": 303,
      "comment": "\n     * Generates a text report displaying\n     * summary statistics from values that\n     * have been added.\n     * @return String with line feeds displaying statistics\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 52)",
        "(line 293,col 9)-(line 293,col 49)",
        "(line 294,col 9)-(line 294,col 48)",
        "(line 295,col 9)-(line 295,col 52)",
        "(line 296,col 9)-(line 296,col 52)",
        "(line 297,col 9)-(line 297,col 54)",
        "(line 298,col 9)-(line 298,col 73)",
        "(line 299,col 9)-(line 299,col 62)",
        "(line 300,col 9)-(line 300,col 65)",
        "(line 301,col 9)-(line 301,col 81)",
        "(line 302,col 9)-(line 302,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.clear()",
      "begin_line": 308,
      "end_line": 323,
      "comment": " \n     * Resets all statistics and storage\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 19)",
        "(line 310,col 9)-(line 310,col 24)",
        "(line 311,col 9)-(line 311,col 24)",
        "(line 312,col 9)-(line 312,col 24)",
        "(line 313,col 9)-(line 313,col 27)",
        "(line 314,col 9)-(line 314,col 26)",
        "(line 315,col 9)-(line 315,col 28)",
        "(line 316,col 9)-(line 316,col 29)",
        "(line 317,col 9)-(line 319,col 9)",
        "(line 320,col 9)-(line 322,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.equals(java.lang.Object)",
      "begin_line": 331,
      "end_line": 348,
      "comment": "\n     * Returns true iff \u003ccode\u003eobject\u003c/code\u003e is a \u003ccode\u003eSummaryStatistics\u003c/code\u003e\n     * instance and all statistics have the same values as this.\n     * @param object the object to test equality against.\n     * @return true if object equals this\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 334,col 9)",
        "(line 335,col 9)-(line 337,col 9)",
        "(line 338,col 9)-(line 338,col 60)",
        "(line 339,col 9)-(line 347,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.hashCode()",
      "begin_line": 355,
      "end_line": 366,
      "comment": "\n     * Returns hash code based on values of statistics\n     * \n     * @return hash code\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 61)",
        "(line 357,col 9)-(line 357,col 66)",
        "(line 358,col 9)-(line 358,col 56)",
        "(line 359,col 9)-(line 359,col 57)",
        "(line 360,col 9)-(line 360,col 56)",
        "(line 361,col 9)-(line 361,col 54)",
        "(line 362,col 9)-(line 362,col 56)",
        "(line 363,col 9)-(line 363,col 58)",
        "(line 364,col 9)-(line 364,col 61)",
        "(line 365,col 9)-(line 365,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getSumImpl()",
      "begin_line": 374,
      "end_line": 376,
      "comment": "\n     * Returns the currently configured Sum implementation\n     * \n     * @return the StorelessUnivariateStatistic implementing the sum\n     ",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.setSumImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 389,
      "end_line": 392,
      "comment": "\n     * \u003cp\u003eSets the implementation for the Sum.\u003c/p\u003e\n     * \u003cp\u003eThis method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double) addValue} has been used to add data; \n     * otherwise an IllegalStateException will be thrown.\u003c/p\u003e\n     * \n     * @param sumImpl the StorelessUnivariateStatistic instance to use\n     * for computing the Sum\n     * @throws IllegalStateException if data has already been added\n     *  (i.e if n \u003e 0)\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 21)",
        "(line 391,col 9)-(line 391,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getSumsqImpl()",
      "begin_line": 399,
      "end_line": 401,
      "comment": "\n     * Returns the currently configured sum of squares implementation\n     * \n     * @return the StorelessUnivariateStatistic implementing the sum of squares\n     ",
      "child_ranges": [
        "(line 400,col 9)-(line 400,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.setSumsqImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 414,
      "end_line": 418,
      "comment": "\n     * \u003cp\u003eSets the implementation for the sum of squares.\u003c/p\u003e\n     * \u003cp\u003eThis method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double) addValue} has been used to add data; \n     * otherwise an IllegalStateException will be thrown.\u003c/p\u003e\n     * \n     * @param sumsqImpl the StorelessUnivariateStatistic instance to use\n     * for computing the sum of squares\n     * @throws IllegalStateException if data has already been added\n     *  (i.e if n \u003e 0)\n     ",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 21)",
        "(line 417,col 9)-(line 417,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getMinImpl()",
      "begin_line": 425,
      "end_line": 427,
      "comment": "\n     * Returns the currently configured minimum implementation\n     * \n     * @return the StorelessUnivariateStatistic implementing the minimum\n     ",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.setMinImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 440,
      "end_line": 443,
      "comment": "\n     * \u003cp\u003eSets the implementation for the minimum.\u003c/p\u003e\n     * \u003cp\u003eThis method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double) addValue} has been used to add data; \n     * otherwise an IllegalStateException will be thrown.\u003c/p\u003e\n     * \n     * @param minImpl the StorelessUnivariateStatistic instance to use\n     * for computing the minimum\n     * @throws IllegalStateException if data has already been added\n     *  (i.e if n \u003e 0)\n     ",
      "child_ranges": [
        "(line 441,col 9)-(line 441,col 21)",
        "(line 442,col 9)-(line 442,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getMaxImpl()",
      "begin_line": 450,
      "end_line": 452,
      "comment": "\n     * Returns the currently configured maximum implementation\n     * \n     * @return the StorelessUnivariateStatistic implementing the maximum\n     ",
      "child_ranges": [
        "(line 451,col 9)-(line 451,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.setMaxImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 465,
      "end_line": 468,
      "comment": "\n     * \u003cp\u003eSets the implementation for the maximum.\u003c/p\u003e\n     * \u003cp\u003eThis method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double) addValue} has been used to add data; \n     * otherwise an IllegalStateException will be thrown.\u003c/p\u003e\n     * \n     * @param maxImpl the StorelessUnivariateStatistic instance to use\n     * for computing the maximum\n     * @throws IllegalStateException if data has already been added\n     *  (i.e if n \u003e 0)\n     ",
      "child_ranges": [
        "(line 466,col 9)-(line 466,col 21)",
        "(line 467,col 9)-(line 467,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getSumLogImpl()",
      "begin_line": 475,
      "end_line": 477,
      "comment": "\n     * Returns the currently configured sum of logs implementation\n     * \n     * @return the StorelessUnivariateStatistic implementing the log sum\n     ",
      "child_ranges": [
        "(line 476,col 9)-(line 476,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.setSumLogImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 490,
      "end_line": 494,
      "comment": "\n     * \u003cp\u003eSets the implementation for the sum of logs.\u003c/p\u003e\n     * \u003cp\u003eThis method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double) addValue} has been used to add data; \n     * otherwise an IllegalStateException will be thrown.\u003c/p\u003e\n     * \n     * @param sumLogImpl the StorelessUnivariateStatistic instance to use\n     * for computing the log sum\n     * @throws IllegalStateException if data has already been added \n     *  (i.e if n \u003e 0)\n     ",
      "child_ranges": [
        "(line 492,col 9)-(line 492,col 21)",
        "(line 493,col 9)-(line 493,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getGeoMeanImpl()",
      "begin_line": 501,
      "end_line": 503,
      "comment": "\n     * Returns the currently configured geometric mean implementation\n     * \n     * @return the StorelessUnivariateStatistic implementing the geometric mean\n     ",
      "child_ranges": [
        "(line 502,col 9)-(line 502,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.setGeoMeanImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 516,
      "end_line": 520,
      "comment": "\n     * \u003cp\u003eSets the implementation for the geometric mean.\u003c/p\u003e\n     * \u003cp\u003eThis method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double) addValue} has been used to add data; \n     * otherwise an IllegalStateException will be thrown.\u003c/p\u003e\n     * \n     * @param geoMeanImpl the StorelessUnivariateStatistic instance to use\n     * for computing the geometric mean\n     * @throws IllegalStateException if data has already been added\n     *  (i.e if n \u003e 0)\n     ",
      "child_ranges": [
        "(line 518,col 9)-(line 518,col 21)",
        "(line 519,col 9)-(line 519,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getMeanImpl()",
      "begin_line": 527,
      "end_line": 529,
      "comment": "\n     * Returns the currently configured mean implementation\n     * \n     * @return the StorelessUnivariateStatistic implementing the mean\n     ",
      "child_ranges": [
        "(line 528,col 9)-(line 528,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.setMeanImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 542,
      "end_line": 546,
      "comment": "\n     * \u003cp\u003eSets the implementation for the mean.\u003c/p\u003e\n     * \u003cp\u003eThis method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double) addValue} has been used to add data; \n     * otherwise an IllegalStateException will be thrown.\u003c/p\u003e\n     * \n     * @param meanImpl the StorelessUnivariateStatistic instance to use\n     * for computing the mean\n     * @throws IllegalStateException if data has already been added\n     *  (i.e if n \u003e 0)\n     ",
      "child_ranges": [
        "(line 544,col 9)-(line 544,col 21)",
        "(line 545,col 9)-(line 545,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getVarianceImpl()",
      "begin_line": 553,
      "end_line": 555,
      "comment": "\n     * Returns the currently configured variance implementation\n     * \n     * @return the StorelessUnivariateStatistic implementing the variance\n     ",
      "child_ranges": [
        "(line 554,col 9)-(line 554,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.setVarianceImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 568,
      "end_line": 572,
      "comment": "\n     * \u003cp\u003eSets the implementation for the variance.\u003c/p\u003e\n     * \u003cp\u003eThis method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double) addValue} has been used to add data; \n     * otherwise an IllegalStateException will be thrown.\u003c/p\u003e\n     * \n     * @param varianceImpl the StorelessUnivariateStatistic instance to use\n     * for computing the variance\n     * @throws IllegalStateException if data has already been added\n     *  (i.e if n \u003e 0)\n     ",
      "child_ranges": [
        "(line 570,col 9)-(line 570,col 21)",
        "(line 571,col 9)-(line 571,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.checkEmpty()",
      "begin_line": 577,
      "end_line": 582,
      "comment": "\n     * Throws IllegalStateException if n \u003e 0.\n     ",
      "child_ranges": [
        "(line 578,col 9)-(line 581,col 9)"
      ]
    }
  ]
}