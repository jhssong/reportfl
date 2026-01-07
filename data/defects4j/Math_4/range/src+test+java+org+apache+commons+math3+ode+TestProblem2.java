{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/ode/TestProblem2.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TestProblem2",
      "is_interface": false,
      "parent_types": [
        "TestProblemAbstract"
      ],
      "begin_line": 37,
      "end_line": 90,
      "comment": "\n * This class is used in the junit tests for the ODE integrators.\n\n * \u003cp\u003eThis specific problem is the following differential equation :\n * \u003cpre\u003e\n *    y\u0027 \u003d t^3 - t y\n * \u003c/pre\u003e\n * with the initial condition y (0) \u003d 0. The solution of this equation\n * is the following function :\n * \u003cpre\u003e\n *   y (t) \u003d t^2 + 2 (exp (- t^2 / 2) - 1)\n * \u003c/pre\u003e\n * \u003c/p\u003e\n\n "
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
      "signature": "org.apache.commons.math3.ode.TestProblem2.TestProblem2()",
      "begin_line": 46,
      "end_line": 54,
      "comment": "\n   * Simple constructor.\n   ",
      "child_ranges": [
        "(line 47,col 5)-(line 47,col 12)",
        "(line 48,col 5)-(line 48,col 26)",
        "(line 49,col 5)-(line 49,col 34)",
        "(line 50,col 5)-(line 50,col 28)",
        "(line 51,col 5)-(line 51,col 34)",
        "(line 52,col 5)-(line 52,col 30)",
        "(line 53,col 5)-(line 53,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.TestProblem2.TestProblem2(org.apache.commons.math3.ode.TestProblem2)",
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
      "signature": "org.apache.commons.math3.ode.TestProblem2.copy()",
      "begin_line": 66,
      "end_line": 69,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 68,col 5)-(line 68,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.TestProblem2.doComputeDerivatives(double, double[], double[])",
      "begin_line": 71,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 75,col 5)-(line 76,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.TestProblem2.computeTheoreticalState(double)",
      "begin_line": 80,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 82,col 5)-(line 82,col 22)",
        "(line 83,col 5)-(line 83,col 55)",
        "(line 84,col 5)-(line 86,col 5)",
        "(line 87,col 5)-(line 87,col 13)"
      ]
    }
  ]
}