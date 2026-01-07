{
  "filepath": "/tmp/Math-58b/src/main/java/org/apache/commons/math/optimization/general/NonLinearConjugateGradientOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NonLinearConjugateGradientOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer"
      ],
      "begin_line": 41,
      "end_line": 286,
      "comment": "\n * Non-linear conjugate gradient optimizer.\n * \u003cp\u003e\n * This class supports both the Fletcher-Reeves and the Polak-Ribi\u0026egrave;re\n * update formulas for the conjugate search directions. It also supports\n * optional preconditioning.\n * \u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 2.0\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "updateFormula"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Update formula for the beta parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "preconditioner"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Preconditioner (may be null). "
    },
    {
      "type": "field",
      "varNames": [
        "solver"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " solver to use in the line search (may be null). "
    },
    {
      "type": "field",
      "varNames": [
        "initialStep"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Initial step used to bracket the optimum in line search. "
    },
    {
      "type": "field",
      "varNames": [
        "point"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Current point. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizer.NonLinearConjugateGradientOptimizer(org.apache.commons.math.optimization.general.ConjugateGradientFormula)",
      "begin_line": 63,
      "end_line": 68,
      "comment": "\n     * Simple constructor with default settings.\n     * The convergence check is set to a {@link\n     * org.apache.commons.math.optimization.SimpleVectorialValueChecker}.\n     *\n     * @param updateFormula formula to use for updating the \u0026beta; parameter,\n     * must be one of {@link ConjugateGradientFormula#FLETCHER_REEVES} or {@link\n     * ConjugateGradientFormula#POLAK_RIBIERE}\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 43)",
        "(line 65,col 9)-(line 65,col 34)",
        "(line 66,col 9)-(line 66,col 34)",
        "(line 67,col 9)-(line 67,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizer.setPreconditioner(org.apache.commons.math.optimization.general.Preconditioner)",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\n     * Set the preconditioner.\n     * @param preconditioner preconditioner to use for next optimization,\n     * may be null to remove an already registered preconditioner\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizer.setLineSearchSolver(org.apache.commons.math.analysis.solvers.UnivariateRealSolver)",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * Set the solver to use during line search.\n     * @param lineSearchSolver solver to use during line search, may be null\n     * to remove an already registered solver and fall back to the\n     * default {@link BrentSolver Brent solver}.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizer.setInitialStep(double)",
      "begin_line": 99,
      "end_line": 105,
      "comment": "\n     * Set the initial step used to bracket the optimum in line search.\n     * \u003cp\u003e\n     * The initial step is a factor with respect to the search direction,\n     * which itself is roughly related to the gradient of the function\n     * \u003c/p\u003e\n     * @param initialStep initial step used to bracket the optimum in line search,\n     * if a non-positive value is used, the initial step is reset to its\n     * default value of 1.0\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 104,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizer.doOptimize()",
      "begin_line": 108,
      "end_line": 210,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 111,col 9)-(line 113,col 9)",
        "(line 114,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 117,col 32)",
        "(line 118,col 9)-(line 118,col 44)",
        "(line 119,col 9)-(line 119,col 35)",
        "(line 120,col 9)-(line 120,col 53)",
        "(line 121,col 9)-(line 125,col 9)",
        "(line 128,col 9)-(line 128,col 73)",
        "(line 129,col 9)-(line 129,col 59)",
        "(line 131,col 9)-(line 131,col 25)",
        "(line 132,col 9)-(line 134,col 9)",
        "(line 136,col 9)-(line 136,col 42)",
        "(line 137,col 9)-(line 137,col 21)",
        "(line 138,col 9)-(line 138,col 42)",
        "(line 139,col 9)-(line 209,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizer.findUpperBound(org.apache.commons.math.analysis.UnivariateRealFunction, double, double)",
      "begin_line": 223,
      "end_line": 235,
      "comment": "\n     * Find the upper bound b ensuring bracketing of a root between a and b.\n     *\n     * @param f function whose root must be bracketed.\n     * @param a lower bound of the interval.\n     * @param h initial step to try.\n     * @return b such that f(a) and f(b) have opposite signs.\n     * @throws MathIllegalStateException if no bracket can be found.\n     * @throws org.apache.commons.math.exception.MathUserException if the\n     * function throws one.\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 37)",
        "(line 226,col 9)-(line 226,col 23)",
        "(line 227,col 9)-(line 233,col 9)",
        "(line 234,col 9)-(line 234,col 103)"
      ]
    },
    {
      "type": "class_interface",
      "name": "IdentityPreconditioner",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.Preconditioner"
      ],
      "begin_line": 238,
      "end_line": 244,
      "comment": " Default identity preconditioner. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizer.IdentityPreconditioner.precondition(double[], double[])",
      "begin_line": 241,
      "end_line": 243,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 242,col 13)-(line 242,col 29)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LineSearchFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealFunction"
      ],
      "begin_line": 255,
      "end_line": 285,
      "comment": " Internal class for line search.\n     * \u003cp\u003e\n     * The function represented by this class is the dot product of\n     * the objective function gradient and the search direction. Its\n     * value is zero when the gradient is orthogonal to the search\n     * direction, i.e. when the objective function value is a local\n     * extremum along the search direction.\n     * \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "searchDirection"
      ],
      "begin_line": 257,
      "end_line": 257,
      "comment": " Search direction. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizer.LineSearchFunction.LineSearchFunction(double[])",
      "begin_line": 262,
      "end_line": 264,
      "comment": " Simple constructor.\n         * @param searchDirection search direction\n         ",
      "child_ranges": [
        "(line 263,col 13)-(line 263,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizer.LineSearchFunction.value(double)",
      "begin_line": 267,
      "end_line": 284,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 269,col 13)-(line 269,col 56)",
        "(line 270,col 13)-(line 272,col 13)",
        "(line 275,col 13)-(line 275,col 77)",
        "(line 278,col 13)-(line 278,col 34)",
        "(line 279,col 13)-(line 281,col 13)",
        "(line 283,col 13)-(line 283,col 30)"
      ]
    }
  ]
}