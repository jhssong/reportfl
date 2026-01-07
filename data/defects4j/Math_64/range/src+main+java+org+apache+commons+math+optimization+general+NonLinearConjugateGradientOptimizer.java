{
  "filepath": "/tmp/Math-64b/src/main/java/org/apache/commons/math/optimization/general/NonLinearConjugateGradientOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NonLinearConjugateGradientOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer"
      ],
      "begin_line": 43,
      "end_line": 291,
      "comment": ""
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
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizer.NonLinearConjugateGradientOptimizer(org.apache.commons.math.optimization.general.ConjugateGradientFormula)",
      "begin_line": 65,
      "end_line": 70,
      "comment": " Simple constructor with default settings.\n     * \u003cp\u003eThe convergence check is set to a {@link\n     * org.apache.commons.math.optimization.SimpleVectorialValueChecker}\n     * and the maximal number of iterations is set to\n     * {@link AbstractScalarDifferentiableOptimizer#DEFAULT_MAX_ITERATIONS}.\n     * @param updateFormula formula to use for updating the \u0026beta; parameter,\n     * must be one of {@link ConjugateGradientFormula#FLETCHER_REEVES} or {@link\n     * ConjugateGradientFormula#POLAK_RIBIERE}\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 43)",
        "(line 67,col 9)-(line 67,col 34)",
        "(line 68,col 9)-(line 68,col 34)",
        "(line 69,col 9)-(line 69,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizer.setPreconditioner(org.apache.commons.math.optimization.general.Preconditioner)",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * Set the preconditioner.\n     * @param preconditioner preconditioner to use for next optimization,\n     * may be null to remove an already registered preconditioner\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizer.setLineSearchSolver(org.apache.commons.math.analysis.solvers.UnivariateRealSolver)",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n     * Set the solver to use during line search.\n     * @param lineSearchSolver solver to use during line search, may be null\n     * to remove an already registered solver and fall back to the\n     * default {@link BrentSolver Brent solver}.\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 39)"
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
        "(line 113,col 9)-(line 210,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizer.findUpperBound(org.apache.commons.math.analysis.UnivariateRealFunction, double, double)",
      "begin_line": 222,
      "end_line": 235,
      "comment": "\n     * Find the upper bound b ensuring bracketing of a root between a and b\n     * @param f function whose root must be bracketed\n     * @param a lower bound of the interval\n     * @param h initial step to try\n     * @return b such that f(a) and f(b) have opposite signs\n     * @exception FunctionEvaluationException if the function cannot be computed\n     * @exception OptimizationException if no bracket can be found\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 37)",
        "(line 226,col 9)-(line 226,col 23)",
        "(line 227,col 9)-(line 233,col 9)",
        "(line 234,col 9)-(line 234,col 99)"
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
      "end_line": 245,
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
      "begin_line": 256,
      "end_line": 289,
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
      "end_line": 287,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 271,col 13)-(line 271,col 56)",
        "(line 272,col 13)-(line 274,col 13)",
        "(line 277,col 13)-(line 277,col 77)",
        "(line 280,col 13)-(line 280,col 34)",
        "(line 281,col 13)-(line 283,col 13)",
        "(line 285,col 13)-(line 285,col 30)"
      ]
    }
  ]
}