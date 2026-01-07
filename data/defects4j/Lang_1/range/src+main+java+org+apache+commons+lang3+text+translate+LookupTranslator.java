{
  "filepath": "/tmp/Lang-1b/src/main/java/org/apache/commons/lang3/text/translate/LookupTranslator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LookupTranslator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.text.translate.CharSequenceTranslator"
      ],
      "begin_line": 29,
      "end_line": 85,
      "comment": "\n * Translates a value using a lookup table.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "lookupMap"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "shortest"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "longest"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.translate.LookupTranslator.LookupTranslator(java.lang.CharSequence[]...)",
      "begin_line": 45,
      "end_line": 63,
      "comment": "\n     * Define the lookup table to be used in translation\n     *\n     * Note that, as of Lang 3.1, the key to the lookup table is converted to a \n     * java.lang.String, while the value remains as a java.lang.CharSequence. \n     * This is because we need the key to support hashCode and equals(Object), \n     * allowing it to be the key for a HashMap. See LANG-882.\n     *\n     * @param lookup CharSequence[][] table of size [*][2]\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 56)",
        "(line 47,col 9)-(line 47,col 42)",
        "(line 48,col 9)-(line 48,col 25)",
        "(line 49,col 9)-(line 60,col 9)",
        "(line 61,col 9)-(line 61,col 29)",
        "(line 62,col 9)-(line 62,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.translate.LookupTranslator.translate(java.lang.CharSequence, int, java.io.Writer)",
      "begin_line": 68,
      "end_line": 84,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 26)",
        "(line 71,col 9)-(line 73,col 9)",
        "(line 75,col 9)-(line 82,col 9)",
        "(line 83,col 9)-(line 83,col 17)"
      ]
    }
  ]
}