{
  "filepath": "/tmp/Codec-5b/src/java/org/apache/commons/codec/net/QCodec.java",
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
      "begin_line": 49,
      "end_line": 311,
      "comment": "\n * \u003cp\u003e\n * Similar to the Quoted-Printable content-transfer-encoding defined in \u003ca\n * href\u003d\"http://www.ietf.org/rfc/rfc1521.txt\"\u003eRFC 1521\u003c/a\u003e and designed to allow text containing mostly ASCII\n * characters to be decipherable on an ASCII terminal without decoding.\n * \u003c/p\u003e\n * \n * \u003cp\u003e\n * \u003ca href\u003d\"http://www.ietf.org/rfc/rfc1522.txt\"\u003eRFC 1522\u003c/a\u003e describes techniques to allow the encoding of non-ASCII\n * text in various portions of a RFC 822 [2] message header, in a manner which is unlikely to confuse existing message\n * handling software.\n * \u003c/p\u003e\n * \n * @see \u003ca href\u003d\"http://www.ietf.org/rfc/rfc1522.txt\"\u003eMIME (Multipurpose Internet Mail Extensions) Part Two: Message\n *          Header Extensions for Non-ASCII Text\u003c/a\u003e\n * \n * @author Apache Software Foundation\n * @since 1.3\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "charset"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * The default charset used for string decoding and encoding.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PRINTABLE_CHARS"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     * BitSet of printable characters as defined in RFC 1522.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "BLANK"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UNDERSCORE"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "encodeBlanks"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.net.QCodec.QCodec()",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.net.QCodec.QCodec(java.lang.String)",
      "begin_line": 124,
      "end_line": 127,
      "comment": "\n     * Constructor which allows for the selection of a default charset\n     * \n     * @param charset\n     *                  the default string charset to use.\n     * \n     * @see \u003ca href\u003d\"http://java.sun.com/j2se/1.4.2/docs/api/java/nio/charset/Charset.html\"\u003eStandard charsets\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 16)",
        "(line 126,col 9)-(line 126,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodec.getEncoding()",
      "begin_line": 129,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodec.doEncoding(byte[])",
      "begin_line": 133,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 134,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 137,col 89)",
        "(line 138,col 9)-(line 144,col 9)",
        "(line 145,col 9)-(line 145,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodec.doDecoding(byte[])",
      "begin_line": 148,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 149,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 152,col 39)",
        "(line 153,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 171,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodec.encode(java.lang.String, java.lang.String)",
      "begin_line": 186,
      "end_line": 195,
      "comment": "\n     * Encodes a string into its quoted-printable form using the specified charset. Unsafe characters are escaped.\n     * \n     * @param pString\n     *                  string to convert to quoted-printable form\n     * @param charset\n     *                  the charset for pString\n     * @return quoted-printable string\n     * \n     * @throws EncoderException\n     *                  thrown if a failure condition is encountered during the encoding process.\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 189,col 9)",
        "(line 190,col 9)-(line 194,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodec.encode(java.lang.String)",
      "begin_line": 207,
      "end_line": 212,
      "comment": "\n     * Encodes a string into its quoted-printable form using the default charset. Unsafe characters are escaped.\n     * \n     * @param pString\n     *                  string to convert to quoted-printable form\n     * @return quoted-printable string\n     * \n     * @throws EncoderException\n     *                  thrown if a failure condition is encountered during the encoding process.\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 210,col 9)",
        "(line 211,col 9)-(line 211,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodec.decode(java.lang.String)",
      "begin_line": 226,
      "end_line": 235,
      "comment": "\n     * Decodes a quoted-printable string into its original form. Escaped characters are converted back to their original\n     * representation.\n     * \n     * @param pString\n     *                  quoted-printable string to convert into its original form\n     * \n     * @return original string\n     * \n     * @throws DecoderException\n     *                  A decoder exception is thrown if a failure condition is encountered during the decode process.\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 229,col 9)",
        "(line 230,col 9)-(line 234,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodec.encode(java.lang.Object)",
      "begin_line": 247,
      "end_line": 257,
      "comment": "\n     * Encodes an object into its quoted-printable form using the default charset. Unsafe characters are escaped.\n     * \n     * @param pObject\n     *                  object to convert to quoted-printable form\n     * @return quoted-printable object\n     * \n     * @throws EncoderException\n     *                  thrown if a failure condition is encountered during the encoding process.\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 256,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodec.decode(java.lang.Object)",
      "begin_line": 272,
      "end_line": 282,
      "comment": "\n     * Decodes a quoted-printable object into its original form. Escaped characters are converted back to their original\n     * representation.\n     * \n     * @param pObject\n     *                  quoted-printable object to convert into its original form\n     * \n     * @return original object\n     * \n     * @throws DecoderException\n     *                  Thrown if the argument is not a \u003ccode\u003eString\u003c/code\u003e. Thrown if a failure condition is\n     *                  encountered during the decode process.\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 281,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodec.getDefaultCharset()",
      "begin_line": 289,
      "end_line": 291,
      "comment": "\n     * The default charset used for string decoding and encoding.\n     * \n     * @return the default string charset.\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodec.isEncodeBlanks()",
      "begin_line": 298,
      "end_line": 300,
      "comment": "\n     * Tests if optional tranformation of SPACE characters is to be used\n     * \n     * @return \u003ccode\u003etrue\u003c/code\u003e if SPACE characters are to be transformed, \u003ccode\u003efalse\u003c/code\u003e otherwise\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QCodec.setEncodeBlanks(boolean)",
      "begin_line": 308,
      "end_line": 310,
      "comment": "\n     * Defines whether optional tranformation of SPACE characters is to be used\n     * \n     * @param b\n     *                  \u003ccode\u003etrue\u003c/code\u003e if SPACE characters are to be transformed, \u003ccode\u003efalse\u003c/code\u003e otherwise\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 30)"
      ]
    }
  ]
}