{
  "filepath": "/tmp/Lang-47b/src/java/org/apache/commons/lang/math/JVMRandom.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JVMRandom",
      "is_interface": false,
      "parent_types": [
        "java.util.Random"
      ],
      "begin_line": 31,
      "end_line": 169,
      "comment": "\n * \u003cp\u003e\u003ccode\u003eJVMRandom\u003c/code\u003e is a wrapper that supports all possible \n * Random methods via the {@link java.lang.Math#random()} method\n * and its system-wide {@link Random} object.\u003c/p\u003e\n * \n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": "\n     * Required for serialization support.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "constructed"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n     * Ensures that only the constructor can call reseed.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.math.JVMRandom.JVMRandom()",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * Constructs a new instance.\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.JVMRandom.setSeed(long)",
      "begin_line": 58,
      "end_line": 62,
      "comment": "\n     * Unsupported in 2.0.\n     * \n     * @param seed ignored\n     * @throws UnsupportedOperationException\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 61,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.JVMRandom.nextGaussian()",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * Unsupported in 2.0.\n     * \n     * @return Nothing, this method always throws an UnsupportedOperationException.\n     * @throws UnsupportedOperationException\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.JVMRandom.nextBytes(byte[])",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * Unsupported in 2.0.\n     * \n     * @param byteArray ignored\n     * @throws UnsupportedOperationException\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.JVMRandom.nextInt()",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\n     * \u003cp\u003eReturns the next pseudorandom, uniformly distributed int value\n     * from the Math.random() sequence.\u003c/p\u003e\n     *\n     * @return the random int\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.JVMRandom.nextInt(int)",
      "begin_line": 102,
      "end_line": 110,
      "comment": "\n     * \u003cp\u003eReturns a pseudorandom, uniformly distributed int value between\n     * \u003ccode\u003e0\u003c/code\u003e (inclusive) and the specified value (exclusive), from\n     * the Math.random() sequence.\u003c/p\u003e\n     *\n     * @param n  the specified exclusive max-value\n     * @return the random int\n     * @throws IllegalArgumentException when \u003ccode\u003en \u0026lt;\u003d 0\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 107,col 9)",
        "(line 109,col 9)-(line 109,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.JVMRandom.nextLong()",
      "begin_line": 116,
      "end_line": 119,
      "comment": "\n     * \u003cp\u003eReturns the next pseudorandom, uniformly distributed long value\n     * from the Math.random() sequence.\u003c/p\u003e\n     * @return the random long\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.JVMRandom.nextLong(long)",
      "begin_line": 131,
      "end_line": 139,
      "comment": "\n     * \u003cp\u003eReturns a pseudorandom, uniformly distributed long value between\n     * \u003ccode\u003e0\u003c/code\u003e (inclusive) and the specified value (exclusive), from\n     * the Math.random() sequence.\u003c/p\u003e\n     *\n     * @param n  the specified exclusive max-value\n     * @return the random long\n     * @throws IllegalArgumentException when \u003ccode\u003en \u0026lt;\u003d 0\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 136,col 9)",
        "(line 138,col 9)-(line 138,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.JVMRandom.nextBoolean()",
      "begin_line": 147,
      "end_line": 149,
      "comment": "\n     * \u003cp\u003eReturns the next pseudorandom, uniformly distributed boolean value\n     * from the Math.random() sequence.\u003c/p\u003e\n     *\n     * @return the random boolean\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.JVMRandom.nextFloat()",
      "begin_line": 157,
      "end_line": 159,
      "comment": "\n     * \u003cp\u003eReturns the next pseudorandom, uniformly distributed float value\n     * between \u003ccode\u003e0.0\u003c/code\u003e and \u003ccode\u003e1.0\u003c/code\u003e from the Math.random()\n     * sequence.\u003c/p\u003e\n     *\n     * @return the random float\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.JVMRandom.nextDouble()",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\n     * \u003cp\u003eSynonymous to the Math.random() call.\u003c/p\u003e\n     *\n     * @return the random double\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 29)"
      ]
    }
  ]
}