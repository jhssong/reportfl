{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/distribution/GammaDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GammaDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.AbstractRealDistribution"
      ],
      "begin_line": 33,
      "end_line": 437,
      "comment": "\n * Implementation of the Gamma distribution.\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Gamma_distribution\"\u003eGamma distribution (Wikipedia)\u003c/a\u003e\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/GammaDistribution.html\"\u003eGamma distribution (MathWorld)\u003c/a\u003e\n * @version $Id$\n "
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
        "shape"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " The shape parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "scale"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " The scale parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "shiftedShape"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * The constant value of {@code shape + g + 0.5}, where {@code g} is the\n     * Lanczos constant {@link Gamma#LANCZOS_G}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "densityPrefactor1"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     * The constant value of\n     * {@code shape / scale * sqrt(e / (2 * pi * (shape + g + 0.5))) / L(shape)},\n     * where {@code L(shape)} is the Lanczos approximation returned by\n     * {@link Gamma#lanczos(double)}. This prefactor is used in\n     * {@link #density(double)}, when no overflow occurs with the natural\n     * calculation.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "densityPrefactor2"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n     * The constant value of\n     * {@code shape * sqrt(e / (2 * pi * (shape + g + 0.5))) / L(shape)},\n     * where {@code L(shape)} is the Lanczos approximation returned by\n     * {@link Gamma#lanczos(double)}. This prefactor is used in\n     * {@link #density(double)}, when overflow occurs with the natural\n     * calculation.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "minY"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": "\n     * Lower bound on {@code y \u003d x / scale} for the selection of the computation\n     * method in {@link #density(double)}. For {@code y \u003c\u003d minY}, the natural\n     * calculation overflows.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maxLogY"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": "\n     * Upper bound on {@code log(y)} ({@code y \u003d x / scale}) for the selection\n     * of the computation method in {@link #density(double)}. For\n     * {@code log(y) \u003e\u003d maxLogY}, the natural calculation overflows.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Inverse cumulative probability accuracy. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.GammaDistribution.GammaDistribution(double, double)",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n     * Creates a new gamma distribution with specified values of the shape and\n     * scale parameters.\n     *\n     * @param shape the shape parameter\n     * @param scale the scale parameter\n     * @throws NotStrictlyPositiveException if {@code shape \u003c\u003d 0} or\n     * {@code scale \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 62)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.GammaDistribution.GammaDistribution(double, double, double)",
      "begin_line": 109,
      "end_line": 112,
      "comment": "\n     * Creates a new gamma distribution with specified values of the shape and\n     * scale parameters.\n     *\n     * @param shape the shape parameter\n     * @param scale the scale parameter\n     * @param inverseCumAccuracy the maximum absolute error in inverse\n     * cumulative probability estimates (defaults to\n     * {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY}).\n     * @throws NotStrictlyPositiveException if {@code shape \u003c\u003d 0} or\n     * {@code scale \u003c\u003d 0}.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 65)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.GammaDistribution.GammaDistribution(org.apache.commons.math3.random.RandomGenerator, double, double, double)",
      "begin_line": 127,
      "end_line": 152,
      "comment": "\n     * Creates a Gamma distribution.\n     *\n     * @param rng Random number generator.\n     * @param shape the shape parameter\n     * @param scale the scale parameter\n     * @param inverseCumAccuracy the maximum absolute error in inverse\n     * cumulative probability estimates (defaults to\n     * {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY}).\n     * @throws NotStrictlyPositiveException if {@code shape \u003c\u003d 0} or\n     * {@code scale \u003c\u003d 0}.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 19)",
        "(line 134,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 139,col 9)",
        "(line 141,col 9)-(line 141,col 27)",
        "(line 142,col 9)-(line 142,col 27)",
        "(line 143,col 9)-(line 143,col 57)",
        "(line 144,col 9)-(line 144,col 58)",
        "(line 145,col 9)-(line 145,col 75)",
        "(line 146,col 9)-(line 146,col 83)",
        "(line 147,col 9)-(line 149,col 54)",
        "(line 150,col 9)-(line 150,col 77)",
        "(line 151,col 9)-(line 151,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.GammaDistribution.getAlpha()",
      "begin_line": 161,
      "end_line": 164,
      "comment": "\n     * Returns the shape parameter of {@code this} distribution.\n     *\n     * @return the shape parameter\n     * @deprecated as of version 3.1, {@link #getShape()} should be preferred.\n     * This method will be removed in version 4.0.\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.GammaDistribution.getShape()",
      "begin_line": 172,
      "end_line": 174,
      "comment": "\n     * Returns the shape parameter of {@code this} distribution.\n     *\n     * @return the shape parameter\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.GammaDistribution.getBeta()",
      "begin_line": 183,
      "end_line": 186,
      "comment": "\n     * Returns the scale parameter of {@code this} distribution.\n     *\n     * @return the scale parameter\n     * @deprecated as of version 3.1, {@link #getScale()} should be preferred.\n     * This method will be removed in version 4.0.\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.GammaDistribution.getScale()",
      "begin_line": 194,
      "end_line": 196,
      "comment": "\n     * Returns the scale parameter of {@code this} distribution.\n     *\n     * @return the scale parameter\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.GammaDistribution.density(double)",
      "begin_line": 199,
      "end_line": 257,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 238,col 9)-(line 240,col 9)",
        "(line 241,col 9)-(line 241,col 35)",
        "(line 242,col 9)-(line 251,col 9)",
        "(line 255,col 9)-(line 256,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.GammaDistribution.cumulativeProbability(double)",
      "begin_line": 273,
      "end_line": 283,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     *  \u003cli\u003e\n     *   \u003ca href\u003d\"http://mathworld.wolfram.com/Chi-SquaredDistribution.html\"\u003e\n     *    Chi-Squared Distribution\u003c/a\u003e, equation (9).\n     *  \u003c/li\u003e\n     *  \u003cli\u003eCasella, G., \u0026 Berger, R. (1990). \u003ci\u003eStatistical Inference\u003c/i\u003e.\n     *    Belmont, CA: Duxbury Press.\n     *  \u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 19)",
        "(line 276,col 9)-(line 280,col 9)",
        "(line 282,col 9)-(line 282,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.GammaDistribution.getSolverAbsoluteAccuracy()",
      "begin_line": 286,
      "end_line": 289,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.GammaDistribution.getNumericalMean()",
      "begin_line": 297,
      "end_line": 299,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For shape parameter {@code alpha} and scale parameter {@code beta}, the\n     * mean is {@code alpha * beta}.\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.GammaDistribution.getNumericalVariance()",
      "begin_line": 309,
      "end_line": 311,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For shape parameter {@code alpha} and scale parameter {@code beta}, the\n     * variance is {@code alpha * beta^2}.\n     *\n     * @return {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.GammaDistribution.getSupportLowerBound()",
      "begin_line": 320,
      "end_line": 322,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always 0 no matter the parameters.\n     *\n     * @return lower bound of the support (always 0)\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.GammaDistribution.getSupportUpperBound()",
      "begin_line": 332,
      "end_line": 334,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is always positive infinity\n     * no matter the parameters.\n     *\n     * @return upper bound of the support (always Double.POSITIVE_INFINITY)\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.GammaDistribution.isSupportLowerBoundInclusive()",
      "begin_line": 337,
      "end_line": 339,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.GammaDistribution.isSupportUpperBoundInclusive()",
      "begin_line": 342,
      "end_line": 344,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.GammaDistribution.isSupportConnected()",
      "begin_line": 353,
      "end_line": 355,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The support of this distribution is connected.\n     *\n     * @return {@code true}\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.GammaDistribution.sample()",
      "begin_line": 372,
      "end_line": 436,
      "comment": "\n     * \u003cp\u003eThis implementation uses the following algorithms: \u003c/p\u003e\n     *\n     * \u003cp\u003eFor 0 \u003c shape \u003c 1: \u003cbr/\u003e\n     * Ahrens, J. H. and Dieter, U., \u003ci\u003eComputer methods for\n     * sampling from gamma, beta, Poisson and binomial distributions.\u003c/i\u003e\n     * Computing, 12, 223-246, 1974.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor shape \u003e\u003d 1: \u003cbr/\u003e\n     * Marsaglia and Tsang, \u003ci\u003eA Simple Method for Generating\n     * Gamma Variables.\u003c/i\u003e ACM Transactions on Mathematical Software,\n     * Volume 26 Issue 3, September, 2000.\u003c/p\u003e\n     *\n     * @return random value sampled from the Gamma(shape, scale) distribution\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 409,col 9)",
        "(line 413,col 9)-(line 413,col 54)",
        "(line 414,col 9)-(line 414,col 52)",
        "(line 416,col 9)-(line 435,col 9)"
      ]
    }
  ]
}