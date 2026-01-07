{
  "filepath": "/tmp/Compress-33b/src/main/java/org/apache/commons/compress/archivers/zip/ZipEncodingHelper.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipEncodingHelper",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 33,
      "end_line": 258,
      "comment": "\n * Static helper functions for robustly encoding filenames in zip files. \n "
    },
    {
      "type": "class_interface",
      "name": "SimpleEncodingHolder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 40,
      "end_line": 66,
      "comment": "\n     * A class, which holds the high characters of a simple encoding\n     * and lazily instantiates a Simple8BitZipEncoding instance in a\n     * thread-safe manner.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "highChars"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "encoding"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipEncodingHelper.SimpleEncodingHolder.SimpleEncodingHolder(char[])",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n         * Instantiate a simple encoding holder.\n         * \n         * @param highChars The characters for byte codes 128 to 255.\n         * \n         * @see Simple8BitZipEncoding#Simple8BitZipEncoding(char[])\n         ",
      "child_ranges": [
        "(line 53,col 13)-(line 53,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipEncodingHelper.SimpleEncodingHolder.getEncoding()",
      "begin_line": 60,
      "end_line": 65,
      "comment": "\n         * @return The associated {@link Simple8BitZipEncoding}, which\n         *         is instantiated if not done so far.\n         ",
      "child_ranges": [
        "(line 61,col 13)-(line 63,col 13)",
        "(line 64,col 13)-(line 64,col 33)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "simpleEncodings"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipEncodingHelper.growBuffer(java.nio.ByteBuffer, int)",
      "begin_line": 152,
      "end_line": 161,
      "comment": "\n     * Grow a byte buffer, so it has a minimal capacity or at least\n     * the double capacity of the original buffer \n     * \n     * @param b The original buffer.\n     * @param newCapacity The minimal requested new capacity.\n     * @return A byte buffer \u003ccode\u003er\u003c/code\u003e with\n     *         \u003ccode\u003er.capacity() \u003d max(b.capacity()*2,newCapacity)\u003c/code\u003e and\n     *         all the data contained in \u003ccode\u003eb\u003c/code\u003e copied to the beginning\n     *         of \u003ccode\u003er\u003c/code\u003e.\n     *\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 30)",
        "(line 154,col 9)-(line 154,col 19)",
        "(line 156,col 9)-(line 156,col 34)",
        "(line 157,col 9)-(line 157,col 81)",
        "(line 159,col 9)-(line 159,col 18)",
        "(line 160,col 9)-(line 160,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "HEX_DIGITS"
      ],
      "begin_line": 168,
      "end_line": 172,
      "comment": "\n     * The hexadecimal digits \u003ccode\u003e0,...,9,A,...,F\u003c/code\u003e encoded as\n     * ASCII bytes.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipEncodingHelper.appendSurrogate(java.nio.ByteBuffer, char)",
      "begin_line": 181,
      "end_line": 190,
      "comment": "\n     * Append \u003ccode\u003e%Uxxxx\u003c/code\u003e to the given byte buffer.\n     * The caller must assure, that \u003ccode\u003ebb.remaining()\u0026gt;\u003d6\u003c/code\u003e.\n     * \n     * @param bb The byte buffer to write to.\n     * @param c The character to write.\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 27)",
        "(line 184,col 9)-(line 184,col 27)",
        "(line 186,col 9)-(line 186,col 43)",
        "(line 187,col 9)-(line 187,col 42)",
        "(line 188,col 9)-(line 188,col 42)",
        "(line 189,col 9)-(line 189,col 37)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "UTF8"
      ],
      "begin_line": 196,
      "end_line": 196,
      "comment": "\n     * name of the encoding UTF-8\n     "
    },
    {
      "type": "field",
      "varNames": [
        "UTF8_ZIP_ENCODING"
      ],
      "begin_line": 201,
      "end_line": 201,
      "comment": "\n     * name of the encoding UTF-8\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding(java.lang.String)",
      "begin_line": 210,
      "end_line": 235,
      "comment": "\n     * Instantiates a zip encoding.\n     * \n     * @param name The name of the zip encoding. Specify {@code null} for\n     *             the platform\u0027s default encoding.\n     * @return A zip encoding for the given encoding name.\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 215,col 9)",
        "(line 217,col 9)-(line 219,col 9)",
        "(line 221,col 9)-(line 221,col 59)",
        "(line 223,col 9)-(line 225,col 9)",
        "(line 227,col 9)-(line 234,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipEncodingHelper.isUTF8(java.lang.String)",
      "begin_line": 243,
      "end_line": 257,
      "comment": "\n     * Returns whether a given encoding is UTF-8. If the given name is null, then check the platform\u0027s default encoding.\n     * \n     * @param charsetName\n     *            If the given name is null, then check the platform\u0027s default encoding.\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 247,col 9)",
        "(line 248,col 9)-(line 250,col 9)",
        "(line 251,col 9)-(line 255,col 9)",
        "(line 256,col 9)-(line 256,col 21)"
      ]
    }
  ]
}