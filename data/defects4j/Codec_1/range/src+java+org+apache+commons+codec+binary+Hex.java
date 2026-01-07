{
  "filepath": "/tmp/Codec-1b/src/java/org/apache/commons/codec/binary/Hex.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Hex",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.codec.BinaryEncoder",
        "org.apache.commons.codec.BinaryDecoder"
      ],
      "begin_line": 32,
      "end_line": 192,
      "comment": "\n * Hex encoder and decoder.\n * \n * @since 1.1\n * @author Apache Software Foundation\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DIGITS"
      ],
      "begin_line": 37,
      "end_line": 40,
      "comment": " \n     * Used to build output as Hex \n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.decodeHex(char[])",
      "begin_line": 55,
      "end_line": 75,
      "comment": "\n     * Converts an array of characters representing hexidecimal values into an\n     * array of bytes of those same values. The returned array will be half the\n     * length of the passed array, as it takes two characters to represent any\n     * given byte. An exception is thrown if the passed char array has an odd\n     * number of elements.\n     * \n     * @param data An array of characters containing hexidecimal digits\n     * @return A byte array containing binary data decoded from\n     *         the supplied char array.\n     * @throws DecoderException Thrown if an odd number or illegal of characters \n     *         is supplied\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 30)",
        "(line 59,col 9)-(line 61,col 9)",
        "(line 63,col 9)-(line 63,col 40)",
        "(line 66,col 9)-(line 72,col 9)",
        "(line 74,col 9)-(line 74,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.toDigit(char, int)",
      "begin_line": 85,
      "end_line": 91,
      "comment": "\n     * Converts a hexadecimal character to an integer.\n     *  \n     * @param ch A character to convert to an integer digit\n     * @param index The index of the character in the source\n     * @return An integer\n     * @throws DecoderException Thrown if ch is an illegal hex character\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 44)",
        "(line 87,col 9)-(line 89,col 9)",
        "(line 90,col 9)-(line 90,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.encodeHex(byte[])",
      "begin_line": 102,
      "end_line": 115,
      "comment": "\n     * Converts an array of bytes into an array of characters representing the hexidecimal values of each byte in order.\n     * The returned array will be double the length of the passed array, as it takes two characters to represent any\n     * given byte.\n     * \n     * @param data\n     *                  a byte[] to convert to Hex characters\n     * @return A char[] containing hexidecimal characters\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 28)",
        "(line 106,col 12)-(line 106,col 41)",
        "(line 109,col 12)-(line 112,col 12)",
        "(line 114,col 12)-(line 114,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.decode(byte[])",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\n     * Converts an array of character bytes representing hexidecimal values into an\n     * array of bytes of those same values. The returned array will be half the\n     * length of the passed array, as it takes two characters to represent any\n     * given byte. An exception is thrown if the passed char array has an odd\n     * number of elements.\n     * \n     * @param array An array of character bytes containing hexidecimal digits\n     * @return A byte array containing binary data decoded from\n     *         the supplied byte array (representing characters).\n     * @throws DecoderException Thrown if an odd number of characters is supplied\n     *                   to this function\n     * @see #decodeHex(char[])\n     ",
      "child_ranges": [
        "(line 132,col 3)-(line 132,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.decode(java.lang.Object)",
      "begin_line": 149,
      "end_line": 156,
      "comment": "\n     * Converts a String or an array of character bytes representing hexidecimal values into an\n     * array of bytes of those same values. The returned array will be half the\n     * length of the passed String or array, as it takes two characters to represent any\n     * given byte. An exception is thrown if the passed char array has an odd\n     * number of elements.\n     * \n     * @param object A String or, an array of character bytes containing hexidecimal digits\n     * @return A byte array containing binary data decoded from\n     *         the supplied byte array (representing characters).\n     * @throws DecoderException Thrown if an odd number of characters is supplied\n     *                   to this function or the object is not a String or char[]\n     * @see #decodeHex(char[])\n     ",
      "child_ranges": [
        "(line 150,col 3)-(line 155,col 3)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.encode(byte[])",
      "begin_line": 168,
      "end_line": 170,
      "comment": "\n     * Converts an array of bytes into an array of bytes for the characters representing the\n     * hexidecimal values of each byte in order. The returned array will be\n     * double the length of the passed array, as it takes two characters to\n     * represent any given byte.\n     *\n     * @param array a byte[] to convert to Hex characters\n     * @return A byte[] containing the bytes of the hexidecimal characters\n     * @see #encodeHex(byte[])\n     ",
      "child_ranges": [
        "(line 169,col 3)-(line 169,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.encode(java.lang.Object)",
      "begin_line": 183,
      "end_line": 190,
      "comment": "\n     * Converts a String or an array of bytes into an array of characters representing the\n     * hexidecimal values of each byte in order. The returned array will be\n     * double the length of the passed String or array, as it takes two characters to\n     * represent any given byte.\n     *\n     * @param object a String, or byte[] to convert to Hex characters\n     * @return A char[] containing hexidecimal characters\n     * @throws EncoderException Thrown if the given object is not a String or byte[]\n     * @see #encodeHex(byte[])\n     ",
      "child_ranges": [
        "(line 184,col 3)-(line 189,col 3)"
      ]
    }
  ]
}