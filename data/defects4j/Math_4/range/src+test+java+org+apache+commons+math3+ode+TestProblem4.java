{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/ode/TestProblem4.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TestProblem4",
      "is_interface": false,
      "parent_types": [
        "TestProblemAbstract"
      ],
      "begin_line": 38,
      "end_line": 159,
      "comment": "\n * This class is used in the junit tests for the ODE integrators.\n\n * \u003cp\u003eThis specific problem is the following differential equation :\n * \u003cpre\u003e\n *    x\u0027\u0027 \u003d -x\n * \u003c/pre\u003e\n * And when x decreases down to 0, the state should be changed as follows :\n * \u003cpre\u003e\n *   x\u0027 -\u003e -x\u0027\n * \u003c/pre\u003e\n * The theoretical solution of this problem is x \u003d |sin(t+a)|\n * \u003c/p\u003e\n\n "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Time offset. "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " theoretical state "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.TestProblem4.TestProblem4()",
      "begin_line": 48,
      "end_line": 57,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 49,col 5)-(line 49,col 12)",
        "(line 50,col 5)-(line 50,col 12)",
        "(line 51,col 5)-(line 51,col 55)",
        "(line 52,col 5)-(line 52,col 34)",
        "(line 53,col 5)-(line 53,col 27)",
        "(line 54,col 5)-(line 54,col 39)",
        "(line 55,col 5)-(line 55,col 30)",
        "(line 56,col 5)-(line 56,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.TestProblem4.TestProblem4(org.apache.commons.math3.ode.TestProblem4)",
      "begin_line": 63,
      "end_line": 67,
      "comment": "\n   * Copy constructor.\n   * @param problem problem to copy\n   ",
      "child_ranges": [
        "(line 64,col 5)-(line 64,col 19)",
        "(line 65,col 5)-(line 65,col 18)",
        "(line 66,col 5)-(line 66,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.TestProblem4.copy()",
      "begin_line": 70,
      "end_line": 73,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 72,col 5)-(line 72,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.TestProblem4.getEventsHandlers()",
      "begin_line": 75,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 77,col 5)-(line 77,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.TestProblem4.getTheoreticalEventsTimes()",
      "begin_line": 84,
      "end_line": 93,
      "comment": "\n   * Get the theoretical events times.\n   * @return theoretical events times\n   ",
      "child_ranges": [
        "(line 86,col 7)-(line 92,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.TestProblem4.doComputeDerivatives(double, double[], double[])",
      "begin_line": 95,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 97,col 5)-(line 97,col 20)",
        "(line 98,col 5)-(line 98,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.TestProblem4.computeTheoreticalState(double)",
      "begin_line": 101,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 103,col 5)-(line 103,col 37)",
        "(line 104,col 5)-(line 104,col 37)",
        "(line 105,col 5)-(line 105,col 29)",
        "(line 106,col 5)-(line 106,col 35)",
        "(line 107,col 5)-(line 107,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Bounce",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ode.events.EventHandler"
      ],
      "begin_line": 110,
      "end_line": 136,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sign"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.TestProblem4.Bounce.Bounce()",
      "begin_line": 114,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 115,col 7)-(line 115,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.TestProblem4.Bounce.init(double, double[], double)",
      "begin_line": 118,
      "end_line": 119,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.TestProblem4.Bounce.g(double, double[])",
      "begin_line": 121,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 122,col 7)-(line 122,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.TestProblem4.Bounce.eventOccurred(double, double[], boolean)",
      "begin_line": 125,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 127,col 7)-(line 127,col 19)",
        "(line 128,col 7)-(line 128,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.TestProblem4.Bounce.resetState(double, double[])",
      "begin_line": 131,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 132,col 7)-(line 132,col 19)",
        "(line 133,col 7)-(line 133,col 19)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Stop",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ode.events.EventHandler"
      ],
      "begin_line": 138,
      "end_line": 157,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.TestProblem4.Stop.Stop()",
      "begin_line": 140,
      "end_line": 141,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.TestProblem4.Stop.init(double, double[], double)",
      "begin_line": 143,
      "end_line": 144,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.TestProblem4.Stop.g(double, double[])",
      "begin_line": 146,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 147,col 7)-(line 147,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.TestProblem4.Stop.eventOccurred(double, double[], boolean)",
      "begin_line": 150,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 151,col 7)-(line 151,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.TestProblem4.Stop.resetState(double, double[])",
      "begin_line": 154,
      "end_line": 155,
      "comment": "",
      "child_ranges": []
    }
  ]
}