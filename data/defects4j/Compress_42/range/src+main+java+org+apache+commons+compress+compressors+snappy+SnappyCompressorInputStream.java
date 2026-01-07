{
  "filepath": "/tmp/Compress-42b/src/main/java/org/apache/commons/compress/compressors/snappy/SnappyCompressorInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SnappyCompressorInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorInputStream"
      ],
      "begin_line": 42,
      "end_line": 438,
      "comment": "\n * CompressorInputStream for the raw Snappy format.\n *\n * \u003cp\u003eThis implementation uses an internal buffer in order to handle\n * the back-references that are at the heart of the LZ77 algorithm.\n * The size of the buffer must be at least as big as the biggest\n * offset used in the compressed stream.  The current version of the\n * Snappy algorithm as defined by Google works on 32k blocks and\n * doesn\u0027t contain offsets bigger than 32k which is the default block\n * size used by this class.\u003c/p\u003e\n *\n * @see \u003ca href\u003d\"https://github.com/google/snappy/blob/master/format_description.txt\"\u003eSnappy compressed format description\u003c/a\u003e\n * @since 1.7\n "
    },
    {
      "type": "field",
      "varNames": [
        "TAG_MASK"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Mask used to determine the type of \"tag\" is being processed "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_BLOCK_SIZE"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Default block size "
    },
    {
      "type": "field",
      "varNames": [
        "decompressBuf"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Buffer to write decompressed bytes to for back-references "
    },
    {
      "type": "field",
      "varNames": [
        "writeIndex"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " One behind the index of the last byte in the buffer that was written "
    },
    {
      "type": "field",
      "varNames": [
        "readIndex"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Index of the next byte to be read. "
    },
    {
      "type": "field",
      "varNames": [
        "blockSize"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " The actual block size specified "
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " The underlying stream to read compressed data from "
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " The size of the uncompressed data "
    },
    {
      "type": "field",
      "varNames": [
        "uncompressedBytesRemaining"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Number of uncompressed bytes still to be read. "
    },
    {
      "type": "field",
      "varNames": [
        "oneByte"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " used in no-arg read method"
    },
    {
      "type": "field",
      "varNames": [
        "endReached"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "supplier"
      ],
      "begin_line": 76,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.Anonymous-8038ec8f-8418-4965-b98f-f3d7b66e4e1e.getAsByte()",
      "begin_line": 77,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 79,col 13)-(line 79,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.SnappyCompressorInputStream(java.io.InputStream)",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * Constructor using the default buffer size of 32k.\n     * \n     * @param is\n     *            An InputStream to read compressed data from\n     * \n     * @throws IOException if reading fails\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.SnappyCompressorInputStream(java.io.InputStream, int)",
      "begin_line": 105,
      "end_line": 112,
      "comment": "\n     * Constructor using a configurable buffer size.\n     * \n     * @param is\n     *            An InputStream to read compressed data from\n     * @param blockSize\n     *            The block size used in compression\n     * \n     * @throws IOException if reading fails\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 21)",
        "(line 108,col 9)-(line 108,col 35)",
        "(line 109,col 9)-(line 109,col 53)",
        "(line 110,col 9)-(line 110,col 40)",
        "(line 111,col 9)-(line 111,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.read()",
      "begin_line": 115,
      "end_line": 118,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.close()",
      "begin_line": 121,
      "end_line": 124,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.available()",
      "begin_line": 127,
      "end_line": 130,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.read(byte[], int, int)",
      "begin_line": 135,
      "end_line": 155,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 139,col 9)",
        "(line 140,col 9)-(line 140,col 38)",
        "(line 141,col 9)-(line 143,col 9)",
        "(line 145,col 9)-(line 145,col 56)",
        "(line 146,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 149,col 69)",
        "(line 150,col 9)-(line 150,col 30)",
        "(line 151,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 154,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.fill(int)",
      "begin_line": 163,
      "end_line": 249,
      "comment": "\n     * Try to fill the buffer with enough bytes to satisfy the current\n     * read request.\n     *\n     * @param len the number of uncompressed bytes to read\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 167,col 64)",
        "(line 169,col 9)-(line 248,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.slideBuffer()",
      "begin_line": 257,
      "end_line": 262,
      "comment": "\n     * Slide buffer.\n     *\n     * \u003cp\u003eMove all bytes of the buffer after the first block down to\n     * the beginning of the buffer.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 259,col 40)",
        "(line 260,col 9)-(line 260,col 32)",
        "(line 261,col 9)-(line 261,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.readLiteralLength(int)",
      "begin_line": 275,
      "end_line": 296,
      "comment": "\n     * For literals up to and including 60 bytes in length, the\n     * upper six bits of the tag byte contain (len-1). The literal\n     * follows immediately thereafter in the bytestream. - For\n     * longer literals, the (len-1) value is stored after the tag\n     * byte, little-endian. The upper six bits of the tag byte\n     * describe how many bytes are used for the length; 60, 61, 62\n     * or 63 for 1-4 bytes, respectively. The literal itself follows\n     * after the length.\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 19)",
        "(line 277,col 9)-(line 293,col 9)",
        "(line 295,col 9)-(line 295,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.expandLiteral(int)",
      "begin_line": 310,
      "end_line": 320,
      "comment": "\n     * Literals are uncompressed data stored directly in the byte stream.\n     * \n     * @param length\n     *            The number of bytes to read from the underlying stream\n     * \n     * @throws IOException\n     *             If the first byte cannot be read for any reason other than\n     *             end of file, or if the input stream has been closed, or if\n     *             some other I/O error occurs.\n     * @return True if the decompressed data should be flushed\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 56)",
        "(line 312,col 9)-(line 312,col 87)",
        "(line 313,col 9)-(line 313,col 25)",
        "(line 314,col 9)-(line 316,col 9)",
        "(line 318,col 9)-(line 318,col 29)",
        "(line 319,col 9)-(line 319,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.ensureBufferSpace(int)",
      "begin_line": 322,
      "end_line": 328,
      "comment": "",
      "child_ranges": [
        "(line 323,col 9)-(line 326,col 9)",
        "(line 327,col 9)-(line 327,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.expandCopy(long, int)",
      "begin_line": 349,
      "end_line": 383,
      "comment": "\n     * Copies are references back into previous decompressed data, telling the\n     * decompressor to reuse data it has previously decoded. They encode two\n     * values: The offset, saying how many bytes back from the current position\n     * to read, and the length, how many bytes to copy. Offsets of zero can be\n     * encoded, but are not legal; similarly, it is possible to encode\n     * backreferences that would go past the end of the block (offset \u003e current\n     * decompressed position), which is also nonsensical and thus not allowed.\n     * \n     * @param off\n     *            The offset from the backward from the end of expanded stream\n     * @param length\n     *            The number of bytes to copy\n     * \n     * @throws IOException\n     *             An the offset expands past the front of the decompression\n     *             buffer\n     * @return True if the decompressed data should be flushed\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 352,col 9)",
        "(line 353,col 9)-(line 353,col 37)",
        "(line 354,col 9)-(line 354,col 56)",
        "(line 356,col 9)-(line 381,col 9)",
        "(line 382,col 9)-(line 382,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.readOneByte()",
      "begin_line": 395,
      "end_line": 402,
      "comment": "\n     * This helper method reads the next byte of data from the input stream. The\n     * value byte is returned as an \u003ccode\u003eint\u003c/code\u003e in the range \u003ccode\u003e0\u003c/code\u003e\n     * to \u003ccode\u003e255\u003c/code\u003e. If no byte is available because the end of the\n     * stream has been reached, an Exception is thrown.\n     * \n     * @return The next byte of data\n     * @throws IOException\n     *             EOF is reached or error reading the stream\n     ",
      "child_ranges": [
        "(line 396,col 9)-(line 396,col 32)",
        "(line 397,col 9)-(line 399,col 9)",
        "(line 400,col 9)-(line 400,col 17)",
        "(line 401,col 9)-(line 401,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.readSize()",
      "begin_line": 417,
      "end_line": 427,
      "comment": "\n     * The stream starts with the uncompressed length (up to a maximum of 2^32 -\n     * 1), stored as a little-endian varint. Varints consist of a series of\n     * bytes, where the lower 7 bits are data and the upper bit is set iff there\n     * are more bytes to be read. In other words, an uncompressed length of 64\n     * would be stored as 0x40, and an uncompressed length of 2097150 (0x1FFFFE)\n     * would be stored as 0xFE 0xFF 0x7F.\n     * \n     * @return The size of the uncompressed data\n     * \n     * @throws IOException\n     *             Could not read a byte\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 22)",
        "(line 419,col 9)-(line 419,col 20)",
        "(line 420,col 9)-(line 420,col 18)",
        "(line 422,col 9)-(line 425,col 34)",
        "(line 426,col 9)-(line 426,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.getSize()",
      "begin_line": 434,
      "end_line": 436,
      "comment": "\n     * Get the uncompressed size of the stream\n     * \n     * @return the uncompressed size\n     ",
      "child_ranges": [
        "(line 435,col 9)-(line 435,col 20)"
      ]
    }
  ]
}