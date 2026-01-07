{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/solvers/AbstractPolynomialSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractPolynomialSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.solvers.BaseAbstractUnivariateSolver\u003corg.apache.commons.math3.analysis.polynomials.PolynomialFunction\u003e",
        "org.apache.commons.math3.analysis.solvers.PolynomialSolver"
      ],
      "begin_line": 28,
      "end_line": 81,
      "comment": "\n * Base class for solvers.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "polynomialFunction"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Function. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.AbstractPolynomialSolver.AbstractPolynomialSolver(double)",
      "begin_line": 39,
      "end_line": 41,
      "comment": "\n     * Construct a solver with given absolute accuracy.\n     *\n     * @param absoluteAccuracy Maximum absolute error.\n     ",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.AbstractPolynomialSolver.AbstractPolynomialSolver(double, double)",
      "begin_line": 48,
      "end_line": 51,
      "comment": "\n     * Construct a solver with given accuracies.\n     *\n     * @param relativeAccuracy Maximum relative error.\n     * @param absoluteAccuracy Maximum absolute error.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.AbstractPolynomialSolver.AbstractPolynomialSolver(double, double, double)",
      "begin_line": 59,
      "end_line": 63,
      "comment": "\n     * Construct a solver with given accuracies.\n     *\n     * @param relativeAccuracy Maximum relative error.\n     * @param absoluteAccuracy Maximum absolute error.\n     * @param functionValueAccuracy Maximum function value error.\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.AbstractPolynomialSolver.setup(int, org.apache.commons.math3.analysis.polynomials.PolynomialFunction, double, double, double)",
      "begin_line": 68,
      "end_line": 73,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 54)",
        "(line 72,col 9)-(line 72,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.AbstractPolynomialSolver.getCoefficients()",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * @return the coefficients of the polynomial function.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 52)"
      ]
    }
  ]
}