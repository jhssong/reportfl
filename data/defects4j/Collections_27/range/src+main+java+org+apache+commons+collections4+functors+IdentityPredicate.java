{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/functors/IdentityPredicate.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IdentityPredicate",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.Predicate\u003cT\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 30,
      "end_line": 84,
      "comment": "\n * Predicate implementation that returns true if the input is the same object\n * as the one stored in this predicate.\n *\n * @since 3.0\n * @version $Id$\n "
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
        "iValue"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " The value to compare to "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.IdentityPredicate.identityPredicate(T)",
      "begin_line": 45,
      "end_line": 50,
      "comment": "\n     * Factory to create the identity predicate.\n     *\n     * @param \u003cT\u003e the type that the predicate queries\n     * @param object  the object to compare to\n     * @return the predicate\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 48,col 9)",
        "(line 49,col 9)-(line 49,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.IdentityPredicate.IdentityPredicate(T)",
      "begin_line": 58,
      "end_line": 61,
      "comment": "\n     * Constructor that performs no validation.\n     * Use \u003ccode\u003eidentityPredicate\u003c/code\u003e if you want that.\n     *\n     * @param object  the object to compare to\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 16)",
        "(line 60,col 9)-(line 60,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.IdentityPredicate.evaluate(T)",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * Evaluates the predicate returning true if the input object is identical to\n     * the stored object.\n     *\n     * @param object  the input object\n     * @return true if input is the same object as the stored value\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.IdentityPredicate.getValue()",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * Gets the value.\n     *\n     * @return the value\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 22)"
      ]
    }
  ]
}