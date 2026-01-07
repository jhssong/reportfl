{
  "filepath": "/tmp/Math-62b/src/test/java/org/apache/commons/math/ode/TestProblem2.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TestProblem2",
      "is_interface": false,
      "parent_types": [
        "TestProblemAbstract"
      ],
      "begin_line": 37,
      "end_line": 93,
      "comment": "\n * This class is used in the junit tests for the ODE integrators.\n\n * \u003cp\u003eThis specific problem is the following differential equation :\n * \u003cpre\u003e\n *    y\u0027 \u003d t^3 - t y\n * \u003c/pre\u003e\n * with the initial condition y (0) \u003d 0. The solution of this equation\n * is the following function :\n * \u003cpre\u003e\n *   y (t) \u003d t^2 + 2 (exp (- t^2 / 2) - 1)\n * \u003c/pre\u003e\n * \u003c/p\u003e\n\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " theoretical state "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.TestProblem2.TestProblem2()",
      "begin_line": 49,
      "end_line": 57,
      "comment": "\n   * Simple constructor.\n   ",
      "child_ranges": [
        "(line 50,col 5)-(line 50,col 12)",
        "(line 51,col 5)-(line 51,col 26)",
        "(line 52,col 5)-(line 52,col 34)",
        "(line 53,col 5)-(line 53,col 28)",
        "(line 54,col 5)-(line 54,col 34)",
        "(line 55,col 5)-(line 55,col 30)",
        "(line 56,col 5)-(line 56,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.TestProblem2.TestProblem2(org.apache.commons.math.ode.TestProblem2)",
      "begin_line": 63,
      "end_line": 66,
      "comment": "\n   * Copy constructor.\n   * @param problem problem to copy\n   ",
      "child_ranges": [
        "(line 64,col 5)-(line 64,col 19)",
        "(line 65,col 5)-(line 65,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem2.copy()",
      "begin_line": 69,
      "end_line": 72,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 71,col 5)-(line 71,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem2.doComputeDerivatives(double, double[], double[])",
      "begin_line": 74,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 78,col 5)-(line 79,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem2.computeTheoreticalState(double)",
      "begin_line": 83,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 85,col 5)-(line 85,col 22)",
        "(line 86,col 5)-(line 86,col 55)",
        "(line 87,col 5)-(line 89,col 5)",
        "(line 90,col 5)-(line 90,col 13)"
      ]
    }
  ]
}