{
  "filepath": "/tmp/Codec-5b/src/java/org/apache/commons/codec/binary/Hex.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Hex",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.codec.BinaryEncoder",
        "org.apache.commons.codec.BinaryDecoder"
      ],
      "begin_line": 36,
      "end_line": 301,
      "comment": "\n * Hex encoder and decoder. The charset used for certain operation can be set, the default is set in\n * {@link #DEFAULT_CHARSET_NAME}\n * \n * @since 1.1\n * @author Apache Software Foundation\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CHARSET_NAME"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n     * Default charset name is {@link CharEncoding#UTF_8}\n     * \n     * @since 1.4\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DIGITS_LOWER"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n     * Used to build output as Hex\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DIGITS_UPPER"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * Used to build output as Hex\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.decodeHex(char[])",
      "begin_line": 66,
      "end_line": 86,
      "comment": "\n     * Converts an array of characters representing hexadecimal values into an array of bytes of those same values. The\n     * returned array will be half the length of the passed array, as it takes two characters to represent any given\n     * byte. An exception is thrown if the passed char array has an odd number of elements.\n     * \n     * @param data\n     *            An array of characters containing hexadecimal digits\n     * @return A byte array containing binary data decoded from the supplied char array.\n     * @throws DecoderException\n     *             Thrown if an odd number or illegal of characters is supplied\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 30)",
        "(line 70,col 9)-(line 72,col 9)",
        "(line 74,col 9)-(line 74,col 40)",
        "(line 77,col 9)-(line 83,col 9)",
        "(line 85,col 9)-(line 85,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.encodeHex(byte[])",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * Converts an array of bytes into an array of characters representing the hexadecimal values of each byte in order.\n     * The returned array will be double the length of the passed array, as it takes two characters to represent any\n     * given byte.\n     * \n     * @param data\n     *            a byte[] to convert to Hex characters\n     * @return A char[] containing hexadecimal characters\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.encodeHex(byte[], boolean)",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\n     * Converts an array of bytes into an array of characters representing the hexadecimal values of each byte in order.\n     * The returned array will be double the length of the passed array, as it takes two characters to represent any\n     * given byte.\n     * \n     * @param data\n     *            a byte[] to convert to Hex characters\n     * @param toLowerCase\n     *            \u003ccode\u003etrue\u003c/code\u003e converts to lowercase, \u003ccode\u003efalse\u003c/code\u003e to uppercase\n     * @return A char[] containing hexadecimal characters\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.encodeHex(byte[], char[])",
      "begin_line": 129,
      "end_line": 138,
      "comment": "\n     * Converts an array of bytes into an array of characters representing the hexadecimal values of each byte in order.\n     * The returned array will be double the length of the passed array, as it takes two characters to represent any\n     * given byte.\n     * \n     * @param data\n     *            a byte[] to convert to Hex characters\n     * @param toDigits\n     *            the output alphabet\n     * @return A char[] containing hexadecimal characters\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 28)",
        "(line 131,col 9)-(line 131,col 38)",
        "(line 133,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 137,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.encodeHexString(byte[])",
      "begin_line": 149,
      "end_line": 151,
      "comment": "\n     * Converts an array of bytes into a String representing the hexadecimal values of each byte in order. The returned\n     * String will be double the length of the passed array, as it takes two characters to represent any given byte.\n     * \n     * @param data\n     *            a byte[] to convert to Hex characters\n     * @return A String containing hexadecimal characters\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.toDigit(char, int)",
      "begin_line": 164,
      "end_line": 170,
      "comment": "\n     * Converts a hexadecimal character to an integer.\n     * \n     * @param ch\n     *            A character to convert to an integer digit\n     * @param index\n     *            The index of the character in the source\n     * @return An integer\n     * @throws DecoderException\n     *             Thrown if ch is an illegal hex character\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 44)",
        "(line 166,col 9)-(line 168,col 9)",
        "(line 169,col 9)-(line 169,col 21)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "charsetName"
      ],
      "begin_line": 172,
      "end_line": 172,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Hex.Hex()",
      "begin_line": 177,
      "end_line": 180,
      "comment": "\n     * Creates a new codec with the default charset name {@link #DEFAULT_CHARSET_NAME}\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Hex.Hex(java.lang.String)",
      "begin_line": 189,
      "end_line": 191,
      "comment": "\n     * Creates a new codec with the given charset name.\n     * \n     * @param csName\n     *            the charset name.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.decode(byte[])",
      "begin_line": 205,
      "end_line": 211,
      "comment": "\n     * Converts an array of character bytes representing hexadecimal values into an array of bytes of those same values.\n     * The returned array will be half the length of the passed array, as it takes two characters to represent any given\n     * byte. An exception is thrown if the passed char array has an odd number of elements.\n     * \n     * @param array\n     *            An array of character bytes containing hexadecimal digits\n     * @return A byte array containing binary data decoded from the supplied byte array (representing characters).\n     * @throws DecoderException\n     *             Thrown if an odd number of characters is supplied to this function\n     * @see #decodeHex(char[])\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 210,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.decode(java.lang.Object)",
      "begin_line": 226,
      "end_line": 233,
      "comment": "\n     * Converts a String or an array of character bytes representing hexadecimal values into an array of bytes of those\n     * same values. The returned array will be half the length of the passed String or array, as it takes two characters\n     * to represent any given byte. An exception is thrown if the passed char array has an odd number of elements.\n     * \n     * @param object\n     *            A String or, an array of character bytes containing hexadecimal digits\n     * @return A byte array containing binary data decoded from the supplied byte array (representing characters).\n     * @throws DecoderException\n     *             Thrown if an odd number of characters is supplied to this function or the object is not a String or\n     *             char[]\n     * @see #decodeHex(char[])\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 232,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.encode(byte[])",
      "begin_line": 252,
      "end_line": 254,
      "comment": "\n     * Converts an array of bytes into an array of bytes for the characters representing the hexadecimal values of each\n     * byte in order. The returned array will be double the length of the passed array, as it takes two characters to\n     * represent any given byte.\n     * \u003cp\u003e\n     * The conversion from hexadecimal characters to the returned bytes is performed with the charset named by\n     * {@link #getCharsetName()}.\n     * \u003c/p\u003e\n     * \n     * @param array\n     *            a byte[] to convert to Hex characters\n     * @return A byte[] containing the bytes of the hexadecimal characters\n     * @throws IllegalStateException\n     *             if the charsetName is invalid. This API throws {@link IllegalStateException} instead of\n     *             {@link UnsupportedEncodingException} for backward compatibility.\n     * @see #encodeHex(byte[])\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.encode(java.lang.Object)",
      "begin_line": 272,
      "end_line": 281,
      "comment": "\n     * Converts a String or an array of bytes into an array of characters representing the hexadecimal values of each\n     * byte in order. The returned array will be double the length of the passed String or array, as it takes two\n     * characters to represent any given byte.\n     * \u003cp\u003e\n     * The conversion from hexadecimal characters to bytes to be encoded to performed with the charset named by\n     * {@link #getCharsetName()}.\n     * \u003c/p\u003e\n     * \n     * @param object\n     *            a String, or byte[] to convert to Hex characters\n     * @return A char[] containing hexadecimal characters\n     * @throws EncoderException\n     *             Thrown if the given object is not a String or byte[]\n     * @see #encodeHex(byte[])\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 280,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.getCharsetName()",
      "begin_line": 289,
      "end_line": 291,
      "comment": "\n     * Gets the charset name.\n     * \n     * @return the charset name.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.toString()",
      "begin_line": 298,
      "end_line": 300,
      "comment": "\n     * Returns a string representation of the object, which includes the charset name.\n     * \n     * @return a string representation of the object.\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 75)"
      ]
    }
  ]
}