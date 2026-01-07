{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/functors/ExceptionFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExceptionFactory",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.Factory\u003cT\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 30,
      "end_line": 72,
      "comment": "\n * Factory implementation that always throws an exception.\n *\n * @since 3.0\n * @version $Id$\n "
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
      "signature": "org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory()",
      "begin_line": 46,
      "end_line": 49,
      "comment": "\n     * Factory returning the singleton instance.\n     *\n     * @param \u003cT\u003e  the type the factory creates\n     * @return the singleton instance\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.ExceptionFactory.ExceptionFactory()",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Restricted constructor.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.ExceptionFactory.create()",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * Always throws an exception.\n     *\n     * @return never\n     * @throws FunctorException always\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.ExceptionFactory.readResolve()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 24)"
      ]
    }
  ]
}