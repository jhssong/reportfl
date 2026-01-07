{
  "filepath": "/tmp/Lang-21b/src/main/java/org/apache/commons/lang3/text/translate/UnicodeUnescaper.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnicodeUnescaper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.text.translate.CharSequenceTranslator"
      ],
      "begin_line": 32,
      "end_line": 108,
      "comment": "\n * Translates escaped unicode values of the form \\\\u+\\d\\d\\d\\d back to \n * unicode.\n * \n * @author Apache Software Foundation\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "options"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " TODO?: Create an OptionsSet class to hide some of the conditional logic below"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.translate.UnicodeUnescaper.UnicodeUnescaper(org.apache.commons.lang3.text.translate.UnicodeUnescaper.OPTION...)",
      "begin_line": 50,
      "end_line": 56,
      "comment": "\n     * Create a UnicodeUnescaper.\n     *\n     * The constructor takes a list of options, only one of which is currently \n     * available (whether to expect a plus sign after the \u0027u\u0027). \n     *\n     * For example, to handle \"\\\\u+0047\":\n     *    new UnicodeUnescaper(UnicodeUnescaper.OPTION.escapePlus)\n     *\n     * @param options to apply to this unescaper\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 55,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.UnicodeUnescaper.isSet(org.apache.commons.lang3.text.translate.UnicodeUnescaper.OPTION)",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * Whether the passed in option is currently set.\n     *\n     * @param option to check state of\n     * @return whether the option is set\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.UnicodeUnescaper.translate(java.lang.CharSequence, int, java.io.Writer)",
      "begin_line": 71,
      "end_line": 107,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 106,col 17)"
      ]
    }
  ]
}