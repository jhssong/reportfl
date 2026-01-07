{
  "filepath": "/tmp/Math-28b/src/main/java/org/apache/commons/math3/analysis/integration/gauss/GaussIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GaussIntegrator",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 106,
      "comment": "\n * Class that implements the Gaussian rule for\n * {@link #integrate(UnivariateFunction) integrating} a weighted\n * function.\n *\n * @since 3.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "points"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Nodes. "
    },
    {
      "type": "field",
      "varNames": [
        "weights"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Nodes weights. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.GaussIntegrator.GaussIntegrator(double[], double[])",
      "begin_line": 48,
      "end_line": 59,
      "comment": "\n     * Creates an integrator from the given {@code points} and {@code weights}.\n     * The integration interval is defined by the first and last value of\n     * {@code points} which must be sorted in increasing order.\n     *\n     * @param points Integration points.\n     * @param weights Weights of the corresponding integration nodes.\n     * @throws org.apache.commons.math3.exception.NonMonotonicSequenceException\n     * if the {@code points} are not sorted in increasing order.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 53,col 9)",
        "(line 55,col 9)-(line 55,col 88)",
        "(line 57,col 9)-(line 57,col 37)",
        "(line 58,col 9)-(line 58,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.GaussIntegrator.GaussIntegrator(org.apache.commons.math3.util.Pair\u003cdouble[], double[]\u003e)",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * Creates an integrator from the given pair of points (first element of\n     * the pair) and weights (second element of the pair.\n     *\n     * @param pointsAndWeights Integration points and corresponding weights.\n     * @throws org.apache.commons.math3.exception.NonMonotonicSequenceException\n     * if the {@code points} are not sorted in increasing order.\n     *\n     * @see #GaussIntegrator(double[], double[])\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.GaussIntegrator.integrate(org.apache.commons.math3.analysis.UnivariateFunction)",
      "begin_line": 85,
      "end_line": 97,
      "comment": "\n     * Returns an estimate of the integral of {@code f(x) * w(x)},\n     * where {@code w} is a weight function that depends on the actual\n     * flavor of the Gauss integration scheme.\n     * The algorithm uses the points and associated weights, as passed\n     * to the {@link #GaussIntegrator(double[],double[]) constructor}.\n     *\n     * @param f Function to integrate.\n     * @return the integral of the weighted function.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 21)",
        "(line 87,col 9)-(line 87,col 21)",
        "(line 88,col 9)-(line 95,col 9)",
        "(line 96,col 9)-(line 96,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.GaussIntegrator.getNumberOfPoints()",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\n     * @return the order of the integration rule (the number of integration\n     * points).\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 29)"
      ]
    }
  ]
}