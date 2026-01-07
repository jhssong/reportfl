{
  "filepath": "/tmp/Math-63b/src/main/java/org/apache/commons/math/random/RandomDataImpl.java",
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
      "end_line": 966,
      "comment": "\n * Implements the {@link RandomData} interface using a {@link RandomGenerator}\n * instance to generate non-secure data and a {@link java.security.SecureRandom}\n * instance to provide data for the \u003ccode\u003enextSecureXxx\u003c/code\u003e methods. If no\n * \u003ccode\u003eRandomGenerator\u003c/code\u003e is provided in the constructor, the default is\n * to use a generator based on {@link java.util.Random}. To plug in a different\n * implementation, either implement \u003ccode\u003eRandomGenerator\u003c/code\u003e directly or\n * extend {@link AbstractRandomGenerator}.\n * \u003cp\u003e\n * Supports reseeding the underlying pseudo-random number generator (PRNG). The\n * \u003ccode\u003eSecurityProvider\u003c/code\u003e and \u003ccode\u003eAlgorithm\u003c/code\u003e used by the\n * \u003ccode\u003eSecureRandom\u003c/code\u003e instance can also be reset.\n * \u003c/p\u003e\n * \u003cp\u003e\n * For details on the default PRNGs, see {@link java.util.Random} and\n * {@link java.security.SecureRandom}.\n * \u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eUsage Notes\u003c/strong\u003e:\n * \u003cul\u003e\n * \u003cli\u003e\n * Instance variables are used to maintain \u003ccode\u003eRandomGenerator\u003c/code\u003e and\n * \u003ccode\u003eSecureRandom\u003c/code\u003e instances used in data generation. Therefore, to\n * generate a random sequence of values or strings, you should use just\n * \u003cstrong\u003eone\u003c/strong\u003e \u003ccode\u003eRandomDataImpl\u003c/code\u003e instance repeatedly.\u003c/li\u003e\n * \u003cli\u003e\n * The \"secure\" methods are *much* slower. These should be used only when a\n * cryptographically secure random sequence is required. A secure random\n * sequence is a sequence of pseudo-random values which, in addition to being\n * well-dispersed (so no subsequence of values is an any more likely than other\n * subsequence of the the same length), also has the additional property that\n * knowledge of values generated up to any point in the sequence does not make\n * it any easier to predict subsequent values.\u003c/li\u003e\n * \u003cli\u003e\n * When a new \u003ccode\u003eRandomDataImpl\u003c/code\u003e is created, the underlying random\n * number generators are \u003cstrong\u003enot\u003c/strong\u003e initialized. If you do not\n * explicitly seed the default non-secure generator, it is seeded with the\n * current time in milliseconds on first use. The same holds for the secure\n * generator. If you provide a \u003ccode\u003eRandomGenerator\u003c/code\u003e to the constructor,\n * however, this generator is not reseeded by the constructor nor is it reseeded\n * on first use.\u003c/li\u003e\n * \u003cli\u003e\n * The \u003ccode\u003ereSeed\u003c/code\u003e and \u003ccode\u003ereSeedSecure\u003c/code\u003e methods delegate to the\n * corresponding methods on the underlying \u003ccode\u003eRandomGenerator\u003c/code\u003e and\n * \u003ccode\u003eSecureRandom\u003c/code\u003e instances. Therefore, \u003ccode\u003ereSeed(long)\u003c/code\u003e\n * fully resets the initial state of the non-secure random number generator (so\n * that reseeding with a specific value always results in the same subsequent\n * random sequence); whereas reSeedSecure(long) does \u003cstrong\u003enot\u003c/strong\u003e\n * reinitialize the secure random number generator (so secure sequences started\n * with calls to reseedSecure(long) won\u0027t be identical).\u003c/li\u003e\n * \u003cli\u003e\n * This implementation is not synchronized.\n * \u003c/ul\u003e\n * \u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
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
        "rand"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": " underlying random number generator "
    },
    {
      "type": "field",
      "varNames": [
        "secRand"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": " underlying secure random number generator "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.RandomDataImpl.RandomDataImpl()",
      "begin_line": 119,
      "end_line": 120,
      "comment": "\n     * Construct a RandomDataImpl.\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.RandomDataImpl.RandomDataImpl(org.apache.commons.math.random.RandomGenerator)",
      "begin_line": 130,
      "end_line": 133,
      "comment": "\n     * Construct a RandomDataImpl using the supplied {@link RandomGenerator} as\n     * the source of (non-secure) random data.\n     *\n     * @param rand\n     *            the source of (non-secure) random data\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 16)",
        "(line 132,col 9)-(line 132,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextHexString(int)",
      "begin_line": 153,
      "end_line": 186,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\n     * \u003cstrong\u003eAlgorithm Description:\u003c/strong\u003e hex strings are generated using a\n     * 2-step process.\n     * \u003col\u003e\n     * \u003cli\u003e\n     * len/2+1 binary bytes are generated using the underlying Random\u003c/li\u003e\n     * \u003cli\u003e\n     * Each binary byte is translated into 2 hex digits\u003c/li\u003e\n     * \u003c/ol\u003e\n     * \u003c/p\u003e\n     *\n     * @param len\n     *            the desired string length.\n     * @return the random string.\n     * @throws NotStrictlyPositiveException if {@code len \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 156,col 9)",
        "(line 159,col 9)-(line 159,col 39)",
        "(line 162,col 9)-(line 162,col 52)",
        "(line 165,col 9)-(line 165,col 53)",
        "(line 166,col 9)-(line 166,col 35)",
        "(line 169,col 9)-(line 184,col 9)",
        "(line 185,col 9)-(line 185,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextInt(int, int)",
      "begin_line": 199,
      "end_line": 206,
      "comment": "\n     * Generate a random int value uniformly distributed between\n     * \u003ccode\u003elower\u003c/code\u003e and \u003ccode\u003eupper\u003c/code\u003e, inclusive.\n     *\n     * @param lower\n     *            the lower bound.\n     * @param upper\n     *            the upper bound.\n     * @return the random integer.\n     * @throws NumberIsTooLargeException if {@code lower \u003e\u003d upper}.\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 203,col 9)",
        "(line 204,col 9)-(line 204,col 41)",
        "(line 205,col 9)-(line 205,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextLong(long, long)",
      "begin_line": 219,
      "end_line": 226,
      "comment": "\n     * Generate a random long value uniformly distributed between\n     * \u003ccode\u003elower\u003c/code\u003e and \u003ccode\u003eupper\u003c/code\u003e, inclusive.\n     *\n     * @param lower\n     *            the lower bound.\n     * @param upper\n     *            the upper bound.\n     * @return the random integer.\n     * @throws NumberIsTooLargeException if {@code lower \u003e\u003d upper}.\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 224,col 41)",
        "(line 225,col 9)-(line 225,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextSecureHexString(int)",
      "begin_line": 249,
      "end_line": 296,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\n     * \u003cstrong\u003eAlgorithm Description:\u003c/strong\u003e hex strings are generated in\n     * 40-byte segments using a 3-step process.\n     * \u003col\u003e\n     * \u003cli\u003e\n     * 20 random bytes are generated using the underlying\n     * \u003ccode\u003eSecureRandom\u003c/code\u003e.\u003c/li\u003e\n     * \u003cli\u003e\n     * SHA-1 hash is applied to yield a 20-byte binary digest.\u003c/li\u003e\n     * \u003cli\u003e\n     * Each byte of the binary digest is converted to 2 hex digits.\u003c/li\u003e\n     * \u003c/ol\u003e\n     * \u003c/p\u003e\n     *\n     * @param len\n     *            the length of the generated string\n     * @return the random string\n     * @throws NotStrictlyPositiveException if {@code len \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 252,col 9)",
        "(line 255,col 9)-(line 255,col 42)",
        "(line 256,col 9)-(line 256,col 33)",
        "(line 257,col 9)-(line 262,col 9)",
        "(line 263,col 9)-(line 263,col 20)",
        "(line 266,col 9)-(line 266,col 37)",
        "(line 268,col 9)-(line 268,col 52)",
        "(line 269,col 9)-(line 294,col 9)",
        "(line 295,col 9)-(line 295,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextSecureInt(int, int)",
      "begin_line": 310,
      "end_line": 317,
      "comment": "\n     * Generate a random int value uniformly distributed between\n     * \u003ccode\u003elower\u003c/code\u003e and \u003ccode\u003eupper\u003c/code\u003e, inclusive. This algorithm uses\n     * a secure random number generator.\n     *\n     * @param lower\n     *            the lower bound.\n     * @param upper\n     *            the upper bound.\n     * @return the random integer.\n     * @throws NumberIsTooLargeException if {@code lower \u003e\u003d upper}.\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 314,col 9)",
        "(line 315,col 9)-(line 315,col 39)",
        "(line 316,col 9)-(line 316,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextSecureLong(long, long)",
      "begin_line": 331,
      "end_line": 338,
      "comment": "\n     * Generate a random long value uniformly distributed between\n     * \u003ccode\u003elower\u003c/code\u003e and \u003ccode\u003eupper\u003c/code\u003e, inclusive. This algorithm uses\n     * a secure random number generator.\n     *\n     * @param lower\n     *            the lower bound.\n     * @param upper\n     *            the upper bound.\n     * @return the random integer.\n     * @throws NumberIsTooLargeException if {@code lower \u003e\u003d upper}.\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 335,col 9)",
        "(line 336,col 9)-(line 336,col 39)",
        "(line 337,col 9)-(line 337,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextPoisson(double)",
      "begin_line": 357,
      "end_line": 447,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\n     * \u003cstrong\u003eAlgorithm Description\u003c/strong\u003e:\n     * \u003cul\u003e\u003cli\u003e For small means, uses simulation of a Poisson process\n     * using Uniform deviates, as described\n     * \u003ca href\u003d\"http://irmi.epfl.ch/cmos/Pmmi/interactive/rng7.htm\"\u003e here.\u003c/a\u003e\n     * The Poisson process (and hence value returned) is bounded by 1000 * mean.\u003c/li\u003e\n     *\n     * \u003cli\u003e For large means, uses the rejection algorithm described in \u003cbr/\u003e\n     * Devroye, Luc. (1981).\u003ci\u003eThe Computer Generation of Poisson Random Variables\u003c/i\u003e\n     * \u003cstrong\u003eComputing\u003c/strong\u003e vol. 26 pp. 197-207.\u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param mean mean of the Poisson distribution.\n     * @return the random Poisson value.\n     * @throws NotStrictlyPositiveException if {@code mean \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 358,col 9)-(line 360,col 9)",
        "(line 362,col 9)-(line 362,col 51)",
        "(line 364,col 9)-(line 364,col 35)",
        "(line 365,col 9)-(line 446,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextGaussian(double, double)",
      "begin_line": 461,
      "end_line": 466,
      "comment": "\n     * Generate a random value from a Normal (a.k.a. Gaussian) distribution with\n     * the given mean, \u003ccode\u003emu\u003c/code\u003e and the given standard deviation,\n     * \u003ccode\u003esigma\u003c/code\u003e.\n     *\n     * @param mu\n     *            the mean of the distribution\n     * @param sigma\n     *            the standard deviation of the distribution\n     * @return the random Normal value\n     * @throws NotStrictlyPositiveException if {@code sigma \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 462,col 9)-(line 464,col 9)",
        "(line 465,col 9)-(line 465,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextExponential(double)",
      "begin_line": 482,
      "end_line": 492,
      "comment": "\n     * Returns a random value from an Exponential distribution with the given\n     * mean.\n     * \u003cp\u003e\n     * \u003cstrong\u003eAlgorithm Description\u003c/strong\u003e: Uses the \u003ca\n     * href\u003d\"http://www.jesus.ox.ac.uk/~clifford/a5/chap1/node5.html\"\u003e Inversion\n     * Method\u003c/a\u003e to generate exponentially distributed random values from\n     * uniform deviates.\n     * \u003c/p\u003e\n     *\n     * @param mean the mean of the distribution\n     * @return the random Exponential value\n     * @throws NotStrictlyPositiveException if {@code mean \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 483,col 9)-(line 485,col 9)",
        "(line 486,col 9)-(line 486,col 51)",
        "(line 487,col 9)-(line 487,col 45)",
        "(line 488,col 9)-(line 490,col 9)",
        "(line 491,col 9)-(line 491,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextUniform(double, double)",
      "begin_line": 511,
      "end_line": 525,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\n     * \u003cstrong\u003eAlgorithm Description\u003c/strong\u003e: scales the output of\n     * Random.nextDouble(), but rejects 0 values (i.e., will generate another\n     * random double if Random.nextDouble() returns 0). This is necessary to\n     * provide a symmetric output interval (both endpoints excluded).\n     * \u003c/p\u003e\n     *\n     * @param lower\n     *            the lower bound.\n     * @param upper\n     *            the upper bound.\n     * @return a uniformly distributed random value from the interval (lower,\n     *         upper)\n     * @throws NumberIsTooLargeException if {@code lower \u003e\u003d upper}.\n     ",
      "child_ranges": [
        "(line 512,col 9)-(line 515,col 9)",
        "(line 516,col 9)-(line 516,col 51)",
        "(line 519,col 9)-(line 519,col 42)",
        "(line 520,col 9)-(line 522,col 9)",
        "(line 524,col 9)-(line 524,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextBeta(double, double)",
      "begin_line": 538,
      "end_line": 540,
      "comment": "\n     * Generates a random value from the {@link BetaDistributionImpl Beta Distribution}.\n     * This implementation uses {@link #nextInversionDeviate(ContinuousDistribution) inversion}\n     * to generate random values.\n     *\n     * @param alpha first distribution shape parameter\n     * @param beta second distribution shape parameter\n     * @return random value sampled from the beta(alpha, beta) distribution\n     * @throws MathException if an error occurs generating the random value\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 539,col 9)-(line 539,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextBinomial(int, double)",
      "begin_line": 553,
      "end_line": 555,
      "comment": "\n     * Generates a random value from the {@link BinomialDistributionImpl Binomial Distribution}.\n     * This implementation uses {@link #nextInversionDeviate(ContinuousDistribution) inversion}\n     * to generate random values.\n     *\n     * @param numberOfTrials number of trials of the Binomial distribution\n     * @param probabilityOfSuccess probability of success of the Binomial distribution\n     * @return random value sampled from the Binomial(numberOfTrials, probabilityOfSuccess) distribution\n     * @throws MathException if an error occurs generating the random value\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 554,col 9)-(line 554,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextCauchy(double, double)",
      "begin_line": 568,
      "end_line": 570,
      "comment": "\n     * Generates a random value from the {@link CauchyDistributionImpl Cauchy Distribution}.\n     * This implementation uses {@link #nextInversionDeviate(ContinuousDistribution) inversion}\n     * to generate random values.\n     *\n     * @param median the median of the Cauchy distribution\n     * @param scale the scale parameter of the Cauchy distribution\n     * @return random value sampled from the Cauchy(median, scale) distribution\n     * @throws MathException if an error occurs generating the random value\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 569,col 9)-(line 569,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextChiSquare(double)",
      "begin_line": 582,
      "end_line": 584,
      "comment": "\n     * Generates a random value from the {@link ChiSquaredDistributionImpl ChiSquare Distribution}.\n     * This implementation uses {@link #nextInversionDeviate(ContinuousDistribution) inversion}\n     * to generate random values.\n     *\n     * @param df the degrees of freedom of the ChiSquare distribution\n     * @return random value sampled from the ChiSquare(df) distribution\n     * @throws MathException if an error occurs generating the random value\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 583,col 9)-(line 583,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextF(double, double)",
      "begin_line": 597,
      "end_line": 599,
      "comment": "\n     * Generates a random value from the {@link FDistributionImpl F Distribution}.\n     * This implementation uses {@link #nextInversionDeviate(ContinuousDistribution) inversion}\n     * to generate random values.\n     *\n     * @param numeratorDf the numerator degrees of freedom of the F distribution\n     * @param denominatorDf the denominator degrees of freedom of the F distribution\n     * @return random value sampled from the F(numeratorDf, denominatorDf) distribution\n     * @throws MathException if an error occurs generating the random value\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 598,col 9)-(line 598,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextGamma(double, double)",
      "begin_line": 612,
      "end_line": 614,
      "comment": "\n     * Generates a random value from the {@link GammaDistributionImpl Gamma Distribution}.\n     * This implementation uses {@link #nextInversionDeviate(ContinuousDistribution) inversion}\n     * to generate random values.\n     *\n     * @param shape the median of the Gamma distribution\n     * @param scale the scale parameter of the Gamma distribution\n     * @return random value sampled from the Gamma(shape, scale) distribution\n     * @throws MathException if an error occurs generating the random value\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 613,col 9)-(line 613,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextHypergeometric(int, int, int)",
      "begin_line": 628,
      "end_line": 630,
      "comment": "\n     * Generates a random value from the {@link HypergeometricDistributionImpl Hypergeometric Distribution}.\n     * This implementation uses {@link #nextInversionDeviate(IntegerDistribution) inversion}\n     * to generate random values.\n     *\n     * @param populationSize the population size of the Hypergeometric distribution\n     * @param numberOfSuccesses number of successes in the population of the Hypergeometric distribution\n     * @param sampleSize the sample size of the Hypergeometric distribution\n     * @return random value sampled from the Hypergeometric(numberOfSuccesses, sampleSize) distribution\n     * @throws MathException if an error occurs generating the random value\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 629,col 9)-(line 629,col 119)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextPascal(int, double)",
      "begin_line": 643,
      "end_line": 645,
      "comment": "\n     * Generates a random value from the {@link PascalDistributionImpl Pascal Distribution}.\n     * This implementation uses {@link #nextInversionDeviate(IntegerDistribution) inversion}\n     * to generate random values.\n     *\n     * @param r the number of successes of the Pascal distribution\n     * @param p the probability of success of the Pascal distribution\n     * @return random value sampled from the Pascal(r, p) distribution\n     * @throws MathException if an error occurs generating the random value\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 644,col 9)-(line 644,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextT(double)",
      "begin_line": 657,
      "end_line": 659,
      "comment": "\n     * Generates a random value from the {@link TDistributionImpl T Distribution}.\n     * This implementation uses {@link #nextInversionDeviate(ContinuousDistribution) inversion}\n     * to generate random values.\n     *\n     * @param df the degrees of freedom of the T distribution\n     * @return random value from the T(df) distribution\n     * @throws MathException if an error occurs generating the random value\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 658,col 9)-(line 658,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextWeibull(double, double)",
      "begin_line": 672,
      "end_line": 674,
      "comment": "\n     * Generates a random value from the {@link WeibullDistributionImpl Weibull Distribution}.\n     * This implementation uses {@link #nextInversionDeviate(ContinuousDistribution) inversion}\n     * to generate random values.\n     *\n     * @param shape the shape parameter of the Weibull distribution\n     * @param scale the scale parameter of the Weibull distribution\n     * @return random value sampled from the Weibull(shape, size) distribution\n     * @throws MathException if an error occurs generating the random value\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 673,col 9)-(line 673,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextZipf(int, double)",
      "begin_line": 687,
      "end_line": 689,
      "comment": "\n     * Generates a random value from the {@link ZipfDistributionImpl Zipf Distribution}.\n     * This implementation uses {@link #nextInversionDeviate(IntegerDistribution) inversion}\n     * to generate random values.\n     *\n     * @param numberOfElements the number of elements of the ZipfDistribution\n     * @param exponent the exponent of the ZipfDistribution\n     * @return random value sampled from the Zipf(numberOfElements, exponent) distribution\n     * @throws MathException if an error occurs generating the random value\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 688,col 9)-(line 688,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.getRan()",
      "begin_line": 700,
      "end_line": 706,
      "comment": "\n     * Returns the RandomGenerator used to generate non-secure random data.\n     * \u003cp\u003e\n     * Creates and initializes a default generator if null.\n     * \u003c/p\u003e\n     *\n     * @return the Random used to generate random data\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 701,col 9)-(line 704,col 9)",
        "(line 705,col 9)-(line 705,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.getSecRan()",
      "begin_line": 716,
      "end_line": 722,
      "comment": "\n     * Returns the SecureRandom used to generate secure random data.\n     * \u003cp\u003e\n     * Creates and initializes if null.\n     * \u003c/p\u003e\n     *\n     * @return the SecureRandom used to generate secure random data\n     ",
      "child_ranges": [
        "(line 717,col 9)-(line 720,col 9)",
        "(line 721,col 9)-(line 721,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.reSeed(long)",
      "begin_line": 733,
      "end_line": 738,
      "comment": "\n     * Reseeds the random number generator with the supplied seed.\n     * \u003cp\u003e\n     * Will create and initialize if null.\n     * \u003c/p\u003e\n     *\n     * @param seed\n     *            the seed value to use\n     ",
      "child_ranges": [
        "(line 734,col 9)-(line 736,col 9)",
        "(line 737,col 9)-(line 737,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.reSeedSecure()",
      "begin_line": 747,
      "end_line": 752,
      "comment": "\n     * Reseeds the secure random number generator with the current time in\n     * milliseconds.\n     * \u003cp\u003e\n     * Will create and initialize if null.\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 748,col 9)-(line 750,col 9)",
        "(line 751,col 9)-(line 751,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.reSeedSecure(long)",
      "begin_line": 763,
      "end_line": 768,
      "comment": "\n     * Reseeds the secure random number generator with the supplied seed.\n     * \u003cp\u003e\n     * Will create and initialize if null.\n     * \u003c/p\u003e\n     *\n     * @param seed\n     *            the seed value to use\n     ",
      "child_ranges": [
        "(line 764,col 9)-(line 766,col 9)",
        "(line 767,col 9)-(line 767,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.reSeed()",
      "begin_line": 774,
      "end_line": 779,
      "comment": "\n     * Reseeds the random number generator with the current time in\n     * milliseconds.\n     ",
      "child_ranges": [
        "(line 775,col 9)-(line 777,col 9)",
        "(line 778,col 9)-(line 778,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.setSecureAlgorithm(java.lang.String, java.lang.String)",
      "begin_line": 801,
      "end_line": 804,
      "comment": "\n     * Sets the PRNG algorithm for the underlying SecureRandom instance using\n     * the Security Provider API. The Security Provider API is defined in \u003ca\n     * href \u003d\n     * \"http://java.sun.com/j2se/1.3/docs/guide/security/CryptoSpec.html#AppA\"\u003e\n     * Java Cryptography Architecture API Specification \u0026 Reference.\u003c/a\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUSAGE NOTE:\u003c/strong\u003e This method carries \u003ci\u003esignificant\u003c/i\u003e\n     * overhead and may take several seconds to execute.\n     * \u003c/p\u003e\n     *\n     * @param algorithm\n     *            the name of the PRNG algorithm\n     * @param provider\n     *            the name of the provider\n     * @throws NoSuchAlgorithmException\n     *             if the specified algorithm is not available\n     * @throws NoSuchProviderException\n     *             if the specified provider is not installed\n     ",
      "child_ranges": [
        "(line 803,col 9)-(line 803,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextPermutation(int, int)",
      "begin_line": 836,
      "end_line": 854,
      "comment": "\n     * Generates an integer array of length \u003ccode\u003ek\u003c/code\u003e whose entries are\n     * selected randomly, without repetition, from the integers\n     * \u003ccode\u003e0 through n-1\u003c/code\u003e (inclusive).\n     * \u003cp\u003e\n     * Generated arrays represent permutations of \u003ccode\u003en\u003c/code\u003e taken\n     * \u003ccode\u003ek\u003c/code\u003e at a time.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions:\u003c/strong\u003e\n     * \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003ek \u003c\u003d n\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e \u003ccode\u003en \u003e 0\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * If the preconditions are not met, an IllegalArgumentException is thrown.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Uses a 2-cycle permutation shuffle. The shuffling process is described \u003ca\n     * href\u003d\"http://www.maths.abdn.ac.uk/~igc/tch/mx4002/notes/node83.html\"\u003e\n     * here\u003c/a\u003e.\n     * \u003c/p\u003e\n     *\n     * @param n\n     *            domain of the permutation (must be positive)\n     * @param k\n     *            size of the permutation (must satisfy 0 \u003c k \u003c\u003d n).\n     * @return the random permutation as an int array\n     * @throws NumberIsTooLargeException if {@code k \u003e n}.\n     * @throws NotStrictlyPositiveException if {@code k \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 837,col 9)-(line 840,col 9)",
        "(line 841,col 9)-(line 844,col 9)",
        "(line 846,col 9)-(line 846,col 36)",
        "(line 847,col 9)-(line 847,col 30)",
        "(line 848,col 9)-(line 848,col 34)",
        "(line 849,col 9)-(line 851,col 9)",
        "(line 853,col 9)-(line 853,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextSample(java.util.Collection\u003c?\u003e, int)",
      "begin_line": 874,
      "end_line": 891,
      "comment": "\n     * Uses a 2-cycle permutation shuffle to generate a random permutation.\n     * \u003cstrong\u003eAlgorithm Description\u003c/strong\u003e: Uses a 2-cycle permutation\n     * shuffle to generate a random permutation of \u003ccode\u003ec.size()\u003c/code\u003e and\n     * then returns the elements whose indexes correspond to the elements of the\n     * generated permutation. This technique is described, and proven to\n     * generate random samples, \u003ca\n     * href\u003d\"http://www.maths.abdn.ac.uk/~igc/tch/mx4002/notes/node83.html\"\u003e\n     * here\u003c/a\u003e\n     *\n     * @param c\n     *            Collection to sample from.\n     * @param k\n     *            sample size.\n     * @return the random sample.\n     * @throws NumberIsTooLargeException if {@code k \u003e c.size()}.\n     * @throws NotStrictlyPositiveException if {@code k \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 875,col 9)-(line 875,col 27)",
        "(line 876,col 9)-(line 879,col 9)",
        "(line 880,col 9)-(line 882,col 9)",
        "(line 884,col 9)-(line 884,col 39)",
        "(line 885,col 9)-(line 885,col 46)",
        "(line 886,col 9)-(line 886,col 40)",
        "(line 887,col 9)-(line 889,col 9)",
        "(line 890,col 9)-(line 890,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextInversionDeviate(org.apache.commons.math.distribution.ContinuousDistribution)",
      "begin_line": 902,
      "end_line": 905,
      "comment": "\n     * Generate a random deviate from the given distribution using the\n     * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Inverse_transform_sampling\"\u003e inversion method.\u003c/a\u003e\n     *\n     * @param distribution Continuous distribution to generate a random value from\n     * @return a random value sampled from the given distribution\n     * @throws MathException if an error occurs computing the inverse cumulative distribution function\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 903,col 9)-(line 903,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextInversionDeviate(org.apache.commons.math.distribution.IntegerDistribution)",
      "begin_line": 916,
      "end_line": 924,
      "comment": "\n     * Generate a random deviate from the given distribution using the\n     * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Inverse_transform_sampling\"\u003e inversion method.\u003c/a\u003e\n     *\n     * @param distribution Integer distribution to generate a random value from\n     * @return a random value sampled from the given distribution\n     * @throws MathException if an error occurs computing the inverse cumulative distribution function\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 917,col 9)-(line 917,col 48)",
        "(line 918,col 9)-(line 918,col 74)",
        "(line 919,col 9)-(line 923,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.shuffle(int[], int)",
      "begin_line": 937,
      "end_line": 949,
      "comment": "\n     * Uses a 2-cycle permutation shuffle to randomly re-order the last elements\n     * of list.\n     *\n     * @param list\n     *            list to be shuffled\n     * @param end\n     *            element past which shuffling begins\n     ",
      "child_ranges": [
        "(line 938,col 9)-(line 938,col 23)",
        "(line 939,col 9)-(line 948,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.getNatural(int)",
      "begin_line": 958,
      "end_line": 964,
      "comment": "\n     * Returns an array representing n.\n     *\n     * @param n\n     *            the natural number to represent\n     * @return array with entries \u003d elements of n\n     ",
      "child_ranges": [
        "(line 959,col 9)-(line 959,col 35)",
        "(line 960,col 9)-(line 962,col 9)",
        "(line 963,col 9)-(line 963,col 23)"
      ]
    }
  ]
}