{
  "filepath": "/tmp/Codec-17b/src/main/java/org/apache/commons/codec/net/QuotedPrintableCodec.java",
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
      "begin_line": 66,
      "end_line": 601,
      "comment": "\n * Codec for the Quoted-Printable section of \u003ca href\u003d\"http://www.ietf.org/rfc/rfc1521.txt\"\u003eRFC 1521\u003c/a\u003e.\n * \u003cp\u003e\n * The Quoted-Printable encoding is intended to represent data that largely consists of octets that correspond to\n * printable characters in the ASCII character set. It encodes the data in such a way that the resulting octets are\n * unlikely to be modified by mail transport. If the data being encoded are mostly ASCII text, the encoded form of the\n * data remains largely recognizable by humans. A body which is entirely ASCII may also be encoded in Quoted-Printable\n * to ensure the integrity of the data should the message pass through a character- translating, and/or line-wrapping\n * gateway.\n * \u003cp\u003e\n * Note:\n * \u003cp\u003e\n * Depending on the selected {@code strict} parameter, this class will implement a different set of rules of the\n * quoted-printable spec:\n * \u003cul\u003e\n *   \u003cli\u003e{@code strict\u003dfalse}: only rules #1 and #2 are implemented\n *   \u003cli\u003e{@code strict\u003dtrue}: all rules #1 through #5 are implemented\n * \u003c/ul\u003e\n * Originally, this class only supported the non-strict mode, but the codec in this partial form could already be used\n * for certain applications that do not require quoted-printable line formatting (rules #3, #4, #5), for instance\n * Q codec. The strict mode has been added in 1.10.\n * \u003cp\u003e\n * This class is immutable and thread-safe.\n *\n * @see \u003ca href\u003d\"http://www.ietf.org/rfc/rfc1521.txt\"\u003eRFC 1521 MIME (Multipurpose Internet Mail Extensions) Part One:\n *          Mechanisms for Specifying and Describing the Format of Internet Message Bodies \u003c/a\u003e\n *\n * @since 1.3\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "charset"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": "\n     * The default charset used for string decoding and encoding.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "strict"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": "\n     * Indicates whether soft line breaks shall be used during encoding (rule #3-5).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PRINTABLE_CHARS"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": "\n     * BitSet of printable characters as defined in RFC 1521.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ESCAPE_CHAR"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TAB"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SPACE"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CR"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LF"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SAFE_LENGTH"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": "\n     * Safe line length for quoted printable encoded text.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.QuotedPrintableCodec()",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\n     * Default constructor, assumes default charset of {@link Charsets#UTF_8}\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.QuotedPrintableCodec(boolean)",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\n     * Constructor which allows for the selection of the strict mode.\n     *\n     * @param strict\n     *            if {@code true}, soft line breaks will be used\n     * @since 1.10\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.QuotedPrintableCodec(java.nio.charset.Charset)",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\n     * Constructor which allows for the selection of a default charset.\n     *\n     * @param charset\n     *            the default string charset to use.\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.QuotedPrintableCodec(java.nio.charset.Charset, boolean)",
      "begin_line": 148,
      "end_line": 151,
      "comment": "\n     * Constructor which allows for the selection of a default charset and strict mode.\n     *\n     * @param charset\n     *            the default string charset to use.\n     * @param strict\n     *            if {@code true}, soft line breaks will be used\n     * @since 1.10\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 31)",
        "(line 150,col 9)-(line 150,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.QuotedPrintableCodec(java.lang.String)",
      "begin_line": 168,
      "end_line": 171,
      "comment": "\n     * Constructor which allows for the selection of a default charset.\n     *\n     * @param charsetName\n     *            the default string charset to use.\n     * @throws UnsupportedCharsetException\n     *             If no support for the named charset is available\n     *             in this instance of the Java virtual machine\n     * @throws IllegalArgumentException\n     *             If the given charsetName is null\n     * @throws IllegalCharsetNameException\n     *             If the given charset name is illegal\n     *\n     * @since 1.7 throws UnsupportedCharsetException if the named charset is unavailable\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(int, java.io.ByteArrayOutputStream)",
      "begin_line": 182,
      "end_line": 189,
      "comment": "\n     * Encodes byte into its quoted-printable representation.\n     *\n     * @param b\n     *            byte to encode\n     * @param buffer\n     *            the buffer to write to\n     * @return The number of bytes written to the \u003ccode\u003ebuffer\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 34)",
        "(line 184,col 9)-(line 184,col 88)",
        "(line 185,col 9)-(line 185,col 81)",
        "(line 186,col 9)-(line 186,col 27)",
        "(line 187,col 9)-(line 187,col 27)",
        "(line 188,col 9)-(line 188,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.getUnsignedOctet(int, byte[])",
      "begin_line": 201,
      "end_line": 207,
      "comment": "\n     * Return the byte at position \u003ccode\u003eindex\u003c/code\u003e of the byte array and\n     * make sure it is unsigned.\n     *\n     * @param index\n     *            position in the array\n     * @param bytes\n     *            the byte array\n     * @return the unsigned octet at position \u003ccode\u003eindex\u003c/code\u003e from the array\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 29)",
        "(line 203,col 9)-(line 205,col 9)",
        "(line 206,col 9)-(line 206,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.encodeByte(int, boolean, java.io.ByteArrayOutputStream)",
      "begin_line": 220,
      "end_line": 227,
      "comment": "\n     * Write a byte to the buffer.\n     *\n     * @param b\n     *            byte to write\n     * @param encode\n     *            indicates whether the octet shall be encoded\n     * @param buffer\n     *            the buffer to write to\n     * @return the number of bytes that have been written to the buffer\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 224,col 9)",
        "(line 225,col 9)-(line 225,col 24)",
        "(line 226,col 9)-(line 226,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.isWhitespace(int)",
      "begin_line": 236,
      "end_line": 238,
      "comment": "\n     * Checks whether the given byte is whitespace.\n     *\n     * @param b\n     *            byte to be checked\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the byte is either a space or tab character\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(java.util.BitSet, byte[])",
      "begin_line": 252,
      "end_line": 254,
      "comment": "\n     * Encodes an array of bytes into an array of quoted-printable 7-bit characters. Unsafe characters are escaped.\n     * \u003cp\u003e\n     * This function implements a subset of quoted-printable encoding specification (rule #1 and rule #2) as defined in\n     * RFC 1521 and is suitable for encoding binary data and unformatted text.\n     *\n     * @param printable\n     *            bitset of characters deemed quoted-printable\n     * @param bytes\n     *            array of bytes to be encoded\n     * @return array of bytes containing quoted-printable data\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(java.util.BitSet, byte[], boolean)",
      "begin_line": 272,
      "end_line": 336,
      "comment": "\n     * Encodes an array of bytes into an array of quoted-printable 7-bit characters. Unsafe characters are escaped.\n     * \u003cp\u003e\n     * Depending on the selection of the {@code strict} parameter, this function either implements the full ruleset\n     * or only a subset of quoted-printable encoding specification (rule #1 and rule #2) as defined in\n     * RFC 1521 and is suitable for encoding binary data and unformatted text.\n     *\n     * @param printable\n     *            bitset of characters deemed quoted-printable\n     * @param bytes\n     *            array of bytes to be encoded\n     * @param strict\n     *            if {@code true} the full ruleset is used, otherwise only rule #1 and rule #2\n     * @return array of bytes containing quoted-printable data\n     * @since 1.10\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 275,col 9)",
        "(line 276,col 9)-(line 278,col 9)",
        "(line 279,col 9)-(line 279,col 73)",
        "(line 281,col 9)-(line 334,col 9)",
        "(line 335,col 9)-(line 335,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byte[])",
      "begin_line": 351,
      "end_line": 376,
      "comment": "\n     * Decodes an array quoted-printable characters into an array of original bytes. Escaped characters are converted\n     * back to their original representation.\n     * \u003cp\u003e\n     * This function fully implements the quoted-printable encoding specification (rule #1 through rule #5) as\n     * defined in RFC 1521.\n     *\n     * @param bytes\n     *            array of quoted-printable characters\n     * @return array of original bytes\n     * @throws DecoderException\n     *             Thrown if quoted-printable decoding is unsuccessful\n     ",
      "child_ranges": [
        "(line 352,col 9)-(line 354,col 9)",
        "(line 355,col 9)-(line 355,col 73)",
        "(line 356,col 9)-(line 374,col 9)",
        "(line 375,col 9)-(line 375,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.encode(byte[])",
      "begin_line": 389,
      "end_line": 392,
      "comment": "\n     * Encodes an array of bytes into an array of quoted-printable 7-bit characters. Unsafe characters are escaped.\n     * \u003cp\u003e\n     * Depending on the selection of the {@code strict} parameter, this function either implements the full ruleset\n     * or only a subset of quoted-printable encoding specification (rule #1 and rule #2) as defined in\n     * RFC 1521 and is suitable for encoding binary data and unformatted text.\n     *\n     * @param bytes\n     *            array of bytes to be encoded\n     * @return array of bytes containing quoted-printable data\n     ",
      "child_ranges": [
        "(line 391,col 9)-(line 391,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.decode(byte[])",
      "begin_line": 407,
      "end_line": 410,
      "comment": "\n     * Decodes an array of quoted-printable characters into an array of original bytes. Escaped characters are converted\n     * back to their original representation.\n     * \u003cp\u003e\n     * This function fully implements the quoted-printable encoding specification (rule #1 through rule #5) as\n     * defined in RFC 1521.\n     *\n     * @param bytes\n     *            array of quoted-printable characters\n     * @return array of original bytes\n     * @throws DecoderException\n     *             Thrown if quoted-printable decoding is unsuccessful\n     ",
      "child_ranges": [
        "(line 409,col 9)-(line 409,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.encode(java.lang.String)",
      "begin_line": 427,
      "end_line": 430,
      "comment": "\n     * Encodes a string into its quoted-printable form using the default string charset. Unsafe characters are escaped.\n     * \u003cp\u003e\n     * Depending on the selection of the {@code strict} parameter, this function either implements the full ruleset\n     * or only a subset of quoted-printable encoding specification (rule #1 and rule #2) as defined in\n     * RFC 1521 and is suitable for encoding binary data and unformatted text.\n     *\n     * @param str\n     *            string to convert to quoted-printable form\n     * @return quoted-printable string\n     * @throws EncoderException\n     *             Thrown if quoted-printable encoding is unsuccessful\n     *\n     * @see #getCharset()\n     ",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.decode(java.lang.String, java.nio.charset.Charset)",
      "begin_line": 445,
      "end_line": 450,
      "comment": "\n     * Decodes a quoted-printable string into its original form using the specified string charset. Escaped characters\n     * are converted back to their original representation.\n     *\n     * @param str\n     *            quoted-printable string to convert into its original form\n     * @param charset\n     *            the original string charset\n     * @return original string\n     * @throws DecoderException\n     *             Thrown if quoted-printable decoding is unsuccessful\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 446,col 9)-(line 448,col 9)",
        "(line 449,col 9)-(line 449,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.decode(java.lang.String, java.lang.String)",
      "begin_line": 466,
      "end_line": 471,
      "comment": "\n     * Decodes a quoted-printable string into its original form using the specified string charset. Escaped characters\n     * are converted back to their original representation.\n     *\n     * @param str\n     *            quoted-printable string to convert into its original form\n     * @param charset\n     *            the original string charset\n     * @return original string\n     * @throws DecoderException\n     *             Thrown if quoted-printable decoding is unsuccessful\n     * @throws UnsupportedEncodingException\n     *             Thrown if charset is not supported\n     ",
      "child_ranges": [
        "(line 467,col 9)-(line 469,col 9)",
        "(line 470,col 9)-(line 470,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.decode(java.lang.String)",
      "begin_line": 484,
      "end_line": 487,
      "comment": "\n     * Decodes a quoted-printable string into its original form using the default string charset. Escaped characters are\n     * converted back to their original representation.\n     *\n     * @param str\n     *            quoted-printable string to convert into its original form\n     * @return original string\n     * @throws DecoderException\n     *             Thrown if quoted-printable decoding is unsuccessful. Thrown if charset is not supported.\n     * @see #getCharset()\n     ",
      "child_ranges": [
        "(line 486,col 9)-(line 486,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.encode(java.lang.Object)",
      "begin_line": 499,
      "end_line": 512,
      "comment": "\n     * Encodes an object into its quoted-printable safe form. Unsafe characters are escaped.\n     *\n     * @param obj\n     *            string to convert to a quoted-printable form\n     * @return quoted-printable object\n     * @throws EncoderException\n     *             Thrown if quoted-printable encoding is not applicable to objects of this type or if encoding is\n     *             unsuccessful\n     ",
      "child_ranges": [
        "(line 501,col 9)-(line 511,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.decode(java.lang.Object)",
      "begin_line": 525,
      "end_line": 538,
      "comment": "\n     * Decodes a quoted-printable object into its original form. Escaped characters are converted back to their original\n     * representation.\n     *\n     * @param obj\n     *            quoted-printable object to convert into its original form\n     * @return original object\n     * @throws DecoderException\n     *             Thrown if the argument is not a \u003ccode\u003eString\u003c/code\u003e or \u003ccode\u003ebyte[]\u003c/code\u003e. Thrown if a failure\n     *             condition is encountered during the decode process.\n     ",
      "child_ranges": [
        "(line 527,col 9)-(line 537,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.getCharset()",
      "begin_line": 546,
      "end_line": 548,
      "comment": "\n     * Gets the default charset name used for string decoding and encoding.\n     *\n     * @return the default charset name\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 547,col 9)-(line 547,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.getDefaultCharset()",
      "begin_line": 555,
      "end_line": 557,
      "comment": "\n     * Gets the default charset name used for string decoding and encoding.\n     *\n     * @return the default charset name\n     ",
      "child_ranges": [
        "(line 556,col 9)-(line 556,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.encode(java.lang.String, java.nio.charset.Charset)",
      "begin_line": 573,
      "end_line": 578,
      "comment": "\n     * Encodes a string into its quoted-printable form using the specified charset. Unsafe characters are escaped.\n     * \u003cp\u003e\n     * Depending on the selection of the {@code strict} parameter, this function either implements the full ruleset\n     * or only a subset of quoted-printable encoding specification (rule #1 and rule #2) as defined in\n     * RFC 1521 and is suitable for encoding binary data and unformatted text.\n     *\n     * @param str\n     *            string to convert to quoted-printable form\n     * @param charset\n     *            the charset for str\n     * @return quoted-printable string\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 574,col 9)-(line 576,col 9)",
        "(line 577,col 9)-(line 577,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.encode(java.lang.String, java.lang.String)",
      "begin_line": 595,
      "end_line": 600,
      "comment": "\n     * Encodes a string into its quoted-printable form using the specified charset. Unsafe characters are escaped.\n     * \u003cp\u003e\n     * Depending on the selection of the {@code strict} parameter, this function either implements the full ruleset\n     * or only a subset of quoted-printable encoding specification (rule #1 and rule #2) as defined in\n     * RFC 1521 and is suitable for encoding binary data and unformatted text.\n     *\n     * @param str\n     *            string to convert to quoted-printable form\n     * @param charset\n     *            the charset for str\n     * @return quoted-printable string\n     * @throws UnsupportedEncodingException\n     *             Thrown if the charset is not supported\n     ",
      "child_ranges": [
        "(line 596,col 9)-(line 598,col 9)",
        "(line 599,col 9)-(line 599,col 75)"
      ]
    }
  ]
}