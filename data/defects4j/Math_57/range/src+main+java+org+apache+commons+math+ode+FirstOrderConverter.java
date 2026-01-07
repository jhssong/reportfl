{
  "filepath": "/tmp/Math-57b/src/main/java/org/apache/commons/math/ode/FirstOrderConverter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FirstOrderConverter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.FirstOrderDifferentialEquations"
      ],
      "begin_line": 58,
      "end_line": 119,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "equations"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Underlying second order equations set. "
    },
    {
      "type": "field",
      "varNames": [
        "dimension"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " second order problem dimension. "
    },
    {
      "type": "field",
      "varNames": [
        "z"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " state vector. "
    },
    {
      "type": "field",
      "varNames": [
        "zDot"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " first time derivative of the state vector. "
    },
    {
      "type": "field",
      "varNames": [
        "zDDot"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " second time derivative of the state vector. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.FirstOrderConverter.FirstOrderConverter(org.apache.commons.math.ode.SecondOrderDifferentialEquations)",
      "begin_line": 79,
      "end_line": 85,
      "comment": " Simple constructor.\n   * Build a converter around a second order equations set.\n   * @param equations second order equations set to convert\n   ",
      "child_ranges": [
        "(line 80,col 7)-(line 80,col 33)",
        "(line 81,col 7)-(line 81,col 48)",
        "(line 82,col 7)-(line 82,col 45)",
        "(line 83,col 7)-(line 83,col 45)",
        "(line 84,col 7)-(line 84,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderConverter.getDimension()",
      "begin_line": 92,
      "end_line": 94,
      "comment": " Get the dimension of the problem.\n   * \u003cp\u003eThe dimension of the first order problem is twice the\n   * dimension of the underlying second order problem.\u003c/p\u003e\n   * @return dimension of the problem\n   ",
      "child_ranges": [
        "(line 93,col 5)-(line 93,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderConverter.computeDerivatives(double, double[], double[])",
      "begin_line": 103,
      "end_line": 117,
      "comment": " Get the current time derivative of the state vector.\n   * @param t current value of the independent \u003cI\u003etime\u003c/I\u003e variable\n   * @param y array containing the current value of the state vector\n   * @param yDot placeholder array where to put the time derivative of the state vector\n   * @throws MathUserException this exception is propagated to the caller if the\n   * underlying user function triggers one\n   ",
      "child_ranges": [
        "(line 107,col 5)-(line 107,col 55)",
        "(line 108,col 5)-(line 108,col 55)",
        "(line 111,col 5)-(line 111,col 58)",
        "(line 114,col 5)-(line 114,col 59)",
        "(line 115,col 5)-(line 115,col 59)"
      ]
    }
  ]
}