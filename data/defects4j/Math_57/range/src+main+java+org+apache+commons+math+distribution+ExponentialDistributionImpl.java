{
  "filepath": "/tmp/Math-57b/src/main/java/org/apache/commons/math/distribution/ExponentialDistributionImpl.java",
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
      "begin_line": 32,
      "end_line": 293,
      "comment": "\n * The default implementation of {@link ExponentialDistribution}.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INVERSE_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": "\n     * Default inverse cumulative probability accuracy.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "mean"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " The mean of this distribution. "
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Inverse cumulative probability accuracy. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.ExponentialDistributionImpl(double)",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n     * Create a exponential distribution with the given mean.\n     * @param mean mean of this distribution.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.ExponentialDistributionImpl(double, double)",
      "begin_line": 64,
      "end_line": 70,
      "comment": "\n     * Create a exponential distribution with the given mean.\n     *\n     * @param mean Mean of this distribution.\n     * @param inverseCumAccuracy Maximum absolute error in inverse\n     * cumulative probability estimates (defaults to\n     * {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY}).\n     * @throws NotStrictlyPositiveException if {@code mean \u003c\u003d 0}.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 67,col 9)",
        "(line 68,col 9)-(line 68,col 25)",
        "(line 69,col 9)-(line 69,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.getMean()",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.density(double)",
      "begin_line": 82,
      "end_line": 88,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 86,col 9)",
        "(line 87,col 9)-(line 87,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.cumulativeProbability(double)",
      "begin_line": 105,
      "end_line": 113,
      "comment": "\n     * For this distribution, X, this method returns P(X \u0026lt; x).\n     *\n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     * \u003cli\u003e\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/ExponentialDistribution.html\"\u003e\n     * Exponential Distribution\u003c/a\u003e, equation (1).\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param x Value at which the CDF is evaluated.\n     * @return the CDF for this distribution.\n     * @throws MathException if the cumulative probability can not be\n     * computed due to convergence or other numerical errors.\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 19)",
        "(line 107,col 9)-(line 111,col 9)",
        "(line 112,col 9)-(line 112,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.inverseCumulativeProbability(double)",
      "begin_line": 127,
      "end_line": 140,
      "comment": "\n     * For this distribution, X, this method returns the critical point x, such\n     * that {@code P(X \u003c x) \u003d p}.\n     * It will return 0 when p \u003d 0 and {@code Double.POSITIVE_INFINITY}\n     * when p \u003d 1.\n     *\n     * @param p Desired probability.\n     * @return {@code x}, such that {@code P(X \u003c x) \u003d p}.\n     * @throws MathException if the inverse cumulative probability can not be\n     * computed due to convergence or other numerical errors.\n     * @throws OutOfRangeException if {@code p \u003c 0} or {@code p \u003e 1}.\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 19)",
        "(line 131,col 9)-(line 137,col 9)",
        "(line 139,col 9)-(line 139,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.sample()",
      "begin_line": 154,
      "end_line": 157,
      "comment": "\n     * Generates a random value sampled from this distribution.\n     *\n     * \u003cp\u003e\u003cstrong\u003eAlgorithm Description\u003c/strong\u003e: Uses the \u003ca\n     * href\u003d\"http://www.jesus.ox.ac.uk/~clifford/a5/chap1/node5.html\"\u003e Inversion\n     * Method\u003c/a\u003e to generate exponentially distributed random values from\n     * uniform deviates.\u003c/p\u003e\n     *\n     * @return a random value.\n     * @throws MathException if an error occurs generating the random value.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 166,
      "end_line": 169,
      "comment": "\n     * Access the domain value lower bound, based on {@code p}, used to\n     * bracket a CDF root.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the domain value lower bound, i.e. {@code P(X \u003c \u0027lower bound\u0027) \u003c p}.\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 178,
      "end_line": 190,
      "comment": "\n     * Access the domain value upper bound, based on {@code p}, used to\n     * bracket a CDF root.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the domain value upper bound, i.e. {@code P(X \u003c \u0027upper bound\u0027) \u003e p}.\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 189,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.getInitialDomain(double)",
      "begin_line": 199,
      "end_line": 212,
      "comment": "\n     * Access the initial domain value, based on {@code p}, used to\n     * bracket a CDF root.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the initial domain value.\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 211,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.getSolverAbsoluteAccuracy()",
      "begin_line": 221,
      "end_line": 224,
      "comment": "\n     * Return the absolute accuracy setting of the solver used to estimate\n     * inverse cumulative probabilities.\n     *\n     * @return the solver absolute accuracy.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.getSupportLowerBound()",
      "begin_line": 233,
      "end_line": 236,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always 0 no matter the mean parameter.\n     *\n     * @return lower bound of the support (always 0)\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.getSupportUpperBound()",
      "begin_line": 246,
      "end_line": 249,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is always positive infinity\n     * no matter the mean parameter.\n     *\n     * @return upper bound of the support (always Double.POSITIVE_INFINITY)\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.calculateNumericalMean()",
      "begin_line": 259,
      "end_line": 262,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For mean parameter \u003ccode\u003ek\u003c/code\u003e, the mean is\n     * \u003ccode\u003ek\u003c/code\u003e\n     *\n     * @return {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.calculateNumericalVariance()",
      "begin_line": 272,
      "end_line": 276,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For mean parameter \u003ccode\u003ek\u003c/code\u003e, the variance is\n     * \u003ccode\u003ek^2\u003c/code\u003e\n     *\n     * @return {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 35)",
        "(line 275,col 9)-(line 275,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.isSupportLowerBoundInclusive()",
      "begin_line": 281,
      "end_line": 284,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.isSupportUpperBoundInclusive()",
      "begin_line": 289,
      "end_line": 292,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 21)"
      ]
    }
  ]
}