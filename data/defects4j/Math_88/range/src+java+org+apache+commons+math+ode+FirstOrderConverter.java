{
  "filepath": "/tmp/Math-88b/src/java/org/apache/commons/math/ode/FirstOrderConverter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FirstOrderConverter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.FirstOrderDifferentialEquations"
      ],
      "begin_line": 56,
      "end_line": 121,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.FirstOrderConverter.FirstOrderConverter(org.apache.commons.math.ode.SecondOrderDifferentialEquations)",
      "begin_line": 66,
      "end_line": 72,
      "comment": " Simple constructor.\n   * Build a converter around a second order equations set.\n   * @param equations second order equations set to convert\n   ",
      "child_ranges": [
        "(line 67,col 7)-(line 67,col 33)",
        "(line 68,col 7)-(line 68,col 48)",
        "(line 69,col 7)-(line 69,col 45)",
        "(line 70,col 7)-(line 70,col 45)",
        "(line 71,col 7)-(line 71,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderConverter.getDimension()",
      "begin_line": 79,
      "end_line": 81,
      "comment": " Get the dimension of the problem.\n   * \u003cp\u003eThe dimension of the first order problem is twice the\n   * dimension of the underlying second order problem.\u003c/p\u003e\n   * @return dimension of the problem\n   ",
      "child_ranges": [
        "(line 80,col 5)-(line 80,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderConverter.computeDerivatives(double, double[], double[])",
      "begin_line": 90,
      "end_line": 104,
      "comment": " Get the current time derivative of the state vector.\n   * @param t current value of the independent \u003cI\u003etime\u003c/I\u003e variable\n   * @param y array containing the current value of the state vector\n   * @param yDot placeholder array where to put the time derivative of the state vector\n   * @throws DerivativeException this exception is propagated to the caller if the\n   * underlying user function triggers one\n   ",
      "child_ranges": [
        "(line 94,col 5)-(line 94,col 55)",
        "(line 95,col 5)-(line 95,col 55)",
        "(line 98,col 5)-(line 98,col 58)",
        "(line 101,col 5)-(line 101,col 59)",
        "(line 102,col 5)-(line 102,col 59)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "equations"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": " Underlying second order equations set. "
    },
    {
      "type": "field",
      "varNames": [
        "dimension"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": " second order problem dimension. "
    },
    {
      "type": "field",
      "varNames": [
        "z"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": " state vector. "
    },
    {
      "type": "field",
      "varNames": [
        "zDot"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": " first time derivative of the state vector. "
    },
    {
      "type": "field",
      "varNames": [
        "zDDot"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": " second time derivative of the state vector. "
    }
  ]
}