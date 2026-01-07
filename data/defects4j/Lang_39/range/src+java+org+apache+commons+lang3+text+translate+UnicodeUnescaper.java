{
  "filepath": "/tmp/Lang-39b/src/java/org/apache/commons/lang3/text/translate/UnicodeUnescaper.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnicodeUnescaper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.text.translate.CharSequenceTranslator"
      ],
      "begin_line": 32,
      "end_line": 91,
      "comment": "\n * Translates escaped unicode values of the form \\\\u+\\d\\d\\d\\d back to \n * unicode.\n * \n * @author Apache Software Foundation\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "options"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " TODO: Create an OptionsSet class to hide some of the conditional logic below"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.translate.UnicodeUnescaper.UnicodeUnescaper(org.apache.commons.lang3.text.translate.UnicodeUnescaper.OPTION...)",
      "begin_line": 39,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 40,col 9)-(line 44,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.UnicodeUnescaper.isSet(org.apache.commons.lang3.text.translate.UnicodeUnescaper.OPTION)",
      "begin_line": 47,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.UnicodeUnescaper.translate(java.lang.CharSequence, int, java.io.Writer)",
      "begin_line": 54,
      "end_line": 90,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 88,col 9)",
        "(line 89,col 9)-(line 89,col 17)"
      ]
    }
  ]
}