{
  "filepath": "/tmp/Math-99b/src/test/org/apache/commons/math/ode/nonstiff/DormandPrince54IntegratorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DormandPrince54IntegratorTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 31,
      "end_line": 363,
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
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testBackward()",
      "begin_line": 104,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 107,col 7)-(line 107,col 43)",
        "(line 108,col 7)-(line 108,col 25)",
        "(line 109,col 7)-(line 109,col 63)",
        "(line 110,col 7)-(line 110,col 44)",
        "(line 111,col 7)-(line 111,col 66)",
        "(line 113,col 7)-(line 115,col 88)",
        "(line 116,col 7)-(line 116,col 69)",
        "(line 117,col 7)-(line 117,col 36)",
        "(line 118,col 7)-(line 119,col 72)",
        "(line 121,col 7)-(line 121,col 50)",
        "(line 122,col 7)-(line 122,col 58)",
        "(line 123,col 7)-(line 123,col 62)",
        "(line 124,col 7)-(line 124,col 59)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DP54SmallLastHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepHandler"
      ],
      "begin_line": 127,
      "end_line": 158,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.DP54SmallLastHandler.DP54SmallLastHandler(double)",
      "begin_line": 131,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 132,col 7)-(line 132,col 23)",
        "(line 133,col 7)-(line 133,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.DP54SmallLastHandler.requiresDenseOutput()",
      "begin_line": 136,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 137,col 7)-(line 137,col 19)"
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
      "end_line": 198,
      "comment": "",
      "child_ranges": [
        "(line 163,col 5)-(line 163,col 42)",
        "(line 164,col 5)-(line 196,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testEvents()",
      "begin_line": 200,
      "end_line": 230,
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
        "(line 215,col 5)-(line 218,col 5)",
        "(line 219,col 5)-(line 219,col 68)",
        "(line 220,col 5)-(line 222,col 70)",
        "(line 224,col 5)-(line 224,col 56)",
        "(line 225,col 5)-(line 225,col 60)",
        "(line 226,col 5)-(line 226,col 64)",
        "(line 227,col 5)-(line 227,col 31)",
        "(line 228,col 5)-(line 228,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testKepler()",
      "begin_line": 232,
      "end_line": 251,
      "comment": "",
      "child_ranges": [
        "(line 235,col 5)-(line 235,col 51)",
        "(line 236,col 5)-(line 236,col 23)",
        "(line 237,col 5)-(line 237,col 61)",
        "(line 238,col 5)-(line 238,col 42)",
        "(line 239,col 5)-(line 239,col 57)",
        "(line 241,col 5)-(line 243,col 86)",
        "(line 244,col 5)-(line 244,col 48)",
        "(line 245,col 5)-(line 247,col 70)",
        "(line 249,col 5)-(line 249,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testVariableSteps()",
      "begin_line": 253,
      "end_line": 269,
      "comment": "",
      "child_ranges": [
        "(line 256,col 5)-(line 256,col 51)",
        "(line 257,col 5)-(line 257,col 23)",
        "(line 258,col 5)-(line 258,col 61)",
        "(line 259,col 5)-(line 259,col 42)",
        "(line 260,col 5)-(line 260,col 57)",
        "(line 262,col 5)-(line 264,col 86)",
        "(line 265,col 5)-(line 265,col 48)",
        "(line 266,col 5)-(line 267,col 88)",
        "(line 268,col 5)-(line 268,col 55)"
      ]
    },
    {
      "type": "class_interface",
      "name": "KeplerHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepHandler"
      ],
      "begin_line": 271,
      "end_line": 314,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 272,
      "end_line": 272,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "KeplerHandler(TestProblem3)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027TestProblem3\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 274,
      "end_line": 277,
      "comment": "",
      "child_ranges": [
        "(line 275,col 7)-(line 275,col 19)",
        "(line 276,col 7)-(line 276,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.KeplerHandler.requiresDenseOutput()",
      "begin_line": 278,
      "end_line": 280,
      "comment": "",
      "child_ranges": [
        "(line 279,col 7)-(line 279,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.KeplerHandler.reset()",
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
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.KeplerHandler.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 285,
      "end_line": 310,
      "comment": "",
      "child_ranges": [
        "(line 289,col 7)-(line 289,col 16)",
        "(line 290,col 7)-(line 305,col 7)",
        "(line 306,col 7)-(line 309,col 7)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "nbSteps"
      ],
      "begin_line": 311,
      "end_line": 311,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxError"
      ],
      "begin_line": 312,
      "end_line": 312,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pb"
      ],
      "begin_line": 313,
      "end_line": 313,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "VariableHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepHandler"
      ],
      "begin_line": 316,
      "end_line": 357,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 317,
      "end_line": 317,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.VariableHandler.VariableHandler()",
      "begin_line": 318,
      "end_line": 322,
      "comment": "",
      "child_ranges": [
        "(line 319,col 7)-(line 319,col 23)",
        "(line 320,col 7)-(line 320,col 18)",
        "(line 321,col 7)-(line 321,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.VariableHandler.requiresDenseOutput()",
      "begin_line": 323,
      "end_line": 325,
      "comment": "",
      "child_ranges": [
        "(line 324,col 7)-(line 324,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.VariableHandler.reset()",
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
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.VariableHandler.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 331,
      "end_line": 353,
      "comment": "",
      "child_ranges": [
        "(line 334,col 7)-(line 335,col 63)",
        "(line 336,col 7)-(line 347,col 7)",
        "(line 349,col 7)-(line 352,col 7)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "firstTime"
      ],
      "begin_line": 354,
      "end_line": 354,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "minStep"
      ],
      "begin_line": 355,
      "end_line": 355,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxStep"
      ],
      "begin_line": 356,
      "end_line": 356,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.suite()",
      "begin_line": 359,
      "end_line": 361,
      "comment": "",
      "child_ranges": [
        "(line 360,col 5)-(line 360,col 62)"
      ]
    }
  ]
}