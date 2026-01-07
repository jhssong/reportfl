{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/ode/TestProblem1.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TestProblem1",
      "is_interface": false,
      "parent_types": [
        "TestProblemAbstract"
      ],
      "begin_line": 36,
      "end_line": 88,
      "comment": "\n * This class is used in the junit tests for the ODE integrators.\n\n * \u003cp\u003eThis specific problem is the following differential equation :\n * \u003cpre\u003e\n *    y\u0027 \u003d -y\n * \u003c/pre\u003e\n * the solution of this equation is a simple exponential function :\n * \u003cpre\u003e\n *   y (t) \u003d y (t0) exp (t0-t)\n * \u003c/pre\u003e\n * \u003c/p\u003e\n\n "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " theoretical state "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.TestProblem1.TestProblem1()",
      "begin_line": 45,
      "end_line": 53,
      "comment": "\n   * Simple constructor.\n   ",
      "child_ranges": [
        "(line 46,col 5)-(line 46,col 12)",
        "(line 47,col 5)-(line 47,col 31)",
        "(line 48,col 5)-(line 48,col 34)",
        "(line 49,col 5)-(line 49,col 28)",
        "(line 50,col 5)-(line 50,col 39)",
        "(line 51,col 5)-(line 51,col 30)",
        "(line 52,col 5)-(line 52,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.TestProblem1.TestProblem1(org.apache.commons.math3.ode.TestProblem1)",
      "begin_line": 59,
      "end_line": 62,
      "comment": "\n   * Copy constructor.\n   * @param problem problem to copy\n   ",
      "child_ranges": [
        "(line 60,col 5)-(line 60,col 19)",
        "(line 61,col 5)-(line 61,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.TestProblem1.copy()",
      "begin_line": 65,
      "end_line": 68,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 67,col 5)-(line 67,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.TestProblem1.doComputeDerivatives(double, double[], double[])",
      "begin_line": 70,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 74,col 5)-(line 75,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.TestProblem1.computeTheoreticalState(double)",
      "begin_line": 79,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 81,col 5)-(line 81,col 37)",
        "(line 82,col 5)-(line 84,col 5)",
        "(line 85,col 5)-(line 85,col 13)"
      ]
    }
  ]
}