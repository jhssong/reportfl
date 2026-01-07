{
  "filepath": "/tmp/Math-105b/src/java/org/apache/commons/math/stat/descriptive/DescriptiveStatisticsImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DescriptiveStatisticsImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.DescriptiveStatistics",
        "java.io.Serializable"
      ],
      "begin_line": 28,
      "end_line": 145,
      "comment": "\n * Default implementation of\n * {@link org.apache.commons.math.stat.descriptive.DescriptiveStatistics}.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "windowSize"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " hold the window size *"
    },
    {
      "type": "field",
      "varNames": [
        "eDA"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " \n     *  Stored data values\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsImpl.DescriptiveStatisticsImpl()",
      "begin_line": 44,
      "end_line": 46,
      "comment": "\n     * Construct a DescriptiveStatisticsImpl with infinite window\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsImpl.DescriptiveStatisticsImpl(int)",
      "begin_line": 52,
      "end_line": 56,
      "comment": "\n     * Construct a DescriptiveStatisticsImpl with finite window\n     * @param window the finite window size.\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 16)",
        "(line 54,col 9)-(line 54,col 41)",
        "(line 55,col 9)-(line 55,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsImpl.getWindowSize()",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * Access the window size.\n     * @return the current window size.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsImpl.getValues()",
      "begin_line": 69,
      "end_line": 79,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.DescriptiveStatistics#getValues()\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 64)",
        "(line 72,col 9)-(line 77,col 34)",
        "(line 78,col 9)-(line 78,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsImpl.getElement(int)",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.DescriptiveStatistics#getElement(int)\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsImpl.getN()",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.DescriptiveStatistics#getN()\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsImpl.addValue(double)",
      "begin_line": 98,
      "end_line": 108,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.DescriptiveStatistics#addValue(double)\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 107,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsImpl.clear()",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.DescriptiveStatistics#clear()\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsImpl.setWindowSize(int)",
      "begin_line": 120,
      "end_line": 135,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.DescriptiveStatistics#setWindowSize(int)\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 125,col 9)",
        "(line 127,col 9)-(line 127,col 37)",
        "(line 132,col 9)-(line 134,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsImpl.apply(org.apache.commons.math.stat.descriptive.UnivariateStatistic)",
      "begin_line": 142,
      "end_line": 144,
      "comment": "\n     * Apply the given statistic to this univariate collection.\n     * @param stat the statistic to apply\n     * @return the computed value of the statistic.\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 81)"
      ]
    }
  ]
}