{
  "filepath": "/tmp/Compress-45b/src/main/java/org/apache/commons/compress/compressors/snappy/SnappyCompressorInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SnappyCompressorInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.lz77support.AbstractLZ77CompressorInputStream"
      ],
      "begin_line": 41,
      "end_line": 286,
      "comment": "\n * CompressorInputStream for the raw Snappy format.\n *\n * \u003cp\u003eThis implementation uses an internal buffer in order to handle\n * the back-references that are at the heart of the LZ77 algorithm.\n * The size of the buffer must be at least as big as the biggest\n * offset used in the compressed stream.  The current version of the\n * Snappy algorithm as defined by Google works on 32k blocks and\n * doesn\u0027t contain offsets bigger than 32k which is the default block\n * size used by this class.\u003c/p\u003e\n *\n * @see \u003ca href\u003d\"https://github.com/google/snappy/blob/master/format_description.txt\"\u003eSnappy compressed format description\u003c/a\u003e\n * @since 1.7\n "
    },
    {
      "type": "field",
      "varNames": [
        "TAG_MASK"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Mask used to determine the type of \"tag\" is being processed "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_BLOCK_SIZE"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Default block size "
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " The size of the uncompressed data "
    },
    {
      "type": "field",
      "varNames": [
        "uncompressedBytesRemaining"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Number of uncompressed bytes still to be read. "
    },
    {
      "type": "field",
      "varNames": [
        "state"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Current state of the stream "
    },
    {
      "type": "field",
      "varNames": [
        "endReached"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.SnappyCompressorInputStream(java.io.InputStream)",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * Constructor using the default buffer size of 32k.\n     * \n     * @param is\n     *            An InputStream to read compressed data from\n     * \n     * @throws IOException if reading fails\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.SnappyCompressorInputStream(java.io.InputStream, int)",
      "begin_line": 82,
      "end_line": 86,
      "comment": "\n     * Constructor using a configurable buffer size.\n     * \n     * @param is\n     *            An InputStream to read compressed data from\n     * @param blockSize\n     *            The block size used in compression\n     * \n     * @throws IOException if reading fails\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 29)",
        "(line 85,col 9)-(line 85,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.read(byte[], int, int)",
      "begin_line": 91,
      "end_line": 115,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 95,col 9)",
        "(line 96,col 9)-(line 114,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.fill()",
      "begin_line": 120,
      "end_line": 207,
      "comment": "\n     * Try to fill the buffer with the next block of data.\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 124,col 9)",
        "(line 126,col 9)-(line 126,col 30)",
        "(line 127,col 9)-(line 129,col 9)",
        "(line 130,col 9)-(line 130,col 23)",
        "(line 131,col 9)-(line 131,col 23)",
        "(line 133,col 9)-(line 206,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.readLiteralLength(int)",
      "begin_line": 219,
      "end_line": 243,
      "comment": "\n     * For literals up to and including 60 bytes in length, the\n     * upper six bits of the tag byte contain (len-1). The literal\n     * follows immediately thereafter in the bytestream. - For\n     * longer literals, the (len-1) value is stored after the tag\n     * byte, little-endian. The upper six bits of the tag byte\n     * describe how many bytes are used for the length; 60, 61, 62\n     * or 63 for 1-4 bytes, respectively. The literal itself follows\n     * after the length.\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 19)",
        "(line 221,col 9)-(line 240,col 9)",
        "(line 242,col 9)-(line 242,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.readSize()",
      "begin_line": 258,
      "end_line": 271,
      "comment": "\n     * The stream starts with the uncompressed length (up to a maximum of 2^32 -\n     * 1), stored as a little-endian varint. Varints consist of a series of\n     * bytes, where the lower 7 bits are data and the upper bit is set iff there\n     * are more bytes to be read. In other words, an uncompressed length of 64\n     * would be stored as 0x40, and an uncompressed length of 2097150 (0x1FFFFE)\n     * would be stored as 0xFE 0xFF 0x7F.\n     * \n     * @return The size of the uncompressed data\n     * \n     * @throws IOException\n     *             Could not read a byte\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 22)",
        "(line 260,col 9)-(line 260,col 20)",
        "(line 261,col 9)-(line 261,col 18)",
        "(line 263,col 9)-(line 269,col 34)",
        "(line 270,col 9)-(line 270,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.getSize()",
      "begin_line": 278,
      "end_line": 281,
      "comment": "\n     * Get the uncompressed size of the stream\n     * \n     * @return the uncompressed size\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 20)"
      ]
    }
  ]
}