{
  "filepath": "/tmp/Math-86b/src/java/org/apache/commons/math/optimization/general/AbstractScalarDifferentiableOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractScalarDifferentiableOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.DifferentiableMultivariateRealOptimizer"
      ],
      "begin_line": 38,
      "end_line": 187,
      "comment": "\n * Base class for implementing optimizers for multivariate scalar functions.\n * \u003cp\u003eThis base class handles the boilerplate methods associated to thresholds\n * settings, iterations and evaluations counting.\u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MAX_ITERATIONS"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Default maximal number of iterations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterations"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Maximal number of iterations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "iterations"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Number of iterations already performed. "
    },
    {
      "type": "field",
      "varNames": [
        "evaluations"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Number of evaluations already performed. "
    },
    {
      "type": "field",
      "varNames": [
        "gradientEvaluations"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Number of gradient evaluations. "
    },
    {
      "type": "field",
      "varNames": [
        "checker"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Convergence checker. "
    },
    {
      "type": "field",
      "varNames": [
        "f"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Objective function. "
    },
    {
      "type": "field",
      "varNames": [
        "gradient"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Objective function gradient. "
    },
    {
      "type": "field",
      "varNames": [
        "goalType"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Type of optimization. "
    },
    {
      "type": "field",
      "varNames": [
        "point"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Current point set. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer.AbstractScalarDifferentiableOptimizer()",
      "begin_line": 78,
      "end_line": 81,
      "comment": " Simple constructor with default settings.\n     * \u003cp\u003eThe convergence check is set to a {@link SimpleScalarValueChecker}\n     * and the maximal number of evaluation is set to its default value.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 62)",
        "(line 80,col 9)-(line 80,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer.setMaxIterations(int)",
      "begin_line": 84,
      "end_line": 86,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer.getMaxIterations()",
      "begin_line": 89,
      "end_line": 91,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer.getIterations()",
      "begin_line": 94,
      "end_line": 96,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer.getEvaluations()",
      "begin_line": 99,
      "end_line": 101,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer.getGradientEvaluations()",
      "begin_line": 104,
      "end_line": 106,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer.setConvergenceChecker(org.apache.commons.math.optimization.RealConvergenceChecker)",
      "begin_line": 109,
      "end_line": 111,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer.getConvergenceChecker()",
      "begin_line": 114,
      "end_line": 116,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer.incrementIterationsCounter()",
      "begin_line": 122,
      "end_line": 129,
      "comment": " Increment the iterations counter by 1.\n     * @exception OptimizationException if the maximal number\n     * of iterations is exceeded\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 128,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer.computeObjectiveGradient(double[])",
      "begin_line": 137,
      "end_line": 141,
      "comment": " \n     * Compute the gradient vector.\n     * @param point point at which the gradient must be evaluated\n     * @return gradient at the specified point\n     * @exception FunctionEvaluationException if the function gradient\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 30)",
        "(line 140,col 9)-(line 140,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer.computeObjectiveValue(double[])",
      "begin_line": 150,
      "end_line": 154,
      "comment": " \n     * Compute the objective function value.\n     * @param point point at which the objective function must be evaluated\n     * @return objective function value at specified point\n     * @exception FunctionEvaluationException if the function cannot be evaluated\n     * or its dimension doesn\u0027t match problem dimension\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 22)",
        "(line 153,col 9)-(line 153,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer.optimize(org.apache.commons.math.analysis.DifferentiableMultivariateRealFunction, org.apache.commons.math.optimization.GoalType, double[])",
      "begin_line": 157,
      "end_line": 175,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 32)",
        "(line 164,col 9)-(line 164,col 32)",
        "(line 165,col 9)-(line 165,col 32)",
        "(line 168,col 9)-(line 168,col 26)",
        "(line 169,col 9)-(line 169,col 37)",
        "(line 170,col 9)-(line 170,col 33)",
        "(line 171,col 9)-(line 171,col 43)",
        "(line 173,col 9)-(line 173,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer.doOptimize()",
      "begin_line": 184,
      "end_line": 185,
      "comment": " Perform the bulk of optimization algorithm.\n     * @return the point/value pair giving the optimal value for objective function\n     * @exception FunctionEvaluationException if the objective function throws one during\n     * the search\n     * @exception OptimizationException if the algorithm failed to converge\n     * @exception IllegalArgumentException if the start point dimension is wrong\n     ",
      "child_ranges": []
    }
  ]
}