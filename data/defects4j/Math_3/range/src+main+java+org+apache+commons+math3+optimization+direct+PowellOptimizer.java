{
  "filepath": "/tmp/Math-3b/src/main/java/org/apache/commons/math3/optimization/direct/PowellOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PowellOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer\u003corg.apache.commons.math3.analysis.MultivariateFunction\u003e",
        "org.apache.commons.math3.optimization.MultivariateOptimizer"
      ],
      "begin_line": 53,
      "end_line": 353,
      "comment": "\n * Powell algorithm.\n * This code is translated and adapted from the Python version of this\n * algorithm (as implemented in module {@code optimize.py} v0.5 of\n * \u003cem\u003eSciPy\u003c/em\u003e).\n * \u003cbr/\u003e\n * The default stopping criterion is based on the differences of the\n * function value between two successive iterations. It is however possible\n * to define a custom convergence checker that might terminate the algorithm\n * earlier.\n * \u003cbr/\u003e\n * The internal line search optimizer is a {@link BrentOptimizer} with a\n * convergence checker set to {@link SimpleUnivariateValueChecker}.\n *\n * @version $Id$\n * @deprecated As of 3.1 (to be removed in 4.0).\n * @since 2.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "MIN_RELATIVE_TOLERANCE"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": "\n     * Minimum relative tolerance.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "relativeThreshold"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": "\n     * Relative threshold.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "absoluteThreshold"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": "\n     * Absolute threshold.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "line"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": "\n     * Line search.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.PowellOptimizer.PowellOptimizer(double, double, org.apache.commons.math3.optimization.ConvergenceChecker\u003corg.apache.commons.math3.optimization.PointValuePair\u003e)",
      "begin_line": 88,
      "end_line": 92,
      "comment": "\n     * This constructor allows to specify a user-defined convergence checker,\n     * in addition to the parameters that control the default convergence\n     * checking procedure.\n     * \u003cbr/\u003e\n     * The internal line search tolerances are set to the square-root of their\n     * corresponding value in the multivariate optimizer.\n     *\n     * @param rel Relative threshold.\n     * @param abs Absolute threshold.\n     * @param checker Convergence checker.\n     * @throws NotStrictlyPositiveException if {@code abs \u003c\u003d 0}.\n     * @throws NumberIsTooSmallException if {@code rel \u003c 2 * Math.ulp(1d)}.\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 72)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.PowellOptimizer.PowellOptimizer(double, double, double, double, org.apache.commons.math3.optimization.ConvergenceChecker\u003corg.apache.commons.math3.optimization.PointValuePair\u003e)",
      "begin_line": 107,
      "end_line": 126,
      "comment": "\n     * This constructor allows to specify a user-defined convergence checker,\n     * in addition to the parameters that control the default convergence\n     * checking procedure and the line search tolerances.\n     *\n     * @param rel Relative threshold for this optimizer.\n     * @param abs Absolute threshold for this optimizer.\n     * @param lineRel Relative threshold for the internal line search optimizer.\n     * @param lineAbs Absolute threshold for the internal line search optimizer.\n     * @param checker Convergence checker.\n     * @throws NotStrictlyPositiveException if {@code abs \u003c\u003d 0}.\n     * @throws NumberIsTooSmallException if {@code rel \u003c 2 * Math.ulp(1d)}.\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 23)",
        "(line 114,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 120,col 32)",
        "(line 121,col 9)-(line 121,col 32)",
        "(line 124,col 9)-(line 125,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.PowellOptimizer.PowellOptimizer(double, double)",
      "begin_line": 139,
      "end_line": 142,
      "comment": "\n     * The parameters control the default convergence checking procedure.\n     * \u003cbr/\u003e\n     * The internal line search tolerances are set to the square-root of their\n     * corresponding value in the multivariate optimizer.\n     *\n     * @param rel Relative threshold.\n     * @param abs Absolute threshold.\n     * @throws NotStrictlyPositiveException if {@code abs \u003c\u003d 0}.\n     * @throws NumberIsTooSmallException if {@code rel \u003c 2 * Math.ulp(1d)}.\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.PowellOptimizer.PowellOptimizer(double, double, double, double)",
      "begin_line": 155,
      "end_line": 160,
      "comment": "\n     * Builds an instance with the default convergence checking procedure.\n     *\n     * @param rel Relative threshold.\n     * @param abs Absolute threshold.\n     * @param lineRel Relative threshold for the internal line search optimizer.\n     * @param lineAbs Absolute threshold for the internal line search optimizer.\n     * @throws NotStrictlyPositiveException if {@code abs \u003c\u003d 0}.\n     * @throws NumberIsTooSmallException if {@code rel \u003c 2 * Math.ulp(1d)}.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.PowellOptimizer.doOptimize()",
      "begin_line": 163,
      "end_line": 255,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 44)",
        "(line 166,col 9)-(line 166,col 47)",
        "(line 167,col 9)-(line 167,col 35)",
        "(line 169,col 9)-(line 169,col 50)",
        "(line 170,col 9)-(line 172,col 9)",
        "(line 174,col 9)-(line 175,col 38)",
        "(line 177,col 9)-(line 177,col 27)",
        "(line 178,col 9)-(line 178,col 47)",
        "(line 179,col 9)-(line 179,col 32)",
        "(line 180,col 9)-(line 180,col 21)",
        "(line 181,col 9)-(line 254,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.PowellOptimizer.newPointAndDirection(double[], double[], double)",
      "begin_line": 267,
      "end_line": 283,
      "comment": "\n     * Compute a new point (in the original space) and a new direction\n     * vector, resulting from the line search.\n     *\n     * @param p Point used in the line search.\n     * @param d Direction used in the line search.\n     * @param optimum Optimum found by the line search.\n     * @return a 2-element array containing the new point (at index 0) and\n     * the new direction (at index 1).\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 31)",
        "(line 271,col 9)-(line 271,col 42)",
        "(line 272,col 9)-(line 272,col 42)",
        "(line 273,col 9)-(line 276,col 9)",
        "(line 278,col 9)-(line 278,col 50)",
        "(line 279,col 9)-(line 279,col 23)",
        "(line 280,col 9)-(line 280,col 23)",
        "(line 282,col 9)-(line 282,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LineSearch",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.univariate.BrentOptimizer"
      ],
      "begin_line": 289,
      "end_line": 352,
      "comment": "\n     * Class for finding the minimum of the objective function along a given\n     * direction.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "REL_TOL_UNUSED"
      ],
      "begin_line": 295,
      "end_line": 295,
      "comment": "\n         * Value that will pass the precondition check for {@link BrentOptimizer}\n         * but will not pass the convergence check, so that the custom checker\n         * will always decide when to stop the line search.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "ABS_TOL_UNUSED"
      ],
      "begin_line": 301,
      "end_line": 301,
      "comment": "\n         * Value that will pass the precondition check for {@link BrentOptimizer}\n         * but will not pass the convergence check, so that the custom checker\n         * will always decide when to stop the line search.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "bracket"
      ],
      "begin_line": 305,
      "end_line": 305,
      "comment": "\n         * Automatic bracketing.\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.PowellOptimizer.LineSearch.LineSearch(double, double)",
      "begin_line": 315,
      "end_line": 320,
      "comment": "\n         * The \"BrentOptimizer\" default stopping criterion uses the tolerances\n         * to check the domain (point) values, not the function values.\n         * We thus create a custom checker to use function values.\n         *\n         * @param rel Relative threshold.\n         * @param abs Absolute threshold.\n         ",
      "child_ranges": [
        "(line 317,col 13)-(line 319,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.PowellOptimizer.LineSearch.search(double[], double[])",
      "begin_line": 331,
      "end_line": 351,
      "comment": "\n         * Find the minimum of the function {@code f(p + alpha * d)}.\n         *\n         * @param p Starting point.\n         * @param d Search direction.\n         * @return the optimum.\n         * @throws org.apache.commons.math3.exception.TooManyEvaluationsException\n         * if the number of evaluations is exceeded.\n         ",
      "child_ranges": [
        "(line 332,col 13)-(line 332,col 35)",
        "(line 333,col 13)-(line 342,col 18)",
        "(line 344,col 13)-(line 344,col 69)",
        "(line 345,col 13)-(line 345,col 42)",
        "(line 349,col 13)-(line 350,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.PowellOptimizer.LineSearch.Anonymous-1c4b9069-64f3-4e1e-b08a-4daca8d76494.value(double)",
      "begin_line": 334,
      "end_line": 341,
      "comment": "",
      "child_ranges": [
        "(line 335,col 25)-(line 335,col 57)",
        "(line 336,col 25)-(line 338,col 25)",
        "(line 339,col 25)-(line 339,col 89)",
        "(line 340,col 25)-(line 340,col 35)"
      ]
    }
  ]
}