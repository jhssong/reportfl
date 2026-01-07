{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/set/AbstractSerializableSetDecorator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractSerializableSetDecorator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.set.AbstractSetDecorator\u003cE\u003e"
      ],
      "begin_line": 31,
      "end_line": 72,
      "comment": "\n * Serializable subclass of AbstractSetDecorator.\n *\n * @since 3.1\n * @version $Id$\n "
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
      "signature": "org.apache.commons.collections4.set.AbstractSerializableSetDecorator.AbstractSerializableSetDecorator(java.util.Set\u003cE\u003e)",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * Constructor.\n     *\n     * @param set  the list to decorate, must not be null\n     * @throws NullPointerException if set is null\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractSerializableSetDecorator.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 54,
      "end_line": 57,
      "comment": "\n     * Write the set out using a custom routine.\n     *\n     * @param out  the output stream\n     * @throws IOException\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 33)",
        "(line 56,col 9)-(line 56,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.AbstractSerializableSetDecorator.readObject(java.io.ObjectInputStream)",
      "begin_line": 66,
      "end_line": 70,
      "comment": "\n     * Read the set in using a custom routine.\n     *\n     * @param in  the input stream\n     * @throws IOException\n     * @throws ClassNotFoundException\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 31)",
        "(line 69,col 9)-(line 69,col 55)"
      ]
    }
  ]
}