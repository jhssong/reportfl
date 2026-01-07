{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optim/SimpleBounds.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimpleBounds",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optim.OptimizationData"
      ],
      "begin_line": 31,
      "end_line": 80,
      "comment": "\n * Simple optimization constraints: lower and upper bounds.\n * The valid range of the parameters is an interval that can be infinite\n * (in one or both directions).\n * \u003cbr/\u003e\n * Immutable class.\n *\n * @version $Id$\n * @since 3.1\n "
    },
    {
      "type": "field",
      "varNames": [
        "lower"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Lower bounds. "
    },
    {
      "type": "field",
      "varNames": [
        "upper"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Upper bounds. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.SimpleBounds.SimpleBounds(double[], double[])",
      "begin_line": 41,
      "end_line": 45,
      "comment": "\n     * @param lB Lower bounds.\n     * @param uB Upper bounds.\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 27)",
        "(line 44,col 9)-(line 44,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.SimpleBounds.getLower()",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * Gets the lower bounds.\n     *\n     * @return the lower bounds.\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.SimpleBounds.getUpper()",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * Gets the upper bounds.\n     *\n     * @return the upper bounds.\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.SimpleBounds.unbounded(int)",
      "begin_line": 72,
      "end_line": 79,
      "comment": "\n     * Factory method that creates instance of this class that represents\n     * unbounded ranges.\n     *\n     * @param dim Number of parameters.\n     * @return a new instance suitable for passing to an optimizer that\n     * requires bounds specification.\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 44)",
        "(line 74,col 9)-(line 74,col 50)",
        "(line 75,col 9)-(line 75,col 44)",
        "(line 76,col 9)-(line 76,col 50)",
        "(line 78,col 9)-(line 78,col 40)"
      ]
    }
  ]
}