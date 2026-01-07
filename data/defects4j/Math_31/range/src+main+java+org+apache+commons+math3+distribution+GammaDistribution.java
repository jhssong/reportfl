{
  "filepath": "/tmp/Math-31b/src/main/java/org/apache/commons/math3/distribution/GammaDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GammaDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.AbstractRealDistribution"
      ],
      "begin_line": 31,
      "end_line": 326,
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
      "begin_line": 39,
      "end_line": 39,
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
      "begin_line": 45,
      "end_line": 45,
      "comment": " The scale parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "shiftedShape"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * The constant value of {@code alpha + g + 0.5}, where {@code alpha} is\n     * the shape parameter, and {@code g} is the Lanczos constant\n     * {@link Gamma#LANCZOS_G}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "densityPrefactor1"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": "\n     * The constant value of\n     * {@code alpha / beta * sqrt(e / (2 * pi * (alpha + g + 0.5))) / L(alpha)},\n     * where {@code alpha} is the shape parameter, {@code beta} is the scale\n     * parameter, and {@code L(alpha)} is the Lanczos approximation returned by\n     * {@link Gamma#lanczos(double)}. This prefactor is used in\n     * {@link #density(double)}, when no overflow occurs with the natural\n     * calculation.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "densityPrefactor2"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": "\n     * The constant value of\n     * {@code alpha * sqrt(e / (2 * pi * (alpha + g + 0.5))) / L(alpha)},\n     * where {@code alpha} is the shape parameter, and {@code L(alpha)} is the\n     * Lanczos approximation returned by {@link Gamma#lanczos(double)}. This\n     * prefactor is used in {@link #density(double)}, when overflow occurs with\n     * the natural calculation.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "minY"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": "\n     * Lower bound on {@code y \u003d x / beta} for the selection of the computation\n     * method in {@link #density(double)}. For {@code y \u003c\u003d minY}, the natural\n     * calculation overflows. {@code beta} is the shape parameter.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maxLogY"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": "\n     * Upper bound on {@code log(y)} ({@code y \u003d x / beta}) for the selection of\n     * the computation method in {@link #density(double)}. For\n     * {@code log(y) \u003e\u003d maxLogY}, the natural calculation overflows.\n     * {@code beta} is the shape parameter.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " Inverse cumulative probability accuracy. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.GammaDistribution.GammaDistribution(double, double)",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * Create a new gamma distribution with the given {@code alpha} and\n     * {@code beta} values.\n     * @param alpha the shape parameter.\n     * @param beta the scale parameter.\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 61)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.GammaDistribution.GammaDistribution(double, double, double)",
      "begin_line": 116,
      "end_line": 136,
      "comment": "\n     * Create a new gamma distribution with the given {@code alpha} and\n     * {@code beta} values.\n     *\n     * @param alpha Shape parameter.\n     * @param beta Scale parameter.\n     * @param inverseCumAccuracy Maximum absolute error in inverse\n     * cumulative probability estimates (defaults to\n     * {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY}).\n     * @throws NotStrictlyPositiveException if {@code alpha \u003c\u003d 0} or\n     * {@code beta \u003c\u003d 0}.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 120,col 9)",
        "(line 121,col 9)-(line 123,col 9)",
        "(line 125,col 9)-(line 125,col 27)",
        "(line 126,col 9)-(line 126,col 25)",
        "(line 127,col 9)-(line 127,col 57)",
        "(line 128,col 9)-(line 128,col 58)",
        "(line 129,col 9)-(line 129,col 75)",
        "(line 130,col 9)-(line 130,col 83)",
        "(line 131,col 9)-(line 133,col 54)",
        "(line 134,col 9)-(line 134,col 77)",
        "(line 135,col 9)-(line 135,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.GammaDistribution.getAlpha()",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\n     * Access the {@code alpha} shape parameter.\n     *\n     * @return {@code alpha}.\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.GammaDistribution.getBeta()",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\n     * Access the {@code beta} scale parameter.\n     *\n     * @return {@code beta}.\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.GammaDistribution.probability(double)",
      "begin_line": 163,
      "end_line": 165,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For this distribution {@code P(X \u003d x)} always evaluates to 0.\n     *\n     * @return 0\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.GammaDistribution.density(double)",
      "begin_line": 168,
      "end_line": 226,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 207,col 9)-(line 209,col 9)",
        "(line 210,col 9)-(line 210,col 34)",
        "(line 211,col 9)-(line 220,col 9)",
        "(line 224,col 9)-(line 225,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.GammaDistribution.cumulativeProbability(double)",
      "begin_line": 242,
      "end_line": 252,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     *  \u003cli\u003e\n     *   \u003ca href\u003d\"http://mathworld.wolfram.com/Chi-SquaredDistribution.html\"\u003e\n     *    Chi-Squared Distribution\u003c/a\u003e, equation (9).\n     *  \u003c/li\u003e\n     *  \u003cli\u003eCasella, G., \u0026 Berger, R. (1990). \u003ci\u003eStatistical Inference\u003c/i\u003e.\n     *    Belmont, CA: Duxbury Press.\n     *  \u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 19)",
        "(line 245,col 9)-(line 249,col 9)",
        "(line 251,col 9)-(line 251,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.GammaDistribution.getSolverAbsoluteAccuracy()",
      "begin_line": 255,
      "end_line": 258,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.GammaDistribution.getNumericalMean()",
      "begin_line": 266,
      "end_line": 268,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For shape parameter {@code alpha} and scale parameter {@code beta}, the\n     * mean is {@code alpha * beta}.\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.GammaDistribution.getNumericalVariance()",
      "begin_line": 278,
      "end_line": 281,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For shape parameter {@code alpha} and scale parameter {@code beta}, the\n     * variance is {@code alpha * beta^2}.\n     *\n     * @return {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 35)",
        "(line 280,col 9)-(line 280,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.GammaDistribution.getSupportLowerBound()",
      "begin_line": 290,
      "end_line": 292,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always 0 no matter the parameters.\n     *\n     * @return lower bound of the support (always 0)\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.GammaDistribution.getSupportUpperBound()",
      "begin_line": 302,
      "end_line": 304,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is always positive infinity\n     * no matter the parameters.\n     *\n     * @return upper bound of the support (always Double.POSITIVE_INFINITY)\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.GammaDistribution.isSupportLowerBoundInclusive()",
      "begin_line": 307,
      "end_line": 309,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.GammaDistribution.isSupportUpperBoundInclusive()",
      "begin_line": 312,
      "end_line": 314,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.GammaDistribution.isSupportConnected()",
      "begin_line": 323,
      "end_line": 325,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The support of this distribution is connected.\n     *\n     * @return {@code true}\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 20)"
      ]
    }
  ]
}