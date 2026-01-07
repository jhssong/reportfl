{
  "filepath": "/tmp/Math-70b/src/test/java/org/apache/commons/math/ode/TestProblem3.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TestProblem3",
      "is_interface": false,
      "parent_types": [
        "TestProblemAbstract"
      ],
      "begin_line": 37,
      "end_line": 130,
      "comment": "\n * This class is used in the junit tests for the ODE integrators.\n\n * \u003cp\u003eThis specific problem is the following differential equation :\n * \u003cpre\u003e\n *    y1\u0027\u0027 \u003d -y1/r^3  y1 (0) \u003d 1-e  y1\u0027 (0) \u003d 0\n *    y2\u0027\u0027 \u003d -y2/r^3  y2 (0) \u003d 0    y2\u0027 (0) \u003dsqrt((1+e)/(1-e))\n *    r \u003d sqrt (y1^2 + y2^2), e \u003d 0.9\n * \u003c/pre\u003e\n * This is a two-body problem in the plane which can be solved by\n * Kepler\u0027s equation\n * \u003cpre\u003e\n *   y1 (t) \u003d ...\n * \u003c/pre\u003e\n * \u003c/p\u003e\n\n "
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
        "e"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Eccentricity "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " theoretical state "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.TestProblem3.TestProblem3(double)",
      "begin_line": 53,
      "end_line": 62,
      "comment": "\n   * Simple constructor.\n   * @param e eccentricity\n   ",
      "child_ranges": [
        "(line 54,col 5)-(line 54,col 12)",
        "(line 55,col 5)-(line 55,col 15)",
        "(line 56,col 5)-(line 56,col 58)",
        "(line 57,col 5)-(line 57,col 34)",
        "(line 58,col 5)-(line 58,col 29)",
        "(line 59,col 5)-(line 59,col 49)",
        "(line 60,col 5)-(line 60,col 30)",
        "(line 61,col 5)-(line 61,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.TestProblem3.TestProblem3()",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n   * Simple constructor.\n   ",
      "child_ranges": [
        "(line 68,col 5)-(line 68,col 14)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.TestProblem3.TestProblem3(org.apache.commons.math.ode.TestProblem3)",
      "begin_line": 75,
      "end_line": 79,
      "comment": "\n   * Copy constructor.\n   * @param problem problem to copy\n   ",
      "child_ranges": [
        "(line 76,col 5)-(line 76,col 19)",
        "(line 77,col 5)-(line 77,col 18)",
        "(line 78,col 5)-(line 78,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem3.copy()",
      "begin_line": 82,
      "end_line": 85,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 84,col 5)-(line 84,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem3.doComputeDerivatives(double, double[], double[])",
      "begin_line": 87,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 91,col 5)-(line 91,col 42)",
        "(line 92,col 5)-(line 92,col 44)",
        "(line 95,col 5)-(line 95,col 19)",
        "(line 96,col 5)-(line 96,col 19)",
        "(line 97,col 5)-(line 97,col 29)",
        "(line 98,col 5)-(line 98,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem3.computeTheoreticalState(double)",
      "begin_line": 102,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 106,col 5)-(line 106,col 17)",
        "(line 107,col 5)-(line 107,col 17)",
        "(line 108,col 5)-(line 108,col 24)",
        "(line 109,col 5)-(line 117,col 5)",
        "(line 119,col 5)-(line 119,col 30)",
        "(line 120,col 5)-(line 120,col 30)",
        "(line 122,col 5)-(line 122,col 20)",
        "(line 123,col 5)-(line 123,col 39)",
        "(line 124,col 5)-(line 124,col 34)",
        "(line 125,col 5)-(line 125,col 56)",
        "(line 127,col 5)-(line 127,col 13)"
      ]
    }
  ]
}