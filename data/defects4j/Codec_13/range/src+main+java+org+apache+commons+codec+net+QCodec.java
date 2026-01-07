{
  "filepath": "/tmp/Codec-13b/src/main/java/org/apache/commons/codec/net/QCodec.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "QCodec",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.codec.net.RFC1522Codec",
        "org.apache.commons.codec.StringEncoder",
        "org.apache.commons.codec.StringDecoder"
      ],
      "begin_line": 52,
      "end_line": 358,
      "comment": "\n * Similar to the Quoted-Printable content-transfer-encoding defined in\n * \u003ca href\u003d\"http://www.ietf.org/rfc/rfc1521.txt\"\u003eRFC 1521\u003c/a\u003e and designed to allow text containing mostly ASCII\n * characters to be decipherable on an ASCII terminal without decoding.\n * \u003cp\u003e\n * \u003ca href\u003d\"http://www.ietf.org/rfc/rfc1522.txt\"\u003eRFC 1522\u003c/a\u003e describes techniques to allow the encoding of non-ASCII\n * text in various portions of a RFC 822 [2] message header, in a manner which is unlikely to confuse existing message\n * handling software.\n * \u003cp\u003e\n * This class is conditionally thread-safe.\n * The instance field {@link #encodeBlanks} is mutable {@link #setEncodeBlanks(boolean)}\n * but is not volatile, and accesses are not synchronised.\n * If an instance of the class is shared between threads, the caller needs to ensure that suitable synchronisation\n * is used to ensure safe publication of the value between threads, and must not invoke\n * {@link #setEncodeBlanks(boolean)} after initial setup.\n *\n * @see \u003ca href\u003d\"http://www.ietf.org/rfc/rfc1522.txt\"\u003eMIME (Multipurpose Internet Mail Extensions) Part Two: Message\n *          Header Extensions for Non-ASCII Text\u003c/a\u003e\n *\n * @since 1.3\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "charset"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n     * The default charset used for string decoding and encoding.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PRINTABLE_CHARS"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n     * BitSet of printable characters as defined in RFC 1522.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "BLANK"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UNDERSCORE"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "encodeBlanks"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.net.QCodec.QCodec()",
      "begin_line": 115,
      "end_line": 117,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.net.QCodec.QCodec(java.nio.charset.Charset)",
      "begin_line": 128,
      "end_line": 131,
      "comment": "\n     * Constructor which allows for the selection of a default charset.\n     *\n     * @param charset\n     *            the default string charset to use.\n     *\n     * @see \u003ca href\u003d\"http://download.oracle.com/javase/6/docs/api/java/nio/charset/Charset.html\"\u003eStandard charsets\u003c/a\u003e\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 16)",
        "(line 130,col 9)-(line 130,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.net.QCodec.QCodec(java.lang.String)",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\n     * Constructor which allows for the selection of a default charset.\n     *\n     * @param charsetName\n     *            the charset to use.\n     * @throws java.nio.charset.UnsupportedCharsetException\n     *             If the named charset is unavailable\n     * @since 1.7 throws UnsupportedCharsetException if the named charset is unavailable\n     * @see \u003ca href\u003d\"http://download.oracle.com/javase/6/docs/api/java/nio/charset/Charset.html\"\u003eStandard charsets\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodec.getEncoding()",
      "begin_line": 147,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodec.doEncoding(byte[])",
      "begin_line": 152,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 154,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 157,col 95)",
        "(line 158,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 165,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodec.doDecoding(byte[])",
      "begin_line": 168,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 170,col 9)-(line 172,col 9)",
        "(line 173,col 9)-(line 173,col 39)",
        "(line 174,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 191,col 9)",
        "(line 192,col 9)-(line 192,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodec.encode(java.lang.String, java.nio.charset.Charset)",
      "begin_line": 207,
      "end_line": 212,
      "comment": "\n     * Encodes a string into its quoted-printable form using the specified charset. Unsafe characters are escaped.\n     *\n     * @param str\n     *            string to convert to quoted-printable form\n     * @param charset\n     *            the charset for str\n     * @return quoted-printable string\n     * @throws EncoderException\n     *             thrown if a failure condition is encountered during the encoding process.\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 210,col 9)",
        "(line 211,col 9)-(line 211,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodec.encode(java.lang.String, java.lang.String)",
      "begin_line": 225,
      "end_line": 234,
      "comment": "\n     * Encodes a string into its quoted-printable form using the specified charset. Unsafe characters are escaped.\n     *\n     * @param str\n     *            string to convert to quoted-printable form\n     * @param charset\n     *            the charset for str\n     * @return quoted-printable string\n     * @throws EncoderException\n     *             thrown if a failure condition is encountered during the encoding process.\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 228,col 9)",
        "(line 229,col 9)-(line 233,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodec.encode(java.lang.String)",
      "begin_line": 245,
      "end_line": 251,
      "comment": "\n     * Encodes a string into its quoted-printable form using the default charset. Unsafe characters are escaped.\n     *\n     * @param str\n     *            string to convert to quoted-printable form\n     * @return quoted-printable string\n     * @throws EncoderException\n     *             thrown if a failure condition is encountered during the encoding process.\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 249,col 9)",
        "(line 250,col 9)-(line 250,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodec.decode(java.lang.String)",
      "begin_line": 263,
      "end_line": 273,
      "comment": "\n     * Decodes a quoted-printable string into its original form. Escaped characters are converted back to their original\n     * representation.\n     *\n     * @param str\n     *            quoted-printable string to convert into its original form\n     * @return original string\n     * @throws DecoderException\n     *             A decoder exception is thrown if a failure condition is encountered during the decode process.\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 267,col 9)",
        "(line 268,col 9)-(line 272,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodec.encode(java.lang.Object)",
      "begin_line": 284,
      "end_line": 295,
      "comment": "\n     * Encodes an object into its quoted-printable form using the default charset. Unsafe characters are escaped.\n     *\n     * @param obj\n     *            object to convert to quoted-printable form\n     * @return quoted-printable object\n     * @throws EncoderException\n     *             thrown if a failure condition is encountered during the encoding process.\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 294,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodec.decode(java.lang.Object)",
      "begin_line": 308,
      "end_line": 319,
      "comment": "\n     * Decodes a quoted-printable object into its original form. Escaped characters are converted back to their original\n     * representation.\n     *\n     * @param obj\n     *            quoted-printable object to convert into its original form\n     * @return original object\n     * @throws DecoderException\n     *             Thrown if the argument is not a \u003ccode\u003eString\u003c/code\u003e. Thrown if a failure condition is encountered\n     *             during the decode process.\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 318,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodec.getCharset()",
      "begin_line": 327,
      "end_line": 329,
      "comment": "\n     * Gets the default charset name used for string decoding and encoding.\n     *\n     * @return the default charset name\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodec.getDefaultCharset()",
      "begin_line": 336,
      "end_line": 338,
      "comment": "\n     * Gets the default charset name used for string decoding and encoding.\n     *\n     * @return the default charset name\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodec.isEncodeBlanks()",
      "begin_line": 345,
      "end_line": 347,
      "comment": "\n     * Tests if optional transformation of SPACE characters is to be used\n     *\n     * @return {@code true} if SPACE characters are to be transformed, {@code false} otherwise\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodec.setEncodeBlanks(boolean)",
      "begin_line": 355,
      "end_line": 357,
      "comment": "\n     * Defines whether optional transformation of SPACE characters is to be used\n     *\n     * @param b\n     *            {@code true} if SPACE characters are to be transformed, {@code false} otherwise\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 30)"
      ]
    }
  ]
}