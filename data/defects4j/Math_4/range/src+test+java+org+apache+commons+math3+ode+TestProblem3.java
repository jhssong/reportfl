{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/ode/TestProblem3.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TestProblem3",
      "is_interface": false,
      "parent_types": [
        "TestProblemAbstract"
      ],
      "begin_line": 39,
      "end_line": 129,
      "comment": "\n * This class is used in the junit tests for the ODE integrators.\n\n * \u003cp\u003eThis specific problem is the following differential equation :\n * \u003cpre\u003e\n *    y1\u0027\u0027 \u003d -y1/r^3  y1 (0) \u003d 1-e  y1\u0027 (0) \u003d 0\n *    y2\u0027\u0027 \u003d -y2/r^3  y2 (0) \u003d 0    y2\u0027 (0) \u003dsqrt((1+e)/(1-e))\n *    r \u003d sqrt (y1^2 + y2^2), e \u003d 0.9\n * \u003c/pre\u003e\n * This is a two-body problem in the plane which can be solved by\n * Kepler\u0027s equation\n * \u003cpre\u003e\n *   y1 (t) \u003d ...\n * \u003c/pre\u003e\n * \u003c/p\u003e\n\n "
    },
    {
      "type": "field",
      "varNames": [
        "e"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Eccentricity "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " theoretical state "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.TestProblem3.TestProblem3(double)",
      "begin_line": 52,
      "end_line": 61,
      "comment": "\n   * Simple constructor.\n   * @param e eccentricity\n   ",
      "child_ranges": [
        "(line 53,col 5)-(line 53,col 12)",
        "(line 54,col 5)-(line 54,col 15)",
        "(line 55,col 5)-(line 55,col 62)",
        "(line 56,col 5)-(line 56,col 34)",
        "(line 57,col 5)-(line 57,col 29)",
        "(line 58,col 5)-(line 58,col 49)",
        "(line 59,col 5)-(line 59,col 30)",
        "(line 60,col 5)-(line 60,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.TestProblem3.TestProblem3()",
      "begin_line": 66,
      "end_line": 68,
      "comment": "\n   * Simple constructor.\n   ",
      "child_ranges": [
        "(line 67,col 5)-(line 67,col 14)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.TestProblem3.TestProblem3(org.apache.commons.math3.ode.TestProblem3)",
      "begin_line": 74,
      "end_line": 78,
      "comment": "\n   * Copy constructor.\n   * @param problem problem to copy\n   ",
      "child_ranges": [
        "(line 75,col 5)-(line 75,col 19)",
        "(line 76,col 5)-(line 76,col 18)",
        "(line 77,col 5)-(line 77,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.TestProblem3.copy()",
      "begin_line": 81,
      "end_line": 84,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 83,col 5)-(line 83,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.TestProblem3.doComputeDerivatives(double, double[], double[])",
      "begin_line": 86,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 90,col 5)-(line 90,col 42)",
        "(line 91,col 5)-(line 91,col 48)",
        "(line 94,col 5)-(line 94,col 19)",
        "(line 95,col 5)-(line 95,col 19)",
        "(line 96,col 5)-(line 96,col 29)",
        "(line 97,col 5)-(line 97,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.TestProblem3.computeTheoreticalState(double)",
      "begin_line": 101,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 105,col 5)-(line 105,col 17)",
        "(line 106,col 5)-(line 106,col 17)",
        "(line 107,col 5)-(line 107,col 24)",
        "(line 108,col 5)-(line 116,col 5)",
        "(line 118,col 5)-(line 118,col 34)",
        "(line 119,col 5)-(line 119,col 34)",
        "(line 121,col 5)-(line 121,col 20)",
        "(line 122,col 5)-(line 122,col 43)",
        "(line 123,col 5)-(line 123,col 34)",
        "(line 124,col 5)-(line 124,col 60)",
        "(line 126,col 5)-(line 126,col 13)"
      ]
    }
  ]
}