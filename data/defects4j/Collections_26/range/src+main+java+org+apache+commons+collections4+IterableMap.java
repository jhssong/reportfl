{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/IterableMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IterableMap",
      "is_interface": true,
      "parent_types": [
        "java.util.Map\u003cK, V\u003e",
        "org.apache.commons.collections4.Put\u003cK, V\u003e",
        "org.apache.commons.collections4.IterableGet\u003cK, V\u003e"
      ],
      "begin_line": 42,
      "end_line": 43,
      "comment": "\n * Defines a map that can be iterated directly without needing to create an entry set.\n * \u003cp\u003e\n * A map iterator is an efficient way of iterating over maps.\n * There is no need to access the entry set or use Map Entry objects.\n * \u003cpre\u003e\n * IterableMap\u003cString,Integer\u003e map \u003d new HashedMap\u003cString,Integer\u003e();\n * MapIterator\u003cString,Integer\u003e it \u003d map.mapIterator();\n * while (it.hasNext()) {\n *   String key \u003d it.next();\n *   Integer value \u003d it.getValue();\n *   it.setValue(value + 1);\n * }\n * \u003c/pre\u003e\n *\n * @param \u003cK\u003e the type of the keys in the map\n * @param \u003cV\u003e the type of the values in the map\n *\n * @since 3.0\n * @version $Id$\n "
    }
  ]
}