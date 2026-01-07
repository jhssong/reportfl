{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/distribution/AbstractMultivariateRealDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractMultivariateRealDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.MultivariateRealDistribution"
      ],
      "begin_line": 29,
      "end_line": 71,
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
        "dimension"
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
        "(line 43,col 9)-(line 43,col 22)"
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
      "signature": "org.apache.commons.math3.distribution.AbstractMultivariateRealDistribution.getDimension()",
      "begin_line": 52,
      "end_line": 54,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractMultivariateRealDistribution.sample()",
      "begin_line": 57,
      "end_line": 57,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractMultivariateRealDistribution.sample(int)",
      "begin_line": 60,
      "end_line": 70,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 61,col 9)-(line 64,col 9)",
        "(line 65,col 9)-(line 65,col 65)",
        "(line 66,col 9)-(line 68,col 9)",
        "(line 69,col 9)-(line 69,col 19)"
      ]
    }
  ]
}