{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/ode/FirstOrderDifferentialEquations.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FirstOrderDifferentialEquations",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 48,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderDifferentialEquations.getDimension()",
      "begin_line": 53,
      "end_line": 53,
      "comment": " Get the dimension of the problem.\n     * @return dimension of the problem\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderDifferentialEquations.computeDerivatives(double, double[], double[])",
      "begin_line": 62,
      "end_line": 62,
      "comment": " Get the current time derivative of the state vector.\n     * @param t current value of the independent \u003cI\u003etime\u003c/I\u003e variable\n     * @param y array containing the current value of the state vector\n     * @param yDot placeholder array where to put the time derivative of the state vector\n     * @throws DerivativeException this exception is propagated to the caller if the\n     * underlying user function triggers one\n     ",
      "child_ranges": []
    }
  ]
}