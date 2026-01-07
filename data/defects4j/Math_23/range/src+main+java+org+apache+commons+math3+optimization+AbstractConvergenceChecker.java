{
  "filepath": "/tmp/Math-23b/src/main/java/org/apache/commons/math3/optimization/AbstractConvergenceChecker.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractConvergenceChecker",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.ConvergenceChecker\u003cPAIR\u003e"
      ],
      "begin_line": 30,
      "end_line": 101,
      "comment": "\n * Base class for all convergence checker implementations.\n *\n * @param \u003cPAIR\u003e Type of (point, value) pair.\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_RELATIVE_THRESHOLD"
      ],
      "begin_line": 37,
      "end_line": 38,
      "comment": "\n     * Default relative threshold.\n     * @deprecated in 3.1 (to be removed in 4.0) because this value is too small\n     * to be useful as a default (cf. MATH-798).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ABSOLUTE_THRESHOLD"
      ],
      "begin_line": 44,
      "end_line": 45,
      "comment": "\n     * Default absolute threshold.\n     * @deprecated in 3.1 (to be removed in 4.0) because this value is too small\n     * to be useful as a default (cf. MATH-798).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "relativeThreshold"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * Relative tolerance threshold.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "absoluteThreshold"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * Absolute tolerance threshold.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.AbstractConvergenceChecker.AbstractConvergenceChecker()",
      "begin_line": 63,
      "end_line": 67,
      "comment": "\n     * Build an instance with default thresholds.\n     * @deprecated in 3.1 (to be removed in 4.0). Convergence thresholds are\n     * problem-dependent. As this class is intended for users who want to set\n     * their own convergence criterion instead of relying on an algorithm\u0027s\n     * default procedure, they should also set the thresholds appropriately\n     * (cf. MATH-798).\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 60)",
        "(line 66,col 9)-(line 66,col 60)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.AbstractConvergenceChecker.AbstractConvergenceChecker(double, double)",
      "begin_line": 75,
      "end_line": 79,
      "comment": "\n     * Build an instance with a specified thresholds.\n     *\n     * @param relativeThreshold relative tolerance threshold\n     * @param absoluteThreshold absolute tolerance threshold\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 51)",
        "(line 78,col 9)-(line 78,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.AbstractConvergenceChecker.getRelativeThreshold()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * @return the relative threshold.\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.AbstractConvergenceChecker.getAbsoluteThreshold()",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * @return the absolute threshold.\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.AbstractConvergenceChecker.converged(int, PAIR, PAIR)",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": []
    }
  ]
}