{
  "filepath": "/tmp/Math-59b/src/main/java/org/apache/commons/math/optimization/direct/PowellOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PowellOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.direct.BaseAbstractScalarOptimizer\u003corg.apache.commons.math.analysis.MultivariateRealFunction\u003e",
        "org.apache.commons.math.optimization.MultivariateRealOptimizer"
      ],
      "begin_line": 48,
      "end_line": 283,
      "comment": "\n * Powell algorithm.\n * This code is translated and adapted from the Python version of this\n * algorithm (as implemented in module {@code optimize.py} v0.5 of\n * \u003cem\u003eSciPy\u003c/em\u003e).\n * \u003cbr/\u003e\n * The default stopping criterion is based on the differences of the\n * function value between two successive iterations. It is however possible\n * to define custom convergence criteria by calling a {@link\n * #setConvergenceChecker(ConvergenceChecker) setConvergenceChecker}\n * prior to using the optimizer.\n *\n * @version $Revision$ $Date$\n * @since 2.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "MIN_RELATIVE_TOLERANCE"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n     * Minimum relative tolerance.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "relativeThreshold"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     * Relative threshold.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "absoluteThreshold"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": "\n     * Absolute threshold.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "line"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": "\n     * Line search.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.PowellOptimizer.PowellOptimizer(double, double)",
      "begin_line": 77,
      "end_line": 94,
      "comment": "\n     * The arguments control the behaviour of the default convergence\n     * checking procedure.\n     *\n     * @param rel Relative threshold.\n     * @param abs Absolute threshold.\n     * @throws NotStrictlyPositiveException if {@code abs \u003c\u003d 0}.\n     * @throws NumberIsTooSmallException if {@code rel \u003c 2 * Math.ulp(1d)}.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 81,col 9)",
        "(line 82,col 9)-(line 84,col 9)",
        "(line 85,col 9)-(line 85,col 32)",
        "(line 86,col 9)-(line 86,col 32)",
        "(line 90,col 9)-(line 90,col 35)",
        "(line 91,col 9)-(line 91,col 80)",
        "(line 92,col 9)-(line 92,col 80)",
        "(line 93,col 9)-(line 93,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.PowellOptimizer.doOptimize()",
      "begin_line": 97,
      "end_line": 191,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 44)",
        "(line 100,col 9)-(line 100,col 47)",
        "(line 101,col 9)-(line 101,col 35)",
        "(line 103,col 9)-(line 103,col 50)",
        "(line 104,col 9)-(line 106,col 9)",
        "(line 108,col 9)-(line 109,col 38)",
        "(line 111,col 9)-(line 111,col 27)",
        "(line 112,col 9)-(line 112,col 47)",
        "(line 113,col 9)-(line 113,col 32)",
        "(line 114,col 9)-(line 114,col 21)",
        "(line 115,col 9)-(line 190,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.PowellOptimizer.newPointAndDirection(double[], double[], double)",
      "begin_line": 204,
      "end_line": 216,
      "comment": "\n     * Compute a new point (in the original space) and a new direction\n     * vector, resulting from the line search.\n     * The parameters {@code p} and {@code d} will be changed in-place.\n     *\n     * @param p Point used in the line search.\n     * @param d Direction used in the line search.\n     * @param optimum Optimum found by the line search.\n     * @return a 2-element array containing the new point (at index 0) and\n     * the new direction (at index 1).\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 31)",
        "(line 208,col 9)-(line 208,col 51)",
        "(line 209,col 9)-(line 209,col 38)",
        "(line 210,col 9)-(line 210,col 38)",
        "(line 211,col 9)-(line 214,col 9)",
        "(line 215,col 9)-(line 215,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LineSearch",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.univariate.BrentOptimizer"
      ],
      "begin_line": 222,
      "end_line": 269,
      "comment": "\n     * Class for finding the minimum of the objective function along a given\n     * direction.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "bracket"
      ],
      "begin_line": 226,
      "end_line": 226,
      "comment": "\n         * Automatic bracketing.\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.PowellOptimizer.LineSearch.LineSearch(double, double)",
      "begin_line": 232,
      "end_line": 235,
      "comment": "\n         * @param rel Relative threshold.\n         * @param abs Absolute threshold.\n         ",
      "child_ranges": [
        "(line 234,col 13)-(line 234,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.PowellOptimizer.LineSearch.search(double[], double[])",
      "begin_line": 248,
      "end_line": 268,
      "comment": "\n         * Find the minimum of the function {@code f(p + alpha * d)}.\n         *\n         * @param p Starting point.\n         * @param d Search direction.\n         * @return the optimum.\n         * @throws org.apache.commons.math.exception.TooManyEvaluationsException\n         * if the number of evaluations is exceeded.\n         * @throws org.apache.commons.math.exception.MathUserException if the\n         * objective function throws one.\n         ",
      "child_ranges": [
        "(line 249,col 13)-(line 249,col 35)",
        "(line 250,col 13)-(line 259,col 18)",
        "(line 261,col 13)-(line 261,col 69)",
        "(line 262,col 13)-(line 262,col 42)",
        "(line 266,col 13)-(line 267,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.PowellOptimizer.LineSearch.Anonymous-79b43013-0cd3-456c-b791-3008c4948893.value(double)",
      "begin_line": 251,
      "end_line": 258,
      "comment": "",
      "child_ranges": [
        "(line 252,col 25)-(line 252,col 57)",
        "(line 253,col 25)-(line 255,col 25)",
        "(line 256,col 25)-(line 256,col 89)",
        "(line 257,col 25)-(line 257,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.PowellOptimizer.copyOf(double[], int)",
      "begin_line": 278,
      "end_line": 282,
      "comment": "\n     * Java 1.5 does not support Arrays.copyOf()\n     *\n     * @param source Array to be copied.\n     * @param newLen Length of the copy to be returned.\n     * @return the copied array, truncated or padded as necessary.\n     ",
      "child_ranges": [
        "(line 279,col 10)-(line 279,col 46)",
        "(line 280,col 10)-(line 280,col 81)",
        "(line 281,col 10)-(line 281,col 23)"
      ]
    }
  ]
}