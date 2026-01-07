{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/set/PredicatedSet.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PredicatedSet",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.collection.PredicatedCollection\u003cE\u003e",
        "java.util.Set\u003cE\u003e"
      ],
      "begin_line": 40,
      "end_line": 99,
      "comment": "\n * Decorates another \u003ccode\u003eSet\u003c/code\u003e to validate that all additions\n * match a specified predicate.\n * \u003cp\u003e\n * This set exists to provide validation for the decorated set.\n * It is normally created to decorate an empty set.\n * If an object cannot be added to the set, an IllegalArgumentException is thrown.\n * \u003cp\u003e\n * One usage would be to ensure that no null entries are added to the set.\n * \u003cpre\u003eSet set \u003d PredicatedSet.decorate(new HashSet(), NotNullPredicate.INSTANCE);\u003c/pre\u003e\n * \u003cp\u003e\n * This class is Serializable from Commons Collections 3.1.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Serialization version "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.PredicatedSet.predicatedSet(java.util.Set\u003cE\u003e, org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * Factory method to create a predicated (validating) set.\n     * \u003cp\u003e\n     * If there are any elements already in the set being decorated, they\n     * are validated.\n     *\n     * @param \u003cE\u003e the element type\n     * @param set  the set to decorate, must not be null\n     * @param predicate  the predicate to use for validation, must not be null\n     * @return a decorated set\n     * @throws NullPointerException if set or predicate is null\n     * @throws IllegalArgumentException if the set contains invalid elements\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.set.PredicatedSet.PredicatedSet(java.util.Set\u003cE\u003e, org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\n     * Constructor that wraps (not copies).\n     * \u003cp\u003e\n     * If there are any elements already in the set being decorated, they\n     * are validated.\n     *\n     * @param set  the set to decorate, must not be null\n     * @param predicate  the predicate to use for validation, must not be null\n     * @throws NullPointerException if set or predicate is null\n     * @throws IllegalArgumentException if the set contains invalid elements\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.PredicatedSet.decorated()",
      "begin_line": 84,
      "end_line": 87,
      "comment": "\n     * Gets the set being decorated.\n     *\n     * @return the decorated set\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.PredicatedSet.equals(java.lang.Object)",
      "begin_line": 89,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.PredicatedSet.hashCode()",
      "begin_line": 94,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 38)"
      ]
    }
  ]
}