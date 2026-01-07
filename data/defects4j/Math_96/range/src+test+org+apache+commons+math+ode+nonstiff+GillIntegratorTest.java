{
  "filepath": "/tmp/Math-96b/src/test/org/apache/commons/math/ode/nonstiff/GillIntegratorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GillIntegratorTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 31,
      "end_line": 219,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.GillIntegratorTest.GillIntegratorTest(java.lang.String)",
      "begin_line": 34,
      "end_line": 36,
      "comment": "",
      "child_ranges": [
        "(line 35,col 5)-(line 35,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GillIntegratorTest.testDimensionCheck()",
      "begin_line": 38,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 39,col 5)-(line 48,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GillIntegratorTest.testDecreasingSteps()",
      "begin_line": 51,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 54,col 5)-(line 54,col 70)",
        "(line 55,col 5)-(line 87,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GillIntegratorTest.testSmallStep()",
      "begin_line": 91,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 94,col 5)-(line 94,col 41)",
        "(line 95,col 5)-(line 95,col 68)",
        "(line 97,col 5)-(line 97,col 58)",
        "(line 98,col 5)-(line 98,col 67)",
        "(line 99,col 5)-(line 99,col 34)",
        "(line 100,col 5)-(line 101,col 70)",
        "(line 103,col 5)-(line 103,col 49)",
        "(line 104,col 5)-(line 104,col 57)",
        "(line 105,col 5)-(line 105,col 60)",
        "(line 106,col 5)-(line 106,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GillIntegratorTest.testBigStep()",
      "begin_line": 110,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 113,col 5)-(line 113,col 41)",
        "(line 114,col 5)-(line 114,col 66)",
        "(line 116,col 5)-(line 116,col 58)",
        "(line 117,col 5)-(line 117,col 67)",
        "(line 118,col 5)-(line 118,col 34)",
        "(line 119,col 5)-(line 120,col 70)",
        "(line 122,col 5)-(line 122,col 48)",
        "(line 123,col 5)-(line 123,col 55)",
        "(line 124,col 5)-(line 124,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GillIntegratorTest.testKepler()",
      "begin_line": 128,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 131,col 5)-(line 131,col 51)",
        "(line 132,col 5)-(line 132,col 69)",
        "(line 134,col 5)-(line 134,col 58)",
        "(line 135,col 5)-(line 135,col 52)",
        "(line 136,col 5)-(line 138,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GillIntegratorTest.testUnstableDerivative()",
      "begin_line": 141,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 143,col 5)-(line 143,col 67)",
        "(line 144,col 5)-(line 144,col 57)",
        "(line 145,col 5)-(line 145,col 59)",
        "(line 146,col 5)-(line 146,col 32)",
        "(line 147,col 5)-(line 147,col 69)",
        "(line 148,col 5)-(line 148,col 37)"
      ]
    },
    {
      "type": "class_interface",
      "name": "KeplerStepHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepHandler"
      ],
      "begin_line": 151,
      "end_line": 183,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 152,
      "end_line": 152,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "KeplerStepHandler(TestProblem3)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027TestProblem3\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 153,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 154,col 7)-(line 154,col 19)",
        "(line 155,col 7)-(line 155,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GillIntegratorTest.KeplerStepHandler.requiresDenseOutput()",
      "begin_line": 157,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 158,col 7)-(line 158,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GillIntegratorTest.KeplerStepHandler.reset()",
      "begin_line": 160,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 161,col 7)-(line 161,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GillIntegratorTest.KeplerStepHandler.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 163,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 166,col 7)-(line 166,col 68)",
        "(line 167,col 7)-(line 167,col 89)",
        "(line 168,col 7)-(line 168,col 53)",
        "(line 169,col 7)-(line 169,col 53)",
        "(line 170,col 7)-(line 170,col 39)",
        "(line 171,col 7)-(line 173,col 7)",
        "(line 174,col 7)-(line 179,col 7)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "maxError"
      ],
      "begin_line": 181,
      "end_line": 181,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pb"
      ],
      "begin_line": 182,
      "end_line": 182,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GillIntegratorTest.testStepSize()",
      "begin_line": 185,
      "end_line": 213,
      "comment": "",
      "child_ranges": [
        "(line 187,col 7)-(line 187,col 34)",
        "(line 188,col 7)-(line 188,col 60)",
        "(line 189,col 7)-(line 203,col 9)",
        "(line 204,col 7)-(line 212,col 56)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 190,
      "end_line": 190,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GillIntegratorTest.Anonymous-37fd7bf0-1f55-4520-9b97-ec1c988e67eb.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 191,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 192,col 15)-(line 196,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GillIntegratorTest.Anonymous-9c0154dc-eee5-4a1a-87fe-60ee2c154629.requiresDenseOutput()",
      "begin_line": 198,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 199,col 15)-(line 199,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GillIntegratorTest.Anonymous-9b13454e-4e1d-40b6-94b2-9417ac093f5a.reset()",
      "begin_line": 201,
      "end_line": 202,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 205,
      "end_line": 205,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GillIntegratorTest.Anonymous-1d4af6e0-21e9-4ab3-ba87-6d77ef211f55.computeDerivatives(double, double[], double[])",
      "begin_line": 206,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 207,col 15)-(line 207,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GillIntegratorTest.Anonymous-dc51cd0a-e0cd-478e-9cac-f15ec81fbd70.getDimension()",
      "begin_line": 209,
      "end_line": 211,
      "comment": "",
      "child_ranges": [
        "(line 210,col 15)-(line 210,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GillIntegratorTest.suite()",
      "begin_line": 215,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 216,col 5)-(line 216,col 51)"
      ]
    }
  ]
}