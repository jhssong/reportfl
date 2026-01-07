{
  "filepath": "/tmp/Math-35b/src/main/java/org/apache/commons/math3/optimization/general/NonLinearConjugateGradientOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NonLinearConjugateGradientOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.general.AbstractScalarDifferentiableOptimizer"
      ],
      "begin_line": 43,
      "end_line": 310,
      "comment": "\n * Non-linear conjugate gradient optimizer.\n * \u003cp\u003e\n * This class supports both the Fletcher-Reeves and the Polak-Ribi\u0026egrave;re\n * update formulas for the conjugate search directions. It also supports\n * optional preconditioning.\n * \u003c/p\u003e\n *\n * @version $Id$\n * @since 2.0\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "updateFormula"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Update formula for the beta parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "preconditioner"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Preconditioner (may be null). "
    },
    {
      "type": "field",
      "varNames": [
        "solver"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " solver to use in the line search (may be null). "
    },
    {
      "type": "field",
      "varNames": [
        "initialStep"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Initial step used to bracket the optimum in line search. "
    },
    {
      "type": "field",
      "varNames": [
        "point"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Current point. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizer.NonLinearConjugateGradientOptimizer(org.apache.commons.math3.optimization.general.ConjugateGradientFormula)",
      "begin_line": 65,
      "end_line": 68,
      "comment": "\n     * Constructor with default {@link SimpleValueChecker checker},\n     * {@link BrentSolver line search solver} and\n     * {@link IdentityPreconditioner preconditioner}.\n     *\n     * @param updateFormula formula to use for updating the \u0026beta; parameter,\n     * must be one of {@link ConjugateGradientFormula#FLETCHER_REEVES} or {@link\n     * ConjugateGradientFormula#POLAK_RIBIERE}.\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 67,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizer.NonLinearConjugateGradientOptimizer(org.apache.commons.math3.optimization.general.ConjugateGradientFormula, org.apache.commons.math3.optimization.ConvergenceChecker\u003corg.apache.commons.math3.optimization.PointValuePair\u003e)",
      "begin_line": 79,
      "end_line": 85,
      "comment": "\n     * Constructor with default {@link BrentSolver line search solver} and\n     * {@link IdentityPreconditioner preconditioner}.\n     *\n     * @param updateFormula formula to use for updating the \u0026beta; parameter,\n     * must be one of {@link ConjugateGradientFormula#FLETCHER_REEVES} or {@link\n     * ConjugateGradientFormula#POLAK_RIBIERE}.\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 84,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizer.NonLinearConjugateGradientOptimizer(org.apache.commons.math3.optimization.general.ConjugateGradientFormula, org.apache.commons.math3.optimization.ConvergenceChecker\u003corg.apache.commons.math3.optimization.PointValuePair\u003e, org.apache.commons.math3.analysis.solvers.UnivariateSolver)",
      "begin_line": 97,
      "end_line": 104,
      "comment": "\n     * Constructor with default {@link IdentityPreconditioner preconditioner}.\n     *\n     * @param updateFormula formula to use for updating the \u0026beta; parameter,\n     * must be one of {@link ConjugateGradientFormula#FLETCHER_REEVES} or {@link\n     * ConjugateGradientFormula#POLAK_RIBIERE}.\n     * @param checker Convergence checker.\n     * @param lineSearchSolver Solver to use during line search.\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 103,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizer.NonLinearConjugateGradientOptimizer(org.apache.commons.math3.optimization.general.ConjugateGradientFormula, org.apache.commons.math3.optimization.ConvergenceChecker\u003corg.apache.commons.math3.optimization.PointValuePair\u003e, org.apache.commons.math3.analysis.solvers.UnivariateSolver, org.apache.commons.math3.optimization.general.Preconditioner)",
      "begin_line": 114,
      "end_line": 124,
      "comment": "\n     * @param updateFormula formula to use for updating the \u0026beta; parameter,\n     * must be one of {@link ConjugateGradientFormula#FLETCHER_REEVES} or {@link\n     * ConjugateGradientFormula#POLAK_RIBIERE}.\n     * @param checker Convergence checker.\n     * @param lineSearchSolver Solver to use during line search.\n     * @param preconditioner Preconditioner.\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 23)",
        "(line 120,col 9)-(line 120,col 43)",
        "(line 121,col 9)-(line 121,col 34)",
        "(line 122,col 9)-(line 122,col 45)",
        "(line 123,col 9)-(line 123,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizer.setInitialStep(double)",
      "begin_line": 136,
      "end_line": 142,
      "comment": "\n     * Set the initial step used to bracket the optimum in line search.\n     * \u003cp\u003e\n     * The initial step is a factor with respect to the search direction,\n     * which itself is roughly related to the gradient of the function\n     * \u003c/p\u003e\n     * @param initialStep initial step used to bracket the optimum in line search,\n     * if a non-positive value is used, the initial step is reset to its\n     * default value of 1.0\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 141,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizer.doOptimize()",
      "begin_line": 145,
      "end_line": 236,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 83)",
        "(line 148,col 9)-(line 148,col 32)",
        "(line 149,col 9)-(line 149,col 44)",
        "(line 150,col 9)-(line 150,col 35)",
        "(line 151,col 9)-(line 151,col 53)",
        "(line 152,col 9)-(line 156,col 9)",
        "(line 159,col 9)-(line 159,col 73)",
        "(line 160,col 9)-(line 160,col 59)",
        "(line 162,col 9)-(line 162,col 25)",
        "(line 163,col 9)-(line 165,col 9)",
        "(line 167,col 9)-(line 167,col 38)",
        "(line 168,col 9)-(line 168,col 21)",
        "(line 169,col 9)-(line 169,col 42)",
        "(line 170,col 9)-(line 235,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizer.findUpperBound(org.apache.commons.math3.analysis.UnivariateFunction, double, double)",
      "begin_line": 247,
      "end_line": 259,
      "comment": "\n     * Find the upper bound b ensuring bracketing of a root between a and b.\n     *\n     * @param f function whose root must be bracketed.\n     * @param a lower bound of the interval.\n     * @param h initial step to try.\n     * @return b such that f(a) and f(b) have opposite signs.\n     * @throws MathIllegalStateException if no bracket can be found.\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 37)",
        "(line 250,col 9)-(line 250,col 23)",
        "(line 251,col 9)-(line 257,col 9)",
        "(line 258,col 9)-(line 258,col 103)"
      ]
    },
    {
      "type": "class_interface",
      "name": "IdentityPreconditioner",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.general.Preconditioner"
      ],
      "begin_line": 262,
      "end_line": 268,
      "comment": " Default identity preconditioner. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizer.IdentityPreconditioner.precondition(double[], double[])",
      "begin_line": 265,
      "end_line": 267,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 266,col 13)-(line 266,col 29)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LineSearchFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.UnivariateFunction"
      ],
      "begin_line": 279,
      "end_line": 309,
      "comment": " Internal class for line search.\n     * \u003cp\u003e\n     * The function represented by this class is the dot product of\n     * the objective function gradient and the search direction. Its\n     * value is zero when the gradient is orthogonal to the search\n     * direction, i.e. when the objective function value is a local\n     * extremum along the search direction.\n     * \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "searchDirection"
      ],
      "begin_line": 281,
      "end_line": 281,
      "comment": " Search direction. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizer.LineSearchFunction.LineSearchFunction(double[])",
      "begin_line": 286,
      "end_line": 288,
      "comment": " Simple constructor.\n         * @param searchDirection search direction\n         ",
      "child_ranges": [
        "(line 287,col 13)-(line 287,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizer.LineSearchFunction.value(double)",
      "begin_line": 291,
      "end_line": 308,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 293,col 13)-(line 293,col 56)",
        "(line 294,col 13)-(line 296,col 13)",
        "(line 299,col 13)-(line 299,col 77)",
        "(line 302,col 13)-(line 302,col 34)",
        "(line 303,col 13)-(line 305,col 13)",
        "(line 307,col 13)-(line 307,col 30)"
      ]
    }
  ]
}