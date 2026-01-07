{
  "filepath": "/tmp/Math-24b/src/main/java/org/apache/commons/math3/ode/ParameterJacobianWrapper.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ParameterJacobianWrapper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ode.ParameterJacobianProvider"
      ],
      "begin_line": 35,
      "end_line": 107,
      "comment": " Wrapper class to compute Jacobian matrices by finite differences for ODE\n *  which do not compute them by themselves.\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "fode"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Main ODE set. "
    },
    {
      "type": "field",
      "varNames": [
        "pode"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Raw ODE without Jacobian computation skill to be wrapped into a ParameterJacobianProvider. "
    },
    {
      "type": "field",
      "varNames": [
        "hParam"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Steps for finite difference computation of the Jacobian df/dp w.r.t. parameters. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.ParameterJacobianWrapper.ParameterJacobianWrapper(org.apache.commons.math3.ode.FirstOrderDifferentialEquations, org.apache.commons.math3.ode.ParameterizedODE, org.apache.commons.math3.ode.ParameterConfiguration[])",
      "begin_line": 52,
      "end_line": 66,
      "comment": " Wrap a {@link ParameterizedODE} into a {@link ParameterJacobianProvider}.\n     * @param fode main first order differential equations set\n     * @param pode secondary problem, without parameter Jacobian computation skill\n     * @param paramsAndSteps parameters and steps to compute the Jacobians df/dp\n     * @see JacobianMatrices#setParameterStep(String, double)\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 25)",
        "(line 56,col 9)-(line 56,col 25)",
        "(line 57,col 9)-(line 57,col 52)",
        "(line 60,col 9)-(line 65,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ParameterJacobianWrapper.getParametersNames()",
      "begin_line": 69,
      "end_line": 71,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ParameterJacobianWrapper.isSupported(java.lang.String)",
      "begin_line": 74,
      "end_line": 76,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ParameterJacobianWrapper.computeParameterJacobian(double, double[], double[], java.lang.String, double[])",
      "begin_line": 79,
      "end_line": 105,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 42)",
        "(line 84,col 9)-(line 103,col 9)"
      ]
    }
  ]
}