{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/IterableGet.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IterableGet",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.collections4.Get\u003cK, V\u003e"
      ],
      "begin_line": 27,
      "end_line": 47,
      "comment": "\n * The \"read\" subset of the {@link java.util.Map} interface.\n *\n * @since 4.0\n * @version $Id$\n *\n * @see Put\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableGet.mapIterator()",
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * Obtains a \u003ccode\u003eMapIterator\u003c/code\u003e over the map.\n     * \u003cp\u003e\n     * A map iterator is an efficient way of iterating over maps.\n     * There is no need to access the entry set or use Map Entry objects.\n     * \u003cpre\u003e\n     * IterableMap\u003cString,Integer\u003e map \u003d new HashedMap\u003cString,Integer\u003e();\n     * MapIterator\u003cString,Integer\u003e it \u003d map.mapIterator();\n     * while (it.hasNext()) {\n     *   String key \u003d it.next();\n     *   Integer value \u003d it.getValue();\n     *   it.setValue(value + 1);\n     * }\n     * \u003c/pre\u003e\n     *\n     * @return a map iterator\n     ",
      "child_ranges": []
    }
  ]
}