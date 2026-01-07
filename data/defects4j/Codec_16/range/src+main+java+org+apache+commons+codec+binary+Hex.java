{
  "filepath": "/tmp/Codec-16b/src/main/java/org/apache/commons/codec/binary/Hex.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Hex",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.codec.BinaryEncoder",
        "org.apache.commons.codec.BinaryDecoder"
      ],
      "begin_line": 39,
      "end_line": 443,
      "comment": "\n * Converts hexadecimal Strings. The charset used for certain operation can be set, the default is set in\n * {@link #DEFAULT_CHARSET_NAME}\n *\n * This class is thread-safe.\n *\n * @since 1.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CHARSET"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": "\n     * Default charset name is {@link Charsets#UTF_8}\n     *\n     * @since 1.7\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CHARSET_NAME"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * Default charset name is {@link CharEncoding#UTF_8}\n     *\n     * @since 1.4\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DIGITS_LOWER"
      ],
      "begin_line": 58,
      "end_line": 59,
      "comment": "\n     * Used to build output as Hex\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DIGITS_UPPER"
      ],
      "begin_line": 64,
      "end_line": 65,
      "comment": "\n     * Used to build output as Hex\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.decodeHex(char[])",
      "begin_line": 78,
      "end_line": 98,
      "comment": "\n     * Converts an array of characters representing hexadecimal values into an array of bytes of those same values. The\n     * returned array will be half the length of the passed array, as it takes two characters to represent any given\n     * byte. An exception is thrown if the passed char array has an odd number of elements.\n     *\n     * @param data\n     *            An array of characters containing hexadecimal digits\n     * @return A byte array containing binary data decoded from the supplied char array.\n     * @throws DecoderException\n     *             Thrown if an odd number or illegal of characters is supplied\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 36)",
        "(line 82,col 9)-(line 84,col 9)",
        "(line 86,col 9)-(line 86,col 46)",
        "(line 89,col 9)-(line 95,col 9)",
        "(line 97,col 9)-(line 97,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.encodeHex(byte[])",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n     * Converts an array of bytes into an array of characters representing the hexadecimal values of each byte in order.\n     * The returned array will be double the length of the passed array, as it takes two characters to represent any\n     * given byte.\n     *\n     * @param data\n     *            a byte[] to convert to Hex characters\n     * @return A char[] containing hexadecimal characters\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.encodeHex(java.nio.ByteBuffer)",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\n     * Converts a byte buffer into an array of characters representing the hexadecimal values of each byte in order.\n     * The returned array will be double the length of the passed array, as it takes two characters to represent any\n     * given byte.\n     *\n     * @param data\n     *            a byte buffer to convert to Hex characters\n     * @return A char[] containing hexadecimal characters\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.encodeHex(byte[], boolean)",
      "begin_line": 139,
      "end_line": 141,
      "comment": "\n     * Converts an array of bytes into an array of characters representing the hexadecimal values of each byte in order.\n     * The returned array will be double the length of the passed array, as it takes two characters to represent any\n     * given byte.\n     *\n     * @param data\n     *            a byte[] to convert to Hex characters\n     * @param toLowerCase\n     *            \u003ccode\u003etrue\u003c/code\u003e converts to lowercase, \u003ccode\u003efalse\u003c/code\u003e to uppercase\n     * @return A char[] containing hexadecimal characters\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.encodeHex(java.nio.ByteBuffer, boolean)",
      "begin_line": 155,
      "end_line": 157,
      "comment": "\n     * Converts a byte buffer into an array of characters representing the hexadecimal values of each byte in order.\n     * The returned array will be double the length of the passed array, as it takes two characters to represent any\n     * given byte.\n     *\n     * @param data\n     *            a byte buffer to convert to Hex characters\n     * @param toLowerCase\n     *            \u003ccode\u003etrue\u003c/code\u003e converts to lowercase, \u003ccode\u003efalse\u003c/code\u003e to uppercase\n     * @return A char[] containing hexadecimal characters\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.encodeHex(byte[], char[])",
      "begin_line": 171,
      "end_line": 180,
      "comment": "\n     * Converts an array of bytes into an array of characters representing the hexadecimal values of each byte in order.\n     * The returned array will be double the length of the passed array, as it takes two characters to represent any\n     * given byte.\n     *\n     * @param data\n     *            a byte[] to convert to Hex characters\n     * @param toDigits\n     *            the output alphabet\n     * @return A char[] containing hexadecimal characters\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 34)",
        "(line 173,col 9)-(line 173,col 44)",
        "(line 175,col 9)-(line 178,col 9)",
        "(line 179,col 9)-(line 179,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.encodeHex(java.nio.ByteBuffer, char[])",
      "begin_line": 194,
      "end_line": 196,
      "comment": "\n     * Converts a byte buffer into an array of characters representing the hexadecimal values of each byte in order.\n     * The returned array will be double the length of the passed array, as it takes two characters to represent any\n     * given byte.\n     *\n     * @param data\n     *            a byte buffer to convert to Hex characters\n     * @param toDigits\n     *            the output alphabet\n     * @return A char[] containing hexadecimal characters\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.encodeHexString(byte[])",
      "begin_line": 207,
      "end_line": 209,
      "comment": "\n     * Converts an array of bytes into a String representing the hexadecimal values of each byte in order. The returned\n     * String will be double the length of the passed array, as it takes two characters to represent any given byte.\n     *\n     * @param data\n     *            a byte[] to convert to Hex characters\n     * @return A String containing hexadecimal characters\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.encodeHexString(java.nio.ByteBuffer)",
      "begin_line": 220,
      "end_line": 222,
      "comment": "\n     * Converts a byte buffer into a String representing the hexadecimal values of each byte in order. The returned\n     * String will be double the length of the passed array, as it takes two characters to represent any given byte.\n     *\n     * @param data\n     *            a byte buffer to convert to Hex characters\n     * @return A String containing hexadecimal characters\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.toDigit(char, int)",
      "begin_line": 235,
      "end_line": 241,
      "comment": "\n     * Converts a hexadecimal character to an integer.\n     *\n     * @param ch\n     *            A character to convert to an integer digit\n     * @param index\n     *            The index of the character in the source\n     * @return An integer\n     * @throws DecoderException\n     *             Thrown if ch is an illegal hex character\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 50)",
        "(line 237,col 9)-(line 239,col 9)",
        "(line 240,col 9)-(line 240,col 21)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "charset"
      ],
      "begin_line": 243,
      "end_line": 243,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Hex.Hex()",
      "begin_line": 248,
      "end_line": 251,
      "comment": "\n     * Creates a new codec with the default charset name {@link #DEFAULT_CHARSET}\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Hex.Hex(java.nio.charset.Charset)",
      "begin_line": 260,
      "end_line": 262,
      "comment": "\n     * Creates a new codec with the given Charset.\n     *\n     * @param charset\n     *            the charset.\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Hex.Hex(java.lang.String)",
      "begin_line": 274,
      "end_line": 276,
      "comment": "\n     * Creates a new codec with the given charset name.\n     *\n     * @param charsetName\n     *            the charset name.\n     * @throws java.nio.charset.UnsupportedCharsetException\n     *             If the named charset is unavailable\n     * @since 1.4\n     * @since 1.7 throws UnsupportedCharsetException if the named charset is unavailable\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.decode(byte[])",
      "begin_line": 290,
      "end_line": 293,
      "comment": "\n     * Converts an array of character bytes representing hexadecimal values into an array of bytes of those same values.\n     * The returned array will be half the length of the passed array, as it takes two characters to represent any given\n     * byte. An exception is thrown if the passed char array has an odd number of elements.\n     *\n     * @param array\n     *            An array of character bytes containing hexadecimal digits\n     * @return A byte array containing binary data decoded from the supplied byte array (representing characters).\n     * @throws DecoderException\n     *             Thrown if an odd number of characters is supplied to this function\n     * @see #decodeHex(char[])\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.decode(java.nio.ByteBuffer)",
      "begin_line": 308,
      "end_line": 310,
      "comment": "\n     * Converts a buffer of character bytes representing hexadecimal values into an array of bytes of those same values.\n     * The returned array will be half the length of the passed array, as it takes two characters to represent any given\n     * byte. An exception is thrown if the passed char array has an odd number of elements.\n     *\n     * @param buffer\n     *            An array of character bytes containing hexadecimal digits\n     * @return A byte array containing binary data decoded from the supplied byte array (representing characters).\n     * @throws DecoderException\n     *             Thrown if an odd number of characters is supplied to this function\n     * @see #decodeHex(char[])\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.decode(java.lang.Object)",
      "begin_line": 325,
      "end_line": 340,
      "comment": "\n     * Converts a String or an array of character bytes representing hexadecimal values into an array of bytes of those\n     * same values. The returned array will be half the length of the passed String or array, as it takes two characters\n     * to represent any given byte. An exception is thrown if the passed char array has an odd number of elements.\n     *\n     * @param object\n     *            A String, ByteBuffer, byte[], or an array of character bytes containing hexadecimal digits\n     * @return A byte array containing binary data decoded from the supplied byte array (representing characters).\n     * @throws DecoderException\n     *             Thrown if an odd number of characters is supplied to this function or the object is not a String or\n     *             char[]\n     * @see #decodeHex(char[])\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 339,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.encode(byte[])",
      "begin_line": 357,
      "end_line": 360,
      "comment": "\n     * Converts an array of bytes into an array of bytes for the characters representing the hexadecimal values of each\n     * byte in order. The returned array will be double the length of the passed array, as it takes two characters to\n     * represent any given byte.\n     * \u003cp\u003e\n     * The conversion from hexadecimal characters to the returned bytes is performed with the charset named by\n     * {@link #getCharset()}.\n     * \u003c/p\u003e\n     *\n     * @param array\n     *            a byte[] to convert to Hex characters\n     * @return A byte[] containing the bytes of the hexadecimal characters\n     * @since 1.7 No longer throws IllegalStateException if the charsetName is invalid.\n     * @see #encodeHex(byte[])\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.encode(java.nio.ByteBuffer)",
      "begin_line": 377,
      "end_line": 379,
      "comment": "\n     * Converts byte buffer into an array of bytes for the characters representing the hexadecimal values of each\n     * byte in order. The returned array will be double the length of the passed array, as it takes two characters to\n     * represent any given byte.\n     * \u003cp\u003e\n     * The conversion from hexadecimal characters to the returned bytes is performed with the charset named by\n     * {@link #getCharset()}.\n     * \u003c/p\u003e\n     *\n     * @param array\n     *            a byte buffer to convert to Hex characters\n     * @return A byte[] containing the bytes of the hexadecimal characters\n     * @see #encodeHex(byte[])\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 378,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.encode(java.lang.Object)",
      "begin_line": 397,
      "end_line": 412,
      "comment": "\n     * Converts a String or an array of bytes into an array of characters representing the hexadecimal values of each\n     * byte in order. The returned array will be double the length of the passed String or array, as it takes two\n     * characters to represent any given byte.\n     * \u003cp\u003e\n     * The conversion from hexadecimal characters to bytes to be encoded to performed with the charset named by\n     * {@link #getCharset()}.\n     * \u003c/p\u003e\n     *\n     * @param object\n     *            a String, ByteBuffer, or byte[] to convert to Hex characters\n     * @return A char[] containing hexadecimal characters\n     * @throws EncoderException\n     *             Thrown if the given object is not a String or byte[]\n     * @see #encodeHex(byte[])\n     ",
      "child_ranges": [
        "(line 399,col 9)-(line 399,col 25)",
        "(line 400,col 9)-(line 410,col 9)",
        "(line 411,col 9)-(line 411,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.getCharset()",
      "begin_line": 420,
      "end_line": 422,
      "comment": "\n     * Gets the charset.\n     *\n     * @return the charset.\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.getCharsetName()",
      "begin_line": 430,
      "end_line": 432,
      "comment": "\n     * Gets the charset name.\n     *\n     * @return the charset name.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 431,col 9)-(line 431,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.toString()",
      "begin_line": 439,
      "end_line": 442,
      "comment": "\n     * Returns a string representation of the object, which includes the charset name.\n     *\n     * @return a string representation of the object.\n     ",
      "child_ranges": [
        "(line 441,col 9)-(line 441,col 71)"
      ]
    }
  ]
}