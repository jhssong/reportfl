{
  "filepath": "/tmp/Math-59b/src/main/java/org/apache/commons/math/distribution/GammaDistributionImpl.java",
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
      "begin_line": 32,
      "end_line": 310,
      "comment": "\n * The default implementation of {@link GammaDistribution}.\n *\n * @version $Revision$ $Date$\n "
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
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "alpha"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " The shape parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "beta"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " The scale parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Inverse cumulative probability accuracy. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.GammaDistributionImpl(double, double)",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * Create a new gamma distribution with the given alpha and beta values.\n     * @param alpha the shape parameter.\n     * @param beta the scale parameter.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 61)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.GammaDistributionImpl(double, double, double)",
      "begin_line": 69,
      "end_line": 80,
      "comment": "\n     * Create a new gamma distribution with the given alpha and beta values.\n     *\n     * @param alpha Shape parameter.\n     * @param beta Scale parameter.\n     * @param inverseCumAccuracy Maximum absolute error in inverse\n     * cumulative probability estimates (defaults to\n     * {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY}).\n     * @throws NotStrictlyPositiveException if {@code alpha \u003c\u003d 0} or\n     * {@code beta \u003c\u003d 0}.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 72,col 9)",
        "(line 73,col 9)-(line 75,col 9)",
        "(line 77,col 9)-(line 77,col 27)",
        "(line 78,col 9)-(line 78,col 25)",
        "(line 79,col 9)-(line 79,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.cumulativeProbability(double)",
      "begin_line": 101,
      "end_line": 111,
      "comment": "\n     * For this distribution, {@code X}, this method returns {@code P(X \u003c x)}.\n     *\n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     *  \u003cli\u003e\n     *   \u003ca href\u003d\"http://mathworld.wolfram.com/Chi-SquaredDistribution.html\"\u003e\n     *    Chi-Squared Distribution\u003c/a\u003e, equation (9).\n     *  \u003c/li\u003e\n     *  \u003cli\u003eCasella, G., \u0026 Berger, R. (1990). \u003ci\u003eStatistical Inference\u003c/i\u003e.\n     *    Belmont, CA: Duxbury Press.\n     *  \u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param x Value at which the CDF is evaluated.\n     * @return CDF for this distribution.\n     * @throws MathException if the cumulative probability can not be\n     * computed due to convergence or other numerical errors.\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 19)",
        "(line 104,col 9)-(line 108,col 9)",
        "(line 110,col 9)-(line 110,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.inverseCumulativeProbability(double)",
      "begin_line": 126,
      "end_line": 136,
      "comment": "\n     * For this distribution, {@code X}, this method returns the critical\n     * point {@code x}, such that {@code P(X \u003c x) \u003d p}.\n     * It will return 0 when p \u003d 0 and {@code Double.POSITIVE_INFINITY}\n     * when p \u003d 1.\n     *\n     * @param p Desired probability.\n     * @return {@code x}, such that {@code P(X \u003c x) \u003d p}.\n     * @throws MathException if the inverse cumulative probability cannot be\n     * computed due to convergence or other numerical errors.\n     * @throws org.apache.commons.math.exception.OutOfRangeException if\n     * {@code p} is not a valid probability.\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 131,col 9)",
        "(line 132,col 9)-(line 134,col 9)",
        "(line 135,col 9)-(line 135,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.getAlpha()",
      "begin_line": 141,
      "end_line": 143,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.getBeta()",
      "begin_line": 148,
      "end_line": 150,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.density(double)",
      "begin_line": 155,
      "end_line": 160,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 28)",
        "(line 158,col 9)-(line 159,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 170,
      "end_line": 174,
      "comment": "\n     * Access the domain value lower bound, based on {@code p}, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the domain value lower bound, i.e. {@code P(X \u003c \u0027lower bound\u0027) \u003c p}.\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 184,
      "end_line": 201,
      "comment": "\n     * Access the domain value upper bound, based on {@code p}, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the domain value upper bound, i.e. {@code P(X \u003c \u0027upper bound\u0027) \u003e p}.\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 19)",
        "(line 192,col 9)-(line 198,col 9)",
        "(line 200,col 9)-(line 200,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.getInitialDomain(double)",
      "begin_line": 211,
      "end_line": 227,
      "comment": "\n     * Access the initial domain value, based on {@code p}, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the initial domain value.\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 19)",
        "(line 218,col 9)-(line 224,col 9)",
        "(line 226,col 9)-(line 226,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.getSolverAbsoluteAccuracy()",
      "begin_line": 236,
      "end_line": 239,
      "comment": "\n     * Return the absolute accuracy setting of the solver used to estimate\n     * inverse cumulative probabilities.\n     *\n     * @return the solver absolute accuracy.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.getSupportLowerBound()",
      "begin_line": 248,
      "end_line": 251,
      "comment": "\n     * {@inheritDoc}\n     * \n     * The lower bound of the support is always 0 no matter the parameters.\n     *\n     * @return lower bound of the support (always 0)\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.getSupportUpperBound()",
      "begin_line": 261,
      "end_line": 264,
      "comment": "\n     * {@inheritDoc}\n     * \n     * The upper bound of the support is always positive infinity \n     * no matter the parameters.\n     *\n     * @return upper bound of the support (always Double.POSITIVE_INFINITY)\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.calculateNumericalMean()",
      "begin_line": 275,
      "end_line": 278,
      "comment": "\n     * {@inheritDoc}\n     * \n     * For shape parameter \u003ccode\u003ealpha\u003c/code\u003e and scale \n     * parameter \u003ccode\u003ebeta\u003c/code\u003e, the mean is\n     * \u003ccode\u003ealpha * beta\u003c/code\u003e\n     *\n     * @return {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.calculateNumericalVariance()",
      "begin_line": 289,
      "end_line": 293,
      "comment": "\n     * {@inheritDoc}\n     * \n     * For shape parameter \u003ccode\u003ealpha\u003c/code\u003e and scale \n     * parameter \u003ccode\u003ebeta\u003c/code\u003e, the variance is\n     * \u003ccode\u003ealpha * beta^2\u003c/code\u003e\n     *\n     * @return {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 35)",
        "(line 292,col 9)-(line 292,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.isSupportLowerBoundInclusive()",
      "begin_line": 298,
      "end_line": 301,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.isSupportUpperBoundInclusive()",
      "begin_line": 306,
      "end_line": 309,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 21)"
      ]
    }
  ]
}