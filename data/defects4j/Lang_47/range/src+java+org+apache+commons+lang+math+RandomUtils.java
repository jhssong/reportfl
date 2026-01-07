{
  "filepath": "/tmp/Lang-47b/src/java/org/apache/commons/lang/math/RandomUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RandomUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 179,
      "comment": "\n * \u003cp\u003e\u003ccode\u003eRandomUtils\u003c/code\u003e is a wrapper that supports all possible \n * {@link java.util.Random} methods via the {@link java.lang.Math#random()}\n * method and its system-wide \u003ccode\u003eRandom\u003c/code\u003e object.\n * \n * @author Gary D. Gregory\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "JVM_RANDOM"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": "\n     * An instance of {@link JVMRandom}.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtils.nextInt()",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n     * \u003cp\u003eReturns the next pseudorandom, uniformly distributed int value\n     * from the Math.random() sequence.\u003c/p\u003e\n     *\n     * @return the random int\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtils.nextInt(java.util.Random)",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * \u003cp\u003eReturns the next pseudorandom, uniformly distributed int value\n     * from the given \u003ccode\u003erandom\u003c/code\u003e sequence.\u003c/p\u003e\n     *\n     * @param random the Random sequence generator.\n     * @return the random int\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtils.nextInt(int)",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\n     * \u003cp\u003eReturns a pseudorandom, uniformly distributed int value\n     * between \u003ccode\u003e0\u003c/code\u003e (inclusive) and the specified value\n     * (exclusive), from the Math.random() sequence.\u003c/p\u003e\n     *\n     * @param n  the specified exclusive max-value\n     * @return the random int\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtils.nextInt(java.util.Random, int)",
      "begin_line": 86,
      "end_line": 89,
      "comment": "\n     * \u003cp\u003eReturns a pseudorandom, uniformly distributed int value\n     * between \u003ccode\u003e0\u003c/code\u003e (inclusive) and the specified value\n     * (exclusive), from the given Random sequence.\u003c/p\u003e\n     *\n     * @param random the Random sequence generator.\n     * @param n  the specified exclusive max-value\n     * @return the random int\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtils.nextLong()",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * \u003cp\u003eReturns the next pseudorandom, uniformly distributed long value\n     * from the Math.random() sequence.\u003c/p\u003e\n     *\n     * @return the random long\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtils.nextLong(java.util.Random)",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\n     * \u003cp\u003eReturns the next pseudorandom, uniformly distributed long value\n     * from the given Random sequence.\u003c/p\u003e\n     *\n     * @param random the Random sequence generator.\n     * @return the random long\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtils.nextBoolean()",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\n     * \u003cp\u003eReturns the next pseudorandom, uniformly distributed boolean value\n     * from the Math.random() sequence.\u003c/p\u003e\n     *\n     * @return the random boolean\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtils.nextBoolean(java.util.Random)",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\n     * \u003cp\u003eReturns the next pseudorandom, uniformly distributed boolean value\n     * from the given random sequence.\u003c/p\u003e\n     *\n     * @param random the Random sequence generator.\n     * @return the random boolean\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtils.nextFloat()",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\n     * \u003cp\u003eReturns the next pseudorandom, uniformly distributed float value\n     * between \u003ccode\u003e0.0\u003c/code\u003e and \u003ccode\u003e1.0\u003c/code\u003e from the Math.random()\n     * sequence.\u003c/p\u003e\n     *\n     * @return the random float\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtils.nextFloat(java.util.Random)",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\n     * \u003cp\u003eReturns the next pseudorandom, uniformly distributed float value\n     * between \u003ccode\u003e0.0\u003c/code\u003e and \u003ccode\u003e1.0\u003c/code\u003e from the given Random\n     * sequence.\u003c/p\u003e\n     *\n     * @param random the Random sequence generator.\n     * @return the random float\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtils.nextDouble()",
      "begin_line": 163,
      "end_line": 165,
      "comment": "\n     * \u003cp\u003eReturns the next pseudorandom, uniformly distributed float value\n     * between \u003ccode\u003e0.0\u003c/code\u003e and \u003ccode\u003e1.0\u003c/code\u003e from the Math.random()\n     * sequence.\u003c/p\u003e\n     *\n     * @return the random double\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtils.nextDouble(java.util.Random)",
      "begin_line": 175,
      "end_line": 177,
      "comment": "\n     * \u003cp\u003eReturns the next pseudorandom, uniformly distributed float value\n     * between \u003ccode\u003e0.0\u003c/code\u003e and \u003ccode\u003e1.0\u003c/code\u003e from the given Random\n     * sequence.\u003c/p\u003e\n     *\n     * @param random the Random sequence generator.\n     * @return the random double\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 35)"
      ]
    }
  ]
}