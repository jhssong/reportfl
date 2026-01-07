{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/optimization/fitting/ParametricRealFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ParametricRealFunction",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 50,
      "comment": "\n * An interface representing a real function that depends on one independent\n * variable plus some extra parameters.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.ParametricRealFunction.value(double, double[])",
      "begin_line": 37,
      "end_line": 38,
      "comment": "\n     * Compute the value of the function.\n     * @param x the point for which the function value should be computed\n     * @param parameters function parameters\n     * @return the value\n     * @throws FunctionEvaluationException if the function evaluation fails\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.ParametricRealFunction.gradient(double, double[])",
      "begin_line": 47,
      "end_line": 48,
      "comment": "\n     * Compute the gradient of the function with respect to its parameters.\n     * @param x the point for which the function value should be computed\n     * @param parameters function parameters\n     * @return the value\n     * @throws FunctionEvaluationException if the function evaluation fails\n     ",
      "child_ranges": []
    }
  ]
}