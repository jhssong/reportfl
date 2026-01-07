{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optimization/AbstractConvergenceChecker.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractConvergenceChecker",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.ConvergenceChecker\u003cPAIR\u003e"
      ],
      "begin_line": 31,
      "end_line": 103,
      "comment": "\n * Base class for all convergence checker implementations.\n *\n * @param \u003cPAIR\u003e Type of (point, value) pair.\n *\n * @version $Id$\n * @deprecated As of 3.1 (to be removed in 4.0).\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_RELATIVE_THRESHOLD"
      ],
      "begin_line": 39,
      "end_line": 40,
      "comment": "\n     * Default relative threshold.\n     * @deprecated in 3.1 (to be removed in 4.0) because this value is too small\n     * to be useful as a default (cf. MATH-798).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ABSOLUTE_THRESHOLD"
      ],
      "begin_line": 46,
      "end_line": 47,
      "comment": "\n     * Default absolute threshold.\n     * @deprecated in 3.1 (to be removed in 4.0) because this value is too small\n     * to be useful as a default (cf. MATH-798).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "relativeThreshold"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": "\n     * Relative tolerance threshold.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "absoluteThreshold"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": "\n     * Absolute tolerance threshold.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.AbstractConvergenceChecker.AbstractConvergenceChecker()",
      "begin_line": 65,
      "end_line": 69,
      "comment": "\n     * Build an instance with default thresholds.\n     * @deprecated in 3.1 (to be removed in 4.0). Convergence thresholds are\n     * problem-dependent. As this class is intended for users who want to set\n     * their own convergence criterion instead of relying on an algorithm\u0027s\n     * default procedure, they should also set the thresholds appropriately\n     * (cf. MATH-798).\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 60)",
        "(line 68,col 9)-(line 68,col 60)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.AbstractConvergenceChecker.AbstractConvergenceChecker(double, double)",
      "begin_line": 77,
      "end_line": 81,
      "comment": "\n     * Build an instance with a specified thresholds.\n     *\n     * @param relativeThreshold relative tolerance threshold\n     * @param absoluteThreshold absolute tolerance threshold\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 51)",
        "(line 80,col 9)-(line 80,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.AbstractConvergenceChecker.getRelativeThreshold()",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * @return the relative threshold.\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.AbstractConvergenceChecker.getAbsoluteThreshold()",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     * @return the absolute threshold.\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.AbstractConvergenceChecker.converged(int, PAIR, PAIR)",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": []
    }
  ]
}