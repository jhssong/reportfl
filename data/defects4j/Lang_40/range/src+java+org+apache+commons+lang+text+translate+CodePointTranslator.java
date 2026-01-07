{
  "filepath": "/tmp/Lang-40b/src/java/org/apache/commons/lang/text/translate/CodePointTranslator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CodePointTranslator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.text.translate.CharSequenceTranslator"
      ],
      "begin_line": 27,
      "end_line": 54,
      "comment": "\n * Helper subclass to CharSequenceTranslator to allow for translations that \n * will replace up to one character at a time.\n * @since 3.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.translate.CodePointTranslator.translate(java.lang.CharSequence, int, java.io.Writer)",
      "begin_line": 33,
      "end_line": 42,
      "comment": "\n     * Implementation of translate that maps onto the abstract translate(int, Writer) method. \n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 35,col 9)-(line 35,col 60)",
        "(line 36,col 9)-(line 36,col 53)",
        "(line 37,col 9)-(line 41,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.translate.CodePointTranslator.translate(int, java.io.Writer)",
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * Translate the specified codepoint into another. \n     * \n     * @param codepoint int character input to translate\n     * @param out Writer to optionally push the translated output to\n     * @return boolean as to whether translation occurred or not\n     * @throws IOException if and only if the Writer produces an IOException\n     ",
      "child_ranges": []
    }
  ]
}