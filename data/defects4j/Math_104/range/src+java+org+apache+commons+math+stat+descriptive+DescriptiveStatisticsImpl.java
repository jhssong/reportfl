{
  "filepath": "/tmp/Math-104b/src/java/org/apache/commons/math/stat/descriptive/DescriptiveStatisticsImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DescriptiveStatisticsImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.DescriptiveStatistics",
        "java.io.Serializable"
      ],
      "begin_line": 29,
      "end_line": 146,
      "comment": "\n * Default implementation of\n * {@link org.apache.commons.math.stat.descriptive.DescriptiveStatistics}.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "windowSize"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " hold the window size *"
    },
    {
      "type": "field",
      "varNames": [
        "eDA"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " \n     *  Stored data values\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsImpl.DescriptiveStatisticsImpl()",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n     * Construct a DescriptiveStatisticsImpl with infinite window\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsImpl.DescriptiveStatisticsImpl(int)",
      "begin_line": 53,
      "end_line": 57,
      "comment": "\n     * Construct a DescriptiveStatisticsImpl with finite window\n     * @param window the finite window size.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 16)",
        "(line 55,col 9)-(line 55,col 41)",
        "(line 56,col 9)-(line 56,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsImpl.getWindowSize()",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * Access the window size.\n     * @return the current window size.\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsImpl.getValues()",
      "begin_line": 70,
      "end_line": 80,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.DescriptiveStatistics#getValues()\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 64)",
        "(line 73,col 9)-(line 78,col 34)",
        "(line 79,col 9)-(line 79,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsImpl.getElement(int)",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.DescriptiveStatistics#getElement(int)\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsImpl.getN()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.DescriptiveStatistics#getN()\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsImpl.addValue(double)",
      "begin_line": 99,
      "end_line": 109,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.DescriptiveStatistics#addValue(double)\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 108,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsImpl.clear()",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.DescriptiveStatistics#clear()\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsImpl.setWindowSize(int)",
      "begin_line": 121,
      "end_line": 136,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.DescriptiveStatistics#setWindowSize(int)\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 126,col 9)",
        "(line 128,col 9)-(line 128,col 37)",
        "(line 133,col 9)-(line 135,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsImpl.apply(org.apache.commons.math.stat.descriptive.UnivariateStatistic)",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\n     * Apply the given statistic to this univariate collection.\n     * @param stat the statistic to apply\n     * @return the computed value of the statistic.\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 81)"
      ]
    }
  ]
}