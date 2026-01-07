{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/stat/descriptive/WeightedEvaluation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "WeightedEvaluation",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 58,
      "comment": "\n * Weighted evaluation for statistics.\n *\n * @since 2.1\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.WeightedEvaluation.evaluate(double[], double[])",
      "begin_line": 40,
      "end_line": 40,
      "comment": "\n     * Returns the result of evaluating the statistic over the input array,\n     * using the supplied weights.\n     *\n     * @param values input array\n     * @param weights array of weights\n     * @return the value of the weighted statistic applied to the input array\n     * @throws MathIllegalArgumentException if either array is null, lengths\n     * do not match, weights contain NaN, negative or infinite values, or\n     * weights does not include at least on positive value\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.WeightedEvaluation.evaluate(double[], double[], int, int)",
      "begin_line": 55,
      "end_line": 56,
      "comment": "\n     * Returns the result of evaluating the statistic over the specified entries\n     * in the input array, using corresponding entries in the supplied weights array.\n     *\n     * @param values the input array\n     * @param weights array of weights\n     * @param begin the index of the first element to include\n     * @param length the number of elements to include\n     * @return the value of the weighted statistic applied to the included array entries\n     * @throws MathIllegalArgumentException if either array is null, lengths\n     * do not match, indices are invalid, weights contain NaN, negative or\n     * infinite values, or weights does not include at least on positive value\n     ",
      "child_ranges": []
    }
  ]
}