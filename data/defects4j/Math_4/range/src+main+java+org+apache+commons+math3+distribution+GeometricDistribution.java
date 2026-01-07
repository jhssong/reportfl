{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/distribution/GeometricDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GeometricDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.AbstractIntegerDistribution"
      ],
      "begin_line": 33,
      "end_line": 154,
      "comment": "\n * Implementation of the geometric distribution.\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Geometric_distribution\"\u003eGeometric distribution (Wikipedia)\u003c/a\u003e\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/GeometricDistribution.html\"\u003eGeometric Distribution (MathWorld)\u003c/a\u003e\n * @version $Id$\n * @since 4.0\n "
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
        "probabilityOfSuccess"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " The probability of success. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.GeometricDistribution.GeometricDistribution(double)",
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n     * Create a geometric distribution with the given probability of success.\n     *\n     * @param p probability of success.\n     * @throws OutOfRangeException if {@code p \u003c\u003d 0} or {@code p \u003e 1}.\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.GeometricDistribution.GeometricDistribution(org.apache.commons.math3.random.RandomGenerator, double)",
      "begin_line": 57,
      "end_line": 65,
      "comment": "\n     * Creates a geometric distribution.\n     *\n     * @param rng Random number generator.\n     * @param p Probability of success.\n     * @throws OutOfRangeException if {@code p \u003c\u003d 0} or {@code p \u003e 1}.\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 19)",
        "(line 60,col 9)-(line 62,col 9)",
        "(line 64,col 9)-(line 64,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.GeometricDistribution.getProbabilityOfSuccess()",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\n     * Access the probability of success for this distribution.\n     *\n     * @return the probability of success.\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.GeometricDistribution.probability(int)",
      "begin_line": 77,
      "end_line": 86,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 19)",
        "(line 79,col 9)-(line 84,col 9)",
        "(line 85,col 9)-(line 85,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.GeometricDistribution.cumulativeProbability(int)",
      "begin_line": 89,
      "end_line": 98,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 19)",
        "(line 91,col 9)-(line 96,col 9)",
        "(line 97,col 9)-(line 97,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.GeometricDistribution.getNumericalMean()",
      "begin_line": 105,
      "end_line": 108,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For probability parameter {@code p}, the mean is {@code (1 - p) / p}.\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 46)",
        "(line 107,col 9)-(line 107,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.GeometricDistribution.getNumericalVariance()",
      "begin_line": 116,
      "end_line": 119,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For probability parameter {@code p}, the variance is\n     * {@code (1 - p) / (p * p)}.\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 46)",
        "(line 118,col 9)-(line 118,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.GeometricDistribution.getSupportLowerBound()",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always 0.\n     *\n     * @return lower bound of the support (always 0)\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.GeometricDistribution.getSupportUpperBound()",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is infinite (which we approximate as\n     * {@code Integer.MAX_VALUE}).\n     *\n     * @return upper bound of the support (always Integer.MAX_VALUE)\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.GeometricDistribution.isSupportConnected()",
      "begin_line": 151,
      "end_line": 153,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The support of this distribution is connected.\n     *\n     * @return {@code true}\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 20)"
      ]
    }
  ]
}