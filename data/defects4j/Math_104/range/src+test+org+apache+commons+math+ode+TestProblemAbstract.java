{
  "filepath": "/tmp/Math-104b/src/test/org/apache/commons/math/ode/TestProblemAbstract.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TestProblemAbstract",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.FirstOrderDifferentialEquations",
        "java.lang.Cloneable"
      ],
      "begin_line": 27,
      "end_line": 181,
      "comment": "\n * This class is used as the base class of the problems that are\n * integrated during the junit tests for the ODE integrators.\n "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " Dimension of the problem. "
    },
    {
      "type": "field",
      "varNames": [
        "calls"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Number of functions calls. "
    },
    {
      "type": "field",
      "varNames": [
        "t0"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Initial time "
    },
    {
      "type": "field",
      "varNames": [
        "y0"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Initial state "
    },
    {
      "type": "field",
      "varNames": [
        "t1"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Final time "
    },
    {
      "type": "field",
      "varNames": [
        "errorScale"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Error scale "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.TestProblemAbstract.TestProblemAbstract()",
      "begin_line": 51,
      "end_line": 58,
      "comment": "\n   * Simple constructor.\n   ",
      "child_ranges": [
        "(line 52,col 5)-(line 52,col 19)",
        "(line 53,col 5)-(line 53,col 19)",
        "(line 54,col 5)-(line 54,col 19)",
        "(line 55,col 5)-(line 55,col 22)",
        "(line 56,col 5)-(line 56,col 19)",
        "(line 57,col 5)-(line 57,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.TestProblemAbstract.TestProblemAbstract(org.apache.commons.math.ode.TestProblemAbstract)",
      "begin_line": 64,
      "end_line": 79,
      "comment": "\n   * Copy constructor.\n   * @param problem problem to copy\n   ",
      "child_ranges": [
        "(line 65,col 5)-(line 65,col 22)",
        "(line 66,col 5)-(line 66,col 26)",
        "(line 67,col 5)-(line 67,col 23)",
        "(line 68,col 5)-(line 72,col 5)",
        "(line 73,col 5)-(line 77,col 5)",
        "(line 78,col 5)-(line 78,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblemAbstract.clone()",
      "begin_line": 85,
      "end_line": 85,
      "comment": "\n   * Clone operation.\n   * @return a copy of the instance\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblemAbstract.setInitialConditions(double, double[])",
      "begin_line": 92,
      "end_line": 97,
      "comment": "\n   * Set the initial conditions\n   * @param t0 initial time\n   * @param y0 initial state vector\n   ",
      "child_ranges": [
        "(line 93,col 5)-(line 93,col 18)",
        "(line 94,col 5)-(line 94,col 26)",
        "(line 95,col 5)-(line 95,col 19)",
        "(line 96,col 5)-(line 96,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblemAbstract.setFinalConditions(double)",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\n   * Set the final conditions.\n   * @param t1 final time\n   ",
      "child_ranges": [
        "(line 104,col 5)-(line 104,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblemAbstract.setErrorScale(double[])",
      "begin_line": 111,
      "end_line": 113,
      "comment": "\n   * Set the error scale\n   * @param errorScale error scale\n   ",
      "child_ranges": [
        "(line 112,col 5)-(line 112,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblemAbstract.getDimension()",
      "begin_line": 115,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 116,col 5)-(line 116,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblemAbstract.getInitialTime()",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\n   * Get the initial time.\n   * @return initial time\n   ",
      "child_ranges": [
        "(line 124,col 5)-(line 124,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblemAbstract.getInitialState()",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\n   * Get the initial state vector.\n   * @return initial state vector\n   ",
      "child_ranges": [
        "(line 132,col 5)-(line 132,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblemAbstract.getFinalTime()",
      "begin_line": 139,
      "end_line": 141,
      "comment": "\n   * Get the final time.\n   * @return final time\n   ",
      "child_ranges": [
        "(line 140,col 5)-(line 140,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblemAbstract.getErrorScale()",
      "begin_line": 147,
      "end_line": 149,
      "comment": "\n   * Get the error scale.\n   * @return error scale\n   ",
      "child_ranges": [
        "(line 148,col 5)-(line 148,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblemAbstract.getSwitchingFunctions()",
      "begin_line": 155,
      "end_line": 157,
      "comment": "\n   * Get the switching functions.\n   * @return switching functions\n   ",
      "child_ranges": [
        "(line 156,col 5)-(line 156,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblemAbstract.getCalls()",
      "begin_line": 163,
      "end_line": 165,
      "comment": "\n   * Get the number of calls.\n   * @return nuber of calls\n   ",
      "child_ranges": [
        "(line 164,col 5)-(line 164,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblemAbstract.computeDerivatives(double, double[], double[])",
      "begin_line": 167,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 168,col 5)-(line 168,col 12)",
        "(line 169,col 5)-(line 169,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblemAbstract.doComputeDerivatives(double, double[], double[])",
      "begin_line": 172,
      "end_line": 172,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblemAbstract.computeTheoreticalState(double)",
      "begin_line": 179,
      "end_line": 179,
      "comment": "\n   * Compute the theoretical state at the specified time.\n   * @param t time at which the state is required\n   * @return state vector at time t\n   ",
      "child_ranges": []
    }
  ]
}