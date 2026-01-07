{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/bidimap/UnmodifiableOrderedBidiMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnmodifiableOrderedBidiMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.bidimap.AbstractOrderedBidiMapDecorator\u003cK, V\u003e",
        "org.apache.commons.collections4.Unmodifiable"
      ],
      "begin_line": 37,
      "end_line": 147,
      "comment": "\n * Decorates another {@link OrderedBidiMap} to ensure it can\u0027t be altered.\n * \u003cp\u003e\n * Attempts to modify it will result in an UnsupportedOperationException.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "inverse"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " The inverse unmodifiable map "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.UnmodifiableOrderedBidiMap.unmodifiableOrderedBidiMap(org.apache.commons.collections4.OrderedBidiMap\u003c? extends K, ? extends V\u003e)",
      "begin_line": 55,
      "end_line": 63,
      "comment": "\n     * Factory method to create an unmodifiable map.\n     * \u003cp\u003e\n     * If the map passed in is already unmodifiable, it is returned.\n     *\n     * @param \u003cK\u003e the key type\n     * @param \u003cV\u003e the value type\n     * @param map  the map to decorate, must not be null\n     * @return an unmodifiable OrderedBidiMap\n     * @throws NullPointerException if map is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 61,col 9)",
        "(line 62,col 9)-(line 62,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.UnmodifiableOrderedBidiMap.UnmodifiableOrderedBidiMap(org.apache.commons.collections4.OrderedBidiMap\u003c? extends K, ? extends V\u003e)",
      "begin_line": 72,
      "end_line": 75,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param map  the map to decorate, must not be null\n     * @throws NullPointerException if map is null\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.UnmodifiableOrderedBidiMap.clear()",
      "begin_line": 78,
      "end_line": 81,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.UnmodifiableOrderedBidiMap.put(K, V)",
      "begin_line": 83,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.UnmodifiableOrderedBidiMap.putAll(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 88,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.UnmodifiableOrderedBidiMap.remove(java.lang.Object)",
      "begin_line": 93,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.UnmodifiableOrderedBidiMap.entrySet()",
      "begin_line": 98,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 58)",
        "(line 101,col 9)-(line 101,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.UnmodifiableOrderedBidiMap.keySet()",
      "begin_line": 104,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 42)",
        "(line 107,col 9)-(line 107,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.UnmodifiableOrderedBidiMap.values()",
      "begin_line": 110,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 42)",
        "(line 113,col 9)-(line 113,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.UnmodifiableOrderedBidiMap.removeValue(java.lang.Object)",
      "begin_line": 117,
      "end_line": 120,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.UnmodifiableOrderedBidiMap.inverseBidiMap()",
      "begin_line": 122,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.UnmodifiableOrderedBidiMap.mapIterator()",
      "begin_line": 128,
      "end_line": 132,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 70)",
        "(line 131,col 9)-(line 131,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.UnmodifiableOrderedBidiMap.inverseOrderedBidiMap()",
      "begin_line": 139,
      "end_line": 145,
      "comment": "\n     * Gets an unmodifiable view of this map where the keys and values are reversed.\n     *\n     * @return an inverted unmodifiable bidirectional map\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 144,col 23)"
      ]
    }
  ]
}