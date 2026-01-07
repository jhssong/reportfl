{
  "filepath": "/tmp/Math-96b/src/test/org/apache/commons/math/ode/nonstiff/ClassicalRungeKuttaIntegratorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ClassicalRungeKuttaIntegratorTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 31,
      "end_line": 229,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegratorTest.ClassicalRungeKuttaIntegratorTest(java.lang.String)",
      "begin_line": 34,
      "end_line": 36,
      "comment": "",
      "child_ranges": [
        "(line 35,col 5)-(line 35,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegratorTest.testSanityChecks()",
      "begin_line": 38,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 39,col 5)-(line 48,col 5)",
        "(line 49,col 5)-(line 58,col 7)",
        "(line 59,col 5)-(line 68,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegratorTest.testDecreasingSteps()",
      "begin_line": 71,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 74,col 5)-(line 74,col 70)",
        "(line 75,col 5)-(line 108,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegratorTest.testSmallStep()",
      "begin_line": 112,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 115,col 5)-(line 115,col 41)",
        "(line 116,col 5)-(line 116,col 68)",
        "(line 118,col 5)-(line 118,col 73)",
        "(line 119,col 5)-(line 119,col 67)",
        "(line 120,col 5)-(line 120,col 34)",
        "(line 121,col 5)-(line 122,col 70)",
        "(line 124,col 5)-(line 124,col 49)",
        "(line 125,col 5)-(line 125,col 57)",
        "(line 126,col 5)-(line 126,col 60)",
        "(line 127,col 5)-(line 127,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegratorTest.testBigStep()",
      "begin_line": 130,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 133,col 5)-(line 133,col 41)",
        "(line 134,col 5)-(line 134,col 66)",
        "(line 136,col 5)-(line 136,col 73)",
        "(line 137,col 5)-(line 137,col 67)",
        "(line 138,col 5)-(line 138,col 34)",
        "(line 139,col 5)-(line 140,col 70)",
        "(line 142,col 5)-(line 142,col 48)",
        "(line 143,col 5)-(line 143,col 55)",
        "(line 144,col 5)-(line 144,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegratorTest.testKepler()",
      "begin_line": 148,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 151,col 5)-(line 151,col 51)",
        "(line 152,col 5)-(line 152,col 69)",
        "(line 154,col 5)-(line 154,col 73)",
        "(line 155,col 5)-(line 155,col 48)",
        "(line 156,col 5)-(line 158,col 70)"
      ]
    },
    {
      "type": "class_interface",
      "name": "KeplerHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepHandler"
      ],
      "begin_line": 161,
      "end_line": 193,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 162,
      "end_line": 162,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "KeplerHandler(TestProblem3)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027TestProblem3\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 163,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 164,col 7)-(line 164,col 19)",
        "(line 165,col 7)-(line 165,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegratorTest.KeplerHandler.requiresDenseOutput()",
      "begin_line": 167,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 168,col 7)-(line 168,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegratorTest.KeplerHandler.reset()",
      "begin_line": 170,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 171,col 7)-(line 171,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegratorTest.KeplerHandler.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 173,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 176,col 7)-(line 176,col 68)",
        "(line 177,col 7)-(line 177,col 89)",
        "(line 178,col 7)-(line 178,col 53)",
        "(line 179,col 7)-(line 179,col 53)",
        "(line 180,col 7)-(line 180,col 39)",
        "(line 181,col 7)-(line 183,col 7)",
        "(line 184,col 7)-(line 189,col 7)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "maxError"
      ],
      "begin_line": 191,
      "end_line": 191,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pb"
      ],
      "begin_line": 192,
      "end_line": 192,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegratorTest.testStepSize()",
      "begin_line": 195,
      "end_line": 223,
      "comment": "",
      "child_ranges": [
        "(line 197,col 7)-(line 197,col 34)",
        "(line 198,col 7)-(line 198,col 75)",
        "(line 199,col 7)-(line 213,col 9)",
        "(line 214,col 7)-(line 222,col 56)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 200,
      "end_line": 200,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegratorTest.Anonymous-dd701f60-6b43-4da5-87be-d36d444e0274.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 201,
      "end_line": 207,
      "comment": "",
      "child_ranges": [
        "(line 202,col 15)-(line 206,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegratorTest.Anonymous-d1514ca2-58ec-441b-9b3c-fa19e206a87c.requiresDenseOutput()",
      "begin_line": 208,
      "end_line": 210,
      "comment": "",
      "child_ranges": [
        "(line 209,col 15)-(line 209,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegratorTest.Anonymous-b11eed70-9ee3-4932-9801-df46e1104dee.reset()",
      "begin_line": 211,
      "end_line": 212,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 215,
      "end_line": 215,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegratorTest.Anonymous-5bf5bd61-f396-4079-9245-84d6d1984982.computeDerivatives(double, double[], double[])",
      "begin_line": 216,
      "end_line": 218,
      "comment": "",
      "child_ranges": [
        "(line 217,col 15)-(line 217,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegratorTest.Anonymous-f9b8437e-ddbc-4cad-b587-988f2634f145.getDimension()",
      "begin_line": 219,
      "end_line": 221,
      "comment": "",
      "child_ranges": [
        "(line 220,col 15)-(line 220,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegratorTest.suite()",
      "begin_line": 225,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 226,col 5)-(line 226,col 66)"
      ]
    }
  ]
}