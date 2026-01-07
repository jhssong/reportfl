{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optim/nonlinear/vector/MultiStartMultivariateVectorOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultiStartMultivariateVectorOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optim.BaseMultiStartMultivariateOptimizer\u003corg.apache.commons.math3.optim.PointVectorValuePair\u003e"
      ],
      "begin_line": 42,
      "end_line": 121,
      "comment": "\n * Multi-start optimizer for a (vector) model function.\n *\n * This class wraps an optimizer in order to use it several times in\n * turn with different starting points (trying to avoid being trapped\n * in a local extremum when looking for a global one).\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "optimizer"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Underlying optimizer. "
    },
    {
      "type": "field",
      "varNames": [
        "optima"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Found optima. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.MultiStartMultivariateVectorOptimizer.MultiStartMultivariateVectorOptimizer(org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer, int, org.apache.commons.math3.random.RandomVectorGenerator)",
      "begin_line": 61,
      "end_line": 68,
      "comment": "\n     * Create a multi-start optimizer from a single-start optimizer.\n     *\n     * @param optimizer Single-start optimizer to wrap.\n     * @param starts Number of starts to perform.\n     * If {@code starts \u003d\u003d 1}, the result will be same as if {@code optimizer}\n     * is called directly.\n     * @param generator Random vector generator to use for restarts.\n     * @throws NullArgumentException if {@code optimizer} or {@code generator}\n     * is {@code null}.\n     * @throws NotStrictlyPositiveException if {@code starts \u003c 1}.\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 44)",
        "(line 67,col 9)-(line 67,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.MultiStartMultivariateVectorOptimizer.getOptima()",
      "begin_line": 73,
      "end_line": 77,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 54)",
        "(line 76,col 9)-(line 76,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.MultiStartMultivariateVectorOptimizer.store(org.apache.commons.math3.optim.PointVectorValuePair)",
      "begin_line": 82,
      "end_line": 85,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.MultiStartMultivariateVectorOptimizer.clear()",
      "begin_line": 90,
      "end_line": 93,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.MultiStartMultivariateVectorOptimizer.getPairComparator()",
      "begin_line": 98,
      "end_line": 120,
      "comment": "\n     * @return a comparator for sorting the optima.\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 119,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "target"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "weight"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.MultiStartMultivariateVectorOptimizer.Anonymous-28221863-fead-4a7f-ac3b-da573cbdfd1a.compare(org.apache.commons.math3.optim.PointVectorValuePair, org.apache.commons.math3.optim.PointVectorValuePair)",
      "begin_line": 103,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 105,col 17)-(line 109,col 17)",
        "(line 110,col 17)-(line 111,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.MultiStartMultivariateVectorOptimizer.Anonymous-7c6c7e1f-cf1e-4df0-bfb6-1ee28f0171f1.weightedResidual(org.apache.commons.math3.optim.PointVectorValuePair)",
      "begin_line": 114,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 115,col 17)-(line 115,col 82)",
        "(line 116,col 17)-(line 116,col 56)",
        "(line 117,col 17)-(line 117,col 55)"
      ]
    }
  ]
}