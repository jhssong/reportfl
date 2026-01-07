{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/trie/analyzer/StringKeyAnalyzer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StringKeyAnalyzer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.trie.KeyAnalyzer\u003cjava.lang.String\u003e"
      ],
      "begin_line": 27,
      "end_line": 136,
      "comment": "\n * An {@link KeyAnalyzer} for {@link String}s.\n *\n * @since 4.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " A singleton instance of {@link StringKeyAnalyzer}. "
    },
    {
      "type": "field",
      "varNames": [
        "LENGTH"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " The number of bits per {@link Character}. "
    },
    {
      "type": "field",
      "varNames": [
        "MSB"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " A bit mask where the first bit is 1 and the others are zero. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer.mask(int)",
      "begin_line": 41,
      "end_line": 43,
      "comment": " Returns a bit mask where the given bit is set. ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer.bitsPerElement()",
      "begin_line": 45,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer.lengthInBits(java.lang.String)",
      "begin_line": 50,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer.bitIndex(java.lang.String, int, int, java.lang.String, int, int)",
      "begin_line": 55,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 31)",
        "(line 61,col 9)-(line 64,col 9)",
        "(line 66,col 9)-(line 66,col 54)",
        "(line 67,col 9)-(line 67,col 59)",
        "(line 69,col 9)-(line 69,col 66)",
        "(line 70,col 9)-(line 70,col 71)",
        "(line 72,col 9)-(line 72,col 58)",
        "(line 77,col 9)-(line 77,col 26)",
        "(line 78,col 9)-(line 102,col 9)",
        "(line 105,col 9)-(line 107,col 9)",
        "(line 110,col 9)-(line 110,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer.isBitSet(java.lang.String, int, int)",
      "begin_line": 113,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 115,col 9)-(line 117,col 9)",
        "(line 119,col 9)-(line 119,col 44)",
        "(line 120,col 9)-(line 120,col 42)",
        "(line 122,col 9)-(line 122,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer.isPrefix(java.lang.String, int, int, java.lang.String)",
      "begin_line": 125,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 128,col 9)-(line 131,col 9)",
        "(line 133,col 9)-(line 133,col 89)",
        "(line 134,col 9)-(line 134,col 34)"
      ]
    }
  ]
}