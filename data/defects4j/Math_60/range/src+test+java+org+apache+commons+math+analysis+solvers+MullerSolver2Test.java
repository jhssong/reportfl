{
  "filepath": "/tmp/Math-60b/src/test/java/org/apache/commons/math/analysis/solvers/MullerSolver2Test.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MullerSolver2Test",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 42,
      "end_line": 150,
      "comment": "\n * Testcase for {@link MullerSolver2 Muller} solver.\n * \u003cp\u003e\n * Muller\u0027s method converges almost quadratically near roots, but it can\n * be very slow in regions far away from zeros. Test runs show that for\n * reasonably good initial values, for a default absolute accuracy of 1E-6,\n * it generally takes 5 to 10 iterations for the solver to converge.\n * \u003cp\u003e\n * Tests for the exponential function illustrate the situations where\n * Muller solver performs poorly.\n *\n * @version $Revision: 1034896 $ $Date: 2010-11-13 23:27:34 +0100 (Sat, 13 Nov 2010) $\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.MullerSolver2Test.testSinFunction()",
      "begin_line": 46,
      "end_line": 64,
      "comment": "\n     * Test of solver for the sine function.\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 53)",
        "(line 49,col 9)-(line 49,col 58)",
        "(line 50,col 9)-(line 50,col 37)",
        "(line 51,col 9)-(line 51,col 53)",
        "(line 53,col 9)-(line 53,col 18)",
        "(line 53,col 20)-(line 53,col 29)",
        "(line 53,col 31)-(line 53,col 53)",
        "(line 54,col 9)-(line 55,col 75)",
        "(line 56,col 9)-(line 56,col 43)",
        "(line 57,col 9)-(line 57,col 57)",
        "(line 59,col 9)-(line 59,col 19)",
        "(line 59,col 21)-(line 59,col 30)",
        "(line 59,col 32)-(line 59,col 46)",
        "(line 60,col 9)-(line 61,col 75)",
        "(line 62,col 9)-(line 62,col 43)",
        "(line 63,col 9)-(line 63,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.MullerSolver2Test.testQuinticFunction()",
      "begin_line": 69,
      "end_line": 93,
      "comment": "\n     * Test of solver for the quintic function.\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 57)",
        "(line 72,col 9)-(line 72,col 58)",
        "(line 73,col 9)-(line 73,col 37)",
        "(line 74,col 9)-(line 74,col 53)",
        "(line 76,col 9)-(line 76,col 19)",
        "(line 76,col 21)-(line 76,col 30)",
        "(line 76,col 32)-(line 76,col 46)",
        "(line 77,col 9)-(line 78,col 75)",
        "(line 79,col 9)-(line 79,col 43)",
        "(line 80,col 9)-(line 80,col 57)",
        "(line 82,col 9)-(line 82,col 19)",
        "(line 82,col 21)-(line 82,col 30)",
        "(line 82,col 32)-(line 82,col 46)",
        "(line 83,col 9)-(line 84,col 75)",
        "(line 85,col 9)-(line 85,col 43)",
        "(line 86,col 9)-(line 86,col 57)",
        "(line 88,col 9)-(line 88,col 19)",
        "(line 88,col 21)-(line 88,col 31)",
        "(line 88,col 33)-(line 88,col 48)",
        "(line 89,col 9)-(line 90,col 75)",
        "(line 91,col 9)-(line 91,col 43)",
        "(line 92,col 9)-(line 92,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.MullerSolver2Test.testExpm1Function()",
      "begin_line": 100,
      "end_line": 124,
      "comment": "\n     * Test of solver for the exponential function.\n     * \u003cp\u003e\n     * It takes 25 to 50 iterations for the last two tests to converge.\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 55)",
        "(line 103,col 9)-(line 103,col 58)",
        "(line 104,col 9)-(line 104,col 37)",
        "(line 105,col 9)-(line 105,col 53)",
        "(line 107,col 9)-(line 107,col 19)",
        "(line 107,col 21)-(line 107,col 30)",
        "(line 107,col 32)-(line 107,col 46)",
        "(line 108,col 9)-(line 109,col 75)",
        "(line 110,col 9)-(line 110,col 43)",
        "(line 111,col 9)-(line 111,col 57)",
        "(line 113,col 9)-(line 113,col 20)",
        "(line 113,col 22)-(line 113,col 32)",
        "(line 113,col 34)-(line 113,col 48)",
        "(line 114,col 9)-(line 115,col 75)",
        "(line 116,col 9)-(line 116,col 43)",
        "(line 117,col 9)-(line 117,col 57)",
        "(line 119,col 9)-(line 119,col 20)",
        "(line 119,col 22)-(line 119,col 33)",
        "(line 119,col 35)-(line 119,col 49)",
        "(line 120,col 9)-(line 121,col 75)",
        "(line 122,col 9)-(line 122,col 43)",
        "(line 123,col 9)-(line 123,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.MullerSolver2Test.testParameters()",
      "begin_line": 129,
      "end_line": 149,
      "comment": "\n     * Test of parameters for the solver.\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 53)",
        "(line 132,col 9)-(line 132,col 58)",
        "(line 133,col 9)-(line 133,col 37)",
        "(line 135,col 9)-(line 141,col 9)",
        "(line 142,col 9)-(line 148,col 9)"
      ]
    }
  ]
}