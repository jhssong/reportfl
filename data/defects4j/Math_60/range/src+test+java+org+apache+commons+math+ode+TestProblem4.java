{
  "filepath": "/tmp/Math-60b/src/test/java/org/apache/commons/math/ode/TestProblem4.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TestProblem4",
      "is_interface": false,
      "parent_types": [
        "TestProblemAbstract"
      ],
      "begin_line": 38,
      "end_line": 144,
      "comment": "\n * This class is used in the junit tests for the ODE integrators.\n\n * \u003cp\u003eThis specific problem is the following differential equation :\n * \u003cpre\u003e\n *    x\u0027\u0027 \u003d -x\n * \u003c/pre\u003e\n * And when x decreases down to 0, the state should be changed as follows :\n * \u003cpre\u003e\n *   x\u0027 -\u003e -x\u0027\n * \u003c/pre\u003e\n * The theoretical solution of this problem is x \u003d |sin(t+a)|\n * \u003c/p\u003e\n\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Time offset. "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " theoretical state "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.TestProblem4.TestProblem4()",
      "begin_line": 51,
      "end_line": 60,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 52,col 5)-(line 52,col 12)",
        "(line 53,col 5)-(line 53,col 12)",
        "(line 54,col 5)-(line 54,col 55)",
        "(line 55,col 5)-(line 55,col 34)",
        "(line 56,col 5)-(line 56,col 27)",
        "(line 57,col 5)-(line 57,col 39)",
        "(line 58,col 5)-(line 58,col 30)",
        "(line 59,col 5)-(line 59,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.TestProblem4.TestProblem4(org.apache.commons.math.ode.TestProblem4)",
      "begin_line": 66,
      "end_line": 70,
      "comment": "\n   * Copy constructor.\n   * @param problem problem to copy\n   ",
      "child_ranges": [
        "(line 67,col 5)-(line 67,col 19)",
        "(line 68,col 5)-(line 68,col 18)",
        "(line 69,col 5)-(line 69,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem4.copy()",
      "begin_line": 73,
      "end_line": 76,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 75,col 5)-(line 75,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem4.getEventsHandlers()",
      "begin_line": 78,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 80,col 5)-(line 80,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem4.doComputeDerivatives(double, double[], double[])",
      "begin_line": 83,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 85,col 5)-(line 85,col 20)",
        "(line 86,col 5)-(line 86,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem4.computeTheoreticalState(double)",
      "begin_line": 89,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 91,col 5)-(line 91,col 37)",
        "(line 92,col 5)-(line 92,col 37)",
        "(line 93,col 5)-(line 93,col 29)",
        "(line 94,col 5)-(line 94,col 35)",
        "(line 95,col 5)-(line 95,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Bounce",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.events.EventHandler"
      ],
      "begin_line": 98,
      "end_line": 122,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sign"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.TestProblem4.Bounce.Bounce()",
      "begin_line": 103,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 104,col 7)-(line 104,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem4.Bounce.g(double, double[])",
      "begin_line": 107,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 108,col 7)-(line 108,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem4.Bounce.eventOccurred(double, double[], boolean)",
      "begin_line": 111,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 113,col 7)-(line 113,col 19)",
        "(line 114,col 7)-(line 114,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem4.Bounce.resetState(double, double[])",
      "begin_line": 117,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 118,col 7)-(line 118,col 19)",
        "(line 119,col 7)-(line 119,col 19)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Stop",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.events.EventHandler"
      ],
      "begin_line": 124,
      "end_line": 142,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.TestProblem4.Stop.Stop()",
      "begin_line": 128,
      "end_line": 129,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem4.Stop.g(double, double[])",
      "begin_line": 131,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 132,col 7)-(line 132,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem4.Stop.eventOccurred(double, double[], boolean)",
      "begin_line": 135,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 136,col 7)-(line 136,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem4.Stop.resetState(double, double[])",
      "begin_line": 139,
      "end_line": 140,
      "comment": "",
      "child_ranges": []
    }
  ]
}