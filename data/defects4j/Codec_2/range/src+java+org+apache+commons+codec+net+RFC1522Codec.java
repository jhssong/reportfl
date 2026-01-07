{
  "filepath": "/tmp/Codec-2b/src/java/org/apache/commons/codec/net/RFC1522Codec.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RFC1522Codec",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 46,
      "end_line": 163,
      "comment": "\n * \u003cp\u003e\n * Implements methods common to all codecs defined in RFC 1522.\n * \u003c/p\u003e\n * \n * \u003cp\u003e\n * \u003ca href\u003d\"http://www.ietf.org/rfc/rfc1522.txt\"\u003eRFC 1522\u003c/a\u003e \n * describes techniques to allow the encoding of non-ASCII text in \n * various portions of a RFC 822 [2] message header, in a manner which\n * is unlikely to confuse existing message handling software.\n * \u003c/p\u003e\n\n * @see \u003ca href\u003d\"http://www.ietf.org/rfc/rfc1522.txt\"\u003e\n * MIME (Multipurpose Internet Mail Extensions) Part Two:\n * Message Header Extensions for Non-ASCII Text\u003c/a\u003e\n * \u003c/p\u003e\n * \n * @author Apache Software Foundation\n * @since 1.3\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.RFC1522Codec.encodeText(java.lang.String, java.lang.String)",
      "begin_line": 66,
      "end_line": 82,
      "comment": "\n     * Applies an RFC 1522 compliant encoding scheme to the given string of text with the \n     * given charset. This method constructs the \"encoded-word\" header common to all the \n     * RFC 1522 codecs and then invokes {@link #doEncoding(byte [])} method of a concrete \n     * class to perform the specific enconding.\n     * \n     * @param text a string to encode\n     * @param charset a charset to be used\n     * \n     * @return RFC 1522 compliant \"encoded-word\"\n     * \n     * @throws EncoderException thrown if there is an error conidition during the Encoding \n     *  process.\n     * @throws UnsupportedEncodingException thrown if charset is not supported \n     * \n     * @see \u003ca href\u003d\"http://java.sun.com/j2se/1.3/docs/api/java/lang/package-summary.html#charenc\"\u003eJRE character\n     *          encoding names\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 71,col 9)",
        "(line 72,col 9)-(line 72,col 49)",
        "(line 73,col 9)-(line 73,col 28)",
        "(line 74,col 9)-(line 74,col 31)",
        "(line 75,col 9)-(line 75,col 27)",
        "(line 76,col 9)-(line 76,col 37)",
        "(line 77,col 9)-(line 77,col 27)",
        "(line 78,col 9)-(line 78,col 61)",
        "(line 79,col 9)-(line 79,col 76)",
        "(line 80,col 9)-(line 80,col 28)",
        "(line 81,col 9)-(line 81,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.RFC1522Codec.decodeText(java.lang.String)",
      "begin_line": 97,
      "end_line": 131,
      "comment": "\n     * Applies an RFC 1522 compliant decoding scheme to the given string of text. This method \n     * processes the \"encoded-word\" header common to all the RFC 1522 codecs and then invokes \n     * {@link #doEncoding(byte [])} method of a concrete class to perform the specific deconding.\n     * \n     * @param text a string to decode\n     * @return A new decoded String or \u003ccode\u003enull\u003c/code\u003e if the input is \u003ccode\u003enull\u003c/code\u003e.\n     * \n     * @throws DecoderException thrown if there is an error conidition during the Decoding \n     *  process.\n     * @throws UnsupportedEncodingException thrown if charset specified in the \"encoded-word\" \n     *  header is not supported \n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 106,col 42)",
        "(line 107,col 9)-(line 107,col 21)",
        "(line 108,col 9)-(line 108,col 41)",
        "(line 109,col 9)-(line 111,col 9)",
        "(line 112,col 9)-(line 112,col 50)",
        "(line 113,col 9)-(line 115,col 9)",
        "(line 116,col 9)-(line 116,col 22)",
        "(line 117,col 9)-(line 117,col 37)",
        "(line 118,col 9)-(line 120,col 9)",
        "(line 121,col 9)-(line 121,col 51)",
        "(line 122,col 9)-(line 125,col 9)",
        "(line 126,col 9)-(line 126,col 22)",
        "(line 127,col 9)-(line 127,col 37)",
        "(line 128,col 9)-(line 128,col 89)",
        "(line 129,col 9)-(line 129,col 32)",
        "(line 130,col 9)-(line 130,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.RFC1522Codec.getEncoding()",
      "begin_line": 138,
      "end_line": 138,
      "comment": "\n     * Returns the codec name (referred to as encoding in the RFC 1522)\n     * \n     * @return name of the codec\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.RFC1522Codec.doEncoding(byte[])",
      "begin_line": 150,
      "end_line": 150,
      "comment": "\n     * Encodes an array of bytes using the defined encoding scheme\n     * \n     * @param bytes Data to be encoded\n     *\n     * @return A byte array containing the encoded data\n     * \n     * @throws EncoderException thrown if the Encoder encounters a failure condition \n     *  during the encoding process.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.RFC1522Codec.doDecoding(byte[])",
      "begin_line": 162,
      "end_line": 162,
      "comment": "\n     * Decodes an array of bytes using the defined encoding scheme\n     * \n     * @param bytes Data to be decoded\n     *\n     * @return a byte array that contains decoded data\n     * \n     * @throws DecoderException A decoder exception is thrown if a Decoder encounters a \n     *  failure condition during the decode process.\n     ",
      "child_ranges": []
    }
  ]
}