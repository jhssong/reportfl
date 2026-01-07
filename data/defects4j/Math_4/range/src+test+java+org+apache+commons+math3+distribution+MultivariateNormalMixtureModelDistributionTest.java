{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/distribution/MultivariateNormalMixtureModelDistributionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultivariateNormalMixtureModelDistributionTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 288,
      "comment": "\n * Test that demonstrates the use of {@link MixtureMultivariateRealDistribution}\n * in order to create a mixture model composed of {@link MultivariateNormalDistribution\n * normal distributions}.\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.MultivariateNormalMixtureModelDistributionTest.testNonUnitWeightSum()",
      "begin_line": 34,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 36,col 9)-(line 36,col 42)",
        "(line 37,col 9)-(line 38,col 50)",
        "(line 39,col 9)-(line 42,col 62)",
        "(line 43,col 9)-(line 44,col 50)",
        "(line 46,col 9)-(line 46,col 90)",
        "(line 48,col 9)-(line 48,col 74)",
        "(line 49,col 9)-(line 49,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.MultivariateNormalMixtureModelDistributionTest.testWeightSumOverFlow()",
      "begin_line": 52,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 85)",
        "(line 55,col 9)-(line 56,col 50)",
        "(line 57,col 9)-(line 60,col 62)",
        "(line 61,col 9)-(line 62,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.MultivariateNormalMixtureModelDistributionTest.testPreconditionPositiveWeights()",
      "begin_line": 65,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 55)",
        "(line 68,col 9)-(line 69,col 50)",
        "(line 70,col 9)-(line 73,col 62)",
        "(line 74,col 9)-(line 75,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.MultivariateNormalMixtureModelDistributionTest.testDensities()",
      "begin_line": 81,
      "end_line": 112,
      "comment": "\n     * Test the accuracy of the density calculation.\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 46)",
        "(line 84,col 9)-(line 85,col 50)",
        "(line 86,col 9)-(line 89,col 62)",
        "(line 90,col 9)-(line 91,col 50)",
        "(line 94,col 9)-(line 97,col 51)",
        "(line 104,col 9)-(line 107,col 67)",
        "(line 109,col 9)-(line 111,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.MultivariateNormalMixtureModelDistributionTest.testSampling()",
      "begin_line": 117,
      "end_line": 139,
      "comment": "\n     * Test the accuracy of sampling from the distribution.\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 46)",
        "(line 120,col 9)-(line 121,col 50)",
        "(line 122,col 9)-(line 125,col 62)",
        "(line 126,col 9)-(line 127,col 50)",
        "(line 128,col 9)-(line 128,col 36)",
        "(line 130,col 9)-(line 130,col 62)",
        "(line 131,col 9)-(line 131,col 44)",
        "(line 132,col 9)-(line 132,col 47)",
        "(line 134,col 9)-(line 138,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.MultivariateNormalMixtureModelDistributionTest.create(double[], double[][], double[][][])",
      "begin_line": 149,
      "end_line": 162,
      "comment": "\n     * Creates a mixture of Gaussian distributions.\n     *\n     * @param weights Weights.\n     * @param means Means.\n     * @param covariances Covariances.\n     * @return the mixture distribution.\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 153,col 76)",
        "(line 155,col 9)-(line 159,col 9)",
        "(line 161,col 9)-(line 161,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.MultivariateNormalMixtureModelDistributionTest.getCorrectSamples()",
      "begin_line": 167,
      "end_line": 287,
      "comment": "\n     * Values used in {@link #testSampling()}.\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 286,col 10)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MultivariateNormalMixtureModelDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.MixtureMultivariateRealDistribution\u003corg.apache.commons.math3.distribution.MultivariateNormalDistribution\u003e"
      ],
      "begin_line": 293,
      "end_line": 299,
      "comment": "\n * Class that implements a mixture of Gaussian ditributions.\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.MultivariateNormalMixtureModelDistribution.MultivariateNormalMixtureModelDistribution(java.util.List\u003corg.apache.commons.math3.util.Pair\u003cjava.lang.Double, org.apache.commons.math3.distribution.MultivariateNormalDistribution\u003e\u003e)",
      "begin_line": 296,
      "end_line": 298,
      "comment": "",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 26)"
      ]
    }
  ]
}