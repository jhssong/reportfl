{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/keyvalue/AbstractMapEntryDecorator.java",
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
      "end_line": 89,
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
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.keyvalue.AbstractMapEntryDecorator.getValue()",
      "begin_line": 63,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.keyvalue.AbstractMapEntryDecorator.setValue(V)",
      "begin_line": 67,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.keyvalue.AbstractMapEntryDecorator.equals(java.lang.Object)",
      "begin_line": 71,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 75,col 9)",
        "(line 76,col 9)-(line 76,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.keyvalue.AbstractMapEntryDecorator.hashCode()",
      "begin_line": 79,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.keyvalue.AbstractMapEntryDecorator.toString()",
      "begin_line": 84,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 32)"
      ]
    }
  ]
}