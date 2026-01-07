{
  "filepath": "/tmp/Compress-47b/src/main/java/org/apache/commons/compress/compressors/lz4/BlockLZ4CompressorOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BlockLZ4CompressorOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorOutputStream"
      ],
      "begin_line": 40,
      "end_line": 505,
      "comment": "\n * CompressorOutputStream for the LZ4 block format.\n *\n * @see \u003ca href\u003d\"http://lz4.github.io/lz4/lz4_Block_format.html\"\u003eLZ4 Block Format Description\u003c/a\u003e\n * @since 1.14\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "MIN_BACK_REFERENCE_LENGTH"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MIN_OFFSET_OF_LAST_BACK_REFERENCE"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compressor"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "os"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "oneByte"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " used in one-arg write method"
    },
    {
      "type": "field",
      "varNames": [
        "finished"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pairs"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "expandedBlocks"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " able to expand back-references when needed"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.BlockLZ4CompressorOutputStream(java.io.OutputStream)",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * Creates a new LZ4 output stream.\n     *\n     * @param os\n     *            An OutputStream to read compressed data from\n     *\n     * @throws IOException if reading fails\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.BlockLZ4CompressorOutputStream(java.io.OutputStream, org.apache.commons.compress.compressors.lz77support.Parameters)",
      "begin_line": 113,
      "end_line": 132,
      "comment": "\n     * Creates a new LZ4 output stream.\n     *\n     * @param os\n     *            An OutputStream to read compressed data from\n     * @param params\n     *            The parameters to use for LZ77 compression.\n     *\n     * @throws IOException if reading fails\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 21)",
        "(line 115,col 9)-(line 131,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Anonymous-4ab3e891-60f8-43f6-bf83-e5cf41df050a.accept(org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block)",
      "begin_line": 117,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 119,col 21)-(line 129,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.write(int)",
      "begin_line": 134,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 39)",
        "(line 137,col 9)-(line 137,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.write(byte[], int, int)",
      "begin_line": 140,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.close()",
      "begin_line": 145,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 17)",
        "(line 148,col 9)-(line 148,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.finish()",
      "begin_line": 156,
      "end_line": 161,
      "comment": "\n     * Compresses all remaining data and writes it to the stream,\n     * doesn\u0027t close the underlying stream.\n     * @throws IOException if an error occurs\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 160,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.prefill(byte[], int, int)",
      "begin_line": 172,
      "end_line": 178,
      "comment": "\n     * Adds some initial data to fill the window with.\n     *\n     * @param data the data to fill the window with.\n     * @param off offset of real data into the array\n     * @param len amount of data\n     * @throws IllegalStateException if the stream has already started to write data\n     * @see LZ77Compressor#prefill\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 177,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.addLiteralBlock(org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock)",
      "begin_line": 180,
      "end_line": 184,
      "comment": "",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 74)",
        "(line 182,col 9)-(line 182,col 46)",
        "(line 183,col 9)-(line 183,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.addBackReference(org.apache.commons.compress.compressors.lz77support.LZ77Compressor.BackReference)",
      "begin_line": 186,
      "end_line": 191,
      "comment": "",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 74)",
        "(line 188,col 9)-(line 188,col 37)",
        "(line 189,col 9)-(line 189,col 35)",
        "(line 190,col 9)-(line 190,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.writeBlocksAndReturnUnfinishedPair(int)",
      "begin_line": 193,
      "end_line": 201,
      "comment": "",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 35)",
        "(line 195,col 9)-(line 195,col 37)",
        "(line 196,col 9)-(line 199,col 9)",
        "(line 200,col 9)-(line 200,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.recordLiteral(byte[])",
      "begin_line": 203,
      "end_line": 205,
      "comment": "",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.clearUnusedBlocksAndPairs()",
      "begin_line": 207,
      "end_line": 210,
      "comment": "",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 28)",
        "(line 209,col 9)-(line 209,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.clearUnusedBlocks()",
      "begin_line": 212,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 29)",
        "(line 214,col 9)-(line 214,col 29)",
        "(line 215,col 9)-(line 221,col 9)",
        "(line 222,col 9)-(line 222,col 47)",
        "(line 223,col 9)-(line 225,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.recordBackReference(org.apache.commons.compress.compressors.lz77support.LZ77Compressor.BackReference)",
      "begin_line": 228,
      "end_line": 230,
      "comment": "",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.expand(int, int)",
      "begin_line": 232,
      "end_line": 244,
      "comment": "",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 43)",
        "(line 234,col 9)-(line 242,col 9)",
        "(line 243,col 9)-(line 243,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.expandFromList(byte[], int, int)",
      "begin_line": 246,
      "end_line": 280,
      "comment": "",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 37)",
        "(line 248,col 9)-(line 248,col 37)",
        "(line 249,col 9)-(line 249,col 28)",
        "(line 250,col 9)-(line 279,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.clearUnusedPairs()",
      "begin_line": 282,
      "end_line": 302,
      "comment": "",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 28)",
        "(line 284,col 9)-(line 284,col 28)",
        "(line 285,col 9)-(line 292,col 9)",
        "(line 293,col 9)-(line 293,col 38)",
        "(line 294,col 9)-(line 301,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.writeFinalLiteralBlock()",
      "begin_line": 304,
      "end_line": 312,
      "comment": "",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 27)",
        "(line 306,col 9)-(line 310,col 9)",
        "(line 311,col 9)-(line 311,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.writeWritablePairs(int)",
      "begin_line": 314,
      "end_line": 334,
      "comment": "",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 58)",
        "(line 316,col 9)-(line 322,col 9)",
        "(line 323,col 9)-(line 333,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.rewriteLastPairs()",
      "begin_line": 336,
      "end_line": 402,
      "comment": "",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 56)",
        "(line 338,col 9)-(line 338,col 60)",
        "(line 339,col 9)-(line 339,col 23)",
        "(line 340,col 9)-(line 352,col 9)",
        "(line 353,col 9)-(line 355,col 9)",
        "(line 380,col 9)-(line 380,col 51)",
        "(line 381,col 9)-(line 381,col 25)",
        "(line 382,col 9)-(line 384,col 9)",
        "(line 385,col 9)-(line 385,col 38)",
        "(line 386,col 9)-(line 388,col 9)",
        "(line 389,col 9)-(line 389,col 47)",
        "(line 390,col 9)-(line 390,col 71)",
        "(line 391,col 9)-(line 391,col 97)",
        "(line 392,col 9)-(line 400,col 9)",
        "(line 401,col 9)-(line 401,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.createParameterBuilder()",
      "begin_line": 408,
      "end_line": 415,
      "comment": "\n     * Returns a builder correctly configured for the LZ4 algorithm.\n     * @return a builder correctly configured for the LZ4 algorithm\n     ",
      "child_ranges": [
        "(line 409,col 9)-(line 409,col 67)",
        "(line 410,col 9)-(line 414,col 42)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Pair",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 417,
      "end_line": 504,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "literals"
      ],
      "begin_line": 418,
      "end_line": 418,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "brOffset",
        "brLength"
      ],
      "begin_line": 419,
      "end_line": 419,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "written"
      ],
      "begin_line": 420,
      "end_line": 420,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair.prependLiteral(byte[])",
      "begin_line": 422,
      "end_line": 424,
      "comment": "",
      "child_ranges": [
        "(line 423,col 13)-(line 423,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair.addLiteral(org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock)",
      "begin_line": 425,
      "end_line": 430,
      "comment": "",
      "child_ranges": [
        "(line 426,col 13)-(line 427,col 55)",
        "(line 428,col 13)-(line 428,col 31)",
        "(line 429,col 13)-(line 429,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair.setBackReference(org.apache.commons.compress.compressors.lz77support.LZ77Compressor.BackReference)",
      "begin_line": 431,
      "end_line": 437,
      "comment": "",
      "child_ranges": [
        "(line 432,col 13)-(line 434,col 13)",
        "(line 435,col 13)-(line 435,col 41)",
        "(line 436,col 13)-(line 436,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair.hasBackReference()",
      "begin_line": 438,
      "end_line": 440,
      "comment": "",
      "child_ranges": [
        "(line 439,col 13)-(line 439,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair.canBeWritten(int)",
      "begin_line": 441,
      "end_line": 444,
      "comment": "",
      "child_ranges": [
        "(line 442,col 13)-(line 443,col 112)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair.length()",
      "begin_line": 445,
      "end_line": 447,
      "comment": "",
      "child_ranges": [
        "(line 446,col 13)-(line 446,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair.hasBeenWritten()",
      "begin_line": 448,
      "end_line": 450,
      "comment": "",
      "child_ranges": [
        "(line 449,col 13)-(line 449,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair.writeTo(java.io.OutputStream)",
      "begin_line": 451,
      "end_line": 468,
      "comment": "",
      "child_ranges": [
        "(line 452,col 13)-(line 452,col 44)",
        "(line 453,col 13)-(line 453,col 52)",
        "(line 454,col 13)-(line 456,col 13)",
        "(line 457,col 13)-(line 459,col 13)",
        "(line 460,col 13)-(line 466,col 13)",
        "(line 467,col 13)-(line 467,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair.literalLength()",
      "begin_line": 469,
      "end_line": 475,
      "comment": "",
      "child_ranges": [
        "(line 470,col 13)-(line 470,col 27)",
        "(line 471,col 13)-(line 473,col 13)",
        "(line 474,col 13)-(line 474,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair.lengths(int, int)",
      "begin_line": 476,
      "end_line": 480,
      "comment": "",
      "child_ranges": [
        "(line 477,col 13)-(line 477,col 52)",
        "(line 478,col 13)-(line 478,col 76)",
        "(line 479,col 13)-(line 479,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair.writeLength(int, java.io.OutputStream)",
      "begin_line": 481,
      "end_line": 487,
      "comment": "",
      "child_ranges": [
        "(line 482,col 13)-(line 485,col 13)",
        "(line 486,col 13)-(line 486,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair.backReferenceLength()",
      "begin_line": 488,
      "end_line": 490,
      "comment": "",
      "child_ranges": [
        "(line 489,col 13)-(line 489,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair.prependTo(org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair)",
      "begin_line": 491,
      "end_line": 496,
      "comment": "",
      "child_ranges": [
        "(line 492,col 13)-(line 492,col 75)",
        "(line 493,col 13)-(line 495,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair.splitWithNewBackReferenceLengthOf(int)",
      "begin_line": 497,
      "end_line": 503,
      "comment": "",
      "child_ranges": [
        "(line 498,col 13)-(line 498,col 32)",
        "(line 499,col 13)-(line 499,col 40)",
        "(line 500,col 13)-(line 500,col 34)",
        "(line 501,col 13)-(line 501,col 48)",
        "(line 502,col 13)-(line 502,col 21)"
      ]
    }
  ]
}