{
  "filepath": "/tmp/Math-29b/src/main/java/org/apache/commons/math3/random/BitsStreamGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BitsStreamGenerator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.random.RandomGenerator"
      ],
      "begin_line": 28,
      "end_line": 168,
      "comment": " Base class for random number generators that generates bits streams.\n\n * @version $Id$\n * @since 2.0\n\n "
    },
    {
      "type": "field",
      "varNames": [
        "nextGaussian"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " Next gaussian. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.BitsStreamGenerator.BitsStreamGenerator()",
      "begin_line": 35,
      "end_line": 37,
      "comment": " Creates a new random number generator.\n     ",
      "child_ranges": [
        "(line 36,col 9)-(line 36,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.BitsStreamGenerator.setSeed(int)",
      "begin_line": 40,
      "end_line": 40,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.BitsStreamGenerator.setSeed(int[])",
      "begin_line": 43,
      "end_line": 43,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.BitsStreamGenerator.setSeed(long)",
      "begin_line": 46,
      "end_line": 46,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.BitsStreamGenerator.next(int)",
      "begin_line": 57,
      "end_line": 57,
      "comment": " Generate next pseudorandom number.\n     * \u003cp\u003eThis method is the core generation algorithm. It is used by all the\n     * public generation methods for the various primitive types {@link\n     * #nextBoolean()}, {@link #nextBytes(byte[])}, {@link #nextDouble()},\n     * {@link #nextFloat()}, {@link #nextGaussian()}, {@link #nextInt()},\n     * {@link #next(int)} and {@link #nextLong()}.\u003c/p\u003e\n     * @param bits number of random bits to produce\n     * @return random bits generated\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean()",
      "begin_line": 60,
      "end_line": 62,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.BitsStreamGenerator.nextBytes(byte[])",
      "begin_line": 65,
      "end_line": 81,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 18)",
        "(line 67,col 9)-(line 67,col 42)",
        "(line 68,col 9)-(line 75,col 9)",
        "(line 76,col 9)-(line 76,col 30)",
        "(line 77,col 9)-(line 80,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.BitsStreamGenerator.nextDouble()",
      "begin_line": 84,
      "end_line": 88,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 50)",
        "(line 86,col 9)-(line 86,col 35)",
        "(line 87,col 9)-(line 87,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.BitsStreamGenerator.nextFloat()",
      "begin_line": 91,
      "end_line": 93,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian()",
      "begin_line": 96,
      "end_line": 115,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 28)",
        "(line 99,col 9)-(line 111,col 9)",
        "(line 113,col 9)-(line 113,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.BitsStreamGenerator.nextInt()",
      "begin_line": 118,
      "end_line": 120,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.BitsStreamGenerator.nextInt(int)",
      "begin_line": 137,
      "end_line": 151,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003eThis default implementation is copied from Apache Harmony\n     * java.util.Random (r929253).\u003c/p\u003e\n     *\n     * \u003cp\u003eImplementation notes: \u003cul\u003e\n     * \u003cli\u003eIf n is a power of 2, this method returns\n     * {@code (int) ((n * (long) next(31)) \u003e\u003e 31)}.\u003c/li\u003e\n     *\n     * \u003cli\u003eIf n is not a power of 2, what is returned is {@code next(31) % n}\n     * with {@code next(31)} values rejected (i.e. regenerated) until a\n     * value that is larger than the remainder of {@code Integer.MAX_VALUE / n}\n     * is generated. Rejection of this initial segment is necessary to ensure\n     * a uniform distribution.\u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 150,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.BitsStreamGenerator.nextLong()",
      "begin_line": 154,
      "end_line": 158,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 51)",
        "(line 156,col 9)-(line 156,col 59)",
        "(line 157,col 9)-(line 157,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.BitsStreamGenerator.clear()",
      "begin_line": 164,
      "end_line": 166,
      "comment": "\n     * Clears the cache used by the default implementation of\n     * {@link #nextGaussian}.\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 34)"
      ]
    }
  ]
}