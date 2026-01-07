{
  "filepath": "/tmp/Compress-46b/src/main/java/org/apache/commons/compress/utils/BitInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BitInputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.Closeable"
      ],
      "begin_line": 31,
      "end_line": 153,
      "comment": "\n * Reads bits from an InputStream.\n * @since 1.10\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "MAXIMUM_CACHE_SIZE"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " bits in long minus sign bit"
    },
    {
      "type": "field",
      "varNames": [
        "MASKS"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "byteOrder"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bitsCached"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bitsCachedSize"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.utils.BitInputStream.BitInputStream(java.io.InputStream, java.nio.ByteOrder)",
      "begin_line": 52,
      "end_line": 55,
      "comment": "\n     * Constructor taking an InputStream and its bit arrangement. \n     * @param in the InputStream\n     * @param byteOrder the bit arrangement across byte boundaries,\n     *      either BIG_ENDIAN (aaaaabbb bb000000) or LITTLE_ENDIAN (bbbaaaaa 000000bb)\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 21)",
        "(line 54,col 9)-(line 54,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.BitInputStream.close()",
      "begin_line": 57,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.BitInputStream.clearBitCache()",
      "begin_line": 66,
      "end_line": 69,
      "comment": "\n     * Clears the cache of bits that have been read from the\n     * underlying stream but not yet provided via {@link #readBits}.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 23)",
        "(line 68,col 9)-(line 68,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.BitInputStream.readBits(int)",
      "begin_line": 81,
      "end_line": 101,
      "comment": "\n     * Returns at most 63 bits read from the underlying stream.\n     *\n     * @param count the number of bits to read, must be a positive\n     * number not bigger than 63.\n     * @return the bits concatenated as a long using the stream\u0027s byte order.\n     *         -1 if the end of the underlying stream has been reached before reading\n     *         the requested number of bits\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 84,col 9)",
        "(line 85,col 9)-(line 87,col 9)",
        "(line 89,col 9)-(line 91,col 9)",
        "(line 92,col 9)-(line 92,col 27)",
        "(line 93,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 99,col 32)",
        "(line 100,col 9)-(line 100,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.BitInputStream.processBitsGreater57(int)",
      "begin_line": 103,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 27)",
        "(line 105,col 9)-(line 105,col 29)",
        "(line 106,col 9)-(line 106,col 27)",
        "(line 109,col 9)-(line 109,col 52)",
        "(line 110,col 9)-(line 110,col 42)",
        "(line 111,col 9)-(line 111,col 40)",
        "(line 112,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 124,col 9)",
        "(line 125,col 9)-(line 125,col 44)",
        "(line 126,col 9)-(line 126,col 30)",
        "(line 127,col 9)-(line 127,col 38)",
        "(line 128,col 9)-(line 128,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.BitInputStream.ensureCache(int)",
      "begin_line": 137,
      "end_line": 152,
      "comment": "\n     * Fills the cache up to 56 bits\n     * @param count\n     * @return return true, when EOF\n     * @throws IOException\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 151,col 21)"
      ]
    }
  ]
}