{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/integration/RombergIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RombergIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.integration.BaseAbstractUnivariateIntegrator"
      ],
      "begin_line": 39,
      "end_line": 143,
      "comment": "\n * Implements the \u003ca href\u003d\"http://mathworld.wolfram.com/RombergIntegration.html\"\u003e\n * Romberg Algorithm\u003c/a\u003e for integration of real univariate functions. For\n * reference, see \u003cb\u003eIntroduction to Numerical Analysis\u003c/b\u003e, ISBN 038795452X,\n * chapter 3.\n * \u003cp\u003e\n * Romberg integration employs k successive refinements of the trapezoid\n * rule to remove error terms less than order O(N^(-2k)). Simpson\u0027s rule\n * is a special case of k \u003d 2.\u003c/p\u003e\n *\n * @version $Id$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "ROMBERG_MAX_ITERATIONS_COUNT"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Maximal number of iterations for Romberg. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.integration.RombergIntegrator.RombergIntegrator(double, double, int, int)",
      "begin_line": 58,
      "end_line": 68,
      "comment": "\n     * Build a Romberg integrator with given accuracies and iterations counts.\n     * @param relativeAccuracy relative accuracy of the result\n     * @param absoluteAccuracy absolute accuracy of the result\n     * @param minimalIterationCount minimum number of iterations\n     * @param maximalIterationCount maximum number of iterations\n     * (must be less than or equal to {@link #ROMBERG_MAX_ITERATIONS_COUNT})\n     * @exception NotStrictlyPositiveException if minimal number of iterations\n     * is not strictly positive\n     * @exception NumberIsTooSmallException if maximal number of iterations\n     * is lesser than or equal to the minimal number of iterations\n     * @exception NumberIsTooLargeException if maximal number of iterations\n     * is greater than {@link #ROMBERG_MAX_ITERATIONS_COUNT}\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 96)",
        "(line 64,col 9)-(line 67,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.integration.RombergIntegrator.RombergIntegrator(int, int)",
      "begin_line": 82,
      "end_line": 90,
      "comment": "\n     * Build a Romberg integrator with given iteration counts.\n     * @param minimalIterationCount minimum number of iterations\n     * @param maximalIterationCount maximum number of iterations\n     * (must be less than or equal to {@link #ROMBERG_MAX_ITERATIONS_COUNT})\n     * @exception NotStrictlyPositiveException if minimal number of iterations\n     * is not strictly positive\n     * @exception NumberIsTooSmallException if maximal number of iterations\n     * is lesser than or equal to the minimal number of iterations\n     * @exception NumberIsTooLargeException if maximal number of iterations\n     * is greater than {@link #ROMBERG_MAX_ITERATIONS_COUNT}\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 60)",
        "(line 86,col 9)-(line 89,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.integration.RombergIntegrator.RombergIntegrator()",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * Construct a Romberg integrator with default settings\n     * (max iteration count set to {@link #ROMBERG_MAX_ITERATIONS_COUNT})\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.RombergIntegrator.doIntegrate()",
      "begin_line": 101,
      "end_line": 141,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 55)",
        "(line 106,col 9)-(line 106,col 45)",
        "(line 107,col 9)-(line 107,col 45)",
        "(line 109,col 9)-(line 109,col 62)",
        "(line 110,col 9)-(line 110,col 45)",
        "(line 111,col 9)-(line 111,col 36)",
        "(line 112,col 9)-(line 112,col 36)",
        "(line 113,col 9)-(line 139,col 9)"
      ]
    }
  ]
}