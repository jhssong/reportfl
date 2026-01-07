{
  "filepath": "/tmp/Lang-1b/src/main/java/org/apache/commons/lang3/text/translate/JavaUnicodeEscaper.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JavaUnicodeEscaper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.text.translate.UnicodeEscaper"
      ],
      "begin_line": 25,
      "end_line": 114,
      "comment": "\n * Translates codepoints to their Unicode escaped value suitable for Java source.\n * \n * @since 3.2\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.JavaUnicodeEscaper.above(int)",
      "begin_line": 36,
      "end_line": 38,
      "comment": "\n     * \u003cp\u003e\n     * Constructs a \u003ccode\u003eJavaUnicodeEscaper\u003c/code\u003e above the specified value (exclusive).\n     * \u003c/p\u003e\n     * \n     * @param codepoint\n     *            above which to escape\n     * @return the newly created {@code UnicodeEscaper} instance\n     ",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.JavaUnicodeEscaper.below(int)",
      "begin_line": 49,
      "end_line": 51,
      "comment": "\n     * \u003cp\u003e\n     * Constructs a \u003ccode\u003eJavaUnicodeEscaper\u003c/code\u003e below the specified value (exclusive).\n     * \u003c/p\u003e\n     * \n     * @param codepoint\n     *            below which to escape\n     * @return the newly created {@code UnicodeEscaper} instance\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.JavaUnicodeEscaper.between(int, int)",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * \u003cp\u003e\n     * Constructs a \u003ccode\u003eJavaUnicodeEscaper\u003c/code\u003e between the specified values (inclusive).\n     * \u003c/p\u003e\n     * \n     * @param codepointLow\n     *            above which to escape\n     * @param codepointHigh\n     *            below which to escape\n     * @return the newly created {@code UnicodeEscaper} instance\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.JavaUnicodeEscaper.outsideOf(int, int)",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * \u003cp\u003e\n     * Constructs a \u003ccode\u003eJavaUnicodeEscaper\u003c/code\u003e outside of the specified values (exclusive).\n     * \u003c/p\u003e\n     * \n     * @param codepointLow\n     *            below which to escape\n     * @param codepointHigh\n     *            above which to escape\n     * @return the newly created {@code UnicodeEscaper} instance\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 74)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.translate.JavaUnicodeEscaper.JavaUnicodeEscaper(int, int, boolean)",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * \u003cp\u003e\n     * Constructs a \u003ccode\u003eJavaUnicodeEscaper\u003c/code\u003e for the specified range. This is the underlying method for the\n     * other constructors/builders. The \u003ccode\u003ebelow\u003c/code\u003e and \u003ccode\u003eabove\u003c/code\u003e boundaries are inclusive when\n     * \u003ccode\u003ebetween\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e and exclusive when it is \u003ccode\u003efalse\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @param below\n     *            int value representing the lowest codepoint boundary\n     * @param above\n     *            int value representing the highest codepoint boundary\n     * @param between\n     *            whether to escape between the boundaries or outside them\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.JavaUnicodeEscaper.toUtf16Escape(int)",
      "begin_line": 108,
      "end_line": 112,
      "comment": "\n     * Converts the given codepoint to a hex string of the form {@code \"\\\\uXXXX\\\\uXXXX\"}\n     * \n     * @param codepoint\n     *            a Unicode code point\n     * @return the hex string for the given codepoint\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 66)",
        "(line 111,col 9)-(line 111,col 77)"
      ]
    }
  ]
}