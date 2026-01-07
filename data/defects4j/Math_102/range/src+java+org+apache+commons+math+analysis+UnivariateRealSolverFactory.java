{
  "filepath": "/tmp/Math-102b/src/java/org/apache/commons/math/analysis/UnivariateRealSolverFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnivariateRealSolverFactory",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 47,
      "end_line": 115,
      "comment": "\n * Abstract factory class used to create {@link UnivariateRealSolver} instances.\n * \u003cp\u003e\n * Solvers implementing the following algorithms are supported:\n * \u003cul\u003e\n * \u003cli\u003eBisection\u003c/li\u003e\n * \u003cli\u003eBrent\u0027s method\u003c/li\u003e\n * \u003cli\u003eSecant method\u003c/li\u003e\n * \u003c/ul\u003e\n * Concrete factories extending this class also specify a default solver, instances of which\n * are returned by \u003ccode\u003enewDefaultSolver()\u003c/code\u003e.\n * \u003cp\u003e\n * Common usage:\u003cpre\u003e\n * SolverFactory factory \u003d UnivariateRealSolverFactory.newInstance();\n *\n * // create a Brent solver to use with a UnivariateRealFunction f\n * BrentSolver solver \u003d factory.newBrentSolver(f);\n * \u003c/pre\u003e\n *\n * \u003ca href\u003d\"http://commons.apache.org/discovery/\"\u003eApache Commons Discovery\u003c/a\u003e\n * is used to determine the concrete factory returned by \n * \u003ccode\u003eUnivariateRealSolverFactory.newInstance().\u003c/code\u003e  The default is\n * {@link UnivariateRealSolverFactoryImpl}.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverFactory.UnivariateRealSolverFactory()",
      "begin_line": 51,
      "end_line": 52,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverFactory.newInstance()",
      "begin_line": 58,
      "end_line": 69,
      "comment": "\n     * Create a new factory.\n     * @return a new factory.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 51)",
        "(line 60,col 9)-(line 67,col 9)",
        "(line 68,col 9)-(line 68,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverFactory.newDefaultSolver(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 77,
      "end_line": 78,
      "comment": "\n     * Create a new {@link UnivariateRealSolver} for the given function.  The\n     * actual solver returned is determined by the underlying factory.\n     * @param f the function.\n     * @return the new solver.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverFactory.newBisectionSolver(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 86,
      "end_line": 87,
      "comment": "\n     * Create a new {@link UnivariateRealSolver} for the given function.  The\n     * solver is an implementation of the bisection method.\n     * @param f the function.\n     * @return the new solver.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverFactory.newBrentSolver(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 95,
      "end_line": 96,
      "comment": "\n     * Create a new {@link UnivariateRealSolver} for the given function.  The\n     * solver is an implementation of the Brent method.\n     * @param f the function.\n     * @return the new solver.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverFactory.newNewtonSolver(org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction)",
      "begin_line": 104,
      "end_line": 105,
      "comment": "\n     * Create a new {@link UnivariateRealSolver} for the given function.  The\n     * solver is an implementation of Newton\u0027s Method.\n     * @param f the function.\n     * @return the new solver.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverFactory.newSecantSolver(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 113,
      "end_line": 114,
      "comment": "\n     * Create a new {@link UnivariateRealSolver} for the given function.  The\n     * solver is an implementation of the secant method.\n     * @param f the function.\n     * @return the new solver.\n     ",
      "child_ranges": []
    }
  ]
}