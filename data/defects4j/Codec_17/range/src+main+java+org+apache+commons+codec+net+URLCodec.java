{
  "filepath": "/tmp/Codec-17b/src/main/java/org/apache/commons/codec/net/URLCodec.java",
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
      "begin_line": 48,
      "end_line": 368,
      "comment": "\n * Implements the \u0027www-form-urlencoded\u0027 encoding scheme, also misleadingly known as URL encoding.\n * \u003cp\u003e\n * This codec is meant to be a replacement for standard Java classes {@link java.net.URLEncoder} and\n * {@link java.net.URLDecoder} on older Java platforms, as these classes in Java versions below\n * 1.4 rely on the platform\u0027s default charset encoding.\n * \u003cp\u003e\n * This class is immutable and thread-safe.\n *\n * @see \u003ca href\u003d\"http://www.w3.org/TR/html4/interact/forms.html#h-17.13.4.1\"\u003eChapter 17.13.4 Form content types\u003c/a\u003e\n *           of the \u003ca href\u003d\"http://www.w3.org/TR/html4/\"\u003eHTML 4.01 Specification\u003c/a\u003e\n *\n * @since 1.2\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "RADIX"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * Radix used in encoding and decoding.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "charset"
      ],
      "begin_line": 60,
      "end_line": 61,
      "comment": "\n     * The default charset used for string decoding and encoding.\n     *\n     * @deprecated TODO: This field will be changed to a private final Charset in 2.0.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ESCAPE_CHAR"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": "\n     * Release 1.5 made this field final.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "WWW_FORM_URL"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": "\n     * BitSet of www-form-url safe characters.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.net.URLCodec.URLCodec()",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.net.URLCodec.URLCodec(java.lang.String)",
      "begin_line": 107,
      "end_line": 110,
      "comment": "\n     * Constructor which allows for the selection of a default charset.\n     *\n     * @param charset the default string charset to use.\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 16)",
        "(line 109,col 9)-(line 109,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.URLCodec.encodeUrl(java.util.BitSet, byte[])",
      "begin_line": 121,
      "end_line": 149,
      "comment": "\n     * Encodes an array of bytes into an array of URL safe 7-bit characters. Unsafe characters are escaped.\n     *\n     * @param urlsafe\n     *            bitset of characters deemed URL safe\n     * @param bytes\n     *            array of bytes to convert to URL safe characters\n     * @return array of bytes containing URL safe characters\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 124,col 9)",
        "(line 125,col 9)-(line 127,col 9)",
        "(line 129,col 9)-(line 129,col 73)",
        "(line 130,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 148,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.URLCodec.decodeUrl(byte[])",
      "begin_line": 161,
      "end_line": 183,
      "comment": "\n     * Decodes an array of URL safe 7-bit characters into an array of original bytes. Escaped characters are converted\n     * back to their original representation.\n     *\n     * @param bytes\n     *            array of URL safe characters\n     * @return array of original bytes\n     * @throws DecoderException\n     *             Thrown if URL decoding is unsuccessful\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 165,col 73)",
        "(line 166,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 182,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.URLCodec.encode(byte[])",
      "begin_line": 192,
      "end_line": 195,
      "comment": "\n     * Encodes an array of bytes into an array of URL safe 7-bit characters. Unsafe characters are escaped.\n     *\n     * @param bytes\n     *            array of bytes to convert to URL safe characters\n     * @return array of bytes containing URL safe characters\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.URLCodec.decode(byte[])",
      "begin_line": 208,
      "end_line": 211,
      "comment": "\n     * Decodes an array of URL safe 7-bit characters into an array of original bytes. Escaped characters are converted\n     * back to their original representation.\n     *\n     * @param bytes\n     *            array of URL safe characters\n     * @return array of original bytes\n     * @throws DecoderException\n     *             Thrown if URL decoding is unsuccessful\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.URLCodec.encode(java.lang.String, java.lang.String)",
      "begin_line": 224,
      "end_line": 229,
      "comment": "\n     * Encodes a string into its URL safe form using the specified string charset. Unsafe characters are escaped.\n     *\n     * @param str\n     *            string to convert to a URL safe form\n     * @param charset\n     *            the charset for str\n     * @return URL safe string\n     * @throws UnsupportedEncodingException\n     *             Thrown if charset is not supported\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 227,col 9)",
        "(line 228,col 9)-(line 228,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.URLCodec.encode(java.lang.String)",
      "begin_line": 242,
      "end_line": 252,
      "comment": "\n     * Encodes a string into its URL safe form using the default string charset. Unsafe characters are escaped.\n     *\n     * @param str\n     *            string to convert to a URL safe form\n     * @return URL safe string\n     * @throws EncoderException\n     *             Thrown if URL encoding is unsuccessful\n     *\n     * @see #getDefaultCharset()\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 246,col 9)",
        "(line 247,col 9)-(line 251,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.URLCodec.decode(java.lang.String, java.lang.String)",
      "begin_line": 269,
      "end_line": 274,
      "comment": "\n     * Decodes a URL safe string into its original form using the specified encoding. Escaped characters are converted\n     * back to their original representation.\n     *\n     * @param str\n     *            URL safe string to convert into its original form\n     * @param charset\n     *            the original string charset\n     * @return original string\n     * @throws DecoderException\n     *             Thrown if URL decoding is unsuccessful\n     * @throws UnsupportedEncodingException\n     *             Thrown if charset is not supported\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 272,col 9)",
        "(line 273,col 9)-(line 273,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.URLCodec.decode(java.lang.String)",
      "begin_line": 287,
      "end_line": 297,
      "comment": "\n     * Decodes a URL safe string into its original form using the default string charset. Escaped characters are\n     * converted back to their original representation.\n     *\n     * @param str\n     *            URL safe string to convert into its original form\n     * @return original string\n     * @throws DecoderException\n     *             Thrown if URL decoding is unsuccessful\n     * @see #getDefaultCharset()\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 291,col 9)",
        "(line 292,col 9)-(line 296,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.URLCodec.encode(java.lang.Object)",
      "begin_line": 308,
      "end_line": 320,
      "comment": "\n     * Encodes an object into its URL safe form. Unsafe characters are escaped.\n     *\n     * @param obj\n     *            string to convert to a URL safe form\n     * @return URL safe object\n     * @throws EncoderException\n     *             Thrown if URL encoding is not applicable to objects of this type or if encoding is unsuccessful\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 319,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.URLCodec.decode(java.lang.Object)",
      "begin_line": 333,
      "end_line": 345,
      "comment": "\n     * Decodes a URL safe object into its original form. Escaped characters are converted back to their original\n     * representation.\n     *\n     * @param obj\n     *            URL safe object to convert into its original form\n     * @return original object\n     * @throws DecoderException\n     *             Thrown if the argument is not a \u003ccode\u003eString\u003c/code\u003e or \u003ccode\u003ebyte[]\u003c/code\u003e. Thrown if a failure\n     *             condition is encountered during the decode process.\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 344,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.URLCodec.getDefaultCharset()",
      "begin_line": 352,
      "end_line": 354,
      "comment": "\n     * The default charset used for string decoding and encoding.\n     *\n     * @return the default string charset.\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.URLCodec.getEncoding()",
      "begin_line": 363,
      "end_line": 366,
      "comment": "\n     * The \u003ccode\u003eString\u003c/code\u003e encoding used for decoding and encoding.\n     *\n     * @return Returns the encoding.\n     *\n     * @deprecated Use {@link #getDefaultCharset()}, will be removed in 2.0.\n     ",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 28)"
      ]
    }
  ]
}