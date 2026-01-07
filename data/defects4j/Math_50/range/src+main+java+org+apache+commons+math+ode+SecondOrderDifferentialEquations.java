{
  "filepath": "/tmp/Math-50b/src/main/java/org/apache/commons/math/ode/SecondOrderDifferentialEquations.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SecondOrderDifferentialEquations",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 49,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.SecondOrderDifferentialEquations.getDimension()",
      "begin_line": 54,
      "end_line": 54,
      "comment": " Get the dimension of the problem.\n     * @return dimension of the problem\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.SecondOrderDifferentialEquations.computeSecondDerivatives(double, double[], double[], double[])",
      "begin_line": 66,
      "end_line": 67,
      "comment": " Get the current time derivative of the state vector.\n     * @param t current value of the independent \u003cI\u003etime\u003c/I\u003e variable\n     * @param y array containing the current value of the state vector\n     * @param yDot array containing the current value of the first derivative\n     * of the state vector\n     * @param yDDot placeholder array where to put the second time derivative\n     * of the state vector\n     * @throws MathUserException this user-defined exception should be used if an error is\n     * is triggered by user code\n     ",
      "child_ranges": []
    }
  ]
}