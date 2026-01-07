{
  "filepath": "/tmp/Math-103b/src/test/org/apache/commons/math/ode/HighamHall54IntegratorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HighamHall54IntegratorTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 30,
      "end_line": 196,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.HighamHall54IntegratorTest.HighamHall54IntegratorTest(java.lang.String)",
      "begin_line": 33,
      "end_line": 35,
      "comment": "",
      "child_ranges": [
        "(line 34,col 5)-(line 34,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.HighamHall54IntegratorTest.testDimensionCheck()",
      "begin_line": 37,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 38,col 5)-(line 49,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.HighamHall54IntegratorTest.testMinStep()",
      "begin_line": 52,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 55,col 5)-(line 74,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.HighamHall54IntegratorTest.testIncreasingTolerance()",
      "begin_line": 78,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 81,col 5)-(line 81,col 42)",
        "(line 82,col 5)-(line 107,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.HighamHall54IntegratorTest.testSwitchingFunctions()",
      "begin_line": 111,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 114,col 5)-(line 114,col 41)",
        "(line 115,col 5)-(line 115,col 23)",
        "(line 116,col 5)-(line 116,col 61)",
        "(line 117,col 5)-(line 117,col 42)",
        "(line 118,col 5)-(line 118,col 64)",
        "(line 120,col 5)-(line 122,col 83)",
        "(line 123,col 5)-(line 123,col 60)",
        "(line 124,col 5)-(line 124,col 34)",
        "(line 125,col 5)-(line 125,col 63)",
        "(line 126,col 5)-(line 129,col 5)",
        "(line 130,col 5)-(line 132,col 70)",
        "(line 134,col 5)-(line 134,col 51)",
        "(line 135,col 5)-(line 135,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.HighamHall54IntegratorTest.testKepler()",
      "begin_line": 139,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 142,col 5)-(line 142,col 51)",
        "(line 143,col 5)-(line 143,col 23)",
        "(line 144,col 5)-(line 144,col 61)",
        "(line 145,col 5)-(line 145,col 42)",
        "(line 146,col 5)-(line 146,col 57)",
        "(line 148,col 5)-(line 150,col 83)",
        "(line 151,col 5)-(line 151,col 48)",
        "(line 152,col 5)-(line 154,col 70)"
      ]
    },
    {
      "type": "class_interface",
      "name": "KeplerHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.StepHandler"
      ],
      "begin_line": 157,
      "end_line": 190,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "KeplerHandler(TestProblem3)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027TestProblem3\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 158,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 159,col 7)-(line 159,col 19)",
        "(line 160,col 7)-(line 160,col 18)",
        "(line 161,col 7)-(line 161,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.HighamHall54IntegratorTest.KeplerHandler.requiresDenseOutput()",
      "begin_line": 163,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 164,col 7)-(line 164,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.HighamHall54IntegratorTest.KeplerHandler.reset()",
      "begin_line": 166,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 167,col 7)-(line 167,col 18)",
        "(line 168,col 7)-(line 168,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.HighamHall54IntegratorTest.KeplerHandler.handleStep(org.apache.commons.math.ode.StepInterpolator, boolean)",
      "begin_line": 170,
      "end_line": 186,
      "comment": "",
      "child_ranges": [
        "(line 173,col 7)-(line 173,col 16)",
        "(line 174,col 7)-(line 174,col 68)",
        "(line 175,col 7)-(line 175,col 89)",
        "(line 176,col 7)-(line 176,col 53)",
        "(line 177,col 7)-(line 177,col 53)",
        "(line 178,col 7)-(line 178,col 39)",
        "(line 179,col 7)-(line 181,col 7)",
        "(line 182,col 7)-(line 185,col 7)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "pb"
      ],
      "begin_line": 187,
      "end_line": 187,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nbSteps"
      ],
      "begin_line": 188,
      "end_line": 188,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxError"
      ],
      "begin_line": 189,
      "end_line": 189,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.HighamHall54IntegratorTest.suite()",
      "begin_line": 192,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 193,col 5)-(line 193,col 59)"
      ]
    }
  ]
}