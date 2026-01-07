{
  "filepath": "/tmp/Math-16b/src/main/java/org/apache/commons/math3/optimization/MultivariateDifferentiableVectorMultiStartOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultivariateDifferentiableVectorMultiStartOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.BaseMultivariateVectorMultiStartOptimizer\u003corg.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction\u003e",
        "org.apache.commons.math3.optimization.MultivariateDifferentiableVectorOptimizer"
      ],
      "begin_line": 34,
      "end_line": 52,
      "comment": "\n * Special implementation of the {@link MultivariateDifferentiableVectorOptimizer}\n * interface adding multi-start features to an existing optimizer.\n *\n * This class wraps a classical optimizer to use it several times in\n * turn with different starting points in order to avoid being trapped\n * into a local extremum when looking for a global one.\n *\n * @version $Id$\n * @since 3.1\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.MultivariateDifferentiableVectorMultiStartOptimizer.MultivariateDifferentiableVectorMultiStartOptimizer(org.apache.commons.math3.optimization.MultivariateDifferentiableVectorOptimizer, int, org.apache.commons.math3.random.RandomVectorGenerator)",
      "begin_line": 46,
      "end_line": 51,
      "comment": "\n     * Create a multi-start optimizer from a single-start optimizer.\n     *\n     * @param optimizer Single-start optimizer to wrap.\n     * @param starts Number of starts to perform (including the\n     * first one), multi-start is disabled if value is less than or\n     * equal to 1.\n     * @param generator Random vector generator to use for restarts.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 44)"
      ]
    }
  ]
}