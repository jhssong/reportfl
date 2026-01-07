{
  "filepath": "/tmp/Compress-41b/src/main/java/org/apache/commons/compress/archivers/zip/Simple8BitZipEncoding.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Simple8BitZipEncoding",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.ZipEncoding"
      ],
      "begin_line": 47,
      "end_line": 279,
      "comment": "\n * This ZipEncoding implementation implements a simple 8bit character\n * set, which mets the following restrictions:\n * \n * \u003cul\u003e\n * \u003cli\u003eCharacters 0x0000 to 0x007f are encoded as the corresponding\n *        byte values 0x00 to 0x7f.\u003c/li\u003e\n * \u003cli\u003eAll byte codes from 0x80 to 0xff are mapped to a unique unicode\n *       character in the range 0x0080 to 0x7fff. (No support for\n *       UTF-16 surrogates)\n * \u003c/ul\u003e\n * \n * \u003cp\u003eThese restrictions most notably apply to the most prominent\n * omissions of java-1.4\u0027s {@link java.nio.charset.Charset Charset}\n * implementation, Cp437 and Cp850.\u003c/p\u003e\n * \n * \u003cp\u003eThe methods of this class are reentrant.\u003c/p\u003e\n * @Immutable\n "
    },
    {
      "type": "class_interface",
      "name": "Simple8BitChar",
      "is_interface": false,
      "parent_types": [
        "java.lang.Comparable\u003corg.apache.commons.compress.archivers.zip.Simple8BitZipEncoding.Simple8BitChar\u003e"
      ],
      "begin_line": 53,
      "end_line": 86,
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
      "signature": "org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding.Simple8BitChar.compareTo(org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding.Simple8BitChar)",
      "begin_line": 62,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 64,col 13)-(line 64,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding.Simple8BitChar.toString()",
      "begin_line": 67,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 69,col 13)-(line 70,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding.Simple8BitChar.equals(java.lang.Object)",
      "begin_line": 73,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 75,col 13)-(line 78,col 13)",
        "(line 79,col 13)-(line 79,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding.Simple8BitChar.hashCode()",
      "begin_line": 82,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 84,col 13)-(line 84,col 27)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "highChars"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": "\n     * The characters for byte values of 128 to 255 stored as an array of\n     * 128 chars.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "reverseMapping"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": "\n     * A list of {@link Simple8BitChar} objects sorted by the unicode\n     * field.  This list is used to binary search reverse mapping of\n     * unicode characters with a character code greater than 127.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding.Simple8BitZipEncoding(char[])",
      "begin_line": 105,
      "end_line": 118,
      "comment": "\n     * @param highChars The characters for byte values of 128 to 255\n     * stored as an array of 128 chars.\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 43)",
        "(line 107,col 9)-(line 108,col 51)",
        "(line 110,col 9)-(line 110,col 24)",
        "(line 112,col 9)-(line 114,col 9)",
        "(line 116,col 9)-(line 116,col 31)",
        "(line 117,col 9)-(line 117,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding.decodeByte(byte)",
      "begin_line": 126,
      "end_line": 134,
      "comment": "\n     * Return the character code for a given encoded byte.\n     * \n     * @param b The byte to decode.\n     * @return The associated character value.\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 130,col 9)",
        "(line 133,col 9)-(line 133,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding.canEncodeChar(char)",
      "begin_line": 140,
      "end_line": 148,
      "comment": "\n     * @param c The character to encode.\n     * @return Whether the given unicode character is covered by this encoding.\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 144,col 9)",
        "(line 146,col 9)-(line 146,col 56)",
        "(line 147,col 9)-(line 147,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding.pushEncodedChar(java.nio.ByteBuffer, char)",
      "begin_line": 159,
      "end_line": 172,
      "comment": "\n     * Pushes the encoded form of the given character to the given byte buffer.\n     * \n     * @param bb The byte buffer to write to.\n     * @param c The character to encode.\n     * @return Whether the given unicode character is covered by this encoding.\n     *         If {@code false} is returned, nothing is pushed to the\n     *         byte buffer. \n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 164,col 9)",
        "(line 166,col 9)-(line 166,col 56)",
        "(line 167,col 9)-(line 169,col 9)",
        "(line 170,col 9)-(line 170,col 23)",
        "(line 171,col 9)-(line 171,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding.encodeHighChar(char)",
      "begin_line": 180,
      "end_line": 214,
      "comment": "\n     * @param c A unicode character in the range from 0x0080 to 0x7f00\n     * @return A Simple8BitChar, if this character is covered by this encoding.\n     *         A {@code null} value is returned, if this character is not\n     *         covered by this encoding.\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 19)",
        "(line 184,col 9)-(line 184,col 44)",
        "(line 186,col 9)-(line 201,col 9)",
        "(line 203,col 9)-(line 205,col 9)",
        "(line 207,col 9)-(line 207,col 61)",
        "(line 209,col 9)-(line 211,col 9)",
        "(line 213,col 9)-(line 213,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding.canEncode(java.lang.String)",
      "begin_line": 220,
      "end_line": 233,
      "comment": "\n     * @see\n     * org.apache.commons.compress.archivers.zip.ZipEncoding#canEncode(java.lang.String)\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 230,col 9)",
        "(line 232,col 9)-(line 232,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding.encode(java.lang.String)",
      "begin_line": 239,
      "end_line": 261,
      "comment": "\n     * @see\n     * org.apache.commons.compress.archivers.zip.ZipEncoding#encode(java.lang.String)\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 242,col 76)",
        "(line 244,col 9)-(line 256,col 9)",
        "(line 258,col 9)-(line 258,col 34)",
        "(line 259,col 9)-(line 259,col 21)",
        "(line 260,col 9)-(line 260,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding.decode(byte[])",
      "begin_line": 267,
      "end_line": 276,
      "comment": "\n     * @see\n     * org.apache.commons.compress.archivers.zip.ZipEncoding#decode(byte[])\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 50)",
        "(line 271,col 9)-(line 273,col 9)",
        "(line 275,col 9)-(line 275,col 31)"
      ]
    }
  ]
}