{
  "filepath": "/tmp/Math-103b/src/test/org/apache/commons/math/ode/ThreeEighthesIntegratorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ThreeEighthesIntegratorTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 30,
      "end_line": 175,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.ThreeEighthesIntegratorTest.ThreeEighthesIntegratorTest(java.lang.String)",
      "begin_line": 33,
      "end_line": 35,
      "comment": "",
      "child_ranges": [
        "(line 34,col 5)-(line 34,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ThreeEighthesIntegratorTest.testDimensionCheck()",
      "begin_line": 37,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 38,col 5)-(line 47,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ThreeEighthesIntegratorTest.testDecreasingSteps()",
      "begin_line": 50,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 53,col 5)-(line 53,col 70)",
        "(line 54,col 5)-(line 81,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ThreeEighthesIntegratorTest.testSmallStep()",
      "begin_line": 85,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 88,col 5)-(line 88,col 41)",
        "(line 89,col 5)-(line 89,col 68)",
        "(line 91,col 5)-(line 91,col 67)",
        "(line 92,col 5)-(line 92,col 60)",
        "(line 93,col 5)-(line 93,col 34)",
        "(line 94,col 5)-(line 95,col 70)",
        "(line 97,col 5)-(line 97,col 49)",
        "(line 98,col 5)-(line 98,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ThreeEighthesIntegratorTest.testBigStep()",
      "begin_line": 102,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 105,col 5)-(line 105,col 41)",
        "(line 106,col 5)-(line 106,col 66)",
        "(line 108,col 5)-(line 108,col 67)",
        "(line 109,col 5)-(line 109,col 60)",
        "(line 110,col 5)-(line 110,col 34)",
        "(line 111,col 5)-(line 112,col 70)",
        "(line 114,col 5)-(line 114,col 48)",
        "(line 115,col 5)-(line 115,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ThreeEighthesIntegratorTest.testKepler()",
      "begin_line": 119,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 122,col 5)-(line 122,col 51)",
        "(line 123,col 5)-(line 123,col 69)",
        "(line 125,col 5)-(line 125,col 67)",
        "(line 126,col 5)-(line 126,col 48)",
        "(line 127,col 5)-(line 129,col 70)"
      ]
    },
    {
      "type": "class_interface",
      "name": "KeplerHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.StepHandler"
      ],
      "begin_line": 132,
      "end_line": 169,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "KeplerHandler(TestProblem3)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027TestProblem3\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 134,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 135,col 7)-(line 135,col 19)",
        "(line 136,col 7)-(line 136,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ThreeEighthesIntegratorTest.KeplerHandler.requiresDenseOutput()",
      "begin_line": 139,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 140,col 7)-(line 140,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ThreeEighthesIntegratorTest.KeplerHandler.reset()",
      "begin_line": 143,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 144,col 7)-(line 144,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ThreeEighthesIntegratorTest.KeplerHandler.handleStep(org.apache.commons.math.ode.StepInterpolator, boolean)",
      "begin_line": 147,
      "end_line": 164,
      "comment": "",
      "child_ranges": [
        "(line 150,col 7)-(line 150,col 68)",
        "(line 151,col 7)-(line 151,col 89)",
        "(line 152,col 7)-(line 152,col 53)",
        "(line 153,col 7)-(line 153,col 53)",
        "(line 154,col 7)-(line 154,col 39)",
        "(line 155,col 7)-(line 157,col 7)",
        "(line 158,col 7)-(line 163,col 7)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "pb"
      ],
      "begin_line": 166,
      "end_line": 166,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxError"
      ],
      "begin_line": 167,
      "end_line": 167,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ThreeEighthesIntegratorTest.suite()",
      "begin_line": 171,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 172,col 5)-(line 172,col 60)"
      ]
    }
  ]
}