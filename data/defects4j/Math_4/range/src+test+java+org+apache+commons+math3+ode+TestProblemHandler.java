{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/ode/TestProblemHandler.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TestProblemHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ode.sampling.StepHandler"
      ],
      "begin_line": 29,
      "end_line": 153,
      "comment": "\n * This class is used to handle steps for the test problems\n * integrated during the junit tests for the ODE integrators.\n "
    },
    {
      "type": "field",
      "varNames": [
        "problem"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Associated problem. "
    },
    {
      "type": "field",
      "varNames": [
        "maxValueError"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Maximal errors encountered during the integration. "
    },
    {
      "type": "field",
      "varNames": [
        "maxTimeError"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lastError"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Error at the end of the integration. "
    },
    {
      "type": "field",
      "varNames": [
        "lastTime"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Time at the end of integration. "
    },
    {
      "type": "field",
      "varNames": [
        "integrator"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " ODE solver used. "
    },
    {
      "type": "field",
      "varNames": [
        "expectedStepStart"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Expected start for step. "
    },
    {
      "type": "constructor",
      "signature": "TestProblemHandler(TestProblemAbstract, ODEIntegrator)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027TestProblemAbstract\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 56,
      "end_line": 63,
      "comment": "\n   * Simple constructor.\n   * @param problem problem for which steps should be handled\n   * @param integrator ODE solver used\n   ",
      "child_ranges": [
        "(line 57,col 5)-(line 57,col 27)",
        "(line 58,col 5)-(line 58,col 33)",
        "(line 59,col 5)-(line 59,col 22)",
        "(line 60,col 5)-(line 60,col 22)",
        "(line 61,col 5)-(line 61,col 22)",
        "(line 62,col 5)-(line 62,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.TestProblemHandler.init(double, double[], double)",
      "begin_line": 65,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 66,col 5)-(line 66,col 22)",
        "(line 67,col 5)-(line 67,col 22)",
        "(line 68,col 5)-(line 68,col 22)",
        "(line 69,col 5)-(line 69,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.TestProblemHandler.handleStep(org.apache.commons.math3.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 72,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 74,col 5)-(line 74,col 52)",
        "(line 75,col 5)-(line 88,col 5)",
        "(line 90,col 5)-(line 90,col 47)",
        "(line 91,col 5)-(line 91,col 46)",
        "(line 92,col 5)-(line 92,col 50)",
        "(line 95,col 5)-(line 103,col 5)",
        "(line 106,col 5)-(line 118,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.TestProblemHandler.getMaximalValueError()",
      "begin_line": 125,
      "end_line": 127,
      "comment": "\n   * Get the maximal value error encountered during integration.\n   * @return maximal value error\n   ",
      "child_ranges": [
        "(line 126,col 5)-(line 126,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.TestProblemHandler.getMaximalTimeError()",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\n   * Get the maximal time error encountered during integration.\n   * @return maximal time error\n   ",
      "child_ranges": [
        "(line 134,col 5)-(line 134,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.TestProblemHandler.getLastError()",
      "begin_line": 141,
      "end_line": 143,
      "comment": "\n   * Get the error at the end of the integration.\n   * @return error at the end of the integration\n   ",
      "child_ranges": [
        "(line 142,col 5)-(line 142,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.TestProblemHandler.getLastTime()",
      "begin_line": 149,
      "end_line": 151,
      "comment": "\n   * Get the time at the end of the integration.\n   * @return time at the end of the integration.\n   ",
      "child_ranges": [
        "(line 150,col 5)-(line 150,col 20)"
      ]
    }
  ]
}