{
  "filepath": "/tmp/Math-85b/src/java/org/apache/commons/math/optimization/MultiStartUnivariateRealOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultiStartUnivariateRealOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.UnivariateRealOptimizer"
      ],
      "begin_line": 39,
      "end_line": 260,
      "comment": " \n * Special implementation of the {@link UnivariateRealOptimizer} interface adding\n * multi-start features to an existing optimizer.\n * \u003cp\u003e\n * This class wraps a classical optimizer to use it several times in\n * turn with different starting points in order to avoid being trapped\n * into a local extremum when looking for a global one.\n * \u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "optimizer"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Underlying classical optimizer. "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterations"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Maximal number of iterations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "maxEvaluations"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Maximal number of evaluations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "totalIterations"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Number of iterations already performed for all starts. "
    },
    {
      "type": "field",
      "varNames": [
        "totalEvaluations"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Number of evaluations already performed for all starts. "
    },
    {
      "type": "field",
      "varNames": [
        "starts"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Number of starts to go. "
    },
    {
      "type": "field",
      "varNames": [
        "generator"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Random generator for multi-start. "
    },
    {
      "type": "field",
      "varNames": [
        "optima"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Found optima. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.MultiStartUnivariateRealOptimizer(org.apache.commons.math.optimization.UnivariateRealOptimizer, int, org.apache.commons.math.random.RandomGenerator)",
      "begin_line": 76,
      "end_line": 86,
      "comment": "\n     * Create a multi-start optimizer from a single-start optimizer\n     * @param optimizer single-start optimizer to wrap\n     * @param starts number of starts to perform (including the\n     * first one), multi-start is disabled if value is less than or\n     * equal to 1\n     * @param generator random generator to use for restarts\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 42)",
        "(line 80,col 9)-(line 80,col 34)",
        "(line 81,col 9)-(line 81,col 39)",
        "(line 82,col 9)-(line 82,col 42)",
        "(line 83,col 9)-(line 83,col 37)",
        "(line 84,col 9)-(line 84,col 52)",
        "(line 85,col 9)-(line 85,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.getFunctionValue()",
      "begin_line": 89,
      "end_line": 91,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.getResult()",
      "begin_line": 94,
      "end_line": 96,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.getAbsoluteAccuracy()",
      "begin_line": 99,
      "end_line": 101,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.getIterationCount()",
      "begin_line": 104,
      "end_line": 106,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.getMaximalIterationCount()",
      "begin_line": 109,
      "end_line": 111,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.getMaxEvaluations()",
      "begin_line": 114,
      "end_line": 116,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.getEvaluations()",
      "begin_line": 119,
      "end_line": 121,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.getRelativeAccuracy()",
      "begin_line": 124,
      "end_line": 126,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.resetAbsoluteAccuracy()",
      "begin_line": 129,
      "end_line": 131,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.resetMaximalIterationCount()",
      "begin_line": 134,
      "end_line": 136,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.resetRelativeAccuracy()",
      "begin_line": 139,
      "end_line": 141,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.setAbsoluteAccuracy(double)",
      "begin_line": 144,
      "end_line": 146,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.setMaximalIterationCount(int)",
      "begin_line": 149,
      "end_line": 151,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.setMaxEvaluations(int)",
      "begin_line": 154,
      "end_line": 156,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.setRelativeAccuracy(double)",
      "begin_line": 159,
      "end_line": 161,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.getOptima()",
      "begin_line": 189,
      "end_line": 194,
      "comment": " Get all the optima found during the last call to {@link\n     * #optimize(UnivariateRealFunction, GoalType, double, double) optimize}.\n     * \u003cp\u003eThe optimizer stores all the optima found during a set of\n     * restarts. The {@link #optimize(UnivariateRealFunction, GoalType,\n     * double, double) optimize} method returns the best point only. This\n     * method returns all the points found at the end of each starts,\n     * including the best one already returned by the {@link\n     * #optimize(UnivariateRealFunction, GoalType, double, double) optimize}\n     * method.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The returned array as one element for each start as specified\n     * in the constructor. It is ordered with the results from the\n     * runs that did converge first, sorted from best to worst\n     * objective value (i.e in ascending order if minimizing and in\n     * descending order if maximizing), followed by and null elements\n     * corresponding to the runs that did not converge. This means all\n     * elements will be null if the {@link #optimize(UnivariateRealFunction,\n     * GoalType, double, double) optimize} method did throw a {@link\n     * ConvergenceException ConvergenceException}). This also means that\n     * if the first element is non null, it is the best point found across\n     * all starts.\u003c/p\u003e\n     * @return array containing the optima\n     * @exception IllegalStateException if {@link #optimize(UnivariateRealFunction,\n     * GoalType, double, double) optimize} has not been called\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 192,col 9)",
        "(line 193,col 9)-(line 193,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize(org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.optimization.GoalType, double, double)",
      "begin_line": 197,
      "end_line": 202,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer.optimize(org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.optimization.GoalType, double, double, double)",
      "begin_line": 205,
      "end_line": 258,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 46)",
        "(line 210,col 9)-(line 210,col 29)",
        "(line 211,col 9)-(line 211,col 29)",
        "(line 214,col 9)-(line 230,col 9)",
        "(line 233,col 9)-(line 233,col 36)",
        "(line 234,col 9)-(line 239,col 9)",
        "(line 240,col 9)-(line 240,col 40)",
        "(line 241,col 9)-(line 247,col 9)",
        "(line 249,col 9)-(line 253,col 9)",
        "(line 256,col 9)-(line 256,col 25)"
      ]
    }
  ]
}