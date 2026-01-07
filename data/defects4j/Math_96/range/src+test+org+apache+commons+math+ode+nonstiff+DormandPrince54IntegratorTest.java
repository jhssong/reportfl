{
  "filepath": "/tmp/Math-96b/src/test/org/apache/commons/math/ode/nonstiff/DormandPrince54IntegratorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DormandPrince54IntegratorTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 31,
      "end_line": 340,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.DormandPrince54IntegratorTest(java.lang.String)",
      "begin_line": 34,
      "end_line": 36,
      "comment": "",
      "child_ranges": [
        "(line 35,col 5)-(line 35,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testDimensionCheck()",
      "begin_line": 38,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 39,col 5)-(line 50,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testMinStep()",
      "begin_line": 53,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 56,col 5)-(line 75,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testSmallLastStep()",
      "begin_line": 79,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 82,col 5)-(line 82,col 48)",
        "(line 83,col 5)-(line 83,col 26)",
        "(line 84,col 5)-(line 84,col 71)",
        "(line 85,col 5)-(line 85,col 42)",
        "(line 86,col 5)-(line 86,col 42)",
        "(line 88,col 5)-(line 91,col 59)",
        "(line 93,col 5)-(line 93,col 69)",
        "(line 94,col 5)-(line 94,col 34)",
        "(line 95,col 5)-(line 95,col 34)",
        "(line 96,col 5)-(line 98,col 70)",
        "(line 99,col 5)-(line 99,col 38)",
        "(line 100,col 5)-(line 100,col 57)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DP54SmallLastHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepHandler"
      ],
      "begin_line": 104,
      "end_line": 135,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.DP54SmallLastHandler.DP54SmallLastHandler(double)",
      "begin_line": 108,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 109,col 7)-(line 109,col 23)",
        "(line 110,col 7)-(line 110,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.DP54SmallLastHandler.requiresDenseOutput()",
      "begin_line": 113,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 114,col 7)-(line 114,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.DP54SmallLastHandler.reset()",
      "begin_line": 117,
      "end_line": 118,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.DP54SmallLastHandler.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 120,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 121,col 7)-(line 125,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.DP54SmallLastHandler.wasLastSeen()",
      "begin_line": 128,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 129,col 7)-(line 129,col 22)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "lastSeen"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "minStep"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testIncreasingTolerance()",
      "begin_line": 137,
      "end_line": 175,
      "comment": "",
      "child_ranges": [
        "(line 140,col 5)-(line 140,col 42)",
        "(line 141,col 5)-(line 173,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testEvents()",
      "begin_line": 177,
      "end_line": 207,
      "comment": "",
      "child_ranges": [
        "(line 180,col 5)-(line 180,col 41)",
        "(line 181,col 5)-(line 181,col 23)",
        "(line 182,col 5)-(line 182,col 61)",
        "(line 183,col 5)-(line 183,col 42)",
        "(line 184,col 5)-(line 184,col 64)",
        "(line 186,col 5)-(line 188,col 86)",
        "(line 189,col 5)-(line 189,col 67)",
        "(line 190,col 5)-(line 190,col 34)",
        "(line 191,col 5)-(line 191,col 54)",
        "(line 192,col 5)-(line 195,col 5)",
        "(line 196,col 5)-(line 196,col 68)",
        "(line 197,col 5)-(line 199,col 70)",
        "(line 201,col 5)-(line 201,col 56)",
        "(line 202,col 5)-(line 202,col 60)",
        "(line 203,col 5)-(line 203,col 64)",
        "(line 204,col 5)-(line 204,col 31)",
        "(line 205,col 5)-(line 205,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testKepler()",
      "begin_line": 209,
      "end_line": 228,
      "comment": "",
      "child_ranges": [
        "(line 212,col 5)-(line 212,col 51)",
        "(line 213,col 5)-(line 213,col 23)",
        "(line 214,col 5)-(line 214,col 61)",
        "(line 215,col 5)-(line 215,col 42)",
        "(line 216,col 5)-(line 216,col 57)",
        "(line 218,col 5)-(line 220,col 86)",
        "(line 221,col 5)-(line 221,col 48)",
        "(line 222,col 5)-(line 224,col 70)",
        "(line 226,col 5)-(line 226,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testVariableSteps()",
      "begin_line": 230,
      "end_line": 246,
      "comment": "",
      "child_ranges": [
        "(line 233,col 5)-(line 233,col 51)",
        "(line 234,col 5)-(line 234,col 23)",
        "(line 235,col 5)-(line 235,col 61)",
        "(line 236,col 5)-(line 236,col 42)",
        "(line 237,col 5)-(line 237,col 57)",
        "(line 239,col 5)-(line 241,col 86)",
        "(line 242,col 5)-(line 242,col 48)",
        "(line 243,col 5)-(line 244,col 88)",
        "(line 245,col 5)-(line 245,col 55)"
      ]
    },
    {
      "type": "class_interface",
      "name": "KeplerHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepHandler"
      ],
      "begin_line": 248,
      "end_line": 291,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 249,
      "end_line": 249,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "KeplerHandler(TestProblem3)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027TestProblem3\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 251,
      "end_line": 254,
      "comment": "",
      "child_ranges": [
        "(line 252,col 7)-(line 252,col 19)",
        "(line 253,col 7)-(line 253,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.KeplerHandler.requiresDenseOutput()",
      "begin_line": 255,
      "end_line": 257,
      "comment": "",
      "child_ranges": [
        "(line 256,col 7)-(line 256,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.KeplerHandler.reset()",
      "begin_line": 258,
      "end_line": 261,
      "comment": "",
      "child_ranges": [
        "(line 259,col 7)-(line 259,col 18)",
        "(line 260,col 7)-(line 260,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.KeplerHandler.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 262,
      "end_line": 287,
      "comment": "",
      "child_ranges": [
        "(line 266,col 7)-(line 266,col 16)",
        "(line 267,col 7)-(line 282,col 7)",
        "(line 283,col 7)-(line 286,col 7)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "nbSteps"
      ],
      "begin_line": 288,
      "end_line": 288,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxError"
      ],
      "begin_line": 289,
      "end_line": 289,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pb"
      ],
      "begin_line": 290,
      "end_line": 290,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "VariableHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepHandler"
      ],
      "begin_line": 293,
      "end_line": 334,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 294,
      "end_line": 294,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.VariableHandler.VariableHandler()",
      "begin_line": 295,
      "end_line": 299,
      "comment": "",
      "child_ranges": [
        "(line 296,col 7)-(line 296,col 23)",
        "(line 297,col 7)-(line 297,col 18)",
        "(line 298,col 7)-(line 298,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.VariableHandler.requiresDenseOutput()",
      "begin_line": 300,
      "end_line": 302,
      "comment": "",
      "child_ranges": [
        "(line 301,col 7)-(line 301,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.VariableHandler.reset()",
      "begin_line": 303,
      "end_line": 307,
      "comment": "",
      "child_ranges": [
        "(line 304,col 7)-(line 304,col 23)",
        "(line 305,col 7)-(line 305,col 18)",
        "(line 306,col 7)-(line 306,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.VariableHandler.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 308,
      "end_line": 330,
      "comment": "",
      "child_ranges": [
        "(line 311,col 7)-(line 312,col 63)",
        "(line 313,col 7)-(line 324,col 7)",
        "(line 326,col 7)-(line 329,col 7)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "firstTime"
      ],
      "begin_line": 331,
      "end_line": 331,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "minStep"
      ],
      "begin_line": 332,
      "end_line": 332,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxStep"
      ],
      "begin_line": 333,
      "end_line": 333,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.suite()",
      "begin_line": 336,
      "end_line": 338,
      "comment": "",
      "child_ranges": [
        "(line 337,col 5)-(line 337,col 62)"
      ]
    }
  ]
}