{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/random/SynchronizedRandomGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SynchronizedRandomGenerator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.random.RandomGenerator"
      ],
      "begin_line": 29,
      "end_line": 122,
      "comment": "\n * Any {@link RandomGenerator} implementation can be thread-safe if it\n * is used through an instance of this class.\n * This is achieved by enclosing calls to the methods of the actual\n * generator inside the overridden {@code synchronized} methods of this\n * class.\n *\n * @since 3.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "wrapped"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " Object to which all calls will be delegated. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.SynchronizedRandomGenerator.SynchronizedRandomGenerator(org.apache.commons.math3.random.RandomGenerator)",
      "begin_line": 42,
      "end_line": 44,
      "comment": "\n     * Creates a synchronized wrapper for the given {@code RandomGenerator}\n     * instance.\n     *\n     * @param rng Generator whose methods will be called through\n     * their corresponding overridden synchronized version.\n     * To ensure thread-safety, the wrapped generator \u003cem\u003emust\u003c/em\u003e\n     * not be used directly.\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.SynchronizedRandomGenerator.setSeed(int)",
      "begin_line": 49,
      "end_line": 51,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.SynchronizedRandomGenerator.setSeed(int[])",
      "begin_line": 56,
      "end_line": 58,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.SynchronizedRandomGenerator.setSeed(long)",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.SynchronizedRandomGenerator.nextBytes(byte[])",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.SynchronizedRandomGenerator.nextInt()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.SynchronizedRandomGenerator.nextInt(int)",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.SynchronizedRandomGenerator.nextLong()",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.SynchronizedRandomGenerator.nextBoolean()",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.SynchronizedRandomGenerator.nextFloat()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.SynchronizedRandomGenerator.nextDouble()",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.SynchronizedRandomGenerator.nextGaussian()",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 38)"
      ]
    }
  ]
}