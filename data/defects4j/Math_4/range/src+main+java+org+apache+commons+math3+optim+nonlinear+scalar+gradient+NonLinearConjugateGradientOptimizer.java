{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optim/nonlinear/scalar/gradient/NonLinearConjugateGradientOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NonLinearConjugateGradientOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optim.nonlinear.scalar.GradientMultivariateOptimizer"
      ],
      "begin_line": 49,
      "end_line": 404,
      "comment": "\n * Non-linear conjugate gradient optimizer.\n * \u003cbr/\u003e\n * This class supports both the Fletcher-Reeves and the Polak-Ribière\n * update formulas for the conjugate search directions.\n * It also supports optional preconditioning.\n * \u003cbr/\u003e\n * Constraints are not supported: the call to\n * {@link #optimize(OptimizationData[]) optimize} will throw\n * {@link MathUnsupportedOperationException} if bounds are passed to it.\n *\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "updateFormula"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Update formula for the beta parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "preconditioner"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Preconditioner (may be null). "
    },
    {
      "type": "field",
      "varNames": [
        "solver"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " solver to use in the line search (may be null). "
    },
    {
      "type": "field",
      "varNames": [
        "initialStep"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Initial step used to bracket the optimum in line search. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.NonLinearConjugateGradientOptimizer(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula, org.apache.commons.math3.optim.ConvergenceChecker\u003corg.apache.commons.math3.optim.PointValuePair\u003e)",
      "begin_line": 69,
      "end_line": 75,
      "comment": "\n     * Constructor with default {@link BrentSolver line search solver} and\n     * {@link IdentityPreconditioner preconditioner}.\n     *\n     * @param updateFormula formula to use for updating the \u0026beta; parameter,\n     * must be one of {@link Formula#FLETCHER_REEVES} or\n     * {@link Formula#POLAK_RIBIERE}.\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 74,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BracketingStep",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optim.OptimizationData"
      ],
      "begin_line": 111,
      "end_line": 130,
      "comment": "\n     * The initial step is a factor with respect to the search direction\n     * (which itself is roughly related to the gradient of the function).\n     * \u003cbr/\u003e\n     * It is used to find an interval that brackets the optimum in line\n     * search.\n     *\n     * @since 3.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "initialStep"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": " Initial step. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep.BracketingStep(double)",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\n         * @param step Initial step for the bracket search.\n         ",
      "child_ranges": [
        "(line 119,col 13)-(line 119,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep.getBracketingStep()",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\n         * Gets the initial step.\n         *\n         * @return the initial step.\n         ",
      "child_ranges": [
        "(line 128,col 13)-(line 128,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.NonLinearConjugateGradientOptimizer(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula, org.apache.commons.math3.optim.ConvergenceChecker\u003corg.apache.commons.math3.optim.PointValuePair\u003e, org.apache.commons.math3.analysis.solvers.UnivariateSolver)",
      "begin_line": 141,
      "end_line": 148,
      "comment": "\n     * Constructor with default {@link IdentityPreconditioner preconditioner}.\n     *\n     * @param updateFormula formula to use for updating the \u0026beta; parameter,\n     * must be one of {@link Formula#FLETCHER_REEVES} or\n     * {@link Formula#POLAK_RIBIERE}.\n     * @param checker Convergence checker.\n     * @param lineSearchSolver Solver to use during line search.\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 147,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.NonLinearConjugateGradientOptimizer(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula, org.apache.commons.math3.optim.ConvergenceChecker\u003corg.apache.commons.math3.optim.PointValuePair\u003e, org.apache.commons.math3.analysis.solvers.UnivariateSolver, org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner)",
      "begin_line": 158,
      "end_line": 168,
      "comment": "\n     * @param updateFormula formula to use for updating the \u0026beta; parameter,\n     * must be one of {@link Formula#FLETCHER_REEVES} or\n     * {@link Formula#POLAK_RIBIERE}.\n     * @param checker Convergence checker.\n     * @param lineSearchSolver Solver to use during line search.\n     * @param preconditioner Preconditioner.\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 23)",
        "(line 164,col 9)-(line 164,col 43)",
        "(line 165,col 9)-(line 165,col 34)",
        "(line 166,col 9)-(line 166,col 45)",
        "(line 167,col 9)-(line 167,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.optimize(org.apache.commons.math3.optim.OptimizationData...)",
      "begin_line": 183,
      "end_line": 188,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @param optData Optimization data. In addition to those documented in\n     * {@link GradientMultivariateOptimizer#parseOptimizationData(OptimizationData[])\n     * GradientMultivariateOptimizer}, this method will register the following data:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@link BracketingStep}\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @return {@inheritDoc}\n     * @throws TooManyEvaluationsException if the maximal number of\n     * evaluations (of the objective function) is exceeded.\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.doOptimize()",
      "begin_line": 191,
      "end_line": 285,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 83)",
        "(line 194,col 9)-(line 194,col 47)",
        "(line 195,col 9)-(line 195,col 44)",
        "(line 196,col 9)-(line 196,col 35)",
        "(line 197,col 9)-(line 197,col 53)",
        "(line 198,col 9)-(line 202,col 9)",
        "(line 205,col 9)-(line 205,col 73)",
        "(line 206,col 9)-(line 206,col 59)",
        "(line 208,col 9)-(line 208,col 25)",
        "(line 209,col 9)-(line 211,col 9)",
        "(line 213,col 9)-(line 213,col 38)",
        "(line 214,col 9)-(line 214,col 42)",
        "(line 215,col 9)-(line 284,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.parseOptimizationData(org.apache.commons.math3.optim.OptimizationData...)",
      "begin_line": 297,
      "end_line": 314,
      "comment": "\n     * Scans the list of (required and optional) optimization data that\n     * characterize the problem.\n     *\n     * @param optData Optimization data.\n     * The following data will be looked for:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@link BracketingStep}\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 45)",
        "(line 304,col 9)-(line 311,col 9)",
        "(line 313,col 9)-(line 313,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.findUpperBound(org.apache.commons.math3.analysis.UnivariateFunction, double, double)",
      "begin_line": 325,
      "end_line": 337,
      "comment": "\n     * Finds the upper bound b ensuring bracketing of a root between a and b.\n     *\n     * @param f function whose root must be bracketed.\n     * @param a lower bound of the interval.\n     * @param h initial step to try.\n     * @return b such that f(a) and f(b) have opposite signs.\n     * @throws MathIllegalStateException if no bracket can be found.\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 37)",
        "(line 328,col 9)-(line 328,col 23)",
        "(line 329,col 9)-(line 335,col 9)",
        "(line 336,col 9)-(line 336,col 103)"
      ]
    },
    {
      "type": "class_interface",
      "name": "IdentityPreconditioner",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner"
      ],
      "begin_line": 340,
      "end_line": 345,
      "comment": " Default identity preconditioner. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner.precondition(double[], double[])",
      "begin_line": 342,
      "end_line": 344,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 343,col 13)-(line 343,col 29)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LineSearchFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.UnivariateFunction"
      ],
      "begin_line": 357,
      "end_line": 392,
      "comment": "\n     * Internal class for line search.\n     * \u003cp\u003e\n     * The function represented by this class is the dot product of\n     * the objective function gradient and the search direction. Its\n     * value is zero when the gradient is orthogonal to the search\n     * direction, i.e. when the objective function value is a local\n     * extremum along the search direction.\n     * \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "currentPoint"
      ],
      "begin_line": 359,
      "end_line": 359,
      "comment": " Current point. "
    },
    {
      "type": "field",
      "varNames": [
        "searchDirection"
      ],
      "begin_line": 361,
      "end_line": 361,
      "comment": " Search direction. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.LineSearchFunction.LineSearchFunction(double[], double[])",
      "begin_line": 367,
      "end_line": 371,
      "comment": "\n         * @param point Current point.\n         * @param direction Search direction.\n         ",
      "child_ranges": [
        "(line 369,col 13)-(line 369,col 41)",
        "(line 370,col 13)-(line 370,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.LineSearchFunction.value(double)",
      "begin_line": 374,
      "end_line": 391,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 376,col 13)-(line 376,col 63)",
        "(line 377,col 13)-(line 379,col 13)",
        "(line 382,col 13)-(line 382,col 77)",
        "(line 385,col 13)-(line 385,col 34)",
        "(line 386,col 13)-(line 388,col 13)",
        "(line 390,col 13)-(line 390,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.checkParameters()",
      "begin_line": 398,
      "end_line": 403,
      "comment": "\n     * @throws MathUnsupportedOperationException if bounds were passed to the\n     * {@link #optimize(OptimizationData[]) optimize} method.\n     ",
      "child_ranges": [
        "(line 399,col 9)-(line 402,col 9)"
      ]
    }
  ]
}