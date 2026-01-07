{
  "filepath": "/tmp/Math-40b/src/main/java/org/apache/commons/math/ode/ParameterizedWrapper.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ParameterizedWrapper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.ParameterizedODE"
      ],
      "begin_line": 31,
      "end_line": 74,
      "comment": " Wrapper class enabling {@link FirstOrderDifferentialEquations basic simple}\n *  ODE instances to be used when processing {@link JacobianMatrices}.\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "fode"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Basic FODE without parameter. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.ParameterizedWrapper.ParameterizedWrapper(org.apache.commons.math.ode.FirstOrderDifferentialEquations)",
      "begin_line": 39,
      "end_line": 41,
      "comment": " Simple constructor.\n     * @param ode original first order differential equations\n     ",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ParameterizedWrapper.getDimension()",
      "begin_line": 43,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ParameterizedWrapper.computeDerivatives(double, double[], double[])",
      "begin_line": 47,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ParameterizedWrapper.getParametersNames()",
      "begin_line": 52,
      "end_line": 54,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ParameterizedWrapper.isSupported(java.lang.String)",
      "begin_line": 57,
      "end_line": 59,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ParameterizedWrapper.getParameter(java.lang.String)",
      "begin_line": 62,
      "end_line": 68,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 64,col 9)-(line 66,col 9)",
        "(line 67,col 9)-(line 67,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ParameterizedWrapper.setParameter(java.lang.String, double)",
      "begin_line": 71,
      "end_line": 72,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    }
  ]
}