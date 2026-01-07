{
  "filepath": "/tmp/Lang-5b/src/main/java/org/apache/commons/lang3/text/translate/JavaUnicodeEscaper.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JavaUnicodeEscaper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.text.translate.UnicodeEscaper"
      ],
      "begin_line": 9,
      "end_line": 97,
      "comment": "\n * Translates codepoints to their Unicode escaped value suitable for Java source.\n * \n * @since 3.2\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.JavaUnicodeEscaper.above(int)",
      "begin_line": 20,
      "end_line": 22,
      "comment": "\n     * \u003cp\u003e\n     * Constructs a \u003ccode\u003eJavaUnicodeEscaper\u003c/code\u003e above the specified value (exclusive).\n     * \u003c/p\u003e\n     * \n     * @param codepoint\n     *            above which to escape\n     * @return the newly created {@code UnicodeEscaper} instance\n     ",
      "child_ranges": [
        "(line 21,col 9)-(line 21,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.JavaUnicodeEscaper.below(int)",
      "begin_line": 33,
      "end_line": 35,
      "comment": "\n     * \u003cp\u003e\n     * Constructs a \u003ccode\u003eJavaUnicodeEscaper\u003c/code\u003e below the specified value (exclusive).\n     * \u003c/p\u003e\n     * \n     * @param codepoint\n     *            below which to escape\n     * @return the newly created {@code UnicodeEscaper} instance\n     ",
      "child_ranges": [
        "(line 34,col 9)-(line 34,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.JavaUnicodeEscaper.between(int, int)",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * \u003cp\u003e\n     * Constructs a \u003ccode\u003eJavaUnicodeEscaper\u003c/code\u003e between the specified values (inclusive).\n     * \u003c/p\u003e\n     * \n     * @param codepointLow\n     *            above which to escape\n     * @param codepointHigh\n     *            below which to escape\n     * @return the newly created {@code UnicodeEscaper} instance\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.JavaUnicodeEscaper.outsideOf(int, int)",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * \u003cp\u003e\n     * Constructs a \u003ccode\u003eJavaUnicodeEscaper\u003c/code\u003e outside of the specified values (exclusive).\n     * \u003c/p\u003e\n     * \n     * @param codepointLow\n     *            below which to escape\n     * @param codepointHigh\n     *            above which to escape\n     * @return the newly created {@code UnicodeEscaper} instance\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 74)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.translate.JavaUnicodeEscaper.JavaUnicodeEscaper(int, int, boolean)",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * \u003cp\u003e\n     * Constructs a \u003ccode\u003eJavaUnicodeEscaper\u003c/code\u003e for the specified range. This is the underlying method for the\n     * other constructors/builders. The \u003ccode\u003ebelow\u003c/code\u003e and \u003ccode\u003eabove\u003c/code\u003e boundaries are inclusive when\n     * \u003ccode\u003ebetween\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e and exclusive when it is \u003ccode\u003efalse\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @param below\n     *            int value representing the lowest codepoint boundary\n     * @param above\n     *            int value representing the highest codepoint boundary\n     * @param between\n     *            whether to escape between the boundaries or outside them\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.JavaUnicodeEscaper.toUtf16Escape(int)",
      "begin_line": 91,
      "end_line": 95,
      "comment": "\n     * Converts the given codepoint to a hex string of the form {@code \"\\\\uXXXX\\\\uXXXX\"}\n     * \n     * @param codePoint\n     *            a Unicode code point\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 60)",
        "(line 94,col 9)-(line 94,col 77)"
      ]
    }
  ]
}