{
  "filepath": "/tmp/Lang-26b/src/main/java/org/apache/commons/lang3/text/translate/UnicodeUnescaper.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnicodeUnescaper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.text.translate.CharSequenceTranslator"
      ],
      "begin_line": 33,
      "end_line": 92,
      "comment": "\n * Translates escaped unicode values of the form \\\\u+\\d\\d\\d\\d back to \n * unicode.\n * \n * @author Apache Software Foundation\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "options"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " TODO: Create an OptionsSet class to hide some of the conditional logic below"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.translate.UnicodeUnescaper.UnicodeUnescaper(org.apache.commons.lang3.text.translate.UnicodeUnescaper.OPTION...)",
      "begin_line": 40,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 41,col 9)-(line 45,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.UnicodeUnescaper.isSet(org.apache.commons.lang3.text.translate.UnicodeUnescaper.OPTION)",
      "begin_line": 48,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.UnicodeUnescaper.translate(java.lang.CharSequence, int, java.io.Writer)",
      "begin_line": 55,
      "end_line": 91,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 89,col 9)",
        "(line 90,col 9)-(line 90,col 17)"
      ]
    }
  ]
}