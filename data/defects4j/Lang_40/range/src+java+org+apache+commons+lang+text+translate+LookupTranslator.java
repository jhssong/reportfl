{
  "filepath": "/tmp/Lang-40b/src/java/org/apache/commons/lang/text/translate/LookupTranslator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LookupTranslator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.text.translate.CharSequenceTranslator"
      ],
      "begin_line": 28,
      "end_line": 73,
      "comment": " TODO: Replace with a RegexLookup? Performance test."
    },
    {
      "type": "field",
      "varNames": [
        "lookupMap"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "shortest"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "longest"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.translate.LookupTranslator.LookupTranslator(java.lang.CharSequence[][])",
      "begin_line": 39,
      "end_line": 51,
      "comment": "\n     * Define the lookup table to be used in translation\n     *\n     * @param lookup CharSequence[][] table of size [*][2]\n     ",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 62)",
        "(line 41,col 9)-(line 50,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.translate.LookupTranslator.translate(java.lang.CharSequence, int, java.io.Writer)",
      "begin_line": 56,
      "end_line": 72,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 26)",
        "(line 59,col 9)-(line 61,col 9)",
        "(line 63,col 9)-(line 70,col 9)",
        "(line 71,col 9)-(line 71,col 17)"
      ]
    }
  ]
}