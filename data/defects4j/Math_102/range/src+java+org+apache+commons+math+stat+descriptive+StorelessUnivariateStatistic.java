{
  "filepath": "/tmp/Math-102b/src/java/org/apache/commons/math/stat/descriptive/StorelessUnivariateStatistic.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StorelessUnivariateStatistic",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.UnivariateStatistic"
      ],
      "begin_line": 29,
      "end_line": 78,
      "comment": "\n * Extends the definition of {@link UnivariateStatistic} with \n * {@link #increment} and {@link #incrementAll(double[])} methods for adding\n * values and updating internal state.  \n * \u003cp\u003e\n * This interface is designed to be used for calculating statistics that can be computed in \n * one pass through the data without storing the full array of sample values.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic.increment(double)",
      "begin_line": 35,
      "end_line": 35,
      "comment": "\n     * Updates the internal state of the statistic to reflect the addition of the new value.\n     * @param d  the new value.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic.incrementAll(double[])",
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * Updates the internal state of the statistic to reflect addition of\n     * all values in the values array.  Does not clear the statistic first --\n     * i.e., the values are added \u003cstrong\u003eincrementally\u003c/stong\u003e to the dataset.\n     * \n     * @param values  array holding the new values to add\n     * @throws IllegalArgumentException if the array is null\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic.incrementAll(double[], int, int)",
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     * Updates the internal state of the statistic to reflect addition of\n     * the values in the designated portion of the values array.  Does not\n     * clear the statistic first -- i.e., the values are added \n     * \u003cstrong\u003eincrementally\u003c/stong\u003e to the dataset.\n     * \n     * @param values  array holding the new values to add\n     * @param start  the array index of the first value to add\n     * @param length  the number of elements to add\n     * @throws IllegalArgumentException if the array is null or the index\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic.getResult()",
      "begin_line": 65,
      "end_line": 65,
      "comment": "\n     * Returns the current value of the Statistic.\n     * @return value of the statistic, \u003ccode\u003eDouble.NaN\u003c/code\u003e if it\n     * has been cleared or just instantiated.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic.getN()",
      "begin_line": 71,
      "end_line": 71,
      "comment": "\n     * Returns the number of values that have been added.\n     * @return the number of values.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic.clear()",
      "begin_line": 76,
      "end_line": 76,
      "comment": "\n     * Clears the internal state of the Statistic\n     ",
      "child_ranges": []
    }
  ]
}