{
  "filepath": "/tmp/Math-87b/src/test/org/apache/commons/math/ode/nonstiff/TestProblem4.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TestProblem4",
      "is_interface": false,
      "parent_types": [
        "TestProblemAbstract"
      ],
      "begin_line": 37,
      "end_line": 146,
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
      "signature": "org.apache.commons.math.ode.nonstiff.TestProblem4.TestProblem4()",
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
      "signature": "org.apache.commons.math.ode.nonstiff.TestProblem4.TestProblem4(org.apache.commons.math.ode.nonstiff.TestProblem4)",
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
      "signature": "org.apache.commons.math.ode.nonstiff.TestProblem4.clone()",
      "begin_line": 75,
      "end_line": 78,
      "comment": "\n   * Clone operation.\n   * @return a copy of the instance\n   ",
      "child_ranges": [
        "(line 77,col 5)-(line 77,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.TestProblem4.getEventsHandlers()",
      "begin_line": 80,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 82,col 5)-(line 82,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.TestProblem4.doComputeDerivatives(double, double[], double[])",
      "begin_line": 85,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 87,col 5)-(line 87,col 20)",
        "(line 88,col 5)-(line 88,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.TestProblem4.computeTheoreticalState(double)",
      "begin_line": 91,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 93,col 5)-(line 93,col 33)",
        "(line 94,col 5)-(line 94,col 33)",
        "(line 95,col 5)-(line 95,col 25)",
        "(line 96,col 5)-(line 96,col 35)",
        "(line 97,col 5)-(line 97,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Bounce",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.events.EventHandler"
      ],
      "begin_line": 100,
      "end_line": 124,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sign"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.TestProblem4.Bounce.Bounce()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 106,col 7)-(line 106,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.TestProblem4.Bounce.g(double, double[])",
      "begin_line": 109,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 110,col 7)-(line 110,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.TestProblem4.Bounce.eventOccurred(double, double[], boolean)",
      "begin_line": 113,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 115,col 7)-(line 115,col 19)",
        "(line 116,col 7)-(line 116,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.TestProblem4.Bounce.resetState(double, double[])",
      "begin_line": 119,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 120,col 7)-(line 120,col 19)",
        "(line 121,col 7)-(line 121,col 19)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Stop",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.events.EventHandler"
      ],
      "begin_line": 126,
      "end_line": 144,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.TestProblem4.Stop.Stop()",
      "begin_line": 130,
      "end_line": 131,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.TestProblem4.Stop.g(double, double[])",
      "begin_line": 133,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 134,col 7)-(line 134,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.TestProblem4.Stop.eventOccurred(double, double[], boolean)",
      "begin_line": 137,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 138,col 7)-(line 138,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.TestProblem4.Stop.resetState(double, double[])",
      "begin_line": 141,
      "end_line": 142,
      "comment": "",
      "child_ranges": []
    }
  ]
}