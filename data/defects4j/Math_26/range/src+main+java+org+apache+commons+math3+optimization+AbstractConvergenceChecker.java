{
  "filepath": "/tmp/Math-26b/src/main/java/org/apache/commons/math3/optimization/AbstractConvergenceChecker.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractConvergenceChecker",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.ConvergenceChecker\u003cPAIR\u003e"
      ],
      "begin_line": 30,
      "end_line": 99,
      "comment": "\n * Base class for all convergence checker implementations.\n *\n * @param \u003cPAIR\u003e Type of (point, value) pair.\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_RELATIVE_THRESHOLD"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": "\n     * Default relative threshold.\n     * @deprecated in 3.1 (to be removed in 4.0) because this value is too small\n     * to be useful as a default (cf. MATH-798).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ABSOLUTE_THRESHOLD"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n     * Default absolute threshold.\n     * @deprecated in 3.1 (to be removed in 4.0) because this value is too small\n     * to be useful as a default (cf. MATH-798).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "relativeThreshold"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n     * Relative tolerance threshold.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "absoluteThreshold"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": "\n     * Absolute tolerance threshold.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.AbstractConvergenceChecker.AbstractConvergenceChecker()",
      "begin_line": 61,
      "end_line": 65,
      "comment": "\n     * Build an instance with default thresholds.\n     * @deprecated in 3.1 (to be removed in 4.0). Convergence thresholds are\n     * problem-dependent. As this class is intended for users who want to set\n     * their own convergence criterion instead of relying on an algorithm\u0027s\n     * default procedure, they should also set the thresholds appropriately\n     * (cf. MATH-798).\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 60)",
        "(line 64,col 9)-(line 64,col 60)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.AbstractConvergenceChecker.AbstractConvergenceChecker(double, double)",
      "begin_line": 73,
      "end_line": 77,
      "comment": "\n     * Build an instance with a specified thresholds.\n     *\n     * @param relativeThreshold relative tolerance threshold\n     * @param absoluteThreshold absolute tolerance threshold\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 51)",
        "(line 76,col 9)-(line 76,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.AbstractConvergenceChecker.getRelativeThreshold()",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\n     * @return the relative threshold.\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.AbstractConvergenceChecker.getAbsoluteThreshold()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * @return the absolute threshold.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.AbstractConvergenceChecker.converged(int, PAIR, PAIR)",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": []
    }
  ]
}