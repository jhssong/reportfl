{
  "filepath": "/tmp/Math-60b/src/main/java/org/apache/commons/math/optimization/general/NonLinearConjugateGradientOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NonLinearConjugateGradientOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer"
      ],
      "begin_line": 42,
      "end_line": 287,
      "comment": "\n * Non-linear conjugate gradient optimizer.\n * \u003cp\u003e\n * This class supports both the Fletcher-Reeves and the Polak-Ribi\u0026egrave;re\n * update formulas for the conjugate search directions. It also supports\n * optional preconditioning.\n * \u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 2.0\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "updateFormula"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Update formula for the beta parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "preconditioner"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Preconditioner (may be null). "
    },
    {
      "type": "field",
      "varNames": [
        "solver"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " solver to use in the line search (may be null). "
    },
    {
      "type": "field",
      "varNames": [
        "initialStep"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Initial step used to bracket the optimum in line search. "
    },
    {
      "type": "field",
      "varNames": [
        "point"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Current point. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizer.NonLinearConjugateGradientOptimizer(org.apache.commons.math.optimization.general.ConjugateGradientFormula)",
      "begin_line": 64,
      "end_line": 69,
      "comment": "\n     * Simple constructor with default settings.\n     * The convergence check is set to a {@link\n     * org.apache.commons.math.optimization.SimpleVectorialValueChecker}.\n     *\n     * @param updateFormula formula to use for updating the \u0026beta; parameter,\n     * must be one of {@link ConjugateGradientFormula#FLETCHER_REEVES} or {@link\n     * ConjugateGradientFormula#POLAK_RIBIERE}\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 43)",
        "(line 66,col 9)-(line 66,col 34)",
        "(line 67,col 9)-(line 67,col 34)",
        "(line 68,col 9)-(line 68,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizer.setPreconditioner(org.apache.commons.math.optimization.general.Preconditioner)",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Set the preconditioner.\n     * @param preconditioner preconditioner to use for next optimization,\n     * may be null to remove an already registered preconditioner\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizer.setLineSearchSolver(org.apache.commons.math.analysis.solvers.UnivariateRealSolver)",
      "begin_line": 86,
      "end_line": 89,
      "comment": "\n     * Set the solver to use during line search.\n     * @param lineSearchSolver solver to use during line search, may be null\n     * to remove an already registered solver and fall back to the\n     * default {@link BrentSolver Brent solver}.\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 34)",
        "(line 88,col 9)-(line 88,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizer.setInitialStep(double)",
      "begin_line": 101,
      "end_line": 107,
      "comment": "\n     * Set the initial step used to bracket the optimum in line search.\n     * \u003cp\u003e\n     * The initial step is a factor with respect to the search direction,\n     * which itself is roughly related to the gradient of the function\n     * \u003c/p\u003e\n     * @param initialStep initial step used to bracket the optimum in line search,\n     * if a non-positive value is used, the initial step is reset to its\n     * default value of 1.0\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 106,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizer.doOptimize()",
      "begin_line": 110,
      "end_line": 211,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 113,col 9)-(line 115,col 9)",
        "(line 116,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 120,col 32)",
        "(line 121,col 9)-(line 121,col 44)",
        "(line 122,col 9)-(line 122,col 35)",
        "(line 123,col 9)-(line 123,col 53)",
        "(line 124,col 9)-(line 128,col 9)",
        "(line 131,col 9)-(line 131,col 73)",
        "(line 132,col 9)-(line 132,col 59)",
        "(line 134,col 9)-(line 134,col 25)",
        "(line 135,col 9)-(line 137,col 9)",
        "(line 139,col 9)-(line 139,col 42)",
        "(line 140,col 9)-(line 140,col 21)",
        "(line 141,col 9)-(line 210,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizer.findUpperBound(org.apache.commons.math.analysis.UnivariateRealFunction, double, double)",
      "begin_line": 223,
      "end_line": 236,
      "comment": "\n     * Find the upper bound b ensuring bracketing of a root between a and b.\n     *\n     * @param f function whose root must be bracketed.\n     * @param a lower bound of the interval.\n     * @param h initial step to try.\n     * @return b such that f(a) and f(b) have opposite signs.\n     * @exception MathIllegalStateException if no bracket can be found.\n     * @exception MathUserException if function throws one.\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 37)",
        "(line 227,col 9)-(line 227,col 23)",
        "(line 228,col 9)-(line 234,col 9)",
        "(line 235,col 9)-(line 235,col 103)"
      ]
    },
    {
      "type": "class_interface",
      "name": "IdentityPreconditioner",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.Preconditioner"
      ],
      "begin_line": 239,
      "end_line": 245,
      "comment": " Default identity preconditioner. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizer.IdentityPreconditioner.precondition(double[], double[])",
      "begin_line": 242,
      "end_line": 244,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 243,col 13)-(line 243,col 29)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LineSearchFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealFunction"
      ],
      "begin_line": 256,
      "end_line": 286,
      "comment": " Internal class for line search.\n     * \u003cp\u003e\n     * The function represented by this class is the dot product of\n     * the objective function gradient and the search direction. Its\n     * value is zero when the gradient is orthogonal to the search\n     * direction, i.e. when the objective function value is a local\n     * extremum along the search direction.\n     * \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "searchDirection"
      ],
      "begin_line": 258,
      "end_line": 258,
      "comment": " Search direction. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizer.LineSearchFunction.LineSearchFunction(double[])",
      "begin_line": 263,
      "end_line": 265,
      "comment": " Simple constructor.\n         * @param searchDirection search direction\n         ",
      "child_ranges": [
        "(line 264,col 13)-(line 264,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizer.LineSearchFunction.value(double)",
      "begin_line": 268,
      "end_line": 285,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 270,col 13)-(line 270,col 56)",
        "(line 271,col 13)-(line 273,col 13)",
        "(line 276,col 13)-(line 276,col 77)",
        "(line 279,col 13)-(line 279,col 34)",
        "(line 280,col 13)-(line 282,col 13)",
        "(line 284,col 13)-(line 284,col 30)"
      ]
    }
  ]
}