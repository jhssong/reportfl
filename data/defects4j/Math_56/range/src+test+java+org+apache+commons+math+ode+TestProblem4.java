{
  "filepath": "/tmp/Math-56b/src/test/java/org/apache/commons/math/ode/TestProblem4.java",
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
      "signature": "org.apache.commons.math.ode.TestProblem4.getTheoreticalEventsTimes()",
      "begin_line": 87,
      "end_line": 96,
      "comment": "\n   * Get the theoretical events times.\n   * @return theoretical events times\n   ",
      "child_ranges": [
        "(line 89,col 7)-(line 95,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem4.doComputeDerivatives(double, double[], double[])",
      "begin_line": 98,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 100,col 5)-(line 100,col 20)",
        "(line 101,col 5)-(line 101,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem4.computeTheoreticalState(double)",
      "begin_line": 104,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 106,col 5)-(line 106,col 37)",
        "(line 107,col 5)-(line 107,col 37)",
        "(line 108,col 5)-(line 108,col 29)",
        "(line 109,col 5)-(line 109,col 35)",
        "(line 110,col 5)-(line 110,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Bounce",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.events.EventHandler"
      ],
      "begin_line": 113,
      "end_line": 137,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sign"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.TestProblem4.Bounce.Bounce()",
      "begin_line": 118,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 119,col 7)-(line 119,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem4.Bounce.g(double, double[])",
      "begin_line": 122,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 123,col 7)-(line 123,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem4.Bounce.eventOccurred(double, double[], boolean)",
      "begin_line": 126,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 128,col 7)-(line 128,col 19)",
        "(line 129,col 7)-(line 129,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem4.Bounce.resetState(double, double[])",
      "begin_line": 132,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 133,col 7)-(line 133,col 19)",
        "(line 134,col 7)-(line 134,col 19)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Stop",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.events.EventHandler"
      ],
      "begin_line": 139,
      "end_line": 157,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 141,
      "end_line": 141,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.TestProblem4.Stop.Stop()",
      "begin_line": 143,
      "end_line": 144,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem4.Stop.g(double, double[])",
      "begin_line": 146,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 147,col 7)-(line 147,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem4.Stop.eventOccurred(double, double[], boolean)",
      "begin_line": 150,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 151,col 7)-(line 151,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem4.Stop.resetState(double, double[])",
      "begin_line": 154,
      "end_line": 155,
      "comment": "",
      "child_ranges": []
    }
  ]
}