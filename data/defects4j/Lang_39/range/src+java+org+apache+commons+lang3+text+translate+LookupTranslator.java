{
  "filepath": "/tmp/Lang-39b/src/java/org/apache/commons/lang3/text/translate/LookupTranslator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LookupTranslator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.text.translate.CharSequenceTranslator"
      ],
      "begin_line": 30,
      "end_line": 79,
      "comment": " TODO: Replace with a RegexLookup? Performance test."
    },
    {
      "type": "field",
      "varNames": [
        "lookupMap"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "shortest"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "longest"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.translate.LookupTranslator.LookupTranslator(java.lang.CharSequence[][])",
      "begin_line": 41,
      "end_line": 57,
      "comment": "\n     * Define the lookup table to be used in translation\n     *\n     * @param lookup CharSequence[][] table of size [*][2]\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 62)",
        "(line 43,col 9)-(line 43,col 42)",
        "(line 44,col 9)-(line 44,col 25)",
        "(line 45,col 9)-(line 54,col 9)",
        "(line 55,col 9)-(line 55,col 29)",
        "(line 56,col 9)-(line 56,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.LookupTranslator.translate(java.lang.CharSequence, int, java.io.Writer)",
      "begin_line": 62,
      "end_line": 78,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 26)",
        "(line 65,col 9)-(line 67,col 9)",
        "(line 69,col 9)-(line 76,col 9)",
        "(line 77,col 9)-(line 77,col 17)"
      ]
    }
  ]
}