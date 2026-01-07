{
  "filepath": "/tmp/Math-103b/src/java/org/apache/commons/math/random/RandomDataImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RandomDataImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.random.RandomData",
        "java.io.Serializable"
      ],
      "begin_line": 82,
      "end_line": 600,
      "comment": "\n * Implements the {@link RandomData} interface using a {@link RandomGenerator}\n * instance to generate non-secure data and a \n * {@link java.security.SecureRandom} instance to provide data for the\n * \u003ccode\u003enextSecureXxx\u003c/code\u003e methods.  If no \u003ccode\u003eRandomGenerator\u003c/code\u003e\n * is provided in the constructor, the default is to use a generator based on\n * {@link java.util.Random}.   To plug in a different implementation, \n * either implement \u003ccode\u003eRandomGenerator\u003c/code\u003e directly or extend\n * {@link AbstractRandomGenerator}.\n * \u003cp\u003e\n * Supports reseeding the underlying pseudo-random number generator (PRNG). \n * The \u003ccode\u003eSecurityProvider\u003c/code\u003e and \u003ccode\u003eAlgorithm\u003c/code\u003e\n * used by the \u003ccode\u003eSecureRandom\u003c/code\u003e instance can also be reset.\n * \u003cp\u003e\n * For details on the default PRNGs, see {@link java.util.Random} and\n * {@link java.security.SecureRandom}. \n * \u003cp\u003e\n * \u003cstrong\u003eUsage Notes\u003c/strong\u003e: \u003cul\u003e\n * \u003cli\u003e\n * Instance variables are used to maintain \u003ccode\u003eRandomGenerator\u003c/code\u003e and\n * \u003ccode\u003eSecureRandom\u003c/code\u003e instances used in data generation. Therefore,\n * to generate a random sequence of values or strings, you should use just\n * \u003cstrong\u003eone\u003c/strong\u003e \u003ccode\u003eRandomDataImpl\u003c/code\u003e instance repeatedly.\u003c/li\u003e\n * \u003cli\u003e\n * The \"secure\" methods are *much* slower.  These should be used only when a\n * cryptographically secure random sequence is required.  A secure random\n * sequence is a sequence of pseudo-random values which, in addition to being\n * well-dispersed (so no subsequence of values is an any more likely than other\n * subsequence of the the same length), also has the additional property that\n * knowledge of values generated up to any point in the sequence does not make\n * it any easier to predict subsequent values.\u003c/li\u003e\n * \u003cli\u003e\n * When a new \u003ccode\u003eRandomDataImpl\u003c/code\u003e is created, the underlying random\n * number generators are \u003cstrong\u003enot\u003c/strong\u003e intialized.  If you do not\n * explicitly seed the default non-secure generator, it is seeded with the current time\n * in milliseconds on first use.  The same holds for the secure generator.  \n * If you provide a \u003ccode\u003eRandomGenerator\u003c/code\u003e to the constructor, however,\n * this generator is not reseeded by the constructor nor is it reseeded on\n * first use. \u003c/li\u003e\n * \u003cli\u003e\n * The \u003ccode\u003ereSeed\u003c/code\u003e and \u003ccode\u003ereSeedSecure\u003c/code\u003e methods delegate\n * to the corresponding methods on the underlying \u003ccode\u003eRandomGenerator\u003c/code\u003e\n * and\u003ccode\u003eSecureRandom\u003c/code\u003e instances.  Therefore, \n * \u003ccode\u003ereSeed(long)\u003c/code\u003e fully resets the initial state of the non-secure\n * random number generator (so that reseeding with a specific value always\n * results in the same subsequent random sequence); whereas reSeedSecure(long)\n * does \u003cstrong\u003enot\u003c/strong\u003e reinitialize the secure random number generator\n * (so secure sequences started with calls to reseedSecure(long) won\u0027t be\n * identical).\u003c/li\u003e\n * \u003cli\u003e\n * This implementation is not synchronized.\n * \u003c/ul\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "rand"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " underlying random number generator "
    },
    {
      "type": "field",
      "varNames": [
        "secRand"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " underlying secure random number generator "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.RandomDataImpl.RandomDataImpl()",
      "begin_line": 96,
      "end_line": 97,
      "comment": "\n     * Construct a RandomDataImpl.\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.RandomDataImpl.RandomDataImpl(org.apache.commons.math.random.RandomGenerator)",
      "begin_line": 106,
      "end_line": 109,
      "comment": "\n     * Construct a RandomDataImpl using the supplied {@link RandomGenerator}\n     * as the source of (non-secure) random data.\n     * \n     * @param rand  the source of (non-secure) random data\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 16)",
        "(line 108,col 9)-(line 108,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextHexString(int)",
      "begin_line": 121,
      "end_line": 154,
      "comment": "\n     * \u003cstrong\u003eAlgorithm Description:\u003c/strong\u003e hex strings are generated\n     * using a 2-step process. \u003col\u003e\n     * \u003cli\u003e\n     * len/2+1 binary bytes are generated using the underlying Random\u003c/li\u003e\n     * \u003cli\u003e\n     * Each binary byte is translated into 2 hex digits\u003c/li\u003e\u003c/ol\u003e\n     * @param len the desired string length.\n     * @return the random string.\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 124,col 9)",
        "(line 127,col 9)-(line 127,col 39)",
        "(line 130,col 9)-(line 130,col 52)",
        "(line 133,col 9)-(line 133,col 53)",
        "(line 134,col 9)-(line 134,col 35)",
        "(line 137,col 9)-(line 152,col 9)",
        "(line 153,col 9)-(line 153,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextInt(int, int)",
      "begin_line": 164,
      "end_line": 172,
      "comment": "\n     * Generate a random int value uniformly distributed between\n     * \u003ccode\u003elower\u003c/code\u003e and \u003ccode\u003eupper\u003c/code\u003e, inclusive.\n     * \n     * @param lower the lower bound.\n     * @param upper the upper bound.\n     * @return the random integer.\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 168,col 9)",
        "(line 169,col 9)-(line 169,col 40)",
        "(line 170,col 9)-(line 170,col 37)",
        "(line 171,col 9)-(line 171,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextLong(long, long)",
      "begin_line": 182,
      "end_line": 190,
      "comment": "\n     * Generate a random long value uniformly distributed between\n     * \u003ccode\u003elower\u003c/code\u003e and \u003ccode\u003eupper\u003c/code\u003e, inclusive.\n     * \n     * @param lower the lower bound.\n     * @param upper the upper bound.\n     * @return the random integer.\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 187,col 40)",
        "(line 188,col 9)-(line 188,col 37)",
        "(line 189,col 9)-(line 189,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextSecureHexString(int)",
      "begin_line": 206,
      "end_line": 252,
      "comment": "\n     * \u003cstrong\u003eAlgorithm Description:\u003c/strong\u003e hex strings are generated in\n     * 40-byte segments using a 3-step process. \u003col\u003e\n     * \u003cli\u003e\n     * 20 random bytes are generated using the underlying\n     * \u003ccode\u003eSecureRandom\u003c/code\u003e.\u003c/li\u003e\n     * \u003cli\u003e\n     * SHA-1 hash is applied to yield a 20-byte binary digest.\u003c/li\u003e\n     * \u003cli\u003e\n     * Each byte of the binary digest is converted to 2 hex digits.\u003c/li\u003e\u003c/ol\u003e\n     *\n     * @param len the length of the generated string\n     * @return the random string\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 209,col 9)",
        "(line 212,col 8)-(line 212,col 41)",
        "(line 213,col 8)-(line 213,col 32)",
        "(line 214,col 8)-(line 218,col 8)",
        "(line 219,col 8)-(line 219,col 19)",
        "(line 222,col 8)-(line 222,col 36)",
        "(line 224,col 8)-(line 224,col 51)",
        "(line 225,col 8)-(line 250,col 9)",
        "(line 251,col 9)-(line 251,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextSecureInt(int, int)",
      "begin_line": 263,
      "end_line": 270,
      "comment": "\n     * Generate a random int value uniformly distributed between\n     * \u003ccode\u003elower\u003c/code\u003e and \u003ccode\u003eupper\u003c/code\u003e, inclusive.  This algorithm\n     * uses a secure random number generator.\n     * \n     * @param lower the lower bound.\n     * @param upper the upper bound.\n     * @return the random integer.\n     ",
      "child_ranges": [
        "(line 264,col 11)-(line 267,col 11)",
        "(line 268,col 11)-(line 268,col 41)",
        "(line 269,col 11)-(line 269,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextSecureLong(long, long)",
      "begin_line": 281,
      "end_line": 288,
      "comment": "\n     * Generate a random long value uniformly distributed between\n     * \u003ccode\u003elower\u003c/code\u003e and \u003ccode\u003eupper\u003c/code\u003e, inclusive.  This algorithm\n     * uses a secure random number generator.\n     * \n     * @param lower the lower bound.\n     * @param upper the upper bound.\n     * @return the random integer.\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 285,col 9)",
        "(line 286,col 9)-(line 286,col 39)",
        "(line 287,col 9)-(line 287,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextPoisson(double)",
      "begin_line": 306,
      "end_line": 325,
      "comment": "\n     * Generates a random long value from the Poisson distribution with the\n     * given mean.\n     * \u003cp\u003e\n     * \u003cstrong\u003eAlgorithm Description\u003c/strong\u003e:\n     * Uses simulation of a Poisson process using Uniform deviates, as\n     * described\n     * \u003ca href\u003d\"http://irmi.epfl.ch/cmos/Pmmi/interactive/rng7.htm\"\u003e\n     * here.\u003c/a\u003e\n     * \u003cp\u003e\n     * The Poisson process (and hence value returned) is bounded by \n     * 1000 * mean.\n     * \n     * @param mean mean of the Poisson distribution.\n     * @return the random Poisson value.\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 309,col 9)",
        "(line 310,col 9)-(line 310,col 35)",
        "(line 311,col 9)-(line 311,col 19)",
        "(line 312,col 9)-(line 312,col 24)",
        "(line 313,col 9)-(line 313,col 26)",
        "(line 314,col 9)-(line 314,col 40)",
        "(line 315,col 9)-(line 323,col 9)",
        "(line 324,col 9)-(line 324,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextGaussian(double, double)",
      "begin_line": 336,
      "end_line": 342,
      "comment": "\n     * Generate a random value from a Normal (a.k.a. Gaussian) distribution\n     * with the given mean, \u003ccode\u003emu\u003c/code\u003e and the given standard deviation,\n     * \u003ccode\u003esigma\u003c/code\u003e.\n     * \n     * @param mu the mean of the distribution\n     * @param sigma the standard deviation of the distribution\n     * @return the random Normal value\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 339,col 9)",
        "(line 340,col 9)-(line 340,col 40)",
        "(line 341,col 9)-(line 341,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextExponential(double)",
      "begin_line": 356,
      "end_line": 367,
      "comment": "\n     * Returns a random value from an Exponential distribution with the given\n     * mean.\n     * \u003cp\u003e\n     * \u003cstrong\u003eAlgorithm Description\u003c/strong\u003e:  Uses the\n     * \u003ca href\u003d\"http://www.jesus.ox.ac.uk/~clifford/a5/chap1/node5.html\"\u003e\n     * Inversion Method\u003c/a\u003e to generate exponentially distributed random values\n     * from uniform deviates.\n     * \n     * @param mean the mean of the distribution\n     * @return the random Exponential value\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 360,col 9)",
        "(line 361,col 9)-(line 361,col 40)",
        "(line 362,col 9)-(line 362,col 40)",
        "(line 363,col 9)-(line 365,col 9)",
        "(line 366,col 9)-(line 366,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextUniform(double, double)",
      "begin_line": 380,
      "end_line": 394,
      "comment": "\n     * \u003cstrong\u003eAlgorithm Description\u003c/strong\u003e: scales the output of\n     * Random.nextDouble(), but rejects 0 values (i.e., will generate another\n     * random double if Random.nextDouble() returns 0).\n     * This is necessary to provide a symmetric output interval\n     * (both endpoints excluded).\n     * \n     * @param lower the lower bound.\n     * @param upper the upper bound.\n     * @return a uniformly distributed random value from the interval (lower, upper)\n     ",
      "child_ranges": [
        "(line 381,col 9)-(line 384,col 9)",
        "(line 385,col 9)-(line 385,col 40)",
        "(line 388,col 9)-(line 388,col 37)",
        "(line 389,col 9)-(line 391,col 9)",
        "(line 393,col 9)-(line 393,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.getRan()",
      "begin_line": 405,
      "end_line": 411,
      "comment": "\n     * Returns the RandomGenerator used to generate non-secure\n     * random data.\n     * \u003cp\u003e\n     * Creates and initializes a default generator if null.\n     *\n     * @return the Random used to generate random data\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 409,col 9)",
        "(line 410,col 9)-(line 410,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.getSecRan()",
      "begin_line": 420,
      "end_line": 426,
      "comment": "\n     * Returns the SecureRandom used to generate secure random data.\n     * \u003cp\u003e\n     * Creates and initializes if null.\n     *\n     * @return the SecureRandom used to generate secure random data\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 424,col 9)",
        "(line 425,col 9)-(line 425,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.reSeed(long)",
      "begin_line": 435,
      "end_line": 440,
      "comment": "\n     * Reseeds the random number generator with the supplied seed.\n     * \u003cp\u003e\n     * Will create and initialize if null.\n     *\n     * @param seed the seed value to use\n     ",
      "child_ranges": [
        "(line 436,col 9)-(line 438,col 9)",
        "(line 439,col 9)-(line 439,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.reSeedSecure()",
      "begin_line": 448,
      "end_line": 453,
      "comment": "\n     * Reseeds the secure random number generator with the current time\n     * in milliseconds.\n     * \u003cp\u003e\n     * Will create and initialize if null.\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 451,col 9)",
        "(line 452,col 9)-(line 452,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.reSeedSecure(long)",
      "begin_line": 462,
      "end_line": 467,
      "comment": "\n     * Reseeds the secure random number generator with the supplied seed.\n     * \u003cp\u003e\n     * Will create and initialize if null.\n     *\n     * @param seed the seed value to use\n     ",
      "child_ranges": [
        "(line 463,col 9)-(line 465,col 9)",
        "(line 466,col 9)-(line 466,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.reSeed()",
      "begin_line": 473,
      "end_line": 478,
      "comment": "\n     * Reseeds the random number generator with the current time\n     * in milliseconds.\n     ",
      "child_ranges": [
        "(line 474,col 9)-(line 476,col 9)",
        "(line 477,col 9)-(line 477,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.setSecureAlgorithm(java.lang.String, java.lang.String)",
      "begin_line": 497,
      "end_line": 500,
      "comment": "\n     * Sets the PRNG algorithm for the underlying SecureRandom instance\n     * using the Security Provider API.  The Security Provider API is defined in\n     * \u003ca href\u003d\"http://java.sun.com/j2se/1.3/docs/guide/security/CryptoSpec.html#AppA\"\u003e\n     * Java Cryptography Architecture API Specification \u0026 Reference.\u003c/a\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUSAGE NOTE:\u003c/strong\u003e This method carries \u003ci\u003esignificant\u003c/i\u003e\n     * overhead and may take several seconds to execute.\n     * \u003c/p\u003e\n     *\n     * @param algorithm the name of the PRNG algorithm\n     * @param provider the name of the provider\n     * @throws NoSuchAlgorithmException if the specified algorithm\n     * is not available\n     * @throws NoSuchProviderException if the specified provider\n     * is not installed\n     ",
      "child_ranges": [
        "(line 499,col 9)-(line 499,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextPermutation(int, int)",
      "begin_line": 511,
      "end_line": 529,
      "comment": "\n     * Uses a 2-cycle permutation shuffle to generate a random permutation.\n     * The shuffling process is described\n     * \u003ca href\u003d\"http://www.maths.abdn.ac.uk/~igc/tch/mx4002/notes/node83.html\"\u003e\n     * here\u003c/a\u003e.\n     * @param n the population size.\n     * @param k the number to choose.\n     * @return the random permutation.\n     ",
      "child_ranges": [
        "(line 512,col 9)-(line 515,col 9)",
        "(line 516,col 9)-(line 519,col 9)",
        "(line 521,col 9)-(line 521,col 36)",
        "(line 522,col 9)-(line 522,col 30)",
        "(line 523,col 9)-(line 523,col 34)",
        "(line 524,col 9)-(line 526,col 9)",
        "(line 528,col 9)-(line 528,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.nextSample(java.util.Collection, int)",
      "begin_line": 544,
      "end_line": 562,
      "comment": "\n     * Uses a 2-cycle permutation shuffle to generate a random permutation.\n     * \u003cstrong\u003eAlgorithm Description\u003c/strong\u003e: Uses a 2-cycle permutation\n     * shuffle to generate a random permutation of \u003ccode\u003ec.size()\u003c/code\u003e and\n     * then returns the elements whose indexes correspond to the elements of\n     * the generated permutation.\n     * This technique is described, and proven to generate random samples,\n     * \u003ca href\u003d\"http://www.maths.abdn.ac.uk/~igc/tch/mx4002/notes/node83.html\"\u003e\n     * here\u003c/a\u003e\n     * @param c Collection to sample from.\n     * @param k sample size.\n     * @return the random sample.\n     ",
      "child_ranges": [
        "(line 545,col 9)-(line 545,col 27)",
        "(line 546,col 9)-(line 549,col 9)",
        "(line 550,col 9)-(line 553,col 9)",
        "(line 555,col 8)-(line 555,col 38)",
        "(line 556,col 8)-(line 556,col 45)",
        "(line 557,col 8)-(line 557,col 39)",
        "(line 558,col 8)-(line 560,col 8)",
        "(line 561,col 8)-(line 561,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.shuffle(int[], int)",
      "begin_line": 573,
      "end_line": 585,
      "comment": "\n     * Uses a 2-cycle permutation shuffle to randomly re-order the last elements\n     * of list.\n     *\n     * @param list list to be shuffled\n     * @param end element past which shuffling begins\n     ",
      "child_ranges": [
        "(line 574,col 9)-(line 574,col 23)",
        "(line 575,col 9)-(line 584,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataImpl.getNatural(int)",
      "begin_line": 593,
      "end_line": 599,
      "comment": "\n     * Returns an array representing n.\n     *\n     * @param n the natural number to represent\n     * @return array with entries \u003d elements of n\n     ",
      "child_ranges": [
        "(line 594,col 9)-(line 594,col 35)",
        "(line 595,col 9)-(line 597,col 9)",
        "(line 598,col 9)-(line 598,col 23)"
      ]
    }
  ]
}