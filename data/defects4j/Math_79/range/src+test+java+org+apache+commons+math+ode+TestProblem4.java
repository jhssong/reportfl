{
  "filepath": "/tmp/Math-79b/src/test/java/org/apache/commons/math/ode/TestProblem4.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TestProblem4",
      "is_interface": false,
      "parent_types": [
        "TestProblemAbstract"
      ],
      "begin_line": 37,
      "end_line": 142,
      "comment": "\n * This class is used in the junit tests for the ODE integrators.\n\n * \u003cp\u003eThis specific problem is the following differential equation :\n * \u003cpre\u003e\n *    x\u0027\u0027 \u003d -x\n * \u003c/pre\u003e\n * And when x decreases down to 0, the state should be changed as follows :\n * \u003cpre\u003e\n *   x\u0027 -\u003e -x\u0027\n * \u003c/pre\u003e\n * The theoretical solution of this problem is x \u003d |sin(t+a)|\n * \u003c/p\u003e\n\n "
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
        "a"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Time offset. "
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
      "signature": "org.apache.commons.math.ode.TestProblem4.TestProblem4()",
      "begin_line": 50,
      "end_line": 59,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 51,col 5)-(line 51,col 12)",
        "(line 52,col 5)-(line 52,col 12)",
        "(line 53,col 5)-(line 53,col 47)",
        "(line 54,col 5)-(line 54,col 34)",
        "(line 55,col 5)-(line 55,col 27)",
        "(line 56,col 5)-(line 56,col 39)",
        "(line 57,col 5)-(line 57,col 30)",
        "(line 58,col 5)-(line 58,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.TestProblem4.TestProblem4(org.apache.commons.math.ode.TestProblem4)",
      "begin_line": 65,
      "end_line": 69,
      "comment": "\n   * Copy constructor.\n   * @param problem problem to copy\n   ",
      "child_ranges": [
        "(line 66,col 5)-(line 66,col 19)",
        "(line 67,col 5)-(line 67,col 18)",
        "(line 68,col 5)-(line 68,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem4.copy()",
      "begin_line": 72,
      "end_line": 74,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 73,col 5)-(line 73,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem4.getEventsHandlers()",
      "begin_line": 76,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 78,col 5)-(line 78,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem4.doComputeDerivatives(double, double[], double[])",
      "begin_line": 81,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 83,col 5)-(line 83,col 20)",
        "(line 84,col 5)-(line 84,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem4.computeTheoreticalState(double)",
      "begin_line": 87,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 89,col 5)-(line 89,col 33)",
        "(line 90,col 5)-(line 90,col 33)",
        "(line 91,col 5)-(line 91,col 25)",
        "(line 92,col 5)-(line 92,col 35)",
        "(line 93,col 5)-(line 93,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Bounce",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.events.EventHandler"
      ],
      "begin_line": 96,
      "end_line": 120,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sign"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.TestProblem4.Bounce.Bounce()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 102,col 7)-(line 102,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem4.Bounce.g(double, double[])",
      "begin_line": 105,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 106,col 7)-(line 106,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem4.Bounce.eventOccurred(double, double[], boolean)",
      "begin_line": 109,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 111,col 7)-(line 111,col 19)",
        "(line 112,col 7)-(line 112,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem4.Bounce.resetState(double, double[])",
      "begin_line": 115,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 116,col 7)-(line 116,col 19)",
        "(line 117,col 7)-(line 117,col 19)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Stop",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.events.EventHandler"
      ],
      "begin_line": 122,
      "end_line": 140,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.TestProblem4.Stop.Stop()",
      "begin_line": 126,
      "end_line": 127,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem4.Stop.g(double, double[])",
      "begin_line": 129,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 130,col 7)-(line 130,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem4.Stop.eventOccurred(double, double[], boolean)",
      "begin_line": 133,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 134,col 7)-(line 134,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem4.Stop.resetState(double, double[])",
      "begin_line": 137,
      "end_line": 138,
      "comment": "",
      "child_ranges": []
    }
  ]
}