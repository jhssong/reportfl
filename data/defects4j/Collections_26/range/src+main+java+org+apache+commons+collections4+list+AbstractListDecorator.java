{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/list/AbstractListDecorator.java",
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
      "end_line": 120,
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
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListDecorator.addAll(int, java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 84,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListDecorator.get(int)",
      "begin_line": 88,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListDecorator.indexOf(java.lang.Object)",
      "begin_line": 92,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListDecorator.lastIndexOf(java.lang.Object)",
      "begin_line": 96,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListDecorator.listIterator()",
      "begin_line": 100,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListDecorator.listIterator(int)",
      "begin_line": 104,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListDecorator.remove(int)",
      "begin_line": 108,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListDecorator.set(int, E)",
      "begin_line": 112,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListDecorator.subList(int, int)",
      "begin_line": 116,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 55)"
      ]
    }
  ]
}