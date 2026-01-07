{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/map/DefaultedMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultedMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.AbstractMapDecorator\u003cK, V\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 64,
      "end_line": 210,
      "comment": "\n * Decorates another \u003ccode\u003eMap\u003c/code\u003e returning a default value if the map\n * does not contain the requested key.\n * \u003cp\u003e\n * When the {@link #get(Object)} method is called with a key that does not\n * exist in the map, this map will return the default value specified in\n * the constructor/factory. Only the get method is altered, so the\n * {@link Map#containsKey(Object)} can be used to determine if a key really\n * is in the map or not.\n * \u003cp\u003e\n * The defaulted value is not added to the map.\n * Compare this behaviour with {@link LazyMap}, which does add the value\n * to the map (via a Transformer).\n * \u003cp\u003e\n * For instance:\n * \u003cpre\u003e\n * Map map \u003d new DefaultedMap(\"NULL\");\n * Object obj \u003d map.get(\"Surname\");\n * // obj \u003d\u003d \"NULL\"\n * \u003c/pre\u003e\n * After the above code is executed the map is still empty.\n * \u003cp\u003e\n * \u003cstrong\u003eNote that DefaultedMap is not synchronized and is not thread-safe.\u003c/strong\u003e\n * If you wish to use this map from multiple threads concurrently, you must use\n * appropriate synchronization. The simplest approach is to wrap this map\n * using {@link java.util.Collections#synchronizedMap(Map)}. This class may throw\n * exceptions when accessed by concurrent threads without synchronization.\n *\n * @since 3.2\n * @version $Id$\n *\n * @see LazyMap\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Serialization version "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " The transformer to use if the map does not contain a key "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.DefaultedMap.defaultedMap(java.util.Map\u003cK, V\u003e, V)",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * Factory method to create a defaulting map.\n     * \u003cp\u003e\n     * The value specified is returned when a missing key is found.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map to decorate, must not be null\n     * @param defaultValue  the default value to return when the key is not found\n     * @return a new defaulting map\n     * @throws NullPointerException if map is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.DefaultedMap.defaultedMap(java.util.Map\u003cK, V\u003e, org.apache.commons.collections4.Factory\u003c? extends V\u003e)",
      "begin_line": 104,
      "end_line": 109,
      "comment": "\n     * Factory method to create a defaulting map.\n     * \u003cp\u003e\n     * The factory specified is called when a missing key is found.\n     * The result will be returned as the result of the map get(key) method.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map to decorate, must not be null\n     * @param factory  the factory to use to create entries, must not be null\n     * @return a new defaulting map\n     * @throws NullPointerException if map or factory is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 108,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.DefaultedMap.defaultedMap(java.util.Map\u003cK, V\u003e, org.apache.commons.collections4.Transformer\u003c? super K, ? extends V\u003e)",
      "begin_line": 126,
      "end_line": 132,
      "comment": "\n     * Factory method to create a defaulting map.\n     * \u003cp\u003e\n     * The transformer specified is called when a missing key is found.\n     * The key is passed to the transformer as the input, and the result\n     * will be returned as the result of the map get(key) method.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map to decorate, must not be null\n     * @param transformer  the transformer to use as a factory to create entries, must not be null\n     * @return a new defaulting map\n     * @throws NullPointerException if map or factory is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 130,col 8)",
        "(line 131,col 8)-(line 131,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.DefaultedMap.DefaultedMap(V)",
      "begin_line": 144,
      "end_line": 146,
      "comment": "\n     * Constructs a new empty \u003ccode\u003eDefaultedMap\u003c/code\u003e that decorates\n     * a \u003ccode\u003eHashMap\u003c/code\u003e.\n     * \u003cp\u003e\n     * The object passed in will be returned by the map whenever an\n     * unknown key is requested.\n     *\n     * @param defaultValue  the default value to return when the key is not found\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 68)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.DefaultedMap.DefaultedMap(org.apache.commons.collections4.Transformer\u003c? super K, ? extends V\u003e)",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\n     * Constructs a new empty \u003ccode\u003eDefaultedMap\u003c/code\u003e that decorates a \u003ccode\u003eHashMap\u003c/code\u003e.\n     *\n     * @param defaultValueTransformer transformer to use to generate missing values.\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 59)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.DefaultedMap.DefaultedMap(java.util.Map\u003cK, V\u003e, org.apache.commons.collections4.Transformer\u003c? super K, ? extends V\u003e)",
      "begin_line": 164,
      "end_line": 170,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param map  the map to decorate, must not be null\n     * @param defaultValueTransformer  the value transformer to use\n     * @throws NullPointerException if map or transformer is null\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 19)",
        "(line 166,col 9)-(line 168,col 9)",
        "(line 169,col 9)-(line 169,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.DefaultedMap.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 179,
      "end_line": 182,
      "comment": "\n     * Write the map out using a custom routine.\n     *\n     * @param out  the output stream\n     * @throws IOException\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 33)",
        "(line 181,col 9)-(line 181,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.DefaultedMap.readObject(java.io.ObjectInputStream)",
      "begin_line": 191,
      "end_line": 195,
      "comment": "\n     * Read the map in using a custom routine.\n     *\n     * @param in  the input stream\n     * @throws IOException\n     * @throws ClassNotFoundException\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 31)",
        "(line 194,col 9)-(line 194,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.DefaultedMap.get(java.lang.Object)",
      "begin_line": 198,
      "end_line": 206,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 202,col 9)-(line 204,col 9)",
        "(line 205,col 9)-(line 205,col 28)"
      ]
    }
  ]
}