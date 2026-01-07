{
  "filepath": "/tmp/Math-91b/src/java/org/apache/commons/math/random/RandomAdaptor.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RandomAdaptor",
      "is_interface": false,
      "parent_types": [
        "java.util.Random",
        "org.apache.commons.math.random.RandomGenerator"
      ],
      "begin_line": 28,
      "end_line": 180,
      "comment": "\n * Extension of \u003ccode\u003ejava.util.Random\u003c/code\u003e wrapping a\n * {@link RandomGenerator}.   \n *\n * @since 1.1\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "randomGenerator"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Wrapped randomGenerator instance "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.RandomAdaptor.RandomAdaptor()",
      "begin_line": 39,
      "end_line": 40,
      "comment": " \n     * Prevent instantiation without a generator argument\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.RandomAdaptor.RandomAdaptor(org.apache.commons.math.random.RandomGenerator)",
      "begin_line": 47,
      "end_line": 49,
      "comment": "\n     * Construct a RandomAdaptor wrapping the supplied RandomGenerator.\n     * \n     * @param randomGenerator  the wrapped generator\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomAdaptor.createAdaptor(org.apache.commons.math.random.RandomGenerator)",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * Factory method to create a \u003ccode\u003eRandom\u003c/code\u003e using the supplied\n     * \u003ccode\u003eRandomGenerator\u003c/code\u003e.\n     * \n     * @param randomGenerator  wrapped RandomGenerator instance\n     * @return a Random instance wrapping the RandomGenerator\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomAdaptor.nextBoolean()",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * Returns the next pseudorandom, uniformly distributed\n     * \u003ccode\u003eboolean\u003c/code\u003e value from this random number generator\u0027s\n     * sequence.  \n     * \n     * @return  the next pseudorandom, uniformly distributed\n     * \u003ccode\u003eboolean\u003c/code\u003e value from this random number generator\u0027s\n     * sequence\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomAdaptor.nextBytes(byte[])",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * Generates random bytes and places them into a user-supplied \n     * byte array.  The number of random bytes produced is equal to \n     * the length of the byte array.\n     * \n     * @param bytes the non-null byte array in which to put the \n     * random bytes\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomAdaptor.nextDouble()",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * Returns the next pseudorandom, uniformly distributed \n     * \u003ccode\u003edouble\u003c/code\u003e value between \u003ccode\u003e0.0\u003c/code\u003e and\n     * \u003ccode\u003e1.0\u003c/code\u003e from this random number generator\u0027s sequence.  \n     *\n     * @return  the next pseudorandom, uniformly distributed \n     *  \u003ccode\u003edouble\u003c/code\u003e value between \u003ccode\u003e0.0\u003c/code\u003e and\n     *  \u003ccode\u003e1.0\u003c/code\u003e from this random number generator\u0027s sequence\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomAdaptor.nextFloat()",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n     * Returns the next pseudorandom, uniformly distributed \u003ccode\u003efloat\u003c/code\u003e\n     * value between \u003ccode\u003e0.0\u003c/code\u003e and \u003ccode\u003e1.0\u003c/code\u003e from this random\n     * number generator\u0027s sequence.  \n     *\n     * @return  the next pseudorandom, uniformly distributed \u003ccode\u003efloat\u003c/code\u003e\n     * value between \u003ccode\u003e0.0\u003c/code\u003e and \u003ccode\u003e1.0\u003c/code\u003e from this\n     * random number generator\u0027s sequence\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomAdaptor.nextGaussian()",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\n     * Returns the next pseudorandom, Gaussian (\"normally\") distributed\n     * \u003ccode\u003edouble\u003c/code\u003e value with mean \u003ccode\u003e0.0\u003c/code\u003e and standard\n     * deviation \u003ccode\u003e1.0\u003c/code\u003e from this random number generator\u0027s sequence.\n     * \n     * @return  the next pseudorandom, Gaussian (\"normally\") distributed\n     * \u003ccode\u003edouble\u003c/code\u003e value with mean \u003ccode\u003e0.0\u003c/code\u003e and\n     * standard deviation \u003ccode\u003e1.0\u003c/code\u003e from this random number\n     *  generator\u0027s sequence\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomAdaptor.nextInt()",
      "begin_line": 136,
      "end_line": 138,
      "comment": "\n     * Returns the next pseudorandom, uniformly distributed \u003ccode\u003eint\u003c/code\u003e\n     * value from this random number generator\u0027s sequence.  \n     * All 2\u003cfont size\u003d\"-1\"\u003e\u003csup\u003e32\u003c/sup\u003e\u003c/font\u003e possible \u003ctt\u003eint\u003c/tt\u003e values\n     * should be produced with  (approximately) equal probability. \n     *\n     * @return the next pseudorandom, uniformly distributed \u003ccode\u003eint\u003c/code\u003e\n     *  value from this random number generator\u0027s sequence\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomAdaptor.nextInt(int)",
      "begin_line": 151,
      "end_line": 153,
      "comment": "\n     * Returns a pseudorandom, uniformly distributed \u003ctt\u003eint\u003c/tt\u003e value\n     * between 0 (inclusive) and the specified value (exclusive), drawn from\n     * this random number generator\u0027s sequence.   \n     *\n     * @param n the bound on the random number to be returned.  Must be\n     * positive.\n     * @return  a pseudorandom, uniformly distributed \u003ctt\u003eint\u003c/tt\u003e\n     * value between 0 (inclusive) and n (exclusive).\n     * @throws IllegalArgumentException  if n is not positive.\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomAdaptor.nextLong()",
      "begin_line": 164,
      "end_line": 166,
      "comment": "\n     * Returns the next pseudorandom, uniformly distributed \u003ccode\u003elong\u003c/code\u003e\n     * value from this random number generator\u0027s sequence.  All \n     * 2\u003cfont size\u003d\"-1\"\u003e\u003csup\u003e64\u003c/sup\u003e\u003c/font\u003e possible \u003ctt\u003elong\u003c/tt\u003e values \n     * should be produced with (approximately) equal probability. \n     *\n     * @return  the next pseudorandom, uniformly distributed \u003ccode\u003elong\u003c/code\u003e\n     *value from this random number generator\u0027s sequence\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomAdaptor.setSeed(long)",
      "begin_line": 175,
      "end_line": 179,
      "comment": "\n     * Sets the seed of the underyling random number generator using a \n     * \u003ccode\u003elong\u003c/code\u003e seed.  Sequences of values generated starting with the\n     * same seeds should be identical.\n     *\n     * @param seed the seed value\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 178,col 9)"
      ]
    }
  ]
}