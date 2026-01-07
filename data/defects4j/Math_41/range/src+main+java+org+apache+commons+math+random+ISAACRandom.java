{
  "filepath": "/tmp/Math-41b/src/main/java/org/apache/commons/math/random/ISAACRandom.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ISAACRandom",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.random.BitsStreamGenerator",
        "java.io.Serializable"
      ],
      "begin_line": 37,
      "end_line": 286,
      "comment": "\r\n * \u003ch3\u003eISAAC: a fast cryptographic pseudo-random number generator\u003c/h3\u003e\r\n * \u003cp/\u003e\r\n * ISAAC (Indirection, Shift, Accumulate, Add, and Count) generates 32-bit random numbers.\u003cbr\u003e\r\n * ISAAC has been designed to be cryptographically secure and is inspired by RC4.\u003cbr\u003e\r\n * Cycles are guaranteed to be at least 2\u003csup\u003e40\u003c/sup\u003e values long, and they are 2\u003csup\u003e8295\u003c/sup\u003e\r\n * values long on average.\u003cbr\u003e\r\n * The results are uniformly distributed, unbiased, and unpredictable unless you know the seed.\u003cbr\u003e\r\n * \u003cbr\u003e\r\n * This is Java implementation (with minor changes and improvements) of original algorithm by Bob Jenkins.\u003cbr\u003e\r\n * \u003cbr\u003e\r\n *\r\n * @see \u003ca href\u003d\"http://burtleburtle.net/bob/rand/isaacafa.html\"\u003eISAAC: a fast cryptographic random number generator\u003c/a\u003e\r\n * @since 3.0\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "SIZE_L"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Log of size of rsl[] and mem[] "
    },
    {
      "type": "field",
      "varNames": [
        "SIZE"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Size of rsl[] and mem[] "
    },
    {
      "type": "field",
      "varNames": [
        "H_SIZE"
      ],
      "begin_line": 49,
      "end_line": 49,
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
      "begin_line": 55,
      "end_line": 55,
      "comment": " The golden ratio "
    },
    {
      "type": "field",
      "varNames": [
        "rsl"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " the results given to the user "
    },
    {
      "type": "field",
      "varNames": [
        "mem"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " the internal state "
    },
    {
      "type": "field",
      "varNames": [
        "arr"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " count through the results in rsl[] "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " accumulator "
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " the last result "
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " counter, guarantees cycle is at least 2^40 "
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "i"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "j"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.ISAACRandom.ISAACRandom()",
      "begin_line": 87,
      "end_line": 90,
      "comment": "\r\n     * Creates a new ISAAC random number generator.\r\n     * \u003cp\u003eThe instance is initialized using a combination of the\r\n     * current time and system hash code of the instance as the seed.\u003c/p\u003e\r\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 22)",
        "(line 89,col 9)-(line 89,col 76)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.ISAACRandom.ISAACRandom(long)",
      "begin_line": 97,
      "end_line": 100,
      "comment": "\r\n     * Creates a new ISAAC random number generator using a single long seed.\r\n     *\r\n     * @param seed the initial seed (64 bits integer)\r\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 22)",
        "(line 99,col 9)-(line 99,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.ISAACRandom.ISAACRandom(int[])",
      "begin_line": 108,
      "end_line": 111,
      "comment": "\r\n     * Creates a new ISAAC random number generator using an int array seed.\r\n     *\r\n     * @param seed the initial seed (32 bits integers array), if null the\r\n     *             seed of the generator will be related to the current time\r\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 22)",
        "(line 110,col 9)-(line 110,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ISAACRandom.allocArrays()",
      "begin_line": 115,
      "end_line": 119,
      "comment": " Allocate the pools arrays.\r\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 28)",
        "(line 117,col 9)-(line 117,col 28)",
        "(line 118,col 9)-(line 118,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ISAACRandom.setSeed(int)",
      "begin_line": 122,
      "end_line": 125,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ISAACRandom.setSeed(long)",
      "begin_line": 128,
      "end_line": 131,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ISAACRandom.setSeed(int[])",
      "begin_line": 134,
      "end_line": 149,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 136,col 9)-(line 139,col 9)",
        "(line 140,col 9)-(line 140,col 55)",
        "(line 141,col 9)-(line 141,col 69)",
        "(line 142,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 148,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ISAACRandom.next(int)",
      "begin_line": 152,
      "end_line": 159,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 154,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 158,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ISAACRandom.isaac()",
      "begin_line": 162,
      "end_line": 173,
      "comment": " Generate 256 results ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 14)",
        "(line 164,col 9)-(line 164,col 19)",
        "(line 165,col 9)-(line 165,col 17)",
        "(line 166,col 9)-(line 168,col 9)",
        "(line 169,col 9)-(line 169,col 14)",
        "(line 170,col 9)-(line 172,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ISAACRandom.isaac2()",
      "begin_line": 177,
      "end_line": 194,
      "comment": " Intermediate internal loop.\r\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 19)",
        "(line 179,col 9)-(line 179,col 21)",
        "(line 180,col 9)-(line 180,col 22)",
        "(line 181,col 9)-(line 181,col 17)",
        "(line 182,col 9)-(line 182,col 19)",
        "(line 183,col 9)-(line 183,col 21)",
        "(line 184,col 9)-(line 184,col 22)",
        "(line 185,col 9)-(line 185,col 17)",
        "(line 186,col 9)-(line 186,col 19)",
        "(line 187,col 9)-(line 187,col 20)",
        "(line 188,col 9)-(line 188,col 22)",
        "(line 189,col 9)-(line 189,col 17)",
        "(line 190,col 9)-(line 190,col 19)",
        "(line 191,col 9)-(line 191,col 22)",
        "(line 192,col 9)-(line 192,col 22)",
        "(line 193,col 9)-(line 193,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ISAACRandom.isaac3()",
      "begin_line": 198,
      "end_line": 202,
      "comment": " Lowest level internal loop.\r\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 46)",
        "(line 200,col 9)-(line 200,col 52)",
        "(line 201,col 9)-(line 201,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ISAACRandom.initState()",
      "begin_line": 206,
      "end_line": 242,
      "comment": " Initialize, or reinitialize, this instance of rand.\r\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 22)",
        "(line 208,col 9)-(line 210,col 9)",
        "(line 211,col 9)-(line 213,col 9)",
        "(line 215,col 9)-(line 226,col 9)",
        "(line 228,col 9)-(line 239,col 9)",
        "(line 240,col 9)-(line 240,col 16)",
        "(line 241,col 9)-(line 241,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ISAACRandom.shuffle()",
      "begin_line": 246,
      "end_line": 271,
      "comment": " Shuffle array.\r\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 31)",
        "(line 248,col 9)-(line 248,col 25)",
        "(line 249,col 9)-(line 249,col 25)",
        "(line 250,col 9)-(line 250,col 31)",
        "(line 251,col 9)-(line 251,col 25)",
        "(line 252,col 9)-(line 252,col 25)",
        "(line 253,col 9)-(line 253,col 30)",
        "(line 254,col 9)-(line 254,col 25)",
        "(line 255,col 9)-(line 255,col 25)",
        "(line 256,col 9)-(line 256,col 32)",
        "(line 257,col 9)-(line 257,col 25)",
        "(line 258,col 9)-(line 258,col 25)",
        "(line 259,col 9)-(line 259,col 31)",
        "(line 260,col 9)-(line 260,col 25)",
        "(line 261,col 9)-(line 261,col 25)",
        "(line 262,col 9)-(line 262,col 31)",
        "(line 263,col 9)-(line 263,col 25)",
        "(line 264,col 9)-(line 264,col 25)",
        "(line 265,col 9)-(line 265,col 30)",
        "(line 266,col 9)-(line 266,col 25)",
        "(line 267,col 9)-(line 267,col 25)",
        "(line 268,col 9)-(line 268,col 31)",
        "(line 269,col 9)-(line 269,col 25)",
        "(line 270,col 9)-(line 270,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ISAACRandom.setState()",
      "begin_line": 275,
      "end_line": 284,
      "comment": " Set the state by copying the internal arrays.\r\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 24)",
        "(line 277,col 9)-(line 277,col 28)",
        "(line 278,col 9)-(line 278,col 28)",
        "(line 279,col 9)-(line 279,col 28)",
        "(line 280,col 9)-(line 280,col 28)",
        "(line 281,col 9)-(line 281,col 28)",
        "(line 282,col 9)-(line 282,col 28)",
        "(line 283,col 9)-(line 283,col 28)"
      ]
    }
  ]
}