{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/multimap/AbstractSetValuedMap.java",
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
      "end_line": 143,
      "comment": "\n * Abstract implementation of the {@link SetValuedMap} interface to simplify the\n * creation of subclass implementations.\n * \u003cp\u003e\n * Subclasses specify a Map implementation to use as the internal storage and\n * the Set implementation to use as values.\n *\n * @since 4.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Serialization version "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractSetValuedMap.AbstractSetValuedMap(java.util.Map\u003cK, ? super C\u003e, java.lang.Class\u003cC\u003e)",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n     * A constructor that wraps, not copies\n     *\n     * @param \u003cC\u003e the set type\n     * @param map  the map to wrap, must not be null\n     * @param setClazz  the collection class\n     * @throws NullPointerException if the map is null\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractSetValuedMap.AbstractSetValuedMap(java.util.Map\u003cK, ? super C\u003e, java.lang.Class\u003cC\u003e, int)",
      "begin_line": 64,
      "end_line": 67,
      "comment": "\n     * A constructor that wraps, not copies\n     *\n     * @param \u003cC\u003e the set type\n     * @param map  the map to wrap, must not be null\n     * @param setClazz  the collection class\n     * @param initialSetCapacity  the initial size of the values set\n     * @throws NullPointerException if the map is null\n     * @throws IllegalArgumentException if initialSetCapacity is negative\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractSetValuedMap.get(K)",
      "begin_line": 77,
      "end_line": 80,
      "comment": "\n     * Gets the set of values associated with the specified key. This would\n     * return an empty set in case the mapping is not present\n     *\n     * @param key  the key to retrieve\n     * @return the \u003ccode\u003eSet\u003c/code\u003e of values, will return an empty\n     *   \u003ccode\u003eSet\u003c/code\u003e for no mapping\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractSetValuedMap.remove(java.lang.Object)",
      "begin_line": 91,
      "end_line": 94,
      "comment": "\n     * Removes all values associated with the specified key.\n     * \u003cp\u003e\n     * A subsequent \u003ccode\u003eget(Object)\u003c/code\u003e would return an empty set.\n     *\n     * @param key the key to remove values from\n     * @return the \u003ccode\u003eSet\u003c/code\u003e of values removed, will return an empty,\n     *   unmodifiable set for no mapping found.\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractSetValuedMap.equals(java.lang.Object)",
      "begin_line": 96,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 98,col 9)-(line 100,col 9)",
        "(line 101,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 104,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractSetValuedMap.hashCode()",
      "begin_line": 107,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 34)"
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
      "begin_line": 116,
      "end_line": 141,
      "comment": "\n     * Wrapped set to handle add and remove on the collection returned by\n     * {@code get(Object)}.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractSetValuedMap.WrappedSet.WrappedSet(K)",
      "begin_line": 118,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 119,col 13)-(line 119,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractSetValuedMap.WrappedSet.equals(java.lang.Object)",
      "begin_line": 122,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 124,col 13)-(line 124,col 53)",
        "(line 125,col 13)-(line 127,col 13)",
        "(line 128,col 13)-(line 130,col 13)",
        "(line 131,col 13)-(line 131,col 45)",
        "(line 132,col 13)-(line 132,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractSetValuedMap.WrappedSet.hashCode()",
      "begin_line": 135,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 137,col 13)-(line 137,col 53)",
        "(line 138,col 13)-(line 138,col 48)"
      ]
    }
  ]
}