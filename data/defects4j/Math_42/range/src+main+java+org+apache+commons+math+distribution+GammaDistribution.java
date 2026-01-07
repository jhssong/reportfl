{
  "filepath": "/tmp/Math-42b/src/main/java/org/apache/commons/math/distribution/GammaDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GammaDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractContinuousDistribution",
        "java.io.Serializable"
      ],
      "begin_line": 33,
      "end_line": 269,
      "comment": "\n * Implementation of the Gamma distribution.\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Gamma_distribution\"\u003eGamma distribution (Wikipedia)\u003c/a\u003e\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/GammaDistribution.html\"\u003eGamma distribution (MathWorld)\u003c/a\u003e\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INVERSE_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": "\n     * Default inverse cumulative probability accuracy.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "alpha"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " The shape parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "beta"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " The scale parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Inverse cumulative probability accuracy. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.GammaDistribution.GammaDistribution(double, double)",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n     * Create a new gamma distribution with the given {@code alpha} and\n     * {@code beta} values.\n     * @param alpha the shape parameter.\n     * @param beta the scale parameter.\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 61)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.GammaDistribution.GammaDistribution(double, double, double)",
      "begin_line": 72,
      "end_line": 84,
      "comment": "\n     * Create a new gamma distribution with the given {@code alpha} and\n     * {@code beta} values.\n     *\n     * @param alpha Shape parameter.\n     * @param beta Scale parameter.\n     * @param inverseCumAccuracy Maximum absolute error in inverse\n     * cumulative probability estimates (defaults to\n     * {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY}).\n     * @throws NotStrictlyPositiveException if {@code alpha \u003c\u003d 0} or\n     * {@code beta \u003c\u003d 0}.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 76,col 9)",
        "(line 77,col 9)-(line 79,col 9)",
        "(line 81,col 9)-(line 81,col 27)",
        "(line 82,col 9)-(line 82,col 25)",
        "(line 83,col 9)-(line 83,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistribution.cumulativeProbability(double)",
      "begin_line": 100,
      "end_line": 110,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     *  \u003cli\u003e\n     *   \u003ca href\u003d\"http://mathworld.wolfram.com/Chi-SquaredDistribution.html\"\u003e\n     *    Chi-Squared Distribution\u003c/a\u003e, equation (9).\n     *  \u003c/li\u003e\n     *  \u003cli\u003eCasella, G., \u0026 Berger, R. (1990). \u003ci\u003eStatistical Inference\u003c/i\u003e.\n     *    Belmont, CA: Duxbury Press.\n     *  \u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 19)",
        "(line 103,col 9)-(line 107,col 9)",
        "(line 109,col 9)-(line 109,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistribution.inverseCumulativeProbability(double)",
      "begin_line": 118,
      "end_line": 127,
      "comment": "\n     * {@inheritDoc}\n     *\n     * Returns {@code 0} when {@code p \u003d\u003d 0} and\n     * {@code Double.POSITIVE_INFINITY} when {@code p \u003d\u003d 1}.\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 122,col 9)",
        "(line 123,col 9)-(line 125,col 9)",
        "(line 126,col 9)-(line 126,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistribution.getAlpha()",
      "begin_line": 134,
      "end_line": 136,
      "comment": "\n     * Access the {@code alpha} shape parameter.\n     *\n     * @return {@code alpha}.\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistribution.getBeta()",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\n     * Access the {@code beta} scale parameter.\n     *\n     * @return {@code beta}.\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistribution.density(double)",
      "begin_line": 148,
      "end_line": 154,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 149,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 153,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistribution.getDomainLowerBound(double)",
      "begin_line": 157,
      "end_line": 161,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistribution.getDomainUpperBound(double)",
      "begin_line": 164,
      "end_line": 181,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 19)",
        "(line 172,col 9)-(line 178,col 9)",
        "(line 180,col 9)-(line 180,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistribution.getInitialDomain(double)",
      "begin_line": 184,
      "end_line": 200,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 19)",
        "(line 191,col 9)-(line 197,col 9)",
        "(line 199,col 9)-(line 199,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistribution.getSolverAbsoluteAccuracy()",
      "begin_line": 203,
      "end_line": 206,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistribution.getSupportLowerBound()",
      "begin_line": 215,
      "end_line": 218,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always 0 no matter the parameters.\n     *\n     * @return lower bound of the support (always 0)\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistribution.getSupportUpperBound()",
      "begin_line": 228,
      "end_line": 231,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is always positive infinity\n     * no matter the parameters.\n     *\n     * @return upper bound of the support (always Double.POSITIVE_INFINITY)\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistribution.calculateNumericalMean()",
      "begin_line": 239,
      "end_line": 242,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For shape parameter {@code alpha} and scale parameter {@code beta}, the\n     * mean is {@code alpha * beta}.\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistribution.calculateNumericalVariance()",
      "begin_line": 252,
      "end_line": 256,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For shape parameter {@code alpha} and scale parameter {@code beta}, the\n     * variance is {@code alpha * beta^2}.\n     *\n     * @return {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 35)",
        "(line 255,col 9)-(line 255,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistribution.isSupportLowerBoundInclusive()",
      "begin_line": 259,
      "end_line": 262,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistribution.isSupportUpperBoundInclusive()",
      "begin_line": 265,
      "end_line": 268,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 21)"
      ]
    }
  ]
}