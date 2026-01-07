{
  "filepath": "/tmp/Math-1b/src/main/java/org/apache/commons/math3/optim/nonlinear/vector/Target.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Target",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optim.OptimizationData"
      ],
      "begin_line": 35,
      "end_line": 55,
      "comment": "\n * Target of the optimization procedure.\n * They are the values which the objective vector function must reproduce\n * When the parameters of the model have been optimized.\n * \u003cbr/\u003e\n * Immutable class.\n *\n * @version $Id$\n * @since 3.1\n * @deprecated All classes and interfaces in this package are deprecated.\n * The optimizers that were provided here were moved to the\n * {@link org.apache.commons.math3.fitting.leastsquares} package\n * (cf. MATH-1008).\n "
    },
    {
      "type": "field",
      "varNames": [
        "target"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Target values (of the objective vector function). "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.Target.Target(double[])",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * @param observations Target values.\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.Target.getTarget()",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * Gets the initial guess.\n     *\n     * @return the initial guess.\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 30)"
      ]
    }
  ]
}