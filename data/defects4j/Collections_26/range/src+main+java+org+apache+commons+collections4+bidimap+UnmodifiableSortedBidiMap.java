{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/bidimap/UnmodifiableSortedBidiMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnmodifiableSortedBidiMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.bidimap.AbstractSortedBidiMapDecorator\u003cK, V\u003e",
        "org.apache.commons.collections4.Unmodifiable"
      ],
      "begin_line": 39,
      "end_line": 158,
      "comment": "\n * Decorates another {@link SortedBidiMap} to ensure it can\u0027t be altered.\n * \u003cp\u003e\n * Attempts to modify it will result in an {@link UnsupportedOperationException}.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "inverse"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " The inverse unmodifiable map "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.UnmodifiableSortedBidiMap.unmodifiableSortedBidiMap(org.apache.commons.collections4.SortedBidiMap\u003cK, ? extends V\u003e)",
      "begin_line": 57,
      "end_line": 64,
      "comment": "\n     * Factory method to create an unmodifiable map.\n     * \u003cp\u003e\n     * If the map passed in is already unmodifiable, it is returned.\n     *\n     * @param \u003cK\u003e the key type\n     * @param \u003cV\u003e the value type\n     * @param map  the map to decorate, must not be null\n     * @return an unmodifiable SortedBidiMap\n     * @throws NullPointerException if map is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 62,col 9)",
        "(line 63,col 9)-(line 63,col 56)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.UnmodifiableSortedBidiMap.UnmodifiableSortedBidiMap(org.apache.commons.collections4.SortedBidiMap\u003cK, ? extends V\u003e)",
      "begin_line": 73,
      "end_line": 76,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param map  the map to decorate, must not be null\n     * @throws NullPointerException if map is null\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.UnmodifiableSortedBidiMap.clear()",
      "begin_line": 79,
      "end_line": 82,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.UnmodifiableSortedBidiMap.put(K, V)",
      "begin_line": 84,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.UnmodifiableSortedBidiMap.putAll(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 89,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.UnmodifiableSortedBidiMap.remove(java.lang.Object)",
      "begin_line": 94,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.UnmodifiableSortedBidiMap.entrySet()",
      "begin_line": 99,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 58)",
        "(line 102,col 9)-(line 102,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.UnmodifiableSortedBidiMap.keySet()",
      "begin_line": 105,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 42)",
        "(line 108,col 9)-(line 108,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.UnmodifiableSortedBidiMap.values()",
      "begin_line": 111,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 42)",
        "(line 114,col 9)-(line 114,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.UnmodifiableSortedBidiMap.removeValue(java.lang.Object)",
      "begin_line": 118,
      "end_line": 121,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.UnmodifiableSortedBidiMap.mapIterator()",
      "begin_line": 124,
      "end_line": 128,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 70)",
        "(line 127,col 9)-(line 127,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.UnmodifiableSortedBidiMap.inverseBidiMap()",
      "begin_line": 131,
      "end_line": 138,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 133,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 137,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.UnmodifiableSortedBidiMap.subMap(K, K)",
      "begin_line": 140,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 70)",
        "(line 143,col 9)-(line 143,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.UnmodifiableSortedBidiMap.headMap(K)",
      "begin_line": 146,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 62)",
        "(line 149,col 9)-(line 149,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.UnmodifiableSortedBidiMap.tailMap(K)",
      "begin_line": 152,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 64)",
        "(line 155,col 9)-(line 155,col 63)"
      ]
    }
  ]
}