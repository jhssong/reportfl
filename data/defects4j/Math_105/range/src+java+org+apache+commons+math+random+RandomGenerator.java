{
  "filepath": "/tmp/Math-105b/src/java/org/apache/commons/math/random/RandomGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RandomGenerator",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 25,
      "end_line": 125,
      "comment": "\n * Interface extracted from \u003ccode\u003ejava.util.Random\u003c/code\u003e.  This interface is\n * implemented by {@link AbstractRandomGenerator}.  \n *\n * @since 1.1\n * @version $Revision:$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGenerator.setSeed(long)",
      "begin_line": 34,
      "end_line": 34,
      "comment": "\n     * Sets the seed of the underyling random number generator using a \n     * \u003ccode\u003elong\u003c/code\u003e seed.  Sequences of values generated starting with the\n     * same seeds should be identical.\n     *\n     * @param seed the seed value\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGenerator.nextBytes(byte[])",
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * Generates random bytes and places them into a user-supplied \n     * byte array.  The number of random bytes produced is equal to \n     * the length of the byte array.\n     * \n     * @param bytes the non-null byte array in which to put the \n     * random bytes\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGenerator.nextInt()",
      "begin_line": 55,
      "end_line": 55,
      "comment": "\n     * Returns the next pseudorandom, uniformly distributed \u003ccode\u003eint\u003c/code\u003e\n     * value from this random number generator\u0027s sequence.  \n     * All 2\u003cfont size\u003d\"-1\"\u003e\u003csup\u003e32\u003c/sup\u003e\u003c/font\u003e possible \u003ctt\u003eint\u003c/tt\u003e values\n     * should be produced with  (approximately) equal probability. \n     *\n     * @return the next pseudorandom, uniformly distributed \u003ccode\u003eint\u003c/code\u003e\n     *  value from this random number generator\u0027s sequence\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGenerator.nextInt(int)",
      "begin_line": 68,
      "end_line": 68,
      "comment": "\n     * Returns a pseudorandom, uniformly distributed \u003ctt\u003eint\u003c/tt\u003e value\n     * between 0 (inclusive) and the specified value (exclusive), drawn from\n     * this random number generator\u0027s sequence.   \n     *\n     * @param n the bound on the random number to be returned.  Must be\n     * positive.\n     * @return  a pseudorandom, uniformly distributed \u003ctt\u003eint\u003c/tt\u003e\n     * value between 0 (inclusive) and n (exclusive).\n     * @throws IllegalArgumentException  if n is not positive.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGenerator.nextLong()",
      "begin_line": 79,
      "end_line": 79,
      "comment": "\n     * Returns the next pseudorandom, uniformly distributed \u003ccode\u003elong\u003c/code\u003e\n     * value from this random number generator\u0027s sequence.  All \n     * 2\u003cfont size\u003d\"-1\"\u003e\u003csup\u003e64\u003c/sup\u003e\u003c/font\u003e possible \u003ctt\u003elong\u003c/tt\u003e values \n     * should be produced with (approximately) equal probability. \n     *\n     * @return  the next pseudorandom, uniformly distributed \u003ccode\u003elong\u003c/code\u003e\n     *value from this random number generator\u0027s sequence\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGenerator.nextBoolean()",
      "begin_line": 90,
      "end_line": 90,
      "comment": "\n     * Returns the next pseudorandom, uniformly distributed\n     * \u003ccode\u003eboolean\u003c/code\u003e value from this random number generator\u0027s\n     * sequence.  \n     * \n     * @return  the next pseudorandom, uniformly distributed\n     * \u003ccode\u003eboolean\u003c/code\u003e value from this random number generator\u0027s\n     * sequence\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGenerator.nextFloat()",
      "begin_line": 101,
      "end_line": 101,
      "comment": "\n     * Returns the next pseudorandom, uniformly distributed \u003ccode\u003efloat\u003c/code\u003e\n     * value between \u003ccode\u003e0.0\u003c/code\u003e and \u003ccode\u003e1.0\u003c/code\u003e from this random\n     * number generator\u0027s sequence.  \n     *\n     * @return  the next pseudorandom, uniformly distributed \u003ccode\u003efloat\u003c/code\u003e\n     * value between \u003ccode\u003e0.0\u003c/code\u003e and \u003ccode\u003e1.0\u003c/code\u003e from this\n     * random number generator\u0027s sequence\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGenerator.nextDouble()",
      "begin_line": 112,
      "end_line": 112,
      "comment": "\n     * Returns the next pseudorandom, uniformly distributed \n     * \u003ccode\u003edouble\u003c/code\u003e value between \u003ccode\u003e0.0\u003c/code\u003e and\n     * \u003ccode\u003e1.0\u003c/code\u003e from this random number generator\u0027s sequence.  \n     *\n     * @return  the next pseudorandom, uniformly distributed \n     *  \u003ccode\u003edouble\u003c/code\u003e value between \u003ccode\u003e0.0\u003c/code\u003e and\n     *  \u003ccode\u003e1.0\u003c/code\u003e from this random number generator\u0027s sequence\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomGenerator.nextGaussian()",
      "begin_line": 124,
      "end_line": 124,
      "comment": "\n     * Returns the next pseudorandom, Gaussian (\"normally\") distributed\n     * \u003ccode\u003edouble\u003c/code\u003e value with mean \u003ccode\u003e0.0\u003c/code\u003e and standard\n     * deviation \u003ccode\u003e1.0\u003c/code\u003e from this random number generator\u0027s sequence.\n     * \n     * @return  the next pseudorandom, Gaussian (\"normally\") distributed\n     * \u003ccode\u003edouble\u003c/code\u003e value with mean \u003ccode\u003e0.0\u003c/code\u003e and\n     * standard deviation \u003ccode\u003e1.0\u003c/code\u003e from this random number\n     *  generator\u0027s sequence\n     ",
      "child_ranges": []
    }
  ]
}