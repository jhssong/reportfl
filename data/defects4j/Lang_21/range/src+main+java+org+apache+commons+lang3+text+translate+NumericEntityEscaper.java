{
  "filepath": "/tmp/Lang-21b/src/main/java/org/apache/commons/lang3/text/translate/NumericEntityEscaper.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NumericEntityEscaper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.text.translate.CodePointTranslator"
      ],
      "begin_line": 29,
      "end_line": 116,
      "comment": "\n * Translates codepoints to their XML numeric entity escaped value.\n * \n * @author Apache Software Foundation\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "below"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "above"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "between"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.translate.NumericEntityEscaper.NumericEntityEscaper(int, int, boolean)",
      "begin_line": 45,
      "end_line": 49,
      "comment": "\n     * \u003cp\u003eConstructs a \u003ccode\u003eNumericEntityEscaper\u003c/code\u003e for the specified range. This is \n     * the underlying method for the other constructors/builders. The \u003ccode\u003ebelow\u003c/code\u003e\n     * and \u003ccode\u003eabove\u003c/code\u003e boundaries are inclusive when \u003ccode\u003ebetween\u003c/code\u003e is \n     * \u003ccode\u003etrue\u003c/code\u003e and exclusive when it is \u003ccode\u003efalse\u003c/code\u003e. \u003c/p\u003e\n     *\n     * @param below int value representing the lowest codepoint boundary\n     * @param above int value representing the highest codepoint boundary\n     * @param between whether to escape between the boundaries or outside them\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 27)",
        "(line 47,col 9)-(line 47,col 27)",
        "(line 48,col 9)-(line 48,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.translate.NumericEntityEscaper.NumericEntityEscaper()",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * \u003cp\u003eConstructs a \u003ccode\u003eNumericEntityEscaper\u003c/code\u003e for all characters. \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.NumericEntityEscaper.below(int)",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * \u003cp\u003eConstructs a \u003ccode\u003eNumericEntityEscaper\u003c/code\u003e below the specified value (exclusive). \u003c/p\u003e\n     *\n     * @param codepoint below which to escape\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.NumericEntityEscaper.above(int)",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\n     * \u003cp\u003eConstructs a \u003ccode\u003eNumericEntityEscaper\u003c/code\u003e above the specified value (exclusive). \u003c/p\u003e\n     *\n     * @param codepoint above which to escape\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(int, int)",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\n     * \u003cp\u003eConstructs a \u003ccode\u003eNumericEntityEscaper\u003c/code\u003e between the specified values (inclusive). \u003c/p\u003e\n     *\n     * @param codepointLow above which to escape\n     * @param codepointHigh below which to escape\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(int, int)",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n     * \u003cp\u003eConstructs a \u003ccode\u003eNumericEntityEscaper\u003c/code\u003e outside of the specified values (exclusive). \u003c/p\u003e\n     *\n     * @param codepointLow below which to escape\n     * @param codepointHigh above which to escape\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.NumericEntityEscaper.translate(int, java.io.Writer)",
      "begin_line": 99,
      "end_line": 115,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 109,col 9)",
        "(line 111,col 9)-(line 111,col 24)",
        "(line 112,col 9)-(line 112,col 51)",
        "(line 113,col 9)-(line 113,col 23)",
        "(line 114,col 9)-(line 114,col 20)"
      ]
    }
  ]
}