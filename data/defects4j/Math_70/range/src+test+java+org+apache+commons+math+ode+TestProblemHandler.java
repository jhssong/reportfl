{
  "filepath": "/tmp/Math-70b/src/test/java/org/apache/commons/math/ode/TestProblemHandler.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TestProblemHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepHandler"
      ],
      "begin_line": 29,
      "end_line": 150,
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
      "end_line": 60,
      "comment": "\n   * Simple constructor.\n   * @param problem problem for which steps should be handled\n   * @param integrator ODE solver used\n   ",
      "child_ranges": [
        "(line 57,col 5)-(line 57,col 27)",
        "(line 58,col 5)-(line 58,col 33)",
        "(line 59,col 5)-(line 59,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblemHandler.requiresDenseOutput()",
      "begin_line": 62,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 63,col 5)-(line 63,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblemHandler.reset()",
      "begin_line": 66,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 67,col 5)-(line 67,col 22)",
        "(line 68,col 5)-(line 68,col 22)",
        "(line 69,col 5)-(line 69,col 22)",
        "(line 70,col 5)-(line 70,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblemHandler.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 73,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 77,col 5)-(line 77,col 52)",
        "(line 78,col 5)-(line 85,col 5)",
        "(line 87,col 5)-(line 87,col 47)",
        "(line 88,col 5)-(line 88,col 46)",
        "(line 89,col 5)-(line 89,col 50)",
        "(line 92,col 5)-(line 100,col 5)",
        "(line 103,col 5)-(line 115,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblemHandler.getMaximalValueError()",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\n   * Get the maximal value error encountered during integration.\n   * @return maximal value error\n   ",
      "child_ranges": [
        "(line 123,col 5)-(line 123,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblemHandler.getMaximalTimeError()",
      "begin_line": 130,
      "end_line": 132,
      "comment": "\n   * Get the maximal time error encountered during integration.\n   * @return maximal time error\n   ",
      "child_ranges": [
        "(line 131,col 5)-(line 131,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblemHandler.getLastError()",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\n   * Get the error at the end of the integration.\n   * @return error at the end of the integration\n   ",
      "child_ranges": [
        "(line 139,col 5)-(line 139,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblemHandler.getLastTime()",
      "begin_line": 146,
      "end_line": 148,
      "comment": "\n   * Get the time at the end of the integration.\n   * @return time at the end of the integration.\n   ",
      "child_ranges": [
        "(line 147,col 5)-(line 147,col 20)"
      ]
    }
  ]
}