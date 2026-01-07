{
  "filepath": "/tmp/Math-79b/src/test/java/org/apache/commons/math/ode/TestProblemAbstract.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TestProblemAbstract",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.FirstOrderDifferentialEquations"
      ],
      "begin_line": 27,
      "end_line": 183,
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
      "signature": "org.apache.commons.math.ode.TestProblemAbstract.TestProblemAbstract()",
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
      "signature": "org.apache.commons.math.ode.TestProblemAbstract.TestProblemAbstract(org.apache.commons.math.ode.TestProblemAbstract)",
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
      "signature": "org.apache.commons.math.ode.TestProblemAbstract.copy()",
      "begin_line": 88,
      "end_line": 88,
      "comment": "\n   * Copy operation.\n   * @return a copy of the instance\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblemAbstract.setInitialConditions(double, double[])",
      "begin_line": 95,
      "end_line": 100,
      "comment": "\n   * Set the initial conditions\n   * @param t0 initial time\n   * @param y0 initial state vector\n   ",
      "child_ranges": [
        "(line 96,col 5)-(line 96,col 18)",
        "(line 97,col 5)-(line 97,col 26)",
        "(line 98,col 5)-(line 98,col 19)",
        "(line 99,col 5)-(line 99,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblemAbstract.setFinalConditions(double)",
      "begin_line": 106,
      "end_line": 108,
      "comment": "\n   * Set the final conditions.\n   * @param t1 final time\n   ",
      "child_ranges": [
        "(line 107,col 5)-(line 107,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblemAbstract.setErrorScale(double[])",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n   * Set the error scale\n   * @param errorScale error scale\n   ",
      "child_ranges": [
        "(line 115,col 5)-(line 115,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblemAbstract.getDimension()",
      "begin_line": 118,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 119,col 5)-(line 119,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblemAbstract.getInitialTime()",
      "begin_line": 126,
      "end_line": 128,
      "comment": "\n   * Get the initial time.\n   * @return initial time\n   ",
      "child_ranges": [
        "(line 127,col 5)-(line 127,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblemAbstract.getInitialState()",
      "begin_line": 134,
      "end_line": 136,
      "comment": "\n   * Get the initial state vector.\n   * @return initial state vector\n   ",
      "child_ranges": [
        "(line 135,col 5)-(line 135,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblemAbstract.getFinalTime()",
      "begin_line": 142,
      "end_line": 144,
      "comment": "\n   * Get the final time.\n   * @return final time\n   ",
      "child_ranges": [
        "(line 143,col 5)-(line 143,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblemAbstract.getErrorScale()",
      "begin_line": 150,
      "end_line": 152,
      "comment": "\n   * Get the error scale.\n   * @return error scale\n   ",
      "child_ranges": [
        "(line 151,col 5)-(line 151,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblemAbstract.getEventsHandlers()",
      "begin_line": 157,
      "end_line": 159,
      "comment": "\n   * Get the events handlers.\n   * @return events handlers   ",
      "child_ranges": [
        "(line 158,col 5)-(line 158,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblemAbstract.getCalls()",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\n   * Get the number of calls.\n   * @return nuber of calls\n   ",
      "child_ranges": [
        "(line 166,col 5)-(line 166,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblemAbstract.computeDerivatives(double, double[], double[])",
      "begin_line": 169,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 170,col 5)-(line 170,col 12)",
        "(line 171,col 5)-(line 171,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblemAbstract.doComputeDerivatives(double, double[], double[])",
      "begin_line": 174,
      "end_line": 174,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblemAbstract.computeTheoreticalState(double)",
      "begin_line": 181,
      "end_line": 181,
      "comment": "\n   * Compute the theoretical state at the specified time.\n   * @param t time at which the state is required\n   * @return state vector at time t\n   ",
      "child_ranges": []
    }
  ]
}