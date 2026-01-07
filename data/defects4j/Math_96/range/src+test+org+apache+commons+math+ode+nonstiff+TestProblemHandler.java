{
  "filepath": "/tmp/Math-96b/src/test/org/apache/commons/math/ode/nonstiff/TestProblemHandler.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TestProblemHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepHandler"
      ],
      "begin_line": 29,
      "end_line": 158,
      "comment": "\n * This class is used to handle steps for the test problems\n * integrated during the junit tests for the ODE integrators.\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "problem"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Associated problem. "
    },
    {
      "type": "field",
      "varNames": [
        "maxValueError"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Maximal errors encountered during the integration. "
    },
    {
      "type": "field",
      "varNames": [
        "maxTimeError"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lastError"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Error at the end of the integration. "
    },
    {
      "type": "field",
      "varNames": [
        "lastTime"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Time at the end of integration. "
    },
    {
      "type": "field",
      "varNames": [
        "integrator"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " ODE solver used. "
    },
    {
      "type": "field",
      "varNames": [
        "expectedStepStart"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Expected start for step. "
    },
    {
      "type": "constructor",
      "signature": "TestProblemHandler(TestProblemAbstract, ODEIntegrator)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027TestProblemAbstract\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 59,
      "end_line": 63,
      "comment": "\n   * Simple constructor.\n   * @param problem problem for which steps should be handled\n   * @param integrator ODE solver used\n   ",
      "child_ranges": [
        "(line 60,col 5)-(line 60,col 27)",
        "(line 61,col 5)-(line 61,col 33)",
        "(line 62,col 5)-(line 62,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.TestProblemHandler.requiresDenseOutput()",
      "begin_line": 65,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 66,col 5)-(line 66,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.TestProblemHandler.reset()",
      "begin_line": 69,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 70,col 5)-(line 70,col 22)",
        "(line 71,col 5)-(line 71,col 22)",
        "(line 72,col 5)-(line 72,col 22)",
        "(line 73,col 5)-(line 73,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.TestProblemHandler.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 76,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 80,col 5)-(line 80,col 52)",
        "(line 81,col 5)-(line 88,col 5)",
        "(line 90,col 5)-(line 90,col 47)",
        "(line 91,col 5)-(line 91,col 46)",
        "(line 92,col 5)-(line 92,col 50)",
        "(line 95,col 5)-(line 105,col 5)",
        "(line 108,col 5)-(line 123,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.TestProblemHandler.getMaximalValueError()",
      "begin_line": 130,
      "end_line": 132,
      "comment": "\n   * Get the maximal value error encountered during integration.\n   * @return maximal value error\n   ",
      "child_ranges": [
        "(line 131,col 5)-(line 131,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.TestProblemHandler.getMaximalTimeError()",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\n   * Get the maximal time error encountered during integration.\n   * @return maximal time error\n   ",
      "child_ranges": [
        "(line 139,col 5)-(line 139,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.TestProblemHandler.getLastError()",
      "begin_line": 146,
      "end_line": 148,
      "comment": "\n   * Get the error at the end of the integration.\n   * @return error at the end of the integration\n   ",
      "child_ranges": [
        "(line 147,col 5)-(line 147,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.TestProblemHandler.getLastTime()",
      "begin_line": 154,
      "end_line": 156,
      "comment": "\n   * Get the time at the end of the integration.\n   * @return time at the end of the integration.\n   ",
      "child_ranges": [
        "(line 155,col 5)-(line 155,col 20)"
      ]
    }
  ]
}