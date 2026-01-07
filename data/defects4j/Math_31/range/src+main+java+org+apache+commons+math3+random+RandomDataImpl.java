{
  "filepath": "/tmp/Math-31b/src/main/java/org/apache/commons/math3/random/RandomDataImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RandomDataImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.random.RandomData",
        "java.io.Serializable"
      ],
      "begin_line": 105,
      "end_line": 1052,
      "comment": "\n * Implements the {@link RandomData} interface using a {@link RandomGenerator}\n * instance to generate non-secure data and a {@link java.security.SecureRandom}\n * instance to provide data for the \u003ccode\u003enextSecureXxx\u003c/code\u003e methods. If no\n * \u003ccode\u003eRandomGenerator\u003c/code\u003e is provided in the constructor, the default is\n * to use a {@link Well19937c} generator. To plug in a different\n * implementation, either implement \u003ccode\u003eRandomGenerator\u003c/code\u003e directly or\n * extend {@link AbstractRandomGenerator}.\n * \u003cp\u003e\n * Supports reseeding the underlying pseudo-random number generator (PRNG). The\n * \u003ccode\u003eSecurityProvider\u003c/code\u003e and \u003ccode\u003eAlgorithm\u003c/code\u003e used by the\n * \u003ccode\u003eSecureRandom\u003c/code\u003e instance can also be reset.\n * \u003c/p\u003e\n * \u003cp\u003e\n * For details on the default PRNGs, see {@link java.util.Random} and\n * {@link java.security.SecureRandom}.\n * \u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eUsage Notes\u003c/strong\u003e:\n * \u003cul\u003e\n * \u003cli\u003e\n * Instance variables are used to maintain \u003ccode\u003eRandomGenerator\u003c/code\u003e and\n * \u003ccode\u003eSecureRandom\u003c/code\u003e instances used in data generation. Therefore, to\n * generate a random sequence of values or strings, you should use just\n * \u003cstrong\u003eone\u003c/strong\u003e \u003ccode\u003eRandomDataImpl\u003c/code\u003e instance repeatedly.\u003c/li\u003e\n * \u003cli\u003e\n * The \"secure\" methods are *much* slower. These should be used only when a\n * cryptographically secure random sequence is required. A secure random\n * sequence is a sequence of pseudo-random values which, in addition to being\n * well-dispersed (so no subsequence of values is an any more likely than other\n * subsequence of the the same length), also has the additional property that\n * knowledge of values generated up to any point in the sequence does not make\n * it any easier to predict subsequent values.\u003c/li\u003e\n * \u003cli\u003e\n * When a new \u003ccode\u003eRandomDataImpl\u003c/code\u003e is created, the underlying random\n * number generators are \u003cstrong\u003enot\u003c/strong\u003e initialized. If you do not\n * explicitly seed the default non-secure generator, it is seeded with the\n * current time in milliseconds plus the system identity hash code on first use.\n * The same holds for the secure generator. If you provide a \u003ccode\u003eRandomGenerator\u003c/code\u003e\n * to the constructor, however, this generator is not reseeded by the constructor\n * nor is it reseeded on first use.\u003c/li\u003e\n * \u003cli\u003e\n * The \u003ccode\u003ereSeed\u003c/code\u003e and \u003ccode\u003ereSeedSecure\u003c/code\u003e methods delegate to the\n * corresponding methods on the underlying \u003ccode\u003eRandomGenerator\u003c/code\u003e and\n * \u003ccode\u003eSecureRandom\u003c/code\u003e instances. Therefore, \u003ccode\u003ereSeed(long)\u003c/code\u003e\n * fully resets the initial state of the non-secure random number generator (so\n * that reseeding with a specific value always results in the same subsequent\n * random sequence); whereas reSeedSecure(long) does \u003cstrong\u003enot\u003c/strong\u003e\n * reinitialize the secure random number generator (so secure sequences started\n * with calls to reseedSecure(long) won\u0027t be identical).\u003c/li\u003e\n * \u003cli\u003e\n * This implementation is not synchronized.\n * \u003c/ul\u003e\n * \u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "EXPONENTIAL_SA_QI"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": "\n     * Used when generating Exponential samples.\n     * Table containing the constants\n     * q_i \u003d sum_{j\u003d1}^i (ln 2)^j/j! \u003d ln 2 + (ln 2)^2/2 + ... + (ln 2)^i/i!\n     * until the largest representable fraction below 1 is exceeded.\n     *\n     * Note that\n     * 1 \u003d 2 - 1 \u003d exp(ln 2) - 1 \u003d sum_{n\u003d1}^infty (ln 2)^n / n!\n     * thus q_i -\u003e 1 as i -\u003e infty,\n     * so the higher i, the closer to one we get (the series is not alternating).\n     *\n     * By trying, n \u003d 16 in Java is enough to reach 1.0.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rand"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": " underlying random number generator "
    },
    {
      "type": "field",
      "varNames": [
        "secRand"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": " underlying secure random number generator "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.RandomDataImpl()",
      "begin_line": 168,
      "end_line": 169,
      "comment": "\n     * Construct a RandomDataImpl, using a default random generator as the source\n     * of randomness.\n     *\n     * \u003cp\u003eThe default generator is a {@link Well19937c} seeded\n     * with {@code System.currentTimeMillis() + System.identityHashCode(this))}.\n     * The generator is initialized and seeded on first use.\u003c/p\u003e\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.RandomDataImpl(org.apache.commons.math3.random.RandomGenerator)",
      "begin_line": 179,
      "end_line": 182,
      "comment": "\n     * Construct a RandomDataImpl using the supplied {@link RandomGenerator} as\n     * the source of (non-secure) random data.\n     *\n     * @param rand the source of (non-secure) random data\n     * (may be null, resulting in the default generator)\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 16)",
        "(line 181,col 9)-(line 181,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.nextHexString(int)",
      "begin_line": 200,
      "end_line": 233,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\n     * \u003cstrong\u003eAlgorithm Description:\u003c/strong\u003e hex strings are generated using a\n     * 2-step process.\n     * \u003col\u003e\n     * \u003cli\u003e{@code len / 2 + 1} binary bytes are generated using the underlying\n     * Random\u003c/li\u003e\n     * \u003cli\u003eEach binary byte is translated into 2 hex digits\u003c/li\u003e\n     * \u003c/ol\u003e\n     * \u003c/p\u003e\n     *\n     * @param len the desired string length.\n     * @return the random string.\n     * @throws NotStrictlyPositiveException if {@code len \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 203,col 9)",
        "(line 206,col 9)-(line 206,col 39)",
        "(line 209,col 9)-(line 209,col 54)",
        "(line 212,col 9)-(line 212,col 53)",
        "(line 213,col 9)-(line 213,col 35)",
        "(line 216,col 9)-(line 231,col 9)",
        "(line 232,col 9)-(line 232,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.nextInt(int, int)",
      "begin_line": 236,
      "end_line": 244,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 237,col 9)-(line 240,col 9)",
        "(line 241,col 9)-(line 241,col 41)",
        "(line 242,col 9)-(line 242,col 58)",
        "(line 243,col 9)-(line 243,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.nextLong(long, long)",
      "begin_line": 247,
      "end_line": 255,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 248,col 9)-(line 251,col 9)",
        "(line 252,col 9)-(line 252,col 41)",
        "(line 253,col 9)-(line 253,col 58)",
        "(line 254,col 9)-(line 254,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.nextSecureHexString(int)",
      "begin_line": 273,
      "end_line": 320,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\n     * \u003cstrong\u003eAlgorithm Description:\u003c/strong\u003e hex strings are generated in\n     * 40-byte segments using a 3-step process.\n     * \u003col\u003e\n     * \u003cli\u003e\n     * 20 random bytes are generated using the underlying\n     * \u003ccode\u003eSecureRandom\u003c/code\u003e.\u003c/li\u003e\n     * \u003cli\u003e\n     * SHA-1 hash is applied to yield a 20-byte binary digest.\u003c/li\u003e\n     * \u003cli\u003e\n     * Each byte of the binary digest is converted to 2 hex digits.\u003c/li\u003e\n     * \u003c/ol\u003e\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 276,col 9)",
        "(line 279,col 9)-(line 279,col 42)",
        "(line 280,col 9)-(line 280,col 33)",
        "(line 281,col 9)-(line 286,col 9)",
        "(line 287,col 9)-(line 287,col 20)",
        "(line 290,col 9)-(line 290,col 37)",
        "(line 292,col 9)-(line 292,col 54)",
        "(line 293,col 9)-(line 318,col 9)",
        "(line 319,col 9)-(line 319,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.nextSecureInt(int, int)",
      "begin_line": 323,
      "end_line": 332,
      "comment": "  {@inheritDoc} ",
      "child_ranges": [
        "(line 324,col 9)-(line 327,col 9)",
        "(line 328,col 9)-(line 328,col 39)",
        "(line 329,col 9)-(line 329,col 36)",
        "(line 330,col 9)-(line 330,col 58)",
        "(line 331,col 9)-(line 331,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.nextSecureLong(long, long)",
      "begin_line": 335,
      "end_line": 345,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 337,col 9)-(line 340,col 9)",
        "(line 341,col 9)-(line 341,col 39)",
        "(line 342,col 9)-(line 342,col 36)",
        "(line 343,col 9)-(line 343,col 58)",
        "(line 344,col 9)-(line 344,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.nextPoisson(double)",
      "begin_line": 360,
      "end_line": 449,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\n     * \u003cstrong\u003eAlgorithm Description\u003c/strong\u003e:\n     * \u003cul\u003e\u003cli\u003e For small means, uses simulation of a Poisson process\n     * using Uniform deviates, as described\n     * \u003ca href\u003d\"http://irmi.epfl.ch/cmos/Pmmi/interactive/rng7.htm\"\u003e here.\u003c/a\u003e\n     * The Poisson process (and hence value returned) is bounded by 1000 * mean.\u003c/li\u003e\n     *\n     * \u003cli\u003e For large means, uses the rejection algorithm described in \u003cbr/\u003e\n     * Devroye, Luc. (1981).\u003ci\u003eThe Computer Generation of Poisson Random Variables\u003c/i\u003e\n     * \u003cstrong\u003eComputing\u003c/strong\u003e vol. 26 pp. 197-207.\u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 361,col 9)-(line 363,col 9)",
        "(line 365,col 9)-(line 365,col 35)",
        "(line 366,col 9)-(line 448,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.nextGaussian(double, double)",
      "begin_line": 452,
      "end_line": 458,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 454,col 9)-(line 456,col 9)",
        "(line 457,col 9)-(line 457,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.nextExponential(double)",
      "begin_line": 471,
      "end_line": 513,
      "comment": "\n     * {@inheritDoc}\n     *\n     * \u003cp\u003e\n     * \u003cstrong\u003eAlgorithm Description\u003c/strong\u003e: Uses the Algorithm SA (Ahrens)\n     * from p. 876 in:\n     * [1]: Ahrens, J. H. and Dieter, U. (1972). Computer methods for\n     * sampling from the exponential and normal distributions.\n     * Communications of the ACM, 15, 873-882.\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 473,col 9)-(line 475,col 9)",
        "(line 478,col 9)-(line 478,col 21)",
        "(line 479,col 9)-(line 479,col 42)",
        "(line 482,col 9)-(line 485,col 9)",
        "(line 488,col 9)-(line 488,col 19)",
        "(line 491,col 9)-(line 493,col 9)",
        "(line 496,col 9)-(line 496,col 18)",
        "(line 497,col 9)-(line 497,col 43)",
        "(line 498,col 9)-(line 498,col 25)",
        "(line 501,col 9)-(line 510,col 43)",
        "(line 512,col 9)-(line 512,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.nextUniform(double, double)",
      "begin_line": 528,
      "end_line": 531,
      "comment": "\n     * {@inheritDoc}\n     *\n     * \u003cp\u003e\n     * \u003cstrong\u003eAlgorithm Description\u003c/strong\u003e: scales the output of\n     * Random.nextDouble(), but rejects 0 values (i.e., will generate another\n     * random double if Random.nextDouble() returns 0). This is necessary to\n     * provide a symmetric output interval (both endpoints excluded).\n     * \u003c/p\u003e\n     *\n     * @throws MathIllegalArgumentException if one of the bounds is infinite or\n     * {@code NaN} or either bound is infinite or NaN\n     ",
      "child_ranges": [
        "(line 530,col 9)-(line 530,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.nextUniform(double, double, boolean)",
      "begin_line": 548,
      "end_line": 573,
      "comment": "\n     * {@inheritDoc}\n     *\n     * \u003cp\u003e\n     * \u003cstrong\u003eAlgorithm Description\u003c/strong\u003e: if the lower bound is excluded,\n     * scales the output of Random.nextDouble(), but rejects 0 values (i.e.,\n     * will generate another random double if Random.nextDouble() returns 0).\n     * This is necessary to provide a symmetric output interval (both\n     * endpoints excluded).\n     * \u003c/p\u003e\n     *\n     * @throws MathIllegalArgumentException if one of the bounds is infinite or\n     * {@code NaN}\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 551,col 9)-(line 554,col 9)",
        "(line 556,col 9)-(line 558,col 9)",
        "(line 560,col 9)-(line 562,col 9)",
        "(line 564,col 9)-(line 564,col 51)",
        "(line 567,col 9)-(line 567,col 42)",
        "(line 568,col 9)-(line 570,col 9)",
        "(line 572,col 9)-(line 572,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.nextBeta(double, double)",
      "begin_line": 585,
      "end_line": 587,
      "comment": "\n     * Generates a random value from the {@link BetaDistribution Beta Distribution}.\n     * This implementation uses {@link #nextInversionDeviate(RealDistribution) inversion}\n     * to generate random values.\n     *\n     * @param alpha first distribution shape parameter\n     * @param beta second distribution shape parameter\n     * @return random value sampled from the beta(alpha, beta) distribution\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 586,col 9)-(line 586,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.nextBinomial(int, double)",
      "begin_line": 599,
      "end_line": 601,
      "comment": "\n     * Generates a random value from the {@link BinomialDistribution Binomial Distribution}.\n     * This implementation uses {@link #nextInversionDeviate(RealDistribution) inversion}\n     * to generate random values.\n     *\n     * @param numberOfTrials number of trials of the Binomial distribution\n     * @param probabilityOfSuccess probability of success of the Binomial distribution\n     * @return random value sampled from the Binomial(numberOfTrials, probabilityOfSuccess) distribution\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 600,col 9)-(line 600,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.nextCauchy(double, double)",
      "begin_line": 613,
      "end_line": 615,
      "comment": "\n     * Generates a random value from the {@link CauchyDistribution Cauchy Distribution}.\n     * This implementation uses {@link #nextInversionDeviate(RealDistribution) inversion}\n     * to generate random values.\n     *\n     * @param median the median of the Cauchy distribution\n     * @param scale the scale parameter of the Cauchy distribution\n     * @return random value sampled from the Cauchy(median, scale) distribution\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 614,col 9)-(line 614,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.nextChiSquare(double)",
      "begin_line": 626,
      "end_line": 628,
      "comment": "\n     * Generates a random value from the {@link ChiSquaredDistribution ChiSquare Distribution}.\n     * This implementation uses {@link #nextInversionDeviate(RealDistribution) inversion}\n     * to generate random values.\n     *\n     * @param df the degrees of freedom of the ChiSquare distribution\n     * @return random value sampled from the ChiSquare(df) distribution\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 627,col 9)-(line 627,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.nextF(double, double)",
      "begin_line": 640,
      "end_line": 642,
      "comment": "\n     * Generates a random value from the {@link FDistribution F Distribution}.\n     * This implementation uses {@link #nextInversionDeviate(RealDistribution) inversion}\n     * to generate random values.\n     *\n     * @param numeratorDf the numerator degrees of freedom of the F distribution\n     * @param denominatorDf the denominator degrees of freedom of the F distribution\n     * @return random value sampled from the F(numeratorDf, denominatorDf) distribution\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 641,col 9)-(line 641,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.nextGamma(double, double)",
      "begin_line": 665,
      "end_line": 729,
      "comment": "\n     * \u003cp\u003eGenerates a random value from the\n     * {@link org.apache.commons.math3.distribution.GammaDistribution Gamma Distribution}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis implementation uses the following algorithms: \u003c/p\u003e\n     *\n     * \u003cp\u003eFor 0 \u003c shape \u003c 1: \u003cbr/\u003e\n     * Ahrens, J. H. and Dieter, U., \u003ci\u003eComputer methods for\n     * sampling from gamma, beta, Poisson and binomial distributions.\u003c/i\u003e\n     * Computing, 12, 223-246, 1974.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor shape \u003e\u003d 1: \u003cbr/\u003e\n     * Marsaglia and Tsang, \u003ci\u003eA Simple Method for Generating\n     * Gamma Variables.\u003c/i\u003e ACM Transactions on Mathematical Software,\n     * Volume 26 Issue 3, September, 2000.\u003c/p\u003e\n     *\n     * @param shape the median of the Gamma distribution\n     * @param scale the scale parameter of the Gamma distribution\n     * @return random value sampled from the Gamma(shape, scale) distribution\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 666,col 9)-(line 701,col 9)",
        "(line 705,col 9)-(line 705,col 56)",
        "(line 706,col 9)-(line 706,col 54)",
        "(line 707,col 9)-(line 707,col 52)",
        "(line 709,col 9)-(line 728,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.nextHypergeometric(int, int, int)",
      "begin_line": 742,
      "end_line": 744,
      "comment": "\n     * Generates a random value from the {@link HypergeometricDistribution Hypergeometric Distribution}.\n     * This implementation uses {@link #nextInversionDeviate(IntegerDistribution) inversion}\n     * to generate random values.\n     *\n     * @param populationSize the population size of the Hypergeometric distribution\n     * @param numberOfSuccesses number of successes in the population of the Hypergeometric distribution\n     * @param sampleSize the sample size of the Hypergeometric distribution\n     * @return random value sampled from the Hypergeometric(numberOfSuccesses, sampleSize) distribution\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 743,col 9)-(line 743,col 115)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.nextPascal(int, double)",
      "begin_line": 756,
      "end_line": 758,
      "comment": "\n     * Generates a random value from the {@link PascalDistribution Pascal Distribution}.\n     * This implementation uses {@link #nextInversionDeviate(IntegerDistribution) inversion}\n     * to generate random values.\n     *\n     * @param r the number of successes of the Pascal distribution\n     * @param p the probability of success of the Pascal distribution\n     * @return random value sampled from the Pascal(r, p) distribution\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 757,col 9)-(line 757,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.nextT(double)",
      "begin_line": 769,
      "end_line": 771,
      "comment": "\n     * Generates a random value from the {@link TDistribution T Distribution}.\n     * This implementation uses {@link #nextInversionDeviate(RealDistribution) inversion}\n     * to generate random values.\n     *\n     * @param df the degrees of freedom of the T distribution\n     * @return random value from the T(df) distribution\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 770,col 9)-(line 770,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.nextWeibull(double, double)",
      "begin_line": 783,
      "end_line": 785,
      "comment": "\n     * Generates a random value from the {@link WeibullDistribution Weibull Distribution}.\n     * This implementation uses {@link #nextInversionDeviate(RealDistribution) inversion}\n     * to generate random values.\n     *\n     * @param shape the shape parameter of the Weibull distribution\n     * @param scale the scale parameter of the Weibull distribution\n     * @return random value sampled from the Weibull(shape, size) distribution\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 784,col 9)-(line 784,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.nextZipf(int, double)",
      "begin_line": 797,
      "end_line": 799,
      "comment": "\n     * Generates a random value from the {@link ZipfDistribution Zipf Distribution}.\n     * This implementation uses {@link #nextInversionDeviate(IntegerDistribution) inversion}\n     * to generate random values.\n     *\n     * @param numberOfElements the number of elements of the ZipfDistribution\n     * @param exponent the exponent of the ZipfDistribution\n     * @return random value sampled from the Zipf(numberOfElements, exponent) distribution\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 798,col 9)-(line 798,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.getRan()",
      "begin_line": 811,
      "end_line": 816,
      "comment": "\n     * Returns the RandomGenerator used to generate non-secure random data.\n     * \u003cp\u003e\n     * Creates and initializes a default generator if null. Uses a {@link Well19937c}\n     * generator with {@code System.currentTimeMillis() + System.identityHashCode(this))} as the default seed.\n     * \u003c/p\u003e\n     *\n     * @return the Random used to generate random data\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 812,col 9)-(line 814,col 9)",
        "(line 815,col 9)-(line 815,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.initRan()",
      "begin_line": 822,
      "end_line": 824,
      "comment": "\n     * Sets the default generator to a {@link Well19937c} generator seeded with\n     * {@code System.currentTimeMillis() + System.identityHashCode(this))}.\n     ",
      "child_ranges": [
        "(line 823,col 9)-(line 823,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.getSecRan()",
      "begin_line": 835,
      "end_line": 841,
      "comment": "\n     * Returns the SecureRandom used to generate secure random data.\n     * \u003cp\u003e\n     * Creates and initializes if null.  Uses\n     * {@code System.currentTimeMillis() + System.identityHashCode(this)} as the default seed.\n     * \u003c/p\u003e\n     *\n     * @return the SecureRandom used to generate secure random data\n     ",
      "child_ranges": [
        "(line 836,col 9)-(line 839,col 9)",
        "(line 840,col 9)-(line 840,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.reSeed(long)",
      "begin_line": 852,
      "end_line": 857,
      "comment": "\n     * Reseeds the random number generator with the supplied seed.\n     * \u003cp\u003e\n     * Will create and initialize if null.\n     * \u003c/p\u003e\n     *\n     * @param seed\n     *            the seed value to use\n     ",
      "child_ranges": [
        "(line 853,col 9)-(line 855,col 9)",
        "(line 856,col 9)-(line 856,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.reSeedSecure()",
      "begin_line": 866,
      "end_line": 871,
      "comment": "\n     * Reseeds the secure random number generator with the current time in\n     * milliseconds.\n     * \u003cp\u003e\n     * Will create and initialize if null.\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 867,col 9)-(line 869,col 9)",
        "(line 870,col 9)-(line 870,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.reSeedSecure(long)",
      "begin_line": 882,
      "end_line": 887,
      "comment": "\n     * Reseeds the secure random number generator with the supplied seed.\n     * \u003cp\u003e\n     * Will create and initialize if null.\n     * \u003c/p\u003e\n     *\n     * @param seed\n     *            the seed value to use\n     ",
      "child_ranges": [
        "(line 883,col 9)-(line 885,col 9)",
        "(line 886,col 9)-(line 886,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.reSeed()",
      "begin_line": 893,
      "end_line": 898,
      "comment": "\n     * Reseeds the random number generator with\n     * {@code System.currentTimeMillis() + System.identityHashCode(this))}.\n     ",
      "child_ranges": [
        "(line 894,col 9)-(line 896,col 9)",
        "(line 897,col 9)-(line 897,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.setSecureAlgorithm(java.lang.String, java.lang.String)",
      "begin_line": 920,
      "end_line": 923,
      "comment": "\n     * Sets the PRNG algorithm for the underlying SecureRandom instance using\n     * the Security Provider API. The Security Provider API is defined in \u003ca\n     * href \u003d\n     * \"http://java.sun.com/j2se/1.3/docs/guide/security/CryptoSpec.html#AppA\"\u003e\n     * Java Cryptography Architecture API Specification \u0026 Reference.\u003c/a\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUSAGE NOTE:\u003c/strong\u003e This method carries \u003ci\u003esignificant\u003c/i\u003e\n     * overhead and may take several seconds to execute.\n     * \u003c/p\u003e\n     *\n     * @param algorithm\n     *            the name of the PRNG algorithm\n     * @param provider\n     *            the name of the provider\n     * @throws NoSuchAlgorithmException\n     *             if the specified algorithm is not available\n     * @throws NoSuchProviderException\n     *             if the specified provider is not installed\n     ",
      "child_ranges": [
        "(line 922,col 9)-(line 922,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.nextPermutation(int, int)",
      "begin_line": 934,
      "end_line": 952,
      "comment": "\n     * {@inheritDoc}\n     *\n     * \u003cp\u003e\n     * Uses a 2-cycle permutation shuffle. The shuffling process is described \u003ca\n     * href\u003d\"http://www.maths.abdn.ac.uk/~igc/tch/mx4002/notes/node83.html\"\u003e\n     * here\u003c/a\u003e.\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 935,col 9)-(line 938,col 9)",
        "(line 939,col 9)-(line 942,col 9)",
        "(line 944,col 9)-(line 944,col 36)",
        "(line 945,col 9)-(line 945,col 30)",
        "(line 946,col 9)-(line 946,col 34)",
        "(line 947,col 9)-(line 949,col 9)",
        "(line 951,col 9)-(line 951,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.nextSample(java.util.Collection\u003c?\u003e, int)",
      "begin_line": 967,
      "end_line": 985,
      "comment": "\n     * {@inheritDoc}\n     *\n     * \u003cp\u003e\n     * \u003cstrong\u003eAlgorithm Description\u003c/strong\u003e: Uses a 2-cycle permutation\n     * shuffle to generate a random permutation of \u003ccode\u003ec.size()\u003c/code\u003e and\n     * then returns the elements whose indexes correspond to the elements of the\n     * generated permutation. This technique is described, and proven to\n     * generate random samples \u003ca\n     * href\u003d\"http://www.maths.abdn.ac.uk/~igc/tch/mx4002/notes/node83.html\"\u003e\n     * here\u003c/a\u003e\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 969,col 9)-(line 969,col 27)",
        "(line 970,col 9)-(line 973,col 9)",
        "(line 974,col 9)-(line 976,col 9)",
        "(line 978,col 9)-(line 978,col 39)",
        "(line 979,col 9)-(line 979,col 46)",
        "(line 980,col 9)-(line 980,col 40)",
        "(line 981,col 9)-(line 983,col 9)",
        "(line 984,col 9)-(line 984,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.nextInversionDeviate(org.apache.commons.math3.distribution.RealDistribution)",
      "begin_line": 995,
      "end_line": 998,
      "comment": "\n     * Generate a random deviate from the given distribution using the\n     * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Inverse_transform_sampling\"\u003e inversion method.\u003c/a\u003e\n     *\n     * @param distribution Continuous distribution to generate a random value from\n     * @return a random value sampled from the given distribution\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 996,col 9)-(line 996,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.nextInversionDeviate(org.apache.commons.math3.distribution.IntegerDistribution)",
      "begin_line": 1008,
      "end_line": 1010,
      "comment": "\n     * Generate a random deviate from the given distribution using the\n     * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Inverse_transform_sampling\"\u003e inversion method.\u003c/a\u003e\n     *\n     * @param distribution Integer distribution to generate a random value from\n     * @return a random value sampled from the given distribution\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 1009,col 9)-(line 1009,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.shuffle(int[], int)",
      "begin_line": 1023,
      "end_line": 1035,
      "comment": "\n     * Uses a 2-cycle permutation shuffle to randomly re-order the last elements\n     * of list.\n     *\n     * @param list\n     *            list to be shuffled\n     * @param end\n     *            element past which shuffling begins\n     ",
      "child_ranges": [
        "(line 1024,col 9)-(line 1024,col 23)",
        "(line 1025,col 9)-(line 1034,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.getNatural(int)",
      "begin_line": 1044,
      "end_line": 1050,
      "comment": "\n     * Returns an array representing n.\n     *\n     * @param n\n     *            the natural number to represent\n     * @return array with entries \u003d elements of n\n     ",
      "child_ranges": [
        "(line 1045,col 9)-(line 1045,col 35)",
        "(line 1046,col 9)-(line 1048,col 9)",
        "(line 1049,col 9)-(line 1049,col 23)"
      ]
    }
  ]
}