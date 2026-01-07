{
  "filepath": "/tmp/Math-106b/src/java/org/apache/commons/math/stat/descriptive/UnivariateStatistic.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnivariateStatistic",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 48,
      "comment": "\n * Base evaluation interface implemented by all statistics.\n * \u003cp\u003e\n * Includes \"stateless\" \u003ccode\u003eevaluate\u003c/code\u003e methods that take\n * \u003ccode\u003edouble[]\u003c/code\u003e arrays as input and return the value of the statistic\n * applied to the input values.\n * \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.UnivariateStatistic.evaluate(double[])",
      "begin_line": 35,
      "end_line": 35,
      "comment": "\n     * Returns the result of evaluating the statistic over the input array.\n     * \n     * @param values input array\n     * @return the value of the statistic applied to the input array\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.UnivariateStatistic.evaluate(double[], int, int)",
      "begin_line": 46,
      "end_line": 46,
      "comment": "\n     * Returns the result of evaluating the statistic over the specified entries\n     * in the input array.\n     * \n     * @param values the input array\n     * @param begin the index of the first element to include\n     * @param length the number of elements to include\n     * @return the value of the statistic applied to the included array entries\n     ",
      "child_ranges": []
    }
  ]
}