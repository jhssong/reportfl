{
  "filepath": "/tmp/Math-8b/src/main/java/org/apache/commons/math3/distribution/DiscreteRealDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DiscreteRealDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.AbstractRealDistribution"
      ],
      "begin_line": 39,
      "end_line": 245,
      "comment": "\n * Implementation of the discrete distribution on the reals.\n *\n * Note: values with zero-probability are allowed but they do not extend the\n * support.\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Probability_distribution#Discrete_probability_distribution\"\u003eDiscrete probability distribution (Wikipedia)\u003c/a\u003e\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/DiscreteDistribution.html\"\u003eDiscrete Distribution (MathWorld)\u003c/a\u003e\n * @version $Id: DiscreteRealDistribution.java 169 2013-03-08 09:02:38Z wydrych $\n "
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
      "comment": "\n     * {@link DiscreteDistribution} instance (using the {@link Double} wrapper)\n     * used to generate samples.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.DiscreteRealDistribution.DiscreteRealDistribution(double[], double[])",
      "begin_line": 64,
      "end_line": 67,
      "comment": "\n     * Create a discrete distribution using the given probability mass function\n     * definition.\n     *\n     * @param singletons array of random variable values.\n     * @param probabilities array of probabilities.\n     * @throws DimensionMismatchException if\n     * {@code singletons.length !\u003d probabilities.length}\n     * @throws NotPositiveException if probability of at least one value is\n     * negative.\n     * @throws MathArithmeticException if the probabilities sum to zero.\n     * @throws MathIllegalArgumentException if probability of at least one value\n     * is infinite.\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.DiscreteRealDistribution.DiscreteRealDistribution(org.apache.commons.math3.random.RandomGenerator, double[], double[])",
      "begin_line": 84,
      "end_line": 99,
      "comment": "\n     * Create a discrete distribution using the given random number generator\n     * and probability mass function definition.\n     *\n     * @param rng random number generator.\n     * @param singletons array of random variable values.\n     * @param probabilities array of probabilities.\n     * @throws DimensionMismatchException if\n     * {@code singletons.length !\u003d probabilities.length}\n     * @throws NotPositiveException if probability of at least one value is\n     * negative.\n     * @throws MathArithmeticException if the probabilities sum to zero.\n     * @throws MathIllegalArgumentException if probability of at least one value\n     * is infinite.\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 19)",
        "(line 88,col 9)-(line 90,col 9)",
        "(line 92,col 9)-(line 92,col 100)",
        "(line 94,col 9)-(line 96,col 9)",
        "(line 98,col 9)-(line 98,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.DiscreteRealDistribution.probability(double)",
      "begin_line": 104,
      "end_line": 107,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.DiscreteRealDistribution.density(double)",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\n     * For a random variable {@code X} whose values are distributed according to\n     * this distribution, this method returns {@code P(X \u003d x)}. In other words,\n     * this method represents the probability mass function (PMF) for the\n     * distribution.\n     *\n     * @param x the point at which the PMF is evaluated\n     * @return the value of the probability mass function at point {@code x}\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.DiscreteRealDistribution.cumulativeProbability(double)",
      "begin_line": 125,
      "end_line": 135,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 31)",
        "(line 128,col 9)-(line 132,col 9)",
        "(line 134,col 9)-(line 134,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.DiscreteRealDistribution.getNumericalMean()",
      "begin_line": 142,
      "end_line": 150,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @return {@code sum(singletons[i] * probabilities[i])}\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 24)",
        "(line 145,col 9)-(line 147,col 9)",
        "(line 149,col 9)-(line 149,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.DiscreteRealDistribution.getNumericalVariance()",
      "begin_line": 157,
      "end_line": 167,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @return {@code sum((singletons[i] - mean) ^ 2 * probabilities[i])}\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 24)",
        "(line 159,col 9)-(line 159,col 33)",
        "(line 161,col 9)-(line 164,col 9)",
        "(line 166,col 9)-(line 166,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.DiscreteRealDistribution.getSupportLowerBound()",
      "begin_line": 176,
      "end_line": 185,
      "comment": "\n     * {@inheritDoc}\n     *\n     * Returns the lowest value with non-zero probability.\n     *\n     * @return the lowest value with non-zero probability.\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 46)",
        "(line 178,col 9)-(line 182,col 9)",
        "(line 184,col 9)-(line 184,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.DiscreteRealDistribution.getSupportUpperBound()",
      "begin_line": 194,
      "end_line": 203,
      "comment": "\n     * {@inheritDoc}\n     *\n     * Returns the highest value with non-zero probability.\n     *\n     * @return the highest value with non-zero probability.\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 46)",
        "(line 196,col 9)-(line 200,col 9)",
        "(line 202,col 9)-(line 202,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.DiscreteRealDistribution.isSupportLowerBoundInclusive()",
      "begin_line": 212,
      "end_line": 214,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The support of this distribution includes the lower bound.\n     *\n     * @return {@code true}\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.DiscreteRealDistribution.isSupportUpperBoundInclusive()",
      "begin_line": 223,
      "end_line": 225,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The support of this distribution includes the upper bound.\n     *\n     * @return {@code true}\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.DiscreteRealDistribution.isSupportConnected()",
      "begin_line": 234,
      "end_line": 236,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The support of this distribution is connected.\n     *\n     * @return {@code true}\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.DiscreteRealDistribution.sample()",
      "begin_line": 241,
      "end_line": 244,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 42)"
      ]
    }
  ]
}