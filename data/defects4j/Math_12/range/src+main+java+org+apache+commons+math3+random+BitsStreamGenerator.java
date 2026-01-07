{
  "filepath": "/tmp/Math-12b/src/main/java/org/apache/commons/math3/random/BitsStreamGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BitsStreamGenerator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.random.RandomGenerator"
      ],
      "begin_line": 28,
      "end_line": 170,
      "comment": " Base class for random number generators that generates bits streams.\n *\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "nextGaussian"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Next gaussian. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.BitsStreamGenerator.BitsStreamGenerator()",
      "begin_line": 37,
      "end_line": 39,
      "comment": "\n     * Creates a new random number generator.\n     ",
      "child_ranges": [
        "(line 38,col 9)-(line 38,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.BitsStreamGenerator.setSeed(int)",
      "begin_line": 42,
      "end_line": 42,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.BitsStreamGenerator.setSeed(int[])",
      "begin_line": 45,
      "end_line": 45,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.BitsStreamGenerator.setSeed(long)",
      "begin_line": 48,
      "end_line": 48,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.BitsStreamGenerator.next(int)",
      "begin_line": 59,
      "end_line": 59,
      "comment": " Generate next pseudorandom number.\n     * \u003cp\u003eThis method is the core generation algorithm. It is used by all the\n     * public generation methods for the various primitive types {@link\n     * #nextBoolean()}, {@link #nextBytes(byte[])}, {@link #nextDouble()},\n     * {@link #nextFloat()}, {@link #nextGaussian()}, {@link #nextInt()},\n     * {@link #next(int)} and {@link #nextLong()}.\u003c/p\u003e\n     * @param bits number of random bits to produce\n     * @return random bits generated\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean()",
      "begin_line": 62,
      "end_line": 64,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.BitsStreamGenerator.nextBytes(byte[])",
      "begin_line": 67,
      "end_line": 83,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 18)",
        "(line 69,col 9)-(line 69,col 42)",
        "(line 70,col 9)-(line 77,col 9)",
        "(line 78,col 9)-(line 78,col 30)",
        "(line 79,col 9)-(line 82,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.BitsStreamGenerator.nextDouble()",
      "begin_line": 86,
      "end_line": 90,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 50)",
        "(line 88,col 9)-(line 88,col 35)",
        "(line 89,col 9)-(line 89,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.BitsStreamGenerator.nextFloat()",
      "begin_line": 93,
      "end_line": 95,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian()",
      "begin_line": 98,
      "end_line": 117,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 28)",
        "(line 101,col 9)-(line 113,col 9)",
        "(line 115,col 9)-(line 115,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.BitsStreamGenerator.nextInt()",
      "begin_line": 120,
      "end_line": 122,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.BitsStreamGenerator.nextInt(int)",
      "begin_line": 139,
      "end_line": 153,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003eThis default implementation is copied from Apache Harmony\n     * java.util.Random (r929253).\u003c/p\u003e\n     *\n     * \u003cp\u003eImplementation notes: \u003cul\u003e\n     * \u003cli\u003eIf n is a power of 2, this method returns\n     * {@code (int) ((n * (long) next(31)) \u003e\u003e 31)}.\u003c/li\u003e\n     *\n     * \u003cli\u003eIf n is not a power of 2, what is returned is {@code next(31) % n}\n     * with {@code next(31)} values rejected (i.e. regenerated) until a\n     * value that is larger than the remainder of {@code Integer.MAX_VALUE / n}\n     * is generated. Rejection of this initial segment is necessary to ensure\n     * a uniform distribution.\u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 152,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.BitsStreamGenerator.nextLong()",
      "begin_line": 156,
      "end_line": 160,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 51)",
        "(line 158,col 9)-(line 158,col 59)",
        "(line 159,col 9)-(line 159,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.BitsStreamGenerator.clear()",
      "begin_line": 166,
      "end_line": 168,
      "comment": "\n     * Clears the cache used by the default implementation of\n     * {@link #nextGaussian}.\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 34)"
      ]
    }
  ]
}