{
  "filepath": "/tmp/Math-58b/src/test/java/org/apache/commons/math/ode/nonstiff/DormandPrince54IntegratorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DormandPrince54IntegratorTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 38,
      "end_line": 363,
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
      "end_line": 236,
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
        "(line 220,col 5)-(line 220,col 42)",
        "(line 221,col 5)-(line 224,col 5)",
        "(line 225,col 5)-(line 225,col 68)",
        "(line 226,col 5)-(line 228,col 70)",
        "(line 230,col 5)-(line 230,col 56)",
        "(line 231,col 5)-(line 231,col 64)",
        "(line 232,col 5)-(line 232,col 59)",
        "(line 233,col 5)-(line 233,col 31)",
        "(line 234,col 5)-(line 234,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testKepler()",
      "begin_line": 238,
      "end_line": 258,
      "comment": "",
      "child_ranges": [
        "(line 241,col 5)-(line 241,col 51)",
        "(line 242,col 5)-(line 242,col 23)",
        "(line 243,col 5)-(line 243,col 61)",
        "(line 244,col 5)-(line 244,col 42)",
        "(line 245,col 5)-(line 245,col 57)",
        "(line 247,col 5)-(line 249,col 86)",
        "(line 250,col 5)-(line 250,col 48)",
        "(line 251,col 5)-(line 253,col 70)",
        "(line 255,col 5)-(line 255,col 56)",
        "(line 256,col 5)-(line 256,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testVariableSteps()",
      "begin_line": 260,
      "end_line": 276,
      "comment": "",
      "child_ranges": [
        "(line 263,col 5)-(line 263,col 51)",
        "(line 264,col 5)-(line 264,col 23)",
        "(line 265,col 5)-(line 265,col 61)",
        "(line 266,col 5)-(line 266,col 42)",
        "(line 267,col 5)-(line 267,col 57)",
        "(line 269,col 5)-(line 271,col 86)",
        "(line 272,col 5)-(line 272,col 48)",
        "(line 273,col 5)-(line 274,col 88)",
        "(line 275,col 5)-(line 275,col 55)"
      ]
    },
    {
      "type": "class_interface",
      "name": "KeplerHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepHandler"
      ],
      "begin_line": 278,
      "end_line": 319,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "KeplerHandler(TestProblem3)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027TestProblem3\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 279,
      "end_line": 282,
      "comment": "",
      "child_ranges": [
        "(line 280,col 7)-(line 280,col 19)",
        "(line 281,col 7)-(line 281,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.KeplerHandler.requiresDenseOutput()",
      "begin_line": 283,
      "end_line": 285,
      "comment": "",
      "child_ranges": [
        "(line 284,col 7)-(line 284,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.KeplerHandler.reset()",
      "begin_line": 286,
      "end_line": 289,
      "comment": "",
      "child_ranges": [
        "(line 287,col 7)-(line 287,col 18)",
        "(line 288,col 7)-(line 288,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.KeplerHandler.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 290,
      "end_line": 315,
      "comment": "",
      "child_ranges": [
        "(line 294,col 7)-(line 294,col 16)",
        "(line 295,col 7)-(line 310,col 7)",
        "(line 311,col 7)-(line 314,col 7)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "nbSteps"
      ],
      "begin_line": 316,
      "end_line": 316,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxError"
      ],
      "begin_line": 317,
      "end_line": 317,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pb"
      ],
      "begin_line": 318,
      "end_line": 318,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "VariableHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepHandler"
      ],
      "begin_line": 321,
      "end_line": 361,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.VariableHandler.VariableHandler()",
      "begin_line": 322,
      "end_line": 326,
      "comment": "",
      "child_ranges": [
        "(line 323,col 7)-(line 323,col 23)",
        "(line 324,col 7)-(line 324,col 18)",
        "(line 325,col 7)-(line 325,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.VariableHandler.requiresDenseOutput()",
      "begin_line": 327,
      "end_line": 329,
      "comment": "",
      "child_ranges": [
        "(line 328,col 7)-(line 328,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.VariableHandler.reset()",
      "begin_line": 330,
      "end_line": 334,
      "comment": "",
      "child_ranges": [
        "(line 331,col 7)-(line 331,col 23)",
        "(line 332,col 7)-(line 332,col 18)",
        "(line 333,col 7)-(line 333,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.VariableHandler.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 335,
      "end_line": 357,
      "comment": "",
      "child_ranges": [
        "(line 338,col 7)-(line 339,col 63)",
        "(line 340,col 7)-(line 351,col 7)",
        "(line 353,col 7)-(line 356,col 7)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "firstTime"
      ],
      "begin_line": 358,
      "end_line": 358,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "minStep"
      ],
      "begin_line": 359,
      "end_line": 359,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxStep"
      ],
      "begin_line": 360,
      "end_line": 360,
      "comment": ""
    }
  ]
}