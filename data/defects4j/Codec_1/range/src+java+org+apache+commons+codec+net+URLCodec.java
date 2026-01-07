{
  "filepath": "/tmp/Codec-1b/src/java/org/apache/commons/codec/net/URLCodec.java",
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
      "begin_line": 51,
      "end_line": 365,
      "comment": "\n * \u003cp\u003eImplements the \u0027www-form-urlencoded\u0027 encoding scheme, \n * also misleadingly known as URL encoding.\u003c/p\u003e\n *  \n * \u003cp\u003eFor more detailed information please refer to \n * \u003ca href\u003d\"http://www.w3.org/TR/html4/interact/forms.html#h-17.13.4.1\"\u003e\n * Chapter 17.13.4 \u0027Form content types\u0027\u003c/a\u003e of the \n * \u003ca href\u003d\"http://www.w3.org/TR/html4/\"\u003eHTML 4.01 Specification\u003ca\u003e\u003c/p\u003e\n * \n * \u003cp\u003e \n * This codec is meant to be a replacement for standard Java classes\n * {@link java.net.URLEncoder} and {@link java.net.URLDecoder} \n * on older Java platforms, as these classes in Java versions below \n * 1.4 rely on the platform\u0027s default charset encoding.\n * \u003c/p\u003e\n * \n * @author Apache Software Foundation\n * @since 1.2\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "charset"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n     * The default charset used for string decoding and encoding.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ESCAPE_CHAR"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "WWW_FORM_URL"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": "\n     * BitSet of www-form-url safe characters.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.net.URLCodec.URLCodec()",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.net.URLCodec.URLCodec(java.lang.String)",
      "begin_line": 99,
      "end_line": 102,
      "comment": "\n     * Constructor which allows for the selection of a default charset\n     * \n     * @param charset the default string charset to use.\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 16)",
        "(line 101,col 9)-(line 101,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.URLCodec.encodeUrl(java.util.BitSet, byte[])",
      "begin_line": 112,
      "end_line": 143,
      "comment": "\n     * Encodes an array of bytes into an array of URL safe 7-bit \n     * characters. Unsafe characters are escaped.\n     *\n     * @param urlsafe bitset of characters deemed URL safe\n     * @param bytes array of bytes to convert to URL safe characters\n     * @return array of bytes containing URL safe characters\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 119,col 9)",
        "(line 121,col 9)-(line 121,col 67)",
        "(line 122,col 9)-(line 141,col 9)",
        "(line 142,col 9)-(line 142,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.URLCodec.decodeUrl(byte[])",
      "begin_line": 155,
      "end_line": 182,
      "comment": "\n     * Decodes an array of URL safe 7-bit characters into an array of \n     * original bytes. Escaped characters are converted back to their \n     * original representation.\n     *\n     * @param bytes array of URL safe characters\n     * @return array of original bytes \n     * @throws DecoderException Thrown if URL decoding is unsuccessful\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 161,col 67)",
        "(line 162,col 9)-(line 180,col 9)",
        "(line 181,col 9)-(line 181,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.URLCodec.encode(byte[])",
      "begin_line": 192,
      "end_line": 194,
      "comment": "\n     * Encodes an array of bytes into an array of URL safe 7-bit \n     * characters. Unsafe characters are escaped.\n     *\n     * @param bytes array of bytes to convert to URL safe characters\n     * @return array of bytes containing URL safe characters\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.URLCodec.decode(byte[])",
      "begin_line": 206,
      "end_line": 208,
      "comment": "\n     * Decodes an array of URL safe 7-bit characters into an array of \n     * original bytes. Escaped characters are converted back to their \n     * original representation.\n     *\n     * @param bytes array of URL safe characters\n     * @return array of original bytes \n     * @throws DecoderException Thrown if URL decoding is unsuccessful\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.URLCodec.encode(java.lang.String, java.lang.String)",
      "begin_line": 221,
      "end_line": 228,
      "comment": "\n     * Encodes a string into its URL safe form using the specified\n     * string charset. Unsafe characters are escaped.\n     *\n     * @param pString string to convert to a URL safe form\n     * @param charset the charset for pString\n     * @return URL safe string\n     * @throws UnsupportedEncodingException Thrown if charset is not\n     *                                      supported \n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 226,col 9)",
        "(line 227,col 9)-(line 227,col 94)"
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
      "end_line": 272,
      "comment": "\n     * Decodes a URL safe string into its original form using the \n     * specified encoding. Escaped characters are converted back \n     * to their original representation.\n     *\n     * @param pString URL safe string to convert into its original form\n     * @param charset the original string charset\n     * @return original string \n     * @throws DecoderException Thrown if URL decoding is unsuccessful\n     * @throws UnsupportedEncodingException Thrown if charset is not\n     *                                      supported \n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 270,col 9)",
        "(line 271,col 9)-(line 271,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.URLCodec.decode(java.lang.String)",
      "begin_line": 286,
      "end_line": 295,
      "comment": "\n     * Decodes a URL safe string into its original form using the default\n     * string charset. Escaped characters are converted back to their \n     * original representation.\n     *\n     * @param pString URL safe string to convert into its original form\n     * @return original string \n     * @throws DecoderException Thrown if URL decoding is unsuccessful\n     * \n     * @see #getDefaultCharset()\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 289,col 9)",
        "(line 290,col 9)-(line 294,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.URLCodec.encode(java.lang.Object)",
      "begin_line": 307,
      "end_line": 319,
      "comment": "\n     * Encodes an object into its URL safe form. Unsafe characters are \n     * escaped.\n     *\n     * @param pObject string to convert to a URL safe form\n     * @return URL safe object\n     * @throws EncoderException Thrown if URL encoding is not \n     *                          applicable to objects of this type or\n     *                          if encoding is unsuccessful\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 318,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.URLCodec.decode(java.lang.Object)",
      "begin_line": 332,
      "end_line": 343,
      "comment": "\n     * Decodes a URL safe object into its original form. Escaped characters are converted back to their original\n     * representation.\n     * \n     * @param pObject\n     *                  URL safe object to convert into its original form\n     * @return original object\n     * @throws DecoderException\n     *                  Thrown if the argument is not a \u003ccode\u003eString\u003c/code\u003e or \u003ccode\u003ebyte[]\u003c/code\u003e. Thrown if a failure condition is\n     *                  encountered during the decode process.\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 342,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.URLCodec.getEncoding()",
      "begin_line": 352,
      "end_line": 354,
      "comment": "\n     * The \u003ccode\u003eString\u003c/code\u003e encoding used for decoding and encoding.\n     * \n     * @return Returns the encoding.\n     * \n     * @deprecated use #getDefaultCharset()\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.URLCodec.getDefaultCharset()",
      "begin_line": 361,
      "end_line": 363,
      "comment": "\n     * The default charset used for string decoding and encoding.\n     *\n     * @return the default string charset.\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 362,col 28)"
      ]
    }
  ]
}