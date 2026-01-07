{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optim/AbstractConvergenceChecker.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractConvergenceChecker",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optim.ConvergenceChecker\u003cPAIR\u003e"
      ],
      "begin_line": 27,
      "end_line": 70,
      "comment": "\n * Base class for all convergence checker implementations.\n *\n * @param \u003cPAIR\u003e Type of (point, value) pair.\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "relativeThreshold"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": "\n     * Relative tolerance threshold.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "absoluteThreshold"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": "\n     * Absolute tolerance threshold.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.AbstractConvergenceChecker.AbstractConvergenceChecker(double, double)",
      "begin_line": 44,
      "end_line": 48,
      "comment": "\n     * Build an instance with a specified thresholds.\n     *\n     * @param relativeThreshold relative tolerance threshold\n     * @param absoluteThreshold absolute tolerance threshold\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 51)",
        "(line 47,col 9)-(line 47,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.AbstractConvergenceChecker.getRelativeThreshold()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * @return the relative threshold.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.AbstractConvergenceChecker.getAbsoluteThreshold()",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * @return the absolute threshold.\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.AbstractConvergenceChecker.converged(int, PAIR, PAIR)",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": []
    }
  ]
}