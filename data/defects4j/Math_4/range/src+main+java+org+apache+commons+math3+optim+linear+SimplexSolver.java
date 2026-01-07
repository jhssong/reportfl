{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optim/linear/SimplexSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimplexSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optim.linear.LinearOptimizer"
      ],
      "begin_line": 56,
      "end_line": 298,
      "comment": "\n * Solves a linear problem using the \"Two-Phase Simplex\" method.\n * \u003cp\u003e\n * \u003cb\u003eNote:\u003c/b\u003e Depending on the problem definition, the default convergence criteria\n * may be too strict, resulting in {@link NoFeasibleSolutionException} or\n * {@link TooManyIterationsException}. In such a case it is advised to adjust these\n * criteria with more appropriate values, e.g. relaxing the epsilon value.\n * \u003cp\u003e\n * Default convergence criteria:\n * \u003cul\u003e\n *   \u003cli\u003eAlgorithm convergence: 1e-6\u003c/li\u003e\n *   \u003cli\u003eFloating-point comparisons: 10 ulp\u003c/li\u003e\n *   \u003cli\u003eCut-Off value: 1e-12\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003cp\u003e\n * The cut-off value has been introduced to zero out very small numbers in the Simplex tableau,\n * as these may lead to numerical instabilities due to the nature of the Simplex algorithm\n * (the pivot element is used as a denominator). If the problem definition is very tight, the\n * default cut-off value may be too small, thus it is advised to increase it to a larger value,\n * in accordance with the chosen epsilon.\n * \u003cp\u003e\n * It may also be counter-productive to provide a too large value for {@link\n * org.apache.commons.math3.optim.MaxIter MaxIter} as parameter in the call of {@link\n * #optimize(org.apache.commons.math3.optim.OptimizationData...) optimize(OptimizationData...)},\n * as the {@link SimplexSolver} will use different strategies depending on the current iteration\n * count. After half of the allowed max iterations has already been reached, the strategy to select\n * pivot rows will change in order to break possible cycles due to degenerate problems.\n *\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ULPS"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Default amount of error to accept in floating point comparisons (as ulps). "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CUT_OFF"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Default cut-off value. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_EPSILON"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Default amount of error to accept for algorithm convergence. "
    },
    {
      "type": "field",
      "varNames": [
        "epsilon"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Amount of error to accept for algorithm convergence. "
    },
    {
      "type": "field",
      "varNames": [
        "maxUlps"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Amount of error to accept in floating point comparisons (as ulps). "
    },
    {
      "type": "field",
      "varNames": [
        "cutOff"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": "\n     * Cut-off value for entries in the tableau: values smaller than the cut-off\n     * are treated as zero to improve numerical stability.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.linear.SimplexSolver.SimplexSolver()",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * Builds a simplex solver with default settings.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 61)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.linear.SimplexSolver.SimplexSolver(double)",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\n     * Builds a simplex solver with a specified accepted amount of error.\n     *\n     * @param epsilon Amount of error to accept for algorithm convergence.\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.linear.SimplexSolver.SimplexSolver(double, int)",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * Builds a simplex solver with a specified accepted amount of error.\n     *\n     * @param epsilon Amount of error to accept for algorithm convergence.\n     * @param maxUlps Amount of error to accept in floating point comparisons.\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.linear.SimplexSolver.SimplexSolver(double, int, double)",
      "begin_line": 111,
      "end_line": 115,
      "comment": "\n     * Builds a simplex solver with a specified accepted amount of error.\n     *\n     * @param epsilon Amount of error to accept for algorithm convergence.\n     * @param maxUlps Amount of error to accept in floating point comparisons.\n     * @param cutOff Values smaller than the cutOff are treated as zero.\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 31)",
        "(line 113,col 9)-(line 113,col 31)",
        "(line 114,col 9)-(line 114,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexSolver.getPivotColumn(org.apache.commons.math3.optim.linear.SimplexTableau)",
      "begin_line": 123,
      "end_line": 136,
      "comment": "\n     * Returns the column with the most negative coefficient in the objective function row.\n     *\n     * @param tableau Simple tableau for the problem.\n     * @return the column with the most negative coefficient.\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 28)",
        "(line 125,col 9)-(line 125,col 30)",
        "(line 126,col 9)-(line 134,col 9)",
        "(line 135,col 9)-(line 135,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexSolver.getPivotRow(org.apache.commons.math3.optim.linear.SimplexTableau, int)",
      "begin_line": 145,
      "end_line": 213,
      "comment": "\n     * Returns the row with the minimum ratio as given by the minimum ratio test (MRT).\n     *\n     * @param tableau Simple tableau for the problem.\n     * @param col Column to test the ratio of (see {@link #getPivotColumn(SimplexTableau)}).\n     * @return the row with the minimum ratio.\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 67)",
        "(line 148,col 9)-(line 148,col 43)",
        "(line 149,col 9)-(line 166,col 9)",
        "(line 168,col 9)-(line 211,col 9)",
        "(line 212,col 9)-(line 212,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexSolver.doIteration(org.apache.commons.math3.optim.linear.SimplexTableau)",
      "begin_line": 222,
      "end_line": 245,
      "comment": "\n     * Runs one iteration of the Simplex method on the given model.\n     *\n     * @param tableau Simple tableau for the problem.\n     * @throws TooManyIterationsException if the allowed number of iterations has been exhausted.\n     * @throws UnboundedSolutionException if the model is found not to have a bounded solution.\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 34)",
        "(line 228,col 9)-(line 228,col 51)",
        "(line 229,col 9)-(line 229,col 58)",
        "(line 230,col 9)-(line 232,col 9)",
        "(line 235,col 9)-(line 235,col 63)",
        "(line 236,col 9)-(line 236,col 46)",
        "(line 239,col 9)-(line 244,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexSolver.solvePhase1(org.apache.commons.math3.optim.linear.SimplexTableau)",
      "begin_line": 255,
      "end_line": 273,
      "comment": "\n     * Solves Phase 1 of the Simplex method.\n     *\n     * @param tableau Simple tableau for the problem.\n     * @throws TooManyIterationsException if the allowed number of iterations has been exhausted.\n     * @throws UnboundedSolutionException if the model is found not to have a bounded solution.\n     * @throws NoFeasibleSolutionException if there is no feasible solution?\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 263,col 9)",
        "(line 265,col 9)-(line 267,col 9)",
        "(line 270,col 9)-(line 272,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexSolver.doOptimize()",
      "begin_line": 276,
      "end_line": 297,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 281,col 9)-(line 288,col 39)",
        "(line 290,col 9)-(line 290,col 29)",
        "(line 291,col 9)-(line 291,col 38)",
        "(line 293,col 9)-(line 295,col 9)",
        "(line 296,col 9)-(line 296,col 37)"
      ]
    }
  ]
}