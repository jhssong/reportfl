{
  "filepath": "/tmp/Math-39b/src/main/java/org/apache/commons/math/ode/MainStateJacobianProvider.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MainStateJacobianProvider",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.math.ode.FirstOrderDifferentialEquations"
      ],
      "begin_line": 26,
      "end_line": 36,
      "comment": " Interface expanding {@link FirstOrderDifferentialEquations first order\n *  differential equations} in order to compute exactly the main state jacobian\n *  matrix for {@link JacobianMatrices partial derivatives equations}.\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MainStateJacobianProvider.computeMainStateJacobian(double, double[], double[], double[][])",
      "begin_line": 34,
      "end_line": 34,
      "comment": " Compute the jacobian matrix of ODE with respect to main state.\n     * @param t current value of the independent \u003cI\u003etime\u003c/I\u003e variable\n     * @param y array containing the current value of the main state vector\n     * @param yDot array containing the current value of the time derivative of the main state vector\n     * @param dFdY placeholder array where to put the jacobian matrix of the ODE w.r.t. the main state vector\n     ",
      "child_ranges": []
    }
  ]
}