{
  "filepath": "/tmp/Codec-12b/src/main/java/org/apache/commons/codec/net/URLCodec.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "URLCodec",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.codec.BinaryEncoder",
        "org.apache.commons.codec.BinaryDecoder",
        "org.apache.commons.codec.StringEncoder",
        "org.apache.commons.codec.StringDecoder"
      ],
      "begin_line": 53,
      "end_line": 362,
      "comment": "\n * \u003cp\u003eImplements the \u0027www-form-urlencoded\u0027 encoding scheme, \n * also misleadingly known as URL encoding.\u003c/p\u003e\n *  \n * \u003cp\u003eFor more detailed information please refer to \n * \u003ca href\u003d\"http://www.w3.org/TR/html4/interact/forms.html#h-17.13.4.1\"\u003e\n * Chapter 17.13.4 \u0027Form content types\u0027\u003c/a\u003e of the \n * \u003ca href\u003d\"http://www.w3.org/TR/html4/\"\u003eHTML 4.01 Specification\u003ca\u003e\u003c/p\u003e\n * \n * \u003cp\u003e \n * This codec is meant to be a replacement for standard Java classes\n * {@link java.net.URLEncoder} and {@link java.net.URLDecoder} \n * on older Java platforms, as these classes in Java versions below \n * 1.4 rely on the platform\u0027s default charset encoding.\n * \u003c/p\u003e\n * \n * @author Apache Software Foundation\n * @since 1.2\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "RADIX"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     * Radix used in encoding and decoding.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "charset"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": "\n     * The default charset used for string decoding and encoding.\n     * \n     * TODO: This field will be final in 2.0.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ESCAPE_CHAR"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": "\n     * Release 1.5 made this field final.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "WWW_FORM_URL"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": "\n     * BitSet of www-form-url safe characters.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.net.URLCodec.URLCodec()",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.net.URLCodec.URLCodec(java.lang.String)",
      "begin_line": 111,
      "end_line": 114,
      "comment": "\n     * Constructor which allows for the selection of a default charset\n     * \n     * @param charset the default string charset to use.\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 16)",
        "(line 113,col 9)-(line 113,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.URLCodec.encodeUrl(java.util.BitSet, byte[])",
      "begin_line": 125,
      "end_line": 153,
      "comment": "\n     * Encodes an array of bytes into an array of URL safe 7-bit characters. Unsafe characters are escaped.\n     * \n     * @param urlsafe\n     *            bitset of characters deemed URL safe\n     * @param bytes\n     *            array of bytes to convert to URL safe characters\n     * @return array of bytes containing URL safe characters\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 128,col 9)",
        "(line 129,col 9)-(line 131,col 9)",
        "(line 133,col 9)-(line 133,col 67)",
        "(line 134,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 152,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.URLCodec.decodeUrl(byte[])",
      "begin_line": 164,
      "end_line": 186,
      "comment": "\n     * Decodes an array of URL safe 7-bit characters into an array of \n     * original bytes. Escaped characters are converted back to their \n     * original representation.\n     *\n     * @param bytes array of URL safe characters\n     * @return array of original bytes \n     * @throws DecoderException Thrown if URL decoding is unsuccessful\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 168,col 67)",
        "(line 169,col 9)-(line 184,col 9)",
        "(line 185,col 9)-(line 185,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.URLCodec.encode(byte[])",
      "begin_line": 195,
      "end_line": 197,
      "comment": "\n     * Encodes an array of bytes into an array of URL safe 7-bit \n     * characters. Unsafe characters are escaped.\n     *\n     * @param bytes array of bytes to convert to URL safe characters\n     * @return array of bytes containing URL safe characters\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.URLCodec.decode(byte[])",
      "begin_line": 209,
      "end_line": 211,
      "comment": "\n     * Decodes an array of URL safe 7-bit characters into an array of \n     * original bytes. Escaped characters are converted back to their \n     * original representation.\n     *\n     * @param bytes array of URL safe characters\n     * @return array of original bytes \n     * @throws DecoderException Thrown if URL decoding is unsuccessful\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.URLCodec.encode(java.lang.String, java.lang.String)",
      "begin_line": 224,
      "end_line": 229,
      "comment": "\n     * Encodes a string into its URL safe form using the specified string charset. Unsafe characters are escaped.\n     * \n     * @param pString\n     *            string to convert to a URL safe form\n     * @param charset\n     *            the charset for pString\n     * @return URL safe string\n     * @throws UnsupportedEncodingException\n     *             Thrown if charset is not supported\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 227,col 9)",
        "(line 228,col 9)-(line 228,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.URLCodec.encode(java.lang.String)",
      "begin_line": 241,
      "end_line": 250,
      "comment": "\n     * Encodes a string into its URL safe form using the default string \n     * charset. Unsafe characters are escaped.\n     *\n     * @param pString string to convert to a URL safe form\n     * @return URL safe string\n     * @throws EncoderException Thrown if URL encoding is unsuccessful\n     * \n     * @see #getDefaultCharset()\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 244,col 9)",
        "(line 245,col 9)-(line 249,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.URLCodec.decode(java.lang.String, java.lang.String)",
      "begin_line": 265,
      "end_line": 270,
      "comment": "\n     * Decodes a URL safe string into its original form using the \n     * specified encoding. Escaped characters are converted back \n     * to their original representation.\n     *\n     * @param pString URL safe string to convert into its original form\n     * @param charset the original string charset\n     * @return original string \n     * @throws DecoderException Thrown if URL decoding is unsuccessful\n     * @throws UnsupportedEncodingException Thrown if charset is not\n     *                                      supported \n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 268,col 9)",
        "(line 269,col 9)-(line 269,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.URLCodec.decode(java.lang.String)",
      "begin_line": 283,
      "end_line": 292,
      "comment": "\n     * Decodes a URL safe string into its original form using the default\n     * string charset. Escaped characters are converted back to their \n     * original representation.\n     *\n     * @param pString URL safe string to convert into its original form\n     * @return original string \n     * @throws DecoderException Thrown if URL decoding is unsuccessful\n     * \n     * @see #getDefaultCharset()\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 286,col 9)",
        "(line 287,col 9)-(line 291,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.URLCodec.encode(java.lang.Object)",
      "begin_line": 304,
      "end_line": 316,
      "comment": "\n     * Encodes an object into its URL safe form. Unsafe characters are \n     * escaped.\n     *\n     * @param pObject string to convert to a URL safe form\n     * @return URL safe object\n     * @throws EncoderException Thrown if URL encoding is not \n     *                          applicable to objects of this type or\n     *                          if encoding is unsuccessful\n     ",
      "child_ranges": [
        "(line 305,col 9)-(line 315,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.URLCodec.decode(java.lang.Object)",
      "begin_line": 329,
      "end_line": 340,
      "comment": "\n     * Decodes a URL safe object into its original form. Escaped characters are converted back to their original\n     * representation.\n     * \n     * @param pObject\n     *                  URL safe object to convert into its original form\n     * @return original object\n     * @throws DecoderException\n     *                  Thrown if the argument is not a \u003ccode\u003eString\u003c/code\u003e or \u003ccode\u003ebyte[]\u003c/code\u003e. Thrown if a failure condition is\n     *                  encountered during the decode process.\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 339,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.URLCodec.getDefaultCharset()",
      "begin_line": 347,
      "end_line": 349,
      "comment": "\n     * The default charset used for string decoding and encoding.\n     *\n     * @return the default string charset.\n     ",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.URLCodec.getEncoding()",
      "begin_line": 358,
      "end_line": 360,
      "comment": "\n     * The \u003ccode\u003eString\u003c/code\u003e encoding used for decoding and encoding.\n     * \n     * @return Returns the encoding.\n     * \n     * @deprecated Use {@link #getDefaultCharset()}, will be removed in 2.0.\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 28)"
      ]
    }
  ]
}