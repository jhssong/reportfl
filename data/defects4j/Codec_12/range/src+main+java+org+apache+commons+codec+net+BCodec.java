{
  "filepath": "/tmp/Codec-12b/src/main/java/org/apache/commons/codec/net/BCodec.java",
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
      "begin_line": 48,
      "end_line": 211,
      "comment": "\n * \u003cp\u003e\n * Identical to the Base64 encoding defined by \u003ca href\u003d\"http://www.ietf.org/rfc/rfc1521.txt\"\u003eRFC\n * 1521\u003c/a\u003e and allows a character set to be specified.\n * \u003c/p\u003e\n * \n * \u003cp\u003e\n * \u003ca href\u003d\"http://www.ietf.org/rfc/rfc1522.txt\"\u003eRFC 1522\u003c/a\u003e describes techniques to allow the encoding of non-ASCII\n * text in various portions of a RFC 822 [2] message header, in a manner which is unlikely to confuse existing message\n * handling software.\n * \u003c/p\u003e\n * \n * @see \u003ca href\u003d\"http://www.ietf.org/rfc/rfc1522.txt\"\u003eMIME (Multipurpose Internet Mail Extensions) Part Two: Message\n *          Header Extensions for Non-ASCII Text\u003c/a\u003e\n * \n * @author Apache Software Foundation\n * @since 1.3\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "charset"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * The default charset used for string decoding and encoding.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.net.BCodec.BCodec()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.net.BCodec.BCodec(java.lang.String)",
      "begin_line": 69,
      "end_line": 72,
      "comment": "\n     * Constructor which allows for the selection of a default charset\n     * \n     * @param charset\n     *                  the default string charset to use.\n     * \n     * @see \u003ca href\u003d\"http://download.oracle.com/javase/1.5.0/docs/api/java/nio/charset/Charset.html\"\u003eStandard charsets\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 16)",
        "(line 71,col 9)-(line 71,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.BCodec.getEncoding()",
      "begin_line": 74,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.BCodec.doEncoding(byte[])",
      "begin_line": 79,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 84,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.BCodec.doDecoding(byte[])",
      "begin_line": 87,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 91,col 9)",
        "(line 92,col 9)-(line 92,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.BCodec.encode(java.lang.String, java.lang.String)",
      "begin_line": 107,
      "end_line": 116,
      "comment": "\n     * Encodes a string into its Base64 form using the specified charset. Unsafe characters are escaped.\n     * \n     * @param value\n     *                  string to convert to Base64 form\n     * @param charset\n     *                  the charset for \u003ccode\u003evalue\u003c/code\u003e\n     * @return Base64 string\n     * \n     * @throws EncoderException\n     *                  thrown if a failure condition is encountered during the encoding process.\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 115,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.BCodec.encode(java.lang.String)",
      "begin_line": 128,
      "end_line": 133,
      "comment": "\n     * Encodes a string into its Base64 form using the default charset. Unsafe characters are escaped.\n     * \n     * @param value\n     *                  string to convert to Base64 form\n     * @return Base64 string\n     * \n     * @throws EncoderException\n     *                  thrown if a failure condition is encountered during the encoding process.\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 131,col 9)",
        "(line 132,col 9)-(line 132,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.BCodec.decode(java.lang.String)",
      "begin_line": 145,
      "end_line": 154,
      "comment": "\n     * Decodes a Base64 string into its original form. Escaped characters are converted back to their original\n     * representation.\n     * \n     * @param value\n     *            Base64 string to convert into its original form\n     * @return original string\n     * @throws DecoderException\n     *             A decoder exception is thrown if a failure condition is encountered during the decode process.\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 153,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.BCodec.encode(java.lang.Object)",
      "begin_line": 166,
      "end_line": 176,
      "comment": "\n     * Encodes an object into its Base64 form using the default charset. Unsafe characters are escaped.\n     * \n     * @param value\n     *                  object to convert to Base64 form\n     * @return Base64 object\n     * \n     * @throws EncoderException\n     *                  thrown if a failure condition is encountered during the encoding process.\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 175,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.BCodec.decode(java.lang.Object)",
      "begin_line": 191,
      "end_line": 201,
      "comment": "\n     * Decodes a Base64 object into its original form. Escaped characters are converted back to their original\n     * representation.\n     * \n     * @param value\n     *                  Base64 object to convert into its original form\n     * \n     * @return original object\n     * \n     * @throws DecoderException\n     *                  Thrown if the argument is not a \u003ccode\u003eString\u003c/code\u003e. Thrown if a failure condition is\n     *                  encountered during the decode process.\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 200,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.BCodec.getDefaultCharset()",
      "begin_line": 208,
      "end_line": 210,
      "comment": "\n     * The default charset used for string decoding and encoding.\n     * \n     * @return the default string charset.\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 28)"
      ]
    }
  ]
}