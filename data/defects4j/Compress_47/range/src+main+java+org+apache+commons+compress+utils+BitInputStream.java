{
  "filepath": "/tmp/Compress-47b/src/main/java/org/apache/commons/compress/utils/BitInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BitInputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.Closeable"
      ],
      "begin_line": 31,
      "end_line": 187,
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
      "comment": "\n     * Constructor taking an InputStream and its bit arrangement.\n     * @param in the InputStream\n     * @param byteOrder the bit arrangement across byte boundaries,\n     *      either BIG_ENDIAN (aaaaabbb bb000000) or LITTLE_ENDIAN (bbbaaaaa 000000bb)\n     ",
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
      "signature": "org.apache.commons.compress.utils.BitInputStream.bitsCached()",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n     * Returns the number of bits that can be read from this input\n     * stream without reading from the underlying input stream at all.\n     * @return estimate of the number of bits that can be read without reading from the underlying stream\n     * @since 1.16\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.BitInputStream.bitsAvailable()",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\n     * Returns an estimate of the number of bits that can be read from\n     * this input stream without blocking by the next invocation of a\n     * method for this input stream.\n     * @throws IOException if the underlying stream throws one when calling available\n     * @return estimate of the number of bits that can be read without blocking\n     * @since 1.16\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.BitInputStream.alignWithByteBoundary()",
      "begin_line": 130,
      "end_line": 135,
      "comment": "\n     * Drops bits until the next bits will be read from a byte boundary.\n     * @throws IOException if reading the remaining bits to the next byte boundary fails\n     * @since 1.16\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 40)",
        "(line 132,col 9)-(line 134,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.BitInputStream.processBitsGreater57(int)",
      "begin_line": 137,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 27)",
        "(line 139,col 9)-(line 139,col 29)",
        "(line 140,col 9)-(line 140,col 27)",
        "(line 143,col 9)-(line 143,col 52)",
        "(line 144,col 9)-(line 144,col 42)",
        "(line 145,col 9)-(line 145,col 40)",
        "(line 146,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 159,col 44)",
        "(line 160,col 9)-(line 160,col 30)",
        "(line 161,col 9)-(line 161,col 38)",
        "(line 162,col 9)-(line 162,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.BitInputStream.ensureCache(int)",
      "begin_line": 171,
      "end_line": 186,
      "comment": "\n     * Fills the cache up to 56 bits\n     * @param count\n     * @return return true, when EOF\n     * @throws IOException\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 184,col 9)",
        "(line 185,col 9)-(line 185,col 21)"
      ]
    }
  ]
}