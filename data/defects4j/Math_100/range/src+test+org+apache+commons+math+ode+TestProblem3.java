{
  "filepath": "/tmp/Math-100b/src/test/org/apache/commons/math/ode/TestProblem3.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TestProblem3",
      "is_interface": false,
      "parent_types": [
        "TestProblemAbstract"
      ],
      "begin_line": 37,
      "end_line": 127,
      "comment": "\n * This class is used in the junit tests for the ODE integrators.\n\n * \u003cp\u003eThis specific problem is the following differential equation :\n * \u003cpre\u003e\n *    y1\u0027\u0027 \u003d -y1/r^3  y1 (0) \u003d 1-e  y1\u0027 (0) \u003d 0\n *    y2\u0027\u0027 \u003d -y2/r^3  y2 (0) \u003d 0    y2\u0027 (0) \u003dsqrt((1+e)/(1-e))\n *    r \u003d sqrt (y1^2 + y2^2), e \u003d 0.9\n * \u003c/pre\u003e\n * This is a two-body problem in the plane which can be solved by\n * Kepler\u0027s equation\n * \u003cpre\u003e\n *   y1 (t) \u003d ...\n * \u003c/pre\u003e\n * \u003c/p\u003e\n\n "
    },
    {
      "type": "field",
      "varNames": [
        "e"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Eccentricity "
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
      "signature": "org.apache.commons.math.ode.TestProblem3.TestProblem3(double)",
      "begin_line": 50,
      "end_line": 59,
      "comment": "\n   * Simple constructor.\n   * @param e eccentricity\n   ",
      "child_ranges": [
        "(line 51,col 5)-(line 51,col 12)",
        "(line 52,col 5)-(line 52,col 15)",
        "(line 53,col 5)-(line 53,col 58)",
        "(line 54,col 5)-(line 54,col 34)",
        "(line 55,col 5)-(line 55,col 29)",
        "(line 56,col 5)-(line 56,col 49)",
        "(line 57,col 5)-(line 57,col 30)",
        "(line 58,col 5)-(line 58,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.TestProblem3.TestProblem3()",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n   * Simple constructor.\n   ",
      "child_ranges": [
        "(line 65,col 5)-(line 65,col 14)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.TestProblem3.TestProblem3(org.apache.commons.math.ode.TestProblem3)",
      "begin_line": 72,
      "end_line": 76,
      "comment": "\n   * Copy constructor.\n   * @param problem problem to copy\n   ",
      "child_ranges": [
        "(line 73,col 5)-(line 73,col 19)",
        "(line 74,col 5)-(line 74,col 18)",
        "(line 75,col 5)-(line 75,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem3.clone()",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\n   * Clone operation.\n   * @return a copy of the instance\n   ",
      "child_ranges": [
        "(line 83,col 5)-(line 83,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem3.doComputeDerivatives(double, double[], double[])",
      "begin_line": 86,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 89,col 5)-(line 89,col 42)",
        "(line 90,col 5)-(line 90,col 44)",
        "(line 93,col 5)-(line 93,col 19)",
        "(line 94,col 5)-(line 94,col 19)",
        "(line 95,col 5)-(line 95,col 29)",
        "(line 96,col 5)-(line 96,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem3.computeTheoreticalState(double)",
      "begin_line": 100,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 103,col 5)-(line 103,col 17)",
        "(line 104,col 5)-(line 104,col 17)",
        "(line 105,col 5)-(line 105,col 20)",
        "(line 106,col 5)-(line 114,col 39)",
        "(line 116,col 5)-(line 116,col 30)",
        "(line 117,col 5)-(line 117,col 30)",
        "(line 119,col 5)-(line 119,col 20)",
        "(line 120,col 5)-(line 120,col 39)",
        "(line 121,col 5)-(line 121,col 34)",
        "(line 122,col 5)-(line 122,col 56)",
        "(line 124,col 5)-(line 124,col 13)"
      ]
    }
  ]
}