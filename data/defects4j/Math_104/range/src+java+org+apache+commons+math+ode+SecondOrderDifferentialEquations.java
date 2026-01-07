{
  "filepath": "/tmp/Math-104b/src/java/org/apache/commons/math/ode/SecondOrderDifferentialEquations.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SecondOrderDifferentialEquations",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 48,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.SecondOrderDifferentialEquations.getDimension()",
      "begin_line": 53,
      "end_line": 53,
      "comment": " Get the dimension of the problem.\n   * @return dimension of the problem\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.SecondOrderDifferentialEquations.computeSecondDerivatives(double, double[], double[], double[])",
      "begin_line": 65,
      "end_line": 67,
      "comment": " Get the current time derivative of the state vector.\n   * @param t current value of the independant \u003cI\u003etime\u003c/I\u003e variable\n   * @param y array containing the current value of the state vector\n   * @param yDot array containing the current value of the first derivative\n   * of the state vector\n   * @param yDDot placeholder array where to put the second time derivative\n   * of the state vector\n   * @throws DerivativeException this exception is propagated to the caller if the\n   * underlying user function triggers one\n   ",
      "child_ranges": []
    }
  ]
}