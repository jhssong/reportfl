{
  "filepath": "/tmp/Compress-46b/src/main/java/org/apache/commons/compress/compressors/lz4/BlockLZ4CompressorOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BlockLZ4CompressorOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorOutputStream"
      ],
      "begin_line": 40,
      "end_line": 502,
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
      "end_line": 129,
      "comment": "\n     * Creates a new LZ4 output stream.\n     *\n     * @param os\n     *            An OutputStream to read compressed data from\n     * @param params\n     *            The parameters to use for LZ77 compression.\n     *\n     * @throws IOException if reading fails\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 21)",
        "(line 115,col 9)-(line 128,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Anonymous-5430ff60-1ff4-4ebc-beea-b3d8e70f2315.accept(org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block)",
      "begin_line": 117,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 120,col 21)-(line 126,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.write(int)",
      "begin_line": 131,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 39)",
        "(line 134,col 9)-(line 134,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.write(byte[], int, int)",
      "begin_line": 137,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.close()",
      "begin_line": 142,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 17)",
        "(line 145,col 9)-(line 145,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.finish()",
      "begin_line": 153,
      "end_line": 158,
      "comment": "\n     * Compresses all remaining data and writes it to the stream,\n     * doesn\u0027t close the underlying stream.\n     * @throws IOException if an error occurs\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 157,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.prefill(byte[], int, int)",
      "begin_line": 169,
      "end_line": 175,
      "comment": "\n     * Adds some initial data to fill the window with.\n     *\n     * @param data the data to fill the window with.\n     * @param off offset of real data into the array\n     * @param len amount of data\n     * @throws IllegalStateException if the stream has already started to write data\n     * @see LZ77Compressor#prefill\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 174,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.addLiteralBlock(org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock)",
      "begin_line": 177,
      "end_line": 181,
      "comment": "",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 74)",
        "(line 179,col 9)-(line 179,col 46)",
        "(line 180,col 9)-(line 180,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.addBackReference(org.apache.commons.compress.compressors.lz77support.LZ77Compressor.BackReference)",
      "begin_line": 183,
      "end_line": 188,
      "comment": "",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 74)",
        "(line 185,col 9)-(line 185,col 37)",
        "(line 186,col 9)-(line 186,col 35)",
        "(line 187,col 9)-(line 187,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.writeBlocksAndReturnUnfinishedPair(int)",
      "begin_line": 190,
      "end_line": 198,
      "comment": "",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 35)",
        "(line 192,col 9)-(line 192,col 37)",
        "(line 193,col 9)-(line 196,col 9)",
        "(line 197,col 9)-(line 197,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.recordLiteral(byte[])",
      "begin_line": 200,
      "end_line": 202,
      "comment": "",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.clearUnusedBlocksAndPairs()",
      "begin_line": 204,
      "end_line": 207,
      "comment": "",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 28)",
        "(line 206,col 9)-(line 206,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.clearUnusedBlocks()",
      "begin_line": 209,
      "end_line": 223,
      "comment": "",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 29)",
        "(line 211,col 9)-(line 211,col 29)",
        "(line 212,col 9)-(line 218,col 9)",
        "(line 219,col 9)-(line 219,col 47)",
        "(line 220,col 9)-(line 222,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.recordBackReference(org.apache.commons.compress.compressors.lz77support.LZ77Compressor.BackReference)",
      "begin_line": 225,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.expand(int, int)",
      "begin_line": 229,
      "end_line": 241,
      "comment": "",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 43)",
        "(line 231,col 9)-(line 239,col 9)",
        "(line 240,col 9)-(line 240,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.expandFromList(byte[], int, int)",
      "begin_line": 243,
      "end_line": 277,
      "comment": "",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 37)",
        "(line 245,col 9)-(line 245,col 37)",
        "(line 246,col 9)-(line 246,col 28)",
        "(line 247,col 9)-(line 276,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.clearUnusedPairs()",
      "begin_line": 279,
      "end_line": 299,
      "comment": "",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 28)",
        "(line 281,col 9)-(line 281,col 28)",
        "(line 282,col 9)-(line 289,col 9)",
        "(line 290,col 9)-(line 290,col 38)",
        "(line 291,col 9)-(line 298,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.writeFinalLiteralBlock()",
      "begin_line": 301,
      "end_line": 309,
      "comment": "",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 27)",
        "(line 303,col 9)-(line 307,col 9)",
        "(line 308,col 9)-(line 308,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.writeWritablePairs(int)",
      "begin_line": 311,
      "end_line": 331,
      "comment": "",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 58)",
        "(line 313,col 9)-(line 319,col 9)",
        "(line 320,col 9)-(line 330,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.rewriteLastPairs()",
      "begin_line": 333,
      "end_line": 399,
      "comment": "",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 56)",
        "(line 335,col 9)-(line 335,col 60)",
        "(line 336,col 9)-(line 336,col 23)",
        "(line 337,col 9)-(line 349,col 9)",
        "(line 350,col 9)-(line 352,col 9)",
        "(line 377,col 9)-(line 377,col 51)",
        "(line 378,col 9)-(line 378,col 25)",
        "(line 379,col 9)-(line 381,col 9)",
        "(line 382,col 9)-(line 382,col 38)",
        "(line 383,col 9)-(line 385,col 9)",
        "(line 386,col 9)-(line 386,col 47)",
        "(line 387,col 9)-(line 387,col 71)",
        "(line 388,col 9)-(line 388,col 97)",
        "(line 389,col 9)-(line 397,col 9)",
        "(line 398,col 9)-(line 398,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.createParameterBuilder()",
      "begin_line": 405,
      "end_line": 412,
      "comment": "\n     * Returns a builder correctly configured for the LZ4 algorithm.\n     * @return a builder correctly configured for the LZ4 algorithm\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 67)",
        "(line 407,col 9)-(line 411,col 42)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Pair",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 414,
      "end_line": 501,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "literals"
      ],
      "begin_line": 415,
      "end_line": 415,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "brOffset",
        "brLength"
      ],
      "begin_line": 416,
      "end_line": 416,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "written"
      ],
      "begin_line": 417,
      "end_line": 417,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair.prependLiteral(byte[])",
      "begin_line": 419,
      "end_line": 421,
      "comment": "",
      "child_ranges": [
        "(line 420,col 13)-(line 420,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair.addLiteral(org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock)",
      "begin_line": 422,
      "end_line": 427,
      "comment": "",
      "child_ranges": [
        "(line 423,col 13)-(line 424,col 55)",
        "(line 425,col 13)-(line 425,col 31)",
        "(line 426,col 13)-(line 426,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair.setBackReference(org.apache.commons.compress.compressors.lz77support.LZ77Compressor.BackReference)",
      "begin_line": 428,
      "end_line": 434,
      "comment": "",
      "child_ranges": [
        "(line 429,col 13)-(line 431,col 13)",
        "(line 432,col 13)-(line 432,col 41)",
        "(line 433,col 13)-(line 433,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair.hasBackReference()",
      "begin_line": 435,
      "end_line": 437,
      "comment": "",
      "child_ranges": [
        "(line 436,col 13)-(line 436,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair.canBeWritten(int)",
      "begin_line": 438,
      "end_line": 441,
      "comment": "",
      "child_ranges": [
        "(line 439,col 13)-(line 440,col 112)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair.length()",
      "begin_line": 442,
      "end_line": 444,
      "comment": "",
      "child_ranges": [
        "(line 443,col 13)-(line 443,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair.hasBeenWritten()",
      "begin_line": 445,
      "end_line": 447,
      "comment": "",
      "child_ranges": [
        "(line 446,col 13)-(line 446,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair.writeTo(java.io.OutputStream)",
      "begin_line": 448,
      "end_line": 465,
      "comment": "",
      "child_ranges": [
        "(line 449,col 13)-(line 449,col 44)",
        "(line 450,col 13)-(line 450,col 52)",
        "(line 451,col 13)-(line 453,col 13)",
        "(line 454,col 13)-(line 456,col 13)",
        "(line 457,col 13)-(line 463,col 13)",
        "(line 464,col 13)-(line 464,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair.literalLength()",
      "begin_line": 466,
      "end_line": 472,
      "comment": "",
      "child_ranges": [
        "(line 467,col 13)-(line 467,col 27)",
        "(line 468,col 13)-(line 470,col 13)",
        "(line 471,col 13)-(line 471,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair.lengths(int, int)",
      "begin_line": 473,
      "end_line": 477,
      "comment": "",
      "child_ranges": [
        "(line 474,col 13)-(line 474,col 52)",
        "(line 475,col 13)-(line 475,col 76)",
        "(line 476,col 13)-(line 476,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair.writeLength(int, java.io.OutputStream)",
      "begin_line": 478,
      "end_line": 484,
      "comment": "",
      "child_ranges": [
        "(line 479,col 13)-(line 482,col 13)",
        "(line 483,col 13)-(line 483,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair.backReferenceLength()",
      "begin_line": 485,
      "end_line": 487,
      "comment": "",
      "child_ranges": [
        "(line 486,col 13)-(line 486,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair.prependTo(org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair)",
      "begin_line": 488,
      "end_line": 493,
      "comment": "",
      "child_ranges": [
        "(line 489,col 13)-(line 489,col 75)",
        "(line 490,col 13)-(line 492,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.Pair.splitWithNewBackReferenceLengthOf(int)",
      "begin_line": 494,
      "end_line": 500,
      "comment": "",
      "child_ranges": [
        "(line 495,col 13)-(line 495,col 32)",
        "(line 496,col 13)-(line 496,col 40)",
        "(line 497,col 13)-(line 497,col 34)",
        "(line 498,col 13)-(line 498,col 48)",
        "(line 499,col 13)-(line 499,col 21)"
      ]
    }
  ]
}