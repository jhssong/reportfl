{
  "filepath": "/tmp/Codec-5b/src/java/org/apache/commons/codec/binary/StringUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StringUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 34,
      "end_line": 279,
      "comment": "\n * Converts String to and from bytes using the encodings required by the Java specification. These encodings are specified in \u003ca\n * href\u003d\"http://java.sun.com/j2se/1.4.2/docs/api/java/nio/charset/Charset.html\"\u003eStandard charsets\u003c/a\u003e\n * \n * @see CharEncoding\n * @see \u003ca href\u003d\"http://java.sun.com/j2se/1.4.2/docs/api/java/nio/charset/Charset.html\"\u003eStandard charsets\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:ggregory@seagullsw.com\"\u003eGary Gregory\u003c/a\u003e\n * @version $Id$\n * @since 1.4\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(java.lang.String)",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * Encodes the given string into a sequence of bytes using the ISO-8859-1 charset, storing the result into a new\n     * byte array.\n     * \n     * @param string\n     *            the String to encode\n     * @return encoded bytes\n     * @throws IllegalStateException\n     *             Thrown when the charset is missing, which should be never according the the Java specification.\n     * @see \u003ca href\u003d\"http://java.sun.com/j2se/1.4.2/docs/api/java/nio/charset/Charset.html\"\u003eStandard charsets\u003c/a\u003e\n     * @see #getBytesUnchecked(String, String)\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtils.getBytesUsAscii(java.lang.String)",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * Encodes the given string into a sequence of bytes using the US-ASCII charset, storing the result into a new byte\n     * array.\n     * \n     * @param string\n     *            the String to encode\n     * @return encoded bytes\n     * @throws IllegalStateException\n     *             Thrown when the charset is missing, which should be never according the the Java specification.\n     * @see \u003ca href\u003d\"http://java.sun.com/j2se/1.4.2/docs/api/java/nio/charset/Charset.html\"\u003eStandard charsets\u003c/a\u003e\n     * @see #getBytesUnchecked(String, String)\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtils.getBytesUtf16(java.lang.String)",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * Encodes the given string into a sequence of bytes using the UTF-16 charset, storing the result into a new byte\n     * array.\n     * \n     * @param string\n     *            the String to encode\n     * @return encoded bytes\n     * @throws IllegalStateException\n     *             Thrown when the charset is missing, which should be never according the the Java specification.\n     * @see \u003ca href\u003d\"http://java.sun.com/j2se/1.4.2/docs/api/java/nio/charset/Charset.html\"\u003eStandard charsets\u003c/a\u003e\n     * @see #getBytesUnchecked(String, String)\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be(java.lang.String)",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * Encodes the given string into a sequence of bytes using the UTF-16BE charset, storing the result into a new byte\n     * array.\n     * \n     * @param string\n     *            the String to encode\n     * @return encoded bytes\n     * @throws IllegalStateException\n     *             Thrown when the charset is missing, which should be never according the the Java specification.\n     * @see \u003ca href\u003d\"http://java.sun.com/j2se/1.4.2/docs/api/java/nio/charset/Charset.html\"\u003eStandard charsets\u003c/a\u003e\n     * @see #getBytesUnchecked(String, String)\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le(java.lang.String)",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\n     * Encodes the given string into a sequence of bytes using the UTF-16LE charset, storing the result into a new byte\n     * array.\n     * \n     * @param string\n     *            the String to encode\n     * @return encoded bytes\n     * @throws IllegalStateException\n     *             Thrown when the charset is missing, which should be never according the the Java specification.\n     * @see \u003ca href\u003d\"http://java.sun.com/j2se/1.4.2/docs/api/java/nio/charset/Charset.html\"\u003eStandard charsets\u003c/a\u003e\n     * @see #getBytesUnchecked(String, String)\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtils.getBytesUtf8(java.lang.String)",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\n     * Encodes the given string into a sequence of bytes using the UTF-8 charset, storing the result into a new byte\n     * array.\n     * \n     * @param string\n     *            the String to encode\n     * @return encoded bytes\n     * @throws IllegalStateException\n     *             Thrown when the charset is missing, which should be never according the the Java specification.\n     * @see \u003ca href\u003d\"http://java.sun.com/j2se/1.4.2/docs/api/java/nio/charset/Charset.html\"\u003eStandard charsets\u003c/a\u003e\n     * @see #getBytesUnchecked(String, String)\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtils.getBytesUnchecked(java.lang.String, java.lang.String)",
      "begin_line": 151,
      "end_line": 160,
      "comment": "\n     * Encodes the given string into a sequence of bytes using the named charset, storing the result into a new byte\n     * array.\n     * \u003cp\u003e\n     * This method catches {@link UnsupportedEncodingException} and rethrows it as {@link IllegalStateException}, which\n     * should never happen for a required charset name. Use this method when the encoding is required to be in the JRE.\n     * \u003c/p\u003e\n     * \n     * @param string\n     *            the String to encode\n     * @param charsetName\n     *            The name of a required {@link java.nio.charset.Charset}\n     * @return encoded bytes\n     * @throws IllegalStateException\n     *             Thrown when a {@link UnsupportedEncodingException} is caught, which should never happen for a\n     *             required charset name.\n     * @see CharEncoding\n     * @see String#getBytes(String)\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 159,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtils.newIllegalStateException(java.lang.String, java.io.UnsupportedEncodingException)",
      "begin_line": 162,
      "end_line": 164,
      "comment": "",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtils.newString(byte[], java.lang.String)",
      "begin_line": 184,
      "end_line": 193,
      "comment": "\n     * Constructs a new \u003ccode\u003eString\u003c/code\u003e by decoding the specified array of bytes using the given charset.\n     * \u003cp\u003e\n     * This method catches {@link UnsupportedEncodingException} and re-throws it as {@link IllegalStateException}, which\n     * should never happen for a required charset name. Use this method when the encoding is required to be in the JRE.\n     * \u003c/p\u003e\n     * \n     * @param bytes\n     *            The bytes to be decoded into characters\n     * @param charsetName\n     *            The name of a required {@link java.nio.charset.Charset}\n     * @return A new \u003ccode\u003eString\u003c/code\u003e decoded from the specified array of bytes using the given charset.\n     * @throws IllegalStateException\n     *             Thrown when a {@link UnsupportedEncodingException} is caught, which should never happen for a\n     *             required charset name.\n     * @see CharEncoding\n     * @see String#String(byte[], String)\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 187,col 9)",
        "(line 188,col 9)-(line 192,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byte[])",
      "begin_line": 205,
      "end_line": 207,
      "comment": "\n     * Constructs a new \u003ccode\u003eString\u003c/code\u003e by decoding the specified array of bytes using the ISO-8859-1 charset.\n     * \n     * @param bytes\n     *            The bytes to be decoded into characters\n     * @return A new \u003ccode\u003eString\u003c/code\u003e decoded from the specified array of bytes using the given charset.\n     * @throws IllegalStateException\n     *             Thrown when a {@link UnsupportedEncodingException} is caught, which should never happen since the\n     *             charset is required.\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byte[])",
      "begin_line": 219,
      "end_line": 221,
      "comment": "\n     * Constructs a new \u003ccode\u003eString\u003c/code\u003e by decoding the specified array of bytes using the US-ASCII charset.\n     * \n     * @param bytes\n     *            The bytes to be decoded into characters\n     * @return A new \u003ccode\u003eString\u003c/code\u003e decoded from the specified array of bytes using the given charset.\n     * @throws IllegalStateException\n     *             Thrown when a {@link UnsupportedEncodingException} is caught, which should never happen since the\n     *             charset is required.\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtils.newStringUtf16(byte[])",
      "begin_line": 233,
      "end_line": 235,
      "comment": "\n     * Constructs a new \u003ccode\u003eString\u003c/code\u003e by decoding the specified array of bytes using the UTF-16 charset.\n     * \n     * @param bytes\n     *            The bytes to be decoded into characters\n     * @return A new \u003ccode\u003eString\u003c/code\u003e decoded from the specified array of bytes using the given charset.\n     * @throws IllegalStateException\n     *             Thrown when a {@link UnsupportedEncodingException} is caught, which should never happen since the\n     *             charset is required.\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byte[])",
      "begin_line": 247,
      "end_line": 249,
      "comment": "\n     * Constructs a new \u003ccode\u003eString\u003c/code\u003e by decoding the specified array of bytes using the UTF-16BE charset.\n     * \n     * @param bytes\n     *            The bytes to be decoded into characters\n     * @return A new \u003ccode\u003eString\u003c/code\u003e decoded from the specified array of bytes using the given charset.\n     * @throws IllegalStateException\n     *             Thrown when a {@link UnsupportedEncodingException} is caught, which should never happen since the\n     *             charset is required.\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byte[])",
      "begin_line": 261,
      "end_line": 263,
      "comment": "\n     * Constructs a new \u003ccode\u003eString\u003c/code\u003e by decoding the specified array of bytes using the UTF-16LE charset.\n     * \n     * @param bytes\n     *            The bytes to be decoded into characters\n     * @return A new \u003ccode\u003eString\u003c/code\u003e decoded from the specified array of bytes using the given charset.\n     * @throws IllegalStateException\n     *             Thrown when a {@link UnsupportedEncodingException} is caught, which should never happen since the\n     *             charset is required.\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtils.newStringUtf8(byte[])",
      "begin_line": 275,
      "end_line": 277,
      "comment": "\n     * Constructs a new \u003ccode\u003eString\u003c/code\u003e by decoding the specified array of bytes using the UTF-8 charset.\n     * \n     * @param bytes\n     *            The bytes to be decoded into characters\n     * @return A new \u003ccode\u003eString\u003c/code\u003e decoded from the specified array of bytes using the given charset.\n     * @throws IllegalStateException\n     *             Thrown when a {@link UnsupportedEncodingException} is caught, which should never happen since the\n     *             charset is required.\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 64)"
      ]
    }
  ]
}