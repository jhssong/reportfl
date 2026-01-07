{
  "filepath": "/tmp/Math-97b/src/test/org/apache/commons/math/ode/nonstiff/GillIntegratorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GillIntegratorTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 30,
      "end_line": 185,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.GillIntegratorTest.GillIntegratorTest(java.lang.String)",
      "begin_line": 33,
      "end_line": 35,
      "comment": "",
      "child_ranges": [
        "(line 34,col 5)-(line 34,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GillIntegratorTest.testDimensionCheck()",
      "begin_line": 37,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 38,col 5)-(line 47,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GillIntegratorTest.testDecreasingSteps()",
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
      "signature": "org.apache.commons.math.ode.nonstiff.GillIntegratorTest.testSmallStep()",
      "begin_line": 87,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 90,col 5)-(line 90,col 41)",
        "(line 91,col 5)-(line 91,col 68)",
        "(line 93,col 5)-(line 93,col 58)",
        "(line 94,col 5)-(line 94,col 67)",
        "(line 95,col 5)-(line 95,col 34)",
        "(line 96,col 5)-(line 97,col 70)",
        "(line 99,col 5)-(line 99,col 49)",
        "(line 100,col 5)-(line 100,col 57)",
        "(line 101,col 5)-(line 101,col 60)",
        "(line 102,col 5)-(line 102,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GillIntegratorTest.testBigStep()",
      "begin_line": 106,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 109,col 5)-(line 109,col 41)",
        "(line 110,col 5)-(line 110,col 66)",
        "(line 112,col 5)-(line 112,col 58)",
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
      "signature": "org.apache.commons.math.ode.nonstiff.GillIntegratorTest.testKepler()",
      "begin_line": 124,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 127,col 5)-(line 127,col 51)",
        "(line 128,col 5)-(line 128,col 69)",
        "(line 130,col 5)-(line 130,col 58)",
        "(line 131,col 5)-(line 131,col 52)",
        "(line 132,col 5)-(line 134,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GillIntegratorTest.testUnstableDerivative()",
      "begin_line": 137,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 139,col 5)-(line 139,col 67)",
        "(line 140,col 5)-(line 140,col 57)",
        "(line 141,col 5)-(line 141,col 59)",
        "(line 142,col 5)-(line 142,col 32)",
        "(line 143,col 5)-(line 143,col 69)",
        "(line 144,col 5)-(line 144,col 37)"
      ]
    },
    {
      "type": "class_interface",
      "name": "KeplerStepHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepHandler"
      ],
      "begin_line": 147,
      "end_line": 179,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 148,
      "end_line": 148,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "KeplerStepHandler(TestProblem3)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027TestProblem3\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 149,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 150,col 7)-(line 150,col 19)",
        "(line 151,col 7)-(line 151,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GillIntegratorTest.KeplerStepHandler.requiresDenseOutput()",
      "begin_line": 153,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 154,col 7)-(line 154,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GillIntegratorTest.KeplerStepHandler.reset()",
      "begin_line": 156,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 157,col 7)-(line 157,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GillIntegratorTest.KeplerStepHandler.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 159,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 162,col 7)-(line 162,col 68)",
        "(line 163,col 7)-(line 163,col 89)",
        "(line 164,col 7)-(line 164,col 53)",
        "(line 165,col 7)-(line 165,col 53)",
        "(line 166,col 7)-(line 166,col 39)",
        "(line 167,col 7)-(line 169,col 7)",
        "(line 170,col 7)-(line 175,col 7)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "maxError"
      ],
      "begin_line": 177,
      "end_line": 177,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pb"
      ],
      "begin_line": 178,
      "end_line": 178,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GillIntegratorTest.suite()",
      "begin_line": 181,
      "end_line": 183,
      "comment": "",
      "child_ranges": [
        "(line 182,col 5)-(line 182,col 51)"
      ]
    }
  ]
}