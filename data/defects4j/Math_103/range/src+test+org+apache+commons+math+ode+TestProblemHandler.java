{
  "filepath": "/tmp/Math-103b/src/test/org/apache/commons/math/ode/TestProblemHandler.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TestProblemHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.StepHandler"
      ],
      "begin_line": 28,
      "end_line": 125,
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
        "maxError"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Maximal error encountered during the integration. "
    },
    {
      "type": "field",
      "varNames": [
        "lastError"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Error at the end of the integration. "
    },
    {
      "type": "field",
      "varNames": [
        "lastTime"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Time at the end of integration. "
    },
    {
      "type": "constructor",
      "signature": "TestProblemHandler(TestProblemAbstract)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027TestProblemAbstract\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 47,
      "end_line": 50,
      "comment": "\n   * Simple constructor.\n   * @param problem problem for which steps should be handled\n   ",
      "child_ranges": [
        "(line 48,col 5)-(line 48,col 27)",
        "(line 49,col 5)-(line 49,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblemHandler.requiresDenseOutput()",
      "begin_line": 52,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 53,col 5)-(line 53,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblemHandler.reset()",
      "begin_line": 56,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 57,col 5)-(line 57,col 18)",
        "(line 58,col 5)-(line 58,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblemHandler.handleStep(org.apache.commons.math.ode.StepInterpolator, boolean)",
      "begin_line": 61,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 65,col 5)-(line 65,col 47)",
        "(line 66,col 5)-(line 66,col 46)",
        "(line 67,col 5)-(line 67,col 50)",
        "(line 70,col 5)-(line 80,col 5)",
        "(line 83,col 5)-(line 98,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblemHandler.getMaximalError()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n   * Get the maximal error encountered during integration.\n   * @return maximal error\n   ",
      "child_ranges": [
        "(line 106,col 5)-(line 106,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblemHandler.getLastError()",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\n   * Get the error at the end of the integration.\n   * @return error at the end of the integration\n   ",
      "child_ranges": [
        "(line 114,col 5)-(line 114,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.TestProblemHandler.getLastTime()",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\n   * Get the time at the end of the integration.\n   * @return time at the end of the integration.\n   ",
      "child_ranges": [
        "(line 122,col 5)-(line 122,col 20)"
      ]
    }
  ]
}