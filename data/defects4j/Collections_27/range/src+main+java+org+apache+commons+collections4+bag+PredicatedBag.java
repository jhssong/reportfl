{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/bag/PredicatedBag.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PredicatedBag",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.collection.PredicatedCollection\u003cE\u003e",
        "org.apache.commons.collections4.Bag\u003cE\u003e"
      ],
      "begin_line": 43,
      "end_line": 125,
      "comment": "\n * Decorates another {@link Bag} to validate that additions\n * match a specified predicate.\n * \u003cp\u003e\n * This bag exists to provide validation for the decorated bag.\n * It is normally created to decorate an empty bag.\n * If an object cannot be added to the bag, an {@link IllegalArgumentException} is thrown.\n * \u003cp\u003e\n * One usage would be to ensure that no null entries are added to the bag.\n * \u003cpre\u003e\n * Bag bag \u003d PredicatedBag.predicatedBag(new HashBag(), NotNullPredicate.INSTANCE);\n * \u003c/pre\u003e\n * \u003cp\u003e\n * This class is Serializable from Commons Collections 3.1.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Serialization version "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.PredicatedBag.predicatedBag(org.apache.commons.collections4.Bag\u003cE\u003e, org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * Factory method to create a predicated (validating) bag.\n     * \u003cp\u003e\n     * If there are any elements already in the bag being decorated, they\n     * are validated.\n     *\n     * @param \u003cE\u003e the type of the elements in the bag\n     * @param bag  the bag to decorate, must not be null\n     * @param predicate  the predicate to use for validation, must not be null\n     * @return a new predicated Bag\n     * @throws NullPointerException if bag or predicate is null\n     * @throws IllegalArgumentException if the bag contains invalid elements\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bag.PredicatedBag.PredicatedBag(org.apache.commons.collections4.Bag\u003cE\u003e, org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * Constructor that wraps (not copies).\n     * \u003cp\u003e\n     * If there are any elements already in the bag being decorated, they\n     * are validated.\n     *\n     * @param bag  the bag to decorate, must not be null\n     * @param predicate  the predicate to use for validation, must not be null\n     * @throws NullPointerException if bag or predicate is null\n     * @throws IllegalArgumentException if the bag contains invalid elements\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.PredicatedBag.decorated()",
      "begin_line": 87,
      "end_line": 90,
      "comment": "\n     * Gets the decorated bag.\n     *\n     * @return the decorated bag\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.PredicatedBag.equals(java.lang.Object)",
      "begin_line": 92,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.PredicatedBag.hashCode()",
      "begin_line": 97,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.PredicatedBag.add(E, int)",
      "begin_line": 104,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 25)",
        "(line 107,col 9)-(line 107,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.PredicatedBag.remove(java.lang.Object, int)",
      "begin_line": 110,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.PredicatedBag.uniqueSet()",
      "begin_line": 115,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.PredicatedBag.getCount(java.lang.Object)",
      "begin_line": 120,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 44)"
      ]
    }
  ]
}