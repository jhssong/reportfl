{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/ode/SecondOrderDifferentialEquations.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SecondOrderDifferentialEquations",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 47,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.SecondOrderDifferentialEquations.getDimension()",
      "begin_line": 52,
      "end_line": 52,
      "comment": " Get the dimension of the problem.\n     * @return dimension of the problem\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.SecondOrderDifferentialEquations.computeSecondDerivatives(double, double[], double[], double[])",
      "begin_line": 64,
      "end_line": 65,
      "comment": " Get the current time derivative of the state vector.\n     * @param t current value of the independent \u003cI\u003etime\u003c/I\u003e variable\n     * @param y array containing the current value of the state vector\n     * @param yDot array containing the current value of the first derivative\n     * of the state vector\n     * @param yDDot placeholder array where to put the second time derivative\n     * of the state vector\n     * @throws DerivativeException this exception is propagated to the caller if the\n     * underlying user function triggers one\n     ",
      "child_ranges": []
    }
  ]
}