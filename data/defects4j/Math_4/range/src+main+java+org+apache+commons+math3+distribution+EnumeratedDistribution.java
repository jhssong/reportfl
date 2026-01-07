{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/distribution/EnumeratedDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EnumeratedDistribution",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 54,
      "end_line": 268,
      "comment": "\n * \u003cp\u003eA generic implementation of a\n * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Probability_distribution#Discrete_probability_distribution\"\u003e\n * discrete probability distribution (Wikipedia)\u003c/a\u003e over a finite sample space,\n * based on an enumerated list of \u0026lt;value, probability\u0026gt; pairs.  Input probabilities must all be non-negative,\n * but zero values are allowed and their sum does not have to equal one. Constructors will normalize input\n * probabilities to make them sum to one.\u003c/p\u003e\n *\n * \u003cp\u003eThe list of \u003cvalue, probability\u003e pairs does not, strictly speaking, have to be a function and it can\n * contain null values.  The pmf created by the constructor will combine probabilities of equal values and\n * will treat null values as equal.  For example, if the list of pairs \u0026lt;\"dog\", 0.2\u0026gt;, \u0026lt;null, 0.1\u0026gt;,\n * \u0026lt;\"pig\", 0.2\u0026gt;, \u0026lt;\"dog\", 0.1\u0026gt;, \u0026lt;null, 0.4\u0026gt; is provided to the constructor, the resulting\n * pmf will assign mass of 0.5 to null, 0.3 to \"dog\" and 0.2 to null.\u003c/p\u003e\n *\n * @param \u003cT\u003e type of the elements in the sample space.\n * @version $Id$\n * @since 3.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Serializable UID. "
    },
    {
      "type": "field",
      "varNames": [
        "random"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": "\n     * RNG instance used to generate samples from the distribution.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "singletons"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n     * List of random variable values.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "probabilities"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": "\n     * Probabilities of respective random variable values. For i \u003d 0, ..., singletons.size() - 1,\n     * probability[i] is the probability that a random variable following this distribution takes\n     * the value singletons[i].\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.EnumeratedDistribution.EnumeratedDistribution(java.util.List\u003corg.apache.commons.math3.util.Pair\u003cT, java.lang.Double\u003e\u003e)",
      "begin_line": 86,
      "end_line": 89,
      "comment": "\n     * Create an enumerated distribution using the given probability mass function\n     * enumeration.\n     *\n     * @param pmf probability mass function enumerated as a list of \u003cT, probability\u003e\n     * pairs.\n     * @throws NotPositiveException if any of the probabilities are negative.\n     * @throws NotFiniteNumberException if any of the probabilities are infinite.\n     * @throws NotANumberException if any of the probabilities are NaN.\n     * @throws MathArithmeticException all of the probabilities are 0.\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.EnumeratedDistribution.EnumeratedDistribution(org.apache.commons.math3.random.RandomGenerator, java.util.List\u003corg.apache.commons.math3.util.Pair\u003cT, java.lang.Double\u003e\u003e)",
      "begin_line": 103,
      "end_line": 127,
      "comment": "\n     * Create an enumerated distribution using the given random number generator\n     * and probability mass function enumeration.\n     *\n     * @param rng random number generator.\n     * @param pmf probability mass function enumerated as a list of \u003cT, probability\u003e\n     * pairs.\n     * @throws NotPositiveException if any of the probabilities are negative.\n     * @throws NotFiniteNumberException if any of the probabilities are infinite.\n     * @throws NotANumberException if any of the probabilities are NaN.\n     * @throws MathArithmeticException all of the probabilities are 0.\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 21)",
        "(line 107,col 9)-(line 107,col 50)",
        "(line 108,col 9)-(line 108,col 54)",
        "(line 110,col 9)-(line 124,col 9)",
        "(line 126,col 9)-(line 126,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.EnumeratedDistribution.reseedRandomGenerator(long)",
      "begin_line": 134,
      "end_line": 136,
      "comment": "\n     * Reseed the random generator used to generate samples.\n     *\n     * @param seed the new seed\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.EnumeratedDistribution.probability(T)",
      "begin_line": 150,
      "end_line": 161,
      "comment": "\n     * \u003cp\u003eFor a random variable {@code X} whose values are distributed according to\n     * this distribution, this method returns {@code P(X \u003d x)}. In other words,\n     * this method represents the probability mass function (PMF) for the\n     * distribution.\u003c/p\u003e\n     *\n     * \u003cp\u003eNote that if {@code x1} and {@code x2} satisfy {@code x1.equals(x2)},\n     * or both are null, then {@code probability(x1) \u003d probability(x2)}.\u003c/p\u003e\n     *\n     * @param x the point at which the PMF is evaluated\n     * @return the value of the probability mass function at {@code x}\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 31)",
        "(line 153,col 9)-(line 158,col 9)",
        "(line 160,col 9)-(line 160,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.EnumeratedDistribution.getPmf()",
      "begin_line": 173,
      "end_line": 181,
      "comment": "\n     * \u003cp\u003eReturn the probability mass function as a list of \u003cvalue, probability\u003e pairs.\u003c/p\u003e\n     *\n     * \u003cp\u003eNote that if duplicate and / or null values were provided to the constructor\n     * when creating this EnumeratedDistribution, the returned list will contain these\n     * values.  If duplicates values exist, what is returned will not represent\n     * a pmf (i.e., it is up to the caller to consolidate duplicate mass points).\u003c/p\u003e\n     *\n     * @return the probability mass function.\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 99)",
        "(line 176,col 9)-(line 178,col 9)",
        "(line 180,col 9)-(line 180,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.EnumeratedDistribution.sample()",
      "begin_line": 188,
      "end_line": 203,
      "comment": "\n     * Generate a random value sampled from this distribution.\n     *\n     * @return a random value.\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 55)",
        "(line 190,col 9)-(line 190,col 23)",
        "(line 192,col 9)-(line 197,col 9)",
        "(line 202,col 9)-(line 202,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.EnumeratedDistribution.sample(int)",
      "begin_line": 213,
      "end_line": 227,
      "comment": "\n     * Generate a random sample from the distribution.\n     *\n     * @param sampleSize the number of random values to generate.\n     * @return an array representing the random sample.\n     * @throws NotStrictlyPositiveException if {@code sampleSize} is not\n     * positive.\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 217,col 9)",
        "(line 219,col 9)-(line 219,col 52)",
        "(line 221,col 9)-(line 223,col 9)",
        "(line 225,col 9)-(line 225,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.EnumeratedDistribution.sample(int, T[])",
      "begin_line": 242,
      "end_line": 266,
      "comment": "\n     * Generate a random sample from the distribution.\n     * \u003cp\u003e\n     * If the requested samples fit in the specified array, it is returned\n     * therein. Otherwise, a new array is allocated with the runtime type of\n     * the specified array and the size of this collection.\n     *\n     * @param sampleSize the number of random values to generate.\n     * @param array the array to populate.\n     * @return an array representing the random sample.\n     * @throws NotStrictlyPositiveException if {@code sampleSize} is not positive.\n     * @throws NullArgumentException if {@code array} is null\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 245,col 9)",
        "(line 247,col 9)-(line 249,col 9)",
        "(line 251,col 9)-(line 251,col 16)",
        "(line 252,col 9)-(line 258,col 9)",
        "(line 260,col 9)-(line 262,col 9)",
        "(line 264,col 9)-(line 264,col 19)"
      ]
    }
  ]
}