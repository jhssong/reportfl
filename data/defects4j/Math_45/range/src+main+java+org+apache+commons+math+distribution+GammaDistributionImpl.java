{
  "filepath": "/tmp/Math-45b/src/main/java/org/apache/commons/math/distribution/GammaDistributionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GammaDistributionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractContinuousDistribution",
        "org.apache.commons.math.distribution.GammaDistribution",
        "java.io.Serializable"
      ],
      "begin_line": 31,
      "end_line": 306,
      "comment": "\n * The default implementation of {@link GammaDistribution}.\n *\n * @version $Id$\n "
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
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "alpha"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " The shape parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "beta"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " The scale parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Inverse cumulative probability accuracy. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.GammaDistributionImpl(double, double)",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * Create a new gamma distribution with the given alpha and beta values.\n     * @param alpha the shape parameter.\n     * @param beta the scale parameter.\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 61)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.GammaDistributionImpl(double, double, double)",
      "begin_line": 68,
      "end_line": 79,
      "comment": "\n     * Create a new gamma distribution with the given alpha and beta values.\n     *\n     * @param alpha Shape parameter.\n     * @param beta Scale parameter.\n     * @param inverseCumAccuracy Maximum absolute error in inverse\n     * cumulative probability estimates (defaults to\n     * {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY}).\n     * @throws NotStrictlyPositiveException if {@code alpha \u003c\u003d 0} or\n     * {@code beta \u003c\u003d 0}.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 71,col 9)",
        "(line 72,col 9)-(line 74,col 9)",
        "(line 76,col 9)-(line 76,col 27)",
        "(line 77,col 9)-(line 77,col 25)",
        "(line 78,col 9)-(line 78,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.cumulativeProbability(double)",
      "begin_line": 98,
      "end_line": 108,
      "comment": "\n     * For this distribution, {@code X}, this method returns {@code P(X \u003c x)}.\n     *\n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     *  \u003cli\u003e\n     *   \u003ca href\u003d\"http://mathworld.wolfram.com/Chi-SquaredDistribution.html\"\u003e\n     *    Chi-Squared Distribution\u003c/a\u003e, equation (9).\n     *  \u003c/li\u003e\n     *  \u003cli\u003eCasella, G., \u0026 Berger, R. (1990). \u003ci\u003eStatistical Inference\u003c/i\u003e.\n     *    Belmont, CA: Duxbury Press.\n     *  \u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param x Value at which the CDF is evaluated.\n     * @return CDF for this distribution.\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 19)",
        "(line 101,col 9)-(line 105,col 9)",
        "(line 107,col 9)-(line 107,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.inverseCumulativeProbability(double)",
      "begin_line": 121,
      "end_line": 130,
      "comment": "\n     * For this distribution, {@code X}, this method returns the critical\n     * point {@code x}, such that {@code P(X \u003c x) \u003d p}.\n     * It will return 0 when p \u003d 0 and {@code Double.POSITIVE_INFINITY}\n     * when p \u003d 1.\n     *\n     * @param p Desired probability.\n     * @return {@code x}, such that {@code P(X \u003c x) \u003d p}.\n     * @throws org.apache.commons.math.exception.OutOfRangeException if\n     * {@code p} is not a valid probability.\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 125,col 9)",
        "(line 126,col 9)-(line 128,col 9)",
        "(line 129,col 9)-(line 129,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.getAlpha()",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.getBeta()",
      "begin_line": 142,
      "end_line": 144,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.density(double)",
      "begin_line": 149,
      "end_line": 156,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 155,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 166,
      "end_line": 170,
      "comment": "\n     * Access the domain value lower bound, based on {@code p}, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the domain value lower bound, i.e. {@code P(X \u003c \u0027lower bound\u0027) \u003c p}.\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 180,
      "end_line": 197,
      "comment": "\n     * Access the domain value upper bound, based on {@code p}, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the domain value upper bound, i.e. {@code P(X \u003c \u0027upper bound\u0027) \u003e p}.\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 19)",
        "(line 188,col 9)-(line 194,col 9)",
        "(line 196,col 9)-(line 196,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.getInitialDomain(double)",
      "begin_line": 207,
      "end_line": 223,
      "comment": "\n     * Access the initial domain value, based on {@code p}, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the initial domain value.\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 19)",
        "(line 214,col 9)-(line 220,col 9)",
        "(line 222,col 9)-(line 222,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.getSolverAbsoluteAccuracy()",
      "begin_line": 232,
      "end_line": 235,
      "comment": "\n     * Return the absolute accuracy setting of the solver used to estimate\n     * inverse cumulative probabilities.\n     *\n     * @return the solver absolute accuracy.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.getSupportLowerBound()",
      "begin_line": 244,
      "end_line": 247,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always 0 no matter the parameters.\n     *\n     * @return lower bound of the support (always 0)\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.getSupportUpperBound()",
      "begin_line": 257,
      "end_line": 260,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is always positive infinity\n     * no matter the parameters.\n     *\n     * @return upper bound of the support (always Double.POSITIVE_INFINITY)\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.calculateNumericalMean()",
      "begin_line": 271,
      "end_line": 274,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For shape parameter \u003ccode\u003ealpha\u003c/code\u003e and scale\n     * parameter \u003ccode\u003ebeta\u003c/code\u003e, the mean is\n     * \u003ccode\u003ealpha * beta\u003c/code\u003e\n     *\n     * @return {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.calculateNumericalVariance()",
      "begin_line": 285,
      "end_line": 289,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For shape parameter \u003ccode\u003ealpha\u003c/code\u003e and scale\n     * parameter \u003ccode\u003ebeta\u003c/code\u003e, the variance is\n     * \u003ccode\u003ealpha * beta^2\u003c/code\u003e\n     *\n     * @return {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 35)",
        "(line 288,col 9)-(line 288,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.isSupportLowerBoundInclusive()",
      "begin_line": 294,
      "end_line": 297,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.isSupportUpperBoundInclusive()",
      "begin_line": 302,
      "end_line": 305,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 21)"
      ]
    }
  ]
}