{
  "filepath": "/tmp/Math-27b/src/test/java/org/apache/commons/math3/analysis/solvers/BrentSolverTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BrentSolverTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 46,
      "end_line": 272,
      "comment": "\n * Test case for {@link BrentSolver Brent} solver.\n * Because Brent-Dekker is guaranteed to converge in less than the default\n * maximum iteration count due to bisection fallback, it is quite hard to\n * debug. I include measured iteration counts plus one in order to detect\n * regressions. On average Brent-Dekker should use 4..5 iterations for the\n * default absolute accuracy of 10E-8 for sinus and the quintic function around\n * zero, and 5..10 iterations for the other zeros.\n *\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BrentSolverTest.testSinZero()",
      "begin_line": 47,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 49)",
        "(line 53,col 9)-(line 53,col 22)",
        "(line 54,col 9)-(line 54,col 52)",
        "(line 56,col 9)-(line 56,col 44)",
        "(line 59,col 9)-(line 59,col 79)",
        "(line 60,col 9)-(line 60,col 56)",
        "(line 62,col 9)-(line 62,col 44)",
        "(line 65,col 9)-(line 65,col 79)",
        "(line 66,col 9)-(line 66,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BrentSolverTest.testQuinticZero()",
      "begin_line": 69,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 53)",
        "(line 79,col 9)-(line 79,col 22)",
        "(line 81,col 9)-(line 81,col 52)",
        "(line 84,col 9)-(line 84,col 49)",
        "(line 87,col 9)-(line 87,col 69)",
        "(line 88,col 9)-(line 88,col 56)",
        "(line 91,col 9)-(line 91,col 49)",
        "(line 94,col 9)-(line 94,col 69)",
        "(line 96,col 9)-(line 96,col 56)",
        "(line 98,col 9)-(line 98,col 50)",
        "(line 101,col 9)-(line 101,col 69)",
        "(line 103,col 9)-(line 103,col 56)",
        "(line 105,col 9)-(line 105,col 48)",
        "(line 108,col 9)-(line 108,col 71)",
        "(line 110,col 9)-(line 110,col 56)",
        "(line 112,col 9)-(line 112,col 48)",
        "(line 115,col 9)-(line 115,col 71)",
        "(line 116,col 9)-(line 116,col 57)",
        "(line 118,col 9)-(line 118,col 50)",
        "(line 121,col 9)-(line 121,col 71)",
        "(line 122,col 9)-(line 122,col 57)",
        "(line 125,col 9)-(line 125,col 50)",
        "(line 128,col 9)-(line 128,col 71)",
        "(line 129,col 9)-(line 129,col 57)",
        "(line 131,col 9)-(line 131,col 48)",
        "(line 134,col 9)-(line 134,col 71)",
        "(line 135,col 9)-(line 135,col 57)",
        "(line 137,col 9)-(line 137,col 50)",
        "(line 140,col 9)-(line 140,col 71)",
        "(line 141,col 9)-(line 141,col 57)",
        "(line 143,col 9)-(line 143,col 50)",
        "(line 146,col 9)-(line 146,col 71)",
        "(line 147,col 9)-(line 147,col 57)",
        "(line 149,col 9)-(line 149,col 47)",
        "(line 152,col 9)-(line 152,col 71)",
        "(line 153,col 9)-(line 153,col 57)",
        "(line 155,col 9)-(line 160,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BrentSolverTest.testRootEndpoints()",
      "begin_line": 163,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 49)",
        "(line 166,col 9)-(line 166,col 47)",
        "(line 169,col 9)-(line 169,col 61)",
        "(line 170,col 9)-(line 170,col 79)",
        "(line 172,col 9)-(line 172,col 54)",
        "(line 173,col 9)-(line 173,col 79)",
        "(line 175,col 9)-(line 175,col 59)",
        "(line 176,col 9)-(line 176,col 79)",
        "(line 178,col 9)-(line 178,col 60)",
        "(line 179,col 9)-(line 179,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BrentSolverTest.testBadEndpoints()",
      "begin_line": 182,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 49)",
        "(line 185,col 9)-(line 185,col 47)",
        "(line 186,col 9)-(line 191,col 9)",
        "(line 192,col 9)-(line 197,col 9)",
        "(line 198,col 9)-(line 203,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BrentSolverTest.testInitialGuess()",
      "begin_line": 206,
      "end_line": 244,
      "comment": "",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 75)",
        "(line 209,col 9)-(line 209,col 47)",
        "(line 210,col 9)-(line 210,col 22)",
        "(line 213,col 9)-(line 213,col 48)",
        "(line 214,col 9)-(line 214,col 71)",
        "(line 215,col 9)-(line 215,col 52)",
        "(line 216,col 9)-(line 216,col 53)",
        "(line 219,col 9)-(line 224,col 9)",
        "(line 227,col 9)-(line 227,col 27)",
        "(line 228,col 9)-(line 228,col 54)",
        "(line 229,col 9)-(line 229,col 71)",
        "(line 230,col 9)-(line 230,col 67)",
        "(line 233,col 9)-(line 233,col 27)",
        "(line 234,col 9)-(line 234,col 58)",
        "(line 235,col 9)-(line 235,col 71)",
        "(line 236,col 9)-(line 236,col 67)",
        "(line 239,col 9)-(line 239,col 27)",
        "(line 240,col 9)-(line 240,col 53)",
        "(line 241,col 9)-(line 241,col 71)",
        "(line 242,col 9)-(line 242,col 56)",
        "(line 243,col 9)-(line 243,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BrentSolverTest.testMath832()",
      "begin_line": 246,
      "end_line": 271,
      "comment": "",
      "child_ranges": [
        "(line 248,col 9)-(line 264,col 14)",
        "(line 266,col 9)-(line 266,col 47)",
        "(line 267,col 9)-(line 269,col 63)",
        "(line 270,col 9)-(line 270,col 56)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "sqrt"
      ],
      "begin_line": 249,
      "end_line": 249,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inv"
      ],
      "begin_line": 250,
      "end_line": 250,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "func"
      ],
      "begin_line": 251,
      "end_line": 255,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BrentSolverTest.Anonymous-23c727d1-a791-4b1f-b1fd-4bbfc7efa956.value(double)",
      "begin_line": 257,
      "end_line": 259,
      "comment": "",
      "child_ranges": [
        "(line 258,col 21)-(line 258,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BrentSolverTest.Anonymous-67fe113a-9d9f-4db2-8398-13ef820aa05c.derivative()",
      "begin_line": 261,
      "end_line": 263,
      "comment": "",
      "child_ranges": [
        "(line 262,col 21)-(line 262,col 45)"
      ]
    }
  ]
}