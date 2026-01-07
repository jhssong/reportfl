{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/map/EntrySetToMapIteratorAdapter.java",
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
      "end_line": 113,
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
      "end_line": 57,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.EntrySetToMapIteratorAdapter.getValue()",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.EntrySetToMapIteratorAdapter.setValue(V)",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.EntrySetToMapIteratorAdapter.hasNext()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.EntrySetToMapIteratorAdapter.next()",
      "begin_line": 83,
      "end_line": 86,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 32)",
        "(line 85,col 9)-(line 85,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.EntrySetToMapIteratorAdapter.reset()",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.EntrySetToMapIteratorAdapter.remove()",
      "begin_line": 98,
      "end_line": 101,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 26)",
        "(line 100,col 9)-(line 100,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.EntrySetToMapIteratorAdapter.current()",
      "begin_line": 107,
      "end_line": 112,
      "comment": "\n     * Get the currently active entry.\n     * @return Map.Entry\u003cK, V\u003e\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 111,col 21)"
      ]
    }
  ]
}