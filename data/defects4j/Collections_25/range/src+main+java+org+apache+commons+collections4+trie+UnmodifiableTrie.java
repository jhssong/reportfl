{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/trie/UnmodifiableTrie.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnmodifiableTrie",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.Trie\u003cK, V\u003e",
        "java.io.Serializable",
        "org.apache.commons.collections4.Unmodifiable"
      ],
      "begin_line": 38,
      "end_line": 187,
      "comment": "\n * An unmodifiable {@link Trie}.\n *\n * @since 4.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Serialization version "
    },
    {
      "type": "field",
      "varNames": [
        "delegate"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.UnmodifiableTrie.unmodifiableTrie(org.apache.commons.collections4.Trie\u003cK, ? extends V\u003e)",
      "begin_line": 54,
      "end_line": 61,
      "comment": "\n     * Factory method to create a unmodifiable trie.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param trie  the trie to decorate, must not be null\n     * @return a new unmodifiable trie\n     * @throws IllegalArgumentException if trie is null\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 59,col 9)",
        "(line 60,col 9)-(line 60,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.trie.UnmodifiableTrie.UnmodifiableTrie(org.apache.commons.collections4.Trie\u003cK, ? extends V\u003e)",
      "begin_line": 70,
      "end_line": 77,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param trie  the trie to decorate, must not be null\n     * @throws IllegalArgumentException if trie is null\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 73,col 9)",
        "(line 74,col 9)-(line 75,col 53)",
        "(line 76,col 9)-(line 76,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.UnmodifiableTrie.entrySet()",
      "begin_line": 81,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.UnmodifiableTrie.keySet()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.UnmodifiableTrie.values()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.UnmodifiableTrie.clear()",
      "begin_line": 93,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.UnmodifiableTrie.containsKey(java.lang.Object)",
      "begin_line": 97,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.UnmodifiableTrie.containsValue(java.lang.Object)",
      "begin_line": 101,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.UnmodifiableTrie.get(java.lang.Object)",
      "begin_line": 105,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.UnmodifiableTrie.isEmpty()",
      "begin_line": 109,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.UnmodifiableTrie.put(K, V)",
      "begin_line": 113,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.UnmodifiableTrie.putAll(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 117,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.UnmodifiableTrie.remove(java.lang.Object)",
      "begin_line": 121,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.UnmodifiableTrie.size()",
      "begin_line": 125,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.UnmodifiableTrie.firstKey()",
      "begin_line": 129,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.UnmodifiableTrie.headMap(K)",
      "begin_line": 133,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.UnmodifiableTrie.lastKey()",
      "begin_line": 137,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.UnmodifiableTrie.subMap(K, K)",
      "begin_line": 141,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.UnmodifiableTrie.tailMap(K)",
      "begin_line": 145,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.UnmodifiableTrie.prefixMap(K)",
      "begin_line": 149,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.UnmodifiableTrie.comparator()",
      "begin_line": 153,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.UnmodifiableTrie.mapIterator()",
      "begin_line": 158,
      "end_line": 161,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 67)",
        "(line 160,col 9)-(line 160,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.UnmodifiableTrie.nextKey(K)",
      "begin_line": 163,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.UnmodifiableTrie.previousKey(K)",
      "begin_line": 167,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.UnmodifiableTrie.hashCode()",
      "begin_line": 172,
      "end_line": 175,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.UnmodifiableTrie.equals(java.lang.Object)",
      "begin_line": 177,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.UnmodifiableTrie.toString()",
      "begin_line": 182,
      "end_line": 185,
      "comment": "",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 35)"
      ]
    }
  ]
}