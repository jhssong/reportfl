{
  "filepath": "/tmp/Math-21b/src/main/java/org/apache/commons/math3/distribution/AbstractRealDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractRealDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.RealDistribution",
        "java.io.Serializable"
      ],
      "begin_line": 39,
      "end_line": 282,
      "comment": "\n * Base class for probability distributions on the reals.\n * Default implementations are provided for some of the methods\n * that do not vary from distribution to distribution.\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "SOLVER_DEFAULT_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Default accuracy. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "randomData"
      ],
      "begin_line": 50,
      "end_line": 51,
      "comment": "\n      * RandomData instance used to generate samples from the distribution.\n      * @deprecated As of 3.1, to be removed in 4.0. Please use the\n      * {@link #random} instance variable instead.\n      "
    },
    {
      "type": "field",
      "varNames": [
        "random"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " RNG instance used to generate samples from the distribution. "
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Solver absolute accuracy for inverse cumulative computation "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.AbstractRealDistribution.AbstractRealDistribution()",
      "begin_line": 61,
      "end_line": 66,
      "comment": "\n     * @deprecated As of 3.1, to be removed in 4.0. Please use\n     * {@link #AbstractRealDistribution(RandomGenerator)} instead.\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.AbstractRealDistribution.AbstractRealDistribution(org.apache.commons.math3.random.RandomGenerator)",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * @param rng Random number generator.\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractRealDistribution.cumulativeProbability(double, double)",
      "begin_line": 83,
      "end_line": 86,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The default implementation uses the identity\n     * \u003cp\u003e{@code P(x0 \u003c X \u003c\u003d x1) \u003d P(X \u003c\u003d x1) - P(X \u003c\u003d x0)}\u003c/p\u003e\n     *\n     * @deprecated As of 3.1 (to be removed in 4.0). Please use\n     * {@link #probability(double,double)} instead.\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractRealDistribution.probability(double, double)",
      "begin_line": 104,
      "end_line": 111,
      "comment": "\n     * For a random variable {@code X} whose values are distributed according\n     * to this distribution, this method returns {@code P(x0 \u003c X \u003c\u003d x1)}.\n     *\n     * @param x0 Lower bound (excluded).\n     * @param x1 Upper bound (included).\n     * @return the probability that a random variable with this distribution\n     * takes a value between {@code x0} and {@code x1}, excluding the lower\n     * and including the upper endpoint.\n     * @throws NumberIsTooLargeException if {@code x0 \u003e x1}.\n     *\n     * The default implementation uses the identity\n     * {@code P(x0 \u003c X \u003c\u003d x1) \u003d P(X \u003c\u003d x1) - P(X \u003c\u003d x0)}\n     *\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 109,col 9)",
        "(line 110,col 9)-(line 110,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractRealDistribution.inverseCumulativeProbability(double)",
      "begin_line": 122,
      "end_line": 225,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The default implementation returns\n     * \u003cul\u003e\n     * \u003cli\u003e{@link #getSupportLowerBound()} for {@code p \u003d 0},\u003c/li\u003e\n     * \u003cli\u003e{@link #getSupportUpperBound()} for {@code p \u003d 1}.\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 153,col 9)",
        "(line 155,col 9)-(line 155,col 51)",
        "(line 156,col 9)-(line 158,col 9)",
        "(line 160,col 9)-(line 160,col 51)",
        "(line 161,col 9)-(line 163,col 9)",
        "(line 165,col 9)-(line 165,col 45)",
        "(line 166,col 9)-(line 166,col 65)",
        "(line 167,col 9)-(line 167,col 39)",
        "(line 168,col 9)-(line 169,col 74)",
        "(line 171,col 9)-(line 180,col 9)",
        "(line 182,col 9)-(line 191,col 9)",
        "(line 193,col 9)-(line 198,col 10)",
        "(line 200,col 9)-(line 203,col 80)",
        "(line 205,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 224,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractRealDistribution.Anonymous-7a8b41ea-4a59-442e-ac31-edadd7ee4ac4.value(double)",
      "begin_line": 195,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 196,col 17)-(line 196,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractRealDistribution.getSolverAbsoluteAccuracy()",
      "begin_line": 234,
      "end_line": 236,
      "comment": "\n     * Returns the solver absolute accuracy for inverse cumulative computation.\n     * You can override this method in order to use a Brent solver with an\n     * absolute accuracy different from the default.\n     *\n     * @return the maximum absolute error in inverse cumulative probability estimates\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractRealDistribution.reseedRandomGenerator(long)",
      "begin_line": 239,
      "end_line": 242,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 29)",
        "(line 241,col 9)-(line 241,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractRealDistribution.sample()",
      "begin_line": 252,
      "end_line": 254,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The default implementation uses the\n     * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Inverse_transform_sampling\"\u003e\n     * inversion method.\n     * \u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractRealDistribution.sample(int)",
      "begin_line": 262,
      "end_line": 272,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The default implementation generates the sample by calling\n     * {@link #sample()} in a loop.\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 266,col 9)",
        "(line 267,col 9)-(line 267,col 46)",
        "(line 268,col 9)-(line 270,col 9)",
        "(line 271,col 9)-(line 271,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractRealDistribution.probability(double)",
      "begin_line": 279,
      "end_line": 281,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @return zero.\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 18)"
      ]
    }
  ]
}