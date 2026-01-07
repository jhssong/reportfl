{
  "filepath": "/tmp/Math-57b/src/main/java/org/apache/commons/math/stat/descriptive/StatisticalSummaryValues.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StatisticalSummaryValues",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable",
        "org.apache.commons.math.stat.descriptive.StatisticalSummary"
      ],
      "begin_line": 29,
      "end_line": 186,
      "comment": "\n *  Value object representing the results of a univariate statistical summary.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Serialization id "
    },
    {
      "type": "field",
      "varNames": [
        "mean"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " The sample mean "
    },
    {
      "type": "field",
      "varNames": [
        "variance"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " The sample variance "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " The number of observations in the sample "
    },
    {
      "type": "field",
      "varNames": [
        "max"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " The maximum value "
    },
    {
      "type": "field",
      "varNames": [
        "min"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " The minimum value "
    },
    {
      "type": "field",
      "varNames": [
        "sum"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " The sum of the sample values "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalSummaryValues.StatisticalSummaryValues(double, double, long, double, double, double)",
      "begin_line": 63,
      "end_line": 72,
      "comment": "\n      * Constructor\n      *\n      * @param mean  the sample mean\n      * @param variance  the sample variance\n      * @param n  the number of observations in the sample\n      * @param max  the maximum value\n      * @param min  the minimum value\n      * @param sum  the sum of the values\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 16)",
        "(line 66,col 9)-(line 66,col 25)",
        "(line 67,col 9)-(line 67,col 33)",
        "(line 68,col 9)-(line 68,col 19)",
        "(line 69,col 9)-(line 69,col 23)",
        "(line 70,col 9)-(line 70,col 23)",
        "(line 71,col 9)-(line 71,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalSummaryValues.getMax()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * @return Returns the max.\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalSummaryValues.getMean()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * @return Returns the mean.\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalSummaryValues.getMin()",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * @return Returns the min.\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalSummaryValues.getN()",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * @return Returns the number of values.\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalSummaryValues.getSum()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n     * @return Returns the sum.\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalSummaryValues.getStandardDeviation()",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\n     * @return Returns the standard deviation\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalSummaryValues.getVariance()",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\n     * @return Returns the variance.\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalSummaryValues.equals(java.lang.Object)",
      "begin_line": 131,
      "end_line": 146,
      "comment": "\n     * Returns true iff \u003ccode\u003eobject\u003c/code\u003e is a\n     * \u003ccode\u003eStatisticalSummaryValues\u003c/code\u003e instance and all statistics have\n     *  the same values as this.\n     *\n     * @param object the object to test equality against.\n     * @return true if object equals this\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 139,col 74)",
        "(line 140,col 9)-(line 145,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalSummaryValues.hashCode()",
      "begin_line": 153,
      "end_line": 162,
      "comment": "\n     * Returns hash code based on values of statistics\n     *\n     * @return hash code\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 51)",
        "(line 156,col 9)-(line 156,col 57)",
        "(line 157,col 9)-(line 157,col 56)",
        "(line 158,col 9)-(line 158,col 54)",
        "(line 159,col 9)-(line 159,col 56)",
        "(line 160,col 9)-(line 160,col 61)",
        "(line 161,col 9)-(line 161,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalSummaryValues.toString()",
      "begin_line": 170,
      "end_line": 184,
      "comment": "\n     * Generates a text report displaying values of statistics.\n     * Each statistic is displayed on a separate line.\n     *\n     * @return String with line feeds displaying statistics\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 52)",
        "(line 173,col 9)-(line 173,col 27)",
        "(line 174,col 9)-(line 174,col 67)",
        "(line 175,col 9)-(line 175,col 60)",
        "(line 176,col 9)-(line 176,col 64)",
        "(line 177,col 9)-(line 177,col 64)",
        "(line 178,col 9)-(line 178,col 66)",
        "(line 179,col 9)-(line 180,col 26)",
        "(line 181,col 9)-(line 181,col 74)",
        "(line 182,col 9)-(line 182,col 64)",
        "(line 183,col 9)-(line 183,col 36)"
      ]
    }
  ]
}