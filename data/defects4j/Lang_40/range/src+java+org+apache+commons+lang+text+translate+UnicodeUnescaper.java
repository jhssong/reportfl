{
  "filepath": "/tmp/Lang-40b/src/java/org/apache/commons/lang/text/translate/UnicodeUnescaper.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnicodeUnescaper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.text.translate.CharSequenceTranslator"
      ],
      "begin_line": 30,
      "end_line": 90,
      "comment": "\n * Translates escaped unicode values of the form \\\\u+\\d\\d\\d\\d back to \n * unicode.\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "options"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " TODO: Create an OptionsSet class to hide some of the conditional logic below"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.translate.UnicodeUnescaper.UnicodeUnescaper(org.apache.commons.lang.text.translate.UnicodeUnescaper.OPTION...)",
      "begin_line": 37,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 38,col 9)-(line 42,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.translate.UnicodeUnescaper.isSet(org.apache.commons.lang.text.translate.UnicodeUnescaper.OPTION)",
      "begin_line": 45,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.translate.UnicodeUnescaper.translate(java.lang.CharSequence, int, java.io.Writer)",
      "begin_line": 53,
      "end_line": 89,
      "comment": " TODO: Handle \\\\u+0045 variant",
      "child_ranges": [
        "(line 55,col 9)-(line 87,col 9)",
        "(line 88,col 9)-(line 88,col 17)"
      ]
    }
  ]
}