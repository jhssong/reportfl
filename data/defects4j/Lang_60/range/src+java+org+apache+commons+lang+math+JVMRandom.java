{
  "filepath": "/tmp/Lang-60b/src/java/org/apache/commons/lang/math/JVMRandom.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JVMRandom",
      "is_interface": false,
      "parent_types": [
        "java.util.Random"
      ],
      "begin_line": 32,
      "end_line": 170,
      "comment": "\n * \u003cp\u003e\u003ccode\u003eJVMRandom\u003c/code\u003e is a wrapper that supports all possible \n * Random methods via the {@link java.lang.Math#random()} method\n * and its system-wide {@link Random} object.\u003c/p\u003e\n * \n * @author Henri Yandell\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": "\n     * Required for serialization support.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "constructed"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * Ensures that only the constructor can call reseed.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.math.JVMRandom.JVMRandom()",
      "begin_line": 49,
      "end_line": 51,
      "comment": "\n     * Constructs a new instance.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.JVMRandom.setSeed(long)",
      "begin_line": 59,
      "end_line": 63,
      "comment": "\n     * Unsupported in 2.0.\n     * \n     * @param seed ignored\n     * @throws UnsupportedOperationException\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 62,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.JVMRandom.nextGaussian()",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * Unsupported in 2.0.\n     * \n     * @return Nothing, this method always throws an UnsupportedOperationException.\n     * @throws UnsupportedOperationException\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.JVMRandom.nextBytes(byte[])",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * Unsupported in 2.0.\n     * \n     * @param byteArray ignored\n     * @throws UnsupportedOperationException\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.JVMRandom.nextInt()",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * \u003cp\u003eReturns the next pseudorandom, uniformly distributed int value\n     * from the Math.random() sequence.\u003c/p\u003e\n     *\n     * @return the random int\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.JVMRandom.nextInt(int)",
      "begin_line": 103,
      "end_line": 111,
      "comment": "\n     * \u003cp\u003eReturns a pseudorandom, uniformly distributed int value between\n     * \u003ccode\u003e0\u003c/code\u003e (inclusive) and the specified value (exclusive), from\n     * the Math.random() sequence.\u003c/p\u003e\n     *\n     * @param n  the specified exclusive max-value\n     * @return the random int\n     * @throws IllegalArgumentException when \u003ccode\u003en \u0026lt;\u003d 0\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 108,col 9)",
        "(line 110,col 9)-(line 110,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.JVMRandom.nextLong()",
      "begin_line": 117,
      "end_line": 120,
      "comment": "\n     * \u003cp\u003eReturns the next pseudorandom, uniformly distributed long value\n     * from the Math.random() sequence.\u003c/p\u003e\n     * @return the random long\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.JVMRandom.nextLong(long)",
      "begin_line": 132,
      "end_line": 140,
      "comment": "\n     * \u003cp\u003eReturns a pseudorandom, uniformly distributed long value between\n     * \u003ccode\u003e0\u003c/code\u003e (inclusive) and the specified value (exclusive), from\n     * the Math.random() sequence.\u003c/p\u003e\n     *\n     * @param n  the specified exclusive max-value\n     * @return the random long\n     * @throws IllegalArgumentException when \u003ccode\u003en \u0026lt;\u003d 0\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 137,col 9)",
        "(line 139,col 9)-(line 139,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.JVMRandom.nextBoolean()",
      "begin_line": 148,
      "end_line": 150,
      "comment": "\n     * \u003cp\u003eReturns the next pseudorandom, uniformly distributed boolean value\n     * from the Math.random() sequence.\u003c/p\u003e\n     *\n     * @return the random boolean\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.JVMRandom.nextFloat()",
      "begin_line": 158,
      "end_line": 160,
      "comment": "\n     * \u003cp\u003eReturns the next pseudorandom, uniformly distributed float value\n     * between \u003ccode\u003e0.0\u003c/code\u003e and \u003ccode\u003e1.0\u003c/code\u003e from the Math.random()\n     * sequence.\u003c/p\u003e\n     *\n     * @return the random float\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.JVMRandom.nextDouble()",
      "begin_line": 166,
      "end_line": 168,
      "comment": "\n     * \u003cp\u003eSynonymous to the Math.random() call.\u003c/p\u003e\n     *\n     * @return the random double\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 29)"
      ]
    }
  ]
}