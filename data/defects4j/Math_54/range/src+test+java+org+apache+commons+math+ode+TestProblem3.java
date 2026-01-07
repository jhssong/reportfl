{
  "filepath": "/tmp/Math-54b/src/test/java/org/apache/commons/math/ode/TestProblem3.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TestProblem3",
      "is_interface": false,
      "parent_types": [
        "TestProblemAbstract"
      ],
      "begin_line": 39,
      "end_line": 132,
      "comment": "\n * This class is used in the junit tests for the ODE integrators.\n\n * \u003cp\u003eThis specific problem is the following differential equation :\n * \u003cpre\u003e\n *    y1\u0027\u0027 \u003d -y1/r^3  y1 (0) \u003d 1-e  y1\u0027 (0) \u003d 0\n *    y2\u0027\u0027 \u003d -y2/r^3  y2 (0) \u003d 0    y2\u0027 (0) \u003dsqrt((1+e)/(1-e))\n *    r \u003d sqrt (y1^2 + y2^2), e \u003d 0.9\n * \u003c/pre\u003e\n * This is a two-body problem in the plane which can be solved by\n * Kepler\u0027s equation\n * \u003cpre\u003e\n *   y1 (t) \u003d ...\n * \u003c/pre\u003e\n * \u003c/p\u003e\n\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "e"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Eccentricity "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " theoretical state "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.TestProblem3.TestProblem3(double)",
      "begin_line": 55,
      "end_line": 64,
      "comment": "\n   * Simple constructor.\n   * @param e eccentricity\n   ",
      "child_ranges": [
        "(line 56,col 5)-(line 56,col 12)",
        "(line 57,col 5)-(line 57,col 15)",
        "(line 58,col 5)-(line 58,col 62)",
        "(line 59,col 5)-(line 59,col 34)",
        "(line 60,col 5)-(line 60,col 29)",
        "(line 61,col 5)-(line 61,col 49)",
        "(line 62,col 5)-(line 62,col 30)",
        "(line 63,col 5)-(line 63,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.TestProblem3.TestProblem3()",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n   * Simple constructor.\n   ",
      "child_ranges": [
        "(line 70,col 5)-(line 70,col 14)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.TestProblem3.TestProblem3(org.apache.commons.math.ode.TestProblem3)",
      "begin_line": 77,
      "end_line": 81,
      "comment": "\n   * Copy constructor.\n   * @param problem problem to copy\n   ",
      "child_ranges": [
        "(line 78,col 5)-(line 78,col 19)",
        "(line 79,col 5)-(line 79,col 18)",
        "(line 80,col 5)-(line 80,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem3.copy()",
      "begin_line": 84,
      "end_line": 87,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 86,col 5)-(line 86,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem3.doComputeDerivatives(double, double[], double[])",
      "begin_line": 89,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 93,col 5)-(line 93,col 42)",
        "(line 94,col 5)-(line 94,col 48)",
        "(line 97,col 5)-(line 97,col 19)",
        "(line 98,col 5)-(line 98,col 19)",
        "(line 99,col 5)-(line 99,col 29)",
        "(line 100,col 5)-(line 100,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem3.computeTheoreticalState(double)",
      "begin_line": 104,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 108,col 5)-(line 108,col 17)",
        "(line 109,col 5)-(line 109,col 17)",
        "(line 110,col 5)-(line 110,col 24)",
        "(line 111,col 5)-(line 119,col 5)",
        "(line 121,col 5)-(line 121,col 34)",
        "(line 122,col 5)-(line 122,col 34)",
        "(line 124,col 5)-(line 124,col 20)",
        "(line 125,col 5)-(line 125,col 43)",
        "(line 126,col 5)-(line 126,col 34)",
        "(line 127,col 5)-(line 127,col 60)",
        "(line 129,col 5)-(line 129,col 13)"
      ]
    }
  ]
}