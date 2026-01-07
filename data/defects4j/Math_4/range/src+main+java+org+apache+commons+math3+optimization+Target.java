{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optimization/Target.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Target",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.OptimizationData"
      ],
      "begin_line": 31,
      "end_line": 51,
      "comment": "\n * Target of the optimization procedure.\n * They are the values which the objective vector function must reproduce\n * When the parameters of the model have been optimized.\n * \u003cbr/\u003e\n * Immutable class.\n *\n * @version $Id$\n * @deprecated As of 3.1 (to be removed in 4.0).\n * @since 3.1\n "
    },
    {
      "type": "field",
      "varNames": [
        "target"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Target values (of the objective vector function). "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.Target.Target(double[])",
      "begin_line": 39,
      "end_line": 41,
      "comment": "\n     * @param observations Target values.\n     ",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.Target.getTarget()",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * Gets the initial guess.\n     *\n     * @return the initial guess.\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 30)"
      ]
    }
  ]
}