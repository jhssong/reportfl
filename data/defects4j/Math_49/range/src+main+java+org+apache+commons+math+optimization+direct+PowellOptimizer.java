{
  "filepath": "/tmp/Math-49b/src/main/java/org/apache/commons/math/optimization/direct/PowellOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PowellOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.direct.BaseAbstractScalarOptimizer\u003corg.apache.commons.math.analysis.MultivariateRealFunction\u003e",
        "org.apache.commons.math.optimization.MultivariateRealOptimizer"
      ],
      "begin_line": 49,
      "end_line": 271,
      "comment": "\n * Powell algorithm.\n * This code is translated and adapted from the Python version of this\n * algorithm (as implemented in module {@code optimize.py} v0.5 of\n * \u003cem\u003eSciPy\u003c/em\u003e).\n * \u003cbr/\u003e\n * The default stopping criterion is based on the differences of the\n * function value between two successive iterations. It is however possible\n * to define custom convergence criteria by calling a {@link\n * #setConvergenceChecker(ConvergenceChecker) setConvergenceChecker}\n * prior to using the optimizer.\n *\n * @version $Id$\n * @since 2.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "MIN_RELATIVE_TOLERANCE"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": "\n     * Minimum relative tolerance.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "relativeThreshold"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * Relative threshold.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "absoluteThreshold"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": "\n     * Absolute threshold.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "line"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n     * Line search.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.PowellOptimizer.PowellOptimizer(double, double)",
      "begin_line": 78,
      "end_line": 95,
      "comment": "\n     * The arguments control the behaviour of the default convergence\n     * checking procedure.\n     *\n     * @param rel Relative threshold.\n     * @param abs Absolute threshold.\n     * @throws NotStrictlyPositiveException if {@code abs \u003c\u003d 0}.\n     * @throws NumberIsTooSmallException if {@code rel \u003c 2 * Math.ulp(1d)}.\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 82,col 9)",
        "(line 83,col 9)-(line 85,col 9)",
        "(line 86,col 9)-(line 86,col 32)",
        "(line 87,col 9)-(line 87,col 32)",
        "(line 91,col 9)-(line 91,col 35)",
        "(line 92,col 9)-(line 92,col 80)",
        "(line 93,col 9)-(line 93,col 80)",
        "(line 94,col 9)-(line 94,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.PowellOptimizer.doOptimize()",
      "begin_line": 98,
      "end_line": 192,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 44)",
        "(line 101,col 9)-(line 101,col 47)",
        "(line 102,col 9)-(line 102,col 35)",
        "(line 104,col 9)-(line 104,col 50)",
        "(line 105,col 9)-(line 107,col 9)",
        "(line 109,col 9)-(line 110,col 38)",
        "(line 112,col 9)-(line 112,col 27)",
        "(line 113,col 9)-(line 113,col 47)",
        "(line 114,col 9)-(line 114,col 32)",
        "(line 115,col 9)-(line 115,col 21)",
        "(line 116,col 9)-(line 191,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.PowellOptimizer.newPointAndDirection(double[], double[], double)",
      "begin_line": 205,
      "end_line": 217,
      "comment": "\n     * Compute a new point (in the original space) and a new direction\n     * vector, resulting from the line search.\n     * The parameters {@code p} and {@code d} will be changed in-place.\n     *\n     * @param p Point used in the line search.\n     * @param d Direction used in the line search.\n     * @param optimum Optimum found by the line search.\n     * @return a 2-element array containing the new point (at index 0) and\n     * the new direction (at index 1).\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 31)",
        "(line 209,col 9)-(line 209,col 51)",
        "(line 210,col 9)-(line 210,col 38)",
        "(line 211,col 9)-(line 211,col 38)",
        "(line 212,col 9)-(line 215,col 9)",
        "(line 216,col 9)-(line 216,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LineSearch",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.univariate.BrentOptimizer"
      ],
      "begin_line": 223,
      "end_line": 270,
      "comment": "\n     * Class for finding the minimum of the objective function along a given\n     * direction.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "bracket"
      ],
      "begin_line": 227,
      "end_line": 227,
      "comment": "\n         * Automatic bracketing.\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.PowellOptimizer.LineSearch.LineSearch(double, double)",
      "begin_line": 233,
      "end_line": 236,
      "comment": "\n         * @param rel Relative threshold.\n         * @param abs Absolute threshold.\n         ",
      "child_ranges": [
        "(line 235,col 13)-(line 235,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.PowellOptimizer.LineSearch.search(double[], double[])",
      "begin_line": 249,
      "end_line": 269,
      "comment": "\n         * Find the minimum of the function {@code f(p + alpha * d)}.\n         *\n         * @param p Starting point.\n         * @param d Search direction.\n         * @return the optimum.\n         * @throws org.apache.commons.math.exception.TooManyEvaluationsException\n         * if the number of evaluations is exceeded.\n         * @throws org.apache.commons.math.exception.MathUserException if the\n         * objective function throws one.\n         ",
      "child_ranges": [
        "(line 250,col 13)-(line 250,col 35)",
        "(line 251,col 13)-(line 260,col 18)",
        "(line 262,col 13)-(line 262,col 69)",
        "(line 263,col 13)-(line 263,col 42)",
        "(line 267,col 13)-(line 268,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.PowellOptimizer.LineSearch.Anonymous-b55c7382-aef7-4ace-9b52-69effd5e5243.value(double)",
      "begin_line": 252,
      "end_line": 259,
      "comment": "",
      "child_ranges": [
        "(line 253,col 25)-(line 253,col 57)",
        "(line 254,col 25)-(line 256,col 25)",
        "(line 257,col 25)-(line 257,col 89)",
        "(line 258,col 25)-(line 258,col 35)"
      ]
    }
  ]
}