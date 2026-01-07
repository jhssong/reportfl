{
  "filepath": "/tmp/Codec-13b/src/main/java/org/apache/commons/codec/CharEncoding.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CharEncoding",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 58,
      "end_line": 113,
      "comment": "\n * Character encoding names required of every implementation of the Java platform.\n *\n * From the Java documentation \u003ca\n * href\u003d\"http://download.oracle.com/javase/6/docs/api/java/nio/charset/Charset.html\"\u003eStandard charsets\u003c/a\u003e:\n * \u003cp\u003e\n * \u003ccite\u003eEvery implementation of the Java platform is required to support the following character encodings. Consult the\n * release documentation for your implementation to see if any other encodings are supported. Consult the release\n * documentation for your implementation to see if any other encodings are supported.\u003c/cite\u003e\n * \u003c/p\u003e\n *\n * \u003cul\u003e\n * \u003cli\u003e\u003ccode\u003eUS-ASCII\u003c/code\u003e\u003cbr\u003e\n * Seven-bit ASCII, a.k.a. ISO646-US, a.k.a. the Basic Latin block of the Unicode character set.\u003c/li\u003e\n * \u003cli\u003e\u003ccode\u003eISO-8859-1\u003c/code\u003e\u003cbr\u003e\n * ISO Latin Alphabet No. 1, a.k.a. ISO-LATIN-1.\u003c/li\u003e\n * \u003cli\u003e\u003ccode\u003eUTF-8\u003c/code\u003e\u003cbr\u003e\n * Eight-bit Unicode Transformation Format.\u003c/li\u003e\n * \u003cli\u003e\u003ccode\u003eUTF-16BE\u003c/code\u003e\u003cbr\u003e\n * Sixteen-bit Unicode Transformation Format, big-endian byte order.\u003c/li\u003e\n * \u003cli\u003e\u003ccode\u003eUTF-16LE\u003c/code\u003e\u003cbr\u003e\n * Sixteen-bit Unicode Transformation Format, little-endian byte order.\u003c/li\u003e\n * \u003cli\u003e\u003ccode\u003eUTF-16\u003c/code\u003e\u003cbr\u003e\n * Sixteen-bit Unicode Transformation Format, byte order specified by a mandatory initial byte-order mark (either order\n * accepted on input, big-endian used on output.)\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * This perhaps would best belong in the [lang] project. Even if a similar interface is defined in [lang], it is not\n * foreseen that [codec] would be made to depend on [lang].\n *\n * \u003cp\u003e\n * This class is immutable and thread-safe.\n * \u003c/p\u003e\n *\n * @see \u003ca href\u003d\"http://download.oracle.com/javase/6/docs/api/java/nio/charset/Charset.html\"\u003eStandard charsets\u003c/a\u003e\n * @since 1.4\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "ISO_8859_1"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": "\n     * CharEncodingISO Latin Alphabet No. 1, a.k.a. ISO-LATIN-1.\n     * \u003cp\u003e\n     * Every implementation of the Java platform is required to support this character encoding.\n     *\n     * @see \u003ca href\u003d\"http://download.oracle.com/javase/6/docs/api/java/nio/charset/Charset.html\"\u003eStandard charsets\u003c/a\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "US_ASCII"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": "\n     * Seven-bit ASCII, also known as ISO646-US, also known as the Basic Latin block of the Unicode character set.\n     * \u003cp\u003e\n     * Every implementation of the Java platform is required to support this character encoding.\n     *\n     * @see \u003ca href\u003d\"http://download.oracle.com/javase/6/docs/api/java/nio/charset/Charset.html\"\u003eStandard charsets\u003c/a\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "UTF_16"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": "\n     * Sixteen-bit Unicode Transformation Format, The byte order specified by a mandatory initial byte-order mark\n     * (either order accepted on input, big-endian used on output)\n     * \u003cp\u003e\n     * Every implementation of the Java platform is required to support this character encoding.\n     *\n     * @see \u003ca href\u003d\"http://download.oracle.com/javase/6/docs/api/java/nio/charset/Charset.html\"\u003eStandard charsets\u003c/a\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "UTF_16BE"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": "\n     * Sixteen-bit Unicode Transformation Format, big-endian byte order.\n     * \u003cp\u003e\n     * Every implementation of the Java platform is required to support this character encoding.\n     *\n     * @see \u003ca href\u003d\"http://download.oracle.com/javase/6/docs/api/java/nio/charset/Charset.html\"\u003eStandard charsets\u003c/a\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "UTF_16LE"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": "\n     * Sixteen-bit Unicode Transformation Format, little-endian byte order.\n     * \u003cp\u003e\n     * Every implementation of the Java platform is required to support this character encoding.\n     *\n     * @see \u003ca href\u003d\"http://download.oracle.com/javase/6/docs/api/java/nio/charset/Charset.html\"\u003eStandard charsets\u003c/a\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "UTF_8"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": "\n     * Eight-bit Unicode Transformation Format.\n     * \u003cp\u003e\n     * Every implementation of the Java platform is required to support this character encoding.\n     *\n     * @see \u003ca href\u003d\"http://download.oracle.com/javase/6/docs/api/java/nio/charset/Charset.html\"\u003eStandard charsets\u003c/a\u003e\n     "
    }
  ]
}