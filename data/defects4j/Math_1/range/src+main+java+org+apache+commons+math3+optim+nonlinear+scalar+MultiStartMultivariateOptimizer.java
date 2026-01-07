{
  "filepath": "/tmp/Math-1b/src/main/java/org/apache/commons/math3/optim/nonlinear/scalar/MultiStartMultivariateOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultiStartMultivariateOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optim.BaseMultiStartMultivariateOptimizer\u003corg.apache.commons.math3.optim.PointValuePair\u003e"
      ],
      "begin_line": 39,
      "end_line": 111,
      "comment": "\n * Multi-start optimizer.\n *\n * This class wraps an optimizer in order to use it several times in\n * turn with different starting points (trying to avoid being trapped\n * in a local extremum when looking for a global one).\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "optimizer"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Underlying optimizer. "
    },
    {
      "type": "field",
      "varNames": [
        "optima"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Found optima. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.MultiStartMultivariateOptimizer.MultiStartMultivariateOptimizer(org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer, int, org.apache.commons.math3.random.RandomVectorGenerator)",
      "begin_line": 58,
      "end_line": 65,
      "comment": "\n     * Create a multi-start optimizer from a single-start optimizer.\n     *\n     * @param optimizer Single-start optimizer to wrap.\n     * @param starts Number of starts to perform.\n     * If {@code starts \u003d\u003d 1}, the result will be same as if {@code optimizer}\n     * is called directly.\n     * @param generator Random vector generator to use for restarts.\n     * @throws NullArgumentException if {@code optimizer} or {@code generator}\n     * is {@code null}.\n     * @throws NotStrictlyPositiveException if {@code starts \u003c 1}.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 44)",
        "(line 64,col 9)-(line 64,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.MultiStartMultivariateOptimizer.getOptima()",
      "begin_line": 70,
      "end_line": 74,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 54)",
        "(line 73,col 9)-(line 73,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.MultiStartMultivariateOptimizer.store(org.apache.commons.math3.optim.PointValuePair)",
      "begin_line": 79,
      "end_line": 82,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.MultiStartMultivariateOptimizer.clear()",
      "begin_line": 87,
      "end_line": 90,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.MultiStartMultivariateOptimizer.getPairComparator()",
      "begin_line": 95,
      "end_line": 110,
      "comment": "\n     * @return a comparator for sorting the optima.\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 109,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.MultiStartMultivariateOptimizer.Anonymous-0153495d-6540-45e9-bfd4-835d60630e6c.compare(org.apache.commons.math3.optim.PointValuePair, org.apache.commons.math3.optim.PointValuePair)",
      "begin_line": 97,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 99,col 17)-(line 103,col 17)",
        "(line 104,col 17)-(line 104,col 48)",
        "(line 105,col 17)-(line 105,col 48)",
        "(line 106,col 17)-(line 107,col 68)"
      ]
    }
  ]
}