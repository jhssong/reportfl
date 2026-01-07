{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/ode/ParameterJacobianWrapper.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ParameterJacobianWrapper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ode.ParameterJacobianProvider"
      ],
      "begin_line": 33,
      "end_line": 100,
      "comment": " Wrapper class to compute Jacobian matrices by finite differences for ODE\n *  which do not compute them by themselves.\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "fode"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Main ODE set. "
    },
    {
      "type": "field",
      "varNames": [
        "pode"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Raw ODE without Jacobian computation skill to be wrapped into a ParameterJacobianProvider. "
    },
    {
      "type": "field",
      "varNames": [
        "hParam"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Steps for finite difference computation of the Jacobian df/dp w.r.t. parameters. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.ParameterJacobianWrapper.ParameterJacobianWrapper(org.apache.commons.math3.ode.FirstOrderDifferentialEquations, org.apache.commons.math3.ode.ParameterizedODE, org.apache.commons.math3.ode.ParameterConfiguration[])",
      "begin_line": 50,
      "end_line": 64,
      "comment": " Wrap a {@link ParameterizedODE} into a {@link ParameterJacobianProvider}.\n     * @param fode main first order differential equations set\n     * @param pode secondary problem, without parameter Jacobian computation skill\n     * @param paramsAndSteps parameters and steps to compute the Jacobians df/dp\n     * @see JacobianMatrices#setParameterStep(String, double)\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 25)",
        "(line 54,col 9)-(line 54,col 25)",
        "(line 55,col 9)-(line 55,col 52)",
        "(line 58,col 9)-(line 63,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ParameterJacobianWrapper.getParametersNames()",
      "begin_line": 67,
      "end_line": 69,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ParameterJacobianWrapper.isSupported(java.lang.String)",
      "begin_line": 72,
      "end_line": 74,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ParameterJacobianWrapper.computeParameterJacobian(double, double[], double[], java.lang.String, double[])",
      "begin_line": 77,
      "end_line": 98,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 42)",
        "(line 82,col 9)-(line 96,col 9)"
      ]
    }
  ]
}