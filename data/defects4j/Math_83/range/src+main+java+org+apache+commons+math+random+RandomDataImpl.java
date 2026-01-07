{
  "filepath": "/tmp/Math-83b/src/main/java/org/apache/commons/math/random/RandomDataImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RandomDataImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.random.RandomData",
        "java.io.Serializable"
      ],
      "begin_line": 87,
      "end_line": 763,
      "comment": "\n * Implements the {@link RandomData} interface using a {@link RandomGenerator}\n * instance to generate non-secure data and a {@link java.security.SecureRandom}\n * instance to provide data for the \u003ccode\u003enextSecureXxx\u003c/code\u003e methods. If no\n * \u003ccode\u003eRandomGenerator\u003c/code\u003e is provided in the constructor, the default is\n * to use a generator based on {@link java.util.Random}. To plug in a different\n * implementation, either implement \u003ccode\u003eRandomGenerator\u003c/code\u003e directly or\n * extend {@link AbstractRandomGenerator}.\n * \u003cp\u003e\n * Supports reseeding the underlying pseudo-random number generator (PRNG). The\n * \u003ccode\u003eSecurityProvider\u003c/code\u003e and \u003ccode\u003eAlgorithm\u003c/code\u003e used by the\n * \u003ccode\u003eSecureRandom\u003c/code\u003e instance can also be reset.\n * \u003c/p\u003e\n * \u003cp\u003e\n * For details on the default PRNGs, see {@link java.util.Random} and\n * {@link java.security.SecureRandom}.\n * \u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eUsage Notes\u003c/strong\u003e:\n * \u003cul\u003e\n * \u003cli\u003e\n * Instance variables are used to maintain \u003ccode\u003eRandomGenerator\u003c/code\u003e and\n * \u003ccode\u003eSecureRandom\u003c/code\u003e instances used in data generation. Therefore, to\n * generate a random sequence of values or strings, you should use just\n * \u003cstrong\u003eone\u003c/strong\u003e \u003ccode\u003eRandomDataImpl\u003c/code\u003e instance repeatedly.\u003c/li\u003e\n * \u003cli\u003e\n * The \"secure\" methods are *much* slower. These should be used only when a\n * cryptographically secure random sequence is required. A secure random\n * sequence is a sequence of pseudo-random values which, in addition to being\n * well-dispersed (so no subsequence of values is an any more likely than other\n * subsequence of the the same length), also has the additional property that\n * knowledge of values generated up to any point in the sequence does not make\n * it any easier to predict subsequent values.\u003c/li\u003e\n * \u003cli\u003e\n * When a new \u003ccode\u003eRandomDataImpl\u003c/code\u003e is created, the underlying random\n * number generators are \u003cstrong\u003enot\u003c/strong\u003e intialized. If you do not\n * explicitly seed the default non-secure generator, it is seeded with the\n * current time in milliseconds on first use. The same holds for the secure\n * generator. If you provide a \u003ccode\u003eRandomGenerator\u003c/code\u003e to the constructor,\n * however, this generator is not reseeded by the constructor nor is it reseeded\n * on first use.\u003c/li\u003e\n * \u003cli\u003e\n * The \u003ccode\u003ereSeed\u003c/code\u003e and \u003ccode\u003ereSeedSecure\u003c/code\u003e methods delegate to the\n * corresponding methods on the underlying \u003ccode\u003eRandomGenerator\u003c/code\u003e and\n * \u003ccode\u003eSecureRandom\u003c/code\u003e instances. Therefore, \u003ccode\u003ereSeed(long)\u003c/code\u003e\n * fully resets the initial state of the non-secure random number generator (so\n * that reseeding with a specific value always results in the same subsequent\n * random sequence); whereas reSeedSecure(long) does \u003cstrong\u003enot\u003c/strong\u003e\n * reinitialize the secure random number generator (so secure sequences started\n * with calls to reseedSecure(long) won\u0027t be identical).\u003c/li\u003e\n * \u003cli\u003e\n * This implementation is not synchronized.\n * \u003c/ul\u003e\n * \u003c/p\u003e\n * \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "rand"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " underlying random number generator "
    },
    {
      "type": "field",
      "varNames": [
        "secRand"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " underlying secure random number generator "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.RandomDataImpl.RandomDataImpl()",
      "begin_line": 101,
      "end_line": 102,
      "comment": "\n     * Construct a RandomDataImpl.\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.RandomDataImpl.RandomDataImpl(org.apache.commons.math.random.RandomGenerator)",
      "begin_line": 112,
      "end_line": 115,
      "comment": "\n     * Construct a RandomDataImpl using the supplied {@link RandomGenerator} as\n     * the source of (non-secure) random data.\n     * \n     * @param rand\n     *            the source of (non-secure) random data\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 16)",
        "(line 114,col 9)-(line 114,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextHexString(int)",
      "begin_line": 134,
      "end_line": 168,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\n     * \u003cstrong\u003eAlgorithm Description:\u003c/strong\u003e hex strings are generated using a\n     * 2-step process.\n     * \u003col\u003e\n     * \u003cli\u003e\n     * len/2+1 binary bytes are generated using the underlying Random\u003c/li\u003e\n     * \u003cli\u003e\n     * Each binary byte is translated into 2 hex digits\u003c/li\u003e\n     * \u003c/ol\u003e\n     * \u003c/p\u003e\n     * \n     * @param len\n     *            the desired string length.\n     * @return the random string.\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 138,col 9)",
        "(line 141,col 9)-(line 141,col 39)",
        "(line 144,col 9)-(line 144,col 52)",
        "(line 147,col 9)-(line 147,col 53)",
        "(line 148,col 9)-(line 148,col 35)",
        "(line 151,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 167,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextInt(int, int)",
      "begin_line": 180,
      "end_line": 189,
      "comment": "\n     * Generate a random int value uniformly distributed between\n     * \u003ccode\u003elower\u003c/code\u003e and \u003ccode\u003eupper\u003c/code\u003e, inclusive.\n     * \n     * @param lower\n     *            the lower bound.\n     * @param upper\n     *            the upper bound.\n     * @return the random integer.\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 185,col 9)",
        "(line 186,col 9)-(line 186,col 40)",
        "(line 187,col 9)-(line 187,col 37)",
        "(line 188,col 9)-(line 188,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextLong(long, long)",
      "begin_line": 201,
      "end_line": 210,
      "comment": "\n     * Generate a random long value uniformly distributed between\n     * \u003ccode\u003elower\u003c/code\u003e and \u003ccode\u003eupper\u003c/code\u003e, inclusive.\n     * \n     * @param lower\n     *            the lower bound.\n     * @param upper\n     *            the upper bound.\n     * @return the random integer.\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 206,col 9)",
        "(line 207,col 9)-(line 207,col 40)",
        "(line 208,col 9)-(line 208,col 37)",
        "(line 209,col 9)-(line 209,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextSecureHexString(int)",
      "begin_line": 232,
      "end_line": 279,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\n     * \u003cstrong\u003eAlgorithm Description:\u003c/strong\u003e hex strings are generated in\n     * 40-byte segments using a 3-step process.\n     * \u003col\u003e\n     * \u003cli\u003e\n     * 20 random bytes are generated using the underlying\n     * \u003ccode\u003eSecureRandom\u003c/code\u003e.\u003c/li\u003e\n     * \u003cli\u003e\n     * SHA-1 hash is applied to yield a 20-byte binary digest.\u003c/li\u003e\n     * \u003cli\u003e\n     * Each byte of the binary digest is converted to 2 hex digits.\u003c/li\u003e\n     * \u003c/ol\u003e\n     * \u003c/p\u003e\n     * \n     * @param len\n     *            the length of the generated string\n     * @return the random string\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 236,col 9)",
        "(line 239,col 9)-(line 239,col 42)",
        "(line 240,col 9)-(line 240,col 33)",
        "(line 241,col 9)-(line 245,col 9)",
        "(line 246,col 9)-(line 246,col 20)",
        "(line 249,col 9)-(line 249,col 37)",
        "(line 251,col 9)-(line 251,col 52)",
        "(line 252,col 9)-(line 277,col 9)",
        "(line 278,col 9)-(line 278,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextSecureInt(int, int)",
      "begin_line": 292,
      "end_line": 300,
      "comment": "\n     * Generate a random int value uniformly distributed between\n     * \u003ccode\u003elower\u003c/code\u003e and \u003ccode\u003eupper\u003c/code\u003e, inclusive. This algorithm uses\n     * a secure random number generator.\n     * \n     * @param lower\n     *            the lower bound.\n     * @param upper\n     *            the upper bound.\n     * @return the random integer.\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 297,col 9)",
        "(line 298,col 9)-(line 298,col 39)",
        "(line 299,col 9)-(line 299,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextSecureLong(long, long)",
      "begin_line": 313,
      "end_line": 321,
      "comment": "\n     * Generate a random long value uniformly distributed between\n     * \u003ccode\u003elower\u003c/code\u003e and \u003ccode\u003eupper\u003c/code\u003e, inclusive. This algorithm uses\n     * a secure random number generator.\n     * \n     * @param lower\n     *            the lower bound.\n     * @param upper\n     *            the upper bound.\n     * @return the random integer.\n     ",
      "child_ranges": [
        "(line 314,col 9)-(line 318,col 9)",
        "(line 319,col 9)-(line 319,col 39)",
        "(line 320,col 9)-(line 320,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextPoisson(double)",
      "begin_line": 352,
      "end_line": 442,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\n     * \u003cstrong\u003eAlgorithm Description\u003c/strong\u003e: For small means, uses simulation\n     * of a Poisson process using Uniform deviates, as described \u003ca\n     * href\u003d\"http://irmi.epfl.ch/cmos/Pmmi/interactive/rng7.htm\"\u003e here.\u003c/a\u003e\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The Poisson process (and hence value returned) is bounded by 1000 * mean.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * For large means, uses a reject method as described in \u003ca\n     * href\u003d\"http://cg.scs.carleton.ca/~luc/rnbookindex.html\"\u003eNon-Uniform Random\n     * Variate Generation\u003c/a\u003e\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * References:\n     * \u003cul\u003e\n     * \u003cli\u003eDevroye, Luc. (1986). \u003ci\u003eNon-Uniform Random Variate Generation\u003c/i\u003e.\n     * New York, NY. Springer-Verlag\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param mean\n     *            mean of the Poisson distribution.\n     * @return the random Poisson value.\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 356,col 9)",
        "(line 358,col 9)-(line 358,col 40)",
        "(line 360,col 9)-(line 360,col 27)",
        "(line 361,col 9)-(line 441,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextGaussian(double, double)",
      "begin_line": 455,
      "end_line": 462,
      "comment": "\n     * Generate a random value from a Normal (a.k.a. Gaussian) distribution with\n     * the given mean, \u003ccode\u003emu\u003c/code\u003e and the given standard deviation,\n     * \u003ccode\u003esigma\u003c/code\u003e.\n     * \n     * @param mu\n     *            the mean of the distribution\n     * @param sigma\n     *            the standard deviation of the distribution\n     * @return the random Normal value\n     ",
      "child_ranges": [
        "(line 456,col 9)-(line 459,col 9)",
        "(line 460,col 9)-(line 460,col 40)",
        "(line 461,col 9)-(line 461,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextExponential(double)",
      "begin_line": 478,
      "end_line": 489,
      "comment": "\n     * Returns a random value from an Exponential distribution with the given\n     * mean.\n     * \u003cp\u003e\n     * \u003cstrong\u003eAlgorithm Description\u003c/strong\u003e: Uses the \u003ca\n     * href\u003d\"http://www.jesus.ox.ac.uk/~clifford/a5/chap1/node5.html\"\u003e Inversion\n     * Method\u003c/a\u003e to generate exponentially distributed random values from\n     * uniform deviates.\n     * \u003c/p\u003e\n     * \n     * @param mean\n     *            the mean of the distribution\n     * @return the random Exponential value\n     ",
      "child_ranges": [
        "(line 479,col 9)-(line 482,col 9)",
        "(line 483,col 9)-(line 483,col 40)",
        "(line 484,col 9)-(line 484,col 40)",
        "(line 485,col 9)-(line 487,col 9)",
        "(line 488,col 9)-(line 488,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextUniform(double, double)",
      "begin_line": 507,
      "end_line": 522,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\n     * \u003cstrong\u003eAlgorithm Description\u003c/strong\u003e: scales the output of\n     * Random.nextDouble(), but rejects 0 values (i.e., will generate another\n     * random double if Random.nextDouble() returns 0). This is necessary to\n     * provide a symmetric output interval (both endpoints excluded).\n     * \u003c/p\u003e\n     * \n     * @param lower\n     *            the lower bound.\n     * @param upper\n     *            the upper bound.\n     * @return a uniformly distributed random value from the interval (lower,\n     *         upper)\n     ",
      "child_ranges": [
        "(line 508,col 9)-(line 512,col 9)",
        "(line 513,col 9)-(line 513,col 40)",
        "(line 516,col 9)-(line 516,col 37)",
        "(line 517,col 9)-(line 519,col 9)",
        "(line 521,col 9)-(line 521,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.getRan()",
      "begin_line": 533,
      "end_line": 539,
      "comment": "\n     * Returns the RandomGenerator used to generate non-secure random data.\n     * \u003cp\u003e\n     * Creates and initializes a default generator if null.\n     * \u003c/p\u003e\n     * \n     * @return the Random used to generate random data\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 534,col 9)-(line 537,col 9)",
        "(line 538,col 9)-(line 538,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.getSecRan()",
      "begin_line": 549,
      "end_line": 555,
      "comment": "\n     * Returns the SecureRandom used to generate secure random data.\n     * \u003cp\u003e\n     * Creates and initializes if null.\n     * \u003c/p\u003e\n     * \n     * @return the SecureRandom used to generate secure random data\n     ",
      "child_ranges": [
        "(line 550,col 9)-(line 553,col 9)",
        "(line 554,col 9)-(line 554,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.reSeed(long)",
      "begin_line": 566,
      "end_line": 571,
      "comment": "\n     * Reseeds the random number generator with the supplied seed.\n     * \u003cp\u003e\n     * Will create and initialize if null.\n     * \u003c/p\u003e\n     * \n     * @param seed\n     *            the seed value to use\n     ",
      "child_ranges": [
        "(line 567,col 9)-(line 569,col 9)",
        "(line 570,col 9)-(line 570,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.reSeedSecure()",
      "begin_line": 580,
      "end_line": 585,
      "comment": "\n     * Reseeds the secure random number generator with the current time in\n     * milliseconds.\n     * \u003cp\u003e\n     * Will create and initialize if null.\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 581,col 9)-(line 583,col 9)",
        "(line 584,col 9)-(line 584,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.reSeedSecure(long)",
      "begin_line": 596,
      "end_line": 601,
      "comment": "\n     * Reseeds the secure random number generator with the supplied seed.\n     * \u003cp\u003e\n     * Will create and initialize if null.\n     * \u003c/p\u003e\n     * \n     * @param seed\n     *            the seed value to use\n     ",
      "child_ranges": [
        "(line 597,col 9)-(line 599,col 9)",
        "(line 600,col 9)-(line 600,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.reSeed()",
      "begin_line": 607,
      "end_line": 612,
      "comment": "\n     * Reseeds the random number generator with the current time in\n     * milliseconds.\n     ",
      "child_ranges": [
        "(line 608,col 9)-(line 610,col 9)",
        "(line 611,col 9)-(line 611,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.setSecureAlgorithm(java.lang.String, java.lang.String)",
      "begin_line": 634,
      "end_line": 637,
      "comment": "\n     * Sets the PRNG algorithm for the underlying SecureRandom instance using\n     * the Security Provider API. The Security Provider API is defined in \u003ca\n     * href \u003d\n     * \"http://java.sun.com/j2se/1.3/docs/guide/security/CryptoSpec.html#AppA\"\u003e\n     * Java Cryptography Architecture API Specification \u0026 Reference.\u003c/a\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUSAGE NOTE:\u003c/strong\u003e This method carries \u003ci\u003esignificant\u003c/i\u003e\n     * overhead and may take several seconds to execute.\n     * \u003c/p\u003e\n     * \n     * @param algorithm\n     *            the name of the PRNG algorithm\n     * @param provider\n     *            the name of the provider\n     * @throws NoSuchAlgorithmException\n     *             if the specified algorithm is not available\n     * @throws NoSuchProviderException\n     *             if the specified provider is not installed\n     ",
      "child_ranges": [
        "(line 636,col 9)-(line 636,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextPermutation(int, int)",
      "begin_line": 667,
      "end_line": 685,
      "comment": "\n     * Generates an integer array of length \u003ccode\u003ek\u003c/code\u003e whose entries are\n     * selected randomly, without repetition, from the integers\n     * \u003ccode\u003e0 through n-1\u003c/code\u003e (inclusive).\n     * \u003cp\u003e\n     * Generated arrays represent permutations of \u003ccode\u003en\u003c/code\u003e taken\n     * \u003ccode\u003ek\u003c/code\u003e at a time.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions:\u003c/strong\u003e\n     * \u003cul\u003e\n     * \u003cli\u003e \u003ccode\u003ek \u003c\u003d n\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e \u003ccode\u003en \u003e 0\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * If the preconditions are not met, an IllegalArgumentException is thrown.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Uses a 2-cycle permutation shuffle. The shuffling process is described \u003ca\n     * href\u003d\"http://www.maths.abdn.ac.uk/~igc/tch/mx4002/notes/node83.html\"\u003e\n     * here\u003c/a\u003e.\n     * \u003c/p\u003e\n     * \n     * @param n\n     *            domain of the permutation (must be positive)\n     * @param k\n     *            size of the permutation (must satisfy 0 \u003c k \u003c\u003d n).\n     * @return the random permutation as an int array\n     ",
      "child_ranges": [
        "(line 668,col 9)-(line 671,col 9)",
        "(line 672,col 9)-(line 675,col 9)",
        "(line 677,col 9)-(line 677,col 36)",
        "(line 678,col 9)-(line 678,col 30)",
        "(line 679,col 9)-(line 679,col 34)",
        "(line 680,col 9)-(line 682,col 9)",
        "(line 684,col 9)-(line 684,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextSample(java.util.Collection\u003c?\u003e, int)",
      "begin_line": 703,
      "end_line": 721,
      "comment": "\n     * Uses a 2-cycle permutation shuffle to generate a random permutation.\n     * \u003cstrong\u003eAlgorithm Description\u003c/strong\u003e: Uses a 2-cycle permutation\n     * shuffle to generate a random permutation of \u003ccode\u003ec.size()\u003c/code\u003e and\n     * then returns the elements whose indexes correspond to the elements of the\n     * generated permutation. This technique is described, and proven to\n     * generate random samples, \u003ca\n     * href\u003d\"http://www.maths.abdn.ac.uk/~igc/tch/mx4002/notes/node83.html\"\u003e\n     * here\u003c/a\u003e\n     * \n     * @param c\n     *            Collection to sample from.\n     * @param k\n     *            sample size.\n     * @return the random sample.\n     ",
      "child_ranges": [
        "(line 704,col 9)-(line 704,col 27)",
        "(line 705,col 9)-(line 708,col 9)",
        "(line 709,col 9)-(line 712,col 9)",
        "(line 714,col 9)-(line 714,col 39)",
        "(line 715,col 9)-(line 715,col 46)",
        "(line 716,col 9)-(line 716,col 40)",
        "(line 717,col 9)-(line 719,col 9)",
        "(line 720,col 9)-(line 720,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.shuffle(int[], int)",
      "begin_line": 734,
      "end_line": 746,
      "comment": "\n     * Uses a 2-cycle permutation shuffle to randomly re-order the last elements\n     * of list.\n     * \n     * @param list\n     *            list to be shuffled\n     * @param end\n     *            element past which shuffling begins\n     ",
      "child_ranges": [
        "(line 735,col 9)-(line 735,col 23)",
        "(line 736,col 9)-(line 745,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.getNatural(int)",
      "begin_line": 755,
      "end_line": 761,
      "comment": "\n     * Returns an array representing n.\n     * \n     * @param n\n     *            the natural number to represent\n     * @return array with entries \u003d elements of n\n     ",
      "child_ranges": [
        "(line 756,col 9)-(line 756,col 35)",
        "(line 757,col 9)-(line 759,col 9)",
        "(line 760,col 9)-(line 760,col 23)"
      ]
    }
  ]
}