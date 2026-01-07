{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/multimap/TransformedMultiValuedMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TransformedMultiValuedMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator\u003cK, V\u003e"
      ],
      "begin_line": 40,
      "end_line": 191,
      "comment": "\n * Decorates another \u003ccode\u003eMultiValuedMap\u003c/code\u003e to transform objects that are added.\n * \u003cp\u003e\n * This class affects the MultiValuedMap put methods. Thus objects must be\n * removed or searched for using their transformed form. For example, if the\n * transformation converts Strings to Integers, you must use the Integer form to\n * remove objects.\n * \u003cp\u003e\n * \u003cstrong\u003eNote that TransformedMultiValuedMap is not synchronized and is not thread-safe.\u003c/strong\u003e\n *\n * @since 4.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Serialization Version "
    },
    {
      "type": "field",
      "varNames": [
        "keyTransformer"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " The key transformer "
    },
    {
      "type": "field",
      "varNames": [
        "valueTransformer"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " The value transformer "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.TransformedMultiValuedMap.transformingMap(org.apache.commons.collections4.MultiValuedMap\u003cK, V\u003e, org.apache.commons.collections4.Transformer\u003c? super K, ? extends K\u003e, org.apache.commons.collections4.Transformer\u003c? super V, ? extends V\u003e)",
      "begin_line": 66,
      "end_line": 70,
      "comment": "\n     * Factory method to create a transforming MultiValuedMap.\n     * \u003cp\u003e\n     * If there are any elements already in the map being decorated, they are\n     * NOT transformed. Contrast this with\n     * {@link #transformedMap(MultiValuedMap, Transformer, Transformer)}.\n     *\n     * @param \u003cK\u003e the key type\n     * @param \u003cV\u003e the value type\n     * @param map  the MultiValuedMap to decorate, may not be null\n     * @param keyTransformer  the transformer to use for key conversion, null means no conversion\n     * @param valueTransformer  the transformer to use for value conversion, null means no conversion\n     * @return a new transformed MultiValuedMap\n     * @throws NullPointerException if map is null\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.TransformedMultiValuedMap.transformedMap(org.apache.commons.collections4.MultiValuedMap\u003cK, V\u003e, org.apache.commons.collections4.Transformer\u003c? super K, ? extends K\u003e, org.apache.commons.collections4.Transformer\u003c? super V, ? extends V\u003e)",
      "begin_line": 88,
      "end_line": 99,
      "comment": "\n     * Factory method to create a transforming MultiValuedMap that will\n     * transform existing contents of the specified map.\n     * \u003cp\u003e\n     * If there are any elements already in the map being decorated, they will\n     * be transformed by this method. Contrast this with\n     * {@link #transformingMap(MultiValuedMap, Transformer, Transformer)}.\n     *\n     * @param \u003cK\u003e the key type\n     * @param \u003cV\u003e the value type\n     * @param map  the MultiValuedMap to decorate, may not be null\n     * @param keyTransformer  the transformer to use for key conversion, null means no conversion\n     * @param valueTransformer  the transformer to use for value conversion, null means no conversion\n     * @return a new transformed MultiValuedMap\n     * @throws NullPointerException if map is null\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 92,col 91)",
        "(line 93,col 9)-(line 97,col 9)",
        "(line 98,col 9)-(line 98,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.TransformedMultiValuedMap.TransformedMultiValuedMap(org.apache.commons.collections4.MultiValuedMap\u003cK, V\u003e, org.apache.commons.collections4.Transformer\u003c? super K, ? extends K\u003e, org.apache.commons.collections4.Transformer\u003c? super V, ? extends V\u003e)",
      "begin_line": 113,
      "end_line": 119,
      "comment": "\n     * Constructor that wraps (not copies).\n     * \u003cp\u003e\n     * If there are any elements already in the collection being decorated, they\n     * are NOT transformed.\n     *\n     * @param map  the MultiValuedMap to decorate, may not be null\n     * @param keyTransformer  the transformer to use for key conversion, null means no conversion\n     * @param valueTransformer  the transformer to use for value conversion, null means no conversion\n     * @throws NullPointerException if map is null\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 19)",
        "(line 117,col 9)-(line 117,col 45)",
        "(line 118,col 9)-(line 118,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.TransformedMultiValuedMap.transformKey(K)",
      "begin_line": 129,
      "end_line": 134,
      "comment": "\n     * Transforms a key.\n     * \u003cp\u003e\n     * The transformer itself may throw an exception if necessary.\n     *\n     * @param object  the object to transform\n     * @return the transformed object\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 132,col 9)",
        "(line 133,col 9)-(line 133,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.TransformedMultiValuedMap.transformValue(V)",
      "begin_line": 144,
      "end_line": 149,
      "comment": "\n     * Transforms a value.\n     * \u003cp\u003e\n     * The transformer itself may throw an exception if necessary.\n     *\n     * @param object  the object to transform\n     * @return the transformed object\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 148,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.TransformedMultiValuedMap.put(K, V)",
      "begin_line": 151,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.TransformedMultiValuedMap.putAll(K, java.lang.Iterable\u003c? extends V\u003e)",
      "begin_line": 156,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 158,col 9)-(line 160,col 9)",
        "(line 162,col 9)-(line 162,col 100)",
        "(line 163,col 9)-(line 163,col 70)",
        "(line 164,col 9)-(line 164,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.TransformedMultiValuedMap.putAll(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 167,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 169,col 9)-(line 171,col 9)",
        "(line 172,col 9)-(line 172,col 32)",
        "(line 173,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 176,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.TransformedMultiValuedMap.putAll(org.apache.commons.collections4.MultiValuedMap\u003c? extends K, ? extends V\u003e)",
      "begin_line": 179,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 181,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 184,col 32)",
        "(line 185,col 9)-(line 187,col 9)",
        "(line 188,col 9)-(line 188,col 23)"
      ]
    }
  ]
}