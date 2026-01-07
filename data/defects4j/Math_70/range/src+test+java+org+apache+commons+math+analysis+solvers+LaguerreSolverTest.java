{
  "filepath": "/tmp/Math-70b/src/test/java/org/apache/commons/math/analysis/solvers/LaguerreSolverTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LaguerreSolverTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 36,
      "end_line": 197,
      "comment": "\n * Testcase for Laguerre solver.\n * \u003cp\u003e\n * Laguerre\u0027s method is very efficient in solving polynomials. Test runs\n * show that for a default absolute accuracy of 1E-6, it generally takes\n * less than 5 iterations to find one root, provided solveAll() is not\n * invoked, and 15 to 20 iterations to find all roots for quintic function.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.LaguerreSolverTest.testDeprecated()",
      "begin_line": 41,
      "end_line": 55,
      "comment": "\n     * Test deprecated APIs.\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 53)",
        "(line 46,col 9)-(line 46,col 46)",
        "(line 47,col 9)-(line 47,col 68)",
        "(line 48,col 9)-(line 48,col 60)",
        "(line 50,col 9)-(line 50,col 18)",
        "(line 50,col 20)-(line 50,col 29)",
        "(line 50,col 31)-(line 50,col 46)",
        "(line 51,col 9)-(line 52,col 71)",
        "(line 53,col 9)-(line 53,col 40)",
        "(line 54,col 9)-(line 54,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.LaguerreSolverTest.testLinearFunction()",
      "begin_line": 60,
      "end_line": 73,
      "comment": "\n     * Test of solver for the linear function.\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 53)",
        "(line 64,col 9)-(line 64,col 46)",
        "(line 65,col 9)-(line 65,col 68)",
        "(line 66,col 9)-(line 66,col 59)",
        "(line 68,col 9)-(line 68,col 18)",
        "(line 68,col 20)-(line 68,col 29)",
        "(line 68,col 31)-(line 68,col 46)",
        "(line 69,col 9)-(line 70,col 71)",
        "(line 71,col 9)-(line 71,col 43)",
        "(line 72,col 9)-(line 72,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.LaguerreSolverTest.testQuadraticFunction()",
      "begin_line": 78,
      "end_line": 97,
      "comment": "\n     * Test of solver for the quadratic function.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 53)",
        "(line 82,col 9)-(line 82,col 51)",
        "(line 83,col 9)-(line 83,col 68)",
        "(line 84,col 9)-(line 84,col 59)",
        "(line 86,col 9)-(line 86,col 18)",
        "(line 86,col 20)-(line 86,col 29)",
        "(line 86,col 31)-(line 86,col 45)",
        "(line 87,col 9)-(line 88,col 71)",
        "(line 89,col 9)-(line 89,col 43)",
        "(line 90,col 9)-(line 90,col 50)",
        "(line 92,col 9)-(line 92,col 19)",
        "(line 92,col 21)-(line 92,col 31)",
        "(line 92,col 33)-(line 92,col 48)",
        "(line 93,col 9)-(line 94,col 71)",
        "(line 95,col 9)-(line 95,col 43)",
        "(line 96,col 9)-(line 96,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.LaguerreSolverTest.testQuinticFunction()",
      "begin_line": 102,
      "end_line": 127,
      "comment": "\n     * Test of solver for the quintic function.\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 53)",
        "(line 106,col 9)-(line 106,col 71)",
        "(line 107,col 9)-(line 107,col 68)",
        "(line 108,col 9)-(line 108,col 59)",
        "(line 110,col 9)-(line 110,col 19)",
        "(line 110,col 21)-(line 110,col 30)",
        "(line 110,col 32)-(line 110,col 47)",
        "(line 111,col 9)-(line 112,col 71)",
        "(line 113,col 9)-(line 113,col 43)",
        "(line 114,col 9)-(line 114,col 50)",
        "(line 116,col 9)-(line 116,col 19)",
        "(line 116,col 21)-(line 116,col 31)",
        "(line 116,col 33)-(line 116,col 48)",
        "(line 117,col 9)-(line 118,col 71)",
        "(line 119,col 9)-(line 119,col 43)",
        "(line 120,col 9)-(line 120,col 50)",
        "(line 122,col 9)-(line 122,col 18)",
        "(line 122,col 20)-(line 122,col 29)",
        "(line 122,col 31)-(line 122,col 45)",
        "(line 123,col 9)-(line 124,col 71)",
        "(line 125,col 9)-(line 125,col 43)",
        "(line 126,col 9)-(line 126,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.LaguerreSolverTest.testQuinticFunction2()",
      "begin_line": 132,
      "end_line": 165,
      "comment": "\n     * Test of solver for the quintic function using solveAll().\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 40)",
        "(line 134,col 9)-(line 134,col 35)",
        "(line 137,col 9)-(line 137,col 65)",
        "(line 138,col 9)-(line 138,col 53)",
        "(line 139,col 9)-(line 139,col 56)",
        "(line 141,col 9)-(line 141,col 42)",
        "(line 142,col 9)-(line 143,col 77)",
        "(line 144,col 9)-(line 144,col 62)",
        "(line 146,col 9)-(line 146,col 41)",
        "(line 147,col 9)-(line 148,col 77)",
        "(line 149,col 9)-(line 149,col 62)",
        "(line 151,col 9)-(line 151,col 58)",
        "(line 152,col 9)-(line 153,col 77)",
        "(line 154,col 9)-(line 154,col 62)",
        "(line 156,col 9)-(line 156,col 42)",
        "(line 157,col 9)-(line 158,col 77)",
        "(line 159,col 9)-(line 159,col 62)",
        "(line 161,col 9)-(line 161,col 59)",
        "(line 162,col 9)-(line 163,col 77)",
        "(line 164,col 9)-(line 164,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.LaguerreSolverTest.testParameters()",
      "begin_line": 170,
      "end_line": 196,
      "comment": "\n     * Test of parameters for the solver.\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 51)",
        "(line 172,col 9)-(line 172,col 68)",
        "(line 173,col 9)-(line 173,col 59)",
        "(line 175,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 195,col 9)"
      ]
    }
  ]
}