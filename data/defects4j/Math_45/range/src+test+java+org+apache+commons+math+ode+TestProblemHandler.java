{
  "filepath": "/tmp/Math-45b/src/test/java/org/apache/commons/math/ode/TestProblemHandler.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TestProblemHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepHandler"
      ],
      "begin_line": 28,
      "end_line": 149,
      "comment": "\n * This class is used to handle steps for the test problems\n * integrated during the junit tests for the ODE integrators.\n "
    },
    {
      "type": "field",
      "varNames": [
        "problem"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Associated problem. "
    },
    {
      "type": "field",
      "varNames": [
        "maxValueError"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Maximal errors encountered during the integration. "
    },
    {
      "type": "field",
      "varNames": [
        "maxTimeError"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lastError"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Error at the end of the integration. "
    },
    {
      "type": "field",
      "varNames": [
        "lastTime"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Time at the end of integration. "
    },
    {
      "type": "field",
      "varNames": [
        "integrator"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " ODE solver used. "
    },
    {
      "type": "field",
      "varNames": [
        "expectedStepStart"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Expected start for step. "
    },
    {
      "type": "constructor",
      "signature": "TestProblemHandler(TestProblemAbstract, ODEIntegrator)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027TestProblemAbstract\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 55,
      "end_line": 59,
      "comment": "\n   * Simple constructor.\n   * @param problem problem for which steps should be handled\n   * @param integrator ODE solver used\n   ",
      "child_ranges": [
        "(line 56,col 5)-(line 56,col 27)",
        "(line 57,col 5)-(line 57,col 33)",
        "(line 58,col 5)-(line 58,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblemHandler.reset()",
      "begin_line": 61,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 62,col 5)-(line 62,col 22)",
        "(line 63,col 5)-(line 63,col 22)",
        "(line 64,col 5)-(line 64,col 22)",
        "(line 65,col 5)-(line 65,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblemHandler.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 68,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 70,col 5)-(line 70,col 52)",
        "(line 71,col 5)-(line 84,col 5)",
        "(line 86,col 5)-(line 86,col 47)",
        "(line 87,col 5)-(line 87,col 46)",
        "(line 88,col 5)-(line 88,col 50)",
        "(line 91,col 5)-(line 99,col 5)",
        "(line 102,col 5)-(line 114,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblemHandler.getMaximalValueError()",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\n   * Get the maximal value error encountered during integration.\n   * @return maximal value error\n   ",
      "child_ranges": [
        "(line 122,col 5)-(line 122,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblemHandler.getMaximalTimeError()",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\n   * Get the maximal time error encountered during integration.\n   * @return maximal time error\n   ",
      "child_ranges": [
        "(line 130,col 5)-(line 130,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblemHandler.getLastError()",
      "begin_line": 137,
      "end_line": 139,
      "comment": "\n   * Get the error at the end of the integration.\n   * @return error at the end of the integration\n   ",
      "child_ranges": [
        "(line 138,col 5)-(line 138,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblemHandler.getLastTime()",
      "begin_line": 145,
      "end_line": 147,
      "comment": "\n   * Get the time at the end of the integration.\n   * @return time at the end of the integration.\n   ",
      "child_ranges": [
        "(line 146,col 5)-(line 146,col 20)"
      ]
    }
  ]
}