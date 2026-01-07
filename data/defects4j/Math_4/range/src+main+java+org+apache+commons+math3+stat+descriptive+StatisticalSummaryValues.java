{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/stat/descriptive/StatisticalSummaryValues.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StatisticalSummaryValues",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable",
        "org.apache.commons.math3.stat.descriptive.StatisticalSummary"
      ],
      "begin_line": 30,
      "end_line": 187,
      "comment": "\n *  Value object representing the results of a univariate statistical summary.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Serialization id "
    },
    {
      "type": "field",
      "varNames": [
        "mean"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " The sample mean "
    },
    {
      "type": "field",
      "varNames": [
        "variance"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " The sample variance "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " The number of observations in the sample "
    },
    {
      "type": "field",
      "varNames": [
        "max"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " The maximum value "
    },
    {
      "type": "field",
      "varNames": [
        "min"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " The minimum value "
    },
    {
      "type": "field",
      "varNames": [
        "sum"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " The sum of the sample values "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.StatisticalSummaryValues.StatisticalSummaryValues(double, double, long, double, double, double)",
      "begin_line": 64,
      "end_line": 73,
      "comment": "\n      * Constructor\n      *\n      * @param mean  the sample mean\n      * @param variance  the sample variance\n      * @param n  the number of observations in the sample\n      * @param max  the maximum value\n      * @param min  the minimum value\n      * @param sum  the sum of the values\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 16)",
        "(line 67,col 9)-(line 67,col 25)",
        "(line 68,col 9)-(line 68,col 33)",
        "(line 69,col 9)-(line 69,col 19)",
        "(line 70,col 9)-(line 70,col 23)",
        "(line 71,col 9)-(line 71,col 23)",
        "(line 72,col 9)-(line 72,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.StatisticalSummaryValues.getMax()",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * @return Returns the max.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.StatisticalSummaryValues.getMean()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * @return Returns the mean.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.StatisticalSummaryValues.getMin()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n     * @return Returns the min.\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.StatisticalSummaryValues.getN()",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * @return Returns the number of values.\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.StatisticalSummaryValues.getSum()",
      "begin_line": 106,
      "end_line": 108,
      "comment": "\n     * @return Returns the sum.\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.StatisticalSummaryValues.getStandardDeviation()",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\n     * @return Returns the standard deviation\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.StatisticalSummaryValues.getVariance()",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\n     * @return Returns the variance.\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.StatisticalSummaryValues.equals(java.lang.Object)",
      "begin_line": 132,
      "end_line": 147,
      "comment": "\n     * Returns true iff \u003ccode\u003eobject\u003c/code\u003e is a\n     * \u003ccode\u003eStatisticalSummaryValues\u003c/code\u003e instance and all statistics have\n     *  the same values as this.\n     *\n     * @param object the object to test equality against.\n     * @return true if object equals this\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 139,col 9)",
        "(line 140,col 9)-(line 140,col 74)",
        "(line 141,col 9)-(line 146,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.StatisticalSummaryValues.hashCode()",
      "begin_line": 154,
      "end_line": 163,
      "comment": "\n     * Returns hash code based on values of statistics\n     *\n     * @return hash code\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 51)",
        "(line 157,col 9)-(line 157,col 57)",
        "(line 158,col 9)-(line 158,col 56)",
        "(line 159,col 9)-(line 159,col 54)",
        "(line 160,col 9)-(line 160,col 56)",
        "(line 161,col 9)-(line 161,col 61)",
        "(line 162,col 9)-(line 162,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.StatisticalSummaryValues.toString()",
      "begin_line": 171,
      "end_line": 185,
      "comment": "\n     * Generates a text report displaying values of statistics.\n     * Each statistic is displayed on a separate line.\n     *\n     * @return String with line feeds displaying statistics\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 52)",
        "(line 174,col 9)-(line 174,col 27)",
        "(line 175,col 9)-(line 175,col 67)",
        "(line 176,col 9)-(line 176,col 60)",
        "(line 177,col 9)-(line 177,col 64)",
        "(line 178,col 9)-(line 178,col 64)",
        "(line 179,col 9)-(line 179,col 66)",
        "(line 180,col 9)-(line 181,col 26)",
        "(line 182,col 9)-(line 182,col 74)",
        "(line 183,col 9)-(line 183,col 64)",
        "(line 184,col 9)-(line 184,col 36)"
      ]
    }
  ]
}