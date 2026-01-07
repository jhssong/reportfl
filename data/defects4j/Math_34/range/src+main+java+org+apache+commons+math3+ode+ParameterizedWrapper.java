{
  "filepath": "/tmp/Math-34b/src/main/java/org/apache/commons/math3/ode/ParameterizedWrapper.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ParameterizedWrapper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ode.ParameterizedODE"
      ],
      "begin_line": 31,
      "end_line": 82,
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
      "signature": "org.apache.commons.math3.ode.ParameterizedWrapper.ParameterizedWrapper(org.apache.commons.math3.ode.FirstOrderDifferentialEquations)",
      "begin_line": 39,
      "end_line": 41,
      "comment": " Simple constructor.\n     * @param ode original first order differential equations\n     ",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ParameterizedWrapper.getDimension()",
      "begin_line": 46,
      "end_line": 48,
      "comment": " Get the dimension of the underlying FODE.\n     * @return dimension of the underlying FODE\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ParameterizedWrapper.computeDerivatives(double, double[], double[])",
      "begin_line": 55,
      "end_line": 57,
      "comment": " Get the current time derivative of the state vector of the underlying FODE.\n     * @param t current value of the independent \u003cI\u003etime\u003c/I\u003e variable\n     * @param y array containing the current value of the state vector\n     * @param yDot placeholder array where to put the time derivative of the state vector\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ParameterizedWrapper.getParametersNames()",
      "begin_line": 60,
      "end_line": 62,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ParameterizedWrapper.isSupported(java.lang.String)",
      "begin_line": 65,
      "end_line": 67,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ParameterizedWrapper.getParameter(java.lang.String)",
      "begin_line": 70,
      "end_line": 76,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 72,col 9)-(line 74,col 9)",
        "(line 75,col 9)-(line 75,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ParameterizedWrapper.setParameter(java.lang.String, double)",
      "begin_line": 79,
      "end_line": 80,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    }
  ]
}