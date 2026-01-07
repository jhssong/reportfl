{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/multimap/AbstractListValuedMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractListValuedMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.multimap.AbstractMultiValuedMap\u003cK, V\u003e",
        "org.apache.commons.collections4.ListValuedMap\u003cK, V\u003e"
      ],
      "begin_line": 38,
      "end_line": 306,
      "comment": "\n * Abstract implementation of the {@link ListValuedMap} interface to simplify\n * the creation of subclass implementations.\n * \u003cp\u003e\n * Subclasses specify a Map implementation to use as the internal storage and\n * the List implementation to use as values.\n *\n * @since 4.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " The serialization version "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.AbstractListValuedMap(java.util.Map\u003cK, ? super C\u003e, java.lang.Class\u003cC\u003e)",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * A constructor that wraps, not copies\n     *\n     * @param \u003cC\u003e the list type\n     * @param map  the map to wrap, must not be null\n     * @param listClazz  the collection class\n     * @throws NullPointerException if the map is null\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.AbstractListValuedMap(java.util.Map\u003cK, ? super C\u003e, java.lang.Class\u003cC\u003e, int)",
      "begin_line": 66,
      "end_line": 69,
      "comment": "\n     * A constructor that wraps, not copies\n     *\n     * @param \u003cC\u003e the list type\n     * @param map  the map to wrap, must not be null\n     * @param listClazz  the collection class\n     * @param initialListCapacity  the initial size of the values list\n     * @throws NullPointerException  if the map is null\n     * @throws IllegalArgumentException  if initialListCapacity is negative\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.createCollection()",
      "begin_line": 75,
      "end_line": 78,
      "comment": "\n     * Creates a new value collection using the provided factory.\n     * @return a new list\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.get(K)",
      "begin_line": 87,
      "end_line": 90,
      "comment": "\n     * Gets the list of values associated with the specified key. This would\n     * return an empty list in case the mapping is not present\n     *\n     * @param key  the key to retrieve\n     * @return the {@code List} of values, will return an empty {@link List} for no mapping\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.remove(java.lang.Object)",
      "begin_line": 101,
      "end_line": 104,
      "comment": "\n     * Removes all values associated with the specified key.\n     * \u003cp\u003e\n     * A subsequent \u003ccode\u003eget(Object)\u003c/code\u003e would return an empty list.\n     *\n     * @param key  the key to remove values from\n     * @return the \u003ccode\u003eList\u003c/code\u003e of values removed, will return an empty,\n     *   unmodifiable list for no mapping found.\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.equals(java.lang.Object)",
      "begin_line": 106,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 108,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 113,col 9)",
        "(line 114,col 9)-(line 114,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.hashCode()",
      "begin_line": 117,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 34)"
      ]
    },
    {
      "type": "class_interface",
      "name": "WrappedList",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.WrappedCollection",
        "java.util.List\u003cV\u003e"
      ],
      "begin_line": 125,
      "end_line": 229,
      "comment": "\n     * Wrapped list to handle add and remove on the list returned by get(object)\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.WrappedList.WrappedList(K)",
      "begin_line": 127,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 128,col 13)-(line 128,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.WrappedList.getMapping()",
      "begin_line": 131,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 133,col 13)-(line 133,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.WrappedList.add(int, V)",
      "begin_line": 136,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 138,col 13)-(line 138,col 40)",
        "(line 139,col 13)-(line 142,col 13)",
        "(line 143,col 13)-(line 143,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.WrappedList.addAll(int, java.util.Collection\u003c? extends V\u003e)",
      "begin_line": 146,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 148,col 13)-(line 148,col 40)",
        "(line 149,col 13)-(line 156,col 13)",
        "(line 157,col 13)-(line 157,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.WrappedList.get(int)",
      "begin_line": 160,
      "end_line": 164,
      "comment": "",
      "child_ranges": [
        "(line 162,col 13)-(line 162,col 69)",
        "(line 163,col 13)-(line 163,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.WrappedList.indexOf(java.lang.Object)",
      "begin_line": 166,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 168,col 13)-(line 168,col 69)",
        "(line 169,col 13)-(line 169,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.WrappedList.lastIndexOf(java.lang.Object)",
      "begin_line": 172,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 174,col 13)-(line 174,col 69)",
        "(line 175,col 13)-(line 175,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.WrappedList.listIterator()",
      "begin_line": 178,
      "end_line": 181,
      "comment": "",
      "child_ranges": [
        "(line 180,col 13)-(line 180,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.WrappedList.listIterator(int)",
      "begin_line": 183,
      "end_line": 186,
      "comment": "",
      "child_ranges": [
        "(line 185,col 13)-(line 185,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.WrappedList.remove(int)",
      "begin_line": 188,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 190,col 13)-(line 190,col 69)",
        "(line 191,col 13)-(line 191,col 41)",
        "(line 192,col 13)-(line 194,col 13)",
        "(line 195,col 13)-(line 195,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.WrappedList.set(int, V)",
      "begin_line": 198,
      "end_line": 202,
      "comment": "",
      "child_ranges": [
        "(line 200,col 13)-(line 200,col 69)",
        "(line 201,col 13)-(line 201,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.WrappedList.subList(int, int)",
      "begin_line": 204,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 206,col 13)-(line 206,col 69)",
        "(line 207,col 13)-(line 207,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.WrappedList.equals(java.lang.Object)",
      "begin_line": 210,
      "end_line": 221,
      "comment": "",
      "child_ranges": [
        "(line 212,col 13)-(line 212,col 46)",
        "(line 213,col 13)-(line 215,col 13)",
        "(line 216,col 13)-(line 218,col 13)",
        "(line 219,col 13)-(line 219,col 48)",
        "(line 220,col 13)-(line 220,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.WrappedList.hashCode()",
      "begin_line": 223,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 225,col 13)-(line 225,col 46)",
        "(line 226,col 13)-(line 226,col 51)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ValuesListIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.ListIterator\u003cV\u003e"
      ],
      "begin_line": 232,
      "end_line": 304,
      "comment": " Values ListIterator "
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 234,
      "end_line": 234,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "values"
      ],
      "begin_line": 235,
      "end_line": 235,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "iterator"
      ],
      "begin_line": 236,
      "end_line": 236,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.ValuesListIterator.ValuesListIterator(K)",
      "begin_line": 238,
      "end_line": 242,
      "comment": "",
      "child_ranges": [
        "(line 239,col 13)-(line 239,col 27)",
        "(line 240,col 13)-(line 240,col 77)",
        "(line 241,col 13)-(line 241,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.ValuesListIterator.ValuesListIterator(K, int)",
      "begin_line": 244,
      "end_line": 248,
      "comment": "",
      "child_ranges": [
        "(line 245,col 13)-(line 245,col 27)",
        "(line 246,col 13)-(line 246,col 77)",
        "(line 247,col 13)-(line 247,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.ValuesListIterator.add(V)",
      "begin_line": 250,
      "end_line": 259,
      "comment": "",
      "child_ranges": [
        "(line 252,col 13)-(line 257,col 13)",
        "(line 258,col 13)-(line 258,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.ValuesListIterator.hasNext()",
      "begin_line": 261,
      "end_line": 264,
      "comment": "",
      "child_ranges": [
        "(line 263,col 13)-(line 263,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.ValuesListIterator.hasPrevious()",
      "begin_line": 266,
      "end_line": 269,
      "comment": "",
      "child_ranges": [
        "(line 268,col 13)-(line 268,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.ValuesListIterator.next()",
      "begin_line": 271,
      "end_line": 274,
      "comment": "",
      "child_ranges": [
        "(line 273,col 13)-(line 273,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.ValuesListIterator.nextIndex()",
      "begin_line": 276,
      "end_line": 279,
      "comment": "",
      "child_ranges": [
        "(line 278,col 13)-(line 278,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.ValuesListIterator.previous()",
      "begin_line": 281,
      "end_line": 284,
      "comment": "",
      "child_ranges": [
        "(line 283,col 13)-(line 283,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.ValuesListIterator.previousIndex()",
      "begin_line": 286,
      "end_line": 289,
      "comment": "",
      "child_ranges": [
        "(line 288,col 13)-(line 288,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.ValuesListIterator.remove()",
      "begin_line": 291,
      "end_line": 297,
      "comment": "",
      "child_ranges": [
        "(line 293,col 13)-(line 293,col 30)",
        "(line 294,col 13)-(line 296,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.ValuesListIterator.set(V)",
      "begin_line": 299,
      "end_line": 302,
      "comment": "",
      "child_ranges": [
        "(line 301,col 13)-(line 301,col 32)"
      ]
    }
  ]
}