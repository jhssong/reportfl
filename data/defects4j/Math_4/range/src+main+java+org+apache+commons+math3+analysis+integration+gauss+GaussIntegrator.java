{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/integration/gauss/GaussIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GaussIntegrator",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 33,
      "end_line": 110,
      "comment": "\n * Class that implements the Gaussian rule for\n * {@link #integrate(UnivariateFunction) integrating} a weighted\n * function.\n *\n * @since 3.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "points"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Nodes. "
    },
    {
      "type": "field",
      "varNames": [
        "weights"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Nodes weights. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.GaussIntegrator.GaussIntegrator(double[], double[])",
      "begin_line": 50,
      "end_line": 62,
      "comment": "\n     * Creates an integrator from the given {@code points} and {@code weights}.\n     * The integration interval is defined by the first and last value of\n     * {@code points} which must be sorted in increasing order.\n     *\n     * @param points Integration points.\n     * @param weights Weights of the corresponding integration nodes.\n     * @throws NonMonotonicSequenceException if the {@code points} are not\n     * sorted in increasing order.\n     * @throws DimensionMismatchException if points and weights don\u0027t have the same length\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 56,col 9)",
        "(line 58,col 9)-(line 58,col 88)",
        "(line 60,col 9)-(line 60,col 37)",
        "(line 61,col 9)-(line 61,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.GaussIntegrator.GaussIntegrator(org.apache.commons.math3.util.Pair\u003cdouble[], double[]\u003e)",
      "begin_line": 74,
      "end_line": 77,
      "comment": "\n     * Creates an integrator from the given pair of points (first element of\n     * the pair) and weights (second element of the pair.\n     *\n     * @param pointsAndWeights Integration points and corresponding weights.\n     * @throws NonMonotonicSequenceException if the {@code points} are not\n     * sorted in increasing order.\n     *\n     * @see #GaussIntegrator(double[], double[])\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.GaussIntegrator.integrate(org.apache.commons.math3.analysis.UnivariateFunction)",
      "begin_line": 89,
      "end_line": 101,
      "comment": "\n     * Returns an estimate of the integral of {@code f(x) * w(x)},\n     * where {@code w} is a weight function that depends on the actual\n     * flavor of the Gauss integration scheme.\n     * The algorithm uses the points and associated weights, as passed\n     * to the {@link #GaussIntegrator(double[],double[]) constructor}.\n     *\n     * @param f Function to integrate.\n     * @return the integral of the weighted function.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 21)",
        "(line 91,col 9)-(line 91,col 21)",
        "(line 92,col 9)-(line 99,col 9)",
        "(line 100,col 9)-(line 100,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.GaussIntegrator.getNumberOfPoints()",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n     * @return the order of the integration rule (the number of integration\n     * points).\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 29)"
      ]
    }
  ]
}