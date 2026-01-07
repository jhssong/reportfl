{
  "filepath": "/tmp/Math-63b/src/main/java/org/apache/commons/math/optimization/general/NonLinearConjugateGradientOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NonLinearConjugateGradientOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer"
      ],
      "begin_line": 44,
      "end_line": 293,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "updateFormula"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Update formula for the beta parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "preconditioner"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Preconditioner (may be null). "
    },
    {
      "type": "field",
      "varNames": [
        "solver"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " solver to use in the line search (may be null). "
    },
    {
      "type": "field",
      "varNames": [
        "initialStep"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Initial step used to bracket the optimum in line search. "
    },
    {
      "type": "field",
      "varNames": [
        "point"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Current point. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizer.NonLinearConjugateGradientOptimizer(org.apache.commons.math.optimization.general.ConjugateGradientFormula)",
      "begin_line": 66,
      "end_line": 71,
      "comment": "\n     * Simple constructor with default settings.\n     * The convergence check is set to a {@link\n     * org.apache.commons.math.optimization.SimpleVectorialValueChecker}.\n     *\n     * @param updateFormula formula to use for updating the \u0026beta; parameter,\n     * must be one of {@link ConjugateGradientFormula#FLETCHER_REEVES} or {@link\n     * ConjugateGradientFormula#POLAK_RIBIERE}\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 43)",
        "(line 68,col 9)-(line 68,col 34)",
        "(line 69,col 9)-(line 69,col 34)",
        "(line 70,col 9)-(line 70,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizer.setPreconditioner(org.apache.commons.math.optimization.general.Preconditioner)",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * Set the preconditioner.\n     * @param preconditioner preconditioner to use for next optimization,\n     * may be null to remove an already registered preconditioner\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizer.setLineSearchSolver(org.apache.commons.math.analysis.solvers.UnivariateRealSolver)",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * Set the solver to use during line search.\n     * @param lineSearchSolver solver to use during line search, may be null\n     * to remove an already registered solver and fall back to the\n     * default {@link BrentSolver Brent solver}.\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizer.setInitialStep(double)",
      "begin_line": 102,
      "end_line": 108,
      "comment": "\n     * Set the initial step used to bracket the optimum in line search.\n     * \u003cp\u003e\n     * The initial step is a factor with respect to the search direction,\n     * which itself is roughly related to the gradient of the function\n     * \u003c/p\u003e\n     * @param initialStep initial step used to bracket the optimum in line search,\n     * if a non-positive value is used, the initial step is reset to its\n     * default value of 1.0\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 107,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizer.doOptimize()",
      "begin_line": 111,
      "end_line": 212,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 115,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 120,col 9)",
        "(line 121,col 9)-(line 121,col 32)",
        "(line 122,col 9)-(line 122,col 44)",
        "(line 123,col 9)-(line 123,col 35)",
        "(line 124,col 9)-(line 124,col 53)",
        "(line 125,col 9)-(line 129,col 9)",
        "(line 132,col 9)-(line 132,col 73)",
        "(line 133,col 9)-(line 133,col 59)",
        "(line 135,col 9)-(line 135,col 25)",
        "(line 136,col 9)-(line 138,col 9)",
        "(line 140,col 9)-(line 140,col 42)",
        "(line 141,col 9)-(line 141,col 21)",
        "(line 142,col 9)-(line 211,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizer.findUpperBound(org.apache.commons.math.analysis.UnivariateRealFunction, double, double)",
      "begin_line": 224,
      "end_line": 237,
      "comment": "\n     * Find the upper bound b ensuring bracketing of a root between a and b\n     * @param f function whose root must be bracketed\n     * @param a lower bound of the interval\n     * @param h initial step to try\n     * @return b such that f(a) and f(b) have opposite signs\n     * @exception FunctionEvaluationException if the function cannot be computed\n     * @exception MathIllegalStateException if no bracket can be found\n     * @deprecated in 2.2 (must be replaced with \"BracketFinder\").\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 37)",
        "(line 228,col 9)-(line 228,col 23)",
        "(line 229,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 236,col 103)"
      ]
    },
    {
      "type": "class_interface",
      "name": "IdentityPreconditioner",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.Preconditioner"
      ],
      "begin_line": 240,
      "end_line": 247,
      "comment": " Default identity preconditioner. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizer.IdentityPreconditioner.precondition(double[], double[])",
      "begin_line": 243,
      "end_line": 245,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 244,col 13)-(line 244,col 29)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LineSearchFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealFunction"
      ],
      "begin_line": 258,
      "end_line": 291,
      "comment": " Internal class for line search.\n     * \u003cp\u003e\n     * The function represented by this class is the dot product of\n     * the objective function gradient and the search direction. Its\n     * value is zero when the gradient is orthogonal to the search\n     * direction, i.e. when the objective function value is a local\n     * extremum along the search direction.\n     * \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "searchDirection"
      ],
      "begin_line": 260,
      "end_line": 260,
      "comment": " Search direction. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizer.LineSearchFunction.LineSearchFunction(double[])",
      "begin_line": 265,
      "end_line": 267,
      "comment": " Simple constructor.\n         * @param searchDirection search direction\n         ",
      "child_ranges": [
        "(line 266,col 13)-(line 266,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizer.LineSearchFunction.value(double)",
      "begin_line": 270,
      "end_line": 289,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 273,col 13)-(line 273,col 56)",
        "(line 274,col 13)-(line 276,col 13)",
        "(line 279,col 13)-(line 279,col 77)",
        "(line 282,col 13)-(line 282,col 34)",
        "(line 283,col 13)-(line 285,col 13)",
        "(line 287,col 13)-(line 287,col 30)"
      ]
    }
  ]
}