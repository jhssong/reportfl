{
  "filepath": "/tmp/Math-8b/src/main/java/org/apache/commons/math3/distribution/DiscreteDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DiscreteDistribution",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 40,
      "end_line": 197,
      "comment": "\n * Generic implementation of the discrete distribution.\n *\n * @param \u003cT\u003e type of the random variable.\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Probability_distribution#Discrete_probability_distribution\"\u003eDiscrete probability distribution (Wikipedia)\u003c/a\u003e\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/DiscreteDistribution.html\"\u003eDiscrete Distribution (MathWorld)\u003c/a\u003e\n * @version $Id: DiscreteDistribution.java 169 2013-03-08 09:02:38Z wydrych $\n "
    },
    {
      "type": "field",
      "varNames": [
        "random"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * RNG instance used to generate samples from the distribution.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "singletons"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * List of random variable values.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "probabilities"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * Normalized array of probabilities of respective random variable values.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.DiscreteDistribution.DiscreteDistribution(java.util.List\u003corg.apache.commons.math3.util.Pair\u003cT, java.lang.Double\u003e\u003e)",
      "begin_line": 67,
      "end_line": 70,
      "comment": "\n     * Create a discrete distribution using the given probability mass function\n     * definition.\n     *\n     * @param samples definition of probability mass function in the format of\n     * list of pairs.\n     * @throws NotPositiveException if probability of at least one value is\n     * negative.\n     * @throws MathArithmeticException if the probabilities sum to zero.\n     * @throws MathIllegalArgumentException if probability of at least one value\n     * is infinite.\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.DiscreteDistribution.DiscreteDistribution(org.apache.commons.math3.random.RandomGenerator, java.util.List\u003corg.apache.commons.math3.util.Pair\u003cT, java.lang.Double\u003e\u003e)",
      "begin_line": 85,
      "end_line": 102,
      "comment": "\n     * Create a discrete distribution using the given random number generator\n     * and probability mass function definition.\n     *\n     * @param rng random number generator.\n     * @param samples definition of probability mass function in the format of\n     * list of pairs.\n     * @throws NotPositiveException if probability of at least one value is\n     * negative.\n     * @throws MathArithmeticException if the probabilities sum to zero.\n     * @throws MathIllegalArgumentException if probability of at least one value\n     * is infinite.\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 21)",
        "(line 89,col 9)-(line 89,col 54)",
        "(line 90,col 9)-(line 90,col 58)",
        "(line 92,col 9)-(line 99,col 9)",
        "(line 101,col 9)-(line 101,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.DiscreteDistribution.reseedRandomGenerator(long)",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n     * Reseed the random generator used to generate samples.\n     *\n     * @param seed the new seed\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.DiscreteDistribution.probability(T)",
      "begin_line": 122,
      "end_line": 133,
      "comment": "\n     * For a random variable {@code X} whose values are distributed according to\n     * this distribution, this method returns {@code P(X \u003d x)}. In other words,\n     * this method represents the probability mass function (PMF) for the\n     * distribution.\n     *\n     * @param x the point at which the PMF is evaluated\n     * @return the value of the probability mass function at {@code x}\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 31)",
        "(line 125,col 9)-(line 130,col 9)",
        "(line 132,col 9)-(line 132,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.DiscreteDistribution.getSamples()",
      "begin_line": 141,
      "end_line": 149,
      "comment": "\n     * Return the definition of probability mass function in the format of list\n     * of pairs.\n     *\n     * @return definition of probability mass function.\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 99)",
        "(line 144,col 9)-(line 146,col 9)",
        "(line 148,col 9)-(line 148,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.DiscreteDistribution.sample()",
      "begin_line": 156,
      "end_line": 171,
      "comment": "\n     * Generate a random value sampled from this distribution.\n     *\n     * @return a random value.\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 55)",
        "(line 158,col 9)-(line 158,col 23)",
        "(line 160,col 9)-(line 165,col 9)",
        "(line 170,col 9)-(line 170,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.DiscreteDistribution.sample(int)",
      "begin_line": 181,
      "end_line": 195,
      "comment": "\n     * Generate a random sample from the distribution.\n     *\n     * @param sampleSize the number of random values to generate.\n     * @return an array representing the random sample.\n     * @throws NotStrictlyPositiveException if {@code sampleSize} is not\n     * positive.\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 185,col 9)",
        "(line 187,col 9)-(line 187,col 107)",
        "(line 189,col 9)-(line 191,col 9)",
        "(line 193,col 9)-(line 193,col 19)"
      ]
    }
  ]
}