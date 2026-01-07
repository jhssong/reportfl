{
  "filepath": "/tmp/Codec-2b/src/java/org/apache/commons/codec/binary/Hex.java",
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
      "end_line": 230,
      "comment": "\n * Hex encoder and decoder.\n * \n * @since 1.1\n * @author Apache Software Foundation\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DIGITS_LOWER"
      ],
      "begin_line": 37,
      "end_line": 40,
      "comment": " \n     * Used to build output as Hex \n     "
    },
    {
      "type": "field",
      "varNames": [
        "DIGITS_UPPER"
      ],
      "begin_line": 45,
      "end_line": 48,
      "comment": " \n     * Used to build output as Hex \n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.decodeHex(char[])",
      "begin_line": 63,
      "end_line": 83,
      "comment": "\n     * Converts an array of characters representing hexadecimal values into an\n     * array of bytes of those same values. The returned array will be half the\n     * length of the passed array, as it takes two characters to represent any\n     * given byte. An exception is thrown if the passed char array has an odd\n     * number of elements.\n     * \n     * @param data An array of characters containing hexadecimal digits\n     * @return A byte array containing binary data decoded from\n     *         the supplied char array.\n     * @throws DecoderException Thrown if an odd number or illegal of characters \n     *         is supplied\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 30)",
        "(line 67,col 9)-(line 69,col 9)",
        "(line 71,col 9)-(line 71,col 40)",
        "(line 74,col 9)-(line 80,col 9)",
        "(line 82,col 9)-(line 82,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.toDigit(char, int)",
      "begin_line": 93,
      "end_line": 99,
      "comment": "\n     * Converts a hexadecimal character to an integer.\n     *  \n     * @param ch A character to convert to an integer digit\n     * @param index The index of the character in the source\n     * @return An integer\n     * @throws DecoderException Thrown if ch is an illegal hex character\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 44)",
        "(line 95,col 9)-(line 97,col 9)",
        "(line 98,col 9)-(line 98,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.encodeHex(byte[])",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n     * Converts an array of bytes into an array of characters representing the hexadecimal values of each byte in order.\n     * The returned array will be double the length of the passed array, as it takes two characters to represent any\n     * given byte.\n     * \n     * @param data\n     *            a byte[] to convert to Hex characters\n     * @return A char[] containing hexadecimal characters\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.encodeHex(byte[], boolean)",
      "begin_line": 125,
      "end_line": 127,
      "comment": "\n     * Converts an array of bytes into an array of characters representing the hexadecimal values of each byte in order.\n     * The returned array will be double the length of the passed array, as it takes two characters to represent any\n     * given byte.\n     * \n     * @param data\n     *            a byte[] to convert to Hex characters\n     * @param toLowerCase\n     *            \u003ccode\u003etrue\u003c/code\u003e converts to lowercase, \u003ccode\u003efalse\u003c/code\u003e to uppercase\n     * @return A char[] containing hexadecimal characters\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.encodeHex(byte[], char[])",
      "begin_line": 140,
      "end_line": 153,
      "comment": "\n     * Converts an array of bytes into an array of characters representing the hexadecimal values of each byte in order.\n     * The returned array will be double the length of the passed array, as it takes two characters to represent any\n     * given byte.\n     * \n     * @param data\n     *            a byte[] to convert to Hex characters\n     * @param toDigits\n     *            the output alphabet\n     * @return A char[] containing hexadecimal characters\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 28)",
        "(line 144,col 9)-(line 144,col 38)",
        "(line 147,col 9)-(line 150,col 9)",
        "(line 152,col 9)-(line 152,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.decode(byte[])",
      "begin_line": 169,
      "end_line": 171,
      "comment": "\n     * Converts an array of character bytes representing hexadecimal values into an\n     * array of bytes of those same values. The returned array will be half the\n     * length of the passed array, as it takes two characters to represent any\n     * given byte. An exception is thrown if the passed char array has an odd\n     * number of elements.\n     * \n     * @param array An array of character bytes containing hexadecimal digits\n     * @return A byte array containing binary data decoded from\n     *         the supplied byte array (representing characters).\n     * @throws DecoderException Thrown if an odd number of characters is supplied\n     *                   to this function\n     * @see #decodeHex(char[])\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.decode(java.lang.Object)",
      "begin_line": 187,
      "end_line": 194,
      "comment": "\n     * Converts a String or an array of character bytes representing hexadecimal values into an\n     * array of bytes of those same values. The returned array will be half the\n     * length of the passed String or array, as it takes two characters to represent any\n     * given byte. An exception is thrown if the passed char array has an odd\n     * number of elements.\n     * \n     * @param object A String or, an array of character bytes containing hexadecimal digits\n     * @return A byte array containing binary data decoded from\n     *         the supplied byte array (representing characters).\n     * @throws DecoderException Thrown if an odd number of characters is supplied\n     *                   to this function or the object is not a String or char[]\n     * @see #decodeHex(char[])\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 193,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.encode(byte[])",
      "begin_line": 206,
      "end_line": 208,
      "comment": "\n     * Converts an array of bytes into an array of bytes for the characters representing the\n     * hexadecimal values of each byte in order. The returned array will be\n     * double the length of the passed array, as it takes two characters to\n     * represent any given byte.\n     *\n     * @param array a byte[] to convert to Hex characters\n     * @return A byte[] containing the bytes of the hexadecimal characters\n     * @see #encodeHex(byte[])\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.encode(java.lang.Object)",
      "begin_line": 221,
      "end_line": 228,
      "comment": "\n     * Converts a String or an array of bytes into an array of characters representing the\n     * hexadecimal values of each byte in order. The returned array will be\n     * double the length of the passed String or array, as it takes two characters to\n     * represent any given byte.\n     *\n     * @param object a String, or byte[] to convert to Hex characters\n     * @return A char[] containing hexadecimal characters\n     * @throws EncoderException Thrown if the given object is not a String or byte[]\n     * @see #encodeHex(byte[])\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 227,col 9)"
      ]
    }
  ]
}