{
  "filepath": "/tmp/Lang-41b/src/java/org/apache/commons/lang/text/translate/AggregateTranslator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AggregateTranslator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.text.translate.CharSequenceTranslator"
      ],
      "begin_line": 27,
      "end_line": 55,
      "comment": "\n * Executes a sequence of translators one after the other. Execution ends whenever \n * the first translator consumes codepoints from the input. \n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "translators"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.translate.AggregateTranslator.AggregateTranslator(org.apache.commons.lang.text.translate.CharSequenceTranslator...)",
      "begin_line": 36,
      "end_line": 38,
      "comment": "\n     * Specify the translators to be used at creation time. \n     *\n     * @param translators CharSequenceTranslator array to aggregate\n     ",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.translate.AggregateTranslator.translate(java.lang.CharSequence, int, java.io.Writer)",
      "begin_line": 45,
      "end_line": 53,
      "comment": "\n     * The first translator to consume codepoints from the input is the \u0027winner\u0027. \n     * Execution stops with the number of consumed codepoints being returned. \n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 51,col 9)",
        "(line 52,col 9)-(line 52,col 17)"
      ]
    }
  ]
}