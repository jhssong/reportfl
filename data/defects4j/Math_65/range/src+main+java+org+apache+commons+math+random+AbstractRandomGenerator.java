{
  "filepath": "/tmp/Math-65b/src/main/java/org/apache/commons/math/random/AbstractRandomGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractRandomGenerator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.random.RandomGenerator"
      ],
      "begin_line": 35,
      "end_line": 271,
      "comment": "\n * Abstract class implementing the {@link  RandomGenerator} interface.\n * Default implementations for all methods other than {@link #nextDouble()} and\n * {@link #setSeed(long)} are provided.\n * \u003cp\u003e\n * All data generation methods are based on {@code code nextDouble()}.\n * Concrete implementations \u003cstrong\u003emust\u003c/strong\u003e override\n * this method and \u003cstrong\u003eshould\u003c/strong\u003e provide better / more\n * performant implementations of the other methods if the underlying PRNG\n * supplies them.\u003c/p\u003e\n *\n * @since 1.1\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "cachedNormalDeviate"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * Cached random normal value.  The default implementation for\n     * {@link #nextGaussian} generates pairs of values and this field caches the\n     * second value so that the full algorithm is not executed for every\n     * activation.  The value {@code Double.NaN} signals that there is\n     * no cached value.  Use {@link #clear} to clear the cached value.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.AbstractRandomGenerator.AbstractRandomGenerator()",
      "begin_line": 49,
      "end_line": 52,
      "comment": "\n     * Construct a RandomGenerator.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.AbstractRandomGenerator.clear()",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * Clears the cache used by the default implementation of\n     * {@link #nextGaussian}. Implemementations that do not override the\n     * default implementation of {@code nextGaussian} should call this\n     * method in the implementation of {@link #setSeed(long)}\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.AbstractRandomGenerator.setSeed(int)",
      "begin_line": 65,
      "end_line": 67,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.AbstractRandomGenerator.setSeed(int[])",
      "begin_line": 70,
      "end_line": 79,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 39)",
        "(line 74,col 9)-(line 74,col 27)",
        "(line 75,col 9)-(line 77,col 9)",
        "(line 78,col 9)-(line 78,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.AbstractRandomGenerator.setSeed(long)",
      "begin_line": 92,
      "end_line": 92,
      "comment": "\n     * Sets the seed of the underyling random number generator using a\n     * {@code long} seed.  Sequences of values generated starting with the\n     * same seeds should be identical.\n     * \u003cp\u003e\n     * Implementations that do not override the default implementation of\n     * {@code nextGaussian} should include a call to {@link #clear} in the\n     * implementation of this method.\u003c/p\u003e\n     *\n     * @param seed the seed value\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.AbstractRandomGenerator.nextBytes(byte[])",
      "begin_line": 105,
      "end_line": 119,
      "comment": "\n     * Generates random bytes and places them into a user-supplied\n     * byte array.  The number of random bytes produced is equal to\n     * the length of the byte array.\n     * \u003cp\u003e\n     * The default implementation fills the array with bytes extracted from\n     * random integers generated using {@link #nextInt}.\u003c/p\u003e\n     *\n     * @param bytes the non-null byte array in which to put the\n     * random bytes\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 25)",
        "(line 107,col 9)-(line 118,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.AbstractRandomGenerator.nextInt()",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\n     * Returns the next pseudorandom, uniformly distributed {@code int}\n     * value from this random number generator\u0027s sequence.\n     * All 2\u003cfont size\u003d\"-1\"\u003e\u003csup\u003e32\u003c/sup\u003e\u003c/font\u003e possible {@code int} values\n     * should be produced with  (approximately) equal probability.\n     * \u003cp\u003e\n     * The default implementation provided here returns\n     * \u003cpre\u003e\n     * \u003ccode\u003e(int) (nextDouble() * Integer.MAX_VALUE)\u003c/code\u003e\n     * \u003c/pre\u003e\u003c/p\u003e\n     *\n     * @return the next pseudorandom, uniformly distributed {@code int}\n     *  value from this random number generator\u0027s sequence\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.AbstractRandomGenerator.nextInt(int)",
      "begin_line": 155,
      "end_line": 161,
      "comment": "\n     * Returns a pseudorandom, uniformly distributed {@code int} value\n     * between 0 (inclusive) and the specified value (exclusive), drawn from\n     * this random number generator\u0027s sequence.\n     * \u003cp\u003e\n     * The default implementation returns\n     * \u003cpre\u003e\n     * \u003ccode\u003e(int) (nextDouble() * n\u003c/code\u003e\n     * \u003c/pre\u003e\u003c/p\u003e\n     *\n     * @param n the bound on the random number to be returned.  Must be\n     * positive.\n     * @return  a pseudorandom, uniformly distributed {@code int}\n     * value between 0 (inclusive) and n (exclusive).\n     * @throws NotStrictlyPositiveException if {@code n \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 159,col 46)",
        "(line 160,col 9)-(line 160,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.AbstractRandomGenerator.nextLong()",
      "begin_line": 177,
      "end_line": 179,
      "comment": "\n     * Returns the next pseudorandom, uniformly distributed {@code long}\n     * value from this random number generator\u0027s sequence.  All\n     * 2\u003cfont size\u003d\"-1\"\u003e\u003csup\u003e64\u003c/sup\u003e\u003c/font\u003e possible {@code long} values\n     * should be produced with (approximately) equal probability.\n     * \u003cp\u003e\n     * The default implementation returns\n     * \u003cpre\u003e\n     * \u003ccode\u003e(long) (nextDouble() * Long.MAX_VALUE)\u003c/code\u003e\n     * \u003c/pre\u003e\u003c/p\u003e\n     *\n     * @return  the next pseudorandom, uniformly distributed {@code long}\n     *value from this random number generator\u0027s sequence\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.AbstractRandomGenerator.nextBoolean()",
      "begin_line": 195,
      "end_line": 197,
      "comment": "\n     * Returns the next pseudorandom, uniformly distributed\n     * {@code boolean} value from this random number generator\u0027s\n     * sequence.\n     * \u003cp\u003e\n     * The default implementation returns\n     * \u003cpre\u003e\n     * \u003ccode\u003enextDouble() \u003c\u003d 0.5\u003c/code\u003e\n     * \u003c/pre\u003e\u003c/p\u003e\n     *\n     * @return  the next pseudorandom, uniformly distributed\n     * {@code boolean} value from this random number generator\u0027s\n     * sequence\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.AbstractRandomGenerator.nextFloat()",
      "begin_line": 213,
      "end_line": 215,
      "comment": "\n     * Returns the next pseudorandom, uniformly distributed {@code float}\n     * value between {@code 0.0} and {@code 1.0} from this random\n     * number generator\u0027s sequence.\n     * \u003cp\u003e\n     * The default implementation returns\n     * \u003cpre\u003e\n     * \u003ccode\u003e(float) nextDouble() \u003c/code\u003e\n     * \u003c/pre\u003e\u003c/p\u003e\n     *\n     * @return  the next pseudorandom, uniformly distributed {@code float}\n     * value between {@code 0.0} and {@code 1.0} from this\n     * random number generator\u0027s sequence\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.AbstractRandomGenerator.nextDouble()",
      "begin_line": 229,
      "end_line": 229,
      "comment": "\n     * Returns the next pseudorandom, uniformly distributed\n     * {@code double} value between {@code 0.0} and\n     * {@code 1.0} from this random number generator\u0027s sequence.\n     * \u003cp\u003e\n     * This method provides the underlying source of random data used by the\n     * other methods.\u003c/p\u003e\n     *\n     * @return  the next pseudorandom, uniformly distributed\n     *  {@code double} value between {@code 0.0} and\n     *  {@code 1.0} from this random number generator\u0027s sequence\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.AbstractRandomGenerator.nextGaussian()",
      "begin_line": 251,
      "end_line": 270,
      "comment": "\n     * Returns the next pseudorandom, Gaussian (\"normally\") distributed\n     * {@code double} value with mean {@code 0.0} and standard\n     * deviation {@code 1.0} from this random number generator\u0027s sequence.\n     * \u003cp\u003e\n     * The default implementation uses the \u003cem\u003ePolar Method\u003c/em\u003e\n     * due to G.E.P. Box, M.E. Muller and G. Marsaglia, as described in\n     * D. Knuth, \u003cu\u003eThe Art of Computer Programming\u003c/u\u003e, 3.4.1C.\u003c/p\u003e\n     * \u003cp\u003e\n     * The algorithm generates a pair of independent random values.  One of\n     * these is cached for reuse, so the full algorithm is not executed on each\n     * activation.  Implementations that do not override this method should\n     * make sure to call {@link #clear} to clear the cached value in the\n     * implementation of {@link #setSeed(long)}.\u003c/p\u003e\n     *\n     * @return  the next pseudorandom, Gaussian (\"normally\") distributed\n     * {@code double} value with mean {@code 0.0} and\n     * standard deviation {@code 1.0} from this random number\n     *  generator\u0027s sequence\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 256,col 9)",
        "(line 257,col 9)-(line 257,col 22)",
        "(line 258,col 9)-(line 258,col 22)",
        "(line 259,col 9)-(line 259,col 21)",
        "(line 260,col 9)-(line 264,col 9)",
        "(line 265,col 9)-(line 267,col 9)",
        "(line 268,col 9)-(line 268,col 37)",
        "(line 269,col 9)-(line 269,col 22)"
      ]
    }
  ]
}