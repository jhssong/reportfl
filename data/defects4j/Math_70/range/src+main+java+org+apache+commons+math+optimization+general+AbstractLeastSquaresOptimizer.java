{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/optimization/general/AbstractLeastSquaresOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractLeastSquaresOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer"
      ],
      "begin_line": 43,
      "end_line": 368,
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
      "begin_line": 70,
      "end_line": 70,
      "comment": "\n     * Target value for the objective functions at optimum.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "residualsWeights"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": "\n     * Weight for the least squares cost computation.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "point"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Current point. "
    },
    {
      "type": "field",
      "varNames": [
        "objective"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " Current objective function value. "
    },
    {
      "type": "field",
      "varNames": [
        "residuals"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Current residuals. "
    },
    {
      "type": "field",
      "varNames": [
        "cost"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " Cost value (square root of the sum of the residuals). "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterations"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " Maximal number of iterations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "iterations"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " Number of iterations already performed. "
    },
    {
      "type": "field",
      "varNames": [
        "maxEvaluations"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " Maximal number of evaluations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "objectiveEvaluations"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " Number of evaluations already performed. "
    },
    {
      "type": "field",
      "varNames": [
        "jacobianEvaluations"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " Number of jacobian evaluations. "
    },
    {
      "type": "field",
      "varNames": [
        "function"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " Objective function. "
    },
    {
      "type": "field",
      "varNames": [
        "jF"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": " Objective function derivatives. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.AbstractLeastSquaresOptimizer()",
      "begin_line": 115,
      "end_line": 119,
      "comment": " Simple constructor with default settings.\n     * \u003cp\u003eThe convergence check is set to a {@link SimpleVectorialValueChecker}\n     * and the maximal number of evaluation is set to its default value.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 65)",
        "(line 117,col 9)-(line 117,col 49)",
        "(line 118,col 9)-(line 118,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.setMaxIterations(int)",
      "begin_line": 122,
      "end_line": 124,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getMaxIterations()",
      "begin_line": 127,
      "end_line": 129,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getIterations()",
      "begin_line": 132,
      "end_line": 134,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.setMaxEvaluations(int)",
      "begin_line": 137,
      "end_line": 139,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getMaxEvaluations()",
      "begin_line": 142,
      "end_line": 144,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getEvaluations()",
      "begin_line": 147,
      "end_line": 149,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getJacobianEvaluations()",
      "begin_line": 152,
      "end_line": 154,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.setConvergenceChecker(org.apache.commons.math.optimization.VectorialConvergenceChecker)",
      "begin_line": 157,
      "end_line": 159,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getConvergenceChecker()",
      "begin_line": 162,
      "end_line": 164,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.incrementIterationsCounter()",
      "begin_line": 170,
      "end_line": 175,
      "comment": " Increment the iterations counter by 1.\n     * @exception OptimizationException if the maximal number\n     * of iterations is exceeded\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 174,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateJacobian()",
      "begin_line": 182,
      "end_line": 196,
      "comment": "\n     * Update the jacobian matrix.\n     * @exception FunctionEvaluationException if the function jacobian\n     * cannot be evaluated or its dimension doesn\u0027t match problem dimension\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 30)",
        "(line 184,col 9)-(line 184,col 35)",
        "(line 185,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 195,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost()",
      "begin_line": 204,
      "end_line": 226,
      "comment": "\n     * Update the residuals array and cost function value.\n     * @exception FunctionEvaluationException if the function cannot be evaluated\n     * or its dimension doesn\u0027t match problem dimension or maximal number of\n     * of evaluations is exceeded\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 210,col 9)",
        "(line 211,col 9)-(line 211,col 42)",
        "(line 212,col 9)-(line 215,col 9)",
        "(line 216,col 9)-(line 216,col 17)",
        "(line 217,col 9)-(line 217,col 22)",
        "(line 218,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 224,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getRMS()",
      "begin_line": 238,
      "end_line": 245,
      "comment": "\n     * Get the Root Mean Square value.\n     * Get the Root Mean Square value, i.e. the root of the arithmetic\n     * mean of the square of all weighted residuals. This is related to the\n     * criterion that is minimized by the optimizer as follows: if\n     * \u003cem\u003ec\u003c/em\u003e if the criterion, and \u003cem\u003en\u003c/em\u003e is the number of\n     * measurements, then the RMS is \u003cem\u003esqrt (c/n)\u003c/em\u003e.\n     *\n     * @return RMS value\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 29)",
        "(line 240,col 9)-(line 243,col 9)",
        "(line 244,col 9)-(line 244,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getChiSquare()",
      "begin_line": 251,
      "end_line": 258,
      "comment": "\n     * Get the Chi-Square value.\n     * @return chi-square value\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 29)",
        "(line 253,col 9)-(line 256,col 9)",
        "(line 257,col 9)-(line 257,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getCovariances()",
      "begin_line": 268,
      "end_line": 296,
      "comment": "\n     * Get the covariance matrix of optimized parameters.\n     * @return covariance matrix\n     * @exception FunctionEvaluationException if the function jacobian cannot\n     * be evaluated\n     * @exception OptimizationException if the covariance matrix\n     * cannot be computed (singular problem)\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 25)",
        "(line 275,col 9)-(line 275,col 48)",
        "(line 276,col 9)-(line 285,col 9)",
        "(line 287,col 9)-(line 294,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.guessParametersErrors()",
      "begin_line": 307,
      "end_line": 321,
      "comment": "\n     * Guess the errors in optimized parameters.\n     * \u003cp\u003eGuessing is covariance-based, it only gives rough order of magnitude.\u003c/p\u003e\n     * @return errors in optimized parameters\n     * @exception FunctionEvaluationException if the function jacobian cannot b evaluated\n     * @exception OptimizationException if the covariances matrix cannot be computed\n     * or the number of degrees of freedom is not positive (number of measurements\n     * lesser or equal to number of parameters)\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 313,col 9)",
        "(line 314,col 9)-(line 314,col 43)",
        "(line 315,col 9)-(line 315,col 67)",
        "(line 316,col 9)-(line 316,col 44)",
        "(line 317,col 9)-(line 319,col 9)",
        "(line 320,col 9)-(line 320,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.optimize(org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction, double[], double[], double[])",
      "begin_line": 324,
      "end_line": 356,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 329,col 9)-(line 332,col 9)",
        "(line 335,col 9)-(line 335,col 33)",
        "(line 336,col 9)-(line 336,col 33)",
        "(line 337,col 9)-(line 337,col 33)",
        "(line 340,col 9)-(line 340,col 29)",
        "(line 341,col 9)-(line 341,col 40)",
        "(line 342,col 9)-(line 342,col 42)",
        "(line 343,col 9)-(line 343,col 43)",
        "(line 344,col 9)-(line 344,col 46)",
        "(line 345,col 9)-(line 345,col 53)",
        "(line 348,col 9)-(line 348,col 34)",
        "(line 349,col 9)-(line 349,col 33)",
        "(line 350,col 9)-(line 350,col 43)",
        "(line 352,col 9)-(line 352,col 40)",
        "(line 354,col 9)-(line 354,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.doOptimize()",
      "begin_line": 365,
      "end_line": 366,
      "comment": " Perform the bulk of optimization algorithm.\n     * @return the point/value pair giving the optimal value for objective function\n     * @exception FunctionEvaluationException if the objective function throws one during\n     * the search\n     * @exception OptimizationException if the algorithm failed to converge\n     * @exception IllegalArgumentException if the start point dimension is wrong\n     ",
      "child_ranges": []
    }
  ]
}