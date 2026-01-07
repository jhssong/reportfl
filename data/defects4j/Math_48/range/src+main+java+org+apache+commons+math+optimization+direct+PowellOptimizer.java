{
  "filepath": "/tmp/Math-48b/src/main/java/org/apache/commons/math/optimization/direct/PowellOptimizer.java",
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
      "end_line": 289,
      "comment": "\n * Powell algorithm.\n * This code is translated and adapted from the Python version of this\n * algorithm (as implemented in module {@code optimize.py} v0.5 of\n * \u003cem\u003eSciPy\u003c/em\u003e).\n * \u003cbr/\u003e\n * The default stopping criterion is based on the differences of the\n * function value between two successive iterations. It is however possible\n * to define a custom convergence checker that might terminate the algorithm\n * earlier.\n *\n * @version $Id$\n * @since 2.2\n "
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
      "signature": "org.apache.commons.math.optimization.direct.PowellOptimizer.PowellOptimizer(double, double, org.apache.commons.math.optimization.ConvergenceChecker\u003corg.apache.commons.math.optimization.RealPointValuePair\u003e)",
      "begin_line": 79,
      "end_line": 99,
      "comment": "\n     * This constructor allows to specify a user-defined convergence checker,\n     * in addition to the parameters that control the default convergence\n     * checking procedure and the line search tolerances.\n     *\n     * @param rel Relative threshold.\n     * @param abs Absolute threshold.\n     * @param checker Convergence checker.\n     * @throws NotStrictlyPositiveException if {@code abs \u003c\u003d 0}.\n     * @throws NumberIsTooSmallException if {@code rel \u003c 2 * Math.ulp(1d)}.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 23)",
        "(line 84,col 9)-(line 86,col 9)",
        "(line 87,col 9)-(line 89,col 9)",
        "(line 90,col 9)-(line 90,col 32)",
        "(line 91,col 9)-(line 91,col 32)",
        "(line 95,col 9)-(line 95,col 35)",
        "(line 96,col 9)-(line 96,col 80)",
        "(line 97,col 9)-(line 97,col 80)",
        "(line 98,col 9)-(line 98,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.PowellOptimizer.PowellOptimizer(double, double)",
      "begin_line": 110,
      "end_line": 113,
      "comment": "\n     * The parameters control the default convergence checking procedure, and\n     * the line search tolerances.\n     *\n     * @param rel Relative threshold.\n     * @param abs Absolute threshold.\n     * @throws NotStrictlyPositiveException if {@code abs \u003c\u003d 0}.\n     * @throws NumberIsTooSmallException if {@code rel \u003c 2 * Math.ulp(1d)}.\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.PowellOptimizer.doOptimize()",
      "begin_line": 116,
      "end_line": 210,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 44)",
        "(line 119,col 9)-(line 119,col 47)",
        "(line 120,col 9)-(line 120,col 35)",
        "(line 122,col 9)-(line 122,col 50)",
        "(line 123,col 9)-(line 125,col 9)",
        "(line 127,col 9)-(line 128,col 38)",
        "(line 130,col 9)-(line 130,col 27)",
        "(line 131,col 9)-(line 131,col 47)",
        "(line 132,col 9)-(line 132,col 32)",
        "(line 133,col 9)-(line 133,col 21)",
        "(line 134,col 9)-(line 209,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.PowellOptimizer.newPointAndDirection(double[], double[], double)",
      "begin_line": 223,
      "end_line": 235,
      "comment": "\n     * Compute a new point (in the original space) and a new direction\n     * vector, resulting from the line search.\n     * The parameters {@code p} and {@code d} will be changed in-place.\n     *\n     * @param p Point used in the line search.\n     * @param d Direction used in the line search.\n     * @param optimum Optimum found by the line search.\n     * @return a 2-element array containing the new point (at index 0) and\n     * the new direction (at index 1).\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 31)",
        "(line 227,col 9)-(line 227,col 51)",
        "(line 228,col 9)-(line 228,col 38)",
        "(line 229,col 9)-(line 229,col 38)",
        "(line 230,col 9)-(line 233,col 9)",
        "(line 234,col 9)-(line 234,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LineSearch",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.univariate.BrentOptimizer"
      ],
      "begin_line": 241,
      "end_line": 288,
      "comment": "\n     * Class for finding the minimum of the objective function along a given\n     * direction.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "bracket"
      ],
      "begin_line": 245,
      "end_line": 245,
      "comment": "\n         * Automatic bracketing.\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.PowellOptimizer.LineSearch.LineSearch(double, double)",
      "begin_line": 251,
      "end_line": 254,
      "comment": "\n         * @param rel Relative threshold.\n         * @param abs Absolute threshold.\n         ",
      "child_ranges": [
        "(line 253,col 13)-(line 253,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.PowellOptimizer.LineSearch.search(double[], double[])",
      "begin_line": 267,
      "end_line": 287,
      "comment": "\n         * Find the minimum of the function {@code f(p + alpha * d)}.\n         *\n         * @param p Starting point.\n         * @param d Search direction.\n         * @return the optimum.\n         * @throws org.apache.commons.math.exception.TooManyEvaluationsException\n         * if the number of evaluations is exceeded.\n         * @throws org.apache.commons.math.exception.MathUserException if the\n         * objective function throws one.\n         ",
      "child_ranges": [
        "(line 268,col 13)-(line 268,col 35)",
        "(line 269,col 13)-(line 278,col 18)",
        "(line 280,col 13)-(line 280,col 69)",
        "(line 281,col 13)-(line 281,col 42)",
        "(line 285,col 13)-(line 286,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.PowellOptimizer.LineSearch.Anonymous-a3099ac0-fa3b-4c3f-b72b-346bbf483d73.value(double)",
      "begin_line": 270,
      "end_line": 277,
      "comment": "",
      "child_ranges": [
        "(line 271,col 25)-(line 271,col 57)",
        "(line 272,col 25)-(line 274,col 25)",
        "(line 275,col 25)-(line 275,col 89)",
        "(line 276,col 25)-(line 276,col 35)"
      ]
    }
  ]
}