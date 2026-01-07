{
  "filepath": "/tmp/Math-21b/src/main/java/org/apache/commons/math3/optimization/direct/PowellOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PowellOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer\u003corg.apache.commons.math3.analysis.MultivariateFunction\u003e",
        "org.apache.commons.math3.optimization.MultivariateOptimizer"
      ],
      "begin_line": 49,
      "end_line": 307,
      "comment": "\n * Powell algorithm.\n * This code is translated and adapted from the Python version of this\n * algorithm (as implemented in module {@code optimize.py} v0.5 of\n * \u003cem\u003eSciPy\u003c/em\u003e).\n * \u003cbr/\u003e\n * The default stopping criterion is based on the differences of the\n * function value between two successive iterations. It is however possible\n * to define a custom convergence checker that might terminate the algorithm\n * earlier.\n *\n * @version $Id$\n * @since 2.2\n "
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
      "signature": "org.apache.commons.math3.optimization.direct.PowellOptimizer.PowellOptimizer(double, double, org.apache.commons.math3.optimization.ConvergenceChecker\u003corg.apache.commons.math3.optimization.PointValuePair\u003e)",
      "begin_line": 80,
      "end_line": 98,
      "comment": "\n     * This constructor allows to specify a user-defined convergence checker,\n     * in addition to the parameters that control the default convergence\n     * checking procedure and the line search tolerances.\n     *\n     * @param rel Relative threshold.\n     * @param abs Absolute threshold.\n     * @param checker Convergence checker.\n     * @throws NotStrictlyPositiveException if {@code abs \u003c\u003d 0}.\n     * @throws NumberIsTooSmallException if {@code rel \u003c 2 * Math.ulp(1d)}.\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 23)",
        "(line 85,col 9)-(line 87,col 9)",
        "(line 88,col 9)-(line 90,col 9)",
        "(line 91,col 9)-(line 91,col 32)",
        "(line 92,col 9)-(line 92,col 32)",
        "(line 96,col 9)-(line 97,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.PowellOptimizer.PowellOptimizer(double, double)",
      "begin_line": 109,
      "end_line": 112,
      "comment": "\n     * The parameters control the default convergence checking procedure, and\n     * the line search tolerances.\n     *\n     * @param rel Relative threshold.\n     * @param abs Absolute threshold.\n     * @throws NotStrictlyPositiveException if {@code abs \u003c\u003d 0}.\n     * @throws NumberIsTooSmallException if {@code rel \u003c 2 * Math.ulp(1d)}.\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.PowellOptimizer.doOptimize()",
      "begin_line": 115,
      "end_line": 209,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 44)",
        "(line 118,col 9)-(line 118,col 47)",
        "(line 119,col 9)-(line 119,col 35)",
        "(line 121,col 9)-(line 121,col 50)",
        "(line 122,col 9)-(line 124,col 9)",
        "(line 126,col 9)-(line 127,col 38)",
        "(line 129,col 9)-(line 129,col 27)",
        "(line 130,col 9)-(line 130,col 47)",
        "(line 131,col 9)-(line 131,col 32)",
        "(line 132,col 9)-(line 132,col 21)",
        "(line 133,col 9)-(line 208,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.PowellOptimizer.newPointAndDirection(double[], double[], double)",
      "begin_line": 221,
      "end_line": 237,
      "comment": "\n     * Compute a new point (in the original space) and a new direction\n     * vector, resulting from the line search.\n     *\n     * @param p Point used in the line search.\n     * @param d Direction used in the line search.\n     * @param optimum Optimum found by the line search.\n     * @return a 2-element array containing the new point (at index 0) and\n     * the new direction (at index 1).\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 31)",
        "(line 225,col 9)-(line 225,col 42)",
        "(line 226,col 9)-(line 226,col 42)",
        "(line 227,col 9)-(line 230,col 9)",
        "(line 232,col 9)-(line 232,col 50)",
        "(line 233,col 9)-(line 233,col 23)",
        "(line 234,col 9)-(line 234,col 23)",
        "(line 236,col 9)-(line 236,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LineSearch",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.univariate.BrentOptimizer"
      ],
      "begin_line": 243,
      "end_line": 306,
      "comment": "\n     * Class for finding the minimum of the objective function along a given\n     * direction.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "REL_TOL_UNUSED"
      ],
      "begin_line": 249,
      "end_line": 249,
      "comment": "\n         * Value that will pass the precondition check for {@link BrentOptimizer}\n         * but will not pass the convergence check, so that the custom checker\n         * will always decide when to stop the line search.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "ABS_TOL_UNUSED"
      ],
      "begin_line": 255,
      "end_line": 255,
      "comment": "\n         * Value that will pass the precondition check for {@link BrentOptimizer}\n         * but will not pass the convergence check, so that the custom checker\n         * will always decide when to stop the line search.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "bracket"
      ],
      "begin_line": 259,
      "end_line": 259,
      "comment": "\n         * Automatic bracketing.\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.PowellOptimizer.LineSearch.LineSearch(double, double)",
      "begin_line": 269,
      "end_line": 274,
      "comment": "\n         * The \"BrentOptimizer\" default stopping criterion uses the tolerances\n         * to check the domain (point) values, not the function values.\n         * We thus create a custom checker to use function values.\n         *\n         * @param rel Relative threshold.\n         * @param abs Absolute threshold.\n         ",
      "child_ranges": [
        "(line 271,col 13)-(line 273,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.PowellOptimizer.LineSearch.search(double[], double[])",
      "begin_line": 285,
      "end_line": 305,
      "comment": "\n         * Find the minimum of the function {@code f(p + alpha * d)}.\n         *\n         * @param p Starting point.\n         * @param d Search direction.\n         * @return the optimum.\n         * @throws org.apache.commons.math3.exception.TooManyEvaluationsException\n         * if the number of evaluations is exceeded.\n         ",
      "child_ranges": [
        "(line 286,col 13)-(line 286,col 35)",
        "(line 287,col 13)-(line 296,col 18)",
        "(line 298,col 13)-(line 298,col 69)",
        "(line 299,col 13)-(line 299,col 42)",
        "(line 303,col 13)-(line 304,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.PowellOptimizer.LineSearch.Anonymous-1ef540f5-1c40-4d4b-8fa8-1f642307c7b1.value(double)",
      "begin_line": 288,
      "end_line": 295,
      "comment": "",
      "child_ranges": [
        "(line 289,col 25)-(line 289,col 57)",
        "(line 290,col 25)-(line 292,col 25)",
        "(line 293,col 25)-(line 293,col 89)",
        "(line 294,col 25)-(line 294,col 35)"
      ]
    }
  ]
}