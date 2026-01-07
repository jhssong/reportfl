{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/trie/UnmodifiableTrie.java",
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
      "end_line": 209,
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
      "comment": "\n     * Factory method to create a unmodifiable trie.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param trie  the trie to decorate, must not be null\n     * @return a new unmodifiable trie\n     * @throws NullPointerException if trie is null\n     ",
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
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param trie  the trie to decorate, must not be null\n     * @throws NullPointerException if trie is null\n     ",
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
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.UnmodifiableTrie.keySet()",
      "begin_line": 86,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.UnmodifiableTrie.values()",
      "begin_line": 91,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.UnmodifiableTrie.clear()",
      "begin_line": 96,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.UnmodifiableTrie.containsKey(java.lang.Object)",
      "begin_line": 101,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.UnmodifiableTrie.containsValue(java.lang.Object)",
      "begin_line": 106,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.UnmodifiableTrie.get(java.lang.Object)",
      "begin_line": 111,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.UnmodifiableTrie.isEmpty()",
      "begin_line": 116,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.UnmodifiableTrie.put(K, V)",
      "begin_line": 121,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.UnmodifiableTrie.putAll(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 126,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.UnmodifiableTrie.remove(java.lang.Object)",
      "begin_line": 131,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.UnmodifiableTrie.size()",
      "begin_line": 136,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.UnmodifiableTrie.firstKey()",
      "begin_line": 141,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.UnmodifiableTrie.headMap(K)",
      "begin_line": 146,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.UnmodifiableTrie.lastKey()",
      "begin_line": 151,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.UnmodifiableTrie.subMap(K, K)",
      "begin_line": 156,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.UnmodifiableTrie.tailMap(K)",
      "begin_line": 161,
      "end_line": 164,
      "comment": "",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.UnmodifiableTrie.prefixMap(K)",
      "begin_line": 166,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.UnmodifiableTrie.comparator()",
      "begin_line": 171,
      "end_line": 174,
      "comment": "",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.UnmodifiableTrie.mapIterator()",
      "begin_line": 177,
      "end_line": 181,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 67)",
        "(line 180,col 9)-(line 180,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.UnmodifiableTrie.nextKey(K)",
      "begin_line": 183,
      "end_line": 186,
      "comment": "",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.UnmodifiableTrie.previousKey(K)",
      "begin_line": 188,
      "end_line": 191,
      "comment": "",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.UnmodifiableTrie.hashCode()",
      "begin_line": 194,
      "end_line": 197,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.UnmodifiableTrie.equals(java.lang.Object)",
      "begin_line": 199,
      "end_line": 202,
      "comment": "",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.UnmodifiableTrie.toString()",
      "begin_line": 204,
      "end_line": 207,
      "comment": "",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 35)"
      ]
    }
  ]
}