{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/random/BitsStreamGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BitsStreamGenerator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.random.RandomGenerator"
      ],
      "begin_line": 27,
      "end_line": 153,
      "comment": " Base class for random number generators that generates bits streams.\n\n * @version $Revision$ $Date$\n * @since 2.0\n\n "
    },
    {
      "type": "field",
      "varNames": [
        "nextGaussian"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": " Next gaussian. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.BitsStreamGenerator.BitsStreamGenerator()",
      "begin_line": 34,
      "end_line": 36,
      "comment": " Creates a new random number generator.\n     ",
      "child_ranges": [
        "(line 35,col 9)-(line 35,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.BitsStreamGenerator.setSeed(int)",
      "begin_line": 39,
      "end_line": 39,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.BitsStreamGenerator.setSeed(int[])",
      "begin_line": 42,
      "end_line": 42,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.BitsStreamGenerator.setSeed(long)",
      "begin_line": 45,
      "end_line": 45,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.BitsStreamGenerator.next(int)",
      "begin_line": 56,
      "end_line": 56,
      "comment": " Generate next pseudorandom number.\n     * \u003cp\u003eThis method is the core generation algorithm. It is used by all the\n     * public generation methods for the various primitive types {@link\n     * #nextBoolean()}, {@link #nextBytes(byte[])}, {@link #nextDouble()},\n     * {@link #nextFloat()}, {@link #nextGaussian()}, {@link #nextInt()},\n     * {@link #next(int)} and {@link #nextLong()}.\u003c/p\u003e\n     * @param bits number of random bits to produce\n     * @return random bits generated\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.BitsStreamGenerator.nextBoolean()",
      "begin_line": 59,
      "end_line": 61,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.BitsStreamGenerator.nextBytes(byte[])",
      "begin_line": 64,
      "end_line": 80,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 18)",
        "(line 66,col 9)-(line 66,col 42)",
        "(line 67,col 9)-(line 74,col 9)",
        "(line 75,col 9)-(line 75,col 30)",
        "(line 76,col 9)-(line 79,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.BitsStreamGenerator.nextDouble()",
      "begin_line": 83,
      "end_line": 87,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 50)",
        "(line 85,col 9)-(line 85,col 35)",
        "(line 86,col 9)-(line 86,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.BitsStreamGenerator.nextFloat()",
      "begin_line": 90,
      "end_line": 92,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.BitsStreamGenerator.nextGaussian()",
      "begin_line": 95,
      "end_line": 114,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 28)",
        "(line 98,col 9)-(line 110,col 9)",
        "(line 112,col 9)-(line 112,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.BitsStreamGenerator.nextInt()",
      "begin_line": 117,
      "end_line": 119,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.BitsStreamGenerator.nextInt(int)",
      "begin_line": 122,
      "end_line": 144,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 124,col 9)-(line 127,col 9)",
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