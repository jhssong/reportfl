{
  "filepath": "/tmp/Math-30b/src/test/java/org/apache/commons/math3/ode/TestProblemHandler.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TestProblemHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ode.sampling.StepHandler"
      ],
      "begin_line": 28,
      "end_line": 152,
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
      "end_line": 62,
      "comment": "\n   * Simple constructor.\n   * @param problem problem for which steps should be handled\n   * @param integrator ODE solver used\n   ",
      "child_ranges": [
        "(line 56,col 5)-(line 56,col 27)",
        "(line 57,col 5)-(line 57,col 33)",
        "(line 58,col 5)-(line 58,col 22)",
        "(line 59,col 5)-(line 59,col 22)",
        "(line 60,col 5)-(line 60,col 22)",
        "(line 61,col 5)-(line 61,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.TestProblemHandler.init(double, double[], double)",
      "begin_line": 64,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 65,col 5)-(line 65,col 22)",
        "(line 66,col 5)-(line 66,col 22)",
        "(line 67,col 5)-(line 67,col 22)",
        "(line 68,col 5)-(line 68,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.TestProblemHandler.handleStep(org.apache.commons.math3.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 71,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 73,col 5)-(line 73,col 52)",
        "(line 74,col 5)-(line 87,col 5)",
        "(line 89,col 5)-(line 89,col 47)",
        "(line 90,col 5)-(line 90,col 46)",
        "(line 91,col 5)-(line 91,col 50)",
        "(line 94,col 5)-(line 102,col 5)",
        "(line 105,col 5)-(line 117,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.TestProblemHandler.getMaximalValueError()",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\n   * Get the maximal value error encountered during integration.\n   * @return maximal value error\n   ",
      "child_ranges": [
        "(line 125,col 5)-(line 125,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.TestProblemHandler.getMaximalTimeError()",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\n   * Get the maximal time error encountered during integration.\n   * @return maximal time error\n   ",
      "child_ranges": [
        "(line 133,col 5)-(line 133,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.TestProblemHandler.getLastError()",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\n   * Get the error at the end of the integration.\n   * @return error at the end of the integration\n   ",
      "child_ranges": [
        "(line 141,col 5)-(line 141,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.TestProblemHandler.getLastTime()",
      "begin_line": 148,
      "end_line": 150,
      "comment": "\n   * Get the time at the end of the integration.\n   * @return time at the end of the integration.\n   ",
      "child_ranges": [
        "(line 149,col 5)-(line 149,col 20)"
      ]
    }
  ]
}