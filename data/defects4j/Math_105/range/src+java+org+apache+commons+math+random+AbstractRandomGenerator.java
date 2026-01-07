{
  "filepath": "/tmp/Math-105b/src/java/org/apache/commons/math/random/AbstractRandomGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractRandomGenerator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.random.RandomGenerator"
      ],
      "begin_line": 32,
      "end_line": 251,
      "comment": "\n * Abstract class implementing the {@link  RandomGenerator} interface.\n * Default implementations for all methods other than {@link #nextDouble()} and\n * {@link #setSeed(long)} are provided. \n * \u003cp\u003e\n * All data generation methods are based on \u003ccode\u003enextDouble().\u003c/code\u003e\n * Concrete implementations \u003cstrong\u003emust\u003c/strong\u003e override\n * this method and \u003cstrong\u003eshould\u003c/strong\u003e provide better / more\n * performant implementations of the other methods if the underlying PRNG\n * supplies them.\n *\n * @since 1.1\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "cachedNormalDeviate"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " \n     * Cached random normal value.  The default implementation for \n     * {@link #nextGaussian} generates pairs of values and this field caches the\n     * second value so that the full algorithm is not executed for every\n     * activation.  The value \u003ccode\u003eDouble.NaN\u003c/code\u003e signals that there is\n     * no cached value.  Use {@link #clear} to clear the cached value.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.AbstractRandomGenerator.AbstractRandomGenerator()",
      "begin_line": 46,
      "end_line": 49,
      "comment": "\n     * Construct a RandomGenerator.\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.AbstractRandomGenerator.clear()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * Clears the cache used by the default implementation of \n     * {@link #nextGaussian}. Implemementations that do not override the\n     * default implementation of \u003ccode\u003enextGaussian\u003c/code\u003e should call this\n     * method in the implementation of {@link #setSeed(long)}\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.AbstractRandomGenerator.setSeed(long)",
      "begin_line": 72,
      "end_line": 72,
      "comment": "\n     * Sets the seed of the underyling random number generator using a \n     * \u003ccode\u003elong\u003c/code\u003e seed.  Sequences of values generated starting with the\n     * same seeds should be identical.\n     * \u003cp\u003e\n     * Implementations that do not override the default implementation of \n     * \u003ccode\u003enextGaussian\u003c/code\u003e should include a call to {@link #clear} in the\n     * implementation of this method.\n     *\n     * @param seed the seed value\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.AbstractRandomGenerator.nextBytes(byte[])",
      "begin_line": 85,
      "end_line": 99,
      "comment": "\n     * Generates random bytes and places them into a user-supplied \n     * byte array.  The number of random bytes produced is equal to \n     * the length of the byte array.\n     * \u003cp\u003e\n     * The default implementation fills the array with bytes extracted from\n     * random integers generated using {@link #nextInt}.\n     * \n     * @param bytes the non-null byte array in which to put the \n     * random bytes\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 25)",
        "(line 87,col 9)-(line 98,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.AbstractRandomGenerator.nextInt()",
      "begin_line": 115,
      "end_line": 117,
      "comment": "\n     * Returns the next pseudorandom, uniformly distributed \u003ccode\u003eint\u003c/code\u003e\n     * value from this random number generator\u0027s sequence.  \n     * All 2\u003cfont size\u003d\"-1\"\u003e\u003csup\u003e32\u003c/sup\u003e\u003c/font\u003e possible \u003ctt\u003eint\u003c/tt\u003e values\n     * should be produced with  (approximately) equal probability. \n     * \u003cp\u003e\n     * The default implementation provided here returns \n     * \u003cpre\u003e\n     * \u003ccode\u003e(int) (nextDouble() * Integer.MAX_VALUE)\u003c/code\u003e\n     * \u003c/pre\u003e\n     *\n     * @return the next pseudorandom, uniformly distributed \u003ccode\u003eint\u003c/code\u003e\n     *  value from this random number generator\u0027s sequence\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.AbstractRandomGenerator.nextInt(int)",
      "begin_line": 135,
      "end_line": 141,
      "comment": "\n     * Returns a pseudorandom, uniformly distributed \u003ctt\u003eint\u003c/tt\u003e value\n     * between 0 (inclusive) and the specified value (exclusive), drawn from\n     * this random number generator\u0027s sequence. \n     * \u003cp\u003e  \n     * The default implementation returns \n     * \u003cpre\u003e\n     * \u003ccode\u003e(int) (nextDouble() * n\u003c/code\u003e\n     * \u003c/pre\u003e\n     *\n     * @param n the bound on the random number to be returned.  Must be\n     * positive.\n     * @return  a pseudorandom, uniformly distributed \u003ctt\u003eint\u003c/tt\u003e\n     * value between 0 (inclusive) and n (exclusive).\n     * @throws IllegalArgumentException if n is not positive.\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 139,col 46)",
        "(line 140,col 9)-(line 140,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.AbstractRandomGenerator.nextLong()",
      "begin_line": 157,
      "end_line": 159,
      "comment": "\n     * Returns the next pseudorandom, uniformly distributed \u003ccode\u003elong\u003c/code\u003e\n     * value from this random number generator\u0027s sequence.  All \n     * 2\u003cfont size\u003d\"-1\"\u003e\u003csup\u003e64\u003c/sup\u003e\u003c/font\u003e possible \u003ctt\u003elong\u003c/tt\u003e values \n     * should be produced with (approximately) equal probability. \n     * \u003cp\u003e  \n     * The default implementation returns \n     * \u003cpre\u003e\n     * \u003ccode\u003e(long) (nextDouble() * Long.MAX_VALUE)\u003c/code\u003e\n     * \u003c/pre\u003e\n     *\n     * @return  the next pseudorandom, uniformly distributed \u003ccode\u003elong\u003c/code\u003e\n     *value from this random number generator\u0027s sequence\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.AbstractRandomGenerator.nextBoolean()",
      "begin_line": 175,
      "end_line": 177,
      "comment": "\n     * Returns the next pseudorandom, uniformly distributed\n     * \u003ccode\u003eboolean\u003c/code\u003e value from this random number generator\u0027s\n     * sequence.  \n     * \u003cp\u003e  \n     * The default implementation returns \n     * \u003cpre\u003e\n     * \u003ccode\u003enextDouble() \u003c\u003d 0.5\u003c/code\u003e\n     * \u003c/pre\u003e\n     * \n     * @return  the next pseudorandom, uniformly distributed\n     * \u003ccode\u003eboolean\u003c/code\u003e value from this random number generator\u0027s\n     * sequence\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.AbstractRandomGenerator.nextFloat()",
      "begin_line": 193,
      "end_line": 195,
      "comment": "\n     * Returns the next pseudorandom, uniformly distributed \u003ccode\u003efloat\u003c/code\u003e\n     * value between \u003ccode\u003e0.0\u003c/code\u003e and \u003ccode\u003e1.0\u003c/code\u003e from this random\n     * number generator\u0027s sequence.  \n     * \u003cp\u003e  \n     * The default implementation returns \n     * \u003cpre\u003e\n     * \u003ccode\u003e(float) nextDouble() \u003c/code\u003e\n     * \u003c/pre\u003e\n     *\n     * @return  the next pseudorandom, uniformly distributed \u003ccode\u003efloat\u003c/code\u003e\n     * value between \u003ccode\u003e0.0\u003c/code\u003e and \u003ccode\u003e1.0\u003c/code\u003e from this\n     * random number generator\u0027s sequence\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.AbstractRandomGenerator.nextDouble()",
      "begin_line": 209,
      "end_line": 209,
      "comment": "\n     * Returns the next pseudorandom, uniformly distributed \n     * \u003ccode\u003edouble\u003c/code\u003e value between \u003ccode\u003e0.0\u003c/code\u003e and\n     * \u003ccode\u003e1.0\u003c/code\u003e from this random number generator\u0027s sequence.  \n     * \u003cp\u003e\n     * This method provides the underlying source of random data used by the\n     * other methods.   \n     *\n     * @return  the next pseudorandom, uniformly distributed \n     *  \u003ccode\u003edouble\u003c/code\u003e value between \u003ccode\u003e0.0\u003c/code\u003e and\n     *  \u003ccode\u003e1.0\u003c/code\u003e from this random number generator\u0027s sequence\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.AbstractRandomGenerator.nextGaussian()",
      "begin_line": 231,
      "end_line": 250,
      "comment": "\n     * Returns the next pseudorandom, Gaussian (\"normally\") distributed\n     * \u003ccode\u003edouble\u003c/code\u003e value with mean \u003ccode\u003e0.0\u003c/code\u003e and standard\n     * deviation \u003ccode\u003e1.0\u003c/code\u003e from this random number generator\u0027s sequence.\n     * \u003cp\u003e\n     * The default implementation uses the \u003cem\u003ePolar Method\u003c/em\u003e\n     * due to G.E.P. Box, M.E. Muller and G. Marsaglia, as described in \n     * D. Knuth, \u003cu\u003eThe Art of Computer Programming\u003c/u\u003e, 3.4.1C.\n     * \u003cp\u003e\n     * The algorithm generates a pair of independent random values.  One of\n     * these is cached for reuse, so the full algorithm is not executed on each\n     * activation.  Implementations that do not override this method should\n     * make sure to call {@link #clear} to clear the cached value in the \n     * implementation of {@link #setSeed(long)}.\n     * \n     * @return  the next pseudorandom, Gaussian (\"normally\") distributed\n     * \u003ccode\u003edouble\u003c/code\u003e value with mean \u003ccode\u003e0.0\u003c/code\u003e and\n     * standard deviation \u003ccode\u003e1.0\u003c/code\u003e from this random number\n     *  generator\u0027s sequence\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 236,col 9)",
        "(line 237,col 9)-(line 237,col 22)",
        "(line 238,col 9)-(line 238,col 22)",
        "(line 239,col 9)-(line 239,col 21)",
        "(line 240,col 9)-(line 244,col 9)",
        "(line 245,col 9)-(line 247,col 9)",
        "(line 248,col 9)-(line 248,col 37)",
        "(line 249,col 9)-(line 249,col 22)"
      ]
    }
  ]
}