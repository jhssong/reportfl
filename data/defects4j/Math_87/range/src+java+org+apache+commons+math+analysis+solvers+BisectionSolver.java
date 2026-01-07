{
  "filepath": "/tmp/Math-87b/src/java/org/apache/commons/math/analysis/solvers/BisectionSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BisectionSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl"
      ],
      "begin_line": 31,
      "end_line": 112,
      "comment": "\n * Implements the \u003ca href\u003d\"http://mathworld.wolfram.com/Bisection.html\"\u003e\n * bisection algorithm\u003c/a\u003e for finding zeros of univariate real functions. \n * \u003cp\u003e\n * The function should be continuous but not necessarily smooth.\u003c/p\u003e\n * \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Serializable version identifier "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.BisectionSolver.BisectionSolver(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 45,
      "end_line": 48,
      "comment": "\n     * Construct a solver for the given function.\n     * \n     * @param f function to solve.\n     * @deprecated as of 2.0 the function to solve is passed as an argument\n     * to the {@link #solve(UnivariateRealFunction, double, double)} or\n     * {@link UnivariateRealSolverImpl#solve(UnivariateRealFunction, double, double, double)}\n     * method.\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.BisectionSolver.BisectionSolver()",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Construct a solver.\n     * \n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BisectionSolver.solve(double, double, double)",
      "begin_line": 59,
      "end_line": 63,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BisectionSolver.solve(double, double)",
      "begin_line": 66,
      "end_line": 70,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BisectionSolver.solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double)",
      "begin_line": 73,
      "end_line": 76,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BisectionSolver.solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double)",
      "begin_line": 79,
      "end_line": 111,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 22)",
        "(line 83,col 9)-(line 83,col 32)",
        "(line 84,col 9)-(line 84,col 17)",
        "(line 85,col 9)-(line 85,col 18)",
        "(line 86,col 9)-(line 86,col 20)",
        "(line 88,col 9)-(line 88,col 18)",
        "(line 89,col 9)-(line 108,col 9)",
        "(line 110,col 9)-(line 110,col 72)"
      ]
    }
  ]
}