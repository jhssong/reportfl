{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/map/LazyMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LazyMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.AbstractMapDecorator\u003cK, V\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 62,
      "end_line": 174,
      "comment": "\n * Decorates another \u003ccode\u003eMap\u003c/code\u003e to create objects in the map on demand.\n * \u003cp\u003e\n * When the {@link #get(Object)} method is called with a key that does not\n * exist in the map, the factory is used to create the object. The created\n * object will be added to the map using the requested key.\n * \u003cp\u003e\n * For instance:\n * \u003cpre\u003e\n * Factory\u0026lt;Date\u0026gt; factory \u003d new Factory\u0026lt;Date\u0026gt;() {\n *     public Date create() {\n *         return new Date();\n *     }\n * }\n * Map\u0026lt;String, Date\u0026gt; lazy \u003d LazyMap.lazyMap(new HashMap\u0026lt;String, Date\u0026gt;(), factory);\n * Date date \u003d lazy.get(\"NOW\");\n * \u003c/pre\u003e\n *\n * After the above code is executed, \u003ccode\u003edate\u003c/code\u003e will refer to\n * a new \u003ccode\u003eDate\u003c/code\u003e instance. Furthermore, that \u003ccode\u003eDate\u003c/code\u003e\n * instance is mapped to the \"NOW\" key in the map.\n * \u003cp\u003e\n * \u003cstrong\u003eNote that LazyMap is not synchronized and is not thread-safe.\u003c/strong\u003e\n * If you wish to use this map from multiple threads concurrently, you must use\n * appropriate synchronization. The simplest approach is to wrap this map\n * using {@link java.util.Collections#synchronizedMap(Map)}. This class may throw\n * exceptions when accessed by concurrent threads without synchronization.\n * \u003cp\u003e\n * This class is Serializable from Commons Collections 3.1.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Serialization version "
    },
    {
      "type": "field",
      "varNames": [
        "factory"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " The factory to use to construct elements "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.LazyMap.lazyMap(java.util.Map\u003cK, V\u003e, org.apache.commons.collections4.Factory\u003c? extends V\u003e)",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * Factory method to create a lazily instantiated map.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map to decorate, must not be null\n     * @param factory  the factory to use, must not be null\n     * @return a new lazy map\n     * @throws NullPointerException if map or factory is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.LazyMap.lazyMap(java.util.Map\u003cK, V\u003e, org.apache.commons.collections4.Transformer\u003c? super K, ? extends V\u003e)",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * Factory method to create a lazily instantiated map.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map to decorate, must not be null\n     * @param factory  the factory to use, must not be null\n     * @return a new lazy map\n     * @throws NullPointerException if map or factory is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.LazyMap.LazyMap(java.util.Map\u003cK, V\u003e, org.apache.commons.collections4.Factory\u003c? extends V\u003e)",
      "begin_line": 108,
      "end_line": 114,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param map  the map to decorate, must not be null\n     * @param factory  the factory to use, must not be null\n     * @throws NullPointerException if map or factory is null\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 19)",
        "(line 110,col 9)-(line 112,col 9)",
        "(line 113,col 9)-(line 113,col 70)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.LazyMap.LazyMap(java.util.Map\u003cK, V\u003e, org.apache.commons.collections4.Transformer\u003c? super K, ? extends V\u003e)",
      "begin_line": 123,
      "end_line": 129,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param map  the map to decorate, must not be null\n     * @param factory  the factory to use, must not be null\n     * @throws NullPointerException if map or factory is null\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 19)",
        "(line 125,col 9)-(line 127,col 9)",
        "(line 128,col 9)-(line 128,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.LazyMap.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 139,
      "end_line": 142,
      "comment": "\n     * Write the map out using a custom routine.\n     *\n     * @param out  the output stream\n     * @throws IOException\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 33)",
        "(line 141,col 9)-(line 141,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.LazyMap.readObject(java.io.ObjectInputStream)",
      "begin_line": 152,
      "end_line": 156,
      "comment": "\n     * Read the map in using a custom routine.\n     *\n     * @param in  the input stream\n     * @throws IOException\n     * @throws ClassNotFoundException\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 31)",
        "(line 155,col 9)-(line 155,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.LazyMap.get(java.lang.Object)",
      "begin_line": 159,
      "end_line": 170,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 162,col 9)-(line 168,col 9)",
        "(line 169,col 9)-(line 169,col 28)"
      ]
    }
  ]
}