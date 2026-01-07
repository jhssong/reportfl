{
  "filepath": "/tmp/Codec-13b/src/main/java/org/apache/commons/codec/net/QuotedPrintableCodec.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "QuotedPrintableCodec",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.codec.BinaryEncoder",
        "org.apache.commons.codec.BinaryDecoder",
        "org.apache.commons.codec.StringEncoder",
        "org.apache.commons.codec.StringDecoder"
      ],
      "begin_line": 61,
      "end_line": 432,
      "comment": "\n * Codec for the Quoted-Printable section of \u003ca href\u003d\"http://www.ietf.org/rfc/rfc1521.txt\"\u003eRFC 1521\u003c/a\u003e.\n * \u003cp\u003e\n * The Quoted-Printable encoding is intended to represent data that largely consists of octets that correspond to\n * printable characters in the ASCII character set. It encodes the data in such a way that the resulting octets are\n * unlikely to be modified by mail transport. If the data being encoded are mostly ASCII text, the encoded form of the\n * data remains largely recognizable by humans. A body which is entirely ASCII may also be encoded in Quoted-Printable\n * to ensure the integrity of the data should the message pass through a character- translating, and/or line-wrapping\n * gateway.\n * \u003cp\u003e\n * Note:\n * \u003cp\u003e\n * Rules #3, #4, and #5 of the quoted-printable spec are not implemented yet because the complete quoted-printable spec\n * does not lend itself well into the byte[] oriented codec framework. Complete the codec once the streamable codec\n * framework is ready. The motivation behind providing the codec in a partial form is that it can already come in handy\n * for those applications that do not require quoted-printable line formatting (rules #3, #4, #5), for instance Q codec.\n * \u003cp\u003e\n * This class is immutable and thread-safe.\n *\n * @see \u003ca href\u003d\"http://www.ietf.org/rfc/rfc1521.txt\"\u003e RFC 1521 MIME (Multipurpose Internet Mail Extensions) Part One:\n *          Mechanisms for Specifying and Describing the Format of Internet Message Bodies \u003c/a\u003e\n *\n * @since 1.3\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "charset"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": "\n     * The default charset used for string decoding and encoding.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PRINTABLE_CHARS"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": "\n     * BitSet of printable characters as defined in RFC 1521.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ESCAPE_CHAR"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TAB"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SPACE"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.QuotedPrintableCodec()",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     * Default constructor, assumes default charset of {@link Charsets#UTF_8}\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.QuotedPrintableCodec(java.nio.charset.Charset)",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\n     * Constructor which allows for the selection of a default charset.\n     *\n     * @param charset\n     *            the default string charset to use.\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.QuotedPrintableCodec(java.lang.String)",
      "begin_line": 123,
      "end_line": 126,
      "comment": "\n     * Constructor which allows for the selection of a default charset.\n     *\n     * @param charsetName\n     *            the default string charset to use.\n     * @throws UnsupportedCharsetException\n     *             If no support for the named charset is available\n     *             in this instance of the Java virtual machine\n     * @throws IllegalArgumentException\n     *             If the given charsetName is null\n     * @throws IllegalCharsetNameException\n     *             If the given charset name is illegal\n     *\n     * @since 1.7 throws UnsupportedCharsetException if the named charset is unavailable\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(int, java.io.ByteArrayOutputStream)",
      "begin_line": 136,
      "end_line": 142,
      "comment": "\n     * Encodes byte into its quoted-printable representation.\n     *\n     * @param b\n     *            byte to encode\n     * @param buffer\n     *            the buffer to write to\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 34)",
        "(line 138,col 9)-(line 138,col 88)",
        "(line 139,col 9)-(line 139,col 81)",
        "(line 140,col 9)-(line 140,col 27)",
        "(line 141,col 9)-(line 141,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(java.util.BitSet, byte[])",
      "begin_line": 156,
      "end_line": 176,
      "comment": "\n     * Encodes an array of bytes into an array of quoted-printable 7-bit characters. Unsafe characters are escaped.\n     * \u003cp\u003e\n     * This function implements a subset of quoted-printable encoding specification (rule #1 and rule #2) as defined in\n     * RFC 1521 and is suitable for encoding binary data and unformatted text.\n     *\n     * @param printable\n     *            bitset of characters deemed quoted-printable\n     * @param bytes\n     *            array of bytes to be encoded\n     * @return array of bytes containing quoted-printable data\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 162,col 9)",
        "(line 163,col 9)-(line 163,col 73)",
        "(line 164,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 175,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byte[])",
      "begin_line": 191,
      "end_line": 211,
      "comment": "\n     * Decodes an array quoted-printable characters into an array of original bytes. Escaped characters are converted\n     * back to their original representation.\n     * \u003cp\u003e\n     * This function implements a subset of quoted-printable encoding specification (rule #1 and rule #2) as defined in\n     * RFC 1521.\n     *\n     * @param bytes\n     *            array of quoted-printable characters\n     * @return array of original bytes\n     * @throws DecoderException\n     *             Thrown if quoted-printable decoding is unsuccessful\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 194,col 9)",
        "(line 195,col 9)-(line 195,col 73)",
        "(line 196,col 9)-(line 209,col 9)",
        "(line 210,col 9)-(line 210,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.encode(byte[])",
      "begin_line": 223,
      "end_line": 226,
      "comment": "\n     * Encodes an array of bytes into an array of quoted-printable 7-bit characters. Unsafe characters are escaped.\n     * \u003cp\u003e\n     * This function implements a subset of quoted-printable encoding specification (rule #1 and rule #2) as defined in\n     * RFC 1521 and is suitable for encoding binary data and unformatted text.\n     *\n     * @param bytes\n     *            array of bytes to be encoded\n     * @return array of bytes containing quoted-printable data\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.decode(byte[])",
      "begin_line": 241,
      "end_line": 244,
      "comment": "\n     * Decodes an array of quoted-printable characters into an array of original bytes. Escaped characters are converted\n     * back to their original representation.\n     * \u003cp\u003e\n     * This function implements a subset of quoted-printable encoding specification (rule #1 and rule #2) as defined in\n     * RFC 1521.\n     *\n     * @param bytes\n     *            array of quoted-printable characters\n     * @return array of original bytes\n     * @throws DecoderException\n     *             Thrown if quoted-printable decoding is unsuccessful\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.encode(java.lang.String)",
      "begin_line": 260,
      "end_line": 263,
      "comment": "\n     * Encodes a string into its quoted-printable form using the default string charset. Unsafe characters are escaped.\n     * \u003cp\u003e\n     * This function implements a subset of quoted-printable encoding specification (rule #1 and rule #2) as defined in\n     * RFC 1521 and is suitable for encoding binary data.\n     *\n     * @param str\n     *            string to convert to quoted-printable form\n     * @return quoted-printable string\n     * @throws EncoderException\n     *             Thrown if quoted-printable encoding is unsuccessful\n     *\n     * @see #getCharset()\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.decode(java.lang.String, java.nio.charset.Charset)",
      "begin_line": 278,
      "end_line": 283,
      "comment": "\n     * Decodes a quoted-printable string into its original form using the specified string charset. Escaped characters\n     * are converted back to their original representation.\n     *\n     * @param str\n     *            quoted-printable string to convert into its original form\n     * @param charset\n     *            the original string charset\n     * @return original string\n     * @throws DecoderException\n     *             Thrown if quoted-printable decoding is unsuccessful\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 281,col 9)",
        "(line 282,col 9)-(line 282,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.decode(java.lang.String, java.lang.String)",
      "begin_line": 299,
      "end_line": 304,
      "comment": "\n     * Decodes a quoted-printable string into its original form using the specified string charset. Escaped characters\n     * are converted back to their original representation.\n     *\n     * @param str\n     *            quoted-printable string to convert into its original form\n     * @param charset\n     *            the original string charset\n     * @return original string\n     * @throws DecoderException\n     *             Thrown if quoted-printable decoding is unsuccessful\n     * @throws UnsupportedEncodingException\n     *             Thrown if charset is not supported\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 302,col 9)",
        "(line 303,col 9)-(line 303,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.decode(java.lang.String)",
      "begin_line": 317,
      "end_line": 320,
      "comment": "\n     * Decodes a quoted-printable string into its original form using the default string charset. Escaped characters are\n     * converted back to their original representation.\n     *\n     * @param str\n     *            quoted-printable string to convert into its original form\n     * @return original string\n     * @throws DecoderException\n     *             Thrown if quoted-printable decoding is unsuccessful. Thrown if charset is not supported.\n     * @see #getCharset()\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.encode(java.lang.Object)",
      "begin_line": 332,
      "end_line": 345,
      "comment": "\n     * Encodes an object into its quoted-printable safe form. Unsafe characters are escaped.\n     *\n     * @param obj\n     *            string to convert to a quoted-printable form\n     * @return quoted-printable object\n     * @throws EncoderException\n     *             Thrown if quoted-printable encoding is not applicable to objects of this type or if encoding is\n     *             unsuccessful\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 344,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.decode(java.lang.Object)",
      "begin_line": 358,
      "end_line": 371,
      "comment": "\n     * Decodes a quoted-printable object into its original form. Escaped characters are converted back to their original\n     * representation.\n     *\n     * @param obj\n     *            quoted-printable object to convert into its original form\n     * @return original object\n     * @throws DecoderException\n     *             Thrown if the argument is not a \u003ccode\u003eString\u003c/code\u003e or \u003ccode\u003ebyte[]\u003c/code\u003e. Thrown if a failure\n     *             condition is encountered during the decode process.\n     ",
      "child_ranges": [
        "(line 360,col 9)-(line 370,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.getCharset()",
      "begin_line": 379,
      "end_line": 381,
      "comment": "\n     * Gets the default charset name used for string decoding and encoding.\n     *\n     * @return the default charset name\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.getDefaultCharset()",
      "begin_line": 388,
      "end_line": 390,
      "comment": "\n     * Gets the default charset name used for string decoding and encoding.\n     *\n     * @return the default charset name\n     ",
      "child_ranges": [
        "(line 389,col 9)-(line 389,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.encode(java.lang.String, java.nio.charset.Charset)",
      "begin_line": 405,
      "end_line": 410,
      "comment": "\n     * Encodes a string into its quoted-printable form using the specified charset. Unsafe characters are escaped.\n     * \u003cp\u003e\n     * This function implements a subset of quoted-printable encoding specification (rule #1 and rule #2) as defined in\n     * RFC 1521 and is suitable for encoding binary data and unformatted text.\n     *\n     * @param str\n     *            string to convert to quoted-printable form\n     * @param charset\n     *            the charset for str\n     * @return quoted-printable string\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 408,col 9)",
        "(line 409,col 9)-(line 409,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.encode(java.lang.String, java.lang.String)",
      "begin_line": 426,
      "end_line": 431,
      "comment": "\n     * Encodes a string into its quoted-printable form using the specified charset. Unsafe characters are escaped.\n     * \u003cp\u003e\n     * This function implements a subset of quoted-printable encoding specification (rule #1 and rule #2) as defined in\n     * RFC 1521 and is suitable for encoding binary data and unformatted text.\n     *\n     * @param str\n     *            string to convert to quoted-printable form\n     * @param charset\n     *            the charset for str\n     * @return quoted-printable string\n     * @throws UnsupportedEncodingException\n     *             Thrown if the charset is not supported\n     ",
      "child_ranges": [
        "(line 427,col 9)-(line 429,col 9)",
        "(line 430,col 9)-(line 430,col 75)"
      ]
    }
  ]
}