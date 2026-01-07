{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/ode/TestProblem6.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TestProblem6",
      "is_interface": false,
      "parent_types": [
        "TestProblemAbstract"
      ],
      "begin_line": 35,
      "end_line": 90,
      "comment": "\n * This class is used in the junit tests for the ODE integrators.\n\n * \u003cp\u003eThis specific problem is the following differential equation :\n * \u003cpre\u003e\n *    y\u0027 \u003d 3x^5 - y\n * \u003c/pre\u003e\n * when the initial condition is y(0) \u003d -360, the solution of this\n * equation degenerates to a simple quintic polynomial function :\n * \u003cpre\u003e\n *   y (t) \u003d 3x^5 - 15x^4 + 60x^3 - 180x^2 + 360x - 360\n * \u003c/pre\u003e\n * \u003c/p\u003e\n\n "
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
      "signature": "org.apache.commons.math3.ode.TestProblem6.TestProblem6()",
      "begin_line": 44,
      "end_line": 52,
      "comment": "\n     * Simple constructor.\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 16)",
        "(line 46,col 9)-(line 46,col 33)",
        "(line 47,col 9)-(line 47,col 38)",
        "(line 48,col 9)-(line 48,col 32)",
        "(line 49,col 9)-(line 49,col 38)",
        "(line 50,col 9)-(line 50,col 34)",
        "(line 51,col 9)-(line 51,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.TestProblem6.TestProblem6(org.apache.commons.math3.ode.TestProblem6)",
      "begin_line": 58,
      "end_line": 61,
      "comment": "\n     * Copy constructor.\n     * @param problem problem to copy\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 23)",
        "(line 60,col 9)-(line 60,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.TestProblem6.copy()",
      "begin_line": 64,
      "end_line": 67,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 66,col 7)-(line 66,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.TestProblem6.doComputeDerivatives(double, double[], double[])",
      "begin_line": 69,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 27)",
        "(line 74,col 9)-(line 74,col 28)",
        "(line 75,col 9)-(line 75,col 27)",
        "(line 76,col 9)-(line 78,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.TestProblem6.computeTheoreticalState(double)",
      "begin_line": 82,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 84,col 9)-(line 86,col 9)",
        "(line 87,col 9)-(line 87,col 17)"
      ]
    }
  ]
}