{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/functors/NOPClosure.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NOPClosure",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.Closure\u003cE\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 29,
      "end_line": 71,
      "comment": "\n * Closure implementation that does nothing.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Serial version UID "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 35,
      "end_line": 36,
      "comment": " Singleton predicate instance "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.NOPClosure.nopClosure()",
      "begin_line": 45,
      "end_line": 48,
      "comment": "\n     * Factory returning the singleton instance.\n     *\n     * @param \u003cE\u003e the type that the closure acts on\n     * @return the singleton instance\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.NOPClosure.NOPClosure()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * Constructor.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.NOPClosure.execute(E)",
      "begin_line": 62,
      "end_line": 65,
      "comment": "\n     * Do nothing.\n     *\n     * @param input  the input object\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.NOPClosure.readResolve()",
      "begin_line": 67,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 24)"
      ]
    }
  ]
}