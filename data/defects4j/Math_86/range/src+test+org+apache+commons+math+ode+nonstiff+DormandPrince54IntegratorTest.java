{
  "filepath": "/tmp/Math-86b/src/test/org/apache/commons/math/ode/nonstiff/DormandPrince54IntegratorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DormandPrince54IntegratorTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 31,
      "end_line": 362,
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
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 55,col 5)-(line 74,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testSmallLastStep()",
      "begin_line": 78,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 81,col 5)-(line 81,col 48)",
        "(line 82,col 5)-(line 82,col 26)",
        "(line 83,col 5)-(line 83,col 71)",
        "(line 84,col 5)-(line 84,col 42)",
        "(line 85,col 5)-(line 85,col 42)",
        "(line 87,col 5)-(line 90,col 59)",
        "(line 92,col 5)-(line 92,col 69)",
        "(line 93,col 5)-(line 93,col 34)",
        "(line 94,col 5)-(line 94,col 34)",
        "(line 95,col 5)-(line 97,col 70)",
        "(line 98,col 5)-(line 98,col 38)",
        "(line 99,col 5)-(line 99,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testBackward()",
      "begin_line": 103,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 106,col 7)-(line 106,col 43)",
        "(line 107,col 7)-(line 107,col 25)",
        "(line 108,col 7)-(line 108,col 63)",
        "(line 109,col 7)-(line 109,col 44)",
        "(line 110,col 7)-(line 110,col 66)",
        "(line 112,col 7)-(line 114,col 88)",
        "(line 115,col 7)-(line 115,col 69)",
        "(line 116,col 7)-(line 116,col 36)",
        "(line 117,col 7)-(line 118,col 72)",
        "(line 120,col 7)-(line 120,col 50)",
        "(line 121,col 7)-(line 121,col 58)",
        "(line 122,col 7)-(line 122,col 62)",
        "(line 123,col 7)-(line 123,col 59)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DP54SmallLastHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepHandler"
      ],
      "begin_line": 126,
      "end_line": 157,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.DP54SmallLastHandler.DP54SmallLastHandler(double)",
      "begin_line": 130,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 131,col 7)-(line 131,col 23)",
        "(line 132,col 7)-(line 132,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.DP54SmallLastHandler.requiresDenseOutput()",
      "begin_line": 135,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 136,col 7)-(line 136,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.DP54SmallLastHandler.reset()",
      "begin_line": 139,
      "end_line": 140,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.DP54SmallLastHandler.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 142,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 143,col 7)-(line 147,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.DP54SmallLastHandler.wasLastSeen()",
      "begin_line": 150,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 151,col 7)-(line 151,col 22)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "lastSeen"
      ],
      "begin_line": 154,
      "end_line": 154,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "minStep"
      ],
      "begin_line": 155,
      "end_line": 155,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testIncreasingTolerance()",
      "begin_line": 159,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 162,col 5)-(line 162,col 42)",
        "(line 163,col 5)-(line 195,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testEvents()",
      "begin_line": 199,
      "end_line": 229,
      "comment": "",
      "child_ranges": [
        "(line 202,col 5)-(line 202,col 41)",
        "(line 203,col 5)-(line 203,col 23)",
        "(line 204,col 5)-(line 204,col 61)",
        "(line 205,col 5)-(line 205,col 42)",
        "(line 206,col 5)-(line 206,col 64)",
        "(line 208,col 5)-(line 210,col 86)",
        "(line 211,col 5)-(line 211,col 67)",
        "(line 212,col 5)-(line 212,col 34)",
        "(line 213,col 5)-(line 213,col 54)",
        "(line 214,col 5)-(line 217,col 5)",
        "(line 218,col 5)-(line 218,col 68)",
        "(line 219,col 5)-(line 221,col 70)",
        "(line 223,col 5)-(line 223,col 56)",
        "(line 224,col 5)-(line 224,col 60)",
        "(line 225,col 5)-(line 225,col 64)",
        "(line 226,col 5)-(line 226,col 31)",
        "(line 227,col 5)-(line 227,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testKepler()",
      "begin_line": 231,
      "end_line": 250,
      "comment": "",
      "child_ranges": [
        "(line 234,col 5)-(line 234,col 51)",
        "(line 235,col 5)-(line 235,col 23)",
        "(line 236,col 5)-(line 236,col 61)",
        "(line 237,col 5)-(line 237,col 42)",
        "(line 238,col 5)-(line 238,col 57)",
        "(line 240,col 5)-(line 242,col 86)",
        "(line 243,col 5)-(line 243,col 48)",
        "(line 244,col 5)-(line 246,col 70)",
        "(line 248,col 5)-(line 248,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testVariableSteps()",
      "begin_line": 252,
      "end_line": 268,
      "comment": "",
      "child_ranges": [
        "(line 255,col 5)-(line 255,col 51)",
        "(line 256,col 5)-(line 256,col 23)",
        "(line 257,col 5)-(line 257,col 61)",
        "(line 258,col 5)-(line 258,col 42)",
        "(line 259,col 5)-(line 259,col 57)",
        "(line 261,col 5)-(line 263,col 86)",
        "(line 264,col 5)-(line 264,col 48)",
        "(line 265,col 5)-(line 266,col 88)",
        "(line 267,col 5)-(line 267,col 55)"
      ]
    },
    {
      "type": "class_interface",
      "name": "KeplerHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepHandler"
      ],
      "begin_line": 270,
      "end_line": 313,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 271,
      "end_line": 271,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "KeplerHandler(TestProblem3)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027TestProblem3\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 273,
      "end_line": 276,
      "comment": "",
      "child_ranges": [
        "(line 274,col 7)-(line 274,col 19)",
        "(line 275,col 7)-(line 275,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.KeplerHandler.requiresDenseOutput()",
      "begin_line": 277,
      "end_line": 279,
      "comment": "",
      "child_ranges": [
        "(line 278,col 7)-(line 278,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.KeplerHandler.reset()",
      "begin_line": 280,
      "end_line": 283,
      "comment": "",
      "child_ranges": [
        "(line 281,col 7)-(line 281,col 18)",
        "(line 282,col 7)-(line 282,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.KeplerHandler.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 284,
      "end_line": 309,
      "comment": "",
      "child_ranges": [
        "(line 288,col 7)-(line 288,col 16)",
        "(line 289,col 7)-(line 304,col 7)",
        "(line 305,col 7)-(line 308,col 7)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "nbSteps"
      ],
      "begin_line": 310,
      "end_line": 310,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxError"
      ],
      "begin_line": 311,
      "end_line": 311,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pb"
      ],
      "begin_line": 312,
      "end_line": 312,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "VariableHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepHandler"
      ],
      "begin_line": 315,
      "end_line": 356,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 316,
      "end_line": 316,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.VariableHandler.VariableHandler()",
      "begin_line": 317,
      "end_line": 321,
      "comment": "",
      "child_ranges": [
        "(line 318,col 7)-(line 318,col 23)",
        "(line 319,col 7)-(line 319,col 18)",
        "(line 320,col 7)-(line 320,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.VariableHandler.requiresDenseOutput()",
      "begin_line": 322,
      "end_line": 324,
      "comment": "",
      "child_ranges": [
        "(line 323,col 7)-(line 323,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.VariableHandler.reset()",
      "begin_line": 325,
      "end_line": 329,
      "comment": "",
      "child_ranges": [
        "(line 326,col 7)-(line 326,col 23)",
        "(line 327,col 7)-(line 327,col 18)",
        "(line 328,col 7)-(line 328,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.VariableHandler.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 330,
      "end_line": 352,
      "comment": "",
      "child_ranges": [
        "(line 333,col 7)-(line 334,col 63)",
        "(line 335,col 7)-(line 346,col 7)",
        "(line 348,col 7)-(line 351,col 7)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "firstTime"
      ],
      "begin_line": 353,
      "end_line": 353,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "minStep"
      ],
      "begin_line": 354,
      "end_line": 354,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxStep"
      ],
      "begin_line": 355,
      "end_line": 355,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.suite()",
      "begin_line": 358,
      "end_line": 360,
      "comment": "",
      "child_ranges": [
        "(line 359,col 5)-(line 359,col 62)"
      ]
    }
  ]
}