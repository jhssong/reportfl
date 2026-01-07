{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/map/LazySortedMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LazySortedMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.LazyMap\u003cK, V\u003e",
        "java.util.SortedMap\u003cK, V\u003e"
      ],
      "begin_line": 59,
      "end_line": 157,
      "comment": "\n * Decorates another \u003ccode\u003eSortedMap\u003c/code\u003e to create objects in the map on demand.\n * \u003cp\u003e\n * When the {@link #get(Object)} method is called with a key that does not\n * exist in the map, the factory is used to create the object. The created\n * object will be added to the map using the requested key.\n * \u003cp\u003e\n * For instance:\n * \u003cpre\u003e\n * Factory\u0026lt;Date\u0026gt; factory \u003d new Factory\u0026lt;Date\u0026gt;() {\n *     public Date create() {\n *         return new Date();\n *     }\n * }\n * SortedMap\u0026lt;String, Date\u0026gt; lazy \u003d\n *     LazySortedMap.lazySortedMap(new HashMap\u0026lt;String, Date\u0026gt;(), factory);\n * Date date \u003d lazy.get(\"NOW\");\n * \u003c/pre\u003e\n *\n * After the above code is executed, \u003ccode\u003edate\u003c/code\u003e will refer to\n * a new \u003ccode\u003eDate\u003c/code\u003e instance. Furthermore, that \u003ccode\u003eDate\u003c/code\u003e\n * instance is mapped to the \"NOW\" key in the map.\n * \u003cp\u003e\n * \u003cstrong\u003eNote that LazySortedMap is not synchronized and is not thread-safe.\u003c/strong\u003e\n * If you wish to use this map from multiple threads concurrently, you must use\n * appropriate synchronization. The simplest approach is to wrap this map\n * using {@link java.util.Collections#synchronizedSortedMap}. This class may throw\n * exceptions when accessed by concurrent threads without synchronization.\n * \u003cp\u003e\n * This class is Serializable from Commons Collections 3.1.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Serialization version "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.LazySortedMap.lazySortedMap(java.util.SortedMap\u003cK, V\u003e, org.apache.commons.collections4.Factory\u003c? extends V\u003e)",
      "begin_line": 75,
      "end_line": 78,
      "comment": "\n     * Factory method to create a lazily instantiated sorted map.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map to decorate, must not be null\n     * @param factory  the factory to use, must not be null\n     * @return a new lazy sorted map\n     * @throws IllegalArgumentException if map or factory is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.LazySortedMap.lazySortedMap(java.util.SortedMap\u003cK, V\u003e, org.apache.commons.collections4.Transformer\u003c? super K, ? extends V\u003e)",
      "begin_line": 91,
      "end_line": 94,
      "comment": "\n     * Factory method to create a lazily instantiated sorted map.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map to decorate, must not be null\n     * @param factory  the factory to use, must not be null\n     * @return a new lazy sorted map\n     * @throws IllegalArgumentException if map or factory is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.LazySortedMap.LazySortedMap(java.util.SortedMap\u003cK, V\u003e, org.apache.commons.collections4.Factory\u003c? extends V\u003e)",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param map  the map to decorate, must not be null\n     * @param factory  the factory to use, must not be null\n     * @throws IllegalArgumentException if map or factory is null\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.LazySortedMap.LazySortedMap(java.util.SortedMap\u003cK, V\u003e, org.apache.commons.collections4.Transformer\u003c? super K, ? extends V\u003e)",
      "begin_line": 115,
      "end_line": 117,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param map  the map to decorate, must not be null\n     * @param factory  the factory to use, must not be null\n     * @throws IllegalArgumentException if map or factory is null\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.LazySortedMap.getSortedMap()",
      "begin_line": 125,
      "end_line": 127,
      "comment": "\n     * Gets the map being decorated.\n     *\n     * @return the decorated map\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.LazySortedMap.firstKey()",
      "begin_line": 130,
      "end_line": 132,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.LazySortedMap.lastKey()",
      "begin_line": 134,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.LazySortedMap.comparator()",
      "begin_line": 138,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.LazySortedMap.subMap(K, K)",
      "begin_line": 142,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 73)",
        "(line 144,col 9)-(line 144,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.LazySortedMap.headMap(K)",
      "begin_line": 147,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 65)",
        "(line 149,col 9)-(line 149,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.LazySortedMap.tailMap(K)",
      "begin_line": 152,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 67)",
        "(line 154,col 9)-(line 154,col 52)"
      ]
    }
  ]
}