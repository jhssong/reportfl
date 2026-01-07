{
  "filepath": "/tmp/Math-20b/src/main/java/org/apache/commons/math3/analysis/solvers/AbstractUnivariateDifferentiableSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractUnivariateDifferentiableSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.solvers.BaseAbstractUnivariateSolver\u003corg.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction\u003e",
        "org.apache.commons.math3.analysis.solvers.UnivariateDifferentiableSolver"
      ],
      "begin_line": 30,
      "end_line": 81,
      "comment": "\n * Provide a default implementation for several functions useful to generic\n * solvers.\n *\n * @since 3.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "function"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Function to solve. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.AbstractUnivariateDifferentiableSolver.AbstractUnivariateDifferentiableSolver(double)",
      "begin_line": 42,
      "end_line": 44,
      "comment": "\n     * Construct a solver with given absolute accuracy.\n     *\n     * @param absoluteAccuracy Maximum absolute error.\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.AbstractUnivariateDifferentiableSolver.AbstractUnivariateDifferentiableSolver(double, double, double)",
      "begin_line": 53,
      "end_line": 57,
      "comment": "\n     * Construct a solver with given accuracies.\n     *\n     * @param relativeAccuracy Maximum relative error.\n     * @param absoluteAccuracy Maximum absolute error.\n     * @param functionValueAccuracy Maximum function value error.\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.AbstractUnivariateDifferentiableSolver.computeObjectiveValueAndDerivative(double)",
      "begin_line": 67,
      "end_line": 70,
      "comment": "\n     * Compute the objective function value.\n     *\n     * @param point Point at which the objective function must be evaluated.\n     * @return the objective function value and derivative at specified point.\n     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException\n     * if the maximal number of evaluations is exceeded.\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 35)",
        "(line 69,col 9)-(line 69,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.AbstractUnivariateDifferentiableSolver.setup(int, org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction, double, double, double)",
      "begin_line": 75,
      "end_line": 80,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 54)",
        "(line 79,col 9)-(line 79,col 21)"
      ]
    }
  ]
}