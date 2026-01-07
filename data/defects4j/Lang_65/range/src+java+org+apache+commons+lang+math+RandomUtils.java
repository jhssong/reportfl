{
  "filepath": "/tmp/Lang-65b/src/java/org/apache/commons/lang/math/RandomUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RandomUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 177,
      "comment": "\n * \u003cp\u003e\u003ccode\u003eRandomUtils\u003c/code\u003e is a wrapper that supports all possible \n * {@link java.util.Random} methods via the {@link java.lang.Math#random()}\n * method and its system-wide \u003ccode\u003eRandom\u003c/code\u003e object.\n * \n * @author Henri Yandell\n * @author Gary D. Gregory\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "JVM_RANDOM"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": "\n     * An instance of {@link JVMRandom}.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtils.nextInt()",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * \u003cp\u003eReturns the next pseudorandom, uniformly distributed int value\n     * from the Math.random() sequence.\u003c/p\u003e\n     *\n     * @return the random int\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtils.nextInt(java.util.Random)",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * \u003cp\u003eReturns the next pseudorandom, uniformly distributed int value\n     * from the given \u003ccode\u003erandom\u003c/code\u003e sequence.\u003c/p\u003e\n     *\n     * @param random the Random sequence generator.\n     * @return the random int\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtils.nextInt(int)",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * \u003cp\u003eReturns a pseudorandom, uniformly distributed int value\n     * between \u003ccode\u003e0\u003c/code\u003e (inclusive) and the specified value\n     * (exclusive), from the Math.random() sequence.\u003c/p\u003e\n     *\n     * @param n  the specified exclusive max-value\n     * @return the random int\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtils.nextInt(java.util.Random, int)",
      "begin_line": 84,
      "end_line": 87,
      "comment": "\n     * \u003cp\u003eReturns a pseudorandom, uniformly distributed int value\n     * between \u003ccode\u003e0\u003c/code\u003e (inclusive) and the specified value\n     * (exclusive), from the given Random sequence.\u003c/p\u003e\n     *\n     * @param random the Random sequence generator.\n     * @param n  the specified exclusive max-value\n     * @return the random int\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtils.nextLong()",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\n     * \u003cp\u003eReturns the next pseudorandom, uniformly distributed long value\n     * from the Math.random() sequence.\u003c/p\u003e\n     *\n     * @return the random long\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtils.nextLong(java.util.Random)",
      "begin_line": 106,
      "end_line": 108,
      "comment": "\n     * \u003cp\u003eReturns the next pseudorandom, uniformly distributed long value\n     * from the given Random sequence.\u003c/p\u003e\n     *\n     * @param random the Random sequence generator.\n     * @return the random long\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtils.nextBoolean()",
      "begin_line": 116,
      "end_line": 118,
      "comment": "\n     * \u003cp\u003eReturns the next pseudorandom, uniformly distributed boolean value\n     * from the Math.random() sequence.\u003c/p\u003e\n     *\n     * @return the random boolean\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtils.nextBoolean(java.util.Random)",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\n     * \u003cp\u003eReturns the next pseudorandom, uniformly distributed boolean value\n     * from the given random sequence.\u003c/p\u003e\n     *\n     * @param random the Random sequence generator.\n     * @return the random boolean\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtils.nextFloat()",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\n     * \u003cp\u003eReturns the next pseudorandom, uniformly distributed float value\n     * between \u003ccode\u003e0.0\u003c/code\u003e and \u003ccode\u003e1.0\u003c/code\u003e from the Math.random()\n     * sequence.\u003c/p\u003e\n     *\n     * @return the random float\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtils.nextFloat(java.util.Random)",
      "begin_line": 150,
      "end_line": 152,
      "comment": "\n     * \u003cp\u003eReturns the next pseudorandom, uniformly distributed float value\n     * between \u003ccode\u003e0.0\u003c/code\u003e and \u003ccode\u003e1.0\u003c/code\u003e from the given Random\n     * sequence.\u003c/p\u003e\n     *\n     * @param random the Random sequence generator.\n     * @return the random float\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtils.nextDouble()",
      "begin_line": 161,
      "end_line": 163,
      "comment": "\n     * \u003cp\u003eReturns the next pseudorandom, uniformly distributed float value\n     * between \u003ccode\u003e0.0\u003c/code\u003e and \u003ccode\u003e1.0\u003c/code\u003e from the Math.random()\n     * sequence.\u003c/p\u003e\n     *\n     * @return the random double\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtils.nextDouble(java.util.Random)",
      "begin_line": 173,
      "end_line": 175,
      "comment": "\n     * \u003cp\u003eReturns the next pseudorandom, uniformly distributed float value\n     * between \u003ccode\u003e0.0\u003c/code\u003e and \u003ccode\u003e1.0\u003c/code\u003e from the given Random\n     * sequence.\u003c/p\u003e\n     *\n     * @param random the Random sequence generator.\n     * @return the random double\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 35)"
      ]
    }
  ]
}