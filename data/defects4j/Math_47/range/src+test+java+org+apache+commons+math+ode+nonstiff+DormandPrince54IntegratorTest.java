{
  "filepath": "/tmp/Math-47b/src/test/java/org/apache/commons/math/ode/nonstiff/DormandPrince54IntegratorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DormandPrince54IntegratorTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 38,
      "end_line": 345,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testDimensionCheck()",
      "begin_line": 40,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 42,col 7)-(line 42,col 43)",
        "(line 43,col 7)-(line 44,col 93)",
        "(line 45,col 7)-(line 47,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testMinStep()",
      "begin_line": 50,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 53,col 7)-(line 53,col 43)",
        "(line 54,col 7)-(line 54,col 71)",
        "(line 55,col 7)-(line 55,col 63)",
        "(line 56,col 7)-(line 56,col 59)",
        "(line 57,col 7)-(line 57,col 59)",
        "(line 59,col 7)-(line 61,col 87)",
        "(line 62,col 7)-(line 62,col 69)",
        "(line 63,col 7)-(line 63,col 36)",
        "(line 64,col 7)-(line 66,col 72)",
        "(line 67,col 7)-(line 67,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testSmallLastStep()",
      "begin_line": 71,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 75,col 5)-(line 75,col 48)",
        "(line 76,col 5)-(line 76,col 26)",
        "(line 77,col 5)-(line 77,col 75)",
        "(line 78,col 5)-(line 78,col 42)",
        "(line 79,col 5)-(line 79,col 42)",
        "(line 81,col 5)-(line 84,col 59)",
        "(line 86,col 5)-(line 86,col 69)",
        "(line 87,col 5)-(line 87,col 34)",
        "(line 88,col 5)-(line 88,col 34)",
        "(line 89,col 5)-(line 91,col 70)",
        "(line 92,col 5)-(line 92,col 45)",
        "(line 93,col 5)-(line 93,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testBackward()",
      "begin_line": 97,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 101,col 7)-(line 101,col 43)",
        "(line 102,col 7)-(line 102,col 25)",
        "(line 103,col 7)-(line 103,col 63)",
        "(line 104,col 7)-(line 104,col 44)",
        "(line 105,col 7)-(line 105,col 66)",
        "(line 107,col 7)-(line 109,col 88)",
        "(line 110,col 7)-(line 110,col 69)",
        "(line 111,col 7)-(line 111,col 36)",
        "(line 112,col 7)-(line 113,col 72)",
        "(line 115,col 7)-(line 115,col 57)",
        "(line 116,col 7)-(line 116,col 65)",
        "(line 117,col 7)-(line 117,col 69)",
        "(line 118,col 7)-(line 118,col 66)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DP54SmallLastHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepHandler"
      ],
      "begin_line": 121,
      "end_line": 146,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.DP54SmallLastHandler.DP54SmallLastHandler(double)",
      "begin_line": 123,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 124,col 7)-(line 124,col 23)",
        "(line 125,col 7)-(line 125,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.DP54SmallLastHandler.reset()",
      "begin_line": 128,
      "end_line": 129,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.DP54SmallLastHandler.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 131,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 132,col 7)-(line 136,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.DP54SmallLastHandler.wasLastSeen()",
      "begin_line": 139,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 140,col 7)-(line 140,col 22)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "lastSeen"
      ],
      "begin_line": 143,
      "end_line": 143,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "minStep"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testIncreasingTolerance()",
      "begin_line": 148,
      "end_line": 188,
      "comment": "",
      "child_ranges": [
        "(line 152,col 5)-(line 152,col 42)",
        "(line 153,col 5)-(line 186,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testEvents()",
      "begin_line": 190,
      "end_line": 222,
      "comment": "",
      "child_ranges": [
        "(line 194,col 5)-(line 194,col 41)",
        "(line 195,col 5)-(line 195,col 23)",
        "(line 196,col 5)-(line 196,col 61)",
        "(line 197,col 5)-(line 197,col 42)",
        "(line 198,col 5)-(line 198,col 64)",
        "(line 200,col 5)-(line 202,col 86)",
        "(line 203,col 5)-(line 203,col 67)",
        "(line 204,col 5)-(line 204,col 34)",
        "(line 205,col 5)-(line 205,col 54)",
        "(line 206,col 5)-(line 206,col 42)",
        "(line 207,col 5)-(line 210,col 5)",
        "(line 211,col 5)-(line 211,col 75)",
        "(line 212,col 5)-(line 214,col 70)",
        "(line 216,col 5)-(line 216,col 63)",
        "(line 217,col 5)-(line 217,col 71)",
        "(line 218,col 5)-(line 218,col 66)",
        "(line 219,col 5)-(line 219,col 31)",
        "(line 220,col 5)-(line 220,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testKepler()",
      "begin_line": 224,
      "end_line": 245,
      "comment": "",
      "child_ranges": [
        "(line 228,col 5)-(line 228,col 51)",
        "(line 229,col 5)-(line 229,col 23)",
        "(line 230,col 5)-(line 230,col 61)",
        "(line 231,col 5)-(line 231,col 42)",
        "(line 232,col 5)-(line 232,col 57)",
        "(line 234,col 5)-(line 236,col 86)",
        "(line 237,col 5)-(line 237,col 48)",
        "(line 238,col 5)-(line 240,col 70)",
        "(line 242,col 5)-(line 242,col 63)",
        "(line 243,col 5)-(line 243,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.testVariableSteps()",
      "begin_line": 247,
      "end_line": 264,
      "comment": "",
      "child_ranges": [
        "(line 251,col 5)-(line 251,col 51)",
        "(line 252,col 5)-(line 252,col 23)",
        "(line 253,col 5)-(line 253,col 61)",
        "(line 254,col 5)-(line 254,col 42)",
        "(line 255,col 5)-(line 255,col 57)",
        "(line 257,col 5)-(line 259,col 86)",
        "(line 260,col 5)-(line 260,col 48)",
        "(line 261,col 5)-(line 262,col 88)",
        "(line 263,col 5)-(line 263,col 62)"
      ]
    },
    {
      "type": "class_interface",
      "name": "KeplerHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepHandler"
      ],
      "begin_line": 266,
      "end_line": 304,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "KeplerHandler(TestProblem3)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027TestProblem3\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 267,
      "end_line": 270,
      "comment": "",
      "child_ranges": [
        "(line 268,col 7)-(line 268,col 19)",
        "(line 269,col 7)-(line 269,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.KeplerHandler.reset()",
      "begin_line": 271,
      "end_line": 274,
      "comment": "",
      "child_ranges": [
        "(line 272,col 7)-(line 272,col 18)",
        "(line 273,col 7)-(line 273,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.KeplerHandler.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 275,
      "end_line": 300,
      "comment": "",
      "child_ranges": [
        "(line 279,col 7)-(line 279,col 16)",
        "(line 280,col 7)-(line 295,col 7)",
        "(line 296,col 7)-(line 299,col 7)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "nbSteps"
      ],
      "begin_line": 301,
      "end_line": 301,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxError"
      ],
      "begin_line": 302,
      "end_line": 302,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pb"
      ],
      "begin_line": 303,
      "end_line": 303,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "VariableHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepHandler"
      ],
      "begin_line": 306,
      "end_line": 343,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.VariableHandler.VariableHandler()",
      "begin_line": 307,
      "end_line": 311,
      "comment": "",
      "child_ranges": [
        "(line 308,col 7)-(line 308,col 23)",
        "(line 309,col 7)-(line 309,col 18)",
        "(line 310,col 7)-(line 310,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.VariableHandler.reset()",
      "begin_line": 312,
      "end_line": 316,
      "comment": "",
      "child_ranges": [
        "(line 313,col 7)-(line 313,col 23)",
        "(line 314,col 7)-(line 314,col 18)",
        "(line 315,col 7)-(line 315,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54IntegratorTest.VariableHandler.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 317,
      "end_line": 339,
      "comment": "",
      "child_ranges": [
        "(line 320,col 7)-(line 321,col 63)",
        "(line 322,col 7)-(line 333,col 7)",
        "(line 335,col 7)-(line 338,col 7)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "firstTime"
      ],
      "begin_line": 340,
      "end_line": 340,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "minStep"
      ],
      "begin_line": 341,
      "end_line": 341,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxStep"
      ],
      "begin_line": 342,
      "end_line": 342,
      "comment": ""
    }
  ]
}