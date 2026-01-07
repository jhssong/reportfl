{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/analysis/solvers/BisectionSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BisectionSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl"
      ],
      "begin_line": 31,
      "end_line": 109,
      "comment": "\n * Implements the \u003ca href\u003d\"http://mathworld.wolfram.com/Bisection.html\"\u003e\n * bisection algorithm\u003c/a\u003e for finding zeros of univariate real functions.\n * \u003cp\u003e\n * The function should be continuous but not necessarily smooth.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.BisectionSolver.BisectionSolver(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 42,
      "end_line": 45,
      "comment": "\n     * Construct a solver for the given function.\n     *\n     * @param f function to solve.\n     * @deprecated as of 2.0 the function to solve is passed as an argument\n     * to the {@link #solve(UnivariateRealFunction, double, double)} or\n     * {@link UnivariateRealSolverImpl#solve(UnivariateRealFunction, double, double, double)}\n     * method.\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.BisectionSolver.BisectionSolver()",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n     * Construct a solver.\n     *\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BisectionSolver.solve(double, double, double)",
      "begin_line": 56,
      "end_line": 60,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BisectionSolver.solve(double, double)",
      "begin_line": 63,
      "end_line": 67,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BisectionSolver.solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double)",
      "begin_line": 70,
      "end_line": 73,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BisectionSolver.solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double)",
      "begin_line": 76,
      "end_line": 108,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 22)",
        "(line 80,col 9)-(line 80,col 32)",
        "(line 81,col 9)-(line 81,col 17)",
        "(line 82,col 9)-(line 82,col 18)",
        "(line 83,col 9)-(line 83,col 20)",
        "(line 85,col 9)-(line 85,col 18)",
        "(line 86,col 9)-(line 105,col 9)",
        "(line 107,col 9)-(line 107,col 72)"
      ]
    }
  ]
}