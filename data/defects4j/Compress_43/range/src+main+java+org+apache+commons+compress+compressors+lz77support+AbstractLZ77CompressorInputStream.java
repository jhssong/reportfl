{
  "filepath": "/tmp/Compress-43b/src/main/java/org/apache/commons/compress/compressors/lz77support/AbstractLZ77CompressorInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractLZ77CompressorInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorInputStream"
      ],
      "begin_line": 75,
      "end_line": 332,
      "comment": "\n * Encapsulates code common to LZ77 decompressors.\n *\n * \u003cp\u003eAssumes the stream consists of blocks of literal data and\n * back-references (called copies) in any order. Of course the first\n * block must be a literal block for the scheme to work - unless the\n * {@link #prefill prefill} method has been used to provide initial\n * data that is never returned by {@link #read read} but only used for\n * back-references.\u003c/p\u003e\n *\n * \u003cp\u003eSubclasses must override the three-arg {@link #read read} method\n * as the no-arg version delegates to it and the default\n * implementation delegates to the no-arg version, leading to infinite\n * mutual recursion and a {@code StackOverflowError} otherwise.\u003c/p\u003e\n *\n * \u003cp\u003eThe contract for subclasses\u0027 {@code read} implementation is:\u003c/p\u003e\n * \u003cul\u003e\n *\n *  \u003cli\u003ekeep track of the current state of the stream. Is it inside a\n *  literal block or a back-reference or in-between blocks?\u003c/li\u003e\n *\n *  \u003cli\u003eUse {@link #readOneByte} to access the underlying stream\n *  directly.\u003c/li\u003e\n *\n *  \u003cli\u003eIf a new literal block starts, use {@link #startLiteral} to\n *  tell this class about it and read the literal data using {@link\n *  #readLiteral} until it returns {@code 0}. {@link\n *  #hasMoreDataInBlock} will return {@code false} before the next\n *  call to {@link #readLiteral} would return {@code 0}.\u003c/li\u003e\n *\n *  \u003cli\u003eIf a new back-reference starts, use {@link #startBackReference} to\n *  tell this class about it and read the literal data using {@link\n *  #readBackReference} until it returns {@code 0}. {@link\n *  #hasMoreDataInBlock} will return {@code false} before the next\n *  call to {@link #readBackReference} would return {@code 0}.\u003c/li\u003e\n *\n *  \u003cli\u003eIf the end of the stream has been reached, return {@code -1}\n *  as this class\u0027 methods will never do so themselves.\u003c/li\u003e\n *\n * \u003c/ul\u003e\n *\n * \u003cp\u003e{@link #readOneByte} and {@link #readLiteral} update the counter\n * for bytes read.\u003c/p\u003e\n *\n * @since 1.14\n "
    },
    {
      "type": "field",
      "varNames": [
        "windowSize"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " Size of the window - must be bigger than the biggest offset expected. "
    },
    {
      "type": "field",
      "varNames": [
        "buf"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": "\n     * Buffer to write decompressed bytes to for back-references, will\n     * be three times windowSize big.\n     *\n     * \u003cp\u003eThree times so we can slide the whole buffer a windowSize to\n     * the left once we\u0027ve read twice windowSize and still have enough\n     * data inside of it to satisfy back-references.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "writeIndex"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " One behind the index of the last byte in the buffer that was written, i.e. the next position to write to "
    },
    {
      "type": "field",
      "varNames": [
        "readIndex"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " Index of the next byte to be read. "
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " The underlying stream to read compressed data from "
    },
    {
      "type": "field",
      "varNames": [
        "bytesRemaining"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " Number of bytes still to be read from the current literal or back-reference. "
    },
    {
      "type": "field",
      "varNames": [
        "backReferenceOffset"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " Offset of the current back-reference. "
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " uncompressed size "
    },
    {
      "type": "field",
      "varNames": [
        "oneByte"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": " used in no-arg read method"
    },
    {
      "type": "field",
      "varNames": [
        "supplier"
      ],
      "begin_line": 114,
      "end_line": 119,
      "comment": "\n     * Supplier that delegates to {@link #readOneByte}.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.AbstractLZ77CompressorInputStream.Anonymous-b5ec0b9b-2aa4-42e7-b672-53bf8811b4f3.getAsByte()",
      "begin_line": 115,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 117,col 13)-(line 117,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.lz77support.AbstractLZ77CompressorInputStream.AbstractLZ77CompressorInputStream(java.io.InputStream, int)",
      "begin_line": 131,
      "end_line": 137,
      "comment": "\n     * Creates a new LZ77 input stream.\n     *\n     * @param is\n     *            An InputStream to read compressed data from\n     * @param windowSize\n     *            Size of the window kept for back-references, must be bigger than the biggest offset expected.\n     *\n     * @throws IOException if reading fails\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 21)",
        "(line 133,col 9)-(line 133,col 37)",
        "(line 134,col 9)-(line 134,col 39)",
        "(line 135,col 9)-(line 135,col 35)",
        "(line 136,col 9)-(line 136,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.AbstractLZ77CompressorInputStream.read()",
      "begin_line": 140,
      "end_line": 143,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.AbstractLZ77CompressorInputStream.close()",
      "begin_line": 146,
      "end_line": 149,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.AbstractLZ77CompressorInputStream.available()",
      "begin_line": 152,
      "end_line": 155,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.AbstractLZ77CompressorInputStream.getSize()",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\n     * Get the uncompressed size of the stream\n     *\n     * @return the uncompressed size\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.AbstractLZ77CompressorInputStream.prefill(byte[])",
      "begin_line": 177,
      "end_line": 187,
      "comment": "\n     * Adds some initial data to fill the window with.\n     *\n     * \u003cp\u003eThis is used if the stream has been cut into blocks and\n     * back-references of one block may refer to data of the previous\n     * block(s). One such example is the LZ4 frame format using block\n     * dependency.\u003c/p\u003e\n     *\n     * @param data the data to fill the window with.\n     * @throws IllegalStateException if the stream has already started to read data\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 180,col 9)",
        "(line 182,col 9)-(line 182,col 52)",
        "(line 184,col 9)-(line 184,col 63)",
        "(line 185,col 9)-(line 185,col 26)",
        "(line 186,col 9)-(line 186,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.AbstractLZ77CompressorInputStream.startLiteral(long)",
      "begin_line": 194,
      "end_line": 196,
      "comment": "\n     * Used by subclasses to signal the next block contains the given\n     * amount of literal data.\n     * @param length the length of the block\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.AbstractLZ77CompressorInputStream.hasMoreDataInBlock()",
      "begin_line": 202,
      "end_line": 204,
      "comment": "\n     * Is there still data remaining inside the current block?\n     * @return true if there is still data remaining inside the current block.\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.AbstractLZ77CompressorInputStream.readLiteral(byte[], int, int)",
      "begin_line": 217,
      "end_line": 223,
      "comment": "\n     * Reads data from the current literal block.\n     * @param b buffer to write data to\n     * @param off offset to start writing to\n     * @param len maximum amount of data to read\n     * @return number of bytes read, may be 0. Will never return -1 as\n     * EOF-detection is the responsibility of the subclass\n     * @throws IOException if the underlying stream throws or signals\n     * an EOF before the amount of data promised for the block have\n     * been read\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 38)",
        "(line 219,col 9)-(line 221,col 9)",
        "(line 222,col 9)-(line 222,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.AbstractLZ77CompressorInputStream.tryToReadLiteral(int)",
      "begin_line": 225,
      "end_line": 238,
      "comment": "",
      "child_ranges": [
        "(line 227,col 9)-(line 228,col 70)",
        "(line 229,col 9)-(line 231,col 54)",
        "(line 232,col 9)-(line 232,col 25)",
        "(line 233,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 236,col 38)",
        "(line 237,col 9)-(line 237,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.AbstractLZ77CompressorInputStream.readFromBuffer(byte[], int, int)",
      "begin_line": 240,
      "end_line": 251,
      "comment": "",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 56)",
        "(line 242,col 9)-(line 248,col 9)",
        "(line 249,col 9)-(line 249,col 25)",
        "(line 250,col 9)-(line 250,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.AbstractLZ77CompressorInputStream.slideBuffer()",
      "begin_line": 253,
      "end_line": 257,
      "comment": "",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 66)",
        "(line 255,col 9)-(line 255,col 33)",
        "(line 256,col 9)-(line 256,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.AbstractLZ77CompressorInputStream.startBackReference(int, long)",
      "begin_line": 264,
      "end_line": 267,
      "comment": "\n     * Used by subclasses to signal the next block contains a back-reference with the given coordinates.\n     * @param offset the offset of the back-reference\n     * @param length the length of the back-reference\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 37)",
        "(line 266,col 9)-(line 266,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.AbstractLZ77CompressorInputStream.readBackReference(byte[], int, int)",
      "begin_line": 277,
      "end_line": 283,
      "comment": "\n     * Reads data from the current back-reference.\n     * @param b buffer to write data to\n     * @param off offset to start writing to\n     * @param len maximum amount of data to read\n     * @return number of bytes read, may be 0. Will never return -1 as\n     * EOF-detection is the responsibility of the subclass\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 38)",
        "(line 279,col 9)-(line 281,col 9)",
        "(line 282,col 9)-(line 282,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.AbstractLZ77CompressorInputStream.tryToCopy(int)",
      "begin_line": 285,
      "end_line": 316,
      "comment": "",
      "child_ranges": [
        "(line 288,col 9)-(line 289,col 53)",
        "(line 290,col 9)-(line 314,col 9)",
        "(line 315,col 9)-(line 315,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.AbstractLZ77CompressorInputStream.readOneByte()",
      "begin_line": 324,
      "end_line": 331,
      "comment": "\n     * Reads a single byte from the real input stream and ensures the data is accounted for.\n     *\n     * @return the byte read as value between 0 and 255 or -1 if EOF has been reached.\n     * @throws IOException if the underlying stream throws\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 32)",
        "(line 326,col 9)-(line 329,col 9)",
        "(line 330,col 9)-(line 330,col 18)"
      ]
    }
  ]
}