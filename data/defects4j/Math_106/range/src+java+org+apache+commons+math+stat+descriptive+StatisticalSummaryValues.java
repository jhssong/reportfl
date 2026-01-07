{
  "filepath": "/tmp/Math-106b/src/java/org/apache/commons/math/stat/descriptive/StatisticalSummaryValues.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StatisticalSummaryValues",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable",
        "org.apache.commons.math.stat.descriptive.StatisticalSummary"
      ],
      "begin_line": 26,
      "end_line": 159,
      "comment": "\n *  Value object representing the results of a univariate statistical summary.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": " Serialization id "
    },
    {
      "type": "field",
      "varNames": [
        "mean"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " The sample mean "
    },
    {
      "type": "field",
      "varNames": [
        "variance"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " The sample variance "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " The number of observations in the sample "
    },
    {
      "type": "field",
      "varNames": [
        "max"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " The maximum value "
    },
    {
      "type": "field",
      "varNames": [
        "min"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " The minimum value "
    },
    {
      "type": "field",
      "varNames": [
        "sum"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " The sum of the sample values "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalSummaryValues.StatisticalSummaryValues(double, double, long, double, double, double)",
      "begin_line": 60,
      "end_line": 69,
      "comment": "\n      * Constructor\n      * \n      * @param mean  the sample mean\n      * @param variance  the sample variance\n      * @param n  the number of observations in the sample \n      * @param max  the maximum value\n      * @param min  the minimum value\n      * @param sum  the sum of the values\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 16)",
        "(line 63,col 9)-(line 63,col 25)",
        "(line 64,col 9)-(line 64,col 33)",
        "(line 65,col 9)-(line 65,col 19)",
        "(line 66,col 9)-(line 66,col 23)",
        "(line 67,col 9)-(line 67,col 23)",
        "(line 68,col 9)-(line 68,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalSummaryValues.getMax()",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n     * @return Returns the max.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalSummaryValues.getMean()",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * @return Returns the mean.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalSummaryValues.getMin()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * @return Returns the min.\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalSummaryValues.getN()",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\n     * @return Returns the number of values.\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalSummaryValues.getSum()",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\n     * @return Returns the sum.\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalSummaryValues.getStandardDeviation()",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n     * @return Returns the standard deviation\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalSummaryValues.getVariance()",
      "begin_line": 116,
      "end_line": 118,
      "comment": "\n     * @return Returns the variance.\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalSummaryValues.equals(java.lang.Object)",
      "begin_line": 128,
      "end_line": 142,
      "comment": "\n     * Returns true iff \u003ccode\u003eobject\u003c/code\u003e is a \n     * \u003ccode\u003eStatisticalSummaryValues\u003c/code\u003e instance and all statistics have\n     *  the same values as this.\n     * \n     * @param object the object to test equality against.\n     * @return true if object equals this\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 131,col 9)",
        "(line 132,col 9)-(line 134,col 9)",
        "(line 135,col 9)-(line 135,col 74)",
        "(line 136,col 9)-(line 141,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalSummaryValues.hashCode()",
      "begin_line": 149,
      "end_line": 157,
      "comment": "\n     * Returns hash code based on values of statistics\n     * \n     * @return hash code\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 51)",
        "(line 151,col 9)-(line 151,col 57)",
        "(line 152,col 9)-(line 152,col 56)",
        "(line 153,col 9)-(line 153,col 54)",
        "(line 154,col 9)-(line 154,col 56)",
        "(line 155,col 9)-(line 155,col 61)",
        "(line 156,col 9)-(line 156,col 22)"
      ]
    }
  ]
}