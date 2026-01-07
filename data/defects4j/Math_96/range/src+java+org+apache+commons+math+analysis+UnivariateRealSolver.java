{
  "filepath": "/tmp/Math-96b/src/java/org/apache/commons/math/analysis/UnivariateRealSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnivariateRealSolver",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 206,
      "comment": "\n * Interface for (univariate real) rootfinding algorithms.\n * \u003cp\u003e\n * Implementations will search for only one zero in the given interval.\u003c/p\u003e\n *  \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolver.setMaximalIterationCount(int)",
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * Set the upper limit for the number of iterations.\n     * \u003cp\u003e\n     * Usually a high iteration count indicates convergence problems. However,\n     * the \"reasonable value\" varies widely for different solvers.  Users are\n     * advised to use the default value supplied by the solver.\u003c/p\u003e\n     * \u003cp\u003e\n     * A \u003ccode\u003eConvergenceException\u003c/code\u003e will be thrown if this number\n     * is exceeded.\u003c/p\u003e\n     *  \n     * @param count maximum number of iterations\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolver.getMaximalIterationCount()",
      "begin_line": 51,
      "end_line": 51,
      "comment": "\n     * Get the upper limit for the number of iterations.\n     * \n     * @return the actual upper limit\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolver.resetMaximalIterationCount()",
      "begin_line": 60,
      "end_line": 60,
      "comment": "\n     * Reset the upper limit for the number of iterations to the default.\n     * \u003cp\u003e\n     * The default value is supplied by the solver implementation.\u003c/p\u003e\n     * \n     * @see #setMaximalIterationCount(int)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolver.setAbsoluteAccuracy(double)",
      "begin_line": 77,
      "end_line": 77,
      "comment": "\n     * Set the absolute accuracy.\n     * \u003cp\u003e\n     * The default is usually choosen so that roots in the interval\n     * -10..-0.1 and +0.1..+10 can be found with a reasonable accuracy. If the\n     * expected absolute value of your roots is of much smaller magnitude, set\n     * this to a smaller value.\u003c/p\u003e\n     * \u003cp\u003e\n     * Solvers are advised to do a plausibility check with the relative\n     * accuracy, but clients should not rely on this.\u003c/p\u003e\n     *  \n     * @param accuracy the accuracy.\n     * @throws IllegalArgumentException if the accuracy can\u0027t be achieved by\n     * the solver or is otherwise deemed unreasonable. \n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolver.getAbsoluteAccuracy()",
      "begin_line": 84,
      "end_line": 84,
      "comment": "\n     * Get the actual absolute accuracy.\n     * \n     * @return the accuracy\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolver.resetAbsoluteAccuracy()",
      "begin_line": 91,
      "end_line": 91,
      "comment": "\n     * Reset the absolute accuracy to the default.\n     * \u003cp\u003e\n     * The default value is provided by the solver implementation.\u003c/p\u003e\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolver.setRelativeAccuracy(double)",
      "begin_line": 107,
      "end_line": 107,
      "comment": "\n     * Set the relative accuracy.\n     * \u003cp\u003e\n     * This is used to stop iterations if the absolute accuracy can\u0027t be\n     * achieved due to large values or short mantissa length.\u003c/p\u003e\n     * \u003cp\u003e\n     * If this should be the primary criterion for convergence rather then a\n     * safety measure, set the absolute accuracy to a ridiculously small value,\n     * like 1E-1000.\u003c/p\u003e\n     * \n     * @param accuracy the relative accuracy.\n     * @throws IllegalArgumentException if the accuracy can\u0027t be achieved by\n     *  the solver or is otherwise deemed unreasonable. \n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolver.getRelativeAccuracy()",
      "begin_line": 113,
      "end_line": 113,
      "comment": "\n     * Get the actual relative accuracy.\n     * @return the accuracy\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolver.resetRelativeAccuracy()",
      "begin_line": 119,
      "end_line": 119,
      "comment": "\n     * Reset the relative accuracy to the default.\n     * The default value is provided by the solver implementation.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolver.setFunctionValueAccuracy(double)",
      "begin_line": 134,
      "end_line": 134,
      "comment": "\n     * Set the function value accuracy.\n     * \u003cp\u003e\n     * This is used to determine when an evaluated function value or some other\n     * value which is used as divisor is zero.\u003c/p\u003e\n     * \u003cp\u003e\n     * This is a safety guard and it shouldn\u0027t be necessary to change this in\n     * general.\u003c/p\u003e\n     * \n     * @param accuracy the accuracy.\n     * @throws IllegalArgumentException if the accuracy can\u0027t be achieved by\n     * the solver or is otherwise deemed unreasonable. \n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolver.getFunctionValueAccuracy()",
      "begin_line": 140,
      "end_line": 140,
      "comment": "\n     * Get the actual function value accuracy.\n     * @return the accuracy\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolver.resetFunctionValueAccuracy()",
      "begin_line": 146,
      "end_line": 146,
      "comment": "\n     * Reset the actual function accuracy to the default.\n     * The default value is provided by the solver implementation.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolver.solve(double, double)",
      "begin_line": 162,
      "end_line": 163,
      "comment": "\n     * Solve for a zero root in the given interval.\n     * A solver may require that the interval brackets a single zero root.\n     * \n     * @param min the lower bound for the interval.\n     * @param max the upper bound for the interval.\n     * @return a value where the function is zero\n     * @throws ConvergenceException if the maximum iteration count is exceeded\n     * or the solver detects convergence problems otherwise.\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function\n     * @throws IllegalArgumentException if min \u003e max or the endpoints do not\n     * satisfy the requirements specified by the solver\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolver.solve(double, double, double)",
      "begin_line": 180,
      "end_line": 181,
      "comment": "\n     * Solve for a zero in the given interval, start at startValue.\n     * A solver may require that the interval brackets a single zero root.\n     * \n     * @param min the lower bound for the interval.\n     * @param max the upper bound for the interval.\n     * @param startValue the start value to use\n     * @return a value where the function is zero\n     * @throws ConvergenceException if the maximum iteration count is exceeded\n     * or the solver detects convergence problems otherwise.\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function\n     * @throws IllegalArgumentException if min \u003e max or the arguments do not\n     * satisfy the requirements specified by the solver\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolver.getResult()",
      "begin_line": 190,
      "end_line": 190,
      "comment": "\n     * Get the result of the last run of the solver.\n     * \n     * @return the last result.\n     * @throws IllegalStateException if there is no result available, either\n     * because no result was yet computed or the last attempt failed.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealSolver.getIterationCount()",
      "begin_line": 205,
      "end_line": 205,
      "comment": "\n     * Get the number of iterations in the last run of the solver.\n     * \u003cp\u003e\n     * This is mainly meant for testing purposes. It may occasionally\n     * help track down performance problems: if the iteration count\n     * is notoriously high, check whether the function is evaluated\n     * properly, and whether another solver is more amenable to the\n     * problem.\u003c/p\u003e\n     * \n     * @return the last iteration count.\n     * @throws IllegalStateException if there is no result available, either\n     * because no result was yet computed or the last attempt failed.\n     ",
      "child_ranges": []
    }
  ]
}