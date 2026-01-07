{
  "filepath": "/tmp/Math-97b/src/test/org/apache/commons/math/ode/nonstiff/ClassicalRungeKuttaIntegratorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ClassicalRungeKuttaIntegratorTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 30,
      "end_line": 196,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegratorTest.ClassicalRungeKuttaIntegratorTest(java.lang.String)",
      "begin_line": 33,
      "end_line": 35,
      "comment": "",
      "child_ranges": [
        "(line 34,col 5)-(line 34,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegratorTest.testSanityChecks()",
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
      "signature": "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegratorTest.testDecreasingSteps()",
      "begin_line": 70,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 73,col 5)-(line 73,col 70)",
        "(line 74,col 5)-(line 105,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegratorTest.testSmallStep()",
      "begin_line": 109,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 112,col 5)-(line 112,col 41)",
        "(line 113,col 5)-(line 113,col 68)",
        "(line 115,col 5)-(line 115,col 73)",
        "(line 116,col 5)-(line 116,col 67)",
        "(line 117,col 5)-(line 117,col 34)",
        "(line 118,col 5)-(line 119,col 70)",
        "(line 121,col 5)-(line 121,col 49)",
        "(line 122,col 5)-(line 122,col 57)",
        "(line 123,col 5)-(line 123,col 60)",
        "(line 124,col 5)-(line 124,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegratorTest.testBigStep()",
      "begin_line": 127,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 130,col 5)-(line 130,col 41)",
        "(line 131,col 5)-(line 131,col 66)",
        "(line 133,col 5)-(line 133,col 73)",
        "(line 134,col 5)-(line 134,col 67)",
        "(line 135,col 5)-(line 135,col 34)",
        "(line 136,col 5)-(line 137,col 70)",
        "(line 139,col 5)-(line 139,col 48)",
        "(line 140,col 5)-(line 140,col 55)",
        "(line 141,col 5)-(line 141,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegratorTest.testKepler()",
      "begin_line": 145,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 148,col 5)-(line 148,col 51)",
        "(line 149,col 5)-(line 149,col 69)",
        "(line 151,col 5)-(line 151,col 73)",
        "(line 152,col 5)-(line 152,col 48)",
        "(line 153,col 5)-(line 155,col 70)"
      ]
    },
    {
      "type": "class_interface",
      "name": "KeplerHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepHandler"
      ],
      "begin_line": 158,
      "end_line": 190,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 159,
      "end_line": 159,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "KeplerHandler(TestProblem3)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027TestProblem3\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 160,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 161,col 7)-(line 161,col 19)",
        "(line 162,col 7)-(line 162,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegratorTest.KeplerHandler.requiresDenseOutput()",
      "begin_line": 164,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 165,col 7)-(line 165,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegratorTest.KeplerHandler.reset()",
      "begin_line": 167,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 168,col 7)-(line 168,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegratorTest.KeplerHandler.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 170,
      "end_line": 187,
      "comment": "",
      "child_ranges": [
        "(line 173,col 7)-(line 173,col 68)",
        "(line 174,col 7)-(line 174,col 89)",
        "(line 175,col 7)-(line 175,col 53)",
        "(line 176,col 7)-(line 176,col 53)",
        "(line 177,col 7)-(line 177,col 39)",
        "(line 178,col 7)-(line 180,col 7)",
        "(line 181,col 7)-(line 186,col 7)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "maxError"
      ],
      "begin_line": 188,
      "end_line": 188,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pb"
      ],
      "begin_line": 189,
      "end_line": 189,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegratorTest.suite()",
      "begin_line": 192,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 193,col 5)-(line 193,col 66)"
      ]
    }
  ]
}