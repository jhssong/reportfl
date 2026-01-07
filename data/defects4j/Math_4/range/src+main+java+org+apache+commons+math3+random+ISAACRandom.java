{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/random/ISAACRandom.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ISAACRandom",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.random.BitsStreamGenerator",
        "java.io.Serializable"
      ],
      "begin_line": 42,
      "end_line": 272,
      "comment": "\n * \u003ca href\u003d\"http://burtleburtle.net/bob/rand/isaacafa.html\"\u003e\n *  ISAAC: a fast cryptographic pseudo-random number generator\u003c/a\u003e\n * \u003cbr/\u003e\n * ISAAC (Indirection, Shift, Accumulate, Add, and Count) generates 32-bit\n * random numbers.\n * ISAAC has been designed to be cryptographically secure and is inspired\n * by RC4.\n * Cycles are guaranteed to be at least 2\u003csup\u003e40\u003c/sup\u003e values long, and they\n * are 2\u003csup\u003e8295\u003c/sup\u003e values long on average.\n * The results are uniformly distributed, unbiased, and unpredictable unless\n * you know the seed.\n * \u003cbr/\u003e\n * This code is based (with minor changes and improvements) on the original\n * implementation of the algorithm by Bob Jenkins.\n * \u003cbr/\u003e\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "SIZE_L"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Log of size of rsl[] and mem[] "
    },
    {
      "type": "field",
      "varNames": [
        "SIZE"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Size of rsl[] and mem[] "
    },
    {
      "type": "field",
      "varNames": [
        "H_SIZE"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Half-size of rsl[] and mem[] "
    },
    {
      "type": "field",
      "varNames": [
        "MASK"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " For pseudo-random lookup "
    },
    {
      "type": "field",
      "varNames": [
        "GLD_RATIO"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " The golden ratio "
    },
    {
      "type": "field",
      "varNames": [
        "rsl"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " The results given to the user "
    },
    {
      "type": "field",
      "varNames": [
        "mem"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " The internal state "
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Count through the results in rsl[] "
    },
    {
      "type": "field",
      "varNames": [
        "isaacA"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Accumulator "
    },
    {
      "type": "field",
      "varNames": [
        "isaacB"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " The last result "
    },
    {
      "type": "field",
      "varNames": [
        "isaacC"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Counter, guarantees cycle is at least 2^40 "
    },
    {
      "type": "field",
      "varNames": [
        "arr"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Service variable. "
    },
    {
      "type": "field",
      "varNames": [
        "isaacX"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Service variable. "
    },
    {
      "type": "field",
      "varNames": [
        "isaacI"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Service variable. "
    },
    {
      "type": "field",
      "varNames": [
        "isaacJ"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " Service variable. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.ISAACRandom.ISAACRandom()",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * Creates a new ISAAC random number generator.\n     * \u003cbr/\u003e\n     * The instance is initialized using a combination of the\n     * current time and system hash code of the instance as the seed.\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 76)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.ISAACRandom.ISAACRandom(long)",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n     * Creates a new ISAAC random number generator using a single long seed.\n     *\n     * @param seed Initial seed.\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.ISAACRandom.ISAACRandom(int[])",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\n     * Creates a new ISAAC random number generator using an int array seed.\n     *\n     * @param seed Initial seed. If {@code null}, the seed will be related\n     * to the current time.\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.ISAACRandom.setSeed(int)",
      "begin_line": 107,
      "end_line": 110,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.ISAACRandom.setSeed(long)",
      "begin_line": 113,
      "end_line": 116,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.ISAACRandom.setSeed(int[])",
      "begin_line": 119,
      "end_line": 135,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 121,col 9)-(line 124,col 9)",
        "(line 125,col 9)-(line 125,col 40)",
        "(line 126,col 9)-(line 126,col 38)",
        "(line 127,col 9)-(line 127,col 69)",
        "(line 128,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 134,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.ISAACRandom.next(int)",
      "begin_line": 138,
      "end_line": 145,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 140,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 144,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.ISAACRandom.isaac()",
      "begin_line": 148,
      "end_line": 159,
      "comment": " Generate 256 results ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 19)",
        "(line 150,col 9)-(line 150,col 24)",
        "(line 151,col 9)-(line 151,col 27)",
        "(line 152,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 155,col 19)",
        "(line 156,col 9)-(line 158,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.ISAACRandom.isaac2()",
      "begin_line": 162,
      "end_line": 179,
      "comment": " Intermediate internal loop. ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 29)",
        "(line 164,col 9)-(line 164,col 31)",
        "(line 165,col 9)-(line 165,col 32)",
        "(line 166,col 9)-(line 166,col 17)",
        "(line 167,col 9)-(line 167,col 29)",
        "(line 168,col 9)-(line 168,col 31)",
        "(line 169,col 9)-(line 169,col 32)",
        "(line 170,col 9)-(line 170,col 17)",
        "(line 171,col 9)-(line 171,col 29)",
        "(line 172,col 9)-(line 172,col 30)",
        "(line 173,col 9)-(line 173,col 32)",
        "(line 174,col 9)-(line 174,col 17)",
        "(line 175,col 9)-(line 175,col 29)",
        "(line 176,col 9)-(line 176,col 32)",
        "(line 177,col 9)-(line 177,col 32)",
        "(line 178,col 9)-(line 178,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.ISAACRandom.isaac3()",
      "begin_line": 182,
      "end_line": 186,
      "comment": " Lowest level internal loop. ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 66)",
        "(line 184,col 9)-(line 184,col 67)",
        "(line 185,col 9)-(line 185,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.ISAACRandom.initState()",
      "begin_line": 189,
      "end_line": 228,
      "comment": " Initialize, or reinitialize, this instance of rand. ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 19)",
        "(line 191,col 9)-(line 191,col 19)",
        "(line 192,col 9)-(line 192,col 19)",
        "(line 193,col 9)-(line 195,col 9)",
        "(line 196,col 9)-(line 198,col 9)",
        "(line 200,col 9)-(line 211,col 9)",
        "(line 213,col 9)-(line 224,col 9)",
        "(line 225,col 9)-(line 225,col 16)",
        "(line 226,col 9)-(line 226,col 25)",
        "(line 227,col 9)-(line 227,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.ISAACRandom.shuffle()",
      "begin_line": 231,
      "end_line": 256,
      "comment": " Shuffle array. ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 31)",
        "(line 233,col 9)-(line 233,col 25)",
        "(line 234,col 9)-(line 234,col 25)",
        "(line 235,col 9)-(line 235,col 31)",
        "(line 236,col 9)-(line 236,col 25)",
        "(line 237,col 9)-(line 237,col 25)",
        "(line 238,col 9)-(line 238,col 30)",
        "(line 239,col 9)-(line 239,col 25)",
        "(line 240,col 9)-(line 240,col 25)",
        "(line 241,col 9)-(line 241,col 32)",
        "(line 242,col 9)-(line 242,col 25)",
        "(line 243,col 9)-(line 243,col 25)",
        "(line 244,col 9)-(line 244,col 31)",
        "(line 245,col 9)-(line 245,col 25)",
        "(line 246,col 9)-(line 246,col 25)",
        "(line 247,col 9)-(line 247,col 31)",
        "(line 248,col 9)-(line 248,col 25)",
        "(line 249,col 9)-(line 249,col 25)",
        "(line 250,col 9)-(line 250,col 30)",
        "(line 251,col 9)-(line 251,col 25)",
        "(line 252,col 9)-(line 252,col 25)",
        "(line 253,col 9)-(line 253,col 31)",
        "(line 254,col 9)-(line 254,col 25)",
        "(line 255,col 9)-(line 255,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.ISAACRandom.setState(int)",
      "begin_line": 262,
      "end_line": 271,
      "comment": " Set the state by copying the internal arrays.\n     *\n     * @param start First index into {@link #mem} array.\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 28)",
        "(line 264,col 9)-(line 264,col 32)",
        "(line 265,col 9)-(line 265,col 32)",
        "(line 266,col 9)-(line 266,col 32)",
        "(line 267,col 9)-(line 267,col 32)",
        "(line 268,col 9)-(line 268,col 32)",
        "(line 269,col 9)-(line 269,col 32)",
        "(line 270,col 9)-(line 270,col 32)"
      ]
    }
  ]
}