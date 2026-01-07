{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/list/AbstractListDecorator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractListDecorator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.collection.AbstractCollectionDecorator\u003cE\u003e",
        "java.util.List\u003cE\u003e"
      ],
      "begin_line": 34,
      "end_line": 130,
      "comment": "\n * Decorates another {@link List} to provide additional behaviour.\n * \u003cp\u003e\n * Methods are forwarded directly to the decorated list.\n *\n * @param \u003cE\u003e the type of the elements in the list\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Serialization version--necessary in an abstract class? "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.list.AbstractListDecorator.AbstractListDecorator()",
      "begin_line": 44,
      "end_line": 46,
      "comment": "\n     * Constructor only used in deserialization, do not use otherwise.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.list.AbstractListDecorator.AbstractListDecorator(java.util.List\u003cE\u003e)",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param list  the list to decorate, must not be null\n     * @throws NullPointerException if list is null\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListDecorator.decorated()",
      "begin_line": 63,
      "end_line": 66,
      "comment": "\n     * Gets the list being decorated.\n     *\n     * @return the decorated list\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListDecorator.equals(java.lang.Object)",
      "begin_line": 68,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListDecorator.hashCode()",
      "begin_line": 73,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListDecorator.add(int, E)",
      "begin_line": 80,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListDecorator.addAll(int, java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 85,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListDecorator.get(int)",
      "begin_line": 90,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListDecorator.indexOf(java.lang.Object)",
      "begin_line": 95,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListDecorator.lastIndexOf(java.lang.Object)",
      "begin_line": 100,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListDecorator.listIterator()",
      "begin_line": 105,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListDecorator.listIterator(int)",
      "begin_line": 110,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListDecorator.remove(int)",
      "begin_line": 115,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListDecorator.set(int, E)",
      "begin_line": 120,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListDecorator.subList(int, int)",
      "begin_line": 125,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 55)"
      ]
    }
  ]
}