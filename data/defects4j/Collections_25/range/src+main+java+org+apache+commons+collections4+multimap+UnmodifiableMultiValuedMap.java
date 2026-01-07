{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/multimap/UnmodifiableMultiValuedMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnmodifiableMultiValuedMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator\u003cK, V\u003e",
        "org.apache.commons.collections4.Unmodifiable"
      ],
      "begin_line": 45,
      "end_line": 152,
      "comment": "\n * Decorates another {@link MultiValuedMap} to ensure it can\u0027t be altered.\n * \u003cp\u003e\n * Attempts to modify it will result in an UnsupportedOperationException.\n *\n * @param \u003cK\u003e the type of key elements\n * @param \u003cV\u003e the type of value elements\n *\n * @since 4.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Serialization version "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(org.apache.commons.collections4.MultiValuedMap\u003c? extends K, ? extends V\u003e)",
      "begin_line": 62,
      "end_line": 69,
      "comment": "\n     * Factory method to create an unmodifiable MultiValuedMap.\n     * \u003cp\u003e\n     * If the map passed in is already unmodifiable, it is returned.\n     *\n     * @param \u003cK\u003e the type of key elements\n     * @param \u003cV\u003e the type of value elements\n     * @param map the map to decorate, must not be null\n     * @return an unmodifiable MultiValuedMap\n     * @throws IllegalArgumentException if map is null\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 67,col 9)",
        "(line 68,col 9)-(line 68,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap.UnmodifiableMultiValuedMap(org.apache.commons.collections4.MultiValuedMap\u003c? extends K, ? extends V\u003e)",
      "begin_line": 77,
      "end_line": 80,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param map the MultiValuedMap to decorate, must not be null\n     * @throws IllegalArgumentException if the map is null\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap.remove(java.lang.Object)",
      "begin_line": 82,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap.removeMapping(K, V)",
      "begin_line": 87,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap.clear()",
      "begin_line": 92,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap.get(java.lang.Object)",
      "begin_line": 97,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap.put(K, V)",
      "begin_line": 102,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap.keySet()",
      "begin_line": 107,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap.entries()",
      "begin_line": 112,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap.keys()",
      "begin_line": 117,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap.values()",
      "begin_line": 122,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap.asMap()",
      "begin_line": 127,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap.mapIterator()",
      "begin_line": 132,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap.putAll(K, java.lang.Iterable\u003c? extends V\u003e)",
      "begin_line": 137,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap.putAll(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 142,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap.putAll(org.apache.commons.collections4.MultiValuedMap\u003c? extends K, ? extends V\u003e)",
      "begin_line": 147,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 50)"
      ]
    }
  ]
}