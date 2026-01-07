{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/keyvalue/AbstractMapEntryDecorator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractMapEntryDecorator",
      "is_interface": false,
      "parent_types": [
        "java.util.Map.Entry\u003cK, V\u003e",
        "org.apache.commons.collections4.KeyValue\u003cK, V\u003e"
      ],
      "begin_line": 30,
      "end_line": 92,
      "comment": "\n * Provides a base decorator that allows additional functionality to be\n * added to a {@link java.util.Map.Entry Map.Entry}.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "entry"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " The \u003ccode\u003eMap.Entry\u003c/code\u003e to decorate "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.keyvalue.AbstractMapEntryDecorator.AbstractMapEntryDecorator(java.util.Map.Entry\u003cK, V\u003e)",
      "begin_line": 41,
      "end_line": 46,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param entry  the \u003ccode\u003eMap.Entry\u003c/code\u003e to decorate, must not be null\n     * @throws NullPointerException if the collection is null\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 44,col 9)",
        "(line 45,col 9)-(line 45,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.keyvalue.AbstractMapEntryDecorator.getMapEntry()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * Gets the map being decorated.\n     *\n     * @return the decorated map\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.keyvalue.AbstractMapEntryDecorator.getKey()",
      "begin_line": 59,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.keyvalue.AbstractMapEntryDecorator.getValue()",
      "begin_line": 64,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.keyvalue.AbstractMapEntryDecorator.setValue(V)",
      "begin_line": 69,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.keyvalue.AbstractMapEntryDecorator.equals(java.lang.Object)",
      "begin_line": 74,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 76,col 9)-(line 78,col 9)",
        "(line 79,col 9)-(line 79,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.keyvalue.AbstractMapEntryDecorator.hashCode()",
      "begin_line": 82,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.keyvalue.AbstractMapEntryDecorator.toString()",
      "begin_line": 87,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 32)"
      ]
    }
  ]
}