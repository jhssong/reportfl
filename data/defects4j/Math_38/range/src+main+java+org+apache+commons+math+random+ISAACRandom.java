{
  "filepath": "/tmp/Math-38b/src/main/java/org/apache/commons/math/random/ISAACRandom.java",
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
      "end_line": 280,
      "comment": "\n * \u003ch3\u003eISAAC: a fast cryptographic pseudo-random number generator\u003c/h3\u003e\n * \u003cp/\u003e\n * ISAAC (Indirection, Shift, Accumulate, Add, and Count) generates 32-bit random numbers.\u003cbr\u003e\n * ISAAC has been designed to be cryptographically secure and is inspired by RC4.\u003cbr\u003e\n * Cycles are guaranteed to be at least 2\u003csup\u003e40\u003c/sup\u003e values long, and they are 2\u003csup\u003e8295\u003c/sup\u003e\n * values long on average.\u003cbr\u003e\n * The results are uniformly distributed, unbiased, and unpredictable unless you know the seed.\u003cbr\u003e\n * \u003cbr\u003e\n * This is Java implementation (with minor changes and improvements) of original algorithm by Bob Jenkins.\u003cbr\u003e\n * \u003cbr\u003e\n *\n * @see \u003ca href\u003d\"http://burtleburtle.net/bob/rand/isaacafa.html\"\u003eISAAC: a fast cryptographic random number generator\u003c/a\u003e\n * @since 3.0\n "
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
      "comment": " The results given to the user "
    },
    {
      "type": "field",
      "varNames": [
        "mem"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " The internal state "
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Count through the results in rsl[] "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Accumulator "
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " The last result "
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Counter, guarantees cycle is at least 2^40 "
    },
    {
      "type": "field",
      "varNames": [
        "arr"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " The global service variables "
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
      "comment": "\n     * Creates a new ISAAC random number generator.\n     * \u003cp\u003eThe instance is initialized using a combination of the\n     * current time and system hash code of the instance as the seed.\u003c/p\u003e\n     ",
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
      "comment": "\n     * Creates a new ISAAC random number generator using a single long seed.\n     *\n     * @param seed the initial seed (64 bits integer)\n     ",
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
      "comment": "\n     * Creates a new ISAAC random number generator using an int array seed.\n     *\n     * @param seed the initial seed (32 bits integers array), if null the\n     *             seed of the generator will be related to the current time\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 22)",
        "(line 110,col 9)-(line 110,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ISAACRandom.allocArrays()",
      "begin_line": 114,
      "end_line": 118,
      "comment": " Allocate the pools arrays. ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 28)",
        "(line 116,col 9)-(line 116,col 28)",
        "(line 117,col 9)-(line 117,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ISAACRandom.setSeed(int)",
      "begin_line": 121,
      "end_line": 124,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ISAACRandom.setSeed(long)",
      "begin_line": 127,
      "end_line": 130,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ISAACRandom.setSeed(int[])",
      "begin_line": 133,
      "end_line": 148,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 135,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 139,col 55)",
        "(line 140,col 9)-(line 140,col 69)",
        "(line 141,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 147,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ISAACRandom.next(int)",
      "begin_line": 151,
      "end_line": 158,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 153,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 157,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ISAACRandom.isaac()",
      "begin_line": 161,
      "end_line": 172,
      "comment": " Generate 256 results ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 14)",
        "(line 163,col 9)-(line 163,col 19)",
        "(line 164,col 9)-(line 164,col 17)",
        "(line 165,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 168,col 14)",
        "(line 169,col 9)-(line 171,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ISAACRandom.isaac2()",
      "begin_line": 175,
      "end_line": 192,
      "comment": " Intermediate internal loop. ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 19)",
        "(line 177,col 9)-(line 177,col 21)",
        "(line 178,col 9)-(line 178,col 22)",
        "(line 179,col 9)-(line 179,col 17)",
        "(line 180,col 9)-(line 180,col 19)",
        "(line 181,col 9)-(line 181,col 21)",
        "(line 182,col 9)-(line 182,col 22)",
        "(line 183,col 9)-(line 183,col 17)",
        "(line 184,col 9)-(line 184,col 19)",
        "(line 185,col 9)-(line 185,col 20)",
        "(line 186,col 9)-(line 186,col 22)",
        "(line 187,col 9)-(line 187,col 17)",
        "(line 188,col 9)-(line 188,col 19)",
        "(line 189,col 9)-(line 189,col 22)",
        "(line 190,col 9)-(line 190,col 22)",
        "(line 191,col 9)-(line 191,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ISAACRandom.isaac3()",
      "begin_line": 195,
      "end_line": 199,
      "comment": " Lowest level internal loop. ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 46)",
        "(line 197,col 9)-(line 197,col 52)",
        "(line 198,col 9)-(line 198,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ISAACRandom.initState()",
      "begin_line": 202,
      "end_line": 239,
      "comment": " Initialize, or reinitialize, this instance of rand. ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 22)",
        "(line 204,col 9)-(line 206,col 9)",
        "(line 207,col 9)-(line 209,col 9)",
        "(line 211,col 9)-(line 222,col 9)",
        "(line 224,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 236,col 16)",
        "(line 237,col 9)-(line 237,col 25)",
        "(line 238,col 9)-(line 238,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ISAACRandom.shuffle()",
      "begin_line": 242,
      "end_line": 267,
      "comment": " Shuffle array. ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 31)",
        "(line 244,col 9)-(line 244,col 25)",
        "(line 245,col 9)-(line 245,col 25)",
        "(line 246,col 9)-(line 246,col 31)",
        "(line 247,col 9)-(line 247,col 25)",
        "(line 248,col 9)-(line 248,col 25)",
        "(line 249,col 9)-(line 249,col 30)",
        "(line 250,col 9)-(line 250,col 25)",
        "(line 251,col 9)-(line 251,col 25)",
        "(line 252,col 9)-(line 252,col 32)",
        "(line 253,col 9)-(line 253,col 25)",
        "(line 254,col 9)-(line 254,col 25)",
        "(line 255,col 9)-(line 255,col 31)",
        "(line 256,col 9)-(line 256,col 25)",
        "(line 257,col 9)-(line 257,col 25)",
        "(line 258,col 9)-(line 258,col 31)",
        "(line 259,col 9)-(line 259,col 25)",
        "(line 260,col 9)-(line 260,col 25)",
        "(line 261,col 9)-(line 261,col 30)",
        "(line 262,col 9)-(line 262,col 25)",
        "(line 263,col 9)-(line 263,col 25)",
        "(line 264,col 9)-(line 264,col 31)",
        "(line 265,col 9)-(line 265,col 25)",
        "(line 266,col 9)-(line 266,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ISAACRandom.setState()",
      "begin_line": 270,
      "end_line": 279,
      "comment": " Set the state by copying the internal arrays. ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 24)",
        "(line 272,col 9)-(line 272,col 28)",
        "(line 273,col 9)-(line 273,col 28)",
        "(line 274,col 9)-(line 274,col 28)",
        "(line 275,col 9)-(line 275,col 28)",
        "(line 276,col 9)-(line 276,col 28)",
        "(line 277,col 9)-(line 277,col 28)",
        "(line 278,col 9)-(line 278,col 28)"
      ]
    }
  ]
}