{
  "filepath": "/tmp/Math-106b/src/java/org/apache/commons/math/analysis/UnivariateRealSolverFactoryImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnivariateRealSolverFactoryImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealSolverFactory"
      ],
      "begin_line": 26,
      "end_line": 88,
      "comment": "\n * A concrete {@link  UnivariateRealSolverFactory}.  This is the default solver factory\n * used by commons-math.\n * \u003cp\u003e\n * The default solver returned by this factory is a {@link BrentSolver}.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverFactoryImpl.UnivariateRealSolverFactoryImpl()",
      "begin_line": 31,
      "end_line": 32,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverFactoryImpl.newDefaultSolver(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * Create a new {@link UnivariateRealSolver} for the given function.  The\n     * actual solver returned is determined by the underlying factory.\n     * \n     * This factory returns a {@link BrentSolver} instance.\n     *\n     * @param f the function.\n     * @return the new solver.\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverFactoryImpl.newBisectionSolver(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * Create a new {@link UnivariateRealSolver} for the given function.  The\n     * solver is an implementation of the bisection method.\n     * @param f the function.\n     * @return the new solver.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverFactoryImpl.newBrentSolver(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * Create a new {@link UnivariateRealSolver} for the given function.  The\n     * solver is an implementation of the Brent method.\n     * @param f the function.\n     * @return the new solver.\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverFactoryImpl.newNewtonSolver(org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction)",
      "begin_line": 73,
      "end_line": 77,
      "comment": "\n     * Create a new {@link UnivariateRealSolver} for the given function.  The\n     * solver is an implementation of Newton\u0027s Method.\n     * @param f the function.\n     * @return the new solver.\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolverFactoryImpl.newSecantSolver(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * Create a new {@link UnivariateRealSolver} for the given function.  The\n     * solver is an implementation of the secant method.\n     * @param f the function.\n     * @return the new solver.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 35)"
      ]
    }
  ]
}