{
  "filepath": "/tmp/Compress-46b/src/main/java/org/apache/commons/compress/compressors/snappy/SnappyCompressorOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SnappyCompressorOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorOutputStream"
      ],
      "begin_line": 54,
      "end_line": 281,
      "comment": "\n * CompressorOutputStream for the raw Snappy format.\n *\n * \u003cp\u003eThis implementation uses an internal buffer in order to handle\n * the back-references that are at the heart of the LZ77 algorithm.\n * The size of the buffer must be at least as big as the biggest\n * offset used in the compressed stream.  The current version of the\n * Snappy algorithm as defined by Google works on 32k blocks and\n * doesn\u0027t contain offsets bigger than 32k which is the default block\n * size used by this class.\u003c/p\u003e\n *\n * \u003cp\u003eThe raw Snappy format requires the uncompressed size to be\n * written at the beginning of the stream using a varint\n * representation, i.e. the number of bytes needed to write the\n * information is not known before the uncompressed size is\n * known. We\u0027ve chosen to make the uncompressedSize a parameter of the\n * constructor in favor of buffering the whole output until the size\n * is known. When using the {@link FramedSnappyCompressorOutputStream}\n * this limitation is taken care of by the warpping framing\n * format.\u003c/p\u003e\n *\n * @see \u003ca href\u003d\"https://github.com/google/snappy/blob/master/format_description.txt\"\u003eSnappy compressed format description\u003c/a\u003e\n * @since 1.14\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "compressor"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "os"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "consumer"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "oneByte"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " used in one-arg write method"
    },
    {
      "type": "field",
      "varNames": [
        "finished"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream.SnappyCompressorOutputStream(java.io.OutputStream, long)",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * Constructor using the default block size of 32k.\n     *\n     * @param os the outputstream to write compressed data to\n     * @param uncompressedSize the uncompressed size of data\n     * @throws IOException if writing of the size fails\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 83)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream.SnappyCompressorOutputStream(java.io.OutputStream, long, int)",
      "begin_line": 83,
      "end_line": 86,
      "comment": "\n     * Constructor using a configurable block size.\n     *\n     * @param os the outputstream to write compressed data to\n     * @param uncompressedSize the uncompressed size of data\n     * @param blockSize the block size used - must be a power of two\n     * @throws IOException if writing of the size fails\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 78)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream.SnappyCompressorOutputStream(java.io.OutputStream, long, org.apache.commons.compress.compressors.lz77support.Parameters)",
      "begin_line": 98,
      "end_line": 114,
      "comment": "\n     * Constructor providing full control over the underlying LZ77 compressor.\n     *\n     * @param os the outputstream to write compressed data to\n     * @param uncompressedSize the uncompressed size of data\n     * @param params the parameters to use by the compressor - note\n     * that the format itself imposes some limits like a maximum match\n     * length of 64 bytes\n     * @throws IOException if writing of the size fails\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 21)",
        "(line 101,col 9)-(line 101,col 62)",
        "(line 102,col 9)-(line 112,col 15)",
        "(line 113,col 9)-(line 113,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream.Anonymous-3091763a-5282-45bd-a1e3-a319f7b0bee0.accept(org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block)",
      "begin_line": 103,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 106,col 21)-(line 110,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream.write(int)",
      "begin_line": 116,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 39)",
        "(line 119,col 9)-(line 119,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream.write(byte[], int, int)",
      "begin_line": 122,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream.close()",
      "begin_line": 127,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 17)",
        "(line 130,col 9)-(line 130,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream.finish()",
      "begin_line": 138,
      "end_line": 143,
      "comment": "\n     * Compresses all remaining data and writes it to the stream,\n     * doesn\u0027t close the underlying stream.\n     * @throws IOException if an error occurs\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 142,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream.writeUncompressedSize(long)",
      "begin_line": 145,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 29)",
        "(line 147,col 9)-(line 155,col 23)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "MAX_LITERAL_SIZE_WITHOUT_SIZE_BYTES"
      ],
      "begin_line": 160,
      "end_line": 160,
      "comment": " (six bits minus four flags) or in 1 to 4 bytes after the tag"
    },
    {
      "type": "field",
      "varNames": [
        "MAX_LITERAL_SIZE_WITH_ONE_SIZE_BYTE"
      ],
      "begin_line": 161,
      "end_line": 161,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MAX_LITERAL_SIZE_WITH_TWO_SIZE_BYTES"
      ],
      "begin_line": 162,
      "end_line": 162,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MAX_LITERAL_SIZE_WITH_THREE_SIZE_BYTES"
      ],
      "begin_line": 163,
      "end_line": 163,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ONE_SIZE_BYTE_MARKER"
      ],
      "begin_line": 165,
      "end_line": 165,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TWO_SIZE_BYTE_MARKER"
      ],
      "begin_line": 166,
      "end_line": 166,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "THREE_SIZE_BYTE_MARKER"
      ],
      "begin_line": 167,
      "end_line": 167,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FOUR_SIZE_BYTE_MARKER"
      ],
      "begin_line": 168,
      "end_line": 168,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream.writeLiteralBlock(org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock)",
      "begin_line": 170,
      "end_line": 183,
      "comment": "",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 36)",
        "(line 172,col 9)-(line 182,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream.writeLiteralBlockNoSizeBytes(org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock, int)",
      "begin_line": 185,
      "end_line": 187,
      "comment": "",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream.writeLiteralBlockOneSizeByte(org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock, int)",
      "begin_line": 189,
      "end_line": 191,
      "comment": "",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream.writeLiteralBlockTwoSizeBytes(org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock, int)",
      "begin_line": 193,
      "end_line": 195,
      "comment": "",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream.writeLiteralBlockThreeSizeBytes(org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock, int)",
      "begin_line": 197,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream.writeLiteralBlockFourSizeBytes(org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock, int)",
      "begin_line": 201,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream.writeLiteralBlockWithSize(int, int, int, org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock)",
      "begin_line": 205,
      "end_line": 210,
      "comment": "",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 26)",
        "(line 208,col 9)-(line 208,col 46)",
        "(line 209,col 9)-(line 209,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream.writeLittleEndian(int, int)",
      "begin_line": 212,
      "end_line": 214,
      "comment": "",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 58)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "MIN_MATCH_LENGTH_WITH_ONE_OFFSET_BYTE"
      ],
      "begin_line": 218,
      "end_line": 218,
      "comment": " in two, three or five bytes."
    },
    {
      "type": "field",
      "varNames": [
        "MAX_MATCH_LENGTH_WITH_ONE_OFFSET_BYTE"
      ],
      "begin_line": 219,
      "end_line": 219,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MAX_OFFSET_WITH_ONE_OFFSET_BYTE"
      ],
      "begin_line": 220,
      "end_line": 220,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MAX_OFFSET_WITH_TWO_OFFSET_BYTES"
      ],
      "begin_line": 221,
      "end_line": 221,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ONE_BYTE_COPY_TAG"
      ],
      "begin_line": 223,
      "end_line": 223,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TWO_BYTE_COPY_TAG"
      ],
      "begin_line": 224,
      "end_line": 224,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FOUR_BYTE_COPY_TAG"
      ],
      "begin_line": 225,
      "end_line": 225,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream.writeBackReference(org.apache.commons.compress.compressors.lz77support.LZ77Compressor.BackReference)",
      "begin_line": 227,
      "end_line": 238,
      "comment": "",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 42)",
        "(line 229,col 9)-(line 229,col 45)",
        "(line 230,col 9)-(line 237,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream.writeBackReferenceWithOneOffsetByte(int, int)",
      "begin_line": 240,
      "end_line": 243,
      "comment": "",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 81)",
        "(line 242,col 9)-(line 242,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream.writeBackReferenceWithTwoOffsetBytes(int, int)",
      "begin_line": 245,
      "end_line": 247,
      "comment": "",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream.writeBackReferenceWithFourOffsetBytes(int, int)",
      "begin_line": 249,
      "end_line": 251,
      "comment": "",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream.writeBackReferenceWithLittleEndianOffset(int, int, int, int)",
      "begin_line": 253,
      "end_line": 257,
      "comment": "",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 41)",
        "(line 256,col 9)-(line 256,col 47)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "MIN_MATCH_LENGTH"
      ],
      "begin_line": 262,
      "end_line": 262,
      "comment": " bytes in addition to the tag, so yield no compression at all"
    },
    {
      "type": "field",
      "varNames": [
        "MAX_MATCH_LENGTH"
      ],
      "begin_line": 264,
      "end_line": 264,
      "comment": " Snappy stores the match length in six bits of the tag"
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream.createParameterBuilder(int)",
      "begin_line": 271,
      "end_line": 280,
      "comment": "\n     * Returns a builder correctly configured for the Snappy algorithm using the gven block size.\n     * @param blockSize the block size.\n     * @return a builder correctly configured for the Snappy algorithm using the gven block size\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 279,col 45)"
      ]
    }
  ]
}