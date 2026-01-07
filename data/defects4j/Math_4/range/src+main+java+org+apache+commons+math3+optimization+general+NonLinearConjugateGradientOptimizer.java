{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optimization/general/NonLinearConjugateGradientOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NonLinearConjugateGradientOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.general.AbstractScalarDifferentiableOptimizer"
      ],
      "begin_line": 44,
      "end_line": 312,
      "comment": "\n * Non-linear conjugate gradient optimizer.\n * \u003cp\u003e\n * This class supports both the Fletcher-Reeves and the Polak-Ribi\u0026egrave;re\n * update formulas for the conjugate search directions. It also supports\n * optional preconditioning.\n * \u003c/p\u003e\n *\n * @version $Id$\n * @deprecated As of 3.1 (to be removed in 4.0).\n * @since 2.0\n *\n "
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
      "type": "field",
      "varNames": [
        "point"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Current point. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizer.NonLinearConjugateGradientOptimizer(org.apache.commons.math3.optimization.general.ConjugateGradientFormula)",
      "begin_line": 68,
      "end_line": 72,
      "comment": "\n     * Constructor with default {@link SimpleValueChecker checker},\n     * {@link BrentSolver line search solver} and\n     * {@link IdentityPreconditioner preconditioner}.\n     *\n     * @param updateFormula formula to use for updating the \u0026beta; parameter,\n     * must be one of {@link ConjugateGradientFormula#FLETCHER_REEVES} or {@link\n     * ConjugateGradientFormula#POLAK_RIBIERE}.\n     * @deprecated See {@link SimpleValueChecker#SimpleValueChecker()}\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 71,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizer.NonLinearConjugateGradientOptimizer(org.apache.commons.math3.optimization.general.ConjugateGradientFormula, org.apache.commons.math3.optimization.ConvergenceChecker\u003corg.apache.commons.math3.optimization.PointValuePair\u003e)",
      "begin_line": 83,
      "end_line": 89,
      "comment": "\n     * Constructor with default {@link BrentSolver line search solver} and\n     * {@link IdentityPreconditioner preconditioner}.\n     *\n     * @param updateFormula formula to use for updating the \u0026beta; parameter,\n     * must be one of {@link ConjugateGradientFormula#FLETCHER_REEVES} or {@link\n     * ConjugateGradientFormula#POLAK_RIBIERE}.\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 88,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizer.NonLinearConjugateGradientOptimizer(org.apache.commons.math3.optimization.general.ConjugateGradientFormula, org.apache.commons.math3.optimization.ConvergenceChecker\u003corg.apache.commons.math3.optimization.PointValuePair\u003e, org.apache.commons.math3.analysis.solvers.UnivariateSolver)",
      "begin_line": 101,
      "end_line": 108,
      "comment": "\n     * Constructor with default {@link IdentityPreconditioner preconditioner}.\n     *\n     * @param updateFormula formula to use for updating the \u0026beta; parameter,\n     * must be one of {@link ConjugateGradientFormula#FLETCHER_REEVES} or {@link\n     * ConjugateGradientFormula#POLAK_RIBIERE}.\n     * @param checker Convergence checker.\n     * @param lineSearchSolver Solver to use during line search.\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 107,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizer.NonLinearConjugateGradientOptimizer(org.apache.commons.math3.optimization.general.ConjugateGradientFormula, org.apache.commons.math3.optimization.ConvergenceChecker\u003corg.apache.commons.math3.optimization.PointValuePair\u003e, org.apache.commons.math3.analysis.solvers.UnivariateSolver, org.apache.commons.math3.optimization.general.Preconditioner)",
      "begin_line": 118,
      "end_line": 128,
      "comment": "\n     * @param updateFormula formula to use for updating the \u0026beta; parameter,\n     * must be one of {@link ConjugateGradientFormula#FLETCHER_REEVES} or {@link\n     * ConjugateGradientFormula#POLAK_RIBIERE}.\n     * @param checker Convergence checker.\n     * @param lineSearchSolver Solver to use during line search.\n     * @param preconditioner Preconditioner.\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 23)",
        "(line 124,col 9)-(line 124,col 43)",
        "(line 125,col 9)-(line 125,col 34)",
        "(line 126,col 9)-(line 126,col 45)",
        "(line 127,col 9)-(line 127,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizer.setInitialStep(double)",
      "begin_line": 140,
      "end_line": 146,
      "comment": "\n     * Set the initial step used to bracket the optimum in line search.\n     * \u003cp\u003e\n     * The initial step is a factor with respect to the search direction,\n     * which itself is roughly related to the gradient of the function\n     * \u003c/p\u003e\n     * @param initialStep initial step used to bracket the optimum in line search,\n     * if a non-positive value is used, the initial step is reset to its\n     * default value of 1.0\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 145,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizer.doOptimize()",
      "begin_line": 149,
      "end_line": 238,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 83)",
        "(line 152,col 9)-(line 152,col 32)",
        "(line 153,col 9)-(line 153,col 44)",
        "(line 154,col 9)-(line 154,col 35)",
        "(line 155,col 9)-(line 155,col 53)",
        "(line 156,col 9)-(line 160,col 9)",
        "(line 163,col 9)-(line 163,col 73)",
        "(line 164,col 9)-(line 164,col 59)",
        "(line 166,col 9)-(line 166,col 25)",
        "(line 167,col 9)-(line 169,col 9)",
        "(line 171,col 9)-(line 171,col 38)",
        "(line 172,col 9)-(line 172,col 21)",
        "(line 173,col 9)-(line 173,col 42)",
        "(line 174,col 9)-(line 237,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizer.findUpperBound(org.apache.commons.math3.analysis.UnivariateFunction, double, double)",
      "begin_line": 249,
      "end_line": 261,
      "comment": "\n     * Find the upper bound b ensuring bracketing of a root between a and b.\n     *\n     * @param f function whose root must be bracketed.\n     * @param a lower bound of the interval.\n     * @param h initial step to try.\n     * @return b such that f(a) and f(b) have opposite signs.\n     * @throws MathIllegalStateException if no bracket can be found.\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 37)",
        "(line 252,col 9)-(line 252,col 23)",
        "(line 253,col 9)-(line 259,col 9)",
        "(line 260,col 9)-(line 260,col 103)"
      ]
    },
    {
      "type": "class_interface",
      "name": "IdentityPreconditioner",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.general.Preconditioner"
      ],
      "begin_line": 264,
      "end_line": 270,
      "comment": " Default identity preconditioner. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizer.IdentityPreconditioner.precondition(double[], double[])",
      "begin_line": 267,
      "end_line": 269,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 268,col 13)-(line 268,col 29)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LineSearchFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.UnivariateFunction"
      ],
      "begin_line": 281,
      "end_line": 311,
      "comment": " Internal class for line search.\n     * \u003cp\u003e\n     * The function represented by this class is the dot product of\n     * the objective function gradient and the search direction. Its\n     * value is zero when the gradient is orthogonal to the search\n     * direction, i.e. when the objective function value is a local\n     * extremum along the search direction.\n     * \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "searchDirection"
      ],
      "begin_line": 283,
      "end_line": 283,
      "comment": " Search direction. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizer.LineSearchFunction.LineSearchFunction(double[])",
      "begin_line": 288,
      "end_line": 290,
      "comment": " Simple constructor.\n         * @param searchDirection search direction\n         ",
      "child_ranges": [
        "(line 289,col 13)-(line 289,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizer.LineSearchFunction.value(double)",
      "begin_line": 293,
      "end_line": 310,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 295,col 13)-(line 295,col 56)",
        "(line 296,col 13)-(line 298,col 13)",
        "(line 301,col 13)-(line 301,col 77)",
        "(line 304,col 13)-(line 304,col 34)",
        "(line 305,col 13)-(line 307,col 13)",
        "(line 309,col 13)-(line 309,col 30)"
      ]
    }
  ]
}