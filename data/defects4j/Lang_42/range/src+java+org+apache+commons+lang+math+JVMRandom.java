{
  "filepath": "/tmp/Lang-42b/src/java/org/apache/commons/lang/math/JVMRandom.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JVMRandom",
      "is_interface": false,
      "parent_types": [
        "java.util.Random"
      ],
      "begin_line": 35,
      "end_line": 173,
      "comment": "\n * \u003cp\u003e\u003ccode\u003eJVMRandom\u003c/code\u003e is a wrapper that supports all possible \n * Random methods via the {@link java.lang.Math#random()} method\n * and its system-wide {@link Random} object.\u003c/p\u003e\n *\n * It does this to allow for a Random class in which the seed is\n * shared between all members of the class - a better name would\n * have been SharedSeedRandom.\n * \n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * Required for serialization support.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "constructed"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n     * Ensures that only the constructor can call reseed.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.math.JVMRandom.JVMRandom()",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * Constructs a new instance.\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.JVMRandom.setSeed(long)",
      "begin_line": 62,
      "end_line": 66,
      "comment": "\n     * Unsupported in 2.0.\n     * \n     * @param seed ignored\n     * @throws UnsupportedOperationException\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 65,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.JVMRandom.nextGaussian()",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n     * Unsupported in 2.0.\n     * \n     * @return Nothing, this method always throws an UnsupportedOperationException.\n     * @throws UnsupportedOperationException\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.JVMRandom.nextBytes(byte[])",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * Unsupported in 2.0.\n     * \n     * @param byteArray ignored\n     * @throws UnsupportedOperationException\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.JVMRandom.nextInt()",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\n     * \u003cp\u003eReturns the next pseudorandom, uniformly distributed int value\n     * from the Math.random() sequence.\u003c/p\u003e\n     *\n     * @return the random int\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.JVMRandom.nextInt(int)",
      "begin_line": 106,
      "end_line": 114,
      "comment": "\n     * \u003cp\u003eReturns a pseudorandom, uniformly distributed int value between\n     * \u003ccode\u003e0\u003c/code\u003e (inclusive) and the specified value (exclusive), from\n     * the Math.random() sequence.\u003c/p\u003e\n     *\n     * @param n  the specified exclusive max-value\n     * @return the random int\n     * @throws IllegalArgumentException when \u003ccode\u003en \u0026lt;\u003d 0\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 111,col 9)",
        "(line 113,col 9)-(line 113,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.JVMRandom.nextLong()",
      "begin_line": 120,
      "end_line": 123,
      "comment": "\n     * \u003cp\u003eReturns the next pseudorandom, uniformly distributed long value\n     * from the Math.random() sequence.\u003c/p\u003e\n     * @return the random long\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.JVMRandom.nextLong(long)",
      "begin_line": 135,
      "end_line": 143,
      "comment": "\n     * \u003cp\u003eReturns a pseudorandom, uniformly distributed long value between\n     * \u003ccode\u003e0\u003c/code\u003e (inclusive) and the specified value (exclusive), from\n     * the Math.random() sequence.\u003c/p\u003e\n     *\n     * @param n  the specified exclusive max-value\n     * @return the random long\n     * @throws IllegalArgumentException when \u003ccode\u003en \u0026lt;\u003d 0\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 140,col 9)",
        "(line 142,col 9)-(line 142,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.JVMRandom.nextBoolean()",
      "begin_line": 151,
      "end_line": 153,
      "comment": "\n     * \u003cp\u003eReturns the next pseudorandom, uniformly distributed boolean value\n     * from the Math.random() sequence.\u003c/p\u003e\n     *\n     * @return the random boolean\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.JVMRandom.nextFloat()",
      "begin_line": 161,
      "end_line": 163,
      "comment": "\n     * \u003cp\u003eReturns the next pseudorandom, uniformly distributed float value\n     * between \u003ccode\u003e0.0\u003c/code\u003e and \u003ccode\u003e1.0\u003c/code\u003e from the Math.random()\n     * sequence.\u003c/p\u003e\n     *\n     * @return the random float\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.JVMRandom.nextDouble()",
      "begin_line": 169,
      "end_line": 171,
      "comment": "\n     * \u003cp\u003eSynonymous to the Math.random() call.\u003c/p\u003e\n     *\n     * @return the random double\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 29)"
      ]
    }
  ]
}