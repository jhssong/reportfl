{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/analysis/solvers/MullerSolver2Test.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MullerSolver2Test",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 42,
      "end_line": 146,
      "comment": "\n * Test case for {@link MullerSolver2 Muller} solver.\n * \u003cp\u003e\n * Muller\u0027s method converges almost quadratically near roots, but it can\n * be very slow in regions far away from zeros. Test runs show that for\n * reasonably good initial values, for a default absolute accuracy of 1E-6,\n * it generally takes 5 to 10 iterations for the solver to converge.\n * \u003cp\u003e\n * Tests for the exponential function illustrate the situations where\n * Muller solver performs poorly.\n *\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.MullerSolver2Test.testSinFunction()",
      "begin_line": 46,
      "end_line": 63,
      "comment": "\n     * Test of solver for the sine function.\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 41)",
        "(line 49,col 9)-(line 49,col 54)",
        "(line 50,col 9)-(line 50,col 53)",
        "(line 52,col 9)-(line 52,col 18)",
        "(line 52,col 20)-(line 52,col 29)",
        "(line 52,col 31)-(line 52,col 53)",
        "(line 53,col 9)-(line 54,col 75)",
        "(line 55,col 9)-(line 55,col 48)",
        "(line 56,col 9)-(line 56,col 57)",
        "(line 58,col 9)-(line 58,col 19)",
        "(line 58,col 21)-(line 58,col 30)",
        "(line 58,col 32)-(line 58,col 46)",
        "(line 59,col 9)-(line 60,col 75)",
        "(line 61,col 9)-(line 61,col 48)",
        "(line 62,col 9)-(line 62,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.MullerSolver2Test.testQuinticFunction()",
      "begin_line": 68,
      "end_line": 91,
      "comment": "\n     * Test of solver for the quintic function.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 53)",
        "(line 71,col 9)-(line 71,col 54)",
        "(line 72,col 9)-(line 72,col 53)",
        "(line 74,col 9)-(line 74,col 19)",
        "(line 74,col 21)-(line 74,col 30)",
        "(line 74,col 32)-(line 74,col 46)",
        "(line 75,col 9)-(line 76,col 75)",
        "(line 77,col 9)-(line 77,col 48)",
        "(line 78,col 9)-(line 78,col 57)",
        "(line 80,col 9)-(line 80,col 19)",
        "(line 80,col 21)-(line 80,col 30)",
        "(line 80,col 32)-(line 80,col 46)",
        "(line 81,col 9)-(line 82,col 75)",
        "(line 83,col 9)-(line 83,col 48)",
        "(line 84,col 9)-(line 84,col 57)",
        "(line 86,col 9)-(line 86,col 19)",
        "(line 86,col 21)-(line 86,col 31)",
        "(line 86,col 33)-(line 86,col 48)",
        "(line 87,col 9)-(line 88,col 75)",
        "(line 89,col 9)-(line 89,col 48)",
        "(line 90,col 9)-(line 90,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.MullerSolver2Test.testExpm1Function()",
      "begin_line": 98,
      "end_line": 121,
      "comment": "\n     * Test of solver for the exponential function.\n     * \u003cp\u003e\n     * It takes 25 to 50 iterations for the last two tests to converge.\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 43)",
        "(line 101,col 9)-(line 101,col 54)",
        "(line 102,col 9)-(line 102,col 53)",
        "(line 104,col 9)-(line 104,col 19)",
        "(line 104,col 21)-(line 104,col 30)",
        "(line 104,col 32)-(line 104,col 46)",
        "(line 105,col 9)-(line 106,col 75)",
        "(line 107,col 9)-(line 107,col 48)",
        "(line 108,col 9)-(line 108,col 57)",
        "(line 110,col 9)-(line 110,col 20)",
        "(line 110,col 22)-(line 110,col 32)",
        "(line 110,col 34)-(line 110,col 48)",
        "(line 111,col 9)-(line 112,col 75)",
        "(line 113,col 9)-(line 113,col 48)",
        "(line 114,col 9)-(line 114,col 57)",
        "(line 116,col 9)-(line 116,col 20)",
        "(line 116,col 22)-(line 116,col 33)",
        "(line 116,col 35)-(line 116,col 49)",
        "(line 117,col 9)-(line 118,col 75)",
        "(line 119,col 9)-(line 119,col 48)",
        "(line 120,col 9)-(line 120,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.MullerSolver2Test.testParameters()",
      "begin_line": 126,
      "end_line": 145,
      "comment": "\n     * Test of parameters for the solver.\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 41)",
        "(line 129,col 9)-(line 129,col 54)",
        "(line 131,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 144,col 9)"
      ]
    }
  ]
}