{
  "filepath": "/tmp/Math-26b/src/test/java/org/apache/commons/math3/ode/nonstiff/DormandPrince54IntegratorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DormandPrince54IntegratorTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 37,
      "end_line": 341,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest.testDimensionCheck()",
      "begin_line": 39,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 41,col 7)-(line 41,col 43)",
        "(line 42,col 7)-(line 43,col 93)",
        "(line 44,col 7)-(line 46,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest.testMinStep()",
      "begin_line": 49,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 52,col 7)-(line 52,col 43)",
        "(line 53,col 7)-(line 53,col 71)",
        "(line 54,col 7)-(line 54,col 63)",
        "(line 55,col 7)-(line 55,col 59)",
        "(line 56,col 7)-(line 56,col 59)",
        "(line 58,col 7)-(line 60,col 87)",
        "(line 61,col 7)-(line 61,col 69)",
        "(line 62,col 7)-(line 62,col 36)",
        "(line 63,col 7)-(line 65,col 72)",
        "(line 66,col 7)-(line 66,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest.testSmallLastStep()",
      "begin_line": 70,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 74,col 5)-(line 74,col 48)",
        "(line 75,col 5)-(line 75,col 26)",
        "(line 76,col 5)-(line 76,col 75)",
        "(line 77,col 5)-(line 77,col 42)",
        "(line 78,col 5)-(line 78,col 42)",
        "(line 80,col 5)-(line 83,col 59)",
        "(line 85,col 5)-(line 85,col 69)",
        "(line 86,col 5)-(line 86,col 34)",
        "(line 87,col 5)-(line 87,col 34)",
        "(line 88,col 5)-(line 90,col 70)",
        "(line 91,col 5)-(line 91,col 45)",
        "(line 92,col 5)-(line 92,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest.testBackward()",
      "begin_line": 96,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 100,col 7)-(line 100,col 43)",
        "(line 101,col 7)-(line 101,col 25)",
        "(line 102,col 7)-(line 102,col 63)",
        "(line 103,col 7)-(line 103,col 44)",
        "(line 104,col 7)-(line 104,col 66)",
        "(line 106,col 7)-(line 108,col 88)",
        "(line 109,col 7)-(line 109,col 69)",
        "(line 110,col 7)-(line 110,col 36)",
        "(line 111,col 7)-(line 112,col 72)",
        "(line 114,col 7)-(line 114,col 57)",
        "(line 115,col 7)-(line 115,col 65)",
        "(line 116,col 7)-(line 116,col 69)",
        "(line 117,col 7)-(line 117,col 66)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DP54SmallLastHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ode.sampling.StepHandler"
      ],
      "begin_line": 120,
      "end_line": 145,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest.DP54SmallLastHandler.DP54SmallLastHandler(double)",
      "begin_line": 122,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 123,col 7)-(line 123,col 23)",
        "(line 124,col 7)-(line 124,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest.DP54SmallLastHandler.init(double, double[], double)",
      "begin_line": 127,
      "end_line": 128,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest.DP54SmallLastHandler.handleStep(org.apache.commons.math3.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 130,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 131,col 7)-(line 135,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest.DP54SmallLastHandler.wasLastSeen()",
      "begin_line": 138,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 139,col 7)-(line 139,col 22)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "lastSeen"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "minStep"
      ],
      "begin_line": 143,
      "end_line": 143,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest.testIncreasingTolerance()",
      "begin_line": 147,
      "end_line": 187,
      "comment": "",
      "child_ranges": [
        "(line 151,col 5)-(line 151,col 42)",
        "(line 152,col 5)-(line 185,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest.testEvents()",
      "begin_line": 189,
      "end_line": 221,
      "comment": "",
      "child_ranges": [
        "(line 193,col 5)-(line 193,col 41)",
        "(line 194,col 5)-(line 194,col 23)",
        "(line 195,col 5)-(line 195,col 61)",
        "(line 196,col 5)-(line 196,col 42)",
        "(line 197,col 5)-(line 197,col 64)",
        "(line 199,col 5)-(line 201,col 86)",
        "(line 202,col 5)-(line 202,col 67)",
        "(line 203,col 5)-(line 203,col 34)",
        "(line 204,col 5)-(line 204,col 54)",
        "(line 205,col 5)-(line 205,col 42)",
        "(line 206,col 5)-(line 209,col 5)",
        "(line 210,col 5)-(line 210,col 75)",
        "(line 211,col 5)-(line 213,col 70)",
        "(line 215,col 5)-(line 215,col 63)",
        "(line 216,col 5)-(line 216,col 71)",
        "(line 217,col 5)-(line 217,col 66)",
        "(line 218,col 5)-(line 218,col 31)",
        "(line 219,col 5)-(line 219,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest.testKepler()",
      "begin_line": 223,
      "end_line": 244,
      "comment": "",
      "child_ranges": [
        "(line 227,col 5)-(line 227,col 51)",
        "(line 228,col 5)-(line 228,col 23)",
        "(line 229,col 5)-(line 229,col 61)",
        "(line 230,col 5)-(line 230,col 42)",
        "(line 231,col 5)-(line 231,col 57)",
        "(line 233,col 5)-(line 235,col 86)",
        "(line 236,col 5)-(line 236,col 48)",
        "(line 237,col 5)-(line 239,col 70)",
        "(line 241,col 5)-(line 241,col 63)",
        "(line 242,col 5)-(line 242,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest.testVariableSteps()",
      "begin_line": 246,
      "end_line": 263,
      "comment": "",
      "child_ranges": [
        "(line 250,col 5)-(line 250,col 51)",
        "(line 251,col 5)-(line 251,col 23)",
        "(line 252,col 5)-(line 252,col 61)",
        "(line 253,col 5)-(line 253,col 42)",
        "(line 254,col 5)-(line 254,col 57)",
        "(line 256,col 5)-(line 258,col 86)",
        "(line 259,col 5)-(line 259,col 48)",
        "(line 260,col 5)-(line 261,col 88)",
        "(line 262,col 5)-(line 262,col 62)"
      ]
    },
    {
      "type": "class_interface",
      "name": "KeplerHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ode.sampling.StepHandler"
      ],
      "begin_line": 265,
      "end_line": 300,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "KeplerHandler(TestProblem3)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027TestProblem3\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 266,
      "end_line": 268,
      "comment": "",
      "child_ranges": [
        "(line 267,col 7)-(line 267,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest.KeplerHandler.init(double, double[], double)",
      "begin_line": 269,
      "end_line": 272,
      "comment": "",
      "child_ranges": [
        "(line 270,col 7)-(line 270,col 18)",
        "(line 271,col 7)-(line 271,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest.KeplerHandler.handleStep(org.apache.commons.math3.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 273,
      "end_line": 296,
      "comment": "",
      "child_ranges": [
        "(line 275,col 7)-(line 275,col 16)",
        "(line 276,col 7)-(line 291,col 7)",
        "(line 292,col 7)-(line 295,col 7)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "nbSteps"
      ],
      "begin_line": 297,
      "end_line": 297,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxError"
      ],
      "begin_line": 298,
      "end_line": 298,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pb"
      ],
      "begin_line": 299,
      "end_line": 299,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "VariableHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ode.sampling.StepHandler"
      ],
      "begin_line": 302,
      "end_line": 339,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest.VariableHandler.VariableHandler()",
      "begin_line": 303,
      "end_line": 307,
      "comment": "",
      "child_ranges": [
        "(line 304,col 7)-(line 304,col 23)",
        "(line 305,col 7)-(line 305,col 18)",
        "(line 306,col 7)-(line 306,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest.VariableHandler.init(double, double[], double)",
      "begin_line": 308,
      "end_line": 312,
      "comment": "",
      "child_ranges": [
        "(line 309,col 7)-(line 309,col 23)",
        "(line 310,col 7)-(line 310,col 18)",
        "(line 311,col 7)-(line 311,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest.VariableHandler.handleStep(org.apache.commons.math3.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 313,
      "end_line": 335,
      "comment": "",
      "child_ranges": [
        "(line 316,col 7)-(line 317,col 63)",
        "(line 318,col 7)-(line 329,col 7)",
        "(line 331,col 7)-(line 334,col 7)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "firstTime"
      ],
      "begin_line": 336,
      "end_line": 336,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "minStep"
      ],
      "begin_line": 337,
      "end_line": 337,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxStep"
      ],
      "begin_line": 338,
      "end_line": 338,
      "comment": ""
    }
  ]
}