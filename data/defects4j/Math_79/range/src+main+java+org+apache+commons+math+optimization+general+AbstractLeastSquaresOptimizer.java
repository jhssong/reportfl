{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/optimization/general/AbstractLeastSquaresOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractLeastSquaresOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer"
      ],
      "begin_line": 43,
      "end_line": 362,
      "comment": "\n * Base class for implementing least squares optimizers.\n * \u003cp\u003eThis base class handles the boilerplate methods associated to thresholds\n * settings, jacobian and error estimation.\u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 1.2\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MAX_ITERATIONS"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Default maximal number of iterations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "checker"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Convergence checker. "
    },
    {
      "type": "field",
      "varNames": [
        "jacobian"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     * Jacobian matrix.\n     * \u003cp\u003eThis matrix is in canonical form just after the calls to\n     * {@link #updateJacobian()}, but may be modified by the solver\n     * in the derived class (the {@link LevenbergMarquardtOptimizer\n     * Levenberg-Marquardt optimizer} does this).\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cols"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Number of columns of the jacobian matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "rows"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Number of rows of the jacobian matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "targetValues"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Target value for the objective functions at optimum. "
    },
    {
      "type": "field",
      "varNames": [
        "residualsWeights"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Weight for the least squares cost computation. "
    },
    {
      "type": "field",
      "varNames": [
        "point"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Current point. "
    },
    {
      "type": "field",
      "varNames": [
        "objective"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Current objective function value. "
    },
    {
      "type": "field",
      "varNames": [
        "residuals"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Current residuals. "
    },
    {
      "type": "field",
      "varNames": [
        "cost"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " Cost value (square root of the sum of the residuals). "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterations"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Maximal number of iterations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "iterations"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " Number of iterations already performed. "
    },
    {
      "type": "field",
      "varNames": [
        "maxEvaluations"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " Maximal number of evaluations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "objectiveEvaluations"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " Number of evaluations already performed. "
    },
    {
      "type": "field",
      "varNames": [
        "jacobianEvaluations"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " Number of jacobian evaluations. "
    },
    {
      "type": "field",
      "varNames": [
        "function"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " Objective function. "
    },
    {
      "type": "field",
      "varNames": [
        "jF"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " Objective function derivatives. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.AbstractLeastSquaresOptimizer()",
      "begin_line": 109,
      "end_line": 113,
      "comment": " Simple constructor with default settings.\n     * \u003cp\u003eThe convergence check is set to a {@link SimpleVectorialValueChecker}\n     * and the maximal number of evaluation is set to its default value.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 65)",
        "(line 111,col 9)-(line 111,col 49)",
        "(line 112,col 9)-(line 112,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.setMaxIterations(int)",
      "begin_line": 116,
      "end_line": 118,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getMaxIterations()",
      "begin_line": 121,
      "end_line": 123,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getIterations()",
      "begin_line": 126,
      "end_line": 128,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.setMaxEvaluations(int)",
      "begin_line": 131,
      "end_line": 133,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getMaxEvaluations()",
      "begin_line": 136,
      "end_line": 138,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getEvaluations()",
      "begin_line": 141,
      "end_line": 143,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getJacobianEvaluations()",
      "begin_line": 146,
      "end_line": 148,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.setConvergenceChecker(org.apache.commons.math.optimization.VectorialConvergenceChecker)",
      "begin_line": 151,
      "end_line": 153,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getConvergenceChecker()",
      "begin_line": 156,
      "end_line": 158,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.incrementIterationsCounter()",
      "begin_line": 164,
      "end_line": 169,
      "comment": " Increment the iterations counter by 1.\n     * @exception OptimizationException if the maximal number\n     * of iterations is exceeded\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 168,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateJacobian()",
      "begin_line": 176,
      "end_line": 190,
      "comment": "\n     * Update the jacobian matrix.\n     * @exception FunctionEvaluationException if the function jacobian\n     * cannot be evaluated or its dimension doesn\u0027t match problem dimension\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 30)",
        "(line 178,col 9)-(line 178,col 35)",
        "(line 179,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 189,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost()",
      "begin_line": 198,
      "end_line": 220,
      "comment": "\n     * Update the residuals array and cost function value.\n     * @exception FunctionEvaluationException if the function cannot be evaluated\n     * or its dimension doesn\u0027t match problem dimension or maximal number of\n     * of evaluations is exceeded\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 204,col 9)",
        "(line 205,col 9)-(line 205,col 42)",
        "(line 206,col 9)-(line 209,col 9)",
        "(line 210,col 9)-(line 210,col 17)",
        "(line 211,col 9)-(line 211,col 22)",
        "(line 212,col 9)-(line 217,col 9)",
        "(line 218,col 9)-(line 218,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getRMS()",
      "begin_line": 232,
      "end_line": 239,
      "comment": "\n     * Get the Root Mean Square value.\n     * Get the Root Mean Square value, i.e. the root of the arithmetic\n     * mean of the square of all weighted residuals. This is related to the\n     * criterion that is minimized by the optimizer as follows: if\n     * \u003cem\u003ec\u003c/em\u003e if the criterion, and \u003cem\u003en\u003c/em\u003e is the number of\n     * measurements, then the RMS is \u003cem\u003esqrt (c/n)\u003c/em\u003e.\n     *\n     * @return RMS value\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 29)",
        "(line 234,col 9)-(line 237,col 9)",
        "(line 238,col 9)-(line 238,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getChiSquare()",
      "begin_line": 245,
      "end_line": 252,
      "comment": "\n     * Get the Chi-Square value.\n     * @return chi-square value\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 29)",
        "(line 247,col 9)-(line 250,col 9)",
        "(line 251,col 9)-(line 251,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getCovariances()",
      "begin_line": 262,
      "end_line": 290,
      "comment": "\n     * Get the covariance matrix of optimized parameters.\n     * @return covariance matrix\n     * @exception FunctionEvaluationException if the function jacobian cannot\n     * be evaluated\n     * @exception OptimizationException if the covariance matrix\n     * cannot be computed (singular problem)\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 25)",
        "(line 269,col 9)-(line 269,col 48)",
        "(line 270,col 9)-(line 279,col 9)",
        "(line 281,col 9)-(line 288,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.guessParametersErrors()",
      "begin_line": 301,
      "end_line": 315,
      "comment": "\n     * Guess the errors in optimized parameters.\n     * \u003cp\u003eGuessing is covariance-based, it only gives rough order of magnitude.\u003c/p\u003e\n     * @return errors in optimized parameters\n     * @exception FunctionEvaluationException if the function jacobian cannot b evaluated\n     * @exception OptimizationException if the covariances matrix cannot be computed\n     * or the number of degrees of freedom is not positive (number of measurements\n     * lesser or equal to number of parameters)\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 307,col 9)",
        "(line 308,col 9)-(line 308,col 43)",
        "(line 309,col 9)-(line 309,col 67)",
        "(line 310,col 9)-(line 310,col 44)",
        "(line 311,col 9)-(line 313,col 9)",
        "(line 314,col 9)-(line 314,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.optimize(org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction, double[], double[], double[])",
      "begin_line": 318,
      "end_line": 350,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 323,col 9)-(line 326,col 9)",
        "(line 329,col 9)-(line 329,col 33)",
        "(line 330,col 9)-(line 330,col 33)",
        "(line 331,col 9)-(line 331,col 33)",
        "(line 334,col 9)-(line 334,col 29)",
        "(line 335,col 9)-(line 335,col 40)",
        "(line 336,col 9)-(line 336,col 42)",
        "(line 337,col 9)-(line 337,col 43)",
        "(line 338,col 9)-(line 338,col 46)",
        "(line 339,col 9)-(line 339,col 53)",
        "(line 342,col 9)-(line 342,col 34)",
        "(line 343,col 9)-(line 343,col 33)",
        "(line 344,col 9)-(line 344,col 43)",
        "(line 346,col 9)-(line 346,col 40)",
        "(line 348,col 9)-(line 348,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.doOptimize()",
      "begin_line": 359,
      "end_line": 360,
      "comment": " Perform the bulk of optimization algorithm.\n     * @return the point/value pair giving the optimal value for objective function\n     * @exception FunctionEvaluationException if the objective function throws one during\n     * the search\n     * @exception OptimizationException if the algorithm failed to converge\n     * @exception IllegalArgumentException if the start point dimension is wrong\n     ",
      "child_ranges": []
    }
  ]
}