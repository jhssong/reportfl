{
  "filepath": "/tmp/Compress-47b/src/main/java/org/apache/commons/compress/compressors/lz77support/Parameters.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Parameters",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 24,
      "end_line": 350,
      "comment": "\n * Parameters of the {@link LZ77Compressor compressor}.\n "
    },
    {
      "type": "field",
      "varNames": [
        "TRUE_MIN_BACK_REFERENCE_LENGTH"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": "\n     * The hard-coded absolute minimal length of a back-reference.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.Parameters.builder(int)",
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n     * Initializes the builder for the compressor\u0027s parameters with a\n     * \u003ccode\u003eminBackReferenceLength\u003c/code\u003e of 3 and \u003ccode\u003emax*Length\u003c/code\u003e\n     * equal to \u003ccode\u003ewindowSize - 1\u003c/code\u003e.\n     *\n     * \u003cp\u003eIt is recommended to not use this method directly but rather\n     * tune a pre-configured builder created by a format specific\n     * factory like {@link\n     * org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream#createParameterBuilder}.\u003c/p\u003e\n     *\n     * @param windowSize the size of the sliding window - this\n     * determines the maximum offset a back-reference can take. Must\n     * be a power of two.\n     * @throws IllegalArgumentException if windowSize is not a power of two.\n     * @return a builder configured for the given window size\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 39)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Builder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 53,
      "end_line": 257,
      "comment": "\n     * Builder for {@link Parameters} instances.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "windowSize"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "minBackReferenceLength",
        "maxBackReferenceLength",
        "maxOffset",
        "maxLiteralLength"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "niceBackReferenceLength",
        "maxCandidates",
        "lazyThreshold"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lazyMatches"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.lz77support.Parameters.Builder.Builder(int)",
      "begin_line": 59,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 60,col 13)-(line 62,col 13)",
        "(line 63,col 13)-(line 63,col 41)",
        "(line 64,col 13)-(line 64,col 68)",
        "(line 65,col 13)-(line 65,col 52)",
        "(line 66,col 13)-(line 66,col 39)",
        "(line 67,col 13)-(line 67,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.Parameters.Builder.withMinBackReferenceLength(int)",
      "begin_line": 88,
      "end_line": 97,
      "comment": "\n         * Sets the mininal length of a back-reference.\n         *\n         * \u003cp\u003eEnsures \u003ccode\u003emaxBackReferenceLength\u003c/code\u003e is not\n         * smaller than \u003ccode\u003eminBackReferenceLength\u003c/code\u003e.\n         *\n         * \u003cp\u003eIt is recommended to not use this method directly but\n         * rather tune a pre-configured builder created by a format\n         * specific factory like {@link\n         * org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream#createParameterBuilder}.\u003c/p\u003e\n         *\n         * @param minBackReferenceLength the minimal length of a back-reference found. A\n         * true minimum of 3 is hard-coded inside of this implemention\n         * but bigger lengths can be configured.\n         * @throws IllegalArgumentException if \u003ccode\u003ewindowSize\u003c/code\u003e\n         * is smaller than \u003ccode\u003eminBackReferenceLength\u003c/code\u003e.\n         * @return the builder\n         ",
      "child_ranges": [
        "(line 89,col 13)-(line 89,col 107)",
        "(line 90,col 13)-(line 92,col 13)",
        "(line 93,col 13)-(line 95,col 13)",
        "(line 96,col 13)-(line 96,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.Parameters.Builder.withMaxBackReferenceLength(int)",
      "begin_line": 114,
      "end_line": 118,
      "comment": "\n         * Sets the maximal length of a back-reference.\n         *\n         * \u003cp\u003eIt is recommended to not use this method directly but\n         * rather tune a pre-configured builder created by a format\n         * specific factory like {@link\n         * org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream#createParameterBuilder}.\u003c/p\u003e\n         *\n         * @param maxBackReferenceLength maximal length of a\n         * back-reference found. A value smaller than\n         * \u003ccode\u003eminBackReferenceLength\u003c/code\u003e is interpreted as\n         * \u003ccode\u003eminBackReferenceLength\u003c/code\u003e. \u003ccode\u003emaxBackReferenceLength\u003c/code\u003e\n         * is capped at \u003ccode\u003ewindowSize - 1\u003c/code\u003e.\n         * @return the builder\n         ",
      "child_ranges": [
        "(line 115,col 13)-(line 116,col 67)",
        "(line 117,col 13)-(line 117,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.Parameters.Builder.withMaxOffset(int)",
      "begin_line": 134,
      "end_line": 137,
      "comment": "\n         * Sets the maximal offset of a back-reference.\n         *\n         * \u003cp\u003eIt is recommended to not use this method directly but\n         * rather tune a pre-configured builder created by a format\n         * specific factory like {@link\n         * org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream#createParameterBuilder}.\u003c/p\u003e\n         *\n         * @param maxOffset maximal offset of a back-reference. A\n         * non-positive value as well as values bigger than\n         * \u003ccode\u003ewindowSize - 1\u003c/code\u003e are interpreted as \u003ccode\u003ewindowSize\n         * - 1\u003c/code\u003e.\n         * @return the builder\n         ",
      "child_ranges": [
        "(line 135,col 13)-(line 135,col 98)",
        "(line 136,col 13)-(line 136,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.Parameters.Builder.withMaxLiteralLength(int)",
      "begin_line": 153,
      "end_line": 157,
      "comment": "\n         * Sets the maximal length of a literal block.\n         *\n         * \u003cp\u003eIt is recommended to not use this method directly but\n         * rather tune a pre-configured builder created by a format\n         * specific factory like {@link\n         * org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream#createParameterBuilder}.\u003c/p\u003e\n         *\n         * @param maxLiteralLength maximal length of a literal\n         * block. Negative numbers and 0 as well as values bigger than\n         * \u003ccode\u003ewindowSize\u003c/code\u003e are interpreted as\n         * \u003ccode\u003ewindowSize\u003c/code\u003e.\n         * @return the builder\n         ",
      "child_ranges": [
        "(line 154,col 13)-(line 155,col 57)",
        "(line 156,col 13)-(line 156,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.Parameters.Builder.withNiceBackReferenceLength(int)",
      "begin_line": 168,
      "end_line": 171,
      "comment": "\n         * Sets the \"nice length\" of a back-reference.\n         *\n         * \u003cp\u003eWhen a back-references if this size has been found, stop searching for longer back-references.\u003c/p\u003e\n         *\n         * \u003cp\u003eThis settings can be used to tune the tradeoff between compression speed and compression ratio.\u003c/p\u003e\n         * @param niceLen the \"nice length\" of a back-reference\n         * @return the builder\n         ",
      "child_ranges": [
        "(line 169,col 13)-(line 169,col 46)",
        "(line 170,col 13)-(line 170,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.Parameters.Builder.withMaxNumberOfCandidates(int)",
      "begin_line": 180,
      "end_line": 183,
      "comment": "\n         * Sets the maximum number of back-reference candidates that should be consulted.\n         *\n         * \u003cp\u003eThis settings can be used to tune the tradeoff between compression speed and compression ratio.\u003c/p\u003e\n         * @param maxCandidates maximum number of back-reference candidates\n         * @return the builder\n         ",
      "child_ranges": [
        "(line 181,col 13)-(line 181,col 47)",
        "(line 182,col 13)-(line 182,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.Parameters.Builder.withLazyMatching(boolean)",
      "begin_line": 195,
      "end_line": 198,
      "comment": "\n         * Sets whether lazy matching should be performed.\n         *\n         * \u003cp\u003eLazy matching means that after a back-reference for a certain position has been found the compressor will\n         * try to find a longer match for the next position.\u003c/p\u003e\n         *\n         * \u003cp\u003eLazy matching is enabled by default and disabled when tuning for speed.\u003c/p\u003e\n         * @param lazy whether lazy matching should be performed\n         * @return the builder\n         ",
      "child_ranges": [
        "(line 196,col 13)-(line 196,col 31)",
        "(line 197,col 13)-(line 197,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.Parameters.Builder.withLazyThreshold(int)",
      "begin_line": 208,
      "end_line": 211,
      "comment": "\n         * Sets the threshold for lazy matching.\n         *\n         * \u003cp\u003eEven if lazy matching is enabled it will not be performed if the length of the back-reference found for\n         * the current position is longer than this value.\u003c/p\u003e\n         * @param threshold the threshold for lazy matching\n         * @return the builder\n         ",
      "child_ranges": [
        "(line 209,col 13)-(line 209,col 38)",
        "(line 210,col 13)-(line 210,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.Parameters.Builder.tunedForSpeed()",
      "begin_line": 220,
      "end_line": 226,
      "comment": "\n         * Changes the default setting for \"nice back-reference length\" and \"maximum number of candidates\" for improved\n         * compression speed at the cost of compression ratio.\n         *\n         * \u003cp\u003eUse this method after configuring \"maximum back-reference length\".\u003c/p\u003e\n         * @return the builder\n         ",
      "child_ranges": [
        "(line 221,col 13)-(line 221,col 99)",
        "(line 222,col 13)-(line 222,col 60)",
        "(line 223,col 13)-(line 223,col 32)",
        "(line 224,col 13)-(line 224,col 51)",
        "(line 225,col 13)-(line 225,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.Parameters.Builder.tunedForCompressionRatio()",
      "begin_line": 235,
      "end_line": 240,
      "comment": "\n         * Changes the default setting for \"nice back-reference length\" and \"maximum number of candidates\" for improved\n         * compression ratio at the cost of compression speed.\n         *\n         * \u003cp\u003eUse this method after configuring \"maximum back-reference length\".\u003c/p\u003e\n         * @return the builder\n         ",
      "child_ranges": [
        "(line 236,col 13)-(line 236,col 77)",
        "(line 237,col 13)-(line 237,col 58)",
        "(line 238,col 13)-(line 238,col 31)",
        "(line 239,col 13)-(line 239,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.Parameters.Builder.build()",
      "begin_line": 246,
      "end_line": 256,
      "comment": "\n         * Creates the {@link Parameters} instance.\n         * @return the configured {@link Parameters} instance.\n         ",
      "child_ranges": [
        "(line 248,col 13)-(line 249,col 79)",
        "(line 250,col 13)-(line 250,col 101)",
        "(line 251,col 13)-(line 251,col 62)",
        "(line 252,col 13)-(line 252,col 110)",
        "(line 254,col 13)-(line 255,col 83)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "windowSize",
        "minBackReferenceLength",
        "maxBackReferenceLength",
        "maxOffset",
        "maxLiteralLength",
        "niceBackReferenceLength",
        "maxCandidates",
        "lazyThreshold"
      ],
      "begin_line": 259,
      "end_line": 260,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lazyMatching"
      ],
      "begin_line": 261,
      "end_line": 261,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.lz77support.Parameters.Parameters(int, int, int, int, int, int, int, boolean, int)",
      "begin_line": 263,
      "end_line": 275,
      "comment": "",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 37)",
        "(line 267,col 9)-(line 267,col 61)",
        "(line 268,col 9)-(line 268,col 61)",
        "(line 269,col 9)-(line 269,col 35)",
        "(line 270,col 9)-(line 270,col 49)",
        "(line 271,col 9)-(line 271,col 63)",
        "(line 272,col 9)-(line 272,col 43)",
        "(line 273,col 9)-(line 273,col 41)",
        "(line 274,col 9)-(line 274,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.Parameters.getWindowSize()",
      "begin_line": 282,
      "end_line": 284,
      "comment": "\n     * Gets the size of the sliding window - this determines the\n     * maximum offset a back-reference can take.\n     * @return the size of the sliding window\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.Parameters.getMinBackReferenceLength()",
      "begin_line": 289,
      "end_line": 291,
      "comment": "\n     * Gets the minimal length of a back-reference found.\n     * @return the minimal length of a back-reference found\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.Parameters.getMaxBackReferenceLength()",
      "begin_line": 296,
      "end_line": 298,
      "comment": "\n     * Gets the maximal length of a back-reference found.\n     * @return the maximal length of a back-reference found\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.Parameters.getMaxOffset()",
      "begin_line": 303,
      "end_line": 305,
      "comment": "\n     * Gets the maximal offset of a back-reference found.\n     * @return the maximal offset of a back-reference found\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.Parameters.getMaxLiteralLength()",
      "begin_line": 310,
      "end_line": 312,
      "comment": "\n     * Gets the maximal length of a literal block.\n     * @return the maximal length of a literal block\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.Parameters.getNiceBackReferenceLength()",
      "begin_line": 318,
      "end_line": 320,
      "comment": "\n     * Gets the length of a back-reference that is considered nice enough to stop searching for longer ones.\n     * @return the length of a back-reference that is considered nice enough to stop searching\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.Parameters.getMaxCandidates()",
      "begin_line": 326,
      "end_line": 328,
      "comment": "\n     * Gets the maximum number of back-reference candidates to consider.\n     * @return the maximum number of back-reference candidates to consider\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.Parameters.getLazyMatching()",
      "begin_line": 334,
      "end_line": 336,
      "comment": "\n     * Gets whether to perform lazy matching.\n     * @return whether to perform lazy matching\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.Parameters.getLazyMatchingThreshold()",
      "begin_line": 342,
      "end_line": 344,
      "comment": "\n     * Gets the threshold for lazy matching.\n     * @return the threshold for lazy matching\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.Parameters.isPowerOfTwo(int)",
      "begin_line": 346,
      "end_line": 349,
      "comment": "",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 34)"
      ]
    }
  ]
}