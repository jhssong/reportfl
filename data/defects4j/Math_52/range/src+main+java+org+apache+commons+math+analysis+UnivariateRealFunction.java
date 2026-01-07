{
  "filepath": "/tmp/Math-52b/src/main/java/org/apache/commons/math/analysis/UnivariateRealFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnivariateRealFunction",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 26,
      "end_line": 49,
      "comment": "\n * An interface representing a univariate real function.\n *\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealFunction.value(double)",
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n     * Compute the value of the function.\n     *\n     * @param x Point at which the function value should be computed.\n     * @return the value.\n     * @throws IllegalArgumentException when the activated method itself can\n     * ascertain that preconditions, specified in the API expressed at the\n     * level of the activated method, have been violated.  In the vast\n     * majority of cases where Commons-Math throws IllegalArgumentException,\n     * it is the result of argument checking of actual parameters immediately\n     * passed to a method.\n     * @throws MathUserException when the method may encounter errors during evaluation.\n     * This should be thrown only in circumstances where, at the level of the\n     * activated function, IllegalArgumentException is not appropriate and it\n     * should indicate that while formal preconditions of the method have not\n     * been violated, an irrecoverable error has occurred evaluating a\n     * function at some (usually lower) level of the call stack.\n     * Convergence failures, runtime exceptions (even IllegalArgumentException)\n     * in user code or lower level methods can cause (and should be wrapped in)\n     * a MathUserException.\n     ",
      "child_ranges": []
    }
  ]
}