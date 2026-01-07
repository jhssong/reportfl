{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/map/TransformedSortedMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TransformedSortedMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.TransformedMap\u003cK, V\u003e",
        "java.util.SortedMap\u003cK, V\u003e"
      ],
      "begin_line": 44,
      "end_line": 165,
      "comment": "\n * Decorates another \u003ccode\u003eSortedMap \u003c/code\u003e to transform objects that are added.\n * \u003cp\u003e\n * The Map put methods and Map.Entry setValue method are affected by this class.\n * Thus objects must be removed or searched for using their transformed form.\n * For example, if the transformation converts Strings to Integers, you must\n * use the Integer form to remove objects.\n * \u003cp\u003e\n * \u003cstrong\u003eNote that TransformedSortedMap is not synchronized and is not thread-safe.\u003c/strong\u003e\n * If you wish to use this map from multiple threads concurrently, you must use\n * appropriate synchronization. The simplest approach is to wrap this map\n * using {@link java.util.Collections#synchronizedSortedMap}. This class may throw\n * exceptions when accessed by concurrent threads without synchronization.\n * \u003cp\u003e\n * This class is Serializable from Commons Collections 3.1.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Serialization version "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.TransformedSortedMap.transformingSortedMap(java.util.SortedMap\u003cK, V\u003e, org.apache.commons.collections4.Transformer\u003c? super K, ? extends K\u003e, org.apache.commons.collections4.Transformer\u003c? super V, ? extends V\u003e)",
      "begin_line": 66,
      "end_line": 70,
      "comment": "\n     * Factory method to create a transforming sorted map.\n     * \u003cp\u003e\n     * If there are any elements already in the map being decorated, they are NOT transformed.\n     * Contrast this with {@link #transformedSortedMap(SortedMap, Transformer, Transformer)}.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map to decorate, must not be null\n     * @param keyTransformer  the predicate to validate the keys, null means no transformation\n     * @param valueTransformer  the predicate to validate to values, null means no transformation\n     * @return a new transformed sorted map\n     * @throws NullPointerException if the map is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.TransformedSortedMap.transformedSortedMap(java.util.SortedMap\u003cK, V\u003e, org.apache.commons.collections4.Transformer\u003c? super K, ? extends K\u003e, org.apache.commons.collections4.Transformer\u003c? super V, ? extends V\u003e)",
      "begin_line": 89,
      "end_line": 101,
      "comment": "\n     * Factory method to create a transforming sorted map that will transform\n     * existing contents of the specified map.\n     * \u003cp\u003e\n     * If there are any elements already in the map being decorated, they\n     * will be transformed by this method.\n     * Contrast this with {@link #transformingSortedMap(SortedMap, Transformer, Transformer)}.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map to decorate, must not be null\n     * @param keyTransformer  the transformer to use for key conversion, null means no transformation\n     * @param valueTransformer  the transformer to use for value conversion, null means no transformation\n     * @return a new transformed sorted map\n     * @throws NullPointerException if map is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 94,col 86)",
        "(line 95,col 9)-(line 99,col 9)",
        "(line 100,col 9)-(line 100,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.TransformedSortedMap.TransformedSortedMap(java.util.SortedMap\u003cK, V\u003e, org.apache.commons.collections4.Transformer\u003c? super K, ? extends K\u003e, org.apache.commons.collections4.Transformer\u003c? super V, ? extends V\u003e)",
      "begin_line": 115,
      "end_line": 119,
      "comment": "\n     * Constructor that wraps (not copies).\n     * \u003cp\u003e\n     * If there are any elements already in the collection being decorated, they\n     * are NOT transformed.\u003c/p\u003e\n     *\n     * @param map  the map to decorate, must not be null\n     * @param keyTransformer  the predicate to validate the keys, null means no transformation\n     * @param valueTransformer  the predicate to validate to values, null means no transformation\n     * @throws NullPointerException if the map is null\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.TransformedSortedMap.getSortedMap()",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\n     * Gets the map being decorated.\n     *\n     * @return the decorated map\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.TransformedSortedMap.firstKey()",
      "begin_line": 132,
      "end_line": 135,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.TransformedSortedMap.lastKey()",
      "begin_line": 137,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.TransformedSortedMap.comparator()",
      "begin_line": 142,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.TransformedSortedMap.subMap(K, K)",
      "begin_line": 147,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 74)",
        "(line 150,col 9)-(line 150,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.TransformedSortedMap.headMap(K)",
      "begin_line": 153,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 66)",
        "(line 156,col 9)-(line 156,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.TransformedSortedMap.tailMap(K)",
      "begin_line": 159,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 68)",
        "(line 162,col 9)-(line 162,col 85)"
      ]
    }
  ]
}