{
  "filepath": "/tmp/Math-101b/src/test/org/apache/commons/math/ode/ClassicalRungeKuttaIntegratorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ClassicalRungeKuttaIntegratorTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 30,
      "end_line": 192,
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
      "signature": "org.apache.commons.math.ode.ClassicalRungeKuttaIntegratorTest.testSanityChecks()",
      "begin_line": 37,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 38,col 5)-(line 47,col 5)",
        "(line 48,col 5)-(line 57,col 7)",
        "(line 58,col 5)-(line 67,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ClassicalRungeKuttaIntegratorTest.testDecreasingSteps()",
      "begin_line": 70,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 73,col 5)-(line 73,col 70)",
        "(line 74,col 5)-(line 102,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ClassicalRungeKuttaIntegratorTest.testSmallStep()",
      "begin_line": 106,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 109,col 5)-(line 109,col 41)",
        "(line 110,col 5)-(line 110,col 68)",
        "(line 112,col 5)-(line 112,col 73)",
        "(line 113,col 5)-(line 113,col 67)",
        "(line 114,col 5)-(line 114,col 34)",
        "(line 115,col 5)-(line 116,col 70)",
        "(line 118,col 5)-(line 118,col 49)",
        "(line 119,col 5)-(line 119,col 57)",
        "(line 120,col 5)-(line 120,col 60)",
        "(line 121,col 5)-(line 121,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ClassicalRungeKuttaIntegratorTest.testBigStep()",
      "begin_line": 124,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 127,col 5)-(line 127,col 41)",
        "(line 128,col 5)-(line 128,col 66)",
        "(line 130,col 5)-(line 130,col 73)",
        "(line 131,col 5)-(line 131,col 67)",
        "(line 132,col 5)-(line 132,col 34)",
        "(line 133,col 5)-(line 134,col 70)",
        "(line 136,col 5)-(line 136,col 48)",
        "(line 137,col 5)-(line 137,col 55)",
        "(line 138,col 5)-(line 138,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ClassicalRungeKuttaIntegratorTest.testKepler()",
      "begin_line": 142,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 145,col 5)-(line 145,col 51)",
        "(line 146,col 5)-(line 146,col 69)",
        "(line 148,col 5)-(line 148,col 73)",
        "(line 149,col 5)-(line 149,col 48)",
        "(line 150,col 5)-(line 152,col 70)"
      ]
    },
    {
      "type": "class_interface",
      "name": "KeplerHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.StepHandler"
      ],
      "begin_line": 155,
      "end_line": 186,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "KeplerHandler(TestProblem3)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027TestProblem3\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 156,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 157,col 7)-(line 157,col 19)",
        "(line 158,col 7)-(line 158,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ClassicalRungeKuttaIntegratorTest.KeplerHandler.requiresDenseOutput()",
      "begin_line": 160,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 161,col 7)-(line 161,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ClassicalRungeKuttaIntegratorTest.KeplerHandler.reset()",
      "begin_line": 163,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 164,col 7)-(line 164,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ClassicalRungeKuttaIntegratorTest.KeplerHandler.handleStep(org.apache.commons.math.ode.StepInterpolator, boolean)",
      "begin_line": 166,
      "end_line": 183,
      "comment": "",
      "child_ranges": [
        "(line 169,col 7)-(line 169,col 68)",
        "(line 170,col 7)-(line 170,col 89)",
        "(line 171,col 7)-(line 171,col 53)",
        "(line 172,col 7)-(line 172,col 53)",
        "(line 173,col 7)-(line 173,col 39)",
        "(line 174,col 7)-(line 176,col 7)",
        "(line 177,col 7)-(line 182,col 7)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "maxError"
      ],
      "begin_line": 184,
      "end_line": 184,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pb"
      ],
      "begin_line": 185,
      "end_line": 185,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ClassicalRungeKuttaIntegratorTest.suite()",
      "begin_line": 188,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 189,col 5)-(line 189,col 66)"
      ]
    }
  ]
}