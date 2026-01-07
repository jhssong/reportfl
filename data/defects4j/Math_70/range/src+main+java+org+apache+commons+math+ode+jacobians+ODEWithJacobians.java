{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/ode/jacobians/ODEWithJacobians.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ODEWithJacobians",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.math.ode.FirstOrderDifferentialEquations"
      ],
      "begin_line": 33,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.ODEWithJacobians.getParametersDimension()",
      "begin_line": 38,
      "end_line": 38,
      "comment": " Get the number of parameters.\n     * @return number of parameters\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.ODEWithJacobians.computeJacobians(double, double[], double[], double[][], double[][])",
      "begin_line": 49,
      "end_line": 50,
      "comment": " Compute the partial derivatives of ODE with respect to state.\n     * @param t current value of the independent \u003cI\u003etime\u003c/I\u003e variable\n     * @param y array containing the current value of the state vector\n     * @param yDot array containing the current value of the time derivative of the state vector\n     * @param dFdY placeholder array where to put the jacobian of the ODE with respect to the state vector\n     * @param dFdP placeholder array where to put the jacobian of the ODE with respect to the parameters\n     * @throws DerivativeException this exception is propagated to the caller if the\n     * underlying user function triggers one\n     ",
      "child_ranges": []
    }
  ]
}