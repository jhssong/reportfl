{
  "filepath": "/tmp/Math-102b/src/java/org/apache/commons/math/ode/FirstOrderConverter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FirstOrderConverter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.FirstOrderDifferentialEquations"
      ],
      "begin_line": 57,
      "end_line": 107,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.FirstOrderConverter.FirstOrderConverter(org.apache.commons.math.ode.SecondOrderDifferentialEquations)",
      "begin_line": 64,
      "end_line": 70,
      "comment": " Simple constructor.\n   * Build a converter around a second order equations set.\n   * @param equations second order equations set to convert\n   ",
      "child_ranges": [
        "(line 65,col 7)-(line 65,col 33)",
        "(line 66,col 7)-(line 66,col 48)",
        "(line 67,col 7)-(line 67,col 45)",
        "(line 68,col 7)-(line 68,col 45)",
        "(line 69,col 7)-(line 69,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderConverter.getDimension()",
      "begin_line": 72,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 73,col 5)-(line 73,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderConverter.computeDerivatives(double, double[], double[])",
      "begin_line": 76,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 80,col 5)-(line 80,col 55)",
        "(line 81,col 5)-(line 81,col 55)",
        "(line 84,col 5)-(line 84,col 58)",
        "(line 87,col 5)-(line 87,col 59)",
        "(line 88,col 5)-(line 88,col 59)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "equations"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " Underlying second order equations set. "
    },
    {
      "type": "field",
      "varNames": [
        "dimension"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " second order problem dimension. "
    },
    {
      "type": "field",
      "varNames": [
        "z"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " state vector. "
    },
    {
      "type": "field",
      "varNames": [
        "zDot"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " first time derivative of the state vector. "
    },
    {
      "type": "field",
      "varNames": [
        "zDDot"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": " second time derivative of the state vector. "
    }
  ]
}