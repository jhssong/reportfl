{
  "filepath": "/tmp/Math-98b/src/test/org/apache/commons/math/ode/DormandPrince54IntegratorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DormandPrince54IntegratorTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 31,
      "end_line": 335,
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
      "end_line": 205,
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
        "(line 194,col 5)-(line 194,col 73)",
        "(line 195,col 5)-(line 197,col 70)",
        "(line 199,col 5)-(line 199,col 56)",
        "(line 200,col 5)-(line 200,col 60)",
        "(line 201,col 5)-(line 201,col 64)",
        "(line 202,col 5)-(line 202,col 36)",
        "(line 203,col 5)-(line 203,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54IntegratorTest.testKepler()",
      "begin_line": 207,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 210,col 5)-(line 210,col 51)",
        "(line 211,col 5)-(line 211,col 23)",
        "(line 212,col 5)-(line 212,col 61)",
        "(line 213,col 5)-(line 213,col 42)",
        "(line 214,col 5)-(line 214,col 57)",
        "(line 216,col 5)-(line 218,col 86)",
        "(line 219,col 5)-(line 219,col 48)",
        "(line 220,col 5)-(line 222,col 70)",
        "(line 224,col 5)-(line 224,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54IntegratorTest.testVariableSteps()",
      "begin_line": 228,
      "end_line": 244,
      "comment": "",
      "child_ranges": [
        "(line 231,col 5)-(line 231,col 51)",
        "(line 232,col 5)-(line 232,col 23)",
        "(line 233,col 5)-(line 233,col 61)",
        "(line 234,col 5)-(line 234,col 42)",
        "(line 235,col 5)-(line 235,col 57)",
        "(line 237,col 5)-(line 239,col 86)",
        "(line 240,col 5)-(line 240,col 48)",
        "(line 241,col 5)-(line 243,col 70)"
      ]
    },
    {
      "type": "class_interface",
      "name": "KeplerHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.StepHandler"
      ],
      "begin_line": 246,
      "end_line": 287,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "KeplerHandler(TestProblem3)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027TestProblem3\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 247,
      "end_line": 250,
      "comment": "",
      "child_ranges": [
        "(line 248,col 7)-(line 248,col 19)",
        "(line 249,col 7)-(line 249,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54IntegratorTest.KeplerHandler.requiresDenseOutput()",
      "begin_line": 251,
      "end_line": 253,
      "comment": "",
      "child_ranges": [
        "(line 252,col 7)-(line 252,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54IntegratorTest.KeplerHandler.reset()",
      "begin_line": 254,
      "end_line": 257,
      "comment": "",
      "child_ranges": [
        "(line 255,col 7)-(line 255,col 18)",
        "(line 256,col 7)-(line 256,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54IntegratorTest.KeplerHandler.handleStep(org.apache.commons.math.ode.StepInterpolator, boolean)",
      "begin_line": 258,
      "end_line": 283,
      "comment": "",
      "child_ranges": [
        "(line 262,col 7)-(line 262,col 16)",
        "(line 263,col 7)-(line 278,col 7)",
        "(line 279,col 7)-(line 282,col 7)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "nbSteps"
      ],
      "begin_line": 284,
      "end_line": 284,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxError"
      ],
      "begin_line": 285,
      "end_line": 285,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pb"
      ],
      "begin_line": 286,
      "end_line": 286,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "VariableHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.StepHandler"
      ],
      "begin_line": 289,
      "end_line": 329,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.DormandPrince54IntegratorTest.VariableHandler.VariableHandler()",
      "begin_line": 290,
      "end_line": 294,
      "comment": "",
      "child_ranges": [
        "(line 291,col 7)-(line 291,col 23)",
        "(line 292,col 7)-(line 292,col 18)",
        "(line 293,col 7)-(line 293,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54IntegratorTest.VariableHandler.requiresDenseOutput()",
      "begin_line": 295,
      "end_line": 297,
      "comment": "",
      "child_ranges": [
        "(line 296,col 7)-(line 296,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54IntegratorTest.VariableHandler.reset()",
      "begin_line": 298,
      "end_line": 302,
      "comment": "",
      "child_ranges": [
        "(line 299,col 7)-(line 299,col 23)",
        "(line 300,col 7)-(line 300,col 18)",
        "(line 301,col 7)-(line 301,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54IntegratorTest.VariableHandler.handleStep(org.apache.commons.math.ode.StepInterpolator, boolean)",
      "begin_line": 303,
      "end_line": 325,
      "comment": "",
      "child_ranges": [
        "(line 306,col 7)-(line 307,col 63)",
        "(line 308,col 7)-(line 319,col 7)",
        "(line 321,col 7)-(line 324,col 7)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "firstTime"
      ],
      "begin_line": 326,
      "end_line": 326,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "minStep"
      ],
      "begin_line": 327,
      "end_line": 327,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxStep"
      ],
      "begin_line": 328,
      "end_line": 328,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54IntegratorTest.suite()",
      "begin_line": 331,
      "end_line": 333,
      "comment": "",
      "child_ranges": [
        "(line 332,col 5)-(line 332,col 62)"
      ]
    }
  ]
}