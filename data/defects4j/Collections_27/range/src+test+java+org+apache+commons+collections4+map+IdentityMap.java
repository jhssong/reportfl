{
  "filepath": "/tmp/Collections-27b/src/test/java/org/apache/commons/collections4/map/IdentityMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IdentityMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.AbstractHashedMap\u003cK, V\u003e",
        "java.io.Serializable",
        "java.lang.Cloneable"
      ],
      "begin_line": 46,
      "end_line": 205,
      "comment": "\n * A \u003ccode\u003eMap\u003c/code\u003e implementation that matches keys and values based\n * on \u003ccode\u003e\u003d\u003d\u003c/code\u003e not \u003ccode\u003eequals()\u003c/code\u003e.\n * \u003cp\u003e\n * \u003cstrong\u003eThis map will violate the detail of various Map and map view contracts.\u003c/note\u003e\n * As a general rule, don\u0027t compare this map to other maps. In particular, you can\u0027t\n * use decorators like {@link ListOrderedMap} on it, which silently assume that these\n * contracts are fulfilled.\n * \u003cp\u003e\n * \u003cstrong\u003eNote that IdentityMap is not synchronized and is not thread-safe.\u003c/strong\u003e\n * If you wish to use this map from multiple threads concurrently, you must use\n * appropriate synchronization. The simplest approach is to wrap this map\n * using {@link java.util.Collections#synchronizedMap(Map)}. This class may throw\n * exceptions when accessed by concurrent threads without synchronization.\n * \u003cp\u003e\n * From 4.0, this class is replaced by java.util.IdentityHashMap but kept as a\n * test-class because it is still used by the ReferenceIdentityMapTest.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Serialisation version "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.IdentityMap.IdentityMap()",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n     * Constructs a new empty map with default size and load factor.\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 72)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.IdentityMap.IdentityMap(int)",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * Constructs a new, empty map with the specified initial capacity.\n     *\n     * @param initialCapacity  the initial capacity\n     * @throws IllegalArgumentException if the initial capacity is negative\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.IdentityMap.IdentityMap(int, float)",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * Constructs a new, empty map with the specified initial capacity and\n     * load factor.\n     *\n     * @param initialCapacity  the initial capacity\n     * @param loadFactor  the load factor\n     * @throws IllegalArgumentException if the initial capacity is negative\n     * @throws IllegalArgumentException if the load factor is less than zero\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.IdentityMap.IdentityMap(java.util.Map\u003cK, V\u003e)",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * Constructor copying elements from another map.\n     *\n     * @param map  the map to copy\n     * @throws NullPointerException if the map is null\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.IdentityMap.hash(java.lang.Object)",
      "begin_line": 100,
      "end_line": 103,
      "comment": "\n     * Gets the hash code for the key specified.\n     * This implementation uses the identity hash code.\n     *\n     * @param key  the key to get a hash code for\n     * @return the hash code\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.IdentityMap.isEqualKey(java.lang.Object, java.lang.Object)",
      "begin_line": 113,
      "end_line": 116,
      "comment": "\n     * Compares two keys for equals.\n     * This implementation uses \u003ccode\u003e\u003d\u003d\u003c/code\u003e.\n     *\n     * @param key1  the first key to compare\n     * @param key2  the second key to compare\n     * @return true if equal by identity\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.IdentityMap.isEqualValue(java.lang.Object, java.lang.Object)",
      "begin_line": 126,
      "end_line": 129,
      "comment": "\n     * Compares two values for equals.\n     * This implementation uses \u003ccode\u003e\u003d\u003d\u003c/code\u003e.\n     *\n     * @param value1  the first value to compare\n     * @param value2  the second value to compare\n     * @return true if equal by identity\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.IdentityMap.createEntry(org.apache.commons.collections4.map.AbstractHashedMap.HashEntry\u003cK, V\u003e, int, K, V)",
      "begin_line": 141,
      "end_line": 145,
      "comment": "\n     * Creates an entry to store the data.\n     * This implementation creates an IdentityEntry instance.\n     *\n     * @param next  the next entry in sequence\n     * @param hashCode  the hash code to use\n     * @param key  the key to store\n     * @param value  the value to store\n     * @return the newly created entry\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 67)"
      ]
    },
    {
      "type": "class_interface",
      "name": "IdentityEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.AbstractHashedMap.HashEntry\u003cK, V\u003e"
      ],
      "begin_line": 151,
      "end_line": 176,
      "comment": "\n     * HashEntry\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.IdentityMap.IdentityEntry.IdentityEntry(org.apache.commons.collections4.map.AbstractHashedMap.HashEntry\u003cK, V\u003e, int, K, V)",
      "begin_line": 153,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 154,col 13)-(line 154,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.IdentityMap.IdentityEntry.equals(java.lang.Object)",
      "begin_line": 157,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 159,col 13)-(line 161,col 13)",
        "(line 162,col 13)-(line 164,col 13)",
        "(line 165,col 13)-(line 165,col 64)",
        "(line 166,col 13)-(line 168,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.IdentityMap.IdentityEntry.hashCode()",
      "begin_line": 171,
      "end_line": 175,
      "comment": "",
      "child_ranges": [
        "(line 173,col 13)-(line 174,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.IdentityMap.clone()",
      "begin_line": 184,
      "end_line": 187,
      "comment": "\n     * Clones the map without cloning the keys or values.\n     *\n     * @return a shallow clone\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.IdentityMap.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 192,
      "end_line": 195,
      "comment": "\n     * Write the map out using a custom routine.\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 33)",
        "(line 194,col 9)-(line 194,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.IdentityMap.readObject(java.io.ObjectInputStream)",
      "begin_line": 200,
      "end_line": 203,
      "comment": "\n     * Read the map in using a custom routine.\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 31)",
        "(line 202,col 9)-(line 202,col 25)"
      ]
    }
  ]
}