{
  "filepath": "/tmp/Math-66b/src/main/java/org/apache/commons/math/optimization/general/AbstractLeastSquaresOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractLeastSquaresOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer"
      ],
      "begin_line": 44,
      "end_line": 369,
      "comment": "\n * Base class for implementing least squares optimizers.\n * \u003cp\u003eThis base class handles the boilerplate methods associated to thresholds\n * settings, jacobian and error estimation.\u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 1.2\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MAX_ITERATIONS"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Default maximal number of iterations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "checker"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Convergence checker. "
    },
    {
      "type": "field",
      "varNames": [
        "jacobian"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * Jacobian matrix.\n     * \u003cp\u003eThis matrix is in canonical form just after the calls to\n     * {@link #updateJacobian()}, but may be modified by the solver\n     * in the derived class (the {@link LevenbergMarquardtOptimizer\n     * Levenberg-Marquardt optimizer} does this).\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cols"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Number of columns of the jacobian matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "rows"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Number of rows of the jacobian matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "targetValues"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": "\n     * Target value for the objective functions at optimum.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "residualsWeights"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": "\n     * Weight for the least squares cost computation.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "point"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " Current point. "
    },
    {
      "type": "field",
      "varNames": [
        "objective"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " Current objective function value. "
    },
    {
      "type": "field",
      "varNames": [
        "residuals"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " Current residuals. "
    },
    {
      "type": "field",
      "varNames": [
        "cost"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " Cost value (square root of the sum of the residuals). "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterations"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " Maximal number of iterations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "iterations"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " Number of iterations already performed. "
    },
    {
      "type": "field",
      "varNames": [
        "maxEvaluations"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " Maximal number of evaluations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "objectiveEvaluations"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": " Number of evaluations already performed. "
    },
    {
      "type": "field",
      "varNames": [
        "jacobianEvaluations"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": " Number of jacobian evaluations. "
    },
    {
      "type": "field",
      "varNames": [
        "function"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": " Objective function. "
    },
    {
      "type": "field",
      "varNames": [
        "jF"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": " Objective function derivatives. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.AbstractLeastSquaresOptimizer()",
      "begin_line": 116,
      "end_line": 120,
      "comment": " Simple constructor with default settings.\n     * \u003cp\u003eThe convergence check is set to a {@link SimpleVectorialValueChecker}\n     * and the maximal number of evaluation is set to its default value.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 65)",
        "(line 118,col 9)-(line 118,col 49)",
        "(line 119,col 9)-(line 119,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.setMaxIterations(int)",
      "begin_line": 123,
      "end_line": 125,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getMaxIterations()",
      "begin_line": 128,
      "end_line": 130,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getIterations()",
      "begin_line": 133,
      "end_line": 135,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.setMaxEvaluations(int)",
      "begin_line": 138,
      "end_line": 140,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getMaxEvaluations()",
      "begin_line": 143,
      "end_line": 145,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getEvaluations()",
      "begin_line": 148,
      "end_line": 150,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getJacobianEvaluations()",
      "begin_line": 153,
      "end_line": 155,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.setConvergenceChecker(org.apache.commons.math.optimization.VectorialConvergenceChecker)",
      "begin_line": 158,
      "end_line": 160,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getConvergenceChecker()",
      "begin_line": 163,
      "end_line": 165,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.incrementIterationsCounter()",
      "begin_line": 171,
      "end_line": 176,
      "comment": " Increment the iterations counter by 1.\n     * @exception OptimizationException if the maximal number\n     * of iterations is exceeded\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 175,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateJacobian()",
      "begin_line": 183,
      "end_line": 197,
      "comment": "\n     * Update the jacobian matrix.\n     * @exception FunctionEvaluationException if the function jacobian\n     * cannot be evaluated or its dimension doesn\u0027t match problem dimension\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 30)",
        "(line 185,col 9)-(line 185,col 35)",
        "(line 186,col 9)-(line 189,col 9)",
        "(line 190,col 9)-(line 196,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost()",
      "begin_line": 205,
      "end_line": 227,
      "comment": "\n     * Update the residuals array and cost function value.\n     * @exception FunctionEvaluationException if the function cannot be evaluated\n     * or its dimension doesn\u0027t match problem dimension or maximal number of\n     * of evaluations is exceeded\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 211,col 9)",
        "(line 212,col 9)-(line 212,col 42)",
        "(line 213,col 9)-(line 216,col 9)",
        "(line 217,col 9)-(line 217,col 17)",
        "(line 218,col 9)-(line 218,col 22)",
        "(line 219,col 9)-(line 224,col 9)",
        "(line 225,col 9)-(line 225,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getRMS()",
      "begin_line": 239,
      "end_line": 246,
      "comment": "\n     * Get the Root Mean Square value.\n     * Get the Root Mean Square value, i.e. the root of the arithmetic\n     * mean of the square of all weighted residuals. This is related to the\n     * criterion that is minimized by the optimizer as follows: if\n     * \u003cem\u003ec\u003c/em\u003e if the criterion, and \u003cem\u003en\u003c/em\u003e is the number of\n     * measurements, then the RMS is \u003cem\u003esqrt (c/n)\u003c/em\u003e.\n     *\n     * @return RMS value\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 29)",
        "(line 241,col 9)-(line 244,col 9)",
        "(line 245,col 9)-(line 245,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getChiSquare()",
      "begin_line": 252,
      "end_line": 259,
      "comment": "\n     * Get the Chi-Square value.\n     * @return chi-square value\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 29)",
        "(line 254,col 9)-(line 257,col 9)",
        "(line 258,col 9)-(line 258,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getCovariances()",
      "begin_line": 269,
      "end_line": 297,
      "comment": "\n     * Get the covariance matrix of optimized parameters.\n     * @return covariance matrix\n     * @exception FunctionEvaluationException if the function jacobian cannot\n     * be evaluated\n     * @exception OptimizationException if the covariance matrix\n     * cannot be computed (singular problem)\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 25)",
        "(line 276,col 9)-(line 276,col 48)",
        "(line 277,col 9)-(line 286,col 9)",
        "(line 288,col 9)-(line 295,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.guessParametersErrors()",
      "begin_line": 308,
      "end_line": 322,
      "comment": "\n     * Guess the errors in optimized parameters.\n     * \u003cp\u003eGuessing is covariance-based, it only gives rough order of magnitude.\u003c/p\u003e\n     * @return errors in optimized parameters\n     * @exception FunctionEvaluationException if the function jacobian cannot b evaluated\n     * @exception OptimizationException if the covariances matrix cannot be computed\n     * or the number of degrees of freedom is not positive (number of measurements\n     * lesser or equal to number of parameters)\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 314,col 9)",
        "(line 315,col 9)-(line 315,col 43)",
        "(line 316,col 9)-(line 316,col 67)",
        "(line 317,col 9)-(line 317,col 44)",
        "(line 318,col 9)-(line 320,col 9)",
        "(line 321,col 9)-(line 321,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.optimize(org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction, double[], double[], double[])",
      "begin_line": 325,
      "end_line": 357,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 330,col 9)-(line 333,col 9)",
        "(line 336,col 9)-(line 336,col 33)",
        "(line 337,col 9)-(line 337,col 33)",
        "(line 338,col 9)-(line 338,col 33)",
        "(line 341,col 9)-(line 341,col 29)",
        "(line 342,col 9)-(line 342,col 40)",
        "(line 343,col 9)-(line 343,col 42)",
        "(line 344,col 9)-(line 344,col 43)",
        "(line 345,col 9)-(line 345,col 46)",
        "(line 346,col 9)-(line 346,col 53)",
        "(line 349,col 9)-(line 349,col 34)",
        "(line 350,col 9)-(line 350,col 33)",
        "(line 351,col 9)-(line 351,col 43)",
        "(line 353,col 9)-(line 353,col 40)",
        "(line 355,col 9)-(line 355,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.doOptimize()",
      "begin_line": 366,
      "end_line": 367,
      "comment": " Perform the bulk of optimization algorithm.\n     * @return the point/value pair giving the optimal value for objective function\n     * @exception FunctionEvaluationException if the objective function throws one during\n     * the search\n     * @exception OptimizationException if the algorithm failed to converge\n     * @exception IllegalArgumentException if the start point dimension is wrong\n     ",
      "child_ranges": []
    }
  ]
}