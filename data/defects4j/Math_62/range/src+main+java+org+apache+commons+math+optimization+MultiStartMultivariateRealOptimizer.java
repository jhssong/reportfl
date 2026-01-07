{
  "filepath": "/tmp/Math-62b/src/main/java/org/apache/commons/math/optimization/MultiStartMultivariateRealOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultiStartMultivariateRealOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.BaseMultiStartMultivariateRealOptimizer\u003corg.apache.commons.math.analysis.MultivariateRealFunction\u003e",
        "org.apache.commons.math.optimization.MultivariateRealOptimizer"
      ],
      "begin_line": 34,
      "end_line": 51,
      "comment": "\n * Special implementation of the {@link MultivariateRealOptimizer} interface adding\n * multi-start features to an existing optimizer.\n *\n * This class wraps a classical optimizer to use it several times in\n * turn with different starting points in order to avoid being trapped\n * into a local extremum when looking for a global one.\n *\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.MultiStartMultivariateRealOptimizer.MultiStartMultivariateRealOptimizer(org.apache.commons.math.optimization.MultivariateRealOptimizer, int, org.apache.commons.math.random.RandomVectorGenerator)",
      "begin_line": 46,
      "end_line": 50,
      "comment": "\n     * Create a multi-start optimizer from a single-start optimizer.\n     *\n     * @param optimizer Single-start optimizer to wrap.\n     * @param starts Number of starts to perform (including the\n     * first one), multi-start is disabled if value is less than or\n     * equal to 1.\n     * @param generator Random vector generator to use for restarts.\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 44)"
      ]
    }
  ]
}