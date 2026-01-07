{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/map/EntrySetToMapIteratorAdapter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EntrySetToMapIteratorAdapter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.MapIterator\u003cK, V\u003e",
        "org.apache.commons.collections4.ResettableIterator\u003cK\u003e"
      ],
      "begin_line": 32,
      "end_line": 120,
      "comment": "\n * Adapts a Map entrySet to the MapIterator interface.\n *\n * @since 4.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "entrySet"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " The adapted Map entry Set. "
    },
    {
      "type": "field",
      "varNames": [
        "iterator"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " The resettable iterator in use. "
    },
    {
      "type": "field",
      "varNames": [
        "entry"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " The currently positioned Map entry. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.EntrySetToMapIteratorAdapter.EntrySetToMapIteratorAdapter(java.util.Set\u003cjava.util.Map.Entry\u003cK, V\u003e\u003e)",
      "begin_line": 47,
      "end_line": 50,
      "comment": "\n     * Create a new EntrySetToMapIteratorAdapter.\n     * @param entrySet  the entrySet to adapt\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 33)",
        "(line 49,col 9)-(line 49,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.EntrySetToMapIteratorAdapter.getKey()",
      "begin_line": 55,
      "end_line": 58,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.EntrySetToMapIteratorAdapter.getValue()",
      "begin_line": 63,
      "end_line": 66,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.EntrySetToMapIteratorAdapter.setValue(V)",
      "begin_line": 71,
      "end_line": 74,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.EntrySetToMapIteratorAdapter.hasNext()",
      "begin_line": 79,
      "end_line": 82,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.EntrySetToMapIteratorAdapter.next()",
      "begin_line": 87,
      "end_line": 91,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 32)",
        "(line 90,col 9)-(line 90,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.EntrySetToMapIteratorAdapter.reset()",
      "begin_line": 96,
      "end_line": 99,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.EntrySetToMapIteratorAdapter.remove()",
      "begin_line": 104,
      "end_line": 108,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 26)",
        "(line 107,col 9)-(line 107,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.EntrySetToMapIteratorAdapter.current()",
      "begin_line": 114,
      "end_line": 119,
      "comment": "\n     * Get the currently active entry.\n     * @return Map.Entry\u003cK, V\u003e\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 118,col 21)"
      ]
    }
  ]
}