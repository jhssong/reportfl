{
  "filepath": "/tmp/Math-1b/src/main/java/org/apache/commons/math3/distribution/UniformIntegerDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UniformIntegerDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.AbstractIntegerDistribution"
      ],
      "begin_line": 34,
      "end_line": 175,
      "comment": "\n * Implementation of the uniform integer distribution.\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Uniform_distribution_(discrete)\"\n * \u003eUniform distribution (discrete), at Wikipedia\u003c/a\u003e\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "lower"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Lower bound (inclusive) of this distribution. "
    },
    {
      "type": "field",
      "varNames": [
        "upper"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Upper bound (inclusive) of this distribution. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.UniformIntegerDistribution.UniformIntegerDistribution(int, int)",
      "begin_line": 50,
      "end_line": 53,
      "comment": "\n     * Creates a new uniform integer distribution using the given lower and\n     * upper bounds (both inclusive).\n     *\n     * @param lower Lower bound (inclusive) of this distribution.\n     * @param upper Upper bound (inclusive) of this distribution.\n     * @throws NumberIsTooLargeException if {@code lower \u003e\u003d upper}.\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.UniformIntegerDistribution.UniformIntegerDistribution(org.apache.commons.math3.random.RandomGenerator, int, int)",
      "begin_line": 65,
      "end_line": 78,
      "comment": "\n     * Creates a new uniform integer distribution using the given lower and\n     * upper bounds (both inclusive).\n     *\n     * @param rng Random number generator.\n     * @param lower Lower bound (inclusive) of this distribution.\n     * @param upper Upper bound (inclusive) of this distribution.\n     * @throws NumberIsTooLargeException if {@code lower \u003e\u003d upper}.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 19)",
        "(line 71,col 9)-(line 75,col 9)",
        "(line 76,col 9)-(line 76,col 27)",
        "(line 77,col 9)-(line 77,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformIntegerDistribution.probability(int)",
      "begin_line": 81,
      "end_line": 86,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 82,col 9)-(line 84,col 9)",
        "(line 85,col 9)-(line 85,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformIntegerDistribution.cumulativeProbability(int)",
      "begin_line": 89,
      "end_line": 97,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 90,col 9)-(line 92,col 9)",
        "(line 93,col 9)-(line 95,col 9)",
        "(line 96,col 9)-(line 96,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformIntegerDistribution.getNumericalMean()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For lower bound {@code lower} and upper bound {@code upper}, the mean is\n     * {@code 0.5 * (lower + upper)}.\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformIntegerDistribution.getNumericalVariance()",
      "begin_line": 115,
      "end_line": 118,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For lower bound {@code lower} and upper bound {@code upper}, and\n     * {@code n \u003d upper - lower + 1}, the variance is {@code (n^2 - 1) / 12}.\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 37)",
        "(line 117,col 9)-(line 117,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformIntegerDistribution.getSupportLowerBound()",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is equal to the lower bound parameter\n     * of the distribution.\n     *\n     * @return lower bound of the support\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformIntegerDistribution.getSupportUpperBound()",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is equal to the upper bound parameter\n     * of the distribution.\n     *\n     * @return upper bound of the support\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformIntegerDistribution.isSupportConnected()",
      "begin_line": 151,
      "end_line": 153,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The support of this distribution is connected.\n     *\n     * @return {@code true}\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformIntegerDistribution.sample()",
      "begin_line": 156,
      "end_line": 174,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 44)",
        "(line 159,col 9)-(line 173,col 9)"
      ]
    }
  ]
}