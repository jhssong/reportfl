{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/splitmap/AbstractIterableGetMapDecorator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractIterableGetMapDecorator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.IterableGet\u003cK, V\u003e"
      ],
      "begin_line": 34,
      "end_line": 129,
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
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.splitmap.AbstractIterableGetMapDecorator.containsValue(java.lang.Object)",
      "begin_line": 71,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.splitmap.AbstractIterableGetMapDecorator.entrySet()",
      "begin_line": 75,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.splitmap.AbstractIterableGetMapDecorator.get(java.lang.Object)",
      "begin_line": 79,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.splitmap.AbstractIterableGetMapDecorator.remove(java.lang.Object)",
      "begin_line": 83,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.splitmap.AbstractIterableGetMapDecorator.isEmpty()",
      "begin_line": 87,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.splitmap.AbstractIterableGetMapDecorator.keySet()",
      "begin_line": 91,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.splitmap.AbstractIterableGetMapDecorator.size()",
      "begin_line": 95,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.splitmap.AbstractIterableGetMapDecorator.values()",
      "begin_line": 99,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.splitmap.AbstractIterableGetMapDecorator.mapIterator()",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n     * Get a MapIterator over this Get.\n     * @return MapIterator\u003cK, V\u003e\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.splitmap.AbstractIterableGetMapDecorator.equals(java.lang.Object)",
      "begin_line": 111,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 113,col 9)-(line 115,col 9)",
        "(line 116,col 9)-(line 116,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.splitmap.AbstractIterableGetMapDecorator.hashCode()",
      "begin_line": 119,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.splitmap.AbstractIterableGetMapDecorator.toString()",
      "begin_line": 124,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 38)"
      ]
    }
  ]
}