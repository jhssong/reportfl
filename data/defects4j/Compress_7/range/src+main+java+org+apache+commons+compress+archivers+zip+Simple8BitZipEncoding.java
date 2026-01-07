{
  "filepath": "/tmp/Compress-7b/src/main/java/org/apache/commons/compress/archivers/zip/Simple8BitZipEncoding.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Simple8BitZipEncoding",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.ZipEncoding"
      ],
      "begin_line": 47,
      "end_line": 261,
      "comment": "\n * This ZipEncoding implementation implements a simple 8bit character\n * set, which mets the following restrictions:\n * \n * \u003cul\u003e\n * \u003cli\u003eCharacters 0x0000 to 0x007f are encoded as the corresponding\n *        byte values 0x00 to 0x7f.\u003c/li\u003e\n * \u003cli\u003eAll byte codes from 0x80 to 0xff are mapped to a unique unicode\n *       character in the range 0x0080 to 0x7fff. (No support for\n *       UTF-16 surrogates)\n * \u003c/ul\u003e\n * \n * \u003cp\u003eThese restrictions most notably apply to the most prominent\n * omissions of java-1.4\u0027s {@link java.nio.charset.Charset Charset}\n * implementation, Cp437 and Cp850.\u003c/p\u003e\n * \n * \u003cp\u003eThe methods of this class are reentrant.\u003c/p\u003e\n * @Immutable\n "
    },
    {
      "type": "class_interface",
      "name": "Simple8BitChar",
      "is_interface": false,
      "parent_types": [
        "java.lang.Comparable"
      ],
      "begin_line": 53,
      "end_line": 72,
      "comment": "\n     * A character entity, which is put to the reverse mapping table\n     * of a simple encoding.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "unicode"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "code"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding.Simple8BitChar.Simple8BitChar(byte, char)",
      "begin_line": 57,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 58,col 13)-(line 58,col 29)",
        "(line 59,col 13)-(line 59,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding.Simple8BitChar.compareTo(java.lang.Object)",
      "begin_line": 62,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 63,col 13)-(line 63,col 50)",
        "(line 65,col 13)-(line 65,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding.Simple8BitChar.toString()",
      "begin_line": 68,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 69,col 13)-(line 70,col 60)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "highChars"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": "\n     * The characters for byte values of 128 to 255 stored as an array of\n     * 128 chars.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "reverseMapping"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": "\n     * A list of {@link Simple8BitChar} objects sorted by the unicode\n     * field.  This list is used to binary search reverse mapping of\n     * unicode characters with a character code greater than 127.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding.Simple8BitZipEncoding(char[])",
      "begin_line": 91,
      "end_line": 103,
      "comment": "\n     * @param highChars The characters for byte values of 128 to 255\n     * stored as an array of 128 chars.\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 52)",
        "(line 93,col 9)-(line 93,col 57)",
        "(line 95,col 9)-(line 95,col 24)",
        "(line 97,col 9)-(line 99,col 9)",
        "(line 101,col 9)-(line 101,col 31)",
        "(line 102,col 9)-(line 102,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding.decodeByte(byte)",
      "begin_line": 111,
      "end_line": 119,
      "comment": "\n     * Return the character code for a given encoded byte.\n     * \n     * @param b The byte to decode.\n     * @return The associated character value.\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 115,col 9)",
        "(line 118,col 9)-(line 118,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding.canEncodeChar(char)",
      "begin_line": 125,
      "end_line": 133,
      "comment": "\n     * @param c The character to encode.\n     * @return Whether the given unicode character is covered by this encoding.\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 129,col 9)",
        "(line 131,col 9)-(line 131,col 50)",
        "(line 132,col 9)-(line 132,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding.pushEncodedChar(java.nio.ByteBuffer, char)",
      "begin_line": 144,
      "end_line": 157,
      "comment": "\n     * Pushes the encoded form of the given character to the given byte buffer.\n     * \n     * @param bb The byte buffer to write to.\n     * @param c The character to encode.\n     * @return Whether the given unicode character is covered by this encoding.\n     *         If \u003ccode\u003efalse\u003c/code\u003e is returned, nothing is pushed to the\n     *         byte buffer. \n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 149,col 9)",
        "(line 151,col 9)-(line 151,col 50)",
        "(line 152,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 155,col 23)",
        "(line 156,col 9)-(line 156,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding.encodeHighChar(char)",
      "begin_line": 165,
      "end_line": 199,
      "comment": "\n     * @param c A unicode character in the range from 0x0080 to 0x7f00\n     * @return A Simple8BitChar, if this character is covered by this encoding.\n     *         A \u003ccode\u003enull\u003c/code\u003e value is returned, if this character is not\n     *         covered by this encoding.\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 19)",
        "(line 169,col 9)-(line 169,col 44)",
        "(line 171,col 9)-(line 186,col 9)",
        "(line 188,col 9)-(line 190,col 9)",
        "(line 192,col 9)-(line 192,col 72)",
        "(line 194,col 9)-(line 196,col 9)",
        "(line 198,col 9)-(line 198,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding.canEncode(java.lang.String)",
      "begin_line": 205,
      "end_line": 217,
      "comment": "\n     * @see\n     * org.apache.commons.compress.archivers.zip.ZipEncoding#canEncode(java.lang.String)\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 214,col 9)",
        "(line 216,col 9)-(line 216,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding.encode(java.lang.String)",
      "begin_line": 223,
      "end_line": 244,
      "comment": "\n     * @see\n     * org.apache.commons.compress.archivers.zip.ZipEncoding#encode(java.lang.String)\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 225,col 76)",
        "(line 227,col 9)-(line 239,col 9)",
        "(line 241,col 9)-(line 241,col 34)",
        "(line 242,col 9)-(line 242,col 21)",
        "(line 243,col 9)-(line 243,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding.decode(byte[])",
      "begin_line": 250,
      "end_line": 258,
      "comment": "\n     * @see\n     * org.apache.commons.compress.archivers.zip.ZipEncoding#decode(byte[])\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 44)",
        "(line 253,col 9)-(line 255,col 9)",
        "(line 257,col 9)-(line 257,col 31)"
      ]
    }
  ]
}