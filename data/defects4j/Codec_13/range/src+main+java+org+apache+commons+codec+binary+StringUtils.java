{
  "filepath": "/tmp/Codec-13b/src/main/java/org/apache/commons/codec/binary/StringUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StringUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 38,
      "end_line": 374,
      "comment": "\n * Converts String to and from bytes using the encodings required by the Java specification. These encodings are\n * specified in \u003ca href\u003d\"http://download.oracle.com/javase/6/docs/api/java/nio/charset/Charset.html\"\u003e\n * Standard charsets\u003c/a\u003e.\n *\n * \u003cp\u003eThis class is immutable and thread-safe.\u003c/p\u003e\n *\n * @see CharEncoding\n * @see \u003ca href\u003d\"http://download.oracle.com/javase/6/docs/api/java/nio/charset/Charset.html\"\u003eStandard charsets\u003c/a\u003e\n * @version $Id$\n * @since 1.4\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtils.getBytes(java.lang.String, java.nio.charset.Charset)",
      "begin_line": 80,
      "end_line": 85,
      "comment": "\n     * Calls {@link String#getBytes(Charset)}\n     *\n     * @param string\n     *            The string to encode (if null, return null).\n     * @param charset\n     *            The {@link Charset} to encode the {@code String}\n     * @return the encoded bytes\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 84,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(java.lang.String)",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Encodes the given string into a sequence of bytes using the ISO-8859-1 charset, storing the result into a new\n     * byte array.\n     *\n     * @param string\n     *            the String to encode, may be {@code null}\n     * @return encoded bytes, or {@code null} if the input string was {@code null}\n     * @throws NullPointerException\n     *             Thrown if {@link Charsets#ISO_8859_1} is not initialized, which should never happen since it is\n     *             required by the Java platform specification.\n     * @since As of 1.7, throws {@link NullPointerException} instead of UnsupportedEncodingException\n     * @see \u003ca href\u003d\"http://download.oracle.com/javase/6/docs/api/java/nio/charset/Charset.html\"\u003eStandard charsets\u003c/a\u003e\n     * @see #getBytesUnchecked(String, String)\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtils.getBytesUnchecked(java.lang.String, java.lang.String)",
      "begin_line": 125,
      "end_line": 134,
      "comment": "\n     * Encodes the given string into a sequence of bytes using the named charset, storing the result into a new byte\n     * array.\n     * \u003cp\u003e\n     * This method catches {@link UnsupportedEncodingException} and rethrows it as {@link IllegalStateException}, which\n     * should never happen for a required charset name. Use this method when the encoding is required to be in the JRE.\n     * \u003c/p\u003e\n     *\n     * @param string\n     *            the String to encode, may be {@code null}\n     * @param charsetName\n     *            The name of a required {@link java.nio.charset.Charset}\n     * @return encoded bytes, or {@code null} if the input string was {@code null}\n     * @throws IllegalStateException\n     *             Thrown when a {@link UnsupportedEncodingException} is caught, which should never happen for a\n     *             required charset name.\n     * @see CharEncoding\n     * @see String#getBytes(String)\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 128,col 9)",
        "(line 129,col 9)-(line 133,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtils.getBytesUsAscii(java.lang.String)",
      "begin_line": 150,
      "end_line": 152,
      "comment": "\n     * Encodes the given string into a sequence of bytes using the US-ASCII charset, storing the result into a new byte\n     * array.\n     *\n     * @param string\n     *            the String to encode, may be {@code null}\n     * @return encoded bytes, or {@code null} if the input string was {@code null}\n     * @throws NullPointerException\n     *             Thrown if {@link Charsets#US_ASCII} is not initialized, which should never happen since it is\n     *             required by the Java platform specification.\n     * @since As of 1.7, throws {@link NullPointerException} instead of UnsupportedEncodingException\n     * @see \u003ca href\u003d\"http://download.oracle.com/javase/6/docs/api/java/nio/charset/Charset.html\"\u003eStandard charsets\u003c/a\u003e\n     * @see #getBytesUnchecked(String, String)\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtils.getBytesUtf16(java.lang.String)",
      "begin_line": 168,
      "end_line": 170,
      "comment": "\n     * Encodes the given string into a sequence of bytes using the UTF-16 charset, storing the result into a new byte\n     * array.\n     *\n     * @param string\n     *            the String to encode, may be {@code null}\n     * @return encoded bytes, or {@code null} if the input string was {@code null}\n     * @throws NullPointerException\n     *             Thrown if {@link Charsets#UTF_16} is not initialized, which should never happen since it is\n     *             required by the Java platform specification.\n     * @since As of 1.7, throws {@link NullPointerException} instead of UnsupportedEncodingException\n     * @see \u003ca href\u003d\"http://download.oracle.com/javase/6/docs/api/java/nio/charset/Charset.html\"\u003eStandard charsets\u003c/a\u003e\n     * @see #getBytesUnchecked(String, String)\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be(java.lang.String)",
      "begin_line": 186,
      "end_line": 188,
      "comment": "\n     * Encodes the given string into a sequence of bytes using the UTF-16BE charset, storing the result into a new byte\n     * array.\n     *\n     * @param string\n     *            the String to encode, may be {@code null}\n     * @return encoded bytes, or {@code null} if the input string was {@code null}\n     * @throws NullPointerException\n     *             Thrown if {@link Charsets#UTF_16BE} is not initialized, which should never happen since it is\n     *             required by the Java platform specification.\n     * @since As of 1.7, throws {@link NullPointerException} instead of UnsupportedEncodingException\n     * @see \u003ca href\u003d\"http://download.oracle.com/javase/6/docs/api/java/nio/charset/Charset.html\"\u003eStandard charsets\u003c/a\u003e\n     * @see #getBytesUnchecked(String, String)\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le(java.lang.String)",
      "begin_line": 204,
      "end_line": 206,
      "comment": "\n     * Encodes the given string into a sequence of bytes using the UTF-16LE charset, storing the result into a new byte\n     * array.\n     *\n     * @param string\n     *            the String to encode, may be {@code null}\n     * @return encoded bytes, or {@code null} if the input string was {@code null}\n     * @throws NullPointerException\n     *             Thrown if {@link Charsets#UTF_16LE} is not initialized, which should never happen since it is\n     *             required by the Java platform specification.\n     * @since As of 1.7, throws {@link NullPointerException} instead of UnsupportedEncodingException\n     * @see \u003ca href\u003d\"http://download.oracle.com/javase/6/docs/api/java/nio/charset/Charset.html\"\u003eStandard charsets\u003c/a\u003e\n     * @see #getBytesUnchecked(String, String)\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtils.getBytesUtf8(java.lang.String)",
      "begin_line": 222,
      "end_line": 224,
      "comment": "\n     * Encodes the given string into a sequence of bytes using the UTF-8 charset, storing the result into a new byte\n     * array.\n     *\n     * @param string\n     *            the String to encode, may be {@code null}\n     * @return encoded bytes, or {@code null} if the input string was {@code null}\n     * @throws NullPointerException\n     *             Thrown if {@link Charsets#UTF_8} is not initialized, which should never happen since it is\n     *             required by the Java platform specification.\n     * @since As of 1.7, throws {@link NullPointerException} instead of UnsupportedEncodingException\n     * @see \u003ca href\u003d\"http://download.oracle.com/javase/6/docs/api/java/nio/charset/Charset.html\"\u003eStandard charsets\u003c/a\u003e\n     * @see #getBytesUnchecked(String, String)\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtils.newIllegalStateException(java.lang.String, java.io.UnsupportedEncodingException)",
      "begin_line": 226,
      "end_line": 229,
      "comment": "",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtils.newString(byte[], java.nio.charset.Charset)",
      "begin_line": 244,
      "end_line": 246,
      "comment": "\n     * Constructs a new \u003ccode\u003eString\u003c/code\u003e by decoding the specified array of bytes using the given charset.\n     *\n     * @param bytes\n     *            The bytes to be decoded into characters\n     * @param charset\n     *            The {@link Charset} to encode the {@code String}\n     * @return A new \u003ccode\u003eString\u003c/code\u003e decoded from the specified array of bytes using the given charset,\n     *         or {@code null} if the input byte array was {@code null}.\n     * @throws NullPointerException\n     *             Thrown if {@link Charsets#UTF_8} is not initialized, which should never happen since it is\n     *             required by the Java platform specification.\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtils.newString(byte[], java.lang.String)",
      "begin_line": 267,
      "end_line": 276,
      "comment": "\n     * Constructs a new \u003ccode\u003eString\u003c/code\u003e by decoding the specified array of bytes using the given charset.\n     * \u003cp\u003e\n     * This method catches {@link UnsupportedEncodingException} and re-throws it as {@link IllegalStateException}, which\n     * should never happen for a required charset name. Use this method when the encoding is required to be in the JRE.\n     * \u003c/p\u003e\n     *\n     * @param bytes\n     *            The bytes to be decoded into characters, may be {@code null}\n     * @param charsetName\n     *            The name of a required {@link java.nio.charset.Charset}\n     * @return A new \u003ccode\u003eString\u003c/code\u003e decoded from the specified array of bytes using the given charset,\n     *         or {@code null} if the input byte array was {@code null}.\n     * @throws IllegalStateException\n     *             Thrown when a {@link UnsupportedEncodingException} is caught, which should never happen for a\n     *             required charset name.\n     * @see CharEncoding\n     * @see String#String(byte[], String)\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 270,col 9)",
        "(line 271,col 9)-(line 275,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(byte[])",
      "begin_line": 290,
      "end_line": 292,
      "comment": "\n     * Constructs a new \u003ccode\u003eString\u003c/code\u003e by decoding the specified array of bytes using the ISO-8859-1 charset.\n     *\n     * @param bytes\n     *            The bytes to be decoded into characters, may be {@code null}\n     * @return A new \u003ccode\u003eString\u003c/code\u003e decoded from the specified array of bytes using the ISO-8859-1 charset, or\n     *         {@code null} if the input byte array was {@code null}.\n     * @throws NullPointerException\n     *             Thrown if {@link Charsets#ISO_8859_1} is not initialized, which should never happen since it is\n     *             required by the Java platform specification.\n     * @since As of 1.7, throws {@link NullPointerException} instead of UnsupportedEncodingException\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtils.newStringUsAscii(byte[])",
      "begin_line": 306,
      "end_line": 308,
      "comment": "\n     * Constructs a new \u003ccode\u003eString\u003c/code\u003e by decoding the specified array of bytes using the US-ASCII charset.\n     *\n     * @param bytes\n     *            The bytes to be decoded into characters\n     * @return A new \u003ccode\u003eString\u003c/code\u003e decoded from the specified array of bytes using the US-ASCII charset,\n     *         or {@code null} if the input byte array was {@code null}.\n     * @throws NullPointerException\n     *             Thrown if {@link Charsets#US_ASCII} is not initialized, which should never happen since it is\n     *             required by the Java platform specification.\n     * @since As of 1.7, throws {@link NullPointerException} instead of UnsupportedEncodingException\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtils.newStringUtf16(byte[])",
      "begin_line": 322,
      "end_line": 324,
      "comment": "\n     * Constructs a new \u003ccode\u003eString\u003c/code\u003e by decoding the specified array of bytes using the UTF-16 charset.\n     *\n     * @param bytes\n     *            The bytes to be decoded into characters\n     * @return A new \u003ccode\u003eString\u003c/code\u003e decoded from the specified array of bytes using the UTF-16 charset\n     *         or {@code null} if the input byte array was {@code null}.\n     * @throws NullPointerException\n     *             Thrown if {@link Charsets#UTF_16} is not initialized, which should never happen since it is\n     *             required by the Java platform specification.\n     * @since As of 1.7, throws {@link NullPointerException} instead of UnsupportedEncodingException\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(byte[])",
      "begin_line": 338,
      "end_line": 340,
      "comment": "\n     * Constructs a new \u003ccode\u003eString\u003c/code\u003e by decoding the specified array of bytes using the UTF-16BE charset.\n     *\n     * @param bytes\n     *            The bytes to be decoded into characters\n     * @return A new \u003ccode\u003eString\u003c/code\u003e decoded from the specified array of bytes using the UTF-16BE charset,\n     *         or {@code null} if the input byte array was {@code null}.\n     * @throws NullPointerException\n     *             Thrown if {@link Charsets#UTF_16BE} is not initialized, which should never happen since it is\n     *             required by the Java platform specification.\n     * @since As of 1.7, throws {@link NullPointerException} instead of UnsupportedEncodingException\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(byte[])",
      "begin_line": 354,
      "end_line": 356,
      "comment": "\n     * Constructs a new \u003ccode\u003eString\u003c/code\u003e by decoding the specified array of bytes using the UTF-16LE charset.\n     *\n     * @param bytes\n     *            The bytes to be decoded into characters\n     * @return A new \u003ccode\u003eString\u003c/code\u003e decoded from the specified array of bytes using the UTF-16LE charset,\n     *         or {@code null} if the input byte array was {@code null}.\n     * @throws NullPointerException\n     *             Thrown if {@link Charsets#UTF_16LE} is not initialized, which should never happen since it is\n     *             required by the Java platform specification.\n     * @since As of 1.7, throws {@link NullPointerException} instead of UnsupportedEncodingException\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtils.newStringUtf8(byte[])",
      "begin_line": 370,
      "end_line": 372,
      "comment": "\n     * Constructs a new \u003ccode\u003eString\u003c/code\u003e by decoding the specified array of bytes using the UTF-8 charset.\n     *\n     * @param bytes\n     *            The bytes to be decoded into characters\n     * @return A new \u003ccode\u003eString\u003c/code\u003e decoded from the specified array of bytes using the UTF-8 charset,\n     *         or {@code null} if the input byte array was {@code null}.\n     * @throws NullPointerException\n     *             Thrown if {@link Charsets#UTF_8} is not initialized, which should never happen since it is\n     *             required by the Java platform specification.\n     * @since As of 1.7, throws {@link NullPointerException} instead of UnsupportedEncodingException\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 48)"
      ]
    }
  ]
}