{
  "filepath": "/tmp/Compress-21b/src/main/java/org/apache/commons/compress/compressors/snappy/SnappyCompressorInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SnappyCompressorInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorInputStream"
      ],
      "begin_line": 40,
      "end_line": 430,
      "comment": "\n * CompressorInputStream for the raw Snappy format.\n *\n * \u003cp\u003eThis implementation uses an internal buffer in order to handle\n * the back-references that are at the heart of the LZ77 algorithm.\n * The size of the buffer must be at least as big as the biggest\n * offset used in the compressed stream.  The current version of the\n * Snappy algorithm as defined by Google works on 32k blocks and\n * doesn\u0027t contain offsets bigger than 32k which is the default block\n * size used by this class.\u003c/p\u003e\n *\n * @see \"http://code.google.com/p/snappy/source/browse/trunk/format_description.txt\"\n * @since 1.7\n "
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
      "begin_line": 55,
      "end_line": 55,
      "comment": " \n     * One behind the index of the last byte in the buffer that was\n     * written\n     "
    },
    {
      "type": "field",
      "varNames": [
        "readIndex"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": "\n     * Index of the next byte to be read.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "blockSize"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " The actual block size specified "
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " The underlying stream to read compressed data from "
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " The size of the uncompressed data "
    },
    {
      "type": "field",
      "varNames": [
        "uncompressedBytesRemaining"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": "\n     * Number of uncompressed bytes still to be read.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "oneByte"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " used in no-arg read method"
    },
    {
      "type": "field",
      "varNames": [
        "endReached"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.SnappyCompressorInputStream(java.io.InputStream)",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * Constructor using the default buffer size of 32k.\n     * \n     * @param is\n     *            An InputStream to read compressed data from\n     * \n     * @throws IOException\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.SnappyCompressorInputStream(java.io.InputStream, int)",
      "begin_line": 103,
      "end_line": 110,
      "comment": "\n     * Constructor using a configurable buffer size.\n     * \n     * @param is\n     *            An InputStream to read compressed data from\n     * @param blockSize\n     *            The block size used in compression\n     * \n     * @throws IOException\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 21)",
        "(line 106,col 9)-(line 106,col 35)",
        "(line 107,col 9)-(line 107,col 53)",
        "(line 108,col 9)-(line 108,col 40)",
        "(line 109,col 9)-(line 109,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.read()",
      "begin_line": 113,
      "end_line": 116,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.close()",
      "begin_line": 119,
      "end_line": 122,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.available()",
      "begin_line": 125,
      "end_line": 128,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.read(byte[], int, int)",
      "begin_line": 133,
      "end_line": 150,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 38)",
        "(line 139,col 9)-(line 141,col 9)",
        "(line 143,col 9)-(line 143,col 50)",
        "(line 144,col 9)-(line 144,col 69)",
        "(line 145,col 9)-(line 145,col 30)",
        "(line 146,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 149,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.fill(int)",
      "begin_line": 158,
      "end_line": 245,
      "comment": "\n     * Try to fill the buffer with enough bytes to satisfy the current\n     * read request.\n     *\n     * @param len the number of uncompressed bytes to read\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 161,col 9)",
        "(line 162,col 9)-(line 162,col 64)",
        "(line 164,col 9)-(line 244,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.slideBuffer()",
      "begin_line": 253,
      "end_line": 258,
      "comment": "\n     * Slide buffer.\n     *\n     * \u003cp\u003eMove all bytes of the buffer after the first block down to\n     * the beginning of the buffer.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 255,col 40)",
        "(line 256,col 9)-(line 256,col 32)",
        "(line 257,col 9)-(line 257,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.readLiteralLength(int)",
      "begin_line": 271,
      "end_line": 298,
      "comment": "\n     * For literals up to and including 60 bytes in length, the\n     * upper six bits of the tag byte contain (len-1). The literal\n     * follows immediately thereafter in the bytestream. - For\n     * longer literals, the (len-1) value is stored after the tag\n     * byte, little-endian. The upper six bits of the tag byte\n     * describe how many bytes are used for the length; 60, 61, 62\n     * or 63 for 1-4 bytes, respectively. The literal itself follows\n     * after the length.\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 19)",
        "(line 273,col 9)-(line 295,col 9)",
        "(line 297,col 9)-(line 297,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.expandLiteral(int)",
      "begin_line": 312,
      "end_line": 321,
      "comment": "\n     * Literals are uncompressed data stored directly in the byte stream.\n     * \n     * @param length\n     *            The number of bytes to read from the underlying stream\n     * \n     * @throws IOException\n     *             If the first byte cannot be read for any reason other than\n     *             end of file, or if the input stream has been closed, or if\n     *             some other I/O error occurs.\n     * @return True if the decompressed data should be flushed\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 67)",
        "(line 314,col 9)-(line 314,col 25)",
        "(line 315,col 9)-(line 317,col 9)",
        "(line 319,col 9)-(line 319,col 29)",
        "(line 320,col 9)-(line 320,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.expandCopy(long, int)",
      "begin_line": 342,
      "end_line": 375,
      "comment": "\n     * Copies are references back into previous decompressed data, telling the\n     * decompressor to reuse data it has previously decoded. They encode two\n     * values: The offset, saying how many bytes back from the current position\n     * to read, and the length, how many bytes to copy. Offsets of zero can be\n     * encoded, but are not legal; similarly, it is possible to encode\n     * backreferences that would go past the end of the block (offset \u003e current\n     * decompressed position), which is also nonsensical and thus not allowed.\n     * \n     * @param off\n     *            The offset from the backward from the end of expanded stream\n     * @param length\n     *            The number of bytes to copy\n     * \n     * @throws IOException\n     *             An the offset expands past the front of the decompression\n     *             buffer\n     * @return True if the decompressed data should be flushed\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 345,col 9)",
        "(line 346,col 9)-(line 346,col 31)",
        "(line 348,col 9)-(line 373,col 9)",
        "(line 374,col 9)-(line 374,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.readOneByte()",
      "begin_line": 387,
      "end_line": 394,
      "comment": "\n     * This helper method reads the next byte of data from the input stream. The\n     * value byte is returned as an \u003ccode\u003eint\u003c/code\u003e in the range \u003ccode\u003e0\u003c/code\u003e\n     * to \u003ccode\u003e255\u003c/code\u003e. If no byte is available because the end of the\n     * stream has been reached, an Exception is thrown.\n     * \n     * @return The next byte of data\n     * @throws IOException\n     *             EOF is reached or error reading the stream\n     ",
      "child_ranges": [
        "(line 388,col 9)-(line 388,col 26)",
        "(line 389,col 9)-(line 391,col 9)",
        "(line 392,col 9)-(line 392,col 17)",
        "(line 393,col 9)-(line 393,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.readSize()",
      "begin_line": 409,
      "end_line": 419,
      "comment": "\n     * The stream starts with the uncompressed length (up to a maximum of 2^32 -\n     * 1), stored as a little-endian varint. Varints consist of a series of\n     * bytes, where the lower 7 bits are data and the upper bit is set iff there\n     * are more bytes to be read. In other words, an uncompressed length of 64\n     * would be stored as 0x40, and an uncompressed length of 2097150 (0x1FFFFE)\n     * would be stored as 0xFE 0xFF 0x7F.\n     * \n     * @return The size of the uncompressed data\n     * \n     * @throws IOException\n     *             Could not read a byte\n     ",
      "child_ranges": [
        "(line 410,col 9)-(line 410,col 22)",
        "(line 411,col 9)-(line 411,col 20)",
        "(line 412,col 9)-(line 412,col 18)",
        "(line 414,col 9)-(line 417,col 34)",
        "(line 418,col 9)-(line 418,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.getSize()",
      "begin_line": 426,
      "end_line": 428,
      "comment": "\n     * Get the uncompressed size of the stream\n     * \n     * @return the uncompressed size\n     ",
      "child_ranges": [
        "(line 427,col 9)-(line 427,col 20)"
      ]
    }
  ]
}