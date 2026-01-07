{
  "filepath": "/tmp/Math-8b/src/main/java/org/apache/commons/math3/distribution/DiscreteIntegerDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DiscreteIntegerDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.AbstractIntegerDistribution"
      ],
      "begin_line": 39,
      "end_line": 209,
      "comment": "\n * Implementation of the integer-valued discrete distribution.\n *\n * Note: values with zero-probability are allowed but they do not extend the\n * support.\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Probability_distribution#Discrete_probability_distribution\"\u003eDiscrete probability distribution (Wikipedia)\u003c/a\u003e\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/DiscreteDistribution.html\"\u003eDiscrete Distribution (MathWorld)\u003c/a\u003e\n * @version $Id: DiscreteIntegerDistribution.java 169 2013-03-08 09:02:38Z wydrych $\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Serializable UID. "
    },
    {
      "type": "field",
      "varNames": [
        "innerDistribution"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n     * {@link DiscreteDistribution} instance (using the {@link Integer} wrapper)\n     * used to generate samples.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.DiscreteIntegerDistribution.DiscreteIntegerDistribution(int[], double[])",
      "begin_line": 64,
      "end_line": 67,
      "comment": "\n     * Create a discrete distribution using the given probability mass function\n     * definition.\n     *\n     * @param singletons array of random variable values.\n     * @param probabilities array of probabilities.\n     * @throws DimensionMismatchException if\n     * {@code singletons.length !\u003d probabilities.length}\n     * @throws NotPositiveException if probability of at least one value is\n     * negative.\n     * @throws MathArithmeticException if the probabilities sum to zero.\n     * @throws MathIllegalArgumentException if probability of at least one value\n     * is infinite.\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.DiscreteIntegerDistribution.DiscreteIntegerDistribution(org.apache.commons.math3.random.RandomGenerator, int[], double[])",
      "begin_line": 84,
      "end_line": 99,
      "comment": "\n     * Create a discrete distribution using the given random number generator\n     * and probability mass function definition.\n     *\n     * @param rng random number generator.\n     * @param singletons array of random variable values.\n     * @param probabilities array of probabilities.\n     * @throws DimensionMismatchException if\n     * {@code singletons.length !\u003d probabilities.length}\n     * @throws NotPositiveException if probability of at least one value is\n     * negative.\n     * @throws MathArithmeticException if the probabilities sum to zero.\n     * @throws MathIllegalArgumentException if probability of at least one value\n     * is infinite.\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 19)",
        "(line 88,col 9)-(line 90,col 9)",
        "(line 92,col 9)-(line 92,col 108)",
        "(line 94,col 9)-(line 96,col 9)",
        "(line 98,col 9)-(line 98,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.DiscreteIntegerDistribution.probability(int)",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.DiscreteIntegerDistribution.cumulativeProbability(int)",
      "begin_line": 111,
      "end_line": 121,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 31)",
        "(line 114,col 9)-(line 118,col 9)",
        "(line 120,col 9)-(line 120,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.DiscreteIntegerDistribution.getNumericalMean()",
      "begin_line": 128,
      "end_line": 136,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @return {@code sum(singletons[i] * probabilities[i])}\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 24)",
        "(line 131,col 9)-(line 133,col 9)",
        "(line 135,col 9)-(line 135,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.DiscreteIntegerDistribution.getNumericalVariance()",
      "begin_line": 143,
      "end_line": 153,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @return {@code sum((singletons[i] - mean) ^ 2 * probabilities[i])}\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 24)",
        "(line 145,col 9)-(line 145,col 33)",
        "(line 147,col 9)-(line 150,col 9)",
        "(line 152,col 9)-(line 152,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.DiscreteIntegerDistribution.getSupportLowerBound()",
      "begin_line": 162,
      "end_line": 171,
      "comment": "\n     * {@inheritDoc}\n     *\n     * Returns the lowest value with non-zero probability.\n     *\n     * @return the lowest value with non-zero probability.\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 36)",
        "(line 164,col 9)-(line 168,col 9)",
        "(line 170,col 9)-(line 170,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.DiscreteIntegerDistribution.getSupportUpperBound()",
      "begin_line": 180,
      "end_line": 189,
      "comment": "\n     * {@inheritDoc}\n     *\n     * Returns the highest value with non-zero probability.\n     *\n     * @return the highest value with non-zero probability.\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 36)",
        "(line 182,col 9)-(line 186,col 9)",
        "(line 188,col 9)-(line 188,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.DiscreteIntegerDistribution.isSupportConnected()",
      "begin_line": 198,
      "end_line": 200,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The support of this distribution is connected.\n     *\n     * @return {@code true}\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.DiscreteIntegerDistribution.sample()",
      "begin_line": 205,
      "end_line": 208,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 42)"
      ]
    }
  ]
}