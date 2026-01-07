{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optimization/SimpleBounds.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimpleBounds",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.OptimizationData"
      ],
      "begin_line": 31,
      "end_line": 64,
      "comment": "\n * Simple optimization constraints: lower and upper bounds.\n * The valid range of the parameters is an interval that can be infinite\n * (in one or both directions).\n * \u003cbr/\u003e\n * Immutable class.\n *\n * @version $Id$\n * @deprecated As of 3.1 (to be removed in 4.0).\n * @since 3.1\n "
    },
    {
      "type": "field",
      "varNames": [
        "lower"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Lower bounds. "
    },
    {
      "type": "field",
      "varNames": [
        "upper"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Upper bounds. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.SimpleBounds.SimpleBounds(double[], double[])",
      "begin_line": 42,
      "end_line": 46,
      "comment": "\n     * @param lB Lower bounds.\n     * @param uB Upper bounds.\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 27)",
        "(line 45,col 9)-(line 45,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.SimpleBounds.getLower()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * Gets the lower bounds.\n     *\n     * @return the initial guess.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.SimpleBounds.getUpper()",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * Gets the lower bounds.\n     *\n     * @return the initial guess.\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 29)"
      ]
    }
  ]
}