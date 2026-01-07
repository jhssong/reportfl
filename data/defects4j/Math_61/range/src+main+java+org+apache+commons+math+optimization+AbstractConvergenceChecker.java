{
  "filepath": "/tmp/Math-61b/src/main/java/org/apache/commons/math/optimization/AbstractConvergenceChecker.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractConvergenceChecker",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.ConvergenceChecker\u003cPAIR\u003e"
      ],
      "begin_line": 30,
      "end_line": 89,
      "comment": "\n * Base class for all convergence checker implementations.\n *\n * @param \u003cPAIR\u003e Type of (point, value) pair.\n *\n * @version $Revision$ $Date$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_RELATIVE_THRESHOLD"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": "\n     * Default relative threshold.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ABSOLUTE_THRESHOLD"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": "\n     * Default absolute threshold.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "relativeThreshold"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n     * Relative tolerance threshold.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "absoluteThreshold"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n     * Absolute tolerance threshold.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.AbstractConvergenceChecker.AbstractConvergenceChecker()",
      "begin_line": 52,
      "end_line": 55,
      "comment": "\n     * Build an instance with default thresholds.\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 60)",
        "(line 54,col 9)-(line 54,col 60)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.AbstractConvergenceChecker.AbstractConvergenceChecker(double, double)",
      "begin_line": 63,
      "end_line": 67,
      "comment": "\n     * Build an instance with a specified thresholds.\n     *\n     * @param relativeThreshold relative tolerance threshold\n     * @param absoluteThreshold absolute tolerance threshold\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 51)",
        "(line 66,col 9)-(line 66,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.AbstractConvergenceChecker.getRelativeThreshold()",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\n     * @return the relative threshold.\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.AbstractConvergenceChecker.getAbsoluteThreshold()",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * @return the absolute threshold.\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.AbstractConvergenceChecker.converged(int, PAIR, PAIR)",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": []
    }
  ]
}