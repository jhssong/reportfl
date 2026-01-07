{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/multimap/AbstractSetValuedMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractSetValuedMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.multimap.AbstractMultiValuedMap\u003cK, V\u003e",
        "org.apache.commons.collections4.SetValuedMap\u003cK, V\u003e"
      ],
      "begin_line": 36,
      "end_line": 135,
      "comment": "\n * Abstract implementation of the {@link SetValuedMap} interface to simplify the\n * creation of subclass implementations.\n * \u003cp\u003e\n * Subclasses specify a Map implementation to use as the internal storage and\n * the Set implementation to use as values.\n *\n * @since 4.1\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractSetValuedMap.AbstractSetValuedMap()",
      "begin_line": 42,
      "end_line": 44,
      "comment": "\n     * Constructor needed for subclass serialisation.\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractSetValuedMap.AbstractSetValuedMap(java.util.Map\u003cK, ? extends java.util.Set\u003cV\u003e\u003e)",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * A constructor that wraps, not copies\n     *\n     * @param map  the map to wrap, must not be null\n     * @throws NullPointerException if the map is null\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractSetValuedMap.getMap()",
      "begin_line": 57,
      "end_line": 61,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractSetValuedMap.createCollection()",
      "begin_line": 67,
      "end_line": 68,
      "comment": "\n     * Creates a new value collection using the provided factory.\n     * @return a new list\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractSetValuedMap.get(K)",
      "begin_line": 79,
      "end_line": 82,
      "comment": "\n     * Gets the set of values associated with the specified key. This would\n     * return an empty set in case the mapping is not present\n     *\n     * @param key  the key to retrieve\n     * @return the \u003ccode\u003eSet\u003c/code\u003e of values, will return an empty\n     *   \u003ccode\u003eSet\u003c/code\u003e for no mapping\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractSetValuedMap.wrappedCollection(K)",
      "begin_line": 84,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractSetValuedMap.remove(java.lang.Object)",
      "begin_line": 98,
      "end_line": 101,
      "comment": "\n     * Removes all values associated with the specified key.\n     * \u003cp\u003e\n     * A subsequent \u003ccode\u003eget(Object)\u003c/code\u003e would return an empty set.\n     *\n     * @param key the key to remove values from\n     * @return the \u003ccode\u003eSet\u003c/code\u003e of values removed, will return an empty,\n     *   unmodifiable set for no mapping found.\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 58)"
      ]
    },
    {
      "type": "class_interface",
      "name": "WrappedSet",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.WrappedCollection",
        "java.util.Set\u003cV\u003e"
      ],
      "begin_line": 108,
      "end_line": 133,
      "comment": "\n     * Wrapped set to handle add and remove on the collection returned by\n     * {@code get(Object)}.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractSetValuedMap.WrappedSet.WrappedSet(K)",
      "begin_line": 110,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 111,col 13)-(line 111,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractSetValuedMap.WrappedSet.equals(java.lang.Object)",
      "begin_line": 114,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 116,col 13)-(line 116,col 53)",
        "(line 117,col 13)-(line 119,col 13)",
        "(line 120,col 13)-(line 122,col 13)",
        "(line 123,col 13)-(line 123,col 45)",
        "(line 124,col 13)-(line 124,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractSetValuedMap.WrappedSet.hashCode()",
      "begin_line": 127,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 129,col 13)-(line 129,col 53)",
        "(line 130,col 13)-(line 130,col 48)"
      ]
    }
  ]
}