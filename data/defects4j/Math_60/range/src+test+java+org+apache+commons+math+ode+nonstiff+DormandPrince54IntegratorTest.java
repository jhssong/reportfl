{
  "filepath": "/tmp/Math-60b/src/test/java/org/apache/commons/math/ode/nonstiff/DormandPrince54IntegratorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DormandPrince54IntegratorTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 38,
      "end_line": 362,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.DormandPrince54IntegratorTest(java.lang.String)",
      "begin_line": 41,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 42,col 5)-(line 42,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testDimensionCheck()",
      "begin_line": 45,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 46,col 5)-(line 57,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testMinStep()",
      "begin_line": 60,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 62,col 5)-(line 81,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testSmallLastStep()",
      "begin_line": 85,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 88,col 5)-(line 88,col 48)",
        "(line 89,col 5)-(line 89,col 26)",
        "(line 90,col 5)-(line 90,col 75)",
        "(line 91,col 5)-(line 91,col 42)",
        "(line 92,col 5)-(line 92,col 42)",
        "(line 94,col 5)-(line 97,col 59)",
        "(line 99,col 5)-(line 99,col 69)",
        "(line 100,col 5)-(line 100,col 34)",
        "(line 101,col 5)-(line 101,col 34)",
        "(line 102,col 5)-(line 104,col 70)",
        "(line 105,col 5)-(line 105,col 38)",
        "(line 106,col 5)-(line 106,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testBackward()",
      "begin_line": 110,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 113,col 7)-(line 113,col 43)",
        "(line 114,col 7)-(line 114,col 25)",
        "(line 115,col 7)-(line 115,col 63)",
        "(line 116,col 7)-(line 116,col 44)",
        "(line 117,col 7)-(line 117,col 66)",
        "(line 119,col 7)-(line 121,col 88)",
        "(line 122,col 7)-(line 122,col 69)",
        "(line 123,col 7)-(line 123,col 36)",
        "(line 124,col 7)-(line 125,col 72)",
        "(line 127,col 7)-(line 127,col 50)",
        "(line 128,col 7)-(line 128,col 58)",
        "(line 129,col 7)-(line 129,col 62)",
        "(line 130,col 7)-(line 130,col 59)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DP54SmallLastHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepHandler"
      ],
      "begin_line": 133,
      "end_line": 162,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.DP54SmallLastHandler.DP54SmallLastHandler(double)",
      "begin_line": 135,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 136,col 7)-(line 136,col 23)",
        "(line 137,col 7)-(line 137,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.DP54SmallLastHandler.requiresDenseOutput()",
      "begin_line": 140,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 141,col 7)-(line 141,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.DP54SmallLastHandler.reset()",
      "begin_line": 144,
      "end_line": 145,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.DP54SmallLastHandler.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 147,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 148,col 7)-(line 152,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.DP54SmallLastHandler.wasLastSeen()",
      "begin_line": 155,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 156,col 7)-(line 156,col 22)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "lastSeen"
      ],
      "begin_line": 159,
      "end_line": 159,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "minStep"
      ],
      "begin_line": 160,
      "end_line": 160,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testIncreasingTolerance()",
      "begin_line": 164,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 167,col 5)-(line 167,col 42)",
        "(line 168,col 5)-(line 201,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testEvents()",
      "begin_line": 205,
      "end_line": 235,
      "comment": "",
      "child_ranges": [
        "(line 208,col 5)-(line 208,col 41)",
        "(line 209,col 5)-(line 209,col 23)",
        "(line 210,col 5)-(line 210,col 61)",
        "(line 211,col 5)-(line 211,col 42)",
        "(line 212,col 5)-(line 212,col 64)",
        "(line 214,col 5)-(line 216,col 86)",
        "(line 217,col 5)-(line 217,col 67)",
        "(line 218,col 5)-(line 218,col 34)",
        "(line 219,col 5)-(line 219,col 54)",
        "(line 220,col 5)-(line 223,col 5)",
        "(line 224,col 5)-(line 224,col 68)",
        "(line 225,col 5)-(line 227,col 70)",
        "(line 229,col 5)-(line 229,col 56)",
        "(line 230,col 5)-(line 230,col 60)",
        "(line 231,col 5)-(line 231,col 64)",
        "(line 232,col 5)-(line 232,col 31)",
        "(line 233,col 5)-(line 233,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testKepler()",
      "begin_line": 237,
      "end_line": 257,
      "comment": "",
      "child_ranges": [
        "(line 240,col 5)-(line 240,col 51)",
        "(line 241,col 5)-(line 241,col 23)",
        "(line 242,col 5)-(line 242,col 61)",
        "(line 243,col 5)-(line 243,col 42)",
        "(line 244,col 5)-(line 244,col 57)",
        "(line 246,col 5)-(line 248,col 86)",
        "(line 249,col 5)-(line 249,col 48)",
        "(line 250,col 5)-(line 252,col 70)",
        "(line 254,col 5)-(line 254,col 56)",
        "(line 255,col 5)-(line 255,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testVariableSteps()",
      "begin_line": 259,
      "end_line": 275,
      "comment": "",
      "child_ranges": [
        "(line 262,col 5)-(line 262,col 51)",
        "(line 263,col 5)-(line 263,col 23)",
        "(line 264,col 5)-(line 264,col 61)",
        "(line 265,col 5)-(line 265,col 42)",
        "(line 266,col 5)-(line 266,col 57)",
        "(line 268,col 5)-(line 270,col 86)",
        "(line 271,col 5)-(line 271,col 48)",
        "(line 272,col 5)-(line 273,col 88)",
        "(line 274,col 5)-(line 274,col 55)"
      ]
    },
    {
      "type": "class_interface",
      "name": "KeplerHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepHandler"
      ],
      "begin_line": 277,
      "end_line": 318,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "KeplerHandler(TestProblem3)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027TestProblem3\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 278,
      "end_line": 281,
      "comment": "",
      "child_ranges": [
        "(line 279,col 7)-(line 279,col 19)",
        "(line 280,col 7)-(line 280,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.KeplerHandler.requiresDenseOutput()",
      "begin_line": 282,
      "end_line": 284,
      "comment": "",
      "child_ranges": [
        "(line 283,col 7)-(line 283,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.KeplerHandler.reset()",
      "begin_line": 285,
      "end_line": 288,
      "comment": "",
      "child_ranges": [
        "(line 286,col 7)-(line 286,col 18)",
        "(line 287,col 7)-(line 287,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.KeplerHandler.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 289,
      "end_line": 314,
      "comment": "",
      "child_ranges": [
        "(line 293,col 7)-(line 293,col 16)",
        "(line 294,col 7)-(line 309,col 7)",
        "(line 310,col 7)-(line 313,col 7)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "nbSteps"
      ],
      "begin_line": 315,
      "end_line": 315,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxError"
      ],
      "begin_line": 316,
      "end_line": 316,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pb"
      ],
      "begin_line": 317,
      "end_line": 317,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "VariableHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepHandler"
      ],
      "begin_line": 320,
      "end_line": 360,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.VariableHandler.VariableHandler()",
      "begin_line": 321,
      "end_line": 325,
      "comment": "",
      "child_ranges": [
        "(line 322,col 7)-(line 322,col 23)",
        "(line 323,col 7)-(line 323,col 18)",
        "(line 324,col 7)-(line 324,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.VariableHandler.requiresDenseOutput()",
      "begin_line": 326,
      "end_line": 328,
      "comment": "",
      "child_ranges": [
        "(line 327,col 7)-(line 327,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.VariableHandler.reset()",
      "begin_line": 329,
      "end_line": 333,
      "comment": "",
      "child_ranges": [
        "(line 330,col 7)-(line 330,col 23)",
        "(line 331,col 7)-(line 331,col 18)",
        "(line 332,col 7)-(line 332,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.VariableHandler.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 334,
      "end_line": 356,
      "comment": "",
      "child_ranges": [
        "(line 337,col 7)-(line 338,col 63)",
        "(line 339,col 7)-(line 350,col 7)",
        "(line 352,col 7)-(line 355,col 7)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "firstTime"
      ],
      "begin_line": 357,
      "end_line": 357,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "minStep"
      ],
      "begin_line": 358,
      "end_line": 358,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxStep"
      ],
      "begin_line": 359,
      "end_line": 359,
      "comment": ""
    }
  ]
}