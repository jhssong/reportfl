{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/ode/FirstOrderConverter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FirstOrderConverter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.FirstOrderDifferentialEquations"
      ],
      "begin_line": 56,
      "end_line": 117,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "equations"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Underlying second order equations set. "
    },
    {
      "type": "field",
      "varNames": [
        "dimension"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " second order problem dimension. "
    },
    {
      "type": "field",
      "varNames": [
        "z"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " state vector. "
    },
    {
      "type": "field",
      "varNames": [
        "zDot"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " first time derivative of the state vector. "
    },
    {
      "type": "field",
      "varNames": [
        "zDDot"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " second time derivative of the state vector. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.FirstOrderConverter.FirstOrderConverter(org.apache.commons.math.ode.SecondOrderDifferentialEquations)",
      "begin_line": 77,
      "end_line": 83,
      "comment": " Simple constructor.\n   * Build a converter around a second order equations set.\n   * @param equations second order equations set to convert\n   ",
      "child_ranges": [
        "(line 78,col 7)-(line 78,col 33)",
        "(line 79,col 7)-(line 79,col 48)",
        "(line 80,col 7)-(line 80,col 45)",
        "(line 81,col 7)-(line 81,col 45)",
        "(line 82,col 7)-(line 82,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderConverter.getDimension()",
      "begin_line": 90,
      "end_line": 92,
      "comment": " Get the dimension of the problem.\n   * \u003cp\u003eThe dimension of the first order problem is twice the\n   * dimension of the underlying second order problem.\u003c/p\u003e\n   * @return dimension of the problem\n   ",
      "child_ranges": [
        "(line 91,col 5)-(line 91,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderConverter.computeDerivatives(double, double[], double[])",
      "begin_line": 101,
      "end_line": 115,
      "comment": " Get the current time derivative of the state vector.\n   * @param t current value of the independent \u003cI\u003etime\u003c/I\u003e variable\n   * @param y array containing the current value of the state vector\n   * @param yDot placeholder array where to put the time derivative of the state vector\n   * @throws DerivativeException this exception is propagated to the caller if the\n   * underlying user function triggers one\n   ",
      "child_ranges": [
        "(line 105,col 5)-(line 105,col 55)",
        "(line 106,col 5)-(line 106,col 55)",
        "(line 109,col 5)-(line 109,col 58)",
        "(line 112,col 5)-(line 112,col 59)",
        "(line 113,col 5)-(line 113,col 59)"
      ]
    }
  ]
}