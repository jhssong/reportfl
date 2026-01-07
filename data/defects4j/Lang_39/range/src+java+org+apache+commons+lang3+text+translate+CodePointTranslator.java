{
  "filepath": "/tmp/Lang-39b/src/java/org/apache/commons/lang3/text/translate/CodePointTranslator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CodePointTranslator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.text.translate.CharSequenceTranslator"
      ],
      "begin_line": 29,
      "end_line": 56,
      "comment": "\n * Helper subclass to CharSequenceTranslator to allow for translations that \n * will replace up to one character at a time.\n * \n * @author Apache Software Foundation\n * @since 3.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.CodePointTranslator.translate(java.lang.CharSequence, int, java.io.Writer)",
      "begin_line": 35,
      "end_line": 44,
      "comment": "\n     * Implementation of translate that maps onto the abstract translate(int, Writer) method. \n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 60)",
        "(line 38,col 9)-(line 38,col 53)",
        "(line 39,col 9)-(line 43,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.CodePointTranslator.translate(int, java.io.Writer)",
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n     * Translate the specified codepoint into another. \n     * \n     * @param codepoint int character input to translate\n     * @param out Writer to optionally push the translated output to\n     * @return boolean as to whether translation occurred or not\n     * @throws IOException if and only if the Writer produces an IOException\n     ",
      "child_ranges": []
    }
  ]
}