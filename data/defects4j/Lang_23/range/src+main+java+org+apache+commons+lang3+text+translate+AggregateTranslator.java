{
  "filepath": "/tmp/Lang-23b/src/main/java/org/apache/commons/lang3/text/translate/AggregateTranslator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AggregateTranslator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.text.translate.CharSequenceTranslator"
      ],
      "begin_line": 32,
      "end_line": 61,
      "comment": "\n * Executes a sequence of translators one after the other. Execution ends whenever \n * the first translator consumes codepoints from the input.\n * \n * @author Apache Software Foundation\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "translators"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.translate.AggregateTranslator.AggregateTranslator(org.apache.commons.lang3.text.translate.CharSequenceTranslator...)",
      "begin_line": 41,
      "end_line": 43,
      "comment": "\n     * Specify the translators to be used at creation time. \n     *\n     * @param translators CharSequenceTranslator array to aggregate\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.AggregateTranslator.translate(java.lang.CharSequence, int, java.io.Writer)",
      "begin_line": 50,
      "end_line": 59,
      "comment": "\n     * The first translator to consume codepoints from the input is the \u0027winner\u0027. \n     * Execution stops with the number of consumed codepoints being returned. \n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 57,col 9)",
        "(line 58,col 9)-(line 58,col 17)"
      ]
    }
  ]
}