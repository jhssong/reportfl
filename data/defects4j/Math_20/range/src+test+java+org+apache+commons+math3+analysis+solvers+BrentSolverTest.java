{
  "filepath": "/tmp/Math-20b/src/test/java/org/apache/commons/math3/analysis/solvers/BrentSolverTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BrentSolverTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 47,
      "end_line": 268,
      "comment": "\n * Test case for {@link BrentSolver Brent} solver.\n * Because Brent-Dekker is guaranteed to converge in less than the default\n * maximum iteration count due to bisection fallback, it is quite hard to\n * debug. I include measured iteration counts plus one in order to detect\n * regressions. On average Brent-Dekker should use 4..5 iterations for the\n * default absolute accuracy of 10E-8 for sinus and the quintic function around\n * zero, and 5..10 iterations for the other zeros.\n *\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BrentSolverTest.testSinZero()",
      "begin_line": 48,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 41)",
        "(line 54,col 9)-(line 54,col 22)",
        "(line 55,col 9)-(line 55,col 52)",
        "(line 57,col 9)-(line 57,col 44)",
        "(line 60,col 9)-(line 60,col 79)",
        "(line 61,col 9)-(line 61,col 56)",
        "(line 63,col 9)-(line 63,col 44)",
        "(line 66,col 9)-(line 66,col 79)",
        "(line 67,col 9)-(line 67,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BrentSolverTest.testQuinticZero()",
      "begin_line": 70,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 53)",
        "(line 80,col 9)-(line 80,col 22)",
        "(line 82,col 9)-(line 82,col 52)",
        "(line 85,col 9)-(line 85,col 49)",
        "(line 88,col 9)-(line 88,col 69)",
        "(line 89,col 9)-(line 89,col 56)",
        "(line 92,col 9)-(line 92,col 49)",
        "(line 95,col 9)-(line 95,col 69)",
        "(line 97,col 9)-(line 97,col 56)",
        "(line 99,col 9)-(line 99,col 50)",
        "(line 102,col 9)-(line 102,col 69)",
        "(line 104,col 9)-(line 104,col 56)",
        "(line 106,col 9)-(line 106,col 48)",
        "(line 109,col 9)-(line 109,col 71)",
        "(line 111,col 9)-(line 111,col 56)",
        "(line 113,col 9)-(line 113,col 48)",
        "(line 116,col 9)-(line 116,col 71)",
        "(line 117,col 9)-(line 117,col 57)",
        "(line 119,col 9)-(line 119,col 50)",
        "(line 122,col 9)-(line 122,col 71)",
        "(line 123,col 9)-(line 123,col 57)",
        "(line 126,col 9)-(line 126,col 50)",
        "(line 129,col 9)-(line 129,col 71)",
        "(line 130,col 9)-(line 130,col 57)",
        "(line 132,col 9)-(line 132,col 48)",
        "(line 135,col 9)-(line 135,col 71)",
        "(line 136,col 9)-(line 136,col 57)",
        "(line 138,col 9)-(line 138,col 50)",
        "(line 141,col 9)-(line 141,col 71)",
        "(line 142,col 9)-(line 142,col 57)",
        "(line 144,col 9)-(line 144,col 50)",
        "(line 147,col 9)-(line 147,col 71)",
        "(line 148,col 9)-(line 148,col 57)",
        "(line 150,col 9)-(line 150,col 47)",
        "(line 153,col 9)-(line 153,col 71)",
        "(line 154,col 9)-(line 154,col 57)",
        "(line 156,col 9)-(line 161,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BrentSolverTest.testRootEndpoints()",
      "begin_line": 164,
      "end_line": 181,
      "comment": "",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 41)",
        "(line 167,col 9)-(line 167,col 47)",
        "(line 170,col 9)-(line 170,col 61)",
        "(line 171,col 9)-(line 171,col 79)",
        "(line 173,col 9)-(line 173,col 54)",
        "(line 174,col 9)-(line 174,col 79)",
        "(line 176,col 9)-(line 176,col 59)",
        "(line 177,col 9)-(line 177,col 79)",
        "(line 179,col 9)-(line 179,col 60)",
        "(line 180,col 9)-(line 180,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BrentSolverTest.testBadEndpoints()",
      "begin_line": 183,
      "end_line": 205,
      "comment": "",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 41)",
        "(line 186,col 9)-(line 186,col 47)",
        "(line 187,col 9)-(line 192,col 9)",
        "(line 193,col 9)-(line 198,col 9)",
        "(line 199,col 9)-(line 204,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BrentSolverTest.testInitialGuess()",
      "begin_line": 207,
      "end_line": 245,
      "comment": "",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 75)",
        "(line 210,col 9)-(line 210,col 47)",
        "(line 211,col 9)-(line 211,col 22)",
        "(line 214,col 9)-(line 214,col 48)",
        "(line 215,col 9)-(line 215,col 71)",
        "(line 216,col 9)-(line 216,col 52)",
        "(line 217,col 9)-(line 217,col 53)",
        "(line 220,col 9)-(line 225,col 9)",
        "(line 228,col 9)-(line 228,col 27)",
        "(line 229,col 9)-(line 229,col 54)",
        "(line 230,col 9)-(line 230,col 71)",
        "(line 231,col 9)-(line 231,col 67)",
        "(line 234,col 9)-(line 234,col 27)",
        "(line 235,col 9)-(line 235,col 58)",
        "(line 236,col 9)-(line 236,col 71)",
        "(line 237,col 9)-(line 237,col 67)",
        "(line 240,col 9)-(line 240,col 27)",
        "(line 241,col 9)-(line 241,col 53)",
        "(line 242,col 9)-(line 242,col 71)",
        "(line 243,col 9)-(line 243,col 56)",
        "(line 244,col 9)-(line 244,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BrentSolverTest.testMath832()",
      "begin_line": 247,
      "end_line": 267,
      "comment": "",
      "child_ranges": [
        "(line 249,col 9)-(line 262,col 14)",
        "(line 264,col 9)-(line 264,col 47)",
        "(line 265,col 9)-(line 265,col 70)",
        "(line 266,col 9)-(line 266,col 56)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "sqrt"
      ],
      "begin_line": 250,
      "end_line": 250,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inv"
      ],
      "begin_line": 251,
      "end_line": 251,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "func"
      ],
      "begin_line": 252,
      "end_line": 256,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BrentSolverTest.Anonymous-635cdf10-fa9f-4488-9b00-5330406d384c.value(double)",
      "begin_line": 258,
      "end_line": 260,
      "comment": "",
      "child_ranges": [
        "(line 259,col 21)-(line 259,col 99)"
      ]
    }
  ]
}