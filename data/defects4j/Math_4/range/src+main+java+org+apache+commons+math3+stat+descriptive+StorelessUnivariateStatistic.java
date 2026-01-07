{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/stat/descriptive/StorelessUnivariateStatistic.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StorelessUnivariateStatistic",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.math3.stat.descriptive.UnivariateStatistic"
      ],
      "begin_line": 32,
      "end_line": 88,
      "comment": "\n * Extends the definition of {@link UnivariateStatistic} with\n * {@link #increment} and {@link #incrementAll(double[])} methods for adding\n * values and updating internal state.\n * \u003cp\u003e\n * This interface is designed to be used for calculating statistics that can be\n * computed in one pass through the data without storing the full array of\n * sample values.\u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic.increment(double)",
      "begin_line": 38,
      "end_line": 38,
      "comment": "\n     * Updates the internal state of the statistic to reflect the addition of the new value.\n     * @param d  the new value.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic.incrementAll(double[])",
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n     * Updates the internal state of the statistic to reflect addition of\n     * all values in the values array.  Does not clear the statistic first --\n     * i.e., the values are added \u003cstrong\u003eincrementally\u003c/strong\u003e to the dataset.\n     *\n     * @param values  array holding the new values to add\n     * @throws MathIllegalArgumentException if the array is null\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic.incrementAll(double[], int, int)",
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n     * Updates the internal state of the statistic to reflect addition of\n     * the values in the designated portion of the values array.  Does not\n     * clear the statistic first -- i.e., the values are added\n     * \u003cstrong\u003eincrementally\u003c/strong\u003e to the dataset.\n     *\n     * @param values  array holding the new values to add\n     * @param start  the array index of the first value to add\n     * @param length  the number of elements to add\n     * @throws MathIllegalArgumentException if the array is null or the index\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic.getResult()",
      "begin_line": 68,
      "end_line": 68,
      "comment": "\n     * Returns the current value of the Statistic.\n     * @return value of the statistic, \u003ccode\u003eDouble.NaN\u003c/code\u003e if it\n     * has been cleared or just instantiated.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic.getN()",
      "begin_line": 74,
      "end_line": 74,
      "comment": "\n     * Returns the number of values that have been added.\n     * @return the number of values.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic.clear()",
      "begin_line": 79,
      "end_line": 79,
      "comment": "\n     * Clears the internal state of the Statistic\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic.copy()",
      "begin_line": 86,
      "end_line": 86,
      "comment": "\n     * Returns a copy of the statistic with the same internal state.\n     *\n     * @return a copy of the statistic\n     ",
      "child_ranges": []
    }
  ]
}