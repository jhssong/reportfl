{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/map/TransformedMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TransformedMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.AbstractInputCheckedMapDecorator\u003cK, V\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 48,
      "end_line": 246,
      "comment": "\n * Decorates another \u003ccode\u003eMap\u003c/code\u003e to transform objects that are added.\n * \u003cp\u003e\n * The Map put methods and Map.Entry setValue method are affected by this class.\n * Thus objects must be removed or searched for using their transformed form.\n * For example, if the transformation converts Strings to Integers, you must\n * use the Integer form to remove objects.\n * \u003cp\u003e\n * \u003cstrong\u003eNote that TransformedMap is not synchronized and is not thread-safe.\u003c/strong\u003e\n * If you wish to use this map from multiple threads concurrently, you must use\n * appropriate synchronization. The simplest approach is to wrap this map\n * using {@link java.util.Collections#synchronizedMap(Map)}. This class may throw\n * exceptions when accessed by concurrent threads without synchronization.\n * \u003cp\u003e\n * This class is Serializable from Commons Collections 3.1.\n * \u003cp\u003e\n * @see org.apache.commons.collections4.splitmap.TransformedSplitMap\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Serialization version "
    },
    {
      "type": "field",
      "varNames": [
        "keyTransformer"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " The transformer to use for the key "
    },
    {
      "type": "field",
      "varNames": [
        "valueTransformer"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " The transformer to use for the value "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.TransformedMap.transformingMap(java.util.Map\u003cK, V\u003e, org.apache.commons.collections4.Transformer\u003c? super K, ? extends K\u003e, org.apache.commons.collections4.Transformer\u003c? super V, ? extends V\u003e)",
      "begin_line": 76,
      "end_line": 80,
      "comment": "\n     * Factory method to create a transforming map.\n     * \u003cp\u003e\n     * If there are any elements already in the map being decorated, they\n     * are NOT transformed.\n     * Contrast this with {@link #transformedMap(Map, Transformer, Transformer)}.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map to decorate, must not be null\n     * @param keyTransformer  the transformer to use for key conversion, null means no transformation\n     * @param valueTransformer  the transformer to use for value conversion, null means no transformation\n     * @return a new transformed map\n     * @throws NullPointerException if map is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.TransformedMap.transformedMap(java.util.Map\u003cK, V\u003e, org.apache.commons.collections4.Transformer\u003c? super K, ? extends K\u003e, org.apache.commons.collections4.Transformer\u003c? super V, ? extends V\u003e)",
      "begin_line": 99,
      "end_line": 109,
      "comment": "\n     * Factory method to create a transforming map that will transform\n     * existing contents of the specified map.\n     * \u003cp\u003e\n     * If there are any elements already in the map being decorated, they\n     * will be transformed by this method.\n     * Contrast this with {@link #transformingMap(Map, Transformer, Transformer)}.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map to decorate, must not be null\n     * @param keyTransformer  the transformer to use for key conversion, null means no transformation\n     * @param valueTransformer  the transformer to use for value conversion, null means no transformation\n     * @return a new transformed map\n     * @throws NullPointerException if map is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 111)",
        "(line 103,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 108,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.TransformedMap.TransformedMap(java.util.Map\u003cK, V\u003e, org.apache.commons.collections4.Transformer\u003c? super K, ? extends K\u003e, org.apache.commons.collections4.Transformer\u003c? super V, ? extends V\u003e)",
      "begin_line": 123,
      "end_line": 128,
      "comment": "\n     * Constructor that wraps (not copies).\n     * \u003cp\u003e\n     * If there are any elements already in the collection being decorated, they\n     * are NOT transformed.\n     *\n     * @param map  the map to decorate, must not be null\n     * @param keyTransformer  the transformer to use for key conversion, null means no conversion\n     * @param valueTransformer  the transformer to use for value conversion, null means no conversion\n     * @throws NullPointerException if map is null\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 19)",
        "(line 126,col 9)-(line 126,col 45)",
        "(line 127,col 9)-(line 127,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.TransformedMap.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 138,
      "end_line": 141,
      "comment": "\n     * Write the map out using a custom routine.\n     *\n     * @param out  the output stream\n     * @throws IOException\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 33)",
        "(line 140,col 9)-(line 140,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.TransformedMap.readObject(java.io.ObjectInputStream)",
      "begin_line": 151,
      "end_line": 155,
      "comment": "\n     * Read the map in using a custom routine.\n     *\n     * @param in  the input stream\n     * @throws IOException\n     * @throws ClassNotFoundException\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 31)",
        "(line 154,col 9)-(line 154,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.TransformedMap.transformKey(K)",
      "begin_line": 166,
      "end_line": 171,
      "comment": "\n     * Transforms a key.\n     * \u003cp\u003e\n     * The transformer itself may throw an exception if necessary.\n     *\n     * @param object  the object to transform\n     * @return the transformed object\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 169,col 9)",
        "(line 170,col 9)-(line 170,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.TransformedMap.transformValue(V)",
      "begin_line": 181,
      "end_line": 186,
      "comment": "\n     * Transforms a value.\n     * \u003cp\u003e\n     * The transformer itself may throw an exception if necessary.\n     *\n     * @param object  the object to transform\n     * @return the transformed object\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 184,col 9)",
        "(line 185,col 9)-(line 185,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.TransformedMap.transformMap(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 196,
      "end_line": 207,
      "comment": "\n     * Transforms a map.\n     * \u003cp\u003e\n     * The transformer itself may throw an exception if necessary.\n     *\n     * @param map  the map to transform\n     * @return the transformed object\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 200,col 9)",
        "(line 201,col 9)-(line 201,col 65)",
        "(line 203,col 9)-(line 205,col 9)",
        "(line 206,col 9)-(line 206,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.TransformedMap.checkSetValue(V)",
      "begin_line": 216,
      "end_line": 219,
      "comment": "\n     * Override to transform the value when using \u003ccode\u003esetValue\u003c/code\u003e.\n     *\n     * @param value  the value to transform\n     * @return the transformed value\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.TransformedMap.isSetValueChecking()",
      "begin_line": 227,
      "end_line": 230,
      "comment": "\n     * Override to only return true when there is a value transformer.\n     *\n     * @return true if a value transformer is in use\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.TransformedMap.put(K, V)",
      "begin_line": 233,
      "end_line": 238,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 32)",
        "(line 236,col 9)-(line 236,col 38)",
        "(line 237,col 9)-(line 237,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.TransformedMap.putAll(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 240,
      "end_line": 244,
      "comment": "",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 44)",
        "(line 243,col 9)-(line 243,col 38)"
      ]
    }
  ]
}