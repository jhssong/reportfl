{
  "filepath": "/tmp/Math-1b/src/main/java/org/apache/commons/math3/optim/AbstractOptimizer.java",
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
      "end_line": 236,
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
      "signature": "org.apache.commons.math3.optim.AbstractOptimizer.AbstractOptimizer(org.apache.commons.math3.optim.AbstractOptimizer\u003cPAIR, OPTIM\u003e)",
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
      "end_line": 78,
      "comment": "\n     * Returns this instance, cast to the type of its actual subclass.\n     *\n     * @return the \"self-type\" instance.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 76,col 41)",
        "(line 77,col 9)-(line 77,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.AbstractOptimizer.withConvergenceChecker(org.apache.commons.math3.optim.ConvergenceChecker\u003cPAIR\u003e)",
      "begin_line": 81,
      "end_line": 84,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 34)",
        "(line 83,col 9)-(line 83,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.AbstractOptimizer.withMaxEvaluations(int)",
      "begin_line": 87,
      "end_line": 90,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 41)",
        "(line 89,col 9)-(line 89,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.AbstractOptimizer.withMaxIterations(int)",
      "begin_line": 93,
      "end_line": 96,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 40)",
        "(line 95,col 9)-(line 95,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.AbstractOptimizer.getMaxEvaluations()",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\n     * Gets the maximal number of function evaluations.\n     *\n     * @return the maximal number of function evaluations.\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.AbstractOptimizer.getEvaluations()",
      "begin_line": 115,
      "end_line": 117,
      "comment": "\n     * Gets the number of evaluations of the objective function.\n     * The number of evaluations corresponds to the last call to the\n     * {@code optimize} method. It is 0 if the method has not been\n     * called yet.\n     *\n     * @return the number of evaluations of the objective function.\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.AbstractOptimizer.getMaxIterations()",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\n     * Gets the maximal number of iterations.\n     *\n     * @return the maximal number of iterations.\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.AbstractOptimizer.getIterations()",
      "begin_line": 136,
      "end_line": 138,
      "comment": "\n     * Gets the number of iterations performed by the algorithm.\n     * The number iterations corresponds to the last call to the\n     * {@code optimize} method. It is 0 if the method has not been\n     * called yet.\n     *\n     * @return the number of evaluations of the objective function.\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.AbstractOptimizer.getConvergenceChecker()",
      "begin_line": 145,
      "end_line": 147,
      "comment": "\n     * Gets the convergence checker.\n     *\n     * @return the object used to check for convergence.\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.AbstractOptimizer.optimize()",
      "begin_line": 158,
      "end_line": 166,
      "comment": "\n     * Performs the optimization.\n     *\n     * @return a point/value pair that satifies the convergence criteria.\n     * @throws TooManyEvaluationsException if the maximal number of\n     * evaluations is exceeded.\n     * @throws TooManyIterationsException if the maximal number of\n     * iterations is exceeded.\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 33)",
        "(line 163,col 9)-(line 163,col 32)",
        "(line 165,col 9)-(line 165,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.AbstractOptimizer.shallowCopy()",
      "begin_line": 175,
      "end_line": 175,
      "comment": "\n     * Creates a shallow copy of this instance.\n     * Further modifications of the returned object will not modify the\n     * fields in this instance.\n     *\n     * @return a shallow copy.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.AbstractOptimizer.doOptimize()",
      "begin_line": 183,
      "end_line": 183,
      "comment": "\n     * Performs the bulk of the optimization algorithm.\n     *\n     * @return the point/value pair giving the optimal value of the\n     * objective function.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.AbstractOptimizer.incrementEvaluationCount()",
      "begin_line": 191,
      "end_line": 194,
      "comment": "\n     * Increment the evaluation count.\n     *\n     * @throws TooManyEvaluationsException if the allowed evaluations\n     * have been exhausted.\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.AbstractOptimizer.incrementIterationCount()",
      "begin_line": 202,
      "end_line": 205,
      "comment": "\n     * Increment the iteration count.\n     *\n     * @throws TooManyIterationsException if the allowed iterations\n     * have been exhausted.\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 36)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MaxEvalCallback",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.util.Incrementor.MaxCountExceededCallback"
      ],
      "begin_line": 211,
      "end_line": 220,
      "comment": "\n     * Defines the action to perform when reaching the maximum number\n     * of evaluations.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.AbstractOptimizer.MaxEvalCallback.trigger(int)",
      "begin_line": 217,
      "end_line": 219,
      "comment": "\n         * {@inheritDoc}\n         * @throws TooManyEvaluationsException\n         ",
      "child_ranges": [
        "(line 218,col 13)-(line 218,col 55)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MaxIterCallback",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.util.Incrementor.MaxCountExceededCallback"
      ],
      "begin_line": 226,
      "end_line": 235,
      "comment": "\n     * Defines the action to perform when reaching the maximum number\n     * of evaluations.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.AbstractOptimizer.MaxIterCallback.trigger(int)",
      "begin_line": 232,
      "end_line": 234,
      "comment": "\n         * {@inheritDoc}\n         * @throws TooManyIterationsException\n         ",
      "child_ranges": [
        "(line 233,col 13)-(line 233,col 54)"
      ]
    }
  ]
}