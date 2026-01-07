{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/distribution/EnumeratedIntegerDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EnumeratedIntegerDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.AbstractIntegerDistribution"
      ],
      "begin_line": 41,
      "end_line": 211,
      "comment": "\n * \u003cp\u003eImplementation of an integer-valued {@link EnumeratedDistribution}.\u003c/p\u003e\n *\n * \u003cp\u003eValues with zero-probability are allowed but they do not extend the\n * support.\u003cbr/\u003e\n * Duplicate values are allowed. Probabilities of duplicate values are combined\n * when computing cumulative probabilities and statistics.\u003c/p\u003e\n *\n * @version $Id$\n * @since 3.2\n "
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
      "comment": "\n     * {@link EnumeratedDistribution} instance (using the {@link Integer} wrapper)\n     * used to generate the pmf.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.EnumeratedIntegerDistribution.EnumeratedIntegerDistribution(int[], double[])",
      "begin_line": 65,
      "end_line": 69,
      "comment": "\n     * Create a discrete distribution using the given probability mass function\n     * definition.\n     *\n     * @param singletons array of random variable values.\n     * @param probabilities array of probabilities.\n     * @throws DimensionMismatchException if\n     * {@code singletons.length !\u003d probabilities.length}\n     * @throws NotPositiveException if any of the probabilities are negative.\n     * @throws NotFiniteNumberException if any of the probabilities are infinite.\n     * @throws NotANumberException if any of the probabilities are NaN.\n     * @throws MathArithmeticException all of the probabilities are 0.\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.EnumeratedIntegerDistribution.EnumeratedIntegerDistribution(org.apache.commons.math3.random.RandomGenerator, int[], double[])",
      "begin_line": 85,
      "end_line": 101,
      "comment": "\n     * Create a discrete distribution using the given random number generator\n     * and probability mass function definition.\n     *\n     * @param rng random number generator.\n     * @param singletons array of random variable values.\n     * @param probabilities array of probabilities.\n     * @throws DimensionMismatchException if\n     * {@code singletons.length !\u003d probabilities.length}\n     * @throws NotPositiveException if any of the probabilities are negative.\n     * @throws NotFiniteNumberException if any of the probabilities are infinite.\n     * @throws NotANumberException if any of the probabilities are NaN.\n     * @throws MathArithmeticException all of the probabilities are 0.\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 19)",
        "(line 90,col 9)-(line 92,col 9)",
        "(line 94,col 9)-(line 94,col 108)",
        "(line 96,col 9)-(line 98,col 9)",
        "(line 100,col 9)-(line 100,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.EnumeratedIntegerDistribution.probability(int)",
      "begin_line": 106,
      "end_line": 108,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.EnumeratedIntegerDistribution.cumulativeProbability(int)",
      "begin_line": 113,
      "end_line": 123,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 31)",
        "(line 116,col 9)-(line 120,col 9)",
        "(line 122,col 9)-(line 122,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.EnumeratedIntegerDistribution.getNumericalMean()",
      "begin_line": 130,
      "end_line": 138,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @return {@code sum(singletons[i] * probabilities[i])}\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 24)",
        "(line 133,col 9)-(line 135,col 9)",
        "(line 137,col 9)-(line 137,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.EnumeratedIntegerDistribution.getNumericalVariance()",
      "begin_line": 145,
      "end_line": 155,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @return {@code sum((singletons[i] - mean) ^ 2 * probabilities[i])}\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 24)",
        "(line 147,col 9)-(line 147,col 33)",
        "(line 149,col 9)-(line 152,col 9)",
        "(line 154,col 9)-(line 154,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.EnumeratedIntegerDistribution.getSupportLowerBound()",
      "begin_line": 164,
      "end_line": 173,
      "comment": "\n     * {@inheritDoc}\n     *\n     * Returns the lowest value with non-zero probability.\n     *\n     * @return the lowest value with non-zero probability.\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 36)",
        "(line 166,col 9)-(line 170,col 9)",
        "(line 172,col 9)-(line 172,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.EnumeratedIntegerDistribution.getSupportUpperBound()",
      "begin_line": 182,
      "end_line": 191,
      "comment": "\n     * {@inheritDoc}\n     *\n     * Returns the highest value with non-zero probability.\n     *\n     * @return the highest value with non-zero probability.\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 36)",
        "(line 184,col 9)-(line 188,col 9)",
        "(line 190,col 9)-(line 190,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.EnumeratedIntegerDistribution.isSupportConnected()",
      "begin_line": 200,
      "end_line": 202,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The support of this distribution is connected.\n     *\n     * @return {@code true}\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.EnumeratedIntegerDistribution.sample()",
      "begin_line": 207,
      "end_line": 210,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 42)"
      ]
    }
  ]
}