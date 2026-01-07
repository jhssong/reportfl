{
  "filepath": "/tmp/Codec-17b/src/main/java/org/apache/commons/codec/binary/Hex.java",
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
      "end_line": 491,
      "comment": "\n * Converts hexadecimal Strings. The charset used for certain operation can be set, the default is set in\n * {@link #DEFAULT_CHARSET_NAME}\n *\n * This class is thread-safe.\n *\n * @since 1.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CHARSET"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": "\n     * Default charset is {@link Charsets#UTF_8}\n     *\n     * @since 1.7\n     "
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
      "signature": "org.apache.commons.codec.binary.Hex.decodeHex(java.lang.String)",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * Converts a String representing hexadecimal values into an array of bytes of those same values. The\n     * returned array will be half the length of the passed String, as it takes two characters to represent any given\n     * byte. An exception is thrown if the passed String has an odd number of elements.\n     *\n     * @param data\n     *            A String containing hexadecimal digits\n     * @return A byte array containing binary data decoded from the supplied char array.\n     * @throws DecoderException\n     *             Thrown if an odd number or illegal of characters is supplied\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.decodeHex(char[])",
      "begin_line": 94,
      "end_line": 114,
      "comment": "\n     * Converts an array of characters representing hexadecimal values into an array of bytes of those same values. The\n     * returned array will be half the length of the passed array, as it takes two characters to represent any given\n     * byte. An exception is thrown if the passed char array has an odd number of elements.\n     *\n     * @param data\n     *            An array of characters containing hexadecimal digits\n     * @return A byte array containing binary data decoded from the supplied char array.\n     * @throws DecoderException\n     *             Thrown if an odd number or illegal of characters is supplied\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 36)",
        "(line 98,col 9)-(line 100,col 9)",
        "(line 102,col 9)-(line 102,col 46)",
        "(line 105,col 9)-(line 111,col 9)",
        "(line 113,col 9)-(line 113,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.encodeHex(byte[])",
      "begin_line": 125,
      "end_line": 127,
      "comment": "\n     * Converts an array of bytes into an array of characters representing the hexadecimal values of each byte in order.\n     * The returned array will be double the length of the passed array, as it takes two characters to represent any\n     * given byte.\n     *\n     * @param data\n     *            a byte[] to convert to Hex characters\n     * @return A char[] containing lower-case hexadecimal characters\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.encodeHex(java.nio.ByteBuffer)",
      "begin_line": 139,
      "end_line": 141,
      "comment": "\n     * Converts a byte buffer into an array of characters representing the hexadecimal values of each byte in order.\n     * The returned array will be double the length of the passed array, as it takes two characters to represent any\n     * given byte.\n     *\n     * @param data\n     *            a byte buffer to convert to Hex characters\n     * @return A char[] containing lower-case hexadecimal characters\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.encodeHex(byte[], boolean)",
      "begin_line": 155,
      "end_line": 157,
      "comment": "\n     * Converts an array of bytes into an array of characters representing the hexadecimal values of each byte in order.\n     * The returned array will be double the length of the passed array, as it takes two characters to represent any\n     * given byte.\n     *\n     * @param data\n     *            a byte[] to convert to Hex characters\n     * @param toLowerCase\n     *            \u003ccode\u003etrue\u003c/code\u003e converts to lowercase, \u003ccode\u003efalse\u003c/code\u003e to uppercase\n     * @return A char[] containing hexadecimal characters in the selected case\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.encodeHex(java.nio.ByteBuffer, boolean)",
      "begin_line": 171,
      "end_line": 173,
      "comment": "\n     * Converts a byte buffer into an array of characters representing the hexadecimal values of each byte in order.\n     * The returned array will be double the length of the passed array, as it takes two characters to represent any\n     * given byte.\n     *\n     * @param data\n     *            a byte buffer to convert to Hex characters\n     * @param toLowerCase\n     *            \u003ccode\u003etrue\u003c/code\u003e converts to lowercase, \u003ccode\u003efalse\u003c/code\u003e to uppercase\n     * @return A char[] containing hexadecimal characters in the selected case\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.encodeHex(byte[], char[])",
      "begin_line": 188,
      "end_line": 197,
      "comment": "\n     * Converts an array of bytes into an array of characters representing the hexadecimal values of each byte in order.\n     * The returned array will be double the length of the passed array, as it takes two characters to represent any\n     * given byte.\n     *\n     * @param data\n     *            a byte[] to convert to Hex characters\n     * @param toDigits\n     *            the output alphabet (must contain at least 16 chars)\n     * @return A char[] containing the appropriate characters from the alphabet\n     *         For best results, this should be either upper- or lower-case hex.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 34)",
        "(line 190,col 9)-(line 190,col 44)",
        "(line 192,col 9)-(line 195,col 9)",
        "(line 196,col 9)-(line 196,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.encodeHex(java.nio.ByteBuffer, char[])",
      "begin_line": 212,
      "end_line": 214,
      "comment": "\n     * Converts a byte buffer into an array of characters representing the hexadecimal values of each byte in order.\n     * The returned array will be double the length of the passed array, as it takes two characters to represent any\n     * given byte.\n     *\n     * @param data\n     *            a byte buffer to convert to Hex characters\n     * @param toDigits\n     *            the output alphabet (must be at least 16 characters)\n     * @return A char[] containing the appropriate characters from the alphabet\n     *         For best results, this should be either upper- or lower-case hex.\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.encodeHexString(byte[])",
      "begin_line": 225,
      "end_line": 227,
      "comment": "\n     * Converts an array of bytes into a String representing the hexadecimal values of each byte in order. The returned\n     * String will be double the length of the passed array, as it takes two characters to represent any given byte.\n     *\n     * @param data\n     *            a byte[] to convert to Hex characters\n     * @return A String containing lower-case hexadecimal characters\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.encodeHexString(byte[], boolean)",
      "begin_line": 240,
      "end_line": 242,
      "comment": "\n     * Converts an array of bytes into a String representing the hexadecimal values of each byte in order. The returned\n     * String will be double the length of the passed array, as it takes two characters to represent any given byte.\n     *\n     * @param data\n     *            a byte[] to convert to Hex characters\n     * @param toLowerCase\n     *            \u003ccode\u003etrue\u003c/code\u003e converts to lowercase, \u003ccode\u003efalse\u003c/code\u003e to uppercase\n     * @return A String containing lower-case hexadecimal characters\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.encodeHexString(java.nio.ByteBuffer)",
      "begin_line": 253,
      "end_line": 255,
      "comment": "\n     * Converts a byte buffer into a String representing the hexadecimal values of each byte in order. The returned\n     * String will be double the length of the passed array, as it takes two characters to represent any given byte.\n     *\n     * @param data\n     *            a byte buffer to convert to Hex characters\n     * @return A String containing lower-case hexadecimal characters\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.encodeHexString(java.nio.ByteBuffer, boolean)",
      "begin_line": 268,
      "end_line": 270,
      "comment": "\n     * Converts a byte buffer into a String representing the hexadecimal values of each byte in order. The returned\n     * String will be double the length of the passed array, as it takes two characters to represent any given byte.\n     *\n     * @param data\n     *            a byte buffer to convert to Hex characters\n     * @param toLowerCase\n     *            \u003ccode\u003etrue\u003c/code\u003e converts to lowercase, \u003ccode\u003efalse\u003c/code\u003e to uppercase\n     * @return A String containing lower-case hexadecimal characters\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.toDigit(char, int)",
      "begin_line": 283,
      "end_line": 289,
      "comment": "\n     * Converts a hexadecimal character to an integer.\n     *\n     * @param ch\n     *            A character to convert to an integer digit\n     * @param index\n     *            The index of the character in the source\n     * @return An integer\n     * @throws DecoderException\n     *             Thrown if ch is an illegal hex character\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 50)",
        "(line 285,col 9)-(line 287,col 9)",
        "(line 288,col 9)-(line 288,col 21)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "charset"
      ],
      "begin_line": 291,
      "end_line": 291,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Hex.Hex()",
      "begin_line": 296,
      "end_line": 299,
      "comment": "\n     * Creates a new codec with the default charset name {@link #DEFAULT_CHARSET}\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Hex.Hex(java.nio.charset.Charset)",
      "begin_line": 308,
      "end_line": 310,
      "comment": "\n     * Creates a new codec with the given Charset.\n     *\n     * @param charset\n     *            the charset.\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Hex.Hex(java.lang.String)",
      "begin_line": 322,
      "end_line": 324,
      "comment": "\n     * Creates a new codec with the given charset name.\n     *\n     * @param charsetName\n     *            the charset name.\n     * @throws java.nio.charset.UnsupportedCharsetException\n     *             If the named charset is unavailable\n     * @since 1.4\n     * @since 1.7 throws UnsupportedCharsetException if the named charset is unavailable\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.decode(byte[])",
      "begin_line": 338,
      "end_line": 341,
      "comment": "\n     * Converts an array of character bytes representing hexadecimal values into an array of bytes of those same values.\n     * The returned array will be half the length of the passed array, as it takes two characters to represent any given\n     * byte. An exception is thrown if the passed char array has an odd number of elements.\n     *\n     * @param array\n     *            An array of character bytes containing hexadecimal digits\n     * @return A byte array containing binary data decoded from the supplied byte array (representing characters).\n     * @throws DecoderException\n     *             Thrown if an odd number of characters is supplied to this function\n     * @see #decodeHex(char[])\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.decode(java.nio.ByteBuffer)",
      "begin_line": 356,
      "end_line": 358,
      "comment": "\n     * Converts a buffer of character bytes representing hexadecimal values into an array of bytes of those same values.\n     * The returned array will be half the length of the passed array, as it takes two characters to represent any given\n     * byte. An exception is thrown if the passed char array has an odd number of elements.\n     *\n     * @param buffer\n     *            An array of character bytes containing hexadecimal digits\n     * @return A byte array containing binary data decoded from the supplied byte array (representing characters).\n     * @throws DecoderException\n     *             Thrown if an odd number of characters is supplied to this function\n     * @see #decodeHex(char[])\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.decode(java.lang.Object)",
      "begin_line": 373,
      "end_line": 388,
      "comment": "\n     * Converts a String or an array of character bytes representing hexadecimal values into an array of bytes of those\n     * same values. The returned array will be half the length of the passed String or array, as it takes two characters\n     * to represent any given byte. An exception is thrown if the passed char array has an odd number of elements.\n     *\n     * @param object\n     *            A String, ByteBuffer, byte[], or an array of character bytes containing hexadecimal digits\n     * @return A byte array containing binary data decoded from the supplied byte array (representing characters).\n     * @throws DecoderException\n     *             Thrown if an odd number of characters is supplied to this function or the object is not a String or\n     *             char[]\n     * @see #decodeHex(char[])\n     ",
      "child_ranges": [
        "(line 375,col 9)-(line 387,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.encode(byte[])",
      "begin_line": 405,
      "end_line": 408,
      "comment": "\n     * Converts an array of bytes into an array of bytes for the characters representing the hexadecimal values of each\n     * byte in order. The returned array will be double the length of the passed array, as it takes two characters to\n     * represent any given byte.\n     * \u003cp\u003e\n     * The conversion from hexadecimal characters to the returned bytes is performed with the charset named by\n     * {@link #getCharset()}.\n     * \u003c/p\u003e\n     *\n     * @param array\n     *            a byte[] to convert to Hex characters\n     * @return A byte[] containing the bytes of the lower-case hexadecimal characters\n     * @since 1.7 No longer throws IllegalStateException if the charsetName is invalid.\n     * @see #encodeHex(byte[])\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 407,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.encode(java.nio.ByteBuffer)",
      "begin_line": 425,
      "end_line": 427,
      "comment": "\n     * Converts byte buffer into an array of bytes for the characters representing the hexadecimal values of each\n     * byte in order. The returned array will be double the length of the passed array, as it takes two characters to\n     * represent any given byte.\n     * \u003cp\u003e\n     * The conversion from hexadecimal characters to the returned bytes is performed with the charset named by\n     * {@link #getCharset()}.\n     * \u003c/p\u003e\n     *\n     * @param array\n     *            a byte buffer to convert to Hex characters\n     * @return A byte[] containing the bytes of the lower-case hexadecimal characters\n     * @see #encodeHex(byte[])\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.encode(java.lang.Object)",
      "begin_line": 445,
      "end_line": 460,
      "comment": "\n     * Converts a String or an array of bytes into an array of characters representing the hexadecimal values of each\n     * byte in order. The returned array will be double the length of the passed String or array, as it takes two\n     * characters to represent any given byte.\n     * \u003cp\u003e\n     * The conversion from hexadecimal characters to bytes to be encoded to performed with the charset named by\n     * {@link #getCharset()}.\n     * \u003c/p\u003e\n     *\n     * @param object\n     *            a String, ByteBuffer, or byte[] to convert to Hex characters\n     * @return A char[] containing lower-case hexadecimal characters\n     * @throws EncoderException\n     *             Thrown if the given object is not a String or byte[]\n     * @see #encodeHex(byte[])\n     ",
      "child_ranges": [
        "(line 447,col 9)-(line 447,col 25)",
        "(line 448,col 9)-(line 458,col 9)",
        "(line 459,col 9)-(line 459,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.getCharset()",
      "begin_line": 468,
      "end_line": 470,
      "comment": "\n     * Gets the charset.\n     *\n     * @return the charset.\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 469,col 9)-(line 469,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.getCharsetName()",
      "begin_line": 478,
      "end_line": 480,
      "comment": "\n     * Gets the charset name.\n     *\n     * @return the charset name.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 479,col 9)-(line 479,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Hex.toString()",
      "begin_line": 487,
      "end_line": 490,
      "comment": "\n     * Returns a string representation of the object, which includes the charset name.\n     *\n     * @return a string representation of the object.\n     ",
      "child_ranges": [
        "(line 489,col 9)-(line 489,col 71)"
      ]
    }
  ]
}