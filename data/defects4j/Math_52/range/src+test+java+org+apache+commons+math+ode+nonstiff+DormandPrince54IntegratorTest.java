{
  "filepath": "/tmp/Math-52b/src/test/java/org/apache/commons/math/ode/nonstiff/DormandPrince54IntegratorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DormandPrince54IntegratorTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 39,
      "end_line": 357,
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
      "end_line": 158,
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
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.DP54SmallLastHandler.reset()",
      "begin_line": 140,
      "end_line": 141,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.DP54SmallLastHandler.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 143,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 144,col 7)-(line 148,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.DP54SmallLastHandler.wasLastSeen()",
      "begin_line": 151,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 152,col 7)-(line 152,col 22)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "lastSeen"
      ],
      "begin_line": 155,
      "end_line": 155,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "minStep"
      ],
      "begin_line": 156,
      "end_line": 156,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testIncreasingTolerance()",
      "begin_line": 160,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 164,col 5)-(line 164,col 42)",
        "(line 165,col 5)-(line 198,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testEvents()",
      "begin_line": 202,
      "end_line": 234,
      "comment": "",
      "child_ranges": [
        "(line 206,col 5)-(line 206,col 41)",
        "(line 207,col 5)-(line 207,col 23)",
        "(line 208,col 5)-(line 208,col 61)",
        "(line 209,col 5)-(line 209,col 42)",
        "(line 210,col 5)-(line 210,col 64)",
        "(line 212,col 5)-(line 214,col 86)",
        "(line 215,col 5)-(line 215,col 67)",
        "(line 216,col 5)-(line 216,col 34)",
        "(line 217,col 5)-(line 217,col 54)",
        "(line 218,col 5)-(line 218,col 42)",
        "(line 219,col 5)-(line 222,col 5)",
        "(line 223,col 5)-(line 223,col 75)",
        "(line 224,col 5)-(line 226,col 70)",
        "(line 228,col 5)-(line 228,col 63)",
        "(line 229,col 5)-(line 229,col 71)",
        "(line 230,col 5)-(line 230,col 66)",
        "(line 231,col 5)-(line 231,col 31)",
        "(line 232,col 5)-(line 232,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testKepler()",
      "begin_line": 236,
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
        "(line 254,col 5)-(line 254,col 63)",
        "(line 255,col 5)-(line 255,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testVariableSteps()",
      "begin_line": 259,
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
        "(line 275,col 5)-(line 275,col 62)"
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
      "end_line": 316,
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
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.KeplerHandler.reset()",
      "begin_line": 283,
      "end_line": 286,
      "comment": "",
      "child_ranges": [
        "(line 284,col 7)-(line 284,col 18)",
        "(line 285,col 7)-(line 285,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.KeplerHandler.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 287,
      "end_line": 312,
      "comment": "",
      "child_ranges": [
        "(line 291,col 7)-(line 291,col 16)",
        "(line 292,col 7)-(line 307,col 7)",
        "(line 308,col 7)-(line 311,col 7)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "nbSteps"
      ],
      "begin_line": 313,
      "end_line": 313,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxError"
      ],
      "begin_line": 314,
      "end_line": 314,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pb"
      ],
      "begin_line": 315,
      "end_line": 315,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "VariableHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepHandler"
      ],
      "begin_line": 318,
      "end_line": 355,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.VariableHandler.VariableHandler()",
      "begin_line": 319,
      "end_line": 323,
      "comment": "",
      "child_ranges": [
        "(line 320,col 7)-(line 320,col 23)",
        "(line 321,col 7)-(line 321,col 18)",
        "(line 322,col 7)-(line 322,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.VariableHandler.reset()",
      "begin_line": 324,
      "end_line": 328,
      "comment": "",
      "child_ranges": [
        "(line 325,col 7)-(line 325,col 23)",
        "(line 326,col 7)-(line 326,col 18)",
        "(line 327,col 7)-(line 327,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.VariableHandler.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 329,
      "end_line": 351,
      "comment": "",
      "child_ranges": [
        "(line 332,col 7)-(line 333,col 63)",
        "(line 334,col 7)-(line 345,col 7)",
        "(line 347,col 7)-(line 350,col 7)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "firstTime"
      ],
      "begin_line": 352,
      "end_line": 352,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "minStep"
      ],
      "begin_line": 353,
      "end_line": 353,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxStep"
      ],
      "begin_line": 354,
      "end_line": 354,
      "comment": ""
    }
  ]
}