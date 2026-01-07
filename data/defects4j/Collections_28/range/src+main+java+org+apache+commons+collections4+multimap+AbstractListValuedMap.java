{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/multimap/AbstractListValuedMap.java",
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
      "end_line": 289,
      "comment": "\n * Abstract implementation of the {@link ListValuedMap} interface to simplify\n * the creation of subclass implementations.\n * \u003cp\u003e\n * Subclasses specify a Map implementation to use as the internal storage and\n * the List implementation to use as values.\n *\n * @since 4.1\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.AbstractListValuedMap()",
      "begin_line": 44,
      "end_line": 46,
      "comment": "\n     * Constructor needed for subclass serialisation.\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.AbstractListValuedMap(java.util.Map\u003cK, ? extends java.util.List\u003cV\u003e\u003e)",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * A constructor that wraps, not copies\n     *\n     * @param map  the map to wrap, must not be null\n     * @throws NullPointerException if the map is null\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.getMap()",
      "begin_line": 59,
      "end_line": 63,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.createCollection()",
      "begin_line": 69,
      "end_line": 70,
      "comment": "\n     * Creates a new value collection using the provided factory.\n     * @return a new list\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.get(K)",
      "begin_line": 80,
      "end_line": 83,
      "comment": "\n     * Gets the list of values associated with the specified key. This would\n     * return an empty list in case the mapping is not present\n     *\n     * @param key  the key to retrieve\n     * @return the {@code List} of values, will return an empty {@link List} for no mapping\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.wrappedCollection(K)",
      "begin_line": 85,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.remove(java.lang.Object)",
      "begin_line": 99,
      "end_line": 102,
      "comment": "\n     * Removes all values associated with the specified key.\n     * \u003cp\u003e\n     * A subsequent \u003ccode\u003eget(Object)\u003c/code\u003e would return an empty list.\n     *\n     * @param key  the key to remove values from\n     * @return the \u003ccode\u003eList\u003c/code\u003e of values removed, will return an empty,\n     *   unmodifiable list for no mapping found.\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 59)"
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
      "begin_line": 108,
      "end_line": 212,
      "comment": "\n     * Wrapped list to handle add and remove on the list returned by get(object)\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.WrappedList.WrappedList(K)",
      "begin_line": 110,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 111,col 13)-(line 111,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.WrappedList.getMapping()",
      "begin_line": 114,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 116,col 13)-(line 116,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.WrappedList.add(int, V)",
      "begin_line": 119,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 121,col 13)-(line 121,col 40)",
        "(line 122,col 13)-(line 125,col 13)",
        "(line 126,col 13)-(line 126,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.WrappedList.addAll(int, java.util.Collection\u003c? extends V\u003e)",
      "begin_line": 129,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 131,col 13)-(line 131,col 40)",
        "(line 132,col 13)-(line 139,col 13)",
        "(line 140,col 13)-(line 140,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.WrappedList.get(int)",
      "begin_line": 143,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 145,col 13)-(line 145,col 69)",
        "(line 146,col 13)-(line 146,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.WrappedList.indexOf(java.lang.Object)",
      "begin_line": 149,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 151,col 13)-(line 151,col 69)",
        "(line 152,col 13)-(line 152,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.WrappedList.lastIndexOf(java.lang.Object)",
      "begin_line": 155,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 157,col 13)-(line 157,col 69)",
        "(line 158,col 13)-(line 158,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.WrappedList.listIterator()",
      "begin_line": 161,
      "end_line": 164,
      "comment": "",
      "child_ranges": [
        "(line 163,col 13)-(line 163,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.WrappedList.listIterator(int)",
      "begin_line": 166,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 168,col 13)-(line 168,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.WrappedList.remove(int)",
      "begin_line": 171,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 173,col 13)-(line 173,col 69)",
        "(line 174,col 13)-(line 174,col 41)",
        "(line 175,col 13)-(line 177,col 13)",
        "(line 178,col 13)-(line 178,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.WrappedList.set(int, V)",
      "begin_line": 181,
      "end_line": 185,
      "comment": "",
      "child_ranges": [
        "(line 183,col 13)-(line 183,col 69)",
        "(line 184,col 13)-(line 184,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.WrappedList.subList(int, int)",
      "begin_line": 187,
      "end_line": 191,
      "comment": "",
      "child_ranges": [
        "(line 189,col 13)-(line 189,col 69)",
        "(line 190,col 13)-(line 190,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.WrappedList.equals(java.lang.Object)",
      "begin_line": 193,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 195,col 13)-(line 195,col 46)",
        "(line 196,col 13)-(line 198,col 13)",
        "(line 199,col 13)-(line 201,col 13)",
        "(line 202,col 13)-(line 202,col 48)",
        "(line 203,col 13)-(line 203,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.WrappedList.hashCode()",
      "begin_line": 206,
      "end_line": 210,
      "comment": "",
      "child_ranges": [
        "(line 208,col 13)-(line 208,col 46)",
        "(line 209,col 13)-(line 209,col 51)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ValuesListIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.ListIterator\u003cV\u003e"
      ],
      "begin_line": 215,
      "end_line": 287,
      "comment": " Values ListIterator "
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 217,
      "end_line": 217,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "values"
      ],
      "begin_line": 218,
      "end_line": 218,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "iterator"
      ],
      "begin_line": 219,
      "end_line": 219,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.ValuesListIterator.ValuesListIterator(K)",
      "begin_line": 221,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 222,col 13)-(line 222,col 27)",
        "(line 223,col 13)-(line 223,col 67)",
        "(line 224,col 13)-(line 224,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.ValuesListIterator.ValuesListIterator(K, int)",
      "begin_line": 227,
      "end_line": 231,
      "comment": "",
      "child_ranges": [
        "(line 228,col 13)-(line 228,col 27)",
        "(line 229,col 13)-(line 229,col 67)",
        "(line 230,col 13)-(line 230,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.ValuesListIterator.add(V)",
      "begin_line": 233,
      "end_line": 242,
      "comment": "",
      "child_ranges": [
        "(line 235,col 13)-(line 240,col 13)",
        "(line 241,col 13)-(line 241,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.ValuesListIterator.hasNext()",
      "begin_line": 244,
      "end_line": 247,
      "comment": "",
      "child_ranges": [
        "(line 246,col 13)-(line 246,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.ValuesListIterator.hasPrevious()",
      "begin_line": 249,
      "end_line": 252,
      "comment": "",
      "child_ranges": [
        "(line 251,col 13)-(line 251,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.ValuesListIterator.next()",
      "begin_line": 254,
      "end_line": 257,
      "comment": "",
      "child_ranges": [
        "(line 256,col 13)-(line 256,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.ValuesListIterator.nextIndex()",
      "begin_line": 259,
      "end_line": 262,
      "comment": "",
      "child_ranges": [
        "(line 261,col 13)-(line 261,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.ValuesListIterator.previous()",
      "begin_line": 264,
      "end_line": 267,
      "comment": "",
      "child_ranges": [
        "(line 266,col 13)-(line 266,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.ValuesListIterator.previousIndex()",
      "begin_line": 269,
      "end_line": 272,
      "comment": "",
      "child_ranges": [
        "(line 271,col 13)-(line 271,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.ValuesListIterator.remove()",
      "begin_line": 274,
      "end_line": 280,
      "comment": "",
      "child_ranges": [
        "(line 276,col 13)-(line 276,col 30)",
        "(line 277,col 13)-(line 279,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.ValuesListIterator.set(V)",
      "begin_line": 282,
      "end_line": 285,
      "comment": "",
      "child_ranges": [
        "(line 284,col 13)-(line 284,col 32)"
      ]
    }
  ]
}