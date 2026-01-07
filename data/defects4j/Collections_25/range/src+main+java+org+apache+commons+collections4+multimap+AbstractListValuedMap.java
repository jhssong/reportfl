{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/multimap/AbstractListValuedMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractListValuedMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.multimap.AbstractMultiValuedMap\u003cK, V\u003e",
        "org.apache.commons.collections4.ListValuedMap\u003cK, V\u003e"
      ],
      "begin_line": 40,
      "end_line": 318,
      "comment": "\n * Abstract implementation of the {@link ListValuedMap} interface to simplify\n * the creation of subclass implementations.\n * \u003cp\u003e\n * Subclasses specify a Map implementation to use as the internal storage and\n * the List implementation to use as values.\n *\n * @since 4.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " The serialization version "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.AbstractListValuedMap(java.util.Map\u003cK, ? super C\u003e, java.lang.Class\u003cC\u003e)",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * A constructor that wraps, not copies\n     *\n     * @param \u003cC\u003e the list type\n     * @param map the map to wrap, must not be null\n     * @param listClazz the collection class\n     * @throws NullPointerException if the map is null\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.AbstractListValuedMap(java.util.Map\u003cK, ? super C\u003e, java.lang.Class\u003cC\u003e, int)",
      "begin_line": 68,
      "end_line": 71,
      "comment": "\n     * A constructor that wraps, not copies\n     *\n     * @param \u003cC\u003e the list type\n     * @param map the map to wrap, must not be null\n     * @param listClazz the collection class\n     * @param initialListCapacity the initial size of the values list\n     * @throws NullPointerException if the map is null\n     * @throws IllegalArgumentException if initialListCapacity is negative\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.get(java.lang.Object)",
      "begin_line": 81,
      "end_line": 84,
      "comment": "\n     * Gets the list of values associated with the specified key. This would\n     * return an empty list in case the mapping is not present\n     *\n     * @param key the key to retrieve\n     * @return the \u003ccode\u003eList\u003c/code\u003e of values, will return an empty {@link List} for no mapping\n     * @throws ClassCastException if the key is of an invalid type\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.remove(java.lang.Object)",
      "begin_line": 96,
      "end_line": 99,
      "comment": "\n     * Removes all values associated with the specified key.\n     * \u003cp\u003e\n     * A subsequent \u003ccode\u003eget(Object)\u003c/code\u003e would return an empty list.\n     *\n     * @param key the key to remove values from\n     * @return the \u003ccode\u003eList\u003c/code\u003e of values removed, will return an empty,\n     *         unmodifiable list for no mapping found.\n     * @throws ClassCastException if the key is of an invalid type\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.equals(java.lang.Object)",
      "begin_line": 101,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 103,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 108,col 9)",
        "(line 109,col 9)-(line 111,col 9)",
        "(line 112,col 9)-(line 112,col 62)",
        "(line 113,col 9)-(line 115,col 9)",
        "(line 116,col 9)-(line 116,col 45)",
        "(line 117,col 9)-(line 127,col 9)",
        "(line 128,col 9)-(line 128,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.hashCode()",
      "begin_line": 131,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 18)",
        "(line 134,col 9)-(line 134,col 78)",
        "(line 135,col 9)-(line 140,col 9)",
        "(line 141,col 9)-(line 141,col 17)"
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
      "begin_line": 147,
      "end_line": 248,
      "comment": "\n     * Wrapped list to handle add and remove on the list returned by get(object)\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.WrappedList.WrappedList(java.lang.Object)",
      "begin_line": 149,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 150,col 13)-(line 150,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.WrappedList.add(int, V)",
      "begin_line": 153,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 155,col 13)-(line 155,col 50)",
        "(line 156,col 13)-(line 160,col 13)",
        "(line 161,col 13)-(line 161,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.WrappedList.addAll(int, java.util.Collection\u003c? extends V\u003e)",
      "begin_line": 164,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 166,col 13)-(line 166,col 50)",
        "(line 167,col 13)-(line 174,col 13)",
        "(line 175,col 13)-(line 175,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.WrappedList.get(int)",
      "begin_line": 178,
      "end_line": 181,
      "comment": "",
      "child_ranges": [
        "(line 179,col 13)-(line 179,col 79)",
        "(line 180,col 13)-(line 180,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.WrappedList.indexOf(java.lang.Object)",
      "begin_line": 183,
      "end_line": 186,
      "comment": "",
      "child_ranges": [
        "(line 184,col 13)-(line 184,col 79)",
        "(line 185,col 13)-(line 185,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.WrappedList.lastIndexOf(java.lang.Object)",
      "begin_line": 188,
      "end_line": 191,
      "comment": "",
      "child_ranges": [
        "(line 189,col 13)-(line 189,col 79)",
        "(line 190,col 13)-(line 190,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.WrappedList.listIterator()",
      "begin_line": 193,
      "end_line": 195,
      "comment": "",
      "child_ranges": [
        "(line 194,col 13)-(line 194,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.WrappedList.listIterator(int)",
      "begin_line": 197,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 198,col 13)-(line 198,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.WrappedList.remove(int)",
      "begin_line": 201,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 202,col 13)-(line 202,col 79)",
        "(line 203,col 13)-(line 203,col 41)",
        "(line 204,col 13)-(line 206,col 13)",
        "(line 207,col 13)-(line 207,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.WrappedList.set(int, V)",
      "begin_line": 210,
      "end_line": 213,
      "comment": "",
      "child_ranges": [
        "(line 211,col 13)-(line 211,col 79)",
        "(line 212,col 13)-(line 212,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.WrappedList.subList(int, int)",
      "begin_line": 215,
      "end_line": 218,
      "comment": "",
      "child_ranges": [
        "(line 216,col 13)-(line 216,col 79)",
        "(line 217,col 13)-(line 217,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.WrappedList.equals(java.lang.Object)",
      "begin_line": 220,
      "end_line": 237,
      "comment": "",
      "child_ranges": [
        "(line 222,col 13)-(line 222,col 56)",
        "(line 223,col 13)-(line 225,col 13)",
        "(line 226,col 13)-(line 228,col 13)",
        "(line 229,col 13)-(line 231,col 13)",
        "(line 232,col 13)-(line 232,col 48)",
        "(line 233,col 13)-(line 235,col 13)",
        "(line 236,col 13)-(line 236,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.WrappedList.hashCode()",
      "begin_line": 239,
      "end_line": 246,
      "comment": "",
      "child_ranges": [
        "(line 241,col 13)-(line 241,col 56)",
        "(line 242,col 13)-(line 244,col 13)",
        "(line 245,col 13)-(line 245,col 51)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ValuesListIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.ListIterator\u003cV\u003e"
      ],
      "begin_line": 251,
      "end_line": 316,
      "comment": " Values ListItrerator "
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 253,
      "end_line": 253,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "values"
      ],
      "begin_line": 255,
      "end_line": 255,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "iterator"
      ],
      "begin_line": 256,
      "end_line": 256,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.ValuesListIterator.ValuesListIterator(java.lang.Object)",
      "begin_line": 258,
      "end_line": 262,
      "comment": "",
      "child_ranges": [
        "(line 259,col 13)-(line 259,col 27)",
        "(line 260,col 13)-(line 260,col 77)",
        "(line 261,col 13)-(line 261,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.ValuesListIterator.ValuesListIterator(java.lang.Object, int)",
      "begin_line": 264,
      "end_line": 268,
      "comment": "",
      "child_ranges": [
        "(line 265,col 13)-(line 265,col 27)",
        "(line 266,col 13)-(line 266,col 77)",
        "(line 267,col 13)-(line 267,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.ValuesListIterator.add(V)",
      "begin_line": 270,
      "end_line": 279,
      "comment": "",
      "child_ranges": [
        "(line 272,col 13)-(line 277,col 13)",
        "(line 278,col 9)-(line 278,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.ValuesListIterator.hasNext()",
      "begin_line": 281,
      "end_line": 283,
      "comment": "",
      "child_ranges": [
        "(line 282,col 13)-(line 282,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.ValuesListIterator.hasPrevious()",
      "begin_line": 285,
      "end_line": 287,
      "comment": "",
      "child_ranges": [
        "(line 286,col 13)-(line 286,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.ValuesListIterator.next()",
      "begin_line": 289,
      "end_line": 291,
      "comment": "",
      "child_ranges": [
        "(line 290,col 13)-(line 290,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.ValuesListIterator.nextIndex()",
      "begin_line": 293,
      "end_line": 295,
      "comment": "",
      "child_ranges": [
        "(line 294,col 13)-(line 294,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.ValuesListIterator.previous()",
      "begin_line": 297,
      "end_line": 299,
      "comment": "",
      "child_ranges": [
        "(line 298,col 13)-(line 298,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.ValuesListIterator.previousIndex()",
      "begin_line": 301,
      "end_line": 303,
      "comment": "",
      "child_ranges": [
        "(line 302,col 13)-(line 302,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.ValuesListIterator.remove()",
      "begin_line": 305,
      "end_line": 310,
      "comment": "",
      "child_ranges": [
        "(line 306,col 13)-(line 306,col 30)",
        "(line 307,col 13)-(line 309,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractListValuedMap.ValuesListIterator.set(V)",
      "begin_line": 312,
      "end_line": 314,
      "comment": "",
      "child_ranges": [
        "(line 313,col 13)-(line 313,col 32)"
      ]
    }
  ]
}