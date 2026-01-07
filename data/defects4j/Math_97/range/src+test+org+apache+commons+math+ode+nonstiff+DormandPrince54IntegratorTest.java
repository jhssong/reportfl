{
  "filepath": "/tmp/Math-97b/src/test/org/apache/commons/math/ode/nonstiff/DormandPrince54IntegratorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DormandPrince54IntegratorTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 32,
      "end_line": 341,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.DormandPrince54IntegratorTest(java.lang.String)",
      "begin_line": 35,
      "end_line": 37,
      "comment": "",
      "child_ranges": [
        "(line 36,col 5)-(line 36,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testDimensionCheck()",
      "begin_line": 39,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 40,col 5)-(line 51,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testMinStep()",
      "begin_line": 54,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 57,col 5)-(line 76,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testSmallLastStep()",
      "begin_line": 80,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 83,col 5)-(line 83,col 48)",
        "(line 84,col 5)-(line 84,col 26)",
        "(line 85,col 5)-(line 85,col 71)",
        "(line 86,col 5)-(line 86,col 42)",
        "(line 87,col 5)-(line 87,col 42)",
        "(line 89,col 5)-(line 92,col 59)",
        "(line 94,col 5)-(line 94,col 69)",
        "(line 95,col 5)-(line 95,col 34)",
        "(line 96,col 5)-(line 96,col 34)",
        "(line 97,col 5)-(line 99,col 70)",
        "(line 100,col 5)-(line 100,col 38)",
        "(line 101,col 5)-(line 101,col 57)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DP54SmallLastHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepHandler"
      ],
      "begin_line": 105,
      "end_line": 136,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.DP54SmallLastHandler.DP54SmallLastHandler(double)",
      "begin_line": 109,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 110,col 7)-(line 110,col 23)",
        "(line 111,col 7)-(line 111,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.DP54SmallLastHandler.requiresDenseOutput()",
      "begin_line": 114,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 115,col 7)-(line 115,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.DP54SmallLastHandler.reset()",
      "begin_line": 118,
      "end_line": 119,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.DP54SmallLastHandler.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 121,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 122,col 7)-(line 126,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.DP54SmallLastHandler.wasLastSeen()",
      "begin_line": 129,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 130,col 7)-(line 130,col 22)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "lastSeen"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "minStep"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testIncreasingTolerance()",
      "begin_line": 138,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 141,col 5)-(line 141,col 42)",
        "(line 142,col 5)-(line 174,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testEvents()",
      "begin_line": 178,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 181,col 5)-(line 181,col 41)",
        "(line 182,col 5)-(line 182,col 23)",
        "(line 183,col 5)-(line 183,col 61)",
        "(line 184,col 5)-(line 184,col 42)",
        "(line 185,col 5)-(line 185,col 64)",
        "(line 187,col 5)-(line 189,col 86)",
        "(line 190,col 5)-(line 190,col 67)",
        "(line 191,col 5)-(line 191,col 34)",
        "(line 192,col 5)-(line 192,col 54)",
        "(line 193,col 5)-(line 196,col 5)",
        "(line 197,col 5)-(line 197,col 69)",
        "(line 198,col 5)-(line 200,col 70)",
        "(line 202,col 5)-(line 202,col 56)",
        "(line 203,col 5)-(line 203,col 60)",
        "(line 204,col 5)-(line 204,col 64)",
        "(line 205,col 5)-(line 205,col 32)",
        "(line 206,col 5)-(line 206,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testKepler()",
      "begin_line": 210,
      "end_line": 229,
      "comment": "",
      "child_ranges": [
        "(line 213,col 5)-(line 213,col 51)",
        "(line 214,col 5)-(line 214,col 23)",
        "(line 215,col 5)-(line 215,col 61)",
        "(line 216,col 5)-(line 216,col 42)",
        "(line 217,col 5)-(line 217,col 57)",
        "(line 219,col 5)-(line 221,col 86)",
        "(line 222,col 5)-(line 222,col 48)",
        "(line 223,col 5)-(line 225,col 70)",
        "(line 227,col 5)-(line 227,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testVariableSteps()",
      "begin_line": 231,
      "end_line": 247,
      "comment": "",
      "child_ranges": [
        "(line 234,col 5)-(line 234,col 51)",
        "(line 235,col 5)-(line 235,col 23)",
        "(line 236,col 5)-(line 236,col 61)",
        "(line 237,col 5)-(line 237,col 42)",
        "(line 238,col 5)-(line 238,col 57)",
        "(line 240,col 5)-(line 242,col 86)",
        "(line 243,col 5)-(line 243,col 48)",
        "(line 244,col 5)-(line 246,col 70)"
      ]
    },
    {
      "type": "class_interface",
      "name": "KeplerHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepHandler"
      ],
      "begin_line": 249,
      "end_line": 292,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 250,
      "end_line": 250,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "KeplerHandler(TestProblem3)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027TestProblem3\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 252,
      "end_line": 255,
      "comment": "",
      "child_ranges": [
        "(line 253,col 7)-(line 253,col 19)",
        "(line 254,col 7)-(line 254,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.KeplerHandler.requiresDenseOutput()",
      "begin_line": 256,
      "end_line": 258,
      "comment": "",
      "child_ranges": [
        "(line 257,col 7)-(line 257,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.KeplerHandler.reset()",
      "begin_line": 259,
      "end_line": 262,
      "comment": "",
      "child_ranges": [
        "(line 260,col 7)-(line 260,col 18)",
        "(line 261,col 7)-(line 261,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.KeplerHandler.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 263,
      "end_line": 288,
      "comment": "",
      "child_ranges": [
        "(line 267,col 7)-(line 267,col 16)",
        "(line 268,col 7)-(line 283,col 7)",
        "(line 284,col 7)-(line 287,col 7)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "nbSteps"
      ],
      "begin_line": 289,
      "end_line": 289,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxError"
      ],
      "begin_line": 290,
      "end_line": 290,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pb"
      ],
      "begin_line": 291,
      "end_line": 291,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "VariableHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepHandler"
      ],
      "begin_line": 294,
      "end_line": 335,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 295,
      "end_line": 295,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.VariableHandler.VariableHandler()",
      "begin_line": 296,
      "end_line": 300,
      "comment": "",
      "child_ranges": [
        "(line 297,col 7)-(line 297,col 23)",
        "(line 298,col 7)-(line 298,col 18)",
        "(line 299,col 7)-(line 299,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.VariableHandler.requiresDenseOutput()",
      "begin_line": 301,
      "end_line": 303,
      "comment": "",
      "child_ranges": [
        "(line 302,col 7)-(line 302,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.VariableHandler.reset()",
      "begin_line": 304,
      "end_line": 308,
      "comment": "",
      "child_ranges": [
        "(line 305,col 7)-(line 305,col 23)",
        "(line 306,col 7)-(line 306,col 18)",
        "(line 307,col 7)-(line 307,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.VariableHandler.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 309,
      "end_line": 331,
      "comment": "",
      "child_ranges": [
        "(line 312,col 7)-(line 313,col 63)",
        "(line 314,col 7)-(line 325,col 7)",
        "(line 327,col 7)-(line 330,col 7)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "firstTime"
      ],
      "begin_line": 332,
      "end_line": 332,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "minStep"
      ],
      "begin_line": 333,
      "end_line": 333,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxStep"
      ],
      "begin_line": 334,
      "end_line": 334,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.suite()",
      "begin_line": 337,
      "end_line": 339,
      "comment": "",
      "child_ranges": [
        "(line 338,col 5)-(line 338,col 62)"
      ]
    }
  ]
}