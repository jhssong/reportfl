{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optim/BaseOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseOptimizer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 231,
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
      "end_line": 52,
      "comment": "\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 31)",
        "(line 50,col 9)-(line 50,col 64)",
        "(line 51,col 9)-(line 51,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.BaseOptimizer.getMaxEvaluations()",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * Gets the maximal number of function evaluations.\n     *\n     * @return the maximal number of function evaluations.\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.BaseOptimizer.getEvaluations()",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * Gets the number of evaluations of the objective function.\n     * The number of evaluations corresponds to the last call to the\n     * {@code optimize} method. It is 0 if the method has not been\n     * called yet.\n     *\n     * @return the number of evaluations of the objective function.\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.BaseOptimizer.getMaxIterations()",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * Gets the maximal number of iterations.\n     *\n     * @return the maximal number of iterations.\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.BaseOptimizer.getIterations()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n     * Gets the number of iterations performed by the algorithm.\n     * The number iterations corresponds to the last call to the\n     * {@code optimize} method. It is 0 if the method has not been\n     * called yet.\n     *\n     * @return the number of evaluations of the objective function.\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.BaseOptimizer.getConvergenceChecker()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Gets the convergence checker.\n     *\n     * @return the object used to check for convergence.\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.BaseOptimizer.optimize(org.apache.commons.math3.optim.OptimizationData...)",
      "begin_line": 133,
      "end_line": 144,
      "comment": "\n     * Stores data and performs the optimization.\n     * \u003cbr/\u003e\n     * The list of parameters is open-ended so that sub-classes can extend it\n     * with arguments specific to their concrete implementations.\n     * \u003cbr/\u003e\n     * When the method is called multiple times, instance data is overwritten\n     * only when actually present in the list of arguments: when not specified,\n     * data set in a previous call is retained (and thus is optional in\n     * subsequent calls).\n     * \u003cbr/\u003e\n     * Important note: Subclasses \u003cem\u003emust\u003c/em\u003e override\n     * {@link #parseOptimizationData(OptimizationData[])} if they need to register\n     * their own options; but then, they \u003cem\u003emust\u003c/em\u003e also call\n     * {@code super.parseOptimizationData(optData)} within that method.\n     *\n     * @param optData Optimization data.\n     * This method will register the following data:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@link MaxEval}\u003c/li\u003e\n     *  \u003cli\u003e{@link MaxIter}\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @return a point/value pair that satifies the convergence criteria.\n     * @throws TooManyEvaluationsException if the maximal number of\n     * evaluations is exceeded.\n     * @throws TooManyIterationsException if the maximal number of\n     * iterations is exceeded.\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 39)",
        "(line 140,col 9)-(line 140,col 33)",
        "(line 141,col 9)-(line 141,col 32)",
        "(line 143,col 9)-(line 143,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.BaseOptimizer.doOptimize()",
      "begin_line": 152,
      "end_line": 152,
      "comment": "\n     * Performs the bulk of the optimization algorithm.\n     *\n     * @return the point/value pair giving the optimal value of the\n     * objective function.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.BaseOptimizer.incrementEvaluationCount()",
      "begin_line": 160,
      "end_line": 163,
      "comment": "\n     * Increment the evaluation count.\n     *\n     * @throws TooManyEvaluationsException if the allowed evaluations\n     * have been exhausted.\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.BaseOptimizer.incrementIterationCount()",
      "begin_line": 171,
      "end_line": 174,
      "comment": "\n     * Increment the iteration count.\n     *\n     * @throws TooManyIterationsException if the allowed iterations\n     * have been exhausted.\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.BaseOptimizer.parseOptimizationData(org.apache.commons.math3.optim.OptimizationData...)",
      "begin_line": 187,
      "end_line": 200,
      "comment": "\n     * Scans the list of (required and optional) optimization data that\n     * characterize the problem.\n     *\n     * @param optData Optimization data.\n     * The following data will be looked for:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@link MaxEval}\u003c/li\u003e\n     *  \u003cli\u003e{@link MaxIter}\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 199,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MaxEvalCallback",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.util.Incrementor.MaxCountExceededCallback"
      ],
      "begin_line": 206,
      "end_line": 215,
      "comment": "\n     * Defines the action to perform when reaching the maximum number\n     * of evaluations.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.BaseOptimizer.MaxEvalCallback.trigger(int)",
      "begin_line": 212,
      "end_line": 214,
      "comment": "\n         * {@inheritDoc}\n         * @throws TooManyEvaluationsException.\n         ",
      "child_ranges": [
        "(line 213,col 13)-(line 213,col 55)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MaxIterCallback",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.util.Incrementor.MaxCountExceededCallback"
      ],
      "begin_line": 221,
      "end_line": 230,
      "comment": "\n     * Defines the action to perform when reaching the maximum number\n     * of evaluations.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.BaseOptimizer.MaxIterCallback.trigger(int)",
      "begin_line": 227,
      "end_line": 229,
      "comment": "\n         * {@inheritDoc}\n         * @throws TooManyIterationsException.\n         ",
      "child_ranges": [
        "(line 228,col 13)-(line 228,col 54)"
      ]
    }
  ]
}