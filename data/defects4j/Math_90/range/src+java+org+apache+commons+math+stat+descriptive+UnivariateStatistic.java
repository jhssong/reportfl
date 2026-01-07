{
  "filepath": "/tmp/Math-90b/src/java/org/apache/commons/math/stat/descriptive/UnivariateStatistic.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnivariateStatistic",
      "is_interface": true,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 26,
      "end_line": 54,
      "comment": "\n * Base interface implemented by all statistics.\n * \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.UnivariateStatistic.evaluate(double[])",
      "begin_line": 34,
      "end_line": 34,
      "comment": "\n     * Returns the result of evaluating the statistic over the input array.\n     * \n     * @param values input array\n     * @return the value of the statistic applied to the input array\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.UnivariateStatistic.evaluate(double[], int, int)",
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * Returns the result of evaluating the statistic over the specified entries\n     * in the input array.\n     * \n     * @param values the input array\n     * @param begin the index of the first element to include\n     * @param length the number of elements to include\n     * @return the value of the statistic applied to the included array entries\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.UnivariateStatistic.copy()",
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * Returns a copy of the statistic with the same internal state.\n     * \n     * @return a copy of the statistic\n     ",
      "child_ranges": []
    }
  ]
}