{
  "filepath": "/tmp/Codec-5b/src/java/org/apache/commons/codec/net/QuotedPrintableCodec.java",
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
      "begin_line": 63,
      "end_line": 387,
      "comment": "\n * \u003cp\u003e\n * Codec for the Quoted-Printable section of \u003ca href\u003d\"http://www.ietf.org/rfc/rfc1521.txt\"\u003eRFC 1521 \u003c/a\u003e.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The Quoted-Printable encoding is intended to represent data that largely consists of octets that correspond to\n * printable characters in the ASCII character set. It encodes the data in such a way that the resulting octets are\n * unlikely to be modified by mail transport. If the data being encoded are mostly ASCII text, the encoded form of the\n * data remains largely recognizable by humans. A body which is entirely ASCII may also be encoded in Quoted-Printable\n * to ensure the integrity of the data should the message pass through a character- translating, and/or line-wrapping\n * gateway.\n * \u003c/p\u003e\n * \n * \u003cp\u003e\n * Note:\n * \u003c/p\u003e\n * \u003cp\u003e\n * Rules #3, #4, and #5 of the quoted-printable spec are not implemented yet because the complete quoted-printable spec\n * does not lend itself well into the byte[] oriented codec framework. Complete the codec once the steamable codec\n * framework is ready. The motivation behind providing the codec in a partial form is that it can already come in handy\n * for those applications that do not require quoted-printable line formatting (rules #3, #4, #5), for instance Q codec.\n * \u003c/p\u003e\n * \n * @see \u003ca href\u003d\"http://www.ietf.org/rfc/rfc1521.txt\"\u003e RFC 1521 MIME (Multipurpose Internet Mail Extensions) Part One:\n *          Mechanisms for Specifying and Describing the Format of Internet Message Bodies \u003c/a\u003e\n * \n * @author Apache Software Foundation\n * @since 1.3\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "charset"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n     * The default charset used for string decoding and encoding.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PRINTABLE_CHARS"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": "\n     * BitSet of printable characters as defined in RFC 1521.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ESCAPE_CHAR"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TAB"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SPACE"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.QuotedPrintableCodec()",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.QuotedPrintableCodec(java.lang.String)",
      "begin_line": 105,
      "end_line": 108,
      "comment": "\n     * Constructor which allows for the selection of a default charset\n     * \n     * @param charset\n     *                  the default string charset to use.\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 16)",
        "(line 107,col 9)-(line 107,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(int, java.io.ByteArrayOutputStream)",
      "begin_line": 118,
      "end_line": 124,
      "comment": "\n     * Encodes byte into its quoted-printable representation.\n     * \n     * @param b\n     *                  byte to encode\n     * @param buffer\n     *                  the buffer to write to\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 34)",
        "(line 120,col 9)-(line 120,col 82)",
        "(line 121,col 9)-(line 121,col 75)",
        "(line 122,col 9)-(line 122,col 27)",
        "(line 123,col 9)-(line 123,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(java.util.BitSet, byte[])",
      "begin_line": 140,
      "end_line": 160,
      "comment": "\n     * Encodes an array of bytes into an array of quoted-printable 7-bit characters. Unsafe characters are escaped.\n     * \n     * \u003cp\u003e\n     * This function implements a subset of quoted-printable encoding specification (rule #1 and rule #2) as defined in\n     * RFC 1521 and is suitable for encoding binary data and unformatted text.\n     * \u003c/p\u003e\n     * \n     * @param printable\n     *                  bitset of characters deemed quoted-printable\n     * @param bytes\n     *                  array of bytes to be encoded\n     * @return array of bytes containing quoted-printable data\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 147,col 67)",
        "(line 148,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 159,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byte[])",
      "begin_line": 177,
      "end_line": 197,
      "comment": "\n     * Decodes an array quoted-printable characters into an array of original bytes. Escaped characters are converted\n     * back to their original representation.\n     * \n     * \u003cp\u003e\n     * This function implements a subset of quoted-printable encoding specification (rule #1 and rule #2) as defined in\n     * RFC 1521.\n     * \u003c/p\u003e\n     * \n     * @param bytes\n     *                  array of quoted-printable characters\n     * @return array of original bytes\n     * @throws DecoderException\n     *                  Thrown if quoted-printable decoding is unsuccessful\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 180,col 9)",
        "(line 181,col 9)-(line 181,col 67)",
        "(line 182,col 9)-(line 195,col 9)",
        "(line 196,col 9)-(line 196,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.encode(byte[])",
      "begin_line": 211,
      "end_line": 213,
      "comment": "\n     * Encodes an array of bytes into an array of quoted-printable 7-bit characters. Unsafe characters are escaped.\n     * \n     * \u003cp\u003e\n     * This function implements a subset of quoted-printable encoding specification (rule #1 and rule #2) as defined in\n     * RFC 1521 and is suitable for encoding binary data and unformatted text.\n     * \u003c/p\u003e\n     * \n     * @param bytes\n     *                  array of bytes to be encoded\n     * @return array of bytes containing quoted-printable data\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.decode(byte[])",
      "begin_line": 230,
      "end_line": 232,
      "comment": "\n     * Decodes an array of quoted-printable characters into an array of original bytes. Escaped characters are converted\n     * back to their original representation.\n     * \n     * \u003cp\u003e\n     * This function implements a subset of quoted-printable encoding specification (rule #1 and rule #2) as defined in\n     * RFC 1521.\n     * \u003c/p\u003e\n     * \n     * @param bytes\n     *                  array of quoted-printable characters\n     * @return array of original bytes\n     * @throws DecoderException\n     *                  Thrown if quoted-printable decoding is unsuccessful\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.encode(java.lang.String)",
      "begin_line": 251,
      "end_line": 260,
      "comment": "\n     * Encodes a string into its quoted-printable form using the default string charset. Unsafe characters are escaped.\n     * \n     * \u003cp\u003e\n     * This function implements a subset of quoted-printable encoding specification (rule #1 and rule #2) as defined in\n     * RFC 1521 and is suitable for encoding binary data.\n     * \u003c/p\u003e\n     * \n     * @param pString\n     *                  string to convert to quoted-printable form\n     * @return quoted-printable string\n     * \n     * @throws EncoderException\n     *                  Thrown if quoted-printable encoding is unsuccessful\n     * \n     * @see #getDefaultCharset()\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 254,col 9)",
        "(line 255,col 9)-(line 259,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.decode(java.lang.String, java.lang.String)",
      "begin_line": 276,
      "end_line": 281,
      "comment": "\n     * Decodes a quoted-printable string into its original form using the specified string charset. Escaped characters\n     * are converted back to their original representation.\n     * \n     * @param pString\n     *                  quoted-printable string to convert into its original form\n     * @param charset\n     *                  the original string charset\n     * @return original string\n     * @throws DecoderException\n     *                  Thrown if quoted-printable decoding is unsuccessful\n     * @throws UnsupportedEncodingException\n     *                  Thrown if charset is not supported\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 279,col 9)",
        "(line 280,col 9)-(line 280,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.decode(java.lang.String)",
      "begin_line": 295,
      "end_line": 304,
      "comment": "\n     * Decodes a quoted-printable string into its original form using the default string charset. Escaped characters are\n     * converted back to their original representation.\n     * \n     * @param pString\n     *                  quoted-printable string to convert into its original form\n     * @return original string\n     * @throws DecoderException\n     *                  Thrown if quoted-printable decoding is unsuccessful.\n     *                  Thrown if charset is not supported.\n     * @see #getDefaultCharset()\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 298,col 9)",
        "(line 299,col 9)-(line 303,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.encode(java.lang.Object)",
      "begin_line": 316,
      "end_line": 328,
      "comment": "\n     * Encodes an object into its quoted-printable safe form. Unsafe characters are escaped.\n     * \n     * @param pObject\n     *                  string to convert to a quoted-printable form\n     * @return quoted-printable object\n     * @throws EncoderException\n     *                  Thrown if quoted-printable encoding is not applicable to objects of this type or if encoding is\n     *                  unsuccessful\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 327,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.decode(java.lang.Object)",
      "begin_line": 341,
      "end_line": 353,
      "comment": "\n     * Decodes a quoted-printable object into its original form. Escaped characters are converted back to their original\n     * representation.\n     * \n     * @param pObject\n     *                  quoted-printable object to convert into its original form\n     * @return original object\n     * @throws DecoderException\n     *                  Thrown if the argument is not a \u003ccode\u003eString\u003c/code\u003e or \u003ccode\u003ebyte[]\u003c/code\u003e. Thrown if a failure condition is\n     *                  encountered during the decode process.\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 352,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.getDefaultCharset()",
      "begin_line": 360,
      "end_line": 362,
      "comment": "\n     * Returns the default charset used for string decoding and encoding.\n     * \n     * @return the default string charset.\n     ",
      "child_ranges": [
        "(line 361,col 9)-(line 361,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.encode(java.lang.String, java.lang.String)",
      "begin_line": 381,
      "end_line": 386,
      "comment": "\n     * Encodes a string into its quoted-printable form using the specified charset. Unsafe characters are escaped.\n     * \n     * \u003cp\u003e\n     * This function implements a subset of quoted-printable encoding specification (rule #1 and rule #2) as defined in\n     * RFC 1521 and is suitable for encoding binary data and unformatted text.\n     * \u003c/p\u003e\n     * \n     * @param pString\n     *                  string to convert to quoted-printable form\n     * @param charset\n     *                  the charset for pString\n     * @return quoted-printable string\n     * \n     * @throws UnsupportedEncodingException\n     *                  Thrown if the charset is not supported\n     ",
      "child_ranges": [
        "(line 382,col 9)-(line 384,col 9)",
        "(line 385,col 9)-(line 385,col 79)"
      ]
    }
  ]
}