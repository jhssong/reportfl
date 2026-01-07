{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/functors/PredicateDecorator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PredicateDecorator",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.collections4.Predicate\u003cT\u003e"
      ],
      "begin_line": 29,
      "end_line": 41,
      "comment": "\n * Defines a predicate that decorates one or more other predicates.\n * \u003cp\u003e\n * This interface enables tools to access the decorated predicates.\n *\n * @since 3.1\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.PredicateDecorator.getPredicates()",
      "begin_line": 39,
      "end_line": 39,
      "comment": "\n     * Gets the predicates being decorated as an array.\n     * \u003cp\u003e\n     * The array may be the internal data structure of the predicate and thus\n     * should not be altered.\n     *\n     * @return the predicates being decorated\n     ",
      "child_ranges": []
    }
  ]
}