{
  "filepath": "/tmp/Codec-5b/src/java/org/apache/commons/codec/net/RFC1522Codec.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RFC1522Codec",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 47,
      "end_line": 178,
      "comment": "\n * \u003cp\u003e\n * Implements methods common to all codecs defined in RFC 1522.\n * \u003c/p\u003e\n * \n * \u003cp\u003e\n * \u003ca href\u003d\"http://www.ietf.org/rfc/rfc1522.txt\"\u003eRFC 1522\u003c/a\u003e \n * describes techniques to allow the encoding of non-ASCII text in \n * various portions of a RFC 822 [2] message header, in a manner which\n * is unlikely to confuse existing message handling software.\n * \u003c/p\u003e\n\n * @see \u003ca href\u003d\"http://www.ietf.org/rfc/rfc1522.txt\"\u003e\n * MIME (Multipurpose Internet Mail Extensions) Part Two:\n * Message Header Extensions for Non-ASCII Text\u003c/a\u003e\n * \u003c/p\u003e\n * \n * @author Apache Software Foundation\n * @since 1.3\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "SEP"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * Separator.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "POSTFIX"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n     * Prefix\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PREFIX"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": "\n     * Postfix\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.RFC1522Codec.encodeText(java.lang.String, java.lang.String)",
      "begin_line": 81,
      "end_line": 97,
      "comment": "\n     * Applies an RFC 1522 compliant encoding scheme to the given string of text with the \n     * given charset. This method constructs the \"encoded-word\" header common to all the \n     * RFC 1522 codecs and then invokes {@link #doEncoding(byte [])} method of a concrete \n     * class to perform the specific enconding.\n     * \n     * @param text a string to encode\n     * @param charset a charset to be used\n     * \n     * @return RFC 1522 compliant \"encoded-word\"\n     * \n     * @throws EncoderException thrown if there is an error conidition during the Encoding \n     *  process.\n     * @throws UnsupportedEncodingException thrown if charset is not supported \n     * \n     * @see \u003ca href\u003d\"http://java.sun.com/j2se/1.4.2/docs/api/java/nio/charset/Charset.html\"\u003eStandard charsets\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 86,col 9)",
        "(line 87,col 9)-(line 87,col 49)",
        "(line 88,col 9)-(line 88,col 30)",
        "(line 89,col 9)-(line 89,col 31)",
        "(line 90,col 9)-(line 90,col 27)",
        "(line 91,col 9)-(line 91,col 37)",
        "(line 92,col 9)-(line 92,col 27)",
        "(line 93,col 9)-(line 93,col 61)",
        "(line 94,col 9)-(line 94,col 61)",
        "(line 95,col 9)-(line 95,col 31)",
        "(line 96,col 9)-(line 96,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.RFC1522Codec.decodeText(java.lang.String)",
      "begin_line": 112,
      "end_line": 146,
      "comment": "\n     * Applies an RFC 1522 compliant decoding scheme to the given string of text. This method \n     * processes the \"encoded-word\" header common to all the RFC 1522 codecs and then invokes \n     * {@link #doEncoding(byte [])} method of a concrete class to perform the specific deconding.\n     * \n     * @param text a string to decode\n     * @return A new decoded String or \u003ccode\u003enull\u003c/code\u003e if the input is \u003ccode\u003enull\u003c/code\u003e.\n     * \n     * @throws DecoderException thrown if there is an error conidition during the Decoding \n     *  process.\n     * @throws UnsupportedEncodingException thrown if charset specified in the \"encoded-word\" \n     *  header is not supported \n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 120,col 9)",
        "(line 121,col 9)-(line 121,col 43)",
        "(line 122,col 9)-(line 122,col 21)",
        "(line 123,col 9)-(line 123,col 41)",
        "(line 124,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 50)",
        "(line 128,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 131,col 22)",
        "(line 132,col 9)-(line 132,col 37)",
        "(line 133,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 136,col 51)",
        "(line 137,col 9)-(line 140,col 9)",
        "(line 141,col 9)-(line 141,col 22)",
        "(line 142,col 9)-(line 142,col 37)",
        "(line 143,col 9)-(line 143,col 76)",
        "(line 144,col 9)-(line 144,col 32)",
        "(line 145,col 9)-(line 145,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.RFC1522Codec.getEncoding()",
      "begin_line": 153,
      "end_line": 153,
      "comment": "\n     * Returns the codec name (referred to as encoding in the RFC 1522)\n     * \n     * @return name of the codec\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.RFC1522Codec.doEncoding(byte[])",
      "begin_line": 165,
      "end_line": 165,
      "comment": "\n     * Encodes an array of bytes using the defined encoding scheme\n     * \n     * @param bytes Data to be encoded\n     *\n     * @return A byte array containing the encoded data\n     * \n     * @throws EncoderException thrown if the Encoder encounters a failure condition \n     *  during the encoding process.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.RFC1522Codec.doDecoding(byte[])",
      "begin_line": 177,
      "end_line": 177,
      "comment": "\n     * Decodes an array of bytes using the defined encoding scheme\n     * \n     * @param bytes Data to be decoded\n     *\n     * @return a byte array that contains decoded data\n     * \n     * @throws DecoderException A decoder exception is thrown if a Decoder encounters a \n     *  failure condition during the decode process.\n     ",
      "child_ranges": []
    }
  ]
}