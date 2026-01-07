{
  "filepath": "/tmp/Math-106b/src/java/org/apache/commons/math/analysis/UnivariateRealSolverFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnivariateRealSolverFactory",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 46,
      "end_line": 114,
      "comment": "\n * Abstract factory class used to create {@link UnivariateRealSolver} instances.\n * \u003cp\u003e\n * Solvers implementing the following algorithms are supported:\n * \u003cul\u003e\n * \u003cli\u003eBisection\u003c/li\u003e\n * \u003cli\u003eBrent\u0027s method\u003c/li\u003e\n * \u003cli\u003eSecant method\u003c/li\u003e\n * \u003c/ul\u003e\n * Concrete factories extending this class also specify a default solver, instances of which\n * are returned by \u003ccode\u003enewDefaultSolver()\u003c/code\u003e.\n * \u003cp\u003e\n * Common usage:\u003cpre\u003e\n * SolverFactory factory \u003d UnivariateRealSolverFactory.newInstance();\n *\n * // create a Brent solver to use with a UnivariateRealFunction f\n * BrentSolver solver \u003d factory.newBrentSolver(f);\n * \u003c/pre\u003e\n *\n * \u003ca href\u003d\"http://jakarta.apache.org/commons/discovery/\"\u003eJakarta Commons Discovery\u003c/a\u003e\n * is used to determine the concrete factory returned by \n * \u003ccode\u003eUnivariateRealSolverFactory.newInstance().\u003c/code\u003e  The default is\n * {@link UnivariateRealSolverFactoryImpl}.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverFactory.UnivariateRealSolverFactory()",
      "begin_line": 50,
      "end_line": 51,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverFactory.newInstance()",
      "begin_line": 57,
      "end_line": 68,
      "comment": "\n     * Create a new factory.\n     * @return a new factory.\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 51)",
        "(line 59,col 9)-(line 66,col 9)",
        "(line 67,col 9)-(line 67,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverFactory.newDefaultSolver(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 76,
      "end_line": 77,
      "comment": "\n     * Create a new {@link UnivariateRealSolver} for the given function.  The\n     * actual solver returned is determined by the underlying factory.\n     * @param f the function.\n     * @return the new solver.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverFactory.newBisectionSolver(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 85,
      "end_line": 86,
      "comment": "\n     * Create a new {@link UnivariateRealSolver} for the given function.  The\n     * solver is an implementation of the bisection method.\n     * @param f the function.\n     * @return the new solver.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverFactory.newBrentSolver(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 94,
      "end_line": 95,
      "comment": "\n     * Create a new {@link UnivariateRealSolver} for the given function.  The\n     * solver is an implementation of the Brent method.\n     * @param f the function.\n     * @return the new solver.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverFactory.newNewtonSolver(org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction)",
      "begin_line": 103,
      "end_line": 104,
      "comment": "\n     * Create a new {@link UnivariateRealSolver} for the given function.  The\n     * solver is an implementation of Newton\u0027s Method.\n     * @param f the function.\n     * @return the new solver.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverFactory.newSecantSolver(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 112,
      "end_line": 113,
      "comment": "\n     * Create a new {@link UnivariateRealSolver} for the given function.  The\n     * solver is an implementation of the secant method.\n     * @param f the function.\n     * @return the new solver.\n     ",
      "child_ranges": []
    }
  ]
}