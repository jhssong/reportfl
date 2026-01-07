{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/map/AbstractSortedMapDecorator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractSortedMapDecorator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.AbstractMapDecorator\u003cK, V\u003e",
        "org.apache.commons.collections4.IterableSortedMap\u003cK, V\u003e"
      ],
      "begin_line": 47,
      "end_line": 173,
      "comment": "\n * Provides a base decorator that enables additional functionality to be added\n * to a Map via decoration.\n * \u003cp\u003e\n * Methods are forwarded directly to the decorated map.\n * \u003cp\u003e\n * This implementation does not perform any special processing with the map views.\n * Instead it simply returns the set/collection from the wrapped map. This may be\n * undesirable, for example if you are trying to write a validating implementation\n * it would provide a loophole around the validation.\n * But, you might want that loophole, so this class is kept simple.\n *\n * @param \u003cK\u003e the type of the keys in the map\n * @param \u003cV\u003e the type of the values in the map\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapDecorator.AbstractSortedMapDecorator()",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Constructor only used in deserialization, do not use otherwise.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapDecorator.AbstractSortedMapDecorator(java.util.SortedMap\u003cK, V\u003e)",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param map  the map to decorate, must not be null\n     * @throws NullPointerException if the map is null\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapDecorator.decorated()",
      "begin_line": 73,
      "end_line": 76,
      "comment": "\n     * Gets the map being decorated.\n     *\n     * @return the decorated map\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapDecorator.comparator()",
      "begin_line": 79,
      "end_line": 82,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapDecorator.firstKey()",
      "begin_line": 84,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapDecorator.lastKey()",
      "begin_line": 89,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapDecorator.subMap(K, K)",
      "begin_line": 94,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapDecorator.headMap(K)",
      "begin_line": 99,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapDecorator.tailMap(K)",
      "begin_line": 104,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapDecorator.previousKey(K)",
      "begin_line": 109,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 53)",
        "(line 112,col 9)-(line 112,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapDecorator.nextKey(K)",
      "begin_line": 115,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 64)",
        "(line 118,col 9)-(line 118,col 18)",
        "(line 119,col 9)-(line 119,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapDecorator.mapIterator()",
      "begin_line": 125,
      "end_line": 128,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 55)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SortedMapIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.EntrySetToMapIteratorAdapter\u003cK, V\u003e",
        "org.apache.commons.collections4.OrderedMapIterator\u003cK, V\u003e"
      ],
      "begin_line": 136,
      "end_line": 172,
      "comment": "\n     * OrderedMapIterator implementation.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapDecorator.SortedMapIterator.SortedMapIterator(java.util.Set\u003cjava.util.Map.Entry\u003cK, V\u003e\u003e)",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\n         * Create a new AbstractSortedMapDecorator.SortedMapIterator.\n         * @param entrySet  the entrySet to iterate\n         ",
      "child_ranges": [
        "(line 144,col 13)-(line 144,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapDecorator.SortedMapIterator.reset()",
      "begin_line": 150,
      "end_line": 154,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 152,col 13)-(line 152,col 26)",
        "(line 153,col 13)-(line 153,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapDecorator.SortedMapIterator.hasPrevious()",
      "begin_line": 159,
      "end_line": 162,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 161,col 13)-(line 161,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapDecorator.SortedMapIterator.previous()",
      "begin_line": 167,
      "end_line": 171,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 169,col 13)-(line 169,col 74)",
        "(line 170,col 13)-(line 170,col 28)"
      ]
    }
  ]
}