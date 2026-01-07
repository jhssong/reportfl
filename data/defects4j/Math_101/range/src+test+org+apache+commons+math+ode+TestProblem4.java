{
  "filepath": "/tmp/Math-101b/src/test/org/apache/commons/math/ode/TestProblem4.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TestProblem4",
      "is_interface": false,
      "parent_types": [
        "TestProblemAbstract"
      ],
      "begin_line": 37,
      "end_line": 138,
      "comment": "\n * This class is used in the junit tests for the ODE integrators.\n\n * \u003cp\u003eThis specific problem is the following differential equation :\n * \u003cpre\u003e\n *    x\u0027\u0027 \u003d -x\n * \u003c/pre\u003e\n * And when x decreases down to 0, the state should be changed as follows :\n * \u003cpre\u003e\n *   x\u0027 -\u003e -x\u0027\n * \u003c/pre\u003e\n * The theoretical solution of this problem is x \u003d |sin(t+a)|\n * \u003c/p\u003e\n\n "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Time offset. "
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
      "signature": "org.apache.commons.math.ode.TestProblem4.TestProblem4()",
      "begin_line": 47,
      "end_line": 56,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 48,col 5)-(line 48,col 12)",
        "(line 49,col 5)-(line 49,col 12)",
        "(line 50,col 5)-(line 50,col 47)",
        "(line 51,col 5)-(line 51,col 34)",
        "(line 52,col 5)-(line 52,col 27)",
        "(line 53,col 5)-(line 53,col 39)",
        "(line 54,col 5)-(line 54,col 30)",
        "(line 55,col 5)-(line 55,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.TestProblem4.TestProblem4(org.apache.commons.math.ode.TestProblem4)",
      "begin_line": 62,
      "end_line": 66,
      "comment": "\n   * Copy constructor.\n   * @param problem problem to copy\n   ",
      "child_ranges": [
        "(line 63,col 5)-(line 63,col 19)",
        "(line 64,col 5)-(line 64,col 18)",
        "(line 65,col 5)-(line 65,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem4.clone()",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\n   * Clone operation.\n   * @return a copy of the instance\n   ",
      "child_ranges": [
        "(line 73,col 5)-(line 73,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem4.getSwitchingFunctions()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 77,col 5)-(line 77,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem4.doComputeDerivatives(double, double[], double[])",
      "begin_line": 80,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 81,col 5)-(line 81,col 20)",
        "(line 82,col 5)-(line 82,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem4.computeTheoreticalState(double)",
      "begin_line": 85,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 86,col 5)-(line 86,col 33)",
        "(line 87,col 5)-(line 87,col 33)",
        "(line 88,col 5)-(line 88,col 25)",
        "(line 89,col 5)-(line 89,col 35)",
        "(line 90,col 5)-(line 90,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Bounce",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.SwitchingFunction"
      ],
      "begin_line": 93,
      "end_line": 116,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sign"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.TestProblem4.Bounce.Bounce()",
      "begin_line": 98,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 99,col 7)-(line 99,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem4.Bounce.g(double, double[])",
      "begin_line": 102,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 103,col 7)-(line 103,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem4.Bounce.eventOccurred(double, double[])",
      "begin_line": 106,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 108,col 7)-(line 108,col 19)",
        "(line 109,col 7)-(line 109,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem4.Bounce.resetState(double, double[])",
      "begin_line": 112,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 113,col 7)-(line 113,col 19)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Stop",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.SwitchingFunction"
      ],
      "begin_line": 118,
      "end_line": 136,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.TestProblem4.Stop.Stop()",
      "begin_line": 122,
      "end_line": 123,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem4.Stop.g(double, double[])",
      "begin_line": 125,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 126,col 7)-(line 126,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem4.Stop.eventOccurred(double, double[])",
      "begin_line": 129,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 130,col 7)-(line 130,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblem4.Stop.resetState(double, double[])",
      "begin_line": 133,
      "end_line": 134,
      "comment": "",
      "child_ranges": []
    }
  ]
}