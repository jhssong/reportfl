{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/stat/descriptive/AbstractStorelessUnivariateStatistic.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractStorelessUnivariateStatistic",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic",
        "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"
      ],
      "begin_line": 33,
      "end_line": 182,
      "comment": "\n *\n * Abstract implementation of the {@link StorelessUnivariateStatistic} interface.\n * \u003cp\u003e\n * Provides default \u003ccode\u003eevaluate()\u003c/code\u003e and \u003ccode\u003eincrementAll(double[])\u003ccode\u003e\n * implementations.\u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eNote that these implementations are not synchronized.\u003c/strong\u003e\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic.evaluate(double[])",
      "begin_line": 55,
      "end_line": 61,
      "comment": "\n     * This default implementation calls {@link #clear}, then invokes\n     * {@link #increment} in a loop over the the input array, and then uses\n     * {@link #getResult} to compute the return value.\n     * \u003cp\u003e\n     * Note that this implementation changes the internal state of the\n     * statistic.  Its side effects are the same as invoking {@link #clear} and\n     * then {@link #incrementAll(double[])}.\u003c/p\u003e\n     * \u003cp\u003e\n     * Implementations may override this method with a more efficient and\n     * possibly more accurate implementation that works directly with the\n     * input array.\u003c/p\u003e\n     * \u003cp\u003e\n     * If the array is null, an IllegalArgumentException is thrown.\u003c/p\u003e\n     * @param values input array\n     * @return the value of the statistic applied to the input array\n     * @see org.apache.commons.math.stat.descriptive.UnivariateStatistic#evaluate(double[])\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 59,col 9)",
        "(line 60,col 9)-(line 60,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic.evaluate(double[], int, int)",
      "begin_line": 84,
      "end_line": 91,
      "comment": "\n     * This default implementation calls {@link #clear}, then invokes\n     * {@link #increment} in a loop over the specified portion of the input\n     * array, and then uses {@link #getResult} to compute the return value.\n     * \u003cp\u003e\n     * Note that this implementation changes the internal state of the\n     * statistic.  Its side effects are the same as invoking {@link #clear} and\n     * then {@link #incrementAll(double[], int, int)}.\u003c/p\u003e\n     * \u003cp\u003e\n     * Implementations may override this method with a more efficient and\n     * possibly more accurate implementation that works directly with the\n     * input array.\u003c/p\u003e\n     * \u003cp\u003e\n     * If the array is null or the index parameters are not valid, an\n     * IllegalArgumentException is thrown.\u003c/p\u003e\n     * @param values the input array\n     * @param begin the index of the first element to include\n     * @param length the number of elements to include\n     * @return the value of the statistic applied to the included array entries\n     * @see org.apache.commons.math.stat.descriptive.UnivariateStatistic#evaluate(double[], int, int)\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 89,col 9)",
        "(line 90,col 9)-(line 90,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic.copy()",
      "begin_line": 96,
      "end_line": 97,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic.clear()",
      "begin_line": 102,
      "end_line": 102,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic.getResult()",
      "begin_line": 107,
      "end_line": 107,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic.increment(double)",
      "begin_line": 112,
      "end_line": 112,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic.incrementAll(double[])",
      "begin_line": 124,
      "end_line": 129,
      "comment": "\n     * This default implementation just calls {@link #increment} in a loop over\n     * the input array.\n     * \u003cp\u003e\n     * Throws IllegalArgumentException if the input values array is null.\u003c/p\u003e\n     *\n     * @param values values to add\n     * @throws IllegalArgumentException if values is null\n     * @see org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic#incrementAll(double[])\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 127,col 9)",
        "(line 128,col 9)-(line 128,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic.incrementAll(double[], int, int)",
      "begin_line": 143,
      "end_line": 150,
      "comment": "\n     * This default implementation just calls {@link #increment} in a loop over\n     * the specified portion of the input array.\n     * \u003cp\u003e\n     * Throws IllegalArgumentException if the input values array is null.\u003c/p\u003e\n     *\n     * @param values  array holding values to add\n     * @param begin   index of the first array element to add\n     * @param length  number of array elements to add\n     * @throws IllegalArgumentException if values is null\n     * @see org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic#incrementAll(double[], int, int)\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 149,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic.equals(java.lang.Object)",
      "begin_line": 159,
      "end_line": 170,
      "comment": "\n     * Returns true iff \u003ccode\u003eobject\u003c/code\u003e is an\n     * \u003ccode\u003eAbstractStorelessUnivariateStatistic\u003c/code\u003e returning the same\n     * values as this for \u003ccode\u003egetResult()\u003c/code\u003e and \u003ccode\u003egetN()\u003c/code\u003e\n     * @param object object to test equality against.\n     * @return true if object returns the same value as this\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 163,col 9)",
        "(line 164,col 8)-(line 166,col 9)",
        "(line 167,col 9)-(line 167,col 98)",
        "(line 168,col 9)-(line 169,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic.hashCode()",
      "begin_line": 177,
      "end_line": 180,
      "comment": "\n     * Returns hash code based on getResult() and getN()\n     *\n     * @return hash code\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 79)"
      ]
    }
  ]
}