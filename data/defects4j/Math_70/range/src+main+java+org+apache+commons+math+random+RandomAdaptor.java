{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/random/RandomAdaptor.java",
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
      "end_line": 198,
      "comment": "\n * Extension of \u003ccode\u003ejava.util.Random\u003c/code\u003e wrapping a\n * {@link RandomGenerator}.\n *\n * @since 1.1\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " Serializable version identifier. "
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
      "comment": "\n     * Prevent instantiation without a generator argument\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.RandomAdaptor.RandomAdaptor(org.apache.commons.math.random.RandomGenerator)",
      "begin_line": 47,
      "end_line": 49,
      "comment": "\n     * Construct a RandomAdaptor wrapping the supplied RandomGenerator.\n     *\n     * @param randomGenerator  the wrapped generator\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomAdaptor.createAdaptor(org.apache.commons.math.random.RandomGenerator)",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * Factory method to create a \u003ccode\u003eRandom\u003c/code\u003e using the supplied\n     * \u003ccode\u003eRandomGenerator\u003c/code\u003e.\n     *\n     * @param randomGenerator  wrapped RandomGenerator instance\n     * @return a Random instance wrapping the RandomGenerator\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomAdaptor.nextBoolean()",
      "begin_line": 71,
      "end_line": 74,
      "comment": "\n     * Returns the next pseudorandom, uniformly distributed\n     * \u003ccode\u003eboolean\u003c/code\u003e value from this random number generator\u0027s\n     * sequence.\n     *\n     * @return  the next pseudorandom, uniformly distributed\n     * \u003ccode\u003eboolean\u003c/code\u003e value from this random number generator\u0027s\n     * sequence\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomAdaptor.nextBytes(byte[])",
      "begin_line": 84,
      "end_line": 87,
      "comment": "\n     * Generates random bytes and places them into a user-supplied\n     * byte array.  The number of random bytes produced is equal to\n     * the length of the byte array.\n     *\n     * @param bytes the non-null byte array in which to put the\n     * random bytes\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomAdaptor.nextDouble()",
      "begin_line": 98,
      "end_line": 101,
      "comment": "\n     * Returns the next pseudorandom, uniformly distributed\n     * \u003ccode\u003edouble\u003c/code\u003e value between \u003ccode\u003e0.0\u003c/code\u003e and\n     * \u003ccode\u003e1.0\u003c/code\u003e from this random number generator\u0027s sequence.\n     *\n     * @return  the next pseudorandom, uniformly distributed\n     *  \u003ccode\u003edouble\u003c/code\u003e value between \u003ccode\u003e0.0\u003c/code\u003e and\n     *  \u003ccode\u003e1.0\u003c/code\u003e from this random number generator\u0027s sequence\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomAdaptor.nextFloat()",
      "begin_line": 112,
      "end_line": 115,
      "comment": "\n     * Returns the next pseudorandom, uniformly distributed \u003ccode\u003efloat\u003c/code\u003e\n     * value between \u003ccode\u003e0.0\u003c/code\u003e and \u003ccode\u003e1.0\u003c/code\u003e from this random\n     * number generator\u0027s sequence.\n     *\n     * @return  the next pseudorandom, uniformly distributed \u003ccode\u003efloat\u003c/code\u003e\n     * value between \u003ccode\u003e0.0\u003c/code\u003e and \u003ccode\u003e1.0\u003c/code\u003e from this\n     * random number generator\u0027s sequence\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomAdaptor.nextGaussian()",
      "begin_line": 127,
      "end_line": 130,
      "comment": "\n     * Returns the next pseudorandom, Gaussian (\"normally\") distributed\n     * \u003ccode\u003edouble\u003c/code\u003e value with mean \u003ccode\u003e0.0\u003c/code\u003e and standard\n     * deviation \u003ccode\u003e1.0\u003c/code\u003e from this random number generator\u0027s sequence.\n     *\n     * @return  the next pseudorandom, Gaussian (\"normally\") distributed\n     * \u003ccode\u003edouble\u003c/code\u003e value with mean \u003ccode\u003e0.0\u003c/code\u003e and\n     * standard deviation \u003ccode\u003e1.0\u003c/code\u003e from this random number\n     *  generator\u0027s sequence\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomAdaptor.nextInt()",
      "begin_line": 141,
      "end_line": 144,
      "comment": "\n     * Returns the next pseudorandom, uniformly distributed \u003ccode\u003eint\u003c/code\u003e\n     * value from this random number generator\u0027s sequence.\n     * All 2\u003cfont size\u003d\"-1\"\u003e\u003csup\u003e32\u003c/sup\u003e\u003c/font\u003e possible \u003ctt\u003eint\u003c/tt\u003e values\n     * should be produced with  (approximately) equal probability.\n     *\n     * @return the next pseudorandom, uniformly distributed \u003ccode\u003eint\u003c/code\u003e\n     *  value from this random number generator\u0027s sequence\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomAdaptor.nextInt(int)",
      "begin_line": 157,
      "end_line": 160,
      "comment": "\n     * Returns a pseudorandom, uniformly distributed \u003ctt\u003eint\u003c/tt\u003e value\n     * between 0 (inclusive) and the specified value (exclusive), drawn from\n     * this random number generator\u0027s sequence.\n     *\n     * @param n the bound on the random number to be returned.  Must be\n     * positive.\n     * @return  a pseudorandom, uniformly distributed \u003ctt\u003eint\u003c/tt\u003e\n     * value between 0 (inclusive) and n (exclusive).\n     * @throws IllegalArgumentException  if n is not positive.\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomAdaptor.nextLong()",
      "begin_line": 171,
      "end_line": 174,
      "comment": "\n     * Returns the next pseudorandom, uniformly distributed \u003ccode\u003elong\u003c/code\u003e\n     * value from this random number generator\u0027s sequence.  All\n     * 2\u003cfont size\u003d\"-1\"\u003e\u003csup\u003e64\u003c/sup\u003e\u003c/font\u003e possible \u003ctt\u003elong\u003c/tt\u003e values\n     * should be produced with (approximately) equal probability.\n     *\n     * @return  the next pseudorandom, uniformly distributed \u003ccode\u003elong\u003c/code\u003e\n     *value from this random number generator\u0027s sequence\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomAdaptor.setSeed(int)",
      "begin_line": 177,
      "end_line": 181,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 178,col 9)-(line 180,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomAdaptor.setSeed(int[])",
      "begin_line": 184,
      "end_line": 188,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 185,col 9)-(line 187,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomAdaptor.setSeed(long)",
      "begin_line": 191,
      "end_line": 196,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 193,col 9)-(line 195,col 9)"
      ]
    }
  ]
}