{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/splitmap/AbstractIterableGetMapDecorator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractIterableGetMapDecorator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.IterableGet\u003cK, V\u003e"
      ],
      "begin_line": 34,
      "end_line": 125,
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
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * Create a new AbstractSplitMapDecorator.\n     * @param decorated the Map to decorate\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.splitmap.AbstractIterableGetMapDecorator.AbstractIterableGetMapDecorator()",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n     * Constructor only used in deserialization, do not use otherwise.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.splitmap.AbstractIterableGetMapDecorator.decorated()",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * Gets the map being decorated.\n     *\n     * @return the decorated map\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.splitmap.AbstractIterableGetMapDecorator.containsKey(java.lang.Object)",
      "begin_line": 63,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.splitmap.AbstractIterableGetMapDecorator.containsValue(java.lang.Object)",
      "begin_line": 67,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.splitmap.AbstractIterableGetMapDecorator.entrySet()",
      "begin_line": 71,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.splitmap.AbstractIterableGetMapDecorator.get(java.lang.Object)",
      "begin_line": 75,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.splitmap.AbstractIterableGetMapDecorator.remove(java.lang.Object)",
      "begin_line": 79,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.splitmap.AbstractIterableGetMapDecorator.isEmpty()",
      "begin_line": 83,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.splitmap.AbstractIterableGetMapDecorator.keySet()",
      "begin_line": 87,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.splitmap.AbstractIterableGetMapDecorator.size()",
      "begin_line": 91,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.splitmap.AbstractIterableGetMapDecorator.values()",
      "begin_line": 95,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.splitmap.AbstractIterableGetMapDecorator.mapIterator()",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\n     * Get a MapIterator over this Get.\n     * @return MapIterator\u003cK, V\u003e\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.splitmap.AbstractIterableGetMapDecorator.equals(java.lang.Object)",
      "begin_line": 107,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 111,col 9)",
        "(line 112,col 9)-(line 112,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.splitmap.AbstractIterableGetMapDecorator.hashCode()",
      "begin_line": 115,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.splitmap.AbstractIterableGetMapDecorator.toString()",
      "begin_line": 120,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 38)"
      ]
    }
  ]
}