{
  "filepath": "/tmp/Lang-65b/src/java/org/apache/commons/lang/math/JVMRandom.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JVMRandom",
      "is_interface": false,
      "parent_types": [
        "java.util.Random"
      ],
      "begin_line": 29,
      "end_line": 160,
      "comment": "\n * \u003cp\u003e\u003ccode\u003eJVMRandom\u003c/code\u003e is a wrapper that supports all possible \n * Random methods via the {@link java.lang.Math#random()} method\n * and its system-wide {@link Random} object.\u003c/p\u003e\n * \n * @author Henri Yandell\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "constructed"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": "\n     * Ensures that only the constructor can call reseed.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.math.JVMRandom.JVMRandom()",
      "begin_line": 39,
      "end_line": 41,
      "comment": "\n     * Constructs a new instance.\n     ",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.JVMRandom.setSeed(long)",
      "begin_line": 49,
      "end_line": 53,
      "comment": "\n     * Unsupported in 2.0.\n     * \n     * @param seed ignored\n     * @throws UnsupportedOperationException\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 52,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.JVMRandom.nextGaussian()",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * Unsupported in 2.0.\n     * \n     * @return Nothing, this method always throws an UnsupportedOperationException.\n     * @throws UnsupportedOperationException\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.JVMRandom.nextBytes(byte[])",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * Unsupported in 2.0.\n     * \n     * @param byteArray ignored\n     * @throws UnsupportedOperationException\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.JVMRandom.nextInt()",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * \u003cp\u003eReturns the next pseudorandom, uniformly distributed int value\n     * from the Math.random() sequence.\u003c/p\u003e\n     *\n     * @return the random int\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.JVMRandom.nextInt(int)",
      "begin_line": 93,
      "end_line": 101,
      "comment": "\n     * \u003cp\u003eReturns a pseudorandom, uniformly distributed int value between\n     * \u003ccode\u003e0\u003c/code\u003e (inclusive) and the specified value (exclusive), from\n     * the Math.random() sequence.\u003c/p\u003e\n     *\n     * @param n  the specified exclusive max-value\n     * @return the random int\n     * @throws IllegalArgumentException when \u003ccode\u003en \u0026lt;\u003d 0\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 98,col 9)",
        "(line 100,col 9)-(line 100,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.JVMRandom.nextLong()",
      "begin_line": 107,
      "end_line": 110,
      "comment": "\n     * \u003cp\u003eReturns the next pseudorandom, uniformly distributed long value\n     * from the Math.random() sequence.\u003c/p\u003e\n     * @return the random long\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.JVMRandom.nextLong(long)",
      "begin_line": 122,
      "end_line": 130,
      "comment": "\n     * \u003cp\u003eReturns a pseudorandom, uniformly distributed long value between\n     * \u003ccode\u003e0\u003c/code\u003e (inclusive) and the specified value (exclusive), from\n     * the Math.random() sequence.\u003c/p\u003e\n     *\n     * @param n  the specified exclusive max-value\n     * @return the random long\n     * @throws IllegalArgumentException when \u003ccode\u003en \u0026lt;\u003d 0\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 127,col 9)",
        "(line 129,col 9)-(line 129,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.JVMRandom.nextBoolean()",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\n     * \u003cp\u003eReturns the next pseudorandom, uniformly distributed boolean value\n     * from the Math.random() sequence.\u003c/p\u003e\n     *\n     * @return the random boolean\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.JVMRandom.nextFloat()",
      "begin_line": 148,
      "end_line": 150,
      "comment": "\n     * \u003cp\u003eReturns the next pseudorandom, uniformly distributed float value\n     * between \u003ccode\u003e0.0\u003c/code\u003e and \u003ccode\u003e1.0\u003c/code\u003e from the Math.random()\n     * sequence.\u003c/p\u003e\n     *\n     * @return the random float\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.JVMRandom.nextDouble()",
      "begin_line": 156,
      "end_line": 158,
      "comment": "\n     * \u003cp\u003eSynonymous to the Math.random() call.\u003c/p\u003e\n     *\n     * @return the random double\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 29)"
      ]
    }
  ]
}