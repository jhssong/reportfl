{
  "filepath": "/tmp/Math-44b/src/main/java/org/apache/commons/math/ode/ParameterizedWrapper.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ParameterizedWrapper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.ParameterizedODE"
      ],
      "begin_line": 31,
      "end_line": 76,
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
      "begin_line": 44,
      "end_line": 46,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ParameterizedWrapper.computeDerivatives(double, double[], double[])",
      "begin_line": 49,
      "end_line": 51,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ParameterizedWrapper.getParametersNames()",
      "begin_line": 54,
      "end_line": 56,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ParameterizedWrapper.isSupported(java.lang.String)",
      "begin_line": 59,
      "end_line": 61,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ParameterizedWrapper.getParameter(java.lang.String)",
      "begin_line": 64,
      "end_line": 70,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 66,col 9)-(line 68,col 9)",
        "(line 69,col 9)-(line 69,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ParameterizedWrapper.setParameter(java.lang.String, double)",
      "begin_line": 73,
      "end_line": 74,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    }
  ]
}