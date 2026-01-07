{
  "filepath": "/tmp/Math-37b/src/main/java/org/apache/commons/math/distribution/GammaDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GammaDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractRealDistribution"
      ],
      "begin_line": 31,
      "end_line": 219,
      "comment": "\n * Implementation of the Gamma distribution.\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Gamma_distribution\"\u003eGamma distribution (Wikipedia)\u003c/a\u003e\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/GammaDistribution.html\"\u003eGamma distribution (MathWorld)\u003c/a\u003e\n * @version $Id$\n "
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
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "alpha"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " The shape parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "beta"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " The scale parameter. "
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
      "signature": "org.apache.commons.math.distribution.GammaDistribution.GammaDistribution(double, double)",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * Create a new gamma distribution with the given {@code alpha} and\n     * {@code beta} values.\n     * @param alpha the shape parameter.\n     * @param beta the scale parameter.\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 61)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.GammaDistribution.GammaDistribution(double, double, double)",
      "begin_line": 69,
      "end_line": 81,
      "comment": "\n     * Create a new gamma distribution with the given {@code alpha} and\n     * {@code beta} values.\n     *\n     * @param alpha Shape parameter.\n     * @param beta Scale parameter.\n     * @param inverseCumAccuracy Maximum absolute error in inverse\n     * cumulative probability estimates (defaults to\n     * {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY}).\n     * @throws NotStrictlyPositiveException if {@code alpha \u003c\u003d 0} or\n     * {@code beta \u003c\u003d 0}.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 73,col 9)",
        "(line 74,col 9)-(line 76,col 9)",
        "(line 78,col 9)-(line 78,col 27)",
        "(line 79,col 9)-(line 79,col 25)",
        "(line 80,col 9)-(line 80,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistribution.getAlpha()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * Access the {@code alpha} shape parameter.\n     *\n     * @return {@code alpha}.\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistribution.getBeta()",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * Access the {@code beta} scale parameter.\n     *\n     * @return {@code beta}.\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistribution.probability(double)",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For this distribution {@code P(X \u003d x)} always evaluates to 0.\n     *\n     * @return 0\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistribution.density(double)",
      "begin_line": 113,
      "end_line": 119,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 114,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 118,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistribution.cumulativeProbability(double)",
      "begin_line": 135,
      "end_line": 145,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     *  \u003cli\u003e\n     *   \u003ca href\u003d\"http://mathworld.wolfram.com/Chi-SquaredDistribution.html\"\u003e\n     *    Chi-Squared Distribution\u003c/a\u003e, equation (9).\n     *  \u003c/li\u003e\n     *  \u003cli\u003eCasella, G., \u0026 Berger, R. (1990). \u003ci\u003eStatistical Inference\u003c/i\u003e.\n     *    Belmont, CA: Duxbury Press.\n     *  \u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 19)",
        "(line 138,col 9)-(line 142,col 9)",
        "(line 144,col 9)-(line 144,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistribution.getSolverAbsoluteAccuracy()",
      "begin_line": 148,
      "end_line": 151,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistribution.getNumericalMean()",
      "begin_line": 159,
      "end_line": 161,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For shape parameter {@code alpha} and scale parameter {@code beta}, the\n     * mean is {@code alpha * beta}.\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistribution.getNumericalVariance()",
      "begin_line": 171,
      "end_line": 174,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For shape parameter {@code alpha} and scale parameter {@code beta}, the\n     * variance is {@code alpha * beta^2}.\n     *\n     * @return {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 35)",
        "(line 173,col 9)-(line 173,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistribution.getSupportLowerBound()",
      "begin_line": 183,
      "end_line": 185,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always 0 no matter the parameters.\n     *\n     * @return lower bound of the support (always 0)\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistribution.getSupportUpperBound()",
      "begin_line": 195,
      "end_line": 197,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is always positive infinity\n     * no matter the parameters.\n     *\n     * @return upper bound of the support (always Double.POSITIVE_INFINITY)\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistribution.isSupportLowerBoundInclusive()",
      "begin_line": 200,
      "end_line": 202,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistribution.isSupportUpperBoundInclusive()",
      "begin_line": 205,
      "end_line": 207,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistribution.isSupportConnected()",
      "begin_line": 216,
      "end_line": 218,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The support of this distribution is connected.\n     *\n     * @return {@code true}\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 20)"
      ]
    }
  ]
}