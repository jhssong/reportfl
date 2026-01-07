{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/multimap/TransformedMultiValuedMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TransformedMultiValuedMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator\u003cK, V\u003e"
      ],
      "begin_line": 41,
      "end_line": 236,
      "comment": "\n * Decorates another \u003ccode\u003eMultiValuedMap\u003c/code\u003e to transform objects that are added.\n * \u003cp\u003e\n * This class affects the MultiValuedMap put methods. Thus objects must be\n * removed or searched for using their transformed form. For example, if the\n * transformation converts Strings to Integers, you must use the Integer form to\n * remove objects.\n * \u003cp\u003e\n * \u003cstrong\u003eNote that TransformedMultiValuedMap is not synchronized and is not thread-safe.\u003c/strong\u003e\n *\n * @since 4.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Serialization Version "
    },
    {
      "type": "field",
      "varNames": [
        "keyTransformer"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "valueTransformer"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.TransformedMultiValuedMap.transformingMap(org.apache.commons.collections4.MultiValuedMap\u003cK, V\u003e, org.apache.commons.collections4.Transformer\u003c? super K, ? extends K\u003e, org.apache.commons.collections4.Transformer\u003c? super V, ? extends V\u003e)",
      "begin_line": 67,
      "end_line": 71,
      "comment": "\n     * Factory method to create a transforming MultiValuedMap.\n     * \u003cp\u003e\n     * If there are any elements already in the map being decorated, they are\n     * NOT transformed. Contrast this with\n     * {@link #transformedMap(MultiValuedMap, Transformer, Transformer)}.\n     *\n     * @param \u003cK\u003e the key type\n     * @param \u003cV\u003e the value type\n     * @param map the MultiValuedMap to decorate, must not be null\n     * @param keyTransformer the transformer to use for key conversion, null\n     *        means no transformation\n     * @param valueTransformer the transformer to use for value conversion, null\n     *        means no transformation\n     * @return a new transformed MultiValuedMap\n     * @throws IllegalArgumentException if map is null\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.TransformedMultiValuedMap.transformedMap(org.apache.commons.collections4.MultiValuedMap\u003cK, V\u003e, org.apache.commons.collections4.Transformer\u003c? super K, ? extends K\u003e, org.apache.commons.collections4.Transformer\u003c? super V, ? extends V\u003e)",
      "begin_line": 91,
      "end_line": 103,
      "comment": "\n     * Factory method to create a transforming MultiValuedMap that will\n     * transform existing contents of the specified map.\n     * \u003cp\u003e\n     * If there are any elements already in the map being decorated, they will\n     * be transformed by this method. Contrast this with\n     * {@link #transformingMap(MultiValuedMap, Transformer, Transformer)}.\n     *\n     * @param \u003cK\u003e the key type\n     * @param \u003cV\u003e the value type\n     * @param map the MultiValuedMap to decorate, must not be null\n     * @param keyTransformer the transformer to use for key conversion, null\n     *        means no transformation\n     * @param valueTransformer the transformer to use for value conversion, null\n     *        means no transformation\n     * @return a new transformed MultiValuedMap\n     * @throws IllegalArgumentException if map is null\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 95,col 91)",
        "(line 96,col 9)-(line 101,col 9)",
        "(line 102,col 9)-(line 102,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.TransformedMultiValuedMap.TransformedMultiValuedMap(org.apache.commons.collections4.MultiValuedMap\u003cK, V\u003e, org.apache.commons.collections4.Transformer\u003c? super K, ? extends K\u003e, org.apache.commons.collections4.Transformer\u003c? super V, ? extends V\u003e)",
      "begin_line": 119,
      "end_line": 124,
      "comment": "\n     * Constructor that wraps (not copies).\n     * \u003cp\u003e\n     * If there are any elements already in the collection being decorated, they\n     * are NOT transformed.\n     *\n     * @param map the MultiValuedMap to decorate, must not be null\n     * @param keyTransformer the transformer to use for key conversion, null\n     *        means no conversion\n     * @param valueTransformer the transformer to use for value conversion, null\n     *        means no conversion\n     * @throws IllegalArgumentException if map is null\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 19)",
        "(line 122,col 9)-(line 122,col 45)",
        "(line 123,col 9)-(line 123,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.TransformedMultiValuedMap.transformKey(K)",
      "begin_line": 134,
      "end_line": 139,
      "comment": "\n     * Transforms a key.\n     * \u003cp\u003e\n     * The transformer itself may throw an exception if necessary.\n     *\n     * @param object the object to transform\n     * @return the transformed object\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.TransformedMultiValuedMap.transformValue(V)",
      "begin_line": 149,
      "end_line": 154,
      "comment": "\n     * Transforms a value.\n     * \u003cp\u003e\n     * The transformer itself may throw an exception if necessary.\n     *\n     * @param object the object to transform\n     * @return the transformed object\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 152,col 9)",
        "(line 153,col 9)-(line 153,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.TransformedMultiValuedMap.transformMap(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 164,
      "end_line": 175,
      "comment": "\n     * Transforms a map.\n     * \u003cp\u003e\n     * The transformer itself may throw an exception if necessary.\n     *\n     * @param map the map to transform\n     * @return the transformed object\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 168,col 9)",
        "(line 169,col 9)-(line 169,col 65)",
        "(line 171,col 9)-(line 173,col 9)",
        "(line 174,col 9)-(line 174,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.TransformedMultiValuedMap.transformMultiValuedMap(org.apache.commons.collections4.MultiValuedMap\u003c? extends K, ? extends V\u003e)",
      "begin_line": 185,
      "end_line": 196,
      "comment": "\n     * Transforms a MultiValuedMap.\n     * \u003cp\u003e\n     * The transformer itself may throw an exception if necessary.\n     *\n     * @param map the MultiValuedMap to transform\n     * @return the transformed object\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 189,col 9)",
        "(line 190,col 9)-(line 190,col 75)",
        "(line 192,col 9)-(line 194,col 9)",
        "(line 195,col 9)-(line 195,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.TransformedMultiValuedMap.put(K, V)",
      "begin_line": 198,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 45)",
        "(line 201,col 9)-(line 201,col 51)",
        "(line 202,col 9)-(line 202,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.TransformedMultiValuedMap.putAll(K, java.lang.Iterable\u003c? extends V\u003e)",
      "begin_line": 205,
      "end_line": 218,
      "comment": "",
      "child_ranges": [
        "(line 208,col 9)-(line 210,col 9)",
        "(line 211,col 9)-(line 211,col 45)",
        "(line 212,col 9)-(line 212,col 56)",
        "(line 213,col 9)-(line 213,col 57)",
        "(line 214,col 9)-(line 216,col 9)",
        "(line 217,col 9)-(line 217,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.TransformedMultiValuedMap.putAll(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 220,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 222,col 9)-(line 224,col 9)",
        "(line 225,col 9)-(line 225,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.TransformedMultiValuedMap.putAll(org.apache.commons.collections4.MultiValuedMap\u003c? extends K, ? extends V\u003e)",
      "begin_line": 228,
      "end_line": 234,
      "comment": "",
      "child_ranges": [
        "(line 230,col 9)-(line 232,col 9)",
        "(line 233,col 9)-(line 233,col 55)"
      ]
    }
  ]
}