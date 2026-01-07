{
  "filepath": "/tmp/Math-37b/src/main/java/org/apache/commons/math/random/ISAACRandom.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ISAACRandom",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.random.BitsStreamGenerator",
        "java.io.Serializable"
      ],
      "begin_line": 42,
      "end_line": 281,
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
      "signature": "org.apache.commons.math.random.ISAACRandom.ISAACRandom()",
      "begin_line": 82,
      "end_line": 85,
      "comment": "\n     * Creates a new ISAAC random number generator.\n     * \u003cp\u003eThe instance is initialized using a combination of the\n     * current time and system hash code of the instance as the seed.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 22)",
        "(line 84,col 9)-(line 84,col 76)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.ISAACRandom.ISAACRandom(long)",
      "begin_line": 92,
      "end_line": 95,
      "comment": "\n     * Creates a new ISAAC random number generator using a single long seed.\n     *\n     * @param seed the initial seed (64 bits integer)\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 22)",
        "(line 94,col 9)-(line 94,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.ISAACRandom.ISAACRandom(int[])",
      "begin_line": 103,
      "end_line": 106,
      "comment": "\n     * Creates a new ISAAC random number generator using an int array seed.\n     *\n     * @param seed the initial seed (32 bits integers array), if null the\n     *             seed of the generator will be related to the current time\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 22)",
        "(line 105,col 9)-(line 105,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ISAACRandom.allocArrays()",
      "begin_line": 109,
      "end_line": 113,
      "comment": " Allocate the pools arrays. ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 28)",
        "(line 111,col 9)-(line 111,col 28)",
        "(line 112,col 9)-(line 112,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ISAACRandom.setSeed(int)",
      "begin_line": 116,
      "end_line": 119,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ISAACRandom.setSeed(long)",
      "begin_line": 122,
      "end_line": 125,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ISAACRandom.setSeed(int[])",
      "begin_line": 128,
      "end_line": 144,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 130,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 134,col 40)",
        "(line 135,col 9)-(line 135,col 38)",
        "(line 136,col 9)-(line 136,col 69)",
        "(line 137,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 143,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ISAACRandom.next(int)",
      "begin_line": 147,
      "end_line": 154,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 149,col 9)-(line 152,col 9)",
        "(line 153,col 9)-(line 153,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ISAACRandom.isaac()",
      "begin_line": 157,
      "end_line": 168,
      "comment": " Generate 256 results ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 19)",
        "(line 159,col 9)-(line 159,col 24)",
        "(line 160,col 9)-(line 160,col 27)",
        "(line 161,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 164,col 19)",
        "(line 165,col 9)-(line 167,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ISAACRandom.isaac2()",
      "begin_line": 171,
      "end_line": 188,
      "comment": " Intermediate internal loop. ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 29)",
        "(line 173,col 9)-(line 173,col 31)",
        "(line 174,col 9)-(line 174,col 32)",
        "(line 175,col 9)-(line 175,col 17)",
        "(line 176,col 9)-(line 176,col 29)",
        "(line 177,col 9)-(line 177,col 31)",
        "(line 178,col 9)-(line 178,col 32)",
        "(line 179,col 9)-(line 179,col 17)",
        "(line 180,col 9)-(line 180,col 29)",
        "(line 181,col 9)-(line 181,col 30)",
        "(line 182,col 9)-(line 182,col 32)",
        "(line 183,col 9)-(line 183,col 17)",
        "(line 184,col 9)-(line 184,col 29)",
        "(line 185,col 9)-(line 185,col 32)",
        "(line 186,col 9)-(line 186,col 32)",
        "(line 187,col 9)-(line 187,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ISAACRandom.isaac3()",
      "begin_line": 191,
      "end_line": 195,
      "comment": " Lowest level internal loop. ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 66)",
        "(line 193,col 9)-(line 193,col 67)",
        "(line 194,col 9)-(line 194,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ISAACRandom.initState()",
      "begin_line": 198,
      "end_line": 237,
      "comment": " Initialize, or reinitialize, this instance of rand. ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 19)",
        "(line 200,col 9)-(line 200,col 19)",
        "(line 201,col 9)-(line 201,col 19)",
        "(line 202,col 9)-(line 204,col 9)",
        "(line 205,col 9)-(line 207,col 9)",
        "(line 209,col 9)-(line 220,col 9)",
        "(line 222,col 9)-(line 233,col 9)",
        "(line 234,col 9)-(line 234,col 16)",
        "(line 235,col 9)-(line 235,col 25)",
        "(line 236,col 9)-(line 236,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ISAACRandom.shuffle()",
      "begin_line": 240,
      "end_line": 265,
      "comment": " Shuffle array. ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 31)",
        "(line 242,col 9)-(line 242,col 25)",
        "(line 243,col 9)-(line 243,col 25)",
        "(line 244,col 9)-(line 244,col 31)",
        "(line 245,col 9)-(line 245,col 25)",
        "(line 246,col 9)-(line 246,col 25)",
        "(line 247,col 9)-(line 247,col 30)",
        "(line 248,col 9)-(line 248,col 25)",
        "(line 249,col 9)-(line 249,col 25)",
        "(line 250,col 9)-(line 250,col 32)",
        "(line 251,col 9)-(line 251,col 25)",
        "(line 252,col 9)-(line 252,col 25)",
        "(line 253,col 9)-(line 253,col 31)",
        "(line 254,col 9)-(line 254,col 25)",
        "(line 255,col 9)-(line 255,col 25)",
        "(line 256,col 9)-(line 256,col 31)",
        "(line 257,col 9)-(line 257,col 25)",
        "(line 258,col 9)-(line 258,col 25)",
        "(line 259,col 9)-(line 259,col 30)",
        "(line 260,col 9)-(line 260,col 25)",
        "(line 261,col 9)-(line 261,col 25)",
        "(line 262,col 9)-(line 262,col 31)",
        "(line 263,col 9)-(line 263,col 25)",
        "(line 264,col 9)-(line 264,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ISAACRandom.setState(int)",
      "begin_line": 271,
      "end_line": 280,
      "comment": " Set the state by copying the internal arrays.\n     *\n     * @param start First index into {@link #mem} array.\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 28)",
        "(line 273,col 9)-(line 273,col 32)",
        "(line 274,col 9)-(line 274,col 32)",
        "(line 275,col 9)-(line 275,col 32)",
        "(line 276,col 9)-(line 276,col 32)",
        "(line 277,col 9)-(line 277,col 32)",
        "(line 278,col 9)-(line 278,col 32)",
        "(line 279,col 9)-(line 279,col 32)"
      ]
    }
  ]
}