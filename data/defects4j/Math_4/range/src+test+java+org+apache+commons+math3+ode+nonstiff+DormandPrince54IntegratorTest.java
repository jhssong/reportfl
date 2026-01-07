{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/ode/nonstiff/DormandPrince54IntegratorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DormandPrince54IntegratorTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 39,
      "end_line": 354,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest.testDimensionCheck()",
      "begin_line": 41,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 45,col 7)-(line 45,col 43)",
        "(line 46,col 7)-(line 47,col 93)",
        "(line 48,col 7)-(line 50,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest.testMinStep()",
      "begin_line": 53,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 58,col 7)-(line 58,col 43)",
        "(line 59,col 7)-(line 59,col 71)",
        "(line 60,col 7)-(line 60,col 63)",
        "(line 61,col 7)-(line 61,col 59)",
        "(line 62,col 7)-(line 62,col 59)",
        "(line 64,col 7)-(line 66,col 87)",
        "(line 67,col 7)-(line 67,col 69)",
        "(line 68,col 7)-(line 68,col 36)",
        "(line 69,col 7)-(line 71,col 72)",
        "(line 72,col 7)-(line 72,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest.testSmallLastStep()",
      "begin_line": 76,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 81,col 5)-(line 81,col 48)",
        "(line 82,col 5)-(line 82,col 26)",
        "(line 83,col 5)-(line 83,col 75)",
        "(line 84,col 5)-(line 84,col 42)",
        "(line 85,col 5)-(line 85,col 42)",
        "(line 87,col 5)-(line 90,col 59)",
        "(line 92,col 5)-(line 92,col 69)",
        "(line 93,col 5)-(line 93,col 34)",
        "(line 94,col 5)-(line 94,col 34)",
        "(line 95,col 5)-(line 97,col 70)",
        "(line 98,col 5)-(line 98,col 45)",
        "(line 99,col 5)-(line 99,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest.testBackward()",
      "begin_line": 103,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 108,col 7)-(line 108,col 43)",
        "(line 109,col 7)-(line 109,col 25)",
        "(line 110,col 7)-(line 110,col 63)",
        "(line 111,col 7)-(line 111,col 44)",
        "(line 112,col 7)-(line 112,col 66)",
        "(line 114,col 7)-(line 116,col 88)",
        "(line 117,col 7)-(line 117,col 69)",
        "(line 118,col 7)-(line 118,col 36)",
        "(line 119,col 7)-(line 120,col 72)",
        "(line 122,col 7)-(line 122,col 57)",
        "(line 123,col 7)-(line 123,col 65)",
        "(line 124,col 7)-(line 124,col 69)",
        "(line 125,col 7)-(line 125,col 66)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DP54SmallLastHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ode.sampling.StepHandler"
      ],
      "begin_line": 128,
      "end_line": 153,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest.DP54SmallLastHandler.DP54SmallLastHandler(double)",
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
      "signature": "org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest.DP54SmallLastHandler.init(double, double[], double)",
      "begin_line": 135,
      "end_line": 136,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest.DP54SmallLastHandler.handleStep(org.apache.commons.math3.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 138,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 139,col 7)-(line 143,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest.DP54SmallLastHandler.wasLastSeen()",
      "begin_line": 146,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 147,col 7)-(line 147,col 22)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "lastSeen"
      ],
      "begin_line": 150,
      "end_line": 150,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "minStep"
      ],
      "begin_line": 151,
      "end_line": 151,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest.testIncreasingTolerance()",
      "begin_line": 155,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 160,col 5)-(line 160,col 42)",
        "(line 161,col 5)-(line 194,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest.testEvents()",
      "begin_line": 198,
      "end_line": 231,
      "comment": "",
      "child_ranges": [
        "(line 203,col 5)-(line 203,col 41)",
        "(line 204,col 5)-(line 204,col 23)",
        "(line 205,col 5)-(line 205,col 61)",
        "(line 206,col 5)-(line 206,col 42)",
        "(line 207,col 5)-(line 207,col 64)",
        "(line 209,col 5)-(line 211,col 86)",
        "(line 212,col 5)-(line 212,col 67)",
        "(line 213,col 5)-(line 213,col 34)",
        "(line 214,col 5)-(line 214,col 54)",
        "(line 215,col 5)-(line 215,col 42)",
        "(line 216,col 5)-(line 219,col 5)",
        "(line 220,col 5)-(line 220,col 75)",
        "(line 221,col 5)-(line 223,col 70)",
        "(line 225,col 5)-(line 225,col 63)",
        "(line 226,col 5)-(line 226,col 71)",
        "(line 227,col 5)-(line 227,col 66)",
        "(line 228,col 5)-(line 228,col 31)",
        "(line 229,col 5)-(line 229,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest.testKepler()",
      "begin_line": 233,
      "end_line": 255,
      "comment": "",
      "child_ranges": [
        "(line 238,col 5)-(line 238,col 51)",
        "(line 239,col 5)-(line 239,col 23)",
        "(line 240,col 5)-(line 240,col 61)",
        "(line 241,col 5)-(line 241,col 42)",
        "(line 242,col 5)-(line 242,col 57)",
        "(line 244,col 5)-(line 246,col 86)",
        "(line 247,col 5)-(line 247,col 48)",
        "(line 248,col 5)-(line 250,col 70)",
        "(line 252,col 5)-(line 252,col 63)",
        "(line 253,col 5)-(line 253,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest.testVariableSteps()",
      "begin_line": 257,
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
        "(line 274,col 5)-(line 274,col 62)"
      ]
    },
    {
      "type": "class_interface",
      "name": "KeplerHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ode.sampling.StepHandler"
      ],
      "begin_line": 277,
      "end_line": 313,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "KeplerHandler(TestProblem3)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027TestProblem3\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 278,
      "end_line": 280,
      "comment": "",
      "child_ranges": [
        "(line 279,col 7)-(line 279,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest.KeplerHandler.init(double, double[], double)",
      "begin_line": 281,
      "end_line": 284,
      "comment": "",
      "child_ranges": [
        "(line 282,col 7)-(line 282,col 18)",
        "(line 283,col 7)-(line 283,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest.KeplerHandler.handleStep(org.apache.commons.math3.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 285,
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
        "org.apache.commons.math3.ode.sampling.StepHandler"
      ],
      "begin_line": 315,
      "end_line": 352,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest.VariableHandler.VariableHandler()",
      "begin_line": 316,
      "end_line": 320,
      "comment": "",
      "child_ranges": [
        "(line 317,col 7)-(line 317,col 23)",
        "(line 318,col 7)-(line 318,col 18)",
        "(line 319,col 7)-(line 319,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest.VariableHandler.init(double, double[], double)",
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
      "signature": "org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest.VariableHandler.handleStep(org.apache.commons.math3.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 326,
      "end_line": 348,
      "comment": "",
      "child_ranges": [
        "(line 329,col 7)-(line 330,col 63)",
        "(line 331,col 7)-(line 342,col 7)",
        "(line 344,col 7)-(line 347,col 7)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "firstTime"
      ],
      "begin_line": 349,
      "end_line": 349,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "minStep"
      ],
      "begin_line": 350,
      "end_line": 350,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxStep"
      ],
      "begin_line": 351,
      "end_line": 351,
      "comment": ""
    }
  ]
}