{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/distribution/EnumeratedRealDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EnumeratedRealDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.AbstractRealDistribution"
      ],
      "begin_line": 41,
      "end_line": 247,
      "comment": "\n * \u003cp\u003eImplementation of a real-valued {@link EnumeratedDistribution}.\n *\n * \u003cp\u003eValues with zero-probability are allowed but they do not extend the\n * support.\u003cbr/\u003e\n * Duplicate values are allowed. Probabilities of duplicate values are combined\n * when computing cumulative probabilities and statistics.\u003c/p\u003e\n *\n * @version $Id$\n * @since 3.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Serializable UID. "
    },
    {
      "type": "field",
      "varNames": [
        "innerDistribution"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * {@link EnumeratedDistribution} (using the {@link Double} wrapper)\n     * used to generate the pmf.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.EnumeratedRealDistribution.EnumeratedRealDistribution(double[], double[])",
      "begin_line": 65,
      "end_line": 69,
      "comment": "\n     * Create a discrete distribution using the given probability mass function\n     * enumeration.\n     *\n     * @param singletons array of random variable values.\n     * @param probabilities array of probabilities.\n     * @throws DimensionMismatchException if\n     * {@code singletons.length !\u003d probabilities.length}\n     * @throws NotPositiveException if any of the probabilities are negative.\n     * @throws NotFiniteNumberException if any of the probabilities are infinite.\n     * @throws NotANumberException if any of the probabilities are NaN.\n     * @throws MathArithmeticException all of the probabilities are 0.\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.EnumeratedRealDistribution.EnumeratedRealDistribution(org.apache.commons.math3.random.RandomGenerator, double[], double[])",
      "begin_line": 85,
      "end_line": 101,
      "comment": "\n     * Create a discrete distribution using the given random number generator\n     * and probability mass function enumeration.\n     *\n     * @param rng random number generator.\n     * @param singletons array of random variable values.\n     * @param probabilities array of probabilities.\n     * @throws DimensionMismatchException if\n     * {@code singletons.length !\u003d probabilities.length}\n     * @throws NotPositiveException if any of the probabilities are negative.\n     * @throws NotFiniteNumberException if any of the probabilities are infinite.\n     * @throws NotANumberException if any of the probabilities are NaN.\n     * @throws MathArithmeticException all of the probabilities are 0.\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 19)",
        "(line 90,col 9)-(line 92,col 9)",
        "(line 94,col 9)-(line 94,col 100)",
        "(line 96,col 9)-(line 98,col 9)",
        "(line 100,col 9)-(line 100,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.EnumeratedRealDistribution.probability(double)",
      "begin_line": 106,
      "end_line": 109,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.EnumeratedRealDistribution.density(double)",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\n     * For a random variable {@code X} whose values are distributed according to\n     * this distribution, this method returns {@code P(X \u003d x)}. In other words,\n     * this method represents the probability mass function (PMF) for the\n     * distribution.\n     *\n     * @param x the point at which the PMF is evaluated\n     * @return the value of the probability mass function at point {@code x}\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.EnumeratedRealDistribution.cumulativeProbability(double)",
      "begin_line": 127,
      "end_line": 137,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 31)",
        "(line 130,col 9)-(line 134,col 9)",
        "(line 136,col 9)-(line 136,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.EnumeratedRealDistribution.getNumericalMean()",
      "begin_line": 144,
      "end_line": 152,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @return {@code sum(singletons[i] * probabilities[i])}\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 24)",
        "(line 147,col 9)-(line 149,col 9)",
        "(line 151,col 9)-(line 151,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.EnumeratedRealDistribution.getNumericalVariance()",
      "begin_line": 159,
      "end_line": 169,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @return {@code sum((singletons[i] - mean) ^ 2 * probabilities[i])}\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 24)",
        "(line 161,col 9)-(line 161,col 33)",
        "(line 163,col 9)-(line 166,col 9)",
        "(line 168,col 9)-(line 168,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.EnumeratedRealDistribution.getSupportLowerBound()",
      "begin_line": 178,
      "end_line": 187,
      "comment": "\n     * {@inheritDoc}\n     *\n     * Returns the lowest value with non-zero probability.\n     *\n     * @return the lowest value with non-zero probability.\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 46)",
        "(line 180,col 9)-(line 184,col 9)",
        "(line 186,col 9)-(line 186,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.EnumeratedRealDistribution.getSupportUpperBound()",
      "begin_line": 196,
      "end_line": 205,
      "comment": "\n     * {@inheritDoc}\n     *\n     * Returns the highest value with non-zero probability.\n     *\n     * @return the highest value with non-zero probability.\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 46)",
        "(line 198,col 9)-(line 202,col 9)",
        "(line 204,col 9)-(line 204,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.EnumeratedRealDistribution.isSupportLowerBoundInclusive()",
      "begin_line": 214,
      "end_line": 216,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The support of this distribution includes the lower bound.\n     *\n     * @return {@code true}\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.EnumeratedRealDistribution.isSupportUpperBoundInclusive()",
      "begin_line": 225,
      "end_line": 227,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The support of this distribution includes the upper bound.\n     *\n     * @return {@code true}\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.EnumeratedRealDistribution.isSupportConnected()",
      "begin_line": 236,
      "end_line": 238,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The support of this distribution is connected.\n     *\n     * @return {@code true}\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.EnumeratedRealDistribution.sample()",
      "begin_line": 243,
      "end_line": 246,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 42)"
      ]
    }
  ]
}