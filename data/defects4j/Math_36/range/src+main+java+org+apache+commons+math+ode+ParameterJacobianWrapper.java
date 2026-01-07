{
  "filepath": "/tmp/Math-36b/src/main/java/org/apache/commons/math/ode/ParameterJacobianWrapper.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ParameterJacobianWrapper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.ParameterJacobianProvider"
      ],
      "begin_line": 29,
      "end_line": 91,
      "comment": " Wrapper class to compute Jacobian matrices by finite differences for ODE\n *  which do not compute them by themselves.\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "fode"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Main ODE set. "
    },
    {
      "type": "field",
      "varNames": [
        "pode"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Raw ODE without Jacobian computation skill to be wrapped into a ParameterJacobianProvider. "
    },
    {
      "type": "field",
      "varNames": [
        "hParam"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Steps for finite difference computation of the Jacobian df/dp w.r.t. parameters. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.ParameterJacobianWrapper.ParameterJacobianWrapper(org.apache.commons.math.ode.FirstOrderDifferentialEquations, org.apache.commons.math.ode.ParameterizedODE, org.apache.commons.math.ode.ParameterConfiguration[])",
      "begin_line": 46,
      "end_line": 60,
      "comment": " Wrap a {@link ParameterizedODE} into a {@link ParameterJacobianProvider}.\n     * @param fode main first order differential equations set\n     * @param pode secondary problem, without parameter Jacobian computation skill\n     * @param paramsAndSteps parameters and steps to compute the Jacobians df/dp\n     * @see JacobianMatrices#setParameterStep(String, double)\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 25)",
        "(line 50,col 9)-(line 50,col 25)",
        "(line 51,col 9)-(line 51,col 52)",
        "(line 54,col 9)-(line 59,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ParameterJacobianWrapper.getParametersNames()",
      "begin_line": 63,
      "end_line": 65,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ParameterJacobianWrapper.isSupported(java.lang.String)",
      "begin_line": 68,
      "end_line": 70,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ParameterJacobianWrapper.computeParameterJacobian(double, double[], double[], java.lang.String, double[])",
      "begin_line": 73,
      "end_line": 89,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 42)",
        "(line 77,col 9)-(line 77,col 46)",
        "(line 80,col 9)-(line 80,col 55)",
        "(line 81,col 9)-(line 81,col 48)",
        "(line 82,col 9)-(line 82,col 45)",
        "(line 83,col 9)-(line 83,col 46)",
        "(line 84,col 9)-(line 86,col 9)",
        "(line 87,col 9)-(line 87,col 40)"
      ]
    }
  ]
}