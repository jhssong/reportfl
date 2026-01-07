{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/text/translate/UnicodeUnescaper.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnicodeUnescaper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.text.translate.CharSequenceTranslator"
      ],
      "begin_line": 31,
      "end_line": 107,
      "comment": "\n * Translates escaped unicode values of the form \\\\u+\\d\\d\\d\\d back to \n * unicode.\n * \n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "options"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " TODO?: Create an OptionsSet class to hide some of the conditional logic below"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.translate.UnicodeUnescaper.UnicodeUnescaper(org.apache.commons.lang3.text.translate.UnicodeUnescaper.OPTION...)",
      "begin_line": 49,
      "end_line": 55,
      "comment": "\n     * Create a UnicodeUnescaper.\n     *\n     * The constructor takes a list of options, only one of which is currently \n     * available (whether to expect a plus sign after the \u0027u\u0027). \n     *\n     * For example, to handle \"\\\\u+0047\":\n     *    new UnicodeUnescaper(UnicodeUnescaper.OPTION.escapePlus)\n     *\n     * @param options to apply to this unescaper\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 54,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.UnicodeUnescaper.isSet(org.apache.commons.lang3.text.translate.UnicodeUnescaper.OPTION)",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * Whether the passed in option is currently set.\n     *\n     * @param option to check state of\n     * @return whether the option is set\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.UnicodeUnescaper.translate(java.lang.CharSequence, int, java.io.Writer)",
      "begin_line": 70,
      "end_line": 106,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 105,col 17)"
      ]
    }
  ]
}