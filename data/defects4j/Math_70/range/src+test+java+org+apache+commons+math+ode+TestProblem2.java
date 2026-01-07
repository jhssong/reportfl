{
  "filepath": "/tmp/Math-70b/src/test/java/org/apache/commons/math/ode/TestProblem2.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TestProblem2",
      "is_interface": false,
      "parent_types": [
        "TestProblemAbstract"
      ],
      "begin_line": 35,
      "end_line": 91,
      "comment": "\n * This class is used in the junit tests for the ODE integrators.\n\n * \u003cp\u003eThis specific problem is the following differential equation :\n * \u003cpre\u003e\n *    y\u0027 \u003d t^3 - t y\n * \u003c/pre\u003e\n * with the initial condition y (0) \u003d 0. The solution of this equation\n * is the following function :\n * \u003cpre\u003e\n *   y (t) \u003d t^2 + 2 (exp (- t^2 / 2) - 1)\n * \u003c/pre\u003e\n * \u003c/p\u003e\n\n "
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
      "signature": "org.apache.commons.math.ode.TestProblem2.TestProblem2()",
      "begin_line": 47,
      "end_line": 55,
      "comment": "\n   * Simple constructor.\n   ",
      "child_ranges": [
        "(line 48,col 5)-(line 48,col 12)",
        "(line 49,col 5)-(line 49,col 26)",
        "(line 50,col 5)-(line 50,col 34)",
        "(line 51,col 5)-(line 51,col 28)",
        "(line 52,col 5)-(line 52,col 34)",
        "(line 53,col 5)-(line 53,col 30)",
        "(line 54,col 5)-(line 54,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.TestProblem2.TestProblem2(org.apache.commons.math.ode.TestProblem2)",
      "begin_line": 61,
      "end_line": 64,
      "comment": "\n   * Copy constructor.\n   * @param problem problem to copy\n   ",
      "child_ranges": [
        "(line 62,col 5)-(line 62,col 19)",
        "(line 63,col 5)-(line 63,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem2.copy()",
      "begin_line": 67,
      "end_line": 70,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 69,col 5)-(line 69,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem2.doComputeDerivatives(double, double[], double[])",
      "begin_line": 72,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 76,col 5)-(line 77,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem2.computeTheoreticalState(double)",
      "begin_line": 81,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 83,col 5)-(line 83,col 22)",
        "(line 84,col 5)-(line 84,col 51)",
        "(line 85,col 5)-(line 87,col 5)",
        "(line 88,col 5)-(line 88,col 13)"
      ]
    }
  ]
}