{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/bidimap/AbstractSortedBidiMapDecorator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractSortedBidiMapDecorator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.bidimap.AbstractOrderedBidiMapDecorator\u003cK, V\u003e",
        "org.apache.commons.collections4.SortedBidiMap\u003cK, V\u003e"
      ],
      "begin_line": 39,
      "end_line": 93,
      "comment": "\n * Provides a base decorator that enables additional functionality to be added\n * to a SortedBidiMap via decoration.\n * \u003cp\u003e\n * Methods are forwarded directly to the decorated map.\n * \u003cp\u003e\n * This implementation does not perform any special processing with the map views.\n * Instead it simply returns the inverse from the wrapped map. This may be\n * undesirable, for example if you are trying to write a validating implementation\n * it would provide a loophole around the validation.\n * But, you might want that loophole, so this class is kept simple.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.AbstractSortedBidiMapDecorator.AbstractSortedBidiMapDecorator(org.apache.commons.collections4.SortedBidiMap\u003cK, V\u003e)",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param map  the map to decorate, must not be null\n     * @throws NullPointerException if the collection is null\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractSortedBidiMapDecorator.decorated()",
      "begin_line": 57,
      "end_line": 60,
      "comment": "\n     * Gets the map being decorated.\n     *\n     * @return the decorated map\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractSortedBidiMapDecorator.inverseBidiMap()",
      "begin_line": 63,
      "end_line": 66,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractSortedBidiMapDecorator.comparator()",
      "begin_line": 68,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractSortedBidiMapDecorator.valueComparator()",
      "begin_line": 73,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractSortedBidiMapDecorator.subMap(K, K)",
      "begin_line": 78,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractSortedBidiMapDecorator.headMap(K)",
      "begin_line": 83,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractSortedBidiMapDecorator.tailMap(K)",
      "begin_line": 88,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 44)"
      ]
    }
  ]
}