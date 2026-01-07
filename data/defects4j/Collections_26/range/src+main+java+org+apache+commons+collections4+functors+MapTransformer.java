{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/functors/MapTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MapTransformer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.Transformer\u003cI, O\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 31,
      "end_line": 87,
      "comment": "\n * Transformer implementation that returns the value held in a specified map\n * using the input parameter as a key.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Serial version UID "
    },
    {
      "type": "field",
      "varNames": [
        "iMap"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " The map of data to lookup in "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.MapTransformer.mapTransformer(java.util.Map\u003c? super I, ? extends O\u003e)",
      "begin_line": 49,
      "end_line": 54,
      "comment": "\n     * Factory to create the transformer.\n     * \u003cp\u003e\n     * If the map is null, a transformer that always returns null is returned.\n     *\n     * @param \u003cI\u003e  the input type\n     * @param \u003cO\u003e  the output type\n     * @param map the map, not cloned\n     * @return the transformer\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 52,col 9)",
        "(line 53,col 9)-(line 53,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.MapTransformer.MapTransformer(java.util.Map\u003c? super I, ? extends O\u003e)",
      "begin_line": 62,
      "end_line": 65,
      "comment": "\n     * Constructor that performs no validation.\n     * Use \u003ccode\u003emapTransformer\u003c/code\u003e if you want that.\n     *\n     * @param map  the map to use for lookup, not cloned\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 16)",
        "(line 64,col 9)-(line 64,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.MapTransformer.transform(I)",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\n     * Transforms the input to result by looking it up in a \u003ccode\u003eMap\u003c/code\u003e.\n     *\n     * @param input  the input object to transform\n     * @return the transformed result\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.MapTransformer.getMap()",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * Gets the map to lookup in.\n     *\n     * @return the map\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 20)"
      ]
    }
  ]
}