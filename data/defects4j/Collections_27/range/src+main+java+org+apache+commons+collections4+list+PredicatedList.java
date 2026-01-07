{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/list/PredicatedList.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PredicatedList",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.collection.PredicatedCollection\u003cE\u003e",
        "java.util.List\u003cE\u003e"
      ],
      "begin_line": 48,
      "end_line": 184,
      "comment": "\n * Decorates another \u003ccode\u003eList\u003c/code\u003e to validate that all additions\n * match a specified predicate.\n * \u003cp\u003e\n * This list exists to provide validation for the decorated list.\n * It is normally created to decorate an empty list.\n * If an object cannot be added to the list, an IllegalArgumentException is thrown.\n * \u003cp\u003e\n * One usage would be to ensure that no null entries are added to the list.\n * \u003cpre\u003e\n * {@code\n * List\u003cString\u003e list \u003d\n *   PredicatedList.predicatedList(new ArrayList\u003cString\u003e(), PredicateUtils.notNullPredicate());\n * }\n * \u003c/pre\u003e\n * \u003cp\u003e\n * This class is Serializable from Commons Collections 3.1.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Serialization version "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.PredicatedList.predicatedList(java.util.List\u003cT\u003e, org.apache.commons.collections4.Predicate\u003c? super T\u003e)",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * Factory method to create a predicated (validating) list.\n     * \u003cp\u003e\n     * If there are any elements already in the list being decorated, they\n     * are validated.\n     *\n     * @param \u003cT\u003e the type of the elements in the list\n     * @param list  the list to decorate, must not be null\n     * @param predicate  the predicate to use for validation, must not be null\n     * @return a new predicated list\n     * @throws NullPointerException if list or predicate is null\n     * @throws IllegalArgumentException if the list contains invalid elements\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.list.PredicatedList.PredicatedList(java.util.List\u003cE\u003e, org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * Constructor that wraps (not copies).\n     * \u003cp\u003e\n     * If there are any elements already in the list being decorated, they\n     * are validated.\n     *\n     * @param list  the list to decorate, must not be null\n     * @param predicate  the predicate to use for validation, must not be null\n     * @throws NullPointerException if list or predicate is null\n     * @throws IllegalArgumentException if the list contains invalid elements\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.PredicatedList.decorated()",
      "begin_line": 92,
      "end_line": 95,
      "comment": "\n     * Gets the list being decorated.\n     *\n     * @return the decorated list\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.PredicatedList.equals(java.lang.Object)",
      "begin_line": 97,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.PredicatedList.hashCode()",
      "begin_line": 102,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.PredicatedList.get(int)",
      "begin_line": 109,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.PredicatedList.indexOf(java.lang.Object)",
      "begin_line": 113,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.PredicatedList.lastIndexOf(java.lang.Object)",
      "begin_line": 117,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.PredicatedList.remove(int)",
      "begin_line": 121,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.PredicatedList.add(int, E)",
      "begin_line": 127,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 25)",
        "(line 129,col 9)-(line 129,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.PredicatedList.addAll(int, java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 132,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 133,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 136,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.PredicatedList.listIterator()",
      "begin_line": 139,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.PredicatedList.listIterator(int)",
      "begin_line": 143,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.PredicatedList.set(int, E)",
      "begin_line": 147,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 25)",
        "(line 149,col 9)-(line 149,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.PredicatedList.subList(int, int)",
      "begin_line": 152,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 68)",
        "(line 154,col 9)-(line 154,col 53)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PredicatedListIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.iterators.AbstractListIteratorDecorator\u003cE\u003e"
      ],
      "begin_line": 160,
      "end_line": 182,
      "comment": "\n     * Inner class Iterator for the PredicatedList\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.list.PredicatedList.PredicatedListIterator.PredicatedListIterator(java.util.ListIterator\u003cE\u003e)",
      "begin_line": 167,
      "end_line": 169,
      "comment": "\n         * Create a new predicated list iterator.\n         *\n         * @param iterator  the list iterator to decorate\n         ",
      "child_ranges": [
        "(line 168,col 13)-(line 168,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.PredicatedList.PredicatedListIterator.add(E)",
      "begin_line": 171,
      "end_line": 175,
      "comment": "",
      "child_ranges": [
        "(line 173,col 13)-(line 173,col 29)",
        "(line 174,col 13)-(line 174,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.PredicatedList.PredicatedListIterator.set(E)",
      "begin_line": 177,
      "end_line": 181,
      "comment": "",
      "child_ranges": [
        "(line 179,col 13)-(line 179,col 29)",
        "(line 180,col 13)-(line 180,col 42)"
      ]
    }
  ]
}