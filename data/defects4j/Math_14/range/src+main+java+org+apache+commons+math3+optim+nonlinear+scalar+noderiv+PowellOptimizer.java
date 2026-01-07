{
  "filepath": "/tmp/Math-14b/src/main/java/org/apache/commons/math3/optim/nonlinear/scalar/noderiv/PowellOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PowellOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer"
      ],
      "begin_line": 53,
      "end_line": 356,
      "comment": "\n * Powell algorithm.\n * This code is translated and adapted from the Python version of this\n * algorithm (as implemented in module {@code optimize.py} v0.5 of\n * \u003cem\u003eSciPy\u003c/em\u003e).\n * \u003cbr/\u003e\n * The default stopping criterion is based on the differences of the\n * function value between two successive iterations. It is however possible\n * to define a custom convergence checker that might terminate the algorithm\n * earlier.\n * \u003cbr/\u003e\n * The internal line search optimizer is a {@link BrentOptimizer} with a\n * convergence checker set to {@link SimpleUnivariateValueChecker}.\n *\n * @version $Id: PowellOptimizer.java 1413594 2012-11-26 13:16:39Z erans $\n * @since 2.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "MIN_RELATIVE_TOLERANCE"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     * Minimum relative tolerance.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "relativeThreshold"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": "\n     * Relative threshold.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "absoluteThreshold"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": "\n     * Absolute threshold.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "line"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": "\n     * Line search.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer.PowellOptimizer(double, double, org.apache.commons.math3.optim.ConvergenceChecker\u003corg.apache.commons.math3.optim.PointValuePair\u003e)",
      "begin_line": 86,
      "end_line": 90,
      "comment": "\n     * This constructor allows to specify a user-defined convergence checker,\n     * in addition to the parameters that control the default convergence\n     * checking procedure.\n     * \u003cbr/\u003e\n     * The internal line search tolerances are set to the square-root of their\n     * corresponding value in the multivariate optimizer.\n     *\n     * @param rel Relative threshold.\n     * @param abs Absolute threshold.\n     * @param checker Convergence checker.\n     * @throws NotStrictlyPositiveException if {@code abs \u003c\u003d 0}.\n     * @throws NumberIsTooSmallException if {@code rel \u003c 2 * Math.ulp(1d)}.\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 72)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer.PowellOptimizer(double, double, double, double, org.apache.commons.math3.optim.ConvergenceChecker\u003corg.apache.commons.math3.optim.PointValuePair\u003e)",
      "begin_line": 105,
      "end_line": 124,
      "comment": "\n     * This constructor allows to specify a user-defined convergence checker,\n     * in addition to the parameters that control the default convergence\n     * checking procedure and the line search tolerances.\n     *\n     * @param rel Relative threshold for this optimizer.\n     * @param abs Absolute threshold for this optimizer.\n     * @param lineRel Relative threshold for the internal line search optimizer.\n     * @param lineAbs Absolute threshold for the internal line search optimizer.\n     * @param checker Convergence checker.\n     * @throws NotStrictlyPositiveException if {@code abs \u003c\u003d 0}.\n     * @throws NumberIsTooSmallException if {@code rel \u003c 2 * Math.ulp(1d)}.\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 23)",
        "(line 112,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 118,col 32)",
        "(line 119,col 9)-(line 119,col 32)",
        "(line 122,col 9)-(line 123,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer.PowellOptimizer(double, double)",
      "begin_line": 137,
      "end_line": 140,
      "comment": "\n     * The parameters control the default convergence checking procedure.\n     * \u003cbr/\u003e\n     * The internal line search tolerances are set to the square-root of their\n     * corresponding value in the multivariate optimizer.\n     *\n     * @param rel Relative threshold.\n     * @param abs Absolute threshold.\n     * @throws NotStrictlyPositiveException if {@code abs \u003c\u003d 0}.\n     * @throws NumberIsTooSmallException if {@code rel \u003c 2 * Math.ulp(1d)}.\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer.PowellOptimizer(double, double, double, double)",
      "begin_line": 152,
      "end_line": 157,
      "comment": "\n     * Builds an instance with the default convergence checking procedure.\n     *\n     * @param rel Relative threshold.\n     * @param abs Absolute threshold.\n     * @param lineRel Relative threshold for the internal line search optimizer.\n     * @param lineAbs Absolute threshold for the internal line search optimizer.\n     * @throws NotStrictlyPositiveException if {@code abs \u003c\u003d 0}.\n     * @throws NumberIsTooSmallException if {@code rel \u003c 2 * Math.ulp(1d)}.\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer.doOptimize()",
      "begin_line": 160,
      "end_line": 254,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 44)",
        "(line 163,col 9)-(line 163,col 47)",
        "(line 164,col 9)-(line 164,col 35)",
        "(line 166,col 9)-(line 166,col 50)",
        "(line 167,col 9)-(line 169,col 9)",
        "(line 171,col 9)-(line 172,col 38)",
        "(line 174,col 9)-(line 174,col 27)",
        "(line 175,col 9)-(line 175,col 47)",
        "(line 176,col 9)-(line 176,col 32)",
        "(line 177,col 9)-(line 177,col 21)",
        "(line 178,col 9)-(line 253,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer.newPointAndDirection(double[], double[], double)",
      "begin_line": 266,
      "end_line": 282,
      "comment": "\n     * Compute a new point (in the original space) and a new direction\n     * vector, resulting from the line search.\n     *\n     * @param p Point used in the line search.\n     * @param d Direction used in the line search.\n     * @param optimum Optimum found by the line search.\n     * @return a 2-element array containing the new point (at index 0) and\n     * the new direction (at index 1).\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 31)",
        "(line 270,col 9)-(line 270,col 42)",
        "(line 271,col 9)-(line 271,col 42)",
        "(line 272,col 9)-(line 275,col 9)",
        "(line 277,col 9)-(line 277,col 50)",
        "(line 278,col 9)-(line 278,col 23)",
        "(line 279,col 9)-(line 279,col 23)",
        "(line 281,col 9)-(line 281,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LineSearch",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optim.univariate.BrentOptimizer"
      ],
      "begin_line": 288,
      "end_line": 355,
      "comment": "\n     * Class for finding the minimum of the objective function along a given\n     * direction.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "REL_TOL_UNUSED"
      ],
      "begin_line": 294,
      "end_line": 294,
      "comment": "\n         * Value that will pass the precondition check for {@link BrentOptimizer}\n         * but will not pass the convergence check, so that the custom checker\n         * will always decide when to stop the line search.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "ABS_TOL_UNUSED"
      ],
      "begin_line": 300,
      "end_line": 300,
      "comment": "\n         * Value that will pass the precondition check for {@link BrentOptimizer}\n         * but will not pass the convergence check, so that the custom checker\n         * will always decide when to stop the line search.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "bracket"
      ],
      "begin_line": 304,
      "end_line": 304,
      "comment": "\n         * Automatic bracketing.\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer.LineSearch.LineSearch(double, double)",
      "begin_line": 314,
      "end_line": 319,
      "comment": "\n         * The \"BrentOptimizer\" default stopping criterion uses the tolerances\n         * to check the domain (point) values, not the function values.\n         * We thus create a custom checker to use function values.\n         *\n         * @param rel Relative threshold.\n         * @param abs Absolute threshold.\n         ",
      "child_ranges": [
        "(line 316,col 13)-(line 318,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer.LineSearch.search(double[], double[])",
      "begin_line": 330,
      "end_line": 354,
      "comment": "\n         * Find the minimum of the function {@code f(p + alpha * d)}.\n         *\n         * @param p Starting point.\n         * @param d Search direction.\n         * @return the optimum.\n         * @throws org.apache.commons.math3.exception.TooManyEvaluationsException\n         * if the number of evaluations is exceeded.\n         ",
      "child_ranges": [
        "(line 331,col 13)-(line 331,col 35)",
        "(line 332,col 13)-(line 341,col 18)",
        "(line 343,col 13)-(line 343,col 69)",
        "(line 344,col 13)-(line 344,col 42)",
        "(line 348,col 13)-(line 353,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer.LineSearch.Anonymous-305ae725-3983-4dad-a234-d368e03dd8a5.value(double)",
      "begin_line": 333,
      "end_line": 340,
      "comment": "",
      "child_ranges": [
        "(line 334,col 25)-(line 334,col 57)",
        "(line 335,col 25)-(line 337,col 25)",
        "(line 338,col 25)-(line 338,col 89)",
        "(line 339,col 25)-(line 339,col 35)"
      ]
    }
  ]
}