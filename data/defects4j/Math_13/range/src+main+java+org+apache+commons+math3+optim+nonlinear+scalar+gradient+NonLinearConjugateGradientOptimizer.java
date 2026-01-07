{
  "filepath": "/tmp/Math-13b/src/main/java/org/apache/commons/math3/optim/nonlinear/scalar/gradient/NonLinearConjugateGradientOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NonLinearConjugateGradientOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optim.nonlinear.scalar.GradientMultivariateOptimizer"
      ],
      "begin_line": 45,
      "end_line": 393,
      "comment": "\n * Non-linear conjugate gradient optimizer.\n * \u003cp\u003e\n * This class supports both the Fletcher-Reeves and the Polak-Ribière\n * update formulas for the conjugate search directions.\n * It also supports optional preconditioning.\n * \u003c/p\u003e\n *\n * @version $Id: NonLinearConjugateGradientOptimizer.java 1416643 2012-12-03 19:37:14Z tn $\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "updateFormula"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Update formula for the beta parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "preconditioner"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Preconditioner (may be null). "
    },
    {
      "type": "field",
      "varNames": [
        "solver"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " solver to use in the line search (may be null). "
    },
    {
      "type": "field",
      "varNames": [
        "initialStep"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Initial step used to bracket the optimum in line search. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.NonLinearConjugateGradientOptimizer(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula, org.apache.commons.math3.optim.ConvergenceChecker\u003corg.apache.commons.math3.optim.PointValuePair\u003e)",
      "begin_line": 65,
      "end_line": 71,
      "comment": "\n     * Constructor with default {@link BrentSolver line search solver} and\n     * {@link IdentityPreconditioner preconditioner}.\n     *\n     * @param updateFormula formula to use for updating the \u0026beta; parameter,\n     * must be one of {@link Formula#FLETCHER_REEVES} or\n     * {@link Formula#POLAK_RIBIERE}.\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 70,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BracketingStep",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optim.OptimizationData"
      ],
      "begin_line": 107,
      "end_line": 126,
      "comment": "\n     * The initial step is a factor with respect to the search direction\n     * (which itself is roughly related to the gradient of the function).\n     * \u003cbr/\u003e\n     * It is used to find an interval that brackets the optimum in line\n     * search.\n     *\n     * @since 3.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "initialStep"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": " Initial step. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep.BracketingStep(double)",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n         * @param step Initial step for the bracket search.\n         ",
      "child_ranges": [
        "(line 115,col 13)-(line 115,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep.getBracketingStep()",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\n         * Gets the initial step.\n         *\n         * @return the initial step.\n         ",
      "child_ranges": [
        "(line 124,col 13)-(line 124,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.NonLinearConjugateGradientOptimizer(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula, org.apache.commons.math3.optim.ConvergenceChecker\u003corg.apache.commons.math3.optim.PointValuePair\u003e, org.apache.commons.math3.analysis.solvers.UnivariateSolver)",
      "begin_line": 137,
      "end_line": 144,
      "comment": "\n     * Constructor with default {@link IdentityPreconditioner preconditioner}.\n     *\n     * @param updateFormula formula to use for updating the \u0026beta; parameter,\n     * must be one of {@link Formula#FLETCHER_REEVES} or\n     * {@link Formula#POLAK_RIBIERE}.\n     * @param checker Convergence checker.\n     * @param lineSearchSolver Solver to use during line search.\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 143,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.NonLinearConjugateGradientOptimizer(org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula, org.apache.commons.math3.optim.ConvergenceChecker\u003corg.apache.commons.math3.optim.PointValuePair\u003e, org.apache.commons.math3.analysis.solvers.UnivariateSolver, org.apache.commons.math3.optim.nonlinear.scalar.gradient.Preconditioner)",
      "begin_line": 154,
      "end_line": 164,
      "comment": "\n     * @param updateFormula formula to use for updating the \u0026beta; parameter,\n     * must be one of {@link Formula#FLETCHER_REEVES} or\n     * {@link Formula#POLAK_RIBIERE}.\n     * @param checker Convergence checker.\n     * @param lineSearchSolver Solver to use during line search.\n     * @param preconditioner Preconditioner.\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 23)",
        "(line 160,col 9)-(line 160,col 43)",
        "(line 161,col 9)-(line 161,col 34)",
        "(line 162,col 9)-(line 162,col 45)",
        "(line 163,col 9)-(line 163,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.optimize(org.apache.commons.math3.optim.OptimizationData...)",
      "begin_line": 184,
      "end_line": 191,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @param optData Optimization data.\n     * The following data will be looked for:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@link org.apache.commons.math3.optim.MaxEval}\u003c/li\u003e\n     *  \u003cli\u003e{@link org.apache.commons.math3.optim.InitialGuess}\u003c/li\u003e\n     *  \u003cli\u003e{@link org.apache.commons.math3.optim.SimpleBounds}\u003c/li\u003e\n     *  \u003cli\u003e{@link org.apache.commons.math3.optim.nonlinear.scalar.GoalType}\u003c/li\u003e\n     *  \u003cli\u003e{@link org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction}\u003c/li\u003e\n     *  \u003cli\u003e{@link org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunctionGradient}\u003c/li\u003e\n     *  \u003cli\u003e{@link BracketingStep}\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @return {@inheritDoc}\n     * @throws TooManyEvaluationsException if the maximal number of\n     * evaluations (of the objective function) is exceeded.\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 39)",
        "(line 190,col 9)-(line 190,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.doOptimize()",
      "begin_line": 194,
      "end_line": 291,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 83)",
        "(line 197,col 9)-(line 197,col 47)",
        "(line 198,col 9)-(line 198,col 44)",
        "(line 199,col 9)-(line 199,col 35)",
        "(line 200,col 9)-(line 200,col 53)",
        "(line 201,col 9)-(line 205,col 9)",
        "(line 208,col 9)-(line 208,col 73)",
        "(line 209,col 9)-(line 209,col 59)",
        "(line 211,col 9)-(line 211,col 25)",
        "(line 212,col 9)-(line 214,col 9)",
        "(line 216,col 9)-(line 216,col 38)",
        "(line 217,col 9)-(line 217,col 21)",
        "(line 218,col 9)-(line 218,col 42)",
        "(line 219,col 9)-(line 290,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.parseOptimizationData(org.apache.commons.math3.optim.OptimizationData...)",
      "begin_line": 303,
      "end_line": 314,
      "comment": "\n     * Scans the list of (required and optional) optimization data that\n     * characterize the problem.\n     *\n     * @param optData Optimization data.\n     * The following data will be looked for:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@link InitialStep}\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 313,col 9)"
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
    }
  ]
}