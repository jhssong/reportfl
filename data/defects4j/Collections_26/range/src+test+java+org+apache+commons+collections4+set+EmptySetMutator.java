{
  "filepath": "/tmp/Collections-26b/src/test/java/org/apache/commons/collections4/set/EmptySetMutator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EmptySetMutator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.set.CompositeSet.SetMutator\u003cE\u003e"
      ],
      "begin_line": 28,
      "end_line": 50,
      "comment": "\n * This class is used in CompositeSetTest. When testing serialization,\n * the class has to be separate of CompositeSetTest, else the test\n * class also has to be serialized.\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " Serialization version "
    },
    {
      "type": "field",
      "varNames": [
        "contained"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.set.EmptySetMutator.EmptySetMutator(java.util.Set\u003cE\u003e)",
      "begin_line": 35,
      "end_line": 37,
      "comment": "",
      "child_ranges": [
        "(line 36,col 9)-(line 36,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.EmptySetMutator.resolveCollision(org.apache.commons.collections4.set.CompositeSet\u003cE\u003e, java.util.Set\u003cE\u003e, java.util.Set\u003cE\u003e, java.util.Collection\u003cE\u003e)",
      "begin_line": 39,
      "end_line": 41,
      "comment": "",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.EmptySetMutator.add(org.apache.commons.collections4.set.CompositeSet\u003cE\u003e, java.util.List\u003cjava.util.Set\u003cE\u003e\u003e, E)",
      "begin_line": 43,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.EmptySetMutator.addAll(org.apache.commons.collections4.set.CompositeSet\u003cE\u003e, java.util.List\u003cjava.util.Set\u003cE\u003e\u003e, java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 47,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 38)"
      ]
    }
  ]
}