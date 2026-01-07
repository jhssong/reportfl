{
  "filepath": "/tmp/Codec-13b/src/main/java/org/apache/commons/codec/net/BCodec.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BCodec",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.codec.net.RFC1522Codec",
        "org.apache.commons.codec.StringEncoder",
        "org.apache.commons.codec.StringDecoder"
      ],
      "begin_line": 46,
      "end_line": 251,
      "comment": "\n * Identical to the Base64 encoding defined by \u003ca href\u003d\"http://www.ietf.org/rfc/rfc1521.txt\"\u003eRFC 1521\u003c/a\u003e\n * and allows a character set to be specified.\n * \u003cp\u003e\n * \u003ca href\u003d\"http://www.ietf.org/rfc/rfc1522.txt\"\u003eRFC 1522\u003c/a\u003e describes techniques to allow the encoding of non-ASCII\n * text in various portions of a RFC 822 [2] message header, in a manner which is unlikely to confuse existing message\n * handling software.\n * \u003cp\u003e\n * This class is immutable and thread-safe.\n *\n * @see \u003ca href\u003d\"http://www.ietf.org/rfc/rfc1522.txt\"\u003eMIME (Multipurpose Internet Mail Extensions) Part Two: Message\n *          Header Extensions for Non-ASCII Text\u003c/a\u003e\n *\n * @since 1.3\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "charset"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * The default charset used for string decoding and encoding.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.net.BCodec.BCodec()",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.net.BCodec.BCodec(java.nio.charset.Charset)",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * Constructor which allows for the selection of a default charset\n     *\n     * @param charset\n     *            the default string charset to use.\n     *\n     * @see \u003ca href\u003d\"http://download.oracle.com/javase/6/docs/api/java/nio/charset/Charset.html\"\u003eStandard charsets\u003c/a\u003e\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.net.BCodec.BCodec(java.lang.String)",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\n     * Constructor which allows for the selection of a default charset\n     *\n     * @param charsetName\n     *            the default charset to use.\n     * @throws java.nio.charset.UnsupportedCharsetException\n     *             If the named charset is unavailable\n     * @since 1.7 throws UnsupportedCharsetException if the named charset is unavailable\n     * @see \u003ca href\u003d\"http://download.oracle.com/javase/6/docs/api/java/nio/charset/Charset.html\"\u003eStandard charsets\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.BCodec.getEncoding()",
      "begin_line": 86,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.BCodec.doEncoding(byte[])",
      "begin_line": 91,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 93,col 9)-(line 95,col 9)",
        "(line 96,col 9)-(line 96,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.BCodec.doDecoding(byte[])",
      "begin_line": 99,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 101,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 104,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.BCodec.encode(java.lang.String, java.nio.charset.Charset)",
      "begin_line": 119,
      "end_line": 124,
      "comment": "\n     * Encodes a string into its Base64 form using the specified charset. Unsafe characters are escaped.\n     *\n     * @param value\n     *            string to convert to Base64 form\n     * @param charset\n     *            the charset for \u003ccode\u003evalue\u003c/code\u003e\n     * @return Base64 string\n     * @throws EncoderException\n     *             thrown if a failure condition is encountered during the encoding process.\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 122,col 9)",
        "(line 123,col 9)-(line 123,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.BCodec.encode(java.lang.String, java.lang.String)",
      "begin_line": 137,
      "end_line": 146,
      "comment": "\n     * Encodes a string into its Base64 form using the specified charset. Unsafe characters are escaped.\n     *\n     * @param value\n     *            string to convert to Base64 form\n     * @param charset\n     *            the charset for \u003ccode\u003evalue\u003c/code\u003e\n     * @return Base64 string\n     * @throws EncoderException\n     *             thrown if a failure condition is encountered during the encoding process.\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 140,col 9)",
        "(line 141,col 9)-(line 145,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.BCodec.encode(java.lang.String)",
      "begin_line": 157,
      "end_line": 163,
      "comment": "\n     * Encodes a string into its Base64 form using the default charset. Unsafe characters are escaped.\n     *\n     * @param value\n     *            string to convert to Base64 form\n     * @return Base64 string\n     * @throws EncoderException\n     *             thrown if a failure condition is encountered during the encoding process.\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 161,col 9)",
        "(line 162,col 9)-(line 162,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.BCodec.decode(java.lang.String)",
      "begin_line": 175,
      "end_line": 185,
      "comment": "\n     * Decodes a Base64 string into its original form. Escaped characters are converted back to their original\n     * representation.\n     *\n     * @param value\n     *            Base64 string to convert into its original form\n     * @return original string\n     * @throws DecoderException\n     *             A decoder exception is thrown if a failure condition is encountered during the decode process.\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 184,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.BCodec.encode(java.lang.Object)",
      "begin_line": 196,
      "end_line": 207,
      "comment": "\n     * Encodes an object into its Base64 form using the default charset. Unsafe characters are escaped.\n     *\n     * @param value\n     *            object to convert to Base64 form\n     * @return Base64 object\n     * @throws EncoderException\n     *             thrown if a failure condition is encountered during the encoding process.\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 206,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.BCodec.decode(java.lang.Object)",
      "begin_line": 220,
      "end_line": 231,
      "comment": "\n     * Decodes a Base64 object into its original form. Escaped characters are converted back to their original\n     * representation.\n     *\n     * @param value\n     *            Base64 object to convert into its original form\n     * @return original object\n     * @throws DecoderException\n     *             Thrown if the argument is not a \u003ccode\u003eString\u003c/code\u003e. Thrown if a failure condition is encountered\n     *             during the decode process.\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 230,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.BCodec.getCharset()",
      "begin_line": 239,
      "end_line": 241,
      "comment": "\n     * Gets the default charset name used for string decoding and encoding.\n     *\n     * @return the default charset name\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.BCodec.getDefaultCharset()",
      "begin_line": 248,
      "end_line": 250,
      "comment": "\n     * Gets the default charset name used for string decoding and encoding.\n     *\n     * @return the default charset name\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 35)"
      ]
    }
  ]
}