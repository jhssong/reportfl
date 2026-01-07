{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/set/AbstractSetDecorator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractSetDecorator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.collection.AbstractCollectionDecorator\u003cE\u003e",
        "java.util.Set\u003cE\u003e"
      ],
      "begin_line": 32,
      "end_line": 76,
      "comment": "\n * Decorates another \u003ccode\u003eSet\u003c/code\u003e to provide additional behaviour.\n * \u003cp\u003e\n * Methods are forwarded directly to the decorated set.\n *\n * @param \u003cE\u003e the type of the elements in the set\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Serialization version "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.set.AbstractSetDecorator.AbstractSetDecorator()",
      "begin_line": 42,
      "end_line": 44,
      "comment": "\n     * Constructor only used in deserialization, do not use otherwise.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.set.AbstractSetDecorator.AbstractSetDecorator(java.util.Set\u003cE\u003e)",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param set  the set to decorate, must not be null\n     * @throws IllegalArgumentException if set is null\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractSetDecorator.decorated()",
      "begin_line": 61,
      "end_line": 64,
      "comment": "\n     * Gets the set being decorated.\n     *\n     * @return the decorated set\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractSetDecorator.equals(java.lang.Object)",
      "begin_line": 66,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractSetDecorator.hashCode()",
      "begin_line": 71,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 38)"
      ]
    }
  ]
}