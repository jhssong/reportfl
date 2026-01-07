{
  "filepath": "/tmp/Math-83b/src/main/java/org/apache/commons/math/ode/FirstOrderConverter.java",
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
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.FirstOrderConverter.FirstOrderConverter(org.apache.commons.math.ode.SecondOrderDifferentialEquations)",
      "begin_line": 62,
      "end_line": 68,
      "comment": " Simple constructor.\n   * Build a converter around a second order equations set.\n   * @param equations second order equations set to convert\n   ",
      "child_ranges": [
        "(line 63,col 7)-(line 63,col 33)",
        "(line 64,col 7)-(line 64,col 48)",
        "(line 65,col 7)-(line 65,col 45)",
        "(line 66,col 7)-(line 66,col 45)",
        "(line 67,col 7)-(line 67,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderConverter.getDimension()",
      "begin_line": 75,
      "end_line": 77,
      "comment": " Get the dimension of the problem.\n   * \u003cp\u003eThe dimension of the first order problem is twice the\n   * dimension of the underlying second order problem.\u003c/p\u003e\n   * @return dimension of the problem\n   ",
      "child_ranges": [
        "(line 76,col 5)-(line 76,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderConverter.computeDerivatives(double, double[], double[])",
      "begin_line": 86,
      "end_line": 100,
      "comment": " Get the current time derivative of the state vector.\n   * @param t current value of the independent \u003cI\u003etime\u003c/I\u003e variable\n   * @param y array containing the current value of the state vector\n   * @param yDot placeholder array where to put the time derivative of the state vector\n   * @throws DerivativeException this exception is propagated to the caller if the\n   * underlying user function triggers one\n   ",
      "child_ranges": [
        "(line 90,col 5)-(line 90,col 55)",
        "(line 91,col 5)-(line 91,col 55)",
        "(line 94,col 5)-(line 94,col 58)",
        "(line 97,col 5)-(line 97,col 59)",
        "(line 98,col 5)-(line 98,col 59)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "equations"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " Underlying second order equations set. "
    },
    {
      "type": "field",
      "varNames": [
        "dimension"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " second order problem dimension. "
    },
    {
      "type": "field",
      "varNames": [
        "z"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": " state vector. "
    },
    {
      "type": "field",
      "varNames": [
        "zDot"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " first time derivative of the state vector. "
    },
    {
      "type": "field",
      "varNames": [
        "zDDot"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": " second time derivative of the state vector. "
    }
  ]
}