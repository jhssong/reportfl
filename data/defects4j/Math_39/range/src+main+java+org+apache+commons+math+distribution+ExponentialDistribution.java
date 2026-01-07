{
  "filepath": "/tmp/Math-39b/src/main/java/org/apache/commons/math/distribution/ExponentialDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExponentialDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractRealDistribution"
      ],
      "begin_line": 31,
      "end_line": 224,
      "comment": "\n * Implementation of the exponential distribution.\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Exponential_distribution\"\u003eExponential distribution (Wikipedia)\u003c/a\u003e\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/ExponentialDistribution.html\"\u003eExponential distribution (MathWorld)\u003c/a\u003e\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INVERSE_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": "\n     * Default inverse cumulative probability accuracy.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "mean"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " The mean of this distribution. "
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Inverse cumulative probability accuracy. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.ExponentialDistribution.ExponentialDistribution(double)",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * Create a exponential distribution with the given mean.\n     * @param mean mean of this distribution.\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.ExponentialDistribution.ExponentialDistribution(double, double)",
      "begin_line": 62,
      "end_line": 69,
      "comment": "\n     * Create a exponential distribution with the given mean.\n     *\n     * @param mean Mean of this distribution.\n     * @param inverseCumAccuracy Maximum absolute error in inverse\n     * cumulative probability estimates (defaults to\n     * {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY}).\n     * @throws NotStrictlyPositiveException if {@code mean \u003c\u003d 0}.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 66,col 9)",
        "(line 67,col 9)-(line 67,col 25)",
        "(line 68,col 9)-(line 68,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistribution.getMean()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Access the mean.\n     *\n     * @return the mean.\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistribution.probability(double)",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For this distribution {@code P(X \u003d x)} always evaluates to 0.\n     *\n     * @return 0\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistribution.density(double)",
      "begin_line": 92,
      "end_line": 97,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 93,col 9)-(line 95,col 9)",
        "(line 96,col 9)-(line 96,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistribution.cumulativeProbability(double)",
      "begin_line": 109,
      "end_line": 117,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     * \u003cli\u003e\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/ExponentialDistribution.html\"\u003e\n     * Exponential Distribution\u003c/a\u003e, equation (1).\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 19)",
        "(line 111,col 9)-(line 115,col 9)",
        "(line 116,col 9)-(line 116,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistribution.inverseCumulativeProbability(double)",
      "begin_line": 125,
      "end_line": 138,
      "comment": "\n     * {@inheritDoc}\n     *\n     * Returns {@code 0} when {@code p\u003d \u003d 0} and\n     * {@code Double.POSITIVE_INFINITY} when {@code p \u003d\u003d 1}.\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 19)",
        "(line 129,col 9)-(line 135,col 9)",
        "(line 137,col 9)-(line 137,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistribution.sample()",
      "begin_line": 151,
      "end_line": 154,
      "comment": "\n     * {@inheritDoc}\n     *\n     * \u003cp\u003e\u003cstrong\u003eAlgorithm Description\u003c/strong\u003e: this implementation uses the\n     * \u003ca href\u003d\"http://www.jesus.ox.ac.uk/~clifford/a5/chap1/node5.html\"\u003e\n     * Inversion Method\u003c/a\u003e to generate exponentially distributed random values\n     * from uniform deviates.\u003c/p\u003e\n     *\n     * @return a random value.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistribution.getSolverAbsoluteAccuracy()",
      "begin_line": 157,
      "end_line": 160,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistribution.getNumericalMean()",
      "begin_line": 167,
      "end_line": 169,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For mean parameter {@code k}, the mean is {@code k}.\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistribution.getNumericalVariance()",
      "begin_line": 176,
      "end_line": 179,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For mean parameter {@code k}, the variance is {@code k^2}.\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 35)",
        "(line 178,col 9)-(line 178,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistribution.getSupportLowerBound()",
      "begin_line": 188,
      "end_line": 190,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always 0 no matter the mean parameter.\n     *\n     * @return lower bound of the support (always 0)\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistribution.getSupportUpperBound()",
      "begin_line": 200,
      "end_line": 202,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is always positive infinity\n     * no matter the mean parameter.\n     *\n     * @return upper bound of the support (always Double.POSITIVE_INFINITY)\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistribution.isSupportLowerBoundInclusive()",
      "begin_line": 205,
      "end_line": 207,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistribution.isSupportUpperBoundInclusive()",
      "begin_line": 210,
      "end_line": 212,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistribution.isSupportConnected()",
      "begin_line": 221,
      "end_line": 223,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The support of this distribution is connected.\n     *\n     * @return {@code true}\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 20)"
      ]
    }
  ]
}