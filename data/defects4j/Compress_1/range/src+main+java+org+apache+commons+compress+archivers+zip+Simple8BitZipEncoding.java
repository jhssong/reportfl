{
  "filepath": "/tmp/Compress-1b/src/main/java/org/apache/commons/compress/archivers/zip/Simple8BitZipEncoding.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Simple8BitZipEncoding",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.ZipEncoding"
      ],
      "begin_line": 46,
      "end_line": 260,
      "comment": "\n * This ZipEncoding implementation implements a simple 8bit character\n * set, which mets the following restrictions:\n * \n * \u003cul\u003e\n * \u003cli\u003eCharacters 0x0000 to 0x007f are encoded as the corresponding\n *        byte values 0x00 to 0x7f.\u003c/li\u003e\n * \u003cli\u003eAll byte codes from 0x80 to 0xff are mapped to a unique unicode\n *       character in the range 0x0080 to 0x7fff. (No support for\n *       UTF-16 surrogates)\n * \u003c/ul\u003e\n * \n * \u003cp\u003eThese restrictions most notably apply to the most prominent\n * omissions of java-1.4\u0027s {@link java.nio.charset.Charset Charset}\n * implementation, Cp437 and Cp850.\u003c/p\u003e\n * \n * \u003cp\u003eThe methods of this class are reentrant.\u003c/p\u003e\n "
    },
    {
      "type": "class_interface",
      "name": "Simple8BitChar",
      "is_interface": false,
      "parent_types": [
        "java.lang.Comparable"
      ],
      "begin_line": 52,
      "end_line": 71,
      "comment": "\n     * A character entity, which is put to the reverse mapping table\n     * of a simple encoding.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "unicode"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "code"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding.Simple8BitChar.Simple8BitChar(byte, char)",
      "begin_line": 56,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 57,col 13)-(line 57,col 29)",
        "(line 58,col 13)-(line 58,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding.Simple8BitChar.compareTo(java.lang.Object)",
      "begin_line": 61,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 62,col 13)-(line 62,col 50)",
        "(line 64,col 13)-(line 64,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding.Simple8BitChar.toString()",
      "begin_line": 67,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 68,col 13)-(line 69,col 60)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "highChars"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": "\n     * The characters for byte values of 128 to 255 stored as an array of\n     * 128 chars.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "reverseMapping"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": "\n     * A list of {@link Simple8BitChar} objects sorted by the unicode\n     * field.  This list is used to binary search reverse mapping of\n     * unicode characters with a character code greater than 127.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding.Simple8BitZipEncoding(char[])",
      "begin_line": 90,
      "end_line": 102,
      "comment": "\n     * @param highChars The characters for byte values of 128 to 255\n     * stored as an array of 128 chars.\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 35)",
        "(line 92,col 9)-(line 92,col 67)",
        "(line 94,col 9)-(line 94,col 24)",
        "(line 96,col 9)-(line 99,col 9)",
        "(line 101,col 9)-(line 101,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding.decodeByte(byte)",
      "begin_line": 110,
      "end_line": 118,
      "comment": "\n     * Return the character code for a given encoded byte.\n     * \n     * @param b The byte to decode.\n     * @return The associated character value.\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 114,col 9)",
        "(line 117,col 9)-(line 117,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding.canEncodeChar(char)",
      "begin_line": 124,
      "end_line": 132,
      "comment": "\n     * @param c The character to encode.\n     * @return Whether the given unicode character is covered by this encoding.\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 128,col 9)",
        "(line 130,col 9)-(line 130,col 50)",
        "(line 131,col 9)-(line 131,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding.pushEncodedChar(java.nio.ByteBuffer, char)",
      "begin_line": 143,
      "end_line": 156,
      "comment": "\n     * Pushes the encoded form of the given character to the given byte buffer.\n     * \n     * @param bb The byte buffer to write to.\n     * @param c The character to encode.\n     * @return Whether the given unicode character is covered by this encoding.\n     *         If \u003ccode\u003efalse\u003c/code\u003e is returned, nothing is pushed to the\n     *         byte buffer. \n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 148,col 9)",
        "(line 150,col 9)-(line 150,col 50)",
        "(line 151,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 154,col 23)",
        "(line 155,col 9)-(line 155,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding.encodeHighChar(char)",
      "begin_line": 164,
      "end_line": 198,
      "comment": "\n     * @param c A unicode character in the range from 0x0080 to 0x7f00\n     * @return A Simple8BitChar, if this character is covered by this encoding.\n     *         A \u003ccode\u003enull\u003c/code\u003e value is returned, if this character is not\n     *         covered by this encoding.\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 19)",
        "(line 168,col 9)-(line 168,col 44)",
        "(line 170,col 9)-(line 185,col 9)",
        "(line 187,col 9)-(line 189,col 9)",
        "(line 191,col 9)-(line 191,col 72)",
        "(line 193,col 9)-(line 195,col 9)",
        "(line 197,col 9)-(line 197,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding.canEncode(java.lang.String)",
      "begin_line": 204,
      "end_line": 216,
      "comment": "\n     * @see\n     * org.apache.commons.compress.archivers.zip.ZipEncoding#canEncode(java.lang.String)\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 213,col 9)",
        "(line 215,col 9)-(line 215,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding.encode(java.lang.String)",
      "begin_line": 222,
      "end_line": 243,
      "comment": "\n     * @see\n     * org.apache.commons.compress.archivers.zip.ZipEncoding#encode(java.lang.String)\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 224,col 76)",
        "(line 226,col 9)-(line 238,col 9)",
        "(line 240,col 9)-(line 240,col 34)",
        "(line 241,col 9)-(line 241,col 21)",
        "(line 242,col 9)-(line 242,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding.decode(byte[])",
      "begin_line": 249,
      "end_line": 257,
      "comment": "\n     * @see\n     * org.apache.commons.compress.archivers.zip.ZipEncoding#decode(byte[])\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 44)",
        "(line 252,col 9)-(line 254,col 9)",
        "(line 256,col 9)-(line 256,col 31)"
      ]
    }
  ]
}