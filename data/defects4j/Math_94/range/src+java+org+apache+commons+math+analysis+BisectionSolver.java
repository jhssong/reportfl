{
  "filepath": "/tmp/Math-94b/src/java/org/apache/commons/math/analysis/BisectionSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BisectionSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealSolverImpl"
      ],
      "begin_line": 30,
      "end_line": 111,
      "comment": "\n * Implements the \u003ca href\u003d\"http://mathworld.wolfram.com/Bisection.html\"\u003e\n * bisection algorithm\u003c/a\u003e for finding zeros of univariate real functions. \n * \u003cp\u003e\n * The function should be continuous but not necessarily smooth.\u003c/p\u003e\n * \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Serializable version identifier "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.BisectionSolver.BisectionSolver(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 44,
      "end_line": 47,
      "comment": "\n     * Construct a solver for the given function.\n     * \n     * @param f function to solve.\n     * @deprecated as of 2.0 the function to solve is passed as an argument\n     * to the {@link #solve(UnivariateRealFunction, double, double)} or\n     * {@link UnivariateRealSolverImpl#solve(UnivariateRealFunction, double, double, double)}\n     * method.\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.BisectionSolver.BisectionSolver()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * Construct a solver.\n     * \n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BisectionSolver.solve(double, double, double)",
      "begin_line": 58,
      "end_line": 62,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BisectionSolver.solve(double, double)",
      "begin_line": 65,
      "end_line": 69,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BisectionSolver.solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double)",
      "begin_line": 72,
      "end_line": 75,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BisectionSolver.solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double)",
      "begin_line": 78,
      "end_line": 110,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 22)",
        "(line 82,col 9)-(line 82,col 32)",
        "(line 83,col 9)-(line 83,col 17)",
        "(line 84,col 9)-(line 84,col 18)",
        "(line 85,col 9)-(line 85,col 20)",
        "(line 87,col 9)-(line 87,col 18)",
        "(line 88,col 9)-(line 107,col 9)",
        "(line 109,col 9)-(line 109,col 72)"
      ]
    }
  ]
}