{
  "filepath": "/tmp/Math-105b/src/java/org/apache/commons/math/stat/descriptive/AbstractStorelessUnivariateStatistic.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractStorelessUnivariateStatistic",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic",
        "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic",
        "java.io.Serializable"
      ],
      "begin_line": 32,
      "end_line": 168,
      "comment": "\n *\n * Abstract implementation of the {@link StorelessUnivariateStatistic} interface.\n * \u003cp\u003e\n * Provides default \u003ccode\u003eevaluate()\u003c/code\u003e and \u003ccode\u003eincrementAll(double[])\u003ccode\u003e\n * implementations. \n * \u003cp\u003e\n * \u003cstrong\u003eNote that these implementations are not synchronized.\u003c/strong\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Serialization UID "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic.evaluate(double[])",
      "begin_line": 55,
      "end_line": 60,
      "comment": "\n     * This default implementation calls {@link #clear}, then invokes \n     * {@link #increment} in a loop over the the input array, and then uses \n     * {@link #getResult} to compute the return value.  \n     * \u003cp\u003e\n     * Note that this implementation changes the internal state of the\n     * statistic.  Its side effects are the same as invoking {@link #clear} and\n     * then {@link #incrementAll(double[])}.\n     * \u003cp\u003e\n     * Implementations may override this method with a more efficient \n     * implementation that works directly with the input array.\n     * \u003cp\u003e\n     * If the array is null, an IllegalArgumentException is thrown.\n     * \n     * @see org.apache.commons.math.stat.descriptive.UnivariateStatistic#evaluate(double[])\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 58,col 9)",
        "(line 59,col 9)-(line 59,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic.evaluate(double[], int, int)",
      "begin_line": 79,
      "end_line": 85,
      "comment": "\n     * This default implementation calls {@link #clear}, then invokes \n     * {@link #increment} in a loop over the specified portion of the input \n     * array, and then uses {@link #getResult} to compute the return value.  \n     * \u003cp\u003e\n     * Note that this implementation changes the internal state of the\n     * statistic.  Its side effects are the same as invoking {@link #clear} and\n     * then {@link #incrementAll(double[], int, int)}.\n     * \u003cp\u003e\n     * Implementations may override this method with a more efficient \n     * implementation that works directly with the input array.\n     * \u003cp\u003e\n     * If the array is null or the index parameters are not valid, an \n     * IllegalArgumentException is thrown.\n     * \n     * @see org.apache.commons.math.stat.descriptive.UnivariateStatistic#evaluate(double[], int, int)\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 84,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic.clear()",
      "begin_line": 90,
      "end_line": 90,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic#clear()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic.getResult()",
      "begin_line": 95,
      "end_line": 95,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic#getResult()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic.increment(double)",
      "begin_line": 100,
      "end_line": 100,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic#increment(double)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic.incrementAll(double[])",
      "begin_line": 112,
      "end_line": 117,
      "comment": "\n     * This default implementation just calls {@link #increment} in a loop over\n     * the input array.   \n     * \u003cp\u003e\n     * Throws IllegalArgumentException if the input values array is null.\n     * \n     * @param values values to add\n     * @throws IllegalArgumentException if values is null\n     * @see org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic#incrementAll(double[])\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 115,col 9)",
        "(line 116,col 9)-(line 116,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic.incrementAll(double[], int, int)",
      "begin_line": 131,
      "end_line": 138,
      "comment": "\n     * This default implementation just calls {@link #increment} in a loop over\n     * the specified portion of the input array.\n     * \u003cp\u003e\n     * Throws IllegalArgumentException if the input values array is null.\n     * \n     * @param values  array holding values to add\n     * @param begin   index of the first array element to add\n     * @param length  number of array elements to add\n     * @throws IllegalArgumentException if values is null\n     * @see org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic#incrementAll(double[], int, int)\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 137,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic.equals(java.lang.Object)",
      "begin_line": 147,
      "end_line": 157,
      "comment": "\n     * Returns true iff \u003ccode\u003eobject\u003c/code\u003e is an \n     * \u003ccode\u003eAbstractStorelessUnivariateStatistic\u003c/code\u003e returning the same\n     * values as this for \u003ccode\u003egetResult()\u003c/code\u003e and \u003ccode\u003egetN()\u003c/code\u003e\n     * @param object object to test equality against.\n     * @return true if object returns the same value as this\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 150,col 9)",
        "(line 151,col 8)-(line 153,col 9)",
        "(line 154,col 9)-(line 154,col 98)",
        "(line 155,col 9)-(line 156,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic.hashCode()",
      "begin_line": 164,
      "end_line": 166,
      "comment": "\n     * Returns hash code based on getResult() and getN()\n     * \n     * @return hash code\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 79)"
      ]
    }
  ]
}