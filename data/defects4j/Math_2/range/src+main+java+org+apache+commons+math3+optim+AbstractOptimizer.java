{
  "filepath": "/tmp/Math-2b/src/main/java/org/apache/commons/math3/optim/AbstractOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.fitting.leastsquares.WithMaxEvaluations\u003cOPTIM\u003e",
        "org.apache.commons.math3.fitting.leastsquares.WithMaxIterations\u003cOPTIM\u003e",
        "org.apache.commons.math3.fitting.leastsquares.WithConvergenceChecker\u003cPAIR, OPTIM\u003e"
      ],
      "begin_line": 42,
      "end_line": 226,
      "comment": "\n * Base class for implementing optimizers.\n * It contains the boiler-plate code for counting the number of evaluations\n * of the objective function and the number of iterations of the algorithm,\n * and storing the convergence checker.\n *\n * @param \u003cPAIR\u003e Type of the point/value pair returned by the optimization\n * algorithm.\n * @param \u003cOPTIM\u003e Type of a subclass of this class.\n * This parameter allows to implement fluent API methods at upper levels\n * of the class hierarchy (since the fluent API requires that the actual\n * type of the subclass is returned).\n *\n * @version $Id$\n * @since 3.3\n "
    },
    {
      "type": "field",
      "varNames": [
        "evaluations"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Evaluations counter. "
    },
    {
      "type": "field",
      "varNames": [
        "iterations"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Iterations counter. "
    },
    {
      "type": "field",
      "varNames": [
        "checker"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Convergence checker. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.AbstractOptimizer.AbstractOptimizer()",
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.AbstractOptimizer.AbstractOptimizer(org.apache.commons.math3.optim.AbstractOptimizer)",
      "begin_line": 63,
      "end_line": 67,
      "comment": "\n     * Copy constructor.\n     *\n     * @param other Instance to copy.\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 32)",
        "(line 65,col 9)-(line 65,col 63)",
        "(line 66,col 9)-(line 66,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.AbstractOptimizer.self()",
      "begin_line": 74,
      "end_line": 77,
      "comment": "\n     * Returns this instance, cast to the type of its actual subclass.\n     *\n     * @return the \"self-type\" instance.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 41)",
        "(line 76,col 9)-(line 76,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.AbstractOptimizer.withConvergenceChecker(org.apache.commons.math3.optim.ConvergenceChecker\u003cPAIR\u003e)",
      "begin_line": 80,
      "end_line": 83,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 31)",
        "(line 82,col 9)-(line 82,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.AbstractOptimizer.withMaxEvaluations(int)",
      "begin_line": 86,
      "end_line": 89,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 41)",
        "(line 88,col 9)-(line 88,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.AbstractOptimizer.withMaxIterations(int)",
      "begin_line": 92,
      "end_line": 95,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 40)",
        "(line 94,col 9)-(line 94,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.AbstractOptimizer.getMaxEvaluations()",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\n     * Gets the maximal number of function evaluations.\n     *\n     * @return the maximal number of function evaluations.\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.AbstractOptimizer.getEvaluations()",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n     * Gets the number of evaluations of the objective function.\n     * The number of evaluations corresponds to the last call to the\n     * {@code optimize} method. It is 0 if the method has not been\n     * called yet.\n     *\n     * @return the number of evaluations of the objective function.\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.AbstractOptimizer.getMaxIterations()",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\n     * Gets the maximal number of iterations.\n     *\n     * @return the maximal number of iterations.\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.AbstractOptimizer.getIterations()",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\n     * Gets the number of iterations performed by the algorithm.\n     * The number iterations corresponds to the last call to the\n     * {@code optimize} method. It is 0 if the method has not been\n     * called yet.\n     *\n     * @return the number of evaluations of the objective function.\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.AbstractOptimizer.getConvergenceChecker()",
      "begin_line": 144,
      "end_line": 146,
      "comment": "\n     * Gets the convergence checker.\n     *\n     * @return the object used to check for convergence.\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.AbstractOptimizer.optimize()",
      "begin_line": 157,
      "end_line": 165,
      "comment": "\n     * Performs the optimization.\n     *\n     * @return a point/value pair that satifies the convergence criteria.\n     * @throws TooManyEvaluationsException if the maximal number of\n     * evaluations is exceeded.\n     * @throws TooManyIterationsException if the maximal number of\n     * iterations is exceeded.\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 33)",
        "(line 162,col 9)-(line 162,col 32)",
        "(line 164,col 9)-(line 164,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.AbstractOptimizer.doOptimize()",
      "begin_line": 173,
      "end_line": 173,
      "comment": "\n     * Performs the bulk of the optimization algorithm.\n     *\n     * @return the point/value pair giving the optimal value of the\n     * objective function.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.AbstractOptimizer.incrementEvaluationCount()",
      "begin_line": 181,
      "end_line": 184,
      "comment": "\n     * Increment the evaluation count.\n     *\n     * @throws TooManyEvaluationsException if the allowed evaluations\n     * have been exhausted.\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.AbstractOptimizer.incrementIterationCount()",
      "begin_line": 192,
      "end_line": 195,
      "comment": "\n     * Increment the iteration count.\n     *\n     * @throws TooManyIterationsException if the allowed iterations\n     * have been exhausted.\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 36)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MaxEvalCallback",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.util.Incrementor.MaxCountExceededCallback"
      ],
      "begin_line": 201,
      "end_line": 210,
      "comment": "\n     * Defines the action to perform when reaching the maximum number\n     * of evaluations.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.AbstractOptimizer.MaxEvalCallback.trigger(int)",
      "begin_line": 207,
      "end_line": 209,
      "comment": "\n         * {@inheritDoc}\n         * @throws TooManyEvaluationsException\n         ",
      "child_ranges": [
        "(line 208,col 13)-(line 208,col 55)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MaxIterCallback",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.util.Incrementor.MaxCountExceededCallback"
      ],
      "begin_line": 216,
      "end_line": 225,
      "comment": "\n     * Defines the action to perform when reaching the maximum number\n     * of evaluations.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.AbstractOptimizer.MaxIterCallback.trigger(int)",
      "begin_line": 222,
      "end_line": 224,
      "comment": "\n         * {@inheritDoc}\n         * @throws TooManyIterationsException\n         ",
      "child_ranges": [
        "(line 223,col 13)-(line 223,col 54)"
      ]
    }
  ]
}