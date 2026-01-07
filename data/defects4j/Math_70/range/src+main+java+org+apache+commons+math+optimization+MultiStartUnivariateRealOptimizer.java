{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/optimization/MultiStartUnivariateRealOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultiStartUnivariateRealOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.UnivariateRealOptimizer"
      ],
      "begin_line": 37,
      "end_line": 318,
      "comment": "\n * Special implementation of the {@link UnivariateRealOptimizer} interface adding\n * multi-start features to an existing optimizer.\n * \u003cp\u003e\n * This class wraps a classical optimizer to use it several times in\n * turn with different starting points in order to avoid being trapped\n * into a local extremum when looking for a global one.\n * \u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "optimizer"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Underlying classical optimizer. "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterations"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Maximal number of iterations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "maxEvaluations"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Maximal number of evaluations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "totalIterations"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Number of iterations already performed for all starts. "
    },
    {
      "type": "field",
      "varNames": [
        "totalEvaluations"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Number of evaluations already performed for all starts. "
    },
    {
      "type": "field",
      "varNames": [
        "starts"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Number of starts to go. "
    },
    {
      "type": "field",
      "varNames": [
        "generator"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Random generator for multi-start. "
    },
    {
      "type": "field",
      "varNames": [
        "optima"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Found optima. "
    },
    {
      "type": "field",
      "varNames": [
        "optimaValues"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Found function values at optima. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.MultiStartUnivariateRealOptimizer(org.apache.commons.math.optimization.UnivariateRealOptimizer, int, org.apache.commons.math.random.RandomGenerator)",
      "begin_line": 77,
      "end_line": 87,
      "comment": "\n     * Create a multi-start optimizer from a single-start optimizer\n     * @param optimizer single-start optimizer to wrap\n     * @param starts number of starts to perform (including the\n     * first one), multi-start is disabled if value is less than or\n     * equal to 1\n     * @param generator random generator to use for restarts\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 42)",
        "(line 81,col 9)-(line 81,col 34)",
        "(line 82,col 9)-(line 82,col 39)",
        "(line 83,col 9)-(line 83,col 42)",
        "(line 84,col 9)-(line 84,col 37)",
        "(line 85,col 9)-(line 85,col 52)",
        "(line 86,col 9)-(line 86,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.getFunctionValue()",
      "begin_line": 90,
      "end_line": 92,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.getResult()",
      "begin_line": 95,
      "end_line": 97,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.getAbsoluteAccuracy()",
      "begin_line": 100,
      "end_line": 102,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.getIterationCount()",
      "begin_line": 105,
      "end_line": 107,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.getMaximalIterationCount()",
      "begin_line": 110,
      "end_line": 112,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.getMaxEvaluations()",
      "begin_line": 115,
      "end_line": 117,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.getEvaluations()",
      "begin_line": 120,
      "end_line": 122,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.getRelativeAccuracy()",
      "begin_line": 125,
      "end_line": 127,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.resetAbsoluteAccuracy()",
      "begin_line": 130,
      "end_line": 132,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.resetMaximalIterationCount()",
      "begin_line": 135,
      "end_line": 137,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.resetRelativeAccuracy()",
      "begin_line": 140,
      "end_line": 142,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.setAbsoluteAccuracy(double)",
      "begin_line": 145,
      "end_line": 147,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.setMaximalIterationCount(int)",
      "begin_line": 150,
      "end_line": 152,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.setMaxEvaluations(int)",
      "begin_line": 155,
      "end_line": 157,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.setRelativeAccuracy(double)",
      "begin_line": 160,
      "end_line": 162,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.getOptima()",
      "begin_line": 191,
      "end_line": 196,
      "comment": " Get all the optima found during the last call to {@link\n     * #optimize(UnivariateRealFunction, GoalType, double, double) optimize}.\n     * \u003cp\u003eThe optimizer stores all the optima found during a set of\n     * restarts. The {@link #optimize(UnivariateRealFunction, GoalType,\n     * double, double) optimize} method returns the best point only. This\n     * method returns all the points found at the end of each starts,\n     * including the best one already returned by the {@link\n     * #optimize(UnivariateRealFunction, GoalType, double, double) optimize}\n     * method.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The returned array as one element for each start as specified\n     * in the constructor. It is ordered with the results from the\n     * runs that did converge first, sorted from best to worst\n     * objective value (i.e in ascending order if minimizing and in\n     * descending order if maximizing), followed by Double.NaN elements\n     * corresponding to the runs that did not converge. This means all\n     * elements will be NaN if the {@link #optimize(UnivariateRealFunction,\n     * GoalType, double, double) optimize} method did throw a {@link\n     * ConvergenceException ConvergenceException}). This also means that\n     * if the first element is not NaN, it is the best point found across\n     * all starts.\u003c/p\u003e\n     * @return array containing the optima\n     * @exception IllegalStateException if {@link #optimize(UnivariateRealFunction,\n     * GoalType, double, double) optimize} has not been called\n     * @see #getOptimaValues()\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 194,col 9)",
        "(line 195,col 9)-(line 195,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.getOptimaValues()",
      "begin_line": 217,
      "end_line": 222,
      "comment": " Get all the function values at optima found during the last call to {@link\n     * #optimize(UnivariateRealFunction, GoalType, double, double) optimize}.\n     * \u003cp\u003e\n     * The returned array as one element for each start as specified\n     * in the constructor. It is ordered with the results from the\n     * runs that did converge first, sorted from best to worst\n     * objective value (i.e in ascending order if minimizing and in\n     * descending order if maximizing), followed by Double.NaN elements\n     * corresponding to the runs that did not converge. This means all\n     * elements will be NaN if the {@link #optimize(UnivariateRealFunction,\n     * GoalType, double, double) optimize} method did throw a {@link\n     * ConvergenceException ConvergenceException}). This also means that\n     * if the first element is not NaN, it is the best point found across\n     * all starts.\u003c/p\u003e\n     * @return array containing the optima\n     * @exception IllegalStateException if {@link #optimize(UnivariateRealFunction,\n     * GoalType, double, double) optimize} has not been called\n     * @see #getOptima()\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 220,col 9)",
        "(line 221,col 9)-(line 221,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize(org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.optimization.GoalType, double, double)",
      "begin_line": 225,
      "end_line": 309,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 46)",
        "(line 231,col 9)-(line 231,col 46)",
        "(line 232,col 9)-(line 232,col 29)",
        "(line 233,col 9)-(line 233,col 29)",
        "(line 236,col 9)-(line 258,col 9)",
        "(line 261,col 9)-(line 261,col 36)",
        "(line 262,col 9)-(line 269,col 9)",
        "(line 271,col 9)-(line 271,col 33)",
        "(line 272,col 9)-(line 272,col 39)",
        "(line 273,col 9)-(line 298,col 9)",
        "(line 300,col 9)-(line 304,col 9)",
        "(line 307,col 9)-(line 307,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize(org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.optimization.GoalType, double, double, double)",
      "begin_line": 312,
      "end_line": 316,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 47)"
      ]
    }
  ]
}