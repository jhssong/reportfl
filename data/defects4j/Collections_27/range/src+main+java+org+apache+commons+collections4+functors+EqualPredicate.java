{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/functors/EqualPredicate.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EqualPredicate",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.Predicate\u003cT\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 31,
      "end_line": 122,
      "comment": "\n * Predicate implementation that returns true if the input is the same object\n * as the one stored in this predicate by equals.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Serial version UID "
    },
    {
      "type": "field",
      "varNames": [
        "iValue"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " The value to compare to "
    },
    {
      "type": "field",
      "varNames": [
        "equator"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " The equator to use for comparison "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.EqualPredicate.equalPredicate(T)",
      "begin_line": 49,
      "end_line": 54,
      "comment": "\n     * Factory to create the predicate.\n     *\n     * @param \u003cT\u003e the type that the predicate queries\n     * @param object  the object to compare to\n     * @return the predicate\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 52,col 9)",
        "(line 53,col 9)-(line 53,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.EqualPredicate.equalPredicate(T, org.apache.commons.collections4.Equator\u003cT\u003e)",
      "begin_line": 65,
      "end_line": 70,
      "comment": "\n     * Factory to create the identity predicate.\n     *\n     * @param \u003cT\u003e the type that the predicate queries\n     * @param object  the object to compare to\n     * @param equator  the equator to use for comparison\n     * @return the predicate\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 68,col 9)",
        "(line 69,col 9)-(line 69,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.EqualPredicate.EqualPredicate(T)",
      "begin_line": 78,
      "end_line": 82,
      "comment": "\n     * Constructor that performs no validation.\n     * Use \u003ccode\u003eequalPredicate\u003c/code\u003e if you want that.\n     *\n     * @param object  the object to compare to\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.EqualPredicate.EqualPredicate(T, org.apache.commons.collections4.Equator\u003cT\u003e)",
      "begin_line": 92,
      "end_line": 96,
      "comment": "\n     * Constructor that performs no validation.\n     * Use \u003ccode\u003eequalPredicate\u003c/code\u003e if you want that.\n     *\n     * @param object  the object to compare to\n     * @param equator  the equator to use for comparison\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 16)",
        "(line 94,col 9)-(line 94,col 24)",
        "(line 95,col 9)-(line 95,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.EqualPredicate.evaluate(T)",
      "begin_line": 104,
      "end_line": 110,
      "comment": "\n     * Evaluates the predicate returning true if the input equals the stored value.\n     *\n     * @param object  the input object\n     * @return true if input object equals stored value\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 109,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.EqualPredicate.getValue()",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\n     * Gets the value.\n     *\n     * @return the value\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 22)"
      ]
    }
  ]
}