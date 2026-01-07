{
  "filepath": "/tmp/Collections-26b/src/test/java/org/apache/commons/collections4/map/EmptyMapMutator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EmptyMapMutator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.CompositeMap.MapMutator\u003cK, V\u003e"
      ],
      "begin_line": 27,
      "end_line": 46,
      "comment": "\n * This class is used in TestCompositeMap. When testing serialization,\n * the class has to be separate of TestCompositeMap, else the test\n * class also has to be serialized.\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": " Serialization version "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.EmptyMapMutator.resolveCollision(org.apache.commons.collections4.map.CompositeMap\u003cK, V\u003e, java.util.Map\u003cK, V\u003e, java.util.Map\u003cK, V\u003e, java.util.Collection\u003cK\u003e)",
      "begin_line": 31,
      "end_line": 36,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.EmptyMapMutator.put(org.apache.commons.collections4.map.CompositeMap\u003cK, V\u003e, java.util.Map\u003cK, V\u003e[], K, V)",
      "begin_line": 38,
      "end_line": 40,
      "comment": "",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.EmptyMapMutator.putAll(org.apache.commons.collections4.map.CompositeMap\u003cK, V\u003e, java.util.Map\u003cK, V\u003e[], java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 42,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 32)"
      ]
    }
  ]
}