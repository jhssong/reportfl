{
  "filepath": "/tmp/Lang-8b/src/main/java/org/apache/commons/lang3/text/translate/NumericEntityUnescaper.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NumericEntityUnescaper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.text.translate.CharSequenceTranslator"
      ],
      "begin_line": 33,
      "end_line": 139,
      "comment": "\n * Translate XML numeric entities of the form \u0026#[xX]?\\d+;? to \n * the specific codepoint.\n *\n * Note that the semi-colon is optional.\n * \n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "options"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " TODO?: Create an OptionsSet class to hide some of the conditional logic below"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.translate.NumericEntityUnescaper.NumericEntityUnescaper(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION...)",
      "begin_line": 56,
      "end_line": 62,
      "comment": "\n     * Create a UnicodeUnescaper.\n     *\n     * The constructor takes a list of options, only one type of which is currently \n     * available (whether to allow, error or ignore the semi-colon on the end of a \n     * numeric entity to being missing).\n     *\n     * For example, to support numeric entities without a \u0027;\u0027:\n     *    new NumericEntityUnescaper(NumericEntityUnescaper.OPTION.semiColonOptional)\n     * and to throw an IllegalArgumentException when they\u0027re missing:\n     *    new NumericEntityUnescaper(NumericEntityUnescaper.OPTION.errorIfNoSemiColon)\n     *\n     * Note that the default behaviour is to ignore them. \n     *\n     * @param options to apply to this unescaper\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 61,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.NumericEntityUnescaper.isSet(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION)",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * Whether the passed in option is currently set.\n     *\n     * @param option to check state of\n     * @return whether the option is set\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.NumericEntityUnescaper.translate(java.lang.CharSequence, int, java.io.Writer)",
      "begin_line": 77,
      "end_line": 138,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 36)",
        "(line 81,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 137,col 17)"
      ]
    }
  ]
}