{
  "filepath": "/tmp/Math-44b/src/main/java/org/apache/commons/math/distribution/ExponentialDistributionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExponentialDistributionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractContinuousDistribution",
        "org.apache.commons.math.distribution.ExponentialDistribution",
        "java.io.Serializable"
      ],
      "begin_line": 31,
      "end_line": 287,
      "comment": "\n * The default implementation of {@link ExponentialDistribution}.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INVERSE_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": "\n     * Default inverse cumulative probability accuracy.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "mean"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " The mean of this distribution. "
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Inverse cumulative probability accuracy. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.ExponentialDistributionImpl(double)",
      "begin_line": 49,
      "end_line": 51,
      "comment": "\n     * Create a exponential distribution with the given mean.\n     * @param mean mean of this distribution.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.ExponentialDistributionImpl(double, double)",
      "begin_line": 63,
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
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.getMean()",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.density(double)",
      "begin_line": 81,
      "end_line": 87,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 85,col 9)",
        "(line 86,col 9)-(line 86,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.cumulativeProbability(double)",
      "begin_line": 102,
      "end_line": 110,
      "comment": "\n     * For this distribution, X, this method returns P(X \u0026lt; x).\n     *\n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     * \u003cli\u003e\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/ExponentialDistribution.html\"\u003e\n     * Exponential Distribution\u003c/a\u003e, equation (1).\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param x Value at which the CDF is evaluated.\n     * @return the CDF for this distribution.\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 19)",
        "(line 104,col 9)-(line 108,col 9)",
        "(line 109,col 9)-(line 109,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.inverseCumulativeProbability(double)",
      "begin_line": 122,
      "end_line": 135,
      "comment": "\n     * For this distribution, X, this method returns the critical point x, such\n     * that {@code P(X \u003c x) \u003d p}.\n     * It will return 0 when p \u003d 0 and {@code Double.POSITIVE_INFINITY}\n     * when p \u003d 1.\n     *\n     * @param p Desired probability.\n     * @return {@code x}, such that {@code P(X \u003c x) \u003d p}.\n     * @throws OutOfRangeException if {@code p \u003c 0} or {@code p \u003e 1}.\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 19)",
        "(line 126,col 9)-(line 132,col 9)",
        "(line 134,col 9)-(line 134,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.sample()",
      "begin_line": 148,
      "end_line": 151,
      "comment": "\n     * Generates a random value sampled from this distribution.\n     *\n     * \u003cp\u003e\u003cstrong\u003eAlgorithm Description\u003c/strong\u003e: Uses the \u003ca\n     * href\u003d\"http://www.jesus.ox.ac.uk/~clifford/a5/chap1/node5.html\"\u003e Inversion\n     * Method\u003c/a\u003e to generate exponentially distributed random values from\n     * uniform deviates.\u003c/p\u003e\n     *\n     * @return a random value.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 160,
      "end_line": 163,
      "comment": "\n     * Access the domain value lower bound, based on {@code p}, used to\n     * bracket a CDF root.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the domain value lower bound, i.e. {@code P(X \u003c \u0027lower bound\u0027) \u003c p}.\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 172,
      "end_line": 184,
      "comment": "\n     * Access the domain value upper bound, based on {@code p}, used to\n     * bracket a CDF root.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the domain value upper bound, i.e. {@code P(X \u003c \u0027upper bound\u0027) \u003e p}.\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 183,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.getInitialDomain(double)",
      "begin_line": 193,
      "end_line": 206,
      "comment": "\n     * Access the initial domain value, based on {@code p}, used to\n     * bracket a CDF root.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the initial domain value.\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 205,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.getSolverAbsoluteAccuracy()",
      "begin_line": 215,
      "end_line": 218,
      "comment": "\n     * Return the absolute accuracy setting of the solver used to estimate\n     * inverse cumulative probabilities.\n     *\n     * @return the solver absolute accuracy.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.getSupportLowerBound()",
      "begin_line": 227,
      "end_line": 230,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always 0 no matter the mean parameter.\n     *\n     * @return lower bound of the support (always 0)\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.getSupportUpperBound()",
      "begin_line": 240,
      "end_line": 243,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is always positive infinity\n     * no matter the mean parameter.\n     *\n     * @return upper bound of the support (always Double.POSITIVE_INFINITY)\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.calculateNumericalMean()",
      "begin_line": 253,
      "end_line": 256,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For mean parameter \u003ccode\u003ek\u003c/code\u003e, the mean is\n     * \u003ccode\u003ek\u003c/code\u003e\n     *\n     * @return {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.calculateNumericalVariance()",
      "begin_line": 266,
      "end_line": 270,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For mean parameter \u003ccode\u003ek\u003c/code\u003e, the variance is\n     * \u003ccode\u003ek^2\u003c/code\u003e\n     *\n     * @return {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 35)",
        "(line 269,col 9)-(line 269,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.isSupportLowerBoundInclusive()",
      "begin_line": 275,
      "end_line": 278,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.isSupportUpperBoundInclusive()",
      "begin_line": 283,
      "end_line": 286,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 21)"
      ]
    }
  ]
}