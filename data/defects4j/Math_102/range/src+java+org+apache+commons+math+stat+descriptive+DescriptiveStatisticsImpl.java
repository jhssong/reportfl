{
  "filepath": "/tmp/Math-102b/src/java/org/apache/commons/math/stat/descriptive/DescriptiveStatisticsImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DescriptiveStatisticsImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.DescriptiveStatistics",
        "java.io.Serializable"
      ],
      "begin_line": 30,
      "end_line": 56,
      "comment": "\n * Default implementation of\n * {@link org.apache.commons.math.stat.descriptive.DescriptiveStatistics}.\n * \n * @deprecated to be removed in commons-math 2.0.  \n * Use {@link DescriptiveStatistics}\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Serializable version identifier "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsImpl.DescriptiveStatisticsImpl()",
      "begin_line": 38,
      "end_line": 40,
      "comment": "\n     * Construct a DescriptiveStatisticsImpl with infinite window\n     ",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsImpl.DescriptiveStatisticsImpl(int)",
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n     * Construct a DescriptiveStatisticsImpl with finite window\n     * @param window the finite window size.\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsImpl.clear()",
      "begin_line": 53,
      "end_line": 55,
      "comment": " \n     * Resets all statistics and storage\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 22)"
      ]
    }
  ]
}