{
  "filepath": "/tmp/Math-1b/src/main/java/org/apache/commons/math3/random/RandomDataGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RandomDataGenerator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.random.RandomData",
        "java.io.Serializable"
      ],
      "begin_line": 113,
      "end_line": 797,
      "comment": "\n * Implements the {@link RandomData} interface using a {@link RandomGenerator}\n * instance to generate non-secure data and a {@link java.security.SecureRandom}\n * instance to provide data for the \u003ccode\u003enextSecureXxx\u003c/code\u003e methods. If no\n * \u003ccode\u003eRandomGenerator\u003c/code\u003e is provided in the constructor, the default is\n * to use a {@link Well19937c} generator. To plug in a different\n * implementation, either implement \u003ccode\u003eRandomGenerator\u003c/code\u003e directly or\n * extend {@link AbstractRandomGenerator}.\n * \u003cp\u003e\n * Supports reseeding the underlying pseudo-random number generator (PRNG). The\n * \u003ccode\u003eSecurityProvider\u003c/code\u003e and \u003ccode\u003eAlgorithm\u003c/code\u003e used by the\n * \u003ccode\u003eSecureRandom\u003c/code\u003e instance can also be reset.\n * \u003c/p\u003e\n * \u003cp\u003e\n * For details on the default PRNGs, see {@link java.util.Random} and\n * {@link java.security.SecureRandom}.\n * \u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eUsage Notes\u003c/strong\u003e:\n * \u003cul\u003e\n * \u003cli\u003e\n * Instance variables are used to maintain \u003ccode\u003eRandomGenerator\u003c/code\u003e and\n * \u003ccode\u003eSecureRandom\u003c/code\u003e instances used in data generation. Therefore, to\n * generate a random sequence of values or strings, you should use just\n * \u003cstrong\u003eone\u003c/strong\u003e \u003ccode\u003eRandomDataImpl\u003c/code\u003e instance repeatedly.\u003c/li\u003e\n * \u003cli\u003e\n * The \"secure\" methods are *much* slower. These should be used only when a\n * cryptographically secure random sequence is required. A secure random\n * sequence is a sequence of pseudo-random values which, in addition to being\n * well-dispersed (so no subsequence of values is an any more likely than other\n * subsequence of the the same length), also has the additional property that\n * knowledge of values generated up to any point in the sequence does not make\n * it any easier to predict subsequent values.\u003c/li\u003e\n * \u003cli\u003e\n * When a new \u003ccode\u003eRandomDataImpl\u003c/code\u003e is created, the underlying random\n * number generators are \u003cstrong\u003enot\u003c/strong\u003e initialized. If you do not\n * explicitly seed the default non-secure generator, it is seeded with the\n * current time in milliseconds plus the system identity hash code on first use.\n * The same holds for the secure generator. If you provide a \u003ccode\u003eRandomGenerator\u003c/code\u003e\n * to the constructor, however, this generator is not reseeded by the constructor\n * nor is it reseeded on first use.\u003c/li\u003e\n * \u003cli\u003e\n * The \u003ccode\u003ereSeed\u003c/code\u003e and \u003ccode\u003ereSeedSecure\u003c/code\u003e methods delegate to the\n * corresponding methods on the underlying \u003ccode\u003eRandomGenerator\u003c/code\u003e and\n * \u003ccode\u003eSecureRandom\u003c/code\u003e instances. Therefore, \u003ccode\u003ereSeed(long)\u003c/code\u003e\n * fully resets the initial state of the non-secure random number generator (so\n * that reseeding with a specific value always results in the same subsequent\n * random sequence); whereas reSeedSecure(long) does \u003cstrong\u003enot\u003c/strong\u003e\n * reinitialize the secure random number generator (so secure sequences started\n * with calls to reseedSecure(long) won\u0027t be identical).\u003c/li\u003e\n * \u003cli\u003e\n * This implementation is not synchronized. The underlying \u003ccode\u003eRandomGenerator\u003c/code\u003e\n * or \u003ccode\u003eSecureRandom\u003c/code\u003e instances are not protected by synchronization and\n * are not guaranteed to be thread-safe.  Therefore, if an instance of this class\n * is concurrently utilized by multiple threads, it is the responsibility of\n * client code to synchronize access to seeding and data generation methods.\n * \u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n * @since 3.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "rand"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": " underlying random number generator "
    },
    {
      "type": "field",
      "varNames": [
        "secRand"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": " underlying secure random number generator "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.RandomDataGenerator.RandomDataGenerator()",
      "begin_line": 132,
      "end_line": 133,
      "comment": "\n     * Construct a RandomDataGenerator, using a default random generator as the source\n     * of randomness.\n     *\n     * \u003cp\u003eThe default generator is a {@link Well19937c} seeded\n     * with {@code System.currentTimeMillis() + System.identityHashCode(this))}.\n     * The generator is initialized and seeded on first use.\u003c/p\u003e\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.RandomDataGenerator.RandomDataGenerator(org.apache.commons.math3.random.RandomGenerator)",
      "begin_line": 142,
      "end_line": 144,
      "comment": "\n     * Construct a RandomDataGenerator using the supplied {@link RandomGenerator} as\n     * the source of (non-secure) random data.\n     *\n     * @param rand the source of (non-secure) random data\n     * (may be null, resulting in the default generator)\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataGenerator.nextHexString(int)",
      "begin_line": 162,
      "end_line": 195,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\n     * \u003cstrong\u003eAlgorithm Description:\u003c/strong\u003e hex strings are generated using a\n     * 2-step process.\n     * \u003col\u003e\n     * \u003cli\u003e{@code len / 2 + 1} binary bytes are generated using the underlying\n     * Random\u003c/li\u003e\n     * \u003cli\u003eEach binary byte is translated into 2 hex digits\u003c/li\u003e\n     * \u003c/ol\u003e\n     * \u003c/p\u003e\n     *\n     * @param len the desired string length.\n     * @return the random string.\n     * @throws NotStrictlyPositiveException if {@code len \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 165,col 9)",
        "(line 168,col 9)-(line 168,col 51)",
        "(line 171,col 9)-(line 171,col 54)",
        "(line 174,col 9)-(line 174,col 53)",
        "(line 175,col 9)-(line 175,col 35)",
        "(line 178,col 9)-(line 193,col 9)",
        "(line 194,col 9)-(line 194,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataGenerator.nextInt(int, int)",
      "begin_line": 198,
      "end_line": 200,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataGenerator.nextLong(long, long)",
      "begin_line": 203,
      "end_line": 226,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 204,col 9)-(line 207,col 9)",
        "(line 208,col 9)-(line 208,col 45)",
        "(line 209,col 9)-(line 225,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataGenerator.nextLong(org.apache.commons.math3.random.RandomGenerator, long)",
      "begin_line": 240,
      "end_line": 257,
      "comment": "\n     * Returns a pseudorandom, uniformly distributed \u003ctt\u003elong\u003c/tt\u003e value\n     * between 0 (inclusive) and the specified value (exclusive), drawn from\n     * this random number generator\u0027s sequence.\n     *\n     * @param rng random generator to use\n     * @param n the bound on the random number to be returned.  Must be\n     * positive.\n     * @return  a pseudorandom, uniformly distributed \u003ctt\u003elong\u003c/tt\u003e\n     * value between 0 (inclusive) and n (exclusive).\n     * @throws IllegalArgumentException  if n is not positive.\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 255,col 9)",
        "(line 256,col 9)-(line 256,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataGenerator.nextSecureHexString(int)",
      "begin_line": 276,
      "end_line": 323,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\n     * \u003cstrong\u003eAlgorithm Description:\u003c/strong\u003e hex strings are generated in\n     * 40-byte segments using a 3-step process.\n     * \u003col\u003e\n     * \u003cli\u003e\n     * 20 random bytes are generated using the underlying\n     * \u003ccode\u003eSecureRandom\u003c/code\u003e.\u003c/li\u003e\n     * \u003cli\u003e\n     * SHA-1 hash is applied to yield a 20-byte binary digest.\u003c/li\u003e\n     * \u003cli\u003e\n     * Each byte of the binary digest is converted to 2 hex digits.\u003c/li\u003e\n     * \u003c/ol\u003e\n     * \u003c/p\u003e\n     * @throws NotStrictlyPositiveException if {@code len \u003c\u003d 0}\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 279,col 9)",
        "(line 282,col 9)-(line 282,col 51)",
        "(line 283,col 9)-(line 283,col 33)",
        "(line 284,col 9)-(line 289,col 9)",
        "(line 290,col 9)-(line 290,col 20)",
        "(line 293,col 9)-(line 293,col 37)",
        "(line 295,col 9)-(line 295,col 54)",
        "(line 296,col 9)-(line 321,col 9)",
        "(line 322,col 9)-(line 322,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataGenerator.nextSecureInt(int, int)",
      "begin_line": 326,
      "end_line": 328,
      "comment": "  {@inheritDoc} ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataGenerator.nextSecureLong(long, long)",
      "begin_line": 331,
      "end_line": 354,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 332,col 9)-(line 335,col 9)",
        "(line 336,col 9)-(line 336,col 48)",
        "(line 337,col 9)-(line 337,col 45)",
        "(line 338,col 9)-(line 353,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataGenerator.nextPoisson(double)",
      "begin_line": 370,
      "end_line": 374,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\n     * \u003cstrong\u003eAlgorithm Description\u003c/strong\u003e:\n     * \u003cul\u003e\u003cli\u003e For small means, uses simulation of a Poisson process\n     * using Uniform deviates, as described\n     * \u003ca href\u003d\"http://irmi.epfl.ch/cmos/Pmmi/interactive/rng7.htm\"\u003e here.\u003c/a\u003e\n     * The Poisson process (and hence value returned) is bounded by 1000 * mean.\u003c/li\u003e\n     *\n     * \u003cli\u003e For large means, uses the rejection algorithm described in \u003cbr/\u003e\n     * Devroye, Luc. (1981).\u003ci\u003eThe Computer Generation of Poisson Random Variables\u003c/i\u003e\n     * \u003cstrong\u003eComputing\u003c/strong\u003e vol. 26 pp. 197-207.\u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     * @throws NotStrictlyPositiveException if {@code len \u003c\u003d 0}\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 373,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataGenerator.nextGaussian(double, double)",
      "begin_line": 377,
      "end_line": 382,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 378,col 9)-(line 380,col 9)",
        "(line 381,col 9)-(line 381,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataGenerator.nextExponential(double)",
      "begin_line": 395,
      "end_line": 398,
      "comment": "\n     * {@inheritDoc}\n     *\n     * \u003cp\u003e\n     * \u003cstrong\u003eAlgorithm Description\u003c/strong\u003e: Uses the Algorithm SA (Ahrens)\n     * from p. 876 in:\n     * [1]: Ahrens, J. H. and Dieter, U. (1972). Computer methods for\n     * sampling from the exponential and normal distributions.\n     * Communications of the ACM, 15, 873-882.\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 396,col 9)-(line 397,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataGenerator.nextGamma(double, double)",
      "begin_line": 422,
      "end_line": 425,
      "comment": "\n     * \u003cp\u003eGenerates a random value from the\n     * {@link org.apache.commons.math3.distribution.GammaDistribution Gamma Distribution}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis implementation uses the following algorithms: \u003c/p\u003e\n     *\n     * \u003cp\u003eFor 0 \u003c shape \u003c 1: \u003cbr/\u003e\n     * Ahrens, J. H. and Dieter, U., \u003ci\u003eComputer methods for\n     * sampling from gamma, beta, Poisson and binomial distributions.\u003c/i\u003e\n     * Computing, 12, 223-246, 1974.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor shape \u003e\u003d 1: \u003cbr/\u003e\n     * Marsaglia and Tsang, \u003ci\u003eA Simple Method for Generating\n     * Gamma Variables.\u003c/i\u003e ACM Transactions on Mathematical Software,\n     * Volume 26 Issue 3, September, 2000.\u003c/p\u003e\n     *\n     * @param shape the median of the Gamma distribution\n     * @param scale the scale parameter of the Gamma distribution\n     * @return random value sampled from the Gamma(shape, scale) distribution\n     * @throws NotStrictlyPositiveException if {@code shape \u003c\u003d 0} or\n     * {@code scale \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 423,col 9)-(line 424,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataGenerator.nextHypergeometric(int, int, int)",
      "begin_line": 439,
      "end_line": 442,
      "comment": "\n     * Generates a random value from the {@link HypergeometricDistribution Hypergeometric Distribution}.\n     *\n     * @param populationSize the population size of the Hypergeometric distribution\n     * @param numberOfSuccesses number of successes in the population of the Hypergeometric distribution\n     * @param sampleSize the sample size of the Hypergeometric distribution\n     * @return random value sampled from the Hypergeometric(numberOfSuccesses, sampleSize) distribution\n     * @throws NumberIsTooLargeException  if {@code numberOfSuccesses \u003e populationSize},\n     * or {@code sampleSize \u003e populationSize}.\n     * @throws NotStrictlyPositiveException if {@code populationSize \u003c\u003d 0}.\n     * @throws NotPositiveException  if {@code numberOfSuccesses \u003c 0}.\n     ",
      "child_ranges": [
        "(line 440,col 9)-(line 441,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataGenerator.nextPascal(int, double)",
      "begin_line": 454,
      "end_line": 456,
      "comment": "\n     * Generates a random value from the {@link PascalDistribution Pascal Distribution}.\n     *\n     * @param r the number of successes of the Pascal distribution\n     * @param p the probability of success of the Pascal distribution\n     * @return random value sampled from the Pascal(r, p) distribution\n     * @throws NotStrictlyPositiveException if the number of successes is not positive\n     * @throws OutOfRangeException if the probability of success is not in the\n     * range {@code [0, 1]}.\n     ",
      "child_ranges": [
        "(line 455,col 9)-(line 455,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataGenerator.nextT(double)",
      "begin_line": 465,
      "end_line": 468,
      "comment": "\n     * Generates a random value from the {@link TDistribution T Distribution}.\n     *\n     * @param df the degrees of freedom of the T distribution\n     * @return random value from the T(df) distribution\n     * @throws NotStrictlyPositiveException if {@code df \u003c\u003d 0}\n     ",
      "child_ranges": [
        "(line 466,col 9)-(line 467,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataGenerator.nextWeibull(double, double)",
      "begin_line": 479,
      "end_line": 482,
      "comment": "\n     * Generates a random value from the {@link WeibullDistribution Weibull Distribution}.\n     *\n     * @param shape the shape parameter of the Weibull distribution\n     * @param scale the scale parameter of the Weibull distribution\n     * @return random value sampled from the Weibull(shape, size) distribution\n     * @throws NotStrictlyPositiveException if {@code shape \u003c\u003d 0} or\n     * {@code scale \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 480,col 9)-(line 481,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataGenerator.nextZipf(int, double)",
      "begin_line": 493,
      "end_line": 495,
      "comment": "\n     * Generates a random value from the {@link ZipfDistribution Zipf Distribution}.\n     *\n     * @param numberOfElements the number of elements of the ZipfDistribution\n     * @param exponent the exponent of the ZipfDistribution\n     * @return random value sampled from the Zipf(numberOfElements, exponent) distribution\n     * @exception NotStrictlyPositiveException if {@code numberOfElements \u003c\u003d 0}\n     * or {@code exponent \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 494,col 9)-(line 494,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataGenerator.nextBeta(double, double)",
      "begin_line": 504,
      "end_line": 507,
      "comment": "\n     * Generates a random value from the {@link BetaDistribution Beta Distribution}.\n     *\n     * @param alpha first distribution shape parameter\n     * @param beta second distribution shape parameter\n     * @return random value sampled from the beta(alpha, beta) distribution\n     ",
      "child_ranges": [
        "(line 505,col 9)-(line 506,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataGenerator.nextBinomial(int, double)",
      "begin_line": 516,
      "end_line": 518,
      "comment": "\n     * Generates a random value from the {@link BinomialDistribution Binomial Distribution}.\n     *\n     * @param numberOfTrials number of trials of the Binomial distribution\n     * @param probabilityOfSuccess probability of success of the Binomial distribution\n     * @return random value sampled from the Binomial(numberOfTrials, probabilityOfSuccess) distribution\n     ",
      "child_ranges": [
        "(line 517,col 9)-(line 517,col 109)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataGenerator.nextCauchy(double, double)",
      "begin_line": 527,
      "end_line": 530,
      "comment": "\n     * Generates a random value from the {@link CauchyDistribution Cauchy Distribution}.\n     *\n     * @param median the median of the Cauchy distribution\n     * @param scale the scale parameter of the Cauchy distribution\n     * @return random value sampled from the Cauchy(median, scale) distribution\n     ",
      "child_ranges": [
        "(line 528,col 9)-(line 529,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataGenerator.nextChiSquare(double)",
      "begin_line": 538,
      "end_line": 541,
      "comment": "\n     * Generates a random value from the {@link ChiSquaredDistribution ChiSquare Distribution}.\n     *\n     * @param df the degrees of freedom of the ChiSquare distribution\n     * @return random value sampled from the ChiSquare(df) distribution\n     ",
      "child_ranges": [
        "(line 539,col 9)-(line 540,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataGenerator.nextF(double, double)",
      "begin_line": 552,
      "end_line": 555,
      "comment": "\n     * Generates a random value from the {@link FDistribution F Distribution}.\n     *\n     * @param numeratorDf the numerator degrees of freedom of the F distribution\n     * @param denominatorDf the denominator degrees of freedom of the F distribution\n     * @return random value sampled from the F(numeratorDf, denominatorDf) distribution\n     * @throws NotStrictlyPositiveException if\n     * {@code numeratorDf \u003c\u003d 0} or {@code denominatorDf \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 553,col 9)-(line 554,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataGenerator.nextUniform(double, double)",
      "begin_line": 570,
      "end_line": 573,
      "comment": "\n     * {@inheritDoc}\n     *\n     * \u003cp\u003e\n     * \u003cstrong\u003eAlgorithm Description\u003c/strong\u003e: scales the output of\n     * Random.nextDouble(), but rejects 0 values (i.e., will generate another\n     * random double if Random.nextDouble() returns 0). This is necessary to\n     * provide a symmetric output interval (both endpoints excluded).\n     * \u003c/p\u003e\n     * @throws NumberIsTooLargeException if {@code lower \u003e\u003d upper}\n     * @throws NotFiniteNumberException if one of the bounds is infinite\n     * @throws NotANumberException if one of the bounds is NaN\n     ",
      "child_ranges": [
        "(line 572,col 9)-(line 572,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataGenerator.nextUniform(double, double, boolean)",
      "begin_line": 590,
      "end_line": 618,
      "comment": "\n     * {@inheritDoc}\n     *\n     * \u003cp\u003e\n     * \u003cstrong\u003eAlgorithm Description\u003c/strong\u003e: if the lower bound is excluded,\n     * scales the output of Random.nextDouble(), but rejects 0 values (i.e.,\n     * will generate another random double if Random.nextDouble() returns 0).\n     * This is necessary to provide a symmetric output interval (both\n     * endpoints excluded).\n     * \u003c/p\u003e\n     *\n     * @throws NumberIsTooLargeException if {@code lower \u003e\u003d upper}\n     * @throws NotFiniteNumberException if one of the bounds is infinite\n     * @throws NotANumberException if one of the bounds is NaN\n     ",
      "child_ranges": [
        "(line 593,col 9)-(line 596,col 9)",
        "(line 598,col 9)-(line 600,col 9)",
        "(line 601,col 9)-(line 603,col 9)",
        "(line 605,col 9)-(line 607,col 9)",
        "(line 609,col 9)-(line 609,col 63)",
        "(line 612,col 9)-(line 612,col 42)",
        "(line 613,col 9)-(line 615,col 9)",
        "(line 617,col 9)-(line 617,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataGenerator.nextPermutation(int, int)",
      "begin_line": 630,
      "end_line": 646,
      "comment": "\n     * {@inheritDoc}\n     *\n     * This method calls {@link MathArrays#shuffle(int[],RandomGenerator)\n     * MathArrays.shuffle} in order to create a random shuffle of the set\n     * of natural numbers {@code { 0, 1, ..., n - 1 }}.\n     *\n     * @throws NumberIsTooLargeException if {@code k \u003e n}.\n     * @throws NotStrictlyPositiveException if {@code k \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 632,col 9)-(line 635,col 9)",
        "(line 636,col 9)-(line 639,col 9)",
        "(line 641,col 9)-(line 641,col 36)",
        "(line 642,col 9)-(line 642,col 56)",
        "(line 645,col 9)-(line 645,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataGenerator.nextSample(java.util.Collection\u003c?\u003e, int)",
      "begin_line": 654,
      "end_line": 672,
      "comment": "\n     * {@inheritDoc}\n     *\n     * This method calls {@link #nextPermutation(int,int) nextPermutation(c.size(), k)}\n     * in order to sample the collection.\n     ",
      "child_ranges": [
        "(line 656,col 9)-(line 656,col 27)",
        "(line 657,col 9)-(line 660,col 9)",
        "(line 661,col 9)-(line 663,col 9)",
        "(line 665,col 9)-(line 665,col 39)",
        "(line 666,col 9)-(line 666,col 46)",
        "(line 667,col 9)-(line 667,col 40)",
        "(line 668,col 9)-(line 670,col 9)",
        "(line 671,col 9)-(line 671,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataGenerator.reSeed(long)",
      "begin_line": 684,
      "end_line": 686,
      "comment": "\n     * Reseeds the random number generator with the supplied seed.\n     * \u003cp\u003e\n     * Will create and initialize if null.\n     * \u003c/p\u003e\n     *\n     * @param seed the seed value to use\n     ",
      "child_ranges": [
        "(line 685,col 8)-(line 685,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataGenerator.reSeedSecure()",
      "begin_line": 695,
      "end_line": 697,
      "comment": "\n     * Reseeds the secure random number generator with the current time in\n     * milliseconds.\n     * \u003cp\u003e\n     * Will create and initialize if null.\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 696,col 9)-(line 696,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataGenerator.reSeedSecure(long)",
      "begin_line": 707,
      "end_line": 709,
      "comment": "\n     * Reseeds the secure random number generator with the supplied seed.\n     * \u003cp\u003e\n     * Will create and initialize if null.\n     * \u003c/p\u003e\n     *\n     * @param seed the seed value to use\n     ",
      "child_ranges": [
        "(line 708,col 9)-(line 708,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataGenerator.reSeed()",
      "begin_line": 715,
      "end_line": 717,
      "comment": "\n     * Reseeds the random number generator with\n     * {@code System.currentTimeMillis() + System.identityHashCode(this))}.\n     ",
      "child_ranges": [
        "(line 716,col 9)-(line 716,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataGenerator.setSecureAlgorithm(java.lang.String, java.lang.String)",
      "begin_line": 735,
      "end_line": 738,
      "comment": "\n     * Sets the PRNG algorithm for the underlying SecureRandom instance using\n     * the Security Provider API. The Security Provider API is defined in \u003ca\n     * href \u003d\n     * \"http://java.sun.com/j2se/1.3/docs/guide/security/CryptoSpec.html#AppA\"\u003e\n     * Java Cryptography Architecture API Specification \u0026 Reference.\u003c/a\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUSAGE NOTE:\u003c/strong\u003e This method carries \u003ci\u003esignificant\u003c/i\u003e\n     * overhead and may take several seconds to execute.\n     * \u003c/p\u003e\n     *\n     * @param algorithm the name of the PRNG algorithm\n     * @param provider the name of the provider\n     * @throws NoSuchAlgorithmException if the specified algorithm is not available\n     * @throws NoSuchProviderException if the specified provider is not installed\n     ",
      "child_ranges": [
        "(line 737,col 9)-(line 737,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataGenerator.getRandomGenerator()",
      "begin_line": 751,
      "end_line": 756,
      "comment": "\n     * Returns the RandomGenerator used to generate non-secure random data.\n     * \u003cp\u003e\n     * Creates and initializes a default generator if null. Uses a {@link Well19937c}\n     * generator with {@code System.currentTimeMillis() + System.identityHashCode(this))}\n     * as the default seed.\n     * \u003c/p\u003e\n     *\n     * @return the Random used to generate random data\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 752,col 9)-(line 754,col 9)",
        "(line 755,col 9)-(line 755,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataGenerator.initRan()",
      "begin_line": 762,
      "end_line": 764,
      "comment": "\n     * Sets the default generator to a {@link Well19937c} generator seeded with\n     * {@code System.currentTimeMillis() + System.identityHashCode(this))}.\n     ",
      "child_ranges": [
        "(line 763,col 9)-(line 763,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataGenerator.getSecRan()",
      "begin_line": 776,
      "end_line": 782,
      "comment": "\n     * Returns the SecureRandom used to generate secure random data.\n     * \u003cp\u003e\n     * Creates and initializes if null.  Uses\n     * {@code System.currentTimeMillis() + System.identityHashCode(this)} as the default seed.\n     * \u003c/p\u003e\n     *\n     * @return the SecureRandom used to generate secure random data, wrapped in a\n     * {@link RandomGenerator}.\n     ",
      "child_ranges": [
        "(line 777,col 9)-(line 780,col 9)",
        "(line 781,col 9)-(line 781,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomDataGenerator.getNatural(int)",
      "begin_line": 790,
      "end_line": 796,
      "comment": "\n     * Returns an array representing n.\n     *\n     * @param n the natural number to represent\n     * @return array with entries \u003d elements of n\n     ",
      "child_ranges": [
        "(line 791,col 9)-(line 791,col 35)",
        "(line 792,col 9)-(line 794,col 9)",
        "(line 795,col 9)-(line 795,col 23)"
      ]
    }
  ]
}