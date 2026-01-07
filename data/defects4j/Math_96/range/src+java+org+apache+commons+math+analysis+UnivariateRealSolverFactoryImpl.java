{
  "filepath": "/tmp/Math-96b/src/java/org/apache/commons/math/analysis/UnivariateRealSolverFactoryImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnivariateRealSolverFactoryImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealSolverFactory"
      ],
      "begin_line": 27,
      "end_line": 89,
      "comment": "\n * A concrete {@link  UnivariateRealSolverFactory}.  This is the default solver factory\n * used by commons-math.\n * \u003cp\u003e\n * The default solver returned by this factory is a {@link BrentSolver}.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverFactoryImpl.UnivariateRealSolverFactoryImpl()",
      "begin_line": 32,
      "end_line": 33,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverFactoryImpl.newDefaultSolver(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 44,
      "end_line": 46,
      "comment": "\n     * Create a new {@link UnivariateRealSolver} for the given function.  The\n     * actual solver returned is determined by the underlying factory.\n     * \n     * This factory returns a {@link BrentSolver} instance.\n     *\n     * @param f the function.\n     * @return the new solver.\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverFactoryImpl.newBisectionSolver(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Create a new {@link UnivariateRealSolver} for the given function.  The\n     * solver is an implementation of the bisection method.\n     * @param f the function.\n     * @return the new solver.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverFactoryImpl.newBrentSolver(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * Create a new {@link UnivariateRealSolver} for the given function.  The\n     * solver is an implementation of the Brent method.\n     * @param f the function.\n     * @return the new solver.\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverFactoryImpl.newNewtonSolver(org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction)",
      "begin_line": 74,
      "end_line": 78,
      "comment": "\n     * Create a new {@link UnivariateRealSolver} for the given function.  The\n     * solver is an implementation of Newton\u0027s Method.\n     * @param f the function.\n     * @return the new solver.\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverFactoryImpl.newSecantSolver(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * Create a new {@link UnivariateRealSolver} for the given function.  The\n     * solver is an implementation of the secant method.\n     * @param f the function.\n     * @return the new solver.\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 35)"
      ]
    }
  ]
}