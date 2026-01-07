{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/functors/InstanceofPredicate.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InstanceofPredicate",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.Predicate\u003cjava.lang.Object\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 30,
      "end_line": 83,
      "comment": "\n * Predicate implementation that returns true if the input is an instanceof\n * the type stored in this predicate.\n *\n * @since 3.0\n * @version $Id$\n "
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
        "iType"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " The type to compare to "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.InstanceofPredicate.instanceOfPredicate(java.lang.Class\u003c?\u003e)",
      "begin_line": 45,
      "end_line": 50,
      "comment": "\n     * Factory to create the identity predicate.\n     *\n     * @param type  the type to check for, may not be null\n     * @return the predicate\n     * @throws NullPointerException if the class is null\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 48,col 9)",
        "(line 49,col 9)-(line 49,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.InstanceofPredicate.InstanceofPredicate(java.lang.Class\u003c?\u003e)",
      "begin_line": 58,
      "end_line": 61,
      "comment": "\n     * Constructor that performs no validation.\n     * Use \u003ccode\u003einstanceOfPredicate\u003c/code\u003e if you want that.\n     *\n     * @param type  the type to check for\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 16)",
        "(line 60,col 9)-(line 60,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.InstanceofPredicate.evaluate(java.lang.Object)",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Evaluates the predicate returning true if the input object is of the correct type.\n     *\n     * @param object  the input object\n     * @return true if input is of stored type\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.InstanceofPredicate.getType()",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * Gets the type to compare to.\n     *\n     * @return the type\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 21)"
      ]
    }
  ]
}