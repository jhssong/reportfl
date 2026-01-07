{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/map/ReferenceMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ReferenceMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.AbstractReferenceMap\u003cK, V\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 73,
      "end_line": 184,
      "comment": "\n * A \u003ccode\u003eMap\u003c/code\u003e implementation that allows mappings to be\n * removed by the garbage collector.\n * \u003cp\u003e\n * When you construct a \u003ccode\u003eReferenceMap\u003c/code\u003e, you can specify what kind\n * of references are used to store the map\u0027s keys and values.\n * If non-hard references are used, then the garbage collector can remove\n * mappings if a key or value becomes unreachable, or if the JVM\u0027s memory is\n * running low. For information on how the different reference types behave,\n * see {@link java.lang.ref.Reference Reference}.\n * \u003cp\u003e\n * Different types of references can be specified for keys and values.\n * The keys can be configured to be weak but the values hard,\n * in which case this class will behave like a\n * \u003ca href\u003d\"http://java.sun.com/j2se/1.4/docs/api/java/util/WeakHashMap.html\"\u003e\n * \u003ccode\u003eWeakHashMap\u003c/code\u003e\u003c/a\u003e. However, you can also specify hard keys and\n * weak values, or any other combination. The default constructor uses\n * hard keys and soft values, providing a memory-sensitive cache.\n * \u003cp\u003e\n * This map is similar to\n * {@link org.apache.commons.collections4.map.ReferenceIdentityMap ReferenceIdentityMap}.\n * It differs in that keys and values in this class are compared using \u003ccode\u003eequals()\u003c/code\u003e.\n * \u003cp\u003e\n * This {@link java.util.Map Map} implementation does \u003ci\u003enot\u003c/i\u003e allow null elements.\n * Attempting to add a null key or value to the map will raise a \u003ccode\u003eNullPointerException\u003c/code\u003e.\n * \u003cp\u003e\n * This implementation is not synchronized.\n * You can use {@link java.util.Collections#synchronizedMap} to\n * provide synchronized access to a \u003ccode\u003eReferenceMap\u003c/code\u003e.\n * Remember that synchronization will not stop the garbage collector removing entries.\n * \u003cp\u003e\n * All the available iterators can be reset back to the start by casting to\n * \u003ccode\u003eResettableIterator\u003c/code\u003e and calling \u003ccode\u003ereset()\u003c/code\u003e.\n * \u003cp\u003e\n * \u003cstrong\u003eNote that ReferenceMap is not synchronized and is not thread-safe.\u003c/strong\u003e\n * If you wish to use this map from multiple threads concurrently, you must use\n * appropriate synchronization. The simplest approach is to wrap this map\n * using {@link java.util.Collections#synchronizedMap}. This class may throw\n * exceptions when accessed by concurrent threads without synchronization.\n * \u003cp\u003e\n * NOTE: As from Commons Collections 3.1 this map extends \u003ccode\u003eAbstractReferenceMap\u003c/code\u003e\n * (previously it extended AbstractMap). As a result, the implementation is now\n * extensible and provides a \u003ccode\u003eMapIterator\u003c/code\u003e.\n *\n * @see java.lang.ref.Reference\n *\n * @since 3.0 (previously in main package v2.1)\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Serialization version "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.ReferenceMap.ReferenceMap()",
      "begin_line": 82,
      "end_line": 85,
      "comment": "\n     * Constructs a new \u003ccode\u003eReferenceMap\u003c/code\u003e that will\n     * use hard references to keys and soft references to values.\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 84,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.ReferenceMap.ReferenceMap(org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceStrength, org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceStrength)",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * Constructs a new \u003ccode\u003eReferenceMap\u003c/code\u003e that will\n     * use the specified types of references.\n     *\n     * @param keyType  the type of reference to use for keys;\n     *   must be {@link AbstractReferenceMap.ReferenceStrength#HARD HARD},\n     *   {@link AbstractReferenceMap.ReferenceStrength#SOFT SOFT},\n     *   {@link AbstractReferenceMap.ReferenceStrength#WEAK WEAK}\n     * @param valueType  the type of reference to use for values;\n     *   must be {@link AbstractReferenceMap.ReferenceStrength#HARD HARD},\n     *   {@link AbstractReferenceMap.ReferenceStrength#SOFT SOFT},\n     *   {@link AbstractReferenceMap.ReferenceStrength#WEAK WEAK}\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 80)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.ReferenceMap.ReferenceMap(org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceStrength, org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceStrength, boolean)",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\n     * Constructs a new \u003ccode\u003eReferenceMap\u003c/code\u003e that will\n     * use the specified types of references.\n     *\n     * @param keyType  the type of reference to use for keys;\n     *   must be {@link AbstractReferenceMap.ReferenceStrength#HARD HARD},\n     *   {@link AbstractReferenceMap.ReferenceStrength#SOFT SOFT},\n     *   {@link AbstractReferenceMap.ReferenceStrength#WEAK WEAK}\n     * @param valueType  the type of reference to use for values;\n     *   must be {@link AbstractReferenceMap.ReferenceStrength#HARD HARD},\n     *   {@link AbstractReferenceMap.ReferenceStrength#SOFT SOFT},\n     *   {@link AbstractReferenceMap.ReferenceStrength#WEAK WEAK}\n     * @param purgeValues should the value be automatically purged when the\n     *   key is garbage collected\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 86)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.ReferenceMap.ReferenceMap(org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceStrength, org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceStrength, int, float)",
      "begin_line": 139,
      "end_line": 142,
      "comment": "\n     * Constructs a new \u003ccode\u003eReferenceMap\u003c/code\u003e with the\n     * specified reference types, load factor and initial\n     * capacity.\n     *\n     * @param keyType  the type of reference to use for keys;\n     *   must be {@link AbstractReferenceMap.ReferenceStrength#HARD HARD},\n     *   {@link AbstractReferenceMap.ReferenceStrength#SOFT SOFT},\n     *   {@link AbstractReferenceMap.ReferenceStrength#WEAK WEAK}\n     * @param valueType  the type of reference to use for values;\n     *   must be {@link AbstractReferenceMap.ReferenceStrength#HARD HARD},\n     *   {@link AbstractReferenceMap.ReferenceStrength#SOFT SOFT},\n     *   {@link AbstractReferenceMap.ReferenceStrength#WEAK WEAK}\n     * @param capacity  the initial capacity for the map\n     * @param loadFactor  the load factor for the map\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 63)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.ReferenceMap.ReferenceMap(org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceStrength, org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceStrength, int, float, boolean)",
      "begin_line": 162,
      "end_line": 165,
      "comment": "\n     * Constructs a new \u003ccode\u003eReferenceMap\u003c/code\u003e with the\n     * specified reference types, load factor and initial\n     * capacity.\n     *\n     * @param keyType  the type of reference to use for keys;\n     *   must be {@link AbstractReferenceMap.ReferenceStrength#HARD HARD},\n     *   {@link AbstractReferenceMap.ReferenceStrength#SOFT SOFT},\n     *   {@link AbstractReferenceMap.ReferenceStrength#WEAK WEAK}\n     * @param valueType  the type of reference to use for values;\n     *   must be {@link AbstractReferenceMap.ReferenceStrength#HARD HARD},\n     *   {@link AbstractReferenceMap.ReferenceStrength#SOFT SOFT},\n     *   {@link AbstractReferenceMap.ReferenceStrength#WEAK WEAK}\n     * @param capacity  the initial capacity for the map\n     * @param loadFactor  the load factor for the map\n     * @param purgeValues  should the value be automatically purged when the\n     *   key is garbage collected\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ReferenceMap.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 171,
      "end_line": 174,
      "comment": "\n     * Write the map out using a custom routine.\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 33)",
        "(line 173,col 9)-(line 173,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ReferenceMap.readObject(java.io.ObjectInputStream)",
      "begin_line": 179,
      "end_line": 182,
      "comment": "\n     * Read the map in using a custom routine.\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 31)",
        "(line 181,col 9)-(line 181,col 25)"
      ]
    }
  ]
}