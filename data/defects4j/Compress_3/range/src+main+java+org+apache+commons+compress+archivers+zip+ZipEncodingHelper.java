{
  "filepath": "/tmp/Compress-3b/src/main/java/org/apache/commons/compress/archivers/zip/ZipEncodingHelper.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipEncodingHelper",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 245,
      "comment": "\n * Static helper functions for robustly encoding filenames in zip files. \n "
    },
    {
      "type": "class_interface",
      "name": "SimpleEncodingHolder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 37,
      "end_line": 63,
      "comment": "\n     * A class, which holds the high characters of a simple encoding\n     * and lazily instantiates a Simple8BitZipEncoding instance in a\n     * thread-safe manner.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "highChars"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "encoding"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipEncodingHelper.SimpleEncodingHolder.SimpleEncodingHolder(char[])",
      "begin_line": 49,
      "end_line": 51,
      "comment": "\n         * Instantiate a simple encoding holder.\n         * \n         * @param highChars The characters for byte codes 128 to 255.\n         * \n         * @see Simple8BitZipEncoding#Simple8BitZipEncoding(char[])\n         ",
      "child_ranges": [
        "(line 50,col 13)-(line 50,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipEncodingHelper.SimpleEncodingHolder.getEncoding()",
      "begin_line": 57,
      "end_line": 62,
      "comment": "\n         * @return The associated {@link Simple8BitZipEncoding}, which\n         *         is instantiated if not done so far.\n         ",
      "child_ranges": [
        "(line 58,col 13)-(line 60,col 13)",
        "(line 61,col 13)-(line 61,col 33)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "simpleEncodings"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipEncodingHelper.growBuffer(java.nio.ByteBuffer, int)",
      "begin_line": 147,
      "end_line": 156,
      "comment": "\n     * Grow a byte buffer, so it has a minimal capacity or at least\n     * the double capacity of the original buffer \n     * \n     * @param b The original buffer.\n     * @param newCapacity The minimal requested new capacity.\n     * @return A byte buffer \u003ccode\u003er\u003c/code\u003e with\n     *         \u003ccode\u003er.capacity() \u003d max(b.capacity()*2,newCapacity)\u003c/code\u003e and\n     *         all the data contained in \u003ccode\u003eb\u003c/code\u003e copied to the beginning\n     *         of \u003ccode\u003er\u003c/code\u003e.\n     *\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 30)",
        "(line 149,col 9)-(line 149,col 19)",
        "(line 151,col 9)-(line 151,col 34)",
        "(line 152,col 9)-(line 152,col 81)",
        "(line 154,col 9)-(line 154,col 18)",
        "(line 155,col 9)-(line 155,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "HEX_DIGITS"
      ],
      "begin_line": 163,
      "end_line": 167,
      "comment": "\n     * The hexadecimal digits \u003ccode\u003e0,...,9,A,...,F\u003c/code\u003e encoded as\n     * ASCII bytes.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipEncodingHelper.appendSurrogate(java.nio.ByteBuffer, char)",
      "begin_line": 176,
      "end_line": 185,
      "comment": "\n     * Append \u003ccode\u003e%Uxxxx\u003c/code\u003e to the given byte buffer.\n     * The caller must assure, that \u003ccode\u003ebb.remaining()\u0026gt;\u003d6\u003c/code\u003e.\n     * \n     * @param bb The byte buffer to write to.\n     * @param c The character to write.\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 27)",
        "(line 179,col 9)-(line 179,col 27)",
        "(line 181,col 9)-(line 181,col 43)",
        "(line 182,col 9)-(line 182,col 42)",
        "(line 183,col 9)-(line 183,col 42)",
        "(line 184,col 9)-(line 184,col 37)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "UTF8"
      ],
      "begin_line": 191,
      "end_line": 191,
      "comment": "\n     * name of the encoding UTF-8\n     "
    },
    {
      "type": "field",
      "varNames": [
        "UTF8_ZIP_ENCODING"
      ],
      "begin_line": 196,
      "end_line": 196,
      "comment": "\n     * name of the encoding UTF-8\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding(java.lang.String)",
      "begin_line": 205,
      "end_line": 231,
      "comment": "\n     * Instantiates a zip encoding.\n     * \n     * @param name The name of the zip encoding. Specify \u003ccode\u003enull\u003c/code\u003e for\n     *             the platform\u0027s default encoding.\n     * @return A zip encoding for the given encoding name.\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 210,col 9)",
        "(line 212,col 9)-(line 214,col 9)",
        "(line 216,col 9)-(line 217,col 61)",
        "(line 219,col 9)-(line 221,col 9)",
        "(line 223,col 9)-(line 230,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipEncodingHelper.isUTF8(java.lang.String)",
      "begin_line": 237,
      "end_line": 244,
      "comment": "\n     * Whether a given encoding - or the platform\u0027s default encoding\n     * if the parameter is null - is UTF-8.\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 241,col 9)",
        "(line 242,col 9)-(line 243,col 50)"
      ]
    }
  ]
}