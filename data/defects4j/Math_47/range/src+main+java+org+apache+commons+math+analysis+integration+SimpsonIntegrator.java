{
  "filepath": "/tmp/Math-47b/src/main/java/org/apache/commons/math/analysis/integration/SimpsonIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimpsonIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl"
      ],
      "begin_line": 38,
      "end_line": 129,
      "comment": "\n * Implements the \u003ca href\u003d\"http://mathworld.wolfram.com/SimpsonsRule.html\"\u003e\n * Simpson\u0027s Rule\u003c/a\u003e for integration of real univariate functions. For\n * reference, see \u003cb\u003eIntroduction to Numerical Analysis\u003c/b\u003e, ISBN 038795452X,\n * chapter 3.\n * \u003cp\u003e\n * This implementation employs basic trapezoid rule as building blocks to\n * calculate the Simpson\u0027s rule of alternating 2/3 and 4/3.\u003c/p\u003e\n *\n * @version $Id$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "SIMPSON_MAX_ITERATIONS_COUNT"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Maximal number of iterations for Simpson. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.integration.SimpsonIntegrator.SimpsonIntegrator(double, double, int, int)",
      "begin_line": 57,
      "end_line": 67,
      "comment": "\n     * Build a Simpson integrator with given accuracies and iterations counts.\n     * @param relativeAccuracy relative accuracy of the result\n     * @param absoluteAccuracy absolute accuracy of the result\n     * @param minimalIterationCount minimum number of iterations\n     * @param maximalIterationCount maximum number of iterations\n     * (must be less than or equal to {@link #SIMPSON_MAX_ITERATIONS_COUNT})\n     * @exception NotStrictlyPositiveException if minimal number of iterations\n     * is not strictly positive\n     * @exception NumberIsTooSmallException if maximal number of iterations\n     * is lesser than or equal to the minimal number of iterations\n     * @exception NumberIsTooLargeException if maximal number of iterations\n     * is greater than {@link #SIMPSON_MAX_ITERATIONS_COUNT}\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 96)",
        "(line 63,col 9)-(line 66,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.integration.SimpsonIntegrator.SimpsonIntegrator(int, int)",
      "begin_line": 81,
      "end_line": 89,
      "comment": "\n     * Build a Simpson integrator with given iteration counts.\n     * @param minimalIterationCount minimum number of iterations\n     * @param maximalIterationCount maximum number of iterations\n     * (must be less than or equal to {@link #SIMPSON_MAX_ITERATIONS_COUNT})\n     * @exception NotStrictlyPositiveException if minimal number of iterations\n     * is not strictly positive\n     * @exception NumberIsTooSmallException if maximal number of iterations\n     * is lesser than or equal to the minimal number of iterations\n     * @exception NumberIsTooLargeException if maximal number of iterations\n     * is greater than {@link #SIMPSON_MAX_ITERATIONS_COUNT}\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 60)",
        "(line 85,col 9)-(line 88,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.integration.SimpsonIntegrator.SimpsonIntegrator()",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\n     * Construct an integrator with default settings.\n     * (max iteration count set to {@link #SIMPSON_MAX_ITERATIONS_COUNT})\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.SimpsonIntegrator.doIntegrate()",
      "begin_line": 100,
      "end_line": 127,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 62)",
        "(line 104,col 9)-(line 106,col 9)",
        "(line 109,col 9)-(line 109,col 24)",
        "(line 110,col 9)-(line 110,col 43)",
        "(line 111,col 9)-(line 125,col 9)"
      ]
    }
  ]
}