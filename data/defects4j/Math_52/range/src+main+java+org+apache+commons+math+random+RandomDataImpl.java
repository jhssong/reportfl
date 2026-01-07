{
  "filepath": "/tmp/Math-52b/src/main/java/org/apache/commons/math/random/RandomDataImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RandomDataImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.random.RandomData",
        "java.io.Serializable"
      ],
      "begin_line": 105,
      "end_line": 1114,
      "comment": "\n * Implements the {@link RandomData} interface using a {@link RandomGenerator}\n * instance to generate non-secure data and a {@link java.security.SecureRandom}\n * instance to provide data for the \u003ccode\u003enextSecureXxx\u003c/code\u003e methods. If no\n * \u003ccode\u003eRandomGenerator\u003c/code\u003e is provided in the constructor, the default is\n * to use a generator based on {@link java.util.Random}. To plug in a different\n * implementation, either implement \u003ccode\u003eRandomGenerator\u003c/code\u003e directly or\n * extend {@link AbstractRandomGenerator}.\n * \u003cp\u003e\n * Supports reseeding the underlying pseudo-random number generator (PRNG). The\n * \u003ccode\u003eSecurityProvider\u003c/code\u003e and \u003ccode\u003eAlgorithm\u003c/code\u003e used by the\n * \u003ccode\u003eSecureRandom\u003c/code\u003e instance can also be reset.\n * \u003c/p\u003e\n * \u003cp\u003e\n * For details on the default PRNGs, see {@link java.util.Random} and\n * {@link java.security.SecureRandom}.\n * \u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eUsage Notes\u003c/strong\u003e:\n * \u003cul\u003e\n * \u003cli\u003e\n * Instance variables are used to maintain \u003ccode\u003eRandomGenerator\u003c/code\u003e and\n * \u003ccode\u003eSecureRandom\u003c/code\u003e instances used in data generation. Therefore, to\n * generate a random sequence of values or strings, you should use just\n * \u003cstrong\u003eone\u003c/strong\u003e \u003ccode\u003eRandomDataImpl\u003c/code\u003e instance repeatedly.\u003c/li\u003e\n * \u003cli\u003e\n * The \"secure\" methods are *much* slower. These should be used only when a\n * cryptographically secure random sequence is required. A secure random\n * sequence is a sequence of pseudo-random values which, in addition to being\n * well-dispersed (so no subsequence of values is an any more likely than other\n * subsequence of the the same length), also has the additional property that\n * knowledge of values generated up to any point in the sequence does not make\n * it any easier to predict subsequent values.\u003c/li\u003e\n * \u003cli\u003e\n * When a new \u003ccode\u003eRandomDataImpl\u003c/code\u003e is created, the underlying random\n * number generators are \u003cstrong\u003enot\u003c/strong\u003e initialized. If you do not\n * explicitly seed the default non-secure generator, it is seeded with the\n * current time in milliseconds on first use. The same holds for the secure\n * generator. If you provide a \u003ccode\u003eRandomGenerator\u003c/code\u003e to the constructor,\n * however, this generator is not reseeded by the constructor nor is it reseeded\n * on first use.\u003c/li\u003e\n * \u003cli\u003e\n * The \u003ccode\u003ereSeed\u003c/code\u003e and \u003ccode\u003ereSeedSecure\u003c/code\u003e methods delegate to the\n * corresponding methods on the underlying \u003ccode\u003eRandomGenerator\u003c/code\u003e and\n * \u003ccode\u003eSecureRandom\u003c/code\u003e instances. Therefore, \u003ccode\u003ereSeed(long)\u003c/code\u003e\n * fully resets the initial state of the non-secure random number generator (so\n * that reseeding with a specific value always results in the same subsequent\n * random sequence); whereas reSeedSecure(long) does \u003cstrong\u003enot\u003c/strong\u003e\n * reinitialize the secure random number generator (so secure sequences started\n * with calls to reseedSecure(long) won\u0027t be identical).\u003c/li\u003e\n * \u003cli\u003e\n * This implementation is not synchronized.\n * \u003c/ul\u003e\n * \u003c/p\u003e\n *\n * @version $Id$\n "
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
      "comment": " Used when generating Exponential samples\n     * [1] writes:\n     * One table containing the constants\n     * q_i \u003d sum_{j\u003d1}^i (ln 2)^j/j! \u003d ln 2 + (ln 2)^2/2 + ... + (ln 2)^i/i!\n     * until the largest representable fraction below 1 is exceeded.\n     *\n     * Note that\n     * 1 \u003d 2 - 1 \u003d exp(ln 2) - 1 \u003d sum_{n\u003d1}^infty (ln 2)^n / n!\n     * thus q_i -\u003e 1 as i -\u003e infty,\n     * so the higher 1, the closer to one we get (the series is not alternating).\n     *\n     * By trying, n \u003d 16 in Java is enough to reach 1.0.\n     "
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
      "signature": "org.apache.commons.math.random.RandomDataImpl.RandomDataImpl()",
      "begin_line": 163,
      "end_line": 164,
      "comment": "\n     * Construct a RandomDataImpl.\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.RandomDataImpl.RandomDataImpl(org.apache.commons.math.random.RandomGenerator)",
      "begin_line": 174,
      "end_line": 177,
      "comment": "\n     * Construct a RandomDataImpl using the supplied {@link RandomGenerator} as\n     * the source of (non-secure) random data.\n     *\n     * @param rand the source of (non-secure) random data \n     * (may be null, resulting in default JDK-supplied generator)\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 16)",
        "(line 176,col 9)-(line 176,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextHexString(int)",
      "begin_line": 197,
      "end_line": 230,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\n     * \u003cstrong\u003eAlgorithm Description:\u003c/strong\u003e hex strings are generated using a\n     * 2-step process.\n     * \u003col\u003e\n     * \u003cli\u003e\n     * len/2+1 binary bytes are generated using the underlying Random\u003c/li\u003e\n     * \u003cli\u003e\n     * Each binary byte is translated into 2 hex digits\u003c/li\u003e\n     * \u003c/ol\u003e\n     * \u003c/p\u003e\n     *\n     * @param len\n     *            the desired string length.\n     * @return the random string.\n     * @throws NotStrictlyPositiveException if {@code len \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 200,col 9)",
        "(line 203,col 9)-(line 203,col 39)",
        "(line 206,col 9)-(line 206,col 54)",
        "(line 209,col 9)-(line 209,col 53)",
        "(line 210,col 9)-(line 210,col 35)",
        "(line 213,col 9)-(line 228,col 9)",
        "(line 229,col 9)-(line 229,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextInt(int, int)",
      "begin_line": 243,
      "end_line": 250,
      "comment": "\n     * Generate a random int value uniformly distributed between\n     * \u003ccode\u003elower\u003c/code\u003e and \u003ccode\u003eupper\u003c/code\u003e, inclusive.\n     *\n     * @param lower\n     *            the lower bound.\n     * @param upper\n     *            the upper bound.\n     * @return the random integer.\n     * @throws NumberIsTooLargeException if {@code lower \u003e\u003d upper}.\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 247,col 9)",
        "(line 248,col 9)-(line 248,col 41)",
        "(line 249,col 9)-(line 249,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextLong(long, long)",
      "begin_line": 263,
      "end_line": 270,
      "comment": "\n     * Generate a random long value uniformly distributed between\n     * \u003ccode\u003elower\u003c/code\u003e and \u003ccode\u003eupper\u003c/code\u003e, inclusive.\n     *\n     * @param lower\n     *            the lower bound.\n     * @param upper\n     *            the upper bound.\n     * @return the random integer.\n     * @throws NumberIsTooLargeException if {@code lower \u003e\u003d upper}.\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 267,col 9)",
        "(line 268,col 9)-(line 268,col 41)",
        "(line 269,col 9)-(line 269,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextSecureHexString(int)",
      "begin_line": 293,
      "end_line": 340,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\n     * \u003cstrong\u003eAlgorithm Description:\u003c/strong\u003e hex strings are generated in\n     * 40-byte segments using a 3-step process.\n     * \u003col\u003e\n     * \u003cli\u003e\n     * 20 random bytes are generated using the underlying\n     * \u003ccode\u003eSecureRandom\u003c/code\u003e.\u003c/li\u003e\n     * \u003cli\u003e\n     * SHA-1 hash is applied to yield a 20-byte binary digest.\u003c/li\u003e\n     * \u003cli\u003e\n     * Each byte of the binary digest is converted to 2 hex digits.\u003c/li\u003e\n     * \u003c/ol\u003e\n     * \u003c/p\u003e\n     *\n     * @param len\n     *            the length of the generated string\n     * @return the random string\n     * @throws NotStrictlyPositiveException if {@code len \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 296,col 9)",
        "(line 299,col 9)-(line 299,col 42)",
        "(line 300,col 9)-(line 300,col 33)",
        "(line 301,col 9)-(line 306,col 9)",
        "(line 307,col 9)-(line 307,col 20)",
        "(line 310,col 9)-(line 310,col 37)",
        "(line 312,col 9)-(line 312,col 54)",
        "(line 313,col 9)-(line 338,col 9)",
        "(line 339,col 9)-(line 339,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextSecureInt(int, int)",
      "begin_line": 354,
      "end_line": 361,
      "comment": "\n     * Generate a random int value uniformly distributed between\n     * \u003ccode\u003elower\u003c/code\u003e and \u003ccode\u003eupper\u003c/code\u003e, inclusive. This algorithm uses\n     * a secure random number generator.\n     *\n     * @param lower\n     *            the lower bound.\n     * @param upper\n     *            the upper bound.\n     * @return the random integer.\n     * @throws NumberIsTooLargeException if {@code lower \u003e\u003d upper}.\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 358,col 9)",
        "(line 359,col 9)-(line 359,col 39)",
        "(line 360,col 9)-(line 360,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextSecureLong(long, long)",
      "begin_line": 375,
      "end_line": 382,
      "comment": "\n     * Generate a random long value uniformly distributed between\n     * \u003ccode\u003elower\u003c/code\u003e and \u003ccode\u003eupper\u003c/code\u003e, inclusive. This algorithm uses\n     * a secure random number generator.\n     *\n     * @param lower\n     *            the lower bound.\n     * @param upper\n     *            the upper bound.\n     * @return the random integer.\n     * @throws NumberIsTooLargeException if {@code lower \u003e\u003d upper}.\n     ",
      "child_ranges": [
        "(line 376,col 9)-(line 379,col 9)",
        "(line 380,col 9)-(line 380,col 39)",
        "(line 381,col 9)-(line 381,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextPoisson(double)",
      "begin_line": 401,
      "end_line": 490,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\n     * \u003cstrong\u003eAlgorithm Description\u003c/strong\u003e:\n     * \u003cul\u003e\u003cli\u003e For small means, uses simulation of a Poisson process\n     * using Uniform deviates, as described\n     * \u003ca href\u003d\"http://irmi.epfl.ch/cmos/Pmmi/interactive/rng7.htm\"\u003e here.\u003c/a\u003e\n     * The Poisson process (and hence value returned) is bounded by 1000 * mean.\u003c/li\u003e\n     *\n     * \u003cli\u003e For large means, uses the rejection algorithm described in \u003cbr/\u003e\n     * Devroye, Luc. (1981).\u003ci\u003eThe Computer Generation of Poisson Random Variables\u003c/i\u003e\n     * \u003cstrong\u003eComputing\u003c/strong\u003e vol. 26 pp. 197-207.\u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param mean mean of the Poisson distribution.\n     * @return the random Poisson value.\n     * @throws NotStrictlyPositiveException if {@code mean \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 402,col 9)-(line 404,col 9)",
        "(line 406,col 9)-(line 406,col 35)",
        "(line 407,col 9)-(line 489,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextGaussian(double, double)",
      "begin_line": 504,
      "end_line": 509,
      "comment": "\n     * Generate a random value from a Normal (a.k.a. Gaussian) distribution with\n     * the given mean, \u003ccode\u003emu\u003c/code\u003e and the given standard deviation,\n     * \u003ccode\u003esigma\u003c/code\u003e.\n     *\n     * @param mu\n     *            the mean of the distribution\n     * @param sigma\n     *            the standard deviation of the distribution\n     * @return the random Normal value\n     * @throws NotStrictlyPositiveException if {@code sigma \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 505,col 9)-(line 507,col 9)",
        "(line 508,col 9)-(line 508,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextExponential(double)",
      "begin_line": 526,
      "end_line": 567,
      "comment": "\n     * Returns a random value from an Exponential distribution with the given\n     * mean.\n     * \u003cp\u003e\n     * \u003cstrong\u003eAlgorithm Description\u003c/strong\u003e: Uses the Algorithm SA (Ahrens)\n     * from p. 876 in:\n     * [1]: Ahrens, J. H. and Dieter, U. (1972). Computer methods for\n     * sampling from the exponential and normal distributions.\n     * Communications of the ACM, 15, 873-882.\n     * \u003c/p\u003e\n     *\n     * @param mean the mean of the distribution\n     * @return the random Exponential value\n     * @throws NotStrictlyPositiveException if {@code mean \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 527,col 9)-(line 529,col 9)",
        "(line 532,col 9)-(line 532,col 21)",
        "(line 533,col 9)-(line 533,col 42)",
        "(line 536,col 9)-(line 539,col 9)",
        "(line 542,col 9)-(line 542,col 19)",
        "(line 545,col 9)-(line 547,col 9)",
        "(line 550,col 9)-(line 550,col 18)",
        "(line 551,col 9)-(line 551,col 43)",
        "(line 552,col 9)-(line 552,col 25)",
        "(line 555,col 9)-(line 564,col 43)",
        "(line 566,col 9)-(line 566,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextUniform(double, double)",
      "begin_line": 586,
      "end_line": 600,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\n     * \u003cstrong\u003eAlgorithm Description\u003c/strong\u003e: scales the output of\n     * Random.nextDouble(), but rejects 0 values (i.e., will generate another\n     * random double if Random.nextDouble() returns 0). This is necessary to\n     * provide a symmetric output interval (both endpoints excluded).\n     * \u003c/p\u003e\n     *\n     * @param lower\n     *            the lower bound.\n     * @param upper\n     *            the upper bound.\n     * @return a uniformly distributed random value from the interval (lower,\n     *         upper)\n     * @throws NumberIsTooLargeException if {@code lower \u003e\u003d upper}.\n     ",
      "child_ranges": [
        "(line 587,col 9)-(line 590,col 9)",
        "(line 591,col 9)-(line 591,col 51)",
        "(line 594,col 9)-(line 594,col 42)",
        "(line 595,col 9)-(line 597,col 9)",
        "(line 599,col 9)-(line 599,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextBeta(double, double)",
      "begin_line": 613,
      "end_line": 615,
      "comment": "\n     * Generates a random value from the {@link BetaDistributionImpl Beta Distribution}.\n     * This implementation uses {@link #nextInversionDeviate(ContinuousDistribution) inversion}\n     * to generate random values.\n     *\n     * @param alpha first distribution shape parameter\n     * @param beta second distribution shape parameter\n     * @return random value sampled from the beta(alpha, beta) distribution\n     * @throws MathException if an error occurs generating the random value\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 614,col 9)-(line 614,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextBinomial(int, double)",
      "begin_line": 628,
      "end_line": 630,
      "comment": "\n     * Generates a random value from the {@link BinomialDistributionImpl Binomial Distribution}.\n     * This implementation uses {@link #nextInversionDeviate(ContinuousDistribution) inversion}\n     * to generate random values.\n     *\n     * @param numberOfTrials number of trials of the Binomial distribution\n     * @param probabilityOfSuccess probability of success of the Binomial distribution\n     * @return random value sampled from the Binomial(numberOfTrials, probabilityOfSuccess) distribution\n     * @throws MathException if an error occurs generating the random value\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 629,col 9)-(line 629,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextCauchy(double, double)",
      "begin_line": 643,
      "end_line": 645,
      "comment": "\n     * Generates a random value from the {@link CauchyDistributionImpl Cauchy Distribution}.\n     * This implementation uses {@link #nextInversionDeviate(ContinuousDistribution) inversion}\n     * to generate random values.\n     *\n     * @param median the median of the Cauchy distribution\n     * @param scale the scale parameter of the Cauchy distribution\n     * @return random value sampled from the Cauchy(median, scale) distribution\n     * @throws MathException if an error occurs generating the random value\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 644,col 9)-(line 644,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextChiSquare(double)",
      "begin_line": 657,
      "end_line": 659,
      "comment": "\n     * Generates a random value from the {@link ChiSquaredDistributionImpl ChiSquare Distribution}.\n     * This implementation uses {@link #nextInversionDeviate(ContinuousDistribution) inversion}\n     * to generate random values.\n     *\n     * @param df the degrees of freedom of the ChiSquare distribution\n     * @return random value sampled from the ChiSquare(df) distribution\n     * @throws MathException if an error occurs generating the random value\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 658,col 9)-(line 658,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextF(double, double)",
      "begin_line": 672,
      "end_line": 674,
      "comment": "\n     * Generates a random value from the {@link FDistributionImpl F Distribution}.\n     * This implementation uses {@link #nextInversionDeviate(ContinuousDistribution) inversion}\n     * to generate random values.\n     *\n     * @param numeratorDf the numerator degrees of freedom of the F distribution\n     * @param denominatorDf the denominator degrees of freedom of the F distribution\n     * @return random value sampled from the F(numeratorDf, denominatorDf) distribution\n     * @throws MathException if an error occurs generating the random value\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 673,col 9)-(line 673,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextGamma(double, double)",
      "begin_line": 698,
      "end_line": 762,
      "comment": "\n     * \u003cp\u003eGenerates a random value from the\n     * {@link org.apache.commons.math.distribution.GammaDistributionImpl Gamma Distribution}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis implementation uses the following algorithms: \u003c/p\u003e\n     *\n     * \u003cp\u003eFor 0 \u003c shape \u003c 1: \u003cbr/\u003e\n     * Ahrens, J. H. and Dieter, U., \u003ci\u003eComputer methods for\n     * sampling from gamma, beta, Poisson and binomial distributions.\u003c/i\u003e\n     * Computing, 12, 223-246, 1974.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor shape \u003e\u003d 1: \u003cbr/\u003e\n     * Marsaglia and Tsang, \u003ci\u003eA Simple Method for Generating\n     * Gamma Variables.\u003c/i\u003e ACM Transactions on Mathematical Software,\n     * Volume 26 Issue 3, September, 2000.\u003c/p\u003e\n     *\n     * @param shape the median of the Gamma distribution\n     * @param scale the scale parameter of the Gamma distribution\n     * @return random value sampled from the Gamma(shape, scale) distribution\n     * @throws MathException if an error occurs generating the random value\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 699,col 9)-(line 734,col 9)",
        "(line 738,col 9)-(line 738,col 56)",
        "(line 739,col 9)-(line 739,col 54)",
        "(line 740,col 9)-(line 740,col 52)",
        "(line 742,col 9)-(line 761,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextHypergeometric(int, int, int)",
      "begin_line": 776,
      "end_line": 778,
      "comment": "\n     * Generates a random value from the {@link HypergeometricDistributionImpl Hypergeometric Distribution}.\n     * This implementation uses {@link #nextInversionDeviate(IntegerDistribution) inversion}\n     * to generate random values.\n     *\n     * @param populationSize the population size of the Hypergeometric distribution\n     * @param numberOfSuccesses number of successes in the population of the Hypergeometric distribution\n     * @param sampleSize the sample size of the Hypergeometric distribution\n     * @return random value sampled from the Hypergeometric(numberOfSuccesses, sampleSize) distribution\n     * @throws MathException if an error occurs generating the random value\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 777,col 9)-(line 777,col 119)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextPascal(int, double)",
      "begin_line": 791,
      "end_line": 793,
      "comment": "\n     * Generates a random value from the {@link PascalDistributionImpl Pascal Distribution}.\n     * This implementation uses {@link #nextInversionDeviate(IntegerDistribution) inversion}\n     * to generate random values.\n     *\n     * @param r the number of successes of the Pascal distribution\n     * @param p the probability of success of the Pascal distribution\n     * @return random value sampled from the Pascal(r, p) distribution\n     * @throws MathException if an error occurs generating the random value\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 792,col 9)-(line 792,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextT(double)",
      "begin_line": 805,
      "end_line": 807,
      "comment": "\n     * Generates a random value from the {@link TDistributionImpl T Distribution}.\n     * This implementation uses {@link #nextInversionDeviate(ContinuousDistribution) inversion}\n     * to generate random values.\n     *\n     * @param df the degrees of freedom of the T distribution\n     * @return random value from the T(df) distribution\n     * @throws MathException if an error occurs generating the random value\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 806,col 9)-(line 806,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextWeibull(double, double)",
      "begin_line": 820,
      "end_line": 822,
      "comment": "\n     * Generates a random value from the {@link WeibullDistributionImpl Weibull Distribution}.\n     * This implementation uses {@link #nextInversionDeviate(ContinuousDistribution) inversion}\n     * to generate random values.\n     *\n     * @param shape the shape parameter of the Weibull distribution\n     * @param scale the scale parameter of the Weibull distribution\n     * @return random value sampled from the Weibull(shape, size) distribution\n     * @throws MathException if an error occurs generating the random value\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 821,col 9)-(line 821,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextZipf(int, double)",
      "begin_line": 835,
      "end_line": 837,
      "comment": "\n     * Generates a random value from the {@link ZipfDistributionImpl Zipf Distribution}.\n     * This implementation uses {@link #nextInversionDeviate(IntegerDistribution) inversion}\n     * to generate random values.\n     *\n     * @param numberOfElements the number of elements of the ZipfDistribution\n     * @param exponent the exponent of the ZipfDistribution\n     * @return random value sampled from the Zipf(numberOfElements, exponent) distribution\n     * @throws MathException if an error occurs generating the random value\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 836,col 9)-(line 836,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.getRan()",
      "begin_line": 848,
      "end_line": 854,
      "comment": "\n     * Returns the RandomGenerator used to generate non-secure random data.\n     * \u003cp\u003e\n     * Creates and initializes a default generator if null.\n     * \u003c/p\u003e\n     *\n     * @return the Random used to generate random data\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 849,col 9)-(line 852,col 9)",
        "(line 853,col 9)-(line 853,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.getSecRan()",
      "begin_line": 864,
      "end_line": 870,
      "comment": "\n     * Returns the SecureRandom used to generate secure random data.\n     * \u003cp\u003e\n     * Creates and initializes if null.\n     * \u003c/p\u003e\n     *\n     * @return the SecureRandom used to generate secure random data\n     ",
      "child_ranges": [
        "(line 865,col 9)-(line 868,col 9)",
        "(line 869,col 9)-(line 869,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.reSeed(long)",
      "begin_line": 881,
      "end_line": 886,
      "comment": "\n     * Reseeds the random number generator with the supplied seed.\n     * \u003cp\u003e\n     * Will create and initialize if null.\n     * \u003c/p\u003e\n     *\n     * @param seed\n     *            the seed value to use\n     ",
      "child_ranges": [
        "(line 882,col 9)-(line 884,col 9)",
        "(line 885,col 9)-(line 885,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.reSeedSecure()",
      "begin_line": 895,
      "end_line": 900,
      "comment": "\n     * Reseeds the secure random number generator with the current time in\n     * milliseconds.\n     * \u003cp\u003e\n     * Will create and initialize if null.\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 896,col 9)-(line 898,col 9)",
        "(line 899,col 9)-(line 899,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.reSeedSecure(long)",
      "begin_line": 911,
      "end_line": 916,
      "comment": "\n     * Reseeds the secure random number generator with the supplied seed.\n     * \u003cp\u003e\n     * Will create and initialize if null.\n     * \u003c/p\u003e\n     *\n     * @param seed\n     *            the seed value to use\n     ",
      "child_ranges": [
        "(line 912,col 9)-(line 914,col 9)",
        "(line 915,col 9)-(line 915,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.reSeed()",
      "begin_line": 922,
      "end_line": 927,
      "comment": "\n     * Reseeds the random number generator with the current time in\n     * milliseconds.\n     ",
      "child_ranges": [
        "(line 923,col 9)-(line 925,col 9)",
        "(line 926,col 9)-(line 926,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.setSecureAlgorithm(java.lang.String, java.lang.String)",
      "begin_line": 949,
      "end_line": 952,
      "comment": "\n     * Sets the PRNG algorithm for the underlying SecureRandom instance using\n     * the Security Provider API. The Security Provider API is defined in \u003ca\n     * href \u003d\n     * \"http://java.sun.com/j2se/1.3/docs/guide/security/CryptoSpec.html#AppA\"\u003e\n     * Java Cryptography Architecture API Specification \u0026 Reference.\u003c/a\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUSAGE NOTE:\u003c/strong\u003e This method carries \u003ci\u003esignificant\u003c/i\u003e\n     * overhead and may take several seconds to execute.\n     * \u003c/p\u003e\n     *\n     * @param algorithm\n     *            the name of the PRNG algorithm\n     * @param provider\n     *            the name of the provider\n     * @throws NoSuchAlgorithmException\n     *             if the specified algorithm is not available\n     * @throws NoSuchProviderException\n     *             if the specified provider is not installed\n     ",
      "child_ranges": [
        "(line 951,col 9)-(line 951,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextPermutation(int, int)",
      "begin_line": 984,
      "end_line": 1002,
      "comment": "\n     * Generates an integer array of length \u003ccode\u003ek\u003c/code\u003e whose entries are\n     * selected randomly, without repetition, from the integers\n     * \u003ccode\u003e0 through n-1\u003c/code\u003e (inclusive).\n     * \u003cp\u003e\n     * Generated arrays represent permutations of \u003ccode\u003en\u003c/code\u003e taken\n     * \u003ccode\u003ek\u003c/code\u003e at a time.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions:\u003c/strong\u003e\n     * \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003ek \u003c\u003d n\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e \u003ccode\u003en \u003e 0\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * If the preconditions are not met, an IllegalArgumentException is thrown.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Uses a 2-cycle permutation shuffle. The shuffling process is described \u003ca\n     * href\u003d\"http://www.maths.abdn.ac.uk/~igc/tch/mx4002/notes/node83.html\"\u003e\n     * here\u003c/a\u003e.\n     * \u003c/p\u003e\n     *\n     * @param n\n     *            domain of the permutation (must be positive)\n     * @param k\n     *            size of the permutation (must satisfy 0 \u003c k \u003c\u003d n).\n     * @return the random permutation as an int array\n     * @throws NumberIsTooLargeException if {@code k \u003e n}.\n     * @throws NotStrictlyPositiveException if {@code k \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 985,col 9)-(line 988,col 9)",
        "(line 989,col 9)-(line 992,col 9)",
        "(line 994,col 9)-(line 994,col 36)",
        "(line 995,col 9)-(line 995,col 30)",
        "(line 996,col 9)-(line 996,col 34)",
        "(line 997,col 9)-(line 999,col 9)",
        "(line 1001,col 9)-(line 1001,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextSample(java.util.Collection\u003c?\u003e, int)",
      "begin_line": 1022,
      "end_line": 1039,
      "comment": "\n     * Uses a 2-cycle permutation shuffle to generate a random permutation.\n     * \u003cstrong\u003eAlgorithm Description\u003c/strong\u003e: Uses a 2-cycle permutation\n     * shuffle to generate a random permutation of \u003ccode\u003ec.size()\u003c/code\u003e and\n     * then returns the elements whose indexes correspond to the elements of the\n     * generated permutation. This technique is described, and proven to\n     * generate random samples, \u003ca\n     * href\u003d\"http://www.maths.abdn.ac.uk/~igc/tch/mx4002/notes/node83.html\"\u003e\n     * here\u003c/a\u003e\n     *\n     * @param c\n     *            Collection to sample from.\n     * @param k\n     *            sample size.\n     * @return the random sample.\n     * @throws NumberIsTooLargeException if {@code k \u003e c.size()}.\n     * @throws NotStrictlyPositiveException if {@code k \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 1023,col 9)-(line 1023,col 27)",
        "(line 1024,col 9)-(line 1027,col 9)",
        "(line 1028,col 9)-(line 1030,col 9)",
        "(line 1032,col 9)-(line 1032,col 39)",
        "(line 1033,col 9)-(line 1033,col 46)",
        "(line 1034,col 9)-(line 1034,col 40)",
        "(line 1035,col 9)-(line 1037,col 9)",
        "(line 1038,col 9)-(line 1038,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextInversionDeviate(org.apache.commons.math.distribution.ContinuousDistribution)",
      "begin_line": 1050,
      "end_line": 1053,
      "comment": "\n     * Generate a random deviate from the given distribution using the\n     * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Inverse_transform_sampling\"\u003e inversion method.\u003c/a\u003e\n     *\n     * @param distribution Continuous distribution to generate a random value from\n     * @return a random value sampled from the given distribution\n     * @throws MathException if an error occurs computing the inverse cumulative distribution function\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 1051,col 9)-(line 1051,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextInversionDeviate(org.apache.commons.math.distribution.IntegerDistribution)",
      "begin_line": 1064,
      "end_line": 1072,
      "comment": "\n     * Generate a random deviate from the given distribution using the\n     * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Inverse_transform_sampling\"\u003e inversion method.\u003c/a\u003e\n     *\n     * @param distribution Integer distribution to generate a random value from\n     * @return a random value sampled from the given distribution\n     * @throws MathException if an error occurs computing the inverse cumulative distribution function\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 1065,col 9)-(line 1065,col 48)",
        "(line 1066,col 9)-(line 1066,col 74)",
        "(line 1067,col 9)-(line 1071,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.shuffle(int[], int)",
      "begin_line": 1085,
      "end_line": 1097,
      "comment": "\n     * Uses a 2-cycle permutation shuffle to randomly re-order the last elements\n     * of list.\n     *\n     * @param list\n     *            list to be shuffled\n     * @param end\n     *            element past which shuffling begins\n     ",
      "child_ranges": [
        "(line 1086,col 9)-(line 1086,col 23)",
        "(line 1087,col 9)-(line 1096,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.getNatural(int)",
      "begin_line": 1106,
      "end_line": 1112,
      "comment": "\n     * Returns an array representing n.\n     *\n     * @param n\n     *            the natural number to represent\n     * @return array with entries \u003d elements of n\n     ",
      "child_ranges": [
        "(line 1107,col 9)-(line 1107,col 35)",
        "(line 1108,col 9)-(line 1110,col 9)",
        "(line 1111,col 9)-(line 1111,col 23)"
      ]
    }
  ]
}