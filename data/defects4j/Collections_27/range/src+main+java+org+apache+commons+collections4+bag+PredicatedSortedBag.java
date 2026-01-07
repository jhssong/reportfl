{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/bag/PredicatedSortedBag.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PredicatedSortedBag",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.bag.PredicatedBag\u003cE\u003e",
        "org.apache.commons.collections4.SortedBag\u003cE\u003e"
      ],
      "begin_line": 42,
      "end_line": 108,
      "comment": "\n * Decorates another {@link SortedBag} to validate that additions\n * match a specified predicate.\n * \u003cp\u003e\n * This bag exists to provide validation for the decorated bag.\n * It is normally created to decorate an empty bag.\n * If an object cannot be added to the bag, an {@link IllegalArgumentException} is thrown.\n * \u003cp\u003e\n * One usage would be to ensure that no null entries are added to the bag.\n * \u003cpre\u003e\n * SortedBag bag \u003d PredicatedSortedBag.predicatedSortedBag(new TreeBag(), NotNullPredicate.INSTANCE);\n * \u003c/pre\u003e\n * \u003cp\u003e\n * This class is Serializable from Commons Collections 3.1.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Serialization version "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.PredicatedSortedBag.predicatedSortedBag(org.apache.commons.collections4.SortedBag\u003cE\u003e, org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 61,
      "end_line": 64,
      "comment": "\n     * Factory method to create a predicated (validating) bag.\n     * \u003cp\u003e\n     * If there are any elements already in the bag being decorated, they\n     * are validated.\n     *\n     * @param \u003cE\u003e the type of the elements in the bag\n     * @param bag  the bag to decorate, must not be null\n     * @param predicate  the predicate to use for validation, must not be null\n     * @return a new predicated SortedBag\n     * @throws NullPointerException if bag or predicate is null\n     * @throws IllegalArgumentException if the bag contains invalid elements\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bag.PredicatedSortedBag.PredicatedSortedBag(org.apache.commons.collections4.SortedBag\u003cE\u003e, org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * Constructor that wraps (not copies).\n     * \u003cp\u003eIf there are any elements already in the bag being decorated, they\n     * are validated.\n     *\n     * @param bag  the bag to decorate, must not be null\n     * @param predicate  the predicate to use for validation, must not be null\n     * @throws NullPointerException if bag or predicate is null\n     * @throws IllegalArgumentException if the bag contains invalid elements\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.PredicatedSortedBag.decorated()",
      "begin_line": 86,
      "end_line": 89,
      "comment": "\n     * Gets the decorated sorted bag.\n     *\n     * @return the decorated bag\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.PredicatedSortedBag.first()",
      "begin_line": 93,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.PredicatedSortedBag.last()",
      "begin_line": 98,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.PredicatedSortedBag.comparator()",
      "begin_line": 103,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 40)"
      ]
    }
  ]
}