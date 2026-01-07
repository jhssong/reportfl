{
  "filepath": "/tmp/Codec-17b/src/main/java/org/apache/commons/codec/Charsets.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Charsets",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 59,
      "end_line": 168,
      "comment": "\n * Charsets required of every implementation of the Java platform.\n *\n * From the Java documentation \u003ca href\u003d\"http://docs.oracle.com/javase/6/docs/api/java/nio/charset/Charset.html\"\u003eStandard\n * charsets\u003c/a\u003e:\n * \u003cp\u003e\n * \u003ccite\u003eEvery implementation of the Java platform is required to support the following character encodings. Consult the\n * release documentation for your implementation to see if any other encodings are supported. Consult the release\n * documentation for your implementation to see if any other encodings are supported. \u003c/cite\u003e\n * \u003c/p\u003e\n *\n * \u003cul\u003e\n * \u003cli\u003e\u003ccode\u003eUS-ASCII\u003c/code\u003e\u003cbr\u003e\n * Seven-bit ASCII, a.k.a. ISO646-US, a.k.a. the Basic Latin block of the Unicode character set.\u003c/li\u003e\n * \u003cli\u003e\u003ccode\u003eISO-8859-1\u003c/code\u003e\u003cbr\u003e\n * ISO Latin Alphabet No. 1, a.k.a. ISO-LATIN-1.\u003c/li\u003e\n * \u003cli\u003e\u003ccode\u003eUTF-8\u003c/code\u003e\u003cbr\u003e\n * Eight-bit Unicode Transformation Format.\u003c/li\u003e\n * \u003cli\u003e\u003ccode\u003eUTF-16BE\u003c/code\u003e\u003cbr\u003e\n * Sixteen-bit Unicode Transformation Format, big-endian byte order.\u003c/li\u003e\n * \u003cli\u003e\u003ccode\u003eUTF-16LE\u003c/code\u003e\u003cbr\u003e\n * Sixteen-bit Unicode Transformation Format, little-endian byte order.\u003c/li\u003e\n * \u003cli\u003e\u003ccode\u003eUTF-16\u003c/code\u003e\u003cbr\u003e\n * Sixteen-bit Unicode Transformation Format, byte order specified by a mandatory initial byte-order mark (either order\n * accepted on input, big-endian used on output.)\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * This perhaps would best belong in the Commons Lang project. Even if a similar class is defined in Commons Lang, it is\n * not foreseen that Commons Codec would be made to depend on Commons Lang.\n *\n * \u003cp\u003e\n * This class is immutable and thread-safe.\n * \u003c/p\u003e\n *\n * @see \u003ca href\u003d\"http://docs.oracle.com/javase/6/docs/api/java/nio/charset/Charset.html\"\u003eStandard charsets\u003c/a\u003e\n * @since 1.7\n * @version $Id: CharEncoding.java 1173287 2011-09-20 18:16:19Z ggregory $\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.Charsets.toCharset(java.nio.charset.Charset)",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\n     * Returns the given Charset or the default Charset if the given Charset is null.\n     *\n     * @param charset\n     *            A charset or null.\n     * @return the given Charset or the default Charset if the given Charset is null\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.Charsets.toCharset(java.lang.String)",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * Returns a Charset for the named charset. If the name is null, return the default Charset.\n     *\n     * @param charset\n     *            The name of the requested charset, may be null.\n     * @return a Charset for the named charset\n     * @throws java.nio.charset.UnsupportedCharsetException\n     *             If the named charset is unavailable\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 85)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ISO_8859_1"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": "\n     * CharEncodingISO Latin Alphabet No. 1, a.k.a. ISO-LATIN-1.\n     * \u003cp\u003e\n     * Every implementation of the Java platform is required to support this character encoding.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * On Java 7 or later, use {@link java.nio.charset.StandardCharsets#ISO_8859_1} instead.\n     * \u003c/p\u003e\n     *\n     * @see \u003ca href\u003d\"http://docs.oracle.com/javase/6/docs/api/java/nio/charset/Charset.html\"\u003eStandard charsets\u003c/a\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "US_ASCII"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": "\n     * Seven-bit ASCII, also known as ISO646-US, also known as the Basic Latin block of the Unicode character set.\n     * \u003cp\u003e\n     * Every implementation of the Java platform is required to support this character encoding.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * On Java 7 or later, use {@link java.nio.charset.StandardCharsets#ISO_8859_1} instead.\n     * \u003c/p\u003e\n     *\n     * @see \u003ca href\u003d\"http://docs.oracle.com/javase/6/docs/api/java/nio/charset/Charset.html\"\u003eStandard charsets\u003c/a\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "UTF_16"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": "\n     * Sixteen-bit Unicode Transformation Format, The byte order specified by a mandatory initial byte-order mark\n     * (either order accepted on input, big-endian used on output)\n     * \u003cp\u003e\n     * Every implementation of the Java platform is required to support this character encoding.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * On Java 7 or later, use {@link java.nio.charset.StandardCharsets#ISO_8859_1} instead.\n     * \u003c/p\u003e\n     *\n     * @see \u003ca href\u003d\"http://docs.oracle.com/javase/6/docs/api/java/nio/charset/Charset.html\"\u003eStandard charsets\u003c/a\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "UTF_16BE"
      ],
      "begin_line": 141,
      "end_line": 141,
      "comment": "\n     * Sixteen-bit Unicode Transformation Format, big-endian byte order.\n     * \u003cp\u003e\n     * Every implementation of the Java platform is required to support this character encoding.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * On Java 7 or later, use {@link java.nio.charset.StandardCharsets#ISO_8859_1} instead.\n     * \u003c/p\u003e\n     *\n     * @see \u003ca href\u003d\"http://docs.oracle.com/javase/6/docs/api/java/nio/charset/Charset.html\"\u003eStandard charsets\u003c/a\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "UTF_16LE"
      ],
      "begin_line": 154,
      "end_line": 154,
      "comment": "\n     * Sixteen-bit Unicode Transformation Format, little-endian byte order.\n     * \u003cp\u003e\n     * Every implementation of the Java platform is required to support this character encoding.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * On Java 7 or later, use {@link java.nio.charset.StandardCharsets#ISO_8859_1} instead.\n     * \u003c/p\u003e\n     *\n     * @see \u003ca href\u003d\"http://docs.oracle.com/javase/6/docs/api/java/nio/charset/Charset.html\"\u003eStandard charsets\u003c/a\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "UTF_8"
      ],
      "begin_line": 167,
      "end_line": 167,
      "comment": "\n     * Eight-bit Unicode Transformation Format.\n     * \u003cp\u003e\n     * Every implementation of the Java platform is required to support this character encoding.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * On Java 7 or later, use {@link java.nio.charset.StandardCharsets#ISO_8859_1} instead.\n     * \u003c/p\u003e\n     *\n     * @see \u003ca href\u003d\"http://docs.oracle.com/javase/6/docs/api/java/nio/charset/Charset.html\"\u003eStandard charsets\u003c/a\u003e\n     "
    }
  ]
}