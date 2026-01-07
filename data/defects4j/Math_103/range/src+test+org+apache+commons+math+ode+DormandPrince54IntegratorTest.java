{
  "filepath": "/tmp/Math-103b/src/test/org/apache/commons/math/ode/DormandPrince54IntegratorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DormandPrince54IntegratorTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 31,
      "end_line": 323,
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
      "end_line": 101,
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
        "(line 99,col 5)-(line 99,col 38)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DP54SmallLastHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.StepHandler"
      ],
      "begin_line": 103,
      "end_line": 132,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.DormandPrince54IntegratorTest.DP54SmallLastHandler.DP54SmallLastHandler(double)",
      "begin_line": 105,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 106,col 7)-(line 106,col 23)",
        "(line 107,col 7)-(line 107,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54IntegratorTest.DP54SmallLastHandler.requiresDenseOutput()",
      "begin_line": 110,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 111,col 7)-(line 111,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54IntegratorTest.DP54SmallLastHandler.reset()",
      "begin_line": 114,
      "end_line": 115,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54IntegratorTest.DP54SmallLastHandler.handleStep(org.apache.commons.math.ode.StepInterpolator, boolean)",
      "begin_line": 117,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 118,col 7)-(line 122,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54IntegratorTest.DP54SmallLastHandler.wasLastSeen()",
      "begin_line": 125,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 126,col 7)-(line 126,col 22)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "lastSeen"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "minStep"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54IntegratorTest.testIncreasingTolerance()",
      "begin_line": 134,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 137,col 5)-(line 137,col 42)",
        "(line 138,col 5)-(line 163,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54IntegratorTest.testSwitchingFunctions()",
      "begin_line": 167,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 170,col 5)-(line 170,col 41)",
        "(line 171,col 5)-(line 171,col 23)",
        "(line 172,col 5)-(line 172,col 61)",
        "(line 173,col 5)-(line 173,col 42)",
        "(line 174,col 5)-(line 174,col 64)",
        "(line 176,col 5)-(line 178,col 86)",
        "(line 179,col 5)-(line 179,col 60)",
        "(line 180,col 5)-(line 180,col 34)",
        "(line 181,col 5)-(line 181,col 63)",
        "(line 182,col 5)-(line 185,col 5)",
        "(line 186,col 5)-(line 188,col 70)",
        "(line 190,col 5)-(line 190,col 51)",
        "(line 191,col 5)-(line 191,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54IntegratorTest.testKepler()",
      "begin_line": 195,
      "end_line": 214,
      "comment": "",
      "child_ranges": [
        "(line 198,col 5)-(line 198,col 51)",
        "(line 199,col 5)-(line 199,col 23)",
        "(line 200,col 5)-(line 200,col 61)",
        "(line 201,col 5)-(line 201,col 42)",
        "(line 202,col 5)-(line 202,col 57)",
        "(line 204,col 5)-(line 206,col 86)",
        "(line 207,col 5)-(line 207,col 48)",
        "(line 208,col 5)-(line 210,col 70)",
        "(line 212,col 5)-(line 212,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54IntegratorTest.testVariableSteps()",
      "begin_line": 216,
      "end_line": 232,
      "comment": "",
      "child_ranges": [
        "(line 219,col 5)-(line 219,col 51)",
        "(line 220,col 5)-(line 220,col 23)",
        "(line 221,col 5)-(line 221,col 61)",
        "(line 222,col 5)-(line 222,col 42)",
        "(line 223,col 5)-(line 223,col 57)",
        "(line 225,col 5)-(line 227,col 86)",
        "(line 228,col 5)-(line 228,col 48)",
        "(line 229,col 5)-(line 231,col 70)"
      ]
    },
    {
      "type": "class_interface",
      "name": "KeplerHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.StepHandler"
      ],
      "begin_line": 234,
      "end_line": 275,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "KeplerHandler(TestProblem3)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027TestProblem3\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 235,
      "end_line": 238,
      "comment": "",
      "child_ranges": [
        "(line 236,col 7)-(line 236,col 19)",
        "(line 237,col 7)-(line 237,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54IntegratorTest.KeplerHandler.requiresDenseOutput()",
      "begin_line": 239,
      "end_line": 241,
      "comment": "",
      "child_ranges": [
        "(line 240,col 7)-(line 240,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54IntegratorTest.KeplerHandler.reset()",
      "begin_line": 242,
      "end_line": 245,
      "comment": "",
      "child_ranges": [
        "(line 243,col 7)-(line 243,col 18)",
        "(line 244,col 7)-(line 244,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54IntegratorTest.KeplerHandler.handleStep(org.apache.commons.math.ode.StepInterpolator, boolean)",
      "begin_line": 246,
      "end_line": 271,
      "comment": "",
      "child_ranges": [
        "(line 250,col 7)-(line 250,col 16)",
        "(line 251,col 7)-(line 266,col 7)",
        "(line 267,col 7)-(line 270,col 7)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "nbSteps"
      ],
      "begin_line": 272,
      "end_line": 272,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxError"
      ],
      "begin_line": 273,
      "end_line": 273,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pb"
      ],
      "begin_line": 274,
      "end_line": 274,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "VariableHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.StepHandler"
      ],
      "begin_line": 277,
      "end_line": 317,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.DormandPrince54IntegratorTest.VariableHandler.VariableHandler()",
      "begin_line": 278,
      "end_line": 282,
      "comment": "",
      "child_ranges": [
        "(line 279,col 7)-(line 279,col 23)",
        "(line 280,col 7)-(line 280,col 18)",
        "(line 281,col 7)-(line 281,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54IntegratorTest.VariableHandler.requiresDenseOutput()",
      "begin_line": 283,
      "end_line": 285,
      "comment": "",
      "child_ranges": [
        "(line 284,col 7)-(line 284,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54IntegratorTest.VariableHandler.reset()",
      "begin_line": 286,
      "end_line": 290,
      "comment": "",
      "child_ranges": [
        "(line 287,col 7)-(line 287,col 23)",
        "(line 288,col 7)-(line 288,col 18)",
        "(line 289,col 7)-(line 289,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54IntegratorTest.VariableHandler.handleStep(org.apache.commons.math.ode.StepInterpolator, boolean)",
      "begin_line": 291,
      "end_line": 313,
      "comment": "",
      "child_ranges": [
        "(line 294,col 7)-(line 295,col 63)",
        "(line 296,col 7)-(line 307,col 7)",
        "(line 309,col 7)-(line 312,col 7)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "firstTime"
      ],
      "begin_line": 314,
      "end_line": 314,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "minStep"
      ],
      "begin_line": 315,
      "end_line": 315,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxStep"
      ],
      "begin_line": 316,
      "end_line": 316,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54IntegratorTest.suite()",
      "begin_line": 319,
      "end_line": 321,
      "comment": "",
      "child_ranges": [
        "(line 320,col 5)-(line 320,col 62)"
      ]
    }
  ]
}