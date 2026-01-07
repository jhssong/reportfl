{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/ode/FirstOrderConverter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FirstOrderConverter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ode.FirstOrderDifferentialEquations"
      ],
      "begin_line": 57,
      "end_line": 115,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "equations"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Underlying second order equations set. "
    },
    {
      "type": "field",
      "varNames": [
        "dimension"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " second order problem dimension. "
    },
    {
      "type": "field",
      "varNames": [
        "z"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " state vector. "
    },
    {
      "type": "field",
      "varNames": [
        "zDot"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " first time derivative of the state vector. "
    },
    {
      "type": "field",
      "varNames": [
        "zDDot"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " second time derivative of the state vector. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.FirstOrderConverter.FirstOrderConverter(org.apache.commons.math3.ode.SecondOrderDifferentialEquations)",
      "begin_line": 78,
      "end_line": 84,
      "comment": " Simple constructor.\n   * Build a converter around a second order equations set.\n   * @param equations second order equations set to convert\n   ",
      "child_ranges": [
        "(line 79,col 7)-(line 79,col 33)",
        "(line 80,col 7)-(line 80,col 48)",
        "(line 81,col 7)-(line 81,col 45)",
        "(line 82,col 7)-(line 82,col 45)",
        "(line 83,col 7)-(line 83,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.FirstOrderConverter.getDimension()",
      "begin_line": 91,
      "end_line": 93,
      "comment": " Get the dimension of the problem.\n   * \u003cp\u003eThe dimension of the first order problem is twice the\n   * dimension of the underlying second order problem.\u003c/p\u003e\n   * @return dimension of the problem\n   ",
      "child_ranges": [
        "(line 92,col 5)-(line 92,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.FirstOrderConverter.computeDerivatives(double, double[], double[])",
      "begin_line": 100,
      "end_line": 113,
      "comment": " Get the current time derivative of the state vector.\n   * @param t current value of the independent \u003cI\u003etime\u003c/I\u003e variable\n   * @param y array containing the current value of the state vector\n   * @param yDot placeholder array where to put the time derivative of the state vector\n   ",
      "child_ranges": [
        "(line 103,col 5)-(line 103,col 55)",
        "(line 104,col 5)-(line 104,col 55)",
        "(line 107,col 5)-(line 107,col 58)",
        "(line 110,col 5)-(line 110,col 59)",
        "(line 111,col 5)-(line 111,col 59)"
      ]
    }
  ]
}