{
  "filepath": "/tmp/Math-100b/src/test/org/apache/commons/math/ode/TestProblem1.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TestProblem1",
      "is_interface": false,
      "parent_types": [
        "TestProblemAbstract"
      ],
      "begin_line": 34,
      "end_line": 86,
      "comment": "\n * This class is used in the junit tests for the ODE integrators.\n\n * \u003cp\u003eThis specific problem is the following differential equation :\n * \u003cpre\u003e\n *    y\u0027 \u003d -y\n * \u003c/pre\u003e\n * the solution of this equation is a simple exponential function :\n * \u003cpre\u003e\n *   y (t) \u003d y (t0) exp (t0-t)\n * \u003c/pre\u003e\n * \u003c/p\u003e\n\n "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " theoretical state "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.TestProblem1.TestProblem1()",
      "begin_line": 43,
      "end_line": 51,
      "comment": "\n   * Simple constructor.\n   ",
      "child_ranges": [
        "(line 44,col 5)-(line 44,col 12)",
        "(line 45,col 5)-(line 45,col 31)",
        "(line 46,col 5)-(line 46,col 34)",
        "(line 47,col 5)-(line 47,col 28)",
        "(line 48,col 5)-(line 48,col 39)",
        "(line 49,col 5)-(line 49,col 30)",
        "(line 50,col 5)-(line 50,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.TestProblem1.TestProblem1(org.apache.commons.math.ode.TestProblem1)",
      "begin_line": 57,
      "end_line": 60,
      "comment": "\n   * Copy constructor.\n   * @param problem problem to copy\n   ",
      "child_ranges": [
        "(line 58,col 5)-(line 58,col 19)",
        "(line 59,col 5)-(line 59,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem1.clone()",
      "begin_line": 66,
      "end_line": 68,
      "comment": "\n   * Clone operation.\n   * @return a copy of the instance\n   ",
      "child_ranges": [
        "(line 67,col 5)-(line 67,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem1.doComputeDerivatives(double, double[], double[])",
      "begin_line": 70,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 73,col 5)-(line 74,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem1.computeTheoreticalState(double)",
      "begin_line": 78,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 79,col 5)-(line 79,col 33)",
        "(line 80,col 5)-(line 82,col 5)",
        "(line 83,col 5)-(line 83,col 13)"
      ]
    }
  ]
}