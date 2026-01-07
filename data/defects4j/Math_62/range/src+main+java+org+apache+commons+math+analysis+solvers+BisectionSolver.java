{
  "filepath": "/tmp/Math-62b/src/main/java/org/apache/commons/math/analysis/solvers/BisectionSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BisectionSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl"
      ],
      "begin_line": 32,
      "end_line": 110,
      "comment": "\n * Implements the \u003ca href\u003d\"http://mathworld.wolfram.com/Bisection.html\"\u003e\n * bisection algorithm\u003c/a\u003e for finding zeros of univariate real functions.\n * \u003cp\u003e\n * The function should be continuous but not necessarily smooth.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.BisectionSolver.BisectionSolver(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 43,
      "end_line": 46,
      "comment": "\n     * Construct a solver for the given function.\n     *\n     * @param f function to solve.\n     * @deprecated as of 2.0 the function to solve is passed as an argument\n     * to the {@link #solve(UnivariateRealFunction, double, double)} or\n     * {@link UnivariateRealSolverImpl#solve(UnivariateRealFunction, double, double, double)}\n     * method.\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.BisectionSolver.BisectionSolver()",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * Construct a solver.\n     *\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BisectionSolver.solve(double, double, double)",
      "begin_line": 57,
      "end_line": 61,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BisectionSolver.solve(double, double)",
      "begin_line": 64,
      "end_line": 68,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BisectionSolver.solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double)",
      "begin_line": 71,
      "end_line": 74,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BisectionSolver.solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double)",
      "begin_line": 77,
      "end_line": 109,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 22)",
        "(line 81,col 9)-(line 81,col 32)",
        "(line 82,col 9)-(line 82,col 17)",
        "(line 83,col 9)-(line 83,col 18)",
        "(line 84,col 9)-(line 84,col 20)",
        "(line 86,col 9)-(line 86,col 18)",
        "(line 87,col 9)-(line 106,col 9)",
        "(line 108,col 9)-(line 108,col 72)"
      ]
    }
  ]
}