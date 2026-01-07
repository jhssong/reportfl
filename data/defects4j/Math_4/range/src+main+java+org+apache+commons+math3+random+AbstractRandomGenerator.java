{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/random/AbstractRandomGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractRandomGenerator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.random.RandomGenerator"
      ],
      "begin_line": 36,
      "end_line": 272,
      "comment": "\n * Abstract class implementing the {@link  RandomGenerator} interface.\n * Default implementations for all methods other than {@link #nextDouble()} and\n * {@link #setSeed(long)} are provided.\n * \u003cp\u003e\n * All data generation methods are based on {@code code nextDouble()}.\n * Concrete implementations \u003cstrong\u003emust\u003c/strong\u003e override\n * this method and \u003cstrong\u003eshould\u003c/strong\u003e provide better / more\n * performant implementations of the other methods if the underlying PRNG\n * supplies them.\u003c/p\u003e\n *\n * @since 1.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "cachedNormalDeviate"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * Cached random normal value.  The default implementation for\n     * {@link #nextGaussian} generates pairs of values and this field caches the\n     * second value so that the full algorithm is not executed for every\n     * activation.  The value {@code Double.NaN} signals that there is\n     * no cached value.  Use {@link #clear} to clear the cached value.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.AbstractRandomGenerator.AbstractRandomGenerator()",
      "begin_line": 50,
      "end_line": 53,
      "comment": "\n     * Construct a RandomGenerator.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.AbstractRandomGenerator.clear()",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * Clears the cache used by the default implementation of\n     * {@link #nextGaussian}. Implementations that do not override the\n     * default implementation of {@code nextGaussian} should call this\n     * method in the implementation of {@link #setSeed(long)}\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.AbstractRandomGenerator.setSeed(int)",
      "begin_line": 66,
      "end_line": 68,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.AbstractRandomGenerator.setSeed(int[])",
      "begin_line": 71,
      "end_line": 80,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 39)",
        "(line 75,col 9)-(line 75,col 27)",
        "(line 76,col 9)-(line 78,col 9)",
        "(line 79,col 9)-(line 79,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.AbstractRandomGenerator.setSeed(long)",
      "begin_line": 93,
      "end_line": 93,
      "comment": "\n     * Sets the seed of the underlying random number generator using a\n     * {@code long} seed.  Sequences of values generated starting with the\n     * same seeds should be identical.\n     * \u003cp\u003e\n     * Implementations that do not override the default implementation of\n     * {@code nextGaussian} should include a call to {@link #clear} in the\n     * implementation of this method.\u003c/p\u003e\n     *\n     * @param seed the seed value\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.AbstractRandomGenerator.nextBytes(byte[])",
      "begin_line": 106,
      "end_line": 120,
      "comment": "\n     * Generates random bytes and places them into a user-supplied\n     * byte array.  The number of random bytes produced is equal to\n     * the length of the byte array.\n     * \u003cp\u003e\n     * The default implementation fills the array with bytes extracted from\n     * random integers generated using {@link #nextInt}.\u003c/p\u003e\n     *\n     * @param bytes the non-null byte array in which to put the\n     * random bytes\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 25)",
        "(line 108,col 9)-(line 119,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.AbstractRandomGenerator.nextInt()",
      "begin_line": 136,
      "end_line": 138,
      "comment": "\n     * Returns the next pseudorandom, uniformly distributed {@code int}\n     * value from this random number generator\u0027s sequence.\n     * All 2\u003cfont size\u003d\"-1\"\u003e\u003csup\u003e32\u003c/sup\u003e\u003c/font\u003e possible {@code int} values\n     * should be produced with  (approximately) equal probability.\n     * \u003cp\u003e\n     * The default implementation provided here returns\n     * \u003cpre\u003e\n     * \u003ccode\u003e(int) (nextDouble() * Integer.MAX_VALUE)\u003c/code\u003e\n     * \u003c/pre\u003e\u003c/p\u003e\n     *\n     * @return the next pseudorandom, uniformly distributed {@code int}\n     *  value from this random number generator\u0027s sequence\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.AbstractRandomGenerator.nextInt(int)",
      "begin_line": 156,
      "end_line": 162,
      "comment": "\n     * Returns a pseudorandom, uniformly distributed {@code int} value\n     * between 0 (inclusive) and the specified value (exclusive), drawn from\n     * this random number generator\u0027s sequence.\n     * \u003cp\u003e\n     * The default implementation returns\n     * \u003cpre\u003e\n     * \u003ccode\u003e(int) (nextDouble() * n\u003c/code\u003e\n     * \u003c/pre\u003e\u003c/p\u003e\n     *\n     * @param n the bound on the random number to be returned.  Must be\n     * positive.\n     * @return  a pseudorandom, uniformly distributed {@code int}\n     * value between 0 (inclusive) and n (exclusive).\n     * @throws NotStrictlyPositiveException if {@code n \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 160,col 46)",
        "(line 161,col 9)-(line 161,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.AbstractRandomGenerator.nextLong()",
      "begin_line": 178,
      "end_line": 180,
      "comment": "\n     * Returns the next pseudorandom, uniformly distributed {@code long}\n     * value from this random number generator\u0027s sequence.  All\n     * 2\u003cfont size\u003d\"-1\"\u003e\u003csup\u003e64\u003c/sup\u003e\u003c/font\u003e possible {@code long} values\n     * should be produced with (approximately) equal probability.\n     * \u003cp\u003e\n     * The default implementation returns\n     * \u003cpre\u003e\n     * \u003ccode\u003e(long) (nextDouble() * Long.MAX_VALUE)\u003c/code\u003e\n     * \u003c/pre\u003e\u003c/p\u003e\n     *\n     * @return  the next pseudorandom, uniformly distributed {@code long}\n     *value from this random number generator\u0027s sequence\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.AbstractRandomGenerator.nextBoolean()",
      "begin_line": 196,
      "end_line": 198,
      "comment": "\n     * Returns the next pseudorandom, uniformly distributed\n     * {@code boolean} value from this random number generator\u0027s\n     * sequence.\n     * \u003cp\u003e\n     * The default implementation returns\n     * \u003cpre\u003e\n     * \u003ccode\u003enextDouble() \u003c\u003d 0.5\u003c/code\u003e\n     * \u003c/pre\u003e\u003c/p\u003e\n     *\n     * @return  the next pseudorandom, uniformly distributed\n     * {@code boolean} value from this random number generator\u0027s\n     * sequence\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.AbstractRandomGenerator.nextFloat()",
      "begin_line": 214,
      "end_line": 216,
      "comment": "\n     * Returns the next pseudorandom, uniformly distributed {@code float}\n     * value between {@code 0.0} and {@code 1.0} from this random\n     * number generator\u0027s sequence.\n     * \u003cp\u003e\n     * The default implementation returns\n     * \u003cpre\u003e\n     * \u003ccode\u003e(float) nextDouble() \u003c/code\u003e\n     * \u003c/pre\u003e\u003c/p\u003e\n     *\n     * @return  the next pseudorandom, uniformly distributed {@code float}\n     * value between {@code 0.0} and {@code 1.0} from this\n     * random number generator\u0027s sequence\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.AbstractRandomGenerator.nextDouble()",
      "begin_line": 230,
      "end_line": 230,
      "comment": "\n     * Returns the next pseudorandom, uniformly distributed\n     * {@code double} value between {@code 0.0} and\n     * {@code 1.0} from this random number generator\u0027s sequence.\n     * \u003cp\u003e\n     * This method provides the underlying source of random data used by the\n     * other methods.\u003c/p\u003e\n     *\n     * @return  the next pseudorandom, uniformly distributed\n     *  {@code double} value between {@code 0.0} and\n     *  {@code 1.0} from this random number generator\u0027s sequence\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.AbstractRandomGenerator.nextGaussian()",
      "begin_line": 252,
      "end_line": 271,
      "comment": "\n     * Returns the next pseudorandom, Gaussian (\"normally\") distributed\n     * {@code double} value with mean {@code 0.0} and standard\n     * deviation {@code 1.0} from this random number generator\u0027s sequence.\n     * \u003cp\u003e\n     * The default implementation uses the \u003cem\u003ePolar Method\u003c/em\u003e\n     * due to G.E.P. Box, M.E. Muller and G. Marsaglia, as described in\n     * D. Knuth, \u003cu\u003eThe Art of Computer Programming\u003c/u\u003e, 3.4.1C.\u003c/p\u003e\n     * \u003cp\u003e\n     * The algorithm generates a pair of independent random values.  One of\n     * these is cached for reuse, so the full algorithm is not executed on each\n     * activation.  Implementations that do not override this method should\n     * make sure to call {@link #clear} to clear the cached value in the\n     * implementation of {@link #setSeed(long)}.\u003c/p\u003e\n     *\n     * @return  the next pseudorandom, Gaussian (\"normally\") distributed\n     * {@code double} value with mean {@code 0.0} and\n     * standard deviation {@code 1.0} from this random number\n     *  generator\u0027s sequence\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 257,col 9)",
        "(line 258,col 9)-(line 258,col 22)",
        "(line 259,col 9)-(line 259,col 22)",
        "(line 260,col 9)-(line 260,col 21)",
        "(line 261,col 9)-(line 265,col 9)",
        "(line 266,col 9)-(line 268,col 9)",
        "(line 269,col 9)-(line 269,col 37)",
        "(line 270,col 9)-(line 270,col 22)"
      ]
    }
  ]
}