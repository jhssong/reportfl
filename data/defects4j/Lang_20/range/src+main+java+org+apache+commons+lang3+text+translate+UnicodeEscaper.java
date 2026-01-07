{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/text/translate/UnicodeEscaper.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnicodeEscaper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.text.translate.CodePointTranslator"
      ],
      "begin_line": 28,
      "end_line": 130,
      "comment": "\n * Translates codepoints to their unicode escaped value.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "below"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "above"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "between"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.translate.UnicodeEscaper.UnicodeEscaper()",
      "begin_line": 37,
      "end_line": 39,
      "comment": "\n     * \u003cp\u003eConstructs a \u003ccode\u003eUnicodeEscaper\u003c/code\u003e for all characters. \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 38,col 9)-(line 38,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.translate.UnicodeEscaper.UnicodeEscaper(int, int, boolean)",
      "begin_line": 51,
      "end_line": 55,
      "comment": "\n     * \u003cp\u003eConstructs a \u003ccode\u003eUnicodeEscaper\u003c/code\u003e for the specified range. This is\n     * the underlying method for the other constructors/builders. The \u003ccode\u003ebelow\u003c/code\u003e\n     * and \u003ccode\u003eabove\u003c/code\u003e boundaries are inclusive when \u003ccode\u003ebetween\u003c/code\u003e is\n     * \u003ccode\u003etrue\u003c/code\u003e and exclusive when it is \u003ccode\u003efalse\u003c/code\u003e. \u003c/p\u003e\n     *\n     * @param below int value representing the lowest codepoint boundary\n     * @param above int value representing the highest codepoint boundary\n     * @param between whether to escape between the boundaries or outside them\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 27)",
        "(line 53,col 9)-(line 53,col 27)",
        "(line 54,col 9)-(line 54,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.UnicodeEscaper.below(int)",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * \u003cp\u003eConstructs a \u003ccode\u003eUnicodeEscaper\u003c/code\u003e below the specified value (exclusive). \u003c/p\u003e\n     *\n     * @param codepoint below which to escape\n     * @return the newly created {@code UnicodeEscaper} instance\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.UnicodeEscaper.above(int)",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\n     * \u003cp\u003eConstructs a \u003ccode\u003eUnicodeEscaper\u003c/code\u003e above the specified value (exclusive). \u003c/p\u003e\n     *\n     * @param codepoint above which to escape\n     * @return the newly created {@code UnicodeEscaper} instance\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(int, int)",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * \u003cp\u003eConstructs a \u003ccode\u003eUnicodeEscaper\u003c/code\u003e outside of the specified values (exclusive). \u003c/p\u003e\n     *\n     * @param codepointLow below which to escape\n     * @param codepointHigh above which to escape\n     * @return the newly created {@code UnicodeEscaper} instance\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.UnicodeEscaper.between(int, int)",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\n     * \u003cp\u003eConstructs a \u003ccode\u003eUnicodeEscaper\u003c/code\u003e between the specified values (inclusive). \u003c/p\u003e\n     *\n     * @param codepointLow above which to escape\n     * @param codepointHigh below which to escape\n     * @return the newly created {@code UnicodeEscaper} instance\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.UnicodeEscaper.translate(int, java.io.Writer)",
      "begin_line": 102,
      "end_line": 129,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 112,col 9)",
        "(line 115,col 9)-(line 127,col 9)",
        "(line 128,col 9)-(line 128,col 20)"
      ]
    }
  ]
}