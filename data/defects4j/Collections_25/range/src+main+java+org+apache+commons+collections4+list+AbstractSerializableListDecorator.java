{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/list/AbstractSerializableListDecorator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractSerializableListDecorator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.list.AbstractListDecorator\u003cE\u003e"
      ],
      "begin_line": 31,
      "end_line": 72,
      "comment": "\n * Serializable subclass of AbstractListDecorator.\n *\n * @since 3.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Serialization version "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.list.AbstractSerializableListDecorator.AbstractSerializableListDecorator(java.util.List\u003cE\u003e)",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param list  the list to decorate, must not be null\n     * @throws IllegalArgumentException if list is null\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractSerializableListDecorator.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 54,
      "end_line": 57,
      "comment": "\n     * Write the list out using a custom routine.\n     *\n     * @param out  the output stream\n     * @throws IOException\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 33)",
        "(line 56,col 9)-(line 56,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractSerializableListDecorator.readObject(java.io.ObjectInputStream)",
      "begin_line": 66,
      "end_line": 70,
      "comment": "\n     * Read the list in using a custom routine.\n     *\n     * @param in  the input stream\n     * @throws IOException\n     * @throws ClassNotFoundException\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 31)",
        "(line 69,col 9)-(line 69,col 55)"
      ]
    }
  ]
}