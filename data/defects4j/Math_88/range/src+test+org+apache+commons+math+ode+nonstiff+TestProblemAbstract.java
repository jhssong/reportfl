{
  "filepath": "/tmp/Math-88b/src/test/org/apache/commons/math/ode/nonstiff/TestProblemAbstract.java",
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
      "end_line": 184,
      "comment": "\n * This class is used as the base class of the problems that are\n * integrated during the junit tests for the ODE integrators.\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Dimension of the problem. "
    },
    {
      "type": "field",
      "varNames": [
        "calls"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Number of functions calls. "
    },
    {
      "type": "field",
      "varNames": [
        "t0"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Initial time "
    },
    {
      "type": "field",
      "varNames": [
        "y0"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Initial state "
    },
    {
      "type": "field",
      "varNames": [
        "t1"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Final time "
    },
    {
      "type": "field",
      "varNames": [
        "errorScale"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Error scale "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.TestProblemAbstract.TestProblemAbstract()",
      "begin_line": 54,
      "end_line": 61,
      "comment": "\n   * Simple constructor.\n   ",
      "child_ranges": [
        "(line 55,col 5)-(line 55,col 19)",
        "(line 56,col 5)-(line 56,col 19)",
        "(line 57,col 5)-(line 57,col 19)",
        "(line 58,col 5)-(line 58,col 22)",
        "(line 59,col 5)-(line 59,col 19)",
        "(line 60,col 5)-(line 60,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.TestProblemAbstract.TestProblemAbstract(org.apache.commons.math.ode.nonstiff.TestProblemAbstract)",
      "begin_line": 67,
      "end_line": 82,
      "comment": "\n   * Copy constructor.\n   * @param problem problem to copy\n   ",
      "child_ranges": [
        "(line 68,col 5)-(line 68,col 22)",
        "(line 69,col 5)-(line 69,col 26)",
        "(line 70,col 5)-(line 70,col 23)",
        "(line 71,col 5)-(line 75,col 5)",
        "(line 76,col 5)-(line 80,col 5)",
        "(line 81,col 5)-(line 81,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.TestProblemAbstract.clone()",
      "begin_line": 88,
      "end_line": 89,
      "comment": "\n   * Clone operation.\n   * @return a copy of the instance\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.TestProblemAbstract.setInitialConditions(double, double[])",
      "begin_line": 96,
      "end_line": 101,
      "comment": "\n   * Set the initial conditions\n   * @param t0 initial time\n   * @param y0 initial state vector\n   ",
      "child_ranges": [
        "(line 97,col 5)-(line 97,col 18)",
        "(line 98,col 5)-(line 98,col 26)",
        "(line 99,col 5)-(line 99,col 19)",
        "(line 100,col 5)-(line 100,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.TestProblemAbstract.setFinalConditions(double)",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n   * Set the final conditions.\n   * @param t1 final time\n   ",
      "child_ranges": [
        "(line 108,col 5)-(line 108,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.TestProblemAbstract.setErrorScale(double[])",
      "begin_line": 115,
      "end_line": 117,
      "comment": "\n   * Set the error scale\n   * @param errorScale error scale\n   ",
      "child_ranges": [
        "(line 116,col 5)-(line 116,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.TestProblemAbstract.getDimension()",
      "begin_line": 119,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 120,col 5)-(line 120,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.TestProblemAbstract.getInitialTime()",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\n   * Get the initial time.\n   * @return initial time\n   ",
      "child_ranges": [
        "(line 128,col 5)-(line 128,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.TestProblemAbstract.getInitialState()",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\n   * Get the initial state vector.\n   * @return initial state vector\n   ",
      "child_ranges": [
        "(line 136,col 5)-(line 136,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.TestProblemAbstract.getFinalTime()",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\n   * Get the final time.\n   * @return final time\n   ",
      "child_ranges": [
        "(line 144,col 5)-(line 144,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.TestProblemAbstract.getErrorScale()",
      "begin_line": 151,
      "end_line": 153,
      "comment": "\n   * Get the error scale.\n   * @return error scale\n   ",
      "child_ranges": [
        "(line 152,col 5)-(line 152,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.TestProblemAbstract.getEventsHandlers()",
      "begin_line": 158,
      "end_line": 160,
      "comment": "\n   * Get the events handlers.\n   * @return events handlers   ",
      "child_ranges": [
        "(line 159,col 5)-(line 159,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.TestProblemAbstract.getCalls()",
      "begin_line": 166,
      "end_line": 168,
      "comment": "\n   * Get the number of calls.\n   * @return nuber of calls\n   ",
      "child_ranges": [
        "(line 167,col 5)-(line 167,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.TestProblemAbstract.computeDerivatives(double, double[], double[])",
      "begin_line": 170,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 171,col 5)-(line 171,col 12)",
        "(line 172,col 5)-(line 172,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.TestProblemAbstract.doComputeDerivatives(double, double[], double[])",
      "begin_line": 175,
      "end_line": 175,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.TestProblemAbstract.computeTheoreticalState(double)",
      "begin_line": 182,
      "end_line": 182,
      "comment": "\n   * Compute the theoretical state at the specified time.\n   * @param t time at which the state is required\n   * @return state vector at time t\n   ",
      "child_ranges": []
    }
  ]
}