{
  "filepath": "/tmp/Math-3b/src/main/java/org/apache/commons/math3/analysis/integration/gauss/SymmetricGaussIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SymmetricGaussIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.integration.gauss.GaussIntegrator"
      ],
      "begin_line": 32,
      "end_line": 105,
      "comment": "\n * This class\u0027s implements {@link #integrate(UnivariateFunction) integrate}\n * method assuming that the integral is symmetric about 0.\n * This allows to reduce numerical errors.\n *\n * @since 3.3\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.SymmetricGaussIntegrator.SymmetricGaussIntegrator(double[], double[])",
      "begin_line": 44,
      "end_line": 48,
      "comment": "\n     * Creates an integrator from the given {@code points} and {@code weights}.\n     * The integration interval is defined by the first and last value of\n     * {@code points} which must be sorted in increasing order.\n     *\n     * @param points Integration points.\n     * @param weights Weights of the corresponding integration nodes.\n     * @throws NonMonotonicSequenceException if the {@code points} are not\n     * sorted in increasing order.\n     * @throws DimensionMismatchException if points and weights don\u0027t have the same length\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.SymmetricGaussIntegrator.SymmetricGaussIntegrator(org.apache.commons.math3.util.Pair\u003cdouble[], double[]\u003e)",
      "begin_line": 60,
      "end_line": 63,
      "comment": "\n     * Creates an integrator from the given pair of points (first element of\n     * the pair) and weights (second element of the pair.\n     *\n     * @param pointsAndWeights Integration points and corresponding weights.\n     * @throws NonMonotonicSequenceException if the {@code points} are not\n     * sorted in increasing order.\n     *\n     * @see #SymmetricGaussIntegrator(double[], double[])\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.SymmetricGaussIntegrator.integrate(org.apache.commons.math3.analysis.UnivariateFunction)",
      "begin_line": 68,
      "end_line": 104,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 51)",
        "(line 72,col 9)-(line 74,col 9)",
        "(line 76,col 9)-(line 76,col 40)",
        "(line 77,col 9)-(line 77,col 21)",
        "(line 78,col 9)-(line 78,col 21)",
        "(line 79,col 9)-(line 91,col 9)",
        "(line 93,col 9)-(line 101,col 9)",
        "(line 103,col 9)-(line 103,col 17)"
      ]
    }
  ]
}