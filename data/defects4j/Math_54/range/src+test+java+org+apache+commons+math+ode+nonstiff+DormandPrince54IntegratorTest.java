{
  "filepath": "/tmp/Math-54b/src/test/java/org/apache/commons/math/ode/nonstiff/DormandPrince54IntegratorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DormandPrince54IntegratorTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 39,
      "end_line": 367,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testDimensionCheck()",
      "begin_line": 41,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 43,col 5)-(line 54,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testMinStep()",
      "begin_line": 57,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 60,col 5)-(line 79,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testSmallLastStep()",
      "begin_line": 83,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 87,col 5)-(line 87,col 48)",
        "(line 88,col 5)-(line 88,col 26)",
        "(line 89,col 5)-(line 89,col 75)",
        "(line 90,col 5)-(line 90,col 42)",
        "(line 91,col 5)-(line 91,col 42)",
        "(line 93,col 5)-(line 96,col 59)",
        "(line 98,col 5)-(line 98,col 69)",
        "(line 99,col 5)-(line 99,col 34)",
        "(line 100,col 5)-(line 100,col 34)",
        "(line 101,col 5)-(line 103,col 70)",
        "(line 104,col 5)-(line 104,col 45)",
        "(line 105,col 5)-(line 105,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testBackward()",
      "begin_line": 109,
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
        "(line 127,col 7)-(line 127,col 57)",
        "(line 128,col 7)-(line 128,col 65)",
        "(line 129,col 7)-(line 129,col 69)",
        "(line 130,col 7)-(line 130,col 66)"
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
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 168,col 5)-(line 168,col 42)",
        "(line 169,col 5)-(line 202,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testEvents()",
      "begin_line": 206,
      "end_line": 238,
      "comment": "",
      "child_ranges": [
        "(line 210,col 5)-(line 210,col 41)",
        "(line 211,col 5)-(line 211,col 23)",
        "(line 212,col 5)-(line 212,col 61)",
        "(line 213,col 5)-(line 213,col 42)",
        "(line 214,col 5)-(line 214,col 64)",
        "(line 216,col 5)-(line 218,col 86)",
        "(line 219,col 5)-(line 219,col 67)",
        "(line 220,col 5)-(line 220,col 34)",
        "(line 221,col 5)-(line 221,col 54)",
        "(line 222,col 5)-(line 222,col 42)",
        "(line 223,col 5)-(line 226,col 5)",
        "(line 227,col 5)-(line 227,col 75)",
        "(line 228,col 5)-(line 230,col 70)",
        "(line 232,col 5)-(line 232,col 63)",
        "(line 233,col 5)-(line 233,col 71)",
        "(line 234,col 5)-(line 234,col 66)",
        "(line 235,col 5)-(line 235,col 31)",
        "(line 236,col 5)-(line 236,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testKepler()",
      "begin_line": 240,
      "end_line": 261,
      "comment": "",
      "child_ranges": [
        "(line 244,col 5)-(line 244,col 51)",
        "(line 245,col 5)-(line 245,col 23)",
        "(line 246,col 5)-(line 246,col 61)",
        "(line 247,col 5)-(line 247,col 42)",
        "(line 248,col 5)-(line 248,col 57)",
        "(line 250,col 5)-(line 252,col 86)",
        "(line 253,col 5)-(line 253,col 48)",
        "(line 254,col 5)-(line 256,col 70)",
        "(line 258,col 5)-(line 258,col 63)",
        "(line 259,col 5)-(line 259,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testVariableSteps()",
      "begin_line": 263,
      "end_line": 280,
      "comment": "",
      "child_ranges": [
        "(line 267,col 5)-(line 267,col 51)",
        "(line 268,col 5)-(line 268,col 23)",
        "(line 269,col 5)-(line 269,col 61)",
        "(line 270,col 5)-(line 270,col 42)",
        "(line 271,col 5)-(line 271,col 57)",
        "(line 273,col 5)-(line 275,col 86)",
        "(line 276,col 5)-(line 276,col 48)",
        "(line 277,col 5)-(line 278,col 88)",
        "(line 279,col 5)-(line 279,col 62)"
      ]
    },
    {
      "type": "class_interface",
      "name": "KeplerHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepHandler"
      ],
      "begin_line": 282,
      "end_line": 323,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "KeplerHandler(TestProblem3)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027TestProblem3\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 283,
      "end_line": 286,
      "comment": "",
      "child_ranges": [
        "(line 284,col 7)-(line 284,col 19)",
        "(line 285,col 7)-(line 285,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.KeplerHandler.requiresDenseOutput()",
      "begin_line": 287,
      "end_line": 289,
      "comment": "",
      "child_ranges": [
        "(line 288,col 7)-(line 288,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.KeplerHandler.reset()",
      "begin_line": 290,
      "end_line": 293,
      "comment": "",
      "child_ranges": [
        "(line 291,col 7)-(line 291,col 18)",
        "(line 292,col 7)-(line 292,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.KeplerHandler.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 294,
      "end_line": 319,
      "comment": "",
      "child_ranges": [
        "(line 298,col 7)-(line 298,col 16)",
        "(line 299,col 7)-(line 314,col 7)",
        "(line 315,col 7)-(line 318,col 7)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "nbSteps"
      ],
      "begin_line": 320,
      "end_line": 320,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxError"
      ],
      "begin_line": 321,
      "end_line": 321,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pb"
      ],
      "begin_line": 322,
      "end_line": 322,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "VariableHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepHandler"
      ],
      "begin_line": 325,
      "end_line": 365,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.VariableHandler.VariableHandler()",
      "begin_line": 326,
      "end_line": 330,
      "comment": "",
      "child_ranges": [
        "(line 327,col 7)-(line 327,col 23)",
        "(line 328,col 7)-(line 328,col 18)",
        "(line 329,col 7)-(line 329,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.VariableHandler.requiresDenseOutput()",
      "begin_line": 331,
      "end_line": 333,
      "comment": "",
      "child_ranges": [
        "(line 332,col 7)-(line 332,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.VariableHandler.reset()",
      "begin_line": 334,
      "end_line": 338,
      "comment": "",
      "child_ranges": [
        "(line 335,col 7)-(line 335,col 23)",
        "(line 336,col 7)-(line 336,col 18)",
        "(line 337,col 7)-(line 337,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.VariableHandler.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 339,
      "end_line": 361,
      "comment": "",
      "child_ranges": [
        "(line 342,col 7)-(line 343,col 63)",
        "(line 344,col 7)-(line 355,col 7)",
        "(line 357,col 7)-(line 360,col 7)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "firstTime"
      ],
      "begin_line": 362,
      "end_line": 362,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "minStep"
      ],
      "begin_line": 363,
      "end_line": 363,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxStep"
      ],
      "begin_line": 364,
      "end_line": 364,
      "comment": ""
    }
  ]
}