{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/solvers/AbstractDifferentiableUnivariateSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractDifferentiableUnivariateSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.solvers.BaseAbstractUnivariateSolver\u003corg.apache.commons.math3.analysis.DifferentiableUnivariateFunction\u003e",
        "org.apache.commons.math3.analysis.solvers.DifferentiableUnivariateSolver"
      ],
      "begin_line": 32,
      "end_line": 83,
      "comment": "\n * Provide a default implementation for several functions useful to generic\n * solvers.\n *\n * @since 3.0\n * @version $Id$\n * @deprecated as of 3.1, replaced by {@link AbstractUnivariateDifferentiableSolver}\n "
    },
    {
      "type": "field",
      "varNames": [
        "functionDerivative"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Derivative of the function to solve. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.AbstractDifferentiableUnivariateSolver.AbstractDifferentiableUnivariateSolver(double)",
      "begin_line": 44,
      "end_line": 46,
      "comment": "\n     * Construct a solver with given absolute accuracy.\n     *\n     * @param absoluteAccuracy Maximum absolute error.\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.AbstractDifferentiableUnivariateSolver.AbstractDifferentiableUnivariateSolver(double, double, double)",
      "begin_line": 55,
      "end_line": 59,
      "comment": "\n     * Construct a solver with given accuracies.\n     *\n     * @param relativeAccuracy Maximum relative error.\n     * @param absoluteAccuracy Maximum absolute error.\n     * @param functionValueAccuracy Maximum function value error.\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.AbstractDifferentiableUnivariateSolver.computeDerivativeObjectiveValue(double)",
      "begin_line": 68,
      "end_line": 72,
      "comment": "\n     * Compute the objective function value.\n     *\n     * @param point Point at which the objective function must be evaluated.\n     * @return the objective function value at specified point.\n     * @throws TooManyEvaluationsException if the maximal number of evaluations is exceeded.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 35)",
        "(line 71,col 9)-(line 71,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.AbstractDifferentiableUnivariateSolver.setup(int, org.apache.commons.math3.analysis.DifferentiableUnivariateFunction, double, double, double)",
      "begin_line": 77,
      "end_line": 82,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 54)",
        "(line 81,col 9)-(line 81,col 44)"
      ]
    }
  ]
}