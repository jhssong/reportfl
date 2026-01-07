{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/distribution/UniformIntegerDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UniformIntegerDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.AbstractIntegerDistribution"
      ],
      "begin_line": 35,
      "end_line": 163,
      "comment": "\n * Implementation of the uniform integer distribution.\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Uniform_distribution_(discrete)\"\n * \u003eUniform distribution (discrete), at Wikipedia\u003c/a\u003e\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "lower"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Lower bound (inclusive) of this distribution. "
    },
    {
      "type": "field",
      "varNames": [
        "upper"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Upper bound (inclusive) of this distribution. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.UniformIntegerDistribution.UniformIntegerDistribution(int, int)",
      "begin_line": 51,
      "end_line": 54,
      "comment": "\n     * Creates a new uniform integer distribution using the given lower and\n     * upper bounds (both inclusive).\n     *\n     * @param lower Lower bound (inclusive) of this distribution.\n     * @param upper Upper bound (inclusive) of this distribution.\n     * @throws NumberIsTooLargeException if {@code lower \u003e\u003d upper}.\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.UniformIntegerDistribution.UniformIntegerDistribution(org.apache.commons.math3.random.RandomGenerator, int, int)",
      "begin_line": 66,
      "end_line": 79,
      "comment": "\n     * Creates a new uniform integer distribution using the given lower and\n     * upper bounds (both inclusive).\n     *\n     * @param rng Random number generator.\n     * @param lower Lower bound (inclusive) of this distribution.\n     * @param upper Upper bound (inclusive) of this distribution.\n     * @throws NumberIsTooLargeException if {@code lower \u003e\u003d upper}.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 19)",
        "(line 72,col 9)-(line 76,col 9)",
        "(line 77,col 9)-(line 77,col 27)",
        "(line 78,col 9)-(line 78,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformIntegerDistribution.probability(int)",
      "begin_line": 82,
      "end_line": 87,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 83,col 9)-(line 85,col 9)",
        "(line 86,col 9)-(line 86,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformIntegerDistribution.cumulativeProbability(int)",
      "begin_line": 90,
      "end_line": 98,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 91,col 9)-(line 93,col 9)",
        "(line 94,col 9)-(line 96,col 9)",
        "(line 97,col 9)-(line 97,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformIntegerDistribution.getNumericalMean()",
      "begin_line": 106,
      "end_line": 108,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For lower bound {@code lower} and upper bound {@code upper}, the mean is\n     * {@code 0.5 * (lower + upper)}.\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformIntegerDistribution.getNumericalVariance()",
      "begin_line": 116,
      "end_line": 119,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For lower bound {@code lower} and upper bound {@code upper}, and\n     * {@code n \u003d upper - lower + 1}, the variance is {@code (n^2 - 1) / 12}.\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 37)",
        "(line 118,col 9)-(line 118,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformIntegerDistribution.getSupportLowerBound()",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is equal to the lower bound parameter\n     * of the distribution.\n     *\n     * @return lower bound of the support\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformIntegerDistribution.getSupportUpperBound()",
      "begin_line": 141,
      "end_line": 143,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is equal to the upper bound parameter\n     * of the distribution.\n     *\n     * @return upper bound of the support\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformIntegerDistribution.isSupportConnected()",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The support of this distribution is connected.\n     *\n     * @return {@code true}\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformIntegerDistribution.sample()",
      "begin_line": 157,
      "end_line": 162,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 45)",
        "(line 160,col 9)-(line 160,col 62)",
        "(line 161,col 9)-(line 161,col 44)"
      ]
    }
  ]
}