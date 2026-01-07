{
  "filepath": "/tmp/Math-105b/src/java/org/apache/commons/math/stat/descriptive/SummaryStatisticsImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SummaryStatisticsImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.SummaryStatistics",
        "java.io.Serializable"
      ],
      "begin_line": 34,
      "end_line": 233,
      "comment": "\n * Provides a default {@link SummaryStatistics} implementation.\n *\n * @version $Revision$ $Date$  \n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " count of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "secondMoment"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " SecondMoment is used to compute the mean and variance "
    },
    {
      "type": "field",
      "varNames": [
        "sum"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " sum of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "sumsq"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " sum of the square of each value that has been added "
    },
    {
      "type": "field",
      "varNames": [
        "min"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " min of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "max"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " max of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "sumLog"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " sumLog of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "geoMean"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " geoMean of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "mean"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " mean of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "variance"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " variance of values that have been added "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatisticsImpl.SummaryStatisticsImpl()",
      "begin_line": 72,
      "end_line": 80,
      "comment": "\n     * Construct a SummaryStatistics\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 24)",
        "(line 74,col 9)-(line 74,col 35)",
        "(line 75,col 9)-(line 75,col 24)",
        "(line 76,col 9)-(line 76,col 24)",
        "(line 77,col 9)-(line 77,col 33)",
        "(line 78,col 9)-(line 78,col 38)",
        "(line 79,col 9)-(line 79,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatisticsImpl.addValue(double)",
      "begin_line": 87,
      "end_line": 96,
      "comment": "\n     * Add a value to the data\n     * \n     * @param value  the value to add\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 29)",
        "(line 89,col 9)-(line 89,col 31)",
        "(line 90,col 9)-(line 90,col 29)",
        "(line 91,col 9)-(line 91,col 29)",
        "(line 92,col 9)-(line 92,col 32)",
        "(line 93,col 9)-(line 93,col 33)",
        "(line 94,col 9)-(line 94,col 38)",
        "(line 95,col 9)-(line 95,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatisticsImpl.getN()",
      "begin_line": 102,
      "end_line": 104,
      "comment": " \n     * Returns the number of available values\n     * @return The number of available values\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatisticsImpl.getSum()",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n     * Returns the sum of the values that have been added to Univariate.\n     * @return The sum or Double.NaN if no values have been added\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatisticsImpl.getSumsq()",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\n     * Returns the sum of the squares of the values that have been added.\n     * \u003cp\u003e\n     *  Double.NaN is returned if no values have been added.\u003c/p\u003e\n     * \n     * @return The sum of squares\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatisticsImpl.getMean()",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\n     * Returns the mean of the values that have been added.\n     * \u003cp\u003e\n     *  Double.NaN is returned if no values have been added.\u003c/p\u003e\n     * \n     * @return the mean\n     ",
      "child_ranges": [
        "(line 133,col 7)-(line 133,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatisticsImpl.getStandardDeviation()",
      "begin_line": 143,
      "end_line": 153,
      "comment": "\n     * Returns the standard deviation of the values that have been added.\n     * \u003cp\u003e\n     *  Double.NaN is returned if no values have been added.\u003c/p\u003e\n     * \n     * @return the standard deviation\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 35)",
        "(line 145,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 152,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatisticsImpl.getVariance()",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\n     * Returns the variance of the values that have been added.\n     * \u003cp\u003e\n     *  Double.NaN is returned if no values have been added.\u003c/p\u003e\n     *\n     * @return the variance \n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatisticsImpl.getMax()",
      "begin_line": 173,
      "end_line": 175,
      "comment": "\n     * Returns the maximum of the values that have been added.\n     * \u003cp\u003e\n     *  Double.NaN is returned if no values have been added.\u003c/p\u003e\n     *\n     * @return the maximum  \n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatisticsImpl.getMin()",
      "begin_line": 184,
      "end_line": 186,
      "comment": "\n     * Returns the minimum of the values that have been added.\n     * \u003cp\u003e\n     *  Double.NaN is returned if no values have been added.\u003c/p\u003e\n     *\n     * @return the minimum  \n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatisticsImpl.getGeometricMean()",
      "begin_line": 195,
      "end_line": 197,
      "comment": "\n     * Returns the geometric mean of the values that have been added.\n     * \u003cp\u003e\n     *  Double.NaN is returned if no values have been added.\u003c/p\u003e\n     *\n     * @return the geometric mean  \n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatisticsImpl.toString()",
      "begin_line": 205,
      "end_line": 217,
      "comment": "\n     * Generates a text report displaying\n     * summary statistics from values that\n     * have been added.\n     * @return String with line feeds displaying statistics\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 52)",
        "(line 207,col 9)-(line 207,col 49)",
        "(line 208,col 9)-(line 208,col 48)",
        "(line 209,col 9)-(line 209,col 52)",
        "(line 210,col 9)-(line 210,col 52)",
        "(line 211,col 9)-(line 211,col 54)",
        "(line 212,col 9)-(line 212,col 73)",
        "(line 213,col 9)-(line 213,col 62)",
        "(line 214,col 9)-(line 214,col 65)",
        "(line 215,col 9)-(line 215,col 81)",
        "(line 216,col 9)-(line 216,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatisticsImpl.clear()",
      "begin_line": 222,
      "end_line": 231,
      "comment": " \n     * Resets all statistics and storage\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 19)",
        "(line 224,col 9)-(line 224,col 20)",
        "(line 225,col 9)-(line 225,col 20)",
        "(line 226,col 9)-(line 226,col 20)",
        "(line 227,col 9)-(line 227,col 23)",
        "(line 228,col 9)-(line 228,col 22)",
        "(line 229,col 9)-(line 229,col 24)",
        "(line 230,col 9)-(line 230,col 29)"
      ]
    }
  ]
}