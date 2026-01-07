{
  "filepath": "/tmp/Compress-22b/src/main/java/org/apache/commons/compress/compressors/snappy/SnappyCompressorInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SnappyCompressorInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorInputStream"
      ],
      "begin_line": 40,
      "end_line": 423,
      "comment": "\n * CompressorInputStream for the raw Snappy format.\n *\n * \u003cp\u003eThis implementation uses an internal buffer in order to handle\n * the back-references that are at the heart of the LZ77 algorithm.\n * The size of the buffer must be at least as big as the biggest\n * offset used in the compressed stream.  The current version of the\n * Snappy algorithm as defined by Google works on 32k blocks and\n * doesn\u0027t contain offsets bigger than 32k which is the default block\n * size used by this class.\u003c/p\u003e\n *\n * @see \u003ca href\u003d\"http://code.google.com/p/snappy/source/browse/trunk/format_description.txt\"\u003eSnappy compressed format description\u003c/a\u003e\n * @since 1.7\n "
    },
    {
      "type": "field",
      "varNames": [
        "TAG_MASK"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Mask used to determine the type of \"tag\" is being processed "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_BLOCK_SIZE"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Default block size "
    },
    {
      "type": "field",
      "varNames": [
        "decompressBuf"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Buffer to write decompressed bytes to for back-references "
    },
    {
      "type": "field",
      "varNames": [
        "writeIndex"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " One behind the index of the last byte in the buffer that was written "
    },
    {
      "type": "field",
      "varNames": [
        "readIndex"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Index of the next byte to be read. "
    },
    {
      "type": "field",
      "varNames": [
        "blockSize"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " The actual block size specified "
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " The underlying stream to read compressed data from "
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " The size of the uncompressed data "
    },
    {
      "type": "field",
      "varNames": [
        "uncompressedBytesRemaining"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Number of uncompressed bytes still to be read. "
    },
    {
      "type": "field",
      "varNames": [
        "oneByte"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " used in no-arg read method"
    },
    {
      "type": "field",
      "varNames": [
        "endReached"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.SnappyCompressorInputStream(java.io.InputStream)",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\n     * Constructor using the default buffer size of 32k.\n     * \n     * @param is\n     *            An InputStream to read compressed data from\n     * \n     * @throws IOException\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.SnappyCompressorInputStream(java.io.InputStream, int)",
      "begin_line": 96,
      "end_line": 103,
      "comment": "\n     * Constructor using a configurable buffer size.\n     * \n     * @param is\n     *            An InputStream to read compressed data from\n     * @param blockSize\n     *            The block size used in compression\n     * \n     * @throws IOException\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 21)",
        "(line 99,col 9)-(line 99,col 35)",
        "(line 100,col 9)-(line 100,col 53)",
        "(line 101,col 9)-(line 101,col 40)",
        "(line 102,col 9)-(line 102,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.read()",
      "begin_line": 106,
      "end_line": 109,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.close()",
      "begin_line": 112,
      "end_line": 115,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.available()",
      "begin_line": 118,
      "end_line": 121,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.read(byte[], int, int)",
      "begin_line": 126,
      "end_line": 143,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 131,col 38)",
        "(line 132,col 9)-(line 134,col 9)",
        "(line 136,col 9)-(line 136,col 50)",
        "(line 137,col 9)-(line 137,col 69)",
        "(line 138,col 9)-(line 138,col 30)",
        "(line 139,col 9)-(line 141,col 9)",
        "(line 142,col 9)-(line 142,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.fill(int)",
      "begin_line": 151,
      "end_line": 238,
      "comment": "\n     * Try to fill the buffer with enough bytes to satisfy the current\n     * read request.\n     *\n     * @param len the number of uncompressed bytes to read\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 155,col 64)",
        "(line 157,col 9)-(line 237,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.slideBuffer()",
      "begin_line": 246,
      "end_line": 251,
      "comment": "\n     * Slide buffer.\n     *\n     * \u003cp\u003eMove all bytes of the buffer after the first block down to\n     * the beginning of the buffer.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 248,col 40)",
        "(line 249,col 9)-(line 249,col 32)",
        "(line 250,col 9)-(line 250,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.readLiteralLength(int)",
      "begin_line": 264,
      "end_line": 291,
      "comment": "\n     * For literals up to and including 60 bytes in length, the\n     * upper six bits of the tag byte contain (len-1). The literal\n     * follows immediately thereafter in the bytestream. - For\n     * longer literals, the (len-1) value is stored after the tag\n     * byte, little-endian. The upper six bits of the tag byte\n     * describe how many bytes are used for the length; 60, 61, 62\n     * or 63 for 1-4 bytes, respectively. The literal itself follows\n     * after the length.\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 19)",
        "(line 266,col 9)-(line 288,col 9)",
        "(line 290,col 9)-(line 290,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.expandLiteral(int)",
      "begin_line": 305,
      "end_line": 314,
      "comment": "\n     * Literals are uncompressed data stored directly in the byte stream.\n     * \n     * @param length\n     *            The number of bytes to read from the underlying stream\n     * \n     * @throws IOException\n     *             If the first byte cannot be read for any reason other than\n     *             end of file, or if the input stream has been closed, or if\n     *             some other I/O error occurs.\n     * @return True if the decompressed data should be flushed\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 67)",
        "(line 307,col 9)-(line 307,col 25)",
        "(line 308,col 9)-(line 310,col 9)",
        "(line 312,col 9)-(line 312,col 29)",
        "(line 313,col 9)-(line 313,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.expandCopy(long, int)",
      "begin_line": 335,
      "end_line": 368,
      "comment": "\n     * Copies are references back into previous decompressed data, telling the\n     * decompressor to reuse data it has previously decoded. They encode two\n     * values: The offset, saying how many bytes back from the current position\n     * to read, and the length, how many bytes to copy. Offsets of zero can be\n     * encoded, but are not legal; similarly, it is possible to encode\n     * backreferences that would go past the end of the block (offset \u003e current\n     * decompressed position), which is also nonsensical and thus not allowed.\n     * \n     * @param off\n     *            The offset from the backward from the end of expanded stream\n     * @param length\n     *            The number of bytes to copy\n     * \n     * @throws IOException\n     *             An the offset expands past the front of the decompression\n     *             buffer\n     * @return True if the decompressed data should be flushed\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 338,col 9)",
        "(line 339,col 9)-(line 339,col 31)",
        "(line 341,col 9)-(line 366,col 9)",
        "(line 367,col 9)-(line 367,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.readOneByte()",
      "begin_line": 380,
      "end_line": 387,
      "comment": "\n     * This helper method reads the next byte of data from the input stream. The\n     * value byte is returned as an \u003ccode\u003eint\u003c/code\u003e in the range \u003ccode\u003e0\u003c/code\u003e\n     * to \u003ccode\u003e255\u003c/code\u003e. If no byte is available because the end of the\n     * stream has been reached, an Exception is thrown.\n     * \n     * @return The next byte of data\n     * @throws IOException\n     *             EOF is reached or error reading the stream\n     ",
      "child_ranges": [
        "(line 381,col 9)-(line 381,col 26)",
        "(line 382,col 9)-(line 384,col 9)",
        "(line 385,col 9)-(line 385,col 17)",
        "(line 386,col 9)-(line 386,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.readSize()",
      "begin_line": 402,
      "end_line": 412,
      "comment": "\n     * The stream starts with the uncompressed length (up to a maximum of 2^32 -\n     * 1), stored as a little-endian varint. Varints consist of a series of\n     * bytes, where the lower 7 bits are data and the upper bit is set iff there\n     * are more bytes to be read. In other words, an uncompressed length of 64\n     * would be stored as 0x40, and an uncompressed length of 2097150 (0x1FFFFE)\n     * would be stored as 0xFE 0xFF 0x7F.\n     * \n     * @return The size of the uncompressed data\n     * \n     * @throws IOException\n     *             Could not read a byte\n     ",
      "child_ranges": [
        "(line 403,col 9)-(line 403,col 22)",
        "(line 404,col 9)-(line 404,col 20)",
        "(line 405,col 9)-(line 405,col 18)",
        "(line 407,col 9)-(line 410,col 34)",
        "(line 411,col 9)-(line 411,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.getSize()",
      "begin_line": 419,
      "end_line": 421,
      "comment": "\n     * Get the uncompressed size of the stream\n     * \n     * @return the uncompressed size\n     ",
      "child_ranges": [
        "(line 420,col 9)-(line 420,col 20)"
      ]
    }
  ]
}