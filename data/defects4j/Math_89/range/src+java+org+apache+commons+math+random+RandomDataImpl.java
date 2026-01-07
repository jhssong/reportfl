{
  "filepath": "/tmp/Math-89b/src/java/org/apache/commons/math/random/RandomDataImpl.java",
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
      "end_line": 749,
      "comment": "\n * Implements the {@link RandomData} interface using a {@link RandomGenerator}\n * instance to generate non-secure data and a {@link java.security.SecureRandom}\n * instance to provide data for the \u003ccode\u003enextSecureXxx\u003c/code\u003e methods. If no\n * \u003ccode\u003eRandomGenerator\u003c/code\u003e is provided in the constructor, the default is\n * to use a generator based on {@link java.util.Random}. To plug in a different\n * implementation, either implement \u003ccode\u003eRandomGenerator\u003c/code\u003e directly or\n * extend {@link AbstractRandomGenerator}.\n * \u003cp\u003e\n * Supports reseeding the underlying pseudo-random number generator (PRNG). The\n * \u003ccode\u003eSecurityProvider\u003c/code\u003e and \u003ccode\u003eAlgorithm\u003c/code\u003e used by the\n * \u003ccode\u003eSecureRandom\u003c/code\u003e instance can also be reset.\n * \u003c/p\u003e\n * \u003cp\u003e\n * For details on the default PRNGs, see {@link java.util.Random} and\n * {@link java.security.SecureRandom}.\n * \u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eUsage Notes\u003c/strong\u003e:\n * \u003cul\u003e\n * \u003cli\u003e\n * Instance variables are used to maintain \u003ccode\u003eRandomGenerator\u003c/code\u003e and\n * \u003ccode\u003eSecureRandom\u003c/code\u003e instances used in data generation. Therefore, to\n * generate a random sequence of values or strings, you should use just\n * \u003cstrong\u003eone\u003c/strong\u003e \u003ccode\u003eRandomDataImpl\u003c/code\u003e instance repeatedly.\u003c/li\u003e\n * \u003cli\u003e\n * The \"secure\" methods are *much* slower. These should be used only when a\n * cryptographically secure random sequence is required. A secure random\n * sequence is a sequence of pseudo-random values which, in addition to being\n * well-dispersed (so no subsequence of values is an any more likely than other\n * subsequence of the the same length), also has the additional property that\n * knowledge of values generated up to any point in the sequence does not make\n * it any easier to predict subsequent values.\u003c/li\u003e\n * \u003cli\u003e\n * When a new \u003ccode\u003eRandomDataImpl\u003c/code\u003e is created, the underlying random\n * number generators are \u003cstrong\u003enot\u003c/strong\u003e intialized. If you do not\n * explicitly seed the default non-secure generator, it is seeded with the\n * current time in milliseconds on first use. The same holds for the secure\n * generator. If you provide a \u003ccode\u003eRandomGenerator\u003c/code\u003e to the constructor,\n * however, this generator is not reseeded by the constructor nor is it reseeded\n * on first use.\u003c/li\u003e\n * \u003cli\u003e\n * The \u003ccode\u003ereSeed\u003c/code\u003e and \u003ccode\u003ereSeedSecure\u003c/code\u003e methods delegate to the\n * corresponding methods on the underlying \u003ccode\u003eRandomGenerator\u003c/code\u003e and\n * \u003ccode\u003eSecureRandom\u003c/code\u003e instances. Therefore, \u003ccode\u003ereSeed(long)\u003c/code\u003e\n * fully resets the initial state of the non-secure random number generator (so\n * that reseeding with a specific value always results in the same subsequent\n * random sequence); whereas reSeedSecure(long) does \u003cstrong\u003enot\u003c/strong\u003e\n * reinitialize the secure random number generator (so secure sequences started\n * with calls to reseedSecure(long) won\u0027t be identical).\u003c/li\u003e\n * \u003cli\u003e\n * This implementation is not synchronized.\n * \u003c/ul\u003e\n * \u003c/p\u003e\n * \n * @version $Revision$ $Date: 2008-11-23 08:27:09 -0600 (Sun, 23 Nov\n *          2008) $\n "
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
      "comment": "\n\t * Construct a RandomDataImpl.\n\t ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.RandomDataImpl.RandomDataImpl(org.apache.commons.math.random.RandomGenerator)",
      "begin_line": 112,
      "end_line": 115,
      "comment": "\n\t * Construct a RandomDataImpl using the supplied {@link RandomGenerator} as\n\t * the source of (non-secure) random data.\n\t * \n\t * @param rand\n\t *            the source of (non-secure) random data\n\t * @since 1.1\n\t ",
      "child_ranges": [
        "(line 113,col 3)-(line 113,col 10)",
        "(line 114,col 3)-(line 114,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextHexString(int)",
      "begin_line": 134,
      "end_line": 167,
      "comment": "\n\t * {@inheritDoc}\n\t * \u003cp\u003e\n\t * \u003cstrong\u003eAlgorithm Description:\u003c/strong\u003e hex strings are generated using a\n\t * 2-step process.\n\t * \u003col\u003e\n\t * \u003cli\u003e\n\t * len/2+1 binary bytes are generated using the underlying Random\u003c/li\u003e\n\t * \u003cli\u003e\n\t * Each binary byte is translated into 2 hex digits\u003c/li\u003e\n\t * \u003c/ol\u003e\n\t * \u003c/p\u003e\n\t * \n\t * @param len\n\t *            the desired string length.\n\t * @return the random string.\n\t ",
      "child_ranges": [
        "(line 135,col 3)-(line 137,col 3)",
        "(line 140,col 3)-(line 140,col 33)",
        "(line 143,col 3)-(line 143,col 46)",
        "(line 146,col 3)-(line 146,col 47)",
        "(line 147,col 3)-(line 147,col 29)",
        "(line 150,col 3)-(line 165,col 3)",
        "(line 166,col 3)-(line 166,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextInt(int, int)",
      "begin_line": 179,
      "end_line": 187,
      "comment": "\n\t * Generate a random int value uniformly distributed between\n\t * \u003ccode\u003elower\u003c/code\u003e and \u003ccode\u003eupper\u003c/code\u003e, inclusive.\n\t * \n\t * @param lower\n\t *            the lower bound.\n\t * @param upper\n\t *            the upper bound.\n\t * @return the random integer.\n\t ",
      "child_ranges": [
        "(line 180,col 3)-(line 183,col 3)",
        "(line 184,col 3)-(line 184,col 34)",
        "(line 185,col 3)-(line 185,col 31)",
        "(line 186,col 3)-(line 186,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextLong(long, long)",
      "begin_line": 199,
      "end_line": 207,
      "comment": "\n\t * Generate a random long value uniformly distributed between\n\t * \u003ccode\u003elower\u003c/code\u003e and \u003ccode\u003eupper\u003c/code\u003e, inclusive.\n\t * \n\t * @param lower\n\t *            the lower bound.\n\t * @param upper\n\t *            the upper bound.\n\t * @return the random integer.\n\t ",
      "child_ranges": [
        "(line 200,col 3)-(line 203,col 3)",
        "(line 204,col 3)-(line 204,col 34)",
        "(line 205,col 3)-(line 205,col 31)",
        "(line 206,col 3)-(line 206,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextSecureHexString(int)",
      "begin_line": 229,
      "end_line": 275,
      "comment": "\n\t * {@inheritDoc}\n\t * \u003cp\u003e\n\t * \u003cstrong\u003eAlgorithm Description:\u003c/strong\u003e hex strings are generated in\n\t * 40-byte segments using a 3-step process.\n\t * \u003col\u003e\n\t * \u003cli\u003e\n\t * 20 random bytes are generated using the underlying\n\t * \u003ccode\u003eSecureRandom\u003c/code\u003e.\u003c/li\u003e\n\t * \u003cli\u003e\n\t * SHA-1 hash is applied to yield a 20-byte binary digest.\u003c/li\u003e\n\t * \u003cli\u003e\n\t * Each byte of the binary digest is converted to 2 hex digits.\u003c/li\u003e\n\t * \u003c/ol\u003e\n\t * \u003c/p\u003e\n\t * \n\t * @param len\n\t *            the length of the generated string\n\t * @return the random string\n\t ",
      "child_ranges": [
        "(line 230,col 3)-(line 232,col 3)",
        "(line 235,col 3)-(line 235,col 36)",
        "(line 236,col 3)-(line 236,col 27)",
        "(line 237,col 3)-(line 241,col 3)",
        "(line 242,col 3)-(line 242,col 14)",
        "(line 245,col 3)-(line 245,col 31)",
        "(line 247,col 3)-(line 247,col 46)",
        "(line 248,col 3)-(line 273,col 3)",
        "(line 274,col 3)-(line 274,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextSecureInt(int, int)",
      "begin_line": 288,
      "end_line": 295,
      "comment": "\n\t * Generate a random int value uniformly distributed between\n\t * \u003ccode\u003elower\u003c/code\u003e and \u003ccode\u003eupper\u003c/code\u003e, inclusive. This algorithm uses\n\t * a secure random number generator.\n\t * \n\t * @param lower\n\t *            the lower bound.\n\t * @param upper\n\t *            the upper bound.\n\t * @return the random integer.\n\t ",
      "child_ranges": [
        "(line 289,col 3)-(line 292,col 3)",
        "(line 293,col 3)-(line 293,col 33)",
        "(line 294,col 3)-(line 294,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextSecureLong(long, long)",
      "begin_line": 308,
      "end_line": 315,
      "comment": "\n\t * Generate a random long value uniformly distributed between\n\t * \u003ccode\u003elower\u003c/code\u003e and \u003ccode\u003eupper\u003c/code\u003e, inclusive. This algorithm uses\n\t * a secure random number generator.\n\t * \n\t * @param lower\n\t *            the lower bound.\n\t * @param upper\n\t *            the upper bound.\n\t * @return the random integer.\n\t ",
      "child_ranges": [
        "(line 309,col 3)-(line 312,col 3)",
        "(line 313,col 3)-(line 313,col 33)",
        "(line 314,col 3)-(line 314,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextPoisson(double)",
      "begin_line": 346,
      "end_line": 435,
      "comment": "\n\t * {@inheritDoc}\n\t * \u003cp\u003e\n\t * \u003cstrong\u003eAlgorithm Description\u003c/strong\u003e: For small means, uses simulation\n\t * of a Poisson process using Uniform deviates, as described \u003ca\n\t * href\u003d\"http://irmi.epfl.ch/cmos/Pmmi/interactive/rng7.htm\"\u003e here.\u003c/a\u003e\n\t * \u003c/p\u003e\n\t * \u003cp\u003e\n\t * The Poisson process (and hence value returned) is bounded by 1000 * mean.\n\t * \u003c/p\u003e\n\t * \n\t * \u003cp\u003e\n\t * For large means, uses a reject method as described in \u003ca\n\t * href\u003d\"http://cg.scs.carleton.ca/~luc/rnbookindex.html\"\u003eNon-Uniform Random\n\t * Variate Generation\u003c/a\u003e\n\t * \u003c/p\u003e\n\t * \n\t * \u003cp\u003e\n\t * References:\n\t * \u003cul\u003e\n\t * \u003cli\u003eDevroye, Luc. (1986). \u003ci\u003eNon-Uniform Random Variate Generation\u003c/i\u003e.\n\t * New York, NY. Springer-Verlag\u003c/li\u003e\n\t * \u003c/ul\u003e\n\t * \u003c/p\u003e\n\t * \n\t * @param mean\n\t *            mean of the Poisson distribution.\n\t * @return the random Poisson value.\n\t ",
      "child_ranges": [
        "(line 347,col 3)-(line 349,col 3)",
        "(line 351,col 3)-(line 351,col 34)",
        "(line 353,col 3)-(line 353,col 21)",
        "(line 354,col 3)-(line 434,col 3)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextGaussian(double, double)",
      "begin_line": 448,
      "end_line": 454,
      "comment": "\n\t * Generate a random value from a Normal (a.k.a. Gaussian) distribution with\n\t * the given mean, \u003ccode\u003emu\u003c/code\u003e and the given standard deviation,\n\t * \u003ccode\u003esigma\u003c/code\u003e.\n\t * \n\t * @param mu\n\t *            the mean of the distribution\n\t * @param sigma\n\t *            the standard deviation of the distribution\n\t * @return the random Normal value\n\t ",
      "child_ranges": [
        "(line 449,col 3)-(line 451,col 3)",
        "(line 452,col 3)-(line 452,col 34)",
        "(line 453,col 3)-(line 453,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextExponential(double)",
      "begin_line": 470,
      "end_line": 480,
      "comment": "\n\t * Returns a random value from an Exponential distribution with the given\n\t * mean.\n\t * \u003cp\u003e\n\t * \u003cstrong\u003eAlgorithm Description\u003c/strong\u003e: Uses the \u003ca\n\t * href\u003d\"http://www.jesus.ox.ac.uk/~clifford/a5/chap1/node5.html\"\u003e Inversion\n\t * Method\u003c/a\u003e to generate exponentially distributed random values from\n\t * uniform deviates.\n\t * \u003c/p\u003e\n\t * \n\t * @param mean\n\t *            the mean of the distribution\n\t * @return the random Exponential value\n\t ",
      "child_ranges": [
        "(line 471,col 3)-(line 473,col 3)",
        "(line 474,col 3)-(line 474,col 34)",
        "(line 475,col 3)-(line 475,col 34)",
        "(line 476,col 3)-(line 478,col 3)",
        "(line 479,col 3)-(line 479,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextUniform(double, double)",
      "begin_line": 498,
      "end_line": 512,
      "comment": "\n\t * {@inheritDoc}\n\t * \u003cp\u003e\n\t * \u003cstrong\u003eAlgorithm Description\u003c/strong\u003e: scales the output of\n\t * Random.nextDouble(), but rejects 0 values (i.e., will generate another\n\t * random double if Random.nextDouble() returns 0). This is necessary to\n\t * provide a symmetric output interval (both endpoints excluded).\n\t * \u003c/p\u003e\n\t * \n\t * @param lower\n\t *            the lower bound.\n\t * @param upper\n\t *            the upper bound.\n\t * @return a uniformly distributed random value from the interval (lower,\n\t *         upper)\n\t ",
      "child_ranges": [
        "(line 499,col 3)-(line 502,col 3)",
        "(line 503,col 3)-(line 503,col 34)",
        "(line 506,col 3)-(line 506,col 31)",
        "(line 507,col 3)-(line 509,col 3)",
        "(line 511,col 3)-(line 511,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.getRan()",
      "begin_line": 523,
      "end_line": 529,
      "comment": "\n\t * Returns the RandomGenerator used to generate non-secure random data.\n\t * \u003cp\u003e\n\t * Creates and initializes a default generator if null.\n\t * \u003c/p\u003e\n\t * \n\t * @return the Random used to generate random data\n\t * @since 1.1\n\t ",
      "child_ranges": [
        "(line 524,col 3)-(line 527,col 3)",
        "(line 528,col 3)-(line 528,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.getSecRan()",
      "begin_line": 539,
      "end_line": 545,
      "comment": "\n\t * Returns the SecureRandom used to generate secure random data.\n\t * \u003cp\u003e\n\t * Creates and initializes if null.\n\t * \u003c/p\u003e\n\t * \n\t * @return the SecureRandom used to generate secure random data\n\t ",
      "child_ranges": [
        "(line 540,col 3)-(line 543,col 3)",
        "(line 544,col 3)-(line 544,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.reSeed(long)",
      "begin_line": 556,
      "end_line": 561,
      "comment": "\n\t * Reseeds the random number generator with the supplied seed.\n\t * \u003cp\u003e\n\t * Will create and initialize if null.\n\t * \u003c/p\u003e\n\t * \n\t * @param seed\n\t *            the seed value to use\n\t ",
      "child_ranges": [
        "(line 557,col 3)-(line 559,col 3)",
        "(line 560,col 3)-(line 560,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.reSeedSecure()",
      "begin_line": 570,
      "end_line": 575,
      "comment": "\n\t * Reseeds the secure random number generator with the current time in\n\t * milliseconds.\n\t * \u003cp\u003e\n\t * Will create and initialize if null.\n\t * \u003c/p\u003e\n\t ",
      "child_ranges": [
        "(line 571,col 3)-(line 573,col 3)",
        "(line 574,col 3)-(line 574,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.reSeedSecure(long)",
      "begin_line": 586,
      "end_line": 591,
      "comment": "\n\t * Reseeds the secure random number generator with the supplied seed.\n\t * \u003cp\u003e\n\t * Will create and initialize if null.\n\t * \u003c/p\u003e\n\t * \n\t * @param seed\n\t *            the seed value to use\n\t ",
      "child_ranges": [
        "(line 587,col 3)-(line 589,col 3)",
        "(line 590,col 3)-(line 590,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.reSeed()",
      "begin_line": 597,
      "end_line": 602,
      "comment": "\n\t * Reseeds the random number generator with the current time in\n\t * milliseconds.\n\t ",
      "child_ranges": [
        "(line 598,col 3)-(line 600,col 3)",
        "(line 601,col 3)-(line 601,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.setSecureAlgorithm(java.lang.String, java.lang.String)",
      "begin_line": 624,
      "end_line": 627,
      "comment": "\n\t * Sets the PRNG algorithm for the underlying SecureRandom instance using\n\t * the Security Provider API. The Security Provider API is defined in \u003ca\n\t * href \u003d\n\t * \"http://java.sun.com/j2se/1.3/docs/guide/security/CryptoSpec.html#AppA\"\u003e\n\t * Java Cryptography Architecture API Specification \u0026 Reference.\u003c/a\u003e\n\t * \u003cp\u003e\n\t * \u003cstrong\u003eUSAGE NOTE:\u003c/strong\u003e This method carries \u003ci\u003esignificant\u003c/i\u003e\n\t * overhead and may take several seconds to execute.\n\t * \u003c/p\u003e\n\t * \n\t * @param algorithm\n\t *            the name of the PRNG algorithm\n\t * @param provider\n\t *            the name of the provider\n\t * @throws NoSuchAlgorithmException\n\t *             if the specified algorithm is not available\n\t * @throws NoSuchProviderException\n\t *             if the specified provider is not installed\n\t ",
      "child_ranges": [
        "(line 626,col 3)-(line 626,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextPermutation(int, int)",
      "begin_line": 657,
      "end_line": 673,
      "comment": "\n\t * Generates an integer array of length \u003ccode\u003ek\u003c/code\u003e whose entries are\n\t * selected randomly, without repetition, from the integers\n\t * \u003ccode\u003e0 through n-1\u003c/code\u003e (inclusive).\n\t * \u003cp\u003e\n\t * Generated arrays represent permutations of \u003ccode\u003en\u003c/code\u003e taken\n\t * \u003ccode\u003ek\u003c/code\u003e at a time.\n\t * \u003c/p\u003e\n\t * \u003cp\u003e\n\t * \u003cstrong\u003ePreconditions:\u003c/strong\u003e\n\t * \u003cul\u003e\n\t * \u003cli\u003e \u003ccode\u003ek \u003c\u003d n\u003c/code\u003e\u003c/li\u003e\n\t * \u003cli\u003e \u003ccode\u003en \u003e 0\u003c/code\u003e\u003c/li\u003e\n\t * \u003c/ul\u003e\n\t * If the preconditions are not met, an IllegalArgumentException is thrown.\n\t * \u003c/p\u003e\n\t * \u003cp\u003e\n\t * Uses a 2-cycle permutation shuffle. The shuffling process is described \u003ca\n\t * href\u003d\"http://www.maths.abdn.ac.uk/~igc/tch/mx4002/notes/node83.html\"\u003e\n\t * here\u003c/a\u003e.\n\t * \u003c/p\u003e\n\t * \n\t * @param n\n\t *            domain of the permutation (must be positive)\n\t * @param k\n\t *            size of the permutation (must satisfy 0 \u003c k \u003c\u003d n).\n\t * @return the random permutation as an int array\n\t ",
      "child_ranges": [
        "(line 658,col 3)-(line 660,col 3)",
        "(line 661,col 3)-(line 663,col 3)",
        "(line 665,col 3)-(line 665,col 30)",
        "(line 666,col 3)-(line 666,col 24)",
        "(line 667,col 3)-(line 667,col 28)",
        "(line 668,col 3)-(line 670,col 3)",
        "(line 672,col 3)-(line 672,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextSample(java.util.Collection\u003c?\u003e, int)",
      "begin_line": 691,
      "end_line": 708,
      "comment": "\n\t * Uses a 2-cycle permutation shuffle to generate a random permutation.\n\t * \u003cstrong\u003eAlgorithm Description\u003c/strong\u003e: Uses a 2-cycle permutation\n\t * shuffle to generate a random permutation of \u003ccode\u003ec.size()\u003c/code\u003e and\n\t * then returns the elements whose indexes correspond to the elements of the\n\t * generated permutation. This technique is described, and proven to\n\t * generate random samples, \u003ca\n\t * href\u003d\"http://www.maths.abdn.ac.uk/~igc/tch/mx4002/notes/node83.html\"\u003e\n\t * here\u003c/a\u003e\n\t * \n\t * @param c\n\t *            Collection to sample from.\n\t * @param k\n\t *            sample size.\n\t * @return the random sample.\n\t ",
      "child_ranges": [
        "(line 692,col 3)-(line 692,col 21)",
        "(line 693,col 3)-(line 696,col 3)",
        "(line 697,col 3)-(line 699,col 3)",
        "(line 701,col 3)-(line 701,col 33)",
        "(line 702,col 3)-(line 702,col 40)",
        "(line 703,col 3)-(line 703,col 34)",
        "(line 704,col 3)-(line 706,col 3)",
        "(line 707,col 3)-(line 707,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.shuffle(int[], int)",
      "begin_line": 721,
      "end_line": 733,
      "comment": "\n\t * Uses a 2-cycle permutation shuffle to randomly re-order the last elements\n\t * of list.\n\t * \n\t * @param list\n\t *            list to be shuffled\n\t * @param end\n\t *            element past which shuffling begins\n\t ",
      "child_ranges": [
        "(line 722,col 3)-(line 722,col 17)",
        "(line 723,col 3)-(line 732,col 3)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.getNatural(int)",
      "begin_line": 742,
      "end_line": 748,
      "comment": "\n\t * Returns an array representing n.\n\t * \n\t * @param n\n\t *            the natural number to represent\n\t * @return array with entries \u003d elements of n\n\t ",
      "child_ranges": [
        "(line 743,col 3)-(line 743,col 29)",
        "(line 744,col 3)-(line 746,col 3)",
        "(line 747,col 3)-(line 747,col 17)"
      ]
    }
  ]
}