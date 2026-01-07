{
  "filepath": "/tmp/Math-70b/src/test/java/org/apache/commons/math/ode/nonstiff/DormandPrince54IntegratorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DormandPrince54IntegratorTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 37,
      "end_line": 361,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.DormandPrince54IntegratorTest(java.lang.String)",
      "begin_line": 40,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 41,col 5)-(line 41,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testDimensionCheck()",
      "begin_line": 44,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 45,col 5)-(line 56,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testMinStep()",
      "begin_line": 59,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 61,col 5)-(line 80,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testSmallLastStep()",
      "begin_line": 84,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 87,col 5)-(line 87,col 48)",
        "(line 88,col 5)-(line 88,col 26)",
        "(line 89,col 5)-(line 89,col 71)",
        "(line 90,col 5)-(line 90,col 42)",
        "(line 91,col 5)-(line 91,col 42)",
        "(line 93,col 5)-(line 96,col 59)",
        "(line 98,col 5)-(line 98,col 69)",
        "(line 99,col 5)-(line 99,col 34)",
        "(line 100,col 5)-(line 100,col 34)",
        "(line 101,col 5)-(line 103,col 70)",
        "(line 104,col 5)-(line 104,col 38)",
        "(line 105,col 5)-(line 105,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testBackward()",
      "begin_line": 109,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 112,col 7)-(line 112,col 43)",
        "(line 113,col 7)-(line 113,col 25)",
        "(line 114,col 7)-(line 114,col 63)",
        "(line 115,col 7)-(line 115,col 44)",
        "(line 116,col 7)-(line 116,col 66)",
        "(line 118,col 7)-(line 120,col 88)",
        "(line 121,col 7)-(line 121,col 69)",
        "(line 122,col 7)-(line 122,col 36)",
        "(line 123,col 7)-(line 124,col 72)",
        "(line 126,col 7)-(line 126,col 50)",
        "(line 127,col 7)-(line 127,col 58)",
        "(line 128,col 7)-(line 128,col 62)",
        "(line 129,col 7)-(line 129,col 59)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DP54SmallLastHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepHandler"
      ],
      "begin_line": 132,
      "end_line": 161,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.DP54SmallLastHandler.DP54SmallLastHandler(double)",
      "begin_line": 134,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 135,col 7)-(line 135,col 23)",
        "(line 136,col 7)-(line 136,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.DP54SmallLastHandler.requiresDenseOutput()",
      "begin_line": 139,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 140,col 7)-(line 140,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.DP54SmallLastHandler.reset()",
      "begin_line": 143,
      "end_line": 144,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.DP54SmallLastHandler.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 146,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 147,col 7)-(line 151,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.DP54SmallLastHandler.wasLastSeen()",
      "begin_line": 154,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 155,col 7)-(line 155,col 22)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "lastSeen"
      ],
      "begin_line": 158,
      "end_line": 158,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "minStep"
      ],
      "begin_line": 159,
      "end_line": 159,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testIncreasingTolerance()",
      "begin_line": 163,
      "end_line": 202,
      "comment": "",
      "child_ranges": [
        "(line 166,col 5)-(line 166,col 42)",
        "(line 167,col 5)-(line 200,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testEvents()",
      "begin_line": 204,
      "end_line": 234,
      "comment": "",
      "child_ranges": [
        "(line 207,col 5)-(line 207,col 41)",
        "(line 208,col 5)-(line 208,col 23)",
        "(line 209,col 5)-(line 209,col 61)",
        "(line 210,col 5)-(line 210,col 42)",
        "(line 211,col 5)-(line 211,col 64)",
        "(line 213,col 5)-(line 215,col 86)",
        "(line 216,col 5)-(line 216,col 67)",
        "(line 217,col 5)-(line 217,col 34)",
        "(line 218,col 5)-(line 218,col 54)",
        "(line 219,col 5)-(line 222,col 5)",
        "(line 223,col 5)-(line 223,col 68)",
        "(line 224,col 5)-(line 226,col 70)",
        "(line 228,col 5)-(line 228,col 56)",
        "(line 229,col 5)-(line 229,col 60)",
        "(line 230,col 5)-(line 230,col 64)",
        "(line 231,col 5)-(line 231,col 31)",
        "(line 232,col 5)-(line 232,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testKepler()",
      "begin_line": 236,
      "end_line": 256,
      "comment": "",
      "child_ranges": [
        "(line 239,col 5)-(line 239,col 51)",
        "(line 240,col 5)-(line 240,col 23)",
        "(line 241,col 5)-(line 241,col 61)",
        "(line 242,col 5)-(line 242,col 42)",
        "(line 243,col 5)-(line 243,col 57)",
        "(line 245,col 5)-(line 247,col 86)",
        "(line 248,col 5)-(line 248,col 48)",
        "(line 249,col 5)-(line 251,col 70)",
        "(line 253,col 5)-(line 253,col 56)",
        "(line 254,col 5)-(line 254,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testVariableSteps()",
      "begin_line": 258,
      "end_line": 274,
      "comment": "",
      "child_ranges": [
        "(line 261,col 5)-(line 261,col 51)",
        "(line 262,col 5)-(line 262,col 23)",
        "(line 263,col 5)-(line 263,col 61)",
        "(line 264,col 5)-(line 264,col 42)",
        "(line 265,col 5)-(line 265,col 57)",
        "(line 267,col 5)-(line 269,col 86)",
        "(line 270,col 5)-(line 270,col 48)",
        "(line 271,col 5)-(line 272,col 88)",
        "(line 273,col 5)-(line 273,col 55)"
      ]
    },
    {
      "type": "class_interface",
      "name": "KeplerHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepHandler"
      ],
      "begin_line": 276,
      "end_line": 317,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "KeplerHandler(TestProblem3)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027TestProblem3\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 277,
      "end_line": 280,
      "comment": "",
      "child_ranges": [
        "(line 278,col 7)-(line 278,col 19)",
        "(line 279,col 7)-(line 279,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.KeplerHandler.requiresDenseOutput()",
      "begin_line": 281,
      "end_line": 283,
      "comment": "",
      "child_ranges": [
        "(line 282,col 7)-(line 282,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.KeplerHandler.reset()",
      "begin_line": 284,
      "end_line": 287,
      "comment": "",
      "child_ranges": [
        "(line 285,col 7)-(line 285,col 18)",
        "(line 286,col 7)-(line 286,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.KeplerHandler.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 288,
      "end_line": 313,
      "comment": "",
      "child_ranges": [
        "(line 292,col 7)-(line 292,col 16)",
        "(line 293,col 7)-(line 308,col 7)",
        "(line 309,col 7)-(line 312,col 7)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "nbSteps"
      ],
      "begin_line": 314,
      "end_line": 314,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxError"
      ],
      "begin_line": 315,
      "end_line": 315,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pb"
      ],
      "begin_line": 316,
      "end_line": 316,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "VariableHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepHandler"
      ],
      "begin_line": 319,
      "end_line": 359,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.VariableHandler.VariableHandler()",
      "begin_line": 320,
      "end_line": 324,
      "comment": "",
      "child_ranges": [
        "(line 321,col 7)-(line 321,col 23)",
        "(line 322,col 7)-(line 322,col 18)",
        "(line 323,col 7)-(line 323,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.VariableHandler.requiresDenseOutput()",
      "begin_line": 325,
      "end_line": 327,
      "comment": "",
      "child_ranges": [
        "(line 326,col 7)-(line 326,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.VariableHandler.reset()",
      "begin_line": 328,
      "end_line": 332,
      "comment": "",
      "child_ranges": [
        "(line 329,col 7)-(line 329,col 23)",
        "(line 330,col 7)-(line 330,col 18)",
        "(line 331,col 7)-(line 331,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.VariableHandler.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 333,
      "end_line": 355,
      "comment": "",
      "child_ranges": [
        "(line 336,col 7)-(line 337,col 63)",
        "(line 338,col 7)-(line 349,col 7)",
        "(line 351,col 7)-(line 354,col 7)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "firstTime"
      ],
      "begin_line": 356,
      "end_line": 356,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "minStep"
      ],
      "begin_line": 357,
      "end_line": 357,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxStep"
      ],
      "begin_line": 358,
      "end_line": 358,
      "comment": ""
    }
  ]
}