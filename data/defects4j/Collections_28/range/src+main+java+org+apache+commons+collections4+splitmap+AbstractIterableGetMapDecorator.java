{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/splitmap/AbstractIterableGetMapDecorator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractIterableGetMapDecorator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.IterableGet\u003cK, V\u003e"
      ],
      "begin_line": 34,
      "end_line": 139,
      "comment": "\n * {@link IterableGet} that uses a {@link Map}\u003cK, V\u003e for the\n * {@link org.apache.commons.collections4.Get Get}\u003cK, V\u003e implementation.\n *\n * @since 4.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "map"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " The map to decorate "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.splitmap.AbstractIterableGetMapDecorator.AbstractIterableGetMapDecorator(java.util.Map\u003cK, V\u003e)",
      "begin_line": 44,
      "end_line": 49,
      "comment": "\n     * Create a new AbstractSplitMapDecorator.\n     * @param map the map to decorate, must not be null\n     * @throws NullPointerException if map is null\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 47,col 9)",
        "(line 48,col 9)-(line 48,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.splitmap.AbstractIterableGetMapDecorator.AbstractIterableGetMapDecorator()",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Constructor only used in deserialization, do not use otherwise.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.splitmap.AbstractIterableGetMapDecorator.decorated()",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * Gets the map being decorated.\n     *\n     * @return the decorated map\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.splitmap.AbstractIterableGetMapDecorator.containsKey(java.lang.Object)",
      "begin_line": 67,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.splitmap.AbstractIterableGetMapDecorator.containsValue(java.lang.Object)",
      "begin_line": 72,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.splitmap.AbstractIterableGetMapDecorator.entrySet()",
      "begin_line": 77,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.splitmap.AbstractIterableGetMapDecorator.get(java.lang.Object)",
      "begin_line": 82,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.splitmap.AbstractIterableGetMapDecorator.remove(java.lang.Object)",
      "begin_line": 87,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.splitmap.AbstractIterableGetMapDecorator.isEmpty()",
      "begin_line": 92,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.splitmap.AbstractIterableGetMapDecorator.keySet()",
      "begin_line": 97,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.splitmap.AbstractIterableGetMapDecorator.size()",
      "begin_line": 102,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.splitmap.AbstractIterableGetMapDecorator.values()",
      "begin_line": 107,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.splitmap.AbstractIterableGetMapDecorator.mapIterator()",
      "begin_line": 116,
      "end_line": 119,
      "comment": "\n     * Get a MapIterator over this Get.\n     * @return MapIterator\u003cK, V\u003e\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.splitmap.AbstractIterableGetMapDecorator.equals(java.lang.Object)",
      "begin_line": 121,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 123,col 9)-(line 125,col 9)",
        "(line 126,col 9)-(line 126,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.splitmap.AbstractIterableGetMapDecorator.hashCode()",
      "begin_line": 129,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.splitmap.AbstractIterableGetMapDecorator.toString()",
      "begin_line": 134,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 38)"
      ]
    }
  ]
}