{
  "filepath": "/tmp/Math-86b/src/test/org/apache/commons/math/ode/nonstiff/TestProblem1.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TestProblem1",
      "is_interface": false,
      "parent_types": [
        "TestProblemAbstract"
      ],
      "begin_line": 34,
      "end_line": 92,
      "comment": "\n * This class is used in the junit tests for the ODE integrators.\n\n * \u003cp\u003eThis specific problem is the following differential equation :\n * \u003cpre\u003e\n *    y\u0027 \u003d -y\n * \u003c/pre\u003e\n * the solution of this equation is a simple exponential function :\n * \u003cpre\u003e\n *   y (t) \u003d y (t0) exp (t0-t)\n * \u003c/pre\u003e\n * \u003c/p\u003e\n\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " theoretical state "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.TestProblem1.TestProblem1()",
      "begin_line": 46,
      "end_line": 54,
      "comment": "\n   * Simple constructor.\n   ",
      "child_ranges": [
        "(line 47,col 5)-(line 47,col 12)",
        "(line 48,col 5)-(line 48,col 31)",
        "(line 49,col 5)-(line 49,col 34)",
        "(line 50,col 5)-(line 50,col 28)",
        "(line 51,col 5)-(line 51,col 39)",
        "(line 52,col 5)-(line 52,col 30)",
        "(line 53,col 5)-(line 53,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.TestProblem1.TestProblem1(org.apache.commons.math.ode.nonstiff.TestProblem1)",
      "begin_line": 60,
      "end_line": 63,
      "comment": "\n   * Copy constructor.\n   * @param problem problem to copy\n   ",
      "child_ranges": [
        "(line 61,col 5)-(line 61,col 19)",
        "(line 62,col 5)-(line 62,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.TestProblem1.clone()",
      "begin_line": 69,
      "end_line": 72,
      "comment": "\n   * Clone operation.\n   * @return a copy of the instance\n   ",
      "child_ranges": [
        "(line 71,col 5)-(line 71,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.TestProblem1.doComputeDerivatives(double, double[], double[])",
      "begin_line": 74,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 78,col 5)-(line 79,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.TestProblem1.computeTheoreticalState(double)",
      "begin_line": 83,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 85,col 5)-(line 85,col 33)",
        "(line 86,col 5)-(line 88,col 5)",
        "(line 89,col 5)-(line 89,col 13)"
      ]
    }
  ]
}