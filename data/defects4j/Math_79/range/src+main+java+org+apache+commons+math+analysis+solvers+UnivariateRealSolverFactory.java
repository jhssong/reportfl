{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/analysis/solvers/UnivariateRealSolverFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnivariateRealSolverFactory",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 40,
      "end_line": 90,
      "comment": "\n * Abstract factory class used to create {@link UnivariateRealSolver} instances.\n * \u003cp\u003e\n * Solvers implementing the following algorithms are supported:\n * \u003cul\u003e\n * \u003cli\u003eBisection\u003c/li\u003e\n * \u003cli\u003eBrent\u0027s method\u003c/li\u003e\n * \u003cli\u003eSecant method\u003c/li\u003e\n * \u003c/ul\u003e\n * Concrete factories extending this class also specify a default solver, instances of which\n * are returned by \u003ccode\u003enewDefaultSolver()\u003c/code\u003e.\u003c/p\u003e\n * \u003cp\u003e\n * Common usage:\u003cpre\u003e\n * SolverFactory factory \u003d UnivariateRealSolverFactory.newInstance();\u003c/p\u003e\n *\n * // create a Brent solver to use\n * BrentSolver solver \u003d factory.newBrentSolver();\n * \u003c/pre\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverFactory.UnivariateRealSolverFactory()",
      "begin_line": 44,
      "end_line": 45,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverFactory.newInstance()",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n     * Create a new factory.\n     * @return a new factory.\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverFactory.newDefaultSolver()",
      "begin_line": 60,
      "end_line": 60,
      "comment": "\n     * Create a new {@link UnivariateRealSolver}.  The\n     * actual solver returned is determined by the underlying factory.\n     * @return the new solver.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverFactory.newBisectionSolver()",
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n     * Create a new {@link UnivariateRealSolver}.  The\n     * solver is an implementation of the bisection method.\n     * @return the new solver.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverFactory.newBrentSolver()",
      "begin_line": 74,
      "end_line": 74,
      "comment": "\n     * Create a new {@link UnivariateRealSolver}.  The\n     * solver is an implementation of the Brent method.\n     * @return the new solver.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverFactory.newNewtonSolver()",
      "begin_line": 81,
      "end_line": 81,
      "comment": "\n     * Create a new {@link UnivariateRealSolver}.  The\n     * solver is an implementation of Newton\u0027s Method.\n     * @return the new solver.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolverFactory.newSecantSolver()",
      "begin_line": 88,
      "end_line": 88,
      "comment": "\n     * Create a new {@link UnivariateRealSolver}.  The\n     * solver is an implementation of the secant method.\n     * @return the new solver.\n     ",
      "child_ranges": []
    }
  ]
}