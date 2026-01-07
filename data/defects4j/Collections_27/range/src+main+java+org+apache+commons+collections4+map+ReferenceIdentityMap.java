{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/map/ReferenceIdentityMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ReferenceIdentityMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.AbstractReferenceMap\u003cK, V\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 71,
      "end_line": 240,
      "comment": "\n * A \u003ccode\u003eMap\u003c/code\u003e implementation that allows mappings to be\n * removed by the garbage collector and matches keys and values based\n * on \u003ccode\u003e\u003d\u003d\u003c/code\u003e not \u003ccode\u003eequals()\u003c/code\u003e.\n * \u003cp\u003e\n * \u003cp\u003e\n * When you construct a \u003ccode\u003eReferenceIdentityMap\u003c/code\u003e, you can specify what kind\n * of references are used to store the map\u0027s keys and values.\n * If non-hard references are used, then the garbage collector can remove\n * mappings if a key or value becomes unreachable, or if the JVM\u0027s memory is\n * running low. For information on how the different reference types behave,\n * see {@link Reference}.\n * \u003cp\u003e\n * Different types of references can be specified for keys and values.\n * The default constructor uses hard keys and soft values, providing a\n * memory-sensitive cache.\n * \u003cp\u003e\n * This map is similar to\n * {@link org.apache.commons.collections4.map.ReferenceMap ReferenceMap}.\n * It differs in that keys and values in this class are compared using \u003ccode\u003e\u003d\u003d\u003c/code\u003e.\n * \u003cp\u003e\n * This map will violate the detail of various Map and map view contracts.\n * As a general rule, don\u0027t compare this map to other maps.\n * \u003cp\u003e\n * This {@link java.util.Map Map} implementation does \u003ci\u003enot\u003c/i\u003e allow null elements.\n * Attempting to add a null key or value to the map will raise a \u003ccode\u003eNullPointerException\u003c/code\u003e.\n * \u003cp\u003e\n * This implementation is not synchronized.\n * You can use {@link java.util.Collections#synchronizedMap} to\n * provide synchronized access to a \u003ccode\u003eReferenceIdentityMap\u003c/code\u003e.\n * Remember that synchronization will not stop the garbage collector removing entries.\n * \u003cp\u003e\n * All the available iterators can be reset back to the start by casting to\n * \u003ccode\u003eResettableIterator\u003c/code\u003e and calling \u003ccode\u003ereset()\u003c/code\u003e.\n * \u003cp\u003e\n * \u003cstrong\u003eNote that ReferenceIdentityMap is not synchronized and is not thread-safe.\u003c/strong\u003e\n * If you wish to use this map from multiple threads concurrently, you must use\n * appropriate synchronization. The simplest approach is to wrap this map\n * using {@link java.util.Collections#synchronizedMap}. This class may throw\n * exceptions when accessed by concurrent threads without synchronization.\n *\n * @see java.lang.ref.Reference\n *\n * @since 3.0 (previously in main package v2.1)\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " Serialization version "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.ReferenceIdentityMap.ReferenceIdentityMap()",
      "begin_line": 80,
      "end_line": 83,
      "comment": "\n     * Constructs a new \u003ccode\u003eReferenceIdentityMap\u003c/code\u003e that will\n     * use hard references to keys and soft references to values.\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 82,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.ReferenceIdentityMap.ReferenceIdentityMap(org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceStrength, org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceStrength)",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * Constructs a new \u003ccode\u003eReferenceIdentityMap\u003c/code\u003e that will\n     * use the specified types of references.\n     *\n     * @param keyType  the type of reference to use for keys;\n     *   must be {@link AbstractReferenceMap.ReferenceStrength#HARD HARD},\n     *   {@link AbstractReferenceMap.ReferenceStrength#SOFT SOFT},\n     *   {@link AbstractReferenceMap.ReferenceStrength#WEAK WEAK}\n     * @param valueType  the type of reference to use for values;\n     *   must be {@link AbstractReferenceMap.ReferenceStrength#HARD HARD},\n     *   {@link AbstractReferenceMap.ReferenceStrength#SOFT SOFT},\n     *   {@link AbstractReferenceMap.ReferenceStrength#WEAK WEAK}\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 80)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.ReferenceIdentityMap.ReferenceIdentityMap(org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceStrength, org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceStrength, boolean)",
      "begin_line": 117,
      "end_line": 120,
      "comment": "\n     * Constructs a new \u003ccode\u003eReferenceIdentityMap\u003c/code\u003e that will\n     * use the specified types of references.\n     *\n     * @param keyType  the type of reference to use for keys;\n     *   must be {@link AbstractReferenceMap.ReferenceStrength#HARD HARD},\n     *   {@link AbstractReferenceMap.ReferenceStrength#SOFT SOFT},\n     *   {@link AbstractReferenceMap.ReferenceStrength#WEAK WEAK}\n     * @param valueType  the type of reference to use for values;\n     *   must be {@link AbstractReferenceMap.ReferenceStrength#HARD HARD},\n     *   {@link AbstractReferenceMap.ReferenceStrength#SOFT SOFT},\n     *   {@link AbstractReferenceMap.ReferenceStrength#WEAK WEAK}\n     * @param purgeValues should the value be automatically purged when the\n     *   key is garbage collected\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 86)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.ReferenceIdentityMap.ReferenceIdentityMap(org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceStrength, org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceStrength, int, float)",
      "begin_line": 137,
      "end_line": 140,
      "comment": "\n     * Constructs a new \u003ccode\u003eReferenceIdentityMap\u003c/code\u003e with the\n     * specified reference types, load factor and initial capacity.\n     *\n     * @param keyType  the type of reference to use for keys;\n     *   must be {@link AbstractReferenceMap.ReferenceStrength#HARD HARD},\n     *   {@link AbstractReferenceMap.ReferenceStrength#SOFT SOFT},\n     *   {@link AbstractReferenceMap.ReferenceStrength#WEAK WEAK}\n     * @param valueType  the type of reference to use for values;\n     *   must be {@link AbstractReferenceMap.ReferenceStrength#HARD HARD},\n     *   {@link AbstractReferenceMap.ReferenceStrength#SOFT SOFT},\n     *   {@link AbstractReferenceMap.ReferenceStrength#WEAK WEAK}\n     * @param capacity  the initial capacity for the map\n     * @param loadFactor  the load factor for the map\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 63)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.ReferenceIdentityMap.ReferenceIdentityMap(org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceStrength, org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceStrength, int, float, boolean)",
      "begin_line": 159,
      "end_line": 162,
      "comment": "\n     * Constructs a new \u003ccode\u003eReferenceIdentityMap\u003c/code\u003e with the\n     * specified reference types, load factor and initial capacity.\n     *\n     * @param keyType  the type of reference to use for keys;\n     *   must be {@link AbstractReferenceMap.ReferenceStrength#HARD HARD},\n     *   {@link AbstractReferenceMap.ReferenceStrength#SOFT SOFT},\n     *   {@link AbstractReferenceMap.ReferenceStrength#WEAK WEAK}\n     * @param valueType  the type of reference to use for values;\n     *   must be {@link AbstractReferenceMap.ReferenceStrength#HARD HARD},\n     *   {@link AbstractReferenceMap.ReferenceStrength#SOFT SOFT},\n     *   {@link AbstractReferenceMap.ReferenceStrength#WEAK WEAK}\n     * @param capacity  the initial capacity for the map\n     * @param loadFactor  the load factor for the map\n     * @param purgeValues  should the value be automatically purged when the\n     *   key is garbage collected\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ReferenceIdentityMap.hash(java.lang.Object)",
      "begin_line": 173,
      "end_line": 176,
      "comment": "\n     * Gets the hash code for the key specified.\n     * \u003cp\u003e\n     * This implementation uses the identity hash code.\n     *\n     * @param key  the key to get a hash code for\n     * @return the hash code\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ReferenceIdentityMap.hashEntry(java.lang.Object, java.lang.Object)",
      "begin_line": 187,
      "end_line": 191,
      "comment": "\n     * Gets the hash code for a MapEntry.\n     * \u003cp\u003e\n     * This implementation uses the identity hash code.\n     *\n     * @param key  the key to get a hash code for, may be null\n     * @param value  the value to get a hash code for, may be null\n     * @return the hash code, as per the MapEntry specification\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 190,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ReferenceIdentityMap.isEqualKey(java.lang.Object, java.lang.Object)",
      "begin_line": 203,
      "end_line": 207,
      "comment": "\n     * Compares two keys for equals.\n     * \u003cp\u003e\n     * This implementation converts the key from the entry to a real reference\n     * before comparison and uses \u003ccode\u003e\u003d\u003d\u003c/code\u003e.\n     *\n     * @param key1  the first key to compare passed in from outside\n     * @param key2  the second key extracted from the entry via \u003ccode\u003eentry.key\u003c/code\u003e\n     * @return true if equal by identity\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 86)",
        "(line 206,col 9)-(line 206,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ReferenceIdentityMap.isEqualValue(java.lang.Object, java.lang.Object)",
      "begin_line": 218,
      "end_line": 221,
      "comment": "\n     * Compares two values for equals.\n     * \u003cp\u003e\n     * This implementation uses \u003ccode\u003e\u003d\u003d\u003c/code\u003e.\n     *\n     * @param value1  the first value to compare passed in from outside\n     * @param value2  the second value extracted from the entry via \u003ccode\u003egetValue()\u003c/code\u003e\n     * @return true if equal by identity\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ReferenceIdentityMap.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 227,
      "end_line": 230,
      "comment": "\n     * Write the map out using a custom routine.\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 33)",
        "(line 229,col 9)-(line 229,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ReferenceIdentityMap.readObject(java.io.ObjectInputStream)",
      "begin_line": 235,
      "end_line": 238,
      "comment": "\n     * Read the map in using a custom routine.\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 31)",
        "(line 237,col 9)-(line 237,col 25)"
      ]
    }
  ]
}