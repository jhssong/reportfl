{
  "filepath": "/tmp/Math-88b/src/java/org/apache/commons/math/optimization/general/AbstractLeastSquaresOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractLeastSquaresOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer"
      ],
      "begin_line": 42,
      "end_line": 346,
      "comment": "\n * Base class for implementing least squares optimizers.\n * \u003cp\u003eThis base class handles the boilerplate methods associated to thresholds\n * settings, jacobian and error estimation.\u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 1.2\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MAX_ITERATIONS"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Default maximal number of iterations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterations"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Maximal number of iterations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "iterations"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Number of iterations already performed. "
    },
    {
      "type": "field",
      "varNames": [
        "objectiveEvaluations"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Number of evaluations already performed. "
    },
    {
      "type": "field",
      "varNames": [
        "jacobianEvaluations"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Number of jacobian evaluations. "
    },
    {
      "type": "field",
      "varNames": [
        "checker"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Convergence checker. "
    },
    {
      "type": "field",
      "varNames": [
        "jacobian"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " \n     * Jacobian matrix.\n     * \u003cp\u003eThis matrix is in canonical form just after the calls to\n     * {@link #updateJacobian()}, but may be modified by the solver\n     * in the derived class (the {@link LevenbergMarquardtOptimizer\n     * Levenberg-Marquardt optimizer} does this).\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cols"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " Number of columns of the jacobian matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "rows"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " Number of rows of the jacobian matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "f"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Objective function. "
    },
    {
      "type": "field",
      "varNames": [
        "jF"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " Objective function derivatives. "
    },
    {
      "type": "field",
      "varNames": [
        "target"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " Target value for the objective functions at optimum. "
    },
    {
      "type": "field",
      "varNames": [
        "weights"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " Weight for the least squares cost computation. "
    },
    {
      "type": "field",
      "varNames": [
        "point"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " Current point. "
    },
    {
      "type": "field",
      "varNames": [
        "objective"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " Current objective function value. "
    },
    {
      "type": "field",
      "varNames": [
        "residuals"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " Current residuals. "
    },
    {
      "type": "field",
      "varNames": [
        "cost"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " Cost value (square root of the sum of the residuals). "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.AbstractLeastSquaresOptimizer()",
      "begin_line": 108,
      "end_line": 111,
      "comment": " Simple constructor with default settings.\n     * \u003cp\u003eThe convergence check is set to a {@link SimpleVectorialValueChecker}\n     * and the maximal number of evaluation is set to its default value.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 65)",
        "(line 110,col 9)-(line 110,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.setMaxIterations(int)",
      "begin_line": 114,
      "end_line": 116,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getMaxIterations()",
      "begin_line": 119,
      "end_line": 121,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getIterations()",
      "begin_line": 124,
      "end_line": 126,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getEvaluations()",
      "begin_line": 129,
      "end_line": 131,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getJacobianEvaluations()",
      "begin_line": 134,
      "end_line": 136,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.setConvergenceChecker(org.apache.commons.math.optimization.VectorialConvergenceChecker)",
      "begin_line": 139,
      "end_line": 141,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getConvergenceChecker()",
      "begin_line": 144,
      "end_line": 146,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.incrementIterationsCounter()",
      "begin_line": 152,
      "end_line": 159,
      "comment": " Increment the iterations counter by 1.\n     * @exception OptimizationException if the maximal number\n     * of iterations is exceeded\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 158,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateJacobian()",
      "begin_line": 166,
      "end_line": 180,
      "comment": " \n     * Update the jacobian matrix.\n     * @exception FunctionEvaluationException if the function jacobian\n     * cannot be evaluated or its dimension doesn\u0027t match problem dimension\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 30)",
        "(line 168,col 9)-(line 168,col 35)",
        "(line 169,col 9)-(line 172,col 9)",
        "(line 173,col 9)-(line 179,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost()",
      "begin_line": 187,
      "end_line": 204,
      "comment": " \n     * Update the residuals array and cost function value.\n     * @exception FunctionEvaluationException if the function cannot be evaluated\n     * or its dimension doesn\u0027t match problem dimension\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 31)",
        "(line 191,col 9)-(line 191,col 35)",
        "(line 192,col 9)-(line 195,col 9)",
        "(line 196,col 9)-(line 196,col 17)",
        "(line 197,col 9)-(line 201,col 9)",
        "(line 202,col 9)-(line 202,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getRMS()",
      "begin_line": 216,
      "end_line": 223,
      "comment": " \n     * Get the Root Mean Square value.\n     * Get the Root Mean Square value, i.e. the root of the arithmetic\n     * mean of the square of all weighted residuals. This is related to the\n     * criterion that is minimized by the optimizer as follows: if\n     * \u003cem\u003ec\u003c/em\u003e if the criterion, and \u003cem\u003en\u003c/em\u003e is the number of\n     * measurements, then the RMS is \u003cem\u003esqrt (c/n)\u003c/em\u003e.\n     * \n     * @return RMS value\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 29)",
        "(line 218,col 9)-(line 221,col 9)",
        "(line 222,col 9)-(line 222,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getChiSquare()",
      "begin_line": 229,
      "end_line": 236,
      "comment": "\n     * Get the Chi-Square value.\n     * @return chi-square value\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 29)",
        "(line 231,col 9)-(line 234,col 9)",
        "(line 235,col 9)-(line 235,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getCovariances()",
      "begin_line": 246,
      "end_line": 274,
      "comment": "\n     * Get the covariance matrix of optimized parameters.\n     * @return covariance matrix\n     * @exception FunctionEvaluationException if the function jacobian cannot\n     * be evaluated\n     * @exception OptimizationException if the covariance matrix\n     * cannot be computed (singular problem)\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 25)",
        "(line 253,col 9)-(line 253,col 48)",
        "(line 254,col 9)-(line 263,col 9)",
        "(line 265,col 9)-(line 272,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.guessParametersErrors()",
      "begin_line": 285,
      "end_line": 299,
      "comment": "\n     * Guess the errors in optimized parameters.\n     * \u003cp\u003eGuessing is covariance-based, it only gives rough order of magnitude.\u003c/p\u003e\n     * @return errors in optimized parameters\n     * @exception FunctionEvaluationException if the function jacobian cannot b evaluated\n     * @exception OptimizationException if the covariances matrix cannot be computed\n     * or the number of degrees of freedom is not positive (number of measurements\n     * lesser or equal to number of parameters)\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 291,col 9)",
        "(line 292,col 9)-(line 292,col 43)",
        "(line 293,col 9)-(line 293,col 67)",
        "(line 294,col 9)-(line 294,col 44)",
        "(line 295,col 9)-(line 297,col 9)",
        "(line 298,col 9)-(line 298,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.optimize(org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction, double[], double[], double[])",
      "begin_line": 302,
      "end_line": 334,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 307,col 9)-(line 310,col 9)",
        "(line 313,col 9)-(line 313,col 33)",
        "(line 314,col 9)-(line 314,col 33)",
        "(line 315,col 9)-(line 315,col 33)",
        "(line 318,col 9)-(line 318,col 27)",
        "(line 319,col 9)-(line 319,col 38)",
        "(line 320,col 9)-(line 320,col 40)",
        "(line 321,col 9)-(line 321,col 41)",
        "(line 322,col 9)-(line 322,col 44)",
        "(line 323,col 9)-(line 323,col 51)",
        "(line 326,col 9)-(line 326,col 34)",
        "(line 327,col 9)-(line 327,col 33)",
        "(line 328,col 9)-(line 328,col 43)",
        "(line 330,col 9)-(line 330,col 40)",
        "(line 332,col 9)-(line 332,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.doOptimize()",
      "begin_line": 343,
      "end_line": 344,
      "comment": " Perform the bulk of optimization algorithm.\n     * @return the point/value pair giving the optimal value for objective function\n     * @exception FunctionEvaluationException if the objective function throws one during\n     * the search\n     * @exception OptimizationException if the algorithm failed to converge\n     * @exception IllegalArgumentException if the start point dimension is wrong\n     ",
      "child_ranges": []
    }
  ]
}