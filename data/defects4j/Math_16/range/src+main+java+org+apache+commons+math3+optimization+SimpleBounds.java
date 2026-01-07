{
  "filepath": "/tmp/Math-16b/src/main/java/org/apache/commons/math3/optimization/SimpleBounds.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimpleBounds",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.OptimizationData"
      ],
      "begin_line": 30,
      "end_line": 62,
      "comment": "\n * Simple optimization constraints: lower and upper bounds.\n * The valid range of the parameters is an interval that can be infinite\n * (in one or both directions).\n * \u003cbr/\u003e\n * Immutable class.\n *\n * @version $Id$\n * @since 3.1\n "
    },
    {
      "type": "field",
      "varNames": [
        "lower"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Lower bounds. "
    },
    {
      "type": "field",
      "varNames": [
        "upper"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Upper bounds. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.SimpleBounds.SimpleBounds(double[], double[])",
      "begin_line": 40,
      "end_line": 44,
      "comment": "\n     * @param lB Lower bounds.\n     * @param uB Upper bounds.\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 27)",
        "(line 43,col 9)-(line 43,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.SimpleBounds.getLower()",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n     * Gets the lower bounds.\n     *\n     * @return the initial guess.\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.SimpleBounds.getUpper()",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * Gets the lower bounds.\n     *\n     * @return the initial guess.\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 29)"
      ]
    }
  ]
}