{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/solvers/AbstractUnivariateDifferentiableSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractUnivariateDifferentiableSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.solvers.BaseAbstractUnivariateSolver\u003corg.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction\u003e",
        "org.apache.commons.math3.analysis.solvers.UnivariateDifferentiableSolver"
      ],
      "begin_line": 31,
      "end_line": 83,
      "comment": "\n * Provide a default implementation for several functions useful to generic\n * solvers.\n *\n * @since 3.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "function"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Function to solve. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.AbstractUnivariateDifferentiableSolver.AbstractUnivariateDifferentiableSolver(double)",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * Construct a solver with given absolute accuracy.\n     *\n     * @param absoluteAccuracy Maximum absolute error.\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.AbstractUnivariateDifferentiableSolver.AbstractUnivariateDifferentiableSolver(double, double, double)",
      "begin_line": 54,
      "end_line": 58,
      "comment": "\n     * Construct a solver with given accuracies.\n     *\n     * @param relativeAccuracy Maximum relative error.\n     * @param absoluteAccuracy Maximum absolute error.\n     * @param functionValueAccuracy Maximum function value error.\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.AbstractUnivariateDifferentiableSolver.computeObjectiveValueAndDerivative(double)",
      "begin_line": 68,
      "end_line": 72,
      "comment": "\n     * Compute the objective function value.\n     *\n     * @param point Point at which the objective function must be evaluated.\n     * @return the objective function value and derivative at specified point.\n     * @throws TooManyEvaluationsException\n     * if the maximal number of evaluations is exceeded.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 35)",
        "(line 71,col 9)-(line 71,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.AbstractUnivariateDifferentiableSolver.setup(int, org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction, double, double, double)",
      "begin_line": 77,
      "end_line": 82,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 54)",
        "(line 81,col 9)-(line 81,col 21)"
      ]
    }
  ]
}