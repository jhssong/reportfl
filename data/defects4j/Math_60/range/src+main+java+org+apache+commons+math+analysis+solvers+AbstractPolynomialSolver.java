{
  "filepath": "/tmp/Math-60b/src/main/java/org/apache/commons/math/analysis/solvers/AbstractPolynomialSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractPolynomialSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver\u003corg.apache.commons.math.analysis.polynomials.PolynomialFunction\u003e",
        "org.apache.commons.math.analysis.solvers.PolynomialSolver"
      ],
      "begin_line": 28,
      "end_line": 82,
      "comment": "\n * Base class for solvers.\n *\n * @version $Revision$ $Date$\n * @since 3.0\n "
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
      "signature": "org.apache.commons.math.analysis.solvers.AbstractPolynomialSolver.AbstractPolynomialSolver(double)",
      "begin_line": 39,
      "end_line": 41,
      "comment": "\n     * Construct a solver with given absolute accuracy.\n     *\n     * @param absoluteAccuracy Maximum absolute error.\n     ",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.AbstractPolynomialSolver.AbstractPolynomialSolver(double, double)",
      "begin_line": 48,
      "end_line": 51,
      "comment": "\n     * Construct a solver with given accuracies.\n     *\n     * @param relativeAccuracy Maximum relative error.\n     * @param absoluteAccuracy Maximum absolute error.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.AbstractPolynomialSolver.AbstractPolynomialSolver(double, double, double)",
      "begin_line": 59,
      "end_line": 63,
      "comment": "\n     * Construct a solver with given accuracies.\n     *\n     * @param relativeAccuracy Maximum relative error.\n     * @param absoluteAccuracy Maximum absolute error.\n     * @param functionValueAccuracy Maximum function value error.\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.AbstractPolynomialSolver.setup(org.apache.commons.math.analysis.polynomials.PolynomialFunction, double, double, double)",
      "begin_line": 68,
      "end_line": 74,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 45)",
        "(line 73,col 9)-(line 73,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.AbstractPolynomialSolver.getCoefficients()",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * @return the coefficients of the polynomial function.\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 52)"
      ]
    }
  ]
}