{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/splitmap/TransformedSplitMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TransformedSplitMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.splitmap.AbstractIterableGetMapDecorator\u003cK, V\u003e",
        "org.apache.commons.collections4.Put\u003cJ, U\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 61,
      "end_line": 217,
      "comment": "\n * Decorates another {@link Map} to transform objects that are added.\n * \u003cp\u003e\n * The Map put methods and Map.Entry setValue method are affected by this class.\n * Thus objects must be removed or searched for using their transformed form.\n * For example, if the transformation converts Strings to Integers, you must use\n * the Integer form to remove objects.\n * \u003cp\u003e\n * \u003cstrong\u003eNote that TransformedMap is not synchronized and is not\n * thread-safe.\u003c/strong\u003e If you wish to use this map from multiple threads\n * concurrently, you must use appropriate synchronization. The simplest approach\n * is to wrap this map using {@link java.util.Collections#synchronizedMap(Map)}.\n * This class may throw exceptions when accessed by concurrent threads without\n * synchronization.\n * \u003cp\u003e\n * The \"put\" and \"get\" type constraints of this class are mutually independent;\n * contrast with {@link org.apache.commons.collections4.map.TransformedMap} which,\n * by virtue of its implementing {@link Map}\u0026lt;K, V\u0026gt;, must be constructed in such\n * a way that its read and write parameters are generalized to a common (super-)type.\n * In practice this would often mean \u003ccode\u003e\u0026gt;Object, Object\u0026gt;\u003c/code\u003e, defeating\n * much of the usefulness of having parameterized types.\n * \u003cp\u003e\n * On the downside, this class is not drop-in compatible with {@link java.util.Map}\n * but is intended to be worked with either directly or by {@link Put} and\n * {@link org.apache.commons.collections4.Get Get} generalizations.\n *\n * @since 4.0\n * @version $Id$\n *\n * @see org.apache.commons.collections4.SplitMapUtils#readableMap(Get)\n * @see org.apache.commons.collections4.SplitMapUtils#writableMap(Put)\n "
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
        "keyTransformer"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " The transformer to use for the key "
    },
    {
      "type": "field",
      "varNames": [
        "valueTransformer"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " The transformer to use for the value "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.splitmap.TransformedSplitMap.transformingMap(java.util.Map\u003cK, V\u003e, org.apache.commons.collections4.Transformer\u003c? super J, ? extends K\u003e, org.apache.commons.collections4.Transformer\u003c? super U, ? extends V\u003e)",
      "begin_line": 90,
      "end_line": 94,
      "comment": "\n     * Factory method to create a transforming map.\n     * \u003cp\u003e\n     * If there are any elements already in the map being decorated, they are\n     * NOT transformed.\n     *\n     * @param \u003cJ\u003e  the input key type\n     * @param \u003cK\u003e  the output key type\n     * @param \u003cU\u003e  the input value type\n     * @param \u003cV\u003e  the output value type\n     * @param map the map to decorate, must not be null\n     * @param keyTransformer the transformer to use for key conversion, null\n     *   means no transformation\n     * @param valueTransformer the transformer to use for value conversion, null\n     *   means no transformation\n     * @return a new transformed map\n     * @throws IllegalArgumentException if map is null\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 90)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.splitmap.TransformedSplitMap.TransformedSplitMap(java.util.Map\u003cK, V\u003e, org.apache.commons.collections4.Transformer\u003c? super J, ? extends K\u003e, org.apache.commons.collections4.Transformer\u003c? super U, ? extends V\u003e)",
      "begin_line": 110,
      "end_line": 121,
      "comment": "\n     * Constructor that wraps (not copies).\n     * \u003cp\u003e\n     * If there are any elements already in the collection being decorated, they\n     * are NOT transformed.\n     *\n     * @param map the map to decorate, must not be null\n     * @param keyTransformer the transformer to use for key conversion, null\n     * means no conversion\n     * @param valueTransformer the transformer to use for value conversion, null\n     * means no conversion\n     * @throws IllegalArgumentException if map is null\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 19)",
        "(line 113,col 9)-(line 115,col 9)",
        "(line 116,col 9)-(line 116,col 45)",
        "(line 117,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 120,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.splitmap.TransformedSplitMap.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 130,
      "end_line": 133,
      "comment": "\n     * Write the map out using a custom routine.\n     *\n     * @param out the output stream\n     * @throws IOException\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 33)",
        "(line 132,col 9)-(line 132,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.splitmap.TransformedSplitMap.readObject(java.io.ObjectInputStream)",
      "begin_line": 143,
      "end_line": 147,
      "comment": "\n     * Read the map in using a custom routine.\n     *\n     * @param in the input stream\n     * @throws IOException\n     * @throws ClassNotFoundException\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 31)",
        "(line 146,col 9)-(line 146,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.splitmap.TransformedSplitMap.transformKey(J)",
      "begin_line": 158,
      "end_line": 160,
      "comment": "\n     * Transforms a key.\n     * \u003cp\u003e\n     * The transformer itself may throw an exception if necessary.\n     *\n     * @param object the object to transform\n     * @return the transformed object\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.splitmap.TransformedSplitMap.transformValue(U)",
      "begin_line": 170,
      "end_line": 172,
      "comment": "\n     * Transforms a value.\n     * \u003cp\u003e\n     * The transformer itself may throw an exception if necessary.\n     *\n     * @param object the object to transform\n     * @return the transformed object\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.splitmap.TransformedSplitMap.transformMap(java.util.Map\u003c? extends J, ? extends U\u003e)",
      "begin_line": 182,
      "end_line": 193,
      "comment": "\n     * Transforms a map.\n     * \u003cp\u003e\n     * The transformer itself may throw an exception if necessary.\n     *\n     * @param map the map to transform\n     * @return the transformed object\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 187,col 65)",
        "(line 189,col 9)-(line 191,col 9)",
        "(line 192,col 9)-(line 192,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.splitmap.TransformedSplitMap.checkSetValue(U)",
      "begin_line": 201,
      "end_line": 203,
      "comment": "\n     * Override to transform the value when using \u003ccode\u003esetValue\u003c/code\u003e.\n     *\n     * @param value the value to transform\n     * @return the transformed value\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.splitmap.TransformedSplitMap.put(J, U)",
      "begin_line": 206,
      "end_line": 208,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.splitmap.TransformedSplitMap.putAll(java.util.Map\u003c? extends J, ? extends U\u003e)",
      "begin_line": 210,
      "end_line": 212,
      "comment": "",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.splitmap.TransformedSplitMap.clear()",
      "begin_line": 214,
      "end_line": 216,
      "comment": "",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 28)"
      ]
    }
  ]
}