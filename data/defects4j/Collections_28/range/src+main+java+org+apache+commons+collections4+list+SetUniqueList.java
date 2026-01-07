{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/list/SetUniqueList.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SetUniqueList",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.list.AbstractSerializableListDecorator\u003cE\u003e"
      ],
      "begin_line": 51,
      "end_line": 424,
      "comment": "\n * Decorates a \u003ccode\u003eList\u003c/code\u003e to ensure that no duplicates are present much\n * like a \u003ccode\u003eSet\u003c/code\u003e.\n * \u003cp\u003e\n * The \u003ccode\u003eList\u003c/code\u003e interface makes certain assumptions/requirements. This\n * implementation breaks these in certain ways, but this is merely the result of\n * rejecting duplicates. Each violation is explained in the method, but it\n * should not affect you. Bear in mind that Sets require immutable objects to\n * function correctly.\n * \u003cp\u003e\n * The {@link org.apache.commons.collections4.set.ListOrderedSet ListOrderedSet}\n * class provides an alternative approach, by wrapping an existing Set and\n * retaining insertion order in the iterator.\n * \u003cp\u003e\n * This class is Serializable from Commons Collections 3.1.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Serialization version. "
    },
    {
      "type": "field",
      "varNames": [
        "set"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Internal Set to maintain uniqueness. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.SetUniqueList.setUniqueList(java.util.List\u003cE\u003e)",
      "begin_line": 71,
      "end_line": 83,
      "comment": "\n     * Factory method to create a SetList using the supplied list to retain order.\n     * \u003cp\u003e\n     * If the list contains duplicates, these are removed (first indexed one\n     * kept). A \u003ccode\u003eHashSet\u003c/code\u003e is used for the set behaviour.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param list  the list to decorate, must not be null\n     * @return a new {@link SetUniqueList}\n     * @throws NullPointerException if list is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 74,col 9)",
        "(line 75,col 9)-(line 77,col 9)",
        "(line 78,col 9)-(line 78,col 52)",
        "(line 79,col 9)-(line 79,col 21)",
        "(line 80,col 9)-(line 80,col 81)",
        "(line 81,col 9)-(line 81,col 24)",
        "(line 82,col 9)-(line 82,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.list.SetUniqueList.SetUniqueList(java.util.List\u003cE\u003e, java.util.Set\u003cE\u003e)",
      "begin_line": 95,
      "end_line": 101,
      "comment": "\n     * Constructor that wraps (not copies) the List and specifies the set to use.\n     * \u003cp\u003e\n     * The set and list must both be correctly initialised to the same elements.\n     *\n     * @param set  the set to decorate, must not be null\n     * @param list  the list to decorate, must not be null\n     * @throws NullPointerException if set or list is null\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 20)",
        "(line 97,col 9)-(line 99,col 9)",
        "(line 100,col 9)-(line 100,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.SetUniqueList.asSet()",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n     * Gets an unmodifiable view as a Set.\n     *\n     * @return an unmodifiable set view\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.SetUniqueList.add(E)",
      "begin_line": 124,
      "end_line": 134,
      "comment": "\n     * Adds an element to the list if it is not already present.\n     * \u003cp\u003e\n     * \u003ci\u003e(Violation)\u003c/i\u003e The \u003ccode\u003eList\u003c/code\u003e interface requires that this\n     * method returns \u003ccode\u003etrue\u003c/code\u003e always. However this class may return\n     * \u003ccode\u003efalse\u003c/code\u003e because of the \u003ccode\u003eSet\u003c/code\u003e behaviour.\n     *\n     * @param object  the object to add\n     * @return true if object was added\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 38)",
        "(line 130,col 9)-(line 130,col 28)",
        "(line 133,col 9)-(line 133,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.SetUniqueList.add(int, E)",
      "begin_line": 147,
      "end_line": 154,
      "comment": "\n     * Adds an element to a specific index in the list if it is not already\n     * present.\n     * \u003cp\u003e\n     * \u003ci\u003e(Violation)\u003c/i\u003e The \u003ccode\u003eList\u003c/code\u003e interface makes the assumption\n     * that the element is always inserted. This may not happen with this\n     * implementation.\n     *\n     * @param index  the index to insert at\n     * @param object  the object to add\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 153,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.SetUniqueList.addAll(java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 169,
      "end_line": 172,
      "comment": "\n     * Adds a collection of objects to the end of the list avoiding duplicates.\n     * \u003cp\u003e\n     * Only elements that are not already in this list will be added, and\n     * duplicates from the specified collection will be ignored.\n     * \u003cp\u003e\n     * \u003ci\u003e(Violation)\u003c/i\u003e The \u003ccode\u003eList\u003c/code\u003e interface makes the assumption\n     * that the elements are always inserted. This may not happen with this\n     * implementation.\n     *\n     * @param coll  the collection to add in iterator order\n     * @return true if this collection changed\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.SetUniqueList.addAll(int, java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 189,
      "end_line": 198,
      "comment": "\n     * Adds a collection of objects a specific index in the list avoiding\n     * duplicates.\n     * \u003cp\u003e\n     * Only elements that are not already in this list will be added, and\n     * duplicates from the specified collection will be ignored.\n     * \u003cp\u003e\n     * \u003ci\u003e(Violation)\u003c/i\u003e The \u003ccode\u003eList\u003c/code\u003e interface makes the assumption\n     * that the elements are always inserted. This may not happen with this\n     * implementation.\n     *\n     * @param index  the index to insert at\n     * @param coll  the collection to add in iterator order\n     * @return true if this collection changed\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 48)",
        "(line 192,col 9)-(line 196,col 9)",
        "(line 197,col 9)-(line 197,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.SetUniqueList.set(int, E)",
      "begin_line": 212,
      "end_line": 227,
      "comment": "\n     * Sets the value at the specified index avoiding duplicates.\n     * \u003cp\u003e\n     * The object is set into the specified index. Afterwards, any previous\n     * duplicate is removed. If the object is not already in the list then a\n     * normal set occurs. If it is present, then the old version is removed.\n     *\n     * @param index  the index to insert at\n     * @param object  the object to set\n     * @return the previous object\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 40)",
        "(line 215,col 9)-(line 215,col 51)",
        "(line 217,col 9)-(line 221,col 9)",
        "(line 223,col 9)-(line 223,col 28)",
        "(line 224,col 9)-(line 224,col 24)",
        "(line 226,col 9)-(line 226,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.SetUniqueList.remove(java.lang.Object)",
      "begin_line": 229,
      "end_line": 236,
      "comment": "",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 50)",
        "(line 232,col 9)-(line 234,col 9)",
        "(line 235,col 9)-(line 235,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.SetUniqueList.remove(int)",
      "begin_line": 238,
      "end_line": 243,
      "comment": "",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 45)",
        "(line 241,col 9)-(line 241,col 27)",
        "(line 242,col 9)-(line 242,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.SetUniqueList.removeAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 245,
      "end_line": 252,
      "comment": "",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 31)",
        "(line 248,col 9)-(line 250,col 9)",
        "(line 251,col 9)-(line 251,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.SetUniqueList.retainAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 263,
      "end_line": 276,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\n     * This implementation iterates over the elements of this list, checking\n     * each element in turn to see if it\u0027s contained in \u003ccode\u003ecoll\u003c/code\u003e.\n     * If it\u0027s not contained, it\u0027s removed from this list. As a consequence,\n     * it is advised to use a collection type for \u003ccode\u003ecoll\u003c/code\u003e that provides\n     * a fast (e.g. O(1)) implementation of {@link Collection#contains(Object)}.\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 45)",
        "(line 266,col 9)-(line 268,col 9)",
        "(line 269,col 9)-(line 274,col 9)",
        "(line 275,col 9)-(line 275,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.SetUniqueList.clear()",
      "begin_line": 278,
      "end_line": 282,
      "comment": "",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 22)",
        "(line 281,col 9)-(line 281,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.SetUniqueList.contains(java.lang.Object)",
      "begin_line": 284,
      "end_line": 287,
      "comment": "",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.SetUniqueList.containsAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 289,
      "end_line": 292,
      "comment": "",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.SetUniqueList.iterator()",
      "begin_line": 294,
      "end_line": 297,
      "comment": "",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.SetUniqueList.listIterator()",
      "begin_line": 299,
      "end_line": 302,
      "comment": "",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.SetUniqueList.listIterator(int)",
      "begin_line": 304,
      "end_line": 307,
      "comment": "",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.SetUniqueList.subList(int, int)",
      "begin_line": 315,
      "end_line": 320,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\n     * NOTE: from 4.0, an unmodifiable list will be returned, as changes to the\n     * subList can invalidate the parent list.\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 71)",
        "(line 318,col 9)-(line 318,col 70)",
        "(line 319,col 9)-(line 319,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.SetUniqueList.createSetBasedOnList(java.util.Set\u003cE\u003e, java.util.List\u003cE\u003e)",
      "begin_line": 331,
      "end_line": 347,
      "comment": "\n     * Create a new {@link Set} with the same type as the provided {@code set}\n     * and populate it with all elements of {@code list}.\n     *\n     * @param set  the {@link Set} to be used as return type, must not be null\n     * @param list  the {@link List} to populate the {@link Set}\n     * @return a new {@link Set} populated with all elements of the provided\n     *   {@link List}\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 22)",
        "(line 334,col 9)-(line 344,col 9)",
        "(line 345,col 9)-(line 345,col 28)",
        "(line 346,col 9)-(line 346,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SetListIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.iterators.AbstractIteratorDecorator\u003cE\u003e"
      ],
      "begin_line": 353,
      "end_line": 375,
      "comment": "\n     * Inner class iterator.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "set"
      ],
      "begin_line": 355,
      "end_line": 355,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "last"
      ],
      "begin_line": 356,
      "end_line": 356,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.list.SetUniqueList.SetListIterator.SetListIterator(java.util.Iterator\u003cE\u003e, java.util.Set\u003cE\u003e)",
      "begin_line": 358,
      "end_line": 361,
      "comment": "",
      "child_ranges": [
        "(line 359,col 13)-(line 359,col 22)",
        "(line 360,col 13)-(line 360,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.SetUniqueList.SetListIterator.next()",
      "begin_line": 363,
      "end_line": 367,
      "comment": "",
      "child_ranges": [
        "(line 365,col 13)-(line 365,col 32)",
        "(line 366,col 13)-(line 366,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.SetUniqueList.SetListIterator.remove()",
      "begin_line": 369,
      "end_line": 374,
      "comment": "",
      "child_ranges": [
        "(line 371,col 13)-(line 371,col 27)",
        "(line 372,col 13)-(line 372,col 29)",
        "(line 373,col 13)-(line 373,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SetListListIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.iterators.AbstractListIteratorDecorator\u003cE\u003e"
      ],
      "begin_line": 380,
      "end_line": 422,
      "comment": "\n     * Inner class iterator.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "set"
      ],
      "begin_line": 383,
      "end_line": 383,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "last"
      ],
      "begin_line": 384,
      "end_line": 384,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.list.SetUniqueList.SetListListIterator.SetListListIterator(java.util.ListIterator\u003cE\u003e, java.util.Set\u003cE\u003e)",
      "begin_line": 386,
      "end_line": 389,
      "comment": "",
      "child_ranges": [
        "(line 387,col 13)-(line 387,col 22)",
        "(line 388,col 13)-(line 388,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.SetUniqueList.SetListListIterator.next()",
      "begin_line": 391,
      "end_line": 395,
      "comment": "",
      "child_ranges": [
        "(line 393,col 13)-(line 393,col 32)",
        "(line 394,col 13)-(line 394,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.SetUniqueList.SetListListIterator.previous()",
      "begin_line": 397,
      "end_line": 401,
      "comment": "",
      "child_ranges": [
        "(line 399,col 13)-(line 399,col 36)",
        "(line 400,col 13)-(line 400,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.SetUniqueList.SetListListIterator.remove()",
      "begin_line": 403,
      "end_line": 408,
      "comment": "",
      "child_ranges": [
        "(line 405,col 13)-(line 405,col 27)",
        "(line 406,col 13)-(line 406,col 29)",
        "(line 407,col 13)-(line 407,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.SetUniqueList.SetListListIterator.add(E)",
      "begin_line": 410,
      "end_line": 416,
      "comment": "",
      "child_ranges": [
        "(line 412,col 13)-(line 415,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.SetUniqueList.SetListListIterator.set(E)",
      "begin_line": 418,
      "end_line": 421,
      "comment": "",
      "child_ranges": [
        "(line 420,col 13)-(line 420,col 89)"
      ]
    }
  ]
}