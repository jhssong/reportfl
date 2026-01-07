{
  "filepath": "/tmp/Codec-13b/src/main/java/org/apache/commons/codec/binary/Hex.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Hex",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.codec.BinaryEncoder",
        "org.apache.commons.codec.BinaryDecoder"
      ],
      "begin_line": 38,
      "end_line": 334,
      "comment": "\n * Converts hexadecimal Strings. The charset used for certain operation can be set, the default is set in\n * {@link #DEFAULT_CHARSET_NAME}\n *\n * This class is thread-safe.\n *\n * @since 1.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CHARSET"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * Default charset name is {@link Charsets#UTF_8}\n     *\n     * @since 1.7\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CHARSET_NAME"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * Default charset name is {@link CharEncoding#UTF_8}\n     *\n     * @since 1.4\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DIGITS_LOWER"
      ],
      "begin_line": 57,
      "end_line": 58,
      "comment": "\n     * Used to build output as Hex\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DIGITS_UPPER"
      ],
      "begin_line": 63,
      "end_line": 64,
      "comment": "\n     * Used to build output as Hex\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.decodeHex(char[])",
      "begin_line": 77,
      "end_line": 97,
      "comment": "\n     * Converts an array of characters representing hexadecimal values into an array of bytes of those same values. The\n     * returned array will be half the length of the passed array, as it takes two characters to represent any given\n     * byte. An exception is thrown if the passed char array has an odd number of elements.\n     *\n     * @param data\n     *            An array of characters containing hexadecimal digits\n     * @return A byte array containing binary data decoded from the supplied char array.\n     * @throws DecoderException\n     *             Thrown if an odd number or illegal of characters is supplied\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 36)",
        "(line 81,col 9)-(line 83,col 9)",
        "(line 85,col 9)-(line 85,col 46)",
        "(line 88,col 9)-(line 94,col 9)",
        "(line 96,col 9)-(line 96,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.encodeHex(byte[])",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\n     * Converts an array of bytes into an array of characters representing the hexadecimal values of each byte in order.\n     * The returned array will be double the length of the passed array, as it takes two characters to represent any\n     * given byte.\n     *\n     * @param data\n     *            a byte[] to convert to Hex characters\n     * @return A char[] containing hexadecimal characters\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.encodeHex(byte[], boolean)",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\n     * Converts an array of bytes into an array of characters representing the hexadecimal values of each byte in order.\n     * The returned array will be double the length of the passed array, as it takes two characters to represent any\n     * given byte.\n     *\n     * @param data\n     *            a byte[] to convert to Hex characters\n     * @param toLowerCase\n     *            {@code true} converts to lowercase, {@code false} to uppercase\n     * @return A char[] containing hexadecimal characters\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.encodeHex(byte[], char[])",
      "begin_line": 140,
      "end_line": 149,
      "comment": "\n     * Converts an array of bytes into an array of characters representing the hexadecimal values of each byte in order.\n     * The returned array will be double the length of the passed array, as it takes two characters to represent any\n     * given byte.\n     *\n     * @param data\n     *            a byte[] to convert to Hex characters\n     * @param toDigits\n     *            the output alphabet\n     * @return A char[] containing hexadecimal characters\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 34)",
        "(line 142,col 9)-(line 142,col 44)",
        "(line 144,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 148,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.encodeHexString(byte[])",
      "begin_line": 160,
      "end_line": 162,
      "comment": "\n     * Converts an array of bytes into a String representing the hexadecimal values of each byte in order. The returned\n     * String will be double the length of the passed array, as it takes two characters to represent any given byte.\n     *\n     * @param data\n     *            a byte[] to convert to Hex characters\n     * @return A String containing hexadecimal characters\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.toDigit(char, int)",
      "begin_line": 175,
      "end_line": 181,
      "comment": "\n     * Converts a hexadecimal character to an integer.\n     *\n     * @param ch\n     *            A character to convert to an integer digit\n     * @param index\n     *            The index of the character in the source\n     * @return An integer\n     * @throws DecoderException\n     *             Thrown if ch is an illegal hex character\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 50)",
        "(line 177,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 180,col 21)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "charset"
      ],
      "begin_line": 183,
      "end_line": 183,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Hex.Hex()",
      "begin_line": 188,
      "end_line": 191,
      "comment": "\n     * Creates a new codec with the default charset name {@link #DEFAULT_CHARSET}\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Hex.Hex(java.nio.charset.Charset)",
      "begin_line": 200,
      "end_line": 202,
      "comment": "\n     * Creates a new codec with the given Charset.\n     *\n     * @param charset\n     *            the charset.\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Hex.Hex(java.lang.String)",
      "begin_line": 214,
      "end_line": 216,
      "comment": "\n     * Creates a new codec with the given charset name.\n     *\n     * @param charsetName\n     *            the charset name.\n     * @throws java.nio.charset.UnsupportedCharsetException\n     *             If the named charset is unavailable\n     * @since 1.4\n     * @since 1.7 throws UnsupportedCharsetException if the named charset is unavailable\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.decode(byte[])",
      "begin_line": 230,
      "end_line": 233,
      "comment": "\n     * Converts an array of character bytes representing hexadecimal values into an array of bytes of those same values.\n     * The returned array will be half the length of the passed array, as it takes two characters to represent any given\n     * byte. An exception is thrown if the passed char array has an odd number of elements.\n     *\n     * @param array\n     *            An array of character bytes containing hexadecimal digits\n     * @return A byte array containing binary data decoded from the supplied byte array (representing characters).\n     * @throws DecoderException\n     *             Thrown if an odd number of characters is supplied to this function\n     * @see #decodeHex(char[])\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.decode(java.lang.Object)",
      "begin_line": 248,
      "end_line": 256,
      "comment": "\n     * Converts a String or an array of character bytes representing hexadecimal values into an array of bytes of those\n     * same values. The returned array will be half the length of the passed String or array, as it takes two characters\n     * to represent any given byte. An exception is thrown if the passed char array has an odd number of elements.\n     *\n     * @param object\n     *            A String or, an array of character bytes containing hexadecimal digits\n     * @return A byte array containing binary data decoded from the supplied byte array (representing characters).\n     * @throws DecoderException\n     *             Thrown if an odd number of characters is supplied to this function or the object is not a String or\n     *             char[]\n     * @see #decodeHex(char[])\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 255,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.encode(byte[])",
      "begin_line": 273,
      "end_line": 276,
      "comment": "\n     * Converts an array of bytes into an array of bytes for the characters representing the hexadecimal values of each\n     * byte in order. The returned array will be double the length of the passed array, as it takes two characters to\n     * represent any given byte.\n     * \u003cp\u003e\n     * The conversion from hexadecimal characters to the returned bytes is performed with the charset named by\n     * {@link #getCharset()}.\n     * \u003c/p\u003e\n     *\n     * @param array\n     *            a byte[] to convert to Hex characters\n     * @return A byte[] containing the bytes of the hexadecimal characters\n     * @since 1.7 No longer throws IllegalStateException if the charsetName is invalid.\n     * @see #encodeHex(byte[])\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.encode(java.lang.Object)",
      "begin_line": 294,
      "end_line": 303,
      "comment": "\n     * Converts a String or an array of bytes into an array of characters representing the hexadecimal values of each\n     * byte in order. The returned array will be double the length of the passed String or array, as it takes two\n     * characters to represent any given byte.\n     * \u003cp\u003e\n     * The conversion from hexadecimal characters to bytes to be encoded to performed with the charset named by\n     * {@link #getCharset()}.\n     * \u003c/p\u003e\n     *\n     * @param object\n     *            a String, or byte[] to convert to Hex characters\n     * @return A char[] containing hexadecimal characters\n     * @throws EncoderException\n     *             Thrown if the given object is not a String or byte[]\n     * @see #encodeHex(byte[])\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 302,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.getCharset()",
      "begin_line": 311,
      "end_line": 313,
      "comment": "\n     * Gets the charset.\n     *\n     * @return the charset.\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.getCharsetName()",
      "begin_line": 321,
      "end_line": 323,
      "comment": "\n     * Gets the charset name.\n     *\n     * @return the charset name.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.toString()",
      "begin_line": 330,
      "end_line": 333,
      "comment": "\n     * Returns a string representation of the object, which includes the charset name.\n     *\n     * @return a string representation of the object.\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 71)"
      ]
    }
  ]
}