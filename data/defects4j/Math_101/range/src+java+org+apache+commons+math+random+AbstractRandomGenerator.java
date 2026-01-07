{
  "filepath": "/tmp/Math-101b/src/java/org/apache/commons/math/random/AbstractRandomGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractRandomGenerator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.random.RandomGenerator"
      ],
      "begin_line": 33,
      "end_line": 252,
      "comment": "\n * Abstract class implementing the {@link  RandomGenerator} interface.\n * Default implementations for all methods other than {@link #nextDouble()} and\n * {@link #setSeed(long)} are provided. \n * \u003cp\u003e\n * All data generation methods are based on \u003ccode\u003enextDouble().\u003c/code\u003e\n * Concrete implementations \u003cstrong\u003emust\u003c/strong\u003e override\n * this method and \u003cstrong\u003eshould\u003c/strong\u003e provide better / more\n * performant implementations of the other methods if the underlying PRNG\n * supplies them.\u003c/p\u003e\n *\n * @since 1.1\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "cachedNormalDeviate"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " \n     * Cached random normal value.  The default implementation for \n     * {@link #nextGaussian} generates pairs of values and this field caches the\n     * second value so that the full algorithm is not executed for every\n     * activation.  The value \u003ccode\u003eDouble.NaN\u003c/code\u003e signals that there is\n     * no cached value.  Use {@link #clear} to clear the cached value.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.AbstractRandomGenerator.AbstractRandomGenerator()",
      "begin_line": 47,
      "end_line": 50,
      "comment": "\n     * Construct a RandomGenerator.\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.AbstractRandomGenerator.clear()",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * Clears the cache used by the default implementation of \n     * {@link #nextGaussian}. Implemementations that do not override the\n     * default implementation of \u003ccode\u003enextGaussian\u003c/code\u003e should call this\n     * method in the implementation of {@link #setSeed(long)}\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.AbstractRandomGenerator.setSeed(long)",
      "begin_line": 73,
      "end_line": 73,
      "comment": "\n     * Sets the seed of the underyling random number generator using a \n     * \u003ccode\u003elong\u003c/code\u003e seed.  Sequences of values generated starting with the\n     * same seeds should be identical.\n     * \u003cp\u003e\n     * Implementations that do not override the default implementation of \n     * \u003ccode\u003enextGaussian\u003c/code\u003e should include a call to {@link #clear} in the\n     * implementation of this method.\u003c/p\u003e\n     *\n     * @param seed the seed value\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.AbstractRandomGenerator.nextBytes(byte[])",
      "begin_line": 86,
      "end_line": 100,
      "comment": "\n     * Generates random bytes and places them into a user-supplied \n     * byte array.  The number of random bytes produced is equal to \n     * the length of the byte array.\n     * \u003cp\u003e\n     * The default implementation fills the array with bytes extracted from\n     * random integers generated using {@link #nextInt}.\u003c/p\u003e\n     * \n     * @param bytes the non-null byte array in which to put the \n     * random bytes\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 25)",
        "(line 88,col 9)-(line 99,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.AbstractRandomGenerator.nextInt()",
      "begin_line": 116,
      "end_line": 118,
      "comment": "\n     * Returns the next pseudorandom, uniformly distributed \u003ccode\u003eint\u003c/code\u003e\n     * value from this random number generator\u0027s sequence.  \n     * All 2\u003cfont size\u003d\"-1\"\u003e\u003csup\u003e32\u003c/sup\u003e\u003c/font\u003e possible \u003ctt\u003eint\u003c/tt\u003e values\n     * should be produced with  (approximately) equal probability. \n     * \u003cp\u003e\n     * The default implementation provided here returns \n     * \u003cpre\u003e\n     * \u003ccode\u003e(int) (nextDouble() * Integer.MAX_VALUE)\u003c/code\u003e\n     * \u003c/pre\u003e\u003c/p\u003e\n     *\n     * @return the next pseudorandom, uniformly distributed \u003ccode\u003eint\u003c/code\u003e\n     *  value from this random number generator\u0027s sequence\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.AbstractRandomGenerator.nextInt(int)",
      "begin_line": 136,
      "end_line": 142,
      "comment": "\n     * Returns a pseudorandom, uniformly distributed \u003ctt\u003eint\u003c/tt\u003e value\n     * between 0 (inclusive) and the specified value (exclusive), drawn from\n     * this random number generator\u0027s sequence. \n     * \u003cp\u003e  \n     * The default implementation returns \n     * \u003cpre\u003e\n     * \u003ccode\u003e(int) (nextDouble() * n\u003c/code\u003e\n     * \u003c/pre\u003e\u003c/p\u003e\n     *\n     * @param n the bound on the random number to be returned.  Must be\n     * positive.\n     * @return  a pseudorandom, uniformly distributed \u003ctt\u003eint\u003c/tt\u003e\n     * value between 0 (inclusive) and n (exclusive).\n     * @throws IllegalArgumentException if n is not positive.\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 139,col 9)",
        "(line 140,col 9)-(line 140,col 46)",
        "(line 141,col 9)-(line 141,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.AbstractRandomGenerator.nextLong()",
      "begin_line": 158,
      "end_line": 160,
      "comment": "\n     * Returns the next pseudorandom, uniformly distributed \u003ccode\u003elong\u003c/code\u003e\n     * value from this random number generator\u0027s sequence.  All \n     * 2\u003cfont size\u003d\"-1\"\u003e\u003csup\u003e64\u003c/sup\u003e\u003c/font\u003e possible \u003ctt\u003elong\u003c/tt\u003e values \n     * should be produced with (approximately) equal probability. \n     * \u003cp\u003e  \n     * The default implementation returns \n     * \u003cpre\u003e\n     * \u003ccode\u003e(long) (nextDouble() * Long.MAX_VALUE)\u003c/code\u003e\n     * \u003c/pre\u003e\u003c/p\u003e\n     *\n     * @return  the next pseudorandom, uniformly distributed \u003ccode\u003elong\u003c/code\u003e\n     *value from this random number generator\u0027s sequence\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.AbstractRandomGenerator.nextBoolean()",
      "begin_line": 176,
      "end_line": 178,
      "comment": "\n     * Returns the next pseudorandom, uniformly distributed\n     * \u003ccode\u003eboolean\u003c/code\u003e value from this random number generator\u0027s\n     * sequence.  \n     * \u003cp\u003e  \n     * The default implementation returns \n     * \u003cpre\u003e\n     * \u003ccode\u003enextDouble() \u003c\u003d 0.5\u003c/code\u003e\n     * \u003c/pre\u003e\u003c/p\u003e\n     * \n     * @return  the next pseudorandom, uniformly distributed\n     * \u003ccode\u003eboolean\u003c/code\u003e value from this random number generator\u0027s\n     * sequence\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.AbstractRandomGenerator.nextFloat()",
      "begin_line": 194,
      "end_line": 196,
      "comment": "\n     * Returns the next pseudorandom, uniformly distributed \u003ccode\u003efloat\u003c/code\u003e\n     * value between \u003ccode\u003e0.0\u003c/code\u003e and \u003ccode\u003e1.0\u003c/code\u003e from this random\n     * number generator\u0027s sequence.  \n     * \u003cp\u003e  \n     * The default implementation returns \n     * \u003cpre\u003e\n     * \u003ccode\u003e(float) nextDouble() \u003c/code\u003e\n     * \u003c/pre\u003e\u003c/p\u003e\n     *\n     * @return  the next pseudorandom, uniformly distributed \u003ccode\u003efloat\u003c/code\u003e\n     * value between \u003ccode\u003e0.0\u003c/code\u003e and \u003ccode\u003e1.0\u003c/code\u003e from this\n     * random number generator\u0027s sequence\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.AbstractRandomGenerator.nextDouble()",
      "begin_line": 210,
      "end_line": 210,
      "comment": "\n     * Returns the next pseudorandom, uniformly distributed \n     * \u003ccode\u003edouble\u003c/code\u003e value between \u003ccode\u003e0.0\u003c/code\u003e and\n     * \u003ccode\u003e1.0\u003c/code\u003e from this random number generator\u0027s sequence.  \n     * \u003cp\u003e\n     * This method provides the underlying source of random data used by the\n     * other methods.\u003c/p\u003e   \n     *\n     * @return  the next pseudorandom, uniformly distributed \n     *  \u003ccode\u003edouble\u003c/code\u003e value between \u003ccode\u003e0.0\u003c/code\u003e and\n     *  \u003ccode\u003e1.0\u003c/code\u003e from this random number generator\u0027s sequence\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.AbstractRandomGenerator.nextGaussian()",
      "begin_line": 232,
      "end_line": 251,
      "comment": "\n     * Returns the next pseudorandom, Gaussian (\"normally\") distributed\n     * \u003ccode\u003edouble\u003c/code\u003e value with mean \u003ccode\u003e0.0\u003c/code\u003e and standard\n     * deviation \u003ccode\u003e1.0\u003c/code\u003e from this random number generator\u0027s sequence.\n     * \u003cp\u003e\n     * The default implementation uses the \u003cem\u003ePolar Method\u003c/em\u003e\n     * due to G.E.P. Box, M.E. Muller and G. Marsaglia, as described in \n     * D. Knuth, \u003cu\u003eThe Art of Computer Programming\u003c/u\u003e, 3.4.1C.\u003c/p\u003e\n     * \u003cp\u003e\n     * The algorithm generates a pair of independent random values.  One of\n     * these is cached for reuse, so the full algorithm is not executed on each\n     * activation.  Implementations that do not override this method should\n     * make sure to call {@link #clear} to clear the cached value in the \n     * implementation of {@link #setSeed(long)}.\u003c/p\u003e\n     * \n     * @return  the next pseudorandom, Gaussian (\"normally\") distributed\n     * \u003ccode\u003edouble\u003c/code\u003e value with mean \u003ccode\u003e0.0\u003c/code\u003e and\n     * standard deviation \u003ccode\u003e1.0\u003c/code\u003e from this random number\n     *  generator\u0027s sequence\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 237,col 9)",
        "(line 238,col 9)-(line 238,col 22)",
        "(line 239,col 9)-(line 239,col 22)",
        "(line 240,col 9)-(line 240,col 21)",
        "(line 241,col 9)-(line 245,col 9)",
        "(line 246,col 9)-(line 248,col 9)",
        "(line 249,col 9)-(line 249,col 37)",
        "(line 250,col 9)-(line 250,col 22)"
      ]
    }
  ]
}