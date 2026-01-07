{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/functors/FalsePredicate.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FalsePredicate",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.Predicate\u003cT\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 29,
      "end_line": 72,
      "comment": "\n * Predicate implementation that always returns false.\n *\n * @since 3.0\n * @version $Id$\n "
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
      "signature": "org.apache.commons.collections4.functors.FalsePredicate.falsePredicate()",
      "begin_line": 45,
      "end_line": 48,
      "comment": "\n     * Get a typed instance.\n     *\n     * @param \u003cT\u003e the type that the predicate queries\n     * @return the singleton instance\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.FalsePredicate.FalsePredicate()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * Restricted constructor.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.FalsePredicate.evaluate(T)",
      "begin_line": 63,
      "end_line": 66,
      "comment": "\n     * Evaluates the predicate returning false always.\n     *\n     * @param object  the input object\n     * @return false always\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.FalsePredicate.readResolve()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 24)"
      ]
    }
  ]
}