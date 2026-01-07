{
  "filepath": "/tmp/Math-2b/src/main/java/org/apache/commons/math3/analysis/integration/MidPointIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MidPointIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.integration.BaseAbstractUnivariateIntegrator"
      ],
      "begin_line": 38,
      "end_line": 170,
      "comment": "\n * Implements the \u003ca href\u003d\"http://en.wikipedia.org/wiki/Midpoint_method\"\u003e\n * Midpoint Rule\u003c/a\u003e for integration of real univariate functions. For\n * reference, see \u003cb\u003eNumerical Mathematics\u003c/b\u003e, ISBN 0387989595,\n * chapter 9.2.\n * \u003cp\u003e\n * The function should be integrable.\u003c/p\u003e\n *\n * @version $Id$\n * @since 3.3\n "
    },
    {
      "type": "field",
      "varNames": [
        "MIDPOINT_MAX_ITERATIONS_COUNT"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Maximum number of iterations for midpoint. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.integration.MidPointIntegrator.MidPointIntegrator(double, double, int, int)",
      "begin_line": 57,
      "end_line": 67,
      "comment": "\n     * Build a midpoint integrator with given accuracies and iterations counts.\n     * @param relativeAccuracy relative accuracy of the result\n     * @param absoluteAccuracy absolute accuracy of the result\n     * @param minimalIterationCount minimum number of iterations\n     * @param maximalIterationCount maximum number of iterations\n     * (must be less than or equal to {@link #MIDPOINT_MAX_ITERATIONS_COUNT}\n     * @exception NotStrictlyPositiveException if minimal number of iterations\n     * is not strictly positive\n     * @exception NumberIsTooSmallException if maximal number of iterations\n     * is lesser than or equal to the minimal number of iterations\n     * @exception NumberIsTooLargeException if maximal number of iterations\n     * is greater than {@link #MIDPOINT_MAX_ITERATIONS_COUNT}\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 96)",
        "(line 63,col 9)-(line 66,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.integration.MidPointIntegrator.MidPointIntegrator(int, int)",
      "begin_line": 81,
      "end_line": 89,
      "comment": "\n     * Build a midpoint integrator with given iteration counts.\n     * @param minimalIterationCount minimum number of iterations\n     * @param maximalIterationCount maximum number of iterations\n     * (must be less than or equal to {@link #MIDPOINT_MAX_ITERATIONS_COUNT}\n     * @exception NotStrictlyPositiveException if minimal number of iterations\n     * is not strictly positive\n     * @exception NumberIsTooSmallException if maximal number of iterations\n     * is lesser than or equal to the minimal number of iterations\n     * @exception NumberIsTooLargeException if maximal number of iterations\n     * is greater than {@link #MIDPOINT_MAX_ITERATIONS_COUNT}\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 60)",
        "(line 85,col 9)-(line 88,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.integration.MidPointIntegrator.MidPointIntegrator()",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\n     * Construct a midpoint integrator with default settings.\n     * (max iteration count set to {@link #MIDPOINT_MAX_ITERATIONS_COUNT})\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.MidPointIntegrator.stage(int, double, double, double)",
      "begin_line": 118,
      "end_line": 139,
      "comment": "\n     * Compute the n-th stage integral of midpoint rule.\n     * This function should only be called by API \u003ccode\u003eintegrate()\u003c/code\u003e in the package.\n     * To save time it does not verify arguments - caller does.\n     * \u003cp\u003e\n     * The interval is divided equally into 2^n sections rather than an\n     * arbitrary m sections because this configuration can best utilize the\n     * already computed values.\u003c/p\u003e\n     *\n     * @param n the stage of 1/2 refinement. Must be larger than 0.\n     * @param previousStageResult Result from the previous call to the\n     * {@code stage} method.\n     * @param min Lower bound of the integration interval.\n     * @param diffMaxMin Difference between the lower bound and upper bound\n     * of the integration interval.\n     * @return the value of n-th stage integral\n     * @throws TooManyEvaluationsException if the maximal number of evaluations\n     * is exceeded.\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 38)",
        "(line 126,col 9)-(line 126,col 23)",
        "(line 129,col 9)-(line 129,col 47)",
        "(line 132,col 9)-(line 132,col 39)",
        "(line 133,col 9)-(line 136,col 9)",
        "(line 138,col 9)-(line 138,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.MidPointIntegrator.doIntegrate()",
      "begin_line": 143,
      "end_line": 168,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 36)",
        "(line 148,col 9)-(line 148,col 43)",
        "(line 149,col 9)-(line 149,col 49)",
        "(line 151,col 9)-(line 151,col 61)",
        "(line 153,col 9)-(line 166,col 9)"
      ]
    }
  ]
}