{
  "filepath": "/tmp/Math-59b/src/main/java/org/apache/commons/math/analysis/solvers/AbstractUnivariateRealSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractUnivariateRealSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver\u003corg.apache.commons.math.analysis.UnivariateRealFunction\u003e",
        "org.apache.commons.math.analysis.solvers.UnivariateRealSolver"
      ],
      "begin_line": 28,
      "end_line": 61,
      "comment": "\n * Base class for solvers.\n *\n * @version $Revision$ $Date$\n * @since 3.0\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.AbstractUnivariateRealSolver.AbstractUnivariateRealSolver(double)",
      "begin_line": 36,
      "end_line": 38,
      "comment": "\n     * Construct a solver with given absolute accuracy.\n     *\n     * @param absoluteAccuracy Maximum absolute error.\n     ",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.AbstractUnivariateRealSolver.AbstractUnivariateRealSolver(double, double)",
      "begin_line": 45,
      "end_line": 48,
      "comment": "\n     * Construct a solver with given accuracies.\n     *\n     * @param relativeAccuracy Maximum relative error.\n     * @param absoluteAccuracy Maximum absolute error.\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.AbstractUnivariateRealSolver.AbstractUnivariateRealSolver(double, double, double)",
      "begin_line": 56,
      "end_line": 60,
      "comment": "\n     * Construct a solver with given accuracies.\n     *\n     * @param relativeAccuracy Maximum relative error.\n     * @param absoluteAccuracy Maximum absolute error.\n     * @param functionValueAccuracy Maximum function value error.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 73)"
      ]
    }
  ]
}