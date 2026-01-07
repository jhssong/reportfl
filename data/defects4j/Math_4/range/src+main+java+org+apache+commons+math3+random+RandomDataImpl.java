{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/random/RandomDataImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RandomDataImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.random.RandomData",
        "java.io.Serializable"
      ],
      "begin_line": 97,
      "end_line": 584,
      "comment": "\n * Generates random deviates and other random data using a {@link RandomGenerator}\n * instance to generate non-secure data and a {@link java.security.SecureRandom}\n * instance to provide data for the \u003ccode\u003enextSecureXxx\u003c/code\u003e methods. If no\n * \u003ccode\u003eRandomGenerator\u003c/code\u003e is provided in the constructor, the default is\n * to use a {@link Well19937c} generator. To plug in a different\n * implementation, either implement \u003ccode\u003eRandomGenerator\u003c/code\u003e directly or\n * extend {@link AbstractRandomGenerator}.\n * \u003cp\u003e\n * Supports reseeding the underlying pseudo-random number generator (PRNG). The\n * \u003ccode\u003eSecurityProvider\u003c/code\u003e and \u003ccode\u003eAlgorithm\u003c/code\u003e used by the\n * \u003ccode\u003eSecureRandom\u003c/code\u003e instance can also be reset.\n * \u003c/p\u003e\n * \u003cp\u003e\n * For details on the default PRNGs, see {@link java.util.Random} and\n * {@link java.security.SecureRandom}.\n * \u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eUsage Notes\u003c/strong\u003e:\n * \u003cul\u003e\n * \u003cli\u003e\n * Instance variables are used to maintain \u003ccode\u003eRandomGenerator\u003c/code\u003e and\n * \u003ccode\u003eSecureRandom\u003c/code\u003e instances used in data generation. Therefore, to\n * generate a random sequence of values or strings, you should use just\n * \u003cstrong\u003eone\u003c/strong\u003e \u003ccode\u003eRandomDataGenerator\u003c/code\u003e instance repeatedly.\u003c/li\u003e\n * \u003cli\u003e\n * The \"secure\" methods are *much* slower. These should be used only when a\n * cryptographically secure random sequence is required. A secure random\n * sequence is a sequence of pseudo-random values which, in addition to being\n * well-dispersed (so no subsequence of values is an any more likely than other\n * subsequence of the the same length), also has the additional property that\n * knowledge of values generated up to any point in the sequence does not make\n * it any easier to predict subsequent values.\u003c/li\u003e\n * \u003cli\u003e\n * When a new \u003ccode\u003eRandomDataGenerator\u003c/code\u003e is created, the underlying random\n * number generators are \u003cstrong\u003enot\u003c/strong\u003e initialized. If you do not\n * explicitly seed the default non-secure generator, it is seeded with the\n * current time in milliseconds plus the system identity hash code on first use.\n * The same holds for the secure generator. If you provide a \u003ccode\u003eRandomGenerator\u003c/code\u003e\n * to the constructor, however, this generator is not reseeded by the constructor\n * nor is it reseeded on first use.\u003c/li\u003e\n * \u003cli\u003e\n * The \u003ccode\u003ereSeed\u003c/code\u003e and \u003ccode\u003ereSeedSecure\u003c/code\u003e methods delegate to the\n * corresponding methods on the underlying \u003ccode\u003eRandomGenerator\u003c/code\u003e and\n * \u003ccode\u003eSecureRandom\u003c/code\u003e instances. Therefore, \u003ccode\u003ereSeed(long)\u003c/code\u003e\n * fully resets the initial state of the non-secure random number generator (so\n * that reseeding with a specific value always results in the same subsequent\n * random sequence); whereas reSeedSecure(long) does \u003cstrong\u003enot\u003c/strong\u003e\n * reinitialize the secure random number generator (so secure sequences started\n * with calls to reseedSecure(long) won\u0027t be identical).\u003c/li\u003e\n * \u003cli\u003e\n * This implementation is not synchronized. The underlying \u003ccode\u003eRandomGenerator\u003c/code\u003e\n * or \u003ccode\u003eSecureRandom\u003c/code\u003e instances are not protected by synchronization and\n * are not guaranteed to be thread-safe.  Therefore, if an instance of this class\n * is concurrently utilized by multiple threads, it is the responsibility of\n * client code to synchronize access to seeding and data generation methods.\n * \u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n * @deprecated to be removed in 4.0.  Use {@link RandomDataGenerator} instead\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "delegate"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": " RandomDataGenerator delegate "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.RandomDataImpl()",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n     * Construct a RandomDataImpl, using a default random generator as the source\n     * of randomness.\n     *\n     * \u003cp\u003eThe default generator is a {@link Well19937c} seeded\n     * with {@code System.currentTimeMillis() + System.identityHashCode(this))}.\n     * The generator is initialized and seeded on first use.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.RandomDataImpl(org.apache.commons.math3.random.RandomGenerator)",
      "begin_line": 126,
      "end_line": 128,
      "comment": "\n     * Construct a RandomDataImpl using the supplied {@link RandomGenerator} as\n     * the source of (non-secure) random data.\n     *\n     * @param rand the source of (non-secure) random data\n     * (may be null, resulting in the default generator)\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.getDelegate()",
      "begin_line": 134,
      "end_line": 137,
      "comment": "\n     * @return the delegate object.\n     * @deprecated To be removed in 4.0.\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.nextHexString(int)",
      "begin_line": 155,
      "end_line": 157,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\n     * \u003cstrong\u003eAlgorithm Description:\u003c/strong\u003e hex strings are generated using a\n     * 2-step process.\n     * \u003col\u003e\n     * \u003cli\u003e{@code len / 2 + 1} binary bytes are generated using the underlying\n     * Random\u003c/li\u003e\n     * \u003cli\u003eEach binary byte is translated into 2 hex digits\u003c/li\u003e\n     * \u003c/ol\u003e\n     * \u003c/p\u003e\n     *\n     * @param len the desired string length.\n     * @return the random string.\n     * @throws NotStrictlyPositiveException if {@code len \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.nextInt(int, int)",
      "begin_line": 160,
      "end_line": 162,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 161,col 8)-(line 161,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.nextLong(long, long)",
      "begin_line": 165,
      "end_line": 167,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.nextSecureHexString(int)",
      "begin_line": 185,
      "end_line": 187,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\n     * \u003cstrong\u003eAlgorithm Description:\u003c/strong\u003e hex strings are generated in\n     * 40-byte segments using a 3-step process.\n     * \u003col\u003e\n     * \u003cli\u003e\n     * 20 random bytes are generated using the underlying\n     * \u003ccode\u003eSecureRandom\u003c/code\u003e.\u003c/li\u003e\n     * \u003cli\u003e\n     * SHA-1 hash is applied to yield a 20-byte binary digest.\u003c/li\u003e\n     * \u003cli\u003e\n     * Each byte of the binary digest is converted to 2 hex digits.\u003c/li\u003e\n     * \u003c/ol\u003e\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.nextSecureInt(int, int)",
      "begin_line": 190,
      "end_line": 192,
      "comment": "  {@inheritDoc} ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.nextSecureLong(long, long)",
      "begin_line": 195,
      "end_line": 197,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.nextPoisson(double)",
      "begin_line": 212,
      "end_line": 214,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\n     * \u003cstrong\u003eAlgorithm Description\u003c/strong\u003e:\n     * \u003cul\u003e\u003cli\u003e For small means, uses simulation of a Poisson process\n     * using Uniform deviates, as described\n     * \u003ca href\u003d\"http://irmi.epfl.ch/cmos/Pmmi/interactive/rng7.htm\"\u003e here.\u003c/a\u003e\n     * The Poisson process (and hence value returned) is bounded by 1000 * mean.\u003c/li\u003e\n     *\n     * \u003cli\u003e For large means, uses the rejection algorithm described in \u003cbr/\u003e\n     * Devroye, Luc. (1981).\u003ci\u003eThe Computer Generation of Poisson Random Variables\u003c/i\u003e\n     * \u003cstrong\u003eComputing\u003c/strong\u003e vol. 26 pp. 197-207.\u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.nextGaussian(double, double)",
      "begin_line": 217,
      "end_line": 219,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.nextExponential(double)",
      "begin_line": 232,
      "end_line": 234,
      "comment": "\n     * {@inheritDoc}\n     *\n     * \u003cp\u003e\n     * \u003cstrong\u003eAlgorithm Description\u003c/strong\u003e: Uses the Algorithm SA (Ahrens)\n     * from p. 876 in:\n     * [1]: Ahrens, J. H. and Dieter, U. (1972). Computer methods for\n     * sampling from the exponential and normal distributions.\n     * Communications of the ACM, 15, 873-882.\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.nextUniform(double, double)",
      "begin_line": 246,
      "end_line": 249,
      "comment": "\n     * {@inheritDoc}\n     *\n     * \u003cp\u003e\n     * \u003cstrong\u003eAlgorithm Description\u003c/strong\u003e: scales the output of\n     * Random.nextDouble(), but rejects 0 values (i.e., will generate another\n     * random double if Random.nextDouble() returns 0). This is necessary to\n     * provide a symmetric output interval (both endpoints excluded).\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.nextUniform(double, double, boolean)",
      "begin_line": 263,
      "end_line": 266,
      "comment": "\n     * {@inheritDoc}\n     *\n     * \u003cp\u003e\n     * \u003cstrong\u003eAlgorithm Description\u003c/strong\u003e: if the lower bound is excluded,\n     * scales the output of Random.nextDouble(), but rejects 0 values (i.e.,\n     * will generate another random double if Random.nextDouble() returns 0).\n     * This is necessary to provide a symmetric output interval (both\n     * endpoints excluded).\n     * \u003c/p\u003e\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.nextBeta(double, double)",
      "begin_line": 278,
      "end_line": 280,
      "comment": "\n     * Generates a random value from the {@link org.apache.commons.math3.distribution.BetaDistribution Beta Distribution}.\n     * This implementation uses {@link #nextInversionDeviate(RealDistribution) inversion}\n     * to generate random values.\n     *\n     * @param alpha first distribution shape parameter\n     * @param beta second distribution shape parameter\n     * @return random value sampled from the beta(alpha, beta) distribution\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.nextBinomial(int, double)",
      "begin_line": 292,
      "end_line": 294,
      "comment": "\n     * Generates a random value from the {@link org.apache.commons.math3.distribution.BinomialDistribution Binomial Distribution}.\n     * This implementation uses {@link #nextInversionDeviate(RealDistribution) inversion}\n     * to generate random values.\n     *\n     * @param numberOfTrials number of trials of the Binomial distribution\n     * @param probabilityOfSuccess probability of success of the Binomial distribution\n     * @return random value sampled from the Binomial(numberOfTrials, probabilityOfSuccess) distribution\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.nextCauchy(double, double)",
      "begin_line": 306,
      "end_line": 308,
      "comment": "\n     * Generates a random value from the {@link org.apache.commons.math3.distribution.CauchyDistribution Cauchy Distribution}.\n     * This implementation uses {@link #nextInversionDeviate(RealDistribution) inversion}\n     * to generate random values.\n     *\n     * @param median the median of the Cauchy distribution\n     * @param scale the scale parameter of the Cauchy distribution\n     * @return random value sampled from the Cauchy(median, scale) distribution\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.nextChiSquare(double)",
      "begin_line": 319,
      "end_line": 321,
      "comment": "\n     * Generates a random value from the {@link org.apache.commons.math3.distribution.ChiSquaredDistribution ChiSquare Distribution}.\n     * This implementation uses {@link #nextInversionDeviate(RealDistribution) inversion}\n     * to generate random values.\n     *\n     * @param df the degrees of freedom of the ChiSquare distribution\n     * @return random value sampled from the ChiSquare(df) distribution\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 320,col 8)-(line 320,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.nextF(double, double)",
      "begin_line": 335,
      "end_line": 337,
      "comment": "\n     * Generates a random value from the {@link org.apache.commons.math3.distribution.FDistribution F Distribution}.\n     * This implementation uses {@link #nextInversionDeviate(RealDistribution) inversion}\n     * to generate random values.\n     *\n     * @param numeratorDf the numerator degrees of freedom of the F distribution\n     * @param denominatorDf the denominator degrees of freedom of the F distribution\n     * @return random value sampled from the F(numeratorDf, denominatorDf) distribution\n     * @throws NotStrictlyPositiveException if\n     * {@code numeratorDf \u003c\u003d 0} or {@code denominatorDf \u003c\u003d 0}.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.nextGamma(double, double)",
      "begin_line": 362,
      "end_line": 364,
      "comment": "\n     * \u003cp\u003eGenerates a random value from the\n     * {@link org.apache.commons.math3.distribution.GammaDistribution Gamma Distribution}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis implementation uses the following algorithms: \u003c/p\u003e\n     *\n     * \u003cp\u003eFor 0 \u003c shape \u003c 1: \u003cbr/\u003e\n     * Ahrens, J. H. and Dieter, U., \u003ci\u003eComputer methods for\n     * sampling from gamma, beta, Poisson and binomial distributions.\u003c/i\u003e\n     * Computing, 12, 223-246, 1974.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor shape \u003e\u003d 1: \u003cbr/\u003e\n     * Marsaglia and Tsang, \u003ci\u003eA Simple Method for Generating\n     * Gamma Variables.\u003c/i\u003e ACM Transactions on Mathematical Software,\n     * Volume 26 Issue 3, September, 2000.\u003c/p\u003e\n     *\n     * @param shape the median of the Gamma distribution\n     * @param scale the scale parameter of the Gamma distribution\n     * @return random value sampled from the Gamma(shape, scale) distribution\n     * @throws NotStrictlyPositiveException if {@code shape \u003c\u003d 0} or\n     * {@code scale \u003c\u003d 0}.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.nextHypergeometric(int, int, int)",
      "begin_line": 381,
      "end_line": 384,
      "comment": "\n     * Generates a random value from the {@link org.apache.commons.math3.distribution.HypergeometricDistribution Hypergeometric Distribution}.\n     * This implementation uses {@link #nextInversionDeviate(IntegerDistribution) inversion}\n     * to generate random values.\n     *\n     * @param populationSize the population size of the Hypergeometric distribution\n     * @param numberOfSuccesses number of successes in the population of the Hypergeometric distribution\n     * @param sampleSize the sample size of the Hypergeometric distribution\n     * @return random value sampled from the Hypergeometric(numberOfSuccesses, sampleSize) distribution\n     * @throws NumberIsTooLargeException  if {@code numberOfSuccesses \u003e populationSize},\n     * or {@code sampleSize \u003e populationSize}.\n     * @throws NotStrictlyPositiveException if {@code populationSize \u003c\u003d 0}.\n     * @throws NotPositiveException  if {@code numberOfSuccesses \u003c 0}.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.nextPascal(int, double)",
      "begin_line": 399,
      "end_line": 402,
      "comment": "\n     * Generates a random value from the {@link org.apache.commons.math3.distribution.PascalDistribution Pascal Distribution}.\n     * This implementation uses {@link #nextInversionDeviate(IntegerDistribution) inversion}\n     * to generate random values.\n     *\n     * @param r the number of successes of the Pascal distribution\n     * @param p the probability of success of the Pascal distribution\n     * @return random value sampled from the Pascal(r, p) distribution\n     * @since 2.2\n     * @throws NotStrictlyPositiveException if the number of successes is not positive\n     * @throws OutOfRangeException if the probability of success is not in the\n     * range {@code [0, 1]}.\n     ",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.nextT(double)",
      "begin_line": 414,
      "end_line": 416,
      "comment": "\n     * Generates a random value from the {@link org.apache.commons.math3.distribution.TDistribution T Distribution}.\n     * This implementation uses {@link #nextInversionDeviate(RealDistribution) inversion}\n     * to generate random values.\n     *\n     * @param df the degrees of freedom of the T distribution\n     * @return random value from the T(df) distribution\n     * @since 2.2\n     * @throws NotStrictlyPositiveException if {@code df \u003c\u003d 0}\n     ",
      "child_ranges": [
        "(line 415,col 9)-(line 415,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.nextWeibull(double, double)",
      "begin_line": 430,
      "end_line": 432,
      "comment": "\n     * Generates a random value from the {@link org.apache.commons.math3.distribution.WeibullDistribution Weibull Distribution}.\n     * This implementation uses {@link #nextInversionDeviate(RealDistribution) inversion}\n     * to generate random values.\n     *\n     * @param shape the shape parameter of the Weibull distribution\n     * @param scale the scale parameter of the Weibull distribution\n     * @return random value sampled from the Weibull(shape, size) distribution\n     * @since 2.2\n     * @throws NotStrictlyPositiveException if {@code shape \u003c\u003d 0} or\n     * {@code scale \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 431,col 9)-(line 431,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.nextZipf(int, double)",
      "begin_line": 446,
      "end_line": 448,
      "comment": "\n     * Generates a random value from the {@link org.apache.commons.math3.distribution.ZipfDistribution Zipf Distribution}.\n     * This implementation uses {@link #nextInversionDeviate(IntegerDistribution) inversion}\n     * to generate random values.\n     *\n     * @param numberOfElements the number of elements of the ZipfDistribution\n     * @param exponent the exponent of the ZipfDistribution\n     * @return random value sampled from the Zipf(numberOfElements, exponent) distribution\n     * @since 2.2\n     * @exception NotStrictlyPositiveException if {@code numberOfElements \u003c\u003d 0}\n     * or {@code exponent \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 447,col 9)-(line 447,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.reSeed(long)",
      "begin_line": 460,
      "end_line": 462,
      "comment": "\n     * Reseeds the random number generator with the supplied seed.\n     * \u003cp\u003e\n     * Will create and initialize if null.\n     * \u003c/p\u003e\n     *\n     * @param seed\n     *            the seed value to use\n     ",
      "child_ranges": [
        "(line 461,col 9)-(line 461,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.reSeedSecure()",
      "begin_line": 471,
      "end_line": 473,
      "comment": "\n     * Reseeds the secure random number generator with the current time in\n     * milliseconds.\n     * \u003cp\u003e\n     * Will create and initialize if null.\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.reSeedSecure(long)",
      "begin_line": 484,
      "end_line": 486,
      "comment": "\n     * Reseeds the secure random number generator with the supplied seed.\n     * \u003cp\u003e\n     * Will create and initialize if null.\n     * \u003c/p\u003e\n     *\n     * @param seed\n     *            the seed value to use\n     ",
      "child_ranges": [
        "(line 485,col 9)-(line 485,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.reSeed()",
      "begin_line": 492,
      "end_line": 494,
      "comment": "\n     * Reseeds the random number generator with\n     * {@code System.currentTimeMillis() + System.identityHashCode(this))}.\n     ",
      "child_ranges": [
        "(line 493,col 9)-(line 493,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.setSecureAlgorithm(java.lang.String, java.lang.String)",
      "begin_line": 516,
      "end_line": 519,
      "comment": "\n     * Sets the PRNG algorithm for the underlying SecureRandom instance using\n     * the Security Provider API. The Security Provider API is defined in \u003ca\n     * href \u003d\n     * \"http://java.sun.com/j2se/1.3/docs/guide/security/CryptoSpec.html#AppA\"\u003e\n     * Java Cryptography Architecture API Specification \u0026 Reference.\u003c/a\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUSAGE NOTE:\u003c/strong\u003e This method carries \u003ci\u003esignificant\u003c/i\u003e\n     * overhead and may take several seconds to execute.\n     * \u003c/p\u003e\n     *\n     * @param algorithm\n     *            the name of the PRNG algorithm\n     * @param provider\n     *            the name of the provider\n     * @throws NoSuchAlgorithmException\n     *             if the specified algorithm is not available\n     * @throws NoSuchProviderException\n     *             if the specified provider is not installed\n     ",
      "child_ranges": [
        "(line 518,col 8)-(line 518,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.nextPermutation(int, int)",
      "begin_line": 530,
      "end_line": 533,
      "comment": "\n     * {@inheritDoc}\n     *\n     * \u003cp\u003e\n     * Uses a 2-cycle permutation shuffle. The shuffling process is described \u003ca\n     * href\u003d\"http://www.maths.abdn.ac.uk/~igc/tch/mx4002/notes/node83.html\"\u003e\n     * here\u003c/a\u003e.\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 532,col 9)-(line 532,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.nextSample(java.util.Collection\u003c?\u003e, int)",
      "begin_line": 548,
      "end_line": 551,
      "comment": "\n     * {@inheritDoc}\n     *\n     * \u003cp\u003e\n     * \u003cstrong\u003eAlgorithm Description\u003c/strong\u003e: Uses a 2-cycle permutation\n     * shuffle to generate a random permutation of \u003ccode\u003ec.size()\u003c/code\u003e and\n     * then returns the elements whose indexes correspond to the elements of the\n     * generated permutation. This technique is described, and proven to\n     * generate random samples \u003ca\n     * href\u003d\"http://www.maths.abdn.ac.uk/~igc/tch/mx4002/notes/node83.html\"\u003e\n     * here\u003c/a\u003e\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 550,col 9)-(line 550,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.nextInversionDeviate(org.apache.commons.math3.distribution.RealDistribution)",
      "begin_line": 563,
      "end_line": 567,
      "comment": "\n     * Generate a random deviate from the given distribution using the\n     * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Inverse_transform_sampling\"\u003e inversion method.\u003c/a\u003e\n     *\n     * @param distribution Continuous distribution to generate a random value from\n     * @return a random value sampled from the given distribution\n     * @throws MathIllegalArgumentException if the underlynig distribution throws one\n     * @since 2.2\n     * @deprecated use the distribution\u0027s sample() method\n     ",
      "child_ranges": [
        "(line 565,col 9)-(line 565,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataImpl.nextInversionDeviate(org.apache.commons.math3.distribution.IntegerDistribution)",
      "begin_line": 579,
      "end_line": 582,
      "comment": "\n     * Generate a random deviate from the given distribution using the\n     * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Inverse_transform_sampling\"\u003e inversion method.\u003c/a\u003e\n     *\n     * @param distribution Integer distribution to generate a random value from\n     * @return a random value sampled from the given distribution\n     * @throws MathIllegalArgumentException if the underlynig distribution throws one\n     * @since 2.2\n     * @deprecated use the distribution\u0027s sample() method\n     ",
      "child_ranges": [
        "(line 581,col 9)-(line 581,col 76)"
      ]
    }
  ]
}