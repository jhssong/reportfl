{
  "filepath": "/tmp/Math-10b/src/main/java/org/apache/commons/math3/optim/linear/SimplexSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimplexSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optim.linear.LinearOptimizer"
      ],
      "begin_line": 55,
      "end_line": 299,
      "comment": "\n * Solves a linear problem using the \"Two-Phase Simplex\" method.\n * \u003cp\u003e\n * \u003cb\u003eNote:\u003c/b\u003e Depending on the problem definition, the default convergence criteria\n * may be too strict, resulting in {@link NoFeasibleSolutionException} or\n * {@link TooManyIterationsException}. In such a case it is advised to adjust these\n * criteria with more appropriate values, e.g. relaxing the epsilon value.\n * \u003cp\u003e\n * Default convergence criteria:\n * \u003cul\u003e\n *   \u003cli\u003eAlgorithm convergence: 1e-6\u003c/li\u003e\n *   \u003cli\u003eFloating-point comparisons: 10 ulp\u003c/li\u003e\n *   \u003cli\u003eCut-Off value: 1e-12\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003cp\u003e\n * The cut-off value has been introduced to zero out very small numbers in the Simplex tableau,\n * as these may lead to numerical instabilities due to the nature of the Simplex algorithm\n * (the pivot element is used as a denominator). If the problem definition is very tight, the\n * default cut-off value may be too small, thus it is advised to increase it to a larger value,\n * in accordance with the chosen epsilon.\n * \u003cp\u003e\n * It may also be counter-productive to provide a too large value for {@link MaxIter}\n * as parameter in the call of {@link #optimize(org.apache.commons.math3.optim.OptimizationData...)},\n * as the {@link SimplexSolver} will use different strategies depending on the current iteration\n * count. After half of the allowed max iterations has already been reached, the strategy to select\n * pivot rows will change in order to break possible cycles due to degenerate problems.\n *\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ULPS"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Default amount of error to accept in floating point comparisons (as ulps). "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CUT_OFF"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Default cut-off value. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_EPSILON"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Default amount of error to accept for algorithm convergence. "
    },
    {
      "type": "field",
      "varNames": [
        "epsilon"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Amount of error to accept for algorithm convergence. "
    },
    {
      "type": "field",
      "varNames": [
        "maxUlps"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Amount of error to accept in floating point comparisons (as ulps). "
    },
    {
      "type": "field",
      "varNames": [
        "cutOff"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": "\n     * Cut-off value for entries in the tableau: values smaller than the cut-off\n     * are treated as zero to improve numerical stability.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.linear.SimplexSolver.SimplexSolver()",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * Builds a simplex solver with default settings.\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 61)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.linear.SimplexSolver.SimplexSolver(double)",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * Builds a simplex solver with a specified accepted amount of error.\n     *\n     * @param epsilon Amount of error to accept for algorithm convergence.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.linear.SimplexSolver.SimplexSolver(double, int)",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * Builds a simplex solver with a specified accepted amount of error.\n     *\n     * @param epsilon Amount of error to accept for algorithm convergence.\n     * @param maxUlps Amount of error to accept in floating point comparisons.\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.linear.SimplexSolver.SimplexSolver(double, int, double)",
      "begin_line": 110,
      "end_line": 114,
      "comment": "\n     * Builds a simplex solver with a specified accepted amount of error.\n     *\n     * @param epsilon Amount of error to accept for algorithm convergence.\n     * @param maxUlps Amount of error to accept in floating point comparisons.\n     * @param cutOff Values smaller than the cutOff are treated as zero.\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 31)",
        "(line 112,col 9)-(line 112,col 31)",
        "(line 113,col 9)-(line 113,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexSolver.getPivotColumn(org.apache.commons.math3.optim.linear.SimplexTableau)",
      "begin_line": 122,
      "end_line": 135,
      "comment": "\n     * Returns the column with the most negative coefficient in the objective function row.\n     *\n     * @param tableau Simple tableau for the problem.\n     * @return the column with the most negative coefficient.\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 28)",
        "(line 124,col 9)-(line 124,col 30)",
        "(line 125,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 134,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexSolver.getPivotRow(org.apache.commons.math3.optim.linear.SimplexTableau, int)",
      "begin_line": 144,
      "end_line": 214,
      "comment": "\n     * Returns the row with the minimum ratio as given by the minimum ratio test (MRT).\n     *\n     * @param tableau Simple tableau for the problem.\n     * @param col Column to test the ratio of (see {@link #getPivotColumn(SimplexTableau)}).\n     * @return the row with the minimum ratio.\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 67)",
        "(line 147,col 9)-(line 147,col 43)",
        "(line 148,col 9)-(line 165,col 9)",
        "(line 167,col 9)-(line 212,col 9)",
        "(line 213,col 9)-(line 213,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexSolver.doIteration(org.apache.commons.math3.optim.linear.SimplexTableau)",
      "begin_line": 223,
      "end_line": 246,
      "comment": "\n     * Runs one iteration of the Simplex method on the given model.\n     *\n     * @param tableau Simple tableau for the problem.\n     * @throws TooManyIterationsException if the allowed number of iterations has been exhausted.\n     * @throws UnboundedSolutionException if the model is found not to have a bounded solution.\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 34)",
        "(line 229,col 9)-(line 229,col 51)",
        "(line 230,col 9)-(line 230,col 58)",
        "(line 231,col 9)-(line 233,col 9)",
        "(line 236,col 9)-(line 236,col 63)",
        "(line 237,col 9)-(line 237,col 46)",
        "(line 240,col 9)-(line 245,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexSolver.solvePhase1(org.apache.commons.math3.optim.linear.SimplexTableau)",
      "begin_line": 256,
      "end_line": 274,
      "comment": "\n     * Solves Phase 1 of the Simplex method.\n     *\n     * @param tableau Simple tableau for the problem.\n     * @throws TooManyIterationsException if the allowed number of iterations has been exhausted.\n     * @throws UnboundedSolutionException if the model is found not to have a bounded solution.\n     * @throws NoFeasibleSolutionException if there is no feasible solution?\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 264,col 9)",
        "(line 266,col 9)-(line 268,col 9)",
        "(line 271,col 9)-(line 273,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexSolver.doOptimize()",
      "begin_line": 277,
      "end_line": 298,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 282,col 9)-(line 289,col 39)",
        "(line 291,col 9)-(line 291,col 29)",
        "(line 292,col 9)-(line 292,col 38)",
        "(line 294,col 9)-(line 296,col 9)",
        "(line 297,col 9)-(line 297,col 37)"
      ]
    }
  ]
}