{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/stat/descriptive/UnivariateStatistic.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnivariateStatistic",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.math3.util.MathArrays.Function"
      ],
      "begin_line": 28,
      "end_line": 56,
      "comment": "\n * Base interface implemented by all statistics.\n *\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.UnivariateStatistic.evaluate(double[])",
      "begin_line": 36,
      "end_line": 36,
      "comment": "\n     * Returns the result of evaluating the statistic over the input array.\n     *\n     * @param values input array\n     * @return the value of the statistic applied to the input array\n     * @throws MathIllegalArgumentException  if values is null\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.UnivariateStatistic.evaluate(double[], int, int)",
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n     * Returns the result of evaluating the statistic over the specified entries\n     * in the input array.\n     *\n     * @param values the input array\n     * @param begin the index of the first element to include\n     * @param length the number of elements to include\n     * @return the value of the statistic applied to the included array entries\n     * @throws MathIllegalArgumentException if values is null or the indices are invalid\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.UnivariateStatistic.copy()",
      "begin_line": 55,
      "end_line": 55,
      "comment": "\n     * Returns a copy of the statistic with the same internal state.\n     *\n     * @return a copy of the statistic\n     ",
      "child_ranges": []
    }
  ]
}