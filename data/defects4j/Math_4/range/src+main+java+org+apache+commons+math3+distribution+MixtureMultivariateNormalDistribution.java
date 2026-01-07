{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/distribution/MixtureMultivariateNormalDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MixtureMultivariateNormalDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.MixtureMultivariateRealDistribution\u003corg.apache.commons.math3.distribution.MultivariateNormalDistribution\u003e"
      ],
      "begin_line": 35,
      "end_line": 97,
      "comment": "\n * Multivariate normal mixture distribution.\n * This class is mainly syntactic sugar.\n *\n * @see MixtureMultivariateRealDistribution\n * @version $Id$\n * @since 3.2\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.MixtureMultivariateNormalDistribution.MixtureMultivariateNormalDistribution(double[], double[][], double[][][])",
      "begin_line": 44,
      "end_line": 48,
      "comment": "\n     * Creates a multivariate normal mixture distribution.\n     *\n     * @param weights Weights of each component.\n     * @param means Mean vector for each component.\n     * @param covariances Covariance matrix for each component.\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 61)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.MixtureMultivariateNormalDistribution.MixtureMultivariateNormalDistribution(java.util.List\u003corg.apache.commons.math3.util.Pair\u003cjava.lang.Double, org.apache.commons.math3.distribution.MultivariateNormalDistribution\u003e\u003e)",
      "begin_line": 56,
      "end_line": 58,
      "comment": "\n     * Creates a mixture model from a list of distributions and their\n     * associated weights.\n     *\n     * @param components List of (weight, distribution) pairs from which to sample.\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.MixtureMultivariateNormalDistribution.MixtureMultivariateNormalDistribution(org.apache.commons.math3.random.RandomGenerator, java.util.List\u003corg.apache.commons.math3.util.Pair\u003cjava.lang.Double, org.apache.commons.math3.distribution.MultivariateNormalDistribution\u003e\u003e)",
      "begin_line": 70,
      "end_line": 74,
      "comment": "\n     * Creates a mixture model from a list of distributions and their\n     * associated weights.\n     *\n     * @param rng Random number generator.\n     * @param components Distributions from which to sample.\n     * @throws NotPositiveException if any of the weights is negative.\n     * @throws DimensionMismatchException if not all components have the same\n     * number of variables.\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.MixtureMultivariateNormalDistribution.createComponents(double[], double[][], double[][][])",
      "begin_line": 82,
      "end_line": 96,
      "comment": "\n     * @param weights Weights of each component.\n     * @param means Mean vector for each component.\n     * @param covariances Covariance matrix for each component.\n     * @return the list of components.\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 86,col 76)",
        "(line 88,col 9)-(line 93,col 9)",
        "(line 95,col 9)-(line 95,col 20)"
      ]
    }
  ]
}