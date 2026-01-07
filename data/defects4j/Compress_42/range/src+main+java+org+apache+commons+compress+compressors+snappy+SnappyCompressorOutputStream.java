{
  "filepath": "/tmp/Compress-42b/src/main/java/org/apache/commons/compress/compressors/snappy/SnappyCompressorOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SnappyCompressorOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorOutputStream"
      ],
      "begin_line": 54,
      "end_line": 272,
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
        "(line 85,col 9)-(line 85,col 60)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream.SnappyCompressorOutputStream(java.io.OutputStream, long, org.apache.commons.compress.compressors.lz77support.Parameters)",
      "begin_line": 98,
      "end_line": 113,
      "comment": "\n     * Constructor providing full control over the underlying LZ77 compressor.\n     *\n     * @param os the outputstream to write compressed data to\n     * @param uncompressedSize the uncompressed size of data\n     * @param params the parameters to use by the compressor - note\n     * that the format itself imposes some limits like a maximum match\n     * length of 64 bytes\n     * @throws IOException if writing of the size fails\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 21)",
        "(line 101,col 9)-(line 101,col 62)",
        "(line 102,col 9)-(line 111,col 15)",
        "(line 112,col 9)-(line 112,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream.Anonymous-8d67f2db-b892-48a3-8fdf-8e3afa80e159.accept(org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block)",
      "begin_line": 103,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 105,col 21)-(line 109,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream.write(int)",
      "begin_line": 115,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 39)",
        "(line 118,col 9)-(line 118,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream.write(byte[], int, int)",
      "begin_line": 121,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream.close()",
      "begin_line": 126,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 17)",
        "(line 129,col 9)-(line 129,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream.finish()",
      "begin_line": 137,
      "end_line": 142,
      "comment": "\n     * Compresses all remaining data and writes it to the stream,\n     * doesn\u0027t close the underlying stream.\n     * @throws IOException if an error occurs\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 141,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream.writeUncompressedSize(long)",
      "begin_line": 144,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 29)",
        "(line 146,col 9)-(line 154,col 23)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "MAX_LITERAL_SIZE_WITHOUT_SIZE_BYTES"
      ],
      "begin_line": 159,
      "end_line": 159,
      "comment": " (six bits minus four flags) or in 1 to 4 bytes after the tag"
    },
    {
      "type": "field",
      "varNames": [
        "MAX_LITERAL_SIZE_WITH_ONE_SIZE_BYTE"
      ],
      "begin_line": 160,
      "end_line": 160,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MAX_LITERAL_SIZE_WITH_TWO_SIZE_BYTES"
      ],
      "begin_line": 161,
      "end_line": 161,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MAX_LITERAL_SIZE_WITH_THREE_SIZE_BYTES"
      ],
      "begin_line": 162,
      "end_line": 162,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ONE_SIZE_BYTE_MARKER"
      ],
      "begin_line": 164,
      "end_line": 164,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TWO_SIZE_BYTE_MARKER"
      ],
      "begin_line": 165,
      "end_line": 165,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "THREE_SIZE_BYTE_MARKER"
      ],
      "begin_line": 166,
      "end_line": 166,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FOUR_SIZE_BYTE_MARKER"
      ],
      "begin_line": 167,
      "end_line": 167,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream.writeLiteralBlock(org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock)",
      "begin_line": 169,
      "end_line": 182,
      "comment": "",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 36)",
        "(line 171,col 9)-(line 181,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream.writeLiteralBlockNoSizeBytes(org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock, int)",
      "begin_line": 184,
      "end_line": 186,
      "comment": "",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream.writeLiteralBlockOneSizeByte(org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock, int)",
      "begin_line": 188,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream.writeLiteralBlockTwoSizeBytes(org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock, int)",
      "begin_line": 192,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream.writeLiteralBlockThreeSizeBytes(org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock, int)",
      "begin_line": 196,
      "end_line": 198,
      "comment": "",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream.writeLiteralBlockFourSizeBytes(org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock, int)",
      "begin_line": 200,
      "end_line": 202,
      "comment": "",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream.writeLiteralBlockWithSize(int, int, int, org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock)",
      "begin_line": 204,
      "end_line": 209,
      "comment": "",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 26)",
        "(line 207,col 9)-(line 207,col 46)",
        "(line 208,col 9)-(line 208,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream.writeLittleEndian(int, int)",
      "begin_line": 211,
      "end_line": 213,
      "comment": "",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 58)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "MIN_MATCH_LENGTH_WITH_ONE_OFFSET_BYTE"
      ],
      "begin_line": 217,
      "end_line": 217,
      "comment": " in two, three or five bytes."
    },
    {
      "type": "field",
      "varNames": [
        "MAX_MATCH_LENGTH_WITH_ONE_OFFSET_BYTE"
      ],
      "begin_line": 218,
      "end_line": 218,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MAX_OFFSET_WITH_ONE_OFFSET_BYTE"
      ],
      "begin_line": 219,
      "end_line": 219,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MAX_OFFSET_WITH_TWO_OFFSET_BYTES"
      ],
      "begin_line": 220,
      "end_line": 220,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ONE_BYTE_COPY_TAG"
      ],
      "begin_line": 222,
      "end_line": 222,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TWO_BYTE_COPY_TAG"
      ],
      "begin_line": 223,
      "end_line": 223,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FOUR_BYTE_COPY_TAG"
      ],
      "begin_line": 224,
      "end_line": 224,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream.writeBackReference(org.apache.commons.compress.compressors.lz77support.LZ77Compressor.BackReference)",
      "begin_line": 226,
      "end_line": 237,
      "comment": "",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 42)",
        "(line 228,col 9)-(line 228,col 45)",
        "(line 229,col 9)-(line 236,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream.writeBackReferenceWithOneOffsetByte(int, int)",
      "begin_line": 239,
      "end_line": 242,
      "comment": "",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 81)",
        "(line 241,col 9)-(line 241,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream.writeBackReferenceWithTwoOffsetBytes(int, int)",
      "begin_line": 244,
      "end_line": 246,
      "comment": "",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream.writeBackReferenceWithFourOffsetBytes(int, int)",
      "begin_line": 248,
      "end_line": 250,
      "comment": "",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream.writeBackReferenceWithLittleEndianOffset(int, int, int, int)",
      "begin_line": 252,
      "end_line": 256,
      "comment": "",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 41)",
        "(line 255,col 9)-(line 255,col 47)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "MIN_MATCH_LENGTH"
      ],
      "begin_line": 261,
      "end_line": 261,
      "comment": " bytes in addition to the tag, so yield no compression at all"
    },
    {
      "type": "field",
      "varNames": [
        "MAX_MATCH_LENGTH"
      ],
      "begin_line": 263,
      "end_line": 263,
      "comment": " Snappy stores the match length in six bits of the tag"
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream.createParams(int)",
      "begin_line": 266,
      "end_line": 271,
      "comment": " package private for tests",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 99)"
      ]
    }
  ]
}