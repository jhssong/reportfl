{
  "filepath": "/tmp/Math-63b/src/main/java/org/apache/commons/math/optimization/AbstractConvergenceChecker.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractConvergenceChecker",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.ConvergenceChecker\u003cT\u003e"
      ],
      "begin_line": 28,
      "end_line": 85,
      "comment": "\n * Base class for all convergence checker implementations.\n *\n * @version $Revision$ $Date$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_RELATIVE_THRESHOLD"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": "\n     * Default relative threshold.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ABSOLUTE_THRESHOLD"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": "\n     * Default absolute threshold.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "relativeThreshold"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": "\n     * Relative tolerance threshold.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "absoluteThreshold"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * Absolute tolerance threshold.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.AbstractConvergenceChecker.AbstractConvergenceChecker()",
      "begin_line": 50,
      "end_line": 53,
      "comment": "\n     * Build an instance with default thresholds.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 60)",
        "(line 52,col 9)-(line 52,col 60)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.AbstractConvergenceChecker.AbstractConvergenceChecker(double, double)",
      "begin_line": 61,
      "end_line": 65,
      "comment": "\n     * Build an instance with a specified thresholds.\n     *\n     * @param relativeThreshold relative tolerance threshold\n     * @param absoluteThreshold absolute tolerance threshold\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 51)",
        "(line 64,col 9)-(line 64,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.AbstractConvergenceChecker.getRelativeThreshold()",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.AbstractConvergenceChecker.getAbsoluteThreshold()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.AbstractConvergenceChecker.converged(int, T...)",
      "begin_line": 84,
      "end_line": 84,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": []
    }
  ]
}