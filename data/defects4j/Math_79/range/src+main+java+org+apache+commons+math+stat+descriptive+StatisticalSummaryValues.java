{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/stat/descriptive/StatisticalSummaryValues.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StatisticalSummaryValues",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable",
        "org.apache.commons.math.stat.descriptive.StatisticalSummary"
      ],
      "begin_line": 27,
      "end_line": 162,
      "comment": "\n *  Value object representing the results of a univariate statistical summary.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " Serialization id "
    },
    {
      "type": "field",
      "varNames": [
        "mean"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " The sample mean "
    },
    {
      "type": "field",
      "varNames": [
        "variance"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " The sample variance "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " The number of observations in the sample "
    },
    {
      "type": "field",
      "varNames": [
        "max"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " The maximum value "
    },
    {
      "type": "field",
      "varNames": [
        "min"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " The minimum value "
    },
    {
      "type": "field",
      "varNames": [
        "sum"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " The sum of the sample values "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalSummaryValues.StatisticalSummaryValues(double, double, long, double, double, double)",
      "begin_line": 61,
      "end_line": 70,
      "comment": "\n      * Constructor\n      *\n      * @param mean  the sample mean\n      * @param variance  the sample variance\n      * @param n  the number of observations in the sample\n      * @param max  the maximum value\n      * @param min  the minimum value\n      * @param sum  the sum of the values\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 16)",
        "(line 64,col 9)-(line 64,col 25)",
        "(line 65,col 9)-(line 65,col 33)",
        "(line 66,col 9)-(line 66,col 19)",
        "(line 67,col 9)-(line 67,col 23)",
        "(line 68,col 9)-(line 68,col 23)",
        "(line 69,col 9)-(line 69,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalSummaryValues.getMax()",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\n     * @return Returns the max.\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalSummaryValues.getMean()",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\n     * @return Returns the mean.\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalSummaryValues.getMin()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * @return Returns the min.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalSummaryValues.getN()",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * @return Returns the number of values.\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalSummaryValues.getSum()",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\n     * @return Returns the sum.\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalSummaryValues.getStandardDeviation()",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n     * @return Returns the standard deviation\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalSummaryValues.getVariance()",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\n     * @return Returns the variance.\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalSummaryValues.equals(java.lang.Object)",
      "begin_line": 129,
      "end_line": 144,
      "comment": "\n     * Returns true iff \u003ccode\u003eobject\u003c/code\u003e is a\n     * \u003ccode\u003eStatisticalSummaryValues\u003c/code\u003e instance and all statistics have\n     *  the same values as this.\n     *\n     * @param object the object to test equality against.\n     * @return true if object equals this\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 137,col 74)",
        "(line 138,col 9)-(line 143,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalSummaryValues.hashCode()",
      "begin_line": 151,
      "end_line": 160,
      "comment": "\n     * Returns hash code based on values of statistics\n     *\n     * @return hash code\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 51)",
        "(line 154,col 9)-(line 154,col 57)",
        "(line 155,col 9)-(line 155,col 56)",
        "(line 156,col 9)-(line 156,col 54)",
        "(line 157,col 9)-(line 157,col 56)",
        "(line 158,col 9)-(line 158,col 61)",
        "(line 159,col 9)-(line 159,col 22)"
      ]
    }
  ]
}