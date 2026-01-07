{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/stat/descriptive/WeightedEvaluation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "WeightedEvaluation",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 25,
      "end_line": 49,
      "comment": "\n * Weighted evaluation for statistics.\n *\n * @since 2.1\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.WeightedEvaluation.evaluate(double[], double[])",
      "begin_line": 35,
      "end_line": 35,
      "comment": "\n     * Returns the result of evaluating the statistic over the input array,\n     * using the supplied weights.\n     *\n     * @param values input array\n     * @param weights array of weights\n     * @return the value of the weighted statistic applied to the input array\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.WeightedEvaluation.evaluate(double[], double[], int, int)",
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n     * Returns the result of evaluating the statistic over the specified entries\n     * in the input array, using corresponding entries in the supplied weights array.\n     *\n     * @param values the input array\n     * @param weights array of weights\n     * @param begin the index of the first element to include\n     * @param length the number of elements to include\n     * @return the value of the weighted statistic applied to the included array entries\n     ",
      "child_ranges": []
    }
  ]
}