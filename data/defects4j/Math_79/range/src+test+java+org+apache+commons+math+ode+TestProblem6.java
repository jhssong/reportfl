{
  "filepath": "/tmp/Math-79b/src/test/java/org/apache/commons/math/ode/TestProblem6.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TestProblem6",
      "is_interface": false,
      "parent_types": [
        "TestProblemAbstract"
      ],
      "begin_line": 35,
      "end_line": 92,
      "comment": "\n * This class is used in the junit tests for the ODE integrators.\n\n * \u003cp\u003eThis specific problem is the following differential equation :\n * \u003cpre\u003e\n *    y\u0027 \u003d 3x^5 - y\n * \u003c/pre\u003e\n * when the initial condition is y(0) \u003d -360, the solution of this\n * equation degenerates to a simple quintic polynomial function :\n * \u003cpre\u003e\n *   y (t) \u003d 3x^5 - 15x^4 + 60x^3 - 180x^2 + 360x - 360\n * \u003c/pre\u003e\n * \u003c/p\u003e\n\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " theoretical state "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.TestProblem6.TestProblem6()",
      "begin_line": 47,
      "end_line": 55,
      "comment": "\n     * Simple constructor.\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 16)",
        "(line 49,col 9)-(line 49,col 33)",
        "(line 50,col 9)-(line 50,col 38)",
        "(line 51,col 9)-(line 51,col 32)",
        "(line 52,col 9)-(line 52,col 38)",
        "(line 53,col 9)-(line 53,col 34)",
        "(line 54,col 9)-(line 54,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.TestProblem6.TestProblem6(org.apache.commons.math.ode.TestProblem6)",
      "begin_line": 61,
      "end_line": 64,
      "comment": "\n     * Copy constructor.\n     * @param problem problem to copy\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 23)",
        "(line 63,col 9)-(line 63,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem6.copy()",
      "begin_line": 67,
      "end_line": 69,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 68,col 7)-(line 68,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem6.doComputeDerivatives(double, double[], double[])",
      "begin_line": 71,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 27)",
        "(line 76,col 9)-(line 76,col 28)",
        "(line 77,col 9)-(line 77,col 27)",
        "(line 78,col 9)-(line 80,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem6.computeTheoreticalState(double)",
      "begin_line": 84,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 88,col 9)",
        "(line 89,col 9)-(line 89,col 17)"
      ]
    }
  ]
}