{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/bag/PredicatedBag.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PredicatedBag",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.collection.PredicatedCollection\u003cE\u003e",
        "org.apache.commons.collections4.Bag\u003cE\u003e"
      ],
      "begin_line": 41,
      "end_line": 119,
      "comment": "\n * Decorates another {@link Bag} to validate that additions\n * match a specified predicate.\n * \u003cp\u003e\n * This bag exists to provide validation for the decorated bag.\n * It is normally created to decorate an empty bag.\n * If an object cannot be added to the bag, an {@link IllegalArgumentException} is thrown.\n * \u003cp\u003e\n * One usage would be to ensure that no null entries are added to the bag.\n * \u003cpre\u003eBag bag \u003d PredicatedBag.decorate(new HashBag(), NotNullPredicate.INSTANCE);\u003c/pre\u003e\n * \u003cp\u003e\n * This class is Serializable from Commons Collections 3.1.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Serialization version "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.PredicatedBag.predicatedBag(org.apache.commons.collections4.Bag\u003cE\u003e, org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * Factory method to create a predicated (validating) bag.\n     * \u003cp\u003e\n     * If there are any elements already in the bag being decorated, they\n     * are validated.\n     *\n     * @param \u003cE\u003e the type of the elements in the bag\n     * @param bag  the bag to decorate, must not be null\n     * @param predicate  the predicate to use for validation, must not be null\n     * @return a new predicated Bag\n     * @throws IllegalArgumentException if bag or predicate is null\n     * @throws IllegalArgumentException if the bag contains invalid elements\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bag.PredicatedBag.PredicatedBag(org.apache.commons.collections4.Bag\u003cE\u003e, org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Constructor that wraps (not copies).\n     * \u003cp\u003e\n     * If there are any elements already in the bag being decorated, they\n     * are validated.\n     *\n     * @param bag  the bag to decorate, must not be null\n     * @param predicate  the predicate to use for validation, must not be null\n     * @throws IllegalArgumentException if bag or predicate is null\n     * @throws IllegalArgumentException if the bag contains invalid elements\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.PredicatedBag.decorated()",
      "begin_line": 85,
      "end_line": 88,
      "comment": "\n     * Gets the decorated bag.\n     *\n     * @return the decorated bag\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.PredicatedBag.equals(java.lang.Object)",
      "begin_line": 90,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.PredicatedBag.hashCode()",
      "begin_line": 95,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.PredicatedBag.add(E, int)",
      "begin_line": 102,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 25)",
        "(line 104,col 9)-(line 104,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.PredicatedBag.remove(java.lang.Object, int)",
      "begin_line": 107,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.PredicatedBag.uniqueSet()",
      "begin_line": 111,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.PredicatedBag.getCount(java.lang.Object)",
      "begin_line": 115,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 44)"
      ]
    }
  ]
}