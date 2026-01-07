{
  "filepath": "/tmp/Math-100b/src/test/org/apache/commons/math/ode/DormandPrince54IntegratorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DormandPrince54IntegratorTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 31,
      "end_line": 332,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.DormandPrince54IntegratorTest.DormandPrince54IntegratorTest(java.lang.String)",
      "begin_line": 34,
      "end_line": 36,
      "comment": "",
      "child_ranges": [
        "(line 35,col 5)-(line 35,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54IntegratorTest.testDimensionCheck()",
      "begin_line": 38,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 39,col 5)-(line 50,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54IntegratorTest.testMinStep()",
      "begin_line": 53,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 56,col 5)-(line 75,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54IntegratorTest.testSmallLastStep()",
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
      "type": "class_interface",
      "name": "DP54SmallLastHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.StepHandler"
      ],
      "begin_line": 104,
      "end_line": 133,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.DormandPrince54IntegratorTest.DP54SmallLastHandler.DP54SmallLastHandler(double)",
      "begin_line": 106,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 107,col 7)-(line 107,col 23)",
        "(line 108,col 7)-(line 108,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54IntegratorTest.DP54SmallLastHandler.requiresDenseOutput()",
      "begin_line": 111,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 112,col 7)-(line 112,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54IntegratorTest.DP54SmallLastHandler.reset()",
      "begin_line": 115,
      "end_line": 116,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54IntegratorTest.DP54SmallLastHandler.handleStep(org.apache.commons.math.ode.StepInterpolator, boolean)",
      "begin_line": 118,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 119,col 7)-(line 123,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54IntegratorTest.DP54SmallLastHandler.wasLastSeen()",
      "begin_line": 126,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 127,col 7)-(line 127,col 22)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "lastSeen"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "minStep"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54IntegratorTest.testIncreasingTolerance()",
      "begin_line": 135,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 138,col 5)-(line 138,col 42)",
        "(line 139,col 5)-(line 171,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54IntegratorTest.testSwitchingFunctions()",
      "begin_line": 175,
      "end_line": 202,
      "comment": "",
      "child_ranges": [
        "(line 178,col 5)-(line 178,col 41)",
        "(line 179,col 5)-(line 179,col 23)",
        "(line 180,col 5)-(line 180,col 61)",
        "(line 181,col 5)-(line 181,col 42)",
        "(line 182,col 5)-(line 182,col 64)",
        "(line 184,col 5)-(line 186,col 86)",
        "(line 187,col 5)-(line 187,col 67)",
        "(line 188,col 5)-(line 188,col 34)",
        "(line 189,col 5)-(line 189,col 63)",
        "(line 190,col 5)-(line 193,col 5)",
        "(line 194,col 5)-(line 196,col 70)",
        "(line 198,col 5)-(line 198,col 56)",
        "(line 199,col 5)-(line 199,col 60)",
        "(line 200,col 5)-(line 200,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54IntegratorTest.testKepler()",
      "begin_line": 204,
      "end_line": 223,
      "comment": "",
      "child_ranges": [
        "(line 207,col 5)-(line 207,col 51)",
        "(line 208,col 5)-(line 208,col 23)",
        "(line 209,col 5)-(line 209,col 61)",
        "(line 210,col 5)-(line 210,col 42)",
        "(line 211,col 5)-(line 211,col 57)",
        "(line 213,col 5)-(line 215,col 86)",
        "(line 216,col 5)-(line 216,col 48)",
        "(line 217,col 5)-(line 219,col 70)",
        "(line 221,col 5)-(line 221,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54IntegratorTest.testVariableSteps()",
      "begin_line": 225,
      "end_line": 241,
      "comment": "",
      "child_ranges": [
        "(line 228,col 5)-(line 228,col 51)",
        "(line 229,col 5)-(line 229,col 23)",
        "(line 230,col 5)-(line 230,col 61)",
        "(line 231,col 5)-(line 231,col 42)",
        "(line 232,col 5)-(line 232,col 57)",
        "(line 234,col 5)-(line 236,col 86)",
        "(line 237,col 5)-(line 237,col 48)",
        "(line 238,col 5)-(line 240,col 70)"
      ]
    },
    {
      "type": "class_interface",
      "name": "KeplerHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.StepHandler"
      ],
      "begin_line": 243,
      "end_line": 284,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "KeplerHandler(TestProblem3)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027TestProblem3\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 244,
      "end_line": 247,
      "comment": "",
      "child_ranges": [
        "(line 245,col 7)-(line 245,col 19)",
        "(line 246,col 7)-(line 246,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54IntegratorTest.KeplerHandler.requiresDenseOutput()",
      "begin_line": 248,
      "end_line": 250,
      "comment": "",
      "child_ranges": [
        "(line 249,col 7)-(line 249,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54IntegratorTest.KeplerHandler.reset()",
      "begin_line": 251,
      "end_line": 254,
      "comment": "",
      "child_ranges": [
        "(line 252,col 7)-(line 252,col 18)",
        "(line 253,col 7)-(line 253,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54IntegratorTest.KeplerHandler.handleStep(org.apache.commons.math.ode.StepInterpolator, boolean)",
      "begin_line": 255,
      "end_line": 280,
      "comment": "",
      "child_ranges": [
        "(line 259,col 7)-(line 259,col 16)",
        "(line 260,col 7)-(line 275,col 7)",
        "(line 276,col 7)-(line 279,col 7)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "nbSteps"
      ],
      "begin_line": 281,
      "end_line": 281,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxError"
      ],
      "begin_line": 282,
      "end_line": 282,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pb"
      ],
      "begin_line": 283,
      "end_line": 283,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "VariableHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.StepHandler"
      ],
      "begin_line": 286,
      "end_line": 326,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.DormandPrince54IntegratorTest.VariableHandler.VariableHandler()",
      "begin_line": 287,
      "end_line": 291,
      "comment": "",
      "child_ranges": [
        "(line 288,col 7)-(line 288,col 23)",
        "(line 289,col 7)-(line 289,col 18)",
        "(line 290,col 7)-(line 290,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54IntegratorTest.VariableHandler.requiresDenseOutput()",
      "begin_line": 292,
      "end_line": 294,
      "comment": "",
      "child_ranges": [
        "(line 293,col 7)-(line 293,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54IntegratorTest.VariableHandler.reset()",
      "begin_line": 295,
      "end_line": 299,
      "comment": "",
      "child_ranges": [
        "(line 296,col 7)-(line 296,col 23)",
        "(line 297,col 7)-(line 297,col 18)",
        "(line 298,col 7)-(line 298,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54IntegratorTest.VariableHandler.handleStep(org.apache.commons.math.ode.StepInterpolator, boolean)",
      "begin_line": 300,
      "end_line": 322,
      "comment": "",
      "child_ranges": [
        "(line 303,col 7)-(line 304,col 63)",
        "(line 305,col 7)-(line 316,col 7)",
        "(line 318,col 7)-(line 321,col 7)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "firstTime"
      ],
      "begin_line": 323,
      "end_line": 323,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "minStep"
      ],
      "begin_line": 324,
      "end_line": 324,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxStep"
      ],
      "begin_line": 325,
      "end_line": 325,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54IntegratorTest.suite()",
      "begin_line": 328,
      "end_line": 330,
      "comment": "",
      "child_ranges": [
        "(line 329,col 5)-(line 329,col 62)"
      ]
    }
  ]
}