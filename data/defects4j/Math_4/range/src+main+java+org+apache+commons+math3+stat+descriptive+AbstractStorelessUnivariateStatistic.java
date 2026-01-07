{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/stat/descriptive/AbstractStorelessUnivariateStatistic.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractStorelessUnivariateStatistic",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic",
        "org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic"
      ],
      "begin_line": 36,
      "end_line": 188,
      "comment": "\n *\n * Abstract implementation of the {@link StorelessUnivariateStatistic} interface.\n * \u003cp\u003e\n * Provides default \u003ccode\u003eevaluate()\u003c/code\u003e and \u003ccode\u003eincrementAll(double[])\u003c/code\u003e\n * implementations.\u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eNote that these implementations are not synchronized.\u003c/strong\u003e\u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.AbstractStorelessUnivariateStatistic.evaluate(double[])",
      "begin_line": 59,
      "end_line": 65,
      "comment": "\n     * This default implementation calls {@link #clear}, then invokes\n     * {@link #increment} in a loop over the the input array, and then uses\n     * {@link #getResult} to compute the return value.\n     * \u003cp\u003e\n     * Note that this implementation changes the internal state of the\n     * statistic.  Its side effects are the same as invoking {@link #clear} and\n     * then {@link #incrementAll(double[])}.\u003c/p\u003e\n     * \u003cp\u003e\n     * Implementations may override this method with a more efficient and\n     * possibly more accurate implementation that works directly with the\n     * input array.\u003c/p\u003e\n     * \u003cp\u003e\n     * If the array is null, a MathIllegalArgumentException is thrown.\u003c/p\u003e\n     * @param values input array\n     * @return the value of the statistic applied to the input array\n     * @throws MathIllegalArgumentException if values is null\n     * @see org.apache.commons.math3.stat.descriptive.UnivariateStatistic#evaluate(double[])\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 63,col 9)",
        "(line 64,col 9)-(line 64,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.AbstractStorelessUnivariateStatistic.evaluate(double[], int, int)",
      "begin_line": 89,
      "end_line": 97,
      "comment": "\n     * This default implementation calls {@link #clear}, then invokes\n     * {@link #increment} in a loop over the specified portion of the input\n     * array, and then uses {@link #getResult} to compute the return value.\n     * \u003cp\u003e\n     * Note that this implementation changes the internal state of the\n     * statistic.  Its side effects are the same as invoking {@link #clear} and\n     * then {@link #incrementAll(double[], int, int)}.\u003c/p\u003e\n     * \u003cp\u003e\n     * Implementations may override this method with a more efficient and\n     * possibly more accurate implementation that works directly with the\n     * input array.\u003c/p\u003e\n     * \u003cp\u003e\n     * If the array is null or the index parameters are not valid, an\n     * MathIllegalArgumentException is thrown.\u003c/p\u003e\n     * @param values the input array\n     * @param begin the index of the first element to include\n     * @param length the number of elements to include\n     * @return the value of the statistic applied to the included array entries\n     * @throws MathIllegalArgumentException if the array is null or the indices are not valid\n     * @see org.apache.commons.math3.stat.descriptive.UnivariateStatistic#evaluate(double[], int, int)\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 95,col 9)",
        "(line 96,col 9)-(line 96,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.AbstractStorelessUnivariateStatistic.copy()",
      "begin_line": 102,
      "end_line": 103,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.AbstractStorelessUnivariateStatistic.clear()",
      "begin_line": 108,
      "end_line": 108,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.AbstractStorelessUnivariateStatistic.getResult()",
      "begin_line": 113,
      "end_line": 113,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.AbstractStorelessUnivariateStatistic.increment(double)",
      "begin_line": 118,
      "end_line": 118,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.AbstractStorelessUnivariateStatistic.incrementAll(double[])",
      "begin_line": 130,
      "end_line": 135,
      "comment": "\n     * This default implementation just calls {@link #increment} in a loop over\n     * the input array.\n     * \u003cp\u003e\n     * Throws IllegalArgumentException if the input values array is null.\u003c/p\u003e\n     *\n     * @param values values to add\n     * @throws MathIllegalArgumentException if values is null\n     * @see org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic#incrementAll(double[])\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 134,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.AbstractStorelessUnivariateStatistic.incrementAll(double[], int, int)",
      "begin_line": 149,
      "end_line": 156,
      "comment": "\n     * This default implementation just calls {@link #increment} in a loop over\n     * the specified portion of the input array.\n     * \u003cp\u003e\n     * Throws IllegalArgumentException if the input values array is null.\u003c/p\u003e\n     *\n     * @param values  array holding values to add\n     * @param begin   index of the first array element to add\n     * @param length  number of array elements to add\n     * @throws MathIllegalArgumentException if values is null\n     * @see org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic#incrementAll(double[], int, int)\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 155,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.AbstractStorelessUnivariateStatistic.equals(java.lang.Object)",
      "begin_line": 165,
      "end_line": 176,
      "comment": "\n     * Returns true iff \u003ccode\u003eobject\u003c/code\u003e is an\n     * \u003ccode\u003eAbstractStorelessUnivariateStatistic\u003c/code\u003e returning the same\n     * values as this for \u003ccode\u003egetResult()\u003c/code\u003e and \u003ccode\u003egetN()\u003c/code\u003e\n     * @param object object to test equality against.\n     * @return true if object returns the same value as this\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 169,col 9)",
        "(line 170,col 8)-(line 172,col 9)",
        "(line 173,col 9)-(line 173,col 98)",
        "(line 174,col 9)-(line 175,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.AbstractStorelessUnivariateStatistic.hashCode()",
      "begin_line": 183,
      "end_line": 186,
      "comment": "\n     * Returns hash code based on getResult() and getN()\n     *\n     * @return hash code\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 79)"
      ]
    }
  ]
}