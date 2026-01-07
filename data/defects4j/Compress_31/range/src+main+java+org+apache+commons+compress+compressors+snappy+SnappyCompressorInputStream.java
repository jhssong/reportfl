{
  "filepath": "/tmp/Compress-31b/src/main/java/org/apache/commons/compress/compressors/snappy/SnappyCompressorInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SnappyCompressorInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorInputStream"
      ],
      "begin_line": 41,
      "end_line": 424,
      "comment": "\n * CompressorInputStream for the raw Snappy format.\n *\n * \u003cp\u003eThis implementation uses an internal buffer in order to handle\n * the back-references that are at the heart of the LZ77 algorithm.\n * The size of the buffer must be at least as big as the biggest\n * offset used in the compressed stream.  The current version of the\n * Snappy algorithm as defined by Google works on 32k blocks and\n * doesn\u0027t contain offsets bigger than 32k which is the default block\n * size used by this class.\u003c/p\u003e\n *\n * @see \u003ca href\u003d\"http://code.google.com/p/snappy/source/browse/trunk/format_description.txt\"\u003eSnappy compressed format description\u003c/a\u003e\n * @since 1.7\n "
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
        "decompressBuf"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Buffer to write decompressed bytes to for back-references "
    },
    {
      "type": "field",
      "varNames": [
        "writeIndex"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " One behind the index of the last byte in the buffer that was written "
    },
    {
      "type": "field",
      "varNames": [
        "readIndex"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Index of the next byte to be read. "
    },
    {
      "type": "field",
      "varNames": [
        "blockSize"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " The actual block size specified "
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " The underlying stream to read compressed data from "
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " The size of the uncompressed data "
    },
    {
      "type": "field",
      "varNames": [
        "uncompressedBytesRemaining"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Number of uncompressed bytes still to be read. "
    },
    {
      "type": "field",
      "varNames": [
        "oneByte"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " used in no-arg read method"
    },
    {
      "type": "field",
      "varNames": [
        "endReached"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.SnappyCompressorInputStream(java.io.InputStream)",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * Constructor using the default buffer size of 32k.\n     * \n     * @param is\n     *            An InputStream to read compressed data from\n     * \n     * @throws IOException\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.SnappyCompressorInputStream(java.io.InputStream, int)",
      "begin_line": 97,
      "end_line": 104,
      "comment": "\n     * Constructor using a configurable buffer size.\n     * \n     * @param is\n     *            An InputStream to read compressed data from\n     * @param blockSize\n     *            The block size used in compression\n     * \n     * @throws IOException\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 21)",
        "(line 100,col 9)-(line 100,col 35)",
        "(line 101,col 9)-(line 101,col 53)",
        "(line 102,col 9)-(line 102,col 40)",
        "(line 103,col 9)-(line 103,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.read()",
      "begin_line": 107,
      "end_line": 110,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.close()",
      "begin_line": 113,
      "end_line": 116,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.available()",
      "begin_line": 119,
      "end_line": 122,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.read(byte[], int, int)",
      "begin_line": 127,
      "end_line": 144,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 131,col 9)",
        "(line 132,col 9)-(line 132,col 38)",
        "(line 133,col 9)-(line 135,col 9)",
        "(line 137,col 9)-(line 137,col 50)",
        "(line 138,col 9)-(line 138,col 69)",
        "(line 139,col 9)-(line 139,col 30)",
        "(line 140,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 143,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.fill(int)",
      "begin_line": 152,
      "end_line": 239,
      "comment": "\n     * Try to fill the buffer with enough bytes to satisfy the current\n     * read request.\n     *\n     * @param len the number of uncompressed bytes to read\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 156,col 64)",
        "(line 158,col 9)-(line 238,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.slideBuffer()",
      "begin_line": 247,
      "end_line": 252,
      "comment": "\n     * Slide buffer.\n     *\n     * \u003cp\u003eMove all bytes of the buffer after the first block down to\n     * the beginning of the buffer.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 249,col 40)",
        "(line 250,col 9)-(line 250,col 32)",
        "(line 251,col 9)-(line 251,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.readLiteralLength(int)",
      "begin_line": 265,
      "end_line": 292,
      "comment": "\n     * For literals up to and including 60 bytes in length, the\n     * upper six bits of the tag byte contain (len-1). The literal\n     * follows immediately thereafter in the bytestream. - For\n     * longer literals, the (len-1) value is stored after the tag\n     * byte, little-endian. The upper six bits of the tag byte\n     * describe how many bytes are used for the length; 60, 61, 62\n     * or 63 for 1-4 bytes, respectively. The literal itself follows\n     * after the length.\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 19)",
        "(line 267,col 9)-(line 289,col 9)",
        "(line 291,col 9)-(line 291,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.expandLiteral(int)",
      "begin_line": 306,
      "end_line": 315,
      "comment": "\n     * Literals are uncompressed data stored directly in the byte stream.\n     * \n     * @param length\n     *            The number of bytes to read from the underlying stream\n     * \n     * @throws IOException\n     *             If the first byte cannot be read for any reason other than\n     *             end of file, or if the input stream has been closed, or if\n     *             some other I/O error occurs.\n     * @return True if the decompressed data should be flushed\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 81)",
        "(line 308,col 9)-(line 308,col 25)",
        "(line 309,col 9)-(line 311,col 9)",
        "(line 313,col 9)-(line 313,col 29)",
        "(line 314,col 9)-(line 314,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.expandCopy(long, int)",
      "begin_line": 336,
      "end_line": 369,
      "comment": "\n     * Copies are references back into previous decompressed data, telling the\n     * decompressor to reuse data it has previously decoded. They encode two\n     * values: The offset, saying how many bytes back from the current position\n     * to read, and the length, how many bytes to copy. Offsets of zero can be\n     * encoded, but are not legal; similarly, it is possible to encode\n     * backreferences that would go past the end of the block (offset \u003e current\n     * decompressed position), which is also nonsensical and thus not allowed.\n     * \n     * @param off\n     *            The offset from the backward from the end of expanded stream\n     * @param length\n     *            The number of bytes to copy\n     * \n     * @throws IOException\n     *             An the offset expands past the front of the decompression\n     *             buffer\n     * @return True if the decompressed data should be flushed\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 339,col 9)",
        "(line 340,col 9)-(line 340,col 31)",
        "(line 342,col 9)-(line 367,col 9)",
        "(line 368,col 9)-(line 368,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.readOneByte()",
      "begin_line": 381,
      "end_line": 388,
      "comment": "\n     * This helper method reads the next byte of data from the input stream. The\n     * value byte is returned as an \u003ccode\u003eint\u003c/code\u003e in the range \u003ccode\u003e0\u003c/code\u003e\n     * to \u003ccode\u003e255\u003c/code\u003e. If no byte is available because the end of the\n     * stream has been reached, an Exception is thrown.\n     * \n     * @return The next byte of data\n     * @throws IOException\n     *             EOF is reached or error reading the stream\n     ",
      "child_ranges": [
        "(line 382,col 9)-(line 382,col 26)",
        "(line 383,col 9)-(line 385,col 9)",
        "(line 386,col 9)-(line 386,col 17)",
        "(line 387,col 9)-(line 387,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.readSize()",
      "begin_line": 403,
      "end_line": 413,
      "comment": "\n     * The stream starts with the uncompressed length (up to a maximum of 2^32 -\n     * 1), stored as a little-endian varint. Varints consist of a series of\n     * bytes, where the lower 7 bits are data and the upper bit is set iff there\n     * are more bytes to be read. In other words, an uncompressed length of 64\n     * would be stored as 0x40, and an uncompressed length of 2097150 (0x1FFFFE)\n     * would be stored as 0xFE 0xFF 0x7F.\n     * \n     * @return The size of the uncompressed data\n     * \n     * @throws IOException\n     *             Could not read a byte\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 22)",
        "(line 405,col 9)-(line 405,col 20)",
        "(line 406,col 9)-(line 406,col 18)",
        "(line 408,col 9)-(line 411,col 34)",
        "(line 412,col 9)-(line 412,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.getSize()",
      "begin_line": 420,
      "end_line": 422,
      "comment": "\n     * Get the uncompressed size of the stream\n     * \n     * @return the uncompressed size\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 20)"
      ]
    }
  ]
}