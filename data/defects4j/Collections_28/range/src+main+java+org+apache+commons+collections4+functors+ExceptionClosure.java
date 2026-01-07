{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/functors/ExceptionClosure.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExceptionClosure",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.Closure\u003cE\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 30,
      "end_line": 73,
      "comment": "\n * Closure implementation that always throws an exception.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Serial version UID "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 36,
      "end_line": 37,
      "comment": " Singleton predicate instance "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.ExceptionClosure.exceptionClosure()",
      "begin_line": 46,
      "end_line": 49,
      "comment": "\n     * Factory returning the singleton instance.\n     *\n     * @param \u003cE\u003e the type that the closure acts on\n     * @return the singleton instance\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.ExceptionClosure.ExceptionClosure()",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Restricted constructor.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.ExceptionClosure.execute(E)",
      "begin_line": 64,
      "end_line": 67,
      "comment": "\n     * Always throw an exception.\n     *\n     * @param input  the input object\n     * @throws FunctorException always\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.ExceptionClosure.readResolve()",
      "begin_line": 69,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 24)"
      ]
    }
  ]
}