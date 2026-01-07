{
  "filepath": "/tmp/Math-1b/src/main/java/org/apache/commons/math3/optim/nonlinear/scalar/noderiv/PowellOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PowellOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer"
      ],
      "begin_line": 65,
      "end_line": 378,
      "comment": "\n * Powell\u0027s algorithm.\n * This code is translated and adapted from the Python version of this\n * algorithm (as implemented in module {@code optimize.py} v0.5 of\n * \u003cem\u003eSciPy\u003c/em\u003e).\n * \u003cbr/\u003e\n * The default stopping criterion is based on the differences of the\n * function value between two successive iterations. It is however possible\n * to define a custom convergence checker that might terminate the algorithm\n * earlier.\n * \u003cbr/\u003e\n * The internal line search optimizer is a {@link BrentOptimizer} with a\n * convergence checker set to {@link SimpleUnivariateValueChecker}.\n * \u003cbr/\u003e\n * Constraints are not supported: the call to\n * {@link #optimize(OptimizationData[]) optimize} will throw\n * {@link MathUnsupportedOperationException} if bounds are passed to it.\n * In order to impose simple constraints, the objective function must be\n * wrapped in an adapter like\n * {@link org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionMappingAdapter\n * MultivariateFunctionMappingAdapter} or\n * {@link org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionPenaltyAdapter\n * MultivariateFunctionPenaltyAdapter}.\n *\n * @version $Id$\n * @since 2.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "MIN_RELATIVE_TOLERANCE"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": "\n     * Minimum relative tolerance.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "relativeThreshold"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": "\n     * Relative threshold.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "absoluteThreshold"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": "\n     * Absolute threshold.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "line"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": "\n     * Line search.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer.PowellOptimizer(double, double, org.apache.commons.math3.optim.ConvergenceChecker\u003corg.apache.commons.math3.optim.PointValuePair\u003e)",
      "begin_line": 98,
      "end_line": 102,
      "comment": "\n     * This constructor allows to specify a user-defined convergence checker,\n     * in addition to the parameters that control the default convergence\n     * checking procedure.\n     * \u003cbr/\u003e\n     * The internal line search tolerances are set to the square-root of their\n     * corresponding value in the multivariate optimizer.\n     *\n     * @param rel Relative threshold.\n     * @param abs Absolute threshold.\n     * @param checker Convergence checker.\n     * @throws NotStrictlyPositiveException if {@code abs \u003c\u003d 0}.\n     * @throws NumberIsTooSmallException if {@code rel \u003c 2 * Math.ulp(1d)}.\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 72)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer.PowellOptimizer(double, double, double, double, org.apache.commons.math3.optim.ConvergenceChecker\u003corg.apache.commons.math3.optim.PointValuePair\u003e)",
      "begin_line": 117,
      "end_line": 136,
      "comment": "\n     * This constructor allows to specify a user-defined convergence checker,\n     * in addition to the parameters that control the default convergence\n     * checking procedure and the line search tolerances.\n     *\n     * @param rel Relative threshold for this optimizer.\n     * @param abs Absolute threshold for this optimizer.\n     * @param lineRel Relative threshold for the internal line search optimizer.\n     * @param lineAbs Absolute threshold for the internal line search optimizer.\n     * @param checker Convergence checker.\n     * @throws NotStrictlyPositiveException if {@code abs \u003c\u003d 0}.\n     * @throws NumberIsTooSmallException if {@code rel \u003c 2 * Math.ulp(1d)}.\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 23)",
        "(line 124,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 129,col 9)",
        "(line 130,col 9)-(line 130,col 32)",
        "(line 131,col 9)-(line 131,col 32)",
        "(line 134,col 9)-(line 135,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer.PowellOptimizer(double, double)",
      "begin_line": 149,
      "end_line": 152,
      "comment": "\n     * The parameters control the default convergence checking procedure.\n     * \u003cbr/\u003e\n     * The internal line search tolerances are set to the square-root of their\n     * corresponding value in the multivariate optimizer.\n     *\n     * @param rel Relative threshold.\n     * @param abs Absolute threshold.\n     * @throws NotStrictlyPositiveException if {@code abs \u003c\u003d 0}.\n     * @throws NumberIsTooSmallException if {@code rel \u003c 2 * Math.ulp(1d)}.\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer.PowellOptimizer(double, double, double, double)",
      "begin_line": 164,
      "end_line": 169,
      "comment": "\n     * Builds an instance with the default convergence checking procedure.\n     *\n     * @param rel Relative threshold.\n     * @param abs Absolute threshold.\n     * @param lineRel Relative threshold for the internal line search optimizer.\n     * @param lineAbs Absolute threshold for the internal line search optimizer.\n     * @throws NotStrictlyPositiveException if {@code abs \u003c\u003d 0}.\n     * @throws NumberIsTooSmallException if {@code rel \u003c 2 * Math.ulp(1d)}.\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer.doOptimize()",
      "begin_line": 172,
      "end_line": 265,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 26)",
        "(line 176,col 9)-(line 176,col 44)",
        "(line 177,col 9)-(line 177,col 47)",
        "(line 178,col 9)-(line 178,col 35)",
        "(line 180,col 9)-(line 180,col 50)",
        "(line 181,col 9)-(line 183,col 9)",
        "(line 185,col 9)-(line 186,col 38)",
        "(line 188,col 9)-(line 188,col 27)",
        "(line 189,col 9)-(line 189,col 47)",
        "(line 190,col 9)-(line 190,col 32)",
        "(line 191,col 9)-(line 264,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer.newPointAndDirection(double[], double[], double)",
      "begin_line": 277,
      "end_line": 293,
      "comment": "\n     * Compute a new point (in the original space) and a new direction\n     * vector, resulting from the line search.\n     *\n     * @param p Point used in the line search.\n     * @param d Direction used in the line search.\n     * @param optimum Optimum found by the line search.\n     * @return a 2-element array containing the new point (at index 0) and\n     * the new direction (at index 1).\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 31)",
        "(line 281,col 9)-(line 281,col 42)",
        "(line 282,col 9)-(line 282,col 42)",
        "(line 283,col 9)-(line 286,col 9)",
        "(line 288,col 9)-(line 288,col 50)",
        "(line 289,col 9)-(line 289,col 23)",
        "(line 290,col 9)-(line 290,col 23)",
        "(line 292,col 9)-(line 292,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LineSearch",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optim.univariate.BrentOptimizer"
      ],
      "begin_line": 299,
      "end_line": 366,
      "comment": "\n     * Class for finding the minimum of the objective function along a given\n     * direction.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "REL_TOL_UNUSED"
      ],
      "begin_line": 305,
      "end_line": 305,
      "comment": "\n         * Value that will pass the precondition check for {@link BrentOptimizer}\n         * but will not pass the convergence check, so that the custom checker\n         * will always decide when to stop the line search.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "ABS_TOL_UNUSED"
      ],
      "begin_line": 311,
      "end_line": 311,
      "comment": "\n         * Value that will pass the precondition check for {@link BrentOptimizer}\n         * but will not pass the convergence check, so that the custom checker\n         * will always decide when to stop the line search.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "bracket"
      ],
      "begin_line": 315,
      "end_line": 315,
      "comment": "\n         * Automatic bracketing.\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer.LineSearch.LineSearch(double, double)",
      "begin_line": 325,
      "end_line": 330,
      "comment": "\n         * The \"BrentOptimizer\" default stopping criterion uses the tolerances\n         * to check the domain (point) values, not the function values.\n         * We thus create a custom checker to use function values.\n         *\n         * @param rel Relative threshold.\n         * @param abs Absolute threshold.\n         ",
      "child_ranges": [
        "(line 327,col 13)-(line 329,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer.LineSearch.search(double[], double[])",
      "begin_line": 341,
      "end_line": 365,
      "comment": "\n         * Find the minimum of the function {@code f(p + alpha * d)}.\n         *\n         * @param p Starting point.\n         * @param d Search direction.\n         * @return the optimum.\n         * @throws org.apache.commons.math3.exception.TooManyEvaluationsException\n         * if the number of evaluations is exceeded.\n         ",
      "child_ranges": [
        "(line 342,col 13)-(line 342,col 35)",
        "(line 343,col 13)-(line 352,col 18)",
        "(line 354,col 13)-(line 354,col 69)",
        "(line 355,col 13)-(line 355,col 42)",
        "(line 359,col 13)-(line 364,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer.LineSearch.Anonymous-077f942f-bb38-4718-ab78-6cc8ebeb9837.value(double)",
      "begin_line": 344,
      "end_line": 351,
      "comment": "",
      "child_ranges": [
        "(line 345,col 25)-(line 345,col 57)",
        "(line 346,col 25)-(line 348,col 25)",
        "(line 349,col 25)-(line 349,col 89)",
        "(line 350,col 25)-(line 350,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer.checkParameters()",
      "begin_line": 372,
      "end_line": 377,
      "comment": "\n     * @throws MathUnsupportedOperationException if bounds were passed to the\n     * {@link #optimize(OptimizationData[]) optimize} method.\n     ",
      "child_ranges": [
        "(line 373,col 9)-(line 376,col 9)"
      ]
    }
  ]
}