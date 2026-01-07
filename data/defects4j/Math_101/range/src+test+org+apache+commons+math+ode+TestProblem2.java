{
  "filepath": "/tmp/Math-101b/src/test/org/apache/commons/math/ode/TestProblem2.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TestProblem2",
      "is_interface": false,
      "parent_types": [
        "TestProblemAbstract"
      ],
      "begin_line": 35,
      "end_line": 88,
      "comment": "\n * This class is used in the junit tests for the ODE integrators.\n\n * \u003cp\u003eThis specific problem is the following differential equation :\n * \u003cpre\u003e\n *    y\u0027 \u003d t^3 - t y\n * \u003c/pre\u003e\n * with the initial condition y (0) \u003d 0. The solution of this equation\n * is the following function :\n * \u003cpre\u003e\n *   y (t) \u003d t^2 + 2 (ext (- t^2 / 2) - 1)\n * \u003c/pre\u003e\n * \u003c/p\u003e\n\n "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " theoretical state "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.TestProblem2.TestProblem2()",
      "begin_line": 44,
      "end_line": 52,
      "comment": "\n   * Simple constructor.\n   ",
      "child_ranges": [
        "(line 45,col 5)-(line 45,col 12)",
        "(line 46,col 5)-(line 46,col 26)",
        "(line 47,col 5)-(line 47,col 34)",
        "(line 48,col 5)-(line 48,col 28)",
        "(line 49,col 5)-(line 49,col 34)",
        "(line 50,col 5)-(line 50,col 30)",
        "(line 51,col 5)-(line 51,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.TestProblem2.TestProblem2(org.apache.commons.math.ode.TestProblem2)",
      "begin_line": 58,
      "end_line": 61,
      "comment": "\n   * Copy constructor.\n   * @param problem problem to copy\n   ",
      "child_ranges": [
        "(line 59,col 5)-(line 59,col 19)",
        "(line 60,col 5)-(line 60,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem2.clone()",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n   * Clone operation.\n   * @return a copy of the instance\n   ",
      "child_ranges": [
        "(line 68,col 5)-(line 68,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem2.doComputeDerivatives(double, double[], double[])",
      "begin_line": 71,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 74,col 5)-(line 75,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem2.computeTheoreticalState(double)",
      "begin_line": 79,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 80,col 5)-(line 80,col 22)",
        "(line 81,col 5)-(line 81,col 51)",
        "(line 82,col 5)-(line 84,col 5)",
        "(line 85,col 5)-(line 85,col 13)"
      ]
    }
  ]
}