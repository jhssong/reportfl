{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/bidimap/UnmodifiableBidiMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnmodifiableBidiMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.bidimap.AbstractBidiMapDecorator\u003cK, V\u003e",
        "org.apache.commons.collections4.Unmodifiable"
      ],
      "begin_line": 37,
      "end_line": 136,
      "comment": "\n * Decorates another {@link BidiMap} to ensure it can\u0027t be altered.\n * \u003cp\u003e\n * Attempts to modify it will result in an UnsupportedOperationException.\n *\n * @since 3.0\n * @version $Id$\n "
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
      "signature": "org.apache.commons.collections4.bidimap.UnmodifiableBidiMap.unmodifiableBidiMap(org.apache.commons.collections4.BidiMap\u003c? extends K, ? extends V\u003e)",
      "begin_line": 55,
      "end_line": 62,
      "comment": "\n     * Factory method to create an unmodifiable map.\n     * \u003cp\u003e\n     * If the map passed in is already unmodifiable, it is returned.\n     *\n     * @param \u003cK\u003e the key type\n     * @param \u003cV\u003e the value type\n     * @param map  the map to decorate, must not be null\n     * @return an unmodifiable BidiMap\n     * @throws NullPointerException if map is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 60,col 9)",
        "(line 61,col 9)-(line 61,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.UnmodifiableBidiMap.UnmodifiableBidiMap(org.apache.commons.collections4.BidiMap\u003c? extends K, ? extends V\u003e)",
      "begin_line": 71,
      "end_line": 74,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param map  the map to decorate, must not be null\n     * @throws NullPointerException if map is null\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.UnmodifiableBidiMap.clear()",
      "begin_line": 77,
      "end_line": 80,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.UnmodifiableBidiMap.put(K, V)",
      "begin_line": 82,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.UnmodifiableBidiMap.putAll(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 87,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.UnmodifiableBidiMap.remove(java.lang.Object)",
      "begin_line": 92,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.UnmodifiableBidiMap.entrySet()",
      "begin_line": 97,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 58)",
        "(line 100,col 9)-(line 100,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.UnmodifiableBidiMap.keySet()",
      "begin_line": 103,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 42)",
        "(line 106,col 9)-(line 106,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.UnmodifiableBidiMap.values()",
      "begin_line": 109,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 42)",
        "(line 112,col 9)-(line 112,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.UnmodifiableBidiMap.removeValue(java.lang.Object)",
      "begin_line": 116,
      "end_line": 119,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.UnmodifiableBidiMap.mapIterator()",
      "begin_line": 121,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 63)",
        "(line 124,col 9)-(line 124,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.UnmodifiableBidiMap.inverseBidiMap()",
      "begin_line": 127,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 129,col 9)-(line 132,col 9)",
        "(line 133,col 9)-(line 133,col 23)"
      ]
    }
  ]
}