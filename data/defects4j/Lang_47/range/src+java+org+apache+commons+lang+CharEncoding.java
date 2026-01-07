{
  "filepath": "/tmp/Lang-47b/src/java/org/apache/commons/lang/CharEncoding.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CharEncoding",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 42,
      "end_line": 153,
      "comment": "\n * \u003cp\u003e\n * Character encoding names required of every implementation of the Java platform.\n * \u003c/p\u003e\n * \n * \u003cp\u003e\n * According to \u003ca href\u003d\"http://java.sun.com/j2se/1.3/docs/api/java/lang/package-summary.html#charenc\"\u003eJRE character\n * encoding names\u003c/a\u003e:\n * \u003cp\u003e\n * \u003ccite\u003eEvery implementation of the Java platform is required to support the following character encodings. Consult the\n * release documentation for your implementation to see if any other encodings are supported.\u003c/cite\u003e\n * \u003c/p\u003e\n * \u003c/p\u003e\n * \n * @see \u003ca href\u003d\"http://java.sun.com/j2se/1.3/docs/api/java/lang/package-summary.html#charenc\"\u003eJRE character encoding\n *      names\u003c/a\u003e\n * @author Apache Software Foundation\n * @since 2.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "ISO_8859_1"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": "\n     * \u003cp\u003e\n     * ISO Latin Alphabet #1, also known as ISO-LATIN-1.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Every implementation of the Java platform is required to support this character encoding.\n     * \u003c/p\u003e\n     * \n     * @see \u003ca href\u003d\"http://java.sun.com/j2se/1.3/docs/api/java/lang/package-summary.html#charenc\"\u003eJRE character\n     *      encoding names\u003c/a\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "US_ASCII"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": "\n     * \u003cp\u003e\n     * Seven-bit ASCII, also known as ISO646-US, also known as the Basic Latin block of the Unicode character set.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Every implementation of the Java platform is required to support this character encoding.\n     * \u003c/p\u003e\n     * \n     * @see \u003ca href\u003d\"http://java.sun.com/j2se/1.3/docs/api/java/lang/package-summary.html#charenc\"\u003eJRE character\n     *      encoding names\u003c/a\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "UTF_16"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": "\n     * \u003cp\u003e\n     * Sixteen-bit Unicode Transformation Format, byte order specified by a mandatory initial byte-order mark (either\n     * order accepted on input, big-endian used on output).\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Every implementation of the Java platform is required to support this character encoding.\n     * \u003c/p\u003e\n     * \n     * @see \u003ca href\u003d\"http://java.sun.com/j2se/1.3/docs/api/java/lang/package-summary.html#charenc\"\u003eJRE character\n     *      encoding names\u003c/a\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "UTF_16BE"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": "\n     * \u003cp\u003e\n     * Sixteen-bit Unicode Transformation Format, big-endian byte order.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Every implementation of the Java platform is required to support this character encoding.\n     * \u003c/p\u003e\n     * \n     * @see \u003ca href\u003d\"http://java.sun.com/j2se/1.3/docs/api/java/lang/package-summary.html#charenc\"\u003eJRE character\n     *      encoding names\u003c/a\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "UTF_16LE"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": "\n     * \u003cp\u003e\n     * Sixteen-bit Unicode Transformation Format, little-endian byte order.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Every implementation of the Java platform is required to support this character encoding.\n     * \u003c/p\u003e\n     * \n     * @see \u003ca href\u003d\"http://java.sun.com/j2se/1.3/docs/api/java/lang/package-summary.html#charenc\"\u003eJRE character\n     *      encoding names\u003c/a\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "UTF_8"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": "\n     * \u003cp\u003e\n     * Eight-bit Unicode Transformation Format.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Every implementation of the Java platform is required to support this character encoding.\n     * \u003c/p\u003e\n     * \n     * @see \u003ca href\u003d\"http://java.sun.com/j2se/1.3/docs/api/java/lang/package-summary.html#charenc\"\u003eJRE character\n     *      encoding names\u003c/a\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharEncoding.isSupported(java.lang.String)",
      "begin_line": 141,
      "end_line": 151,
      "comment": "\n     * \u003cp\u003e\n     * Returns whether the named charset is supported.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This is similar to \u003ca\n     * href\u003d\"http://java.sun.com/j2se/1.4.2/docs/api/java/nio/charset/Charset.html#isSupported(java.lang.String)\"\u003e\n     * java.nio.charset.Charset.isSupported(String)\u003c/a\u003e\n     * \u003c/p\u003e\n     * \n     * @param name\n     *            the name of the requested charset; may be either a canonical name or an alias\n     * @return \u003ccode\u003etrue\u003c/code\u003e if, and only if, support for the named charset is available in the current Java\n     *         virtual machine\n     * \n     * @see \u003ca href\u003d\"http://java.sun.com/j2se/1.3/docs/api/java/lang/package-summary.html#charenc\"\u003eJRE character\n     *      encoding names\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 144,col 9)",
        "(line 145,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 150,col 20)"
      ]
    }
  ]
}