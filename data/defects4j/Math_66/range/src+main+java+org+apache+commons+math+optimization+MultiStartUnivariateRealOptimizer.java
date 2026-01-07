{
  "filepath": "/tmp/Math-66b/src/main/java/org/apache/commons/math/optimization/MultiStartUnivariateRealOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultiStartUnivariateRealOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.UnivariateRealOptimizer"
      ],
      "begin_line": 38,
      "end_line": 318,
      "comment": "\n * Special implementation of the {@link UnivariateRealOptimizer} interface adding\n * multi-start features to an existing optimizer.\n * \u003cp\u003e\n * This class wraps a classical optimizer to use it several times in\n * turn with different starting points in order to avoid being trapped\n * into a local extremum when looking for a global one.\n * \u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "optimizer"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Underlying classical optimizer. "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterations"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Maximal number of iterations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "maxEvaluations"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Maximal number of evaluations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "totalIterations"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Number of iterations already performed for all starts. "
    },
    {
      "type": "field",
      "varNames": [
        "totalEvaluations"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Number of evaluations already performed for all starts. "
    },
    {
      "type": "field",
      "varNames": [
        "starts"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Number of starts to go. "
    },
    {
      "type": "field",
      "varNames": [
        "generator"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Random generator for multi-start. "
    },
    {
      "type": "field",
      "varNames": [
        "optima"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Found optima. "
    },
    {
      "type": "field",
      "varNames": [
        "optimaValues"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Found function values at optima. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.MultiStartUnivariateRealOptimizer(org.apache.commons.math.optimization.UnivariateRealOptimizer, int, org.apache.commons.math.random.RandomGenerator)",
      "begin_line": 78,
      "end_line": 88,
      "comment": "\n     * Create a multi-start optimizer from a single-start optimizer\n     * @param optimizer single-start optimizer to wrap\n     * @param starts number of starts to perform (including the\n     * first one), multi-start is disabled if value is less than or\n     * equal to 1\n     * @param generator random generator to use for restarts\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 42)",
        "(line 82,col 9)-(line 82,col 34)",
        "(line 83,col 9)-(line 83,col 39)",
        "(line 84,col 9)-(line 84,col 42)",
        "(line 85,col 9)-(line 85,col 37)",
        "(line 86,col 9)-(line 86,col 52)",
        "(line 87,col 9)-(line 87,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.getFunctionValue()",
      "begin_line": 91,
      "end_line": 93,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.getResult()",
      "begin_line": 96,
      "end_line": 98,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.getAbsoluteAccuracy()",
      "begin_line": 101,
      "end_line": 103,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.getIterationCount()",
      "begin_line": 106,
      "end_line": 108,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.getMaximalIterationCount()",
      "begin_line": 111,
      "end_line": 113,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.getMaxEvaluations()",
      "begin_line": 116,
      "end_line": 118,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.getEvaluations()",
      "begin_line": 121,
      "end_line": 123,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.getRelativeAccuracy()",
      "begin_line": 126,
      "end_line": 128,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.resetAbsoluteAccuracy()",
      "begin_line": 131,
      "end_line": 133,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.resetMaximalIterationCount()",
      "begin_line": 136,
      "end_line": 138,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.resetRelativeAccuracy()",
      "begin_line": 141,
      "end_line": 143,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.setAbsoluteAccuracy(double)",
      "begin_line": 146,
      "end_line": 148,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.setMaximalIterationCount(int)",
      "begin_line": 151,
      "end_line": 153,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.setMaxEvaluations(int)",
      "begin_line": 156,
      "end_line": 158,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.setRelativeAccuracy(double)",
      "begin_line": 161,
      "end_line": 163,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.getOptima()",
      "begin_line": 192,
      "end_line": 197,
      "comment": " Get all the optima found during the last call to {@link\n     * #optimize(UnivariateRealFunction, GoalType, double, double) optimize}.\n     * \u003cp\u003eThe optimizer stores all the optima found during a set of\n     * restarts. The {@link #optimize(UnivariateRealFunction, GoalType,\n     * double, double) optimize} method returns the best point only. This\n     * method returns all the points found at the end of each starts,\n     * including the best one already returned by the {@link\n     * #optimize(UnivariateRealFunction, GoalType, double, double) optimize}\n     * method.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The returned array as one element for each start as specified\n     * in the constructor. It is ordered with the results from the\n     * runs that did converge first, sorted from best to worst\n     * objective value (i.e in ascending order if minimizing and in\n     * descending order if maximizing), followed by Double.NaN elements\n     * corresponding to the runs that did not converge. This means all\n     * elements will be NaN if the {@link #optimize(UnivariateRealFunction,\n     * GoalType, double, double) optimize} method did throw a {@link\n     * ConvergenceException ConvergenceException}). This also means that\n     * if the first element is not NaN, it is the best point found across\n     * all starts.\u003c/p\u003e\n     * @return array containing the optima\n     * @exception IllegalStateException if {@link #optimize(UnivariateRealFunction,\n     * GoalType, double, double) optimize} has not been called\n     * @see #getOptimaValues()\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 195,col 9)",
        "(line 196,col 9)-(line 196,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.getOptimaValues()",
      "begin_line": 218,
      "end_line": 223,
      "comment": " Get all the function values at optima found during the last call to {@link\n     * #optimize(UnivariateRealFunction, GoalType, double, double) optimize}.\n     * \u003cp\u003e\n     * The returned array as one element for each start as specified\n     * in the constructor. It is ordered with the results from the\n     * runs that did converge first, sorted from best to worst\n     * objective value (i.e in ascending order if minimizing and in\n     * descending order if maximizing), followed by Double.NaN elements\n     * corresponding to the runs that did not converge. This means all\n     * elements will be NaN if the {@link #optimize(UnivariateRealFunction,\n     * GoalType, double, double) optimize} method did throw a {@link\n     * ConvergenceException ConvergenceException}). This also means that\n     * if the first element is not NaN, it is the best point found across\n     * all starts.\u003c/p\u003e\n     * @return array containing the optima\n     * @exception IllegalStateException if {@link #optimize(UnivariateRealFunction,\n     * GoalType, double, double) optimize} has not been called\n     * @see #getOptima()\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 221,col 9)",
        "(line 222,col 9)-(line 222,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize(org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.optimization.GoalType, double, double)",
      "begin_line": 226,
      "end_line": 310,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 46)",
        "(line 232,col 9)-(line 232,col 46)",
        "(line 233,col 9)-(line 233,col 29)",
        "(line 234,col 9)-(line 234,col 29)",
        "(line 237,col 9)-(line 259,col 9)",
        "(line 262,col 9)-(line 262,col 36)",
        "(line 263,col 9)-(line 270,col 9)",
        "(line 272,col 9)-(line 272,col 33)",
        "(line 273,col 9)-(line 273,col 39)",
        "(line 274,col 9)-(line 299,col 9)",
        "(line 301,col 9)-(line 305,col 9)",
        "(line 308,col 9)-(line 308,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize(org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.optimization.GoalType, double, double, double)",
      "begin_line": 313,
      "end_line": 317,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 47)"
      ]
    }
  ]
}