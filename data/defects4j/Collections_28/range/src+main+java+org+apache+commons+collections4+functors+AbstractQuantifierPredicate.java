{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/functors/AbstractQuantifierPredicate.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractQuantifierPredicate",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.functors.PredicateDecorator\u003cT\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 29,
      "end_line": 57,
      "comment": "\n * Abstract base class for quantification predicates, e.g. All, Any, None.\n *\n * @since 4.0\n * @version $Id$\n "
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
        "iPredicates"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " The array of predicates to call "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.AbstractQuantifierPredicate.AbstractQuantifierPredicate(org.apache.commons.collections4.Predicate\u003c? super T\u003e...)",
      "begin_line": 42,
      "end_line": 44,
      "comment": "\n     * Constructor that performs no validation.\n     *\n     * @param predicates  the predicates to check, not cloned, not null\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.AbstractQuantifierPredicate.getPredicates()",
      "begin_line": 52,
      "end_line": 55,
      "comment": "\n     * Gets the predicates.\n     *\n     * @return a copy of the predicates\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 49)"
      ]
    }
  ]
}