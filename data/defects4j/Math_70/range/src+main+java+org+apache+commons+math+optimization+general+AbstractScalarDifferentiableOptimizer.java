{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/optimization/general/AbstractScalarDifferentiableOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractScalarDifferentiableOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.DifferentiableMultivariateRealOptimizer"
      ],
      "begin_line": 39,
      "end_line": 204,
      "comment": "\n * Base class for implementing optimizers for multivariate scalar functions.\n * \u003cp\u003eThis base class handles the boilerplate methods associated to thresholds\n * settings, iterations and evaluations counting.\u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MAX_ITERATIONS"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Default maximal number of iterations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "checker"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Convergence checker. "
    },
    {
      "type": "field",
      "varNames": [
        "goal"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * Type of optimization.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "point"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Current point set. "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterations"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Maximal number of iterations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "iterations"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Number of iterations already performed. "
    },
    {
      "type": "field",
      "varNames": [
        "maxEvaluations"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Maximal number of evaluations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "evaluations"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Number of evaluations already performed. "
    },
    {
      "type": "field",
      "varNames": [
        "gradientEvaluations"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Number of gradient evaluations. "
    },
    {
      "type": "field",
      "varNames": [
        "function"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Objective function. "
    },
    {
      "type": "field",
      "varNames": [
        "gradient"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Objective function gradient. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer.AbstractScalarDifferentiableOptimizer()",
      "begin_line": 82,
      "end_line": 86,
      "comment": " Simple constructor with default settings.\n     * \u003cp\u003eThe convergence check is set to a {@link SimpleScalarValueChecker}\n     * and the maximal number of evaluation is set to its default value.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 62)",
        "(line 84,col 9)-(line 84,col 49)",
        "(line 85,col 9)-(line 85,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer.setMaxIterations(int)",
      "begin_line": 89,
      "end_line": 91,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer.getMaxIterations()",
      "begin_line": 94,
      "end_line": 96,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer.getIterations()",
      "begin_line": 99,
      "end_line": 101,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer.setMaxEvaluations(int)",
      "begin_line": 104,
      "end_line": 106,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer.getMaxEvaluations()",
      "begin_line": 109,
      "end_line": 111,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer.getEvaluations()",
      "begin_line": 114,
      "end_line": 116,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer.getGradientEvaluations()",
      "begin_line": 119,
      "end_line": 121,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer.setConvergenceChecker(org.apache.commons.math.optimization.RealConvergenceChecker)",
      "begin_line": 124,
      "end_line": 126,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer.getConvergenceChecker()",
      "begin_line": 129,
      "end_line": 131,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer.incrementIterationsCounter()",
      "begin_line": 137,
      "end_line": 142,
      "comment": " Increment the iterations counter by 1.\n     * @exception OptimizationException if the maximal number\n     * of iterations is exceeded\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 141,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer.computeObjectiveGradient(double[])",
      "begin_line": 150,
      "end_line": 154,
      "comment": "\n     * Compute the gradient vector.\n     * @param evaluationPoint point at which the gradient must be evaluated\n     * @return gradient at the specified point\n     * @exception FunctionEvaluationException if the function gradient\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 30)",
        "(line 153,col 9)-(line 153,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer.computeObjectiveValue(double[])",
      "begin_line": 164,
      "end_line": 171,
      "comment": "\n     * Compute the objective function value.\n     * @param evaluationPoint point at which the objective function must be evaluated\n     * @return objective function value at specified point\n     * @exception FunctionEvaluationException if the function cannot be evaluated\n     * or its dimension doesn\u0027t match problem dimension or the maximal number\n     * of iterations is exceeded\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 169,col 9)",
        "(line 170,col 9)-(line 170,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer.optimize(org.apache.commons.math.analysis.DifferentiableMultivariateRealFunction, org.apache.commons.math.optimization.GoalType, double[])",
      "begin_line": 174,
      "end_line": 192,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 32)",
        "(line 181,col 9)-(line 181,col 32)",
        "(line 182,col 9)-(line 182,col 32)",
        "(line 185,col 9)-(line 185,col 21)",
        "(line 186,col 9)-(line 186,col 32)",
        "(line 187,col 9)-(line 187,col 28)",
        "(line 188,col 9)-(line 188,col 38)",
        "(line 190,col 9)-(line 190,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer.doOptimize()",
      "begin_line": 201,
      "end_line": 202,
      "comment": " Perform the bulk of optimization algorithm.\n     * @return the point/value pair giving the optimal value for objective function\n     * @exception FunctionEvaluationException if the objective function throws one during\n     * the search\n     * @exception OptimizationException if the algorithm failed to converge\n     * @exception IllegalArgumentException if the start point dimension is wrong\n     ",
      "child_ranges": []
    }
  ]
}