{
  "filepath": "/tmp/Math-51b/src/main/java/org/apache/commons/math/random/BitsStreamGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BitsStreamGenerator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.random.RandomGenerator"
      ],
      "begin_line": 28,
      "end_line": 153,
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
      "signature": "org.apache.commons.math.random.BitsStreamGenerator.BitsStreamGenerator()",
      "begin_line": 35,
      "end_line": 37,
      "comment": " Creates a new random number generator.\n     ",
      "child_ranges": [
        "(line 36,col 9)-(line 36,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.BitsStreamGenerator.setSeed(int)",
      "begin_line": 40,
      "end_line": 40,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.BitsStreamGenerator.setSeed(int[])",
      "begin_line": 43,
      "end_line": 43,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.BitsStreamGenerator.setSeed(long)",
      "begin_line": 46,
      "end_line": 46,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.BitsStreamGenerator.next(int)",
      "begin_line": 57,
      "end_line": 57,
      "comment": " Generate next pseudorandom number.\n     * \u003cp\u003eThis method is the core generation algorithm. It is used by all the\n     * public generation methods for the various primitive types {@link\n     * #nextBoolean()}, {@link #nextBytes(byte[])}, {@link #nextDouble()},\n     * {@link #nextFloat()}, {@link #nextGaussian()}, {@link #nextInt()},\n     * {@link #next(int)} and {@link #nextLong()}.\u003c/p\u003e\n     * @param bits number of random bits to produce\n     * @return random bits generated\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.BitsStreamGenerator.nextBoolean()",
      "begin_line": 60,
      "end_line": 62,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.BitsStreamGenerator.nextBytes(byte[])",
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
      "signature": "org.apache.commons.math.random.BitsStreamGenerator.nextDouble()",
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
      "signature": "org.apache.commons.math.random.BitsStreamGenerator.nextFloat()",
      "begin_line": 91,
      "end_line": 93,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.BitsStreamGenerator.nextGaussian()",
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
      "signature": "org.apache.commons.math.random.BitsStreamGenerator.nextInt()",
      "begin_line": 118,
      "end_line": 120,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.BitsStreamGenerator.nextInt(int)",
      "begin_line": 123,
      "end_line": 144,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 125,col 9)-(line 127,col 9)",
        "(line 130,col 9)-(line 130,col 21)",
        "(line 131,col 9)-(line 131,col 26)",
        "(line 132,col 9)-(line 132,col 26)",
        "(line 133,col 9)-(line 133,col 26)",
        "(line 134,col 9)-(line 134,col 26)",
        "(line 135,col 9)-(line 135,col 27)",
        "(line 137,col 9)-(line 142,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.BitsStreamGenerator.nextLong()",
      "begin_line": 147,
      "end_line": 151,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 51)",
        "(line 149,col 9)-(line 149,col 59)",
        "(line 150,col 9)-(line 150,col 26)"
      ]
    }
  ]
}