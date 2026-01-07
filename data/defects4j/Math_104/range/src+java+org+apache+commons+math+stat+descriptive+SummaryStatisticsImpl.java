{
  "filepath": "/tmp/Math-104b/src/java/org/apache/commons/math/stat/descriptive/SummaryStatisticsImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SummaryStatisticsImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.SummaryStatistics",
        "java.io.Serializable"
      ],
      "begin_line": 35,
      "end_line": 234,
      "comment": "\n * Provides a default {@link SummaryStatistics} implementation.\n *\n * @version $Revision$ $Date$  \n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " count of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "secondMoment"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " SecondMoment is used to compute the mean and variance "
    },
    {
      "type": "field",
      "varNames": [
        "sum"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " sum of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "sumsq"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " sum of the square of each value that has been added "
    },
    {
      "type": "field",
      "varNames": [
        "min"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " min of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "max"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " max of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "sumLog"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " sumLog of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "geoMean"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " geoMean of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "mean"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " mean of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "variance"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " variance of values that have been added "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatisticsImpl.SummaryStatisticsImpl()",
      "begin_line": 73,
      "end_line": 81,
      "comment": "\n     * Construct a SummaryStatistics\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 24)",
        "(line 75,col 9)-(line 75,col 35)",
        "(line 76,col 9)-(line 76,col 24)",
        "(line 77,col 9)-(line 77,col 24)",
        "(line 78,col 9)-(line 78,col 33)",
        "(line 79,col 9)-(line 79,col 38)",
        "(line 80,col 9)-(line 80,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatisticsImpl.addValue(double)",
      "begin_line": 88,
      "end_line": 97,
      "comment": "\n     * Add a value to the data\n     * \n     * @param value  the value to add\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 29)",
        "(line 90,col 9)-(line 90,col 31)",
        "(line 91,col 9)-(line 91,col 29)",
        "(line 92,col 9)-(line 92,col 29)",
        "(line 93,col 9)-(line 93,col 32)",
        "(line 94,col 9)-(line 94,col 33)",
        "(line 95,col 9)-(line 95,col 38)",
        "(line 96,col 9)-(line 96,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatisticsImpl.getN()",
      "begin_line": 103,
      "end_line": 105,
      "comment": " \n     * Returns the number of available values\n     * @return The number of available values\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatisticsImpl.getSum()",
      "begin_line": 111,
      "end_line": 113,
      "comment": "\n     * Returns the sum of the values that have been added to Univariate.\n     * @return The sum or Double.NaN if no values have been added\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatisticsImpl.getSumsq()",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\n     * Returns the sum of the squares of the values that have been added.\n     * \u003cp\u003e\n     *  Double.NaN is returned if no values have been added.\u003c/p\u003e\n     * \n     * @return The sum of squares\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatisticsImpl.getMean()",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\n     * Returns the mean of the values that have been added.\n     * \u003cp\u003e\n     *  Double.NaN is returned if no values have been added.\u003c/p\u003e\n     * \n     * @return the mean\n     ",
      "child_ranges": [
        "(line 134,col 7)-(line 134,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatisticsImpl.getStandardDeviation()",
      "begin_line": 144,
      "end_line": 154,
      "comment": "\n     * Returns the standard deviation of the values that have been added.\n     * \u003cp\u003e\n     *  Double.NaN is returned if no values have been added.\u003c/p\u003e\n     * \n     * @return the standard deviation\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 35)",
        "(line 146,col 9)-(line 152,col 9)",
        "(line 153,col 9)-(line 153,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatisticsImpl.getVariance()",
      "begin_line": 163,
      "end_line": 165,
      "comment": "\n     * Returns the variance of the values that have been added.\n     * \u003cp\u003e\n     *  Double.NaN is returned if no values have been added.\u003c/p\u003e\n     *\n     * @return the variance \n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatisticsImpl.getMax()",
      "begin_line": 174,
      "end_line": 176,
      "comment": "\n     * Returns the maximum of the values that have been added.\n     * \u003cp\u003e\n     *  Double.NaN is returned if no values have been added.\u003c/p\u003e\n     *\n     * @return the maximum  \n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatisticsImpl.getMin()",
      "begin_line": 185,
      "end_line": 187,
      "comment": "\n     * Returns the minimum of the values that have been added.\n     * \u003cp\u003e\n     *  Double.NaN is returned if no values have been added.\u003c/p\u003e\n     *\n     * @return the minimum  \n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatisticsImpl.getGeometricMean()",
      "begin_line": 196,
      "end_line": 198,
      "comment": "\n     * Returns the geometric mean of the values that have been added.\n     * \u003cp\u003e\n     *  Double.NaN is returned if no values have been added.\u003c/p\u003e\n     *\n     * @return the geometric mean  \n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatisticsImpl.toString()",
      "begin_line": 206,
      "end_line": 218,
      "comment": "\n     * Generates a text report displaying\n     * summary statistics from values that\n     * have been added.\n     * @return String with line feeds displaying statistics\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 52)",
        "(line 208,col 9)-(line 208,col 49)",
        "(line 209,col 9)-(line 209,col 48)",
        "(line 210,col 9)-(line 210,col 52)",
        "(line 211,col 9)-(line 211,col 52)",
        "(line 212,col 9)-(line 212,col 54)",
        "(line 213,col 9)-(line 213,col 73)",
        "(line 214,col 9)-(line 214,col 62)",
        "(line 215,col 9)-(line 215,col 65)",
        "(line 216,col 9)-(line 216,col 81)",
        "(line 217,col 9)-(line 217,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatisticsImpl.clear()",
      "begin_line": 223,
      "end_line": 232,
      "comment": " \n     * Resets all statistics and storage\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 19)",
        "(line 225,col 9)-(line 225,col 20)",
        "(line 226,col 9)-(line 226,col 20)",
        "(line 227,col 9)-(line 227,col 20)",
        "(line 228,col 9)-(line 228,col 23)",
        "(line 229,col 9)-(line 229,col 22)",
        "(line 230,col 9)-(line 230,col 24)",
        "(line 231,col 9)-(line 231,col 29)"
      ]
    }
  ]
}