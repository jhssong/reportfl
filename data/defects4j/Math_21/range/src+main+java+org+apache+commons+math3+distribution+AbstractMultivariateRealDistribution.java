{
  "filepath": "/tmp/Math-21b/src/main/java/org/apache/commons/math3/distribution/AbstractMultivariateRealDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractMultivariateRealDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.MultivariateRealDistribution"
      ],
      "begin_line": 29,
      "end_line": 106,
      "comment": "\n * Base class for multivariate probability distributions.\n *\n * @version $Id$\n * @since 3.1\n "
    },
    {
      "type": "field",
      "varNames": [
        "random"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " RNG instance used to generate samples from the distribution. "
    },
    {
      "type": "field",
      "varNames": [
        "numDimensions"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " The number of dimensions or columns in the multivariate distribution. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.AbstractMultivariateRealDistribution.AbstractMultivariateRealDistribution(org.apache.commons.math3.random.RandomGenerator, int)",
      "begin_line": 40,
      "end_line": 44,
      "comment": "\n     * @param rng Random number generator.\n     * @param n Number of dimensions.\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 21)",
        "(line 43,col 9)-(line 43,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractMultivariateRealDistribution.reseedRandomGenerator(long)",
      "begin_line": 47,
      "end_line": 49,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractMultivariateRealDistribution.getDimensions()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * Gets the number of dimensions (i.e. the number of random variables) of\n     * the distribution.\n     *\n     * @return the number of dimensions.\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractMultivariateRealDistribution.sample()",
      "begin_line": 62,
      "end_line": 62,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractMultivariateRealDistribution.sample(int)",
      "begin_line": 65,
      "end_line": 75,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 66,col 9)-(line 69,col 9)",
        "(line 70,col 9)-(line 70,col 69)",
        "(line 71,col 9)-(line 73,col 9)",
        "(line 74,col 9)-(line 74,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractMultivariateRealDistribution.probability(double[])",
      "begin_line": 78,
      "end_line": 80,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractMultivariateRealDistribution.getSupportLowerBound()",
      "begin_line": 83,
      "end_line": 85,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractMultivariateRealDistribution.getSupportUpperBound()",
      "begin_line": 88,
      "end_line": 90,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractMultivariateRealDistribution.isSupportLowerBoundInclusive()",
      "begin_line": 93,
      "end_line": 95,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractMultivariateRealDistribution.isSupportUpperBoundInclusive()",
      "begin_line": 98,
      "end_line": 100,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractMultivariateRealDistribution.isSupportConnected()",
      "begin_line": 103,
      "end_line": 105,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 21)"
      ]
    }
  ]
}