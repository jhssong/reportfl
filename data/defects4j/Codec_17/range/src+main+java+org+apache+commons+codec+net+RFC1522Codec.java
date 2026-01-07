{
  "filepath": "/tmp/Codec-17b/src/main/java/org/apache/commons/codec/net/RFC1522Codec.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RFC1522Codec",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 42,
      "end_line": 186,
      "comment": "\n * Implements methods common to all codecs defined in RFC 1522.\n * \u003cp\u003e\n * \u003ca href\u003d\"http://www.ietf.org/rfc/rfc1522.txt\"\u003eRFC 1522\u003c/a\u003e describes techniques to allow the\n * encoding of non-ASCII text in various portions of a RFC 822 [2] message header, in a manner which\n * is unlikely to confuse existing message handling software.\n * \u003cp\u003e\n * This class is immutable and thread-safe.\n *\n * @see \u003ca href\u003d\"http://www.ietf.org/rfc/rfc1522.txt\"\u003eMIME (Multipurpose Internet Mail Extensions) Part Two:\n *          Message Header Extensions for Non-ASCII Text\u003c/a\u003e\n *\n * @since 1.3\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "SEP"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Separator. "
    },
    {
      "type": "field",
      "varNames": [
        "POSTFIX"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Prefix. "
    },
    {
      "type": "field",
      "varNames": [
        "PREFIX"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Postfix. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.RFC1522Codec.encodeText(java.lang.String, java.nio.charset.Charset)",
      "begin_line": 68,
      "end_line": 82,
      "comment": "\n     * Applies an RFC 1522 compliant encoding scheme to the given string of text with the given charset.\n     * \u003cp\u003e\n     * This method constructs the \"encoded-word\" header common to all the RFC 1522 codecs and then invokes\n     * {@link #doEncoding(byte [])} method of a concrete class to perform the specific encoding.\n     *\n     * @param text\n     *            a string to encode\n     * @param charset\n     *            a charset to be used\n     * @return RFC 1522 compliant \"encoded-word\"\n     * @throws EncoderException\n     *             thrown if there is an error condition during the Encoding process.\n     * @see \u003ca href\u003d\"http://download.oracle.com/javase/6/docs/api/java/nio/charset/Charset.html\"\u003eStandard charsets\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 71,col 9)",
        "(line 72,col 9)-(line 72,col 57)",
        "(line 73,col 9)-(line 73,col 30)",
        "(line 74,col 9)-(line 74,col 31)",
        "(line 75,col 9)-(line 75,col 27)",
        "(line 76,col 9)-(line 76,col 42)",
        "(line 77,col 9)-(line 77,col 27)",
        "(line 78,col 9)-(line 78,col 72)",
        "(line 79,col 9)-(line 79,col 61)",
        "(line 80,col 9)-(line 80,col 31)",
        "(line 81,col 9)-(line 81,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.RFC1522Codec.encodeText(java.lang.String, java.lang.String)",
      "begin_line": 102,
      "end_line": 108,
      "comment": "\n     * Applies an RFC 1522 compliant encoding scheme to the given string of text with the given charset.\n     * \u003cp\u003e\n     * This method constructs the \"encoded-word\" header common to all the RFC 1522 codecs and then invokes\n     * {@link #doEncoding(byte [])} method of a concrete class to perform the specific encoding.\n     *\n     * @param text\n     *            a string to encode\n     * @param charsetName\n     *            the charset to use\n     * @return RFC 1522 compliant \"encoded-word\"\n     * @throws EncoderException\n     *             thrown if there is an error condition during the Encoding process.\n     * @throws UnsupportedEncodingException\n     *             if charset is not available\n     *\n     * @see \u003ca href\u003d\"http://download.oracle.com/javase/6/docs/api/java/nio/charset/Charset.html\"\u003eStandard charsets\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 107,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.RFC1522Codec.decodeText(java.lang.String)",
      "begin_line": 124,
      "end_line": 156,
      "comment": "\n     * Applies an RFC 1522 compliant decoding scheme to the given string of text.\n     * \u003cp\u003e\n     * This method processes the \"encoded-word\" header common to all the RFC 1522 codecs and then invokes\n     * {@link #doEncoding(byte [])} method of a concrete class to perform the specific decoding.\n     *\n     * @param text\n     *            a string to decode\n     * @return A new decoded String or \u003ccode\u003enull\u003c/code\u003e if the input is \u003ccode\u003enull\u003c/code\u003e.\n     * @throws DecoderException\n     *             thrown if there is an error condition during the decoding process.\n     * @throws UnsupportedEncodingException\n     *             thrown if charset specified in the \"encoded-word\" header is not supported\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 128,col 9)",
        "(line 129,col 9)-(line 131,col 9)",
        "(line 132,col 9)-(line 132,col 49)",
        "(line 133,col 9)-(line 133,col 21)",
        "(line 134,col 9)-(line 134,col 41)",
        "(line 135,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 56)",
        "(line 139,col 9)-(line 141,col 9)",
        "(line 142,col 9)-(line 142,col 22)",
        "(line 143,col 9)-(line 143,col 37)",
        "(line 144,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 147,col 57)",
        "(line 148,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 151,col 22)",
        "(line 152,col 9)-(line 152,col 37)",
        "(line 153,col 9)-(line 153,col 76)",
        "(line 154,col 9)-(line 154,col 32)",
        "(line 155,col 9)-(line 155,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.RFC1522Codec.getEncoding()",
      "begin_line": 163,
      "end_line": 163,
      "comment": "\n     * Returns the codec name (referred to as encoding in the RFC 1522).\n     *\n     * @return name of the codec\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.RFC1522Codec.doEncoding(byte[])",
      "begin_line": 174,
      "end_line": 174,
      "comment": "\n     * Encodes an array of bytes using the defined encoding scheme.\n     *\n     * @param bytes\n     *            Data to be encoded\n     * @return A byte array containing the encoded data\n     * @throws EncoderException\n     *             thrown if the Encoder encounters a failure condition during the encoding process.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.RFC1522Codec.doDecoding(byte[])",
      "begin_line": 185,
      "end_line": 185,
      "comment": "\n     * Decodes an array of bytes using the defined encoding scheme.\n     *\n     * @param bytes\n     *            Data to be decoded\n     * @return a byte array that contains decoded data\n     * @throws DecoderException\n     *             A decoder exception is thrown if a Decoder encounters a failure condition during the decode process.\n     ",
      "child_ranges": []
    }
  ]
}