{
  "filepath": "/tmp/Math-45b/src/main/java/org/apache/commons/math/random/RandomDataImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RandomDataImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.random.RandomData",
        "java.io.Serializable"
      ],
      "begin_line": 104,
      "end_line": 1100,
      "comment": "\n * Implements the {@link RandomData} interface using a {@link RandomGenerator}\n * instance to generate non-secure data and a {@link java.security.SecureRandom}\n * instance to provide data for the \u003ccode\u003enextSecureXxx\u003c/code\u003e methods. If no\n * \u003ccode\u003eRandomGenerator\u003c/code\u003e is provided in the constructor, the default is\n * to use a generator based on {@link java.util.Random}. To plug in a different\n * implementation, either implement \u003ccode\u003eRandomGenerator\u003c/code\u003e directly or\n * extend {@link AbstractRandomGenerator}.\n * \u003cp\u003e\n * Supports reseeding the underlying pseudo-random number generator (PRNG). The\n * \u003ccode\u003eSecurityProvider\u003c/code\u003e and \u003ccode\u003eAlgorithm\u003c/code\u003e used by the\n * \u003ccode\u003eSecureRandom\u003c/code\u003e instance can also be reset.\n * \u003c/p\u003e\n * \u003cp\u003e\n * For details on the default PRNGs, see {@link java.util.Random} and\n * {@link java.security.SecureRandom}.\n * \u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eUsage Notes\u003c/strong\u003e:\n * \u003cul\u003e\n * \u003cli\u003e\n * Instance variables are used to maintain \u003ccode\u003eRandomGenerator\u003c/code\u003e and\n * \u003ccode\u003eSecureRandom\u003c/code\u003e instances used in data generation. Therefore, to\n * generate a random sequence of values or strings, you should use just\n * \u003cstrong\u003eone\u003c/strong\u003e \u003ccode\u003eRandomDataImpl\u003c/code\u003e instance repeatedly.\u003c/li\u003e\n * \u003cli\u003e\n * The \"secure\" methods are *much* slower. These should be used only when a\n * cryptographically secure random sequence is required. A secure random\n * sequence is a sequence of pseudo-random values which, in addition to being\n * well-dispersed (so no subsequence of values is an any more likely than other\n * subsequence of the the same length), also has the additional property that\n * knowledge of values generated up to any point in the sequence does not make\n * it any easier to predict subsequent values.\u003c/li\u003e\n * \u003cli\u003e\n * When a new \u003ccode\u003eRandomDataImpl\u003c/code\u003e is created, the underlying random\n * number generators are \u003cstrong\u003enot\u003c/strong\u003e initialized. If you do not\n * explicitly seed the default non-secure generator, it is seeded with the\n * current time in milliseconds on first use. The same holds for the secure\n * generator. If you provide a \u003ccode\u003eRandomGenerator\u003c/code\u003e to the constructor,\n * however, this generator is not reseeded by the constructor nor is it reseeded\n * on first use.\u003c/li\u003e\n * \u003cli\u003e\n * The \u003ccode\u003ereSeed\u003c/code\u003e and \u003ccode\u003ereSeedSecure\u003c/code\u003e methods delegate to the\n * corresponding methods on the underlying \u003ccode\u003eRandomGenerator\u003c/code\u003e and\n * \u003ccode\u003eSecureRandom\u003c/code\u003e instances. Therefore, \u003ccode\u003ereSeed(long)\u003c/code\u003e\n * fully resets the initial state of the non-secure random number generator (so\n * that reseeding with a specific value always results in the same subsequent\n * random sequence); whereas reSeedSecure(long) does \u003cstrong\u003enot\u003c/strong\u003e\n * reinitialize the secure random number generator (so secure sequences started\n * with calls to reseedSecure(long) won\u0027t be identical).\u003c/li\u003e\n * \u003cli\u003e\n * This implementation is not synchronized.\n * \u003c/ul\u003e\n * \u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "EXPONENTIAL_SA_QI"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": " Used when generating Exponential samples\n     * [1] writes:\n     * One table containing the constants\n     * q_i \u003d sum_{j\u003d1}^i (ln 2)^j/j! \u003d ln 2 + (ln 2)^2/2 + ... + (ln 2)^i/i!\n     * until the largest representable fraction below 1 is exceeded.\n     *\n     * Note that\n     * 1 \u003d 2 - 1 \u003d exp(ln 2) - 1 \u003d sum_{n\u003d1}^infty (ln 2)^n / n!\n     * thus q_i -\u003e 1 as i -\u003e infty,\n     * so the higher 1, the closer to one we get (the series is not alternating).\n     *\n     * By trying, n \u003d 16 in Java is enough to reach 1.0.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rand"
      ],
      "begin_line": 125,
      "end_line": 125,
      "comment": " underlying random number generator "
    },
    {
      "type": "field",
      "varNames": [
        "secRand"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": " underlying secure random number generator "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.RandomDataImpl.RandomDataImpl()",
      "begin_line": 162,
      "end_line": 163,
      "comment": "\n     * Construct a RandomDataImpl.\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.RandomDataImpl.RandomDataImpl(org.apache.commons.math.random.RandomGenerator)",
      "begin_line": 173,
      "end_line": 176,
      "comment": "\n     * Construct a RandomDataImpl using the supplied {@link RandomGenerator} as\n     * the source of (non-secure) random data.\n     *\n     * @param rand the source of (non-secure) random data\n     * (may be null, resulting in default JDK-supplied generator)\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 16)",
        "(line 175,col 9)-(line 175,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextHexString(int)",
      "begin_line": 196,
      "end_line": 229,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\n     * \u003cstrong\u003eAlgorithm Description:\u003c/strong\u003e hex strings are generated using a\n     * 2-step process.\n     * \u003col\u003e\n     * \u003cli\u003e\n     * len/2+1 binary bytes are generated using the underlying Random\u003c/li\u003e\n     * \u003cli\u003e\n     * Each binary byte is translated into 2 hex digits\u003c/li\u003e\n     * \u003c/ol\u003e\n     * \u003c/p\u003e\n     *\n     * @param len\n     *            the desired string length.\n     * @return the random string.\n     * @throws NotStrictlyPositiveException if {@code len \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 199,col 9)",
        "(line 202,col 9)-(line 202,col 39)",
        "(line 205,col 9)-(line 205,col 54)",
        "(line 208,col 9)-(line 208,col 53)",
        "(line 209,col 9)-(line 209,col 35)",
        "(line 212,col 9)-(line 227,col 9)",
        "(line 228,col 9)-(line 228,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextInt(int, int)",
      "begin_line": 242,
      "end_line": 249,
      "comment": "\n     * Generate a random int value uniformly distributed between\n     * \u003ccode\u003elower\u003c/code\u003e and \u003ccode\u003eupper\u003c/code\u003e, inclusive.\n     *\n     * @param lower\n     *            the lower bound.\n     * @param upper\n     *            the upper bound.\n     * @return the random integer.\n     * @throws NumberIsTooLargeException if {@code lower \u003e\u003d upper}.\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 246,col 9)",
        "(line 247,col 9)-(line 247,col 41)",
        "(line 248,col 9)-(line 248,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextLong(long, long)",
      "begin_line": 262,
      "end_line": 269,
      "comment": "\n     * Generate a random long value uniformly distributed between\n     * \u003ccode\u003elower\u003c/code\u003e and \u003ccode\u003eupper\u003c/code\u003e, inclusive.\n     *\n     * @param lower\n     *            the lower bound.\n     * @param upper\n     *            the upper bound.\n     * @return the random integer.\n     * @throws NumberIsTooLargeException if {@code lower \u003e\u003d upper}.\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 266,col 9)",
        "(line 267,col 9)-(line 267,col 41)",
        "(line 268,col 9)-(line 268,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextSecureHexString(int)",
      "begin_line": 292,
      "end_line": 339,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\n     * \u003cstrong\u003eAlgorithm Description:\u003c/strong\u003e hex strings are generated in\n     * 40-byte segments using a 3-step process.\n     * \u003col\u003e\n     * \u003cli\u003e\n     * 20 random bytes are generated using the underlying\n     * \u003ccode\u003eSecureRandom\u003c/code\u003e.\u003c/li\u003e\n     * \u003cli\u003e\n     * SHA-1 hash is applied to yield a 20-byte binary digest.\u003c/li\u003e\n     * \u003cli\u003e\n     * Each byte of the binary digest is converted to 2 hex digits.\u003c/li\u003e\n     * \u003c/ol\u003e\n     * \u003c/p\u003e\n     *\n     * @param len\n     *            the length of the generated string\n     * @return the random string\n     * @throws NotStrictlyPositiveException if {@code len \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 295,col 9)",
        "(line 298,col 9)-(line 298,col 42)",
        "(line 299,col 9)-(line 299,col 33)",
        "(line 300,col 9)-(line 305,col 9)",
        "(line 306,col 9)-(line 306,col 20)",
        "(line 309,col 9)-(line 309,col 37)",
        "(line 311,col 9)-(line 311,col 54)",
        "(line 312,col 9)-(line 337,col 9)",
        "(line 338,col 9)-(line 338,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextSecureInt(int, int)",
      "begin_line": 353,
      "end_line": 360,
      "comment": "\n     * Generate a random int value uniformly distributed between\n     * \u003ccode\u003elower\u003c/code\u003e and \u003ccode\u003eupper\u003c/code\u003e, inclusive. This algorithm uses\n     * a secure random number generator.\n     *\n     * @param lower\n     *            the lower bound.\n     * @param upper\n     *            the upper bound.\n     * @return the random integer.\n     * @throws NumberIsTooLargeException if {@code lower \u003e\u003d upper}.\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 357,col 9)",
        "(line 358,col 9)-(line 358,col 39)",
        "(line 359,col 9)-(line 359,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextSecureLong(long, long)",
      "begin_line": 374,
      "end_line": 381,
      "comment": "\n     * Generate a random long value uniformly distributed between\n     * \u003ccode\u003elower\u003c/code\u003e and \u003ccode\u003eupper\u003c/code\u003e, inclusive. This algorithm uses\n     * a secure random number generator.\n     *\n     * @param lower\n     *            the lower bound.\n     * @param upper\n     *            the upper bound.\n     * @return the random integer.\n     * @throws NumberIsTooLargeException if {@code lower \u003e\u003d upper}.\n     ",
      "child_ranges": [
        "(line 375,col 9)-(line 378,col 9)",
        "(line 379,col 9)-(line 379,col 39)",
        "(line 380,col 9)-(line 380,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextPoisson(double)",
      "begin_line": 400,
      "end_line": 489,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\n     * \u003cstrong\u003eAlgorithm Description\u003c/strong\u003e:\n     * \u003cul\u003e\u003cli\u003e For small means, uses simulation of a Poisson process\n     * using Uniform deviates, as described\n     * \u003ca href\u003d\"http://irmi.epfl.ch/cmos/Pmmi/interactive/rng7.htm\"\u003e here.\u003c/a\u003e\n     * The Poisson process (and hence value returned) is bounded by 1000 * mean.\u003c/li\u003e\n     *\n     * \u003cli\u003e For large means, uses the rejection algorithm described in \u003cbr/\u003e\n     * Devroye, Luc. (1981).\u003ci\u003eThe Computer Generation of Poisson Random Variables\u003c/i\u003e\n     * \u003cstrong\u003eComputing\u003c/strong\u003e vol. 26 pp. 197-207.\u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param mean mean of the Poisson distribution.\n     * @return the random Poisson value.\n     * @throws NotStrictlyPositiveException if {@code mean \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 401,col 9)-(line 403,col 9)",
        "(line 405,col 9)-(line 405,col 35)",
        "(line 406,col 9)-(line 488,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextGaussian(double, double)",
      "begin_line": 503,
      "end_line": 508,
      "comment": "\n     * Generate a random value from a Normal (a.k.a. Gaussian) distribution with\n     * the given mean, \u003ccode\u003emu\u003c/code\u003e and the given standard deviation,\n     * \u003ccode\u003esigma\u003c/code\u003e.\n     *\n     * @param mu\n     *            the mean of the distribution\n     * @param sigma\n     *            the standard deviation of the distribution\n     * @return the random Normal value\n     * @throws NotStrictlyPositiveException if {@code sigma \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 504,col 9)-(line 506,col 9)",
        "(line 507,col 9)-(line 507,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextExponential(double)",
      "begin_line": 525,
      "end_line": 566,
      "comment": "\n     * Returns a random value from an Exponential distribution with the given\n     * mean.\n     * \u003cp\u003e\n     * \u003cstrong\u003eAlgorithm Description\u003c/strong\u003e: Uses the Algorithm SA (Ahrens)\n     * from p. 876 in:\n     * [1]: Ahrens, J. H. and Dieter, U. (1972). Computer methods for\n     * sampling from the exponential and normal distributions.\n     * Communications of the ACM, 15, 873-882.\n     * \u003c/p\u003e\n     *\n     * @param mean the mean of the distribution\n     * @return the random Exponential value\n     * @throws NotStrictlyPositiveException if {@code mean \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 526,col 9)-(line 528,col 9)",
        "(line 531,col 9)-(line 531,col 21)",
        "(line 532,col 9)-(line 532,col 42)",
        "(line 535,col 9)-(line 538,col 9)",
        "(line 541,col 9)-(line 541,col 19)",
        "(line 544,col 9)-(line 546,col 9)",
        "(line 549,col 9)-(line 549,col 18)",
        "(line 550,col 9)-(line 550,col 43)",
        "(line 551,col 9)-(line 551,col 25)",
        "(line 554,col 9)-(line 563,col 43)",
        "(line 565,col 9)-(line 565,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextUniform(double, double)",
      "begin_line": 585,
      "end_line": 599,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\n     * \u003cstrong\u003eAlgorithm Description\u003c/strong\u003e: scales the output of\n     * Random.nextDouble(), but rejects 0 values (i.e., will generate another\n     * random double if Random.nextDouble() returns 0). This is necessary to\n     * provide a symmetric output interval (both endpoints excluded).\n     * \u003c/p\u003e\n     *\n     * @param lower\n     *            the lower bound.\n     * @param upper\n     *            the upper bound.\n     * @return a uniformly distributed random value from the interval (lower,\n     *         upper)\n     * @throws NumberIsTooLargeException if {@code lower \u003e\u003d upper}.\n     ",
      "child_ranges": [
        "(line 586,col 9)-(line 589,col 9)",
        "(line 590,col 9)-(line 590,col 51)",
        "(line 593,col 9)-(line 593,col 42)",
        "(line 594,col 9)-(line 596,col 9)",
        "(line 598,col 9)-(line 598,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextBeta(double, double)",
      "begin_line": 611,
      "end_line": 613,
      "comment": "\n     * Generates a random value from the {@link BetaDistributionImpl Beta Distribution}.\n     * This implementation uses {@link #nextInversionDeviate(ContinuousDistribution) inversion}\n     * to generate random values.\n     *\n     * @param alpha first distribution shape parameter\n     * @param beta second distribution shape parameter\n     * @return random value sampled from the beta(alpha, beta) distribution\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 612,col 9)-(line 612,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextBinomial(int, double)",
      "begin_line": 625,
      "end_line": 627,
      "comment": "\n     * Generates a random value from the {@link BinomialDistributionImpl Binomial Distribution}.\n     * This implementation uses {@link #nextInversionDeviate(ContinuousDistribution) inversion}\n     * to generate random values.\n     *\n     * @param numberOfTrials number of trials of the Binomial distribution\n     * @param probabilityOfSuccess probability of success of the Binomial distribution\n     * @return random value sampled from the Binomial(numberOfTrials, probabilityOfSuccess) distribution\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 626,col 9)-(line 626,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextCauchy(double, double)",
      "begin_line": 639,
      "end_line": 641,
      "comment": "\n     * Generates a random value from the {@link CauchyDistributionImpl Cauchy Distribution}.\n     * This implementation uses {@link #nextInversionDeviate(ContinuousDistribution) inversion}\n     * to generate random values.\n     *\n     * @param median the median of the Cauchy distribution\n     * @param scale the scale parameter of the Cauchy distribution\n     * @return random value sampled from the Cauchy(median, scale) distribution\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 640,col 9)-(line 640,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextChiSquare(double)",
      "begin_line": 652,
      "end_line": 654,
      "comment": "\n     * Generates a random value from the {@link ChiSquaredDistributionImpl ChiSquare Distribution}.\n     * This implementation uses {@link #nextInversionDeviate(ContinuousDistribution) inversion}\n     * to generate random values.\n     *\n     * @param df the degrees of freedom of the ChiSquare distribution\n     * @return random value sampled from the ChiSquare(df) distribution\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 653,col 9)-(line 653,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextF(double, double)",
      "begin_line": 666,
      "end_line": 668,
      "comment": "\n     * Generates a random value from the {@link FDistributionImpl F Distribution}.\n     * This implementation uses {@link #nextInversionDeviate(ContinuousDistribution) inversion}\n     * to generate random values.\n     *\n     * @param numeratorDf the numerator degrees of freedom of the F distribution\n     * @param denominatorDf the denominator degrees of freedom of the F distribution\n     * @return random value sampled from the F(numeratorDf, denominatorDf) distribution\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 667,col 9)-(line 667,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextGamma(double, double)",
      "begin_line": 691,
      "end_line": 755,
      "comment": "\n     * \u003cp\u003eGenerates a random value from the\n     * {@link org.apache.commons.math.distribution.GammaDistributionImpl Gamma Distribution}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis implementation uses the following algorithms: \u003c/p\u003e\n     *\n     * \u003cp\u003eFor 0 \u003c shape \u003c 1: \u003cbr/\u003e\n     * Ahrens, J. H. and Dieter, U., \u003ci\u003eComputer methods for\n     * sampling from gamma, beta, Poisson and binomial distributions.\u003c/i\u003e\n     * Computing, 12, 223-246, 1974.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor shape \u003e\u003d 1: \u003cbr/\u003e\n     * Marsaglia and Tsang, \u003ci\u003eA Simple Method for Generating\n     * Gamma Variables.\u003c/i\u003e ACM Transactions on Mathematical Software,\n     * Volume 26 Issue 3, September, 2000.\u003c/p\u003e\n     *\n     * @param shape the median of the Gamma distribution\n     * @param scale the scale parameter of the Gamma distribution\n     * @return random value sampled from the Gamma(shape, scale) distribution\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 692,col 9)-(line 727,col 9)",
        "(line 731,col 9)-(line 731,col 56)",
        "(line 732,col 9)-(line 732,col 54)",
        "(line 733,col 9)-(line 733,col 52)",
        "(line 735,col 9)-(line 754,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextHypergeometric(int, int, int)",
      "begin_line": 768,
      "end_line": 770,
      "comment": "\n     * Generates a random value from the {@link HypergeometricDistributionImpl Hypergeometric Distribution}.\n     * This implementation uses {@link #nextInversionDeviate(IntegerDistribution) inversion}\n     * to generate random values.\n     *\n     * @param populationSize the population size of the Hypergeometric distribution\n     * @param numberOfSuccesses number of successes in the population of the Hypergeometric distribution\n     * @param sampleSize the sample size of the Hypergeometric distribution\n     * @return random value sampled from the Hypergeometric(numberOfSuccesses, sampleSize) distribution\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 769,col 9)-(line 769,col 119)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextPascal(int, double)",
      "begin_line": 782,
      "end_line": 784,
      "comment": "\n     * Generates a random value from the {@link PascalDistributionImpl Pascal Distribution}.\n     * This implementation uses {@link #nextInversionDeviate(IntegerDistribution) inversion}\n     * to generate random values.\n     *\n     * @param r the number of successes of the Pascal distribution\n     * @param p the probability of success of the Pascal distribution\n     * @return random value sampled from the Pascal(r, p) distribution\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 783,col 9)-(line 783,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextT(double)",
      "begin_line": 795,
      "end_line": 797,
      "comment": "\n     * Generates a random value from the {@link TDistributionImpl T Distribution}.\n     * This implementation uses {@link #nextInversionDeviate(ContinuousDistribution) inversion}\n     * to generate random values.\n     *\n     * @param df the degrees of freedom of the T distribution\n     * @return random value from the T(df) distribution\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 796,col 9)-(line 796,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextWeibull(double, double)",
      "begin_line": 809,
      "end_line": 811,
      "comment": "\n     * Generates a random value from the {@link WeibullDistributionImpl Weibull Distribution}.\n     * This implementation uses {@link #nextInversionDeviate(ContinuousDistribution) inversion}\n     * to generate random values.\n     *\n     * @param shape the shape parameter of the Weibull distribution\n     * @param scale the scale parameter of the Weibull distribution\n     * @return random value sampled from the Weibull(shape, size) distribution\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 810,col 9)-(line 810,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextZipf(int, double)",
      "begin_line": 823,
      "end_line": 825,
      "comment": "\n     * Generates a random value from the {@link ZipfDistributionImpl Zipf Distribution}.\n     * This implementation uses {@link #nextInversionDeviate(IntegerDistribution) inversion}\n     * to generate random values.\n     *\n     * @param numberOfElements the number of elements of the ZipfDistribution\n     * @param exponent the exponent of the ZipfDistribution\n     * @return random value sampled from the Zipf(numberOfElements, exponent) distribution\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 824,col 9)-(line 824,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.getRan()",
      "begin_line": 836,
      "end_line": 842,
      "comment": "\n     * Returns the RandomGenerator used to generate non-secure random data.\n     * \u003cp\u003e\n     * Creates and initializes a default generator if null.\n     * \u003c/p\u003e\n     *\n     * @return the Random used to generate random data\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 837,col 9)-(line 840,col 9)",
        "(line 841,col 9)-(line 841,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.getSecRan()",
      "begin_line": 852,
      "end_line": 858,
      "comment": "\n     * Returns the SecureRandom used to generate secure random data.\n     * \u003cp\u003e\n     * Creates and initializes if null.\n     * \u003c/p\u003e\n     *\n     * @return the SecureRandom used to generate secure random data\n     ",
      "child_ranges": [
        "(line 853,col 9)-(line 856,col 9)",
        "(line 857,col 9)-(line 857,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.reSeed(long)",
      "begin_line": 869,
      "end_line": 874,
      "comment": "\n     * Reseeds the random number generator with the supplied seed.\n     * \u003cp\u003e\n     * Will create and initialize if null.\n     * \u003c/p\u003e\n     *\n     * @param seed\n     *            the seed value to use\n     ",
      "child_ranges": [
        "(line 870,col 9)-(line 872,col 9)",
        "(line 873,col 9)-(line 873,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.reSeedSecure()",
      "begin_line": 883,
      "end_line": 888,
      "comment": "\n     * Reseeds the secure random number generator with the current time in\n     * milliseconds.\n     * \u003cp\u003e\n     * Will create and initialize if null.\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 884,col 9)-(line 886,col 9)",
        "(line 887,col 9)-(line 887,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.reSeedSecure(long)",
      "begin_line": 899,
      "end_line": 904,
      "comment": "\n     * Reseeds the secure random number generator with the supplied seed.\n     * \u003cp\u003e\n     * Will create and initialize if null.\n     * \u003c/p\u003e\n     *\n     * @param seed\n     *            the seed value to use\n     ",
      "child_ranges": [
        "(line 900,col 9)-(line 902,col 9)",
        "(line 903,col 9)-(line 903,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.reSeed()",
      "begin_line": 910,
      "end_line": 915,
      "comment": "\n     * Reseeds the random number generator with the current time in\n     * milliseconds.\n     ",
      "child_ranges": [
        "(line 911,col 9)-(line 913,col 9)",
        "(line 914,col 9)-(line 914,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.setSecureAlgorithm(java.lang.String, java.lang.String)",
      "begin_line": 937,
      "end_line": 940,
      "comment": "\n     * Sets the PRNG algorithm for the underlying SecureRandom instance using\n     * the Security Provider API. The Security Provider API is defined in \u003ca\n     * href \u003d\n     * \"http://java.sun.com/j2se/1.3/docs/guide/security/CryptoSpec.html#AppA\"\u003e\n     * Java Cryptography Architecture API Specification \u0026 Reference.\u003c/a\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUSAGE NOTE:\u003c/strong\u003e This method carries \u003ci\u003esignificant\u003c/i\u003e\n     * overhead and may take several seconds to execute.\n     * \u003c/p\u003e\n     *\n     * @param algorithm\n     *            the name of the PRNG algorithm\n     * @param provider\n     *            the name of the provider\n     * @throws NoSuchAlgorithmException\n     *             if the specified algorithm is not available\n     * @throws NoSuchProviderException\n     *             if the specified provider is not installed\n     ",
      "child_ranges": [
        "(line 939,col 9)-(line 939,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextPermutation(int, int)",
      "begin_line": 972,
      "end_line": 990,
      "comment": "\n     * Generates an integer array of length \u003ccode\u003ek\u003c/code\u003e whose entries are\n     * selected randomly, without repetition, from the integers\n     * \u003ccode\u003e0 through n-1\u003c/code\u003e (inclusive).\n     * \u003cp\u003e\n     * Generated arrays represent permutations of \u003ccode\u003en\u003c/code\u003e taken\n     * \u003ccode\u003ek\u003c/code\u003e at a time.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions:\u003c/strong\u003e\n     * \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003ek \u003c\u003d n\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e \u003ccode\u003en \u003e 0\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * If the preconditions are not met, an IllegalArgumentException is thrown.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Uses a 2-cycle permutation shuffle. The shuffling process is described \u003ca\n     * href\u003d\"http://www.maths.abdn.ac.uk/~igc/tch/mx4002/notes/node83.html\"\u003e\n     * here\u003c/a\u003e.\n     * \u003c/p\u003e\n     *\n     * @param n\n     *            domain of the permutation (must be positive)\n     * @param k\n     *            size of the permutation (must satisfy 0 \u003c k \u003c\u003d n).\n     * @return the random permutation as an int array\n     * @throws NumberIsTooLargeException if {@code k \u003e n}.\n     * @throws NotStrictlyPositiveException if {@code k \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 973,col 9)-(line 976,col 9)",
        "(line 977,col 9)-(line 980,col 9)",
        "(line 982,col 9)-(line 982,col 36)",
        "(line 983,col 9)-(line 983,col 30)",
        "(line 984,col 9)-(line 984,col 34)",
        "(line 985,col 9)-(line 987,col 9)",
        "(line 989,col 9)-(line 989,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextSample(java.util.Collection\u003c?\u003e, int)",
      "begin_line": 1010,
      "end_line": 1027,
      "comment": "\n     * Uses a 2-cycle permutation shuffle to generate a random permutation.\n     * \u003cstrong\u003eAlgorithm Description\u003c/strong\u003e: Uses a 2-cycle permutation\n     * shuffle to generate a random permutation of \u003ccode\u003ec.size()\u003c/code\u003e and\n     * then returns the elements whose indexes correspond to the elements of the\n     * generated permutation. This technique is described, and proven to\n     * generate random samples, \u003ca\n     * href\u003d\"http://www.maths.abdn.ac.uk/~igc/tch/mx4002/notes/node83.html\"\u003e\n     * here\u003c/a\u003e\n     *\n     * @param c\n     *            Collection to sample from.\n     * @param k\n     *            sample size.\n     * @return the random sample.\n     * @throws NumberIsTooLargeException if {@code k \u003e c.size()}.\n     * @throws NotStrictlyPositiveException if {@code k \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 1011,col 9)-(line 1011,col 27)",
        "(line 1012,col 9)-(line 1015,col 9)",
        "(line 1016,col 9)-(line 1018,col 9)",
        "(line 1020,col 9)-(line 1020,col 39)",
        "(line 1021,col 9)-(line 1021,col 46)",
        "(line 1022,col 9)-(line 1022,col 40)",
        "(line 1023,col 9)-(line 1025,col 9)",
        "(line 1026,col 9)-(line 1026,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextInversionDeviate(org.apache.commons.math.distribution.ContinuousDistribution)",
      "begin_line": 1037,
      "end_line": 1040,
      "comment": "\n     * Generate a random deviate from the given distribution using the\n     * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Inverse_transform_sampling\"\u003e inversion method.\u003c/a\u003e\n     *\n     * @param distribution Continuous distribution to generate a random value from\n     * @return a random value sampled from the given distribution\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 1038,col 9)-(line 1038,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextInversionDeviate(org.apache.commons.math.distribution.IntegerDistribution)",
      "begin_line": 1050,
      "end_line": 1058,
      "comment": "\n     * Generate a random deviate from the given distribution using the\n     * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Inverse_transform_sampling\"\u003e inversion method.\u003c/a\u003e\n     *\n     * @param distribution Integer distribution to generate a random value from\n     * @return a random value sampled from the given distribution\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 1051,col 9)-(line 1051,col 48)",
        "(line 1052,col 9)-(line 1052,col 74)",
        "(line 1053,col 9)-(line 1057,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.shuffle(int[], int)",
      "begin_line": 1071,
      "end_line": 1083,
      "comment": "\n     * Uses a 2-cycle permutation shuffle to randomly re-order the last elements\n     * of list.\n     *\n     * @param list\n     *            list to be shuffled\n     * @param end\n     *            element past which shuffling begins\n     ",
      "child_ranges": [
        "(line 1072,col 9)-(line 1072,col 23)",
        "(line 1073,col 9)-(line 1082,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.getNatural(int)",
      "begin_line": 1092,
      "end_line": 1098,
      "comment": "\n     * Returns an array representing n.\n     *\n     * @param n\n     *            the natural number to represent\n     * @return array with entries \u003d elements of n\n     ",
      "child_ranges": [
        "(line 1093,col 9)-(line 1093,col 35)",
        "(line 1094,col 9)-(line 1096,col 9)",
        "(line 1097,col 9)-(line 1097,col 23)"
      ]
    }
  ]
}