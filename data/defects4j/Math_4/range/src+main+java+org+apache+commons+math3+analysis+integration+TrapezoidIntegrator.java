{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/integration/TrapezoidIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TrapezoidIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.integration.BaseAbstractUnivariateIntegrator"
      ],
      "begin_line": 38,
      "end_line": 169,
      "comment": "\n * Implements the \u003ca href\u003d\"http://mathworld.wolfram.com/TrapezoidalRule.html\"\u003e\n * Trapezoid Rule\u003c/a\u003e for integration of real univariate functions. For\n * reference, see \u003cb\u003eIntroduction to Numerical Analysis\u003c/b\u003e, ISBN 038795452X,\n * chapter 3.\n * \u003cp\u003e\n * The function should be integrable.\u003c/p\u003e\n *\n * @version $Id$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "TRAPEZOID_MAX_ITERATIONS_COUNT"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Maximum number of iterations for trapezoid. "
    },
    {
      "type": "field",
      "varNames": [
        "s"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Intermediate result. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.integration.TrapezoidIntegrator.TrapezoidIntegrator(double, double, int, int)",
      "begin_line": 60,
      "end_line": 70,
      "comment": "\n     * Build a trapezoid integrator with given accuracies and iterations counts.\n     * @param relativeAccuracy relative accuracy of the result\n     * @param absoluteAccuracy absolute accuracy of the result\n     * @param minimalIterationCount minimum number of iterations\n     * @param maximalIterationCount maximum number of iterations\n     * (must be less than or equal to {@link #TRAPEZOID_MAX_ITERATIONS_COUNT}\n     * @exception NotStrictlyPositiveException if minimal number of iterations\n     * is not strictly positive\n     * @exception NumberIsTooSmallException if maximal number of iterations\n     * is lesser than or equal to the minimal number of iterations\n     * @exception NumberIsTooLargeException if maximal number of iterations\n     * is greater than {@link #TRAPEZOID_MAX_ITERATIONS_COUNT}\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 96)",
        "(line 66,col 9)-(line 69,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.integration.TrapezoidIntegrator.TrapezoidIntegrator(int, int)",
      "begin_line": 84,
      "end_line": 92,
      "comment": "\n     * Build a trapezoid integrator with given iteration counts.\n     * @param minimalIterationCount minimum number of iterations\n     * @param maximalIterationCount maximum number of iterations\n     * (must be less than or equal to {@link #TRAPEZOID_MAX_ITERATIONS_COUNT}\n     * @exception NotStrictlyPositiveException if minimal number of iterations\n     * is not strictly positive\n     * @exception NumberIsTooSmallException if maximal number of iterations\n     * is lesser than or equal to the minimal number of iterations\n     * @exception NumberIsTooLargeException if maximal number of iterations\n     * is greater than {@link #TRAPEZOID_MAX_ITERATIONS_COUNT}\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 60)",
        "(line 88,col 9)-(line 91,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.integration.TrapezoidIntegrator.TrapezoidIntegrator()",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * Construct a trapezoid integrator with default settings.\n     * (max iteration count set to {@link #TRAPEZOID_MAX_ITERATIONS_COUNT})\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.TrapezoidIntegrator.stage(org.apache.commons.math3.analysis.integration.BaseAbstractUnivariateIntegrator, int)",
      "begin_line": 117,
      "end_line": 143,
      "comment": "\n     * Compute the n-th stage integral of trapezoid rule. This function\n     * should only be called by API \u003ccode\u003eintegrate()\u003c/code\u003e in the package.\n     * To save time it does not verify arguments - caller does.\n     * \u003cp\u003e\n     * The interval is divided equally into 2^n sections rather than an\n     * arbitrary m sections because this configuration can best utilize the\n     * already computed values.\u003c/p\u003e\n     *\n     * @param baseIntegrator integrator holding integration parameters\n     * @param n the stage of 1/2 refinement, n \u003d 0 is no refinement\n     * @return the value of n-th stage integral\n     * @throws TooManyEvaluationsException if the maximal number of evaluations\n     * is exceeded.\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 142,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.TrapezoidIntegrator.doIntegrate()",
      "begin_line": 146,
      "end_line": 167,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 37)",
        "(line 151,col 9)-(line 151,col 36)",
        "(line 152,col 9)-(line 165,col 9)"
      ]
    }
  ]
}