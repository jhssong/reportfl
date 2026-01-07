{
  "filepath": "/tmp/Lang-22b/src/main/java/org/apache/commons/lang3/text/translate/LookupTranslator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LookupTranslator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.text.translate.CharSequenceTranslator"
      ],
      "begin_line": 31,
      "end_line": 80,
      "comment": " TODO: Replace with a RegexLookup? Performance test."
    },
    {
      "type": "field",
      "varNames": [
        "lookupMap"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "shortest"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "longest"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.translate.LookupTranslator.LookupTranslator(java.lang.CharSequence[][])",
      "begin_line": 42,
      "end_line": 58,
      "comment": "\n     * Define the lookup table to be used in translation\n     *\n     * @param lookup CharSequence[][] table of size [*][2]\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 62)",
        "(line 44,col 9)-(line 44,col 42)",
        "(line 45,col 9)-(line 45,col 25)",
        "(line 46,col 9)-(line 55,col 9)",
        "(line 56,col 9)-(line 56,col 29)",
        "(line 57,col 9)-(line 57,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.LookupTranslator.translate(java.lang.CharSequence, int, java.io.Writer)",
      "begin_line": 63,
      "end_line": 79,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 26)",
        "(line 66,col 9)-(line 68,col 9)",
        "(line 70,col 9)-(line 77,col 9)",
        "(line 78,col 9)-(line 78,col 17)"
      ]
    }
  ]
}