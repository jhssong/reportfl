{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/functors/ExceptionPredicate.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExceptionPredicate",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.Predicate\u003cT\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 30,
      "end_line": 73,
      "comment": "\n * Predicate implementation that always throws an exception.\n *\n * @since 3.0\n * @version $Id$\n "
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
      "signature": "org.apache.commons.collections4.functors.ExceptionPredicate.exceptionPredicate()",
      "begin_line": 46,
      "end_line": 49,
      "comment": "\n     * Factory returning the singleton instance.\n     *\n     * @param \u003cT\u003e  the object type\n     * @return the singleton instance\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.ExceptionPredicate.ExceptionPredicate()",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Restricted constructor.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.ExceptionPredicate.evaluate(T)",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * Evaluates the predicate always throwing an exception.\n     *\n     * @param object  the input object\n     * @return never\n     * @throws FunctorException always\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.ExceptionPredicate.readResolve()",
      "begin_line": 69,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 24)"
      ]
    }
  ]
}