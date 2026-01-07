{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/random/BitsStreamGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BitsStreamGenerator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.random.RandomGenerator",
        "java.io.Serializable"
      ],
      "begin_line": 29,
      "end_line": 198,
      "comment": " Base class for random number generators that generates bits streams.\n *\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "nextGaussian"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Next gaussian. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.BitsStreamGenerator.BitsStreamGenerator()",
      "begin_line": 40,
      "end_line": 42,
      "comment": "\n     * Creates a new random number generator.\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.BitsStreamGenerator.setSeed(int)",
      "begin_line": 45,
      "end_line": 45,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.BitsStreamGenerator.setSeed(int[])",
      "begin_line": 48,
      "end_line": 48,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.BitsStreamGenerator.setSeed(long)",
      "begin_line": 51,
      "end_line": 51,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.BitsStreamGenerator.next(int)",
      "begin_line": 62,
      "end_line": 62,
      "comment": " Generate next pseudorandom number.\n     * \u003cp\u003eThis method is the core generation algorithm. It is used by all the\n     * public generation methods for the various primitive types {@link\n     * #nextBoolean()}, {@link #nextBytes(byte[])}, {@link #nextDouble()},\n     * {@link #nextFloat()}, {@link #nextGaussian()}, {@link #nextInt()},\n     * {@link #next(int)} and {@link #nextLong()}.\u003c/p\u003e\n     * @param bits number of random bits to produce\n     * @return random bits generated\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean()",
      "begin_line": 65,
      "end_line": 67,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.BitsStreamGenerator.nextBytes(byte[])",
      "begin_line": 70,
      "end_line": 86,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 18)",
        "(line 72,col 9)-(line 72,col 42)",
        "(line 73,col 9)-(line 80,col 9)",
        "(line 81,col 9)-(line 81,col 30)",
        "(line 82,col 9)-(line 85,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.BitsStreamGenerator.nextDouble()",
      "begin_line": 89,
      "end_line": 93,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 50)",
        "(line 91,col 9)-(line 91,col 35)",
        "(line 92,col 9)-(line 92,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.BitsStreamGenerator.nextFloat()",
      "begin_line": 96,
      "end_line": 98,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian()",
      "begin_line": 101,
      "end_line": 120,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 28)",
        "(line 104,col 9)-(line 116,col 9)",
        "(line 118,col 9)-(line 118,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.BitsStreamGenerator.nextInt()",
      "begin_line": 123,
      "end_line": 125,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.BitsStreamGenerator.nextInt(int)",
      "begin_line": 142,
      "end_line": 156,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003eThis default implementation is copied from Apache Harmony\n     * java.util.Random (r929253).\u003c/p\u003e\n     *\n     * \u003cp\u003eImplementation notes: \u003cul\u003e\n     * \u003cli\u003eIf n is a power of 2, this method returns\n     * {@code (int) ((n * (long) next(31)) \u003e\u003e 31)}.\u003c/li\u003e\n     *\n     * \u003cli\u003eIf n is not a power of 2, what is returned is {@code next(31) % n}\n     * with {@code next(31)} values rejected (i.e. regenerated) until a\n     * value that is larger than the remainder of {@code Integer.MAX_VALUE / n}\n     * is generated. Rejection of this initial segment is necessary to ensure\n     * a uniform distribution.\u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 155,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.BitsStreamGenerator.nextLong()",
      "begin_line": 159,
      "end_line": 163,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 51)",
        "(line 161,col 9)-(line 161,col 59)",
        "(line 162,col 9)-(line 162,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.BitsStreamGenerator.nextLong(long)",
      "begin_line": 176,
      "end_line": 188,
      "comment": "\n     * Returns a pseudorandom, uniformly distributed \u003ctt\u003elong\u003c/tt\u003e value\n     * between 0 (inclusive) and the specified value (exclusive), drawn from\n     * this random number generator\u0027s sequence.\n     *\n     * @param n the bound on the random number to be returned.  Must be\n     * positive.\n     * @return  a pseudorandom, uniformly distributed \u003ctt\u003elong\u003c/tt\u003e\n     * value between 0 (inclusive) and n (exclusive).\n     * @throws IllegalArgumentException  if n is not positive.\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 187,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.BitsStreamGenerator.clear()",
      "begin_line": 194,
      "end_line": 196,
      "comment": "\n     * Clears the cache used by the default implementation of\n     * {@link #nextGaussian}.\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 34)"
      ]
    }
  ]
}