{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/map/AbstractSortedMapDecorator.java",
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
      "end_line": 163,
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
      "end_line": 81,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapDecorator.firstKey()",
      "begin_line": 83,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapDecorator.lastKey()",
      "begin_line": 87,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapDecorator.subMap(K, K)",
      "begin_line": 91,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapDecorator.headMap(K)",
      "begin_line": 95,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapDecorator.tailMap(K)",
      "begin_line": 99,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapDecorator.previousKey(K)",
      "begin_line": 103,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 53)",
        "(line 105,col 9)-(line 105,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapDecorator.nextKey(K)",
      "begin_line": 108,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 64)",
        "(line 110,col 9)-(line 110,col 18)",
        "(line 111,col 9)-(line 111,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapDecorator.mapIterator()",
      "begin_line": 117,
      "end_line": 120,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 55)"
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
      "begin_line": 128,
      "end_line": 162,
      "comment": "\n     * OrderedMapIterator implementation.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapDecorator.SortedMapIterator.SortedMapIterator(java.util.Set\u003cjava.util.Map.Entry\u003cK, V\u003e\u003e)",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\n         * Create a new AbstractSortedMapDecorator.SortedMapIterator.\n         * @param entrySet  the entrySet to iterate\n         ",
      "child_ranges": [
        "(line 136,col 13)-(line 136,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapDecorator.SortedMapIterator.reset()",
      "begin_line": 142,
      "end_line": 146,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 144,col 13)-(line 144,col 26)",
        "(line 145,col 13)-(line 145,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapDecorator.SortedMapIterator.hasPrevious()",
      "begin_line": 151,
      "end_line": 153,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 152,col 13)-(line 152,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.AbstractSortedMapDecorator.SortedMapIterator.previous()",
      "begin_line": 158,
      "end_line": 161,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 159,col 13)-(line 159,col 74)",
        "(line 160,col 13)-(line 160,col 28)"
      ]
    }
  ]
}