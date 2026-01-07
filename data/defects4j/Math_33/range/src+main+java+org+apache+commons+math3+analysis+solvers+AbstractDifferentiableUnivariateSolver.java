{
  "filepath": "/tmp/Math-33b/src/main/java/org/apache/commons/math3/analysis/solvers/AbstractDifferentiableUnivariateSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractDifferentiableUnivariateSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.solvers.BaseAbstractUnivariateSolver\u003corg.apache.commons.math3.analysis.DifferentiableUnivariateFunction\u003e",
        "org.apache.commons.math3.analysis.solvers.DifferentiableUnivariateSolver"
      ],
      "begin_line": 30,
      "end_line": 80,
      "comment": "\n * Provide a default implementation for several functions useful to generic\n * solvers.\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "functionDerivative"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Derivative of the function to solve. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.AbstractDifferentiableUnivariateSolver.AbstractDifferentiableUnivariateSolver(double)",
      "begin_line": 41,
      "end_line": 43,
      "comment": "\n     * Construct a solver with given absolute accuracy.\n     *\n     * @param absoluteAccuracy Maximum absolute error.\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.AbstractDifferentiableUnivariateSolver.AbstractDifferentiableUnivariateSolver(double, double, double)",
      "begin_line": 52,
      "end_line": 56,
      "comment": "\n     * Construct a solver with given accuracies.\n     *\n     * @param relativeAccuracy Maximum relative error.\n     * @param absoluteAccuracy Maximum absolute error.\n     * @param functionValueAccuracy Maximum function value error.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.AbstractDifferentiableUnivariateSolver.computeDerivativeObjectiveValue(double)",
      "begin_line": 66,
      "end_line": 69,
      "comment": "\n     * Compute the objective function value.\n     *\n     * @param point Point at which the objective function must be evaluated.\n     * @return the objective function value at specified point.\n     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException\n     * if the maximal number of evaluations is exceeded.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 35)",
        "(line 68,col 9)-(line 68,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.AbstractDifferentiableUnivariateSolver.setup(int, org.apache.commons.math3.analysis.DifferentiableUnivariateFunction, double, double, double)",
      "begin_line": 74,
      "end_line": 79,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 54)",
        "(line 78,col 9)-(line 78,col 44)"
      ]
    }
  ]
}