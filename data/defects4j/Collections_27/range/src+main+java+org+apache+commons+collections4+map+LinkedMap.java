{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/map/LinkedMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LinkedMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.AbstractLinkedMap\u003cK, V\u003e",
        "java.io.Serializable",
        "java.lang.Cloneable"
      ],
      "begin_line": 63,
      "end_line": 303,
      "comment": "\n * A \u003ccode\u003eMap\u003c/code\u003e implementation that maintains the order of the entries.\n * In this implementation order is maintained by original insertion.\n * \u003cp\u003e\n * This implementation improves on the JDK1.4 LinkedHashMap by adding the\n * {@link org.apache.commons.collections4.MapIterator MapIterator}\n * functionality, additional convenience methods and allowing\n * bidirectional iteration. It also implements \u003ccode\u003eOrderedMap\u003c/code\u003e.\n * In addition, non-interface methods are provided to access the map by index.\n * \u003cp\u003e\n * The \u003ccode\u003eorderedMapIterator()\u003c/code\u003e method provides direct access to a\n * bidirectional iterator. The iterators from the other views can also be cast\n * to \u003ccode\u003eOrderedIterator\u003c/code\u003e if required.\n * \u003cp\u003e\n * All the available iterators can be reset back to the start by casting to\n * \u003ccode\u003eResettableIterator\u003c/code\u003e and calling \u003ccode\u003ereset()\u003c/code\u003e.\n * \u003cp\u003e\n * The implementation is also designed to be subclassed, with lots of useful\n * methods exposed.\n * \u003cp\u003e\n * \u003cstrong\u003eNote that LinkedMap is not synchronized and is not thread-safe.\u003c/strong\u003e\n * If you wish to use this map from multiple threads concurrently, you must use\n * appropriate synchronization. The simplest approach is to wrap this map\n * using {@link java.util.Collections#synchronizedMap(Map)}. This class may throw\n * exceptions when accessed by concurrent threads without synchronization.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Serialisation version "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.LinkedMap.LinkedMap()",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * Constructs a new empty map with default size and load factor.\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 72)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.LinkedMap.LinkedMap(int)",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * Constructs a new, empty map with the specified initial capacity.\n     *\n     * @param initialCapacity  the initial capacity\n     * @throws IllegalArgumentException if the initial capacity is negative\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.LinkedMap.LinkedMap(int, float)",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\n     * Constructs a new, empty map with the specified initial capacity and\n     * load factor.\n     *\n     * @param initialCapacity  the initial capacity\n     * @param loadFactor  the load factor\n     * @throws IllegalArgumentException if the initial capacity is negative\n     * @throws IllegalArgumentException if the load factor is less than zero\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.LinkedMap.LinkedMap(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\n     * Constructor copying elements from another map.\n     *\n     * @param map  the map to copy\n     * @throws NullPointerException if the map is null\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.LinkedMap.clone()",
      "begin_line": 114,
      "end_line": 117,
      "comment": "\n     * Clones the map without cloning the keys or values.\n     *\n     * @return a shallow clone\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.LinkedMap.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 122,
      "end_line": 125,
      "comment": "\n     * Write the map out using a custom routine.\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 33)",
        "(line 124,col 9)-(line 124,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.LinkedMap.readObject(java.io.ObjectInputStream)",
      "begin_line": 130,
      "end_line": 133,
      "comment": "\n     * Read the map in using a custom routine.\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 31)",
        "(line 132,col 9)-(line 132,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.LinkedMap.get(int)",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\n     * Gets the key at the specified index.\n     *\n     * @param index  the index to retrieve\n     * @return the key at the specified index\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.LinkedMap.getValue(int)",
      "begin_line": 154,
      "end_line": 156,
      "comment": "\n     * Gets the value at the specified index.\n     *\n     * @param index  the index to retrieve\n     * @return the value at the specified index\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.LinkedMap.indexOf(java.lang.Object)",
      "begin_line": 164,
      "end_line": 173,
      "comment": "\n     * Gets the index of the specified key.\n     *\n     * @param key  the key to find the index of\n     * @return the index, or -1 if not found\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 30)",
        "(line 166,col 9)-(line 166,col 18)",
        "(line 167,col 9)-(line 171,col 9)",
        "(line 172,col 9)-(line 172,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.LinkedMap.remove(int)",
      "begin_line": 183,
      "end_line": 185,
      "comment": "\n     * Removes the element at the specified index.\n     *\n     * @param index  the index of the object to remove\n     * @return the previous value corresponding the \u003ccode\u003ekey\u003c/code\u003e,\n     *  or \u003ccode\u003enull\u003c/code\u003e if none existed\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.LinkedMap.asList()",
      "begin_line": 202,
      "end_line": 204,
      "comment": "\n     * Gets an unmodifiable List view of the keys.\n     * \u003cp\u003e\n     * The returned list is unmodifiable because changes to the values of\n     * the list (using {@link java.util.ListIterator#set(Object)}) will\n     * effectively remove the value from the list and reinsert that value at\n     * the end of the list, which is an unexpected side effect of changing the\n     * value of a list.  This occurs because changing the key, changes when the\n     * mapping is added to the map and thus where it appears in the list.\n     * \u003cp\u003e\n     * An alternative to this method is to use {@link #keySet()}.\n     *\n     * @see #keySet()\n     * @return The ordered list of keys.\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 42)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinkedMapList",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractList\u003cK\u003e"
      ],
      "begin_line": 209,
      "end_line": 301,
      "comment": "\n     * List view of map.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 211,
      "end_line": 211,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.LinkedMap.LinkedMapList.LinkedMapList(org.apache.commons.collections4.map.LinkedMap\u003cK, ?\u003e)",
      "begin_line": 213,
      "end_line": 215,
      "comment": "",
      "child_ranges": [
        "(line 214,col 13)-(line 214,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.LinkedMap.LinkedMapList.size()",
      "begin_line": 217,
      "end_line": 220,
      "comment": "",
      "child_ranges": [
        "(line 219,col 13)-(line 219,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.LinkedMap.LinkedMapList.get(int)",
      "begin_line": 222,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 224,col 13)-(line 224,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.LinkedMap.LinkedMapList.contains(java.lang.Object)",
      "begin_line": 227,
      "end_line": 230,
      "comment": "",
      "child_ranges": [
        "(line 229,col 13)-(line 229,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.LinkedMap.LinkedMapList.indexOf(java.lang.Object)",
      "begin_line": 232,
      "end_line": 235,
      "comment": "",
      "child_ranges": [
        "(line 234,col 13)-(line 234,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.LinkedMap.LinkedMapList.lastIndexOf(java.lang.Object)",
      "begin_line": 237,
      "end_line": 240,
      "comment": "",
      "child_ranges": [
        "(line 239,col 13)-(line 239,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.LinkedMap.LinkedMapList.containsAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 242,
      "end_line": 245,
      "comment": "",
      "child_ranges": [
        "(line 244,col 13)-(line 244,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.LinkedMap.LinkedMapList.remove(int)",
      "begin_line": 247,
      "end_line": 250,
      "comment": "",
      "child_ranges": [
        "(line 249,col 13)-(line 249,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.LinkedMap.LinkedMapList.remove(java.lang.Object)",
      "begin_line": 252,
      "end_line": 255,
      "comment": "",
      "child_ranges": [
        "(line 254,col 13)-(line 254,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.LinkedMap.LinkedMapList.removeAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 257,
      "end_line": 260,
      "comment": "",
      "child_ranges": [
        "(line 259,col 13)-(line 259,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.LinkedMap.LinkedMapList.retainAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 262,
      "end_line": 265,
      "comment": "",
      "child_ranges": [
        "(line 264,col 13)-(line 264,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.LinkedMap.LinkedMapList.clear()",
      "begin_line": 267,
      "end_line": 270,
      "comment": "",
      "child_ranges": [
        "(line 269,col 13)-(line 269,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.LinkedMap.LinkedMapList.toArray()",
      "begin_line": 272,
      "end_line": 275,
      "comment": "",
      "child_ranges": [
        "(line 274,col 13)-(line 274,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.LinkedMap.LinkedMapList.toArray(T[])",
      "begin_line": 277,
      "end_line": 280,
      "comment": "",
      "child_ranges": [
        "(line 279,col 13)-(line 279,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.LinkedMap.LinkedMapList.iterator()",
      "begin_line": 282,
      "end_line": 285,
      "comment": "",
      "child_ranges": [
        "(line 284,col 13)-(line 284,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.LinkedMap.LinkedMapList.listIterator()",
      "begin_line": 287,
      "end_line": 290,
      "comment": "",
      "child_ranges": [
        "(line 289,col 13)-(line 289,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.LinkedMap.LinkedMapList.listIterator(int)",
      "begin_line": 292,
      "end_line": 295,
      "comment": "",
      "child_ranges": [
        "(line 294,col 13)-(line 294,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.LinkedMap.LinkedMapList.subList(int, int)",
      "begin_line": 297,
      "end_line": 300,
      "comment": "",
      "child_ranges": [
        "(line 299,col 13)-(line 299,col 106)"
      ]
    }
  ]
}