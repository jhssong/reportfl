{
  "filepath": "/tmp/Math-59b/src/test/java/org/apache/commons/math/ode/TestProblemHandler.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TestProblemHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepHandler"
      ],
      "begin_line": 30,
      "end_line": 151,
      "comment": "\n * This class is used to handle steps for the test problems\n * integrated during the junit tests for the ODE integrators.\n "
    },
    {
      "type": "field",
      "varNames": [
        "problem"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Associated problem. "
    },
    {
      "type": "field",
      "varNames": [
        "maxValueError"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Maximal errors encountered during the integration. "
    },
    {
      "type": "field",
      "varNames": [
        "maxTimeError"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lastError"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Error at the end of the integration. "
    },
    {
      "type": "field",
      "varNames": [
        "lastTime"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Time at the end of integration. "
    },
    {
      "type": "field",
      "varNames": [
        "integrator"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " ODE solver used. "
    },
    {
      "type": "field",
      "varNames": [
        "expectedStepStart"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Expected start for step. "
    },
    {
      "type": "constructor",
      "signature": "TestProblemHandler(TestProblemAbstract, ODEIntegrator)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027TestProblemAbstract\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 57,
      "end_line": 61,
      "comment": "\n   * Simple constructor.\n   * @param problem problem for which steps should be handled\n   * @param integrator ODE solver used\n   ",
      "child_ranges": [
        "(line 58,col 5)-(line 58,col 27)",
        "(line 59,col 5)-(line 59,col 33)",
        "(line 60,col 5)-(line 60,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblemHandler.requiresDenseOutput()",
      "begin_line": 63,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 64,col 5)-(line 64,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblemHandler.reset()",
      "begin_line": 67,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 68,col 5)-(line 68,col 22)",
        "(line 69,col 5)-(line 69,col 22)",
        "(line 70,col 5)-(line 70,col 22)",
        "(line 71,col 5)-(line 71,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblemHandler.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 74,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 78,col 5)-(line 78,col 52)",
        "(line 79,col 5)-(line 86,col 5)",
        "(line 88,col 5)-(line 88,col 47)",
        "(line 89,col 5)-(line 89,col 46)",
        "(line 90,col 5)-(line 90,col 50)",
        "(line 93,col 5)-(line 101,col 5)",
        "(line 104,col 5)-(line 116,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblemHandler.getMaximalValueError()",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\n   * Get the maximal value error encountered during integration.\n   * @return maximal value error\n   ",
      "child_ranges": [
        "(line 124,col 5)-(line 124,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblemHandler.getMaximalTimeError()",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\n   * Get the maximal time error encountered during integration.\n   * @return maximal time error\n   ",
      "child_ranges": [
        "(line 132,col 5)-(line 132,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblemHandler.getLastError()",
      "begin_line": 139,
      "end_line": 141,
      "comment": "\n   * Get the error at the end of the integration.\n   * @return error at the end of the integration\n   ",
      "child_ranges": [
        "(line 140,col 5)-(line 140,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblemHandler.getLastTime()",
      "begin_line": 147,
      "end_line": 149,
      "comment": "\n   * Get the time at the end of the integration.\n   * @return time at the end of the integration.\n   ",
      "child_ranges": [
        "(line 148,col 5)-(line 148,col 20)"
      ]
    }
  ]
}