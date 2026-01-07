{
  "filepath": "/tmp/Math-89b/src/java/org/apache/commons/math/optimization/general/NonLinearConjugateGradientOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NonLinearConjugateGradientOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer",
        "org.apache.commons.math.optimization.DifferentiableMultivariateRealOptimizer"
      ],
      "begin_line": 44,
      "end_line": 303,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Serializable version identifier. "
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
      "begin_line": 55,
      "end_line": 55,
      "comment": " Preconditioner (may be null). "
    },
    {
      "type": "field",
      "varNames": [
        "solver"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " solver to use in the line search (may be null). "
    },
    {
      "type": "field",
      "varNames": [
        "initialStep"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Initial step used to bracket the optimum in line search. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizer.NonLinearConjugateGradientOptimizer(org.apache.commons.math.optimization.general.ConjugateGradientFormula)",
      "begin_line": 71,
      "end_line": 76,
      "comment": " Simple constructor with default settings.\n     * \u003cp\u003eThe convergence check is set to a {@link SimpleVectorialValueChecker}\n     * and the maximal number of evaluation is set to\n     * {@link AbstractLinearOptimizer#DEFAULT_MAX_EVALUATIONS}.\n     * @param updateFormula formula to use for updating the \u0026beta; parameter,\n     * must be one of {@link UpdateFormula#FLETCHER_REEVES} or {@link\n     * UpdateFormula#POLAK_RIBIERE}\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 43)",
        "(line 73,col 9)-(line 73,col 34)",
        "(line 74,col 9)-(line 74,col 34)",
        "(line 75,col 9)-(line 75,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizer.setPreconditioner(org.apache.commons.math.optimization.general.Preconditioner)",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * Set the preconditioner.\n     * @param preconditioner preconditioner to use for next optimization,\n     * may be null to remove an already registered preconditioner\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizer.setLineSearchSolver(org.apache.commons.math.analysis.solvers.UnivariateRealSolver)",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     * Set the solver to use during line search.\n     * @param solver solver to use during line search, may be null\n     * to remove an already registered solver and fall back to the\n     * default {@link BrentSolver Brent solver}.\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizer.setInitialStep(double)",
      "begin_line": 107,
      "end_line": 113,
      "comment": "\n     * Set the initial step used to bracket the optimum in line search.\n     * \u003cp\u003e\n     * The initial step is a factor with respect to the search direction,\n     * which itself is roughly related to the gradient of the function\n     * \u003c/p\u003e\n     * @param initialStep initial step used to bracket the optimum in line search,\n     * if a non-positive value is used, the initial step is reset to its\n     * default value of 1.0\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 112,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizer.doOptimize()",
      "begin_line": 116,
      "end_line": 216,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 119,col 9)-(line 215,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizer.findUpperBound(org.apache.commons.math.analysis.UnivariateRealFunction, double, double)",
      "begin_line": 227,
      "end_line": 240,
      "comment": "\n     * Find the upper bound b ensuring bracketing of a root between a and b\n     * @param f function whose root must be bracketed\n     * @param a lower bound of the interval\n     * @param h initial step to try\n     * @return b such that f(a) and f(b) have opposite signs\n     * @exception FunctionEvaluationException if the function cannot be computed\n     * @exception OptimizationException if no bracket can be found\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 37)",
        "(line 231,col 9)-(line 231,col 23)",
        "(line 232,col 9)-(line 238,col 9)",
        "(line 239,col 9)-(line 239,col 84)"
      ]
    },
    {
      "type": "class_interface",
      "name": "IdentityPreconditioner",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.Preconditioner"
      ],
      "begin_line": 243,
      "end_line": 253,
      "comment": " Default identity preconditioner. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 246,
      "end_line": 246,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizer.IdentityPreconditioner.precondition(double[], double[])",
      "begin_line": 249,
      "end_line": 251,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 250,col 13)-(line 250,col 29)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LineSearchFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealFunction"
      ],
      "begin_line": 264,
      "end_line": 301,
      "comment": " Internal class for line search.\n     * \u003cp\u003e\n     * The function represented by this class is the dot product of\n     * the objective function gradient and the search direction. Its\n     * value is zero when the gradient is orthogonal to the search\n     * direction, i.e. when the objective function value is a local\n     * extremum along the search direction.\n     * \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 267,
      "end_line": 267,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "searchDirection"
      ],
      "begin_line": 270,
      "end_line": 270,
      "comment": " Search direction. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizer.LineSearchFunction.LineSearchFunction(double[])",
      "begin_line": 275,
      "end_line": 277,
      "comment": " Simple constructor.\n         * @param searchDirection search direction\n         ",
      "child_ranges": [
        "(line 276,col 13)-(line 276,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizer.LineSearchFunction.value(double)",
      "begin_line": 280,
      "end_line": 299,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 283,col 13)-(line 283,col 56)",
        "(line 284,col 13)-(line 286,col 13)",
        "(line 289,col 13)-(line 289,col 77)",
        "(line 292,col 13)-(line 292,col 34)",
        "(line 293,col 13)-(line 295,col 13)",
        "(line 297,col 13)-(line 297,col 30)"
      ]
    }
  ]
}