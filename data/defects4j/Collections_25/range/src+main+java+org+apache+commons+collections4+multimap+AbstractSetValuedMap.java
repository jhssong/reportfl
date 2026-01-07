{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/multimap/AbstractSetValuedMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractSetValuedMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.multimap.AbstractMultiValuedMap\u003cK, V\u003e",
        "org.apache.commons.collections4.SetValuedMap\u003cK, V\u003e"
      ],
      "begin_line": 39,
      "end_line": 183,
      "comment": "\n * Abstract implementation of the {@link SetValuedMap} interface to simplify the\n * creation of subclass implementations.\n * \u003cp\u003e\n * Subclasses specify a Map implementation to use as the internal storage and\n * the Set implementation to use as values.\n *\n * @since 4.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Serialization version "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractSetValuedMap.AbstractSetValuedMap(java.util.Map\u003cK, ? super C\u003e, java.lang.Class\u003cC\u003e)",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * A constructor that wraps, not copies\n     *\n     * @param \u003cC\u003e the set type\n     * @param map the map to wrap, must not be null\n     * @param setClazz the collection class\n     * @throws NullPointerException if the map is null\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractSetValuedMap.AbstractSetValuedMap(java.util.Map\u003cK, ? super C\u003e, java.lang.Class\u003cC\u003e, int)",
      "begin_line": 66,
      "end_line": 69,
      "comment": "\n     * A constructor that wraps, not copies\n     *\n     * @param \u003cC\u003e the set type\n     * @param map the map to wrap, must not be null\n     * @param setClazz the collection class\n     * @param initialSetCapacity the initial size of the values set\n     * @throws NullPointerException if the map is null\n     * @throws IllegalArgumentException if initialSetCapacity is negative\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractSetValuedMap.get(java.lang.Object)",
      "begin_line": 80,
      "end_line": 83,
      "comment": "\n     * Gets the set of values associated with the specified key. This would\n     * return an empty set in case the mapping is not present\n     *\n     * @param key the key to retrieve\n     * @return the \u003ccode\u003eSet\u003c/code\u003e of values, will return an empty\n     *         \u003ccode\u003eSet\u003c/code\u003e for no mapping\n     * @throws ClassCastException if the key is of an invalid type\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractSetValuedMap.remove(java.lang.Object)",
      "begin_line": 95,
      "end_line": 98,
      "comment": "\n     * Removes all values associated with the specified key.\n     * \u003cp\u003e\n     * A subsequent \u003ccode\u003eget(Object)\u003c/code\u003e would return an empty set.\n     *\n     * @param key the key to remove values from\n     * @return the \u003ccode\u003eSet\u003c/code\u003e of values removed, will return an empty,\n     *         unmodifiable set for no mapping found.\n     * @throws ClassCastException if the key is of an invalid type\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractSetValuedMap.equals(java.lang.Object)",
      "begin_line": 100,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 102,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 111,col 60)",
        "(line 112,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 115,col 45)",
        "(line 116,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractSetValuedMap.hashCode()",
      "begin_line": 130,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 18)",
        "(line 133,col 9)-(line 133,col 78)",
        "(line 134,col 9)-(line 139,col 9)",
        "(line 140,col 9)-(line 140,col 17)"
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
      "begin_line": 147,
      "end_line": 181,
      "comment": "\n     * Wrapped set to handle add and remove on the collection returned by\n     * get(object)\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractSetValuedMap.WrappedSet.WrappedSet(java.lang.Object)",
      "begin_line": 149,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 150,col 13)-(line 150,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractSetValuedMap.WrappedSet.equals(java.lang.Object)",
      "begin_line": 153,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 155,col 13)-(line 155,col 53)",
        "(line 156,col 13)-(line 158,col 13)",
        "(line 159,col 13)-(line 161,col 13)",
        "(line 162,col 13)-(line 164,col 13)",
        "(line 165,col 13)-(line 165,col 45)",
        "(line 166,col 13)-(line 168,col 13)",
        "(line 169,col 13)-(line 169,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractSetValuedMap.WrappedSet.hashCode()",
      "begin_line": 172,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 174,col 13)-(line 174,col 53)",
        "(line 175,col 13)-(line 177,col 13)",
        "(line 178,col 13)-(line 178,col 48)"
      ]
    }
  ]
}