{
  "filepath": "/tmp/Math-70b/src/test/java/org/apache/commons/math/ode/TestProblem1.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TestProblem1",
      "is_interface": false,
      "parent_types": [
        "TestProblemAbstract"
      ],
      "begin_line": 34,
      "end_line": 89,
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
      "signature": "org.apache.commons.math.ode.TestProblem1.TestProblem1()",
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
      "signature": "org.apache.commons.math.ode.TestProblem1.TestProblem1(org.apache.commons.math.ode.TestProblem1)",
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
      "signature": "org.apache.commons.math.ode.TestProblem1.copy()",
      "begin_line": 66,
      "end_line": 69,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 68,col 5)-(line 68,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem1.doComputeDerivatives(double, double[], double[])",
      "begin_line": 71,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 75,col 5)-(line 76,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem1.computeTheoreticalState(double)",
      "begin_line": 80,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 82,col 5)-(line 82,col 33)",
        "(line 83,col 5)-(line 85,col 5)",
        "(line 86,col 5)-(line 86,col 13)"
      ]
    }
  ]
}