{
  "filepath": "/tmp/Math-103b/src/test/org/apache/commons/math/ode/ClassicalRungeKuttaIntegratorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ClassicalRungeKuttaIntegratorTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 30,
      "end_line": 182,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.ClassicalRungeKuttaIntegratorTest.ClassicalRungeKuttaIntegratorTest(java.lang.String)",
      "begin_line": 33,
      "end_line": 35,
      "comment": "",
      "child_ranges": [
        "(line 34,col 5)-(line 34,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ClassicalRungeKuttaIntegratorTest.testDimensionCheck()",
      "begin_line": 37,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 38,col 5)-(line 47,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ClassicalRungeKuttaIntegratorTest.testNullIntervalCheck()",
      "begin_line": 50,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 51,col 5)-(line 60,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ClassicalRungeKuttaIntegratorTest.testDecreasingSteps()",
      "begin_line": 63,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 66,col 5)-(line 66,col 70)",
        "(line 67,col 5)-(line 94,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ClassicalRungeKuttaIntegratorTest.testSmallStep()",
      "begin_line": 98,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 101,col 5)-(line 101,col 41)",
        "(line 102,col 5)-(line 102,col 68)",
        "(line 104,col 5)-(line 104,col 73)",
        "(line 105,col 5)-(line 105,col 60)",
        "(line 106,col 5)-(line 106,col 34)",
        "(line 107,col 5)-(line 108,col 70)",
        "(line 110,col 5)-(line 110,col 49)",
        "(line 111,col 5)-(line 111,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ClassicalRungeKuttaIntegratorTest.testBigStep()",
      "begin_line": 115,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 118,col 5)-(line 118,col 41)",
        "(line 119,col 5)-(line 119,col 66)",
        "(line 121,col 5)-(line 121,col 73)",
        "(line 122,col 5)-(line 122,col 60)",
        "(line 123,col 5)-(line 123,col 34)",
        "(line 124,col 5)-(line 125,col 70)",
        "(line 127,col 5)-(line 127,col 48)",
        "(line 128,col 5)-(line 128,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ClassicalRungeKuttaIntegratorTest.testKepler()",
      "begin_line": 132,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 135,col 5)-(line 135,col 51)",
        "(line 136,col 5)-(line 136,col 69)",
        "(line 138,col 5)-(line 138,col 73)",
        "(line 139,col 5)-(line 139,col 48)",
        "(line 140,col 5)-(line 142,col 70)"
      ]
    },
    {
      "type": "class_interface",
      "name": "KeplerHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.StepHandler"
      ],
      "begin_line": 145,
      "end_line": 176,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "KeplerHandler(TestProblem3)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027TestProblem3\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 146,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 147,col 7)-(line 147,col 19)",
        "(line 148,col 7)-(line 148,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ClassicalRungeKuttaIntegratorTest.KeplerHandler.requiresDenseOutput()",
      "begin_line": 150,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 151,col 7)-(line 151,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ClassicalRungeKuttaIntegratorTest.KeplerHandler.reset()",
      "begin_line": 153,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 154,col 7)-(line 154,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ClassicalRungeKuttaIntegratorTest.KeplerHandler.handleStep(org.apache.commons.math.ode.StepInterpolator, boolean)",
      "begin_line": 156,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 159,col 7)-(line 159,col 68)",
        "(line 160,col 7)-(line 160,col 89)",
        "(line 161,col 7)-(line 161,col 53)",
        "(line 162,col 7)-(line 162,col 53)",
        "(line 163,col 7)-(line 163,col 39)",
        "(line 164,col 7)-(line 166,col 7)",
        "(line 167,col 7)-(line 172,col 7)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "maxError"
      ],
      "begin_line": 174,
      "end_line": 174,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pb"
      ],
      "begin_line": 175,
      "end_line": 175,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ClassicalRungeKuttaIntegratorTest.suite()",
      "begin_line": 178,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 179,col 5)-(line 179,col 66)"
      ]
    }
  ]
}