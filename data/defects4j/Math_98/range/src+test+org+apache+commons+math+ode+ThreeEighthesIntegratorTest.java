{
  "filepath": "/tmp/Math-98b/src/test/org/apache/commons/math/ode/ThreeEighthesIntegratorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ThreeEighthesIntegratorTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 30,
      "end_line": 180,
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
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 53,col 5)-(line 53,col 70)",
        "(line 54,col 5)-(line 83,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ThreeEighthesIntegratorTest.testSmallStep()",
      "begin_line": 87,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 90,col 5)-(line 90,col 41)",
        "(line 91,col 5)-(line 91,col 68)",
        "(line 93,col 5)-(line 93,col 67)",
        "(line 94,col 5)-(line 94,col 67)",
        "(line 95,col 5)-(line 95,col 34)",
        "(line 96,col 5)-(line 97,col 70)",
        "(line 99,col 5)-(line 99,col 49)",
        "(line 100,col 5)-(line 100,col 57)",
        "(line 101,col 5)-(line 101,col 60)",
        "(line 102,col 5)-(line 102,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ThreeEighthesIntegratorTest.testBigStep()",
      "begin_line": 106,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 109,col 5)-(line 109,col 41)",
        "(line 110,col 5)-(line 110,col 66)",
        "(line 112,col 5)-(line 112,col 67)",
        "(line 113,col 5)-(line 113,col 67)",
        "(line 114,col 5)-(line 114,col 34)",
        "(line 115,col 5)-(line 116,col 70)",
        "(line 118,col 5)-(line 118,col 48)",
        "(line 119,col 5)-(line 119,col 55)",
        "(line 120,col 5)-(line 120,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ThreeEighthesIntegratorTest.testKepler()",
      "begin_line": 124,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 127,col 5)-(line 127,col 51)",
        "(line 128,col 5)-(line 128,col 69)",
        "(line 130,col 5)-(line 130,col 67)",
        "(line 131,col 5)-(line 131,col 48)",
        "(line 132,col 5)-(line 134,col 70)"
      ]
    },
    {
      "type": "class_interface",
      "name": "KeplerHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.StepHandler"
      ],
      "begin_line": 137,
      "end_line": 174,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "KeplerHandler(TestProblem3)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027TestProblem3\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 139,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 140,col 7)-(line 140,col 19)",
        "(line 141,col 7)-(line 141,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ThreeEighthesIntegratorTest.KeplerHandler.requiresDenseOutput()",
      "begin_line": 144,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 145,col 7)-(line 145,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ThreeEighthesIntegratorTest.KeplerHandler.reset()",
      "begin_line": 148,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 149,col 7)-(line 149,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ThreeEighthesIntegratorTest.KeplerHandler.handleStep(org.apache.commons.math.ode.StepInterpolator, boolean)",
      "begin_line": 152,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 155,col 7)-(line 155,col 68)",
        "(line 156,col 7)-(line 156,col 89)",
        "(line 157,col 7)-(line 157,col 53)",
        "(line 158,col 7)-(line 158,col 53)",
        "(line 159,col 7)-(line 159,col 39)",
        "(line 160,col 7)-(line 162,col 7)",
        "(line 163,col 7)-(line 168,col 7)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "pb"
      ],
      "begin_line": 171,
      "end_line": 171,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxError"
      ],
      "begin_line": 172,
      "end_line": 172,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ThreeEighthesIntegratorTest.suite()",
      "begin_line": 176,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 177,col 5)-(line 177,col 60)"
      ]
    }
  ]
}