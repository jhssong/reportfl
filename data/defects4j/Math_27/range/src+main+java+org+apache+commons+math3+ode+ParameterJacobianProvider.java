{
  "filepath": "/tmp/Math-27b/src/main/java/org/apache/commons/math3/ode/ParameterJacobianProvider.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ParameterJacobianProvider",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.math3.ode.Parameterizable"
      ],
      "begin_line": 27,
      "end_line": 44,
      "comment": " Interface to compute exactly Jacobian matrix for some parameter\n *  when computing {@link JacobianMatrices partial derivatives equations}.\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ParameterJacobianProvider.computeParameterJacobian(double, double[], double[], java.lang.String, double[])",
      "begin_line": 40,
      "end_line": 42,
      "comment": " Compute the Jacobian matrix of ODE with respect to one parameter.\n     * \u003cp\u003eThe parameter must be one given by {@link #getParametersNames()}.\u003c/p\u003e\n     * @param t current value of the independent \u003cI\u003etime\u003c/I\u003e variable\n     * @param y array containing the current value of the main state vector\n     * @param yDot array containing the current value of the time derivative\n     * of the main state vector\n     * @param paramName name of the parameter to consider\n     * @param dFdP placeholder array where to put the Jacobian matrix of the\n     * ODE with respect to the parameter\n     * @throws MathIllegalArgumentException if the parameter is not supported\n     ",
      "child_ranges": []
    }
  ]
}