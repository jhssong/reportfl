{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/text/translate/AggregateTranslator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AggregateTranslator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.text.translate.CharSequenceTranslator"
      ],
      "begin_line": 31,
      "end_line": 60,
      "comment": "\n * Executes a sequence of translators one after the other. Execution ends whenever \n * the first translator consumes codepoints from the input.\n * \n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "translators"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.translate.AggregateTranslator.AggregateTranslator(org.apache.commons.lang3.text.translate.CharSequenceTranslator...)",
      "begin_line": 40,
      "end_line": 42,
      "comment": "\n     * Specify the translators to be used at creation time. \n     *\n     * @param translators CharSequenceTranslator array to aggregate\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.AggregateTranslator.translate(java.lang.CharSequence, int, java.io.Writer)",
      "begin_line": 49,
      "end_line": 58,
      "comment": "\n     * The first translator to consume codepoints from the input is the \u0027winner\u0027. \n     * Execution stops with the number of consumed codepoints being returned. \n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 56,col 9)",
        "(line 57,col 9)-(line 57,col 17)"
      ]
    }
  ]
}