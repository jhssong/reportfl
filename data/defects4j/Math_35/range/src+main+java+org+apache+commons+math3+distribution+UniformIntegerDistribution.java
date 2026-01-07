{
  "filepath": "/tmp/Math-35b/src/main/java/org/apache/commons/math3/distribution/UniformIntegerDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UniformIntegerDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.AbstractIntegerDistribution"
      ],
      "begin_line": 32,
      "end_line": 140,
      "comment": "\n * Implementation of the uniform integer distribution.\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Uniform_distribution_(discrete)\"\n * \u003eUniform distribution (discrete), at Wikipedia\u003c/a\u003e\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "lower"
      ],
      "begin_line": 37,
      "end_line": 37,
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
      "end_line": 58,
      "comment": "\n     * Creates a new uniform integer distribution using the given lower and\n     * upper bounds (both inclusive).\n     *\n     * @param lower Lower bound (inclusive) of this distribution.\n     * @param upper Upper bound (inclusive) of this distribution.\n     * @throws NumberIsTooLargeException if {@code lower \u003e\u003d upper}.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 55,col 9)",
        "(line 56,col 9)-(line 56,col 27)",
        "(line 57,col 9)-(line 57,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformIntegerDistribution.probability(int)",
      "begin_line": 61,
      "end_line": 66,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 62,col 9)-(line 64,col 9)",
        "(line 65,col 9)-(line 65,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformIntegerDistribution.cumulativeProbability(int)",
      "begin_line": 69,
      "end_line": 77,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 70,col 9)-(line 72,col 9)",
        "(line 73,col 9)-(line 75,col 9)",
        "(line 76,col 9)-(line 76,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformIntegerDistribution.getNumericalMean()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For lower bound {@code lower} and upper bound {@code upper}, the mean is\n     * {@code 0.5 * (lower + upper)}.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformIntegerDistribution.getNumericalVariance()",
      "begin_line": 95,
      "end_line": 98,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For lower bound {@code lower} and upper bound {@code upper}, and\n     * {@code n \u003d upper - lower + 1}, the variance is {@code (n^2 - 1) / 12}.\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 37)",
        "(line 97,col 9)-(line 97,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformIntegerDistribution.getSupportLowerBound()",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is equal to the lower bound parameter\n     * of the distribution.\n     *\n     * @return lower bound of the support\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformIntegerDistribution.getSupportUpperBound()",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is equal to the upper bound parameter\n     * of the distribution.\n     *\n     * @return upper bound of the support\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformIntegerDistribution.isSupportConnected()",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The support of this distribution is connected.\n     *\n     * @return {@code true}\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformIntegerDistribution.sample()",
      "begin_line": 136,
      "end_line": 139,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 48)"
      ]
    }
  ]
}