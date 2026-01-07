{
  "filepath": "/tmp/Codec-12b/src/main/java/org/apache/commons/codec/net/QuotedPrintableCodec.java",
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
      "begin_line": 53,
      "end_line": 472,
      "comment": "\n * \u003cp\u003e\n * Codec for the Quoted-Printable section of \u003ca href\u003d\"http://www.ietf.org/rfc/rfc1521.txt\"\u003eRFC 1521\u003c/a\u003e.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The Quoted-Printable encoding is intended to represent data that largely consists of octets that correspond to\n * printable characters in the ASCII character set. It encodes the data in such a way that the resulting octets are\n * unlikely to be modified by mail transport. If the data being encoded are mostly ASCII text, the encoded form of the\n * data remains largely recognizable by humans. A body which is entirely ASCII may also be encoded in Quoted-Printable\n * to ensure the integrity of the data should the message pass through a character- translating, and/or line-wrapping\n * gateway.\n * \u003c/p\u003e\n *\n * @see \u003ca href\u003d\"http://www.ietf.org/rfc/rfc1521.txt\"\u003e RFC 1521 MIME (Multipurpose Internet Mail Extensions) Part One:\n *          Mechanisms for Specifying and Describing the Format of Internet Message Bodies \u003c/a\u003e\n *\n * @author Apache Software Foundation\n * @since 1.3\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "charset"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n     * The default charset used for string decoding and encoding.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PRINTABLE_CHARS"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": "\n     * BitSet of printable characters as defined in RFC 1521.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ESCAPE_CHAR"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TAB"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SPACE"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CR"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LF"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SAFE_LENGTH"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " Safe line length for quoted printable encoded text. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.QuotedPrintableCodec()",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.QuotedPrintableCodec(java.lang.String)",
      "begin_line": 103,
      "end_line": 106,
      "comment": "\n     * Constructor which allows for the selection of a default charset\n     * \n     * @param charset\n     *                  the default string charset to use.\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 16)",
        "(line 105,col 9)-(line 105,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(int, java.io.ByteArrayOutputStream)",
      "begin_line": 117,
      "end_line": 124,
      "comment": "\n     * Encodes byte into its quoted-printable representation.\n     * \n     * @param b\n     *            byte to encode\n     * @param buffer\n     *            the buffer to write to\n     * @return The number of bytes written to the \u003ccode\u003ebuffer\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 34)",
        "(line 119,col 9)-(line 119,col 82)",
        "(line 120,col 9)-(line 120,col 75)",
        "(line 121,col 9)-(line 121,col 27)",
        "(line 122,col 9)-(line 122,col 27)",
        "(line 123,col 9)-(line 123,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.getUnsignedOctet(int, byte[])",
      "begin_line": 136,
      "end_line": 142,
      "comment": "\n     * Return the byte at position \u003ccode\u003eindex\u003c/code\u003e of the byte array and\n     * make sure it is unsigned.\n     *\n     * @param index\n     *                  position in the array\n     * @param bytes\n     *                  the byte array\n     * @return the unsigned octet at position \u003ccode\u003eindex\u003c/code\u003e from the array\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 29)",
        "(line 138,col 9)-(line 140,col 9)",
        "(line 141,col 9)-(line 141,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.encodeByte(int, boolean, java.io.ByteArrayOutputStream)",
      "begin_line": 155,
      "end_line": 163,
      "comment": "\n     * Write a byte to the buffer.\n     *\n     * @param b\n     *                  byte to write\n     * @param encode\n     *                  indicates whether the octet shall be encoded\n     * @param buffer\n     *                  the buffer to write to\n     * @return the number of bytes that have been written to the buffer\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 162,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.isWhitespace(int)",
      "begin_line": 172,
      "end_line": 174,
      "comment": "\n     * Checks whether the given byte is whitespace.\n     *\n     * @param b\n     *                  byte to be checked\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the byte is either a space or tab character\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(java.util.BitSet, byte[])",
      "begin_line": 190,
      "end_line": 240,
      "comment": "\n     * Encodes an array of bytes into an array of quoted-printable 7-bit characters. Unsafe characters are escaped.\n     *\n     * \u003cp\u003e\n     * This function fully implements the quoted-printable encoding specification (rule #1 through rule #5)\n     * as defined in RFC 1521 and is suitable for encoding binary data and unformatted text.\n     * \u003c/p\u003e\n     *\n     * @param printable\n     *                  bitset of characters deemed quoted-printable\n     * @param bytes\n     *                  array of bytes to be encoded\n     * @return array of bytes containing quoted-printable data\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 193,col 9)",
        "(line 194,col 9)-(line 196,col 9)",
        "(line 197,col 9)-(line 197,col 67)",
        "(line 198,col 9)-(line 198,col 20)",
        "(line 201,col 9)-(line 216,col 9)",
        "(line 220,col 9)-(line 220,col 58)",
        "(line 221,col 9)-(line 221,col 89)",
        "(line 222,col 9)-(line 222,col 45)",
        "(line 227,col 9)-(line 231,col 9)",
        "(line 232,col 9)-(line 237,col 9)",
        "(line 239,col 9)-(line 239,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byte[])",
      "begin_line": 257,
      "end_line": 282,
      "comment": "\n     * Decodes an array quoted-printable characters into an array of original bytes. Escaped characters are\n     * converted back to their original representation.\n     *\n     * \u003cp\u003e\n     * This function fully implements the quoted-printable encoding specification (rule #1 through rule #5) as\n     * defined in RFC 1521.\n     * \u003c/p\u003e\n     *\n     * @param bytes\n     *                  array of quoted-printable characters\n     * @return array of original bytes\n     * @throws DecoderException\n     *                  Thrown if quoted-printable decoding is unsuccessful\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 260,col 9)",
        "(line 261,col 9)-(line 261,col 67)",
        "(line 262,col 9)-(line 280,col 9)",
        "(line 281,col 9)-(line 281,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.encode(byte[])",
      "begin_line": 296,
      "end_line": 298,
      "comment": "\n     * Encodes an array of bytes into an array of quoted-printable 7-bit characters. Unsafe characters are escaped.\n     * \n     * \u003cp\u003e\n     * This function fully implements the quoted-printable encoding specification (rule #1 through rule #5)\n     * as defined in RFC 1521 and is suitable for encoding binary data and unformatted text.\n     * \u003c/p\u003e\n     * \n     * @param bytes\n     *                  array of bytes to be encoded\n     * @return array of bytes containing quoted-printable data\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.decode(byte[])",
      "begin_line": 315,
      "end_line": 317,
      "comment": "\n     * Decodes an array of quoted-printable characters into an array of original bytes. Escaped characters are converted\n     * back to their original representation.\n     * \n     * \u003cp\u003e\n     * This function fully implements the quoted-printable encoding specification (rule #1 through rule #2)\n     * as defined in RFC 1521.\n     * \u003c/p\u003e\n     * \n     * @param bytes\n     *                  array of quoted-printable characters\n     * @return array of original bytes\n     * @throws DecoderException\n     *                  Thrown if quoted-printable decoding is unsuccessful\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.encode(java.lang.String)",
      "begin_line": 336,
      "end_line": 345,
      "comment": "\n     * Encodes a string into its quoted-printable form using the default string charset. Unsafe characters are escaped.\n     * \n     * \u003cp\u003e\n     * This function fully implements the quoted-printable encoding specification (rule #1 through rule #2)\n     * as defined in RFC 1521 and is suitable for encoding binary data.\n     * \u003c/p\u003e\n     * \n     * @param pString\n     *                  string to convert to quoted-printable form\n     * @return quoted-printable string\n     * \n     * @throws EncoderException\n     *                  Thrown if quoted-printable encoding is unsuccessful\n     * \n     * @see #getDefaultCharset()\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 339,col 9)",
        "(line 340,col 9)-(line 344,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.decode(java.lang.String, java.lang.String)",
      "begin_line": 361,
      "end_line": 366,
      "comment": "\n     * Decodes a quoted-printable string into its original form using the specified string charset. Escaped characters\n     * are converted back to their original representation.\n     * \n     * @param pString\n     *                  quoted-printable string to convert into its original form\n     * @param charset\n     *                  the original string charset\n     * @return original string\n     * @throws DecoderException\n     *                  Thrown if quoted-printable decoding is unsuccessful\n     * @throws UnsupportedEncodingException\n     *                  Thrown if charset is not supported\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 364,col 9)",
        "(line 365,col 9)-(line 365,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.decode(java.lang.String)",
      "begin_line": 380,
      "end_line": 389,
      "comment": "\n     * Decodes a quoted-printable string into its original form using the default string charset. Escaped characters are\n     * converted back to their original representation.\n     * \n     * @param pString\n     *                  quoted-printable string to convert into its original form\n     * @return original string\n     * @throws DecoderException\n     *                  Thrown if quoted-printable decoding is unsuccessful.\n     *                  Thrown if charset is not supported.\n     * @see #getDefaultCharset()\n     ",
      "child_ranges": [
        "(line 381,col 9)-(line 383,col 9)",
        "(line 384,col 9)-(line 388,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.encode(java.lang.Object)",
      "begin_line": 401,
      "end_line": 413,
      "comment": "\n     * Encodes an object into its quoted-printable safe form. Unsafe characters are escaped.\n     * \n     * @param pObject\n     *                  string to convert to a quoted-printable form\n     * @return quoted-printable object\n     * @throws EncoderException\n     *                  Thrown if quoted-printable encoding is not applicable to objects of this type or if encoding is\n     *                  unsuccessful\n     ",
      "child_ranges": [
        "(line 402,col 9)-(line 412,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.decode(java.lang.Object)",
      "begin_line": 426,
      "end_line": 438,
      "comment": "\n     * Decodes a quoted-printable object into its original form. Escaped characters are converted back to their original\n     * representation.\n     * \n     * @param pObject\n     *                  quoted-printable object to convert into its original form\n     * @return original object\n     * @throws DecoderException\n     *                  Thrown if the argument is not a \u003ccode\u003eString\u003c/code\u003e or \u003ccode\u003ebyte[]\u003c/code\u003e. Thrown if a failure condition is\n     *                  encountered during the decode process.\n     ",
      "child_ranges": [
        "(line 427,col 9)-(line 437,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.getDefaultCharset()",
      "begin_line": 445,
      "end_line": 447,
      "comment": "\n     * Returns the default charset used for string decoding and encoding.\n     * \n     * @return the default string charset.\n     ",
      "child_ranges": [
        "(line 446,col 9)-(line 446,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodec.encode(java.lang.String, java.lang.String)",
      "begin_line": 466,
      "end_line": 471,
      "comment": "\n     * Encodes a string into its quoted-printable form using the specified charset. Unsafe characters are escaped.\n     * \n     * \u003cp\u003e\n     * This function fully implements the quoted-printable encoding specification (rule #1 through rule #2)\n     * as defined in RFC 1521 and is suitable for encoding binary data and unformatted text.\n     * \u003c/p\u003e\n     * \n     * @param pString\n     *                  string to convert to quoted-printable form\n     * @param charset\n     *                  the charset for pString\n     * @return quoted-printable string\n     * \n     * @throws UnsupportedEncodingException\n     *                  Thrown if the charset is not supported\n     ",
      "child_ranges": [
        "(line 467,col 9)-(line 469,col 9)",
        "(line 470,col 9)-(line 470,col 79)"
      ]
    }
  ]
}