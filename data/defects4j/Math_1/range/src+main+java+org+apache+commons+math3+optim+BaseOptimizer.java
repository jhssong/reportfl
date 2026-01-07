{
  "filepath": "/tmp/Math-1b/src/main/java/org/apache/commons/math3/optim/BaseOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseOptimizer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 261,
      "comment": "\n * Base class for implementing optimizers.\n * It contains the boiler-plate code for counting the number of evaluations\n * of the objective function and the number of iterations of the algorithm,\n * and storing the convergence checker.\n * \u003cem\u003eIt is not a \"user\" class.\u003c/em\u003e\n *\n * @param \u003cPAIR\u003e Type of the point/value pair returned by the optimization\n * algorithm.\n *\n * @version $Id$\n * @since 3.1\n "
    },
    {
      "type": "field",
      "varNames": [
        "evaluations"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Evaluations counter. "
    },
    {
      "type": "field",
      "varNames": [
        "iterations"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Iterations counter. "
    },
    {
      "type": "field",
      "varNames": [
        "checker"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Convergence checker. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.BaseOptimizer.BaseOptimizer(org.apache.commons.math3.optim.ConvergenceChecker\u003cPAIR\u003e)",
      "begin_line": 47,
      "end_line": 49,
      "comment": "\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.BaseOptimizer.BaseOptimizer(org.apache.commons.math3.optim.ConvergenceChecker\u003cPAIR\u003e, int, int)",
      "begin_line": 56,
      "end_line": 63,
      "comment": "\n     * @param checker Convergence checker.\n     * @param maxEval Maximum number of objective function evaluations.\n     * @param maxIter Maximum number of algorithm iterations.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 31)",
        "(line 61,col 9)-(line 61,col 70)",
        "(line 62,col 9)-(line 62,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.BaseOptimizer.getMaxEvaluations()",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * Gets the maximal number of function evaluations.\n     *\n     * @return the maximal number of function evaluations.\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.BaseOptimizer.getEvaluations()",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\n     * Gets the number of evaluations of the objective function.\n     * The number of evaluations corresponds to the last call to the\n     * {@code optimize} method. It is 0 if the method has not been\n     * called yet.\n     *\n     * @return the number of evaluations of the objective function.\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.BaseOptimizer.getMaxIterations()",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * Gets the maximal number of iterations.\n     *\n     * @return the maximal number of iterations.\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.BaseOptimizer.getIterations()",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\n     * Gets the number of iterations performed by the algorithm.\n     * The number iterations corresponds to the last call to the\n     * {@code optimize} method. It is 0 if the method has not been\n     * called yet.\n     *\n     * @return the number of evaluations of the objective function.\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.BaseOptimizer.getConvergenceChecker()",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\n     * Gets the convergence checker.\n     *\n     * @return the object used to check for convergence.\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.BaseOptimizer.optimize(org.apache.commons.math3.optim.OptimizationData...)",
      "begin_line": 144,
      "end_line": 155,
      "comment": "\n     * Stores data and performs the optimization.\n     * \u003cbr/\u003e\n     * The list of parameters is open-ended so that sub-classes can extend it\n     * with arguments specific to their concrete implementations.\n     * \u003cbr/\u003e\n     * When the method is called multiple times, instance data is overwritten\n     * only when actually present in the list of arguments: when not specified,\n     * data set in a previous call is retained (and thus is optional in\n     * subsequent calls).\n     * \u003cbr/\u003e\n     * Important note: Subclasses \u003cem\u003emust\u003c/em\u003e override\n     * {@link #parseOptimizationData(OptimizationData[])} if they need to register\n     * their own options; but then, they \u003cem\u003emust\u003c/em\u003e also call\n     * {@code super.parseOptimizationData(optData)} within that method.\n     *\n     * @param optData Optimization data.\n     * This method will register the following data:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@link MaxEval}\u003c/li\u003e\n     *  \u003cli\u003e{@link MaxIter}\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @return a point/value pair that satifies the convergence criteria.\n     * @throws TooManyEvaluationsException if the maximal number of\n     * evaluations is exceeded.\n     * @throws TooManyIterationsException if the maximal number of\n     * iterations is exceeded.\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 39)",
        "(line 151,col 9)-(line 151,col 33)",
        "(line 152,col 9)-(line 152,col 32)",
        "(line 154,col 9)-(line 154,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.BaseOptimizer.optimize()",
      "begin_line": 166,
      "end_line": 174,
      "comment": "\n     * Performs the optimization.\n     *\n     * @return a point/value pair that satifies the convergence criteria.\n     * @throws TooManyEvaluationsException if the maximal number of\n     * evaluations is exceeded.\n     * @throws TooManyIterationsException if the maximal number of\n     * iterations is exceeded.\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 33)",
        "(line 171,col 9)-(line 171,col 32)",
        "(line 173,col 9)-(line 173,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.BaseOptimizer.doOptimize()",
      "begin_line": 182,
      "end_line": 182,
      "comment": "\n     * Performs the bulk of the optimization algorithm.\n     *\n     * @return the point/value pair giving the optimal value of the\n     * objective function.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.BaseOptimizer.incrementEvaluationCount()",
      "begin_line": 190,
      "end_line": 193,
      "comment": "\n     * Increment the evaluation count.\n     *\n     * @throws TooManyEvaluationsException if the allowed evaluations\n     * have been exhausted.\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.BaseOptimizer.incrementIterationCount()",
      "begin_line": 201,
      "end_line": 204,
      "comment": "\n     * Increment the iteration count.\n     *\n     * @throws TooManyIterationsException if the allowed iterations\n     * have been exhausted.\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.BaseOptimizer.parseOptimizationData(org.apache.commons.math3.optim.OptimizationData...)",
      "begin_line": 217,
      "end_line": 230,
      "comment": "\n     * Scans the list of (required and optional) optimization data that\n     * characterize the problem.\n     *\n     * @param optData Optimization data.\n     * The following data will be looked for:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@link MaxEval}\u003c/li\u003e\n     *  \u003cli\u003e{@link MaxIter}\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 229,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MaxEvalCallback",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.util.Incrementor.MaxCountExceededCallback"
      ],
      "begin_line": 236,
      "end_line": 245,
      "comment": "\n     * Defines the action to perform when reaching the maximum number\n     * of evaluations.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.BaseOptimizer.MaxEvalCallback.trigger(int)",
      "begin_line": 242,
      "end_line": 244,
      "comment": "\n         * {@inheritDoc}\n         * @throws TooManyEvaluationsException\n         ",
      "child_ranges": [
        "(line 243,col 13)-(line 243,col 55)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MaxIterCallback",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.util.Incrementor.MaxCountExceededCallback"
      ],
      "begin_line": 251,
      "end_line": 260,
      "comment": "\n     * Defines the action to perform when reaching the maximum number\n     * of evaluations.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.BaseOptimizer.MaxIterCallback.trigger(int)",
      "begin_line": 257,
      "end_line": 259,
      "comment": "\n         * {@inheritDoc}\n         * @throws TooManyIterationsException\n         ",
      "child_ranges": [
        "(line 258,col 13)-(line 258,col 54)"
      ]
    }
  ]
}